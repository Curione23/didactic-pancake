package org.apache.commons.io;

/* JADX INFO: loaded from: classes2.dex */
public class HexDump {

    @java.lang.Deprecated
    public static final java.lang.String EOL = null;
    private static final char[] HEX_CODES = null;
    private static final int[] SHIFTS = null;

    static {
            java.lang.String r0 = java.lang.System.lineSeparator()
            org.apache.commons.io.HexDump.EOL = r0
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x001a: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
            org.apache.commons.io.HexDump.HEX_CODES = r0
            r0 = 8
            int[] r0 = new int[r0]
            r0 = {x002e: FILL_ARRAY_DATA , data: [28, 24, 20, 16, 12, 8, 4, 0} // fill-array
            org.apache.commons.io.HexDump.SHIFTS = r0
            return
    }

    public HexDump() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.StringBuilder dump(java.lang.StringBuilder r4, byte r5) {
            r0 = 0
        L1:
            r1 = 2
            if (r0 >= r1) goto L18
            char[] r1 = org.apache.commons.io.HexDump.HEX_CODES
            int[] r2 = org.apache.commons.io.HexDump.SHIFTS
            int r3 = r0 + 6
            r2 = r2[r3]
            int r2 = r5 >> r2
            r2 = r2 & 15
            char r1 = r1[r2]
            r4.append(r1)
            int r0 = r0 + 1
            goto L1
        L18:
            return r4
    }

    private static java.lang.StringBuilder dump(java.lang.StringBuilder r4, long r5) {
            r0 = 0
        L1:
            r1 = 8
            if (r0 >= r1) goto L18
            char[] r1 = org.apache.commons.io.HexDump.HEX_CODES
            int[] r2 = org.apache.commons.io.HexDump.SHIFTS
            r2 = r2[r0]
            long r2 = r5 >> r2
            int r2 = (int) r2
            r2 = r2 & 15
            char r1 = r1[r2]
            r4.append(r1)
            int r0 = r0 + 1
            goto L1
        L18:
            return r4
    }

    public static void dump(byte[] r7, long r8, java.io.OutputStream r10, int r11) throws java.io.IOException, java.lang.ArrayIndexOutOfBoundsException {
            java.lang.String r0 = "stream"
            java.util.Objects.requireNonNull(r10, r0)
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
            org.apache.commons.io.output.CloseShieldOutputStream r10 = org.apache.commons.io.output.CloseShieldOutputStream.wrap(r10)
            java.nio.charset.Charset r1 = java.nio.charset.Charset.defaultCharset()
            r0.<init>(r10, r1)
            int r10 = r7.length     // Catch: java.lang.Throwable -> L20
            int r6 = r10 - r11
            r1 = r7
            r2 = r8
            r4 = r0
            r5 = r11
            dump(r1, r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L20
            r0.close()
            return
        L20:
            r7 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L25
            goto L29
        L25:
            r8 = move-exception
            r7.addSuppressed(r8)
        L29:
            throw r7
    }

    public static void dump(byte[] r7, long r8, java.lang.Appendable r10, int r11, int r12) throws java.io.IOException, java.lang.ArrayIndexOutOfBoundsException {
            java.lang.String r0 = "appendable"
            java.util.Objects.requireNonNull(r10, r0)
            if (r11 < 0) goto L8f
            int r0 = r7.length
            if (r11 >= r0) goto L8f
            long r0 = (long) r11
            long r8 = r8 + r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 74
            r0.<init>(r1)
            if (r12 < 0) goto L72
            int r1 = r11 + r12
            int r2 = r7.length
            if (r1 > r2) goto L72
        L1a:
            if (r11 >= r1) goto L71
            int r12 = r1 - r11
            r2 = 16
            if (r12 <= r2) goto L23
            r12 = r2
        L23:
            java.lang.StringBuilder r3 = dump(r0, r8)
            r4 = 32
            r3.append(r4)
            r3 = 0
            r5 = r3
        L2e:
            if (r5 >= r2) goto L45
            if (r5 >= r12) goto L3a
            int r6 = r5 + r11
            r6 = r7[r6]
            dump(r0, r6)
            goto L3f
        L3a:
            java.lang.String r6 = "  "
            r0.append(r6)
        L3f:
            r0.append(r4)
            int r5 = r5 + 1
            goto L2e
        L45:
            r2 = r3
        L46:
            if (r2 >= r12) goto L5f
            int r5 = r2 + r11
            r5 = r7[r5]
            if (r5 < r4) goto L57
            r6 = 127(0x7f, float:1.78E-43)
            if (r5 >= r6) goto L57
            char r5 = (char) r5
            r0.append(r5)
            goto L5c
        L57:
            r5 = 46
            r0.append(r5)
        L5c:
            int r2 = r2 + 1
            goto L46
        L5f:
            java.lang.String r2 = java.lang.System.lineSeparator()
            r0.append(r2)
            r10.append(r0)
            r0.setLength(r3)
            long r2 = (long) r12
            long r8 = r8 + r2
            int r11 = r11 + 16
            goto L1a
        L71:
            return
        L72:
            java.lang.ArrayIndexOutOfBoundsException r8 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.Integer r9 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            int r7 = r7.length
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r7 = new java.lang.Object[]{r9, r10, r7}
            java.lang.String r9 = "Range [%s, %<s + %s) out of bounds for length %s"
            java.lang.String r7 = java.lang.String.format(r9, r7)
            r8.<init>(r7)
            throw r8
        L8f:
            java.lang.ArrayIndexOutOfBoundsException r8 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "illegal index: "
            r9.<init>(r10)
            java.lang.StringBuilder r9 = r9.append(r11)
            java.lang.String r10 = " into array of length "
            java.lang.StringBuilder r9 = r9.append(r10)
            int r7 = r7.length
            java.lang.StringBuilder r7 = r9.append(r7)
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
    }

    public static void dump(byte[] r6, java.lang.Appendable r7) throws java.io.IOException {
            r4 = 0
            int r5 = r6.length
            r1 = 0
            r0 = r6
            r3 = r7
            dump(r0, r1, r3, r4, r5)
            return
    }
}
