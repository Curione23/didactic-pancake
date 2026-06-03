package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/BDF_Property.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/BDF_Property.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/BDF_Property.class */
@org.lwjgl.system.NativeType("struct BDF_PropertyRec")
public class BDF_Property extends org.lwjgl.system.Struct<org.lwjgl.util.freetype.BDF_Property> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int TYPE = 0;
    public static final int U = 0;
    public static final int U_ATOM = 0;
    public static final int U_INTEGER = 0;
    public static final int U_CARDINAL = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/BDF_Property$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/BDF_Property$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/BDF_Property$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.freetype.BDF_Property, org.lwjgl.util.freetype.BDF_Property.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.util.freetype.BDF_Property ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.freetype.BDF_Property.SIZEOF
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
        protected org.lwjgl.util.freetype.BDF_Property.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.freetype.BDF_Property getElementFactory() {
                r2 = this;
                org.lwjgl.util.freetype.BDF_Property r0 = org.lwjgl.util.freetype.BDF_Property.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("BDF_PropertyType")
        public int type() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.BDF_Property.ntype(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("char const *")
        public java.nio.ByteBuffer u_atom() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.util.freetype.BDF_Property.nu_atom(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("char const *")
        public java.lang.String u_atomString() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.lang.String r0 = org.lwjgl.util.freetype.BDF_Property.nu_atomString(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Int32")
        public int u_integer() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.BDF_Property.nu_integer(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UInt32")
        public int u_cardinal() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.BDF_Property.nu_cardinal(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.BDF_Property r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.BDF_Property$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.freetype.BDF_Property r0 = org.lwjgl.util.freetype.BDF_Property.create(r0)
                org.lwjgl.util.freetype.BDF_Property.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected BDF_Property(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.freetype.BDF_Property create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.freetype.BDF_Property r0 = new org.lwjgl.util.freetype.BDF_Property
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public BDF_Property(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.freetype.BDF_Property.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.freetype.BDF_Property.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("BDF_PropertyType")
    public int type() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ntype(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public java.nio.ByteBuffer u_atom() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nu_atom(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public java.lang.String u_atomString() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.lang.String r0 = nu_atomString(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Int32")
    public int u_integer() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nu_integer(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UInt32")
    public int u_cardinal() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nu_cardinal(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.BDF_Property malloc() {
            org.lwjgl.util.freetype.BDF_Property r0 = new org.lwjgl.util.freetype.BDF_Property
            r1 = r0
            int r2 = org.lwjgl.util.freetype.BDF_Property.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.BDF_Property calloc() {
            org.lwjgl.util.freetype.BDF_Property r0 = new org.lwjgl.util.freetype.BDF_Property
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.freetype.BDF_Property.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.BDF_Property create() {
            int r0 = org.lwjgl.util.freetype.BDF_Property.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.util.freetype.BDF_Property r0 = new org.lwjgl.util.freetype.BDF_Property
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.BDF_Property create(long r6) {
            org.lwjgl.util.freetype.BDF_Property r0 = new org.lwjgl.util.freetype.BDF_Property
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.BDF_Property createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.BDF_Property r0 = new org.lwjgl.util.freetype.BDF_Property
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.BDF_Property.Buffer malloc(int r6) {
            org.lwjgl.util.freetype.BDF_Property$Buffer r0 = new org.lwjgl.util.freetype.BDF_Property$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.freetype.BDF_Property.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.BDF_Property.Buffer calloc(int r7) {
            org.lwjgl.util.freetype.BDF_Property$Buffer r0 = new org.lwjgl.util.freetype.BDF_Property$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.util.freetype.BDF_Property.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.BDF_Property.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.util.freetype.BDF_Property.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.util.freetype.BDF_Property$Buffer r0 = new org.lwjgl.util.freetype.BDF_Property$Buffer
            r1 = r0
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r11
            r4 = -1
            r5 = 0
            r6 = r10
            r7 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
    }

    public static org.lwjgl.util.freetype.BDF_Property.Buffer create(long r6, int r8) {
            org.lwjgl.util.freetype.BDF_Property$Buffer r0 = new org.lwjgl.util.freetype.BDF_Property$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.BDF_Property.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.BDF_Property$Buffer r0 = new org.lwjgl.util.freetype.BDF_Property$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.BDF_Property malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.util.freetype.BDF_Property r0 = new org.lwjgl.util.freetype.BDF_Property
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.freetype.BDF_Property.ALIGNOF
            int r4 = org.lwjgl.util.freetype.BDF_Property.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.BDF_Property calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.util.freetype.BDF_Property r0 = new org.lwjgl.util.freetype.BDF_Property
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.BDF_Property.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.util.freetype.BDF_Property.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.BDF_Property.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.freetype.BDF_Property$Buffer r0 = new org.lwjgl.util.freetype.BDF_Property$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.freetype.BDF_Property.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.freetype.BDF_Property.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.BDF_Property.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.freetype.BDF_Property$Buffer r0 = new org.lwjgl.util.freetype.BDF_Property$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.freetype.BDF_Property.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.freetype.BDF_Property.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int ntype(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.BDF_Property.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.BDF_Property.TYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.ByteBuffer nu_atom(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.BDF_Property.U_ATOM
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferNT1Safe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static java.lang.String nu_atomString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.BDF_Property.U_ATOM
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCIISafe(r0)
            return r0
    }

    public static int nu_integer(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.BDF_Property.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.BDF_Property.U_INTEGER
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nu_cardinal(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.BDF_Property.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.BDF_Property.U_CARDINAL
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
            org.lwjgl.util.freetype.BDF_Property r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 2
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 3
            org.lwjgl.system.Struct$Member[] r3 = new org.lwjgl.system.Struct.Member[r3]
            r4 = r3
            r5 = 0
            int r6 = org.lwjgl.util.freetype.BDF_Property.POINTER_SIZE
            org.lwjgl.system.Struct$Member r6 = __member(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 4
            org.lwjgl.system.Struct$Member r6 = __member(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = 4
            org.lwjgl.system.Struct$Member r6 = __member(r6)
            r4[r5] = r6
            org.lwjgl.system.Struct$Layout r3 = __union(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r8 = r0
            r0 = r8
            int r0 = r0.getSize()
            org.lwjgl.util.freetype.BDF_Property.SIZEOF = r0
            r0 = r8
            int r0 = r0.getAlignment()
            org.lwjgl.util.freetype.BDF_Property.ALIGNOF = r0
            r0 = r8
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.BDF_Property.TYPE = r0
            r0 = r8
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.BDF_Property.U = r0
            r0 = r8
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.BDF_Property.U_ATOM = r0
            r0 = r8
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.BDF_Property.U_INTEGER = r0
            r0 = r8
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.BDF_Property.U_CARDINAL = r0
            return
    }
}
