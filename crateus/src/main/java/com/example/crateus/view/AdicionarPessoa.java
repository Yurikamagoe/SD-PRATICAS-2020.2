package com.example.crateus.view;
import javax.swing.*;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.example.crateus.controller.PersonController;
import com.example.crateus.controller.RestClient;
import com.example.crateus.model.Person;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdicionarPessoa {

	JFrame frame;
	private JTextField tf_name;
	private JTextField tf_age;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdicionarPessoa window = new AdicionarPessoa();
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
	public AdicionarPessoa() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(12, 46, 53, 15);
		panel.add(lblNome);
		
		JLabel lblAdicionarPessoa = new JLabel("Adicionar Pessoa");
		lblAdicionarPessoa.setBounds(189, 5, 122, 15);
		panel.add(lblAdicionarPessoa);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setBounds(12, 73, 53, 15);
		panel.add(lblIdade);
		
		tf_name = new JTextField();
		tf_name.setBounds(83, 44, 114, 19);
		panel.add(tf_name);
		tf_name.setColumns(10);
		
		tf_age = new JTextField();
		tf_age.setColumns(10);
		tf_age.setBounds(83, 71, 114, 19);
		panel.add(tf_age);
		
		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = tf_name.getText();
				int age = Integer.parseInt(tf_age.getText());
				
				Person person = new Person();
				person.setName(name);
				person.setAge(age);
				
				RestClient.createPerson(person);
				
			}
		});
		btnNewButton.setBounds(167, 127, 117, 25);
		panel.add(btnNewButton);
	}
}
