package RobotInspectorAPP;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TeamComplianceStatement {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeamComplianceStatement team = new TeamComplianceStatement();
					team.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TeamComplianceStatement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Inspection.class.getResource("/Imagenes/logo.JPG")));
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnWeTheTeam = new JTextPane();
		txtpnWeTheTeam.setBackground(UIManager.getColor("menu"));
		txtpnWeTheTeam.setEditable(false);
		txtpnWeTheTeam.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtpnWeTheTeam.setText("We, the Team Mentor and Team Captain, attest by our signing below, that our team\u2019s ROBOT was built after the 2020 Kickoff, and\r\nwe are not aware of any rules it violates. We confirm that it and its MAJOR MECHANISMS are products of our team\u2019s work. \r");
		txtpnWeTheTeam.setBounds(10, 11, 414, 129);
		frame.getContentPane().add(txtpnWeTheTeam);
		
		JLabel lblTeamCaptain = new JLabel("Team Captain:");
		lblTeamCaptain.setBounds(10, 151, 113, 14);
		frame.getContentPane().add(lblTeamCaptain);
		
		textField = new JTextField();
		textField.setBounds(133, 148, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblTeamMentor = new JLabel("Team Mentor:");
		lblTeamMentor.setBounds(10, 182, 113, 14);
		frame.getContentPane().add(lblTeamMentor);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(133, 179, 86, 20);
		frame.getContentPane().add(textField_1);
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InitialInspection initial = new InitialInspection();
				initial.frame.setVisible(false);
				frame.dispose();
			}
		});
		btnRegresar.setBounds(10, 227, 124, 23);
		frame.getContentPane().add(btnRegresar);
		JButton btnFinishInspection = new JButton("Finish Inspection");
		btnFinishInspection.setBounds(300, 227, 124, 23);
		frame.getContentPane().add(btnFinishInspection);
	}
}
