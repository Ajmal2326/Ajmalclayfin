package LambdaFunction;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;

interface OtpGenerator
{
	public abstract String otpFunction();
}
public class OTP 
{
	public static void main(String[] args) 
	{
		Set<String> s= new LinkedHashSet<>();
		
		OtpGenerator og=()->{
			int value=(int)(Math.random()*1000000);
			String val=String.valueOf(value);
			return val;
			
		};
		String st=og.otpFunction();
		Predicate<String > p=(l)->st.length()==6;
		boolean bo=p.test(st);
		if(bo==true)
		{
			s.add(st);
			//for(String s1:s)
			//{
				System.out.println("The valid otp is generated " +s);
			//}
		}
		else
			System.out.println("The otp is not valid "+ st);
	}

}


