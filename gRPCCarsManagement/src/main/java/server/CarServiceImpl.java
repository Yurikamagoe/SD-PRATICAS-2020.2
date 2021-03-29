package server;

import java.util.HashMap;
import java.util.Map;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;
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

public class CarServiceImpl extends CarServiceGrpc.CarServiceImplBase {
 
    private Map<Integer, Car> carMap = new HashMap<Integer, Car>();
    private int i = 1;
 
    @Override
    public void createCar(CreateCarRequest request, StreamObserver<CreateCarResponse> responseObserver) {
        System.out.println("Creating Car");
        Car car = request.getCar();
 
        car = car.toBuilder().setId(i).setName(request.getCar().getName()).setBrand(request.getCar().getBrand()).setManufacturingYear(request.getCar().getManufacturingYear()).setModelYear(request.getCar().getModelYear()).setPrice(request.getCar().getPrice())
                .build();
 
        CreateCarResponse response = CreateCarResponse.newBuilder().setCar(car).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
 
        carMap.put(i, car);
        i++;
    }
 
    @Override
    public void deleteCar(DeleteCarRequest request, StreamObserver<DeleteCarResponse> responseObserver) {
        if (carMap.containsKey(request.getCarId())) {
            carMap.remove(request.getCarId());
            System.out.println("Car was deleted");
            responseObserver.onNext(DeleteCarResponse.newBuilder().setCarId(request.getCarId()).build());
            responseObserver.onCompleted();
        } else {
            System.out.println("Car not found");
            responseObserver.onError(Status.NOT_FOUND.asRuntimeException());
        }
    }
 
    @Override
    public void getCar(GetCarRequest request, StreamObserver<GetCarResponse> responseObserver) {
        System.out.println("Get Car");
        if (carMap.containsKey(request.getCarId())) {
            Car car = carMap.get(request.getCarId());
            GetCarResponse response = GetCarResponse.newBuilder().setCar(car).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } else {
            System.out.println("Car not found");
            responseObserver.onError(Status.NOT_FOUND.asRuntimeException());
        }
 
    }
 
    @Override
    public void listCar(ListCarRequest request, StreamObserver<ListCarResponse> responseObserver) {
        System.out.println("List Cars");
        ListCarResponse response = ListCarResponse.newBuilder().addAllCar(carMap.values()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}