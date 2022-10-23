package RobotInspectorAPP;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class MapOfPits {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MapOfPits window = new MapOfPits();
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
	public MapOfPits() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(MapOfPits.class.getResource("/Imagenes/logo.JPG")));
		frame.setBounds(100, 100, 866, 476);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(MapOfPits.class.getResource("/Imagenes/pits.JPG")));
		lblNewLabel.setBounds(10, 11, 679, 415);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnExit = new JButton("Regresar");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MapOfPits window = new MapOfPits();
				window.frame.setVisible(false);
				frame.dispose();
			}
		});
		btnExit.setBounds(751, 403, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JTextPane txtpnMapaDelArea = new JTextPane();
		txtpnMapaDelArea.setFont(new Font("Tahoma", Font.BOLD, 30));
		txtpnMapaDelArea.setContentType("pits\r\n");
		txtpnMapaDelArea.setEditable(false);
		txtpnMapaDelArea.setBackground(UIManager.getColor("Button.background"));
		txtpnMapaDelArea.setText("Mapa Del Area de PITS");
		txtpnMapaDelArea.setBounds(699, 11, 141, 154);
		frame.getContentPane().add(txtpnMapaDelArea);
	}
}
