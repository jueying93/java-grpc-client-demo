// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: evamanage.proto

package proto;

public interface EvaUserLogSearchDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.EvaUserLogSearchData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 Code = 1;</code>
   * @return The code.
   */
  int getCode();

  /**
   * <code>string Message = 2;</code>
   * @return The message.
   */
  String getMessage();
  /**
   * <code>string Message = 2;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>int32 Total = 3;</code>
   * @return The total.
   */
  int getTotal();

  /**
   * <code>repeated .proto.EvaUserLog Data = 4;</code>
   */
  java.util.List<EvaUserLog>
      getDataList();
  /**
   * <code>repeated .proto.EvaUserLog Data = 4;</code>
   */
  EvaUserLog getData(int index);
  /**
   * <code>repeated .proto.EvaUserLog Data = 4;</code>
   */
  int getDataCount();
  /**
   * <code>repeated .proto.EvaUserLog Data = 4;</code>
   */
  java.util.List<? extends EvaUserLogOrBuilder>
      getDataOrBuilderList();
  /**
   * <code>repeated .proto.EvaUserLog Data = 4;</code>
   */
  EvaUserLogOrBuilder getDataOrBuilder(
      int index);
}
