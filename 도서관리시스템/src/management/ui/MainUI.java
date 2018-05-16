package management.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.CardLayout;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JTable;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

import management.userDAO.BookDao;
import management.vo.Book;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import javax.swing.BoxLayout;
import java.awt.GridBagConstraints;

public class MainUI extends JFrame implements ActionListener {
	public MainUI() {
		boolean result = bd.updateOverdue();
		setFont(new Font("Tahoma", Font.BOLD, 12));
		setSize(new Dimension(940, 460));
		setTitle("SCIT \uB3C4\uC11C\uAD00\uB9AC\uD504\uB85C\uADF8\uB7A8");

		P_NAME = new JPanel();
		getContentPane().add(P_NAME, BorderLayout.NORTH);

		P_SCIT = new JLabel("SCIT \uB3C4\uC11C\uAD00\uB9AC\uD504\uB85C\uADF8\uB7A8");
		P_NAME.add(P_SCIT);

		P_Bottom = new JPanel();
		getContentPane().add(P_Bottom, BorderLayout.SOUTH);

		B_EXIT = new JButton("\uC2DC\uC2A4\uD15C \uC885\uB8CC");
		B_EXIT.addActionListener(this);
		P_Bottom.add(B_EXIT);

		TABP = new JTabbedPane(JTabbedPane.TOP);
		TABP.setBorder(new LineBorder(new Color(0, 0, 0)));
		getContentPane().add(TABP, BorderLayout.CENTER);

		JP_NO1 = new JPanel();
		TABP.addTab("INTRO", null, JP_NO1, null);
		JP_NO1.setLayout(new BorderLayout(0, 0));

		NO1_Panel = new JPanel();
		JP_NO1.add(NO1_Panel, BorderLayout.CENTER);
		NO1_Panel.setLayout(new BorderLayout(0, 0));

		INTRO_NAME = new JPanel();
		NO1_Panel.add(INTRO_NAME, BorderLayout.NORTH);

		INTRO_LABEL = new JLabel("<html>SC IT 도서관리시스템을 이용해주셔서 감사합니다!<br>대여기간은 7일입니다.<br></html>");
		INTRO_LABEL.setHorizontalAlignment(SwingConstants.CENTER);
		INTRO_NAME.add(INTRO_LABEL);

		NO1_MAIN = new JPanel();
		NO1_Panel.add(NO1_MAIN, BorderLayout.CENTER);
		NO1_MAIN.setLayout(new GridLayout(1, 0, 0, 0));

		P_MANAGEMENT = new JPanel();
		P_MANAGEMENT.setBorder(new LineBorder(new Color(0, 0, 0)));
		NO1_MAIN.add(P_MANAGEMENT);

		MANAGEMENT_TXT = new JTextPane();
		MANAGEMENT_TXT.setText(
				"      \uB3C4\uC11C\uAD00\uB9AC\r\n\r\n1. \uC2E0\uADDC \uB3C4\uC11C \uB4F1\uB85D\r\n2. \uD3D0\uAE30 \uB3C4\uC11C \uC0AD\uC81C");
		P_MANAGEMENT.add(MANAGEMENT_TXT);

		P_PRINT = new JPanel();
		P_PRINT.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		NO1_MAIN.add(P_PRINT);

		PRINT_TXT = new JTextPane();
		PRINT_TXT.setText(
				"      \uB3C4\uC11C\uBAA9\uB85D \uCD9C\uB825\r\n\r\n   1. \uB3C4\uC11C\uC815\uBCF4 \uCD9C\uB825\r\n2. \uB300\uCD9C\uC911\uC778 \uB3C4\uC11C \uC815\uBCF4\r\n 3. \uC5F0\uC81C\uC911\uC778 \uB3C4\uC11C\uC815\uBCF4");
		P_PRINT.add(PRINT_TXT);

		P_RENTAL = new JPanel();
		P_RENTAL.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		NO1_MAIN.add(P_RENTAL);

		RENTAL_TXT = new JTextPane();
		RENTAL_TXT.setText("\uB300\uCD9C\uAD00\uB9AC\r\n\r\n 1. \uB300\uC5EC\r\n 2. \uBC18\uB0A9");
		P_RENTAL.add(RENTAL_TXT);

		JP_NO2 = new JPanel();
		TABP.addTab("\uB3C4\uC11C\uAD00\uB9AC", null, JP_NO2, null);
		JP_NO2.setLayout(new GridLayout(1, 0, 0, 0));

		NO2_Panel = new JPanel();
		NO2_Panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		JP_NO2.add(NO2_Panel);
		NO2_Panel.setLayout(new BorderLayout(0, 0));

		NO2p_Label = new JLabel("\uC2E0\uADDC \uB3C4\uC11C \uB4F1\uB85D");
		NO2p_Label.setHorizontalAlignment(SwingConstants.CENTER);
		NO2_Panel.add(NO2p_Label, BorderLayout.NORTH);

		REGISTER_MAIN = new JPanel();
		REGISTER_MAIN.setBorder(new MatteBorder(1, 0, 0, 0, (Color) new Color(0, 0, 0)));
		NO2_Panel.add(REGISTER_MAIN, BorderLayout.SOUTH);

		B_INPUT = new JButton("\uC9C1\uC811 \uC785\uB825");
		B_INPUT.addActionListener(this);
		REGISTER_MAIN.add(B_INPUT);
		//new **ListUI(); 이런식으로 써서 클래스로 바로연결

		panel = new JPanel();
		panel.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		NO2_Panel.add(panel, BorderLayout.NORTH);

		NO2p_Label = new JLabel("\uC2E0\uADDC \uB3C4\uC11C \uB4F1\uB85D");
		panel.add(NO2p_Label);
		NO2p_Label.setHorizontalAlignment(SwingConstants.CENTER);

		NO2_Panel2 = new JPanel();
		NO2_Panel2.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		JP_NO2.add(NO2_Panel2);
		NO2_Panel2.setLayout(new BorderLayout(0, 0));

		DELETENAME = new JPanel();
		DELETENAME.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		DELETENAME.setForeground(Color.BLACK);
		NO2_Panel2.add(DELETENAME, BorderLayout.NORTH);

		DELETE_LABEL = new JLabel("\uB3C4\uC11C\uC0AD\uC81C");
		DELETENAME.add(DELETE_LABEL);

		BELETE_BOTTOM = new JPanel();
		NO2_Panel2.add(BELETE_BOTTOM, BorderLayout.SOUTH);

		B_DELETE = new JButton("\uC0AD\uC81C");
		B_DELETE.addActionListener(this);
		BELETE_BOTTOM.add(B_DELETE);

		DELETE_MAIN = new JPanel();
		NO2_Panel2.add(DELETE_MAIN, BorderLayout.CENTER);
		DELETE_MAIN.setLayout(new BorderLayout(0, 0));

		P1_DELETEMAIN = new JPanel();
		DELETE_MAIN.add(P1_DELETEMAIN, BorderLayout.NORTH);
		P1_DELETEMAIN.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		panel = new JPanel();
		P1_DELETEMAIN.add(panel);
		panel.setLayout(new BorderLayout(0, 0));

		lblNewLabel = new JLabel("\uB3C4\uC11C\uC81C\uBAA9");
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);

		JTextField DM_TXTF = new JTextField();
		P1_DELETEMAIN.add(DM_TXTF);
		DM_TXTF.setColumns(20);

		panel_1 = new JPanel();
		P1_DELETEMAIN.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));

		panel_3 = new JPanel();
		panel_1.add(panel_3);
		panel_3.setLayout(null);

		textField = new JTextField();
		textField.setBounds(0, 0, 152, 123);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(textField);
		textField.setColumns(10);

		panel_2 = new JPanel();
		P1_DELETEMAIN.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		panel_4 = new JPanel();
		panel_2.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));

		button = new JButton("\uAC80\uC0C9");
		button.setAlignmentX(10.0f);
		panel_2.add(button);
		button.setHorizontalTextPosition(SwingConstants.CENTER);

		P2_DELETEMAIN = new JPanel();
		DELETE_MAIN.add(P2_DELETEMAIN);
		P2_DELETEMAIN.setLayout(new BorderLayout(0, 0));

		JP_NO3 = new JPanel();
		TABP.addTab("\uB3C4\uC11C\uBAA9\uB85D\uCD9C\uB825", null, JP_NO3, null);
		JP_NO3.setLayout(new BorderLayout(0, 0));

		NO3_Panel = new JPanel();
		NO3_Panel.setBorder(new MatteBorder(1, 1, 0, 1, (Color) new Color(0, 0, 0)));
		JP_NO3.add(NO3_Panel, BorderLayout.NORTH);

		NO3_Button1 = new JButton("\uC804\uCCB4 \uB3C4\uC11C \uCD9C\uB825");
		NO3_Button1.addActionListener(this);
		NO3_Panel.add(NO3_Button1);

		NO3_Button2 = new JButton("\uB300\uC5EC\uC911\uC778 \uB3C4\uC11C\uBAA9\uB85D");
		NO3_Button2.addActionListener(this);
		NO3_Panel.add(NO3_Button2);

		NO3_Button3 = new JButton("\uC5F0\uCCB4\uC911\uC778 \uB3C4\uC11C\uBAA9\uB85D");
		NO3_Button3.addActionListener(this);
		NO3_Panel.add(NO3_Button3);

		NO3_Button4 = new JButton("\uB3C4\uC11C\uC815\uBCF4\uAC80\uC0C9");
		NO3_Button4.addActionListener(this);
		NO3_Panel.add(NO3_Button4);

		NO3_Panel2 = new JPanel();
		JP_NO3.add(NO3_Panel2, BorderLayout.CENTER);
		NO3_Panel2.setLayout(new BorderLayout(0, 0));

		JP_NO4 = new JPanel();
		TABP.addTab("\uB300\uCD9C\uAD00\uB9AC", null, JP_NO4, null);
		JP_NO4.setLayout(new GridLayout(1, 0, 0, 0));

		NO4_Panel = new JPanel();
		NO4_Panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		JP_NO4.add(NO4_Panel);
		NO4_Panel.setLayout(new BorderLayout(0, 0));

		P4_RENTAL = new JPanel();
		P4_RENTAL.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		NO4_Panel.add(P4_RENTAL, BorderLayout.NORTH);
		P4_RENTAL.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		RENTAL_LABEL = new JLabel("\uB300\uC5EC");
		P4_RENTAL.add(RENTAL_LABEL);

		RENTAL_BOTTOM = new JPanel();
		NO4_Panel.add(RENTAL_BOTTOM, BorderLayout.SOUTH);
		RENTAL_BOTTOM.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		B_RENTAL = new JButton("\uB300\uC5EC");
		RENTAL_BOTTOM.add(B_RENTAL);

		B_RESERVE = new JButton("\uC608\uC57D");
		RENTAL_BOTTOM.add(B_RESERVE);

		RENTAL_MAIN = new JPanel();
		NO4_Panel.add(RENTAL_MAIN, BorderLayout.CENTER);
		RENTAL_MAIN.setLayout(new BorderLayout(0, 0));

		P1_RENTALMAIN = new JPanel();
		RENTAL_MAIN.add(P1_RENTALMAIN, BorderLayout.NORTH);
		P1_RENTALMAIN.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		P1_RENTALNAME_LABEL = new JLabel("\uB3C4\uC11C\uC81C\uBAA9");
		P1_RENTALNAME_LABEL.setHorizontalAlignment(SwingConstants.CENTER);
		P1_RENTALMAIN.add(P1_RENTALNAME_LABEL);

		P1_RETAL_TXTF = new JTextField();
		P1_RENTALMAIN.add(P1_RETAL_TXTF);
		P1_RETAL_TXTF.setColumns(20);
		P1_RETAL_TXTF.addActionListener(this);

		P1_RENTAL_BUTTON = new JButton("\uAC80\uC0C9");
		P1_RENTAL_BUTTON.addActionListener(this);
		P1_RENTALMAIN.add(P1_RENTAL_BUTTON);

		P2_RENTALMAIN = new JPanel();
		RENTAL_MAIN.add(P2_RENTALMAIN);
		P2_RENTALMAIN.setLayout(new BorderLayout(0, 0));

		NO4_Panel2 = new JPanel();
		NO4_Panel2.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		JP_NO4.add(NO4_Panel2);
		NO4_Panel2.setLayout(new BorderLayout(0, 0));

		RETURN_NAME = new JPanel();
		RETURN_NAME.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		NO4_Panel2.add(RETURN_NAME, BorderLayout.NORTH);
		RETURN_NAME.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		RESERVE_LABEL = new JLabel("\uBC18\uB0A9");
		RETURN_NAME.add(RESERVE_LABEL);

		RETURN_BOTTOM = new JPanel();
		NO4_Panel2.add(RETURN_BOTTOM, BorderLayout.SOUTH);
		RETURN_BOTTOM.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		RETURN_BUTTON = new JButton("\uBC18\uB0A9");
		RETURN_BUTTON.addActionListener(this);
		RETURN_BOTTOM.add(RETURN_BUTTON);

		RETURN_MAIN = new JPanel();
		NO4_Panel2.add(RETURN_MAIN, BorderLayout.CENTER);
		RETURN_MAIN.setLayout(new BorderLayout(0, 0));

		P1_RETURN = new JPanel();
		RETURN_MAIN.add(P1_RETURN, BorderLayout.NORTH);
		P1_RETURN.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		P1_RETURN_LABEL = new JLabel("\uB300\uC5EC\uC790\uBA85");
		P1_RETURN_LABEL.setHorizontalAlignment(SwingConstants.CENTER);
		P1_RETURN.add(P1_RETURN_LABEL);

		P1_RETURN_TXTF = new JTextField();
		P1_RETURN_TXTF.addActionListener(this);
		P1_RETURN.add(P1_RETURN_TXTF);
		P1_RETURN_TXTF.setColumns(20);

		P1_RETURN_find_BUTTON = new JButton("\uAC80\uC0C9");
		P1_RETURN_find_BUTTON.addActionListener(this);
		P1_RETURN.add(P1_RETURN_find_BUTTON);

		P2_RETURN = new JPanel();
		RETURN_MAIN.add(P2_RETURN, BorderLayout.CENTER);
		P2_RETURN.setLayout(new BorderLayout(0, 0));

		setVisible(true);
	}

	private JPanel contentPane;
	private JPanel P_NAME;
	private JLabel P_SCIT;
	private JPanel P_Bottom;
	private JButton B_EXIT;
	private JTabbedPane TABP;
	private JPanel JP_NO1;
	private JPanel NO1_Panel;
	private JPanel JP_NO2;
	private JPanel JP_NO3;
	private JPanel NO3_Panel;
	private JButton NO3_Button1;
	private JButton NO3_Button2;
	private JButton NO3_Button3;
	private JButton NO3_Button4;
	private JPanel JP_NO4;
	private JPanel NO4_Panel;
	private JPanel NO4_Panel2;
	private JPanel NO2_Panel;
	private JPanel NO2_Panel2;
	private JLabel NO2p_Label;
	private JPanel REGISTER_MAIN;
	private JButton B_INPUT;
	private JPanel DELETENAME;
	private JPanel BELETE_BOTTOM;
	private JPanel DELETE_MAIN;
	private JButton B_DELETE;
	private JLabel DELETE_LABEL;
	private JPanel P1_DELETEMAIN;
	private JPanel P2_DELETEMAIN;
	private JPanel P4_RENTAL;
	private JPanel RENTAL_BOTTOM;
	private JPanel RENTAL_MAIN;
	private JLabel RENTAL_LABEL;
	private JButton B_RENTAL;
	private JButton B_RESERVE;
	private JPanel P1_RENTALMAIN;
	private JPanel P2_RENTALMAIN;
	private JLabel P1_RENTALNAME_LABEL;
	private JTextField P1_RETAL_TXTF;
	private JButton P1_RENTAL_BUTTON;
	private JPanel RETURN_NAME;
	private JPanel RETURN_BOTTOM;
	private JPanel RETURN_MAIN;
	private JPanel P1_RETURN;
	private JPanel P2_RETURN;
	private JLabel RESERVE_LABEL;
	private JButton RETURN_BUTTON;
	private JLabel P1_RETURN_LABEL;
	private JTextField P1_RETURN_TXTF;
	private JButton P1_RETURN_find_BUTTON;
	private JPanel NO3_Panel2;
	private JPanel INTRO_NAME;
	private JPanel NO1_MAIN;
	private JPanel P_MANAGEMENT;
	private JPanel P_PRINT;
	private JPanel P_RENTAL;
	private JLabel INTRO_LABEL;
	private JTextPane PRINT_TXT;
	private JTextPane MANAGEMENT_TXT;
	private JTextPane RENTAL_TXT;
	private JPanel panel;
	private BookDao bd = new BookDao();
	private DefaultTableModel model, model2, modelP3;
	private JTable table_rental, table_return, p3_tables;
	private JPanel panel_1;
	private JPanel panel_2;
	private JLabel lblNewLabel;
	private JPanel panel_3;
	private JTextField textField;
	private JPanel panel_4;
	private JButton button;
	private List<Book> booksforRental, booksforReturn;
	private JScrollPane rental_table_sc, return_table_sc;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainUI frame = new MainUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("시스템 종료")) {
			int result = JOptionPane.showConfirmDialog(null, "정말로 종료하시겠습니까?", "시스템 종료", JOptionPane.YES_NO_OPTION);
			if (JOptionPane.YES_OPTION == result) {
				System.exit(0);
			}
		}
		if (e.getSource() == B_INPUT) {
			final Frame fs = new Frame("도서 검색");
			fs.setVisible(true);
			fs.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					fs.setVisible(false);
					fs.dispose();
				}
			});
			fs.setSize(300, 200);
			fs.setLocation(200, 200);
		}
		if (e.getActionCommand().equals("삭제")) {// 도서삭제버튼
			int result = JOptionPane.showConfirmDialog(null, "정말로 삭제하시겠습니까?", "삭제", JOptionPane.YES_NO_OPTION);
			if (JOptionPane.YES_OPTION == result) {

			}
		}
		if (e.getSource() == P1_RENTAL_BUTTON || e.getSource() == P1_RETAL_TXTF) {
			String bookname = P1_RETAL_TXTF.getText();
			if (table_rental != null) {
				P2_RENTALMAIN.remove(rental_table_sc);
			}
			table_rental = new JTable();
			if (model != null)
				model.setRowCount(0);
			booksforRental = bd.findBookForRent(bookname);
			if (booksforRental != null) {
				int rows = booksforRental.size();
				if (rows > 0) {
					Object[][] objs = new Object[rows][7];
					for (int i = 0; i < booksforRental.size(); i++) {
						objs[i][0] = booksforRental.get(i).getBook_id();
						objs[i][1] = booksforRental.get(i).getTitle();
						objs[i][2] = booksforRental.get(i).getPublisher();
						objs[i][3] = booksforRental.get(i).getRental_name();
						objs[i][4] = booksforRental.get(i).getRental_date();
						objs[i][5] = booksforRental.get(i).getReserve_name();
						objs[i][6] = booksforRental.get(i).getOverdue();
					}

					model = new DefaultTableModel(objs,
							new String[] { "book.NO", "도서제목", "출판사", "대여자명", "대여일시", "예약자명", "연체일자" });
					table_rental.setModel(model);
				}
				rental_table_sc = new JScrollPane(table_rental);

				P2_RENTALMAIN.add(rental_table_sc);
			} else {
				P2_RENTALMAIN.add(new JLabel("찾으시는 도서가 현재 대여/예약 중이거나 존재하지 않습니다."));
			}
		} // 대여버튼 이벤트 종료
		if (e.getSource() == P1_RETURN_find_BUTTON || e.getSource() == P1_RETURN_TXTF) {
			String username = P1_RETURN_TXTF.getText();
			if (table_return != null) {
				P2_RETURN.remove(return_table_sc);
			}
			table_return = new JTable();
			if (model2 != null)
				model2.setRowCount(0);
			booksforReturn = bd.findBookForReturn(username);

			if (booksforReturn != null) {
				int rows = booksforReturn.size();
				if (rows > 0) {
					Object[][] objs = new Object[rows][8];
					for (int i = 0; i < booksforReturn.size(); i++) {
						objs[i][0] = booksforReturn.get(i).getBookrental_id();
						objs[i][1] = booksforReturn.get(i).getBook_id();
						objs[i][2] = booksforReturn.get(i).getTitle();
						objs[i][3] = booksforReturn.get(i).getPublisher();
						objs[i][4] = booksforReturn.get(i).getRental_name();
						objs[i][5] = booksforReturn.get(i).getRental_date();
						objs[i][6] = booksforReturn.get(i).getReserve_name();
						objs[i][7] = booksforReturn.get(i).getOverdue();
					}

					model2 = new DefaultTableModel(objs,
							new String[] {"대여번호","book.NO", "도서제목", "출판사", "대여자명", "대여일시", "예약자명", "연체일자" });
					table_return.setModel(model2);
				}
				return_table_sc = new JScrollPane(table_return);

				P2_RETURN.add(return_table_sc);
			} else {
				P2_RETURN.add(new JLabel("해당 이용자는 현재 대여중인 책이 없습니다."));
			}
		} // 반납조회 이벤트 종료
		if (e.getSource() == RETURN_BUTTON) {
			if (table_return.getSelectedRowCount()==0) {
				JOptionPane.showMessageDialog(this, "선택된 도서가 없습니다.\n 하나 이상 선택해 주세요.");
			}else{
				int row=table_return.getSelectedRow();
				String bookRental_id=(String) table_return.getValueAt(row, 0);
				if(bd.updateReceiveDate(bookRental_id)) {
					JOptionPane.showMessageDialog(this, "반납이 완료되었습니다.");
				}else {
					JOptionPane.showMessageDialog(this, "반납실패","에러",JOptionPane.ERROR_MESSAGE);;
				}
				
			}
		}//반납버튼 이벤트 종료

	}

	private void setTable() throws Exception {

	}

}
