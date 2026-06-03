package org.apache.commons.compress.harmony.unpack200;

/* JADX INFO: loaded from: classes2.dex */
public final class SegmentUtils {
    public SegmentUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int countArgs(java.lang.String r1) {
            r0 = 1
            int r1 = countArgs(r1, r0)
            return r1
    }

    protected static int countArgs(java.lang.String r9, int r10) {
            r0 = 40
            int r0 = r9.indexOf(r0)
            r1 = 41
            int r1 = r9.indexOf(r1)
            r2 = -1
            if (r0 == r2) goto L52
            if (r1 == r2) goto L52
            if (r1 < r0) goto L52
            r2 = 1
            int r0 = r0 + r2
            r3 = 0
            r4 = r3
            r5 = r4
            r6 = r5
        L19:
            if (r0 >= r1) goto L51
            char r7 = r9.charAt(r0)
            if (r5 == 0) goto L28
            r8 = 59
            if (r7 != r8) goto L28
            r5 = r3
            r6 = r5
            goto L4e
        L28:
            if (r5 != 0) goto L32
            r8 = 76
            if (r7 != r8) goto L32
            int r4 = r4 + 1
            r5 = r2
            goto L4e
        L32:
            r8 = 91
            if (r7 != r8) goto L38
            r6 = r2
            goto L4e
        L38:
            if (r5 == 0) goto L3b
            goto L4e
        L3b:
            if (r6 == 0) goto L41
            int r4 = r4 + 1
            r6 = r3
            goto L4e
        L41:
            r8 = 68
            if (r7 == r8) goto L4d
            r8 = 74
            if (r7 != r8) goto L4a
            goto L4d
        L4a:
            int r4 = r4 + 1
            goto L4e
        L4d:
            int r4 = r4 + r10
        L4e:
            int r0 = r0 + 1
            goto L19
        L51:
            return r4
        L52:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "No arguments"
            r9.<init>(r10)
            throw r9
    }

    public static int countBit16(int[] r5) {
            int r0 = r5.length
            r1 = 0
            r2 = r1
        L3:
            if (r1 >= r0) goto L11
            r3 = r5[r1]
            r4 = 65536(0x10000, float:9.1835E-41)
            r3 = r3 & r4
            if (r3 == 0) goto Le
            int r2 = r2 + 1
        Le:
            int r1 = r1 + 1
            goto L3
        L11:
            return r2
    }

    public static int countBit16(long[] r7) {
            int r0 = r7.length
            r1 = 0
            r2 = r1
        L3:
            if (r1 >= r0) goto L16
            r3 = r7[r1]
            r5 = 65536(0x10000, double:3.2379E-319)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L13
            int r2 = r2 + 1
        L13:
            int r1 = r1 + 1
            goto L3
        L16:
            return r2
    }

    public static int countBit16(long[][] r11) {
            int r0 = r11.length
            r1 = 0
            r2 = r1
            r3 = r2
        L4:
            if (r2 >= r0) goto L20
            r4 = r11[r2]
            int r5 = r4.length
            r6 = r1
        La:
            if (r6 >= r5) goto L1d
            r7 = r4[r6]
            r9 = 65536(0x10000, double:3.2379E-319)
            long r7 = r7 & r9
            r9 = 0
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L1a
            int r3 = r3 + 1
        L1a:
            int r6 = r6 + 1
            goto La
        L1d:
            int r2 = r2 + 1
            goto L4
        L20:
            return r3
    }

    public static int countInvokeInterfaceArgs(java.lang.String r1) {
            r0 = 2
            int r1 = countArgs(r1, r0)
            return r1
    }

    public static int countMatches(long[] r5, org.apache.commons.compress.harmony.unpack200.IMatcher r6) {
            int r0 = r5.length
            r1 = 0
            r2 = r1
        L3:
            if (r1 >= r0) goto L12
            r3 = r5[r1]
            boolean r3 = r6.matches(r3)
            if (r3 == 0) goto Lf
            int r2 = r2 + 1
        Lf:
            int r1 = r1 + 1
            goto L3
        L12:
            return r2
    }

    public static int countMatches(long[][] r4, org.apache.commons.compress.harmony.unpack200.IMatcher r5) {
            int r0 = r4.length
            r1 = 0
            r2 = r1
        L3:
            if (r1 >= r0) goto Lf
            r3 = r4[r1]
            int r3 = countMatches(r3, r5)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L3
        Lf:
            return r2
    }
}
