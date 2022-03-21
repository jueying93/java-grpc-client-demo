
package com.hw.grpc.client.demo;


/**
 * @author zmayu
 * @desc TODO
 * @date 2021/3/11 8:12 下午
 **/

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import proto.EvaManageServiceGrpc;
import proto.EvaResult;
import proto.EvaUserLog;


public class HelloWorldClient {

    private final EvaManageServiceGrpc.EvaManageServiceBlockingStub blockingStub;


    public HelloWorldClient(String target) {

        ManagedChannel channel = ManagedChannelBuilder.forTarget(target)
                .usePlaintext()
                .build();
        blockingStub = EvaManageServiceGrpc.newBlockingStub(channel);
    }

    public void saveEvaUserLog(int type, String systemCode) {
        EvaUserLog request = EvaUserLog.newBuilder().setName("zmayu")
                .setIp("192.168.20.1")
                .setType(type)
                .setSystemCode(systemCode)
                .setStaffId("1234567893")
                .build();
        EvaResult response = blockingStub.saveEvaUserLog(request);
        System.out.println(response.getMessage());
    }

    public static void main(String[] args) throws InterruptedException {
        String host = "106.55.216.90:55566";
        HelloWorldClient client = new HelloWorldClient(host);
        for (int i = 0; i < 5; i++) {
            client.saveEvaUserLog(1, "test");
        }

    }


}
