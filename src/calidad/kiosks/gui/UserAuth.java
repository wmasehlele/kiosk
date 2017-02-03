package calidad.kiosks.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class UserAuth {

	private JFrame frame;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	/**
	 * @wbp.nonvisual location=1247,749
	 */
	//private final JButton button = new JButton("New button");
	private JLabel lblUsername;
	private JLabel lblPassword;
	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public UserAuth() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 51, 255));
		frame.getContentPane().setFont(new Font("Open Sans", Font.PLAIN, 14));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

		txtPassword = new JPasswordField();
		txtPassword.setForeground(new Color(0, 0, 0));
		txtPassword.setFont(new Font("Open Sans", Font.PLAIN, 14));
		txtPassword.setBackground(UIManager.getColor("Button.background"));
		txtPassword.setHorizontalAlignment(SwingConstants.LEFT);
		txtPassword.setColumns(20);
		
		txtUsername = new JTextField();
		txtUsername.setForeground(new Color(0, 0, 0));
		txtUsername.setBackground(UIManager.getColor("Button.background"));
		txtUsername.setFont(new Font("Open Sans", Font.PLAIN, 14));
		txtUsername.setHorizontalAlignment(SwingConstants.LEFT);
		txtUsername.setColumns(20);
		
		JButton btnLogin = new JButton("LOG IN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new KioskMain();
			}
		});
		btnLogin.setFont(new Font("Open Sans", Font.PLAIN, 14));
		
		JLabel lblForgotPassword = new JLabel("Forgot Password?");
		lblForgotPassword.setForeground(new Color(255, 255, 255));
		lblForgotPassword.setFont(new Font("Open Sans", Font.PLAIN, 12));
		
		JLabel lblRegister = new JLabel("Register");
		lblRegister.setForeground(new Color(255, 255, 255));
		lblRegister.setFont(new Font("Open Sans", Font.PLAIN, 12));
		
		lblUsername = new JLabel("Username");
		lblUsername.setForeground(new Color(255, 255, 255));
		lblUsername.setFont(new Font("Open Sans", Font.PLAIN, 15));
		
		lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setFont(new Font("Open Sans", Font.PLAIN, 15));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(473)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblUsername)
						.addComponent(lblPassword))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblForgotPassword)
							.addPreferredGap(ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
							.addComponent(lblRegister))
						.addComponent(btnLogin, GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
						.addComponent(txtPassword)
						.addComponent(txtUsername, GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))
					.addGap(542))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(308, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtUsername, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblUsername, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblForgotPassword)
						.addComponent(lblRegister, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addGap(271))
		);
		frame.getContentPane().setLayout(groupLayout);
		frame.setVisible(true);
	}
}
