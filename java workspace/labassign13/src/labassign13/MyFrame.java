package labassign13;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class MyFrame extends JFrame implements ActionListener{
	Color color=new Color(0,0,0); //Color instance 
	JRadioButton r1;
	JRadioButton r2;
	JRadioButton r3; //radioButton declare
	public MyFrame(){
		setTitle("MyCar"); 
		setSize(500,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE); //frame set
		MyPanel p1=new MyPanel();
		JPanel p2=new JPanel(); //panel
		r1=new JRadioButton("RED");
		r2=new JRadioButton("GREEN");
		r3=new JRadioButton("BLUE");	//radiobutton
		ButtonGroup bg=new ButtonGroup(); //button group
		bg.add(r1);
		bg.add(r2);
		bg.add(r3); //add to buttongroup
		JButton b=new JButton("Paint"); //button
		b.addActionListener(this); //add actionlistener to button
		p2.add(r1);
		p2.add(r2);
		p2.add(r3);
		p2.add(b); //add to panel
		add(p1,"Center");
		add(p2,"South"); //add to frame
		setVisible(true);
	}
	class MyPanel extends JPanel{ 
		public void paint(Graphics g){ //paint
			g.setColor(color);
			g.fillRect(140,40, 140, 60);
			g.fillRect(70,100, 280, 100);//draw and fill rectangle 
			g.setColor(Color.black);
			g.drawArc(220, 50, 50, 100, 0, 180); //draw arc
			g.setColor(Color.lightGray);
			g.fillOval(100, 150, 80, 80);
			g.fillOval(220, 150, 80, 80); //draw oval
		}
	}
	public void actionPerformed(ActionEvent e){
		if(r1.isSelected()==true)
			color=Color.red;
		else if(r2.isSelected()==true)
			color=Color.green;
		else if(r3.isSelected()==true)
			color=Color.blue; //set color for each case 
			repaint();	//call paint()
	}
}
