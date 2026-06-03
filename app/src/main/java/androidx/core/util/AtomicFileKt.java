package androidx.core.util;

/* JADX INFO: compiled from: AtomicFile.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086\b\u001a\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u001a0\u0010\u0007\u001a\u00020\b*\u00020\u00022!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\b0\nH\u0086\b\u001a\u0012\u0010\u000f\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0001\u001a\u001c\u0010\u0011\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006¨\u0006\u0013"}, d2 = {"readBytes", "", "Landroid/util/AtomicFile;", "readText", "", "charset", "Ljava/nio/charset/Charset;", "tryWrite", "", "block", "Lkotlin/Function1;", "Ljava/io/FileOutputStream;", "Lkotlin/ParameterName;", "name", "out", "writeBytes", "array", "writeText", "text", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AtomicFileKt {
    public static final byte[] readBytes(android.util.AtomicFile r0) {
            byte[] r0 = r0.readFully()
            return r0
    }

    public static final java.lang.String readText(android.util.AtomicFile r1, java.nio.charset.Charset r2) {
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r1.readFully()
            r0.<init>(r1, r2)
            return r0
    }

    public static /* synthetic */ java.lang.String readText$default(android.util.AtomicFile r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
        L6:
            java.lang.String r0 = readText(r0, r1)
            return r0
    }

    public static final void tryWrite(android.util.AtomicFile r2, kotlin.jvm.functions.Function1<? super java.io.FileOutputStream, kotlin.Unit> r3) {
            java.io.FileOutputStream r0 = r2.startWrite()
            r1 = 1
            r3.invoke(r0)     // Catch: java.lang.Throwable -> L12
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            r2.finishWrite(r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            return
        L12:
            r3 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            r2.failWrite(r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r3
    }

    public static final void writeBytes(android.util.AtomicFile r1, byte[] r2) {
            java.io.FileOutputStream r0 = r1.startWrite()
            r0.write(r2)     // Catch: java.lang.Throwable -> Lb
            r1.finishWrite(r0)
            return
        Lb:
            r2 = move-exception
            r1.failWrite(r0)
            throw r2
    }

    public static final void writeText(android.util.AtomicFile r0, java.lang.String r1, java.nio.charset.Charset r2) {
            byte[] r1 = r1.getBytes(r2)
            java.lang.String r2 = "this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            writeBytes(r0, r1)
            return
    }

    public static /* synthetic */ void writeText$default(android.util.AtomicFile r0, java.lang.String r1, java.nio.charset.Charset r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            java.nio.charset.Charset r2 = kotlin.text.Charsets.UTF_8
        L6:
            writeText(r0, r1, r2)
            return
    }
}
