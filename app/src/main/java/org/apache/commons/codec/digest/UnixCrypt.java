package org.apache.commons.codec.digest;

/* JADX INFO: loaded from: classes2.dex */
public class UnixCrypt {
    private static final int[] CON_SALT = null;
    private static final int[] COV2CHAR = null;
    private static final java.util.regex.Pattern CRYPT_SALT_PATTERN = null;
    private static final java.lang.String CRYPT_SALT_REGEX = "^[./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz]{2,}$";
    private static final char[] SALT_CHARS = null;
    private static final boolean[] SHIFT2 = null;
    private static final int[][] SKB = null;
    private static final int[][] SPTRANS = null;

    static {
            java.lang.String r0 = "^[./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz]{2,}$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            org.apache.commons.codec.digest.UnixCrypt.CRYPT_SALT_PATTERN = r0
            r0 = 128(0x80, float:1.8E-43)
            int[] r0 = new int[r0]
            r0 = {x0088: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 0, 0, 0, 0, 0} // fill-array
            org.apache.commons.codec.digest.UnixCrypt.CON_SALT = r0
            r0 = 64
            int[] r1 = new int[r0]
            r1 = {x018c: FILL_ARRAY_DATA , data: [46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122} // fill-array
            org.apache.commons.codec.digest.UnixCrypt.COV2CHAR = r1
            java.lang.String r1 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789./"
            char[] r1 = r1.toCharArray()
            org.apache.commons.codec.digest.UnixCrypt.SALT_CHARS = r1
            r1 = 16
            boolean[] r1 = new boolean[r1]
            r1 = {x0210: FILL_ARRAY_DATA , data: [0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0} // fill-array
            org.apache.commons.codec.digest.UnixCrypt.SHIFT2 = r1
            int[] r2 = new int[r0]
            r2 = {x021c: FILL_ARRAY_DATA , data: [0, 16, 536870912, 536870928, 65536, 65552, 536936448, 536936464, 2048, 2064, 536872960, 536872976, 67584, 67600, 536938496, 536938512, 32, 48, 536870944, 536870960, 65568, 65584, 536936480, 536936496, 2080, 2096, 536872992, 536873008, 67616, 67632, 536938528, 536938544, 524288, 524304, 537395200, 537395216, 589824, 589840, 537460736, 537460752, 526336, 526352, 537397248, 537397264, 591872, 591888, 537462784, 537462800, 524320, 524336, 537395232, 537395248, 589856, 589872, 537460768, 537460784, 526368, 526384, 537397280, 537397296, 591904, 591920, 537462816, 537462832} // fill-array
            int[] r3 = new int[r0]
            r3 = {x02a0: FILL_ARRAY_DATA , data: [0, 33554432, 8192, 33562624, 2097152, 35651584, 2105344, 35659776, 4, 33554436, 8196, 33562628, 2097156, 35651588, 2105348, 35659780, 1024, 33555456, 9216, 33563648, 2098176, 35652608, 2106368, 35660800, 1028, 33555460, 9220, 33563652, 2098180, 35652612, 2106372, 35660804, 268435456, 301989888, 268443648, 301998080, 270532608, 304087040, 270540800, 304095232, 268435460, 301989892, 268443652, 301998084, 270532612, 304087044, 270540804, 304095236, 268436480, 301990912, 268444672, 301999104, 270533632, 304088064, 270541824, 304096256, 268436484, 301990916, 268444676, 301999108, 270533636, 304088068, 270541828, 304096260} // fill-array
            int[] r4 = new int[r0]
            r4 = {x0324: FILL_ARRAY_DATA , data: [0, 1, 262144, 262145, 16777216, 16777217, 17039360, 17039361, 2, 3, 262146, 262147, 16777218, 16777219, 17039362, 17039363, 512, 513, 262656, 262657, 16777728, 16777729, 17039872, 17039873, 514, 515, 262658, 262659, 16777730, 16777731, 17039874, 17039875, 134217728, 134217729, 134479872, 134479873, 150994944, 150994945, 151257088, 151257089, 134217730, 134217731, 134479874, 134479875, 150994946, 150994947, 151257090, 151257091, 134218240, 134218241, 134480384, 134480385, 150995456, 150995457, 151257600, 151257601, 134218242, 134218243, 134480386, 134480387, 150995458, 150995459, 151257602, 151257603} // fill-array
            int[] r5 = new int[r0]
            r5 = {x03a8: FILL_ARRAY_DATA , data: [0, 1048576, 256, 1048832, 8, 1048584, 264, 1048840, 4096, 1052672, 4352, 1052928, 4104, 1052680, 4360, 1052936, 67108864, 68157440, 67109120, 68157696, 67108872, 68157448, 67109128, 68157704, 67112960, 68161536, 67113216, 68161792, 67112968, 68161544, 67113224, 68161800, 131072, 1179648, 131328, 1179904, 131080, 1179656, 131336, 1179912, 135168, 1183744, 135424, 1184000, 135176, 1183752, 135432, 1184008, 67239936, 68288512, 67240192, 68288768, 67239944, 68288520, 67240200, 68288776, 67244032, 68292608, 67244288, 68292864, 67244040, 68292616, 67244296, 68292872} // fill-array
            int[] r6 = new int[r0]
            r6 = {x042c: FILL_ARRAY_DATA , data: [0, 268435456, 65536, 268500992, 4, 268435460, 65540, 268500996, 536870912, 805306368, 536936448, 805371904, 536870916, 805306372, 536936452, 805371908, 1048576, 269484032, 1114112, 269549568, 1048580, 269484036, 1114116, 269549572, 537919488, 806354944, 537985024, 806420480, 537919492, 806354948, 537985028, 806420484, 4096, 268439552, 69632, 268505088, 4100, 268439556, 69636, 268505092, 536875008, 805310464, 536940544, 805376000, 536875012, 805310468, 536940548, 805376004, 1052672, 269488128, 1118208, 269553664, 1052676, 269488132, 1118212, 269553668, 537923584, 806359040, 537989120, 806424576, 537923588, 806359044, 537989124, 806424580} // fill-array
            int[] r7 = new int[r0]
            r7 = {x04b0: FILL_ARRAY_DATA , data: [0, 134217728, 8, 134217736, 1024, 134218752, 1032, 134218760, 131072, 134348800, 131080, 134348808, 132096, 134349824, 132104, 134349832, 1, 134217729, 9, 134217737, 1025, 134218753, 1033, 134218761, 131073, 134348801, 131081, 134348809, 132097, 134349825, 132105, 134349833, 33554432, 167772160, 33554440, 167772168, 33555456, 167773184, 33555464, 167773192, 33685504, 167903232, 33685512, 167903240, 33686528, 167904256, 33686536, 167904264, 33554433, 167772161, 33554441, 167772169, 33555457, 167773185, 33555465, 167773193, 33685505, 167903233, 33685513, 167903241, 33686529, 167904257, 33686537, 167904265} // fill-array
            int[] r8 = new int[r0]
            r8 = {x0534: FILL_ARRAY_DATA , data: [0, 256, 524288, 524544, 16777216, 16777472, 17301504, 17301760, 16, 272, 524304, 524560, 16777232, 16777488, 17301520, 17301776, 2097152, 2097408, 2621440, 2621696, 18874368, 18874624, 19398656, 19398912, 2097168, 2097424, 2621456, 2621712, 18874384, 18874640, 19398672, 19398928, 512, 768, 524800, 525056, 16777728, 16777984, 17302016, 17302272, 528, 784, 524816, 525072, 16777744, 16778000, 17302032, 17302288, 2097664, 2097920, 2621952, 2622208, 18874880, 18875136, 19399168, 19399424, 2097680, 2097936, 2621968, 2622224, 18874896, 18875152, 19399184, 19399440} // fill-array
            int[] r9 = new int[r0]
            r9 = {x05b8: FILL_ARRAY_DATA , data: [0, 67108864, 262144, 67371008, 2, 67108866, 262146, 67371010, 8192, 67117056, 270336, 67379200, 8194, 67117058, 270338, 67379202, 32, 67108896, 262176, 67371040, 34, 67108898, 262178, 67371042, 8224, 67117088, 270368, 67379232, 8226, 67117090, 270370, 67379234, 2048, 67110912, 264192, 67373056, 2050, 67110914, 264194, 67373058, 10240, 67119104, 272384, 67381248, 10242, 67119106, 272386, 67381250, 2080, 67110944, 264224, 67373088, 2082, 67110946, 264226, 67373090, 10272, 67119136, 272416, 67381280, 10274, 67119138, 272418, 67381282} // fill-array
            int[][] r1 = new int[][]{r2, r3, r4, r5, r6, r7, r8, r9}
            org.apache.commons.codec.digest.UnixCrypt.SKB = r1
            int[] r2 = new int[r0]
            r2 = {x063c: FILL_ARRAY_DATA , data: [8520192, 131072, -2139095040, -2138963456, 8388608, -2147352064, -2147352576, -2139095040, -2147352064, 8520192, 8519680, -2147483136, -2139094528, 8388608, 0, -2147352576, 131072, -2147483648, 8389120, 131584, -2138963456, 8519680, -2147483136, 8389120, -2147483648, 512, 131584, -2138963968, 512, -2139094528, -2138963968, 0, 0, -2138963456, 8389120, -2147352576, 8520192, 131072, -2147483136, 8389120, -2138963968, 512, 131584, -2139095040, -2147352064, -2147483648, -2139095040, 8519680, -2138963456, 131584, 8519680, -2139094528, 8388608, -2147483136, -2147352576, 0, 131072, 8388608, -2139094528, 8520192, -2147483648, -2138963968, 512, -2147352064} // fill-array
            int[] r3 = new int[r0]
            r3 = {x06c0: FILL_ARRAY_DATA , data: [268705796, 0, 270336, 268697600, 268435460, 8196, 268443648, 270336, 8192, 268697604, 4, 268443648, 262148, 268705792, 268697600, 4, 262144, 268443652, 268697604, 8192, 270340, 268435456, 0, 262148, 268443652, 270340, 268705792, 268435460, 268435456, 262144, 8196, 268705796, 262148, 268705792, 268443648, 270340, 268705796, 262148, 268435460, 0, 268435456, 8196, 262144, 268697604, 8192, 268435456, 270340, 268443652, 268705792, 8192, 0, 268435460, 4, 268705796, 270336, 268697600, 268697604, 262144, 8196, 268443648, 268443652, 4, 268697600, 270336} // fill-array
            int[] r4 = new int[r0]
            r4 = {x0744: FILL_ARRAY_DATA , data: [1090519040, 16842816, 64, 1090519104, 1073807360, 16777216, 1090519104, 65600, 16777280, 65536, 16842752, 1073741824, 1090584640, 1073741888, 1073741824, 1090584576, 0, 1073807360, 16842816, 64, 1073741888, 1090584640, 65536, 1090519040, 1090584576, 16777280, 1073807424, 16842752, 65600, 0, 16777216, 1073807424, 16842816, 64, 1073741824, 65536, 1073741888, 1073807360, 16842752, 1090519104, 0, 16842816, 65600, 1090584576, 1073807360, 16777216, 1090584640, 1073741824, 1073807424, 1090519040, 16777216, 1090584640, 65536, 16777280, 1090519104, 65600, 16777280, 0, 1090584576, 1073741888, 1090519040, 1073807424, 64, 16842752} // fill-array
            int[] r5 = new int[r0]
            r5 = {x07c8: FILL_ARRAY_DATA , data: [1049602, 67109888, 2, 68158466, 0, 68157440, 67109890, 1048578, 68158464, 67108866, 67108864, 1026, 67108866, 1049602, 1048576, 67108864, 68157442, 1049600, 1024, 2, 1049600, 67109890, 68157440, 1024, 1026, 0, 1048578, 68158464, 67109888, 68157442, 68158466, 1048576, 68157442, 1026, 1048576, 67108866, 1049600, 67109888, 2, 68157440, 67109890, 0, 1024, 1048578, 0, 68157442, 68158464, 1024, 67108864, 68158466, 1049602, 1048576, 68158466, 2, 67109888, 1049602, 1048578, 1049600, 68157440, 67109890, 1026, 67108864, 67108866, 68158464} // fill-array
            int[] r6 = new int[r0]
            r6 = {x084c: FILL_ARRAY_DATA , data: [33554432, 16384, 256, 33571080, 33570824, 33554688, 16648, 33570816, 16384, 8, 33554440, 16640, 33554696, 33570824, 33571072, 0, 16640, 33554432, 16392, 264, 33554688, 16648, 0, 33554440, 8, 33554696, 33571080, 16392, 33570816, 256, 264, 33571072, 33571072, 33554696, 16392, 33570816, 16384, 8, 33554440, 33554688, 33554432, 16640, 33571080, 0, 16648, 33554432, 256, 16392, 33554696, 256, 0, 33571080, 33570824, 33571072, 264, 16384, 16640, 33570824, 33554688, 264, 8, 16648, 33570816, 33554440} // fill-array
            int[] r7 = new int[r0]
            r7 = {x08d0: FILL_ARRAY_DATA , data: [536870928, 524304, 0, 537397248, 524304, 2048, 536872976, 524288, 2064, 537397264, 526336, 536870912, 536872960, 536870928, 537395200, 526352, 524288, 536872976, 537395216, 0, 2048, 16, 537397248, 537395216, 537397264, 537395200, 536870912, 2064, 16, 526336, 526352, 536872960, 2064, 536870912, 536872960, 526352, 537397248, 524304, 0, 536872960, 536870912, 2048, 537395216, 524288, 524304, 537397264, 526336, 16, 537397264, 526336, 524288, 536872976, 536870928, 537395200, 526352, 0, 2048, 536870928, 536872976, 537397248, 537395200, 2064, 16, 537395216} // fill-array
            int[] r8 = new int[r0]
            r8 = {x0954: FILL_ARRAY_DATA , data: [4096, 128, 4194432, 4194305, 4198529, 4097, 4224, 0, 4194304, 4194433, 129, 4198400, 1, 4198528, 4198400, 129, 4194433, 4096, 4097, 4198529, 0, 4194432, 4194305, 4224, 4198401, 4225, 4198528, 1, 4225, 4198401, 128, 4194304, 4225, 4198400, 4198401, 129, 4096, 128, 4194304, 4198401, 4194433, 4225, 4224, 0, 128, 4194305, 1, 4194432, 0, 4194433, 4194432, 4224, 129, 4096, 4198529, 4194304, 4198528, 1, 4097, 4198529, 4194305, 4198528, 4198400, 4097} // fill-array
            int[] r9 = new int[r0]
            r9 = {x09d8: FILL_ARRAY_DATA , data: [136314912, 136347648, 32800, 0, 134250496, 2097184, 136314880, 136347680, 32, 134217728, 2129920, 32800, 2129952, 134250528, 134217760, 136314880, 32768, 2129952, 2097184, 134250496, 136347680, 134217760, 0, 2129920, 134217728, 2097152, 134250528, 136314912, 2097152, 32768, 136347648, 32, 2097152, 32768, 134217760, 136347680, 32800, 134217728, 0, 2129920, 136314912, 134250528, 134250496, 2097184, 136347648, 32, 2097184, 134250496, 136347680, 2097152, 136314880, 134217760, 2129920, 32800, 134250528, 136314880, 32, 136347648, 2129952, 0, 134217728, 136314912, 32768, 2129952} // fill-array
            int[][] r0 = new int[][]{r2, r3, r4, r5, r6, r7, r8, r9}
            org.apache.commons.codec.digest.UnixCrypt.SPTRANS = r0
            return
    }

    @java.lang.Deprecated
    public UnixCrypt() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int[] body(int[] r12, int r13, int r14) {
            r0 = 0
            r1 = r0
            r2 = r1
            r3 = r2
        L4:
            r4 = 25
            if (r1 >= r4) goto L29
            r5 = r3
            r3 = r0
        La:
            r4 = 32
            if (r3 >= r4) goto L24
            r6 = r2
            r7 = r3
            r8 = r13
            r9 = r14
            r10 = r12
            int r5 = dEncrypt(r5, r6, r7, r8, r9, r10)
            int r8 = r3 + 2
            r7 = r5
            r9 = r13
            r10 = r14
            r11 = r12
            int r2 = dEncrypt(r6, r7, r8, r9, r10, r11)
            int r3 = r3 + 4
            goto La
        L24:
            int r1 = r1 + 1
            r3 = r2
            r2 = r5
            goto L4
        L29:
            int r12 = r3 >>> 1
            int r13 = r3 << 31
            r12 = r12 | r13
            int r13 = r2 >>> 1
            int r14 = r2 << 31
            r13 = r13 | r14
            r14 = 2
            int[] r1 = new int[r14]
            r2 = 1431655765(0x55555555, float:1.4660155E13)
            r3 = 1
            permOp(r12, r13, r3, r2, r1)
            r12 = r1[r0]
            r13 = r1[r3]
            r2 = 8
            r4 = 16711935(0xff00ff, float:2.3418409E-38)
            permOp(r13, r12, r2, r4, r1)
            r12 = r1[r0]
            r13 = r1[r3]
            r2 = 858993459(0x33333333, float:4.172325E-8)
            permOp(r13, r12, r14, r2, r1)
            r12 = r1[r0]
            r13 = r1[r3]
            r14 = 16
            r2 = 65535(0xffff, float:9.1834E-41)
            permOp(r13, r12, r14, r2, r1)
            r12 = r1[r0]
            r13 = r1[r3]
            r14 = 252645135(0xf0f0f0f, float:7.0533445E-30)
            r2 = 4
            permOp(r13, r12, r2, r14, r1)
            r12 = r1[r0]
            r13 = r1[r3]
            int[] r12 = new int[]{r13, r12}
            return r12
    }

    private static int byteToUnsigned(byte r0) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    public static java.lang.String crypt(java.lang.String r1) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r1 = r1.getBytes(r0)
            java.lang.String r1 = crypt(r1)
            return r1
    }

    public static java.lang.String crypt(java.lang.String r1, java.lang.String r2) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r1 = r1.getBytes(r0)
            java.lang.String r1 = crypt(r1, r2)
            return r1
    }

    public static java.lang.String crypt(byte[] r1) {
            r0 = 0
            java.lang.String r1 = crypt(r1, r0)
            return r1
    }

    public static java.lang.String crypt(byte[] r10, java.lang.String r11) {
            if (r11 != 0) goto L2a
            java.security.SecureRandom r11 = new java.security.SecureRandom
            r11.<init>()
            char[] r0 = org.apache.commons.codec.digest.UnixCrypt.SALT_CHARS
            int r1 = r0.length
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = ""
            r2.<init>(r3)
            int r3 = r11.nextInt(r1)
            char r3 = r0[r3]
            java.lang.StringBuilder r2 = r2.append(r3)
            int r11 = r11.nextInt(r1)
            char r11 = r0[r11]
            java.lang.StringBuilder r11 = r2.append(r11)
            java.lang.String r11 = r11.toString()
            goto L36
        L2a:
            java.util.regex.Pattern r0 = org.apache.commons.codec.digest.UnixCrypt.CRYPT_SALT_PATTERN
            java.util.regex.Matcher r0 = r0.matcher(r11)
            boolean r0 = r0.matches()
            if (r0 == 0) goto Lb3
        L36:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "             "
            r0.<init>(r1)
            r1 = 0
            char r2 = r11.charAt(r1)
            r3 = 1
            char r11 = r11.charAt(r3)
            r0.setCharAt(r1, r2)
            r0.setCharAt(r3, r11)
            int[] r4 = org.apache.commons.codec.digest.UnixCrypt.CON_SALT
            r2 = r4[r2]
            r11 = r4[r11]
            r4 = 4
            int r11 = r11 << r4
            r5 = 8
            byte[] r6 = new byte[r5]
            java.util.Arrays.fill(r6, r1)
            int r7 = r10.length
            r8 = r1
        L5e:
            if (r8 >= r5) goto L6b
            if (r8 >= r7) goto L6b
            r9 = r10[r8]
            int r9 = r9 << r3
            byte r9 = (byte) r9
            r6[r8] = r9
            int r8 = r8 + 1
            goto L5e
        L6b:
            int[] r10 = desSetKey(r6)
            int[] r10 = body(r10, r2, r11)
            r11 = 9
            byte[] r11 = new byte[r11]
            r2 = r10[r1]
            intToFourBytes(r2, r11, r1)
            r10 = r10[r3]
            intToFourBytes(r10, r11, r4)
            r11[r5] = r1
            r10 = 128(0x80, float:1.8E-43)
            r2 = 2
            r5 = r10
            r4 = r1
        L88:
            r6 = 13
            if (r2 >= r6) goto Lae
            r6 = r1
            r7 = r6
        L8e:
            r8 = 6
            if (r6 >= r8) goto Lab
            int r7 = r7 << r3
            r8 = r11[r4]
            r8 = r8 & r5
            if (r8 == 0) goto L99
            r7 = r7 | 1
        L99:
            int r5 = r5 >>> 1
            if (r5 != 0) goto La0
            int r4 = r4 + 1
            r5 = r10
        La0:
            int[] r8 = org.apache.commons.codec.digest.UnixCrypt.COV2CHAR
            r8 = r8[r7]
            char r8 = (char) r8
            r0.setCharAt(r2, r8)
            int r6 = r6 + 1
            goto L8e
        Lab:
            int r2 = r2 + 1
            goto L88
        Lae:
            java.lang.String r10 = r0.toString()
            return r10
        Lb3:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid salt value: "
            r0.<init>(r1)
            java.lang.StringBuilder r11 = r0.append(r11)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
    }

    private static int dEncrypt(int r1, int r2, int r3, int r4, int r5, int[] r6) {
            int r0 = r2 >>> 16
            r0 = r0 ^ r2
            r4 = r4 & r0
            r5 = r5 & r0
            int r0 = r4 << 16
            r4 = r4 ^ r0
            r4 = r4 ^ r2
            r0 = r6[r3]
            r4 = r4 ^ r0
            int r0 = r5 << 16
            r5 = r5 ^ r0
            r2 = r2 ^ r5
            r5 = 1
            int r3 = r3 + r5
            r3 = r6[r3]
            r2 = r2 ^ r3
            int r3 = r2 >>> 4
            int r2 = r2 << 28
            r2 = r2 | r3
            int[][] r3 = org.apache.commons.codec.digest.UnixCrypt.SPTRANS
            r5 = r3[r5]
            r6 = r2 & 63
            r5 = r5[r6]
            r6 = 3
            r6 = r3[r6]
            int r0 = r2 >>> 8
            r0 = r0 & 63
            r6 = r6[r0]
            r5 = r5 | r6
            r6 = 5
            r6 = r3[r6]
            int r0 = r2 >>> 16
            r0 = r0 & 63
            r6 = r6[r0]
            r5 = r5 | r6
            r6 = 7
            r6 = r3[r6]
            int r2 = r2 >>> 24
            r2 = r2 & 63
            r2 = r6[r2]
            r2 = r2 | r5
            r5 = 0
            r5 = r3[r5]
            r6 = r4 & 63
            r5 = r5[r6]
            r2 = r2 | r5
            r5 = 2
            r5 = r3[r5]
            int r6 = r4 >>> 8
            r6 = r6 & 63
            r5 = r5[r6]
            r2 = r2 | r5
            r5 = 4
            r5 = r3[r5]
            int r6 = r4 >>> 16
            r6 = r6 & 63
            r5 = r5[r6]
            r2 = r2 | r5
            r5 = 6
            r3 = r3[r5]
            int r4 = r4 >>> 24
            r4 = r4 & 63
            r3 = r3[r4]
            r2 = r2 | r3
            r1 = r1 ^ r2
            return r1
    }

    private static int[] desSetKey(byte[] r19) {
            r0 = r19
            r1 = 32
            int[] r1 = new int[r1]
            r2 = 0
            int r3 = fourBytesToInt(r0, r2)
            r4 = 4
            int r0 = fourBytesToInt(r0, r4)
            r5 = 2
            int[] r6 = new int[r5]
            r7 = 252645135(0xf0f0f0f, float:7.0533445E-30)
            permOp(r0, r3, r4, r7, r6)
            r0 = r6[r2]
            r3 = 1
            r7 = r6[r3]
            r8 = -2
            r9 = -859045888(0xffffffffcccc0000, float:-1.0695475E8)
            int r7 = hPermOp(r7, r8, r9)
            int r0 = hPermOp(r0, r8, r9)
            r8 = 1431655765(0x55555555, float:1.4660155E13)
            permOp(r0, r7, r3, r8, r6)
            r0 = r6[r2]
            r7 = r6[r3]
            r9 = 8
            r10 = 16711935(0xff00ff, float:2.3418409E-38)
            permOp(r7, r0, r9, r10, r6)
            r0 = r6[r2]
            r7 = r6[r3]
            permOp(r7, r0, r3, r8, r6)
            r0 = r6[r2]
            r6 = r6[r3]
            r7 = r0 & 255(0xff, float:3.57E-43)
            r8 = 16
            int r7 = r7 << r8
            r9 = 65280(0xff00, float:9.1477E-41)
            r9 = r9 & r0
            r7 = r7 | r9
            r9 = 16711680(0xff0000, float:2.3418052E-38)
            r0 = r0 & r9
            int r0 = r0 >>> r8
            r0 = r0 | r7
            r7 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
            r7 = r7 & r6
            int r7 = r7 >>> r4
            r0 = r0 | r7
            r7 = 268435455(0xfffffff, float:2.5243547E-29)
            r6 = r6 & r7
            r9 = r2
            r10 = r9
        L60:
            if (r9 >= r8) goto L10a
            boolean[] r11 = org.apache.commons.codec.digest.UnixCrypt.SHIFT2
            boolean r11 = r11[r9]
            if (r11 == 0) goto L72
            int r11 = r6 >>> 2
            int r6 = r6 << 26
            r6 = r6 | r11
            int r11 = r0 >>> 2
            int r0 = r0 << 26
            goto L7b
        L72:
            int r11 = r6 >>> 1
            int r6 = r6 << 27
            r6 = r6 | r11
            int r11 = r0 >>> 1
            int r0 = r0 << 27
        L7b:
            r0 = r0 | r11
            r11 = r6 & r7
            r12 = r0 & r7
            int[][] r13 = org.apache.commons.codec.digest.UnixCrypt.SKB
            r14 = r13[r2]
            r6 = r6 & 63
            r6 = r14[r6]
            r14 = r13[r3]
            int r15 = r11 >>> 6
            r16 = 3
            r15 = r15 & 3
            int r17 = r11 >>> 7
            r17 = r17 & 60
            r15 = r15 | r17
            r14 = r14[r15]
            r6 = r6 | r14
            r14 = r13[r5]
            int r15 = r11 >>> 13
            r15 = r15 & 15
            int r17 = r11 >>> 14
            r17 = r17 & 48
            r15 = r15 | r17
            r14 = r14[r15]
            r6 = r6 | r14
            r14 = r13[r16]
            int r15 = r11 >>> 20
            r15 = r15 & r3
            int r17 = r11 >>> 21
            r18 = 6
            r17 = r17 & 6
            r15 = r15 | r17
            int r17 = r11 >>> 22
            r17 = r17 & 56
            r15 = r15 | r17
            r14 = r14[r15]
            r6 = r6 | r14
            r14 = r13[r4]
            r0 = r0 & 63
            r0 = r14[r0]
            r14 = 5
            r14 = r13[r14]
            int r15 = r12 >>> 7
            r15 = r15 & 3
            int r16 = r12 >>> 8
            r16 = r16 & 60
            r15 = r15 | r16
            r14 = r14[r15]
            r0 = r0 | r14
            r14 = r13[r18]
            int r15 = r12 >>> 15
            r15 = r15 & 63
            r14 = r14[r15]
            r0 = r0 | r14
            r14 = 7
            r13 = r13[r14]
            int r14 = r12 >>> 21
            r14 = r14 & 15
            int r15 = r12 >>> 22
            r15 = r15 & 48
            r14 = r14 | r15
            r13 = r13[r14]
            r0 = r0 | r13
            int r13 = r10 + 1
            int r14 = r0 << 16
            r15 = 65535(0xffff, float:9.1834E-41)
            r15 = r15 & r6
            r14 = r14 | r15
            r1[r10] = r14
            int r6 = r6 >>> r8
            r14 = -65536(0xffffffffffff0000, float:NaN)
            r0 = r0 & r14
            r0 = r0 | r6
            int r6 = r0 << 4
            int r0 = r0 >>> 28
            r0 = r0 | r6
            int r10 = r10 + r5
            r1[r13] = r0
            int r9 = r9 + 1
            r6 = r11
            r0 = r12
            goto L60
        L10a:
            return r1
    }

    private static int fourBytesToInt(byte[] r3, int r4) {
            int r0 = r4 + 1
            r1 = r3[r4]
            int r1 = byteToUnsigned(r1)
            int r2 = r4 + 2
            r0 = r3[r0]
            int r0 = byteToUnsigned(r0)
            int r0 = r0 << 8
            r0 = r0 | r1
            int r4 = r4 + 3
            r1 = r3[r2]
            int r1 = byteToUnsigned(r1)
            int r1 = r1 << 16
            r0 = r0 | r1
            r3 = r3[r4]
            int r3 = byteToUnsigned(r3)
            int r3 = r3 << 24
            r3 = r3 | r0
            return r3
    }

    private static int hPermOp(int r1, int r2, int r3) {
            int r2 = 16 - r2
            int r0 = r1 << r2
            r0 = r0 ^ r1
            r3 = r3 & r0
            r1 = r1 ^ r3
            int r2 = r3 >>> r2
            r1 = r1 ^ r2
            return r1
    }

    private static void intToFourBytes(int r3, byte[] r4, int r5) {
            int r0 = r5 + 1
            r1 = r3 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r4[r5] = r1
            int r1 = r5 + 2
            int r2 = r3 >>> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r4[r0] = r2
            int r5 = r5 + 3
            int r0 = r3 >>> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r4[r1] = r0
            int r3 = r3 >>> 24
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r4[r5] = r3
            return
    }

    private static void permOp(int r1, int r2, int r3, int r4, int[] r5) {
            int r0 = r1 >>> r3
            r0 = r0 ^ r2
            r4 = r4 & r0
            int r3 = r4 << r3
            r1 = r1 ^ r3
            r2 = r2 ^ r4
            r3 = 0
            r5[r3] = r1
            r1 = 1
            r5[r1] = r2
            return
    }
}
