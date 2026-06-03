package okio;

/* JADX INFO: compiled from: -JvmPlatform.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000\u001a-\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\b*\u00060\u0001j\u0002`\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\nH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u000b*\n\u0010\f\"\u00020\r2\u00020\r*\n\u0010\u000e\"\u00020\u000f2\u00020\u000f*\n\u0010\u0010\"\u00020\u00112\u00020\u0011*\n\u0010\u0012\"\u00020\u00132\u00020\u0013*\n\u0010\u0014\"\u00020\u00152\u00020\u0015*\n\u0010\u0016\"\u00020\u00012\u00020\u0001*\n\u0010\u0017\"\u00020\u00182\u00020\u0018\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0019"}, d2 = {"newLock", "Ljava/util/concurrent/locks/ReentrantLock;", "Lokio/Lock;", "asUtf8ToByteArray", "", "", "toUtf8String", "withLock", "T", "action", "Lkotlin/Function0;", "(Ljava/util/concurrent/locks/ReentrantLock;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "ArrayIndexOutOfBoundsException", "Ljava/lang/ArrayIndexOutOfBoundsException;", "Closeable", "Ljava/io/Closeable;", "EOFException", "Ljava/io/EOFException;", "FileNotFoundException", "Ljava/io/FileNotFoundException;", "IOException", "Ljava/io/IOException;", "Lock", "ProtocolException", "Ljava/net/ProtocolException;", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class _JvmPlatformKt {
    public static final byte[] asUtf8ToByteArray(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8
            byte[] r1 = r1.getBytes(r0)
            java.lang.String r0 = "this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
    }

    public static final java.util.concurrent.locks.ReentrantLock newLock() {
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            return r0
    }

    public static final java.lang.String toUtf8String(byte[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
            r0.<init>(r2, r1)
            return r0
    }

    public static final <T> T withLock(java.util.concurrent.locks.ReentrantLock r1, kotlin.jvm.functions.Function0<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.concurrent.locks.Lock r1 = (java.util.concurrent.locks.Lock) r1
            r1.lock()
            r0 = 1
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> L1e
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            r1.unlock()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            return r2
        L1e:
            r2 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            r1.unlock()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            throw r2
    }
}
