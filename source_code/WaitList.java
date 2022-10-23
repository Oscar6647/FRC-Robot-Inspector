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

public class WaitList {

	private static JTable Onwait;
	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WaitList window = new WaitList();
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
	public WaitList() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(WaitList.class.getResource("/Imagenes/logo.JPG")));
		frame.setTitle("Teams Waiting");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(55, 45, 379, 216);
		frame.getContentPane().add(scrollPane);
		
		Onwait = new JTable();
		Onwait.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Team#"
			}
		));
		scrollPane.setViewportView(Onwait);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				WaitList window = new WaitList();
				window.frame.setVisible(false);
				frame.dispose();
			}
		});
		btnRegresar.setBounds(0, 11, 89, 23);
		frame.getContentPane().add(btnRegresar);
	}
	public static void  AddRow(Object[]datarow) {
		DefaultTableModel model =(DefaultTableModel)Onwait.getModel();
		model.addRow(datarow);
	}
}