package androidx.browser.trusted;

/* JADX INFO: loaded from: classes.dex */
final class TokenContents {
    private final byte[] mContents;
    private java.util.List<byte[]> mFingerprints;
    private java.lang.String mPackageName;

    public static /* synthetic */ int $r8$lambda$CBVg26zUpxC1pz1KzAQxDAVlyy0(byte[] r0, byte[] r1) {
            int r0 = compareByteArrays(r0, r1)
            return r0
    }

    private TokenContents(byte[] r1) {
            r0 = this;
            r0.<init>()
            r0.mContents = r1
            return
    }

    private TokenContents(byte[] r2, java.lang.String r3, java.util.List<byte[]> r4) {
            r1 = this;
            r1.<init>()
            r1.mContents = r2
            r1.mPackageName = r3
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r4.size()
            r2.<init>(r3)
            r1.mFingerprints = r2
            java.util.Iterator r2 = r4.iterator()
        L16:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r2.next()
            byte[] r3 = (byte[]) r3
            java.util.List<byte[]> r4 = r1.mFingerprints
            int r0 = r3.length
            byte[] r3 = java.util.Arrays.copyOf(r3, r0)
            r4.add(r3)
            goto L16
        L2d:
            return
    }

    private static int compareByteArrays(byte[] r4, byte[] r5) {
            r0 = 0
            if (r4 != r5) goto L4
            return r0
        L4:
            if (r4 != 0) goto L8
            r4 = -1
            return r4
        L8:
            if (r5 != 0) goto Lc
            r4 = 1
            return r4
        Lc:
            r1 = r0
        Ld:
            int r2 = r4.length
            int r3 = r5.length
            int r2 = java.lang.Math.min(r2, r3)
            if (r1 >= r2) goto L20
            r2 = r4[r1]
            r3 = r5[r1]
            if (r2 == r3) goto L1d
            int r2 = r2 - r3
            return r2
        L1d:
            int r1 = r1 + 1
            goto Ld
        L20:
            int r1 = r4.length
            int r2 = r5.length
            if (r1 == r2) goto L28
            int r4 = r4.length
            int r5 = r5.length
            int r4 = r4 - r5
            return r4
        L28:
            return r0
    }

    static androidx.browser.trusted.TokenContents create(java.lang.String r2, java.util.List<byte[]> r3) throws java.io.IOException {
            androidx.browser.trusted.TokenContents r0 = new androidx.browser.trusted.TokenContents
            byte[] r1 = createToken(r2, r3)
            r0.<init>(r1, r2, r3)
            return r0
    }

    private static byte[] createToken(java.lang.String r3, java.util.List<byte[]> r4) throws java.io.IOException {
            androidx.browser.trusted.TokenContents$$ExternalSyntheticLambda0 r0 = new androidx.browser.trusted.TokenContents$$ExternalSyntheticLambda0
            r0.<init>()
            java.util.Collections.sort(r4, r0)
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.DataOutputStream r1 = new java.io.DataOutputStream
            r1.<init>(r0)
            r1.writeUTF(r3)
            int r3 = r4.size()
            r1.writeInt(r3)
            java.util.Iterator r3 = r4.iterator()
        L20:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L34
            java.lang.Object r4 = r3.next()
            byte[] r4 = (byte[]) r4
            int r2 = r4.length
            r1.writeInt(r2)
            r1.write(r4)
            goto L20
        L34:
            r1.flush()
            byte[] r3 = r0.toByteArray()
            return r3
    }

    static androidx.browser.trusted.TokenContents deserialize(byte[] r1) {
            androidx.browser.trusted.TokenContents r0 = new androidx.browser.trusted.TokenContents
            r0.<init>(r1)
            return r0
    }

    private void parseIfNeeded() throws java.io.IOException {
            r6 = this;
            java.lang.String r0 = r6.mPackageName
            if (r0 == 0) goto L5
            return
        L5:
            java.io.DataInputStream r0 = new java.io.DataInputStream
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            byte[] r2 = r6.mContents
            r1.<init>(r2)
            r0.<init>(r1)
            java.lang.String r1 = r0.readUTF()
            r6.mPackageName = r1
            int r1 = r0.readInt()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            r6.mFingerprints = r2
            r2 = 0
        L23:
            if (r2 >= r1) goto L41
            int r3 = r0.readInt()
            byte[] r4 = new byte[r3]
            int r5 = r0.read(r4)
            if (r5 != r3) goto L39
            java.util.List<byte[]> r3 = r6.mFingerprints
            r3.add(r4)
            int r2 = r2 + 1
            goto L23
        L39:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Could not read fingerprint"
            r0.<init>(r1)
            throw r0
        L41:
            return
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1c
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto L11
            goto L1c
        L11:
            androidx.browser.trusted.TokenContents r3 = (androidx.browser.trusted.TokenContents) r3
            byte[] r0 = r2.mContents
            byte[] r3 = r3.mContents
            boolean r3 = java.util.Arrays.equals(r0, r3)
            return r3
        L1c:
            r3 = 0
            return r3
    }

    public byte[] getFingerprint(int r3) throws java.io.IOException {
            r2 = this;
            r2.parseIfNeeded()
            java.util.List<byte[]> r0 = r2.mFingerprints
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r0.get(r3)
            byte[] r0 = (byte[]) r0
            java.util.List<byte[]> r1 = r2.mFingerprints
            java.lang.Object r3 = r1.get(r3)
            byte[] r3 = (byte[]) r3
            int r3 = r3.length
            byte[] r3 = java.util.Arrays.copyOf(r0, r3)
            return r3
        L1b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
    }

    public int getFingerprintCount() throws java.io.IOException {
            r1 = this;
            r1.parseIfNeeded()
            java.util.List<byte[]> r0 = r1.mFingerprints
            if (r0 == 0) goto Lc
            int r0 = r0.size()
            return r0
        Lc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    public java.lang.String getPackageName() throws java.io.IOException {
            r1 = this;
            r1.parseIfNeeded()
            java.lang.String r0 = r1.mPackageName
            if (r0 == 0) goto L8
            return r0
        L8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    public int hashCode() {
            r1 = this;
            byte[] r0 = r1.mContents
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    public byte[] serialize() {
            r2 = this;
            byte[] r0 = r2.mContents
            int r1 = r0.length
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            return r0
    }
}
