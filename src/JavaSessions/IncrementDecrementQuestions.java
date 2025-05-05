package JavaSessions;

public class IncrementDecrementQuestions {

	public static void main(String[] args) {
	int i =11;
	int j = i++ + ++i;
	System.out.println(i);//13
	System.out.println(j);//24
	
	int a = 11;
	int b=22;
	int c;
	c=a+b+a++ +b++ + ++a + ++b;
	System.out.println(a);//13
	System.out.println(b);//24
	System.out.println(c);//103
	
	int x=0;
	x=x++ - --x + ++x -x--;
	System.out.println(x);//0-0+1-1=0
	
	
	char chc = 'A';
	System.out.println(++chc);//B
	
	
	int cha ='A';//65
	System.out.println(cha++);//65
	
	//int ab= 11++;- invalid argument
	
	int sh = 1;
	sh=sh++ + ++sh * --sh - sh--;
	System.out.println(sh);

	
	
	
	}
	
	}


