import javax.swing.*;

public class test1
{
	JFrame frame;
	test1()
	{
		frame = new JFrame("First way");
		JButton button = new JButton ("let's see");
		button.setBounds(200, 150, 90, 50);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(button);
		frame.setSize(500, 600);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	 public static void main(String[] args)
    {
        new test1();
    }
}