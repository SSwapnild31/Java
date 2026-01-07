import java.applet.*;
import java.awt.*;
/*
<applet code="appfont1" width=300 height=300>
</applet>
*/
public class appfont extends Applet
{
    	int fsize;
    	String fname;
    	Font f;
 public void init()
 {
    fsize=15;
    fname="Arial";
    f=new Font (fname,Font.BOLD,fsize);
    setBackground(Color.cyan);
 }
 public void paint(Graphics g)
 {
    g.drawString("Welcome to my Applet",10,50);
    g.setFont(f);
    g.drawString("Hello Friends",50,150);
 }
}