// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: evamanage.proto

package proto;

public final class Evamanage {
  private Evamanage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_EvaUserLog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_EvaUserLog_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_EvaLogCondition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_EvaLogCondition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_EvaUserLogSearchData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_EvaUserLogSearchData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_EvaResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_EvaResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017evamanage.proto\022\005proto\"\230\001\n\nEvaUserLog\022" +
      "\n\n\002Id\030\001 \001(\003\022\014\n\004Name\030\002 \001(\t\022\014\n\004Role\030\003 \001(\t\022" +
      "\n\n\002Ip\030\004 \001(\t\022\020\n\010CreateAt\030\005 \001(\t\022\017\n\007StaffId" +
      "\030\006 \001(\t\022\021\n\tStaffName\030\007 \001(\t\022\022\n\nSystemCode\030" +
      "\010 \001(\t\022\014\n\004Type\030\t \001(\005\"\217\001\n\017EvaLogCondition\022" +
      "\021\n\tStartTime\030\001 \001(\t\022\017\n\007EndTime\030\002 \001(\t\022\021\n\tP" +
      "ageIndex\030\003 \001(\005\022\020\n\010PageSize\030\004 \001(\005\022\021\n\tStaf" +
      "fName\030\005 \001(\t\022\022\n\nSystemCode\030\006 \001(\t\022\014\n\004Type\030" +
      "\007 \001(\005\"e\n\024EvaUserLogSearchData\022\014\n\004Code\030\001 " +
      "\001(\005\022\017\n\007Message\030\002 \001(\t\022\r\n\005Total\030\003 \001(\005\022\037\n\004D" +
      "ata\030\004 \003(\0132\021.proto.EvaUserLog\">\n\tEvaResul" +
      "t\022\014\n\004Code\030\001 \001(\005\022\017\n\007Message\030\002 \001(\t\022\022\n\nPrim" +
      "aryKey\030\003 \001(\0032\224\001\n\020EvaManageService\0227\n\016Sav" +
      "eEvaUserLog\022\021.proto.EvaUserLog\032\020.proto.E" +
      "vaResult\"\000\022G\n\016GetEvaUserLogs\022\026.proto.Eva" +
      "LogCondition\032\033.proto.EvaUserLogSearchDat" +
      "a\"\000B\005P\001\210\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_proto_EvaUserLog_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_EvaUserLog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_EvaUserLog_descriptor,
        new java.lang.String[] { "Id", "Name", "Role", "Ip", "CreateAt", "StaffId", "StaffName", "SystemCode", "Type", });
    internal_static_proto_EvaLogCondition_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_proto_EvaLogCondition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_EvaLogCondition_descriptor,
        new java.lang.String[] { "StartTime", "EndTime", "PageIndex", "PageSize", "StaffName", "SystemCode", "Type", });
    internal_static_proto_EvaUserLogSearchData_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_proto_EvaUserLogSearchData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_EvaUserLogSearchData_descriptor,
        new java.lang.String[] { "Code", "Message", "Total", "Data", });
    internal_static_proto_EvaResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_proto_EvaResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_EvaResult_descriptor,
        new java.lang.String[] { "Code", "Message", "PrimaryKey", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}