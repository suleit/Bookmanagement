package management.ui;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import management.userDAO.BookDao;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.border.BevelBorder;

public class InputRentalUser extends JFrame implements ActionListener {

	private JPanel p_massage, p_input, p_button;
	private JLabel message, l_username;
	private JTextField tf_input;
	private JButton b_submit;
	private BookDao dao = new BookDao();
	private int status;
	private String id;

	/**
	 * @param bookname
	 *            책이름은 공통적으로 받음
	 * @param id
	 *            대여의 경우는 book_id 를 받고 예약의 경우는 bookrental_id를 넘겨받자
	 * @param status
	 *            1이면 대여 0이면 예약-- if 문으로 해당 dao 메소드 호출할 것
	 */
	public InputRentalUser(String bookname, String id, int status) {
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		this.status = status;
		this.id = id;
		setTitle("대여/예약자 정보 입력창");
		getContentPane().setLayout(new GridLayout(3, 1));
		setFont(new Font("Tahoma", Font.BOLD, 12));
		setSize(new Dimension(500, 250));

		p_massage = new JPanel();
		p_massage.setLayout(new BorderLayout(0, 0));
		message = new JLabel("<html>선택하신 책 [" + bookname + "] 을 대여/예약합니다. <br>대여자/예약자 ID를 입력해주세요<br></html>");
		message.setFont(new Font("굴림", Font.BOLD, 16));
		message.setHorizontalAlignment(SwingConstants.CENTER);
		p_massage.add(message);
		getContentPane().add(p_massage);

		p_input = new JPanel();
		l_username = new JLabel("대여/예약자 ID");
		tf_input = new JTextField(20);
		p_input.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
		p_input.add(l_username);
		p_input.add(tf_input);
		getContentPane().add(p_input);

		p_button = new JPanel();
		p_button.setBorder(new LineBorder(new Color(0, 0, 0), 10));
		p_button.setLayout(new BorderLayout(0, 0));
		b_submit = new JButton("\uB300\uC5EC/\uC608\uC57D \uC2E0\uCCAD");
		b_submit.setFont(new Font("굴림", Font.BOLD, 20));
		b_submit.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		p_button.add(b_submit);
		b_submit.addActionListener(this);

		getContentPane().add(p_button);
		setVisible(true);
		setResizable(false);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		boolean result = false;
		boolean result2 = false;
		String user_id = tf_input.getText();

		System.out.println(user_id);
		System.out.println(id);

		if (status == 1) {// 1이면 대여
			result2 = dao.rentalBookhistory(id, user_id); // rental_id를 먼저 생성함 
			result = dao.updateBook(id);
		} else {
			result = dao.updateReserveHistory(id, user_id);
			result2 = true;
		}

		if (result && result2) {
			System.out.println(result);
			System.out.println(result2);
			JOptionPane.showMessageDialog(this, "대여/예약 신청이 완료되었습니다.");
			dispose();
		} else {
			System.out.println(result);
			System.out.println(result2);
			JOptionPane.showMessageDialog(this, "대여/예약 신청 에러");
		}
	}
}
