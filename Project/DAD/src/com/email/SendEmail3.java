/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.email;

/**
 *
 * @author Ankur
 */
import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;
public class SendEmail3 {
    
    public  int sendMail(){
        try
        {
            Properties props = System.getProperties();
              // -- Attaching to default Session, or we could start a new one --
              props.put("mail.transport.protocol", "smtp" );
              props.put("mail.smtp.starttls.enable","true" );
              props.put("mail.smtp.host",25);
              props.put("mail.smtp.auth", "false" );
              Authenticator auth = new SMTPAuthenticator();
              Session session = Session.getInstance(props, auth);
              // -- Create a new message --
              Message msg = new MimeMessage(session);
              // -- Set the FROM and TO fields --
              msg.setFrom(new InternetAddress("dad.testuser@gmail.com"));
              msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse("bagankur@gmail.com", false));
              msg.setSubject("test");
              msg.setText("test");
              // -- Set some other header information --
              msg.setHeader("MyMail", "Mr. XYZ" );
              msg.setSentDate(new Date());
              // -- Send the message --
              Transport.send(msg);
              System.out.println("Message sent to OK." );
              return 0;
        }
        catch (Exception ex)
        {
          ex.printStackTrace();
          System.out.println("Exception "+ex);
          return -1;
        }
  }

// Also include an inner class that is used for authentication purposes

private class SMTPAuthenticator extends javax.mail.Authenticator {
        @Override
        public PasswordAuthentication getPasswordAuthentication() {
            String username =  "Java.Mail.CA@gmail.com";           // specify your email id here (sender's email id)
            String password = "javamail";                                      // specify your password here
            return new PasswordAuthentication(username, password);
        }
  }
}
