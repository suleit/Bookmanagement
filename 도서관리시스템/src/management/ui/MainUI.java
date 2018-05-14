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

public class MainUI extends JFrame implements ActionListener {
	public MainUI() {
		
		P_NAME = new JPanel();
		getContentPane().add(P_NAME, BorderLayout.NORTH);
		
		P_Panel = new JLabel("SCIT \uB3C4\uC11C\uAD00\uB9AC\uD504\uB85C\uADF8\uB7A8");
		P_NAME.add(P_Panel);
		
		P_Bottom = new JPanel();
		getContentPane().add(P_Bottom, BorderLayout.SOUTH);
		
		panel = new JPanel();
		P_Bottom.add(panel);
		
		Bottom_Button = new JButton("\uC2DC\uC2A4\uD15C \uC885\uB8CC");
		P_Bottom.add(Bottom_Button);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JP_NO1 = new JPanel();
		tabbedPane.addTab("INTRO", null, JP_NO1, null);
		JP_NO1.setLayout(new BorderLayout(0, 0));
		
		NO1_Panel = new JPanel();
		JP_NO1.add(NO1_Panel, BorderLayout.CENTER);
		NO1_Panel.setLayout(new BorderLayout(0, 0));
		
		NO1_Label1 = new JLabel("\uB3C4\uC11C\uAD00\uB9AC");
		NO1_Label1.setHorizontalAlignment(SwingConstants.CENTER);
		NO1_Panel.add(NO1_Label1, BorderLayout.WEST);
		
		NO1_Label2 = new JLabel("\uB3C4\uC11C\uBAA9\uB85D \uCD9C\uB825");
		NO1_Label2.setHorizontalAlignment(SwingConstants.CENTER);
		NO1_Panel.add(NO1_Label2, BorderLayout.CENTER);
		
		NO1_Label3 = new JLabel("\uB300\uCD9C\uAD00\uB9AC");
		NO1_Label3.setHorizontalAlignment(SwingConstants.CENTER);
		NO1_Panel.add(NO1_Label3, BorderLayout.EAST);
		
		NO1_Label4 = new JLabel("SC IT \uB3C4\uC11C \uAD00\uB9AC \uD504\uB85C\uADF8\uB7A8\uC744 \uC774\uC6A9\uD574\uC8FC\uC154\uC11C \uAC10\uC0AC\uD569\uB2C8\uB2E4!");
		NO1_Label4.setHorizontalAlignment(SwingConstants.CENTER);
		NO1_Panel.add(NO1_Label4, BorderLayout.NORTH);
		
		JP_NO2 = new JPanel();
		tabbedPane.addTab("\uB3C4\uC11C\uAD00\uB9AC", null, JP_NO2, null);
		JP_NO2.setLayout(new GridLayout(1, 0, 0, 0));
		
		NO2_Panel = new JPanel();
		JP_NO2.add(NO2_Panel);
		NO2_Panel.setLayout(new BorderLayout(0, 0));
		
		NO2p_Label = new JLabel("\uC2E0\uADDC \uB3C4\uC11C \uB4F1\uB85D");
		NO2p_Label.setHorizontalAlignment(SwingConstants.CENTER);
		NO2_Panel.add(NO2p_Label, BorderLayout.NORTH);
		
		panel_1 = new JPanel();
		NO2_Panel.add(panel_1, BorderLayout.CENTER);
		
		NO2p_Button1 = new JButton("\uC5D1\uC140\uD30C\uC77C\uC5C5\uB85C\uB4DC");
		panel_1.add(NO2p_Button1);
		
		btnNewButton_1 = new JButton("\uC9C1\uC811 \uC785\uB825");
		panel_1.add(btnNewButton_1);
		
		NO2_Panel2 = new JPanel();
		JP_NO2.add(NO2_Panel2);
		NO2_Panel2.setLayout(new BorderLayout(0, 0));
		
		NO2p_Panel1 = new JPanel();
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
		
		P3_TextArea = new JTextArea();
		P3_Panel3.add(P3_TextArea, BorderLayout.CENTER);
		
		JP_NO3 = new JPanel();
		tabbedPane.addTab("\uB3C4\uC11C\uBAA9\uB85D\uCD9C\uB825", null, JP_NO3, null);
		JP_NO3.setLayout(new BorderLayout(0, 0));
		
		NO3_Panel = new JPanel();
		JP_NO3.add(NO3_Panel, BorderLayout.NORTH);
		
		NO3_Button1 = new JButton("\uC804\uCCB4 \uB3C4\uC11C \uCD9C\uB825");
		NO3_Panel.add(NO3_Button1);
		
		NO3_Button2 = new JButton("\uB300\uC5EC\uC911\uC778 \uB3C4\uC11C\uBAA9\uB85D");
		NO3_Panel.add(NO3_Button2);
		
		NO3_Button3 = new JButton("\uC5F0\uCCB4\uC911\uC778 \uB3C4\uC11C\uBAA9\uB85D");
		NO3_Panel.add(NO3_Button3);
		
		NO3_Button4 = new JButton("\uB3C4\uC11C\uC815\uBCF4\uAC80\uC0C9");
		NO3_Panel.add(NO3_Button4);
		
		NO3_Scroll = new JScrollPane();
		JP_NO3.add(NO3_Scroll, BorderLayout.CENTER);
		
		txtrDsdasdsad = new JTextArea();
		NO3_Scroll.setViewportView(txtrDsdasdsad);
		
		JP_NO4 = new JPanel();
		tabbedPane.addTab("\uB300\uCD9C\uAD00\uB9AC", null, JP_NO4, null);
		JP_NO4.setLayout(new GridLayout(1, 0, 0, 0));
		
		NO4_Panel = new JPanel();
		JP_NO4.add(NO4_Panel);
		
		NO4_Panel2 = new JPanel();
		JP_NO4.add(NO4_Panel2);
	}

	private JPanel contentPane;
	private JPanel P_NAME;
	private JLabel P_Panel;
	private JPanel P_Bottom;
	private JButton Bottom_Button;
	private JTabbedPane tabbedPane;
	private JPanel JP_NO1;
	private JPanel NO1_Panel;
	private JLabel NO1_Label1;
	private JLabel NO1_Label2;
	private JLabel NO1_Label3;
	private JLabel NO1_Label4;
	private JPanel JP_NO2;
	private JPanel JP_NO3;
	private JPanel NO3_Panel;
	private JButton NO3_Button1;
	private JButton NO3_Button2;
	private JButton NO3_Button3;
	private JButton NO3_Button4;
	private JScrollPane NO3_Scroll;
	private JTextArea txtrDsdasdsad;
	private JPanel panel;
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
	private JTextArea P3_TextArea;

	
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
