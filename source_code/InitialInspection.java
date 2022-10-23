package RobotInspectorAPP;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;


public class InitialInspection {

	JFrame frame;
	static JFormattedTextField txt;
	static JTextField textField_1;
	static JTextField textField_2;
	static JTextField textField_3;
	static JRadioButton yes;
	static JRadioButton radioButton_1;
	static int ICA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InitialInspection initial = new InitialInspection();
					initial.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InitialInspection() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ICA=0;
		frame = new JFrame();
		frame.setBounds(100, 100, 707, 363);
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
		
	
		
		MaskFormatter mascara = null;
		try {
			mascara = new MaskFormatter("###.##");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		txt = new JFormattedTextField(mascara);
		txt.setBounds(116, 50, 48, 20);
		frame.getContentPane().add(txt);
		final DatosdeUsuario data= new DatosdeUsuario();
		JCheckBox chckbxWeight = new JCheckBox("Weight");
		chckbxWeight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				try{if(data.weightpass()==1) {
					JOptionPane.showMessageDialog(null, "Robot violates <R5>  (must be <=125 lbs (~56kg) excluding bumpers and battery)");
					chckbxWeight.setSelected(false);
					}
				else if(data.weightpass()==0) {
					JOptionPane.showMessageDialog(null, "Robot follows <R5>");
					ICA++;
				}
			}catch(Exception e2) {
				JOptionPane.showMessageDialog(null, "NO WEIGHT RECORDED", "ERROR", JOptionPane.ERROR_MESSAGE);
				chckbxWeight.setSelected(false);}}
		});
		
		
		chckbxWeight.setBounds(10, 49, 100, 23);
		frame.getContentPane().add(chckbxWeight);
		
		JLabel lblLbs = new JLabel("Lbs");
		lblLbs.setBounds(174, 53, 46, 14);
		frame.getContentPane().add(lblLbs);
		
		JCheckBox chckbxBumberWeight = new JCheckBox("Bumper Weight");
		
		chckbxBumberWeight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{if(data.bumperweightpass()==1) {
					JOptionPane.showMessageDialog(null,"Both Bumpers Violate <R30> (must be <= 15 pounds (~6kg))");
					chckbxBumberWeight.setSelected(false);
				}
				else if(data.bumperweightpass()==2) {
					JOptionPane.showMessageDialog(null,"Red Bumpers Violate <R30> (must be <= 15 pounds (~6kg))");
					chckbxBumberWeight.setSelected(false);
				}
				else if(data.bumperweightpass()==3) {
					JOptionPane.showMessageDialog(null,"Blue Bumpers Violate <R30> (must be <= 15 pounds (~6kg))");
					chckbxBumberWeight.setSelected(false);
				}
				else {
					JOptionPane.showMessageDialog(null, "Bumpers follow <R30>");
					ICA++;
				}} catch (Exception e1) { 
					JOptionPane.showMessageDialog(null, "NO WEIGHT RECORDED", "ERROR", JOptionPane.ERROR_MESSAGE);
			    chckbxBumberWeight.setSelected(false);} 
			}
		});
		chckbxBumberWeight.setBounds(10, 75, 125, 23);
		frame.getContentPane().add(chckbxBumberWeight);
		MaskFormatter mascara2 = null;
		try {
			mascara2 = new MaskFormatter("##");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		textField_1 = new JFormattedTextField(mascara2);
		textField_1.setBounds(141, 76, 33, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblRedBumper = new JLabel("RED Bumper");
		lblRedBumper.setBounds(184, 79, 78, 14);
		frame.getContentPane().add(lblRedBumper);
		
		textField_2 = new JFormattedTextField(mascara2);
		textField_2.setColumns(10);
		textField_2.setBounds(272, 76, 33, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel lblBlueBumper = new JLabel("BLUE Bumper");
		lblBlueBumper.setBounds(315, 79, 100, 14);
		frame.getContentPane().add(lblBlueBumper);
		
		JLabel chckbxAdditionalItems = new JLabel("Additional Items");
		chckbxAdditionalItems.setBounds(10, 101, 143, 23);
		frame.getContentPane().add(chckbxAdditionalItems);
		
		JRadioButton rdbtnYes = new JRadioButton("Yes");
		rdbtnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MoreCONFIG MORE = new MoreCONFIG();
				MORE.frame.setVisible(true);
			}
		});
		rdbtnYes.setBounds(467, 127, 48, 23);
		frame.getContentPane().add(rdbtnYes);
		
		JRadioButton rdbtnNo = new JRadioButton("No");
		rdbtnNo.setBounds(530, 127, 48, 23);
		frame.getContentPane().add(rdbtnNo);
		
		JCheckBox chckbxWeightndConfiguration = new JCheckBox("Weight 2nd Configuration");
		chckbxWeightndConfiguration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{ if(data.weightpass2()==1) {
					JOptionPane.showMessageDialog(null, "Robot violates <R5>  (must be <=125 lbs (~56kg) excluding bumpers and battery)");
					chckbxWeightndConfiguration.setSelected(false);}
				else {
					JOptionPane.showMessageDialog(null, "Robot follows <R5>");
					ICA++;
				}
			}catch(Exception e4) {
				JOptionPane.showMessageDialog(null, "NO WEIGHT RECORDED", "ERROR", JOptionPane.ERROR_MESSAGE);
				chckbxWeightndConfiguration.setSelected(false);
			}
		}
		});
		chckbxWeightndConfiguration.setBounds(10, 127, 198, 23);
		frame.getContentPane().add(chckbxWeightndConfiguration);
		
		textField_3 = new JFormattedTextField(mascara);
		textField_3.setColumns(10);
		textField_3.setBounds(214, 131, 48, 20);
		frame.getContentPane().add(textField_3);
		
		JLabel label_1 = new JLabel("Lbs");
		label_1.setBounds(285, 131, 46, 14);
		frame.getContentPane().add(label_1);
		
		JCheckBox chckbxFramePerimeter = new JCheckBox("Frame Perimeter");
		chckbxFramePerimeter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ICA++;
			}
		});
		chckbxFramePerimeter.setBounds(10, 153, 143, 23);
		frame.getContentPane().add(chckbxFramePerimeter);
		
		JLabel lblNewLabel = new JLabel("\u2013 Frame must be non-articulated. Minor protrusions <1/4\u201D (6mm) OK.<R1>");
		lblNewLabel.setBounds(159, 157, 459, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JCheckBox chckbxStartingConfiguration = new JCheckBox("Starting Configuration");
		chckbxStartingConfiguration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ICA++;
			}
		});
		chckbxStartingConfiguration.setBounds(10, 179, 164, 23);
		frame.getContentPane().add(chckbxStartingConfiguration);
		
		JLabel lblNewLabel_1 = new JLabel("Parts may not extend beyond the vertical projection of the FRAME PERIMETER. <R2>");
		lblNewLabel_1.setBounds(179, 183, 525, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JCheckBox chckbxStartingVolume = new JCheckBox("Starting Volume");
		chckbxStartingVolume.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ICA++;
			}
		});
		chckbxStartingVolume.setBounds(10, 205, 125, 23);
		frame.getContentPane().add(chckbxStartingVolume);
		
		JLabel lblNewLabel_2 = new JLabel("FRAME PERIMETER Not greater than 120in. (~304 cm) and not taller than 45 in. (~114 cm) <R3> ");
		lblNewLabel_2.setBounds(143, 209, 561, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JCheckBox chckbxPlayingConfiguration = new JCheckBox("Playing  Configuration");
		chckbxPlayingConfiguration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ICA++;
			}
		});
		chckbxPlayingConfiguration.setBounds(10, 231, 154, 23);
		frame.getContentPane().add(chckbxPlayingConfiguration);
		
		JLabel lblRobotMayNot = new JLabel("Robot may not extend beyond the FRAME PERIMETER by more than 12 in. (~30 cm) <R4>");
		lblRobotMayNot.setBounds(169, 234, 512, 14);
		frame.getContentPane().add(lblRobotMayNot);
		
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
				if(ICA==8) {
				InitialInspection initial = new InitialInspection();
				initial.frame.setVisible(false);
				frame.dispose();
				MechanicalInspection mechanical = new MechanicalInspection();
				mechanical.frame.setVisible(true);
			}else {
				
			}
		}});
		btnNext.setBounds(592, 290, 89, 23);
		frame.getContentPane().add(btnNext);
		
		JCheckBox chckbxStandardBumpers = new JCheckBox("Standard Bumpers");
		chckbxStandardBumpers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ICA++;
			}
		});
		chckbxStandardBumpers.setBounds(10, 257, 143, 23);
		frame.getContentPane().add(chckbxStandardBumpers);
		
		JButton lblMustFollowAll = new JButton(" must follow all specifications in Sec. 9.5");
		lblMustFollowAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bumpers window = new Bumpers();
				window.frame.setVisible(true);
			}
		});
		lblMustFollowAll.setBounds(159, 261, 276, 14);
		frame.getContentPane().add(lblMustFollowAll);
		
		JLabel lblAdditionalConfigurations = new JLabel("Additional Configurations");
		lblAdditionalConfigurations.setBounds(318, 127, 143, 23);
		frame.getContentPane().add(lblAdditionalConfigurations);
		
		yes = new JRadioButton("Yes");
		yes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try{ radioButton_1.setSelected(false);
				 DatosdeUsuario.itemsweight();
				 }
				 catch(Exception e3) {
					 yes.setSelected(false);
				 }
			}
		});
		yes.setBounds(116, 101, 48, 23);
		frame.getContentPane().add(yes);
		
		radioButton_1 = new JRadioButton("No");
		radioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 yes.setSelected(false);
			}
		});
		radioButton_1.setBounds(174, 100, 48, 23);
		frame.getContentPane().add(radioButton_1);
	}
}
