package okio;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"okio/Okio__JvmOkioKt", "okio/Okio__OkioKt"}, k = 4, mv = {1, 9, 0}, xi = 48)
public final class Okio {
    public static final okio.Sink appendingSink(java.io.File r0) throws java.io.FileNotFoundException {
            okio.Sink r0 = okio.Okio__JvmOkioKt.appendingSink(r0)
            return r0
    }

    public static final okio.FileSystem asResourceFileSystem(java.lang.ClassLoader r0) {
            okio.FileSystem r0 = okio.Okio__JvmOkioKt.asResourceFileSystem(r0)
            return r0
    }

    public static final okio.Sink blackhole() {
            okio.Sink r0 = okio.Okio__OkioKt.blackhole()
            return r0
    }

    public static final okio.BufferedSink buffer(okio.Sink r0) {
            okio.BufferedSink r0 = okio.Okio__OkioKt.buffer(r0)
            return r0
    }

    public static final okio.BufferedSource buffer(okio.Source r0) {
            okio.BufferedSource r0 = okio.Okio__OkioKt.buffer(r0)
            return r0
    }

    public static final okio.CipherSink cipherSink(okio.Sink r0, javax.crypto.Cipher r1) {
            okio.CipherSink r0 = okio.Okio__JvmOkioKt.cipherSink(r0, r1)
            return r0
    }

    public static final okio.CipherSource cipherSource(okio.Source r0, javax.crypto.Cipher r1) {
            okio.CipherSource r0 = okio.Okio__JvmOkioKt.cipherSource(r0, r1)
            return r0
    }

    public static final okio.HashingSink hashingSink(okio.Sink r0, java.security.MessageDigest r1) {
            okio.HashingSink r0 = okio.Okio__JvmOkioKt.hashingSink(r0, r1)
            return r0
    }

    public static final okio.HashingSink hashingSink(okio.Sink r0, javax.crypto.Mac r1) {
            okio.HashingSink r0 = okio.Okio__JvmOkioKt.hashingSink(r0, r1)
            return r0
    }

    public static final okio.HashingSource hashingSource(okio.Source r0, java.security.MessageDigest r1) {
            okio.HashingSource r0 = okio.Okio__JvmOkioKt.hashingSource(r0, r1)
            return r0
    }

    public static final okio.HashingSource hashingSource(okio.Source r0, javax.crypto.Mac r1) {
            okio.HashingSource r0 = okio.Okio__JvmOkioKt.hashingSource(r0, r1)
            return r0
    }

    public static final boolean isAndroidGetsocknameError(java.lang.AssertionError r0) {
            boolean r0 = okio.Okio__JvmOkioKt.isAndroidGetsocknameError(r0)
            return r0
    }

    public static final okio.FileSystem openZip(okio.FileSystem r0, okio.Path r1) throws java.io.IOException {
            okio.FileSystem r0 = okio.Okio__JvmOkioKt.openZip(r0, r1)
            return r0
    }

    public static final okio.Sink sink(java.io.File r0) throws java.io.FileNotFoundException {
            okio.Sink r0 = okio.Okio__JvmOkioKt.sink(r0)
            return r0
    }

    public static final okio.Sink sink(java.io.File r0, boolean r1) throws java.io.FileNotFoundException {
            okio.Sink r0 = okio.Okio__JvmOkioKt.sink(r0, r1)
            return r0
    }

    public static final okio.Sink sink(java.io.OutputStream r0) {
            okio.Sink r0 = okio.Okio__JvmOkioKt.sink(r0)
            return r0
    }

    public static final okio.Sink sink(java.net.Socket r0) throws java.io.IOException {
            okio.Sink r0 = okio.Okio__JvmOkioKt.sink(r0)
            return r0
    }

    public static final okio.Sink sink(java.nio.file.Path r0, java.nio.file.OpenOption... r1) throws java.io.IOException {
            okio.Sink r0 = okio.Okio__JvmOkioKt.sink(r0, r1)
            return r0
    }

    public static /* synthetic */ okio.Sink sink$default(java.io.File r0, boolean r1, int r2, java.lang.Object r3) throws java.io.FileNotFoundException {
            okio.Sink r0 = okio.Okio__JvmOkioKt.sink$default(r0, r1, r2, r3)
            return r0
    }

    public static final okio.Source source(java.io.File r0) throws java.io.FileNotFoundException {
            okio.Source r0 = okio.Okio__JvmOkioKt.source(r0)
            return r0
    }

    public static final okio.Source source(java.io.InputStream r0) {
            okio.Source r0 = okio.Okio__JvmOkioKt.source(r0)
            return r0
    }

    public static final okio.Source source(java.net.Socket r0) throws java.io.IOException {
            okio.Source r0 = okio.Okio__JvmOkioKt.source(r0)
            return r0
    }

    public static final okio.Source source(java.nio.file.Path r0, java.nio.file.OpenOption... r1) throws java.io.IOException {
            okio.Source r0 = okio.Okio__JvmOkioKt.source(r0, r1)
            return r0
    }

    public static final <T extends java.io.Closeable, R> R use(T r0, kotlin.jvm.functions.Function1<? super T, ? extends R> r1) {
            java.lang.Object r0 = okio.Okio__OkioKt.use(r0, r1)
            return r0
    }
}
