package proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: car.proto")
public final class CarServiceGrpc {

  private CarServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.CarService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.CreateCarRequest,
      proto.CreateCarResponse> getCreateCarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCar",
      requestType = proto.CreateCarRequest.class,
      responseType = proto.CreateCarResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.CreateCarRequest,
      proto.CreateCarResponse> getCreateCarMethod() {
    io.grpc.MethodDescriptor<proto.CreateCarRequest, proto.CreateCarResponse> getCreateCarMethod;
    if ((getCreateCarMethod = CarServiceGrpc.getCreateCarMethod) == null) {
      synchronized (CarServiceGrpc.class) {
        if ((getCreateCarMethod = CarServiceGrpc.getCreateCarMethod) == null) {
          CarServiceGrpc.getCreateCarMethod = getCreateCarMethod = 
              io.grpc.MethodDescriptor.<proto.CreateCarRequest, proto.CreateCarResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.CarService", "CreateCar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.CreateCarRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.CreateCarResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CarServiceMethodDescriptorSupplier("CreateCar"))
                  .build();
          }
        }
     }
     return getCreateCarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.DeleteCarRequest,
      proto.DeleteCarResponse> getDeleteCarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCar",
      requestType = proto.DeleteCarRequest.class,
      responseType = proto.DeleteCarResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.DeleteCarRequest,
      proto.DeleteCarResponse> getDeleteCarMethod() {
    io.grpc.MethodDescriptor<proto.DeleteCarRequest, proto.DeleteCarResponse> getDeleteCarMethod;
    if ((getDeleteCarMethod = CarServiceGrpc.getDeleteCarMethod) == null) {
      synchronized (CarServiceGrpc.class) {
        if ((getDeleteCarMethod = CarServiceGrpc.getDeleteCarMethod) == null) {
          CarServiceGrpc.getDeleteCarMethod = getDeleteCarMethod = 
              io.grpc.MethodDescriptor.<proto.DeleteCarRequest, proto.DeleteCarResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.CarService", "DeleteCar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.DeleteCarRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.DeleteCarResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CarServiceMethodDescriptorSupplier("DeleteCar"))
                  .build();
          }
        }
     }
     return getDeleteCarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.GetCarRequest,
      proto.GetCarResponse> getGetCarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCar",
      requestType = proto.GetCarRequest.class,
      responseType = proto.GetCarResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.GetCarRequest,
      proto.GetCarResponse> getGetCarMethod() {
    io.grpc.MethodDescriptor<proto.GetCarRequest, proto.GetCarResponse> getGetCarMethod;
    if ((getGetCarMethod = CarServiceGrpc.getGetCarMethod) == null) {
      synchronized (CarServiceGrpc.class) {
        if ((getGetCarMethod = CarServiceGrpc.getGetCarMethod) == null) {
          CarServiceGrpc.getGetCarMethod = getGetCarMethod = 
              io.grpc.MethodDescriptor.<proto.GetCarRequest, proto.GetCarResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.CarService", "GetCar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.GetCarRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.GetCarResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CarServiceMethodDescriptorSupplier("GetCar"))
                  .build();
          }
        }
     }
     return getGetCarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.ListCarRequest,
      proto.ListCarResponse> getListCarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCar",
      requestType = proto.ListCarRequest.class,
      responseType = proto.ListCarResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.ListCarRequest,
      proto.ListCarResponse> getListCarMethod() {
    io.grpc.MethodDescriptor<proto.ListCarRequest, proto.ListCarResponse> getListCarMethod;
    if ((getListCarMethod = CarServiceGrpc.getListCarMethod) == null) {
      synchronized (CarServiceGrpc.class) {
        if ((getListCarMethod = CarServiceGrpc.getListCarMethod) == null) {
          CarServiceGrpc.getListCarMethod = getListCarMethod = 
              io.grpc.MethodDescriptor.<proto.ListCarRequest, proto.ListCarResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.CarService", "ListCar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ListCarRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ListCarResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CarServiceMethodDescriptorSupplier("ListCar"))
                  .build();
          }
        }
     }
     return getListCarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.UpdateCarRequest,
      proto.UpdateCarResponse> getUpdateCarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCar",
      requestType = proto.UpdateCarRequest.class,
      responseType = proto.UpdateCarResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.UpdateCarRequest,
      proto.UpdateCarResponse> getUpdateCarMethod() {
    io.grpc.MethodDescriptor<proto.UpdateCarRequest, proto.UpdateCarResponse> getUpdateCarMethod;
    if ((getUpdateCarMethod = CarServiceGrpc.getUpdateCarMethod) == null) {
      synchronized (CarServiceGrpc.class) {
        if ((getUpdateCarMethod = CarServiceGrpc.getUpdateCarMethod) == null) {
          CarServiceGrpc.getUpdateCarMethod = getUpdateCarMethod = 
              io.grpc.MethodDescriptor.<proto.UpdateCarRequest, proto.UpdateCarResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.CarService", "UpdateCar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.UpdateCarRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.UpdateCarResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CarServiceMethodDescriptorSupplier("UpdateCar"))
                  .build();
          }
        }
     }
     return getUpdateCarMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CarServiceStub newStub(io.grpc.Channel channel) {
    return new CarServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CarServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CarServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CarServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CarServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CarServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createCar(proto.CreateCarRequest request,
        io.grpc.stub.StreamObserver<proto.CreateCarResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateCarMethod(), responseObserver);
    }

    /**
     */
    public void deleteCar(proto.DeleteCarRequest request,
        io.grpc.stub.StreamObserver<proto.DeleteCarResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteCarMethod(), responseObserver);
    }

    /**
     */
    public void getCar(proto.GetCarRequest request,
        io.grpc.stub.StreamObserver<proto.GetCarResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCarMethod(), responseObserver);
    }

    /**
     */
    public void listCar(proto.ListCarRequest request,
        io.grpc.stub.StreamObserver<proto.ListCarResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListCarMethod(), responseObserver);
    }

    /**
     */
    public void updateCar(proto.UpdateCarRequest request,
        io.grpc.stub.StreamObserver<proto.UpdateCarResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateCarMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateCarMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.CreateCarRequest,
                proto.CreateCarResponse>(
                  this, METHODID_CREATE_CAR)))
          .addMethod(
            getDeleteCarMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.DeleteCarRequest,
                proto.DeleteCarResponse>(
                  this, METHODID_DELETE_CAR)))
          .addMethod(
            getGetCarMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.GetCarRequest,
                proto.GetCarResponse>(
                  this, METHODID_GET_CAR)))
          .addMethod(
            getListCarMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.ListCarRequest,
                proto.ListCarResponse>(
                  this, METHODID_LIST_CAR)))
          .addMethod(
            getUpdateCarMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.UpdateCarRequest,
                proto.UpdateCarResponse>(
                  this, METHODID_UPDATE_CAR)))
          .build();
    }
  }

  /**
   */
  public static final class CarServiceStub extends io.grpc.stub.AbstractStub<CarServiceStub> {
    private CarServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CarServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CarServiceStub(channel, callOptions);
    }

    /**
     */
    public void createCar(proto.CreateCarRequest request,
        io.grpc.stub.StreamObserver<proto.CreateCarResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateCarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCar(proto.DeleteCarRequest request,
        io.grpc.stub.StreamObserver<proto.DeleteCarResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteCarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCar(proto.GetCarRequest request,
        io.grpc.stub.StreamObserver<proto.GetCarResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listCar(proto.ListCarRequest request,
        io.grpc.stub.StreamObserver<proto.ListCarResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListCarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCar(proto.UpdateCarRequest request,
        io.grpc.stub.StreamObserver<proto.UpdateCarResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateCarMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CarServiceBlockingStub extends io.grpc.stub.AbstractStub<CarServiceBlockingStub> {
    private CarServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CarServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CarServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.CreateCarResponse createCar(proto.CreateCarRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateCarMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.DeleteCarResponse deleteCar(proto.DeleteCarRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteCarMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.GetCarResponse getCar(proto.GetCarRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCarMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.ListCarResponse listCar(proto.ListCarRequest request) {
      return blockingUnaryCall(
          getChannel(), getListCarMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.UpdateCarResponse updateCar(proto.UpdateCarRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateCarMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CarServiceFutureStub extends io.grpc.stub.AbstractStub<CarServiceFutureStub> {
    private CarServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CarServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CarServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.CreateCarResponse> createCar(
        proto.CreateCarRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateCarMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.DeleteCarResponse> deleteCar(
        proto.DeleteCarRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteCarMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.GetCarResponse> getCar(
        proto.GetCarRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCarMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.ListCarResponse> listCar(
        proto.ListCarRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListCarMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.UpdateCarResponse> updateCar(
        proto.UpdateCarRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateCarMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CAR = 0;
  private static final int METHODID_DELETE_CAR = 1;
  private static final int METHODID_GET_CAR = 2;
  private static final int METHODID_LIST_CAR = 3;
  private static final int METHODID_UPDATE_CAR = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CarServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CarServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_CAR:
          serviceImpl.createCar((proto.CreateCarRequest) request,
              (io.grpc.stub.StreamObserver<proto.CreateCarResponse>) responseObserver);
          break;
        case METHODID_DELETE_CAR:
          serviceImpl.deleteCar((proto.DeleteCarRequest) request,
              (io.grpc.stub.StreamObserver<proto.DeleteCarResponse>) responseObserver);
          break;
        case METHODID_GET_CAR:
          serviceImpl.getCar((proto.GetCarRequest) request,
              (io.grpc.stub.StreamObserver<proto.GetCarResponse>) responseObserver);
          break;
        case METHODID_LIST_CAR:
          serviceImpl.listCar((proto.ListCarRequest) request,
              (io.grpc.stub.StreamObserver<proto.ListCarResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CAR:
          serviceImpl.updateCar((proto.UpdateCarRequest) request,
              (io.grpc.stub.StreamObserver<proto.UpdateCarResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CarServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CarServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.CarOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CarService");
    }
  }

  private static final class CarServiceFileDescriptorSupplier
      extends CarServiceBaseDescriptorSupplier {
    CarServiceFileDescriptorSupplier() {}
  }

  private static final class CarServiceMethodDescriptorSupplier
      extends CarServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CarServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CarServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CarServiceFileDescriptorSupplier())
              .addMethod(getCreateCarMethod())
              .addMethod(getDeleteCarMethod())
              .addMethod(getGetCarMethod())
              .addMethod(getListCarMethod())
              .addMethod(getUpdateCarMethod())
              .build();
        }
      }
    }
    return result;
  }
}
