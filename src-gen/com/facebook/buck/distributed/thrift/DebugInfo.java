/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-10-17")
public class DebugInfo implements org.apache.thrift.TBase<DebugInfo, DebugInfo._Fields>, java.io.Serializable, Cloneable, Comparable<DebugInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DebugInfo");

  private static final org.apache.thrift.protocol.TField LOG_BOOK_FIELD_DESC = new org.apache.thrift.protocol.TField("logBook", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new DebugInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new DebugInfoTupleSchemeFactory();

  public java.util.List<LogRecord> logBook; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LOG_BOOK((short)1, "logBook");

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
        case 1: // LOG_BOOK
          return LOG_BOOK;
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
  private static final _Fields optionals[] = {_Fields.LOG_BOOK};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LOG_BOOK, new org.apache.thrift.meta_data.FieldMetaData("logBook", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, LogRecord.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DebugInfo.class, metaDataMap);
  }

  public DebugInfo() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DebugInfo(DebugInfo other) {
    if (other.isSetLogBook()) {
      java.util.List<LogRecord> __this__logBook = new java.util.ArrayList<LogRecord>(other.logBook.size());
      for (LogRecord other_element : other.logBook) {
        __this__logBook.add(new LogRecord(other_element));
      }
      this.logBook = __this__logBook;
    }
  }

  public DebugInfo deepCopy() {
    return new DebugInfo(this);
  }

  @Override
  public void clear() {
    this.logBook = null;
  }

  public int getLogBookSize() {
    return (this.logBook == null) ? 0 : this.logBook.size();
  }

  public java.util.Iterator<LogRecord> getLogBookIterator() {
    return (this.logBook == null) ? null : this.logBook.iterator();
  }

  public void addToLogBook(LogRecord elem) {
    if (this.logBook == null) {
      this.logBook = new java.util.ArrayList<LogRecord>();
    }
    this.logBook.add(elem);
  }

  public java.util.List<LogRecord> getLogBook() {
    return this.logBook;
  }

  public DebugInfo setLogBook(java.util.List<LogRecord> logBook) {
    this.logBook = logBook;
    return this;
  }

  public void unsetLogBook() {
    this.logBook = null;
  }

  /** Returns true if field logBook is set (has been assigned a value) and false otherwise */
  public boolean isSetLogBook() {
    return this.logBook != null;
  }

  public void setLogBookIsSet(boolean value) {
    if (!value) {
      this.logBook = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case LOG_BOOK:
      if (value == null) {
        unsetLogBook();
      } else {
        setLogBook((java.util.List<LogRecord>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case LOG_BOOK:
      return getLogBook();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case LOG_BOOK:
      return isSetLogBook();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof DebugInfo)
      return this.equals((DebugInfo)that);
    return false;
  }

  public boolean equals(DebugInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_logBook = true && this.isSetLogBook();
    boolean that_present_logBook = true && that.isSetLogBook();
    if (this_present_logBook || that_present_logBook) {
      if (!(this_present_logBook && that_present_logBook))
        return false;
      if (!this.logBook.equals(that.logBook))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetLogBook()) ? 131071 : 524287);
    if (isSetLogBook())
      hashCode = hashCode * 8191 + logBook.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(DebugInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetLogBook()).compareTo(other.isSetLogBook());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLogBook()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.logBook, other.logBook);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("DebugInfo(");
    boolean first = true;

    if (isSetLogBook()) {
      sb.append("logBook:");
      if (this.logBook == null) {
        sb.append("null");
      } else {
        sb.append(this.logBook);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DebugInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DebugInfoStandardScheme getScheme() {
      return new DebugInfoStandardScheme();
    }
  }

  private static class DebugInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<DebugInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DebugInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LOG_BOOK
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.logBook = new java.util.ArrayList<LogRecord>(_list0.size);
                LogRecord _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new LogRecord();
                  _elem1.read(iprot);
                  struct.logBook.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setLogBookIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DebugInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.logBook != null) {
        if (struct.isSetLogBook()) {
          oprot.writeFieldBegin(LOG_BOOK_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.logBook.size()));
            for (LogRecord _iter3 : struct.logBook)
            {
              _iter3.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DebugInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DebugInfoTupleScheme getScheme() {
      return new DebugInfoTupleScheme();
    }
  }

  private static class DebugInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<DebugInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DebugInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetLogBook()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetLogBook()) {
        {
          oprot.writeI32(struct.logBook.size());
          for (LogRecord _iter4 : struct.logBook)
          {
            _iter4.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DebugInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.logBook = new java.util.ArrayList<LogRecord>(_list5.size);
          LogRecord _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = new LogRecord();
            _elem6.read(iprot);
            struct.logBook.add(_elem6);
          }
        }
        struct.setLogBookIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

