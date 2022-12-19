package  pak.proj;

import java.util.Properties;

import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class Email {
	public Email(){
		//construct
	}
User u=new User();
    public void sendEmail(String email , String subject , String body ){
    	 String to = email;
         String from = "MusicInstitute@gmail.com";

         final String username = u.getusername();

         final String password = u.getpass();

         String host = "smtp.mailtrap.io";
        
         Properties props = new Properties();
         props.put("mail.smtp.auth", "true");
         props.put("mail.smtp.starttls.enable", "true");
         props.put("mail.smtp.host", host);
         props.put("mail.smtp.port", "587");
       
         Session session = Session.getInstance(props,
        		 
            new jakarta.mail.Authenticator() {
        	 @Override
               protected PasswordAuthentication getPasswordAuthentication() {
                  return new PasswordAuthentication(username, password);
       }
            });
         try {
    
       Message message = new MimeMessage(session);
     
       message.setFrom(new InternetAddress(from));
   
       message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
    
       message.setSubject(subject);
      
       message.setText(body);
     
       Transport.send(message);
      
         } catch (MessagingException e) {
            throw new RuntimeException(e);
         }
      }
    }

