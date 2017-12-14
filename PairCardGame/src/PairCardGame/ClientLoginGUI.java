package PairCardGame;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ClientLoginGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientLoginGUI frame = new ClientLoginGUI();
					frame.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ClientLoginGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Login");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(97, 63, 76, 15);
		lblUsername.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(97, 107, 76, 15);
		lblPassword.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(172, 60, 142, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(172, 105, 142, 18);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// call login function
				
			}
		});
		btnLogin.setBounds(100, 157, 87, 23);
		contentPane.add(btnLogin);
		
		JButton btnCancel = new JButton("Sign up");
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// turn to sign up page
			}
		});
		btnCancel.setBounds(227, 157, 87, 23);
		contentPane.add(btnCancel);
		
		JLabel srverMsg = new JLabel("");
		srverMsg.setBounds(97, 32, 217, 15);
		srverMsg.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(srverMsg);
	}
	
}
