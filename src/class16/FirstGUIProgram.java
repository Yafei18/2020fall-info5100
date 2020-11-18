package class16;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FirstGUIProgram {

	public static void main(String[] args) {
		JFrame f = new JFrame();

		f.setSize(500, 500);
		f.setVisible(true);

		f.setTitle("My First Java program");
		String caption = "Clicked";

		JButton b = new JButton("Click me");
		b.addActionListener(new ActionListener() {
			int counter = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				counter++;
				b.setText(caption + " " + counter);
			}

		});

		FlowLayout fl = new FlowLayout();

		f.setLayout(fl);
		f.add(b);
		JButton jb = new JButton("Close Window");
		f.add(jb);
		jb.addActionListener((ActionEvent ae) -> {
			System.out.println("I'm closing window");
			System.exit(0);
		});

	}

}
