package androidx.core.net;

/* JADX INFO: compiled from: Uri.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\r\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0086\b\u001a\r\u0010\u0003\u001a\u00020\u0002*\u00020\u0004H\u0086\b¨\u0006\u0005"}, d2 = {"toFile", "Ljava/io/File;", "Landroid/net/Uri;", "toUri", "", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class UriKt {
    public static final java.io.File toFile(android.net.Uri r2) {
            java.lang.String r0 = r2.getScheme()
            java.lang.String r1 = "file"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L31
            java.lang.String r0 = r2.getPath()
            if (r0 == 0) goto L18
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            return r2
        L18:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Uri path is null: "
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L31:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Uri lacks 'file' scheme: "
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
    }

    public static final android.net.Uri toUri(java.io.File r0) {
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            return r0
    }

    public static final android.net.Uri toUri(java.lang.String r0) {
            android.net.Uri r0 = android.net.Uri.parse(r0)
            return r0
    }
}
