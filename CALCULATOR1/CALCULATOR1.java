package CALCULATOR1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class CALCULATOR1 implements ActionListener{
	 JFrame frame = new JFrame();
	 JPanel panel = new JPanel();
	  JTextArea textarea = new JTextArea();
	  
	  JButton button1 = new JButton();
	  JButton button2 = new JButton();
	  JButton button3 = new JButton();
	  JButton button4 = new JButton();
	  JButton button5 = new JButton();
	  JButton button6 = new JButton();
	  JButton button7 = new JButton();
	  JButton button8 = new JButton();
	  JButton button9 = new JButton();
	  JButton button0 = new JButton();
	  
	  JButton buttonadd = new JButton();
	  JButton buttonsub = new JButton();
	  JButton buttondiv = new JButton();
	  JButton buttonmulti = new JButton();
	  JButton buttonclear = new JButton();
	  JButton buttondot = new JButton();
	  JButton buttonequals = new JButton();
	  
	  double num1,num2,result;
	 int add=0,multi=0,div=0,sub=0;
	 
	 public CALCULATOR1() {
	
		 frame.setSize(350,400);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setVisible(true);
		 frame.setTitle("kalkulator");
		 frame.setResizable(false);
		 
		 frame.add(panel);
		 panel.setBackground(Color.orange);
		  Border border = BorderFactory.createLineBorder(Color.black);
		 
		  panel.add(textarea);
		  
		  textarea.setBackground(Color.BLACK);
		  Border tborder= BorderFactory.createLineBorder(Color.green);
		 textarea.setBorder(tborder);
		 Font font = new Font ("arial",Font.BOLD,35);
		 textarea.setFont(font);
		 textarea.setForeground(Color.green);
		 textarea.setPreferredSize(new Dimension (340,90));
		 textarea.setLineWrap(true);  
		 textarea.setVisible(true);
		  
		 button1.setPreferredSize(new Dimension (100,40));
		 button1.setIcon(new ImageIcon ("C:\\Users\\Red Devil\\Desktop\\Caculator Buttons\\button1.png"));
		 
		 button2.setPreferredSize(new Dimension (100,40));
		 button2.setIcon(new ImageIcon ("C:\\Users\\Red Devil\\Desktop\\Caculator Buttons\\button2.png"));
		 
		 button3.setPreferredSize(new Dimension (100,40));
		 button3.setIcon(new ImageIcon ("C:\\Users\\Red Devil\\Desktop\\Caculator Buttons\\button3.png"));
		 
		 button4.setPreferredSize(new Dimension (100,40));
		 button4.setIcon(new ImageIcon ("C:\\Users\\Red Devil\\Desktop\\Caculator Buttons\\button4.png"));
		 
		 button5.setPreferredSize(new Dimension (100,40));
		 button5.setIcon(new ImageIcon ("C:\\Users\\Red Devil\\Desktop\\Caculator Buttons\\button5.png"));
		 
		 button6.setPreferredSize(new Dimension (100,40));
		 button6.setIcon(new ImageIcon ("C:\\Users\\Red Devil\\Desktop\\Caculator Buttons\\button6.png"));
		 
		 button7.setPreferredSize(new Dimension (100,40));
		 button7.setIcon(new ImageIcon ("C:\\Users\\Red Devil\\Desktop\\Caculator Buttons\\button7.png"));
		 
		 button8.setPreferredSize(new Dimension (100,40));
		 button8.setIcon(new ImageIcon ("C:\\Users\\Red Devil\\Desktop\\Caculator Buttons\\button8.png"));
		 
		 button9.setPreferredSize(new Dimension (100,40));
		 button9.setIcon(new ImageIcon ("C:\\Users\\Red Devil\\Desktop\\Caculator Buttons\\button9.png"));
		 
		 button0.setPreferredSize(new Dimension (100,40));
		 button0.setIcon(new ImageIcon ("C:\\Users\\Red Devil\\Desktop\\Caculator Buttons\\button0.png"));
		 
		 
		 buttonadd.setPreferredSize(new Dimension (100,40));
		 buttonadd.setIcon(new ImageIcon ("C:\\Users\\Red Devil\\Desktop\\Caculator Buttons\\buttonadd.png"));
		 
		 buttonsub.setPreferredSize(new Dimension (100,40));
		 buttonsub.setIcon(new ImageIcon ("C:\\Users\\Red Devil\\Desktop\\Caculator Buttons\\buttonsub.png"));

		 buttonmulti.setPreferredSize(new Dimension (100,40));
		 buttonmulti.setIcon(new ImageIcon ("C:\\Users\\Red Devil\\Desktop\\Caculator Buttons\\buttonmulti.png"));
		 
		 buttondiv.setPreferredSize(new Dimension (100,40));
		 buttondiv.setIcon(new ImageIcon ("C:\\Users\\Red Devil\\Desktop\\Caculator Buttons\\buttondiv.png"));
		 
		 buttondot.setPreferredSize(new Dimension (100,40));
		 buttondot.setIcon(new ImageIcon ("C:\\Users\\Red Devil\\Desktop\\Caculator Buttons\\buttondot.png"));
		 
		 buttonclear.setPreferredSize(new Dimension (100,40));
		 buttonclear.setIcon(new ImageIcon ("C:\\Users\\Red Devil\\Desktop\\Caculator Buttons\\buttonclear.png"));
		 
		 buttonequals.setPreferredSize(new Dimension (150,40));
		 buttonequals.setIcon(new ImageIcon ("C:\\Users\\Red Devil\\Desktop\\Caculator Buttons\\buttonequals.png"));
		 
		 panel.add(button1); 
		 panel.add(button2);
		 panel.add(button3);
		 panel.add(button4);
		 panel.add(button5);
		 panel.add(button6);
		 panel.add(button6);
		 panel.add(button7);
		 panel.add(button8);
		 panel.add(button9);
		 panel.add(button0);
		 
		 panel.add(buttonadd);
		 panel.add(buttonsub);
		 panel.add(buttonmulti);
		 panel.add(buttondiv);
		 panel.add(buttondot);
		 panel.add(buttonequals);
		 panel.add(buttonclear);
		 
		 button1.addActionListener((ActionListener) this);
		 button2.addActionListener((ActionListener) this);
		 button3.addActionListener((ActionListener) this);
		 button4.addActionListener((ActionListener) this);
		 button5.addActionListener((ActionListener) this);
		 button6.addActionListener((ActionListener) this);
		 button7.addActionListener((ActionListener) this);
		 button8.addActionListener((ActionListener) this);
		 button9.addActionListener((ActionListener) this);
		 button0.addActionListener((ActionListener) this);
		 
		 buttonadd.addActionListener((ActionListener) this);
		 buttonsub.addActionListener((ActionListener) this);
		 buttonmulti.addActionListener((ActionListener) this);
		 buttondiv.addActionListener((ActionListener) this);
		 
		 buttondot.addActionListener((ActionListener) this);
		 buttonclear.addActionListener((ActionListener) this);
		 buttonequals.addActionListener((ActionListener) this);
		 
		 
		 
		 
		 
		 
		 
	 }
	 
	 @Override
		public void actionPerformed(ActionEvent e) {
			
			Object source=e.getSource();
			
		 if (source==buttonclear)
		 {
			num1=0.0;
	        num2=0.0;
				
				textarea.setText("");
		 }
		 if (source==button1)
		 {
			 
			 textarea.append("1");
		 }
		 
		 if (source==button2)
		 {
			 textarea.append("2");
		 }
		 if (source==button3)
		 {
			 textarea.append("3");
		 }
		 if (source==button4)
		 {
			 textarea.append("4");
		 }
		 if (source==button5)
		 {
			 textarea.append("5");
		 }
		 if (source==button6)
		 {
			 textarea.append("6");
		 }
		 
		 if (source==button7)
		 {
			 textarea.append("7");
		 }
		 
		 if (source==button8)
		 {
			 textarea.append("8");
		 }
		 
		 if (source==button9)
		 {
			 textarea.append("9");
		 }
		 
		 if (source==button0)
		 {
			 textarea.append("0");
		 }
		 if (source==buttondot)
		 {
			 textarea.append(".");
		 }
		 
		 
		  
		 
		 if (source==buttonadd)
		 {
			 num1=number_reader();
			 textarea.setText("");
			add=1;
			div=0;
			sub=0;
			multi=0;	 
		 }
		 
		 if (source==buttondiv)
		 {
			 num1=number_reader();
			 textarea.setText("");
			add=0;
			div=1;
			sub=0;
			multi=0; 
		 }
		 if (source==buttonsub)
		 {
			 num1=number_reader();
			 textarea.setText("");
			add=0;
			div=0;
			sub=1;
			multi=0; 
		 }
		 if (source==buttonmulti)
		 {
			 num1=number_reader();
			 textarea.setText("");
			add=0;
			div=0;
			sub=0;
			multi=1; 
		 }
		
		 
		 if (source==buttonequals)
		 {
			 num2=number_reader();
			
			if(add>0) {
				result= num1 + num2;
				textarea.setText(Double.toString(result));
				}
			if(sub>0) {
				result= num1-num2;
				textarea.setText(Double.toString(result));
				}
			if(multi>0) {
				result= num1 * num2;
				textarea.setText(Double.toString(result));
				}
			if(div>0) {
				result= num1 / num2;
				textarea.setText(Double.toString(result));
				}
		 }
		 
		 
		 
	 }
	 
	 public double number_reader() {
		
		 
		 double resut;
		 
		 String s  ;
		 s=textarea.getText();
		 result =Double.valueOf(s);
		 return result;
	 }

	
	}
	 



