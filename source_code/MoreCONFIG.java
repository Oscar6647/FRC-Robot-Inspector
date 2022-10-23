package RobotInspectorAPP;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;


public class MoreCONFIG {

	JFrame frame;
	public static JTable table;
	public static JFormattedTextField weight;
	public static JFormattedTextField textField;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MoreCONFIG MORE = new MoreCONFIG();
					MORE.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MoreCONFIG() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 651, 337);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Inspection.class.getResource("/Imagenes/logo.JPG")));
		frame.getContentPane().setLayout(null);
		JTextPane txtpnWireSizeConventions = new JTextPane();
		txtpnWireSizeConventions.setBounds(0, 0, 434, 40);
		txtpnWireSizeConventions.setToolTipText("");
		txtpnWireSizeConventions.setForeground(new Color(0, 0, 0));
		txtpnWireSizeConventions.setEditable(false);
		txtpnWireSizeConventions.setBackground(UIManager.getColor("Button.background"));
		txtpnWireSizeConventions.setFont(new Font("Tahoma", Font.BOLD, 28));
		txtpnWireSizeConventions.setText("More Configurations");
		frame.getContentPane().add(txtpnWireSizeConventions);	
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 40, 434, 221);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Configuration #", "Weight (lbs)"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(100);
		frame.getContentPane().setLayout(null);
		scrollPane.setViewportView(table);
		JButton btnRemoverEquipos = new JButton("Remove Configuration");
		btnRemoverEquipos.setBounds(444, 69, 160, 23);
		btnRemoverEquipos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			int i=table.getSelectedRow();
			if(i>=0) {
				((DefaultTableModel)table.getModel()).removeRow(i);
			}
			}
		});
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.setIcon(null);
		btnRegresar.setBounds(489, 264, 115, 23);
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MoreCONFIG MORE = new MoreCONFIG();
				MORE.frame.setVisible(false);
				frame.dispose();
			}
		});
		final DatosdeUsuario data= new DatosdeUsuario();
		JButton btnAgregarEquipos = new JButton("Add Configuration");
		btnAgregarEquipos.setBounds(444, 43, 160, 23);
		btnAgregarEquipos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					try{if(data.otherconfig()==1) {
					JOptionPane.showMessageDialog(null, "Robot violates <R5>  (must be <=125 lbs (~56kg) excluding bumpers and battery)");
				}
				else {
		btnAgregarEquipos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				int Col=table.getModel().getColumnCount();
				Object[] row= new Object[Col];
				row[1]= weight.getText();
				row[0]= textField.getText();
				((DefaultTableModel)table.getModel()).addRow(row);}
			
		});
				}
	} catch(Exception e1) {
		JOptionPane.showMessageDialog(null, "No Input was made","ERROR", JOptionPane.ERROR_MESSAGE);
	}
			}
});
		frame.getContentPane().add(btnAgregarEquipos);
		frame.getContentPane().add(btnRemoverEquipos);
		frame.getContentPane().add(btnRegresar);
		MaskFormatter mascara = null;
		try {
			mascara = new MaskFormatter("###.##");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		weight = new JFormattedTextField(mascara);
		weight.setColumns(10);
		weight.setBounds(439, 103, 86, 20);
		frame.getContentPane().add(weight);
	
		
		JLabel lblWeight = new JLabel("Weight");
		lblWeight.setBounds(530, 106, 46, 14);
		frame.getContentPane().add(lblWeight);
		
		JButton btnCompleted = new JButton("Completed");
		btnCompleted.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MoreCONFIG MORE = new MoreCONFIG();
				MORE.frame.setVisible(false);
				frame.dispose();
			}
		});
		btnCompleted.setBounds(0, 264, 115, 23);
		frame.getContentPane().add(btnCompleted);
		MaskFormatter number = null;
		try {
			number = new MaskFormatter("###");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		textField = new JFormattedTextField(number);
		textField.setColumns(10);
		textField.setBounds(439, 134, 86, 20);
		frame.getContentPane().add(textField);
		
		JLabel lblConfiguration = new JLabel("Configuration #");
		lblConfiguration.setBounds(530, 137, 105, 14);
		frame.getContentPane().add(lblConfiguration);
	}
}
