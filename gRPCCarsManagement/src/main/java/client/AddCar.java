package client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import proto.Car;
import proto.CarServiceGrpc;
import proto.CreateCarRequest;
import proto.CreateCarResponse;
import proto.UpdateCarRequest;
import proto.UpdateCarResponse;

public class AddCar extends JFrame {

	private JPanel contentPane;
	private JTextField tf_name;
	private JTextField tf_brand;
	private JTextField tf_manufacturingYear;
	private JTextField tf_modelYear;
	private JTextField tf_price;

	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCar frame = new AddCar();
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
	public AddCar() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(104, 33, 56, 15);
		panel.add(lblNome);

		tf_name = new JTextField();
		tf_name.setBounds(163, 31, 114, 19);
		panel.add(tf_name);
		tf_name.setColumns(10);

		JLabel lblNewLabel = new JLabel("Marca:");
		lblNewLabel.setBounds(104, 74, 56, 15);
		panel.add(lblNewLabel);

		tf_brand = new JTextField();
		tf_brand.setBounds(163, 72, 114, 19);
		panel.add(tf_brand);
		tf_brand.setColumns(10);

		JLabel lblAnoDeFabricao = new JLabel("Ano de Fabricação:");
		lblAnoDeFabricao.setBounds(16, 112, 144, 15);
		panel.add(lblAnoDeFabricao);

		tf_manufacturingYear = new JTextField();
		tf_manufacturingYear.setBounds(163, 110, 114, 19);
		panel.add(tf_manufacturingYear);
		tf_manufacturingYear.setColumns(10);

		JLabel lblAnoDeModelo = new JLabel("Ano de Modelo:");
		lblAnoDeModelo.setBounds(40, 150, 110, 15);
		panel.add(lblAnoDeModelo);

		tf_modelYear = new JTextField();
		tf_modelYear.setBounds(163, 148, 114, 19);
		panel.add(tf_modelYear);
		tf_modelYear.setColumns(10);

		JLabel lblPreo = new JLabel("Preço:");
		lblPreo.setBounds(104, 190, 56, 15);
		panel.add(lblPreo);

		tf_price = new JTextField();
		tf_price.setBounds(163, 188, 114, 19);
		panel.add(tf_price);
		tf_price.setColumns(10);

		JButton btnSave = new JButton("Salvar");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
				CarServiceGrpc.CarServiceBlockingStub carClient = CarServiceGrpc.newBlockingStub(channel);

				if (CarsManagement.id == 0) {

					// CREATE CAR
					Car car = Car.newBuilder().setName(tf_name.getText()).setBrand(tf_brand.getText())
							.setManufacturingYear(tf_manufacturingYear.getText()).setModelYear(tf_modelYear.getText())
							.setPrice(Double.parseDouble(tf_price.getText())).build();
					CreateCarResponse createCarResponse = carClient
							.createCar(CreateCarRequest.newBuilder().setCar(car).build());
					System.out.println(createCarResponse.toString());

				} else {
					
					Car car = Car.newBuilder().setName(tf_name.getText()).setBrand(tf_brand.getText())
							.setManufacturingYear(tf_manufacturingYear.getText()).setModelYear(tf_modelYear.getText())
							.setPrice(Double.parseDouble(tf_price.getText())).build();
					UpdateCarResponse updateCarResponse = carClient
							.updateCar(UpdateCarRequest.newBuilder().setCar(car).build());
					System.out.println(updateCarResponse.toString());
					CarsManagement.id = 0;

				}

				CarsManagement home = new CarsManagement();
				home.setVisible(true);
				dispose();
			}
		});
		btnSave.setBounds(300, 226, 117, 25);
		panel.add(btnSave);
	}
}
