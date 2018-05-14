package management.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
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
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JTable;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import java.awt.Dimension;
import java.awt.Font;

public class MainUI extends JFrame implements ActionListener {
	public MainUI() {
		setFont(new Font("Tahoma", Font.BOLD, 12));
		setSize(new Dimension(940, 460));
		setTitle("SCIT \uB3C4\uC11C\uAD00\uB9AC\uD504\uB85C\uADF8\uB7A8");
		
		P_NAME = new JPanel();
		getContentPane().add(P_NAME, BorderLayout.NORTH);
		
		P_Panel = new JLabel("SCIT \uB3C4\uC11C\uAD00\uB9AC\uD504\uB85C\uADF8\uB7A8");
		P_NAME.add(P_Panel);
		
		P_Bottom = new JPanel();
		getContentPane().add(P_Bottom, BorderLayout.SOUTH);
		
		Bottom_Button = new JButton("\uC2DC\uC2A4\uD15C \uC885\uB8CC");
		P_Bottom.add(Bottom_Button);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JP_NO1 = new JPanel();
		tabbedPane.addTab("INTRO", null, JP_NO1, null);
		JP_NO1.setLayout(new BorderLayout(0, 0));
		
		NO1_Panel = new JPanel();
		JP_NO1.add(NO1_Panel, BorderLayout.CENTER);
		NO1_Panel.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		NO1_Panel.add(panel, BorderLayout.NORTH);
		
		lblNewLabel_4 = new JLabel("SC IT \uB3C4\uC11C\uAD00\uB9AC\uC2DC\uC2A4\uD15C\uC744 \uC774\uC6A9\uD574 \uC8FC\uC154\uC11C \uAC10\uC0AC\uD569\uB2C8\uB2E4!");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_4);
		
		panel_9 = new JPanel();
		NO1_Panel.add(panel_9, BorderLayout.CENTER);
		panel_9.setLayout(new GridLayout(1, 0, 0, 0));
		
		panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_9.add(panel_10);
		
		textPane_1 = new JTextPane();
		textPane_1.setText("      \uB3C4\uC11C\uAD00\uB9AC\r\n\r\n1. \uC2E0\uADDC \uB3C4\uC11C \uB4F1\uB85D\r\n2. \uD3D0\uAE30 \uB3C4\uC11C \uC0AD\uC81C");
		panel_10.add(textPane_1);
		
		panel_11 = new JPanel();
		panel_11.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		panel_9.add(panel_11);
		
		textPane = new JTextPane();
		textPane.setText("      \uB3C4\uC11C\uBAA9\uB85D \uCD9C\uB825\r\n\r\n   1. \uB3C4\uC11C\uC815\uBCF4 \uCD9C\uB825\r\n2. \uB300\uCD9C\uC911\uC778 \uB3C4\uC11C \uC815\uBCF4\r\n 3. \uC5F0\uC81C\uC911\uC778 \uB3C4\uC11C\uC815\uBCF4");
		panel_11.add(textPane);
		
		panel_12 = new JPanel();
		panel_12.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		panel_9.add(panel_12);
		
		textPane_2 = new JTextPane();
		textPane_2.setText("\uB300\uCD9C\uAD00\uB9AC\r\n\r\n 1. \uB300\uC5EC\r\n 2. \uBC18\uB0A9");
		panel_12.add(textPane_2);
		
		JP_NO2 = new JPanel();
		tabbedPane.addTab("\uB3C4\uC11C\uAD00\uB9AC", null, JP_NO2, null);
		JP_NO2.setLayout(new GridLayout(1, 0, 0, 0));
		
		NO2_Panel = new JPanel();
		NO2_Panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		JP_NO2.add(NO2_Panel);
		NO2_Panel.setLayout(new BorderLayout(0, 0));
		
		NO2p_Label = new JLabel("\uC2E0\uADDC \uB3C4\uC11C \uB4F1\uB85D");
		NO2p_Label.setHorizontalAlignment(SwingConstants.CENTER);
		NO2_Panel.add(NO2p_Label, BorderLayout.NORTH);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(1, 0, 0, 0, (Color) new Color(0, 0, 0)));
		NO2_Panel.add(panel_1, BorderLayout.CENTER);
		
		NO2p_Button1 = new JButton("\uC5D1\uC140\uD30C\uC77C\uC5C5\uB85C\uB4DC");
		NO2p_Button1.setForeground(Color.BLACK);
		panel_1.add(NO2p_Button1);
		
		btnNewButton_1 = new JButton("\uC9C1\uC811 \uC785\uB825");
		panel_1.add(btnNewButton_1);
		
		NO2_Panel2 = new JPanel();
		NO2_Panel2.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		JP_NO2.add(NO2_Panel2);
		NO2_Panel2.setLayout(new BorderLayout(0, 0));
		
		NO2p_Panel1 = new JPanel();
		NO2p_Panel1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		NO2p_Panel1.setForeground(Color.BLACK);
		NO2_Panel2.add(NO2p_Panel1, BorderLayout.NORTH);
		
		P1_Label = new JLabel("\uB3C4\uC11C\uC0AD\uC81C");
		NO2p_Panel1.add(P1_Label);
		
		NO2p_Panel2 = new JPanel();
		NO2_Panel2.add(NO2p_Panel2, BorderLayout.SOUTH);
		
		P2_Button = new JButton("\uC0AD\uC81C");
		NO2p_Panel2.add(P2_Button);
		
		NO2p_Panel3 = new JPanel();
		NO2_Panel2.add(NO2p_Panel3, BorderLayout.CENTER);
		NO2p_Panel3.setLayout(new GridLayout(2, 0, 0, 0));
		
		P3_Panel2 = new JPanel();
		NO2p_Panel3.add(P3_Panel2);
		P3_Panel2.setLayout(new GridLayout(1, 0, 0, 0));
		
		P2_Label1 = new JLabel("\uB3C4\uC11C\uC81C\uBAA9");
		P2_Label1.setHorizontalAlignment(SwingConstants.CENTER);
		P3_Panel2.add(P2_Label1);
		
		P2_TextField = new JTextField();
		P3_Panel2.add(P2_TextField);
		P2_TextField.setColumns(10);
		
		P2_Button1 = new JButton("\uAC80\uC0C9");
		P3_Panel2.add(P2_Button1);
		
		P3_Panel3 = new JPanel();
		NO2p_Panel3.add(P3_Panel3);
		P3_Panel3.setLayout(new BorderLayout(0, 0));
		
		table_3 = new JTable();
		P3_Panel3.add(table_3, BorderLayout.CENTER);
		
		JP_NO3 = new JPanel();
		tabbedPane.addTab("\uB3C4\uC11C\uBAA9\uB85D\uCD9C\uB825", null, JP_NO3, null);
		JP_NO3.setLayout(new BorderLayout(0, 0));
		
		NO3_Panel = new JPanel();
		NO3_Panel.setBorder(new MatteBorder(1, 1, 0, 1, (Color) new Color(0, 0, 0)));
		JP_NO3.add(NO3_Panel, BorderLayout.NORTH);
		
		NO3_Button1 = new JButton("\uC804\uCCB4 \uB3C4\uC11C \uCD9C\uB825");
		NO3_Panel.add(NO3_Button1);
		
		NO3_Button2 = new JButton("\uB300\uC5EC\uC911\uC778 \uB3C4\uC11C\uBAA9\uB85D");
		NO3_Panel.add(NO3_Button2);
		
		NO3_Button3 = new JButton("\uC5F0\uCCB4\uC911\uC778 \uB3C4\uC11C\uBAA9\uB85D");
		NO3_Panel.add(NO3_Button3);
		
		NO3_Button4 = new JButton("\uB3C4\uC11C\uC815\uBCF4\uAC80\uC0C9");
		NO3_Panel.add(NO3_Button4);
		
		NO3_Panel2 = new JPanel();
		JP_NO3.add(NO3_Panel2, BorderLayout.CENTER);
		NO3_Panel2.setLayout(new BorderLayout(0, 0));
		
		table_2 = new JTable();
		table_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		NO3_Panel2.add(table_2, BorderLayout.CENTER);
		
		JP_NO4 = new JPanel();
		tabbedPane.addTab("\uB300\uCD9C\uAD00\uB9AC", null, JP_NO4, null);
		JP_NO4.setLayout(new GridLayout(1, 0, 0, 0));
		
		NO4_Panel = new JPanel();
		NO4_Panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		JP_NO4.add(NO4_Panel);
		NO4_Panel.setLayout(new BorderLayout(0, 0));
		
		NO4P_Panel1 = new JPanel();
		NO4P_Panel1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		NO4_Panel.add(NO4P_Panel1, BorderLayout.NORTH);
		NO4P_Panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblNewLabel = new JLabel("\uB300\uC5EC");
		NO4P_Panel1.add(lblNewLabel);
		
		NO4P_Panel2 = new JPanel();
		NO4_Panel.add(NO4P_Panel2, BorderLayout.SOUTH);
		NO4P_Panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnNewButton = new JButton("\uB300\uC5EC");
		NO4P_Panel2.add(btnNewButton);
		
		btnNewButton_2 = new JButton("\uC608\uC57D");
		NO4P_Panel2.add(btnNewButton_2);
		
		NO4P_Panel3 = new JPanel();
		NO4_Panel.add(NO4P_Panel3, BorderLayout.CENTER);
		NO4P_Panel3.setLayout(new GridLayout(2, 0, 0, 0));
		
		panel_5 = new JPanel();
		NO4P_Panel3.add(panel_5);
		panel_5.setLayout(new GridLayout(1, 0, 0, 0));
		
		lblNewLabel_1 = new JLabel("\uB3C4\uC11C\uC81C\uBAA9");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblNewLabel_1);
		
		textField = new JTextField();
		panel_5.add(textField);
		textField.setColumns(10);
		
		btnNewButton_3 = new JButton("\uAC80\uC0C9");
		panel_5.add(btnNewButton_3);
		
		panel_6 = new JPanel();
		NO4P_Panel3.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		table_1 = new JTable();
		table_1.setBorder(new MatteBorder(1, 0, 1, 0, (Color) new Color(0, 0, 0)));
		panel_6.add(table_1, BorderLayout.CENTER);
		
		NO4_Panel2 = new JPanel();
		NO4_Panel2.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		JP_NO4.add(NO4_Panel2);
		NO4_Panel2.setLayout(new BorderLayout(0, 0));
		
		panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		NO4_Panel2.add(panel_2, BorderLayout.NORTH);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblNewLabel_2 = new JLabel("\uBC18\uB0A9");
		panel_2.add(lblNewLabel_2);
		
		panel_3 = new JPanel();
		NO4_Panel2.add(panel_3, BorderLayout.SOUTH);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnNewButton_4 = new JButton("\uBC18\uB0A9");
		panel_3.add(btnNewButton_4);
		
		panel_4 = new JPanel();
		NO4_Panel2.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new GridLayout(2, 0, 0, 0));
		
		panel_7 = new JPanel();
		panel_4.add(panel_7);
		panel_7.setLayout(new GridLayout(1, 0, 0, 0));
		
		lblNewLabel_3 = new JLabel("\uB3C4\uC11C\uC81C\uBAA9");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_7.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		panel_7.add(textField_1);
		textField_1.setColumns(10);
		
		btnNewButton_5 = new JButton("\uAC80\uC0C9");
		panel_7.add(btnNewButton_5);
		
		panel_8 = new JPanel();
		panel_4.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		table = new JTable();
		table.setBorder(new MatteBorder(1, 0, 1, 0, (Color) new Color(0, 0, 0)));
		panel_8.add(table, BorderLayout.CENTER);
		
		setVisible(true);
	}

	private JPanel contentPane;
	private JPanel P_NAME;
	private JLabel P_Panel;
	private JPanel P_Bottom;
	private JButton Bottom_Button;
	private JTabbedPane tabbedPane;
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
	private JPanel panel_1;
	private JButton NO2p_Button1;
	private JButton btnNewButton_1;
	private JPanel NO2p_Panel1;
	private JPanel NO2p_Panel2;
	private JPanel NO2p_Panel3;
	private JButton P2_Button;
	private JLabel P1_Label;
	private JPanel P3_Panel2;
	private JPanel P3_Panel3;
	private JLabel P2_Label1;
	private JTextField P2_TextField;
	private JButton P2_Button1;
	private JPanel NO4P_Panel1;
	private JPanel NO4P_Panel2;
	private JPanel NO4P_Panel3;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JButton btnNewButton_2;
	private JPanel panel_5;
	private JPanel panel_6;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JButton btnNewButton_3;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_7;
	private JPanel panel_8;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton_4;
	private JLabel lblNewLabel_3;
	private JTextField textField_1;
	private JButton btnNewButton_5;
	private JTable table;
	private JTable table_1;
	private JPanel NO3_Panel2;
	private JTable table_2;
	private JPanel panel;
	private JPanel panel_9;
	private JPanel panel_10;
	private JPanel panel_11;
	private JPanel panel_12;
	private JLabel lblNewLabel_4;
	private JTextPane textPane;
	private JTextPane textPane_1;
	private JTextPane textPane_2;
	private JTable table_3;

	
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
		
	}
}
