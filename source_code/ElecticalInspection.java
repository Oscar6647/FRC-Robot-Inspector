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
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class ElecticalInspection {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ElecticalInspection electrical = new ElecticalInspection();
					electrical.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ElecticalInspection() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 812, 640);
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
		
		JCheckBox chckbxComponents = new JCheckBox("Components");
		chckbxComponents.setBounds(6, 39, 97, 23);
		frame.getContentPane().add(chckbxComponents);
		
		JLabel lblNoneMayBe = new JLabel(" None may be modified");
		lblNoneMayBe.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNoneMayBe.setBounds(109, 43, 163, 14);
		frame.getContentPane().add(lblNoneMayBe);
		
		JButton ExceptThoseListed = new JButton("Except those listed");
		ExceptThoseListed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Motor mounting and output shaft, motor wires may be trimmed, window\r\n" + 
						"motor locking pins may be removed, and certain devices may be repaired with parts identical to the originals. PDP fuses may\r\n" + 
						"be replaced with identical fuses only. Servos may be modified per manufacturer’s instructions");
			//Activate checkbox once got message
			}
		});
		ExceptThoseListed.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		ExceptThoseListed.setBounds(282, 43, 142, 14);
		frame.getContentPane().add(ExceptThoseListed);
		
		JCheckBox chckbxBattery = new JCheckBox("Battery");
		chckbxBattery.setBounds(6, 65, 97, 23);
		frame.getContentPane().add(chckbxBattery);
		
		JLabel lblASingle = new JLabel(" A single 12 volt, 17-18.2 Ah robot battery (or listed equivalent), securely fastened inside robot.");
		lblASingle.setBounds(119, 69, 653, 14);
		frame.getContentPane().add(lblASingle);
		
		JCheckBox chckbxOtherBateries = new JCheckBox("Other Bateries");
		chckbxOtherBateries.setBounds(6, 91, 117, 23);
		frame.getContentPane().add(chckbxOtherBateries);
		
		JButton SeeListingFor = new JButton("See listing for reference");
		SeeListingFor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Integral to COTS computing device or camera or COTS USB < 100Wh (20,000mAh at 5V) and 2.5Amp\r\n" + 
						"max output per port used for COTS computing device and accessories only.");
			//Activate checkbox once got message
			}
		});
		SeeListingFor.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		SeeListingFor.setBounds(129, 94, 225, 14);
		frame.getContentPane().add(SeeListingFor);
		
		JCheckBox chckbxPdpVisibility = new JCheckBox("PDP Visibility");
		chckbxPdpVisibility.setBounds(6, 117, 117, 21);
		frame.getContentPane().add(chckbxPdpVisibility);
		
		JLabel lblTheSinglePdp = new JLabel("The single PDP and PDP breakers must be easily visible for inspection");
		lblTheSinglePdp.setBounds(123, 119, 471, 14);
		frame.getContentPane().add(lblTheSinglePdp);
		
		JCheckBox chckbxMainBreakerAccesibility = new JCheckBox("Main Breaker Accesibility");
		chckbxMainBreakerAccesibility.setBounds(6, 141, 184, 21);
		frame.getContentPane().add(chckbxMainBreakerAccesibility);
		
		JLabel lblNewLabel = new JLabel(" the single 120A main breaker must be readily accessible with labeling preferred. ");
		lblNewLabel.setBounds(196, 144, 471, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JCheckBox chckbxAllowedPdBreakers = new JCheckBox("Allowed PD Breakers");
		chckbxAllowedPdBreakers.setBounds(6, 165, 150, 23);
		frame.getContentPane().add(chckbxAllowedPdBreakers);
		
		JLabel lblOnlyVbaMxa = new JLabel("Only VB3-A, MX5-A or MX5-L Series (40A or lower), Snap-Action breakers may be inserted in the PDP");
		lblOnlyVbaMxa.setBounds(162, 169, 579, 14);
		frame.getContentPane().add(lblOnlyVbaMxa);
		
		JCheckBox chckbxRobotRadio = new JCheckBox("Robot Radio");
		chckbxRobotRadio.setBounds(6, 191, 97, 23);
		frame.getContentPane().add(chckbxRobotRadio);
		
		JButton label = new JButton("See listing for reference");
		label.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "A single OpenMesh OM5P-AN or OM5P-AC radio must be powered via a VRM +12 volt, 2 amp output. The\r\n" + 
						"VRM must connect to the dedicated +12 volt output on the PDP. Radio LEDs are easily visible.");
				//Activate checkbox once got message
			}
		});
		label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		label.setBounds(109, 195, 252, 14);
		frame.getContentPane().add(label);
		
		JCheckBox chckbxCanBus = new JCheckBox("CAN BUS");
		chckbxCanBus.setBounds(6, 217, 97, 23);
		frame.getContentPane().add(chckbxCanBus);
		
		JLabel lblTheRoborioAnd = new JLabel("The RoboRio and PDP must be connected via CAN wiring even if no other CAN devices are used. ");
		lblTheRoborioAnd.setBounds(119, 221, 471, 14);
		frame.getContentPane().add(lblTheRoborioAnd);
		
		JCheckBox chckbxRoborioPower = new JCheckBox("RoboRio Power");
		chckbxRoborioPower.setBounds(6, 243, 117, 23);
		frame.getContentPane().add(chckbxRoborioPower);
		
		JLabel lblOnlyTheRoborio = new JLabel("Only the RoboRio must be connected to dedicated power terminals on PDP.");
		lblOnlyTheRoborio.setBounds(129, 246, 471, 14);
		frame.getContentPane().add(lblOnlyTheRoborio);
		
		JCheckBox chckbxWireSizeMinimum = new JCheckBox("Wire Size Minimum & Breaker Size");
		chckbxWireSizeMinimum.setBounds(6, 269, 222, 23);
		frame.getContentPane().add(chckbxWireSizeMinimum);
		
		JButton lblObeyTheWiring = new JButton ("obey the Wiring size Conevntions");
		lblObeyTheWiring.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WireSize wire = new WireSize();
				wire.frame.setVisible(true);
					//Activate checkbox once got message
				}
		});
		lblObeyTheWiring.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblObeyTheWiring.setBounds(234, 271, 222, 14);
		frame.getContentPane().add(lblObeyTheWiring);
		
		JCheckBox chckbxWireColors = new JCheckBox("Wire Colors");
		chckbxWireColors.setBounds(6, 295, 97, 23);
		frame.getContentPane().add(chckbxWireColors);
		
		JLabel lblAllWireMust = new JLabel("All wire must be color coded");
		lblAllWireMust.setBounds(119, 299, 169, 14);
		frame.getContentPane().add(lblAllWireMust);
		
		JButton label_1 = new JButton("See listing for reference");
		label_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "All power wire must be color coded - red, white, brown, yellow, or black w/stripe for +24, +12, +5 VDC supply\r\n" + 
						"(positive) wires and black or blue for common (negative) for supply return wires ");
				//Activate checkbox once got message
			}
		});
		label_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		label_1.setBounds(298, 299, 225, 14);
		frame.getContentPane().add(label_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Copper Wire Only");
		chckbxNewCheckBox.setBounds(6, 321, 150, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JLabel lblAllWireUsed = new JLabel("All wire used on robot must be cipper wire, stranded preferred. (Signal wire excluded)");
		lblAllWireUsed.setBounds(162, 324, 505, 14);
		frame.getContentPane().add(lblAllWireUsed);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("1 Wire per WAGO");
		chckbxNewCheckBox_1.setBounds(6, 347, 150, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		JButton label_2 = new JButton("See listing for reference");
		label_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, " Only 1 wire may be inserted in each WAGO terminal, splices and/or terminal blocks, may be used to\r\n" + 
						"distribute power to multiple branch circuits but all wires in the splice are subject to the wire size rules.");
				//Activate checkbox once got message
			}
		});
		label_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		label_2.setBounds(162, 351, 294, 14);
		frame.getContentPane().add(label_2);
		
		JCheckBox chckbxMotors = new JCheckBox("Motors");
		chckbxMotors.setBounds(6, 373, 97, 23);
		frame.getContentPane().add(chckbxMotors);
		
		JLabel lblOnlyMotorsListed = new JLabel("Only motors listed per table 9-1");
		lblOnlyMotorsListed.setBounds(109, 377, 184, 14);
		frame.getContentPane().add(lblOnlyMotorsListed);
		
		JButton btnTable = new JButton("Table 9-1");
		btnTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Table9 table = new Table9();
				table.frame.setVisible(true);
				//Activate checkbox once got message
			}
		});
		btnTable.setBounds(298, 373, 89, 23);
		frame.getContentPane().add(btnTable);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Actuators");
		chckbxNewCheckBox_2.setBounds(6, 399, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox_2);
		
		JLabel lblElectricalSolenoidActuators = new JLabel(" Electrical solenoid actuators, max. 1 in. stroke and no greater than 10 watts@12V continuous duty");
		lblElectricalSolenoidActuators.setBounds(109, 402, 579, 14);
		frame.getContentPane().add(lblElectricalSolenoidActuators);
		
		JCheckBox chckbxMotoractuatorPower = new JCheckBox("Motor/Actuator Power");
		chckbxMotoractuatorPower.setBounds(6, 425, 169, 23);
		frame.getContentPane().add(chckbxMotoractuatorPower);
		
		JButton lblSeeListingFor_1 = new JButton("See listing  for specification");
		lblSeeListingFor_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Each motor controller may have one motor connected to the load terminals with exceptions in Table\r\n" + 
						"9-2, <R30>, and single specified motors may be connected to Spike or Automation Direct Relay (however multiple pneumatic\r\n" + 
						"valves may be driven by a single Spike). Specified motors must be fed by speed controllers only. Two PWM controllers can\r\n" + 
						"be connected by a PWM “Y” cable.");
				//Activate checkbox once got message
			}
		});
		lblSeeListingFor_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblSeeListingFor_1.setBounds(215, 429, 225, 14);
		frame.getContentPane().add(lblSeeListingFor_1);
		
		JCheckBox chckbxMotoractuatorControl = new JCheckBox("Motor/Actuator Control");
		chckbxMotoractuatorControl.setBounds(6, 451, 169, 23);
		frame.getContentPane().add(chckbxMotoractuatorControl);
		
		JButton label_3 = new JButton("See listing  for specification");
		label_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Motors/actuators must be controlled by legal motor controllers and driven directly by PWM\r\n" + 
						"signals from RoboRio or through legal MXP board or by CAN bus.");
				//Activate checkbox once got message
			}
		});
		label_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		label_3.setBounds(215, 454, 225, 14);
		frame.getContentPane().add(label_3);
		
		JCheckBox chckbxCustomCircuitsSensor = new JCheckBox("Custom Circuits, Sensor and Additional Electronics");
		chckbxCustomCircuitsSensor.setBounds(6, 477, 282, 23);
		frame.getContentPane().add(chckbxCustomCircuitsSensor);
		
		JButton label_4 = new JButton("See listing  for specification");
		label_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, " cannot directly control speed controllers, relays, actuators or servos.\r\n" + 
						"Custom Circuits may not produce voltage exceeding 24V.");
				//Activate checkbox once got message
			}
		});
		label_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		label_4.setBounds(298, 480, 225, 14);
		frame.getContentPane().add(label_4);
		
		JCheckBox chckbxPneumaticControlModule = new JCheckBox("Pneumatic Control Module (PCM)");
		chckbxPneumaticControlModule.setBounds(6, 503, 225, 23);
		frame.getContentPane().add(chckbxPneumaticControlModule);
		
		JLabel lblPcmModulesMust = new JLabel("PCM modules must be connected to RoboRio via CAN bus");
		lblPcmModulesMust.setBounds(234, 507, 337, 14);
		frame.getContentPane().add(lblPcmModulesMust);
		
		JCheckBox chckbxIsolatingFrame = new JCheckBox("Isolating Frame");
		chckbxIsolatingFrame.setBounds(6, 529, 150, 23);
		frame.getContentPane().add(chckbxIsolatingFrame);
		
		JButton label_5 = new JButton("See listing  for specification");
		label_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Frame must be electrically isolated from battery, RoboRio must be insulated from frame. (>3k Ohm between\r\n" + 
						"either PDP battery post and chassis)");
				//Activate checkbox once got message
			}
		});
		label_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		label_5.setBounds(162, 533, 225, 14);
		frame.getContentPane().add(label_5);
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InitialInspection initial = new InitialInspection();
				initial.frame.setVisible(false);
				frame.dispose();
			}
		});
		btnRegresar.setBounds(10, 567, 89, 23);
		frame.getContentPane().add(btnRegresar);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ElecticalInspection electrical = new ElecticalInspection();
				electrical.frame.setVisible(false);
				frame.dispose();
				PneumaticInspection pneumatic = new PneumaticInspection();
				pneumatic.frame.setVisible(true);
			}
		});
		btnNext.setBounds(683, 567, 89, 23);
		frame.getContentPane().add(btnNext);
	}
}
