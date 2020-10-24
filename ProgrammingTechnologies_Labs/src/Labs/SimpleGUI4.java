package Labs;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI4 extends JFrame
{
	private JButton button = new JButton("����������");
	private JTextField input = new JTextField("", 5);
	public SimpleGUI4 () 
	{
		super("������� ���������");
		this.setBounds(100, 100, 300, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container = this.getContentPane();
		container.setLayout(new GridLayout(3, 2, 2, 2));
		container.add(input);
		ButtonGroup group = new ButtonGroup();
		container.add(button);
		button.addActionListener(new ButtonEventListener ());
	}
	class ButtonEventListener implements ActionListener 
	{
		public void actionPerformed (ActionEvent e) 
		{
			String message = "";
			message += input.getText();
			if (message.length() != 0)
				JOptionPane.showMessageDialog(null, message, "����������", JOptionPane.PLAIN_MESSAGE);
		}
	}
}
