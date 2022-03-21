package proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.29.0)",
    comments = "Source: evamanage.proto")
public final class EvaManageServiceGrpc {

  private EvaManageServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.EvaManageService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.EvaUserLog,
      proto.EvaResult> getSaveEvaUserLogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveEvaUserLog",
      requestType = proto.EvaUserLog.class,
      responseType = proto.EvaResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.EvaUserLog,
      proto.EvaResult> getSaveEvaUserLogMethod() {
    io.grpc.MethodDescriptor<proto.EvaUserLog, proto.EvaResult> getSaveEvaUserLogMethod;
    if ((getSaveEvaUserLogMethod = EvaManageServiceGrpc.getSaveEvaUserLogMethod) == null) {
      synchronized (EvaManageServiceGrpc.class) {
        if ((getSaveEvaUserLogMethod = EvaManageServiceGrpc.getSaveEvaUserLogMethod) == null) {
          EvaManageServiceGrpc.getSaveEvaUserLogMethod = getSaveEvaUserLogMethod =
              io.grpc.MethodDescriptor.<proto.EvaUserLog, proto.EvaResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SaveEvaUserLog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.EvaUserLog.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.EvaResult.getDefaultInstance()))
              .setSchemaDescriptor(new EvaManageServiceMethodDescriptorSupplier("SaveEvaUserLog"))
              .build();
        }
      }
    }
    return getSaveEvaUserLogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.EvaLogCondition,
      proto.EvaUserLogSearchData> getGetEvaUserLogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEvaUserLogs",
      requestType = proto.EvaLogCondition.class,
      responseType = proto.EvaUserLogSearchData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.EvaLogCondition,
      proto.EvaUserLogSearchData> getGetEvaUserLogsMethod() {
    io.grpc.MethodDescriptor<proto.EvaLogCondition, proto.EvaUserLogSearchData> getGetEvaUserLogsMethod;
    if ((getGetEvaUserLogsMethod = EvaManageServiceGrpc.getGetEvaUserLogsMethod) == null) {
      synchronized (EvaManageServiceGrpc.class) {
        if ((getGetEvaUserLogsMethod = EvaManageServiceGrpc.getGetEvaUserLogsMethod) == null) {
          EvaManageServiceGrpc.getGetEvaUserLogsMethod = getGetEvaUserLogsMethod =
              io.grpc.MethodDescriptor.<proto.EvaLogCondition, proto.EvaUserLogSearchData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEvaUserLogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.EvaLogCondition.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.EvaUserLogSearchData.getDefaultInstance()))
              .setSchemaDescriptor(new EvaManageServiceMethodDescriptorSupplier("GetEvaUserLogs"))
              .build();
        }
      }
    }
    return getGetEvaUserLogsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EvaManageServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EvaManageServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EvaManageServiceStub>() {
        @java.lang.Override
        public EvaManageServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EvaManageServiceStub(channel, callOptions);
        }
      };
    return EvaManageServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EvaManageServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EvaManageServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EvaManageServiceBlockingStub>() {
        @java.lang.Override
        public EvaManageServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EvaManageServiceBlockingStub(channel, callOptions);
        }
      };
    return EvaManageServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EvaManageServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EvaManageServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EvaManageServiceFutureStub>() {
        @java.lang.Override
        public EvaManageServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EvaManageServiceFutureStub(channel, callOptions);
        }
      };
    return EvaManageServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class EvaManageServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *保存用户日志
     * </pre>
     */
    public void saveEvaUserLog(proto.EvaUserLog request,
        io.grpc.stub.StreamObserver<proto.EvaResult> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveEvaUserLogMethod(), responseObserver);
    }

    /**
     * <pre>
     *查询用户日志
     * </pre>
     */
    public void getEvaUserLogs(proto.EvaLogCondition request,
        io.grpc.stub.StreamObserver<proto.EvaUserLogSearchData> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEvaUserLogsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSaveEvaUserLogMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.EvaUserLog,
                proto.EvaResult>(
                  this, METHODID_SAVE_EVA_USER_LOG)))
          .addMethod(
            getGetEvaUserLogsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.EvaLogCondition,
                proto.EvaUserLogSearchData>(
                  this, METHODID_GET_EVA_USER_LOGS)))
          .build();
    }
  }

  /**
   */
  public static final class EvaManageServiceStub extends io.grpc.stub.AbstractAsyncStub<EvaManageServiceStub> {
    private EvaManageServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EvaManageServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EvaManageServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *保存用户日志
     * </pre>
     */
    public void saveEvaUserLog(proto.EvaUserLog request,
        io.grpc.stub.StreamObserver<proto.EvaResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveEvaUserLogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *查询用户日志
     * </pre>
     */
    public void getEvaUserLogs(proto.EvaLogCondition request,
        io.grpc.stub.StreamObserver<proto.EvaUserLogSearchData> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEvaUserLogsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EvaManageServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<EvaManageServiceBlockingStub> {
    private EvaManageServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EvaManageServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EvaManageServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *保存用户日志
     * </pre>
     */
    public proto.EvaResult saveEvaUserLog(proto.EvaUserLog request) {
      return blockingUnaryCall(
          getChannel(), getSaveEvaUserLogMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *查询用户日志
     * </pre>
     */
    public proto.EvaUserLogSearchData getEvaUserLogs(proto.EvaLogCondition request) {
      return blockingUnaryCall(
          getChannel(), getGetEvaUserLogsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EvaManageServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EvaManageServiceFutureStub> {
    private EvaManageServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EvaManageServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EvaManageServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *保存用户日志
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.EvaResult> saveEvaUserLog(
        proto.EvaUserLog request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveEvaUserLogMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *查询用户日志
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.EvaUserLogSearchData> getEvaUserLogs(
        proto.EvaLogCondition request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEvaUserLogsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_EVA_USER_LOG = 0;
  private static final int METHODID_GET_EVA_USER_LOGS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EvaManageServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EvaManageServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE_EVA_USER_LOG:
          serviceImpl.saveEvaUserLog((proto.EvaUserLog) request,
              (io.grpc.stub.StreamObserver<proto.EvaResult>) responseObserver);
          break;
        case METHODID_GET_EVA_USER_LOGS:
          serviceImpl.getEvaUserLogs((proto.EvaLogCondition) request,
              (io.grpc.stub.StreamObserver<proto.EvaUserLogSearchData>) responseObserver);
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

  private static abstract class EvaManageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EvaManageServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.Evamanage.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EvaManageService");
    }
  }

  private static final class EvaManageServiceFileDescriptorSupplier
      extends EvaManageServiceBaseDescriptorSupplier {
    EvaManageServiceFileDescriptorSupplier() {}
  }

  private static final class EvaManageServiceMethodDescriptorSupplier
      extends EvaManageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EvaManageServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EvaManageServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EvaManageServiceFileDescriptorSupplier())
              .addMethod(getSaveEvaUserLogMethod())
              .addMethod(getGetEvaUserLogsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
