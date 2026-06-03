package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes.dex */
public final class StringVector extends androidx.emoji2.text.flatbuffer.BaseVector {
    private androidx.emoji2.text.flatbuffer.Utf8 utf8;

    public StringVector() {
            r1 = this;
            r1.<init>()
            androidx.emoji2.text.flatbuffer.Utf8 r0 = androidx.emoji2.text.flatbuffer.Utf8.getDefault()
            r1.utf8 = r0
            return
    }

    public androidx.emoji2.text.flatbuffer.StringVector __assign(int r1, int r2, java.nio.ByteBuffer r3) {
            r0 = this;
            r0.__reset(r1, r2, r3)
            return r0
    }

    public java.lang.String get(int r3) {
            r2 = this;
            int r3 = r2.__element(r3)
            java.nio.ByteBuffer r0 = r2.bb
            androidx.emoji2.text.flatbuffer.Utf8 r1 = r2.utf8
            java.lang.String r3 = androidx.emoji2.text.flatbuffer.Table.__string(r3, r0, r1)
            return r3
    }
}
