package RobotInspectorAPP;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import java.awt.Toolkit;

public class TeamsReadytoCompete {

 JFrame frmTeamsReadyTo;
	private static JTable Passed;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeamsReadytoCompete window = new TeamsReadytoCompete();
					window.frmTeamsReadyTo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TeamsReadytoCompete() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTeamsReadyTo = new JFrame();
		frmTeamsReadyTo.setIconImage(Toolkit.getDefaultToolkit().getImage(TeamsReadytoCompete.class.getResource("/Imagenes/logo.JPG")));
		frmTeamsReadyTo.setTitle("Teams Ready to Compete");
		frmTeamsReadyTo.setBounds(100, 100, 450, 300);
		frmTeamsReadyTo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTeamsReadyTo.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(55, 45, 379, 216);
		frmTeamsReadyTo.getContentPane().add(scrollPane);
		
		Passed = new JTable();
		Passed.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Team#"
			}
		));
		scrollPane.setViewportView(Passed);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TeamsReadytoCompete window = new TeamsReadytoCompete();
				window.frmTeamsReadyTo.setVisible(false);
				frmTeamsReadyTo.dispose();
			}
		});
		btnRegresar.setBounds(0, 11, 89, 23);
		frmTeamsReadyTo.getContentPane().add(btnRegresar);
		
	}public static void  AddRow(Object[]datarow) {
			DefaultTableModel model =(DefaultTableModel)Passed.getModel();
			model.addRow(datarow);
		}
}
