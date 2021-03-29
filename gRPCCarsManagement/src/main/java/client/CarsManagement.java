package client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import proto.Car;
import proto.CarServiceGrpc;
import proto.DeleteCarRequest;
import proto.DeleteCarResponse;
import proto.GetCarRequest;
import proto.GetCarResponse;
import proto.ListCarRequest;
import proto.ListCarResponse;

public class CarsManagement extends JFrame {

	private JPanel contentPane;
	private JTextField tf_id;
	private JTable tb_cars;

	List<Car> car = new ArrayList<>();
	public static int id = 0;

	private void criaJTable() {
		DefaultTableModel modelo = new DefaultTableModel();

		modelo.addColumn("Id");
		modelo.addColumn("Nome");
		modelo.addColumn("Marca");
		modelo.addColumn("Ano de Fabricação");
		modelo.addColumn("Ano de Modelo");
		modelo.addColumn("Preço");
		if (car.isEmpty()) {
			modelo.addRow(new String[] { "", "", "", "", "", "" });
		} else {
			for (Car c : car) {
				modelo.addRow(new String[] { String.valueOf(c.getId()), c.getName(), c.getBrand(),
						c.getManufacturingYear(), c.getModelYear(), String.valueOf(c.getPrice()) });
			}
			tb_cars.setModel(modelo);
		}
	}

	private void criaJTable2(Car c) {
		DefaultTableModel modelo = new DefaultTableModel();

		modelo.addColumn("Id");
		modelo.addColumn("Nome");
		modelo.addColumn("Marca");
		modelo.addColumn("Ano de Fabricação");
		modelo.addColumn("Ano de Modelo");
		modelo.addColumn("Preço");

		modelo.addRow(new String[] { String.valueOf(c.getId()), c.getName(), c.getBrand(), c.getManufacturingYear(),
				c.getModelYear(), String.valueOf(c.getPrice()) });

		tb_cars.setModel(modelo);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarsManagement frame = new CarsManagement();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Car valores() {
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
		CarServiceGrpc.CarServiceBlockingStub carClient = CarServiceGrpc.newBlockingStub(channel);
		GetCarResponse getCarResponse = carClient.getCar(GetCarRequest.newBuilder().setCarId(Integer.parseInt((String) tb_cars.getValueAt(tb_cars.getSelectedRow(), 0))).build());
		
		return getCarResponse.getCar();
		
	}

	/**
	 * Create the frame.
	 */
	public CarsManagement() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 666, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 0, 153));
		panel_1.setBounds(0, 0, 656, 173);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblCarsManagement = new JLabel("Cars Management");
		lblCarsManagement.setFont(new Font("Go Smallcaps", Font.BOLD, 32));
		lblCarsManagement.setForeground(new Color(255, 255, 255));
		lblCarsManagement.setBounds(220, 66, 358, 43);
		panel_1.add(lblCarsManagement);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(getClass().getResource("/car_icon.png")));
		label.setBounds(73, 31, 135, 97);
		panel_1.add(label);

		JButton btnAdd = new JButton("Adicionar");
		btnAdd.setIcon(new ImageIcon(getClass().getResource("/add.png")));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AddCar newCar = new AddCar();
				newCar.setVisible(true);
				dispose();
			}
		});
		btnAdd.setBounds(36, 420, 145, 44);
		panel.add(btnAdd);

		JButton btnUpdate = new JButton("Atualizar");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					
				AddCar newCar = new AddCar();
				Integer.parseInt((String) tb_cars.getValueAt(tb_cars.getSelectedRow(), 0)); 

				ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
				CarServiceGrpc.CarServiceBlockingStub carClient = CarServiceGrpc.newBlockingStub(channel);
				

				newCar.setVisible(true);
			   
	
				dispose();
				 
			}
		});
		btnUpdate.setIcon(new ImageIcon(getClass().getResource("/edit.png")));
		btnUpdate.setBounds(275, 420, 145, 44);
		panel.add(btnUpdate);

		JButton btnDelete = new JButton("Excluir");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
				CarServiceGrpc.CarServiceBlockingStub carClient = CarServiceGrpc.newBlockingStub(channel);
				
				DeleteCarResponse deleteCarResponse = carClient
		                .deleteCar(DeleteCarRequest.newBuilder().setCarId(Integer.parseInt((String) tb_cars.getValueAt(tb_cars.getSelectedRow(), 0))).build());
		        System.out.println(deleteCarResponse.getCarId());
		        
		       
			}
		});
		btnDelete.setIcon(new ImageIcon(getClass().getResource("/delete.png")));
		btnDelete.setBounds(516, 420, 117, 44);
		panel.add(btnDelete);

		tf_id = new JTextField();
		tf_id.setBounds(58, 201, 114, 19);
		panel.add(tf_id);
		tf_id.setColumns(10);

		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(33, 205, 27, 15);
		panel.add(lblId);

		criaJTable();

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
				CarServiceGrpc.CarServiceBlockingStub carClient = CarServiceGrpc.newBlockingStub(channel);

				// Get CAR
				GetCarResponse getCarResponse = carClient
						.getCar(GetCarRequest.newBuilder().setCarId(Integer.parseInt(tf_id.getText())).build());
				System.out.println(getCarResponse.getCar());
				
				criaJTable2(getCarResponse.getCar());

			}
		});
		btnBuscar.setBounds(184, 195, 117, 25);
		panel.add(btnBuscar);

		JButton btnListarTodos = new JButton("Listar todos");
		btnListarTodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
				CarServiceGrpc.CarServiceBlockingStub carClient = CarServiceGrpc.newBlockingStub(channel);
				// LIST CARS
				ListCarResponse listCarResponse = carClient.listCar(ListCarRequest.newBuilder().build());
				System.out.println(listCarResponse.getCarList());

				car = listCarResponse.getCarList();

				criaJTable();

			}
		});
		btnListarTodos.setBounds(397, 195, 130, 25);
		panel.add(btnListarTodos);

		JScrollPane barraRolagem = new JScrollPane();
		barraRolagem.setBounds(36, 239, 600, 150);
		panel.add(barraRolagem);

		tb_cars = new JTable();
		barraRolagem.setViewportView(tb_cars);
		tb_cars.setBackground(Color.LIGHT_GRAY);
		criaJTable();
	}
}
