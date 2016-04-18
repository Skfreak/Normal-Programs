import java.applet.Applet;
import java.awt.*;
/*<applet code="movoth" height="1366" width="768"></applet>*/
public class movoth extends Applet
{
	public void paint(Graphics g)
	{	
		
		
		try
		{
		
		
			int i=0;
			int j=0;
			
			for(i=0;;i+=30)
			{
				//for(int )
				g.setColor(Color.blue);
				g.drawString("Shashikant",0+i,200);
			Thread.sleep(250);
			g.setColor(Color.white);
			g.fillRect(0,0,1366,768);
			
			
			if(i==750)
			{
					for(i=750;;i-=30)
			{
				//for(int )
					g.setColor(Color.blue);
				g.drawString("Shashikant",i,200);
				Thread.sleep(250);
				g.setColor(Color.white);
			g.fillRect(0,0,1366,768);
			if(i==0)
			{
				break;
			}
			}
			}
			}
		}
		catch(Exception e)
		{
			
		}
	}
}