import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ReadF extends JFrame{
		
	private JTextField addressBar;
	private JEditorPane display;
	
	public ReadF(){
		
		super("Freaking browser");
		addressBar= new JTextField("Enter a URL");
		addressBar.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent event){
					loadstuff(event.getActionCommand());
				}
			}
		);
		add(addressBar,BorderLayout.NORTH);
		display=new JEditorPane();
		display.setEditable(false);
		display.addHyperlinkListener(
			new HyperlinkListener(){
				public void hyperlinkUpdate(HyperlinkEvent event){
					if(event.getEventType()==HyperlinkEvent.EventType.ACTIVATED){
						loadstuff(event.getURL().toString());
					}
				}
			}
		
		);
		add(new JScrollPane(display),BorderLayout.CENTER);
		setSize(800,800);
		setVisible(true);
	}
	private void loadstuff(String userText){
		try{
			display.setPage(userText);
			addressBar.setText(userText);
			
		}
		catch(Exception e)
		{
			System.out.println(e+"u r a crap..cant even write a URL");
		}
	}
}