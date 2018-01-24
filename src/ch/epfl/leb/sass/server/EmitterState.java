/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package ch.epfl.leb.sass.server;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
/**
 * Contains information about the simulation's current frame.
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-01-20")
public class EmitterState implements org.apache.thrift.TBase<EmitterState, EmitterState._Fields>, java.io.Serializable, Cloneable, Comparable<EmitterState> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("EmitterState");

  private static final org.apache.thrift.protocol.TField FRAME_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("frameNumber", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField FLUOROPHORE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("fluorophoreID", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField X_FIELD_DESC = new org.apache.thrift.protocol.TField("x", org.apache.thrift.protocol.TType.DOUBLE, (short)3);
  private static final org.apache.thrift.protocol.TField Y_FIELD_DESC = new org.apache.thrift.protocol.TField("y", org.apache.thrift.protocol.TType.DOUBLE, (short)4);
  private static final org.apache.thrift.protocol.TField Z_FIELD_DESC = new org.apache.thrift.protocol.TField("z", org.apache.thrift.protocol.TType.DOUBLE, (short)5);
  private static final org.apache.thrift.protocol.TField BRIGHTNESS_FIELD_DESC = new org.apache.thrift.protocol.TField("brightness", org.apache.thrift.protocol.TType.DOUBLE, (short)6);
  private static final org.apache.thrift.protocol.TField TIME_ON_FIELD_DESC = new org.apache.thrift.protocol.TField("timeOn", org.apache.thrift.protocol.TType.DOUBLE, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new EmitterStateStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new EmitterStateTupleSchemeFactory();

  public int frameNumber; // required
  public int fluorophoreID; // required
  public double x; // required
  public double y; // required
  public double z; // required
  public double brightness; // required
  public double timeOn; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FRAME_NUMBER((short)1, "frameNumber"),
    FLUOROPHORE_ID((short)2, "fluorophoreID"),
    X((short)3, "x"),
    Y((short)4, "y"),
    Z((short)5, "z"),
    BRIGHTNESS((short)6, "brightness"),
    TIME_ON((short)7, "timeOn");

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
        case 1: // FRAME_NUMBER
          return FRAME_NUMBER;
        case 2: // FLUOROPHORE_ID
          return FLUOROPHORE_ID;
        case 3: // X
          return X;
        case 4: // Y
          return Y;
        case 5: // Z
          return Z;
        case 6: // BRIGHTNESS
          return BRIGHTNESS;
        case 7: // TIME_ON
          return TIME_ON;
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
  private static final int __FRAMENUMBER_ISSET_ID = 0;
  private static final int __FLUOROPHOREID_ISSET_ID = 1;
  private static final int __X_ISSET_ID = 2;
  private static final int __Y_ISSET_ID = 3;
  private static final int __Z_ISSET_ID = 4;
  private static final int __BRIGHTNESS_ISSET_ID = 5;
  private static final int __TIMEON_ISSET_ID = 6;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FRAME_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("frameNumber", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.FLUOROPHORE_ID, new org.apache.thrift.meta_data.FieldMetaData("fluorophoreID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.X, new org.apache.thrift.meta_data.FieldMetaData("x", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.Y, new org.apache.thrift.meta_data.FieldMetaData("y", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.Z, new org.apache.thrift.meta_data.FieldMetaData("z", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.BRIGHTNESS, new org.apache.thrift.meta_data.FieldMetaData("brightness", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.TIME_ON, new org.apache.thrift.meta_data.FieldMetaData("timeOn", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(EmitterState.class, metaDataMap);
  }

  public EmitterState() {
  }

  public EmitterState(
    int frameNumber,
    int fluorophoreID,
    double x,
    double y,
    double z,
    double brightness,
    double timeOn)
  {
    this();
    this.frameNumber = frameNumber;
    setFrameNumberIsSet(true);
    this.fluorophoreID = fluorophoreID;
    setFluorophoreIDIsSet(true);
    this.x = x;
    setXIsSet(true);
    this.y = y;
    setYIsSet(true);
    this.z = z;
    setZIsSet(true);
    this.brightness = brightness;
    setBrightnessIsSet(true);
    this.timeOn = timeOn;
    setTimeOnIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public EmitterState(EmitterState other) {
    __isset_bitfield = other.__isset_bitfield;
    this.frameNumber = other.frameNumber;
    this.fluorophoreID = other.fluorophoreID;
    this.x = other.x;
    this.y = other.y;
    this.z = other.z;
    this.brightness = other.brightness;
    this.timeOn = other.timeOn;
  }

  public EmitterState deepCopy() {
    return new EmitterState(this);
  }

  @Override
  public void clear() {
    setFrameNumberIsSet(false);
    this.frameNumber = 0;
    setFluorophoreIDIsSet(false);
    this.fluorophoreID = 0;
    setXIsSet(false);
    this.x = 0.0;
    setYIsSet(false);
    this.y = 0.0;
    setZIsSet(false);
    this.z = 0.0;
    setBrightnessIsSet(false);
    this.brightness = 0.0;
    setTimeOnIsSet(false);
    this.timeOn = 0.0;
  }

  public int getFrameNumber() {
    return this.frameNumber;
  }

  public EmitterState setFrameNumber(int frameNumber) {
    this.frameNumber = frameNumber;
    setFrameNumberIsSet(true);
    return this;
  }

  public void unsetFrameNumber() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __FRAMENUMBER_ISSET_ID);
  }

  /** Returns true if field frameNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetFrameNumber() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __FRAMENUMBER_ISSET_ID);
  }

  public void setFrameNumberIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __FRAMENUMBER_ISSET_ID, value);
  }

  public int getFluorophoreID() {
    return this.fluorophoreID;
  }

  public EmitterState setFluorophoreID(int fluorophoreID) {
    this.fluorophoreID = fluorophoreID;
    setFluorophoreIDIsSet(true);
    return this;
  }

  public void unsetFluorophoreID() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __FLUOROPHOREID_ISSET_ID);
  }

  /** Returns true if field fluorophoreID is set (has been assigned a value) and false otherwise */
  public boolean isSetFluorophoreID() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __FLUOROPHOREID_ISSET_ID);
  }

  public void setFluorophoreIDIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __FLUOROPHOREID_ISSET_ID, value);
  }

  public double getX() {
    return this.x;
  }

  public EmitterState setX(double x) {
    this.x = x;
    setXIsSet(true);
    return this;
  }

  public void unsetX() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __X_ISSET_ID);
  }

  /** Returns true if field x is set (has been assigned a value) and false otherwise */
  public boolean isSetX() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __X_ISSET_ID);
  }

  public void setXIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __X_ISSET_ID, value);
  }

  public double getY() {
    return this.y;
  }

  public EmitterState setY(double y) {
    this.y = y;
    setYIsSet(true);
    return this;
  }

  public void unsetY() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __Y_ISSET_ID);
  }

  /** Returns true if field y is set (has been assigned a value) and false otherwise */
  public boolean isSetY() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __Y_ISSET_ID);
  }

  public void setYIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __Y_ISSET_ID, value);
  }

  public double getZ() {
    return this.z;
  }

  public EmitterState setZ(double z) {
    this.z = z;
    setZIsSet(true);
    return this;
  }

  public void unsetZ() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __Z_ISSET_ID);
  }

  /** Returns true if field z is set (has been assigned a value) and false otherwise */
  public boolean isSetZ() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __Z_ISSET_ID);
  }

  public void setZIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __Z_ISSET_ID, value);
  }

  public double getBrightness() {
    return this.brightness;
  }

  public EmitterState setBrightness(double brightness) {
    this.brightness = brightness;
    setBrightnessIsSet(true);
    return this;
  }

  public void unsetBrightness() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __BRIGHTNESS_ISSET_ID);
  }

  /** Returns true if field brightness is set (has been assigned a value) and false otherwise */
  public boolean isSetBrightness() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __BRIGHTNESS_ISSET_ID);
  }

  public void setBrightnessIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __BRIGHTNESS_ISSET_ID, value);
  }

  public double getTimeOn() {
    return this.timeOn;
  }

  public EmitterState setTimeOn(double timeOn) {
    this.timeOn = timeOn;
    setTimeOnIsSet(true);
    return this;
  }

  public void unsetTimeOn() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TIMEON_ISSET_ID);
  }

  /** Returns true if field timeOn is set (has been assigned a value) and false otherwise */
  public boolean isSetTimeOn() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TIMEON_ISSET_ID);
  }

  public void setTimeOnIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TIMEON_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case FRAME_NUMBER:
      if (value == null) {
        unsetFrameNumber();
      } else {
        setFrameNumber((java.lang.Integer)value);
      }
      break;

    case FLUOROPHORE_ID:
      if (value == null) {
        unsetFluorophoreID();
      } else {
        setFluorophoreID((java.lang.Integer)value);
      }
      break;

    case X:
      if (value == null) {
        unsetX();
      } else {
        setX((java.lang.Double)value);
      }
      break;

    case Y:
      if (value == null) {
        unsetY();
      } else {
        setY((java.lang.Double)value);
      }
      break;

    case Z:
      if (value == null) {
        unsetZ();
      } else {
        setZ((java.lang.Double)value);
      }
      break;

    case BRIGHTNESS:
      if (value == null) {
        unsetBrightness();
      } else {
        setBrightness((java.lang.Double)value);
      }
      break;

    case TIME_ON:
      if (value == null) {
        unsetTimeOn();
      } else {
        setTimeOn((java.lang.Double)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case FRAME_NUMBER:
      return getFrameNumber();

    case FLUOROPHORE_ID:
      return getFluorophoreID();

    case X:
      return getX();

    case Y:
      return getY();

    case Z:
      return getZ();

    case BRIGHTNESS:
      return getBrightness();

    case TIME_ON:
      return getTimeOn();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case FRAME_NUMBER:
      return isSetFrameNumber();
    case FLUOROPHORE_ID:
      return isSetFluorophoreID();
    case X:
      return isSetX();
    case Y:
      return isSetY();
    case Z:
      return isSetZ();
    case BRIGHTNESS:
      return isSetBrightness();
    case TIME_ON:
      return isSetTimeOn();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof EmitterState)
      return this.equals((EmitterState)that);
    return false;
  }

  public boolean equals(EmitterState that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_frameNumber = true;
    boolean that_present_frameNumber = true;
    if (this_present_frameNumber || that_present_frameNumber) {
      if (!(this_present_frameNumber && that_present_frameNumber))
        return false;
      if (this.frameNumber != that.frameNumber)
        return false;
    }

    boolean this_present_fluorophoreID = true;
    boolean that_present_fluorophoreID = true;
    if (this_present_fluorophoreID || that_present_fluorophoreID) {
      if (!(this_present_fluorophoreID && that_present_fluorophoreID))
        return false;
      if (this.fluorophoreID != that.fluorophoreID)
        return false;
    }

    boolean this_present_x = true;
    boolean that_present_x = true;
    if (this_present_x || that_present_x) {
      if (!(this_present_x && that_present_x))
        return false;
      if (this.x != that.x)
        return false;
    }

    boolean this_present_y = true;
    boolean that_present_y = true;
    if (this_present_y || that_present_y) {
      if (!(this_present_y && that_present_y))
        return false;
      if (this.y != that.y)
        return false;
    }

    boolean this_present_z = true;
    boolean that_present_z = true;
    if (this_present_z || that_present_z) {
      if (!(this_present_z && that_present_z))
        return false;
      if (this.z != that.z)
        return false;
    }

    boolean this_present_brightness = true;
    boolean that_present_brightness = true;
    if (this_present_brightness || that_present_brightness) {
      if (!(this_present_brightness && that_present_brightness))
        return false;
      if (this.brightness != that.brightness)
        return false;
    }

    boolean this_present_timeOn = true;
    boolean that_present_timeOn = true;
    if (this_present_timeOn || that_present_timeOn) {
      if (!(this_present_timeOn && that_present_timeOn))
        return false;
      if (this.timeOn != that.timeOn)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + frameNumber;

    hashCode = hashCode * 8191 + fluorophoreID;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(x);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(y);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(z);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(brightness);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(timeOn);

    return hashCode;
  }

  @Override
  public int compareTo(EmitterState other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetFrameNumber()).compareTo(other.isSetFrameNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFrameNumber()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.frameNumber, other.frameNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetFluorophoreID()).compareTo(other.isSetFluorophoreID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFluorophoreID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fluorophoreID, other.fluorophoreID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetX()).compareTo(other.isSetX());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetX()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.x, other.x);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetY()).compareTo(other.isSetY());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetY()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.y, other.y);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetZ()).compareTo(other.isSetZ());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetZ()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.z, other.z);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetBrightness()).compareTo(other.isSetBrightness());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBrightness()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.brightness, other.brightness);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTimeOn()).compareTo(other.isSetTimeOn());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimeOn()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timeOn, other.timeOn);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("EmitterState(");
    boolean first = true;

    sb.append("frameNumber:");
    sb.append(this.frameNumber);
    first = false;
    if (!first) sb.append(", ");
    sb.append("fluorophoreID:");
    sb.append(this.fluorophoreID);
    first = false;
    if (!first) sb.append(", ");
    sb.append("x:");
    sb.append(this.x);
    first = false;
    if (!first) sb.append(", ");
    sb.append("y:");
    sb.append(this.y);
    first = false;
    if (!first) sb.append(", ");
    sb.append("z:");
    sb.append(this.z);
    first = false;
    if (!first) sb.append(", ");
    sb.append("brightness:");
    sb.append(this.brightness);
    first = false;
    if (!first) sb.append(", ");
    sb.append("timeOn:");
    sb.append(this.timeOn);
    first = false;
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class EmitterStateStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public EmitterStateStandardScheme getScheme() {
      return new EmitterStateStandardScheme();
    }
  }

  private static class EmitterStateStandardScheme extends org.apache.thrift.scheme.StandardScheme<EmitterState> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, EmitterState struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FRAME_NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.frameNumber = iprot.readI32();
              struct.setFrameNumberIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FLUOROPHORE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.fluorophoreID = iprot.readI32();
              struct.setFluorophoreIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // X
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.x = iprot.readDouble();
              struct.setXIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // Y
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.y = iprot.readDouble();
              struct.setYIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // Z
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.z = iprot.readDouble();
              struct.setZIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // BRIGHTNESS
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.brightness = iprot.readDouble();
              struct.setBrightnessIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // TIME_ON
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.timeOn = iprot.readDouble();
              struct.setTimeOnIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, EmitterState struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(FRAME_NUMBER_FIELD_DESC);
      oprot.writeI32(struct.frameNumber);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(FLUOROPHORE_ID_FIELD_DESC);
      oprot.writeI32(struct.fluorophoreID);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(X_FIELD_DESC);
      oprot.writeDouble(struct.x);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(Y_FIELD_DESC);
      oprot.writeDouble(struct.y);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(Z_FIELD_DESC);
      oprot.writeDouble(struct.z);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(BRIGHTNESS_FIELD_DESC);
      oprot.writeDouble(struct.brightness);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(TIME_ON_FIELD_DESC);
      oprot.writeDouble(struct.timeOn);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class EmitterStateTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public EmitterStateTupleScheme getScheme() {
      return new EmitterStateTupleScheme();
    }
  }

  private static class EmitterStateTupleScheme extends org.apache.thrift.scheme.TupleScheme<EmitterState> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, EmitterState struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetFrameNumber()) {
        optionals.set(0);
      }
      if (struct.isSetFluorophoreID()) {
        optionals.set(1);
      }
      if (struct.isSetX()) {
        optionals.set(2);
      }
      if (struct.isSetY()) {
        optionals.set(3);
      }
      if (struct.isSetZ()) {
        optionals.set(4);
      }
      if (struct.isSetBrightness()) {
        optionals.set(5);
      }
      if (struct.isSetTimeOn()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetFrameNumber()) {
        oprot.writeI32(struct.frameNumber);
      }
      if (struct.isSetFluorophoreID()) {
        oprot.writeI32(struct.fluorophoreID);
      }
      if (struct.isSetX()) {
        oprot.writeDouble(struct.x);
      }
      if (struct.isSetY()) {
        oprot.writeDouble(struct.y);
      }
      if (struct.isSetZ()) {
        oprot.writeDouble(struct.z);
      }
      if (struct.isSetBrightness()) {
        oprot.writeDouble(struct.brightness);
      }
      if (struct.isSetTimeOn()) {
        oprot.writeDouble(struct.timeOn);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, EmitterState struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.frameNumber = iprot.readI32();
        struct.setFrameNumberIsSet(true);
      }
      if (incoming.get(1)) {
        struct.fluorophoreID = iprot.readI32();
        struct.setFluorophoreIDIsSet(true);
      }
      if (incoming.get(2)) {
        struct.x = iprot.readDouble();
        struct.setXIsSet(true);
      }
      if (incoming.get(3)) {
        struct.y = iprot.readDouble();
        struct.setYIsSet(true);
      }
      if (incoming.get(4)) {
        struct.z = iprot.readDouble();
        struct.setZIsSet(true);
      }
      if (incoming.get(5)) {
        struct.brightness = iprot.readDouble();
        struct.setBrightnessIsSet(true);
      }
      if (incoming.get(6)) {
        struct.timeOn = iprot.readDouble();
        struct.setTimeOnIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

