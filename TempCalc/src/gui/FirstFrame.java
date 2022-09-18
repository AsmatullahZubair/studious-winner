//Created by asmat using netbeans on 18-09-2022
package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class FirstFrame extends JFrame {

	public static float calculateTemp(float celsius) {
		return (float) ((celsius * 1.8 )+32);
	}
	
	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstFrame frame = new FirstFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FirstFrame() {
		setTitle("Temperature Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 813, 489);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		lblNewLabel_1 = new JLabel("Enter Temperature in celsius: ");
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("F");
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Click");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temperature = textField.getText();
				try {
				float celsius = Float.parseFloat(temperature);
				float fahrenhiet = FirstFrame.calculateTemp(celsius);
				String temp = fahrenhiet+"F";
				lblNewLabel.setText(temp);
				}
				catch (NumberFormatException nfe) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(btnNewButton, "Please enter temperature");
				}
			}
		});
		contentPane.add(btnNewButton);
	}

}
