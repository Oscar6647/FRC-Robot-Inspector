package RobotInspectorAPP;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Toolkit;

public class NOTREADY {
	private static JTable NO;
 JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NOTREADY window = new NOTREADY();
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
	public NOTREADY() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(NOTREADY.class.getResource("/Imagenes/logo.JPG")));
		frame.setTitle("Teams NOT Ready to Compete");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(55, 45, 379, 216);
		frame.getContentPane().add(scrollPane);
		
		NO = new JTable();
		NO.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Team#"
				}
			));
		scrollPane.setViewportView(NO);
	
		JButton btnRegresar = new JButton("Regresar");
	btnRegresar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			NOTREADY window = new NOTREADY();
			window.frame.setVisible(false);
			frame.dispose();
		}
	});
		btnRegresar.setBounds(0, 11, 89, 23);
		frame.getContentPane().add(btnRegresar);
	}
	public static void  AddRow(Object[]datarow) {
		DefaultTableModel model =(DefaultTableModel)NO.getModel();
		model.addRow(datarow);
	}
}
