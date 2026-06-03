package org.lwjgl.stb;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBTTFontinfo.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBTTFontinfo.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBTTFontinfo.class */
@org.lwjgl.system.NativeType("struct stbtt_fontinfo")
public class STBTTFontinfo extends org.lwjgl.system.Struct<org.lwjgl.stb.STBTTFontinfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBTTFontinfo$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBTTFontinfo$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBTTFontinfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.stb.STBTTFontinfo, org.lwjgl.stb.STBTTFontinfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.stb.STBTTFontinfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.stb.STBTTFontinfo.SIZEOF
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
        protected org.lwjgl.stb.STBTTFontinfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.stb.STBTTFontinfo getElementFactory() {
                r2 = this;
                org.lwjgl.stb.STBTTFontinfo r0 = org.lwjgl.stb.STBTTFontinfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.stb.STBTTFontinfo r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.stb.STBTTFontinfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.stb.STBTTFontinfo r0 = org.lwjgl.stb.STBTTFontinfo.create(r0)
                org.lwjgl.stb.STBTTFontinfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    private static native int offsets(long r0);

    protected STBTTFontinfo(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.stb.STBTTFontinfo create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.stb.STBTTFontinfo r0 = new org.lwjgl.stb.STBTTFontinfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public STBTTFontinfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.stb.STBTTFontinfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.stb.STBTTFontinfo.SIZEOF
            return r0
    }

    public static org.lwjgl.stb.STBTTFontinfo malloc() {
            org.lwjgl.stb.STBTTFontinfo r0 = new org.lwjgl.stb.STBTTFontinfo
            r1 = r0
            int r2 = org.lwjgl.stb.STBTTFontinfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBTTFontinfo calloc() {
            org.lwjgl.stb.STBTTFontinfo r0 = new org.lwjgl.stb.STBTTFontinfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.stb.STBTTFontinfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBTTFontinfo create() {
            int r0 = org.lwjgl.stb.STBTTFontinfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.stb.STBTTFontinfo r0 = new org.lwjgl.stb.STBTTFontinfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBTTFontinfo create(long r6) {
            org.lwjgl.stb.STBTTFontinfo r0 = new org.lwjgl.stb.STBTTFontinfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.stb.STBTTFontinfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.stb.STBTTFontinfo r0 = new org.lwjgl.stb.STBTTFontinfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.stb.STBTTFontinfo.Buffer malloc(int r6) {
            org.lwjgl.stb.STBTTFontinfo$Buffer r0 = new org.lwjgl.stb.STBTTFontinfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.stb.STBTTFontinfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBTTFontinfo.Buffer calloc(int r7) {
            org.lwjgl.stb.STBTTFontinfo$Buffer r0 = new org.lwjgl.stb.STBTTFontinfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.stb.STBTTFontinfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBTTFontinfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.stb.STBTTFontinfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.stb.STBTTFontinfo$Buffer r0 = new org.lwjgl.stb.STBTTFontinfo$Buffer
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

    public static org.lwjgl.stb.STBTTFontinfo.Buffer create(long r6, int r8) {
            org.lwjgl.stb.STBTTFontinfo$Buffer r0 = new org.lwjgl.stb.STBTTFontinfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.stb.STBTTFontinfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.stb.STBTTFontinfo$Buffer r0 = new org.lwjgl.stb.STBTTFontinfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.stb.STBTTFontinfo mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.stb.STBTTFontinfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.stb.STBTTFontinfo callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.stb.STBTTFontinfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.stb.STBTTFontinfo mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.stb.STBTTFontinfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.stb.STBTTFontinfo callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.stb.STBTTFontinfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.stb.STBTTFontinfo.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.stb.STBTTFontinfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.stb.STBTTFontinfo.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.stb.STBTTFontinfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.stb.STBTTFontinfo.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.stb.STBTTFontinfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.stb.STBTTFontinfo.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.stb.STBTTFontinfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.stb.STBTTFontinfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.stb.STBTTFontinfo r0 = new org.lwjgl.stb.STBTTFontinfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.stb.STBTTFontinfo.ALIGNOF
            int r4 = org.lwjgl.stb.STBTTFontinfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBTTFontinfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.stb.STBTTFontinfo r0 = new org.lwjgl.stb.STBTTFontinfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.stb.STBTTFontinfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.stb.STBTTFontinfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBTTFontinfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.stb.STBTTFontinfo$Buffer r0 = new org.lwjgl.stb.STBTTFontinfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.stb.STBTTFontinfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.stb.STBTTFontinfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBTTFontinfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.stb.STBTTFontinfo$Buffer r0 = new org.lwjgl.stb.STBTTFontinfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.stb.STBTTFontinfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.stb.STBTTFontinfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.stb.STBTTFontinfo r0 = r0.create(r1, r2)
            return r0
    }

    static {
            org.lwjgl.stb.LibSTB.initialize()
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackPush()
            r3 = r0
            r0 = 0
            r4 = r0
            r0 = r3
            r1 = 1
            java.nio.IntBuffer r0 = r0.mallocInt(r1)     // Catch: java.lang.Throwable -> L40 java.lang.Throwable -> L45
            r5 = r0
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)     // Catch: java.lang.Throwable -> L40 java.lang.Throwable -> L45
            int r0 = offsets(r0)     // Catch: java.lang.Throwable -> L40 java.lang.Throwable -> L45
            org.lwjgl.stb.STBTTFontinfo.SIZEOF = r0     // Catch: java.lang.Throwable -> L40 java.lang.Throwable -> L45
            r0 = r5
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L40 java.lang.Throwable -> L45
            org.lwjgl.stb.STBTTFontinfo.ALIGNOF = r0     // Catch: java.lang.Throwable -> L40 java.lang.Throwable -> L45
            r0 = r3
            if (r0 == 0) goto L66
            r0 = r4
            if (r0 == 0) goto L39
            r0 = r3
            r0.close()     // Catch: java.lang.Throwable -> L30
            goto L66
        L30:
            r5 = move-exception
            r0 = r4
            r1 = r5
            r0.addSuppressed(r1)
            goto L66
        L39:
            r0 = r3
            r0.close()
            goto L66
        L40:
            r5 = move-exception
            r0 = r5
            r4 = r0
            r0 = r5
            throw r0     // Catch: java.lang.Throwable -> L45
        L45:
            r6 = move-exception
            r0 = r3
            if (r0 == 0) goto L64
            r0 = r4
            if (r0 == 0) goto L60
            r0 = r3
            r0.close()     // Catch: java.lang.Throwable -> L55
            goto L64
        L55:
            r7 = move-exception
            r0 = r4
            r1 = r7
            r0.addSuppressed(r1)
            goto L64
        L60:
            r0 = r3
            r0.close()
        L64:
            r0 = r6
            throw r0
        L66:
            return
    }
}
