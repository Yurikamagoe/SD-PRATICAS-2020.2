package com.example.crateus.view;

import java.awt.EventQueue;

import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import com.example.crateus.controller.RestClient;
import com.example.crateus.model.Person;

import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;

public class EscolherPessoa {

	private JFrame frame;
	private JTextField tf_id;
	
    public static Person person = new Person();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EscolherPessoa window = new EscolherPessoa();
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
	public EscolherPessoa() {
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
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digite seu ID:");
		lblNewLabel.setBounds(37, 35, 100, 15);
		panel.add(lblNewLabel);
		
		JButton bt_ok = new JButton("OK");
		bt_ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
	
				int id = Integer.parseInt(tf_id.getText());
				
				person = RestClient.getPersonById(id);
				
				EnviarMensagens envMensagem = new EnviarMensagens();
				envMensagem.setVisible(true);		
				
			}
		});
		bt_ok.setBounds(151, 84, 117, 25);
		panel.add(bt_ok);
		
		tf_id = new JTextField();
		tf_id.setBounds(154, 30, 114, 25);
		panel.add(tf_id);
		tf_id.setColumns(10);
	}
}
