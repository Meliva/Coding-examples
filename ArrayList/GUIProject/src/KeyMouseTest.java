/*import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

public class KeyMouseTest 
{
	public static void main(String[] args)
	{
		JFrame frame = new KeyMouseFrame();
		frame.setVisible(true);
	}

}

class KeyMouseFrame extends JFrame
{
	private JTextField textField;

	public KeyMouseFrame()
	{
		setTitle("Key, Mouse test");
		setSize(400, 400);
		addWindowListener(new WindowAdapter()
		{
			public void WindowCloseing(WindowEvent e)
			{
				System.exit(0);
			}
		});	
		setLayout(new BorderLayout());
		add(new KeyMousePane1(this), BorderLayout.CENTER);
		textField = new JTextField("Welcome");
		textField.setFocusable(false);
		add(textField, BorderLayout.NORTH);
	}	
	public void setTextField(String text)
	{
		textField.setText(text);
	}
}

class KeyMousePane1 extends JPanel
implements MouseListener, KeyListener
{
	private KeyMouseFrame frame;
	public KeyMousePane1(KeyMouseFrame f)
	{
		frame = f;
	}
	public void mouseClicked(MouseEvent e)
	{
		
	}
	public void mouseEntered(MouseEvent e)
	{
		
	}
	public void mouseExited(MouseEvent e)
	{
		
	}
	public void mouseReleased(MouseEvent e)
	{
		
	}
	public void mousePressed(MouseEvent e)
	{
		int x = e.getX();
		int y = e.getY();
		if (e.isShiftDown())
		{
			System.out.println("Shift down");
		}
		else
		{
			frame.setTextField("The coords are " + x + ", " + y);
		}
	}
	public void KeyReleased(KeyEvent e)
	{
		
	}	
	public void KeyTyped(MouseEvent e)
	{
		
	}
	public void KeyPressed(MouseEvent e)
	{
		
	}
}
*/
