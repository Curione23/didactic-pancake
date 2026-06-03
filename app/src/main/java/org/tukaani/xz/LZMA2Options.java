package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
public final class LZMA2Options extends org.tukaani.xz.FilterOptions {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int DICT_SIZE_DEFAULT = 8388608;
    public static final int DICT_SIZE_MAX = 805306368;
    public static final int DICT_SIZE_MIN = 4096;
    public static final int LC_DEFAULT = 3;
    public static final int LC_LP_MAX = 4;
    public static final int LP_DEFAULT = 0;
    public static final int MF_BT4 = 20;
    public static final int MF_HC4 = 4;
    public static final int MODE_FAST = 1;
    public static final int MODE_NORMAL = 2;
    public static final int MODE_UNCOMPRESSED = 0;
    public static final int NICE_LEN_MAX = 273;
    public static final int NICE_LEN_MIN = 8;
    public static final int PB_DEFAULT = 2;
    public static final int PB_MAX = 4;
    public static final int PRESET_DEFAULT = 6;
    public static final int PRESET_MAX = 9;
    public static final int PRESET_MIN = 0;
    private static final int[] presetToDepthLimit = null;
    private static final int[] presetToDictSize = null;
    private int depthLimit;
    private int dictSize;
    private int lc;
    private int lp;
    private int mf;
    private int mode;
    private int niceLen;
    private int pb;
    private byte[] presetDict;

    static {
            r0 = 10
            int[] r0 = new int[r0]
            r0 = {x0018: FILL_ARRAY_DATA , data: [262144, 1048576, 2097152, 4194304, 4194304, 8388608, 8388608, 16777216, 33554432, 67108864} // fill-array
            org.tukaani.xz.LZMA2Options.presetToDictSize = r0
            r0 = 24
            r1 = 48
            r2 = 4
            r3 = 8
            int[] r0 = new int[]{r2, r3, r0, r1}
            org.tukaani.xz.LZMA2Options.presetToDepthLimit = r0
            return
    }

    public LZMA2Options() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.presetDict = r0
            r0 = 6
            r1.setPreset(r0)     // Catch: org.tukaani.xz.UnsupportedOptionsException -> Lb
            return
        Lb:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
    }

    public LZMA2Options(int r2) throws org.tukaani.xz.UnsupportedOptionsException {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.presetDict = r0
            r1.setPreset(r2)
            return
    }

    public LZMA2Options(int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) throws org.tukaani.xz.UnsupportedOptionsException {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.presetDict = r0
            r1.setDictSize(r2)
            r1.setLcLp(r3, r4)
            r1.setPb(r5)
            r1.setMode(r6)
            r1.setNiceLen(r7)
            r1.setMatchFinder(r8)
            r1.setDepthLimit(r9)
            return
    }

    public java.lang.Object clone() {
            r1 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L5
            return r0
        L5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
    }

    @Override // org.tukaani.xz.FilterOptions
    public int getDecoderMemoryUsage() {
            r2 = this;
            int r0 = r2.dictSize
            int r0 = r0 + (-1)
            int r1 = r0 >>> 2
            r0 = r0 | r1
            int r1 = r0 >>> 3
            r0 = r0 | r1
            int r1 = r0 >>> 4
            r0 = r0 | r1
            int r1 = r0 >>> 8
            r0 = r0 | r1
            int r1 = r0 >>> 16
            r0 = r0 | r1
            int r0 = r0 + 1
            int r0 = org.tukaani.xz.LZMA2InputStream.getMemoryUsage(r0)
            return r0
    }

    public int getDepthLimit() {
            r1 = this;
            int r0 = r1.depthLimit
            return r0
    }

    public int getDictSize() {
            r1 = this;
            int r0 = r1.dictSize
            return r0
    }

    @Override // org.tukaani.xz.FilterOptions
    public int getEncoderMemoryUsage() {
            r1 = this;
            int r0 = r1.mode
            if (r0 != 0) goto L9
            int r0 = org.tukaani.xz.UncompressedLZMA2OutputStream.getMemoryUsage()
            goto Ld
        L9:
            int r0 = org.tukaani.xz.LZMA2OutputStream.getMemoryUsage(r1)
        Ld:
            return r0
    }

    @Override // org.tukaani.xz.FilterOptions
    org.tukaani.xz.FilterEncoder getFilterEncoder() {
            r1 = this;
            org.tukaani.xz.LZMA2Encoder r0 = new org.tukaani.xz.LZMA2Encoder
            r0.<init>(r1)
            return r0
    }

    @Override // org.tukaani.xz.FilterOptions
    public java.io.InputStream getInputStream(java.io.InputStream r4, org.tukaani.xz.ArrayCache r5) throws java.io.IOException {
            r3 = this;
            org.tukaani.xz.LZMA2InputStream r0 = new org.tukaani.xz.LZMA2InputStream
            int r1 = r3.dictSize
            byte[] r2 = r3.presetDict
            r0.<init>(r4, r1, r2, r5)
            return r0
    }

    public int getLc() {
            r1 = this;
            int r0 = r1.lc
            return r0
    }

    public int getLp() {
            r1 = this;
            int r0 = r1.lp
            return r0
    }

    public int getMatchFinder() {
            r1 = this;
            int r0 = r1.mf
            return r0
    }

    public int getMode() {
            r1 = this;
            int r0 = r1.mode
            return r0
    }

    public int getNiceLen() {
            r1 = this;
            int r0 = r1.niceLen
            return r0
    }

    @Override // org.tukaani.xz.FilterOptions
    public org.tukaani.xz.FinishableOutputStream getOutputStream(org.tukaani.xz.FinishableOutputStream r2, org.tukaani.xz.ArrayCache r3) {
            r1 = this;
            int r0 = r1.mode
            if (r0 != 0) goto La
            org.tukaani.xz.UncompressedLZMA2OutputStream r0 = new org.tukaani.xz.UncompressedLZMA2OutputStream
            r0.<init>(r2, r3)
            return r0
        La:
            org.tukaani.xz.LZMA2OutputStream r0 = new org.tukaani.xz.LZMA2OutputStream
            r0.<init>(r2, r1, r3)
            return r0
    }

    public int getPb() {
            r1 = this;
            int r0 = r1.pb
            return r0
    }

    public byte[] getPresetDict() {
            r1 = this;
            byte[] r0 = r1.presetDict
            return r0
    }

    public void setDepthLimit(int r4) throws org.tukaani.xz.UnsupportedOptionsException {
            r3 = this;
            if (r4 < 0) goto L5
            r3.depthLimit = r4
            return
        L5:
            org.tukaani.xz.UnsupportedOptionsException r0 = new org.tukaani.xz.UnsupportedOptionsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Depth limit cannot be negative: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public void setDictSize(int r5) throws org.tukaani.xz.UnsupportedOptionsException {
            r4 = this;
            r0 = 4096(0x1000, float:5.74E-42)
            java.lang.String r1 = " B"
            if (r5 < r0) goto L26
            r0 = 805306368(0x30000000, float:4.656613E-10)
            if (r5 > r0) goto Ld
            r4.dictSize = r5
            return
        Ld:
            org.tukaani.xz.UnsupportedOptionsException r0 = new org.tukaani.xz.UnsupportedOptionsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "LZMA2 dictionary size must not exceed 768 MiB: "
            r2.<init>(r3)
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.StringBuilder r5 = r5.append(r1)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
        L26:
            org.tukaani.xz.UnsupportedOptionsException r0 = new org.tukaani.xz.UnsupportedOptionsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "LZMA2 dictionary size must be at least 4 KiB: "
            r2.<init>(r3)
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.StringBuilder r5 = r5.append(r1)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
    }

    public void setLc(int r2) throws org.tukaani.xz.UnsupportedOptionsException {
            r1 = this;
            int r0 = r1.lp
            r1.setLcLp(r2, r0)
            return
    }

    public void setLcLp(int r4, int r5) throws org.tukaani.xz.UnsupportedOptionsException {
            r3 = this;
            if (r4 < 0) goto L12
            if (r5 < 0) goto L12
            r0 = 4
            if (r4 > r0) goto L12
            if (r5 > r0) goto L12
            int r1 = r4 + r5
            if (r1 > r0) goto L12
            r3.lc = r4
            r3.lp = r5
            return
        L12:
            org.tukaani.xz.UnsupportedOptionsException r0 = new org.tukaani.xz.UnsupportedOptionsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "lc + lp must not exceed 4: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " + "
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public void setLp(int r2) throws org.tukaani.xz.UnsupportedOptionsException {
            r1 = this;
            int r0 = r1.lc
            r1.setLcLp(r0, r2)
            return
    }

    public void setMatchFinder(int r4) throws org.tukaani.xz.UnsupportedOptionsException {
            r3 = this;
            r0 = 4
            if (r4 == r0) goto L1d
            r0 = 20
            if (r4 != r0) goto L8
            goto L1d
        L8:
            org.tukaani.xz.UnsupportedOptionsException r0 = new org.tukaani.xz.UnsupportedOptionsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported match finder: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L1d:
            r3.mf = r4
            return
    }

    public void setMode(int r4) throws org.tukaani.xz.UnsupportedOptionsException {
            r3 = this;
            if (r4 < 0) goto L8
            r0 = 2
            if (r4 > r0) goto L8
            r3.mode = r4
            return
        L8:
            org.tukaani.xz.UnsupportedOptionsException r0 = new org.tukaani.xz.UnsupportedOptionsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported compression mode: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public void setNiceLen(int r4) throws org.tukaani.xz.UnsupportedOptionsException {
            r3 = this;
            r0 = 8
            if (r4 < r0) goto L20
            r0 = 273(0x111, float:3.83E-43)
            if (r4 > r0) goto Lb
            r3.niceLen = r4
            return
        Lb:
            org.tukaani.xz.UnsupportedOptionsException r0 = new org.tukaani.xz.UnsupportedOptionsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Maximum nice length of matches is 273: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L20:
            org.tukaani.xz.UnsupportedOptionsException r0 = new org.tukaani.xz.UnsupportedOptionsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Minimum nice length of matches is 8 bytes: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public void setPb(int r4) throws org.tukaani.xz.UnsupportedOptionsException {
            r3 = this;
            if (r4 < 0) goto L8
            r0 = 4
            if (r4 > r0) goto L8
            r3.pb = r4
            return
        L8:
            org.tukaani.xz.UnsupportedOptionsException r0 = new org.tukaani.xz.UnsupportedOptionsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "pb must not exceed 4: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public void setPreset(int r5) throws org.tukaani.xz.UnsupportedOptionsException {
            r4 = this;
            if (r5 < 0) goto L45
            r0 = 9
            if (r5 > r0) goto L45
            r0 = 3
            r4.lc = r0
            r1 = 0
            r4.lp = r1
            r2 = 2
            r4.pb = r2
            int[] r3 = org.tukaani.xz.LZMA2Options.presetToDictSize
            r3 = r3[r5]
            r4.dictSize = r3
            r3 = 4
            if (r5 > r0) goto L2d
            r0 = 1
            r4.mode = r0
            r4.mf = r3
            if (r5 > r0) goto L22
            r0 = 128(0x80, float:1.8E-43)
            goto L24
        L22:
            r0 = 273(0x111, float:3.83E-43)
        L24:
            r4.niceLen = r0
            int[] r0 = org.tukaani.xz.LZMA2Options.presetToDepthLimit
            r5 = r0[r5]
            r4.depthLimit = r5
            goto L44
        L2d:
            r4.mode = r2
            r0 = 20
            r4.mf = r0
            if (r5 != r3) goto L38
            r5 = 16
            goto L40
        L38:
            r0 = 5
            if (r5 != r0) goto L3e
            r5 = 32
            goto L40
        L3e:
            r5 = 64
        L40:
            r4.niceLen = r5
            r4.depthLimit = r1
        L44:
            return
        L45:
            org.tukaani.xz.UnsupportedOptionsException r0 = new org.tukaani.xz.UnsupportedOptionsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported preset: "
            r1.<init>(r2)
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
    }

    public void setPresetDict(byte[] r1) {
            r0 = this;
            r0.presetDict = r1
            return
    }
}
