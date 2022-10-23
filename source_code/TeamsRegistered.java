package RobotInspectorAPP;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Toolkit;

public class TeamsRegistered {

	public Object row;
	JFrame frame;
	public static JTable table_2;
	public JTextField Numero;
	public JTextField NOMBRE;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeamsRegistered window = new TeamsRegistered();
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
	public TeamsRegistered() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(TeamsRegistered.class.getResource("/Imagenes/logo.JPG")));
		frame.setBounds(100, 100, 602, 341);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 419, 285);
		frame.getContentPane().add(scrollPane);
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Numero de Equipo", "Nombre del Equipo"
			}
		));
		table_2.getColumnModel().getColumn(0).setPreferredWidth(101);
		table_2.getColumnModel().getColumn(1).setPreferredWidth(103);
		frame.getContentPane().setLayout(null);
		scrollPane.setViewportView(table_2);
		JButton btnRemoverEquipos = new JButton("Remover Equipos");
		btnRemoverEquipos.setBounds(439, 38, 136, 23);
		btnRemoverEquipos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			int i=table_2.getSelectedRow();
			if(i>=0) {
				((DefaultTableModel)table_2.getModel()).removeRow(i);
			}
			}
		});
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.setIcon(null);
		btnRegresar.setBounds(460, 273, 115, 23);
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TeamsRegistered window = new TeamsRegistered();
				window.frame.setVisible(false);
				frame.dispose();
			}
		});
		JButton btnAgregarEquipos = new JButton("Agregar Equipos");
		btnAgregarEquipos.setBounds(439, 11, 136, 23);
		btnAgregarEquipos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int Col=table_2.getModel().getColumnCount();
				Object[] row= new Object[Col];
				row[0]= Numero.getText();
				row[1]= NOMBRE.getText();
				((DefaultTableModel)table_2.getModel()).addRow(row);}
		});
		frame.getContentPane().add(btnAgregarEquipos);
		frame.getContentPane().add(btnRemoverEquipos);
		frame.getContentPane().add(btnRegresar);
		
		Numero = new JTextField();
		Numero.setBounds(439, 72, 86, 20);
		frame.getContentPane().add(Numero);
		Numero.setColumns(10);
		
		JLabel lblNumero = new JLabel("Numero");
		lblNumero.setBounds(530, 75, 46, 14);
		frame.getContentPane().add(lblNumero);
		
		NOMBRE = new JTextField();
		NOMBRE.setColumns(10);
		NOMBRE.setBounds(439, 103, 86, 20);
		frame.getContentPane().add(NOMBRE);
		
		JLabel lblNombre = new JLabel("NOMBRE");
		lblNombre.setBounds(530, 106, 46, 14);
		frame.getContentPane().add(lblNombre);
		;
		
	
	}
}
