import java.applet.Applet;
import java.awt.*;
public class flag extends Applet
{
	public void paint(Graphics g)
	{
		//sk g1=new sk();
			g.setColor(Color.blue);
		g.fillRect(0,0,2000,2000);
		
		g.setColor(Color.orange);
		g.fillRect(150,150,400,100);
		
		g.setColor(Color.white);
		g.fillRect(150,250,400,100);
		g.setColor(Color.green);
		g.fillRect(150,350,400,100);
		g.setColor(Color.black);
	
		g.setColor(Color.blue);
		
		g.drawArc(300,250,100,100,0,360);
		double j=15;
		for(int i=1;i<=24;i++)
		{
			//g.drawLine(350,300,400*((int)Math.sin(Math.toRadians(j))),300*((int)Math.cos(Math.toRadians(j))));
			g.drawLine(300,300,400,300);
			//g1.rotate(15);
			//g.drawLine(350,300,300,300);
			g.drawLine(350,250,350,350);
			//g.drawLine(350,300,350,350);
			
		}
		
	}
	
}

/*<applet code="flag" height="2000" width="2000"></applet>*/
