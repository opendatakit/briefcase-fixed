/*
 * This file is generated by jOOQ.
 */
package org.opendatakit.briefcase.reused.db.jooq;


import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;
import org.opendatakit.briefcase.reused.db.jooq.tables.FormMetadata;
import org.opendatakit.briefcase.reused.db.jooq.tables.SubmissionMetadata;


/**
 * A class modelling indexes of tables of the <code>PUBLIC</code> schema.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Indexes {

  // -------------------------------------------------------------------------
  // INDEX definitions
  // -------------------------------------------------------------------------

  public static final Index SYS_IDX_SYS_PK_10132_10134 = Indexes0.SYS_IDX_SYS_PK_10132_10134;
  public static final Index SYS_IDX_SYS_PK_10146_10147 = Indexes0.SYS_IDX_SYS_PK_10146_10147;

  // -------------------------------------------------------------------------
  // [#1459] distribute members to avoid static initialisers > 64kb
  // -------------------------------------------------------------------------

  private static class Indexes0 {
    public static Index SYS_IDX_SYS_PK_10132_10134 = Internal.createIndex("SYS_IDX_SYS_PK_10132_10134", FormMetadata.FORM_METADATA, new OrderField[]{FormMetadata.FORM_METADATA.FORM_ID, FormMetadata.FORM_METADATA.FORM_VERSION}, true);
    public static Index SYS_IDX_SYS_PK_10146_10147 = Internal.createIndex("SYS_IDX_SYS_PK_10146_10147", SubmissionMetadata.SUBMISSION_METADATA, new OrderField[]{SubmissionMetadata.SUBMISSION_METADATA.FORM_ID, SubmissionMetadata.SUBMISSION_METADATA.FORM_VERSION, SubmissionMetadata.SUBMISSION_METADATA.INSTANCE_ID}, true);
  }
}
