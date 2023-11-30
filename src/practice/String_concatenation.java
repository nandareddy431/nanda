package practice;

public class String_concatenation {
	public static void main (String[] args)
	{
		int a= 10;
		int b=20;
		System.out.println("sum of a+b"+" "+(a+b));
		
		String x="hello";
		String y="kadapa";	
		
		
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(a+x+y+b);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+(a+b));
		
		double c = 12.33;
		double d = 23.44;
		
		System.out.println(x+y+c+d);//helloSelenium12.3323.44
		
		System.out.println(x+y+a+b+c+d);//helloSelenium102012.3323.44
		



	}
}
