import java.applet.*;
import java.awt.*;
import java.util.Date;

/*<applet code="Clock.class" width=300 height=100></applet>*/

public class Clock extends Applet implements Runnable
{
	Thread t=null;
	boolean suspend;
	String curtime=null;
	public void init()
	{
		setBackground(Color.black);
		setForeground(Color.WHITE);
	}
	public void paint(Graphics g)
	{
		g.drawString(curtime,50,50);
	}
	public void start()
	{
		t=new Thread(this);
		suspend=false;
		curtime="hello";/*(new Date()+" ").substring(11,19); */
		t.start();
	}
	public void run()
	{
		try
		{
			Thread.sleep(5000);
			while(true)
			{
				curtime=(new Date()+" ").substring(11,19);
				repaint();
				Thread.sleep(1000);
				if(suspend)
					break;
			}
		}
		catch(InterruptedException e){}
		
	}
	public void stop()
	{
		suspend=true;
		t=null;
	}
}