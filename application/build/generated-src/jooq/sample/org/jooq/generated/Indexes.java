/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated;


import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.generated.tables.Author;
import org.jooq.generated.tables.Book;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>PUBLIC</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index PRIMARY_KEY_7 = Indexes0.PRIMARY_KEY_7;
    public static final Index FKKLNRV3WELER2FTKWEEWLKY958_INDEX_1 = Indexes0.FKKLNRV3WELER2FTKWEEWLKY958_INDEX_1;
    public static final Index PRIMARY_KEY_1 = Indexes0.PRIMARY_KEY_1;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index PRIMARY_KEY_7 = Internal.createIndex("PRIMARY_KEY_7", Author.AUTHOR, new OrderField[] { Author.AUTHOR.ID }, true);
        public static Index FKKLNRV3WELER2FTKWEEWLKY958_INDEX_1 = Internal.createIndex("FKKLNRV3WELER2FTKWEEWLKY958_INDEX_1", Book.BOOK, new OrderField[] { Book.BOOK.AUTHOR_ID }, false);
        public static Index PRIMARY_KEY_1 = Internal.createIndex("PRIMARY_KEY_1", Book.BOOK, new OrderField[] { Book.BOOK.ID }, true);
    }
}
