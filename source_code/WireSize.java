package RobotInspectorAPP;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WireSize {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WireSize wire = new WireSize();
					wire.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WireSize() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 666, 241);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Inspection.class.getResource("/Imagenes/logo.JPG")));
		frame.getContentPane().setLayout(null);
		JTextPane txtpnWireSizeConventions = new JTextPane();
		txtpnWireSizeConventions.setEditable(false);
		txtpnWireSizeConventions.setBackground(UIManager.getColor("Button.background"));
		txtpnWireSizeConventions.setFont(new Font("Tahoma", Font.BOLD, 28));
		txtpnWireSizeConventions.setText("Wire Size Conventions");
		txtpnWireSizeConventions.setBounds(50, 11, 355, 49);
		frame.getContentPane().add(txtpnWireSizeConventions);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setBounds(6, 67, 21, 23);
		frame.getContentPane().add(checkBox);
		
		JLabel lblNewLabel = new JLabel("All wire from battery to main breaker to PDP must have min 6 AWG (7 SWG or 16mm2) wire <R40 & Fig.9-9> ");
		lblNewLabel.setBounds(33, 71, 677, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JCheckBox checkBox_1 = new JCheckBox("");
		checkBox_1.setBounds(6, 93, 21, 23);
		frame.getContentPane().add(checkBox_1);
		
		JLabel lblAmpBreakers = new JLabel("40 amp breakers must have min 12 AWG (13 SWG or 4 mm2\r\n) wire <R53>");
		lblAmpBreakers.setBounds(33, 96, 540, 14);
		frame.getContentPane().add(lblAmpBreakers);
		
		JCheckBox checkBox_2 = new JCheckBox("");
		checkBox_2.setBounds(6, 119, 21, 23);
		frame.getContentPane().add(checkBox_2);
		
		JLabel lblNewLabel_1 = new JLabel("30 amp breakers must have min 14 AWG (16 SWG or 2.5 mm2\r\n) wire <R53> ");
		lblNewLabel_1.setBounds(33, 121, 540, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JCheckBox checkBox_3 = new JCheckBox("");
		checkBox_3.setBounds(6, 145, 21, 23);
		frame.getContentPane().add(checkBox_3);
		
		JLabel lblNewLabel_2 = new JLabel("20 amp breakers must have min 18 AWG (18 SWG or 1 mm2\r\n) wire <R53>");
		lblNewLabel_2.setBounds(33, 146, 540, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
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
		btnComplete.setBounds(551, 175, 89, 23);
		frame.getContentPane().add(btnComplete);
		
	}
}
