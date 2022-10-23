package RobotInspectorAPP;

import java.awt.EventQueue;
import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;

public class FrontPage {
	private JFrame frame;
	public static JTextField textField;
	public static JPasswordField passwordField;
	private JButton btnLogIn_1;
	private JButton btnExit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrontPage window = new FrontPage();
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
	public FrontPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(FrontPage.class.getResource("/Imagenes/logo.JPG")));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 708, 458);
		frame.getContentPane().setLayout(null);
		

		JButton btnLogIn = new JButton("Log In");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FrontPage window = new FrontPage();
				window.frame.setVisible(false);
				frame.dispose();
				Menu window2 = new Menu();
				window2.frame.setVisible(true);
				
			}
		});
		
		textField = new JTextField();
		textField.setBounds(216, 228, 205, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(139, 231, 67, 14);
		frame.getContentPane().add(lblUsername);
		
		JLabel label = new JLabel("Password");
		label.setBounds(139, 293, 67, 14);
		frame.getContentPane().add(label);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(216, 290, 205, 20);
		frame.getContentPane().add(passwordField);
		final DatosdeUsuario data= new DatosdeUsuario();
		final Menu	window1=new Menu();
		btnLogIn_1 = new JButton("Log In");
		btnLogIn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (data.probarPass()==1) {
					JOptionPane.showMessageDialog(null, "Bienvenido a la Robot Inspector APP ");
					window1.frame.setVisible(true);
					FrontPage window = new FrontPage();
		window.frame.setVisible(false);
		frame.dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "Tu contraseña o Usuario son Incorrectos");
				}
			}
		});
		
		btnLogIn_1.setBounds(216, 350, 89, 23);
		frame.getContentPane().add(btnLogIn_1);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(315, 350, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JLabel lblFrcRobotInspector = new JLabel("FRC ROBOT INSPECTOR APP");
		lblFrcRobotInspector.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblFrcRobotInspector.setBounds(21, 11, 527, 176);
		frame.getContentPane().add(lblFrcRobotInspector);
		
	}
}
