package RobotInspectorAPP;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bumpers {

	JFrame frame;
	static JCheckBox chckbxNewCheckBox;
	static JCheckBox chckbxHardBumperParts;
	static JCheckBox chckbxNoBumperSegment;
	static JCheckBox chckbxBumpersMustBe;
	static JCheckBox chckbxCornersMustBe;
	static JCheckBox chckbxMustUse;
	static JCheckBox chckbxMustUseA;
	static JCheckBox chckbxMustUseA_1;
	static JCheckBox chckbxMustBeAble;
	static JCheckBox chckbxTeamNumberDisplayed;
	static JCheckBox chckbxMustBeSecurely;
	static JCheckBox chckbxWhenOnFlat;
	static int bca;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bumpers window = new Bumpers();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Bumpers() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		bca=0;
		frame = new JFrame();
		frame.setBounds(100, 100, 1002, 468);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Inspection.class.getResource("/Imagenes/logo.JPG")));
		frame.getContentPane().setLayout(null);
		JTextPane txtpnStandardBumpers = new JTextPane();
		txtpnStandardBumpers.setEditable(false);
		txtpnStandardBumpers.setBackground(UIManager.getColor("Button.background"));
		txtpnStandardBumpers.setFont(new Font("Tahoma", Font.BOLD, 35));
		txtpnStandardBumpers.setText("Standard Bumpers");
		txtpnStandardBumpers.setBounds(181, 23, 355, 49);
		frame.getContentPane().add(txtpnStandardBumpers);
		
		chckbxNewCheckBox = new JCheckBox("Bumpers must provide protection for at least 6\u201D (~16cm) on both sides of all outside corners. (Wood within \u00BC\u201D of corner) ");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bca++;
			}
		});
		chckbxNewCheckBox.setBounds(6, 105, 847, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		chckbxHardBumperParts = new JCheckBox("Hard bumper parts defined by bumper backing, may not extend >1\u201D (~25mm) beyond robot frame.");
		chckbxHardBumperParts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				bca++;
			}
		});
		chckbxHardBumperParts.setBounds(6, 131, 609, 23);
		frame.getContentPane().add(chckbxHardBumperParts);
		
		chckbxNoBumperSegment = new JCheckBox(" No bumper segment may be unsupported by robot frame for a length greater than 8\u201D (~20cm). Gaps must be less than or equal to \u00BC\u201D (~6mm)");
		chckbxNoBumperSegment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bca++;
			}
		});
		chckbxNoBumperSegment.setBounds(6, 157, 833, 23);
		frame.getContentPane().add(chckbxNoBumperSegment);
		
		chckbxBumpersMustBe = new JCheckBox("Bumpers must be supported by at least \u00BD\u201D (~13mm) of Robot Frame at each end (< \u00BC\u201D (~6mm) gap OK)");
		chckbxBumpersMustBe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bca++;
			}
		});
		chckbxBumpersMustBe.setBounds(6, 183, 833, 23);
		frame.getContentPane().add(chckbxBumpersMustBe);
		
		chckbxCornersMustBe = new JCheckBox("Corners must be filled with pool noodle such that no \u201Chard parts\u201D are exposed.");
		chckbxCornersMustBe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bca++;
			}
		});
		chckbxCornersMustBe.setBounds(6, 183, 533, 23);
		frame.getContentPane().add(chckbxCornersMustBe);
		
		chckbxMustUse = new JCheckBox("Must use \u00BE\u201D (~19mm) thick x 5\u201D (+/- \u00BD\u201D) (~127 mm \u00B1 12.7 mm) tall plywood or solid robust wood backing with no extraneous holes that may affect structural integrity.");
		chckbxMustUse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bca++;
			}
		});
		chckbxMustUse.setBounds(6, 209, 974, 23);
		frame.getContentPane().add(chckbxMustUse);
		
		chckbxMustUseA = new JCheckBox("Must use a pair of vertically-stacked 2.5\u201D pool noodles. Pool noodles may be any shape cross section, solid or hollow, but both must be identical in shape and density.");
		chckbxMustUseA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bca++;
			}
		});
		chckbxMustUseA.setBounds(6, 235, 974, 23);
		frame.getContentPane().add(chckbxMustUseA);
		
		chckbxMustUseA_1 = new JCheckBox("Must use a durable fabric cover for the noodles secured as in Fig 10-6 cross section");
		chckbxMustUseA_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bca++;
			}
		});
		chckbxMustUseA_1.setBounds(6, 261, 938, 23);
		frame.getContentPane().add(chckbxMustUseA_1);
		
		chckbxMustBeAble = new JCheckBox("Must be able to display red or blue to match alliance color.");
		chckbxMustBeAble.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			bca++;
			}
		});
		chckbxMustBeAble.setBounds(6, 287, 938, 23);
		frame.getContentPane().add(chckbxMustBeAble);
		
		chckbxTeamNumberDisplayed = new JCheckBox("Team number displayed with Arabic numerals, min. font 4\u201D (~11cm) tall x \u00BD\u201D(~13mm) stroke");
		chckbxTeamNumberDisplayed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bca++;
			}
		});
		chckbxTeamNumberDisplayed.setBounds(6, 313, 938, 23);
		frame.getContentPane().add(chckbxTeamNumberDisplayed);
		
		chckbxMustBeSecurely = new JCheckBox("Must be securely mounted when attached and be easily removable for inspection.");
		chckbxMustBeSecurely.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			bca++;
			}
		});
		chckbxMustBeSecurely.setBounds(6, 339, 938, 23);
		frame.getContentPane().add(chckbxMustBeSecurely);
		
		chckbxWhenOnFlat = new JCheckBox("When on flat floor, bumpers must reside entirely between the floor and 7-1/2\u201D (~19cm) above floor");
		chckbxWhenOnFlat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bca++;
			}
		});
		chckbxWhenOnFlat.setBounds(6, 365, 938, 23);
		frame.getContentPane().add(chckbxWhenOnFlat);
		
		JButton btnExit = new JButton("Return");
		btnExit.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			Bumpers window = new Bumpers();
			window.frame.setVisible(false);
			frame.dispose();
		}
	});
	btnExit.setBounds(6, 395, 89, 23);
	frame.getContentPane().add(btnExit);
	
	JButton btnNewButton = new JButton("Completed");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			if(bca==11) {
				JOptionPane.showMessageDialog(null,"testsucess");
				frame.dispose();
			}else {
				JOptionPane.showMessageDialog(null,"testfailed");
			}
		}
	});
	btnNewButton.setBounds(853, 395, 123, 23);
	frame.getContentPane().add(btnNewButton);
		
}
}