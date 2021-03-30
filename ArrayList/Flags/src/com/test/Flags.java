package com.test;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.event.*;

public class Flags extends JFrame 
{
	final int NUMBER_OF_FLAGS = 9;

	// Declare an array of Strings for flag titles
	private String[] flagTitles = {"Canada", "China", "Denmark", "France", "Germany", "India", "Norway", "United Kingdom",
	"United States of America"};

	// The list for selecting countries
	private JList<String> jlst = new JList<String>(flagTitles);

	// Declare an ImageIcon array for the national flags of 9 countries
	private ImageIcon[] imageIcons = 
		{
				new ImageIcon("Images/ca.gif"),
				new ImageIcon("Images/china.gif"),
				new ImageIcon("Images/denmark.gif"),
				new ImageIcon("Images/fr.gif"),
				new ImageIcon("Images/germany.gif"),
				new ImageIcon("Images/india.gif"),
				new ImageIcon("Images/norway.gif"),
				new ImageIcon("Images/uk.gif"),
				new ImageIcon("Images/us.gif")
		};

	// Arrays of labels for displaying images
	private JLabel[] jlblImageViewer = new JLabel[NUMBER_OF_FLAGS];



	public Flags() 
	{
		// Create a panel to hold nine labels
		JPanel p = new JPanel(new GridLayout(3, 3, 5, 5));

		for (int num = 0; num < NUMBER_OF_FLAGS; num++) 
		{
			p.add(jlblImageViewer[num] = new JLabel());
			jlblImageViewer[num].setHorizontalAlignment
			(SwingConstants.CENTER);
		}

		// Add p and the list to the frame
		add(p, BorderLayout.CENTER);
		add(new JScrollPane(jlst), BorderLayout.WEST);

		jlst.addListSelectionListener(new ListSelectionListener() 
		{
			@Override /** Handle list selection */
			public void valueChanged(ListSelectionEvent e) 
			{
				// Get selected indices
				int[] indices = jlst.getSelectedIndices();

				int i;
				// Set icons in the labels
				for (i = 0; i < indices.length; i++) 
				{
					jlblImageViewer[i].setIcon(imageIcons[indices[i]]);
				}

				// Remove icons from the rest of the labels
				for (; i < NUMBER_OF_FLAGS; i++) 
				{
					jlblImageViewer[i].setIcon(null);
				}
			}
		});

	}

	public static void main(String[] args) 
	{
		Flags theApp = new Flags();
		theApp.setSize(650, 500);
		theApp.setTitle("Flags");
		theApp.setLocationRelativeTo(null); // Center the frame
		theApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theApp.setVisible(true);
	}
}

