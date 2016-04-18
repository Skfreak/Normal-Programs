import java.applet.*;
import java.awt.*;

/**
<applet code="winsize" height="1366" width="768"></applet>
*/
public class winsize extends Applet implements Runnable
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
			t.sleep(500);
		}
		}
		catch(Exception e)
		{
			
		}
		
	}
	//static int x=0,y=0;
	Color c;//c1;//=new Color(0,0,0);
	public void paint(Graphics g)
	{	//c1=new Color((int)(250.5*Math.random()),(int)(255*Math.random()),(int)(255*Math.random()));
				c=new Color((int)(255*Math.random()),(int)(255*Math.random()),(int)(255*Math.random()));
			
		g.setColor(c);
		g.fillRect(0,0,1366,766);
		c=c.brighter().darker();

		
		g.setColor(c);
		g.fillArc(100+((int)(1000*Math.random()*Math.random()*Math.random())),100+((int)(1000*Math.random()*Math.random()*Math.random())),200+((int)(1000*Math.random()*Math.random()*Math.random())),200+((int)(1000*Math.random()*Math.random()*Math.random())),0,360);
		
		
		
		//g.setColor(0+x,0+x+y,0+y);
		
	}
} 

