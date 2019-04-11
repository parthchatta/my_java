package pkg;
import java.util.Scanner;

public class A
{
public int x;
Scanner sc=new Scanner(System.in);
public void get()
{
System.out.println("enter value of x: ");
x=sc.nextInt();
}
public void put()
{
System.out.println("x: "+x);
}

}


public class B
{
public int y;
Scanner sc=new Scanner(System.in);
public void get()
{
System.out.println("enter value of y: ");
y=sc.nextInt();
}
public void put()
{
System.out.println("y: "+y);
}

}