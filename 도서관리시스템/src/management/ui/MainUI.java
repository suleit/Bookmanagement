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
import java.util.List;

import javax.swing.JButton;
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
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

import management.userDAO.BookDao;
import management.userDAO.BookMapper;
import management.vo.Book;
import management.vo.DBvo;

public class MainUI extends JFrame implements ActionListener {
	public MainUI() {

		setFont(new Font("Tahoma", Font.BOLD, 12));
		setSize(new Dimension(1500, 900));
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

		INTRO_LABEL = new JLabel("<html>SC IT ���������ý����� �̿����ּż� �����մϴ�!<br>�뿩�Ⱓ�� 7���Դϴ�.<br></html>");
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

		button = new JButton("\uAC80\uC0C9");
		P1_DELETEMAIN.add(button);
		button.addActionListener(this);
		button.setAlignmentX(10.0f);
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

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				System.out.println("â�� ���Ƚ��ϴ�.");
				boolean result = bd.updateOverdue();
				boolean result2 = bd.updateHistoryOverdue();
				System.out.println(result);
				System.out.println(result2);
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
	private JPanel REGISTER_MAIN;
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
	private JTextPane MANAGEMENT_TXT;
	private JTextPane RENTAL_TXT;
	private JPanel panel;

	private BookDao bd = new BookDao();
	private DefaultTableModel model, model2, modelP3, model_delete;
	private JTable table_rental, table_return, p3_tables;

	private JPanel panel_findbook;
	private JTextField findbook_tf, P1_TXTF;
	private JButton button, b_findbook;
	private JTable delete_table;// �߰�...
	private List<Book> booksforRental, booksforReturn, booksforViewP3, booksforDelete;
	private JScrollPane rental_table_sc, return_table_sc, p3_sc, delete_table_sc;
	private JLabel P1_Label;

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
		if (e.getActionCommand().equals("�ý��� ����")) {
			int result = JOptionPane.showConfirmDialog(null, "������ �����Ͻðڽ��ϱ�?", "�ý��� ����", JOptionPane.YES_NO_OPTION);
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
				JOptionPane.showMessageDialog(this, "�뿩�� å�� ���õ��� �ʾҽ��ϴ�.");
			} else {
				int row = table_rental.getSelectedRow();
				String rental_date = (String) table_rental.getValueAt(row, 4);
				System.out.println(rental_date);

				if (rental_date != null) { // �뿩�� ������ ������ �ؾ���
					JOptionPane.showMessageDialog(this, "�뿩�� �Ұ����� å�̹Ƿ� ���� ��ư�� �����ּ���.");
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
				JOptionPane.showMessageDialog(this, "������ å�� ���õ��� �ʾҽ��ϴ�.");
			} else {
				int row = table_rental.getSelectedRow();
				InputRentalUser inputUser = null;
				String rental_date = (String) table_rental.getValueAt(row, 4);
				System.out.println(rental_date);

				if (rental_date == null) { // �뿩�� ������ ������ �ƴ϶� �뿩�� �ؾ���..
					JOptionPane.showMessageDialog(this, "�뿩�� ������ å�̹Ƿ� �뿩 ��ư�� �����ּ���.");
				} else {
					if (inputUser != null)
						inputUser.dispose();
					String bookname = (String) table_rental.getValueAt(row, 1);
					String bookrental_id = (String) table_rental.getValueAt(row, 7);
					inputUser = new InputRentalUser(bookname, bookrental_id, 0);
				}

			}
		}

		if (e.getSource() == button || e.getSource() == P1_TXTF) {
			String bookname = P1_TXTF.getText();
			P2_DELETEMAIN.removeAll();
			delete_table = new JTable();
			if (model_delete != null)
				model_delete.setRowCount(0);
			booksforDelete = bd.findBook(bookname);
			System.out.println(booksforDelete);
			
			if (booksforDelete != null) {
				int rows = booksforDelete.size();
				
				System.out.println(rows);
				
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
							new String[] { "book.NO", "��������", "���ǻ�", "�뿩�ڸ�", "�����ڸ�", "��ü����" });
					delete_table.setModel(model_delete);
				} else {
					JOptionPane.showMessageDialog(this, "ã���ô� å�� �������� �ʽ��ϴ�.");
				}
				delete_table_sc = new JScrollPane(delete_table);

				P2_DELETEMAIN.add(delete_table_sc);
				delete_table.updateUI();
				delete_table_sc.updateUI();
			} else {
				JOptionPane.showMessageDialog(this, "ã���ô� å�� �������� �ʽ��ϴ�.");
			}

		} // ������ �˻�

		if (e.getSource() == B_DELETE) {
			if (delete_table.getSelectedRowCount() == 0) {
				JOptionPane.showMessageDialog(this, "���õ� ������ �����ϴ�.\n �ϳ� �̻� ������ �ּ���.");

			} else {
				int row = delete_table.getSelectedRow();
				String book_id = (String) delete_table.getValueAt(row, 0);
				if (bd.deleteBook(book_id)) {
					JOptionPane.showMessageDialog(this, "������ �Ϸ�Ǿ����ϴ�.");
				} else {
					JOptionPane.showMessageDialog(this, "��������", "����", JOptionPane.ERROR_MESSAGE);
				}
			}
		} // ����

		if (e.getSource() == P1_RENTAL_BUTTON || e.getSource() == P1_RETAL_TXTF) {
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

					model = new DefaultTableModel(objs,
							new String[] { "book.NO", "��������", "���ǻ�", "�뿩�ڸ�", "�뿩�Ͻ�", "�����ڸ�", "��ü����", "�뿩��ȣ" });
					table_rental.setModel(model);
				}else {
					JOptionPane.showMessageDialog(this, "ã���ô� ������  �������� �ʰų� �뿩 �� ������ �� ���ֽ��ϴ�.");
				}
				rental_table_sc = new JScrollPane(table_rental);

				P2_RENTALMAIN.add(rental_table_sc);
			} else {
				JOptionPane.showMessageDialog(this, "ã���ô� ������  �������� �ʰų� �뿩 �� ������ �� ���ֽ��ϴ�.");
			}
		} // �뿩��ư �̺�Ʈ ����

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
							new String[] { "�뿩��ȣ", "book.NO", "��������", "���ǻ�", "�뿩�ڸ�", "�뿩�Ͻ�", "�����ڸ�", "��ü����" });
					table_return.setModel(model2);
				} else {
					JOptionPane.showMessageDialog(this, "�ش� �̿��ڴ� ���� �뿩���� å�� �����ϴ�.");
				}
				return_table_sc = new JScrollPane(table_return);
				P2_RETURN.add(return_table_sc);
			} else {
				JOptionPane.showMessageDialog(this, "�ش� �̿��ڴ� ���� �뿩���� å�� �����ϴ�.");
			}
		} // �ݳ���ȸ �̺�Ʈ ����

		if (e.getSource() == RETURN_BUTTON) {
			if (table_return.getSelectedRowCount() == 0) {
				JOptionPane.showMessageDialog(this, "���õ� ������ �����ϴ�.\n �ϳ� �̻� ������ �ּ���.");
			} else {
				int row = table_return.getSelectedRow();
				String bookRental_id = (String) table_return.getValueAt(row, 0);
				if (bd.updateReceiveDate(bookRental_id) && bd.deleteBookRental(bookRental_id)) {
					JOptionPane.showMessageDialog(this, "�ݳ��� �Ϸ�Ǿ����ϴ�.");
				} else {
					JOptionPane.showMessageDialog(this, "�ݳ�����", "����", JOptionPane.ERROR_MESSAGE);
					;
				}

			}
		} // �ݳ���ư �̺�Ʈ ����

		if (e.getSource() == NO3_Button1) {
			if (p3_tables != null || panel_findbook != null) {
				NO3_Panel2.removeAll();
			}
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
					modelP3 = new DefaultTableModel(objs, new String[] { "book.NO", "��������", "���ǻ�" });
					p3_tables.setModel(modelP3);
				}
				p3_sc = new JScrollPane(p3_tables);
				NO3_Panel2.add(p3_sc);
			}
		} // ��ư 1=��ü�������� ��� �Ϸ�
		if (e.getSource() == NO3_Button2) {
			if (p3_tables != null || panel_findbook != null) {
				NO3_Panel2.removeAll();
				;
			}
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
							new String[] { "�뿩��ȣ", "book.NO", "��������", "���ǻ�", "�뿩�ڸ�", "�뿩�Ͻ�", "�����ڸ�", "��ü����" });
					p3_tables.setModel(modelP3);
				}
				p3_sc = new JScrollPane(p3_tables);
				NO3_Panel2.add(p3_sc);
			}
		} // ��ư2= �뿩���� �������� ��� �ڵ�

		if (e.getSource() == NO3_Button3) {
			if (p3_tables != null || panel_findbook != null) {
				NO3_Panel2.removeAll();
			}
			p3_tables = new JTable();
			if (modelP3 != null)
				modelP3.setRowCount(0);
			List<DBvo> overdueBooks = bd.findOverdueBook();

			if (booksforViewP3 != null) {
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
							new String[] { "��������", "���ǻ�", "�뿩�Ͻ�", "��ü����", "�뿩�ڸ�", "�뿩��ID", "���", "��" });
					p3_tables.setModel(modelP3);
				} else {
					JOptionPane.showMessageDialog(this, "���� ��ü���� å�� �����ϴ�.");
				}
				p3_sc = new JScrollPane(p3_tables);
				NO3_Panel2.add(p3_sc);
			} else {
				JOptionPane.showMessageDialog(this, "���� ��ü���� å�� �����ϴ�.");
			}
		} // ��ư 3 ��ü���� ���

		if (e.getSource() == NO3_Button4) {
			NO3_Panel2.removeAll();

			if (panel_findbook == null) {
				panel_findbook = new JPanel();
				panel_findbook.add(new JLabel("��������"));
				findbook_tf = new JTextField(20);
				panel_findbook.add(findbook_tf);
				b_findbook = new JButton("�˻�");
				b_findbook.addActionListener(this);
				panel_findbook.add(b_findbook);

				NO3_Panel2.add(panel_findbook, BorderLayout.NORTH);
			} else {
				NO3_Panel2.add(panel_findbook, BorderLayout.NORTH);
			}
		} // ��ư 4 �˻�â ����

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
							new String[] { "book.NO", "��������", "���ǻ�", "�뿩�ڸ�", "�뿩�Ͻ�", "�����ڸ�", "��ü����" });
					p3_tables.setModel(modelP3);
				}
				p3_sc = new JScrollPane(p3_tables);
				NO3_Panel2.add(p3_sc, BorderLayout.CENTER);
			} // 4��° ��ư ���� �� å �˻���ư �̺�Ʈ

		}

	}

}
