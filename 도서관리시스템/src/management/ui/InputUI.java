package management.ui;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.BorderLayout;

public class InputUI extends JFrame {
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JLabel lblNewLabel;
	public InputUI() {
		setTitle("\uB4F1\uB85D");
		getContentPane().setLayout(new GridLayout(4, 0, 0, 0));
		
		panel = new JPanel();
		getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		lblNewLabel = new JLabel("New label");
		panel_4.add(lblNewLabel, BorderLayout.NORTH);
		
		panel_1 = new JPanel();
		getContentPane().add(panel_1);
		
		panel_2 = new JPanel();
		getContentPane().add(panel_2);
		
		panel_3 = new JPanel();
		getContentPane().add(panel_3);
	}

}
