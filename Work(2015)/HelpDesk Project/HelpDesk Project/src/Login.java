import java.awt.EventQueue;
import java.sql.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.Image;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Cursor;

public class Login {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection connection = null;
	private JTextField txtUserName;
	private JLabel lblNewLabel_3;
	private JPasswordField passwordField;
	private int totalAttempts = 3;
	private JButton btnUnlock;

	/**
	 * Create the application.
	 */
	public Login() 
	{
		initialize();
		connection = AccessConnection.dbConnector();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 398, 432);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblLoginPage = new JLabel("Login Page");
		lblLoginPage.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblLoginPage.setBounds(168, 11, 136, 33);
		frame.getContentPane().add(lblLoginPage);

		txtUserName = new JTextField();
		txtUserName.setBounds(106, 82, 180, 20);
		frame.getContentPane().add(txtUserName);
		txtUserName.setColumns(10);

		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setBounds(24, 85, 72, 14);
		frame.getContentPane().add(lblUserName);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(24, 143, 72, 14);
		frame.getContentPane().add(lblPassword);

		JButton btnLogin = new JButton("Login");
		//set path to image
		Image img2 = new ImageIcon(this.getClass().getResource("/user_login.jpg")).getImage();
		//set new image to Jlabel box
		btnLogin.setIcon(new ImageIcon(img2));
		btnLogin.addActionListener(new ActionListener() 
		{	
			@SuppressWarnings({ "deprecation", "unchecked" })
			public void actionPerformed(ActionEvent arg0)
			{
				try
				{
					//declaring a String variable called query that stores the spl statement
					// *name* = ? is the targeted field you are aiming for
					String query = "Select * from Technician where userName = ? and password = ?";
					//PreparedStatement is an object that represents a precomplied SQL statement.
					PreparedStatement pst = connection.prepareStatement(query);
					//Names of the text box
					pst.setString(1,txtUserName.getText());
					pst.setString(2, passwordField.getText());
					//execute query and return result to the rs object
					ResultSet rs = pst.executeQuery();
					//to get all the results we need a loop			
					
					int counter =0;
					while(rs.next() && totalAttempts !=0)
					{
						counter = counter+1;
					}
					if(counter ==1)
					{
						JOptionPane.showMessageDialog(null, "Login successful");
						frame.dispose();
						Main_page mainform = new Main_page();
						mainform.mainScreen();
					}
					else if(counter >1)
					{
						JOptionPane.showMessageDialog(null, "Duplicate Username and Password exsist");
						JOptionPane.showMessageDialog(null, "Remaning attemps ("+totalAttempts+")");
						totalAttempts--;
					}
					else if(totalAttempts ==0)
					{
						JOptionPane.showMessageDialog(null, "Max login attempts reached!");
						txtUserName.setEditable(false);
						passwordField.setEditable(false);
						btnUnlock.setEnabled(true);
						btnLogin.setEnabled(false);
					}
					else 
					{
						JOptionPane.showMessageDialog(null, "Wrong Username or Password. Redo");
						JOptionPane.showMessageDialog(null, "Remaning attemps ("+totalAttempts+")");
						totalAttempts--;
					}

					rs.close();
					pst.close();
				}catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, e);
				}			
			}
		});	
		btnLogin.setBounds(116, 181, 120, 23);
		frame.getContentPane().add(btnLogin);

		// FOCUS!!!
		frame.getRootPane().setDefaultButton(btnLogin);
		btnLogin.requestFocus();
		

		lblNewLabel_3 = new JLabel("");//set path to image
		Image img = new ImageIcon(this.getClass().getResource("/smallerImage.jpg")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img));
		lblNewLabel_3.setBounds(68,215,249,150);
		frame.getContentPane().add(lblNewLabel_3);
		passwordField = new JPasswordField();
		passwordField.setBounds(106, 140, 180, 20);
		frame.getContentPane().add(passwordField);
		
		btnUnlock = new JButton("Unlock");
		btnUnlock.setEnabled(false);
		btnUnlock.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				JOptionPane.showMessageDialog(null, "Once more");
				txtUserName.setEditable(true);
				txtUserName.setText("");
				passwordField.setEditable(true);
				passwordField.setText("");
				btnUnlock.setEnabled(false);
				btnLogin.setEnabled(true);
				totalAttempts = 3;
			}
		});
		btnUnlock.setBounds(283, 359, 89, 23);
		//btnUnlock.set
		frame.getContentPane().add(btnUnlock);

	}
}
