package management.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import management.userDAO.BookDao;
import management.userDAO.BookMapper;
import management.vo.Book;
import management.vo.DBvo;
import java.awt.Rectangle;
import javax.swing.JTextArea;

public class MainUI extends JFrame implements ActionListener {
	public MainUI() {
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setFont(new Font("Tahoma", Font.BOLD, 12));
		setSize(new Dimension(1500, 900));
		setTitle("SCIT \uB3C4\uC11C\uAD00\uB9AC\uD504\uB85C\uADF8\uB7A8");

		P_NAME = new JPanel();
		getContentPane().add(P_NAME, BorderLayout.NORTH);

		P_SCIT = new JLabel("SCIT \uB3C4\uC11C\uAD00\uB9AC\uD504\uB85C\uADF8\uB7A8");
		P_SCIT.setFont(new Font("굴림", Font.PLAIN, 20));
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
		INTRO_LABEL.setFont(new Font("굴림", Font.PLAIN, 20));
		INTRO_LABEL.setHorizontalAlignment(SwingConstants.CENTER);
		INTRO_NAME.add(INTRO_LABEL);

		NO1_MAIN = new JPanel();
		NO1_Panel.add(NO1_MAIN, BorderLayout.CENTER);
		NO1_MAIN.setLayout(new GridLayout(1, 0, 0, 0));

		P_MANAGEMENT = new JPanel();
		P_MANAGEMENT.setBorder(new LineBorder(new Color(0, 0, 0)));
		NO1_MAIN.add(P_MANAGEMENT);
		P_MANAGEMENT.setLayout(null);

		textPane = new JTextPane();
		textPane.setFont(new Font("굴림", Font.BOLD, 26));
		textPane.setEditable(false);
		textPane.setBounds(123, 210, 248, 262);
		textPane.setText(
				"     \uB3C4\uC11C\uAD00\uB9AC\r\n\r\n1. \uC2E0\uADDC\uB3C4\uC11C \uB4F1\uB85D\r\n2. \uD3D0\uAE30\uB3C4\uC11C \uC0AD\uC81C");
		P_MANAGEMENT.add(textPane);

		P_PRINT = new JPanel();
		P_PRINT.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		NO1_MAIN.add(P_PRINT);
		P_PRINT.setLayout(null);

		PRINT_TXT = new JTextPane();
		PRINT_TXT.setFont(new Font("굴림", Font.BOLD, 26));
		PRINT_TXT.setEditable(false);
		PRINT_TXT.setBounds(88, 210, 320, 262);
		PRINT_TXT.setText(
				"      \uB3C4\uC11C\uBAA9\uB85D \uCD9C\uB825\r\n\r\n   1. \uB3C4\uC11C\uC815\uBCF4 \uCD9C\uB825\r\n2. \uB300\uCD9C\uC911\uC778 \uB3C4\uC11C \uC815\uBCF4\r\n 3. \uC5F0\uC81C\uC911\uC778 \uB3C4\uC11C\uC815\uBCF4\r\n    4. \uB3C4\uC11C\uC815\uBCF4 \uAC80\uC0C9");
		P_PRINT.add(PRINT_TXT);

		P_RENTAL = new JPanel();
		P_RENTAL.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		NO1_MAIN.add(P_RENTAL);
		P_RENTAL.setLayout(null);

		RENTAL_TXT = new JTextPane();
		RENTAL_TXT.setFont(new Font("굴림", Font.BOLD, 26));
		RENTAL_TXT.setEditable(false);
		RENTAL_TXT.setBounds(192, 220, 131, 262);
		RENTAL_TXT.setText("\uB300\uCD9C\uAD00\uB9AC\r\n\r\n 1. \uB300\uC5EC\r\n 2. \uBC18\uB0A9");
		P_RENTAL.add(RENTAL_TXT);

		JP_NO2 = new JPanel();
		TABP.addTab("\uB3C4\uC11C\uAD00\uB9AC", null, JP_NO2, null);
		JP_NO2.setLayout(new GridLayout(1, 0, 0, 0));

		NO2_Panel = new JPanel();
		NO2_Panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		JP_NO2.add(NO2_Panel);
		NO2_Panel.setLayout(new BorderLayout(0, 0));

		P_InputButton = new JPanel();
		P_InputButton.setBorder(new MatteBorder(1, 0, 0, 0, (Color) new Color(0, 0, 0)));
		NO2_Panel.add(P_InputButton, BorderLayout.SOUTH);

		B_INPUT = new JButton("\uC9C1\uC811 \uC785\uB825");
		B_INPUT.addActionListener(this);
		P_InputButton.add(B_INPUT);

		b_upload = new JButton("\uC5D1\uC140\uD30C\uC77C \uC5C5\uB85C\uB4DC");
		b_upload.addActionListener(this);
		P_InputButton.add(b_upload);

		P_NewBook = new JPanel();
		P_NewBook.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		NO2_Panel.add(P_NewBook, BorderLayout.NORTH);

		NO2p_Label = new JLabel("\uC2E0\uADDC \uB3C4\uC11C \uB4F1\uB85D");
		NO2p_Label.setFont(new Font("굴림", Font.BOLD, 18));
		P_NewBook.add(NO2p_Label);
		NO2p_Label.setHorizontalAlignment(SwingConstants.CENTER);

		P_InputCenter = new JPanel();
		P_InputCenter.setAlignmentY(1.0f);
		P_InputCenter.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 100));
		JLabel introduction = new JLabel(
				"<html>\uC9C1\uC811\uC785\uB825 : \uC9C1\uC811 \uC785\uB825\uC73C\uB85C \uC18C\uB7C9 \uB4F1\uB85D<br><br>\uC5D1\uC140\uD30C\uC77C \uC5C5\uB85C\uB4DC : \uB300\uB7C9\uC758 \uCC45\uC744 \uD55C\uBC88\uC5D0 \uB4F1\uB85D \uAC00\uB2A5<br><br>[\uC785\uB825 \uC608\uC2DC]<br>1\uD589 : \uCC45\uC774\uB984 | \uCD9C\uD310\uC0AC <br>2\uD589: JLPT\uB2E8\uC5B4\uC7A5|\uC2DC\uC0AC\uC77C\uBCF8\uC5B4\uC0AC<br><br>**\uC8FC\uC758\uC0AC\uD56D: \uB3D9\uC77C\uD55C \uCC45\uC774 \uC5EC\uB7EC\uAD8C\uC778 \uACBD\uC6B0\uB294 \uAC19\uC740 \uB0B4\uC6A9\uC758 \uD589\uC744 \uD574\uB2F9 \uAD8C\uC218\uB9CC\uD07C \uC0BD\uC785**<br><br>**xls\uC591\uC2DD\uC73C\uB85C\uB9CC \uC5C5\uB85C\uB4DC \uAC00\uB2A5**<br></html>");
		introduction.setBounds(new Rectangle(0, 0, 6, 0));
		introduction.setFont(new Font("굴림", Font.BOLD, 16));
		P_InputCenter.add(introduction);

		NO2_Panel.add(P_InputCenter, BorderLayout.CENTER);

		NO2_Panel2 = new JPanel();
		NO2_Panel2.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		JP_NO2.add(NO2_Panel2);
		NO2_Panel2.setLayout(new BorderLayout(0, 0));

		DELETENAME = new JPanel();
		DELETENAME.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		DELETENAME.setForeground(Color.BLACK);
		NO2_Panel2.add(DELETENAME, BorderLayout.NORTH);

		DELETE_LABEL = new JLabel("\uB3C4\uC11C\uC0AD\uC81C");
		DELETE_LABEL.setFont(new Font("굴림", Font.BOLD, 18));
		DELETENAME.add(DELETE_LABEL);

		DELETE_BOTTOM = new JPanel();
		NO2_Panel2.add(DELETE_BOTTOM, BorderLayout.SOUTH);

		B_DELETE = new JButton("\uC0AD\uC81C");
		B_DELETE.addActionListener(this);
		DELETE_BOTTOM.add(B_DELETE);

		DELETE_MAIN = new JPanel();
		NO2_Panel2.add(DELETE_MAIN, BorderLayout.CENTER);
		DELETE_MAIN.setLayout(new BorderLayout(0, 0));

		P1_DELETEMAIN = new JPanel();
		DELETE_MAIN.add(P1_DELETEMAIN, BorderLayout.NORTH);
		P1_DELETEMAIN.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		P1_Label = new JLabel("\uB3C4\uC11C\uC81C\uBAA9");
		P1_DELETEMAIN.add(P1_Label);

		P1_TXTF = new JTextField();
		P1_TXTF.addActionListener(this);
		P1_DELETEMAIN.add(P1_TXTF);
		P1_TXTF.setColumns(20);

		button_delete = new JButton("\uAC80\uC0C9");
		P1_DELETEMAIN.add(button_delete);
		button_delete.addActionListener(this);
		button_delete.setAlignmentX(10.0f);
		button_delete.setHorizontalTextPosition(SwingConstants.CENTER);

		P2_DELETEMAIN = new JPanel();
		DELETE_MAIN.add(P2_DELETEMAIN);
		P2_DELETEMAIN.setLayout(new BorderLayout(0, 0));

		JP_NO3 = new JPanel();
		TABP.addTab("\uB3C4\uC11C\uBAA9\uB85D\uCD9C\uB825", null, JP_NO3, null);
		JP_NO3.setLayout(new BorderLayout(0, 0));

		NO3_Panel = new JPanel();
		NO3_Panel.setBorder(new MatteBorder(1, 1, 0, 1, (Color) new Color(0, 0, 0)));
		JP_NO3.add(NO3_Panel, BorderLayout.NORTH);

		NO3_Button1 = new JButton("전체 도서 출력");
		NO3_Button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == NO3_Button1) {
					NO3_Panel2.removeAll();
					NO3_Panel2.validate();
					p3_tables = new JTable();
					if (modelP3 != null)
						modelP3.setRowCount(0);
					booksforViewP3 = bd.findAllBook();

					if (booksforViewP3 != null) {
						int rows = booksforViewP3.size();
						if (rows > 0) {
							Object[][] objs = new Object[rows][3];
							for (int i = 0; i < rows; i++) {
								objs[i][0] = booksforViewP3.get(i).getBook_id();
								objs[i][1] = booksforViewP3.get(i).getTitle();
								objs[i][2] = booksforViewP3.get(i).getPublisher();
							}
							modelP3 = new DefaultTableModel(objs, new String[] { "book.NO", "도서제목", "출판사" });
							p3_tables.setModel(modelP3);
						}
						p3_sc = new JScrollPane(p3_tables);
						NO3_Panel2.add(p3_sc);
						NO3_Panel2.setVisible(true);
					}
				} // 버튼 1=전체도서정보 출력 완료
			}
		});
		NO3_Panel.add(NO3_Button1);

		NO3_Button2 = new JButton("\uB300\uC5EC\uC911\uC778 \uB3C4\uC11C\uBAA9\uB85D");
		NO3_Button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == NO3_Button2) {

					NO3_Panel2.removeAll();
					NO3_Panel2.validate();
					p3_tables = new JTable();
					if (modelP3 != null)
						modelP3.setRowCount(0);
					booksforViewP3 = bd.findRentalBook();

					if (booksforViewP3 != null) {
						int rows = booksforViewP3.size();
						if (rows > 0) {
							Object[][] objs = new Object[rows][8];
							for (int i = 0; i < rows; i++) {
								objs[i][0] = booksforViewP3.get(i).getBookrental_id();
								objs[i][1] = booksforViewP3.get(i).getBook_id();
								objs[i][2] = booksforViewP3.get(i).getTitle();
								objs[i][3] = booksforViewP3.get(i).getPublisher();
								objs[i][4] = booksforViewP3.get(i).getRental_name();
								objs[i][5] = booksforViewP3.get(i).getRental_date();
								objs[i][6] = booksforViewP3.get(i).getReserve_name();
								objs[i][7] = booksforViewP3.get(i).getOverdue();
							}

							modelP3 = new DefaultTableModel(objs,
									new String[] { "대여번호", "book.NO", "도서제목", "출판사", "대여자명", "대여일시", "예약자명", "연체일자" });
							p3_tables.setModel(modelP3);
							p3_tables.updateUI();
						}
						p3_sc = new JScrollPane(p3_tables);
						p3_sc.setVisible(true);
					}
				} // 버튼2= 대여중인 도서정보 출력 코드
				NO3_Panel2.add(p3_sc);
				NO3_Panel2.setVisible(true);

			}
		});
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
		RENTAL_LABEL.setFont(new Font("굴림", Font.BOLD, 18));
		P4_RENTAL.add(RENTAL_LABEL);

		RENTAL_BOTTOM = new JPanel();
		NO4_Panel.add(RENTAL_BOTTOM, BorderLayout.SOUTH);
		RENTAL_BOTTOM.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		B_RENTAL = new JButton("\uB300\uC5EC");
		B_RENTAL.addActionListener(this);
		RENTAL_BOTTOM.add(B_RENTAL);

		B_RESERVE = new JButton("\uC608\uC57D");
		B_RESERVE.addActionListener(this);
		RENTAL_BOTTOM.add(B_RESERVE);

		RENTAL_MAIN = new JPanel();
		NO4_Panel.add(RENTAL_MAIN, BorderLayout.CENTER);
		RENTAL_MAIN.setLayout(new BorderLayout(0, 0));

		P1_RENTALMAIN = new JPanel();
		RENTAL_MAIN.add(P1_RENTALMAIN, BorderLayout.NORTH);
		P1_RENTALMAIN.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		P1_RENTALNAME_LABEL = new JLabel("\uB3C4\uC11C\uC81C\uBAA9");
		P1_RENTALNAME_LABEL.setFont(new Font("굴림", Font.PLAIN, 18));
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
		RESERVE_LABEL.setFont(new Font("굴림", Font.BOLD, 18));
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
		P1_RETURN_LABEL.setFont(new Font("굴림", Font.PLAIN, 18));
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

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				System.out.println("창이 열렸습니다.");
				boolean result = bd.updateHistoryOverdue();
				if(result) {
					System.out.println("연체일 업데이트 수행여부 :"+result);
				}
			}
		});
	}

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
	private JPanel P_InputButton;
	private JButton B_INPUT;
	private JPanel DELETENAME;
	private JPanel DELETE_BOTTOM;
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
	private JTextPane RENTAL_TXT;
	private JPanel P_NewBook;

	private BookDao bd = new BookDao();
	private DefaultTableModel model, model2, modelP3, model_delete;
	private JTable table_rental, table_return, p3_tables;
	private JPanel panel_findbook;
	private JTextField findbook_tf, P1_TXTF;
	private JButton button_delete, b_findbook;
	private JTable delete_table;
	private List<Book> booksforRental, booksforReturn, booksforViewP3, booksforDelete;
	private JScrollPane rental_table_sc, return_table_sc, p3_sc, delete_table_sc;
	private JLabel P1_Label;
	private JPanel P_InputCenter;
	private JButton b_upload;
	private JTextPane textPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainUI frame = new MainUI();
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
			InputUI iu = null;
			if (iu != null)
				iu.dispose();
			iu = new InputUI();
		}

		if (e.getSource() == B_RENTAL) {
			if (table_rental.getSelectedRowCount() == 0) {
				JOptionPane.showMessageDialog(this, "대여할 책이 선택되지 않았습니다.");
			} else {
				int row = table_rental.getSelectedRow();
				String rental_date = (String) table_rental.getValueAt(row, 4);

				if (rental_date != null) { // 대여가 있으면 예약을 해야함
					JOptionPane.showMessageDialog(this, "대여가 불가능한 책이므로 예약 버튼을 눌러주세요.");
				} else {
					InputRentalUser inputUser = null;
					if (inputUser != null)
						inputUser.dispose();

					String bookname = (String) table_rental.getValueAt(row, 1);
					String book_id = (String) table_rental.getValueAt(row, 0);
					inputUser = new InputRentalUser(bookname, book_id, 1);
				}
			}
		}

		if (e.getSource() == B_RESERVE) {
			if (table_rental.getSelectedRowCount() == 0) {
				JOptionPane.showMessageDialog(this, "예약할 책이 선택되지 않았습니다.");
			} else {
				int row = table_rental.getSelectedRow();

				InputRentalUser inputUser = null;
				String rental_date = (String) table_rental.getValueAt(row, 4);
				String reserve_name = (String) table_rental.getValueAt(row, 5);

				if (rental_date != null && reserve_name == null) { // 대여가 없으면 예약이 아니라 대여를 해야함..
					if (inputUser != null)
						inputUser.dispose();
					String bookname = (String) table_rental.getValueAt(row, 1);
					String bookrental_id = (String) table_rental.getValueAt(row, 7);
					inputUser = new InputRentalUser(bookname, bookrental_id, 0);
				} else {
					JOptionPane.showMessageDialog(this, "대여가 가능하거나 예약자가 이미 있어 예약이 불가능합니다");
				}
			}
		}

		if (e.getSource() == button_delete || e.getSource() == P1_TXTF) {
			String bookname = P1_TXTF.getText();
			P2_DELETEMAIN.removeAll();
			delete_table = new JTable();
			if (model_delete != null)
				model_delete.setRowCount(0);
			booksforDelete = bd.findBook(bookname);

			if (booksforDelete != null) {
				int rows = booksforDelete.size();

				if (rows > 0) {
					Object[][] objs = new Object[rows][7];
					for (int i = 0; i < booksforDelete.size(); i++) {
						objs[i][0] = booksforDelete.get(i).getBook_id();
						objs[i][1] = booksforDelete.get(i).getTitle();
						objs[i][2] = booksforDelete.get(i).getPublisher();
						objs[i][3] = booksforDelete.get(i).getRental_name();
						objs[i][4] = booksforDelete.get(i).getReserve_name();
						objs[i][5] = booksforDelete.get(i).getOverdue();
					}

					model_delete = new DefaultTableModel(objs,
							new String[] { "book.NO", "도서제목", "출판사", "대여자명", "예약자명", "연체일자" });
					delete_table.setModel(model_delete);
					setVisible(true);
				} else {
					JOptionPane.showMessageDialog(this, "찾으시는 책이 존재하지 않습니다.");
				}
				delete_table_sc = new JScrollPane(delete_table);

				P2_DELETEMAIN.add(delete_table_sc);

				delete_table_sc.updateUI();
			} else {
				JOptionPane.showMessageDialog(this, "찾으시는 책이 존재하지 않습니다.");
			}

		} // 삭제쪽 검색

		if (e.getSource() == B_DELETE) {
			if (delete_table.getSelectedRowCount() == 0) {
				JOptionPane.showMessageDialog(this, "선택된 도서가 없습니다.\n 하나 이상 선택해 주세요.");

			} else {
				int row = delete_table.getSelectedRow();
				String book_id = (String) delete_table.getValueAt(row, 0);
				if (bd.deleteBook(book_id)) {
					JOptionPane.showMessageDialog(this, "삭제가 완료되었습니다.");
				} else {
					JOptionPane.showMessageDialog(this, "삭제실패", "에러", JOptionPane.ERROR_MESSAGE);
				}
			}
		} // 삭제

		if (e.getSource() == P1_RENTAL_BUTTON) {
			String bookname = P1_RETAL_TXTF.getText();
			P2_RENTALMAIN.removeAll();
			;
			table_rental = new JTable();
			if (model != null)
				model.setRowCount(0);
			booksforRental = bd.findBookForRent(bookname);
			if (booksforRental != null) {
				int rows = booksforRental.size();
				if (rows > 0) {
					Object[][] objs = new Object[rows][8];
					for (int i = 0; i < booksforRental.size(); i++) {
						objs[i][0] = booksforRental.get(i).getBook_id();
						objs[i][1] = booksforRental.get(i).getTitle();
						objs[i][2] = booksforRental.get(i).getPublisher();
						objs[i][3] = booksforRental.get(i).getRental_name();
						objs[i][4] = booksforRental.get(i).getRental_date();
						objs[i][5] = booksforRental.get(i).getReserve_name();
						objs[i][6] = booksforRental.get(i).getOverdue();
						objs[i][7] = booksforRental.get(i).getBookrental_id();
					}
					for (int i = 0; i < 8; i++) {
					}

					model = new DefaultTableModel(objs,
							new String[] { "book.NO", "도서제목", "출판사", "대여자명", "대여일시", "예약자명", "연체일자", "대여번호" });
					table_rental.setModel(model);
				} else {
					JOptionPane.showMessageDialog(this, "찾으시는 도서가  존재하지 않거나 대여 및 예약이 꽉 차있습니다.");
				}
				rental_table_sc = new JScrollPane(table_rental);

				P2_RENTALMAIN.add(rental_table_sc);
			} else {
				JOptionPane.showMessageDialog(this, "찾으시는 도서가  존재하지 않거나 대여 및 예약이 꽉 차있습니다.");
			}
		} // 대여버튼 이벤트 종료

		if (e.getSource() == P1_RETURN_find_BUTTON || e.getSource() == P1_RETURN_TXTF) {
			String username = P1_RETURN_TXTF.getText();
			P2_RETURN.removeAll();
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
							new String[] { "대여번호", "book.NO", "도서제목", "출판사", "대여자명", "대여일시", "예약자명", "연체일자" });
					table_return.setModel(model2);
				} else {
					JOptionPane.showMessageDialog(this, "해당 이용자는 현재 대여중인 책이 없습니다.");
				}
				return_table_sc = new JScrollPane(table_return);
				P2_RETURN.add(return_table_sc);
			} else {
				JOptionPane.showMessageDialog(this, "해당 이용자는 현재 대여중인 책이 없습니다.");
			}
		} // 반납조회 이벤트 종료

		if (e.getSource() == RETURN_BUTTON) {
			if (table_return.getSelectedRowCount() == 0) {
				JOptionPane.showMessageDialog(this, "선택된 도서가 없습니다.\n 하나 이상 선택해 주세요.");
			} else {
				int row = table_return.getSelectedRow();
				String bookRental_id = (String) table_return.getValueAt(row, 0);
				if (bd.updateReceiveDate(bookRental_id) && bd.removeRentalID(bookRental_id)) {
					JOptionPane.showMessageDialog(this, "반납이 완료되었습니다.");
				} else {
					JOptionPane.showMessageDialog(this, "반납실패", "에러", JOptionPane.ERROR_MESSAGE);
					;
				}

			}
		} // 반납버튼 이벤트 종료

		if (e.getSource() == NO3_Button3) {
			NO3_Panel2.removeAll();
			NO3_Panel2.validate();
			p3_tables = new JTable();
			if (modelP3 != null)
				modelP3.setRowCount(0);
			List<DBvo> overdueBooks = bd.findOverdueBook();

			if (overdueBooks != null) {
				int rows = overdueBooks.size();
				if (rows > 0) {
					Object[][] objs = new Object[rows][8];
					for (int i = 0; i < rows; i++) {
						objs[i][0] = overdueBooks.get(i).getTitle();
						objs[i][1] = overdueBooks.get(i).getPublisher();
						objs[i][2] = overdueBooks.get(i).getRental_date();
						objs[i][3] = overdueBooks.get(i).getOverdue();
						objs[i][4] = overdueBooks.get(i).getRental_name();
						objs[i][5] = overdueBooks.get(i).getRental_id();
						objs[i][6] = overdueBooks.get(i).getGisu();
						objs[i][7] = overdueBooks.get(i).getClassname();
					}
					modelP3 = new DefaultTableModel(objs,
							new String[] { "도서제목", "출판사", "대여일시", "연체일자", "대여자명", "대여자ID", "기수", "반" });
					p3_tables.setModel(modelP3);
				} else {
					JOptionPane.showMessageDialog(this, "현재 연체중인 책이 없습니다.");
				}
				p3_sc = new JScrollPane(p3_tables);
				NO3_Panel2.add(p3_sc);
			} else {
				JOptionPane.showMessageDialog(this, "현재 연체중인 책이 없습니다.");
			}
		} // 버튼 3 연체정보 출력

		if (e.getSource() == NO3_Button4) {
			NO3_Panel2.removeAll();
			NO3_Panel2.validate();

			if (panel_findbook == null) {
				panel_findbook = new JPanel();
				panel_findbook.add(new JLabel("도서제목"));
				findbook_tf = new JTextField(20);
				panel_findbook.add(findbook_tf);
				b_findbook = new JButton("검색");
				b_findbook.addActionListener(this);
				panel_findbook.add(b_findbook);

				NO3_Panel2.add(panel_findbook, BorderLayout.NORTH);
			} else {
				NO3_Panel2.add(panel_findbook, BorderLayout.NORTH);
				NO3_Panel2.setVisible(true);
			}
		} // 버튼 4 검색창 띄우기

		if (e.getSource() == b_findbook) {
			String bookname = findbook_tf.getText();
			p3_tables = new JTable();
			if (modelP3 != null)
				modelP3.setRowCount(0);
			booksforViewP3 = bd.findBook(bookname);

			if (booksforViewP3 != null) {
				int rows = booksforViewP3.size();
				if (rows > 0) {
					Object[][] objs = new Object[rows][7];
					for (int i = 0; i < rows; i++) {
						objs[i][0] = booksforViewP3.get(i).getBook_id();
						objs[i][1] = booksforViewP3.get(i).getTitle();
						objs[i][2] = booksforViewP3.get(i).getPublisher();
						objs[i][3] = booksforViewP3.get(i).getRental_name();
						objs[i][4] = booksforViewP3.get(i).getRental_date();
						objs[i][5] = booksforViewP3.get(i).getReserve_name();
						objs[i][6] = booksforViewP3.get(i).getOverdue();
					}

					modelP3 = new DefaultTableModel(objs,
							new String[] { "book.NO", "도서제목", "출판사", "대여자명", "대여일시", "예약자명", "연체일자" });
					p3_tables.setModel(modelP3);
				} else {
					JOptionPane.showMessageDialog(this, "해당 도서가 존재하지 않습니다.");
				}
				p3_sc = new JScrollPane(p3_tables);
				NO3_Panel2.add(p3_sc, BorderLayout.CENTER);
			} else {
				JOptionPane.showMessageDialog(this, "해당 도서가 존재하지 않습니다.");
			}

		} // 4번째 버튼 누른 후 책 검색버튼 이벤트

		if (e.getSource() == b_upload) {
			ArrayList<Book> bookList = new ArrayList<>();

			JFileChooser file_upload = new JFileChooser();
			file_upload.showOpenDialog(this);
			File file = file_upload.getSelectedFile();
			if (file != null) {
				try {
					// 엑셀파일 워크북 객체 생성
					Workbook workbook = Workbook.getWorkbook(file);

					// 시트 지정
					Sheet sheet = workbook.getSheet(0);

					// 행 길이
					int endIdx = sheet.getColumn(1).length - 1;

					for (int i = 1; i <= endIdx; i++) {
						Book book = new Book();
						book.setTitle(sheet.getCell(0, i).getContents());
						book.setPublisher(sheet.getCell(1, i).getContents());
						bookList.add(book);
					}
					boolean result = false;
					int count_insertNum = 0;
					for (Book b : bookList) {
						result = bd.insertBook(b);
						if (result == false) {
							break;
						}
						count_insertNum++;
					}
					if (result) { //
						JOptionPane.showMessageDialog(this, "신규도서목록" + endIdx + "개 삽입성공");
					} else {
						JOptionPane.showMessageDialog(this,
								endIdx + " 개 행 중에 " + count_insertNum + "개만 삽입되었습니다. 나머지 행은 삽입 실패!");
					}

				} catch (Exception e2) {
					e2.printStackTrace();
				}// 캐치문 종료 
			}// if 문 종료 
		}

	}
}