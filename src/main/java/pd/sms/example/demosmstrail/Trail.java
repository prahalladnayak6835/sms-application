//package pd.sms.example.demosmstrail;
//
//
//import jakarta.mail.*;
//import jakarta.mail.internet.InternetAddress;
//import jakarta.mail.internet.MimeMessage;
//
//import javax.net.ssl.HttpsURLConnection;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.net.URLEncoder;
//import java.util.Date;
//import java.util.Properties;
//public class Trail {
//    public static void sendSms(String message,String number)
//    {
//        try
//        {
//
//            String apiKey="KBS9JipGn7gxcmEF3a2lOudCQZtNezUfhj51LAWvPI0Hyr8XYVRybXOoQG6lKuFI4cdgwTrB59NVtDSp";
//            String sendId="FSTSMS";
//            //important step...
//            message=URLEncoder.encode(message, "UTF-8");
//            String language="english";
//
//            String route="p";
//
//
//            String myUrl="https://www.fast2sms.com/dev/bulk?authorization="+apiKey+"&sender_id="+sendId+"&message="+message+"&language="+language+"&route="+route+"&numbers="+number;
//
//            //sending get request using java..
//
//            URL url=new URL(myUrl);
//
//            HttpsURLConnection con=(HttpsURLConnection)url.openConnection();
//
//
//            con.setRequestMethod("GET");
//
//            con.setRequestProperty("User-Agent", "Mozilla/5.0");
//            con.setRequestProperty("cache-control", "no-cache");
//            System.out.println("Wait..............");
//
//            int code=con.getResponseCode();
//
//            System.out.println("Response code : "+code);
//
//            StringBuffer response=new StringBuffer();
//
//            BufferedReader br=new BufferedReader(new InputStreamReader(con.getInputStream()));
//
//            while(true)
//            {
//                String line=br.readLine();
//                if(line==null)
//                {
//                    break;
//                }
//                response.append(line);
//            }
//
//            System.out.println(response);
//
//
//        }catch (Exception e) {
//            // TODO: handle exception
//            e.printStackTrace();
//        }
//
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Program started.....");
//
//
//        Trail.sendSms("this message using java code ..."+new Date().toLocaleString(), "7978716835");
//        System.out.println();
//    }
//    }
//
////NDUzMzY0NzU0YTU4NjgzNjZkNzAzMTY5NTY0MzU0NmM=