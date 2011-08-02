/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.anvisics.jleveldb.ext;

public class DBAccessor {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected DBAccessor(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DBAccessor obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        LeveldbJNI.delete_DBAccessor(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setPointer(DB value) {
    LeveldbJNI.DBAccessor_pointer_set(swigCPtr, this, DB.getCPtr(value), value);
  }

  public DB getPointer() {
    long cPtr = LeveldbJNI.DBAccessor_pointer_get(swigCPtr, this);
    return (cPtr == 0) ? null : new DB(cPtr, false);
  }

  public Status Open(Options options, String name) {
    return new Status(LeveldbJNI.DBAccessor_Open(swigCPtr, this, Options.getCPtr(options), options, name), true);
  }

  public String Get(ReadOptions options, String key) {
    return LeveldbJNI.DBAccessor_Get(swigCPtr, this, ReadOptions.getCPtr(options), options, key);
  }

  public Status Write(WriteOptions options, DBWriteBatch updates) {
    return new Status(LeveldbJNI.DBAccessor_Write(swigCPtr, this, WriteOptions.getCPtr(options), options, DBWriteBatch.getCPtr(updates), updates), true);
  }

  public Status Put(WriteOptions options, String key, String value) {
    return new Status(LeveldbJNI.DBAccessor_Put(swigCPtr, this, WriteOptions.getCPtr(options), options, key, value), true);
  }

  public Status Delete(WriteOptions options, String key) {
    return new Status(LeveldbJNI.DBAccessor_Delete(swigCPtr, this, WriteOptions.getCPtr(options), options, key), true);
  }

  public DBIterator NewIterator(ReadOptions options) {
    long cPtr = LeveldbJNI.DBAccessor_NewIterator(swigCPtr, this, ReadOptions.getCPtr(options), options);
    return (cPtr == 0) ? null : new DBIterator(cPtr, false);
  }

  public DBAccessor() {
    this(LeveldbJNI.new_DBAccessor(), true);
  }

}
