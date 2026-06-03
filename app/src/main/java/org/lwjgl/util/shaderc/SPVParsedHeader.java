package org.lwjgl.util.shaderc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/shaderc/SPVParsedHeader.class */
@org.lwjgl.system.NativeType("struct spv_parsed_header_t")
public class SPVParsedHeader extends org.lwjgl.system.Struct<org.lwjgl.util.shaderc.SPVParsedHeader> {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int MAGIC = 0;
    public static final int VERSION = 0;
    public static final int GENERATOR = 0;
    public static final int BOUND = 0;
    public static final int RESERVED = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/shaderc/SPVParsedHeader$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.shaderc.SPVParsedHeader, org.lwjgl.util.shaderc.SPVParsedHeader.Buffer> {
        private static final org.lwjgl.util.shaderc.SPVParsedHeader ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.shaderc.SPVParsedHeader.SIZEOF
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

        Buffer(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
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
        protected org.lwjgl.util.shaderc.SPVParsedHeader.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.util.shaderc.SPVParsedHeader.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.util.shaderc.SPVParsedHeader$Buffer r0 = new org.lwjgl.util.shaderc.SPVParsedHeader$Buffer
                r1 = r0
                r2 = r11
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                r7 = r17
                r1.<init>(r2, r3, r4, r5, r6, r7)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.shaderc.SPVParsedHeader getElementFactory() {
                r2 = this;
                org.lwjgl.util.shaderc.SPVParsedHeader r0 = org.lwjgl.util.shaderc.SPVParsedHeader.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int magic() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.shaderc.SPVParsedHeader.nmagic(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int version() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.shaderc.SPVParsedHeader.nversion(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int generator() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.shaderc.SPVParsedHeader.ngenerator(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int bound() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.shaderc.SPVParsedHeader.nbound(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.shaderc.SPVParsedHeader r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m3703create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.util.shaderc.SPVParsedHeader$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.shaderc.SPVParsedHeader$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.shaderc.SPVParsedHeader r0 = org.lwjgl.util.shaderc.SPVParsedHeader.create(r0)
                org.lwjgl.util.shaderc.SPVParsedHeader.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected SPVParsedHeader(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.shaderc.SPVParsedHeader create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.shaderc.SPVParsedHeader r0 = new org.lwjgl.util.shaderc.SPVParsedHeader
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public SPVParsedHeader(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.shaderc.SPVParsedHeader.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.shaderc.SPVParsedHeader.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int magic() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmagic(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int version() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nversion(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int generator() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ngenerator(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int bound() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nbound(r0)
            return r0
    }

    public static org.lwjgl.util.shaderc.SPVParsedHeader create(long r6) {
            org.lwjgl.util.shaderc.SPVParsedHeader r0 = new org.lwjgl.util.shaderc.SPVParsedHeader
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.SPVParsedHeader createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.shaderc.SPVParsedHeader r0 = new org.lwjgl.util.shaderc.SPVParsedHeader
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.shaderc.SPVParsedHeader.Buffer create(long r6, int r8) {
            org.lwjgl.util.shaderc.SPVParsedHeader$Buffer r0 = new org.lwjgl.util.shaderc.SPVParsedHeader$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.SPVParsedHeader.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.shaderc.SPVParsedHeader$Buffer r0 = new org.lwjgl.util.shaderc.SPVParsedHeader$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static int nmagic(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.SPVParsedHeader.MAGIC
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nversion(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.SPVParsedHeader.VERSION
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int ngenerator(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.SPVParsedHeader.GENERATOR
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nbound(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.SPVParsedHeader.BOUND
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nreserved(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.SPVParsedHeader.RESERVED
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.util.shaderc.SPVParsedHeader r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 5
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.util.shaderc.SPVParsedHeader.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.util.shaderc.SPVParsedHeader.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.SPVParsedHeader.MAGIC = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.SPVParsedHeader.VERSION = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.SPVParsedHeader.GENERATOR = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.SPVParsedHeader.BOUND = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.SPVParsedHeader.RESERVED = r0
            return
    }
}
