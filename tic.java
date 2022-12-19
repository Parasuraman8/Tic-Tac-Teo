import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
public class tic   
{
	int k,count;
	tic()
	{
		k=0;count=0;
		JFrame f=new JFrame("tic tac teo");
		final JButton b1=new JButton();
		b1.setBounds(100,100,100,100);
		final JButton b2=new JButton();
		b2.setBounds(250,100,100,100);
		final JButton b3=new JButton();
		b3.setBounds(400,100,100,100);
		final JButton b4=new JButton();
		b4.setBounds(100,250,100,100);
		final JButton b5=new JButton();
		b5.setBounds(250,250,100,100);
		final JButton b6=new JButton();
		b6.setBounds(400,250,100,100);
		final JButton b7=new JButton();
		b7.setBounds(100,400,100,100);
		final JButton b8=new JButton();
		b8.setBounds(250,400,100,100);
		final JButton b9=new JButton();
		b9.setBounds(400,400,100,100);
		final JButton b=new JButton("NEW");
		b.setBounds(250,550,100,30);
		final JTextField tf=new JTextField();
		tf.setBounds(200,600,250,75);
		f.add(tf);
	b1.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent e)
	{
	if(k==0)
	{
	b1.setText("X");
	k=1;
	b1.setEnabled(false);
							if(b1.getText()=="X"&&b5.getText()=="X"&&b9.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b1.getText()=="X"&&b2.getText()=="X"&&b3.getText()=="X")
	{	
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b1.getText()=="X"&&b4.getText()=="X"&&b7.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b4.getText()=="X"&&b5.getText()=="X"&&b6.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b7.getText()=="X"&&b8.getText()=="X"&&b9.getText()=="X")
	{	
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b2.getText()=="X"&&b5.getText()=="X"&&b8.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b3.getText()=="X"&&b6.getText()=="X"&&b9.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(count==9)
	{
	tf.setText("The match DRAW!");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	}
	else
	{
	b1.setText("O");
	k=0;
	b1.setEnabled(false);
	if(b1.getText()=="O"&&b5.getText()=="O"&&b9.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b1.getText()=="O"&&b2.getText()=="O"&&b3.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b1.getText()=="O"&&b4.getText()=="O"&&b7.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b4.getText()=="O"&&b5.getText()=="O"&&b6.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b7.getText()=="O"&&b8.getText()=="O"&&b9.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b2.getText()=="O"&&b5.getText()=="O"&&b8.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b3.getText()=="X"&&b6.getText()=="O"&&b9.getText()=="O")
	{	
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(count==9)
	{
	tf.setText("The match DRAW!");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	}
	}
	});
	b2.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent e)
	{
	if(k==0)
	{
	b2.setText("X");
	k=1;
	b2.setEnabled(false);
							if(b1.getText()=="X"&&b5.getText()=="X"&&b9.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b1.getText()=="X"&&b2.getText()=="X"&&b3.getText()=="X")
	{	
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b1.getText()=="X"&&b4.getText()=="X"&&b7.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b4.getText()=="X"&&b5.getText()=="X"&&b6.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b7.getText()=="X"&&b8.getText()=="X"&&b9.getText()=="X")
	{	
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b2.getText()=="X"&&b5.getText()=="X"&&b8.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b3.getText()=="X"&&b6.getText()=="X"&&b9.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(count==9)
	{
	tf.setText("The match DRAW!");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	}
	else
	{
	b2.setText("O");
	k=0;
	b2.setEnabled(false);
	if(b1.getText()=="O"&&b5.getText()=="O"&&b9.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b1.getText()=="O"&&b2.getText()=="O"&&b3.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b1.getText()=="O"&&b4.getText()=="O"&&b7.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b4.getText()=="O"&&b5.getText()=="O"&&b6.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b7.getText()=="O"&&b8.getText()=="O"&&b9.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b2.getText()=="O"&&b5.getText()=="O"&&b8.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b3.getText()=="X"&&b6.getText()=="O"&&b9.getText()=="O")
	{	
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(count==9)
	{
	tf.setText("The match DRAW!");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	}
	}
	});
	b3.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent e)
	{
	if(k==0)
	{
	b3.setText("X");
	k=1;
	b3.setEnabled(false);
							if(b1.getText()=="X"&&b5.getText()=="X"&&b9.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b1.getText()=="X"&&b2.getText()=="X"&&b3.getText()=="X")
	{	
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b1.getText()=="X"&&b4.getText()=="X"&&b7.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b4.getText()=="X"&&b5.getText()=="X"&&b6.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b7.getText()=="X"&&b8.getText()=="X"&&b9.getText()=="X")
	{	
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b2.getText()=="X"&&b5.getText()=="X"&&b8.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b3.getText()=="X"&&b6.getText()=="X"&&b9.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(count==9)
	{
	tf.setText("The match DRAW!");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	}
	else
	{
	b3.setText("O");
	k=0;
	b3.setEnabled(false);
	if(b1.getText()=="O"&&b5.getText()=="O"&&b9.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b1.getText()=="O"&&b2.getText()=="O"&&b3.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b1.getText()=="O"&&b4.getText()=="O"&&b7.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b4.getText()=="O"&&b5.getText()=="O"&&b6.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b7.getText()=="O"&&b8.getText()=="O"&&b9.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b2.getText()=="O"&&b5.getText()=="O"&&b8.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b3.getText()=="X"&&b6.getText()=="O"&&b9.getText()=="O")
	{	
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(count==9)
	{
	tf.setText("The match DRAW!");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	}
	}
	});
	b4.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent e)
	{
	if(k==0)
	{
	b4.setText("X");
	k=1;
	b4.setEnabled(false);
							if(b1.getText()=="X"&&b5.getText()=="X"&&b9.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b1.getText()=="X"&&b2.getText()=="X"&&b3.getText()=="X")
	{	
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b1.getText()=="X"&&b4.getText()=="X"&&b7.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b4.getText()=="X"&&b5.getText()=="X"&&b6.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b7.getText()=="X"&&b8.getText()=="X"&&b9.getText()=="X")
	{	
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b2.getText()=="X"&&b5.getText()=="X"&&b8.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b3.getText()=="X"&&b6.getText()=="X"&&b9.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(count==9)
	{
	tf.setText("The match DRAW!");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	}
	else
	{
	b4.setText("O");
	k=0;
	b4.setEnabled(false);
	if(b1.getText()=="O"&&b5.getText()=="O"&&b9.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b1.getText()=="O"&&b2.getText()=="O"&&b3.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b1.getText()=="O"&&b4.getText()=="O"&&b7.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b4.getText()=="O"&&b5.getText()=="O"&&b6.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b7.getText()=="O"&&b8.getText()=="O"&&b9.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b2.getText()=="O"&&b5.getText()=="O"&&b8.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b3.getText()=="X"&&b6.getText()=="O"&&b9.getText()=="O")
	{	
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(count==9)
	{
	tf.setText("The match DRAW!");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	}
	}
	});
	b5.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent e)
	{
	if(k==0)
	{
	b5.setText("X");
	k=1;
	b5.setEnabled(false);
							if(b1.getText()=="X"&&b5.getText()=="X"&&b9.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b1.getText()=="X"&&b2.getText()=="X"&&b3.getText()=="X")
	{	
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b1.getText()=="X"&&b4.getText()=="X"&&b7.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b4.getText()=="X"&&b5.getText()=="X"&&b6.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b7.getText()=="X"&&b8.getText()=="X"&&b9.getText()=="X")
	{	
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b2.getText()=="X"&&b5.getText()=="X"&&b8.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b3.getText()=="X"&&b6.getText()=="X"&&b9.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(count==9)
	{
	tf.setText("The match DRAW!");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	}
	else
	{
	b5.setText("O");
	k=0;
	b5.setEnabled(false);
	if(b1.getText()=="O"&&b5.getText()=="O"&&b9.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b1.getText()=="O"&&b2.getText()=="O"&&b3.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b1.getText()=="O"&&b4.getText()=="O"&&b7.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b4.getText()=="O"&&b5.getText()=="O"&&b6.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b7.getText()=="O"&&b8.getText()=="O"&&b9.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b2.getText()=="O"&&b5.getText()=="O"&&b8.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b3.getText()=="X"&&b6.getText()=="O"&&b9.getText()=="O")
	{	
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(count==9)
	{
	tf.setText("The match DRAW!");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	}
	}
	});
	b6.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent e)
	{
	if(k==0)
	{
	b6.setText("X");
	k=1;
	b6.setEnabled(false);
							if(b1.getText()=="X"&&b5.getText()=="X"&&b9.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b1.getText()=="X"&&b2.getText()=="X"&&b3.getText()=="X")
	{	
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b1.getText()=="X"&&b4.getText()=="X"&&b7.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b4.getText()=="X"&&b5.getText()=="X"&&b6.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b7.getText()=="X"&&b8.getText()=="X"&&b9.getText()=="X")
	{	
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b2.getText()=="X"&&b5.getText()=="X"&&b8.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b3.getText()=="X"&&b6.getText()=="X"&&b9.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(count==9)
	{
	tf.setText("The match DRAW!");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	}
	else
	{
	b6.setText("O");
	k=0;
	b6.setEnabled(false);
	if(b1.getText()=="O"&&b5.getText()=="O"&&b9.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b1.getText()=="O"&&b2.getText()=="O"&&b3.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b1.getText()=="O"&&b4.getText()=="O"&&b7.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b4.getText()=="O"&&b5.getText()=="O"&&b6.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b7.getText()=="O"&&b8.getText()=="O"&&b9.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b2.getText()=="O"&&b5.getText()=="O"&&b8.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b3.getText()=="X"&&b6.getText()=="O"&&b9.getText()=="O")
	{	
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(count==9)
	{
	tf.setText("The match DRAW!");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	}
	}
	});
	b7.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent e)
	{
	if(k==0)
	{
	b7.setText("X");
	k=1;
	b7.setEnabled(false);
							if(b1.getText()=="X"&&b5.getText()=="X"&&b9.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b1.getText()=="X"&&b2.getText()=="X"&&b3.getText()=="X")
	{	
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b1.getText()=="X"&&b4.getText()=="X"&&b7.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b4.getText()=="X"&&b5.getText()=="X"&&b6.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b7.getText()=="X"&&b8.getText()=="X"&&b9.getText()=="X")
	{	
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b2.getText()=="X"&&b5.getText()=="X"&&b8.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b3.getText()=="X"&&b6.getText()=="X"&&b9.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(count==9)
	{
	tf.setText("The match DRAW!");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	}
	else
	{
	b7.setText("O");
	k=0;
	b7.setEnabled(false);
	if(b1.getText()=="O"&&b5.getText()=="O"&&b9.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b1.getText()=="O"&&b2.getText()=="O"&&b3.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b1.getText()=="O"&&b4.getText()=="O"&&b7.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b4.getText()=="O"&&b5.getText()=="O"&&b6.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b7.getText()=="O"&&b8.getText()=="O"&&b9.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b2.getText()=="O"&&b5.getText()=="O"&&b8.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b3.getText()=="X"&&b6.getText()=="O"&&b9.getText()=="O")
	{	
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(count==9)
	{
	tf.setText("The match DRAW!");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	}
	}
	});
	b8.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent e)
	{
	if(k==0)
	{
	b8.setText("X");
	k=1;
	b8.setEnabled(false);
							if(b1.getText()=="X"&&b5.getText()=="X"&&b9.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b1.getText()=="X"&&b2.getText()=="X"&&b3.getText()=="X")
	{	
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b1.getText()=="X"&&b4.getText()=="X"&&b7.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b4.getText()=="X"&&b5.getText()=="X"&&b6.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b7.getText()=="X"&&b8.getText()=="X"&&b9.getText()=="X")
	{	
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b2.getText()=="X"&&b5.getText()=="X"&&b8.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b3.getText()=="X"&&b6.getText()=="X"&&b9.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(count==9)
	{
	tf.setText("The match DRAW!");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	}
	else
	{
	b8.setText("O");
	k=0;
	b8.setEnabled(false);
	if(b1.getText()=="O"&&b5.getText()=="O"&&b9.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b1.getText()=="O"&&b2.getText()=="O"&&b3.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b1.getText()=="O"&&b4.getText()=="O"&&b7.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b4.getText()=="O"&&b5.getText()=="O"&&b6.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b7.getText()=="O"&&b8.getText()=="O"&&b9.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b2.getText()=="O"&&b5.getText()=="O"&&b8.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b3.getText()=="X"&&b6.getText()=="O"&&b9.getText()=="O")
	{	
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(count==9)
	{
	tf.setText("The match DRAW!");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	}
	}
	});
	b9.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent e)
	{
	if(k==0)
	{
	b9.setText("X");
	k=1;
	b9.setEnabled(false);
							if(b1.getText()=="X"&&b5.getText()=="X"&&b9.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b1.getText()=="X"&&b2.getText()=="X"&&b3.getText()=="X")
	{	
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b1.getText()=="X"&&b4.getText()=="X"&&b7.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b4.getText()=="X"&&b5.getText()=="X"&&b6.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b7.getText()=="X"&&b8.getText()=="X"&&b9.getText()=="X")
	{	
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b2.getText()=="X"&&b5.getText()=="X"&&b8.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b3.getText()=="X"&&b6.getText()=="X"&&b9.getText()=="X")
	{
	tf.setText("PLAYER [ X ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(count==9)
	{
	tf.setText("The match DRAW!");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	}
	else
	{
	b9.setText("O");
	k=0;
	b9.setEnabled(false);
	if(b1.getText()=="O"&&b5.getText()=="O"&&b9.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b1.getText()=="O"&&b2.getText()=="O"&&b3.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b1.getText()=="O"&&b4.getText()=="O"&&b7.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b4.getText()=="O"&&b5.getText()=="O"&&b6.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b7.getText()=="O"&&b8.getText()=="O"&&b9.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b2.getText()=="O"&&b5.getText()=="O"&&b8.getText()=="O")
	{
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(b3.getText()=="X"&&b6.getText()=="O"&&b9.getText()=="O")
	{	
	tf.setText("PLAYER [ O ] IS WON");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	else if(count==9)
	{
	tf.setText("The match DRAW!");
						b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
						b4.setEnabled(false);b5.setEnabled(false);b6.setEnabled(false);
						b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
	}
	}
	}
	});

		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				k=0;
				count=0;
				b1.setText("");b1.setEnabled(true);
				b2.setText("");b2.setEnabled(true);
				b3.setText("");b3.setEnabled(true);
				b4.setText("");b4.setEnabled(true);
				b5.setText("");b5.setEnabled(true);
				b6.setText("");b6.setEnabled(true);
				b7.setText("");b7.setEnabled(true);
				b8.setText("");b8.setEnabled(true);
				b9.setText("");b9.setEnabled(true);
				tf.setText("");
			}
		});
		f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);
  		f.add(b6);f.add(b7);f.add(b8);f.add(b9);f.add(b);
		f.setLayout(null);
		f.setSize(600,600);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
	public static void main(String[] args)
	{
		tic ob=new tic();
	}
}