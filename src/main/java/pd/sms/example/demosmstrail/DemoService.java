//package pd.sms.example.demosmstrail;
//
//import com.twilio.Twilio;
//import org.springframework.beans.factory.annotation.Autowired;
//import com.twilio.rest.api.v2010.account.Message;
//import com.twilio.type.PhoneNumber;
//import org.springframework.stereotype.Service;
//
//@Service
//public class DemoService {
//    private DemoRepo demoRepo;
//    private final String ACCOUNT_SID = "AC82e87c80abc4c2dba797f17d425bd35e";
//    private final String AUTH_TOKEN = "ad7fe4425749138c26b86ea13d9e0adc";
//    private final String SENDER_ID = "LifeLine";
//
//    @Autowired
//    public DemoService() {
//        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
//    }
//
//    public void sendSms(String to, String message) {
//        Message.creator(
//                        new PhoneNumber(to),
//                        new PhoneNumber(SENDER_ID),
//                        message)
//                .create();
//    }
//
//    public void register(Demo demo) {
//        demoRepo.save(demo);
//    }
//}
