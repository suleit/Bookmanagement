package management.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame implements ActionListener{

	private JLabel lbl_title, lbl_id, lbl_password;
	private JTextField tf_id;
	private JPasswordField tf_password;
	private JButton btn_ok, btn_cancel;

	public Login() {
		super("Chat Login");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		lbl_title = new JLabel("도서관리프로그램", JLabel.CENTER);
		lbl_title.setFont(new Font("굴림", Font.BOLD, 25));
		lbl_id = new JLabel("ID");
		lbl_id.setPreferredSize(new Dimension(80, 20));
		lbl_password = new JLabel("Password");
		lbl_password.setPreferredSize(new Dimension(80, 20));

		tf_id = new JTextField(10);
		tf_password = new JPasswordField(10);

		btn_ok = new JButton("OK");
		btn_ok.addActionListener(this);
		btn_cancel = new JButton("Cancel");
		btn_cancel.addActionListener(this);

		getContentPane().add(lbl_title, BorderLayout.NORTH);

		JPanel p_center_1 = new JPanel();
		p_center_1.add(lbl_id);
		p_center_1.add(tf_id);

		JPanel p_center_2 = new JPanel();
		p_center_2.add(lbl_password);
		p_center_2.add(tf_password);

		JPanel p_center = new JPanel(new GridLayout(2, 1));
		p_center.add(p_center_1);
		p_center.add(p_center_2);
		getContentPane().add(p_center, BorderLayout.CENTER);

		JPanel p_south = new JPanel();
		p_south.add(btn_ok);
		p_south.add(btn_cancel);
		getContentPane().add(p_south, BorderLayout.SOUTH);

		pack();
		setVisible(true);

	}

	public static void main(String[] args) {
		Login login = new Login();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();

		if (source == btn_ok) {
			String id = tf_id.getText();
			this.dispose();
			//여기서 new ChattingMain(id);이거를 지웠음
		} else if (source == btn_cancel) {
			System.exit(0);
		}
	}

}
