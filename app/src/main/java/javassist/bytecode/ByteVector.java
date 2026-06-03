package javassist.bytecode;

/* JADX INFO: compiled from: Bytecode.java */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/ByteVector.class */
class ByteVector implements java.lang.Cloneable {
    private byte[] buffer;
    private int size;

    public ByteVector() {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = 64
            byte[] r1 = new byte[r1]
            r0.buffer = r1
            r0 = r3
            r1 = 0
            r0.size = r1
            return
    }

    public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r3 = this;
            r0 = r3
            java.lang.Object r0 = super.clone()
            javassist.bytecode.ByteVector r0 = (javassist.bytecode.ByteVector) r0
            r4 = r0
            r0 = r4
            r1 = r3
            byte[] r1 = r1.buffer
            java.lang.Object r1 = r1.clone()
            byte[] r1 = (byte[]) r1
            r0.buffer = r1
            r0 = r4
            return r0
    }

    public final int getSize() {
            r2 = this;
            r0 = r2
            int r0 = r0.size
            return r0
    }

    public final byte[] copy() {
            r6 = this;
            r0 = r6
            int r0 = r0.size
            byte[] r0 = new byte[r0]
            r7 = r0
            r0 = r6
            byte[] r0 = r0.buffer
            r1 = 0
            r2 = r7
            r3 = 0
            r4 = r6
            int r4 = r4.size
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r7
            return r0
    }

    public int read(int r5) {
            r4 = this;
            r0 = r5
            if (r0 < 0) goto Lc
            r0 = r4
            int r0 = r0.size
            r1 = r5
            if (r0 > r1) goto L15
        Lc:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            throw r0
        L15:
            r0 = r4
            byte[] r0 = r0.buffer
            r1 = r5
            r0 = r0[r1]
            return r0
    }

    public void write(int r5, int r6) {
            r4 = this;
            r0 = r5
            if (r0 < 0) goto Lc
            r0 = r4
            int r0 = r0.size
            r1 = r5
            if (r0 > r1) goto L15
        Lc:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            throw r0
        L15:
            r0 = r4
            byte[] r0 = r0.buffer
            r1 = r5
            r2 = r6
            byte r2 = (byte) r2
            r0[r1] = r2
            return
    }

    public void add(int r5) {
            r4 = this;
            r0 = r4
            r1 = 1
            r0.addGap(r1)
            r0 = r4
            byte[] r0 = r0.buffer
            r1 = r4
            int r1 = r1.size
            r2 = 1
            int r1 = r1 - r2
            r2 = r5
            byte r2 = (byte) r2
            r0[r1] = r2
            return
    }

    public void add(int r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = 2
            r0.addGap(r1)
            r0 = r4
            byte[] r0 = r0.buffer
            r1 = r4
            int r1 = r1.size
            r2 = 2
            int r1 = r1 - r2
            r2 = r5
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r4
            byte[] r0 = r0.buffer
            r1 = r4
            int r1 = r1.size
            r2 = 1
            int r1 = r1 - r2
            r2 = r6
            byte r2 = (byte) r2
            r0[r1] = r2
            return
    }

    public void add(int r5, int r6, int r7, int r8) {
            r4 = this;
            r0 = r4
            r1 = 4
            r0.addGap(r1)
            r0 = r4
            byte[] r0 = r0.buffer
            r1 = r4
            int r1 = r1.size
            r2 = 4
            int r1 = r1 - r2
            r2 = r5
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r4
            byte[] r0 = r0.buffer
            r1 = r4
            int r1 = r1.size
            r2 = 3
            int r1 = r1 - r2
            r2 = r6
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r4
            byte[] r0 = r0.buffer
            r1 = r4
            int r1 = r1.size
            r2 = 2
            int r1 = r1 - r2
            r2 = r7
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r4
            byte[] r0 = r0.buffer
            r1 = r4
            int r1 = r1.size
            r2 = 1
            int r1 = r1 - r2
            r2 = r8
            byte r2 = (byte) r2
            r0[r1] = r2
            return
    }

    public void addGap(int r7) {
            r6 = this;
            r0 = r6
            int r0 = r0.size
            r1 = r7
            int r0 = r0 + r1
            r1 = r6
            byte[] r1 = r1.buffer
            int r1 = r1.length
            if (r0 <= r1) goto L3d
            r0 = r6
            int r0 = r0.size
            r1 = 1
            int r0 = r0 << r1
            r8 = r0
            r0 = r8
            r1 = r6
            int r1 = r1.size
            r2 = r7
            int r1 = r1 + r2
            if (r0 >= r1) goto L26
            r0 = r6
            int r0 = r0.size
            r1 = r7
            int r0 = r0 + r1
            r8 = r0
        L26:
            r0 = r8
            byte[] r0 = new byte[r0]
            r9 = r0
            r0 = r6
            byte[] r0 = r0.buffer
            r1 = 0
            r2 = r9
            r3 = 0
            r4 = r6
            int r4 = r4.size
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r6
            r1 = r9
            r0.buffer = r1
        L3d:
            r0 = r6
            r1 = r0
            int r1 = r1.size
            r2 = r7
            int r1 = r1 + r2
            r0.size = r1
            return
    }
}
