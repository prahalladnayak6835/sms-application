//package pd.sms.example.demosmstrail.mail;
//
//import jakarta.mail.Message;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.MimeMessageHelper;
//import org.springframework.stereotype.Service;
//
//import jakarta.mail.MessagingException;
//import jakarta.mail.internet.MimeMessage;
//
//import jakarta.mail.Session;
//import jakarta.mail.Transport;
//import jakarta.mail.internet.AddressException;
//import jakarta.mail.internet.InternetAddress;
//import java.io.IOException;
//
//@Service
//public class EmailService {
//    private final JavaMailSender mailSender;
//    @Value("${spring.mail.from}")
//    private String from;
//
//    @Autowired
//    public EmailService(JavaMailSender mailSender) {
//        this.mailSender = mailSender;
//    }
//
//    public void sendEmail(String to, String subject, String message, String attachmentPath) throws MessagingException, IOException {
//        SimpleMailMessage mailMessage = new SimpleMailMessage();
//        mailMessage.setFrom("vavoyax899@rdluxe.com");
//        mailMessage.setTo("sinunayak97@gmail.com");
//        mailMessage.setSubject("subject");
//        mailMessage.setText("message");
//
//        mailSender.send(mailMessage);
//    }
//}