package calidad.kiosks.gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;

public class KioskMain {

	private JFrame frame;
	/**
	 * Create the application.
	 */
	public KioskMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.getContentPane().setLayout(null);
		
		JPanel pnlFixErrors = new JPanel();
		pnlFixErrors.setBounds(75, 153, 322, 182);
		pnlFixErrors.setBorder(new LineBorder(new Color(0, 51, 255)));
		frame.getContentPane().add(pnlFixErrors);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\William\\Documents\\eclipse-workspace\\CalidadKioskGui\\images\\fix-errors.png"));
		
		JButton btnNewButton = new JButton("FIX ERROR CODES");
		btnNewButton.setBackground(new Color(0, 51, 255));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Open Sans", Font.BOLD, 19));
		GroupLayout groupLayout = new GroupLayout(pnlFixErrors);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(114)
							.addComponent(label))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(label)
					.addPreferredGap(ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		pnlFixErrors.setLayout(groupLayout);
		
		JPanel pnlHowToPay = new JPanel();
		pnlHowToPay.setBounds(504, 153, 322, 182);
		pnlHowToPay.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		frame.getContentPane().add(pnlHowToPay);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\William\\Documents\\eclipse-workspace\\CalidadKioskGui\\images\\how-to-pay.png"));
		
		JButton btnHowToPay = new JButton("HOW TO PAY");
		btnHowToPay.setForeground(Color.WHITE);
		btnHowToPay.setFont(new Font("Open Sans", Font.BOLD, 19));
		btnHowToPay.setBackground(new Color(0, 51, 255));
		GroupLayout gl_pnlHowToPay = new GroupLayout(pnlHowToPay);
		gl_pnlHowToPay.setHorizontalGroup(
			gl_pnlHowToPay.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlHowToPay.createSequentialGroup()
					.addGroup(gl_pnlHowToPay.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlHowToPay.createSequentialGroup()
							.addGap(119)
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_pnlHowToPay.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnHowToPay, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_pnlHowToPay.setVerticalGroup(
			gl_pnlHowToPay.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlHowToPay.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
					.addComponent(btnHowToPay, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		pnlHowToPay.setLayout(gl_pnlHowToPay);
		
		JPanel pnlInstallationHelp = new JPanel();
		pnlInstallationHelp.setBounds(946, 153, 322, 182);
		pnlInstallationHelp.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		frame.getContentPane().add(pnlInstallationHelp);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\William\\Documents\\eclipse-workspace\\CalidadKioskGui\\images\\installation-help.png"));
		
		JButton btnInstallationHelp = new JButton("INSTALLATION HELP");
		btnInstallationHelp.setForeground(Color.WHITE);
		btnInstallationHelp.setFont(new Font("Open Sans", Font.BOLD, 19));
		btnInstallationHelp.setBackground(new Color(0, 51, 255));
		GroupLayout gl_pnlInstallationHelp = new GroupLayout(pnlInstallationHelp);
		gl_pnlInstallationHelp.setHorizontalGroup(
			gl_pnlInstallationHelp.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlInstallationHelp.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlInstallationHelp.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_pnlInstallationHelp.createSequentialGroup()
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addGap(118))
						.addGroup(Alignment.TRAILING, gl_pnlInstallationHelp.createSequentialGroup()
							.addComponent(btnInstallationHelp, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
							.addContainerGap())))
		);
		gl_pnlInstallationHelp.setVerticalGroup(
			gl_pnlInstallationHelp.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlInstallationHelp.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
					.addComponent(btnInstallationHelp, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		pnlInstallationHelp.setLayout(gl_pnlInstallationHelp);
		
		JPanel pnlChangePackage = new JPanel();
		pnlChangePackage.setBounds(504, 397, 322, 182);
		pnlChangePackage.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		frame.getContentPane().add(pnlChangePackage);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("C:\\Users\\William\\Documents\\eclipse-workspace\\CalidadKioskGui\\images\\change-my-package.png"));
		
		JButton btnSwitchPackage = new JButton("SWITCH PACKAGE");
		btnSwitchPackage.setForeground(Color.WHITE);
		btnSwitchPackage.setFont(new Font("Open Sans", Font.BOLD, 19));
		btnSwitchPackage.setBackground(new Color(0, 51, 255));
		GroupLayout gl_pnlChangePackage = new GroupLayout(pnlChangePackage);
		gl_pnlChangePackage.setHorizontalGroup(
			gl_pnlChangePackage.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlChangePackage.createSequentialGroup()
					.addGroup(gl_pnlChangePackage.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlChangePackage.createSequentialGroup()
							.addGap(80)
							.addComponent(label_4))
						.addGroup(Alignment.TRAILING, gl_pnlChangePackage.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnSwitchPackage, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_pnlChangePackage.setVerticalGroup(
			gl_pnlChangePackage.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlChangePackage.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
					.addComponent(btnSwitchPackage, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		pnlChangePackage.setLayout(gl_pnlChangePackage);
		
		JPanel pnlBalances = new JPanel();
		pnlBalances.setBounds(946, 397, 322, 182);
		pnlBalances.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		frame.getContentPane().add(pnlBalances);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon("C:\\Users\\William\\Documents\\eclipse-workspace\\CalidadKioskGui\\images\\view-my-balances.png"));
		
		JButton btnAccountBalances = new JButton("ACCOUNT BALANCES");
		btnAccountBalances.setForeground(Color.WHITE);
		btnAccountBalances.setFont(new Font("Open Sans", Font.BOLD, 19));
		btnAccountBalances.setBackground(new Color(0, 51, 255));
		GroupLayout gl_pnlBalances = new GroupLayout(pnlBalances);
		gl_pnlBalances.setHorizontalGroup(
			gl_pnlBalances.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlBalances.createSequentialGroup()
					.addGroup(gl_pnlBalances.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlBalances.createSequentialGroup()
							.addGap(120)
							.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnlBalances.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnAccountBalances, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_pnlBalances.setVerticalGroup(
			gl_pnlBalances.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlBalances.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
					.addComponent(btnAccountBalances, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		pnlBalances.setLayout(gl_pnlBalances);
		
		JPanel pnlDeviceHelp = new JPanel();
		pnlDeviceHelp.setBounds(75, 397, 322, 182);
		pnlDeviceHelp.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		frame.getContentPane().add(pnlDeviceHelp);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("C:\\Users\\William\\Documents\\eclipse-workspace\\CalidadKioskGui\\images\\device-help.png"));
		
		JButton btnDeviceHelp = new JButton("DEVICE HELP");
		btnDeviceHelp.setForeground(Color.WHITE);
		btnDeviceHelp.setFont(new Font("Open Sans", Font.BOLD, 19));
		btnDeviceHelp.setBackground(new Color(0, 51, 255));
		GroupLayout gl_pnlDeviceHelp = new GroupLayout(pnlDeviceHelp);
		gl_pnlDeviceHelp.setHorizontalGroup(
			gl_pnlDeviceHelp.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlDeviceHelp.createSequentialGroup()
					.addGroup(gl_pnlDeviceHelp.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlDeviceHelp.createSequentialGroup()
							.addGap(121)
							.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_pnlDeviceHelp.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnDeviceHelp, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_pnlDeviceHelp.setVerticalGroup(
			gl_pnlDeviceHelp.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlDeviceHelp.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
					.addComponent(btnDeviceHelp, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		pnlDeviceHelp.setLayout(gl_pnlDeviceHelp);
		
		JPanel header = new JPanel();
		header.setBackground(new Color(0, 51, 255));
		header.setBounds(0, 0, 1373, 93);
		frame.getContentPane().add(header);
		
		JPanel footer = new JPanel();
		footer.setBackground(new Color(0, 51, 255));
		footer.setBounds(0, 645, 1373, 70);
		frame.getContentPane().add(footer);

		frame.setVisible(true);
	}
}
