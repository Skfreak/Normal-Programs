import java.applet.Applet;
import java.awt.*;

/*<applet code="Applife" height="1000" width="500"></applet>*/

public class Applife /*implements Runnable*/ extends Applet
{
	//Thread t=new Thread(this);
	//Applife()
	//{
		
	//}
	
	//public void run()
	//{
		
	//}
	
	String s="Hello";
	public void init()
	{
		s=s+"initialize";
		System.out.println(s);
	}
	public void start()
	{
		s=s+"start";
		System.out.println(s);
	}
	public void stop()
	{
		s=s+"stop";
		System.out.println(s);
	}
	public void destroy()
	{
		s+="Destroy";
		System.out.println(s);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.blue);
		g.drawString(s,100,100);
	}
	
	
}