package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
public class UnsynchronizedByteArrayInputStream extends java.io.InputStream {
    public static final int END_OF_STREAM = -1;
    private final byte[] data;
    private final int eod;
    private int markedOffset;
    private int offset;

    public static class Builder extends org.apache.commons.io.build.AbstractStreamBuilder<org.apache.commons.io.input.UnsynchronizedByteArrayInputStream, org.apache.commons.io.input.UnsynchronizedByteArrayInputStream.Builder> {
        private int length;
        private int offset;

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public /* bridge */ /* synthetic */ java.lang.Object get() throws java.io.IOException {
                r1 = this;
                org.apache.commons.io.input.UnsynchronizedByteArrayInputStream r0 = r1.get()
                return r0
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public org.apache.commons.io.input.UnsynchronizedByteArrayInputStream get() throws java.io.IOException {
                r4 = this;
                org.apache.commons.io.input.UnsynchronizedByteArrayInputStream r0 = new org.apache.commons.io.input.UnsynchronizedByteArrayInputStream
                org.apache.commons.io.build.AbstractOrigin r1 = r4.checkOrigin()
                byte[] r1 = r1.getByteArray()
                int r2 = r4.offset
                int r3 = r4.length
                r0.<init>(r1, r2, r3)
                return r0
        }

        @Override // org.apache.commons.io.build.AbstractOriginSupplier
        public /* bridge */ /* synthetic */ org.apache.commons.io.build.AbstractOriginSupplier setByteArray(byte[] r1) {
                r0 = this;
                org.apache.commons.io.input.UnsynchronizedByteArrayInputStream$Builder r1 = r0.setByteArray(r1)
                return r1
        }

        @Override // org.apache.commons.io.build.AbstractOriginSupplier
        public org.apache.commons.io.input.UnsynchronizedByteArrayInputStream.Builder setByteArray(byte[] r2) {
                r1 = this;
                java.lang.String r0 = "origin"
                java.lang.Object r0 = java.util.Objects.requireNonNull(r2, r0)
                byte[] r0 = (byte[]) r0
                int r0 = r0.length
                r1.length = r0
                org.apache.commons.io.build.AbstractOriginSupplier r2 = super.setByteArray(r2)
                org.apache.commons.io.input.UnsynchronizedByteArrayInputStream$Builder r2 = (org.apache.commons.io.input.UnsynchronizedByteArrayInputStream.Builder) r2
                return r2
        }

        public org.apache.commons.io.input.UnsynchronizedByteArrayInputStream.Builder setLength(int r2) {
                r1 = this;
                if (r2 < 0) goto L5
                r1.length = r2
                return r1
            L5:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "length cannot be negative"
                r2.<init>(r0)
                throw r2
        }

        public org.apache.commons.io.input.UnsynchronizedByteArrayInputStream.Builder setOffset(int r2) {
                r1 = this;
                if (r2 < 0) goto L5
                r1.offset = r2
                return r1
            L5:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "offset cannot be negative"
                r2.<init>(r0)
                throw r2
        }
    }

    @java.lang.Deprecated
    public UnsynchronizedByteArrayInputStream(byte[] r3) {
            r2 = this;
            int r0 = r3.length
            r1 = 0
            r2.<init>(r3, r0, r1, r1)
            return
    }

    @java.lang.Deprecated
    public UnsynchronizedByteArrayInputStream(byte[] r4, int r5) {
            r3 = this;
            int r0 = r4.length
            java.lang.String r1 = "offset"
            int r1 = requireNonNegative(r5, r1)
            int r2 = minPosLen(r4, r5)
            int r1 = java.lang.Math.min(r1, r2)
            int r5 = minPosLen(r4, r5)
            r3.<init>(r4, r0, r1, r5)
            return
    }

    @java.lang.Deprecated
    public UnsynchronizedByteArrayInputStream(byte[] r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "offset"
            requireNonNegative(r3, r0)
            java.lang.String r0 = "length"
            requireNonNegative(r4, r0)
            java.lang.String r0 = "data"
            java.lang.Object r0 = java.util.Objects.requireNonNull(r2, r0)
            byte[] r0 = (byte[]) r0
            r1.data = r0
            int r0 = minPosLen(r2, r3)
            int r0 = r0 + r4
            int r4 = r2.length
            int r4 = java.lang.Math.min(r0, r4)
            r1.eod = r4
            int r4 = minPosLen(r2, r3)
            r1.offset = r4
            int r2 = minPosLen(r2, r3)
            r1.markedOffset = r2
            return
    }

    private UnsynchronizedByteArrayInputStream(byte[] r2, int r3, int r4, int r5) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "data"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            byte[] r2 = (byte[]) r2
            r1.data = r2
            r1.eod = r3
            r1.offset = r4
            r1.markedOffset = r5
            return
    }

    public static org.apache.commons.io.input.UnsynchronizedByteArrayInputStream.Builder builder() {
            org.apache.commons.io.input.UnsynchronizedByteArrayInputStream$Builder r0 = new org.apache.commons.io.input.UnsynchronizedByteArrayInputStream$Builder
            r0.<init>()
            return r0
    }

    private static int minPosLen(byte[] r1, int r2) {
            java.lang.String r0 = "defaultValue"
            requireNonNegative(r2, r0)
            int r0 = r1.length
            if (r0 <= 0) goto La
            int r1 = r1.length
            goto Lb
        La:
            r1 = r2
        Lb:
            int r1 = java.lang.Math.min(r2, r1)
            return r1
    }

    private static int requireNonNegative(int r1, java.lang.String r2) {
            if (r1 < 0) goto L3
            return r1
        L3:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r0 = " cannot be negative"
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Override // java.io.InputStream
    public int available() {
            r2 = this;
            int r0 = r2.offset
            int r1 = r2.eod
            if (r0 >= r1) goto L8
            int r1 = r1 - r0
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    @Override // java.io.InputStream
    public void mark(int r1) {
            r0 = this;
            int r1 = r0.offset
            r0.markedOffset = r1
            return
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // java.io.InputStream
    public int read() {
            r3 = this;
            int r0 = r3.offset
            int r1 = r3.eod
            if (r0 >= r1) goto L11
            byte[] r1 = r3.data
            int r2 = r0 + 1
            r3.offset = r2
            r0 = r1[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            goto L12
        L11:
            r0 = -1
        L12:
            return r0
    }

    @Override // java.io.InputStream
    public int read(byte[] r3) {
            r2 = this;
            java.lang.String r0 = "dest"
            java.util.Objects.requireNonNull(r3, r0)
            r0 = 0
            int r1 = r3.length
            int r3 = r2.read(r3, r0, r1)
            return r3
    }

    @Override // java.io.InputStream
    public int read(byte[] r3, int r4, int r5) {
            r2 = this;
            java.lang.String r0 = "dest"
            java.util.Objects.requireNonNull(r3, r0)
            if (r4 < 0) goto L2a
            if (r5 < 0) goto L2a
            int r0 = r4 + r5
            int r1 = r3.length
            if (r0 > r1) goto L2a
            int r0 = r2.offset
            int r1 = r2.eod
            if (r0 < r1) goto L16
            r3 = -1
            return r3
        L16:
            int r1 = r1 - r0
            if (r5 >= r1) goto L1a
            goto L1b
        L1a:
            r5 = r1
        L1b:
            if (r5 > 0) goto L1f
            r3 = 0
            return r3
        L1f:
            byte[] r1 = r2.data
            java.lang.System.arraycopy(r1, r0, r3, r4, r5)
            int r3 = r2.offset
            int r3 = r3 + r5
            r2.offset = r3
            return r5
        L2a:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            r3.<init>()
            throw r3
    }

    @Override // java.io.InputStream
    public void reset() {
            r1 = this;
            int r0 = r1.markedOffset
            r1.offset = r0
            return
    }

    @Override // java.io.InputStream
    public long skip(long r5) {
            r4 = this;
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L1c
            int r0 = r4.eod
            int r1 = r4.offset
            int r0 = r0 - r1
            long r2 = (long) r0
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 >= 0) goto L11
            r2 = r5
        L11:
            int r5 = java.lang.Math.toIntExact(r5)
            int r5 = java.lang.Math.addExact(r1, r5)
            r4.offset = r5
            return r2
        L1c:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Skipping backward is not supported"
            r5.<init>(r6)
            throw r5
    }
}
