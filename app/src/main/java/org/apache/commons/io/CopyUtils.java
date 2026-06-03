package org.apache.commons.io;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class CopyUtils {
    @java.lang.Deprecated
    public CopyUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int copy(java.io.InputStream r5, java.io.OutputStream r6) throws java.io.IOException {
            byte[] r0 = org.apache.commons.io.IOUtils.byteArray()
            r1 = 0
            r2 = r1
        L6:
            int r3 = r5.read(r0)
            r4 = -1
            if (r4 == r3) goto L12
            r6.write(r0, r1, r3)
            int r2 = r2 + r3
            goto L6
        L12:
            return r2
    }

    public static int copy(java.io.Reader r5, java.io.Writer r6) throws java.io.IOException {
            char[] r0 = org.apache.commons.io.IOUtils.getScratchCharArray()
            r1 = 0
            r2 = r1
        L6:
            int r3 = r5.read(r0)
            r4 = -1
            if (r4 == r3) goto L12
            r6.write(r0, r1, r3)
            int r2 = r2 + r3
            goto L6
        L12:
            return r2
    }

    @java.lang.Deprecated
    public static void copy(java.io.InputStream r2, java.io.Writer r3) throws java.io.IOException {
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.nio.charset.Charset r1 = java.nio.charset.Charset.defaultCharset()
            r0.<init>(r2, r1)
            copy(r0, r3)
            return
    }

    public static void copy(java.io.InputStream r1, java.io.Writer r2, java.lang.String r3) throws java.io.IOException {
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            r0.<init>(r1, r3)
            copy(r0, r2)
            return
    }

    @java.lang.Deprecated
    public static void copy(java.io.Reader r2, java.io.OutputStream r3) throws java.io.IOException {
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
            java.nio.charset.Charset r1 = java.nio.charset.Charset.defaultCharset()
            r0.<init>(r3, r1)
            copy(r2, r0)
            r0.flush()
            return
    }

    public static void copy(java.io.Reader r1, java.io.OutputStream r2, java.lang.String r3) throws java.io.IOException {
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
            r0.<init>(r2, r3)
            copy(r1, r0)
            r0.flush()
            return
    }

    @java.lang.Deprecated
    public static void copy(java.lang.String r2, java.io.OutputStream r3) throws java.io.IOException {
            java.io.StringReader r0 = new java.io.StringReader
            r0.<init>(r2)
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter
            java.nio.charset.Charset r1 = java.nio.charset.Charset.defaultCharset()
            r2.<init>(r3, r1)
            copy(r0, r2)
            r2.flush()
            return
    }

    public static void copy(java.lang.String r1, java.io.OutputStream r2, java.lang.String r3) throws java.io.IOException {
            java.io.StringReader r0 = new java.io.StringReader
            r0.<init>(r1)
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter
            r1.<init>(r2, r3)
            copy(r0, r1)
            r1.flush()
            return
    }

    public static void copy(java.lang.String r0, java.io.Writer r1) throws java.io.IOException {
            r1.write(r0)
            return
    }

    public static void copy(byte[] r0, java.io.OutputStream r1) throws java.io.IOException {
            r1.write(r0)
            return
    }

    @java.lang.Deprecated
    public static void copy(byte[] r1, java.io.Writer r2) throws java.io.IOException {
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r1)
            copy(r0, r2)
            return
    }

    public static void copy(byte[] r1, java.io.Writer r2, java.lang.String r3) throws java.io.IOException {
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r1)
            copy(r0, r2, r3)
            return
    }
}
