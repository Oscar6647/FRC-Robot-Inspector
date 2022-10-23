package RobotInspectorAPP;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.Font;

public class PneumaticInspection {

JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PneumaticInspection pneumatic = new PneumaticInspection();
					pneumatic.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PneumaticInspection() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 691, 365);
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
		
		JCheckBox chckbxNoModifications = new JCheckBox("No Modifications");
		chckbxNoModifications.setBounds(10, 39, 121, 23);
		frame.getContentPane().add(chckbxNoModifications);
		
		JLabel lblActuatuorMountingPins = new JLabel("Actuatuor mounting pins may be removed, small labels allowed. No painting or large labels.");
		lblActuatuorMountingPins.setBounds(137, 43, 586, 14);
		frame.getContentPane().add(lblActuatuorMountingPins);
		
		JCheckBox chckbxCompressor = new JCheckBox("Compressor");
		chckbxCompressor.setBounds(10, 65, 97, 23);
		frame.getContentPane().add(chckbxCompressor);
		
		JLabel lblNewLabel = new JLabel("Only one (on robot only) compressor (max 1.1 CFM flow rate) may be used.");
		lblNewLabel.setBounds(137, 69, 453, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JCheckBox chckbxCompressorPower = new JCheckBox("Compressor Power");
		chckbxCompressorPower.setBounds(10, 91, 153, 23);
		frame.getContentPane().add(chckbxCompressorPower);
		
		JLabel lblNewLabel_1 = new JLabel(" must use a PCM or Relay module.");
		lblNewLabel_1.setBounds(169, 94, 334, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JCheckBox chckbxCompressorControl = new JCheckBox("Compressor Control");
		chckbxCompressorControl.setBounds(10, 117, 153, 23);
		frame.getContentPane().add(chckbxCompressorControl);
		
		JLabel lblNewLabel_2 = new JLabel(" A Pressure Switch must be wired directly to the PCM or RoboRio to control compressor. ");
		lblNewLabel_2.setBounds(169, 121, 523, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JCheckBox chckbxVentingPlugValve = new JCheckBox("Venting Plug Valve");
		chckbxVentingPlugValve.setBounds(10, 143, 153, 23);
		frame.getContentPane().add(chckbxVentingPlugValve);
		
		JLabel lblNewLabel_3 = new JLabel(" must include an easily-accessible manual vent plug valve to release all system pressure.");
		lblNewLabel_3.setBounds(169, 146, 523, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JCheckBox chckbxTubing = new JCheckBox("Tubing");
		chckbxTubing.setBounds(10, 169, 97, 23);
		frame.getContentPane().add(chckbxTubing);
		
		JLabel lblNewLabel_4 = new JLabel("Equiv. to KOP with a maximum OD of \u00BC\u201D (~6 mm) with screen printed rating or documentation.");
		lblNewLabel_4.setBounds(113, 173, 547, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JCheckBox chckbxGauges = new JCheckBox("Gauges");
		chckbxGauges.setBounds(10, 195, 97, 23);
		frame.getContentPane().add(chckbxGauges);
		
		JLabel lblNewLabel_5 = new JLabel("must be present at both the high pressure side and low pressure regulator outlet(s) and be readily visible. ");
		lblNewLabel_5.setBounds(113, 198, 610, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JCheckBox chckbxPressureRating = new JCheckBox("Pressure Rating");
		chckbxPressureRating.setBounds(10, 221, 121, 23);
		frame.getContentPane().add(chckbxPressureRating);
		
		JButton SeeRatingSpecification = new JButton("See Rating Specification");
		SeeRatingSpecification.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "all pneumatic components at pressure, must be rated for at least 70 psi (~483 kPa. <R75> All components\r\n" + 
						"at stored pressure must be rated for at least 125 psi (~862 kPa). <R75>");
				//Activate checkbox once got message
			}
		});
		SeeRatingSpecification.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		SeeRatingSpecification.setBounds(137, 223, 175, 14);
		frame.getContentPane().add(SeeRatingSpecification);
		
		JCheckBox chckbxValveControl = new JCheckBox("Valve Control");
		chckbxValveControl.setBounds(10, 247, 97, 23);
		frame.getContentPane().add(chckbxValveControl);
		
		JButton SeeControlSpecification = new JButton("See Control Specification");
		SeeControlSpecification.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, " pneumatic solenoid valves must have a max 1/8” NPT, BSPP, or BSPT port diameter, be controlled by either\r\n" + 
						"a PCM or Relay Module and valve outputs may not be plumbed together.< Table 9-2, R77-C, & R87>");
				//Activate checkbox once got message 
			}
		});
		SeeControlSpecification.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		SeeControlSpecification.setBounds(137, 251, 175, 14);
		frame.getContentPane().add(SeeControlSpecification);
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InitialInspection initial = new InitialInspection();
				initial.frame.setVisible(false);
				frame.dispose();
			}
		});
		btnRegresar.setBounds(10, 290, 89, 23);
		frame.getContentPane().add(btnRegresar);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PneumaticInspection pneumatic = new PneumaticInspection();
				pneumatic.frame.setVisible(false);
				frame.dispose();
				PowerOnCheck power = new PowerOnCheck();
				power.frame.setVisible(true);
			}
		});
		btnNext.setBounds(592, 290, 89, 23);
		frame.getContentPane().add(btnNext);
	}

}
