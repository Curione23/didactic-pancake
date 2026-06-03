package org.lwjgl.stb;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBVorbisComment.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBVorbisComment.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBVorbisComment.class */
@org.lwjgl.system.NativeType("struct stb_vorbis_comment")
public class STBVorbisComment extends org.lwjgl.system.Struct<org.lwjgl.stb.STBVorbisComment> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int VENDOR = 0;
    public static final int COMMENT_LIST_LENGTH = 0;
    public static final int COMMENT_LIST = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBVorbisComment$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBVorbisComment$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBVorbisComment$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.stb.STBVorbisComment, org.lwjgl.stb.STBVorbisComment.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.stb.STBVorbisComment ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.stb.STBVorbisComment.SIZEOF
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
        protected org.lwjgl.stb.STBVorbisComment.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.stb.STBVorbisComment getElementFactory() {
                r2 = this;
                org.lwjgl.stb.STBVorbisComment r0 = org.lwjgl.stb.STBVorbisComment.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("char *")
        public java.nio.ByteBuffer vendor() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.stb.STBVorbisComment.nvendor(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("char *")
        public java.lang.String vendorString() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.lang.String r0 = org.lwjgl.stb.STBVorbisComment.nvendorString(r0)
                return r0
        }

        public int comment_list_length() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.stb.STBVorbisComment.ncomment_list_length(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("char **")
        public org.lwjgl.PointerBuffer comment_list() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.PointerBuffer r0 = org.lwjgl.stb.STBVorbisComment.ncomment_list(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.stb.STBVorbisComment r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.stb.STBVorbisComment$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.stb.STBVorbisComment r0 = org.lwjgl.stb.STBVorbisComment.create(r0)
                org.lwjgl.stb.STBVorbisComment.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected STBVorbisComment(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.stb.STBVorbisComment create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.stb.STBVorbisComment r0 = new org.lwjgl.stb.STBVorbisComment
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public STBVorbisComment(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.stb.STBVorbisComment.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.stb.STBVorbisComment.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("char *")
    public java.nio.ByteBuffer vendor() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nvendor(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("char *")
    public java.lang.String vendorString() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.lang.String r0 = nvendorString(r0)
            return r0
    }

    public int comment_list_length() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncomment_list_length(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("char **")
    public org.lwjgl.PointerBuffer comment_list() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.PointerBuffer r0 = ncomment_list(r0)
            return r0
    }

    public static org.lwjgl.stb.STBVorbisComment malloc() {
            org.lwjgl.stb.STBVorbisComment r0 = new org.lwjgl.stb.STBVorbisComment
            r1 = r0
            int r2 = org.lwjgl.stb.STBVorbisComment.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBVorbisComment calloc() {
            org.lwjgl.stb.STBVorbisComment r0 = new org.lwjgl.stb.STBVorbisComment
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.stb.STBVorbisComment.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBVorbisComment create() {
            int r0 = org.lwjgl.stb.STBVorbisComment.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.stb.STBVorbisComment r0 = new org.lwjgl.stb.STBVorbisComment
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBVorbisComment create(long r6) {
            org.lwjgl.stb.STBVorbisComment r0 = new org.lwjgl.stb.STBVorbisComment
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.stb.STBVorbisComment createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.stb.STBVorbisComment r0 = new org.lwjgl.stb.STBVorbisComment
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.stb.STBVorbisComment.Buffer malloc(int r6) {
            org.lwjgl.stb.STBVorbisComment$Buffer r0 = new org.lwjgl.stb.STBVorbisComment$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.stb.STBVorbisComment.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBVorbisComment.Buffer calloc(int r7) {
            org.lwjgl.stb.STBVorbisComment$Buffer r0 = new org.lwjgl.stb.STBVorbisComment$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.stb.STBVorbisComment.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBVorbisComment.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.stb.STBVorbisComment.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.stb.STBVorbisComment$Buffer r0 = new org.lwjgl.stb.STBVorbisComment$Buffer
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

    public static org.lwjgl.stb.STBVorbisComment.Buffer create(long r6, int r8) {
            org.lwjgl.stb.STBVorbisComment$Buffer r0 = new org.lwjgl.stb.STBVorbisComment$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.stb.STBVorbisComment.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.stb.STBVorbisComment$Buffer r0 = new org.lwjgl.stb.STBVorbisComment$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.stb.STBVorbisComment malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.stb.STBVorbisComment r0 = new org.lwjgl.stb.STBVorbisComment
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.stb.STBVorbisComment.ALIGNOF
            int r4 = org.lwjgl.stb.STBVorbisComment.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBVorbisComment calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.stb.STBVorbisComment r0 = new org.lwjgl.stb.STBVorbisComment
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.stb.STBVorbisComment.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.stb.STBVorbisComment.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBVorbisComment.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.stb.STBVorbisComment$Buffer r0 = new org.lwjgl.stb.STBVorbisComment$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.stb.STBVorbisComment.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.stb.STBVorbisComment.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBVorbisComment.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.stb.STBVorbisComment$Buffer r0 = new org.lwjgl.stb.STBVorbisComment$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.stb.STBVorbisComment.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.stb.STBVorbisComment.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static java.nio.ByteBuffer nvendor(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBVorbisComment.VENDOR
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferNT1(r0)
            return r0
    }

    public static java.lang.String nvendorString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBVorbisComment.VENDOR
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCII(r0)
            return r0
    }

    public static int ncomment_list_length(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.stb.STBVorbisComment.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.stb.STBVorbisComment.COMMENT_LIST_LENGTH
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.PointerBuffer ncomment_list(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBVorbisComment.COMMENT_LIST
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = ncomment_list_length(r1)
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBuffer(r0, r1)
            return r0
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.stb.STBVorbisComment r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 3
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.stb.STBVorbisComment.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.stb.STBVorbisComment.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.stb.STBVorbisComment.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.stb.STBVorbisComment.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBVorbisComment.VENDOR = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBVorbisComment.COMMENT_LIST_LENGTH = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBVorbisComment.COMMENT_LIST = r0
            return
    }
}
