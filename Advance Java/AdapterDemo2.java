import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="AdapterDemo2" width="500" height="300">
</applet>
*/

public class AdapterDemo2 extends Applet
{
	public void init()
	{
		addWindowListener(new InnerClass(this));
	}
	
	class InnerClass extends WindowAdapter implements WindowListener
	{
		public void WindowActivated(WindowEvent we)
		{
			showStatus("Window is Activated");
		}
		public void WindowDeactivated(WindowEvent we)
		{
			showStatus("Window is Deactivated");
		}
	}//End of inner Class
} //End of Applet