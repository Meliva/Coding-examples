import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class dragrectangle extends JPanel
implements MouseListener, MouseMotionListener
{
	private static final int WIDTH =600, HEIGHT =600, LEFT = 10, TOP =10, BORDER = 30, RECT =20;
	private static final Color backColor = Color.gray;
	private static final Color lineColor = Color.red;
	private static final Color inColor = Color.green;
	private int xRect = 30, yRect= 30;
	private boolean isDrag = false;
	private Point mouse = new Point();
	private Point offset = new Point();
	private boolean rOut = false;
	private int count = 0;

	public dragrectangle()
	 {
		addMouseListener(this);
		addMouseMotionListener(this);
	 }
	
	public void paintComponent(Graphics g)
	{
		Dimension d = getSize();
		g.clearRect( 0, 0, d.width, d.height);
		
		if(!rOut)
			g.setColor(inColor);
		else
			g.setColor(lineColor);
		g.fillRect(0, 0, LEFT, TOP);
		g.setColor(lineColor);
		g.drawRect(LEFT, TOP, d.width - BORDER, d.height - BORDER);
		g.drawString("Counter =" + count, LEFT, d.height -5);
		g.setColor(Color.black);
		g.fillRect(xRect, yRect, RECT, RECT);
	}
	
	public void mousePressed(MouseEvent e)
	{
		mouse = e.getPoint();
		System.out.println("x, y" + mouse.x + "," +mouse.y);
		if ((mouse.x > xRect)&& (mouse.y > yRect) && (mouse.x < xRect+RECT) && (mouse.y < yRect+RECT))
		{
			System.out.println("Mouse in");
			offset.x = mouse.x - xRect;
			offset.y = mouse.y - yRect;
			isDrag=true;
		}
	}
	
	public void mouseEntered(MouseEvent e)
	{
	
	}
	
	public void mouseExited(MouseEvent e)
	{
		
	}
	
	public void mouseDragged(MouseEvent e)
	{
		mouse = e.getPoint();
		if(isDrag)
		{
			Dimension d = getSize();
			xRect = mouse.x - offset.x;
			yRect = mouse.y - offset.y;
			if((xRect < LEFT) ||
					((xRect+ RECT) > (d.width-BORDER))
					|| (yRect < TOP)
					|| (yRect+RECT > (d.height-BORDER))
					)
			{
				if(! rOut)
				{
					rOut = true;
					count++;
				}
			}	
			else 
			{
				rOut = false;
			}
			repaint();
		}
	}
	public void mouseClicked(MouseEvent e)
	{
		
	}
	public void mouseReleased(MouseEvent e)
	{
		if(isDrag)
		{
			isDrag = false;
			}
	}
	public void mouseMoved(MouseEvent e)
	{

	}
	
	public static void main(String[] args) 
	{
		JFrame f = new JFrame("Drag a rectangle");
		dragrectangle p = new dragrectangle();
		f.getContentPane().add(p);
		f.setSize(p.WIDTH, p.HEIGHT);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter()
		{
			public void WindowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
}
