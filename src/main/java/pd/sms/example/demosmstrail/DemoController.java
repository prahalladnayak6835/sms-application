package pd.sms.example.demosmstrail;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller

public class DemoController {
    @Autowired
    private DemoRepo demoRepo;
    private  String ACCOUNT_SID = "AC82e87c80abc4c2dba797f17d425bd35e";
    private  String AUTH_TOKEN = "ad7fe4425749138c26b86ea13d9e0adc";
//    private final String SENDER_ID = "LifeLine";
//    @Autowired
//    private DemoService demoService;
    @GetMapping("/")
    public String get() {
        return "send-sms";
    }
    @PostMapping("/send")
    public String sendSms(Demo demo) {
        demoRepo.save(demo);
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        System.out.println("hi");
        Message message = Message.creator(new PhoneNumber("+91"+demo.getNumber()), new PhoneNumber("+12563803665"), "This is the OTP sent for verification!")
                .create();
        System.out.println("hello");
        if(message.getErrorCode() == null)

        return "success";
        return "success";
    }
}
