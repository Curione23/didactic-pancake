package org.apache.commons.compress.harmony.unpack200;

/* JADX INFO: loaded from: classes2.dex */
public class SegmentOptions {
    private static final int DEFLATE_HINT = 32;
    private static final int HAVE_ALL_CODE_FLAGS = 4;
    private static final int HAVE_CLASS_FLAGS_HI = 512;
    private static final int HAVE_CODE_FLAGS_HI = 1024;
    private static final int HAVE_CP_NUMBERS = 2;
    private static final int HAVE_FIELD_FLAGS_HI = 1024;
    private static final int HAVE_FILE_HEADERS = 16;
    private static final int HAVE_FILE_MODTIME = 64;
    private static final int HAVE_FILE_OPTIONS = 128;
    private static final int HAVE_FILE_SIZE_HI = 256;
    private static final int HAVE_METHOD_FLAGS_HI = 2048;
    private static final int HAVE_SPECIAL_FORMATS = 1;
    private static final int UNUSED = -8184;
    private final int options;

    public SegmentOptions(int r2) throws org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r1 = this;
            r1.<init>()
            r0 = r2 & (-8184(0xffffffffffffe008, float:NaN))
            if (r0 != 0) goto La
            r1.options = r2
            return
        La:
            org.apache.commons.compress.harmony.pack200.Pack200Exception r2 = new org.apache.commons.compress.harmony.pack200.Pack200Exception
            java.lang.String r0 = "Some unused flags are non-zero"
            r2.<init>(r0)
            throw r2
    }

    public boolean hasAllCodeFlags() {
            r1 = this;
            int r0 = r1.options
            r0 = r0 & 4
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean hasArchiveFileCounts() {
            r1 = this;
            int r0 = r1.options
            r0 = r0 & 16
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean hasCPNumberCounts() {
            r1 = this;
            int r0 = r1.options
            r0 = r0 & 2
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean hasClassFlagsHi() {
            r1 = this;
            int r0 = r1.options
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean hasCodeFlagsHi() {
            r1 = this;
            int r0 = r1.options
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean hasFieldFlagsHi() {
            r1 = this;
            int r0 = r1.options
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean hasFileModtime() {
            r1 = this;
            int r0 = r1.options
            r0 = r0 & 64
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean hasFileOptions() {
            r1 = this;
            int r0 = r1.options
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean hasFileSizeHi() {
            r1 = this;
            int r0 = r1.options
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean hasMethodFlagsHi() {
            r1 = this;
            int r0 = r1.options
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean hasSpecialFormats() {
            r2 = this;
            int r0 = r2.options
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L7
            goto L8
        L7:
            r1 = 0
        L8:
            return r1
    }

    public boolean shouldDeflate() {
            r1 = this;
            int r0 = r1.options
            r0 = r0 & 32
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }
}
