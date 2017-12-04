package com.example.maven.convertTheValues;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class MainFrames {

	private JFrame frame = new JFrame();
	private JLabel labelradians = new JLabel("Enter the value in radians:");
	private JLabel labeldegrees = new JLabel("Enter the value in degrees:");
	private JLabel lblResult = new JLabel("Result:");
	private JButton btnDegrees = new JButton("Degrees");
	private JButton btnRadians = new JButton("Radians");
	
	private JTextField textFieldDegrees = new JTextField();
	private JTextField textFieldRadians = new JTextField();
	
	ConversorDegresRadians cdr = new ConversorDegresRadians();

	/**
	 * Create the application.
	 */
	public MainFrames() {
		initialize();
		addComponetsToFrame();
		addActionListeners();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//properties for frame
		frame.setTitle("Degrees to radians");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		//set to main
		frame.setVisible(true);		
		
		//properties for label
		labelradians.setBounds(65, 82, 206, 15);	
		labeldegrees.setBounds(61, 31, 241, 15);
		lblResult.setBounds(64, 173, 319, 15);
		//properties for textField
		textFieldDegrees.setColumns(10);
		textFieldDegrees.setBounds(61, 55, 114, 19);	
		textFieldRadians.setBounds(63, 105, 114, 19);		
		textFieldRadians.setColumns(10);	
				
		//properties for button
		btnDegrees.setBounds(60, 225, 117, 25);	
		btnRadians.setBounds(220, 225, 117, 25);
		
		

	}

	public void addComponetsToFrame() {
		frame.getContentPane().add(btnRadians);
		frame.getContentPane().add(btnDegrees);
		frame.getContentPane().add(lblResult);
		frame.getContentPane().add(textFieldRadians);
		frame.getContentPane().add(textFieldDegrees);
		frame.getContentPane().add(labeldegrees);
		frame.getContentPane().add(labelradians);	
	}
	public void addActionListeners(){
		btnDegrees.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double r = cdr.degrees(Double.parseDouble(textFieldDegrees.getText()));			
				lblResult.setText("Result: " + r);
			}
		});
		btnRadians.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double r = cdr.radians(Double.parseDouble(textFieldRadians.getText()));			
				lblResult.setText("Result: " + r);
			}
		});
	}
}
