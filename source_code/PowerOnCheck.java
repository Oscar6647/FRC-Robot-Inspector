package RobotInspectorAPP;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

public class PowerOnCheck {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PowerOnCheck power = new PowerOnCheck();
					power.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PowerOnCheck() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 720, 375);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Inspection.class.getResource("/Imagenes/logo.JPG")));
		frame.getContentPane().setLayout(null);
		JMenuBar menuBar= new JMenuBar();
		menuBar.setBounds(10, 11, 252, 21);
		frame.getContentPane().add(menuBar);
		JMenu general=new JMenu("General Inspection");
		general.setMnemonic('g');
		JMenu specific=new JMenu("Specific Inspection");
		specific.setMnemonic('s');
		menuBar.add(general);
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		menuBar.add(separator);
		menuBar.add(specific);
		JMenuItem initialinspection= new JMenuItem("Initial Inspection", 'i');
		initialinspection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inspection window2 = new Inspection();
				window2.frame.setVisible(false);
				frame.dispose();
				InitialInspection initial = new InitialInspection();
				initial.frame.setVisible(true);
			}
		});
		general.add(initialinspection);
		JMenuItem mechanical= new JMenuItem ("Mechanical Inspection",'m');
		mechanical.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Inspection window2 = new Inspection();
			window2.frame.setVisible(false);
			frame.dispose();
			MechanicalInspection mechanical = new MechanicalInspection();
			mechanical.frame.setVisible(true);
		}
	});
		JMenuItem electrical= new JMenuItem ("Electical Inspection",'e');
		electrical.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inspection window2 = new Inspection();
				window2.frame.setVisible(false);
				frame.dispose();
				ElecticalInspection electrical = new ElecticalInspection();
				electrical.frame.setVisible(true);
			}
		});
		JMenuItem pneumatic= new JMenuItem ("Pneumatic Inspection",'p');
		pneumatic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inspection window2 = new Inspection();
				window2.frame.setVisible(false);
				frame.dispose();
				PneumaticInspection pneumatic = new PneumaticInspection();
				pneumatic.frame.setVisible(true);
			}
		});
		JMenuItem poweroncheck= new JMenuItem("Power On Check",'o');
		poweroncheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inspection window2 = new Inspection();
				window2.frame.setVisible(false);
				frame.dispose();
				PowerOnCheck power = new PowerOnCheck();
				power.frame.setVisible(true);
			}
		});
		specific.add(mechanical);
		specific.add(new JSeparator());
		specific.add(electrical);
		specific.add(new JSeparator());
		specific.add(pneumatic);
		specific.add(new JSeparator());
		specific.add(poweroncheck);
		
		JCheckBox chckbxUnauthorizedWirelessCommunication = new JCheckBox("Unauthorized Wireless Communication");
		chckbxUnauthorizedWirelessCommunication.setBounds(6, 39, 256, 23);
		frame.getContentPane().add(chckbxUnauthorizedWirelessCommunication);
		
		JCheckBox chckbxConfirmPneumaticsOperation = new JCheckBox("Confirm Pneumatics Operation");
		chckbxConfirmPneumaticsOperation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PneumaticOperation op = new PneumaticOperation();
				op.frame.setVisible(true);
			}
		});
		chckbxConfirmPneumaticsOperation.setBounds(6, 65, 210, 23);
		frame.getContentPane().add(chckbxConfirmPneumaticsOperation);
		//when activated chechbox launch panel of further confi
		
		JLabel lblWithNoPressure = new JLabel("With no pressure in system, compressorshould start when robot is enabled.");
		lblWithNoPressure.setBounds(222, 69, 479, 14);
		frame.getContentPane().add(lblWithNoPressure);
		
		JCheckBox chckbxRobotSignalLight = new JCheckBox("Robot Signal Light");
		chckbxRobotSignalLight.setBounds(6, 91, 134, 43);
		frame.getContentPane().add(chckbxRobotSignalLight);
		
		JLabel lblTheRobotSignal = new JLabel("The Robot Signal Light (2 max) from KOP is visible from 3'in front of the robot.");
		lblTheRobotSignal.setBounds(146, 95, 479, 14);
		frame.getContentPane().add(lblTheRobotSignal);
		
		JLabel lblMustBePlugged = new JLabel("Must be plugged into the RSL port on Robo Rio and flashes in sync with Robo Rio");
		lblMustBePlugged.setBounds(146, 120, 495, 14);
		frame.getContentPane().add(lblMustBePlugged);
		
		JCheckBox chckbxVerifyTeamNumber = new JCheckBox("Verify Team Number on DS");
		chckbxVerifyTeamNumber.setBounds(6, 137, 179, 23);
		frame.getContentPane().add(chckbxVerifyTeamNumber);
		
		JLabel lblTeamHasProgrammed = new JLabel("team has programmed the OpenMesh Wireless Bridge at Kiosk for this event.");
		lblTeamHasProgrammed.setBounds(191, 141, 454, 14);
		frame.getContentPane().add(lblTeamHasProgrammed);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Software Versions");
		chckbxNewCheckBox.setBounds(6, 163, 134, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JLabel lblTheRoborioImage = new JLabel(" The RoboRio image (FRC_2020_v10 or later) and DS (20.0 or later) must be loaded");
		lblTheRoborioImage.setBounds(146, 167, 530, 14);
		frame.getContentPane().add(lblTheRoborioImage);
		
		JCheckBox chckbxPowerOff = new JCheckBox("Power Off");
		chckbxPowerOff.setBounds(6, 189, 97, 60);
		frame.getContentPane().add(chckbxPowerOff);
		
		JLabel lblDisableRobotAnd = new JLabel("Disable robot and open Main Breaker to remove power from the robot, confirm all LEDs are off");
		lblDisableRobotAnd.setBounds(109, 193, 567, 14);
		frame.getContentPane().add(lblDisableRobotAnd);
		
		JLabel lblNewLabel = new JLabel("actuate pneumatic vent plug valve and confirm that all pressure is vented to atmosphere ");
		lblNewLabel.setBounds(109, 212, 516, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblAndAllGauges = new JLabel("And all gauges read 0 psi pressure. ");
		lblAndAllGauges.setBounds(109, 235, 438, 14);
		frame.getContentPane().add(lblAndAllGauges);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Driver Console is less than 60\u201D x 14\u201D x 6\u20196\u201D above floor (approx.).");
		chckbxNewCheckBox_1.setBounds(6, 252, 419, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		JLabel lblNewLabel_1 = new JLabel("May have hook and loop hook side attached to secure to Driver\u2019s Station shelf.");
		lblNewLabel_1.setBounds(10, 282, 479, 14);
		frame.getContentPane().add(lblNewLabel_1);
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InitialInspection initial = new InitialInspection();
				initial.frame.setVisible(false);
				frame.dispose();
			}
		});
		btnRegresar.setBounds(10, 307, 89, 23);
		frame.getContentPane().add(btnRegresar);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PowerOnCheck power = new PowerOnCheck();
				power.frame.setVisible(false);
				frame.dispose();
				TeamComplianceStatement team=new TeamComplianceStatement();
				team.frame.setVisible(true);
			}
		});
		btnNext.setBounds(587, 307, 89, 23);
		frame.getContentPane().add(btnNext);
	}
}
