
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.TransferHandler;
public class Action_Listener extends JFrame
{
	JTextField txtLabel;
	JButton btnClick;
	
	Container pane = getContentPane();
	public Action_Listener()
	{
		setLayout(null);
		
		btnClick = new JButton("Button");
		btnClick.setBounds(200, 50, 90, 25);
		
		txtLabel = new JTextField();
		txtLabel.setBounds(30, 50, 150, 25);
		
		pane.add(btnClick);
		pane.add(txtLabel);
		
		txtLabel.setDragEnabled(true);
		btnClick.setTransferHandler(new TransferHandler("text"));
	}
	public static void main(String[] args) 
	{
		Action_Listener myFrame = new Action_Listener();
		myFrame.setTitle("Simple Drag & Drop");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLocationRelativeTo(null);
		myFrame.setSize(330, 150);
		myFrame.setVisible(true);
	}
}
