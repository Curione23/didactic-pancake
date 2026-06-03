package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes.dex */
public class Table {
    protected java.nio.ByteBuffer bb;
    protected int bb_pos;
    androidx.emoji2.text.flatbuffer.Utf8 utf8;
    private int vtable_size;
    private int vtable_start;


    public Table() {
            r1 = this;
            r1.<init>()
            androidx.emoji2.text.flatbuffer.Utf8 r0 = androidx.emoji2.text.flatbuffer.Utf8.getDefault()
            r1.utf8 = r0
            return
    }

    protected static boolean __has_identifier(java.nio.ByteBuffer r5, java.lang.String r6) {
            int r0 = r6.length()
            r1 = 4
            if (r0 != r1) goto L22
            r0 = 0
            r2 = r0
        L9:
            if (r2 >= r1) goto L20
            char r3 = r6.charAt(r2)
            int r4 = r5.position()
            int r4 = r4 + r1
            int r4 = r4 + r2
            byte r4 = r5.get(r4)
            char r4 = (char) r4
            if (r3 == r4) goto L1d
            return r0
        L1d:
            int r2 = r2 + 1
            goto L9
        L20:
            r5 = 1
            return r5
        L22:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            java.lang.String r6 = "FlatBuffers: file identifier must be length 4"
            r5.<init>(r6)
            throw r5
    }

    protected static int __indirect(int r0, java.nio.ByteBuffer r1) {
            int r1 = r1.getInt(r0)
            int r0 = r0 + r1
            return r0
    }

    protected static int __offset(int r1, int r2, java.nio.ByteBuffer r3) {
            int r0 = r3.capacity()
            int r0 = r0 - r2
            int r1 = r1 + r0
            int r2 = r3.getInt(r0)
            int r1 = r1 - r2
            short r1 = r3.getShort(r1)
            int r1 = r1 + r0
            return r1
    }

    protected static java.lang.String __string(int r1, java.nio.ByteBuffer r2, androidx.emoji2.text.flatbuffer.Utf8 r3) {
            int r0 = r2.getInt(r1)
            int r1 = r1 + r0
            int r0 = r2.getInt(r1)
            int r1 = r1 + 4
            java.lang.String r1 = r3.decodeUtf8(r2, r1, r0)
            return r1
    }

    protected static androidx.emoji2.text.flatbuffer.Table __union(androidx.emoji2.text.flatbuffer.Table r0, int r1, java.nio.ByteBuffer r2) {
            int r1 = __indirect(r1, r2)
            r0.__reset(r1, r2)
            return r0
    }

    protected static int compareStrings(int r8, int r9, java.nio.ByteBuffer r10) {
            int r0 = r10.getInt(r8)
            int r8 = r8 + r0
            int r0 = r10.getInt(r9)
            int r9 = r9 + r0
            int r0 = r10.getInt(r8)
            int r1 = r10.getInt(r9)
            int r8 = r8 + 4
            int r9 = r9 + 4
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
        L1b:
            if (r3 >= r2) goto L38
            int r4 = r3 + r8
            byte r5 = r10.get(r4)
            int r6 = r3 + r9
            byte r7 = r10.get(r6)
            if (r5 == r7) goto L35
            byte r8 = r10.get(r4)
            byte r9 = r10.get(r6)
            int r8 = r8 - r9
            return r8
        L35:
            int r3 = r3 + 1
            goto L1b
        L38:
            int r0 = r0 - r1
            return r0
    }

    protected static int compareStrings(int r7, byte[] r8, java.nio.ByteBuffer r9) {
            int r0 = r9.getInt(r7)
            int r7 = r7 + r0
            int r0 = r9.getInt(r7)
            int r1 = r8.length
            int r7 = r7 + 4
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
        L11:
            if (r3 >= r2) goto L28
            int r4 = r3 + r7
            byte r5 = r9.get(r4)
            r6 = r8[r3]
            if (r5 == r6) goto L25
            byte r7 = r9.get(r4)
            r8 = r8[r3]
            int r7 = r7 - r8
            return r7
        L25:
            int r3 = r3 + 1
            goto L11
        L28:
            int r0 = r0 - r1
            return r0
    }

    protected int __indirect(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.bb
            int r0 = r0.getInt(r2)
            int r2 = r2 + r0
            return r2
    }

    protected int __offset(int r3) {
            r2 = this;
            int r0 = r2.vtable_size
            if (r3 >= r0) goto Le
            java.nio.ByteBuffer r0 = r2.bb
            int r1 = r2.vtable_start
            int r1 = r1 + r3
            short r3 = r0.getShort(r1)
            goto Lf
        Le:
            r3 = 0
        Lf:
            return r3
    }

    public void __reset() {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.__reset(r0, r1)
            return
    }

    protected void __reset(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            r0.bb = r2
            if (r2 == 0) goto L16
            r0.bb_pos = r1
            int r2 = r2.getInt(r1)
            int r1 = r1 - r2
            r0.vtable_start = r1
            java.nio.ByteBuffer r2 = r0.bb
            short r1 = r2.getShort(r1)
            r0.vtable_size = r1
            goto L1d
        L16:
            r1 = 0
            r0.bb_pos = r1
            r0.vtable_start = r1
            r0.vtable_size = r1
        L1d:
            return
    }

    protected java.lang.String __string(int r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.bb
            androidx.emoji2.text.flatbuffer.Utf8 r1 = r2.utf8
            java.lang.String r3 = __string(r3, r0, r1)
            return r3
    }

    protected androidx.emoji2.text.flatbuffer.Table __union(androidx.emoji2.text.flatbuffer.Table r2, int r3) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.bb
            androidx.emoji2.text.flatbuffer.Table r2 = __union(r2, r3, r0)
            return r2
    }

    protected int __vector(int r2) {
            r1 = this;
            int r0 = r1.bb_pos
            int r2 = r2 + r0
            java.nio.ByteBuffer r0 = r1.bb
            int r0 = r0.getInt(r2)
            int r2 = r2 + r0
            int r2 = r2 + 4
            return r2
    }

    protected java.nio.ByteBuffer __vector_as_bytebuffer(int r3, int r4) {
            r2 = this;
            int r3 = r2.__offset(r3)
            if (r3 != 0) goto L8
            r3 = 0
            return r3
        L8:
            java.nio.ByteBuffer r0 = r2.bb
            java.nio.ByteBuffer r0 = r0.duplicate()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r0 = r0.order(r1)
            int r1 = r2.__vector(r3)
            r0.position(r1)
            int r3 = r2.__vector_len(r3)
            int r3 = r3 * r4
            int r1 = r1 + r3
            r0.limit(r1)
            return r0
    }

    protected java.nio.ByteBuffer __vector_in_bytebuffer(java.nio.ByteBuffer r2, int r3, int r4) {
            r1 = this;
            int r3 = r1.__offset(r3)
            if (r3 != 0) goto L8
            r2 = 0
            return r2
        L8:
            int r0 = r1.__vector(r3)
            r2.rewind()
            int r3 = r1.__vector_len(r3)
            int r3 = r3 * r4
            int r3 = r3 + r0
            r2.limit(r3)
            r2.position(r0)
            return r2
    }

    protected int __vector_len(int r2) {
            r1 = this;
            int r0 = r1.bb_pos
            int r2 = r2 + r0
            java.nio.ByteBuffer r0 = r1.bb
            int r0 = r0.getInt(r2)
            int r2 = r2 + r0
            java.nio.ByteBuffer r0 = r1.bb
            int r2 = r0.getInt(r2)
            return r2
    }

    public java.nio.ByteBuffer getByteBuffer() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.bb
            return r0
    }

    protected int keysCompare(java.lang.Integer r1, java.lang.Integer r2, java.nio.ByteBuffer r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    protected void sortTables(int[] r5, java.nio.ByteBuffer r6) {
            r4 = this;
            int r0 = r5.length
            java.lang.Integer[] r0 = new java.lang.Integer[r0]
            r1 = 0
            r2 = r1
        L5:
            int r3 = r5.length
            if (r2 >= r3) goto L13
            r3 = r5[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r2] = r3
            int r2 = r2 + 1
            goto L5
        L13:
            androidx.emoji2.text.flatbuffer.Table$1 r2 = new androidx.emoji2.text.flatbuffer.Table$1
            r2.<init>(r4, r6)
            java.util.Arrays.sort(r0, r2)
        L1b:
            int r6 = r5.length
            if (r1 >= r6) goto L29
            r6 = r0[r1]
            int r6 = r6.intValue()
            r5[r1] = r6
            int r1 = r1 + 1
            goto L1b
        L29:
            return
    }
}
