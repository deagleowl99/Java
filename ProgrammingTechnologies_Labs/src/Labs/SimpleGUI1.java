package Labs;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI1 extends JFrame 
{
	
	private JButton button = new JButton("�������");
	private JTextField input = new JTextField("", 5);
	private JTextField input2 = new JTextField("", 6);
	public SimpleGUI1 () 
	{
		super("������� ���������");
		this.setBounds(200, 100, 200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container = this.getContentPane();
		container.setLayout(new GridLayout(3, 2, 2, 2));
		button.addActionListener(new ButtonEventListener ());
		container.add(input);
		container.add(input2);
		container.add(button);
	}
	class ButtonEventListener implements ActionListener 
	{
		public void actionPerformed (ActionEvent e) 
		{
			input.setText("������");
			input2.setText("���!");		
		}
	}
}

