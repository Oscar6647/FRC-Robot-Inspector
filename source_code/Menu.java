package RobotInspectorAPP;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Menu {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Menu.class.getResource("/Imagenes/logo.JPG")));
		frame.setBounds(100, 100, 752, 454);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final TeamsRegistered window4= new TeamsRegistered();
		JButton btnNewButton = new JButton("Teams Registered");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Menu window = new Menu();
				window4.frame.setVisible(true);
				window.frame.dispose();
			}
		});
		btnNewButton.setBounds(260, 11, 160, 50);
		frame.getContentPane().add(btnNewButton);
		final MapOfPits window3= new MapOfPits();
		JButton button = new JButton("Map of the Pits");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu window = new Menu();
				window3.frame.setVisible(true);
				window.frame.dispose();
			}
		});
		button.setBounds(260, 83, 160, 50);
		frame.getContentPane().add(button);
		
		final Inspection window2= new Inspection();
		JButton button_1 = new JButton("Inspect Robot");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				window2.frame.setVisible(true);
					
			}
		});
		button_1.setBounds(260, 152, 160, 50);
		frame.getContentPane().add(button_1);
		
		
		JButton button_2 = new JButton("Teams Ready to Compete");
		final TeamsReadytoCompete window5 = new TeamsReadytoCompete();
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					window5.frmTeamsReadyTo.setVisible(true);
			}
		});
		button_2.setBounds(40, 236, 160, 50);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("Teams On Waitlist");
		button_3.setBounds(260, 236, 160, 50);
		final WaitList window6=new WaitList(); 
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				window6.frame.setVisible(true);
				
			}
		});
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("Teams NOT READY TO COMPETE");
		button_4.setBounds(508, 236, 160, 50);
		final NOTREADY window7=new NOTREADY(); 
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				window7.frame.setVisible(true);
				
			}
		});
		frame.getContentPane().add(button_4);
		
		JButton btnRobotInspectors = new JButton("ROBOT INSPECTORS");
		btnRobotInspectors.setBounds(260, 308, 160, 50);
		frame.getContentPane().add(btnRobotInspectors);
	}
}
