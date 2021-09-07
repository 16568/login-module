package otp;

import java.util.Random;

public class OTP {

//	public static void main(String[] args) {
//       String otp = generateOtp(5);
//       System.out.println("generate OTP"+ otp);
//
//	}
	public static String generateOtp(int otplength)
	{
		
		Random random= new Random();
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<otplength;i++)
		{
			sb.append(random.nextInt(10));
			
		}
		String otp=sb.toString();
		return otp;
	}

}
