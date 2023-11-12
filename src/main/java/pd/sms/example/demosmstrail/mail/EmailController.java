//package pd.sms.example.demosmstrail.mail;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//
//import jakarta.mail.MessagingException;
//import java.io.IOException;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.MimeMessageHelper;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import jakarta.mail.MessagingException;
//import jakarta.mail.internet.MimeMessage;
//
//@RestController
//public class EmailController {
//
//    @Autowired
//    private JavaMailSender mailSender;
//
//    @RequestMapping("/sendEmail")
//    public String sendEmail() {
//        MimeMessage message = mailSender.createMimeMessage();
//        MimeMessageHelper helper = new MimeMessageHelper(message);
//
//        try {
//            helper.setFrom("vavoyax899@rdluxe.com");
//            helper.setTo("sinunayak97@gmail.com");
//            helper.setSubject("Subject of the Email");
//            helper.setText("This is the email content.");
//
//            mailSender.send(message);
//            return "Email sent successfully!";
//        } catch (MessagingException e) {
//            e.printStackTrace();
//            return "Failed to send email.";
//        }
//    }
//}