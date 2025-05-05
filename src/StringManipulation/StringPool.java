package StringManipulation;

public class StringPool {

	public static void main(String[] args) {
		//String literals
		
		String s1="hello";
		String s2 = "hello";//1 object will create in SCP and s1, s2 will point same
		System.out.println(s1.equals(s2));//true
		
		String s3 = new String ("hello");//2 objects will created. 1 in heap and 1 in scp. if same in scp then it won't creat in scp
		
		System.out.println(s1.equals(s3));//true
		String s4 = new String ("hello");
		System.out.println(s1.equals(s4));//true
		
		String r1= null;
		String r2= null;
		System.out.println(r1==r2);
	//	System.out.println(r1.equals(r2));//null pointer exception
		
		
		String p1= null;
		if("admin".equals(p1)) {// best way to handle null
			System.out.println("both are not equal");
		}
		
		//if (p1.equals("admin")){//null pointer exception
			
		//}
		
		
			
		
		
		
	}

}
