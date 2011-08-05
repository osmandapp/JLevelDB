/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.anvisics.jleveldb.ext;

class LeveldbJNI {
  public final static native void delete_Iterator(long jarg1);
  public final static native long new_WriteOptions();
  public final static native void WriteOptions_sync_set(long jarg1, WriteOptions jarg1_, boolean jarg2);
  public final static native boolean WriteOptions_sync_get(long jarg1, WriteOptions jarg1_);
  public final static native void WriteOptions_postWriteSnapshot_set(long jarg1, WriteOptions jarg1_, long jarg2);
  public final static native long WriteOptions_postWriteSnapshot_get(long jarg1, WriteOptions jarg1_);
  public final static native void delete_WriteOptions(long jarg1);
  public final static native boolean Status_ok(long jarg1, Status jarg1_);
  public final static native boolean Status_isNotFound(long jarg1, Status jarg1_);
  public final static native String Status_ToString(long jarg1, Status jarg1_);
  public final static native long new_Status();
  public final static native void delete_Status(long jarg1);
  public final static native int kNoCompression_get();
  public final static native int kSnappyCompression_get();
  public final static native long new_Options();
  public final static native void Options_createIfMissing_set(long jarg1, Options jarg1_, boolean jarg2);
  public final static native boolean Options_createIfMissing_get(long jarg1, Options jarg1_);
  public final static native void Options_errorIfExists_set(long jarg1, Options jarg1_, boolean jarg2);
  public final static native boolean Options_errorIfExists_get(long jarg1, Options jarg1_);
  public final static native void Options_paranoidChecks_set(long jarg1, Options jarg1_, boolean jarg2);
  public final static native boolean Options_paranoidChecks_get(long jarg1, Options jarg1_);
  public final static native void Options_writeBufferSize_set(long jarg1, Options jarg1_, long jarg2);
  public final static native long Options_writeBufferSize_get(long jarg1, Options jarg1_);
  public final static native void Options_maxOpenFiles_set(long jarg1, Options jarg1_, int jarg2);
  public final static native int Options_maxOpenFiles_get(long jarg1, Options jarg1_);
  public final static native void Options_blockSize_set(long jarg1, Options jarg1_, long jarg2);
  public final static native long Options_blockSize_get(long jarg1, Options jarg1_);
  public final static native void Options_blockRestartInterval_set(long jarg1, Options jarg1_, int jarg2);
  public final static native int Options_blockRestartInterval_get(long jarg1, Options jarg1_);
  public final static native void Options_compression_set(long jarg1, Options jarg1_, int jarg2);
  public final static native int Options_compression_get(long jarg1, Options jarg1_);
  public final static native void delete_Options(long jarg1);
  public final static native void ReadOptions_verifyChecksums_set(long jarg1, ReadOptions jarg1_, boolean jarg2);
  public final static native boolean ReadOptions_verifyChecksums_get(long jarg1, ReadOptions jarg1_);
  public final static native void ReadOptions_fillCache_set(long jarg1, ReadOptions jarg1_, boolean jarg2);
  public final static native boolean ReadOptions_fillCache_get(long jarg1, ReadOptions jarg1_);
  public final static native void ReadOptions_snapshot_set(long jarg1, ReadOptions jarg1_, long jarg2, Snapshot jarg2_);
  public final static native long ReadOptions_snapshot_get(long jarg1, ReadOptions jarg1_);
  public final static native long new_ReadOptions();
  public final static native void delete_ReadOptions(long jarg1);
  public final static native long DestroyDB(String jarg1, long jarg2, Options jarg2_);
  public final static native long RepairDB(String jarg1, long jarg2, Options jarg2_);
  public final static native void DBWriteBatch_Put(long jarg1, DBWriteBatch jarg1_, String jarg2, String jarg3);
  public final static native void DBWriteBatch_Delete(long jarg1, DBWriteBatch jarg1_, String jarg2);
  public final static native void DBWriteBatch_Clear(long jarg1, DBWriteBatch jarg1_);
  public final static native long new_DBWriteBatch();
  public final static native void delete_DBWriteBatch(long jarg1);
  public final static native void delete_DBIterator(long jarg1);
  public final static native boolean DBIterator_valid(long jarg1, DBIterator jarg1_);
  public final static native void DBIterator_seekToFirst(long jarg1, DBIterator jarg1_);
  public final static native void DBIterator_seekToLast(long jarg1, DBIterator jarg1_);
  public final static native void DBIterator_seek(long jarg1, DBIterator jarg1_, String jarg2);
  public final static native void DBIterator_next(long jarg1, DBIterator jarg1_);
  public final static native void DBIterator_prev(long jarg1, DBIterator jarg1_);
  public final static native String DBIterator_key(long jarg1, DBIterator jarg1_);
  public final static native String DBIterator_value(long jarg1, DBIterator jarg1_);
  public final static native long DBIterator_status(long jarg1, DBIterator jarg1_);
  public final static native long DBTable_open(long jarg1, Options jarg1_, String jarg2, long jarg3);
  public final static native void delete_DBTable(long jarg1);
  public final static native long DBTable_newIterator(long jarg1, DBTable jarg1_, long jarg2, ReadOptions jarg2_);
  public final static native long DBTable_approximateOffsetOf(long jarg1, DBTable jarg1_, String jarg2);
  public final static native long new_DBTable();
  public final static native long new_DBTableBuilder(long jarg1, Options jarg1_);
  public final static native void delete_DBTableBuilder(long jarg1);
  public final static native long DBTableBuilder_setOptions(long jarg1, DBTableBuilder jarg1_, long jarg2, Options jarg2_);
  public final static native long DBTableBuilder_getStatus(long jarg1, DBTableBuilder jarg1_);
  public final static native long DBTableBuilder_open(long jarg1, DBTableBuilder jarg1_, String jarg2);
  public final static native long DBTableBuilder_add(long jarg1, DBTableBuilder jarg1_, String jarg2, String jarg3);
  public final static native void DBTableBuilder_flush(long jarg1, DBTableBuilder jarg1_);
  public final static native long DBTableBuilder_numEntries(long jarg1, DBTableBuilder jarg1_);
  public final static native long DBTableBuilder_fileSize(long jarg1, DBTableBuilder jarg1_);
  public final static native long DBTableBuilder_finish(long jarg1, DBTableBuilder jarg1_);
  public final static native void DBTableBuilder_abandon(long jarg1, DBTableBuilder jarg1_);
  public final static native void DBAccessor_lastStatus_set(long jarg1, DBAccessor jarg1_, long jarg2, Status jarg2_);
  public final static native long DBAccessor_lastStatus_get(long jarg1, DBAccessor jarg1_);
  public final static native long DBAccessor_open(long jarg1, DBAccessor jarg1_, long jarg2, Options jarg2_, String jarg3);
  public final static native String DBAccessor_get(long jarg1, DBAccessor jarg1_, long jarg2, ReadOptions jarg2_, String jarg3);
  public final static native long DBAccessor_write(long jarg1, DBAccessor jarg1_, long jarg2, WriteOptions jarg2_, long jarg3, DBWriteBatch jarg3_);
  public final static native long DBAccessor_put(long jarg1, DBAccessor jarg1_, long jarg2, WriteOptions jarg2_, String jarg3, String jarg4);
  public final static native long DBAccessor_remove(long jarg1, DBAccessor jarg1_, long jarg2, WriteOptions jarg2_, String jarg3);
  public final static native long DBAccessor_newIterator(long jarg1, DBAccessor jarg1_, long jarg2, ReadOptions jarg2_);
  public final static native long DBAccessor_getSnapshot(long jarg1, DBAccessor jarg1_);
  public final static native void DBAccessor_releaseSnapshot(long jarg1, DBAccessor jarg1_, long jarg2, Snapshot jarg2_);
  public final static native String DBAccessor_getProperty(long jarg1, DBAccessor jarg1_, String jarg2);
  public final static native long new_DBAccessor();
  public final static native void delete_DBAccessor(long jarg1);
  public final static native long getSnapshotValue(long jarg1);
}
