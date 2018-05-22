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
	 *            å�̸��� ���������� ����
	 * @param id
	 *            �뿩�� ���� book_id �� �ް� ������ ���� bookrental_id�� �Ѱܹ���
	 * @param status
	 *            1�̸� �뿩 0�̸� ����-- if ������ �ش� dao �޼ҵ� ȣ���� ��
	 */
	public InputRentalUser(String bookname, String id, int status) {
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		this.status = status;
		this.id = id;
		setTitle("�뿩/������ ���� �Է�â");
		getContentPane().setLayout(new GridLayout(3, 1));
		setFont(new Font("Tahoma", Font.BOLD, 12));
		setSize(new Dimension(500, 250));

		p_massage = new JPanel();
		p_massage.setLayout(new BorderLayout(0, 0));
		message = new JLabel("<html>�����Ͻ� å [" + bookname + "] �� �뿩/�����մϴ�. <br>�뿩��/������ ID�� �Է����ּ���<br></html>");
		message.setFont(new Font("����", Font.BOLD, 16));
		message.setHorizontalAlignment(SwingConstants.CENTER);
		p_massage.add(message);
		getContentPane().add(p_massage);

		p_input = new JPanel();
		l_username = new JLabel("�뿩/������ ID");
		tf_input = new JTextField(20);
		p_input.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
		p_input.add(l_username);
		p_input.add(tf_input);
		getContentPane().add(p_input);

		p_button = new JPanel();
		p_button.setBorder(new LineBorder(new Color(0, 0, 0), 10));
		p_button.setLayout(new BorderLayout(0, 0));
		b_submit = new JButton("\uB300\uC5EC/\uC608\uC57D \uC2E0\uCCAD");
		b_submit.setFont(new Font("����", Font.BOLD, 20));
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

		if (status == 1) {// 1�̸� �뿩
			result2 = dao.rentalBookhistory(id, user_id); // rental_id�� ���� ������ 
			result = dao.updateBook(id);
		} else {
			result = dao.updateReserveHistory(id, user_id);
			result2 = true;
		}

		if (result && result2) {
			System.out.println(result);
			System.out.println(result2);
			JOptionPane.showMessageDialog(this, "�뿩/���� ��û�� �Ϸ�Ǿ����ϴ�.");
			dispose();
		} else {
			System.out.println(result);
			System.out.println(result2);
			JOptionPane.showMessageDialog(this, "�뿩/���� ��û ����");
		}
	}
}
