package com.andrej;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.UIManager;

public class CalculatorGUI {

	private JFrame frame;
	private JTextField textInput;
	private long broj;
	private long plusBr;
	private long minusBr;
	private long putaBr;
	private double deljenjeBr;
	private long resultBr;
	private long resultLong;
	private boolean isAddition = false;
	private boolean isSubtraction = false;
	private boolean isMultiplication = false;
	private boolean isDivision = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI window = new CalculatorGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public CalculatorGUI() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	
	
	private void addNumber(String num) {
		if(textInput.getText().equals("0")) {
			textInput.setText(num);
		}else {
			String txt = textInput.getText();
			txt += num;
			textInput.setText(txt);

		}
	}
	
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 425, 403);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		textInput = new JTextField();
		textInput.setEditable(false);
		textInput.setForeground(UIManager.getColor("Button.background"));
		textInput.setBackground(UIManager.getColor("Button.darkShadow"));
		textInput.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		textInput.setBounds(6, 6, 413, 69);
		frame.getContentPane().add(textInput);
		textInput.setColumns(10);
		textInput.setText("0");
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumber("7");
			}
		});
		btn7.setBounds(16, 87, 90, 60);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumber("8");
			}
		});
		btn8.setBounds(118, 87, 90, 60);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumber("9");
			}
		});
		btn9.setBounds(220, 87, 90, 60);
		frame.getContentPane().add(btn9);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isSubtraction = false;
				isAddition = false;
				isMultiplication = false;
				isDivision = true;
				String br = textInput.getText();
				deljenjeBr = Long.parseLong(br);
				textInput.setText(null);	
			}
		});
		btnDivide.setBounds(322, 87, 90, 60);
		frame.getContentPane().add(btnDivide);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumber("4");
			}
		});
		btn4.setBounds(16, 159, 90, 60);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumber("5");
			}
		});
		btn5.setBounds(118, 159, 90, 60);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumber("6");
			}
		});
		btn6.setBounds(220, 159, 90, 60);
		frame.getContentPane().add(btn6);
		
		JButton btnMultiply = new JButton("X");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isSubtraction = false;
				isAddition = false;
				isMultiplication = true;
				isDivision = false;
				String br = textInput.getText();
				putaBr = Long.parseLong(br);
				textInput.setText(null);	
				
			}
		});
		btnMultiply.setBounds(322, 159, 90, 60);
		frame.getContentPane().add(btnMultiply);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumber("1");
			}
		});
		btn1.setBounds(16, 231, 90, 60);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumber("2");
			}
		});
		btn2.setBounds(118, 231, 90, 60);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumber("3");
			}
		});
		btn3.setBounds(220, 231, 90, 60);
		frame.getContentPane().add(btn3);
		
		JButton btnSubtract = new JButton("-");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isSubtraction = true;
				isAddition = false;
				isMultiplication = false;
				isDivision = false;
				String br = textInput.getText();
				minusBr = Long.parseLong(br);
				textInput.setText(null);	
			}
		});
		btnSubtract.setBounds(322, 231, 90, 60);
		frame.getContentPane().add(btnSubtract);
		
		JButton btn0 = new JButton("0");		
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumber("0");
			}
		});
		btn0.setBounds(16, 303, 90, 60);
		frame.getContentPane().add(btn0);
		
		JButton btnAC = new JButton("AC");
		btnAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textInput.setText("0");
			}
		});
		btnAC.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnAC.setBounds(118, 303, 90, 60);
		frame.getContentPane().add(btnAC);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if(isAddition) {
					String br = textInput.getText();
					long resultLong = Long.parseLong(br);
					long resultBr = resultLong + plusBr;
					textInput.setText(String.valueOf(resultBr));
					}else if(isSubtraction) {
						String minBrStr = textInput.getText();
						long minBr =  Long.parseLong(minBrStr);
						long oduzimanje = minusBr - minBr;
						textInput.setText(String.valueOf(oduzimanje));
					}else if(isMultiplication) {
						String putaBrStr = textInput.getText();
						long xBr = Long.parseLong(putaBrStr);
						long mnozenje = xBr * putaBr;
						textInput.setText(String.valueOf(mnozenje));
					}else if(isDivision) {
						String putaBrStr = textInput.getText();
						double podBr = Long.parseLong(putaBrStr);
						double deljenje = deljenjeBr / podBr;
						textInput.setText(String.valueOf(deljenje));
					}
				}
		});
		btnEqual.setBounds(220, 303, 90, 60);
		frame.getContentPane().add(btnEqual);
		
		JButton btnAddition = new JButton("+");
		btnAddition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isAddition = true;
				String br = textInput.getText();
				plusBr = Long.parseLong(br);
				textInput.setText(null);	
			}
		});
		btnAddition.setBounds(322, 303, 90, 60);
		frame.getContentPane().add(btnAddition);
	}
}
