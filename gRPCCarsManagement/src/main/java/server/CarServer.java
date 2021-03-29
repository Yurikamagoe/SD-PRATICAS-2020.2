package server;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class CarServer {
	public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Server start");
        Server server = ServerBuilder.forPort(50051)
                .addService(new CarServiceImpl())
                .build();
        server.start();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            server.shutdown();
        }));
        server.awaitTermination();
    }
}
