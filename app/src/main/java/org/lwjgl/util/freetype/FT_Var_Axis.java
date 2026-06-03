package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Var_Axis.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Var_Axis.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Var_Axis.class */
public class FT_Var_Axis extends org.lwjgl.system.Struct<org.lwjgl.util.freetype.FT_Var_Axis> {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int NAME = 0;
    public static final int MINIMUM = 0;
    public static final int DEF = 0;
    public static final int MAXIMUM = 0;
    public static final int TAG = 0;
    public static final int STRID = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Var_Axis$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Var_Axis$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Var_Axis$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.freetype.FT_Var_Axis, org.lwjgl.util.freetype.FT_Var_Axis.Buffer> {
        private static final org.lwjgl.util.freetype.FT_Var_Axis ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.freetype.FT_Var_Axis.SIZEOF
                int r2 = r2 / r3
                r0.<init>(r1, r2)
                return
        }

        public Buffer(long r10, int r12) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = 0
                r3 = -1
                r4 = 0
                r5 = r12
                r6 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        Buffer(long r10, @javax.annotation.Nullable java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected org.lwjgl.util.freetype.FT_Var_Axis.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.freetype.FT_Var_Axis getElementFactory() {
                r2 = this;
                org.lwjgl.util.freetype.FT_Var_Axis r0 = org.lwjgl.util.freetype.FT_Var_Axis.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("FT_String *")
        public java.nio.ByteBuffer name() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.util.freetype.FT_Var_Axis.nname(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_String *")
        public java.lang.String nameString() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.lang.String r0 = org.lwjgl.util.freetype.FT_Var_Axis.nnameString(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Fixed")
        public long minimum() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_Var_Axis.nminimum(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Fixed")
        public long def() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_Var_Axis.ndef(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Fixed")
        public long maximum() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_Var_Axis.nmaximum(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_ULong")
        public long tag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_Var_Axis.ntag(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UInt")
        public int strid() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.FT_Var_Axis.nstrid(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_Var_Axis r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_Var_Axis$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.freetype.FT_Var_Axis r0 = org.lwjgl.util.freetype.FT_Var_Axis.create(r0)
                org.lwjgl.util.freetype.FT_Var_Axis.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected FT_Var_Axis(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.freetype.FT_Var_Axis create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.freetype.FT_Var_Axis r0 = new org.lwjgl.util.freetype.FT_Var_Axis
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public FT_Var_Axis(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Var_Axis.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.freetype.FT_Var_Axis.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("FT_String *")
    public java.nio.ByteBuffer name() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nname(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_String *")
    public java.lang.String nameString() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.lang.String r0 = nnameString(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Fixed")
    public long minimum() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nminimum(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Fixed")
    public long def() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ndef(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Fixed")
    public long maximum() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nmaximum(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_ULong")
    public long tag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ntag(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UInt")
    public int strid() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nstrid(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Var_Axis create(long r6) {
            org.lwjgl.util.freetype.FT_Var_Axis r0 = new org.lwjgl.util.freetype.FT_Var_Axis
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Var_Axis createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_Var_Axis r0 = new org.lwjgl.util.freetype.FT_Var_Axis
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Var_Axis.Buffer create(long r6, int r8) {
            org.lwjgl.util.freetype.FT_Var_Axis$Buffer r0 = new org.lwjgl.util.freetype.FT_Var_Axis$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Var_Axis.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_Var_Axis$Buffer r0 = new org.lwjgl.util.freetype.FT_Var_Axis$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static java.nio.ByteBuffer nname(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Var_Axis.NAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferNT1(r0)
            return r0
    }

    public static java.lang.String nnameString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Var_Axis.NAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8(r0)
            return r0
    }

    public static long nminimum(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Var_Axis.MINIMUM
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long ndef(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Var_Axis.DEF
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nmaximum(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Var_Axis.MAXIMUM
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long ntag(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Var_Axis.TAG
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static int nstrid(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Var_Axis.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Var_Axis.STRID
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.util.freetype.FT_Var_Axis r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 6
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.util.freetype.FT_Var_Axis.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.freetype.FT_Var_Axis.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.util.freetype.FT_Var_Axis.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.util.freetype.FT_Var_Axis.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.util.freetype.FT_Var_Axis.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.util.freetype.FT_Var_Axis.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.util.freetype.FT_Var_Axis.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Var_Axis.NAME = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Var_Axis.MINIMUM = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Var_Axis.DEF = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Var_Axis.MAXIMUM = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Var_Axis.TAG = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Var_Axis.STRID = r0
            return
    }
}
