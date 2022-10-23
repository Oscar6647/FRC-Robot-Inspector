package RobotInspectorAPP;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Table9 {

	 JFrame frame;
	 private JTextPane textPane;
	 private JButton btnReturn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Table9 table = new Table9();
					table.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Table9() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 563, 642);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Inspection.class.getResource("/Imagenes/logo.JPG")));
		frame.getContentPane();
		
		JScrollPane scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.insertIcon(new ImageIcon(MapOfPits.class.getResource("/Imagenes/Captura.JPG")));
		scrollPane.setViewportView(textPane);
		
		btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Table9 table = new Table9();
				table.frame.setVisible(false);
				frame.dispose();
			}
		});
		scrollPane.setColumnHeaderView(btnReturn);
		
	}
}
