import javax.swing.*;
import java.awt.*;

public class test extends JFrame {
	
	public test() {
		setTitle("계산기");
		setSize(300, 250);
		
		
		JPanel titlePanel = new JPanel();
		titlePanel.setBounds(0, 0, 300, 40);
		add(titlePanel);
		JLabel title = new JLabel("계산기", JLabel.CENTER);
		
		titlePanel.add(title);
		
	
		JPanel numPanel = new JPanel();
		numPanel.setBounds(0, 40, 300, 40);
		
		numPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		add(numPanel);
		JTextField num1 = new JTextField(5);
		numPanel.add(num1);
		JTextField num2 = new JTextField(5);
		numPanel.add(num2);
		
		
		JPanel btnPanel = new JPanel();
		btnPanel.setBounds(100, 80, 100, 80); 
		btnPanel.setLayout(new GridLayout(2, 2, 10, 5));
		
		add(btnPanel);
		JButton plus = new JButton("+");
		btnPanel.add(plus);
		JButton minus = new JButton("-");
		btnPanel.add(minus);
		JButton mult = new JButton("*");
		btnPanel.add(mult);
		JButton div = new JButton("/");
		btnPanel.add(div);
		
		JPanel resPanel = new JPanel();
		resPanel.setBounds(0, 160, 300, 40);
		add(resPanel);
		JLabel lbl1 = new JLabel("결과값: ");
		resPanel.add(lbl1);
		JLabel lbl2 = new JLabel("");
		resPanel.add(lbl2);
		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new test();
	}

}
