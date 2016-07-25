package labassign12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class MyFrame extends JFrame{ //MyFrame class 
	JButton b1;
	JButton b2; //button reference declaration(private class ���� �����ϱ� ���� ��ġ constructor �ۿ�) 
	public MyFrame(){ //constructor 
		this.setSize(300,200); //frame size 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //frame close 
		this.setTitle("Plus Test"); //frame title
		JPanel panel1=new JPanel(); 
		JPanel panel2=new JPanel();
		JPanel panel3=new JPanel(); //panel 
		JTextField t1=new JTextField(5);
		JTextField t2=new JTextField(5);
		JTextField t3=new JTextField(5); //textfield 
		t1.setHorizontalAlignment(JTextField.RIGHT);
		t2.setHorizontalAlignment(JTextField.RIGHT);
		t3.setHorizontalAlignment(JTextField.RIGHT); //������ ���� 
		JLabel l1=new JLabel("+");
		JLabel l2=new JLabel("=");
		JLabel l3=new JLabel(); //label 
		b1=new JButton("Confirm");
		b2=new JButton("New"); //button 
		b1.addActionListener(new MyListener(t1,t2,t3,l3));
		b2.addActionListener(new MyListener(t1,t2,t3,l3)); //attach listener to component(in this case, button)
		panel1.add(t1);
		panel1.add(l1);
		panel1.add(t2);
		panel1.add(l2);
		panel1.add(t3);
		panel2.add(b1);
		panel2.add(b2);
		panel3.add(l3); //attach to panel
		add(panel1,"North");
		add(panel2,"Center");
		add(panel3,"South"); //attach panel to frame 
		setVisible(true); 
	}
	private class MyListener implements ActionListener{ //inner class 
		JTextField t1,t2,t3; 
		JLabel label; 
		public MyListener(JTextField t1,JTextField t2,JTextField t3,JLabel label){ //constructor 
			this.t1=t1;
			this.t2=t2;
			this.t3=t3;
			this.label=label; 
		}
		public void actionPerformed(ActionEvent e){ //interface �� abstract method body �ۼ� 
		
		if(e.getSource()==b1){ //component�� source �� b1�� ��� //Confirm 
			
			try{
			int result_Int=Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText()); //textfield �� �Է°��� text �̹Ƿ� String->Integer ��ȯ 
			String result_String=Integer.toString(result_Int); //textfield�� ����ϱ� ���� Integer->String ���� ��ȯ 
			t3.setText(result_String); //textfield�� ���� 
			label.setText("You got the result."); //change label 
			}
				
			catch(Exception ex){ //exception handling 
				t1.setText("");
				t2.setText("");
				t3.setText(""); //erase textfield 
				label.setText("Wrong input. Try again."); //change label 
			}
				
			}
			
		else //source �� b2�� ��� //New 
		{
			t1.setText("");
			t2.setText("");
			t3.setText(""); //erase textfield 
			label.setText("Try new data"); //change label 
		}
	}
	}
	public static void main(String[] args) {
		MyFrame t=new MyFrame(); //Frame ��ü ���� 
	}
}
		
	

