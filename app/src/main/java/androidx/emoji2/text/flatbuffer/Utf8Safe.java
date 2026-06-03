package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes.dex */
public final class Utf8Safe extends androidx.emoji2.text.flatbuffer.Utf8 {

    static class UnpairedSurrogateException extends java.lang.IllegalArgumentException {
        UnpairedSurrogateException(int r3, int r4) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Unpaired surrogate at index "
                r0.<init>(r1)
                java.lang.StringBuilder r3 = r0.append(r3)
                java.lang.String r0 = " of "
                java.lang.StringBuilder r3 = r3.append(r0)
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                return
        }
    }

    public Utf8Safe() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int computeEncodedLength(java.lang.CharSequence r5) {
            int r0 = r5.length()
            r1 = 0
        L5:
            if (r1 >= r0) goto L12
            char r2 = r5.charAt(r1)
            r3 = 128(0x80, float:1.8E-43)
            if (r2 >= r3) goto L12
            int r1 = r1 + 1
            goto L5
        L12:
            r2 = r0
        L13:
            if (r1 >= r0) goto L2a
            char r3 = r5.charAt(r1)
            r4 = 2048(0x800, float:2.87E-42)
            if (r3 >= r4) goto L25
            int r3 = 127 - r3
            int r3 = r3 >>> 31
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L13
        L25:
            int r5 = encodedLengthGeneral(r5, r1)
            int r2 = r2 + r5
        L2a:
            if (r2 < r0) goto L2d
            return r2
        L2d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "UTF-8 length does not fit in int: "
            r0.<init>(r1)
            long r1 = (long) r2
            r3 = 4294967296(0x100000000, double:2.121995791E-314)
            long r1 = r1 + r3
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }

    public static java.lang.String decodeUtf8Array(byte[] r9, int r10, int r11) {
            r0 = r10 | r11
            int r1 = r9.length
            int r1 = r1 - r10
            int r1 = r1 - r11
            r0 = r0 | r1
            if (r0 < 0) goto Lac
            int r0 = r10 + r11
            char[] r11 = new char[r11]
            r7 = 0
            r1 = r7
        Le:
            if (r10 >= r0) goto L22
            r2 = r9[r10]
            boolean r3 = androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.isOneByte(r2)
            if (r3 != 0) goto L19
            goto L22
        L19:
            int r10 = r10 + 1
            int r3 = r1 + 1
            androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.handleOneByte(r2, r11, r1)
            r1 = r3
            goto Le
        L22:
            r8 = r1
        L23:
            if (r10 >= r0) goto La6
            int r1 = r10 + 1
            r2 = r9[r10]
            boolean r3 = androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.isOneByte(r2)
            if (r3 == 0) goto L4b
            int r10 = r8 + 1
            androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.handleOneByte(r2, r11, r8)
        L34:
            if (r1 >= r0) goto L48
            r2 = r9[r1]
            boolean r3 = androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.isOneByte(r2)
            if (r3 != 0) goto L3f
            goto L48
        L3f:
            int r1 = r1 + 1
            int r3 = r10 + 1
            androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.handleOneByte(r2, r11, r10)
            r10 = r3
            goto L34
        L48:
            r8 = r10
            r10 = r1
            goto L23
        L4b:
            boolean r3 = androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.isTwoBytes(r2)
            java.lang.String r4 = "Invalid UTF-8"
            if (r3 == 0) goto L66
            if (r1 >= r0) goto L60
            int r10 = r10 + 2
            r1 = r9[r1]
            int r3 = r8 + 1
            androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.handleTwoBytes(r2, r1, r11, r8)
            r8 = r3
            goto L23
        L60:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r4)
            throw r9
        L66:
            boolean r3 = androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.isThreeBytes(r2)
            if (r3 == 0) goto L85
            int r3 = r0 + (-1)
            if (r1 >= r3) goto L7f
            int r3 = r10 + 2
            r1 = r9[r1]
            int r10 = r10 + 3
            r3 = r9[r3]
            int r4 = r8 + 1
            androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.handleThreeBytes(r2, r1, r3, r11, r8)
            r8 = r4
            goto L23
        L7f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r4)
            throw r9
        L85:
            int r3 = r0 + (-2)
            if (r1 >= r3) goto La0
            int r3 = r10 + 2
            r4 = r9[r1]
            int r1 = r10 + 3
            r3 = r9[r3]
            int r10 = r10 + 4
            r5 = r9[r1]
            r1 = r2
            r2 = r4
            r4 = r5
            r5 = r11
            r6 = r8
            androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.handleFourBytes(r1, r2, r3, r4, r5, r6)
            int r8 = r8 + 2
            goto L23
        La0:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r4)
            throw r9
        La6:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r11, r7, r8)
            return r9
        Lac:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            int r9 = r9.length
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r10, r11}
            java.lang.String r10 = "buffer length=%d, index=%d, size=%d"
            java.lang.String r9 = java.lang.String.format(r10, r9)
            r0.<init>(r9)
            throw r0
    }

    public static java.lang.String decodeUtf8Buffer(java.nio.ByteBuffer r9, int r10, int r11) {
            r0 = r10 | r11
            int r1 = r9.limit()
            int r1 = r1 - r10
            int r1 = r1 - r11
            r0 = r0 | r1
            if (r0 < 0) goto Lc2
            int r0 = r10 + r11
            char[] r11 = new char[r11]
            r7 = 0
            r1 = r7
        L11:
            if (r10 >= r0) goto L27
            byte r2 = r9.get(r10)
            boolean r3 = androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.isOneByte(r2)
            if (r3 != 0) goto L1e
            goto L27
        L1e:
            int r10 = r10 + 1
            int r3 = r1 + 1
            androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.handleOneByte(r2, r11, r1)
            r1 = r3
            goto L11
        L27:
            r8 = r1
        L28:
            if (r10 >= r0) goto Lbc
            int r1 = r10 + 1
            byte r2 = r9.get(r10)
            boolean r3 = androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.isOneByte(r2)
            if (r3 == 0) goto L54
            int r10 = r8 + 1
            androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.handleOneByte(r2, r11, r8)
        L3b:
            if (r1 >= r0) goto L51
            byte r2 = r9.get(r1)
            boolean r3 = androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.isOneByte(r2)
            if (r3 != 0) goto L48
            goto L51
        L48:
            int r1 = r1 + 1
            int r3 = r10 + 1
            androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.handleOneByte(r2, r11, r10)
            r10 = r3
            goto L3b
        L51:
            r8 = r10
            r10 = r1
            goto L28
        L54:
            boolean r3 = androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.isTwoBytes(r2)
            java.lang.String r4 = "Invalid UTF-8"
            if (r3 == 0) goto L71
            if (r1 >= r0) goto L6b
            int r10 = r10 + 2
            byte r1 = r9.get(r1)
            int r3 = r8 + 1
            androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.handleTwoBytes(r2, r1, r11, r8)
            r8 = r3
            goto L28
        L6b:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r4)
            throw r9
        L71:
            boolean r3 = androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.isThreeBytes(r2)
            if (r3 == 0) goto L94
            int r3 = r0 + (-1)
            if (r1 >= r3) goto L8e
            int r3 = r10 + 2
            byte r1 = r9.get(r1)
            int r10 = r10 + 3
            byte r3 = r9.get(r3)
            int r4 = r8 + 1
            androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.handleThreeBytes(r2, r1, r3, r11, r8)
            r8 = r4
            goto L28
        L8e:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r4)
            throw r9
        L94:
            int r3 = r0 + (-2)
            if (r1 >= r3) goto Lb6
            int r3 = r10 + 2
            byte r4 = r9.get(r1)
            int r1 = r10 + 3
            byte r3 = r9.get(r3)
            int r10 = r10 + 4
            byte r5 = r9.get(r1)
            r1 = r2
            r2 = r4
            r4 = r5
            r5 = r11
            r6 = r8
            androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.handleFourBytes(r1, r2, r3, r4, r5, r6)
            int r8 = r8 + 2
            goto L28
        Lb6:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r4)
            throw r9
        Lbc:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r11, r7, r8)
            return r9
        Lc2:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            int r9 = r9.limit()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r10, r11}
            java.lang.String r10 = "buffer limit=%d, index=%d, limit=%d"
            java.lang.String r9 = java.lang.String.format(r10, r9)
            r0.<init>(r9)
            throw r0
    }

    private static int encodeUtf8Array(java.lang.CharSequence r7, byte[] r8, int r9, int r10) {
            int r0 = r7.length()
            int r10 = r10 + r9
            r1 = 0
        L6:
            r2 = 128(0x80, float:1.8E-43)
            if (r1 >= r0) goto L1a
            int r3 = r1 + r9
            if (r3 >= r10) goto L1a
            char r4 = r7.charAt(r1)
            if (r4 >= r2) goto L1a
            byte r2 = (byte) r4
            r8[r3] = r2
            int r1 = r1 + 1
            goto L6
        L1a:
            if (r1 != r0) goto L1e
            int r9 = r9 + r0
            return r9
        L1e:
            int r9 = r9 + r1
        L1f:
            if (r1 >= r0) goto Lfd
            char r3 = r7.charAt(r1)
            if (r3 >= r2) goto L31
            if (r9 >= r10) goto L31
            int r4 = r9 + 1
            byte r3 = (byte) r3
            r8[r9] = r3
            r9 = r4
            goto Lb5
        L31:
            r4 = 2048(0x800, float:2.87E-42)
            if (r3 >= r4) goto L4b
            int r4 = r10 + (-2)
            if (r9 > r4) goto L4b
            int r4 = r9 + 1
            int r5 = r3 >>> 6
            r5 = r5 | 960(0x3c0, float:1.345E-42)
            byte r5 = (byte) r5
            r8[r9] = r5
            int r9 = r9 + 2
            r3 = r3 & 63
            r3 = r3 | r2
            byte r3 = (byte) r3
            r8[r4] = r3
            goto Lb5
        L4b:
            r4 = 57343(0xdfff, float:8.0355E-41)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r5) goto L55
            if (r4 >= r3) goto L75
        L55:
            int r6 = r10 + (-3)
            if (r9 > r6) goto L75
            int r4 = r9 + 1
            int r5 = r3 >>> 12
            r5 = r5 | 480(0x1e0, float:6.73E-43)
            byte r5 = (byte) r5
            r8[r9] = r5
            int r5 = r9 + 2
            int r6 = r3 >>> 6
            r6 = r6 & 63
            r6 = r6 | r2
            byte r6 = (byte) r6
            r8[r4] = r6
            int r9 = r9 + 3
            r3 = r3 & 63
            r3 = r3 | r2
            byte r3 = (byte) r3
            r8[r5] = r3
            goto Lb5
        L75:
            int r6 = r10 + (-4)
            if (r9 > r6) goto Lc2
            int r4 = r1 + 1
            int r5 = r7.length()
            if (r4 == r5) goto Lba
            char r1 = r7.charAt(r4)
            boolean r5 = java.lang.Character.isSurrogatePair(r3, r1)
            if (r5 == 0) goto Lb9
            int r1 = java.lang.Character.toCodePoint(r3, r1)
            int r3 = r9 + 1
            int r5 = r1 >>> 18
            r5 = r5 | 240(0xf0, float:3.36E-43)
            byte r5 = (byte) r5
            r8[r9] = r5
            int r5 = r9 + 2
            int r6 = r1 >>> 12
            r6 = r6 & 63
            r6 = r6 | r2
            byte r6 = (byte) r6
            r8[r3] = r6
            int r3 = r9 + 3
            int r6 = r1 >>> 6
            r6 = r6 & 63
            r6 = r6 | r2
            byte r6 = (byte) r6
            r8[r5] = r6
            int r9 = r9 + 4
            r1 = r1 & 63
            r1 = r1 | r2
            byte r1 = (byte) r1
            r8[r3] = r1
            r1 = r4
        Lb5:
            int r1 = r1 + 1
            goto L1f
        Lb9:
            r1 = r4
        Lba:
            androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException r7 = new androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException
            int r1 = r1 + (-1)
            r7.<init>(r1, r0)
            throw r7
        Lc2:
            if (r5 > r3) goto Lde
            if (r3 > r4) goto Lde
            int r8 = r1 + 1
            int r10 = r7.length()
            if (r8 == r10) goto Ld8
            char r7 = r7.charAt(r8)
            boolean r7 = java.lang.Character.isSurrogatePair(r3, r7)
            if (r7 != 0) goto Lde
        Ld8:
            androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException r7 = new androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException
            r7.<init>(r1, r0)
            throw r7
        Lde:
            java.lang.ArrayIndexOutOfBoundsException r7 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "Failed writing "
            r8.<init>(r10)
            java.lang.StringBuilder r8 = r8.append(r3)
            java.lang.String r10 = " at index "
            java.lang.StringBuilder r8 = r8.append(r10)
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        Lfd:
            return r9
    }

    private static void encodeUtf8Buffer(java.lang.CharSequence r8, java.nio.ByteBuffer r9) {
            int r0 = r8.length()
            int r1 = r9.position()
            r2 = 0
        L9:
            r3 = 128(0x80, float:1.8E-43)
            if (r2 >= r0) goto L1c
            char r4 = r8.charAt(r2)     // Catch: java.lang.IndexOutOfBoundsException -> Lc9
            if (r4 >= r3) goto L1c
            int r3 = r1 + r2
            byte r4 = (byte) r4     // Catch: java.lang.IndexOutOfBoundsException -> Lc9
            r9.put(r3, r4)     // Catch: java.lang.IndexOutOfBoundsException -> Lc9
            int r2 = r2 + 1
            goto L9
        L1c:
            if (r2 != r0) goto L24
            int r0 = r1 + r2
            r9.position(r0)     // Catch: java.lang.IndexOutOfBoundsException -> Lc9
            return
        L24:
            int r1 = r1 + r2
        L25:
            if (r2 >= r0) goto Lc5
            char r4 = r8.charAt(r2)     // Catch: java.lang.IndexOutOfBoundsException -> Lc9
            if (r4 >= r3) goto L33
            byte r4 = (byte) r4     // Catch: java.lang.IndexOutOfBoundsException -> Lc9
            r9.put(r1, r4)     // Catch: java.lang.IndexOutOfBoundsException -> Lc9
            goto Lbf
        L33:
            r5 = 2048(0x800, float:2.87E-42)
            if (r4 >= r5) goto L4e
            int r5 = r1 + 1
            int r6 = r4 >>> 6
            r6 = r6 | 192(0xc0, float:2.69E-43)
            byte r6 = (byte) r6
            r9.put(r1, r6)     // Catch: java.lang.IndexOutOfBoundsException -> L4b
            r1 = r4 & 63
            r1 = r1 | r3
            byte r1 = (byte) r1     // Catch: java.lang.IndexOutOfBoundsException -> L4b
            r9.put(r5, r1)     // Catch: java.lang.IndexOutOfBoundsException -> L4b
            r1 = r5
            goto Lbf
        L4b:
            r1 = r5
            goto Lc9
        L4e:
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto La3
            r5 = 57343(0xdfff, float:8.0355E-41)
            if (r5 >= r4) goto L59
            goto La3
        L59:
            int r5 = r2 + 1
            if (r5 == r0) goto L9d
            char r2 = r8.charAt(r5)     // Catch: java.lang.IndexOutOfBoundsException -> L9b
            boolean r6 = java.lang.Character.isSurrogatePair(r4, r2)     // Catch: java.lang.IndexOutOfBoundsException -> L9b
            if (r6 == 0) goto L99
            int r2 = java.lang.Character.toCodePoint(r4, r2)     // Catch: java.lang.IndexOutOfBoundsException -> L9b
            int r4 = r1 + 1
            int r6 = r2 >>> 18
            r6 = r6 | 240(0xf0, float:3.36E-43)
            byte r6 = (byte) r6
            r9.put(r1, r6)     // Catch: java.lang.IndexOutOfBoundsException -> L97
            int r6 = r1 + 2
            int r7 = r2 >>> 12
            r7 = r7 & 63
            r7 = r7 | r3
            byte r7 = (byte) r7
            r9.put(r4, r7)     // Catch: java.lang.IndexOutOfBoundsException -> L94
            int r1 = r1 + 3
            int r4 = r2 >>> 6
            r4 = r4 & 63
            r4 = r4 | r3
            byte r4 = (byte) r4
            r9.put(r6, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L9b
            r2 = r2 & 63
            r2 = r2 | r3
            byte r2 = (byte) r2     // Catch: java.lang.IndexOutOfBoundsException -> L9b
            r9.put(r1, r2)     // Catch: java.lang.IndexOutOfBoundsException -> L9b
            r2 = r5
            goto Lbf
        L94:
            r2 = r5
            r1 = r6
            goto Lc9
        L97:
            r1 = r4
            goto L9b
        L99:
            r2 = r5
            goto L9d
        L9b:
            r2 = r5
            goto Lc9
        L9d:
            androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException r3 = new androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException     // Catch: java.lang.IndexOutOfBoundsException -> Lc9
            r3.<init>(r2, r0)     // Catch: java.lang.IndexOutOfBoundsException -> Lc9
            throw r3     // Catch: java.lang.IndexOutOfBoundsException -> Lc9
        La3:
            int r5 = r1 + 1
            int r6 = r4 >>> 12
            r6 = r6 | 224(0xe0, float:3.14E-43)
            byte r6 = (byte) r6
            r9.put(r1, r6)     // Catch: java.lang.IndexOutOfBoundsException -> L4b
            int r1 = r1 + 2
            int r6 = r4 >>> 6
            r6 = r6 & 63
            r6 = r6 | r3
            byte r6 = (byte) r6
            r9.put(r5, r6)     // Catch: java.lang.IndexOutOfBoundsException -> Lc9
            r4 = r4 & 63
            r4 = r4 | r3
            byte r4 = (byte) r4     // Catch: java.lang.IndexOutOfBoundsException -> Lc9
            r9.put(r1, r4)     // Catch: java.lang.IndexOutOfBoundsException -> Lc9
        Lbf:
            int r2 = r2 + 1
            int r1 = r1 + 1
            goto L25
        Lc5:
            r9.position(r1)     // Catch: java.lang.IndexOutOfBoundsException -> Lc9
            return
        Lc9:
            int r0 = r9.position()
            int r9 = r9.position()
            int r1 = r1 - r9
            int r1 = r1 + 1
            int r9 = java.lang.Math.max(r2, r1)
            int r0 = r0 + r9
            java.lang.ArrayIndexOutOfBoundsException r9 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed writing "
            r1.<init>(r3)
            char r8 = r8.charAt(r2)
            java.lang.StringBuilder r8 = r1.append(r8)
            java.lang.String r1 = " at index "
            java.lang.StringBuilder r8 = r8.append(r1)
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
    }

    private static int encodedLengthGeneral(java.lang.CharSequence r4, int r5) {
            int r0 = r4.length()
            r1 = 0
        L5:
            if (r5 >= r0) goto L35
            char r2 = r4.charAt(r5)
            r3 = 2048(0x800, float:2.87E-42)
            if (r2 >= r3) goto L15
            int r2 = 127 - r2
            int r2 = r2 >>> 31
            int r1 = r1 + r2
            goto L32
        L15:
            int r1 = r1 + 2
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r3 > r2) goto L32
            r3 = 57343(0xdfff, float:8.0355E-41)
            if (r2 > r3) goto L32
            int r2 = java.lang.Character.codePointAt(r4, r5)
            r3 = 65536(0x10000, float:9.1835E-41)
            if (r2 < r3) goto L2c
            int r5 = r5 + 1
            goto L32
        L2c:
            androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException r4 = new androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException
            r4.<init>(r5, r0)
            throw r4
        L32:
            int r5 = r5 + 1
            goto L5
        L35:
            return r1
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public java.lang.String decodeUtf8(java.nio.ByteBuffer r2, int r3, int r4) throws java.lang.IllegalArgumentException {
            r1 = this;
            boolean r0 = r2.hasArray()
            if (r0 == 0) goto L14
            byte[] r0 = r2.array()
            int r2 = r2.arrayOffset()
            int r2 = r2 + r3
            java.lang.String r2 = decodeUtf8Array(r0, r2, r4)
            return r2
        L14:
            java.lang.String r2 = decodeUtf8Buffer(r2, r3, r4)
            return r2
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public void encodeUtf8(java.lang.CharSequence r5, java.nio.ByteBuffer r6) {
            r4 = this;
            boolean r0 = r6.hasArray()
            if (r0 == 0) goto L20
            int r0 = r6.arrayOffset()
            byte[] r1 = r6.array()
            int r2 = r6.position()
            int r2 = r2 + r0
            int r3 = r6.remaining()
            int r5 = encodeUtf8Array(r5, r1, r2, r3)
            int r5 = r5 - r0
            r6.position(r5)
            goto L23
        L20:
            encodeUtf8Buffer(r5, r6)
        L23:
            return
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public int encodedLength(java.lang.CharSequence r1) {
            r0 = this;
            int r1 = computeEncodedLength(r1)
            return r1
    }
}
