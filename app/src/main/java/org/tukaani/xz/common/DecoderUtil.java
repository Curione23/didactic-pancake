package org.tukaani.xz.common;

/* JADX INFO: loaded from: classes2.dex */
public class DecoderUtil extends org.tukaani.xz.common.Util {
    public DecoderUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean areStreamFlagsEqual(org.tukaani.xz.common.StreamFlags r0, org.tukaani.xz.common.StreamFlags r1) {
            int r0 = r0.checkType
            int r1 = r1.checkType
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    private static org.tukaani.xz.common.StreamFlags decodeStreamFlags(byte[] r2, int r3) throws org.tukaani.xz.UnsupportedOptionsException {
            r0 = r2[r3]
            if (r0 != 0) goto L18
            int r3 = r3 + 1
            r0 = r2[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 16
            if (r0 >= r1) goto L18
            org.tukaani.xz.common.StreamFlags r0 = new org.tukaani.xz.common.StreamFlags
            r0.<init>()
            r2 = r2[r3]
            r0.checkType = r2
            return r0
        L18:
            org.tukaani.xz.UnsupportedOptionsException r2 = new org.tukaani.xz.UnsupportedOptionsException
            r2.<init>()
            throw r2
    }

    public static org.tukaani.xz.common.StreamFlags decodeStreamFooter(byte[] r7) throws java.io.IOException {
            r0 = 10
            r0 = r7[r0]
            byte[] r1 = org.tukaani.xz.XZ.FOOTER_MAGIC
            r2 = 0
            r1 = r1[r2]
            java.lang.String r3 = "XZ Stream Footer is corrupt"
            if (r0 != r1) goto L57
            r0 = 11
            r0 = r7[r0]
            byte[] r1 = org.tukaani.xz.XZ.FOOTER_MAGIC
            r4 = 1
            r1 = r1[r4]
            if (r0 != r1) goto L57
            r0 = 6
            r1 = 4
            boolean r0 = isCRC32Valid(r7, r1, r0, r2)
            if (r0 == 0) goto L51
            r0 = 8
            org.tukaani.xz.common.StreamFlags r0 = decodeStreamFlags(r7, r0)     // Catch: org.tukaani.xz.UnsupportedOptionsException -> L49
            r3 = 0
            r0.backwardSize = r3
        L2a:
            if (r2 >= r1) goto L3e
            long r3 = r0.backwardSize
            int r5 = r2 + 4
            r5 = r7[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r6 = r2 * 8
            int r5 = r5 << r6
            long r5 = (long) r5
            long r3 = r3 | r5
            r0.backwardSize = r3
            int r2 = r2 + 1
            goto L2a
        L3e:
            long r1 = r0.backwardSize
            r3 = 1
            long r1 = r1 + r3
            r3 = 4
            long r1 = r1 * r3
            r0.backwardSize = r1
            return r0
        L49:
            org.tukaani.xz.UnsupportedOptionsException r7 = new org.tukaani.xz.UnsupportedOptionsException
            java.lang.String r0 = "Unsupported options in XZ Stream Footer"
            r7.<init>(r0)
            throw r7
        L51:
            org.tukaani.xz.CorruptedInputException r7 = new org.tukaani.xz.CorruptedInputException
            r7.<init>(r3)
            throw r7
        L57:
            org.tukaani.xz.CorruptedInputException r7 = new org.tukaani.xz.CorruptedInputException
            r7.<init>(r3)
            throw r7
    }

    public static org.tukaani.xz.common.StreamFlags decodeStreamHeader(byte[] r3) throws java.io.IOException {
            r0 = 0
        L1:
            byte[] r1 = org.tukaani.xz.XZ.HEADER_MAGIC
            int r1 = r1.length
            if (r0 >= r1) goto L17
            r1 = r3[r0]
            byte[] r2 = org.tukaani.xz.XZ.HEADER_MAGIC
            r2 = r2[r0]
            if (r1 != r2) goto L11
            int r0 = r0 + 1
            goto L1
        L11:
            org.tukaani.xz.XZFormatException r3 = new org.tukaani.xz.XZFormatException
            r3.<init>()
            throw r3
        L17:
            byte[] r0 = org.tukaani.xz.XZ.HEADER_MAGIC
            int r0 = r0.length
            byte[] r1 = org.tukaani.xz.XZ.HEADER_MAGIC
            int r1 = r1.length
            r2 = 2
            int r1 = r1 + r2
            boolean r0 = isCRC32Valid(r3, r0, r2, r1)
            if (r0 == 0) goto L35
            byte[] r0 = org.tukaani.xz.XZ.HEADER_MAGIC     // Catch: org.tukaani.xz.UnsupportedOptionsException -> L2d
            int r0 = r0.length     // Catch: org.tukaani.xz.UnsupportedOptionsException -> L2d
            org.tukaani.xz.common.StreamFlags r3 = decodeStreamFlags(r3, r0)     // Catch: org.tukaani.xz.UnsupportedOptionsException -> L2d
            return r3
        L2d:
            org.tukaani.xz.UnsupportedOptionsException r3 = new org.tukaani.xz.UnsupportedOptionsException
            java.lang.String r0 = "Unsupported options in XZ Stream Header"
            r3.<init>(r0)
            throw r3
        L35:
            org.tukaani.xz.CorruptedInputException r3 = new org.tukaani.xz.CorruptedInputException
            java.lang.String r0 = "XZ Stream Header is corrupt"
            r3.<init>(r0)
            throw r3
    }

    public static long decodeVLI(java.io.InputStream r8) throws java.io.IOException {
            int r0 = r8.read()
            r1 = -1
            if (r0 == r1) goto L38
            r2 = r0 & 127(0x7f, float:1.78E-43)
            long r2 = (long) r2
            r4 = 0
        Lb:
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L37
            int r4 = r4 + 1
            r0 = 9
            if (r4 >= r0) goto L31
            int r0 = r8.read()
            if (r0 == r1) goto L2b
            if (r0 == 0) goto L25
            r5 = r0 & 127(0x7f, float:1.78E-43)
            long r5 = (long) r5
            int r7 = r4 * 7
            long r5 = r5 << r7
            long r2 = r2 | r5
            goto Lb
        L25:
            org.tukaani.xz.CorruptedInputException r8 = new org.tukaani.xz.CorruptedInputException
            r8.<init>()
            throw r8
        L2b:
            java.io.EOFException r8 = new java.io.EOFException
            r8.<init>()
            throw r8
        L31:
            org.tukaani.xz.CorruptedInputException r8 = new org.tukaani.xz.CorruptedInputException
            r8.<init>()
            throw r8
        L37:
            return r2
        L38:
            java.io.EOFException r8 = new java.io.EOFException
            r8.<init>()
            throw r8
    }

    public static boolean isCRC32Valid(byte[] r4, int r5, int r6, int r7) {
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32
            r0.<init>()
            r0.update(r4, r5, r6)
            long r5 = r0.getValue()
            r0 = 0
            r1 = r0
        Le:
            r2 = 4
            if (r1 >= r2) goto L21
            int r2 = r1 * 8
            long r2 = r5 >>> r2
            int r2 = (int) r2
            byte r2 = (byte) r2
            int r3 = r7 + r1
            r3 = r4[r3]
            if (r2 == r3) goto L1e
            return r0
        L1e:
            int r1 = r1 + 1
            goto Le
        L21:
            r4 = 1
            return r4
    }
}
