package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
public class SequenceReader extends java.io.Reader {
    private java.io.Reader reader;
    private final java.util.Iterator<? extends java.io.Reader> readers;

    public static /* synthetic */ java.io.Reader $r8$lambda$shTLAUDLRQkNj8Pu1JWiqjwr_do(org.apache.commons.io.input.SequenceReader r0) {
            java.io.Reader r0 = r0.nextReader()
            return r0
    }

    public SequenceReader(java.lang.Iterable<? extends java.io.Reader> r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "readers"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
            r1.readers = r2
            org.apache.commons.io.input.SequenceReader$$ExternalSyntheticLambda0 r2 = new org.apache.commons.io.input.SequenceReader$$ExternalSyntheticLambda0
            r2.<init>(r1)
            java.lang.Object r2 = org.apache.commons.io.function.Uncheck.get(r2)
            java.io.Reader r2 = (java.io.Reader) r2
            r1.reader = r2
            return
    }

    public SequenceReader(java.io.Reader... r1) {
            r0 = this;
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            return
    }

    private java.io.Reader nextReader() throws java.io.IOException {
            r1 = this;
            java.io.Reader r0 = r1.reader
            if (r0 == 0) goto L7
            r0.close()
        L7:
            java.util.Iterator<? extends java.io.Reader> r0 = r1.readers
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L1a
            java.util.Iterator<? extends java.io.Reader> r0 = r1.readers
            java.lang.Object r0 = r0.next()
            java.io.Reader r0 = (java.io.Reader) r0
            r1.reader = r0
            goto L1d
        L1a:
            r0 = 0
            r1.reader = r0
        L1d:
            java.io.Reader r0 = r1.reader
            return r0
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
        L0:
            java.io.Reader r0 = r1.nextReader()
            if (r0 != 0) goto L0
            return
    }

    @Override // java.io.Reader
    public int read() throws java.io.IOException {
            r3 = this;
            r0 = -1
            r1 = r0
        L2:
            java.io.Reader r2 = r3.reader
            if (r2 == 0) goto L11
            int r1 = r2.read()
            if (r1 == r0) goto Ld
            goto L11
        Ld:
            r3.nextReader()
            goto L2
        L11:
            return r1
    }

    @Override // java.io.Reader
    public int read(char[] r4, int r5, int r6) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "cbuf"
            java.util.Objects.requireNonNull(r4, r0)
            if (r6 < 0) goto L27
            if (r5 < 0) goto L27
            int r0 = r5 + r6
            int r1 = r4.length
            if (r0 > r1) goto L27
            r0 = 0
        Lf:
            java.io.Reader r1 = r3.reader
            r2 = -1
            if (r1 == 0) goto L23
            int r1 = r1.read(r4, r5, r6)
            if (r1 != r2) goto L1e
            r3.nextReader()
            goto Lf
        L1e:
            int r0 = r0 + r1
            int r5 = r5 + r1
            int r6 = r6 - r1
            if (r6 > 0) goto Lf
        L23:
            if (r0 <= 0) goto L26
            return r0
        L26:
            return r2
        L27:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Array Size="
            r1.<init>(r2)
            int r4 = r4.length
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = ", offset="
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = ", length="
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }
}
