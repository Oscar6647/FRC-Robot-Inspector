package RobotInspectorAPP;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

public class PneumaticOperation {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PneumaticOperation op = new PneumaticOperation();
					op.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PneumaticOperation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 620, 245);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Inspection.class.getResource("/Imagenes/logo.JPG")));
		frame.getContentPane().setLayout(null);
		JTextPane txtpnWireSizeConventions = new JTextPane();
		txtpnWireSizeConventions.setEditable(false);
		txtpnWireSizeConventions.setBackground(UIManager.getColor("Button.background"));
		txtpnWireSizeConventions.setFont(new Font("Tahoma", Font.BOLD, 28));
		txtpnWireSizeConventions.setText("Pneumatic Operation Procedure");
		txtpnWireSizeConventions.setBounds(10, 11, 504, 49);
		frame.getContentPane().add(txtpnWireSizeConventions);
		
		JCheckBox chckbxCompressor = new JCheckBox("Compressor should stop");
		chckbxCompressor.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxCompressor.setBounds(10, 67, 166, 23);
		frame.getContentPane().add(chckbxCompressor);
		
		JLabel lblNewLabel = new JLabel(" automatically at ~120 psi under RoboRio control. <R80> ");
		lblNewLabel.setBounds(182, 71, 332, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JCheckBox chckbxCheckThatMain = new JCheckBox("Check that Main Pressure");
		chckbxCheckThatMain.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxCheckThatMain.setBounds(10, 93, 197, 23);
		frame.getContentPane().add(chckbxCheckThatMain);
		
		JLabel lblNewLabel_1 = new JLabel(" <= 120 psi <R80> and Working Pressure <= 60 psi ");
		lblNewLabel_1.setBounds(213, 96, 301, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JCheckBox chckbxCompressorReliefValve = new JCheckBox("Compressor Relief Valve");
		chckbxCompressorReliefValve.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxCompressorReliefValve.setBounds(10, 119, 197, 23);
		frame.getContentPane().add(chckbxCompressorReliefValve);
		
		JLabel lblNewLabel_2 = new JLabel(" set to 125 psi, attached to (or through legal fittings) compressor outlet port.");
		lblNewLabel_2.setBounds(213, 121, 381, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Relieving Pressure Regulator");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxNewCheckBox.setBounds(10, 145, 210, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_3 = new JLabel(" Set to <= 60 psi, providing all working pressure.");
		lblNewLabel_3.setBounds(223, 146, 349, 14);
		frame.getContentPane().add(lblNewLabel_3);
		JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WireSize wire = new WireSize();
				wire.frame.setVisible(false);
				frame.dispose();
			}
		});
		btnReturn.setBounds(6, 175, 89, 23);
		frame.getContentPane().add(btnReturn);
		
		JButton btnComplete = new JButton("Complete");
		btnComplete.setBounds(505, 175, 89, 23);
		frame.getContentPane().add(btnComplete);
	}
}
