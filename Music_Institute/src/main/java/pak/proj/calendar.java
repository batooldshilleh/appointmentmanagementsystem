package pak.proj;

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
import net.sourceforge.jdatepicker.*; 
import net.sourceforge.jdatepicker.graphics.*; 
import net.sourceforge.jdatepicker.impl.*; 
import net.sourceforge.jdatepicker.util.*;
import java.text.DateFormat; 
import java.text.SimpleDateFormat;
import java.util.Calendar; 
import java.util.Date;
public class calendar extends JFrame implements ActionListener
{
JLabel CheckDate; JButton ok;
public UtilDateModel model;   // global variable declaration
public JDatePanelImpl datePanel;
public JDatePickerImpl datePicker;
public static String reportDate;
public calendar()
    {
	 model = new UtilDateModel();  
     datePanel = new JDatePanelImpl(model);  
     datePicker = new JDatePickerImpl(datePanel);
  
    JPanel panel=new JPanel();
    CheckDate=new JLabel("Date:");
    ok=new JButton("OK"); 
    ok.addActionListener(this);
    panel.add(CheckDate);
    panel.add(datePicker);
    panel.add(ok);
    add(panel);
    setBounds(100,100,400,200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setVisible(true); 
    }
public void actionPerformed(ActionEvent e) 
    {if(ok==e.getSource())
    {
    Date selectedDate = (Date) datePicker.getModel().getValue();
    DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
    reportDate = df.format(selectedDate);
    dispose();
   
  
    }}


}