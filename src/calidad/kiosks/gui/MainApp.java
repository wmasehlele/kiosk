package calidad.kiosks.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import java.awt.FlowLayout;

public class MainApp {

	private JFrame frmCalidadTechnology;

	static Timer loadTimer;
	static int loadTimerCounter;
	private static MainApp window; 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				window = new MainApp();
				try {
					window.frmCalidadTechnology.setExtendedState(JFrame.MAXIMIZED_BOTH);
					window.frmCalidadTechnology.setVisible(true);
					splashScreen();
				} catch (Exception e) {
					e.printStackTrace();
				}			
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalidadTechnology = new JFrame();
		frmCalidadTechnology.getContentPane().setBackground(new Color(0, 51, 255));
		frmCalidadTechnology.setForeground(new Color(0, 0, 255));
		frmCalidadTechnology.setBackground(new Color(0, 0, 255));
		frmCalidadTechnology.setBounds(100, 100, 841, 507);
		frmCalidadTechnology.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalidadTechnology.setUndecorated(true);
		frmCalidadTechnology.getContentPane().setLayout(new BorderLayout(0, 0));
				
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\William\\Documents\\eclipse-workspace\\CalidadKioskGui\\images\\DStv.PNG"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frmCalidadTechnology.getContentPane().add(lblNewLabel);
	}
	
	private static void splashScreen(){
		try{
			loadTimer = new Timer(1000, new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if (loadTimerCounter > 1){
						loadTimer.stop();
						window.frmCalidadTechnology.setVisible(false);
						new UserAuth();
					}else{
						loadTimerCounter++;
					}
				}
			});
			loadTimer.start();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}

