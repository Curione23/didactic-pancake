package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes.dex */
public class Struct {
    protected java.nio.ByteBuffer bb;
    protected int bb_pos;

    public Struct() {
            r0 = this;
            r0.<init>()
            return
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
            if (r2 == 0) goto L7
            r0.bb_pos = r1
            goto La
        L7:
            r1 = 0
            r0.bb_pos = r1
        La:
            return
    }
}
