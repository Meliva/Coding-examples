
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.sql.*;
import java.util.InputMismatchException;
import javax.swing.*;
import javax.swing.table.*;
import net.proteanit.sql.DbUtils;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class Main_page {

	private JFrame mainframe;
	private JLabel label;
	private JLabel label_4;
	private JLabel label_3;
	private JLabel label_2;
	private JLabel label_1;
	private JPanel panelHome;
	private JPanel panelListOfCust;
	private JPanel panelAddJobdetail;
	private JPanel panelAddCust;
	private JPanel panelAddjob;
	private JButton btnBack;
	private JButton btnBack_1;
	private JButton btnBack_2;
	private JButton btnBack_4;

	private JScrollPane scrollPane;
	private JButton btnExit;
	private JButton btnExit_1;
	private JButton btnExit_2;
	private JButton btnExit_3;
	private JButton btnExit_4;
	private JTextField txtCustomerAddress;
	private JTextField txtCustomerName;
	private JTextField txtCustomerID;
	private JTable ATable;
	private JLabel lblListOfCustomers_1;
	private JLabel lblCustomerName_1;
	private JComboBox comboBoxJob;
	private JLabel lblDateddmmyy;
	private JTextField txtDate;
	private JLabel lblJobDescription;
	private JTextField txtcomputername;
	private JComboBox JobcomboBox;
	private JComboBox TechcomboBox_1;
	private JTextField txtdesc;
	private JTextField txtID;
	private JTextField txtJobID;
	private JLabel lblId;
	private JScrollPane scrollpane;
	private JTable ThisTable;
	private JTextField txtdate;
	private JTextField txtTimeSpent;
	private JTextField txtDetailID;
	private JTable Detailtable;
	private JTextField txtTechID;
	private JTextField textdetail;
	private JPanel panelExtra;
	private JButton btnAddTech;
	private JTable tableTech;
	private JLabel lblImages;
	private JLabel label_5;
	private JButton btnAdd;
	private JButton btnDelete_1;
	private JButton btnUpdate_1;

	/**
	 * Launch the application.
	 */
	public static void mainScreen() 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try {
					Main_page window = new Main_page();
					window.mainframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Connection connection = null;
	private JButton btnExit_5;
	private JSeparator separator;
	private JTextField txtTech_ID;
	private JTextField txtUser_Name;
	private JTextField txtTech_Password;
	private JTextField txtTech_Name;
	private JLabel lblName;
	private JButton btnDelete;
	private JButton btnDelete_2;
	private JButton btnDelete_3;
	private JButton btnUpdateJob;
	private JButton btnLogOut;
	private JButton btnLogOut_1;
	private JButton btnLogOut_2;
	private JButton btnLogOut_3;
	private JButton btnLogOut_4;
	private JTable People;



	/**
	 * Create the application.
	 */

	public Main_page() 
	{
		connection = AccessConnection.dbConnector();
		initialize();
	}

	public void refreshTable()
	{
		try
		{
			String query = "Select custID, custName, custAddress from Customer";
			PreparedStatement pst = connection.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			ATable.setModel(DbUtils.resultSetToTableModel(rs));					
			//Set size of table			
			TableColumnModel tcm = ATable.getColumnModel();
			tcm.getColumn(0).setPreferredWidth(5);
			tcm.getColumn(1).setPreferredWidth(50);
			tcm.getColumn(2).setPreferredWidth(200);
			// change column header	
			JTableHeader th = ATable.getTableHeader();
			TableColumnModel tcm2 = th.getColumnModel();
			TableColumn tc1 = tcm2.getColumn(0);
			tc1.setHeaderValue("ID");
			th.repaint();
			JTableHeader th2 = ATable.getTableHeader();
			TableColumnModel tcm3 = th2.getColumnModel();
			TableColumn tc2 = tcm3.getColumn(1);
			tc2.setHeaderValue("Name");
			th.repaint();
			JTableHeader th3 = ATable.getTableHeader();
			TableColumnModel tcm4 = th3.getColumnModel();
			TableColumn tc3 = tcm4.getColumn(2);
			tc3.setHeaderValue("Address");
			th.repaint();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	public void refreshTable_2()
	{
		try
		{
			String query = "Select jobID, custReName, theDate, jobDesc, computer, custID  from JobTable";
			PreparedStatement pst = connection.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			ThisTable.setModel(DbUtils.resultSetToTableModel(rs));					
			//Set size of table			
			TableColumnModel tcm = ThisTable.getColumnModel();
			tcm.getColumn(0).setPreferredWidth(25);
			tcm.getColumn(1).setPreferredWidth(25);
			tcm.getColumn(2).setPreferredWidth(25);
			tcm.getColumn(3).setPreferredWidth(50);
			tcm.getColumn(4).setPreferredWidth(50);
			tcm.getColumn(5).setPreferredWidth(50);
			// change column header	
			JTableHeader th = ThisTable.getTableHeader();
			TableColumnModel tcm2 = th.getColumnModel();
			TableColumn tc1 = tcm2.getColumn(0);
			tc1.setHeaderValue("Job ID");
			th.repaint();
			JTableHeader th2 = ThisTable.getTableHeader();
			TableColumnModel tcm3 = th2.getColumnModel();
			TableColumn tc2 = tcm3.getColumn(1);
			tc2.setHeaderValue("Name");
			th.repaint();
			JTableHeader th3 = ThisTable.getTableHeader();
			TableColumnModel tcm4 = th3.getColumnModel();
			TableColumn tc3 = tcm4.getColumn(2);
			tc3.setHeaderValue("Date");
			th.repaint();
			JTableHeader th4 = ThisTable.getTableHeader();
			TableColumnModel tcm5 = th4.getColumnModel();
			TableColumn tc4 = tcm5.getColumn(3);
			tc4.setHeaderValue("Job");
			th.repaint();
			JTableHeader th5 = ThisTable.getTableHeader();
			TableColumnModel tcm6 = th5.getColumnModel();
			TableColumn tc5 = tcm6.getColumn(4);
			tc5.setHeaderValue("Computer");
			th.repaint();
			JTableHeader th6 = ThisTable.getTableHeader();
			TableColumnModel tcm7 = th6.getColumnModel();
			TableColumn tc6 = tcm7.getColumn(5);
			tc6.setHeaderValue("CustID");
			th.repaint();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	public void refreshTable_3()
	{
		try
		{
			String query = "Select jobnoteID, techName, dateCompleted, jobNotes, timeSpent, jobID  from Jobdetail";
			PreparedStatement pst = connection.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			Detailtable.setModel(DbUtils.resultSetToTableModel(rs));					
			//Set size of table			
			TableColumnModel tcm = Detailtable.getColumnModel();
			tcm.getColumn(0).setPreferredWidth(25);
			tcm.getColumn(1).setPreferredWidth(25);
			tcm.getColumn(2).setPreferredWidth(45);
			tcm.getColumn(3).setPreferredWidth(60);
			tcm.getColumn(4).setPreferredWidth(25);
			tcm.getColumn(5).setPreferredWidth(25);
			// change column header	
			JTableHeader th = Detailtable.getTableHeader();
			TableColumnModel tcm2 = th.getColumnModel();
			TableColumn tc1 = tcm2.getColumn(0);
			tc1.setHeaderValue("Detail ID");
			th.repaint();
			JTableHeader th2 = Detailtable.getTableHeader();
			TableColumnModel tcm3 = th2.getColumnModel();
			TableColumn tc2 = tcm3.getColumn(1);
			tc2.setHeaderValue("Tech Name");
			th.repaint();
			JTableHeader th3 = Detailtable.getTableHeader();
			TableColumnModel tcm4 = th3.getColumnModel();
			TableColumn tc3 = tcm4.getColumn(2);
			tc3.setHeaderValue("Date Completed");
			th.repaint();
			JTableHeader th4 = Detailtable.getTableHeader();
			TableColumnModel tcm5 = th4.getColumnModel();
			TableColumn tc4 = tcm5.getColumn(3);
			tc4.setHeaderValue("Job Notes");
			th.repaint();
			JTableHeader th5 = Detailtable.getTableHeader();
			TableColumnModel tcm6 = th5.getColumnModel();
			TableColumn tc5 = tcm6.getColumn(4);
			tc5.setHeaderValue("Time(min)");
			th.repaint();
			JTableHeader th6 = Detailtable.getTableHeader();
			TableColumnModel tcm7 = th6.getColumnModel();
			TableColumn tc6 = tcm7.getColumn(5);
			tc6.setHeaderValue("Job ID");
			th.repaint();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	public void TechTable()
	{
		try
		{
			String query = "Select techID, techName, UserName, image from Technician";
			PreparedStatement pst = connection.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			tableTech.setModel(DbUtils.resultSetToTableModel(rs));					
			//Set size of table			
			TableColumnModel tcm = tableTech.getColumnModel();
			tcm.getColumn(0).setPreferredWidth(25);
			tcm.getColumn(1).setPreferredWidth(25);
			tcm.getColumn(2).setPreferredWidth(25);
			tcm.getColumn(4).setPreferredWidth(25);
			// change column header	
			JTableHeader th = tableTech.getTableHeader();
			TableColumnModel tcm2 = th.getColumnModel();
			TableColumn tc1 = tcm2.getColumn(0);
			tc1.setHeaderValue("Tech ID");
			th.repaint();
			JTableHeader th2 = tableTech.getTableHeader();
			TableColumnModel tcm3 = th2.getColumnModel();
			TableColumn tc2 = tcm3.getColumn(1);
			tc2.setHeaderValue("Tech Name");
			th.repaint();
			JTableHeader th3 = tableTech.getTableHeader();
			TableColumnModel tcm4 = th3.getColumnModel();
			TableColumn tc3 = tcm4.getColumn(2);
			tc3.setHeaderValue("User Name");
			th.repaint();
			JTableHeader th5 = tableTech.getTableHeader();
			TableColumnModel tcm6 = th5.getColumnModel();
			TableColumn tc5 = tcm6.getColumn(4);
			tc5.setHeaderValue("Image");
			th.repaint();

		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	public void fillComboBox()
	{
		try
		{
			comboBoxJob.removeAllItems();
			String query = "select * from Customer";
			PreparedStatement pst = connection.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				comboBoxJob.addItem(rs.getString("custName"));
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}	

	public void detailComboBox()
	{
		try
		{
			JobcomboBox.removeAllItems();
			String query = "select * from JobTable";
			PreparedStatement pst = connection.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				JobcomboBox.addItem(rs.getString("JobID"));
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}

	public void detailComboBox_1()
	{
		try
		{
			TechcomboBox_1.removeAllItems();
			String query = "select * from Technician";
			PreparedStatement pst = connection.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				TechcomboBox_1.addItem(rs.getString("techName"));
			}			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		mainframe = new JFrame();
		mainframe.setBounds(100, 100, 633, 451);
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainframe.getContentPane().setLayout(new CardLayout(0, 0));



		panelHome = new JPanel();
		panelHome.setToolTipText("");
		panelHome.setBackground(Color.ORANGE);
		mainframe.getContentPane().add(panelHome, "name_2552068953519059");
		panelHome.setLayout(null);

		label = new JLabel("'Help Desk'");
		label.setBackground(Color.RED);
		//set path to image
		Image img = new ImageIcon(this.getClass().getResource("/smallerImage.jpg")).getImage();
		//set new image to the Jlabel box
		label.setIcon(new ImageIcon(img));
		label.setBounds(10,11,275,150);
		label.setOpaque(true);
		panelHome.add(label);

		JLabel lblHomePage = new JLabel("<html>Listen here: your gonig to have to manually enter data!!<br> have fun with this form I have designed, if an error occurs calm down and make sure that you enter data correctly, use the tables for refernce <br><br> Created by Ciaran</html>");
		lblHomePage.setBounds(239, 237, 360, 108);
		panelHome.add(lblHomePage);

		JButton btnListOfCust = new JButton("List of Customers");
		btnListOfCust.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				panelHome.setVisible(false);
				panelListOfCust.setVisible(true);
			}
		});
		btnListOfCust.setBounds(24, 288, 145, 23);
		panelHome.add(btnListOfCust);

		JButton btnAddJob = new JButton("Add Job details");
		btnAddJob.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				panelHome.setVisible(false);
				panelAddJobdetail.setVisible(true);
				refreshTable_3();
			}
		});
		btnAddJob.setBounds(24, 220, 145, 23);
		panelHome.add(btnAddJob);

		JButton btnAddCustomer = new JButton("Add Customer");
		btnAddCustomer.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				panelHome.setVisible(false);
				panelAddCust.setVisible(true);
				refreshTable();
			}
		});
		btnAddCustomer.setBounds(24, 254, 145, 23);
		panelHome.add(btnAddCustomer);

		JButton btnLogJob = new JButton("Add a Job");
		btnLogJob.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				panelHome.setVisible(false);
				panelAddjob.setVisible(true);
				refreshTable_2();
			}
		});
		btnLogJob.setBounds(24, 186, 145, 23);
		panelHome.add(btnLogJob);

		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(JOptionPane.showConfirmDialog(null,"Are you sure you want to exit?","Exit",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
				{
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(510, 11, 89, 23);
		panelHome.add(btnExit);

		btnAddTech = new JButton("Add Technician");
		btnAddTech.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0)
			{
				panelHome.setVisible(false);
				panelExtra.setVisible(true);
				TechTable();
			}
		});
		btnAddTech.setBounds(24, 322, 145, 23);
		panelHome.add(btnAddTech);

		separator = new JSeparator();
		separator.setBackground(Color.RED);
		separator.setBounds(10, 175, 175, 185);
		separator.setBorder(null);
		panelHome.add(separator);
		separator.setOpaque(true);

		JButton btnLogout = new JButton("Log out");
		btnLogout.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(JOptionPane.showConfirmDialog(null,"Are you sure you want to log out?","Log Out",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
				{
					mainframe.dispose();
					Login_clone mainform = new Login_clone();
					mainform.loginScreen();
				}
			}
		});
		btnLogout.setBounds(510, 378, 89, 23);
		panelHome.add(btnLogout);


		panelListOfCust = new JPanel();
		panelListOfCust.setBackground(Color.ORANGE);
		mainframe.getContentPane().add(panelListOfCust, "name_2552249434573932");
		panelListOfCust.setLayout(null);

		label_2 = new JLabel("'Help Desk'");
		label_2.setBackground(Color.RED);
		label_2.setBounds(10, 11, 275, 150);
		label_2.setIcon(new ImageIcon(img));
		label_2.setOpaque(true);
		panelListOfCust.add(label_2);
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				panelListOfCust.setVisible(false);
				panelHome.setVisible(true);
			}
		});
		btnBack.setBounds(510, 377, 89, 23);
		panelListOfCust.add(btnBack);

		JButton btnDisplay = new JButton("Display Customer");
		btnDisplay.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				try
				{		
					String query = "Select custID, custName, CustAddress from Customer";
					PreparedStatement pst = connection.prepareStatement(query);
					ResultSet rs = pst.executeQuery();
					People.setModel(DbUtils.resultSetToTableModel(rs));					
					//Set size of table			
					TableColumnModel tcm = People.getColumnModel();
					tcm.getColumn(0).setPreferredWidth(5);
					tcm.getColumn(1).setPreferredWidth(50);
					tcm.getColumn(2).setPreferredWidth(200);
					// change column header

					JTableHeader th = People.getTableHeader();
					TableColumnModel tcm2 = th.getColumnModel();
					TableColumn tc1 = tcm2.getColumn(0);
					tc1.setHeaderValue("ID");
					th.repaint();
					JTableHeader th2 = People.getTableHeader();
					TableColumnModel tcm3 = th2.getColumnModel();
					TableColumn tc2 = tcm3.getColumn(1);
					tc2.setHeaderValue("Name");
					th.repaint();
					JTableHeader th3 = People.getTableHeader();
					TableColumnModel tcm4 = th3.getColumnModel();
					TableColumn tc3 = tcm4.getColumn(2);
					tc3.setHeaderValue("Address");
					th.repaint();
				}catch(Exception ex)
				{
					ex.printStackTrace();
					JOptionPane.showMessageDialog(null, "An Error has occured");
				}
			}
		});
		btnDisplay.setBounds(48, 343, 115, 23);
		panelListOfCust.add(btnDisplay);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(203, 197, 284, 168);
		panelListOfCust.add(scrollPane);
		/**
		People = new JTable();
		People.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				SELECT Customer.CustID, Jobdetail.JobnoteID
				FROM Customer
				INNER JOIN Jobdetail
				ON CCustomer.CustID=Jobdetail.JobnoteID
				ORDER BY Customer.CustID;
			}
		});
		 **/
		scrollPane.setViewportView(People);

		People = new JTable();
		scrollPane.setViewportView(People);

		btnExit_1 = new JButton("Exit");
		btnExit_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(JOptionPane.showConfirmDialog(null,"Are you sure you want to exit?","Exit",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
				{
					System.exit(0);
				}
			}
		});
		btnExit_1.setBounds(516, 10, 89, 23);
		panelListOfCust.add(btnExit_1);

		lblListOfCustomers_1 = new JLabel("List of Customers");
		lblListOfCustomers_1.setBounds(213, 172, 174, 14);
		panelListOfCust.add(lblListOfCustomers_1);

		btnLogOut = new JButton("Log out");
		btnLogOut.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(JOptionPane.showConfirmDialog(null,"Are you sure you want to log out?","Log Out",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
				{
					mainframe.dispose();
					Login_clone mainform = new Login_clone();
					mainform.loginScreen();
				}
			}
		});
		btnLogOut.setBounds(510, 343, 89, 23);
		panelListOfCust.add(btnLogOut);

		panelAddJobdetail = new JPanel();
		panelAddJobdetail.setBackground(Color.ORANGE);
		mainframe.getContentPane().add(panelAddJobdetail, "name_2552266866031880");
		panelAddJobdetail.setLayout(null);

		label_1 = new JLabel("'Help Desk'");
		label_1.setBackground(Color.RED);
		label_1.setBounds(10, 11, 275, 150);
		//set path to image
		label_1.setIcon(new ImageIcon(img));
		label_1.setOpaque(true);
		panelAddJobdetail.add(label_1);

		btnBack_1 = new JButton("Back");
		btnBack_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				panelAddJobdetail.setVisible(false);
				panelHome.setVisible(true);
			}
		});
		btnBack_1.setBounds(510, 377, 89, 23);
		panelAddJobdetail.add(btnBack_1);

		btnExit_2 = new JButton("Exit");
		btnExit_2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(JOptionPane.showConfirmDialog(null,"Are you sure you want to exit?","Exit",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
				{
					System.exit(0);
				}
			}
		});
		btnExit_2.setBounds(510, 10, 89, 23);
		panelAddJobdetail.add(btnExit_2);

		JLabel lblJobId = new JLabel("Job ID");
		lblJobId.setBounds(44, 209, 46, 14);
		panelAddJobdetail.add(lblJobId);

		JobcomboBox = new JComboBox();
		JobcomboBox.setBounds(100, 206, 46, 20);
		panelAddJobdetail.add(JobcomboBox);
		detailComboBox();

		TechcomboBox_1 = new JComboBox();
		TechcomboBox_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				try
				{
					String query = "select * from Technician where techName = ? ";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, (String)TechcomboBox_1.getSelectedItem());
					ResultSet rs = pst.executeQuery();
					while(rs.next())
					{
						txtTechID.setText(rs.getString("techID"));
					}
					pst.close();
				}catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}
		});
		TechcomboBox_1.setBounds(100, 237, 86, 20);
		panelAddJobdetail.add(TechcomboBox_1);
		detailComboBox_1();

		JLabel lblTechnician = new JLabel("Technician");
		lblTechnician.setBounds(25, 240, 65, 14);
		panelAddJobdetail.add(lblTechnician);

		txtdate = new JTextField();
		txtdate.setBounds(120, 268, 86, 20);
		panelAddJobdetail.add(txtdate);
		txtdate.setColumns(10);

		JLabel lblDateddmmyy_1 = new JLabel("Date (dd-mm-yy)");
		lblDateddmmyy_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblDateddmmyy_1.setBounds(10, 271, 100, 14);
		panelAddJobdetail.add(lblDateddmmyy_1);

		JLabel lblNotes = new JLabel("Notes");
		lblNotes.setBounds(34, 307, 46, 14);
		panelAddJobdetail.add(lblNotes);

		JLabel lblTimeSpent = new JLabel("Time spent");
		lblTimeSpent.setBounds(34, 383, 65, 14);
		panelAddJobdetail.add(lblTimeSpent);

		txtTimeSpent = new JTextField();
		txtTimeSpent.setBounds(100, 380, 86, 20);
		panelAddJobdetail.add(txtTimeSpent);
		txtTimeSpent.setColumns(10);

		JLabel lblDetailID = new JLabel("Detail ID");
		lblDetailID.setBounds(44, 181, 46, 14);
		panelAddJobdetail.add(lblDetailID);

		txtDetailID = new JTextField();
		txtDetailID.setBounds(100, 178, 46, 20);
		panelAddJobdetail.add(txtDetailID);
		txtDetailID.setColumns(10);

		JButton btnAddthejob = new JButton("Add");
		btnAddthejob.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				{ 
					try
					{ 
						String query = "insert into Jobdetail (jobnoteID, techName, dateCompleted, jobNotes, timeSpent, jobID, techID) values (?,?,?,?,?,?,?)";
						PreparedStatement pst = connection.prepareStatement(query);
						pst.setString(1, txtDetailID.getText());
						pst.setString(2, (String) TechcomboBox_1.getSelectedItem());
						pst.setString(3, txtdate.getText());
						pst.setString(4, textdetail.getText());
						pst.setString(5, txtTimeSpent.getText());
						pst.setString(6, (String) JobcomboBox.getSelectedItem());
						pst.setString(7, txtTechID.getText());
						pst.execute();
						JOptionPane.showMessageDialog(null, "Details saved!");
						pst.close();
					}catch(Exception ex)
					{
						ex.printStackTrace();
						JOptionPane.showMessageDialog(null, "An Error has occured");
					}
					refreshTable_3();
					detailComboBox();
				} 
			} 
		});
		btnAddthejob.setBounds(196, 374, 89, 23);
		panelAddJobdetail.add(btnAddthejob);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(258, 173, 349, 168);
		panelAddJobdetail.add(scrollPane_2);

		Detailtable = new JTable();
		scrollPane_2.setViewportView(Detailtable);

		txtTechID = new JTextField();
		txtTechID.setEnabled(false);
		txtTechID.setEditable(false);
		txtTechID.setBounds(513, 141, 0, 0);
		panelAddJobdetail.add(txtTechID);
		txtTechID.setColumns(10);

		textdetail = new JTextField();
		textdetail.setBounds(100, 304, 107, 65);
		panelAddJobdetail.add(textdetail);
		textdetail.setColumns(10);

		btnDelete_2 = new JButton("Delete ");
		btnDelete_2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String query = "delete from Jobdetail where jobnoteID = '" + txtDetailID.getText() + "' ";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.execute();
					JOptionPane.showMessageDialog(null, "Job deleted");
					pst.close();
				}catch(Exception ex)
				{
					ex.printStackTrace();
					JOptionPane.showMessageDialog(null, "An Error has occured");
				}
				refreshTable_3();
			}
		});
		btnDelete_2.setBounds(400, 374, 89, 23);
		panelAddJobdetail.add(btnDelete_2);

		btnUpdateJob = new JButton("Update");
		btnUpdateJob.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				try
				{ 
					String query = "Update Jobdetail set jobnoteID = '" + txtDetailID.getText()+"',techName = '"+(String) TechcomboBox_1.getSelectedItem()+"',dateCompleted = '" + txtdate.getText()+"',jobNotes = '"+textdetail.getText()+"',timeSpent = '"+txtTimeSpent.getText()+"',jobID = '"+(String) JobcomboBox.getSelectedItem()+"',techID = '"+txtTechID.getText()+"' where jobnoteID = '"+txtDetailID.getText()+"'";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.execute();
					JOptionPane.showMessageDialog(null, "Job updated!");
					pst.close();
				}catch(Exception ex)
				{
					ex.printStackTrace();
					JOptionPane.showMessageDialog(null, "An Error has occured");
				}
				refreshTable_3();
				detailComboBox();
			} 
		});
		btnUpdateJob.setBounds(301, 374, 89, 23);
		panelAddJobdetail.add(btnUpdateJob);

		btnLogOut_1 = new JButton("Log out");
		btnLogOut_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(JOptionPane.showConfirmDialog(null,"Are you sure you want to log out?","Log Out",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
				{
					mainframe.dispose();
					Login_clone mainform = new Login_clone();
					mainform.loginScreen();
				}
			}
		});
		btnLogOut_1.setBounds(510, 343, 89, 23);
		panelAddJobdetail.add(btnLogOut_1);


		panelAddCust = new JPanel();
		panelAddCust.setBackground(Color.ORANGE);
		mainframe.getContentPane().add(panelAddCust, "name_2552281442652080");
		panelAddCust.setLayout(null);

		label_3 = new JLabel("'Help Desk'");
		label_3.setBackground(Color.RED);
		label_3.setBounds(10, 11, 275, 150);
		//set path to image
		label_3.setIcon(new ImageIcon(img));
		label_3.setOpaque(true);
		panelAddCust.add(label_3);

		btnBack_2 = new JButton("Back");
		btnBack_2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				panelAddCust.setVisible(false);
				panelHome.setVisible(true);
			}
		});
		btnBack_2.setBounds(518, 378, 89, 23);
		panelAddCust.add(btnBack_2);

		btnExit_3 = new JButton("Exit");
		btnExit_3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				if(JOptionPane.showConfirmDialog(null,"Are you sure you want to exit?","Exit",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
				{
					System.exit(0);
				}
			}
		});
		btnExit_3.setBounds(518, 10, 89, 23);
		panelAddCust.add(btnExit_3);

		JLabel lblCustomerId = new JLabel("Customer ID");
		lblCustomerId.setBounds(83, 236, 72, 14);
		panelAddCust.add(lblCustomerId);

		JLabel lblCustomerName = new JLabel("Customer Name");
		lblCustomerName.setBounds(69, 267, 86, 14);
		panelAddCust.add(lblCustomerName);

		JLabel lblCustomerAddress = new JLabel("Customer Address");
		lblCustomerAddress.setBounds(55, 298, 110, 14);
		panelAddCust.add(lblCustomerAddress);

		txtCustomerAddress = new JTextField();
		txtCustomerAddress.setBounds(175, 295, 124, 20);
		panelAddCust.add(txtCustomerAddress);
		txtCustomerAddress.setColumns(10);

		txtCustomerName = new JTextField();
		txtCustomerName.setBounds(175, 264, 124, 20);
		panelAddCust.add(txtCustomerName);
		txtCustomerName.setColumns(10);

		txtCustomerID = new JTextField();
		txtCustomerID.setBounds(175, 233, 124, 20);
		panelAddCust.add(txtCustomerID);
		txtCustomerID.setColumns(10);

		JButton btnSaveDetails = new JButton("Add ");
		btnSaveDetails.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				try
				{
					String query = "insert into Customer (CustID, custName, custAddress) values (?,?,?)";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, txtCustomerID.getText());
					pst.setString(2, txtCustomerName.getText());
					pst.setString(3, txtCustomerAddress.getText());
					pst.execute();
					JOptionPane.showMessageDialog(null, "Customer saved!");
					pst.close();
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
					JOptionPane.showMessageDialog(null, "An Error has occured");
				}
				refreshTable();
				fillComboBox();
			}
		});
		btnSaveDetails.setBounds(55, 323, 100, 23);
		panelAddCust.add(btnSaveDetails);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(309, 171, 284, 168);
		panelAddCust.add(scrollPane_1);

		ATable = new JTable();
		ATable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				try
				{
					int row = ATable.getSelectedRow();
					String custID =(ATable.getValueAt(row,0).toString());
					String query ="select * from Customer where custID ='" +custID+"'";
					PreparedStatement pst = connection.prepareStatement(query);
					ResultSet rs = pst.executeQuery();
					while(rs.next())
					{
						txtCustomerID.setText(rs.getString("custID"));
						txtCustomerName.setText(rs.getString("custName"));
						txtCustomerAddress.setText(rs.getString("custAddress"));

					}
				}catch(Exception ex)
				{
					ex.printStackTrace();
					JOptionPane.showMessageDialog(null, "An Error has occured");
				}
			}
		});
		scrollPane_1.setViewportView(ATable);

		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				try
				{
					String query = "Update Customer set custID = '" + txtCustomerID.getText()+"',custName = '" + txtCustomerName.getText()+"' ,custAddress = '" + txtCustomerAddress.getText()+ "' where custID = '"+txtCustomerID.getText()+"'";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.execute();
					JOptionPane.showMessageDialog(null, "Customer updated");
					pst.close();
				}catch(Exception ex)
				{
					ex.printStackTrace();
					JOptionPane.showMessageDialog(null, "An Error has occured");
				}
				refreshTable();
				fillComboBox();
			}
		});
		btnUpdate.setBounds(55, 357, 89, 23);
		panelAddCust.add(btnUpdate);

		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String query = "delete from Customer where custID = '" + txtCustomerID.getText() + "' ";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.execute();
					JOptionPane.showMessageDialog(null, "Customer deleted");
					pst.close();
				}catch(Exception ex)
				{
					ex.printStackTrace();
					JOptionPane.showMessageDialog(null, "An Error has occured");
				}
				refreshTable();
				fillComboBox();
			}
		});
		btnDelete.setBounds(154, 357, 89, 23);
		panelAddCust.add(btnDelete);

		btnLogOut_2 = new JButton("Log out");
		btnLogOut_2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(JOptionPane.showConfirmDialog(null,"Are you sure you want to log out?","Log Out",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
				{
					mainframe.dispose();
					Login_clone mainform = new Login_clone();
					mainform.loginScreen();
				}
			}
		});
		btnLogOut_2.setBounds(518, 344, 89, 23);
		panelAddCust.add(btnLogOut_2);

		panelAddjob = new JPanel();
		panelAddjob.setBackground(Color.ORANGE);
		mainframe.getContentPane().add(panelAddjob, "name_2552296620642031");
		panelAddjob.setLayout(null);

		label_4 = new JLabel("'Help Desk'");
		label_4.setBackground(Color.RED);
		label_4.setBounds(10, 11, 275, 150);
		//set path to image
		label_4.setIcon(new ImageIcon(img));
		label_4.setOpaque(true);
		panelAddjob.add(label_4);

		btnBack_4 = new JButton("Back");
		btnBack_4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				panelAddjob.setVisible(false);
				panelHome.setVisible(true);
			}
		});
		btnBack_4.setBounds(510, 377, 89, 23);
		panelAddjob.add(btnBack_4);

		btnExit_4 = new JButton("Exit");
		btnExit_4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(JOptionPane.showConfirmDialog(null,"Are you sure you want to exit?","Exit",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
				{
					System.exit(0);
				}
			}
		});
		btnExit_4.setBounds(510, 11, 89, 23);
		panelAddjob.add(btnExit_4);

		lblCustomerName_1 = new JLabel("Customer Name");
		lblCustomerName_1.setBounds(66, 233, 89, 14);
		panelAddjob.add(lblCustomerName_1);

		comboBoxJob = new JComboBox();
		comboBoxJob.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{ 
				try
				{
					String query = "select * from Customer where custName = ? ";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, (String)comboBoxJob.getSelectedItem());
					ResultSet rs = pst.executeQuery();
					while(rs.next())
					{
						txtID.setText(rs.getString("custID"));
					}
					pst.close();
				}catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}
		});
		comboBoxJob.setBounds(165, 230, 86, 20);
		panelAddjob.add(comboBoxJob);
		fillComboBox();

		lblDateddmmyy = new JLabel("Date (dd-mm-yy)");
		lblDateddmmyy.setBounds(23, 264, 132, 14);
		panelAddjob.add(lblDateddmmyy);

		txtDate = new JTextField();
		txtDate.setBounds(165, 261, 86, 20);
		panelAddjob.add(txtDate);
		txtDate.setColumns(10);

		lblJobDescription = new JLabel("Job Description");
		lblJobDescription.setBounds(50, 295, 105, 14);
		panelAddjob.add(lblJobDescription);
		txtcomputername = new JTextField();
		txtcomputername.setBounds(165, 324, 86, 20);
		panelAddjob.add(txtcomputername);
		txtcomputername.setColumns(10);

		JButton btnAddButton = new JButton("Add ");
		btnAddButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0)
			{
				try
				{ 
					String query = "insert into JobTable (jobID, custReName, theDate, jobDesc, computer, custID) values (?,?,?,?,?,?)";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, txtJobID.getText());
					pst.setString(2, (String) comboBoxJob.getSelectedItem());
					pst.setString(3, txtDate.getText());
					pst.setString(4, txtdesc.getText());
					pst.setString(5, txtcomputername.getText());
					pst.setString(6, txtID.getText());
					pst.execute();
					JOptionPane.showMessageDialog(null, "Log saved!");
					pst.close();
				}catch(Exception ex)
				{
					ex.printStackTrace();
					JOptionPane.showMessageDialog(null, "An Error has occured");
				}
				refreshTable_2();
				detailComboBox_1();
			}
		}); 
		btnAddButton.setBounds(156, 355, 89, 23);
		panelAddjob.add(btnAddButton);

		JLabel lblComputerName = new JLabel("Computer Name");
		lblComputerName.setBounds(41, 327, 114, 14);
		panelAddjob.add(lblComputerName);

		txtdesc = new JTextField();
		txtdesc.setBounds(165, 292, 86, 20);
		panelAddjob.add(txtdesc);
		txtdesc.setColumns(10);

		txtID = new JTextField();
		txtID.setEnabled(false);
		txtID.setEditable(false);
		txtID.setBounds(513, 110, 0, 0);
		panelAddjob.add(txtID);
		txtID.setColumns(10);

		txtJobID = new JTextField();
		txtJobID.setBounds(165, 199, 86, 20);
		panelAddjob.add(txtJobID);
		txtJobID.setColumns(10);

		lblId = new JLabel("Job ID");
		lblId.setBounds(109, 202, 46, 14);
		panelAddjob.add(lblId);

		scrollpane = new JScrollPane();
		scrollpane.setBounds(295, 141, 312, 168);
		panelAddjob.add(scrollpane);

		ThisTable = new JTable();
		scrollpane.setViewportView(ThisTable);

		btnDelete_3 = new JButton("Delete");
		btnDelete_3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String query = "delete from JobTable where JobID = '" +txtJobID.getText() + "' ";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.execute();
					JOptionPane.showMessageDialog(null, "Job deleted");
					pst.close();
				}catch(Exception ex)
				{
					ex.printStackTrace();
					JOptionPane.showMessageDialog(null, "An Error has occured");
				}
				refreshTable_2();
				detailComboBox();
			}
		});
		btnDelete_3.setBounds(354, 355, 89, 23);
		panelAddjob.add(btnDelete_3);

		JButton btnUpdate_2 = new JButton("Update");
		btnUpdate_2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0)
			{
				{
					try
					{ 
						String query = "Update JobTable set jobID = '" + txtJobID.getText()+"',custReName = '" +(String)comboBoxJob.getSelectedItem()+"' ,theDate = '" + txtDate.getText()+"',jobDesc ='"+txtdesc.getText()+"',computer='"+txtcomputername.getText()+"',custID ='"+txtID.getText()+"' where jobID = '"+txtJobID.getText()+"'";
						PreparedStatement pst = connection.prepareStatement(query);
						pst.execute();
						JOptionPane.showMessageDialog(null, "Updated log!");
						pst.close();
					}catch(Exception ex)
					{
						ex.printStackTrace();
						JOptionPane.showMessageDialog(null, "An Error has occured");
					}
					refreshTable_2();
					detailComboBox_1();
				}
			}
		});
		btnUpdate_2.setBounds(255, 355, 89, 23);
		panelAddjob.add(btnUpdate_2);

		btnLogOut_3 = new JButton("Log out");
		btnLogOut_3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(JOptionPane.showConfirmDialog(null,"Are you sure you want to log out?","Log Out",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
				{
					mainframe.dispose();
					Login_clone mainform = new Login_clone();
					mainform.loginScreen();
				}
			}
		});
		btnLogOut_3.setBounds(510, 343, 89, 23);
		panelAddjob.add(btnLogOut_3);

		panelExtra = new JPanel();
		panelExtra.setBackground(Color.ORANGE);
		mainframe.getContentPane().add(panelExtra, "name_261088141138");
		panelExtra.setLayout(null);

		JButton btnBack_5 = new JButton("Back");
		btnBack_5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				panelExtra.setVisible(false);
				panelHome.setVisible(true);
			}
		});
		btnBack_5.setBounds(518, 378, 89, 23);
		panelExtra.add(btnBack_5);

		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(273, 199, 334, 168);
		panelExtra.add(scrollPane_3);

		tableTech = new JTable();
		tableTech.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				int row = tableTech.getSelectedRow();
				String techID =(tableTech.getModel().getValueAt(row,0)).toString();
				try
				{
					OLEImage oleImage = new OLEImage();
					String sq12 = "select image from Technician where techID = '"+techID+"'";
					PreparedStatement statement = connection.prepareStatement(sq12);
					ResultSet rs4 = statement.executeQuery();
					while(rs4.next())
					{
						java.io.InputStream input = rs4.getBinaryStream("image"); 
						byte buffer[] = oleImage.getByteImgFromOLEInputStream(input, "JPEG");
						ImageIcon icon = new ImageIcon(buffer);
						lblImages.setIcon(icon);
					}
				}catch(Exception ex)
				{
					ex.printStackTrace();
				}
				TechTable();
			}
		});
		scrollPane_3.setViewportView(tableTech);

		lblImages = new JLabel("");
		lblImages.setBackground(Color.RED);
		lblImages.setBounds(10, 163, 253, 238);
		panelExtra.add(lblImages);
		lblImages.setOpaque(true);

		label_5 = new JLabel("'Help Desk'");
		label_5.setForeground(Color.BLACK);
		label_5.setBackground(Color.RED);
		label_5.setBounds(10, 11, 275, 150);
		label_5.setIcon(new ImageIcon(img));
		label_5.setOpaque(true);
		panelExtra.add(label_5);

		btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{ 
					String query = "insert into Technician (techID, techName, userName, password) values (?,?,?,?)";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, txtTech_ID.getText());
					pst.setString(2, txtTech_Name.getText());
					pst.setString(3, txtUser_Name.getText());   
					pst.setString(4, txtTech_Password.getText());   
					pst.execute();
					JOptionPane.showMessageDialog(null, "Technician saved!");
					pst.close();
				}catch(Exception ex)
				{
					ex.printStackTrace();
					JOptionPane.showMessageDialog(null, "An Error has occured");
				}
				TechTable();
				detailComboBox_1();
			}
		});
		btnAdd.setBounds(273, 165, 89, 23);
		panelExtra.add(btnAdd);

		btnDelete_1 = new JButton("Delete");
		btnDelete_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String query = "delete from Technician where techID = '"+txtTech_ID.getText()+"' ";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.execute();
					JOptionPane.showMessageDialog(null, "Technician Deleted!");
					pst.close();
				}catch(Exception ex)
				{
					ex.printStackTrace();
					JOptionPane.showMessageDialog(null, "An Error has occured");
				}
				TechTable();
				detailComboBox_1();
			}
		});
		btnDelete_1.setBounds(372, 165, 89, 23);
		panelExtra.add(btnDelete_1);

		btnUpdate_1 = new JButton("Update");
		btnUpdate_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String query = "Update Technician set techID = '" + txtTech_ID.getText()+"',techName = '" +txtTech_Name.getText()+"' ,userName = '" + txtUser_Name.getText()+"',password ='"+txtTech_Password.getText()+"' where techID = '"+txtTech_ID.getText()+"'";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.execute();
					JOptionPane.showMessageDialog(null, "Technician updated");
					pst.close();
				}catch(Exception ex)
				{
					ex.printStackTrace();
					JOptionPane.showMessageDialog(null, "An Error has occured");
				}
				TechTable();
				detailComboBox_1();
			}
		});
		btnUpdate_1.setBounds(471, 165, 89, 23);
		panelExtra.add(btnUpdate_1);

		btnExit_5 = new JButton("Exit");
		btnExit_5.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(JOptionPane.showConfirmDialog(null,"Are you sure you want to exit?","Exit",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
				{
					System.exit(0);
				}
			}
		});
		btnExit_5.setBounds(518, 11, 89, 23);
		panelExtra.add(btnExit_5);

		txtTech_ID = new JTextField();
		txtTech_ID.setBounds(375, 33, 86, 20);
		panelExtra.add(txtTech_ID);
		txtTech_ID.setColumns(10);

		JLabel lblTechId = new JLabel("Tech ID");
		lblTechId.setBounds(316, 36, 46, 14);
		panelExtra.add(lblTechId);

		txtUser_Name = new JTextField();
		txtUser_Name.setBounds(375, 100, 86, 20);
		panelExtra.add(txtUser_Name);
		txtUser_Name.setColumns(10);

		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setBounds(295, 103, 67, 14);
		panelExtra.add(lblUserName);

		txtTech_Password = new JTextField();
		txtTech_Password.setBounds(375, 134, 86, 20);
		panelExtra.add(txtTech_Password);
		txtTech_Password.setColumns(10);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(305, 137, 57, 14);
		panelExtra.add(lblPassword);

		txtTech_Name = new JTextField();
		txtTech_Name.setBounds(375, 64, 86, 20);
		panelExtra.add(txtTech_Name);
		txtTech_Name.setColumns(10);

		lblName = new JLabel("Name");
		lblName.setBounds(316, 67, 46, 14);
		panelExtra.add(lblName);

		btnLogOut_4 = new JButton("Log out");
		btnLogOut_4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(JOptionPane.showConfirmDialog(null,"Are you sure you want to log out?","Log Out",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
				{
					mainframe.dispose();
					Login_clone mainform = new Login_clone();
					mainform.loginScreen();
				}
			}
		});
		btnLogOut_4.setBounds(419, 378, 89, 23);
		panelExtra.add(btnLogOut_4);

		JLabel lblnotice = new JLabel("<html>*notice pictures need to be <br> added manualy to the database*</html>");
		lblnotice.setBounds(471, 45, 136, 116);
		panelExtra.add(lblnotice);

	}
}
