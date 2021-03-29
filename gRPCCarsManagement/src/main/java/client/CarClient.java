package client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import proto.Car;
import proto.CarServiceGrpc;
import proto.CreateCarRequest;
import proto.CreateCarResponse;
import proto.DeleteCarRequest;
import proto.DeleteCarResponse;
import proto.GetCarRequest;
import proto.GetCarResponse;
import proto.ListCarRequest;
import proto.ListCarResponse;

public class CarClient {
	 public static void main(String[] args) {
	        CarClient main = new CarClient();
	        main.run();
	    }
	 
	    private void run() {
	        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
	        CarServiceGrpc.CarServiceBlockingStub carClient = CarServiceGrpc.newBlockingStub(channel);
	 
	        // CREATE CAR
	        Car car = Car.newBuilder().setName("").setBrand("").setManufacturingYear("").setModelYear("").setPrice(10).build();
	        CreateCarResponse createCarResponse = carClient
	                .createCar(CreateCarRequest.newBuilder().setCar(car).build());
	        System.out.println(createCarResponse.toString());
	 
	        int carId = createCarResponse.getCar().getId();
	        
	        // Get CAR
	        GetCarResponse getCarResponse = carClient.getCar(GetCarRequest.newBuilder().setCarId(carId).build());
	        System.out.println(getCarResponse.getCar());
	 
	        // DELETE CAR
	        DeleteCarResponse deleteCarResponse = carClient
	                .deleteCar(DeleteCarRequest.newBuilder().setCarId(carId).build());
	        System.out.println(deleteCarResponse.getCarId());
	 
	        // LIST CARS
	        ListCarResponse listCarResponse = carClient.listCar(ListCarRequest.newBuilder().build());
	        System.out.println(listCarResponse.getCarList());
	    }
}
