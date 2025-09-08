import java.applet.Applet;
import java.awt.*;

/*
<applet code="Demo" width=400 height=300>
</applet>
*/

public class Demo extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("Welcome to my first applet",40,50);
		g.drawString("Welcome to applet windows",40,80);
	}
}