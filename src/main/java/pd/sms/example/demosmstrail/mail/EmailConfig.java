//package pd.sms.example.demosmstrail.mail;
//
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.mail.Session;
//
//import java.util.Properties;
//
//
//@Configuration
//public class EmailConfig {
//
//    @Value("${email.username}")
//    private String emailUsername;
//
//    @Value("${email.password}")
//    private String emailPassword;
//
//    @Bean
//    public Session emailSession() {
//        Properties props = new Properties();
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.starttls.enable", "true");
//        props.put("mail.smtp.host", "smtp.gmail.com");
//        props.put("mail.smtp.port", "587");
//
//        return Session.getInstance(props, new javax.mail.Authenticator() {
//            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
//                return new javax.mail.PasswordAuthentication(emailUsername, emailPassword);
//            }
//        });
//    }
//}