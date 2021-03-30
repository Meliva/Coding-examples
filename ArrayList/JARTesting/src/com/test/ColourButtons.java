package com.test;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class ColourButtons extends JFrame implements ActionListener
{
	ButtonGroup options = new ButtonGroup();
	private JRadioButton optBlue= new JRadioButton("Blue",false);
	private JRadioButton optRed = new JRadioButton("Red",false);
	private JPanel thePanel=new JPanel();

	public ColourButtons()
	{	Container pane = getContentPane();
		optBlue.setVisible(true);
		options.add(optBlue);    //adding to button group
		options.add(optRed);     //adding to button group
		thePanel.add(optBlue);  //adding to the panel
		thePanel.add(optRed);   //adding to the panel
		optBlue.setBackground(Color.blue);
		optRed.setBackground(Color.red);
		thePanel.setLayout(new FlowLayout());
		thePanel.setBackground(Color.white);
		pane.add(thePanel);
		optBlue.addActionListener(this);
		optRed.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(optBlue.isSelected())
			thePanel.setBackground(Color.blue);
		if(optRed.isSelected())
			thePanel.setBackground(Color.red);
	}

	public static void main(String[] args)
	{
		ColourButtons theApp=new ColourButtons();
		theApp.setSize(300,200);
		theApp.setVisible(true);
	}
}
