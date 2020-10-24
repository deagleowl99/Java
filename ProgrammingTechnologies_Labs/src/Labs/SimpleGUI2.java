package Labs;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI2 extends JFrame
{
	private JButton button = new JButton("Все готово");
	private JTextField input = new JTextField("", 5);
	private JLabel label = new JLabel("Введите имя:");
	private JCheckBox check = new JCheckBox("Согласны?", false);
	public SimpleGUI2 () 
	{
		super("Простая программа");
		this.setBounds(100, 100, 300, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container = this.getContentPane();
		container.setLayout(new GridLayout(3, 2, 2, 2));
		container.add(label);
		container.add(input);
		ButtonGroup group = new ButtonGroup();
		container.add(button);
		button.addActionListener(new ButtonEventListener ());
		container.add(check);
	}
	class ButtonEventListener implements ActionListener 
	{
		public void actionPerformed (ActionEvent e) 
		{
			String message = "";
			message += "Персонажа зовут " + input.getText() + ",";
			message += ((check.isSelected()) ? " и он согласен со своим именем." : " и он не согласен со своим именем.");
			JOptionPane.showMessageDialog(null, message, "Имя персонажа", JOptionPane.PLAIN_MESSAGE);
		}

	}
}

