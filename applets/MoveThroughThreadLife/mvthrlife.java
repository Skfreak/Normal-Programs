import java.applet.*;
import java.awt.*;
/*<applet code="mvthrlife" height="1366" width="768"></applet>*/

public class mvthrlife extends Applet implements Runnable
{

	Thread t=new Thread(this);
	public void init()
	{
		t.start();
	}
		
	public void run()
	{
		try
		{
		while(true)
		{
			repaint();
			t.sleep(250);
		}
		}
		catch(Exception e)
		{
			
		}
		
	}
	static int x=0;
	public void paint(Graphics g)
	{	
		//g.setcolor()
		g.drawString("asfasf",100,100+x);
		x=x+55;
	}
	
}