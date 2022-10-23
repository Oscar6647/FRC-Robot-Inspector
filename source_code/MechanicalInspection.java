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
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class MechanicalInspection {

	JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MechanicalInspection mechanical = new MechanicalInspection();
					mechanical.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MechanicalInspection() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 727, 357);
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
		
		final DatosdeUsuario data= new DatosdeUsuario();
		JCheckBox chckbxBomCost = new JCheckBox("BOM Cost");
		chckbxBomCost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		chckbxBomCost.setBounds(10, 50, 97, 23);
		frame.getContentPane().add(chckbxBomCost);
		
		MaskFormatter mascara = null;
		try {
			mascara = new MaskFormatter("#####");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		textField = new JFormattedTextField(mascara);
		textField.setBounds(341, 51, 62, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblTotalCostOf = new JLabel("Total Cost of Robot Production USD $");
		lblTotalCostOf.setBounds(113, 54, 239, 14);
		frame.getContentPane().add(lblTotalCostOf);
		
		JCheckBox chckbxNoSharpEdges = new JCheckBox("No Sharp Edges or Protrusions that are a hazard for participants, robots, arena, or field");
		chckbxNoSharpEdges.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxNoSharpEdges.setBounds(10, 87, 563, 23);
		frame.getContentPane().add(chckbxNoSharpEdges);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("No Prohibited Materials");
		chckbxNewCheckBox.setBounds(10, 113, 174, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JLabel lblEgSoundLasers = new JLabel("e.g. sound, lasers (other than class 1), flammable gases, or untreated hazardous materials");
		lblEgSoundLasers.setBounds(190, 117, 524, 14);
		frame.getContentPane().add(lblEgSoundLasers);
		
		JCheckBox chckbxNoUnsafeEnergy = new JCheckBox("NO Unsafe Energy Storage Devices");
		chckbxNoUnsafeEnergy.setBounds(10, 139, 223, 23);
		frame.getContentPane().add(chckbxNoUnsafeEnergy);
		
		JLabel lblCarefullyConsiderSafety = new JLabel("carefully consider safety of stored energy or pneumatic systems");
		lblCarefullyConsiderSafety.setBounds(239, 143, 524, 14);
		frame.getContentPane().add(lblCarefullyConsiderSafety);
		
		JCheckBox chckbxNoRiskOf = new JCheckBox("No Risk of Damage to Other Robots");
		chckbxNoRiskOf.setBounds(10, 165, 223, 23);
		frame.getContentPane().add(chckbxNoRiskOf);
		
		JLabel lblEgDamagingEntangling = new JLabel(" e.g. damaging, entangling, upending or adhering");
		lblEgDamagingEntangling.setBounds(239, 169, 524, 14);
		frame.getContentPane().add(lblEgDamagingEntangling);
		
		JCheckBox chckbxNoRiskOf_1 = new JCheckBox("No Risk of Damage to Field ");
		chckbxNoRiskOf_1.setBounds(10, 191, 223, 23);
		frame.getContentPane().add(chckbxNoRiskOf_1);
		
		JLabel lblEgMetalCleats = new JLabel("e.g. metal cleats on traction devices or sharp points on frame. ");
		lblEgMetalCleats.setBounds(239, 195, 524, 14);
		frame.getContentPane().add(lblEgMetalCleats);
		
		JCheckBox chckbxDecorations = new JCheckBox("Decorations");
		chckbxDecorations.setBounds(10, 217, 97, 23);
		frame.getContentPane().add(chckbxDecorations);
		
		JLabel lblCannotInterfereWith = new JLabel("Cannot interfere with other robots\u2019 electronics or sensors, be in spirit of \u201CGracious Professionalism\u201D");
		lblCannotInterfereWith.setBounds(113, 221, 583, 14);
		frame.getContentPane().add(lblCannotInterfereWith);
		
		JCheckBox chckbxEndGame = new JCheckBox("End Game");
		chckbxEndGame.setBounds(10, 243, 97, 23);
		frame.getContentPane().add(chckbxEndGame);
		
		JLabel lblNewLabel = new JLabel(" Game pieces can be removed from robot and robot from field without power. ");
		lblNewLabel.setBounds(113, 246, 524, 14);
		frame.getContentPane().add(lblNewLabel);
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MechanicalInspection mechanical = new MechanicalInspection();
				mechanical.frame.setVisible(false);
				frame.dispose();
				InitialInspection initial = new InitialInspection();
				initial.frame.setVisible(true);
			}
		});
		btnRegresar.setBounds(10, 290, 89, 23);
		frame.getContentPane().add(btnRegresar);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MechanicalInspection mechanical = new MechanicalInspection();
				mechanical.frame.setVisible(false);
				frame.dispose();
				ElecticalInspection electrical = new ElecticalInspection();
				electrical.frame.setVisible(true);
			}
		});
		btnNext.setBounds(592, 290, 89, 23);
		frame.getContentPane().add(btnNext);
	}
}
