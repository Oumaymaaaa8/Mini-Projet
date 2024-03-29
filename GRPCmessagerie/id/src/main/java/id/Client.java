package id;

import java.util.Iterator;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import messagerie.MessageOuterClass.GetMessagesRequest;
import messagerie.MessageOuterClass.Message;
import messagerie.MessageOuterClass.MessageRequest;
import messagerie.MessageOuterClass.MessageResponse;
import messagerie.messageGrpc;
import messagerie.messageGrpc.messageBlockingStub;

public class Client {

	public static void main(String[] args) {
    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();
    messageBlockingStub msgStub = messageGrpc.newBlockingStub(channel);
    MessageRequest msgRequest = MessageRequest.newBuilder().setSenderId("hela").setRecipientId("touna").setMessageText("bonjour").build();
    
    MessageResponse response =   msgStub.sendMessage(msgRequest);
    System.out.println(response.getStatus());
    ManagedChannel channel2 = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();

    messageBlockingStub stub = messageGrpc.newBlockingStub(channel2);
    GetMessagesRequest request = GetMessagesRequest.newBuilder().setUserId("hela").build();
    Iterator<Message> rep =   stub.getMessages(request);
    while (rep.hasNext()) {
        Message element = rep.next();
        System.out.println(element.getMessageText());
    }    
    }

	
}
