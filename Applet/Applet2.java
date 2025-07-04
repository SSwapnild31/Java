import java.applet.*;
import java.awt.*;

/*
<applet code="Applet2" width=350 height=100>
</applet>
*/

public class Applet2 extends Applet
{
	TextField t1,t2;
	Label l1;
	Button b1;
	public void init()
	{
		//setForeground(Color.blue);
		l1 = new Label("Name : ");
		t1 = new TextField(20);
		b1 = new Button("Click");
		setBackground(Color.magenta);
		add(l1);
		add(t1);
		add(b1);
	}
	/*public void paint(Graphics g)
	{
		g.drawString("Swapnil Divate",25,50);
	}*/
}