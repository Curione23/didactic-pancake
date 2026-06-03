package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
public class BOMInputStream extends org.apache.commons.io.input.ProxyInputStream {
    private static final java.util.Comparator<org.apache.commons.io.ByteOrderMark> ByteOrderMarkLengthComparator = null;
    private final java.util.List<org.apache.commons.io.ByteOrderMark> boms;
    private org.apache.commons.io.ByteOrderMark byteOrderMark;
    private int fbIndex;
    private int fbLength;
    private int[] firstBytes;
    private final boolean include;
    private int markFbIndex;
    private boolean markedAtStart;

    public static class Builder extends org.apache.commons.io.build.AbstractStreamBuilder<org.apache.commons.io.input.BOMInputStream, org.apache.commons.io.input.BOMInputStream.Builder> {
        private static final org.apache.commons.io.ByteOrderMark[] DEFAULT = null;
        private org.apache.commons.io.ByteOrderMark[] byteOrderMarks;
        private boolean include;

        static {
                r0 = 1
                org.apache.commons.io.ByteOrderMark[] r0 = new org.apache.commons.io.ByteOrderMark[r0]
                r1 = 0
                org.apache.commons.io.ByteOrderMark r2 = org.apache.commons.io.ByteOrderMark.UTF_8
                r0[r1] = r2
                org.apache.commons.io.input.BOMInputStream.Builder.DEFAULT = r0
                return
        }

        public Builder() {
                r1 = this;
                r1.<init>()
                org.apache.commons.io.ByteOrderMark[] r0 = org.apache.commons.io.input.BOMInputStream.Builder.DEFAULT
                r1.byteOrderMarks = r0
                return
        }

        static /* synthetic */ org.apache.commons.io.ByteOrderMark[] access$000() {
                org.apache.commons.io.ByteOrderMark[] r0 = org.apache.commons.io.input.BOMInputStream.Builder.DEFAULT
                return r0
        }

        static org.apache.commons.io.ByteOrderMark getDefaultByteOrderMark() {
                org.apache.commons.io.ByteOrderMark[] r0 = org.apache.commons.io.input.BOMInputStream.Builder.DEFAULT
                r1 = 0
                r0 = r0[r1]
                return r0
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public /* bridge */ /* synthetic */ java.lang.Object get() throws java.io.IOException {
                r1 = this;
                org.apache.commons.io.input.BOMInputStream r0 = r1.get()
                return r0
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public org.apache.commons.io.input.BOMInputStream get() throws java.io.IOException {
                r4 = this;
                org.apache.commons.io.input.BOMInputStream r0 = new org.apache.commons.io.input.BOMInputStream
                java.io.InputStream r1 = r4.getInputStream()
                boolean r2 = r4.include
                org.apache.commons.io.ByteOrderMark[] r3 = r4.byteOrderMarks
                r0.<init>(r1, r2, r3)
                return r0
        }

        public org.apache.commons.io.input.BOMInputStream.Builder setByteOrderMarks(org.apache.commons.io.ByteOrderMark... r1) {
                r0 = this;
                if (r1 == 0) goto L9
                java.lang.Object r1 = r1.clone()
                org.apache.commons.io.ByteOrderMark[] r1 = (org.apache.commons.io.ByteOrderMark[]) r1
                goto Lb
            L9:
                org.apache.commons.io.ByteOrderMark[] r1 = org.apache.commons.io.input.BOMInputStream.Builder.DEFAULT
            Lb:
                r0.byteOrderMarks = r1
                return r0
        }

        public org.apache.commons.io.input.BOMInputStream.Builder setInclude(boolean r1) {
                r0 = this;
                r0.include = r1
                return r0
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$64mWl-UIiUiclHFCX-dWE3UUsOk, reason: not valid java name */
    public static /* synthetic */ boolean m2603$r8$lambda$64mWlUIiUiclHFCXdWE3UUsOk(org.apache.commons.io.input.BOMInputStream r0, org.apache.commons.io.ByteOrderMark r1) {
            boolean r0 = r0.matches(r1)
            return r0
    }

    static {
            org.apache.commons.io.input.BOMInputStream$$ExternalSyntheticLambda1 r0 = new org.apache.commons.io.input.BOMInputStream$$ExternalSyntheticLambda1
            r0.<init>()
            java.util.Comparator r0 = java.util.Comparator.comparing(r0)
            java.util.Comparator r0 = r0.reversed()
            org.apache.commons.io.input.BOMInputStream.ByteOrderMarkLengthComparator = r0
            return
    }

    @java.lang.Deprecated
    public BOMInputStream(java.io.InputStream r3) {
            r2 = this;
            r0 = 0
            org.apache.commons.io.ByteOrderMark[] r1 = org.apache.commons.io.input.BOMInputStream.Builder.access$000()
            r2.<init>(r3, r0, r1)
            return
    }

    @java.lang.Deprecated
    public BOMInputStream(java.io.InputStream r2, boolean r3) {
            r1 = this;
            org.apache.commons.io.ByteOrderMark[] r0 = org.apache.commons.io.input.BOMInputStream.Builder.access$000()
            r1.<init>(r2, r3, r0)
            return
    }

    @java.lang.Deprecated
    public BOMInputStream(java.io.InputStream r1, boolean r2, org.apache.commons.io.ByteOrderMark... r3) {
            r0 = this;
            r0.<init>(r1)
            int r1 = org.apache.commons.io.IOUtils.length(r3)
            if (r1 == 0) goto L17
            r0.include = r2
            java.util.List r1 = java.util.Arrays.asList(r3)
            java.util.Comparator<org.apache.commons.io.ByteOrderMark> r2 = org.apache.commons.io.input.BOMInputStream.ByteOrderMarkLengthComparator
            r1.sort(r2)
            r0.boms = r1
            return
        L17:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "No BOMs specified"
            r1.<init>(r2)
            throw r1
    }

    @java.lang.Deprecated
    public BOMInputStream(java.io.InputStream r2, org.apache.commons.io.ByteOrderMark... r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r3)
            return
    }

    public static org.apache.commons.io.input.BOMInputStream.Builder builder() {
            org.apache.commons.io.input.BOMInputStream$Builder r0 = new org.apache.commons.io.input.BOMInputStream$Builder
            r0.<init>()
            return r0
    }

    private org.apache.commons.io.ByteOrderMark find() {
            r2 = this;
            java.util.List<org.apache.commons.io.ByteOrderMark> r0 = r2.boms
            java.util.stream.Stream r0 = r0.stream()
            org.apache.commons.io.input.BOMInputStream$$ExternalSyntheticLambda0 r1 = new org.apache.commons.io.input.BOMInputStream$$ExternalSyntheticLambda0
            r1.<init>(r2)
            java.util.stream.Stream r0 = r0.filter(r1)
            java.util.Optional r0 = r0.findFirst()
            r1 = 0
            java.lang.Object r0 = r0.orElse(r1)
            org.apache.commons.io.ByteOrderMark r0 = (org.apache.commons.io.ByteOrderMark) r0
            return r0
    }

    private boolean matches(org.apache.commons.io.ByteOrderMark r5) {
            r4 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r5.length()
            if (r1 >= r2) goto L16
            int r2 = r5.get(r1)
            int[] r3 = r4.firstBytes
            r3 = r3[r1]
            if (r2 == r3) goto L13
            return r0
        L13:
            int r1 = r1 + 1
            goto L2
        L16:
            r5 = 1
            return r5
    }

    private int readFirstBytes() throws java.io.IOException {
            r3 = this;
            r3.getBOM()
            int r0 = r3.fbIndex
            int r1 = r3.fbLength
            if (r0 >= r1) goto L12
            int[] r1 = r3.firstBytes
            int r2 = r0 + 1
            r3.fbIndex = r2
            r0 = r1[r0]
            goto L13
        L12:
            r0 = -1
        L13:
            return r0
    }

    public org.apache.commons.io.ByteOrderMark getBOM() throws java.io.IOException {
            r4 = this;
            int[] r0 = r4.firstBytes
            if (r0 != 0) goto L55
            r0 = 0
            r4.fbLength = r0
            java.util.List<org.apache.commons.io.ByteOrderMark> r1 = r4.boms
            java.lang.Object r1 = r1.get(r0)
            org.apache.commons.io.ByteOrderMark r1 = (org.apache.commons.io.ByteOrderMark) r1
            int r1 = r1.length()
            int[] r1 = new int[r1]
            r4.firstBytes = r1
            r1 = r0
        L18:
            int[] r2 = r4.firstBytes
            int r3 = r2.length
            if (r1 >= r3) goto L35
            java.io.InputStream r3 = r4.in
            int r3 = r3.read()
            r2[r1] = r3
            int r2 = r4.fbLength
            int r2 = r2 + 1
            r4.fbLength = r2
            int[] r2 = r4.firstBytes
            r2 = r2[r1]
            if (r2 >= 0) goto L32
            goto L35
        L32:
            int r1 = r1 + 1
            goto L18
        L35:
            org.apache.commons.io.ByteOrderMark r1 = r4.find()
            r4.byteOrderMark = r1
            if (r1 == 0) goto L55
            boolean r2 = r4.include
            if (r2 != 0) goto L55
            int r1 = r1.length()
            int[] r2 = r4.firstBytes
            int r2 = r2.length
            if (r1 >= r2) goto L53
            org.apache.commons.io.ByteOrderMark r0 = r4.byteOrderMark
            int r0 = r0.length()
            r4.fbIndex = r0
            goto L55
        L53:
            r4.fbLength = r0
        L55:
            org.apache.commons.io.ByteOrderMark r0 = r4.byteOrderMark
            return r0
    }

    public java.lang.String getBOMCharsetName() throws java.io.IOException {
            r1 = this;
            r1.getBOM()
            org.apache.commons.io.ByteOrderMark r0 = r1.byteOrderMark
            if (r0 != 0) goto L9
            r0 = 0
            goto Ld
        L9:
            java.lang.String r0 = r0.getCharsetName()
        Ld:
            return r0
    }

    public boolean hasBOM() throws java.io.IOException {
            r1 = this;
            org.apache.commons.io.ByteOrderMark r0 = r1.getBOM()
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean hasBOM(org.apache.commons.io.ByteOrderMark r4) throws java.io.IOException {
            r3 = this;
            java.util.List<org.apache.commons.io.ByteOrderMark> r0 = r3.boms
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L11
            org.apache.commons.io.ByteOrderMark r0 = r3.getBOM()
            boolean r4 = java.util.Objects.equals(r0, r4)
            return r4
        L11:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Stream not configured to detect "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int r2) {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.fbIndex     // Catch: java.lang.Throwable -> L15
            r1.markFbIndex = r0     // Catch: java.lang.Throwable -> L15
            int[] r0 = r1.firstBytes     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            r1.markedAtStart = r0     // Catch: java.lang.Throwable -> L15
            java.io.InputStream r0 = r1.in     // Catch: java.lang.Throwable -> L15
            r0.mark(r2)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r1)
            return
        L15:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            throw r2
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
            r1 = this;
            int r0 = r1.readFirstBytes()
            if (r0 < 0) goto L7
            goto Ld
        L7:
            java.io.InputStream r0 = r1.in
            int r0 = r0.read()
        Ld:
            return r0
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            int r3 = r2.read(r3, r0, r1)
            return r3
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r5, int r6, int r7) throws java.io.IOException {
            r4 = this;
            r0 = 0
            r1 = r0
        L2:
            if (r7 <= 0) goto L19
            if (r0 < 0) goto L19
            int r0 = r4.readFirstBytes()
            if (r0 < 0) goto L2
            int r2 = r6 + 1
            r3 = r0 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r5[r6] = r3
            int r7 = r7 + (-1)
            int r1 = r1 + 1
            r6 = r2
            goto L2
        L19:
            java.io.InputStream r0 = r4.in
            int r5 = r0.read(r5, r6, r7)
            if (r5 >= 0) goto L26
            if (r1 <= 0) goto L24
            goto L27
        L24:
            r1 = -1
            goto L27
        L26:
            int r1 = r1 + r5
        L27:
            return r1
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.markFbIndex     // Catch: java.lang.Throwable -> L13
            r1.fbIndex = r0     // Catch: java.lang.Throwable -> L13
            boolean r0 = r1.markedAtStart     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto Lc
            r0 = 0
            r1.firstBytes = r0     // Catch: java.lang.Throwable -> L13
        Lc:
            java.io.InputStream r0 = r1.in     // Catch: java.lang.Throwable -> L13
            r0.reset()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)
            return
        L13:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r0
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public long skip(long r5) throws java.io.IOException {
            r4 = this;
            r0 = 0
        L1:
            long r1 = (long) r0
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 <= 0) goto Lf
            int r3 = r4.readFirstBytes()
            if (r3 < 0) goto Lf
            int r0 = r0 + 1
            goto L1
        Lf:
            java.io.InputStream r0 = r4.in
            long r5 = r5 - r1
            long r5 = r0.skip(r5)
            long r5 = r5 + r1
            return r5
    }
}
