package org.apache.commons.io.output;

/* JADX INFO: loaded from: classes2.dex */
public final class UnsynchronizedByteArrayOutputStream extends org.apache.commons.io.output.AbstractByteArrayOutputStream {

    public static class Builder extends org.apache.commons.io.build.AbstractStreamBuilder<org.apache.commons.io.output.UnsynchronizedByteArrayOutputStream, org.apache.commons.io.output.UnsynchronizedByteArrayOutputStream.Builder> {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public /* bridge */ /* synthetic */ java.lang.Object get() throws java.io.IOException {
                r1 = this;
                org.apache.commons.io.output.UnsynchronizedByteArrayOutputStream r0 = r1.get()
                return r0
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public org.apache.commons.io.output.UnsynchronizedByteArrayOutputStream get() {
                r2 = this;
                org.apache.commons.io.output.UnsynchronizedByteArrayOutputStream r0 = new org.apache.commons.io.output.UnsynchronizedByteArrayOutputStream
                int r1 = r2.getBufferSize()
                r0.<init>(r1)
                return r0
        }
    }

    @java.lang.Deprecated
    public UnsynchronizedByteArrayOutputStream() {
            r1 = this;
            r0 = 1024(0x400, float:1.435E-42)
            r1.<init>(r0)
            return
    }

    @java.lang.Deprecated
    public UnsynchronizedByteArrayOutputStream(int r4) {
            r3 = this;
            r3.<init>()
            if (r4 < 0) goto L9
            r3.needNewBuffer(r4)
            return
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Negative initial size: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public static org.apache.commons.io.output.UnsynchronizedByteArrayOutputStream.Builder builder() {
            org.apache.commons.io.output.UnsynchronizedByteArrayOutputStream$Builder r0 = new org.apache.commons.io.output.UnsynchronizedByteArrayOutputStream$Builder
            r0.<init>()
            return r0
    }

    static /* synthetic */ org.apache.commons.io.input.UnsynchronizedByteArrayInputStream lambda$toInputStream$0(byte[] r1, int r2, int r3) throws java.io.IOException {
            org.apache.commons.io.input.UnsynchronizedByteArrayInputStream$Builder r0 = org.apache.commons.io.input.UnsynchronizedByteArrayInputStream.builder()
            org.apache.commons.io.input.UnsynchronizedByteArrayInputStream$Builder r1 = r0.setByteArray(r1)
            org.apache.commons.io.input.UnsynchronizedByteArrayInputStream$Builder r1 = r1.setOffset(r2)
            org.apache.commons.io.input.UnsynchronizedByteArrayInputStream$Builder r1 = r1.setLength(r3)
            org.apache.commons.io.input.UnsynchronizedByteArrayInputStream r1 = r1.get()
            return r1
    }

    static /* synthetic */ org.apache.commons.io.input.UnsynchronizedByteArrayInputStream lambda$toInputStream$1(byte[] r1, int r2, int r3) {
            org.apache.commons.io.output.UnsynchronizedByteArrayOutputStream$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.output.UnsynchronizedByteArrayOutputStream$$ExternalSyntheticLambda0
            r0.<init>(r1, r2, r3)
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.get(r0)
            org.apache.commons.io.input.UnsynchronizedByteArrayInputStream r1 = (org.apache.commons.io.input.UnsynchronizedByteArrayInputStream) r1
            return r1
    }

    public static java.io.InputStream toBufferedInputStream(java.io.InputStream r1) throws java.io.IOException {
            r0 = 1024(0x400, float:1.435E-42)
            java.io.InputStream r1 = toBufferedInputStream(r1, r0)
            return r1
    }

    public static java.io.InputStream toBufferedInputStream(java.io.InputStream r1, int r2) throws java.io.IOException {
            org.apache.commons.io.output.UnsynchronizedByteArrayOutputStream$Builder r0 = builder()
            org.apache.commons.io.build.AbstractStreamBuilder r2 = r0.setBufferSize(r2)
            org.apache.commons.io.output.UnsynchronizedByteArrayOutputStream$Builder r2 = (org.apache.commons.io.output.UnsynchronizedByteArrayOutputStream.Builder) r2
            org.apache.commons.io.output.UnsynchronizedByteArrayOutputStream r2 = r2.get()
            r2.write(r1)     // Catch: java.lang.Throwable -> L1b
            java.io.InputStream r1 = r2.toInputStream()     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1a
            r2.close()
        L1a:
            return r1
        L1b:
            r1 = move-exception
            if (r2 == 0) goto L26
            r2.close()     // Catch: java.lang.Throwable -> L22
            goto L26
        L22:
            r2 = move-exception
            r1.addSuppressed(r2)
        L26:
            throw r1
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public void reset() {
            r0 = this;
            r0.resetImpl()
            return
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public int size() {
            r1 = this;
            int r0 = r1.count
            return r0
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public byte[] toByteArray() {
            r1 = this;
            byte[] r0 = r1.toByteArrayImpl()
            return r0
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public java.io.InputStream toInputStream() {
            r1 = this;
            org.apache.commons.io.output.UnsynchronizedByteArrayOutputStream$$ExternalSyntheticLambda1 r0 = new org.apache.commons.io.output.UnsynchronizedByteArrayOutputStream$$ExternalSyntheticLambda1
            r0.<init>()
            java.io.InputStream r0 = r1.toInputStream(r0)
            return r0
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public int write(java.io.InputStream r1) throws java.io.IOException {
            r0 = this;
            int r1 = r0.writeImpl(r1)
            return r1
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream, java.io.OutputStream
    public void write(int r1) {
            r0 = this;
            r0.writeImpl(r1)
            return
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream, java.io.OutputStream
    public void write(byte[] r3, int r4, int r5) {
            r2 = this;
            if (r4 < 0) goto L15
            int r0 = r3.length
            if (r4 > r0) goto L15
            if (r5 < 0) goto L15
            int r0 = r4 + r5
            int r1 = r3.length
            if (r0 > r1) goto L15
            if (r0 < 0) goto L15
            if (r5 != 0) goto L11
            return
        L11:
            r2.writeImpl(r3, r4, r5)
            return
        L15:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5}
            java.lang.String r5 = "offset=%,d, length=%,d"
            java.lang.String r4 = java.lang.String.format(r5, r4)
            r3.<init>(r4)
            throw r3
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public void writeTo(java.io.OutputStream r1) throws java.io.IOException {
            r0 = this;
            r0.writeToImpl(r1)
            return
    }
}
