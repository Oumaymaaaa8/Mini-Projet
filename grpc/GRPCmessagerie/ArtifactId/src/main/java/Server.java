import java.io.IOException;
import Service.MessagerieService ; 
import io.grpc.ServerBuilder;

public class Server {

	public static void main(String[] args) throws IOException, InterruptedException {
		io.grpc.Server server = ServerBuilder.forPort(9090).addService( new MessagerieService() ).build();
		
		
     server.start();
     while(true) {
     System.out.println("serveur demarré au port" + server.getPort());
     server.awaitTermination();
	} 

}}