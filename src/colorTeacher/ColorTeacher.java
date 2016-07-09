package colorTeacher;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ColorTeacher implements ActionListener {
	JButton green = new JButton();
	JButton red = new JButton();
	JButton yellow = new JButton();
	JButton blue = new JButton();

	public static void main(String[] args) {
		ColorTeacher teacher1 = new ColorTeacher();
	}

	public ColorTeacher() {
		JFrame mainFrame = new JFrame();
		JLabel label1 = new JLabel();
		JPanel Panel1 = new JPanel();
		label1.setText("Color Teacher");
		Panel1.add(label1);
		// YELLOW
		Panel1.add(yellow);
		yellow.setBackground(Color.yellow);
		yellow.setOpaque(true);
		yellow.addActionListener(this);
		// RED
		Panel1.add(red);
		red.setBackground(Color.red);
		red.setOpaque(true);
		red.addActionListener(this);
		// BLUE
		Panel1.add(blue);
		blue.setBackground(Color.blue);
		blue.setOpaque(true);
		blue.addActionListener(this);
		// GREEN
		Panel1.add(green);
		green.setBackground(Color.green);
		green.setOpaque(true);
		green.addActionListener(this);
		mainFrame.show();
		mainFrame.add(Panel1);
		mainFrame.pack();
		mainFrame.setName("Color Teacher");
		
	}
	
	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void actionPerformed(ActionEvent e) {
		JButton first = (JButton) e.getSource();
		if (first.equals(green)) {
			speak("Green");
		} else if (first.equals(blue)) {
			speak("Blue");
		} else if (first.equals(yellow)) {
			speak("Yellow");
		} else if (first.equals(red)) {
			speak("Red");
		}

	}
}
