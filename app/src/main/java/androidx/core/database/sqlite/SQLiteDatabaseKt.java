package androidx.core.database.sqlite;

/* JADX INFO: compiled from: SQLiteDatabase.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\b¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"transaction", "T", "Landroid/database/sqlite/SQLiteDatabase;", "exclusive", "", "body", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Landroid/database/sqlite/SQLiteDatabase;ZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SQLiteDatabaseKt {
    public static final <T> T transaction(android.database.sqlite.SQLiteDatabase r0, boolean r1, kotlin.jvm.functions.Function1<? super android.database.sqlite.SQLiteDatabase, ? extends T> r2) {
            if (r1 == 0) goto L6
            r0.beginTransaction()
            goto L9
        L6:
            r0.beginTransactionNonExclusive()
        L9:
            r1 = 1
            java.lang.Object r2 = r2.invoke(r0)     // Catch: java.lang.Throwable -> L1b
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L1b
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            r0.endTransaction()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            return r2
        L1b:
            r2 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            r0.endTransaction()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r2
    }

    public static /* synthetic */ java.lang.Object transaction$default(android.database.sqlite.SQLiteDatabase r0, boolean r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) {
            r4 = 1
            r3 = r3 & r4
            if (r3 == 0) goto L5
            r1 = r4
        L5:
            if (r1 == 0) goto Lb
            r0.beginTransaction()
            goto Le
        Lb:
            r0.beginTransactionNonExclusive()
        Le:
            java.lang.Object r1 = r2.invoke(r0)     // Catch: java.lang.Throwable -> L1f
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L1f
            kotlin.jvm.internal.InlineMarker.finallyStart(r4)
            r0.endTransaction()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r4)
            return r1
        L1f:
            r1 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r4)
            r0.endTransaction()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r4)
            throw r1
    }
}
