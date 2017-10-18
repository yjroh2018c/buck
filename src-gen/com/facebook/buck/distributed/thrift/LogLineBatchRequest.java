/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-10-17")
public class LogLineBatchRequest implements org.apache.thrift.TBase<LogLineBatchRequest, LogLineBatchRequest._Fields>, java.io.Serializable, Cloneable, Comparable<LogLineBatchRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("LogLineBatchRequest");

  private static final org.apache.thrift.protocol.TField SLAVE_STREAM_FIELD_DESC = new org.apache.thrift.protocol.TField("slaveStream", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField BATCH_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("batchNumber", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new LogLineBatchRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new LogLineBatchRequestTupleSchemeFactory();

  public SlaveStream slaveStream; // optional
  public int batchNumber; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SLAVE_STREAM((short)1, "slaveStream"),
    BATCH_NUMBER((short)2, "batchNumber");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SLAVE_STREAM
          return SLAVE_STREAM;
        case 2: // BATCH_NUMBER
          return BATCH_NUMBER;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __BATCHNUMBER_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.SLAVE_STREAM,_Fields.BATCH_NUMBER};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SLAVE_STREAM, new org.apache.thrift.meta_data.FieldMetaData("slaveStream", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SlaveStream.class)));
    tmpMap.put(_Fields.BATCH_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("batchNumber", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(LogLineBatchRequest.class, metaDataMap);
  }

  public LogLineBatchRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LogLineBatchRequest(LogLineBatchRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetSlaveStream()) {
      this.slaveStream = new SlaveStream(other.slaveStream);
    }
    this.batchNumber = other.batchNumber;
  }

  public LogLineBatchRequest deepCopy() {
    return new LogLineBatchRequest(this);
  }

  @Override
  public void clear() {
    this.slaveStream = null;
    setBatchNumberIsSet(false);
    this.batchNumber = 0;
  }

  public SlaveStream getSlaveStream() {
    return this.slaveStream;
  }

  public LogLineBatchRequest setSlaveStream(SlaveStream slaveStream) {
    this.slaveStream = slaveStream;
    return this;
  }

  public void unsetSlaveStream() {
    this.slaveStream = null;
  }

  /** Returns true if field slaveStream is set (has been assigned a value) and false otherwise */
  public boolean isSetSlaveStream() {
    return this.slaveStream != null;
  }

  public void setSlaveStreamIsSet(boolean value) {
    if (!value) {
      this.slaveStream = null;
    }
  }

  public int getBatchNumber() {
    return this.batchNumber;
  }

  public LogLineBatchRequest setBatchNumber(int batchNumber) {
    this.batchNumber = batchNumber;
    setBatchNumberIsSet(true);
    return this;
  }

  public void unsetBatchNumber() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __BATCHNUMBER_ISSET_ID);
  }

  /** Returns true if field batchNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetBatchNumber() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __BATCHNUMBER_ISSET_ID);
  }

  public void setBatchNumberIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __BATCHNUMBER_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case SLAVE_STREAM:
      if (value == null) {
        unsetSlaveStream();
      } else {
        setSlaveStream((SlaveStream)value);
      }
      break;

    case BATCH_NUMBER:
      if (value == null) {
        unsetBatchNumber();
      } else {
        setBatchNumber((java.lang.Integer)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SLAVE_STREAM:
      return getSlaveStream();

    case BATCH_NUMBER:
      return getBatchNumber();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SLAVE_STREAM:
      return isSetSlaveStream();
    case BATCH_NUMBER:
      return isSetBatchNumber();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof LogLineBatchRequest)
      return this.equals((LogLineBatchRequest)that);
    return false;
  }

  public boolean equals(LogLineBatchRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_slaveStream = true && this.isSetSlaveStream();
    boolean that_present_slaveStream = true && that.isSetSlaveStream();
    if (this_present_slaveStream || that_present_slaveStream) {
      if (!(this_present_slaveStream && that_present_slaveStream))
        return false;
      if (!this.slaveStream.equals(that.slaveStream))
        return false;
    }

    boolean this_present_batchNumber = true && this.isSetBatchNumber();
    boolean that_present_batchNumber = true && that.isSetBatchNumber();
    if (this_present_batchNumber || that_present_batchNumber) {
      if (!(this_present_batchNumber && that_present_batchNumber))
        return false;
      if (this.batchNumber != that.batchNumber)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSlaveStream()) ? 131071 : 524287);
    if (isSetSlaveStream())
      hashCode = hashCode * 8191 + slaveStream.hashCode();

    hashCode = hashCode * 8191 + ((isSetBatchNumber()) ? 131071 : 524287);
    if (isSetBatchNumber())
      hashCode = hashCode * 8191 + batchNumber;

    return hashCode;
  }

  @Override
  public int compareTo(LogLineBatchRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetSlaveStream()).compareTo(other.isSetSlaveStream());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSlaveStream()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.slaveStream, other.slaveStream);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetBatchNumber()).compareTo(other.isSetBatchNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBatchNumber()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.batchNumber, other.batchNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("LogLineBatchRequest(");
    boolean first = true;

    if (isSetSlaveStream()) {
      sb.append("slaveStream:");
      if (this.slaveStream == null) {
        sb.append("null");
      } else {
        sb.append(this.slaveStream);
      }
      first = false;
    }
    if (isSetBatchNumber()) {
      if (!first) sb.append(", ");
      sb.append("batchNumber:");
      sb.append(this.batchNumber);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (slaveStream != null) {
      slaveStream.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class LogLineBatchRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public LogLineBatchRequestStandardScheme getScheme() {
      return new LogLineBatchRequestStandardScheme();
    }
  }

  private static class LogLineBatchRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<LogLineBatchRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, LogLineBatchRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SLAVE_STREAM
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.slaveStream = new SlaveStream();
              struct.slaveStream.read(iprot);
              struct.setSlaveStreamIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BATCH_NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.batchNumber = iprot.readI32();
              struct.setBatchNumberIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, LogLineBatchRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.slaveStream != null) {
        if (struct.isSetSlaveStream()) {
          oprot.writeFieldBegin(SLAVE_STREAM_FIELD_DESC);
          struct.slaveStream.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetBatchNumber()) {
        oprot.writeFieldBegin(BATCH_NUMBER_FIELD_DESC);
        oprot.writeI32(struct.batchNumber);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class LogLineBatchRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public LogLineBatchRequestTupleScheme getScheme() {
      return new LogLineBatchRequestTupleScheme();
    }
  }

  private static class LogLineBatchRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<LogLineBatchRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, LogLineBatchRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSlaveStream()) {
        optionals.set(0);
      }
      if (struct.isSetBatchNumber()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetSlaveStream()) {
        struct.slaveStream.write(oprot);
      }
      if (struct.isSetBatchNumber()) {
        oprot.writeI32(struct.batchNumber);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, LogLineBatchRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.slaveStream = new SlaveStream();
        struct.slaveStream.read(iprot);
        struct.setSlaveStreamIsSet(true);
      }
      if (incoming.get(1)) {
        struct.batchNumber = iprot.readI32();
        struct.setBatchNumberIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

