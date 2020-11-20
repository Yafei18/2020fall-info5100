package class16;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {

	private JLabel first, second, output, result;
	private JTextField firstText, secondText;
	private JButton add, subtract, multiply, divide, clear;

	public Calculator() {
		create();
		addComponents();
		addActions();
		display();
	}

	private void addActions() {
		add.addActionListener((ActionEvent ae) -> performOperation(ae));
		subtract.addActionListener((ActionEvent ae) -> performOperation(ae));
		multiply.addActionListener((ActionEvent ae) -> performOperation(ae));
		divide.addActionListener((ActionEvent ae) -> performOperation(ae));
		clear.addActionListener((ActionEvent ae) -> performOperation(ae));
	}

	private void performOperation(ActionEvent ae) {
		String a = firstText.getText();
		String b = secondText.getText();
		int one = Integer.parseInt(a);
		int two = Integer.parseInt(b);
		if (ae.getSource() == add) {
			result.setText(one + two +"");
		}
		if (ae.getSource() == subtract) {
			result.setText((one - two) + "");
		}
		if (ae.getSource() == multiply) {
			result.setText(Integer.toString(one * two));
		}
		if (ae.getSource() == divide) {
			result.setText((one * 1f / two) + "");
		}
		if (ae.getSource() == clear) {
			firstText.setText("");
			secondText.setText("");
			result.setText("");
		}

	}

	private void addNumbers() {
		String a = firstText.getText();
		String b = secondText.getText();
		int one = Integer.parseInt(a);
		int two = Integer.parseInt(b);
		int r = one + two;

		result.setText(r + "");
	}

	private void display() {
		setSize(1000, 1000);
		setVisible(true);
		pack();

	}

	private void addComponents() {
		GridLayout g = new GridLayout(5, 1);
		this.setLayout(g);
		JPanel temp = new JPanel();
		temp.add(first);
		temp.add(firstText);
		this.add(temp);

		// temp = new JPanel(new GridLayout(4, 1));
		temp = new JPanel();
		temp.add(add);
		temp.add(subtract);
		temp.add(multiply);
		temp.add(divide);
		this.add(temp);

		temp = new JPanel();
		temp.add(second);
		temp.add(secondText);
		this.add(temp);

		temp = new JPanel();
		temp.add(output);
		temp.add(result);
		this.add(temp);

		temp = new JPanel();
		temp.add(clear);
		this.add(temp);

	}

	private void create() {
		first = new JLabel("Enter First : ");
		second = new JLabel("Enter Second : ");
		output = new JLabel("Result : ");
		result = new JLabel("");

		firstText = new JTextField(10);
		secondText = new JTextField(10);

		add = new JButton("+");
		subtract = new JButton("-");
		multiply = new JButton("x");
		divide = new JButton("%");
		clear = new JButton("clear");
	}

	public static void main(String[] args) {
		new Calculator();

	}

}
