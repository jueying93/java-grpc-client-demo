# java-grpc-client-demo
   本工程为在使用java语言创建grpc客户端调用。
## 运行环境mac-os
## 通过proto文件生成java类
### 运行protoc命令，根据proto文件生成java文件
     protoc ./evamanage.proto  --java_out=../java/  
     使用该命令不能生成EvaManageServiceGrpc文件
### 通过maven生成
    执行maven中的lifecycle下的compile编译生成java文件，文件生成在target目录下，将对应的文件拷贝到src目录下。
