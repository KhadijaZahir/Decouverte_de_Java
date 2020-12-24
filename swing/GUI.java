package sw;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	private JLabel label1;
	private JButton button;
	int red;
	int green;
	int blue;
	ArrayList<String> message = new ArrayList<String>();
	public GUI() {
		message.add("hi");
		message.add("hello");
		message.add("konnichiwa");
		message.add("nihao");
		message.add("namaste");
		frame = new JFrame();
		label1 = new JLabel("Le saviez-vous ?");
		label = new JLabel(message.get(0));
		button = new JButton("Montrer un autre fait");
		button.addActionListener(this);

		panel = new JPanel();
		// give padding
		panel.setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));
		// button.setMargin(new Insets(10, 10, 10, 10)); panel.add(label1);
		panel.setLayout(null);
		label.setBounds(20, 100, 500, 200);
		label1.setBounds(20, 20, 500, 200);
		panel.add(label1);
		panel.add(label);
		panel.add(button);

		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// size of this windows
		frame.setSize(500, 500);
		button.setBounds(20, 300, 300, 50);
		frame.setTitle("Le saviez-vous ?");
		button.setFont(new Font("Verdana", Font.BOLD, 15));
		frame.setVisible(true);

	}

	public void randColor() {
//		panel.setBackground(Color.PINK);
//		button.setForeground(Color.PINK);
		red = (int) (Math.random() * 256);
		green = (int) (Math.random() * 256);
		blue = (int) (Math.random() * 256);
	}

	public void actionPerformed(ActionEvent e) {
		randColor();
		panel.setBackground(new Color(red, green, blue));
		// button.setBackground(new Color(red,green,blue));
		button.setForeground(new Color(red, green, blue));
		
		Random rand = new Random();
		int randemX = rand.nextInt(message.size());
		String element = message.get(randemX);
		
		label.setText(element);
	}
}
