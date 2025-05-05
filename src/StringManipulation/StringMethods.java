package StringManipulation;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		//String is a collection of characters
		String str= "hi this is java code and i am so happy";
		int len = str.length();
		int li = 0;
		int hi = len-1;
		
		System.out.println(len);
		System.out.println(li);
		System.out.println(hi);
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(11));
		//System.out.println(str.charAt(21));//String out of bound exception
		
		
		System.out.println(str.indexOf('h'));
		System.out.println(str.indexOf('i'));//first occurance of i
		
		System.out.println(str.indexOf('i', str.indexOf('i')+1));//2nd occurance of i
		
		//check the code
		System.out.println(str.indexOf('i',str.indexOf('i', str.indexOf('i')+1+1)));//3rd occurance of i
		
		//trim
		String test="  hello world  ";
		System.out.println(test.trim());
		//Lower case/uppercase
		
		String un ="naveenautomationlabs";
		System.out.println(un.toUpperCase());
		
		System.out.println(un.toLowerCase());
		
		//replace
		String dob="12-08-1990";
		System.out.println(dob.replace("-", "/"));
		String rest =" hello world  ";
		System.out.println(rest.replace(" ", ""));
		
		
		//equals
		String t1 = "hello selenium";
		String t2 = "hello Selenium";
		System.out.println(t1.equals(t2));//false
		System.out.println(t1.equalsIgnoreCase(t2));//true
		
		//contains
		String tg = "hi this is my java code and i am so happy";
		System.out.println(tg.contains("java"));//true
		
		String messg = "welcome admin";
		if (messg.contains("admin"))
		{
			System.out.println("Pass");
	}else {
		System.out.println("Fail");
	}
		
		
		//substring
		String orderMessg = "my order is 12345";
		System.out.println(orderMessg.substring(6));
		System.out.println(orderMessg.substring(0, 10));
		System.out.println(orderMessg.substring(orderMessg.indexOf("is")+3,orderMessg.length()));
		
		//split
		String lang = "java_python_ruby_javastript";
		String lg[] = lang.split("_");
		System.out.println(Arrays.toString(lg));
		
		
		String top = "xXtestingxXautomationXxXseleniumxXapplicationX";
		String tp[]= top.split("xX");
		System.out.println(tp[0]);
		//System.out.println(tp[5]);ArrayIndexOutOfBound index
		System.out.println(Arrays.toString(tp));
		
		String pop = "testing | automation | selenium";
		String p[]=pop.split("\\|");//  \\meaning escape. other wise | will consider as or operator
		System.out.println(p[0]);
		
		
		String myMesg = "I love \"java\" coding";//I love "java" coding, escaping "
		System.out.println(myMesg);
		
		getScoreCard("Viratkholi");
		
		
		
	}
	
	
	public static void getScoreCard(String playerName ) {
		String xpath = "//input[test()='"+playerName+"']";
		System.out.println(xpath);
	}

}
