package PairCardGame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;

public class ConnectGUI extends JFrame {

	private JPanel contentPane;
	private JTextField IPaddr;
	private String ip;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConnectGUI frame = new ConnectGUI();
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
	public ConnectGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Login");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		
		JLabel lblServerIpAddress = new JLabel("Server IP Address");
		lblServerIpAddress.setBounds(34, 96, 140, 15);
		lblServerIpAddress.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(lblServerIpAddress);
		
		IPaddr = new JTextField();
		IPaddr.setBounds(172, 93, 174, 21);
		contentPane.add(IPaddr);
		IPaddr.setColumns(10);
		
		JButton btnConnect = new JButton("Connect");
		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ip = IPaddr.getText();
				setVisible(false);
			}
		});
		
		
		btnConnect.setBounds(145, 160, 87, 23);
		contentPane.add(btnConnect);
		
		JLabel srverMsg = new JLabel("");
		srverMsg.setBounds(34, 37, 312, 15);
		srverMsg.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(srverMsg);
		
	}
	
	public String start() {
		setVisible(true);
		
		return ip;
	}

}
