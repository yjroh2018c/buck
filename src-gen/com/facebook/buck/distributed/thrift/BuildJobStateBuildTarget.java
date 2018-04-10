/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)")
public class BuildJobStateBuildTarget implements org.apache.thrift.TBase<BuildJobStateBuildTarget, BuildJobStateBuildTarget._Fields>, java.io.Serializable, Cloneable, Comparable<BuildJobStateBuildTarget> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BuildJobStateBuildTarget");

  private static final org.apache.thrift.protocol.TField CELL_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("cellName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField BASE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("baseName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SHORT_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("shortName", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField FLAVORS_FIELD_DESC = new org.apache.thrift.protocol.TField("flavors", org.apache.thrift.protocol.TType.SET, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new BuildJobStateBuildTargetStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new BuildJobStateBuildTargetTupleSchemeFactory();

  public java.lang.String cellName; // optional
  public java.lang.String baseName; // optional
  public java.lang.String shortName; // optional
  public java.util.Set<java.lang.String> flavors; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CELL_NAME((short)1, "cellName"),
    BASE_NAME((short)2, "baseName"),
    SHORT_NAME((short)3, "shortName"),
    FLAVORS((short)4, "flavors");

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
        case 1: // CELL_NAME
          return CELL_NAME;
        case 2: // BASE_NAME
          return BASE_NAME;
        case 3: // SHORT_NAME
          return SHORT_NAME;
        case 4: // FLAVORS
          return FLAVORS;
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
  private static final _Fields optionals[] = {_Fields.CELL_NAME,_Fields.BASE_NAME,_Fields.SHORT_NAME,_Fields.FLAVORS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CELL_NAME, new org.apache.thrift.meta_data.FieldMetaData("cellName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.BASE_NAME, new org.apache.thrift.meta_data.FieldMetaData("baseName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SHORT_NAME, new org.apache.thrift.meta_data.FieldMetaData("shortName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FLAVORS, new org.apache.thrift.meta_data.FieldMetaData("flavors", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BuildJobStateBuildTarget.class, metaDataMap);
  }

  public BuildJobStateBuildTarget() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BuildJobStateBuildTarget(BuildJobStateBuildTarget other) {
    if (other.isSetCellName()) {
      this.cellName = other.cellName;
    }
    if (other.isSetBaseName()) {
      this.baseName = other.baseName;
    }
    if (other.isSetShortName()) {
      this.shortName = other.shortName;
    }
    if (other.isSetFlavors()) {
      java.util.Set<java.lang.String> __this__flavors = new java.util.HashSet<java.lang.String>(other.flavors);
      this.flavors = __this__flavors;
    }
  }

  public BuildJobStateBuildTarget deepCopy() {
    return new BuildJobStateBuildTarget(this);
  }

  @Override
  public void clear() {
    this.cellName = null;
    this.baseName = null;
    this.shortName = null;
    this.flavors = null;
  }

  public java.lang.String getCellName() {
    return this.cellName;
  }

  public BuildJobStateBuildTarget setCellName(java.lang.String cellName) {
    this.cellName = cellName;
    return this;
  }

  public void unsetCellName() {
    this.cellName = null;
  }

  /** Returns true if field cellName is set (has been assigned a value) and false otherwise */
  public boolean isSetCellName() {
    return this.cellName != null;
  }

  public void setCellNameIsSet(boolean value) {
    if (!value) {
      this.cellName = null;
    }
  }

  public java.lang.String getBaseName() {
    return this.baseName;
  }

  public BuildJobStateBuildTarget setBaseName(java.lang.String baseName) {
    this.baseName = baseName;
    return this;
  }

  public void unsetBaseName() {
    this.baseName = null;
  }

  /** Returns true if field baseName is set (has been assigned a value) and false otherwise */
  public boolean isSetBaseName() {
    return this.baseName != null;
  }

  public void setBaseNameIsSet(boolean value) {
    if (!value) {
      this.baseName = null;
    }
  }

  public java.lang.String getShortName() {
    return this.shortName;
  }

  public BuildJobStateBuildTarget setShortName(java.lang.String shortName) {
    this.shortName = shortName;
    return this;
  }

  public void unsetShortName() {
    this.shortName = null;
  }

  /** Returns true if field shortName is set (has been assigned a value) and false otherwise */
  public boolean isSetShortName() {
    return this.shortName != null;
  }

  public void setShortNameIsSet(boolean value) {
    if (!value) {
      this.shortName = null;
    }
  }

  public int getFlavorsSize() {
    return (this.flavors == null) ? 0 : this.flavors.size();
  }

  public java.util.Iterator<java.lang.String> getFlavorsIterator() {
    return (this.flavors == null) ? null : this.flavors.iterator();
  }

  public void addToFlavors(java.lang.String elem) {
    if (this.flavors == null) {
      this.flavors = new java.util.HashSet<java.lang.String>();
    }
    this.flavors.add(elem);
  }

  public java.util.Set<java.lang.String> getFlavors() {
    return this.flavors;
  }

  public BuildJobStateBuildTarget setFlavors(java.util.Set<java.lang.String> flavors) {
    this.flavors = flavors;
    return this;
  }

  public void unsetFlavors() {
    this.flavors = null;
  }

  /** Returns true if field flavors is set (has been assigned a value) and false otherwise */
  public boolean isSetFlavors() {
    return this.flavors != null;
  }

  public void setFlavorsIsSet(boolean value) {
    if (!value) {
      this.flavors = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case CELL_NAME:
      if (value == null) {
        unsetCellName();
      } else {
        setCellName((java.lang.String)value);
      }
      break;

    case BASE_NAME:
      if (value == null) {
        unsetBaseName();
      } else {
        setBaseName((java.lang.String)value);
      }
      break;

    case SHORT_NAME:
      if (value == null) {
        unsetShortName();
      } else {
        setShortName((java.lang.String)value);
      }
      break;

    case FLAVORS:
      if (value == null) {
        unsetFlavors();
      } else {
        setFlavors((java.util.Set<java.lang.String>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CELL_NAME:
      return getCellName();

    case BASE_NAME:
      return getBaseName();

    case SHORT_NAME:
      return getShortName();

    case FLAVORS:
      return getFlavors();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CELL_NAME:
      return isSetCellName();
    case BASE_NAME:
      return isSetBaseName();
    case SHORT_NAME:
      return isSetShortName();
    case FLAVORS:
      return isSetFlavors();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof BuildJobStateBuildTarget)
      return this.equals((BuildJobStateBuildTarget)that);
    return false;
  }

  public boolean equals(BuildJobStateBuildTarget that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_cellName = true && this.isSetCellName();
    boolean that_present_cellName = true && that.isSetCellName();
    if (this_present_cellName || that_present_cellName) {
      if (!(this_present_cellName && that_present_cellName))
        return false;
      if (!this.cellName.equals(that.cellName))
        return false;
    }

    boolean this_present_baseName = true && this.isSetBaseName();
    boolean that_present_baseName = true && that.isSetBaseName();
    if (this_present_baseName || that_present_baseName) {
      if (!(this_present_baseName && that_present_baseName))
        return false;
      if (!this.baseName.equals(that.baseName))
        return false;
    }

    boolean this_present_shortName = true && this.isSetShortName();
    boolean that_present_shortName = true && that.isSetShortName();
    if (this_present_shortName || that_present_shortName) {
      if (!(this_present_shortName && that_present_shortName))
        return false;
      if (!this.shortName.equals(that.shortName))
        return false;
    }

    boolean this_present_flavors = true && this.isSetFlavors();
    boolean that_present_flavors = true && that.isSetFlavors();
    if (this_present_flavors || that_present_flavors) {
      if (!(this_present_flavors && that_present_flavors))
        return false;
      if (!this.flavors.equals(that.flavors))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetCellName()) ? 131071 : 524287);
    if (isSetCellName())
      hashCode = hashCode * 8191 + cellName.hashCode();

    hashCode = hashCode * 8191 + ((isSetBaseName()) ? 131071 : 524287);
    if (isSetBaseName())
      hashCode = hashCode * 8191 + baseName.hashCode();

    hashCode = hashCode * 8191 + ((isSetShortName()) ? 131071 : 524287);
    if (isSetShortName())
      hashCode = hashCode * 8191 + shortName.hashCode();

    hashCode = hashCode * 8191 + ((isSetFlavors()) ? 131071 : 524287);
    if (isSetFlavors())
      hashCode = hashCode * 8191 + flavors.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(BuildJobStateBuildTarget other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetCellName()).compareTo(other.isSetCellName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCellName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cellName, other.cellName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetBaseName()).compareTo(other.isSetBaseName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBaseName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.baseName, other.baseName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetShortName()).compareTo(other.isSetShortName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetShortName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.shortName, other.shortName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetFlavors()).compareTo(other.isSetFlavors());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFlavors()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.flavors, other.flavors);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("BuildJobStateBuildTarget(");
    boolean first = true;

    if (isSetCellName()) {
      sb.append("cellName:");
      if (this.cellName == null) {
        sb.append("null");
      } else {
        sb.append(this.cellName);
      }
      first = false;
    }
    if (isSetBaseName()) {
      if (!first) sb.append(", ");
      sb.append("baseName:");
      if (this.baseName == null) {
        sb.append("null");
      } else {
        sb.append(this.baseName);
      }
      first = false;
    }
    if (isSetShortName()) {
      if (!first) sb.append(", ");
      sb.append("shortName:");
      if (this.shortName == null) {
        sb.append("null");
      } else {
        sb.append(this.shortName);
      }
      first = false;
    }
    if (isSetFlavors()) {
      if (!first) sb.append(", ");
      sb.append("flavors:");
      if (this.flavors == null) {
        sb.append("null");
      } else {
        sb.append(this.flavors);
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

  private static class BuildJobStateBuildTargetStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public BuildJobStateBuildTargetStandardScheme getScheme() {
      return new BuildJobStateBuildTargetStandardScheme();
    }
  }

  private static class BuildJobStateBuildTargetStandardScheme extends org.apache.thrift.scheme.StandardScheme<BuildJobStateBuildTarget> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BuildJobStateBuildTarget struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CELL_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.cellName = iprot.readString();
              struct.setCellNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BASE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.baseName = iprot.readString();
              struct.setBaseNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SHORT_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.shortName = iprot.readString();
              struct.setShortNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // FLAVORS
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set38 = iprot.readSetBegin();
                struct.flavors = new java.util.HashSet<java.lang.String>(2*_set38.size);
                java.lang.String _elem39;
                for (int _i40 = 0; _i40 < _set38.size; ++_i40)
                {
                  _elem39 = iprot.readString();
                  struct.flavors.add(_elem39);
                }
                iprot.readSetEnd();
              }
              struct.setFlavorsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, BuildJobStateBuildTarget struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.cellName != null) {
        if (struct.isSetCellName()) {
          oprot.writeFieldBegin(CELL_NAME_FIELD_DESC);
          oprot.writeString(struct.cellName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.baseName != null) {
        if (struct.isSetBaseName()) {
          oprot.writeFieldBegin(BASE_NAME_FIELD_DESC);
          oprot.writeString(struct.baseName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.shortName != null) {
        if (struct.isSetShortName()) {
          oprot.writeFieldBegin(SHORT_NAME_FIELD_DESC);
          oprot.writeString(struct.shortName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.flavors != null) {
        if (struct.isSetFlavors()) {
          oprot.writeFieldBegin(FLAVORS_FIELD_DESC);
          {
            oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRING, struct.flavors.size()));
            for (java.lang.String _iter41 : struct.flavors)
            {
              oprot.writeString(_iter41);
            }
            oprot.writeSetEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BuildJobStateBuildTargetTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public BuildJobStateBuildTargetTupleScheme getScheme() {
      return new BuildJobStateBuildTargetTupleScheme();
    }
  }

  private static class BuildJobStateBuildTargetTupleScheme extends org.apache.thrift.scheme.TupleScheme<BuildJobStateBuildTarget> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BuildJobStateBuildTarget struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetCellName()) {
        optionals.set(0);
      }
      if (struct.isSetBaseName()) {
        optionals.set(1);
      }
      if (struct.isSetShortName()) {
        optionals.set(2);
      }
      if (struct.isSetFlavors()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetCellName()) {
        oprot.writeString(struct.cellName);
      }
      if (struct.isSetBaseName()) {
        oprot.writeString(struct.baseName);
      }
      if (struct.isSetShortName()) {
        oprot.writeString(struct.shortName);
      }
      if (struct.isSetFlavors()) {
        {
          oprot.writeI32(struct.flavors.size());
          for (java.lang.String _iter42 : struct.flavors)
          {
            oprot.writeString(_iter42);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BuildJobStateBuildTarget struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.cellName = iprot.readString();
        struct.setCellNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.baseName = iprot.readString();
        struct.setBaseNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.shortName = iprot.readString();
        struct.setShortNameIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TSet _set43 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.flavors = new java.util.HashSet<java.lang.String>(2*_set43.size);
          java.lang.String _elem44;
          for (int _i45 = 0; _i45 < _set43.size; ++_i45)
          {
            _elem44 = iprot.readString();
            struct.flavors.add(_elem44);
          }
        }
        struct.setFlavorsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
