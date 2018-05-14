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

public class MainUI extends JFrame {
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
		JP_NO2.setLayout(new BorderLayout(0, 0));
		
		splitPane = new JSplitPane();
		JP_NO2.add(splitPane, BorderLayout.CENTER);
		
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
		tabbedPane.addTab("\uB300\uC5EC/\uBC18\uB0A9", null, JP_NO4, null);
		JP_NO4.setLayout(new BorderLayout(0, 0));
		
		JSplitPane splitPane_1 = new JSplitPane();
		splitPane_1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		JP_NO4.add(splitPane_1, BorderLayout.CENTER);
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
	private JSplitPane splitPane;
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


}
