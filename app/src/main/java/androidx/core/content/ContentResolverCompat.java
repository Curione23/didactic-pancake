package androidx.core.content;

/* JADX INFO: loaded from: classes.dex */
public final class ContentResolverCompat {
    private ContentResolverCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.database.Cursor query(android.content.ContentResolver r0, android.net.Uri r1, java.lang.String[] r2, java.lang.String r3, java.lang.String[] r4, java.lang.String r5, android.os.CancellationSignal r6) {
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L5
            return r0
        L5:
            r0 = move-exception
            boolean r1 = r0 instanceof android.os.OperationCanceledException
            if (r1 == 0) goto L10
            androidx.core.os.OperationCanceledException r0 = new androidx.core.os.OperationCanceledException
            r0.<init>()
            throw r0
        L10:
            throw r0
    }

    @java.lang.Deprecated
    public static android.database.Cursor query(android.content.ContentResolver r7, android.net.Uri r8, java.lang.String[] r9, java.lang.String r10, java.lang.String[] r11, java.lang.String r12, androidx.core.os.CancellationSignal r13) {
            if (r13 == 0) goto L9
            java.lang.Object r13 = r13.getCancellationSignalObject()
            android.os.CancellationSignal r13 = (android.os.CancellationSignal) r13
            goto La
        L9:
            r13 = 0
        La:
            r6 = r13
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            android.database.Cursor r7 = query(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }
}
