import java.applet.Applet;
import java.awt.*;
//import java.Thread.*;
/*<applet code="movard" height="1366" width="768"></applet>*/
public class movard extends Applet// implements Runnable
{	//Thread t=new Thread(this);
	//movard()
	//{
	//	t.start();
//	}
	
	//public void run()
	//{	
		//paint();
	//}
	public void paint(Graphics g)
	{	
		
		
		try
		{
		
		
			int i=0;
			int j=0;
			g.setColor(Color.blue);
			for(int c=100;;c++)
				
			{
				for(j=0;;)
				{
					g.drawString("round",i,j);
					Thread.sleep(50);
					g.setColor(Color.white);
					g.fillRect(0,0,1366,768);
					i+=50;
					
					g.setColor(Color.blue);
					if(i==750)
					{
						i=0;
						j+=50;
						
					}
				}
			}
		}
		catch(Exception e)
		{
			
		}
	}
	
}
