import java.util.Scanner;

class demo
{
	static int gcd(int a,int b)
	{
		if(b==0)
			{return a;}
		return gcd(b,a%b);
	}
	public  static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=gcd(a,b);
		System.out.println("the gcd of the numbers is: "+c);
	}

}