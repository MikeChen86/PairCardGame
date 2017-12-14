package PairCardGame;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class SignUpGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpGUI frame = new SignUpGUI();
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
	public SignUpGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Sign Up");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(60, 68, 112, 15);
		lblUsername.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(60, 115, 112, 15);
		lblPassword.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(172, 65, 142, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(172, 113, 142, 18);
		contentPane.add(passwordField);
		
		JButton btnCancel = new JButton("Sign up");
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// call sign up function
			}
		});
		btnCancel.setBounds(85, 206, 87, 23);
		contentPane.add(btnCancel);
		
		JLabel srverMsg = new JLabel("");
		srverMsg.setBounds(97, 32, 217, 15);
		srverMsg.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(srverMsg);
		
		JButton btnCancel_1 = new JButton("Cancel");
		btnCancel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//turn to login page
			}
		});
		btnCancel_1.setBounds(227, 206, 87, 23);
		contentPane.add(btnCancel_1);
		
		JLabel lblComPassLabel = new JLabel("Confirm Password");
		lblComPassLabel.setBounds(60, 162, 112, 15);
		lblComPassLabel.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(lblComPassLabel);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(172, 160, 142, 18);
		contentPane.add(passwordField_1);
	}
}
