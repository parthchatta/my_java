import java.awt.*;
import java.applet.*;
/*<applet code="Bubble.class" width=200 height=200></applet>*/

public class Bubble extends Applet implements Runnable
{
	String msg;
	Thread t;
	Boolean run=true;
	int a[]={8,6,5,3,2};
	int x,y;
	public void start()
	{
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		try
		{
			outer:for(int j=0;j<a.length;j++)
			{
				for(int k=j+1;k<a.length;k++)
				{
					Thread.sleep(1000);
					if(a[j]>a[k])
					{	
						int temp=a[j];
						a[j]=a[k];
						a[k]=temp;			
					}
					if(!run)
					{
						break outer;
					}
					repaint();
				}
			}
		}
		catch(InterruptedException e){}
	}
	public void stop()
	{
		run=false;
		t=null;
	}
	public void paint(Graphics g)
	{
		x=20;
		y=40;
		for(int i=0;i<a.length;i++)
		{
			msg=Integer.toString(a[i]);
			g.drawString(msg,x,y);
			x+=20;
		}
	}
}