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

public class MainUI extends JFrame {

	private JPanel contentPane;

	
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

	/**
	 * Create the frame.
	 */
	public MainUI() {
		setTitle("SC IT \uB3C4\uC11C \uAD00\uB9AC \uD504\uB85C\uADF8\uB7A8");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 927, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel P_NAME = new JPanel();
		contentPane.add(P_NAME);
		
		JLabel P_label = new JLabel("SC IT \uB3C4\uC11C \uAD00\uB9AC \uD504\uB85C\uADF8\uB7A8");
		P_NAME.add(P_label);
		
		JPanel P_BOTTOM = new JPanel();
		contentPane.add(P_BOTTOM);
		
		JButton btnNewButton = new JButton("\uC2DC\uC2A4\uD15C \uC885\uB8CC");
		P_BOTTOM.add(btnNewButton);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane);
		
		JPanel JP_NO1 = new JPanel();
		JP_NO1.setToolTipText("");
		tabbedPane.addTab("INTRO", null, JP_NO1, null);
		JP_NO1.setLayout(new BorderLayout(0, 0));
		
		JLabel NO1_Label = new JLabel("SC IT \uB3C4\uC11C \uAD00\uB9AC \uC2DC\uC2A4\uD15C\uC744 \uC774\uC6A9\uD574\uC8FC\uC154\uC11C \uAC10\uC0AC\uD569\uB2C8\uB2E4!");
		NO1_Label.setHorizontalAlignment(SwingConstants.CENTER);
		JP_NO1.add(NO1_Label, BorderLayout.NORTH);
		
		JPanel NO1_Panel = new JPanel();
		JP_NO1.add(NO1_Panel, BorderLayout.CENTER);
		NO1_Panel.setLayout(new BorderLayout(0, 0));
		
		JLabel NO1_Label1 = new JLabel("\uB3C4\uC11C\uAD00\uB9AC");
		NO1_Label1.setHorizontalAlignment(SwingConstants.CENTER);
		NO1_Panel.add(NO1_Label1, BorderLayout.WEST);
		
		JLabel NO1_Label2 = new JLabel("\uB3C4\uC11C\uBAA9\uB85D \uCD9C\uB825");
		NO1_Label2.setHorizontalAlignment(SwingConstants.CENTER);
		NO1_Label2.setToolTipText("");
		NO1_Panel.add(NO1_Label2, BorderLayout.CENTER);
		
		JLabel NO1_Label3 = new JLabel("\uB300\uCD9C\uAD00\uB9AC");
		NO1_Label3.setHorizontalAlignment(SwingConstants.CENTER);
		NO1_Panel.add(NO1_Label3, BorderLayout.EAST);
	}

}
