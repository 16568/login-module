package otp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;





public class SendOTP {

	public static void sendOTP(String message,String number, String apikey )
	{
		try
		{
		String sendId="fstsms";
		String language="english";
		String route="p";
		message= URLEncoder.encode(message,"UTF-8");
		String myUrl ="https://www.fast2sms.com/dev/bulkV2?authorization="+apikey+"&sendId="+"&message="+message+"&language"+language+"&route"+route;
		URL url= new URL(myUrl);
		HttpURLConnection con=(HttpURLConnection)url.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("User-Agent", "chrome");
		con.setRequestProperty("cache-control", "no-cache");
		StringBuffer response =new StringBuffer();
		BufferedReader br=new BufferedReader(new InputStreamReader(con.getInputStream()));
		
		while(true)
		{
			String line= br.readLine();
			if (line==null)
			{
				
			break;	
				
			}	
			response.append(line);
		}	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		}
		
		
	
	public static void main(String[] args) {
		
    System.out.println("generated");
    OTP otp= new OTP();
    String OTPmessage=otp.generateOtp(5);
    System.out.println("otp generated......");
    String apikey="8RPTXW5yeo9MzGdlxmhKHCSB2Jafk3tbNFnIEjZvpg7qrQA1OLeqW13zjtENCIcxDHLSOB6MuUFaAJh9";
    String number="123456789";    
    sendOTP("OTP :"+OTPmessage,apikey,number);
	}

}
