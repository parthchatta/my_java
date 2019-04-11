import java.awt.*;
import java.applet.*;
/*<APPLET CODE = "SampleBanner" WIDTH = "500" HEIGHT = "300"></APPLET>*/
public class SampleBanner extends Applet implements Runnable
{
String str = "Department Of Computer Science and Engineering, BMSCE, Bangalore.";
Thread t ;
boolean b;
public void init()
{
setBackground(Color.gray);
setForeground(Color.yellow);
}
public void start()
{
t = new Thread(this);
b = false;
t.start();
}
public void run ()
{
char ch;
for( ; ; )
{
try
{
repaint();
Thread.sleep(250);
ch = str.charAt(0);
str = str.substring(1, str.length());
str = str + ch;
}
catch(InterruptedException e) {}
}
}
public void paint(Graphics g)
{
g.drawRect(1,1,500,150);
g.setColor(Color.yellow);
g.fillRect(1,1,500,150);
g.setColor(Color.red);
g.drawString(str, 1, 60);
}
}