package org.apache.commons.io.output;

import java.lang.Appendable;

/* JADX INFO: loaded from: classes2.dex */
public class AppendableWriter<T extends java.lang.Appendable> extends java.io.Writer {
    private final T appendable;

    public AppendableWriter(T r1) {
            r0 = this;
            r0.<init>()
            r0.appendable = r1
            return
    }

    @Override // java.io.Writer, java.lang.Appendable
    public java.io.Writer append(char r2) throws java.io.IOException {
            r1 = this;
            T extends java.lang.Appendable r0 = r1.appendable
            r0.append(r2)
            return r1
    }

    @Override // java.io.Writer, java.lang.Appendable
    public java.io.Writer append(java.lang.CharSequence r2) throws java.io.IOException {
            r1 = this;
            T extends java.lang.Appendable r0 = r1.appendable
            r0.append(r2)
            return r1
    }

    @Override // java.io.Writer, java.lang.Appendable
    public java.io.Writer append(java.lang.CharSequence r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            T extends java.lang.Appendable r0 = r1.appendable
            r0.append(r2, r3, r4)
            return r1
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ java.lang.Appendable append(char r1) throws java.io.IOException {
            r0 = this;
            java.io.Writer r1 = r0.append(r1)
            return r1
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence r1) throws java.io.IOException {
            r0 = this;
            java.io.Writer r1 = r0.append(r1)
            return r1
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence r1, int r2, int r3) throws java.io.IOException {
            r0 = this;
            java.io.Writer r1 = r0.append(r1, r2, r3)
            return r1
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r0 = this;
            return
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws java.io.IOException {
            r0 = this;
            return
    }

    public T getAppendable() {
            r1 = this;
            T extends java.lang.Appendable r0 = r1.appendable
            return r0
    }

    @Override // java.io.Writer
    public void write(int r2) throws java.io.IOException {
            r1 = this;
            T extends java.lang.Appendable r0 = r1.appendable
            char r2 = (char) r2
            r0.append(r2)
            return
    }

    @Override // java.io.Writer
    public void write(java.lang.String r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "String is missing"
            java.util.Objects.requireNonNull(r2, r0)
            T extends java.lang.Appendable r0 = r1.appendable
            int r4 = r4 + r3
            r0.append(r2, r3, r4)
            return
    }

    @Override // java.io.Writer
    public void write(char[] r4, int r5, int r6) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "Character array is missing"
            java.util.Objects.requireNonNull(r4, r0)
            if (r6 < 0) goto L1c
            int r0 = r5 + r6
            int r1 = r4.length
            if (r0 > r1) goto L1c
            r0 = 0
        Ld:
            if (r0 >= r6) goto L1b
            T extends java.lang.Appendable r1 = r3.appendable
            int r2 = r5 + r0
            char r2 = r4[r2]
            r1.append(r2)
            int r0 = r0 + 1
            goto Ld
        L1b:
            return
        L1c:
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
