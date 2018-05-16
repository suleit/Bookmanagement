package management.ui;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import management.userDAO.BookDao;

public class InputRentalUser extends JFrame {
	
	private JPanel p_massage, p_input, p_button;
	private JLabel massage;
	private JTextField tf_input;
	private JButton b_submit;
	private BookDao Dao = new BookDao();

	public InputRentalUser() {
		setTitle("대여/예약자 정보 입력창");
		setLayout(new GridLayout(3, 1));
		setFont(new Font("Tahoma", Font.BOLD, 12));

		
		
		
		
	}
}
