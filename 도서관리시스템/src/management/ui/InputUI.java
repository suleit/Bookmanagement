package management.ui;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.SwingConstants;

import management.userDAO.BookDao;
import management.vo.Book;

import javax.swing.JButton;

public class InputUI extends JFrame implements ActionListener {
	private JPanel P_Panel1;
	private JPanel P_Panel2;
	private JPanel P_Panel3;
	private JPanel P_Panel4;
	private JPanel P1_Label;
	private JLabel lblNewLabel;
	private JTextField P1_TXTF;
	private JPanel P2_Label;
	private JLabel lblNewLabel_1;
	private JTextField P2_TXTF;
	private JPanel P3_Label;
	private JLabel lblNewLabel_2;
	private JTextField P3_TXTF;
	private JPanel P3_NULL;
	private JPanel P1_NULL;
	private JButton P4_Button;
	private BookDao Dao = new BookDao();

	
	public InputUI() {
		setTitle("\uB4F1\uB85D");
		getContentPane().setLayout(new GridLayout(4, 0, 0, 0));
		setFont(new Font("Tahoma", Font.BOLD, 12));
		setSize(new Dimension(500, 250));
		
		P_Panel1 = new JPanel();
		getContentPane().add(P_Panel1);
		P_Panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		P1_Label = new JPanel();
		P_Panel1.add(P1_Label);
		P1_Label.setLayout(new BorderLayout(0, 0));
		
		lblNewLabel = new JLabel("\uC81C\uBAA9");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		P1_Label.add(lblNewLabel, BorderLayout.NORTH);
		
		P1_NULL = new JPanel();
		P_Panel1.add(P1_NULL);
		
		P1_TXTF = new JTextField();
		P_Panel1.add(P1_TXTF);
		P1_TXTF.setColumns(20);
		
		P_Panel2 = new JPanel();
		getContentPane().add(P_Panel2);
		
		P2_Label = new JPanel();
		P_Panel2.add(P2_Label);
		
		lblNewLabel_1 = new JLabel("\uCD9C\uD310\uC0AC");
		P2_Label.add(lblNewLabel_1);
		
		P2_TXTF = new JTextField();
		P_Panel2.add(P2_TXTF);
		P2_TXTF.setColumns(20);
		
		P_Panel3 = new JPanel();
		getContentPane().add(P_Panel3);
		
		P3_Label = new JPanel();
		P_Panel3.add(P3_Label);
		
		lblNewLabel_2 = new JLabel("\uC218\uB7C9");
		P3_Label.add(lblNewLabel_2);
		
		P3_NULL = new JPanel();
		P_Panel3.add(P3_NULL);
		
		P3_TXTF = new JTextField();
		P_Panel3.add(P3_TXTF);
		P3_TXTF.setColumns(20);
		
		P_Panel4 = new JPanel();
		getContentPane().add(P_Panel4);
		P_Panel4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		P4_Button = new JButton("\uB4F1\uB85D");
		P4_Button.addActionListener(this);
		P_Panel4.add(P4_Button);
		
		this.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String bookName=P1_TXTF.getText();
		String publisher=P2_TXTF.getText();
		int num=Integer.parseInt(P3_TXTF.getText());
		boolean result=false;
		for (int i = 0; i < num; i++) {
			Book b= new Book();
			b.setPublisher(publisher);
			b.setTitle(bookName);
			
			result=Dao.insertBook(b);
			
			if(result==false) {
				break;
			}
		}
		if(result) {
			JOptionPane.showMessageDialog(this, "신규도서 등록이 완료되었습니다.");
			dispose();
		}else {
			JOptionPane.showMessageDialog(this, "신규도서 등록 실패!");
		}
		
		
	}

}
