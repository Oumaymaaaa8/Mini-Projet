package message;

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
    comments = "Source: message.proto")
public final class messageGrpc {

  private messageGrpc() {}

  public static final String SERVICE_NAME = "message";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<message.MessageOuterClass.MessageRequest,
      message.MessageOuterClass.MessageResponse> getSendMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendMessage",
      requestType = message.MessageOuterClass.MessageRequest.class,
      responseType = message.MessageOuterClass.MessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<message.MessageOuterClass.MessageRequest,
      message.MessageOuterClass.MessageResponse> getSendMessageMethod() {
    io.grpc.MethodDescriptor<message.MessageOuterClass.MessageRequest, message.MessageOuterClass.MessageResponse> getSendMessageMethod;
    if ((getSendMessageMethod = messageGrpc.getSendMessageMethod) == null) {
      synchronized (messageGrpc.class) {
        if ((getSendMessageMethod = messageGrpc.getSendMessageMethod) == null) {
          messageGrpc.getSendMessageMethod = getSendMessageMethod = 
              io.grpc.MethodDescriptor.<message.MessageOuterClass.MessageRequest, message.MessageOuterClass.MessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "message", "SendMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  message.MessageOuterClass.MessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  message.MessageOuterClass.MessageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new messageMethodDescriptorSupplier("SendMessage"))
                  .build();
          }
        }
     }
     return getSendMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<message.MessageOuterClass.GetMessagesRequest,
      message.MessageOuterClass.Message> getGetMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMessages",
      requestType = message.MessageOuterClass.GetMessagesRequest.class,
      responseType = message.MessageOuterClass.Message.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<message.MessageOuterClass.GetMessagesRequest,
      message.MessageOuterClass.Message> getGetMessagesMethod() {
    io.grpc.MethodDescriptor<message.MessageOuterClass.GetMessagesRequest, message.MessageOuterClass.Message> getGetMessagesMethod;
    if ((getGetMessagesMethod = messageGrpc.getGetMessagesMethod) == null) {
      synchronized (messageGrpc.class) {
        if ((getGetMessagesMethod = messageGrpc.getGetMessagesMethod) == null) {
          messageGrpc.getGetMessagesMethod = getGetMessagesMethod = 
              io.grpc.MethodDescriptor.<message.MessageOuterClass.GetMessagesRequest, message.MessageOuterClass.Message>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "message", "GetMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  message.MessageOuterClass.GetMessagesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  message.MessageOuterClass.Message.getDefaultInstance()))
                  .setSchemaDescriptor(new messageMethodDescriptorSupplier("GetMessages"))
                  .build();
          }
        }
     }
     return getGetMessagesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static messageStub newStub(io.grpc.Channel channel) {
    return new messageStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static messageBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new messageBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static messageFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new messageFutureStub(channel);
  }

  /**
   */
  public static abstract class messageImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendMessage(message.MessageOuterClass.MessageRequest request,
        io.grpc.stub.StreamObserver<message.MessageOuterClass.MessageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendMessageMethod(), responseObserver);
    }

    /**
     */
    public void getMessages(message.MessageOuterClass.GetMessagesRequest request,
        io.grpc.stub.StreamObserver<message.MessageOuterClass.Message> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMessagesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                message.MessageOuterClass.MessageRequest,
                message.MessageOuterClass.MessageResponse>(
                  this, METHODID_SEND_MESSAGE)))
          .addMethod(
            getGetMessagesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                message.MessageOuterClass.GetMessagesRequest,
                message.MessageOuterClass.Message>(
                  this, METHODID_GET_MESSAGES)))
          .build();
    }
  }

  /**
   */
  public static final class messageStub extends io.grpc.stub.AbstractStub<messageStub> {
    private messageStub(io.grpc.Channel channel) {
      super(channel);
    }

    private messageStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected messageStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new messageStub(channel, callOptions);
    }

    /**
     */
    public void sendMessage(message.MessageOuterClass.MessageRequest request,
        io.grpc.stub.StreamObserver<message.MessageOuterClass.MessageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMessages(message.MessageOuterClass.GetMessagesRequest request,
        io.grpc.stub.StreamObserver<message.MessageOuterClass.Message> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetMessagesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class messageBlockingStub extends io.grpc.stub.AbstractStub<messageBlockingStub> {
    private messageBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private messageBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected messageBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new messageBlockingStub(channel, callOptions);
    }

    /**
     */
    public message.MessageOuterClass.MessageResponse sendMessage(message.MessageOuterClass.MessageRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<message.MessageOuterClass.Message> getMessages(
        message.MessageOuterClass.GetMessagesRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetMessagesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class messageFutureStub extends io.grpc.stub.AbstractStub<messageFutureStub> {
    private messageFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private messageFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected messageFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new messageFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<message.MessageOuterClass.MessageResponse> sendMessage(
        message.MessageOuterClass.MessageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_MESSAGE = 0;
  private static final int METHODID_GET_MESSAGES = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final messageImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(messageImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_MESSAGE:
          serviceImpl.sendMessage((message.MessageOuterClass.MessageRequest) request,
              (io.grpc.stub.StreamObserver<message.MessageOuterClass.MessageResponse>) responseObserver);
          break;
        case METHODID_GET_MESSAGES:
          serviceImpl.getMessages((message.MessageOuterClass.GetMessagesRequest) request,
              (io.grpc.stub.StreamObserver<message.MessageOuterClass.Message>) responseObserver);
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

  private static abstract class messageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    messageBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return message.MessageOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("message");
    }
  }

  private static final class messageFileDescriptorSupplier
      extends messageBaseDescriptorSupplier {
    messageFileDescriptorSupplier() {}
  }

  private static final class messageMethodDescriptorSupplier
      extends messageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    messageMethodDescriptorSupplier(String methodName) {
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
      synchronized (messageGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new messageFileDescriptorSupplier())
              .addMethod(getSendMessageMethod())
              .addMethod(getGetMessagesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
