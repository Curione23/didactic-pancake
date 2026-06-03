package org.apache.commons.compress.utils;

/* JADX INFO: loaded from: classes2.dex */
public class ArchiveUtils {
    private static final int MAX_SANITIZED_NAME_LENGTH = 255;

    private ArchiveUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isArrayZero(byte[] r3, int r4) {
            r0 = 0
            r1 = r0
        L2:
            if (r1 >= r4) goto Lc
            r2 = r3[r1]
            if (r2 == 0) goto L9
            return r0
        L9:
            int r1 = r1 + 1
            goto L2
        Lc:
            r3 = 1
            return r3
    }

    public static boolean isEqual(byte[] r7, int r8, int r9, byte[] r10, int r11, int r12) {
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            boolean r7 = isEqual(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static boolean isEqual(byte[] r5, int r6, int r7, byte[] r8, int r9, int r10, boolean r11) {
            int r0 = java.lang.Math.min(r7, r10)
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L16
            int r3 = r6 + r2
            r3 = r5[r3]
            int r4 = r9 + r2
            r4 = r8[r4]
            if (r3 == r4) goto L13
            return r1
        L13:
            int r2 = r2 + 1
            goto L6
        L16:
            r0 = 1
            if (r7 != r10) goto L1a
            return r0
        L1a:
            if (r11 == 0) goto L37
            if (r7 <= r10) goto L2a
        L1e:
            if (r10 >= r7) goto L36
            int r8 = r6 + r10
            r8 = r5[r8]
            if (r8 == 0) goto L27
            return r1
        L27:
            int r10 = r10 + 1
            goto L1e
        L2a:
            if (r7 >= r10) goto L36
            int r5 = r9 + r7
            r5 = r8[r5]
            if (r5 == 0) goto L33
            return r1
        L33:
            int r7 = r7 + 1
            goto L2a
        L36:
            return r0
        L37:
            return r1
    }

    @java.lang.Deprecated
    public static boolean isEqual(byte[] r0, byte[] r1) {
            boolean r0 = java.util.Arrays.equals(r0, r1)
            return r0
    }

    public static boolean isEqual(byte[] r7, byte[] r8, boolean r9) {
            int r2 = r7.length
            r4 = 0
            int r5 = r8.length
            r1 = 0
            r0 = r7
            r3 = r8
            r6 = r9
            boolean r7 = isEqual(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static boolean isEqualWithNull(byte[] r7, int r8, int r9, byte[] r10, int r11, int r12) {
            r6 = 1
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            boolean r7 = isEqual(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static boolean matchAsciiBuffer(java.lang.String r2, byte[] r3) {
            r0 = 0
            int r1 = r3.length
            boolean r2 = matchAsciiBuffer(r2, r3, r0, r1)
            return r2
    }

    public static boolean matchAsciiBuffer(java.lang.String r8, byte[] r9, int r10, int r11) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            byte[] r1 = r8.getBytes(r0)
            int r3 = r1.length
            r7 = 0
            r2 = 0
            r4 = r9
            r5 = r10
            r6 = r11
            boolean r8 = isEqual(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static java.lang.String sanitize(java.lang.String r6) {
            char[] r6 = r6.toCharArray()
            int r0 = r6.length
            r1 = 255(0xff, float:3.57E-43)
            if (r0 > r1) goto Lb
            r0 = r6
            goto Lf
        Lb:
            char[] r0 = java.util.Arrays.copyOf(r6, r1)
        Lf:
            int r6 = r6.length
            if (r6 <= r1) goto L19
            r6 = 252(0xfc, float:3.53E-43)
            r2 = 46
            java.util.Arrays.fill(r0, r6, r1, r2)
        L19:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r1 = r0.length
            r2 = 0
        L20:
            if (r2 >= r1) goto L40
            char r3 = r0[r2]
            boolean r4 = java.lang.Character.isISOControl(r3)
            if (r4 != 0) goto L38
            java.lang.Character$UnicodeBlock r4 = java.lang.Character.UnicodeBlock.of(r3)
            if (r4 == 0) goto L38
            java.lang.Character$UnicodeBlock r5 = java.lang.Character.UnicodeBlock.SPECIALS
            if (r4 == r5) goto L38
            r6.append(r3)
            goto L3d
        L38:
            r3 = 63
            r6.append(r3)
        L3d:
            int r2 = r2 + 1
            goto L20
        L40:
            java.lang.String r6 = r6.toString()
            return r6
    }

    public static byte[] toAsciiBytes(java.lang.String r1) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            byte[] r1 = r1.getBytes(r0)
            return r1
    }

    public static java.lang.String toAsciiString(byte[] r2) {
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.US_ASCII
            r0.<init>(r2, r1)
            return r0
    }

    public static java.lang.String toAsciiString(byte[] r2, int r3, int r4) {
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.US_ASCII
            r0.<init>(r2, r3, r4, r1)
            return r0
    }

    public static java.lang.String toString(org.apache.commons.compress.archivers.ArchiveEntry r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r5.isDirectory()
            if (r1 == 0) goto Le
            r1 = 100
            goto L10
        Le:
            r1 = 45
        L10:
            r0.append(r1)
            long r1 = r5.getSize()
            java.lang.String r1 = java.lang.Long.toString(r1)
            r2 = 32
            r0.append(r2)
            r3 = 7
        L21:
            int r4 = r1.length()
            if (r3 <= r4) goto L2d
            r0.append(r2)
            int r3 = r3 + (-1)
            goto L21
        L2d:
            r0.append(r1)
            java.lang.StringBuilder r1 = r0.append(r2)
            java.lang.String r5 = r5.getName()
            r1.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
