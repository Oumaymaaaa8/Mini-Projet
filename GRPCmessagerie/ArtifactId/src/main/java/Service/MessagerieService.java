package Service;

import io.grpc.stub.StreamObserver;
import messagerie.MessageOuterClass.GetMessagesRequest;
import messagerie.MessageOuterClass.Message;
import messagerie.MessageOuterClass.MessageRequest;
import messagerie.MessageOuterClass.MessageResponse;
import messagerie.messageGrpc.messageImplBase;

public class MessagerieService extends  messageImplBase{

	@Override
	public void sendMessage(MessageRequest request, StreamObserver<MessageResponse> responseObserver) {
		String name = request.getSenderId();
		String dest = request.getRecipientId();
        String message = request.getMessageText();
        
		MessageResponse.Builder reponse = MessageResponse.newBuilder();
        reponse.setStatus("SUCCES");
		responseObserver.onNext(reponse.build());
		responseObserver.onCompleted();	}

	@Override
	public void getMessages(GetMessagesRequest request, StreamObserver<Message> responseObserver) {
		
		  Message message1 = Message.newBuilder()
                  .setMessageId("1")
                  .setSenderId("sender1")
                  .setMessageText("Hello from sender1")
                  .build();
          Message message2 = Message.newBuilder()
                  .setMessageId("2")
                  .setSenderId("sender2")
                  .setMessageText("Hello from sender2")
                  .build();
          responseObserver.onNext(message1);
          responseObserver.onNext(message2);
          responseObserver.onCompleted();
	
	}

	

}
