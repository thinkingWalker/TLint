package com.gzsll.hupu.support.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table BOARD.
 */
public class BoardDao extends AbstractDao<Board, Long> {

    public static final String TABLENAME = "BOARD";

    /**
     * Properties of entity Board.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Fid = new Property(1, String.class, "fid", false, "FID");
        public final static Property Name = new Property(2, String.class, "name", false, "NAME");
        public final static Property Logo = new Property(3, String.class, "logo", false, "LOGO");
        public final static Property Description = new Property(4, String.class, "description", false, "DESCRIPTION");
        public final static Property BackImg = new Property(5, String.class, "backImg", false, "BACK_IMG");
        public final static Property BoardId = new Property(6, String.class, "boardId", false, "BOARD_ID");
        public final static Property CategoryName = new Property(7, String.class, "categoryName", false, "CATEGORY_NAME");
    }

    ;


    public BoardDao(DaoConfig config) {
        super(config);
    }

    public BoardDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /**
     * Creates the underlying database table.
     */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists ? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'BOARD' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'FID' TEXT," + // 1: fid
                "'NAME' TEXT," + // 2: name
                "'LOGO' TEXT," + // 3: logo
                "'DESCRIPTION' TEXT," + // 4: description
                "'BACK_IMG' TEXT," + // 5: backImg
                "'BOARD_ID' TEXT," + // 6: boardId
                "'CATEGORY_NAME' TEXT);"); // 7: categoryName
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'BOARD'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Board entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }

        String fid = entity.getFid();
        if (fid != null) {
            stmt.bindString(2, fid);
        }

        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }

        String logo = entity.getLogo();
        if (logo != null) {
            stmt.bindString(4, logo);
        }

        String description = entity.getDescription();
        if (description != null) {
            stmt.bindString(5, description);
        }

        String backImg = entity.getBackImg();
        if (backImg != null) {
            stmt.bindString(6, backImg);
        }

        String boardId = entity.getBoardId();
        if (boardId != null) {
            stmt.bindString(7, boardId);
        }

        String categoryName = entity.getCategoryName();
        if (categoryName != null) {
            stmt.bindString(8, categoryName);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Board readEntity(Cursor cursor, int offset) {
        Board entity = new Board( //
                cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
                cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // fid
                cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // name
                cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // logo
                cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // description
                cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // backImg
                cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // boardId
                cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7) // categoryName
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Board entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setFid(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setLogo(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setDescription(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setBackImg(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setBoardId(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setCategoryName(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Board entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Board entity) {
        if (entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
