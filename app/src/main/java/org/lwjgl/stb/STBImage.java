package org.lwjgl.stb;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBImage.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBImage.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBImage.class */
public class STBImage {
    public static final int STBI_default = 0;
    public static final int STBI_grey = 1;
    public static final int STBI_grey_alpha = 2;
    public static final int STBI_rgb = 3;
    public static final int STBI_rgb_alpha = 4;

    protected STBImage() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native long nstbi_load(long r0, long r2, long r4, long r6, int r8);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("stbi_uc *")
    public static java.nio.ByteBuffer stbi_load(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r10, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r11, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r12, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r13, int r14) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r10
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r10
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r11
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r14
            long r0 = nstbi_load(r0, r1, r2, r3, r4)
            r15 = r0
            r0 = r15
            r1 = r11
            r2 = r11
            int r2 = r2.position()
            int r1 = r1.get(r2)
            r2 = r12
            r3 = r12
            int r3 = r3.position()
            int r2 = r2.get(r3)
            int r1 = r1 * r2
            r2 = r14
            if (r2 == 0) goto L4d
            r2 = r14
            goto L55
        L4d:
            r2 = r13
            r3 = r13
            int r3 = r3.position()
            int r2 = r2.get(r3)
        L55:
            int r1 = r1 * r2
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("stbi_uc *")
    public static java.nio.ByteBuffer stbi_load(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r10, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r11, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r12, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r13, int r14) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L15:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r15 = r0
            r0 = r15
            int r0 = r0.getPointer()
            r16 = r0
            r0 = r15
            r1 = r10
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L7a
            r0 = r15
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L7a
            r17 = r0
            r0 = r17
            r1 = r11
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L7a
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L7a
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L7a
            r4 = r14
            long r0 = nstbi_load(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L7a
            r19 = r0
            r0 = r19
            r1 = r11
            r2 = r11
            int r2 = r2.position()     // Catch: java.lang.Throwable -> L7a
            int r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L7a
            r2 = r12
            r3 = r12
            int r3 = r3.position()     // Catch: java.lang.Throwable -> L7a
            int r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L7a
            int r1 = r1 * r2
            r2 = r14
            if (r2 == 0) goto L62
            r2 = r14
            goto L6a
        L62:
            r2 = r13
            r3 = r13
            int r3 = r3.position()     // Catch: java.lang.Throwable -> L7a
            int r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L7a
        L6a:
            int r1 = r1 * r2
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)     // Catch: java.lang.Throwable -> L7a
            r21 = r0
            r0 = r15
            r1 = r16
            r0.setPointer(r1)
            r0 = r21
            return r0
        L7a:
            r22 = move-exception
            r0 = r15
            r1 = r16
            r0.setPointer(r1)
            r0 = r22
            throw r0
    }

    public static native long nstbi_load_from_memory(long r0, int r2, long r3, long r5, long r7, int r9);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("stbi_uc *")
    public static java.nio.ByteBuffer stbi_load_from_memory(@org.lwjgl.system.NativeType("stbi_uc const *") java.nio.ByteBuffer r11, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r12, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r13, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r14, int r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L15:
            r0 = r11
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r11
            int r1 = r1.remaining()
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r14
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r15
            long r0 = nstbi_load_from_memory(r0, r1, r2, r3, r4, r5)
            r16 = r0
            r0 = r16
            r1 = r12
            r2 = r12
            int r2 = r2.position()
            int r1 = r1.get(r2)
            r2 = r13
            r3 = r13
            int r3 = r3.position()
            int r2 = r2.get(r3)
            int r1 = r1 * r2
            r2 = r15
            if (r2 == 0) goto L4d
            r2 = r15
            goto L55
        L4d:
            r2 = r14
            r3 = r14
            int r3 = r3.position()
            int r2 = r2.get(r3)
        L55:
            int r1 = r1 * r2
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    public static native long nstbi_load_from_callbacks(long r0, long r2, long r4, long r6, long r8, int r10);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("stbi_uc *")
    public static java.nio.ByteBuffer stbi_load_from_callbacks(@org.lwjgl.system.NativeType("stbi_io_callbacks const *") org.lwjgl.stb.STBIIOCallbacks r12, @org.lwjgl.system.NativeType("void *") long r13, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r15, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r16, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r17, int r18) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r16
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r17
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            long r0 = r0.address()
            org.lwjgl.stb.STBIIOCallbacks.validate(r0)
        L1e:
            r0 = r12
            long r0 = r0.address()
            r1 = r13
            r2 = r15
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r16
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r17
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r18
            long r0 = nstbi_load_from_callbacks(r0, r1, r2, r3, r4, r5)
            r19 = r0
            r0 = r19
            r1 = r15
            r2 = r15
            int r2 = r2.position()
            int r1 = r1.get(r2)
            r2 = r16
            r3 = r16
            int r3 = r3.position()
            int r2 = r2.get(r3)
            int r1 = r1 * r2
            r2 = r18
            if (r2 == 0) goto L57
            r2 = r18
            goto L61
        L57:
            r2 = r17
            r3 = r17
            int r3 = r3.position()
            int r2 = r2.get(r3)
        L61:
            int r1 = r1 * r2
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    public static native long nstbi_load_gif_from_memory(long r0, int r2, long r3, long r5, long r7, long r9, long r11, int r13);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("stbi_uc *")
    public static java.nio.ByteBuffer stbi_load_gif_from_memory(@org.lwjgl.system.NativeType("stbi_uc const *") java.nio.ByteBuffer r15, @org.lwjgl.system.NativeType("int **") org.lwjgl.PointerBuffer r16, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r17, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r18, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r19, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r20, int r21) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L21
            r0 = r16
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r17
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r18
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r19
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r20
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L21:
            r0 = r15
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r15
            int r1 = r1.remaining()
            r2 = r16
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r17
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r18
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r19
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            r6 = r20
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            r7 = r21
            long r0 = nstbi_load_gif_from_memory(r0, r1, r2, r3, r4, r5, r6, r7)
            r22 = r0
            r0 = r22
            r1 = r17
            r2 = r17
            int r2 = r2.position()
            int r1 = r1.get(r2)
            r2 = r18
            r3 = r18
            int r3 = r3.position()
            int r2 = r2.get(r3)
            int r1 = r1 * r2
            r2 = r19
            r3 = r19
            int r3 = r3.position()
            int r2 = r2.get(r3)
            int r1 = r1 * r2
            r2 = r21
            if (r2 == 0) goto L6e
            r2 = r21
            goto L78
        L6e:
            r2 = r20
            r3 = r20
            int r3 = r3.position()
            int r2 = r2.get(r3)
        L78:
            int r1 = r1 * r2
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    public static native long nstbi_load_16(long r0, long r2, long r4, long r6, int r8);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("stbi_us *")
    public static java.nio.ShortBuffer stbi_load_16(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r10, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r11, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r12, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r13, int r14) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r10
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r10
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r11
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r14
            long r0 = nstbi_load_16(r0, r1, r2, r3, r4)
            r15 = r0
            r0 = r15
            r1 = r11
            r2 = r11
            int r2 = r2.position()
            int r1 = r1.get(r2)
            r2 = r12
            r3 = r12
            int r3 = r3.position()
            int r2 = r2.get(r3)
            int r1 = r1 * r2
            r2 = r14
            if (r2 == 0) goto L4d
            r2 = r14
            goto L55
        L4d:
            r2 = r13
            r3 = r13
            int r3 = r3.position()
            int r2 = r2.get(r3)
        L55:
            int r1 = r1 * r2
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBufferSafe(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("stbi_us *")
    public static java.nio.ShortBuffer stbi_load_16(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r10, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r11, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r12, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r13, int r14) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L15:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r15 = r0
            r0 = r15
            int r0 = r0.getPointer()
            r16 = r0
            r0 = r15
            r1 = r10
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L7a
            r0 = r15
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L7a
            r17 = r0
            r0 = r17
            r1 = r11
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L7a
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L7a
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L7a
            r4 = r14
            long r0 = nstbi_load_16(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L7a
            r19 = r0
            r0 = r19
            r1 = r11
            r2 = r11
            int r2 = r2.position()     // Catch: java.lang.Throwable -> L7a
            int r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L7a
            r2 = r12
            r3 = r12
            int r3 = r3.position()     // Catch: java.lang.Throwable -> L7a
            int r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L7a
            int r1 = r1 * r2
            r2 = r14
            if (r2 == 0) goto L62
            r2 = r14
            goto L6a
        L62:
            r2 = r13
            r3 = r13
            int r3 = r3.position()     // Catch: java.lang.Throwable -> L7a
            int r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L7a
        L6a:
            int r1 = r1 * r2
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBufferSafe(r0, r1)     // Catch: java.lang.Throwable -> L7a
            r21 = r0
            r0 = r15
            r1 = r16
            r0.setPointer(r1)
            r0 = r21
            return r0
        L7a:
            r22 = move-exception
            r0 = r15
            r1 = r16
            r0.setPointer(r1)
            r0 = r22
            throw r0
    }

    public static native long nstbi_load_16_from_memory(long r0, int r2, long r3, long r5, long r7, int r9);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("stbi_us *")
    public static java.nio.ShortBuffer stbi_load_16_from_memory(@org.lwjgl.system.NativeType("stbi_uc const *") java.nio.ByteBuffer r11, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r12, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r13, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r14, int r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L15:
            r0 = r11
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r11
            int r1 = r1.remaining()
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r14
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r15
            long r0 = nstbi_load_16_from_memory(r0, r1, r2, r3, r4, r5)
            r16 = r0
            r0 = r16
            r1 = r12
            r2 = r12
            int r2 = r2.position()
            int r1 = r1.get(r2)
            r2 = r13
            r3 = r13
            int r3 = r3.position()
            int r2 = r2.get(r3)
            int r1 = r1 * r2
            r2 = r15
            if (r2 == 0) goto L4d
            r2 = r15
            goto L55
        L4d:
            r2 = r14
            r3 = r14
            int r3 = r3.position()
            int r2 = r2.get(r3)
        L55:
            int r1 = r1 * r2
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBufferSafe(r0, r1)
            return r0
    }

    public static native long nstbi_load_16_from_callbacks(long r0, long r2, long r4, long r6, long r8, int r10);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("stbi_us *")
    public static java.nio.ShortBuffer stbi_load_16_from_callbacks(@org.lwjgl.system.NativeType("stbi_io_callbacks const *") org.lwjgl.stb.STBIIOCallbacks r12, @org.lwjgl.system.NativeType("void *") long r13, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r15, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r16, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r17, int r18) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r16
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r17
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            long r0 = r0.address()
            org.lwjgl.stb.STBIIOCallbacks.validate(r0)
        L1e:
            r0 = r12
            long r0 = r0.address()
            r1 = r13
            r2 = r15
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r16
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r17
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r18
            long r0 = nstbi_load_16_from_callbacks(r0, r1, r2, r3, r4, r5)
            r19 = r0
            r0 = r19
            r1 = r15
            r2 = r15
            int r2 = r2.position()
            int r1 = r1.get(r2)
            r2 = r16
            r3 = r16
            int r3 = r3.position()
            int r2 = r2.get(r3)
            int r1 = r1 * r2
            r2 = r18
            if (r2 == 0) goto L57
            r2 = r18
            goto L61
        L57:
            r2 = r17
            r3 = r17
            int r3 = r3.position()
            int r2 = r2.get(r3)
        L61:
            int r1 = r1 * r2
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBufferSafe(r0, r1)
            return r0
    }

    public static native long nstbi_loadf(long r0, long r2, long r4, long r6, int r8);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("float *")
    public static java.nio.FloatBuffer stbi_loadf(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r10, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r11, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r12, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r13, int r14) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r10
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r10
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r11
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r14
            long r0 = nstbi_loadf(r0, r1, r2, r3, r4)
            r15 = r0
            r0 = r15
            r1 = r11
            r2 = r11
            int r2 = r2.position()
            int r1 = r1.get(r2)
            r2 = r12
            r3 = r12
            int r3 = r3.position()
            int r2 = r2.get(r3)
            int r1 = r1 * r2
            r2 = r14
            if (r2 == 0) goto L4d
            r2 = r14
            goto L55
        L4d:
            r2 = r13
            r3 = r13
            int r3 = r3.position()
            int r2 = r2.get(r3)
        L55:
            int r1 = r1 * r2
            java.nio.FloatBuffer r0 = org.lwjgl.system.MemoryUtil.memFloatBufferSafe(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("float *")
    public static java.nio.FloatBuffer stbi_loadf(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r10, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r11, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r12, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r13, int r14) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L15:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r15 = r0
            r0 = r15
            int r0 = r0.getPointer()
            r16 = r0
            r0 = r15
            r1 = r10
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L7a
            r0 = r15
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L7a
            r17 = r0
            r0 = r17
            r1 = r11
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L7a
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L7a
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L7a
            r4 = r14
            long r0 = nstbi_loadf(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L7a
            r19 = r0
            r0 = r19
            r1 = r11
            r2 = r11
            int r2 = r2.position()     // Catch: java.lang.Throwable -> L7a
            int r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L7a
            r2 = r12
            r3 = r12
            int r3 = r3.position()     // Catch: java.lang.Throwable -> L7a
            int r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L7a
            int r1 = r1 * r2
            r2 = r14
            if (r2 == 0) goto L62
            r2 = r14
            goto L6a
        L62:
            r2 = r13
            r3 = r13
            int r3 = r3.position()     // Catch: java.lang.Throwable -> L7a
            int r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L7a
        L6a:
            int r1 = r1 * r2
            java.nio.FloatBuffer r0 = org.lwjgl.system.MemoryUtil.memFloatBufferSafe(r0, r1)     // Catch: java.lang.Throwable -> L7a
            r21 = r0
            r0 = r15
            r1 = r16
            r0.setPointer(r1)
            r0 = r21
            return r0
        L7a:
            r22 = move-exception
            r0 = r15
            r1 = r16
            r0.setPointer(r1)
            r0 = r22
            throw r0
    }

    public static native long nstbi_loadf_from_memory(long r0, int r2, long r3, long r5, long r7, int r9);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("float *")
    public static java.nio.FloatBuffer stbi_loadf_from_memory(@org.lwjgl.system.NativeType("stbi_uc const *") java.nio.ByteBuffer r11, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r12, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r13, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r14, int r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L15:
            r0 = r11
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r11
            int r1 = r1.remaining()
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r14
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r15
            long r0 = nstbi_loadf_from_memory(r0, r1, r2, r3, r4, r5)
            r16 = r0
            r0 = r16
            r1 = r12
            r2 = r12
            int r2 = r2.position()
            int r1 = r1.get(r2)
            r2 = r13
            r3 = r13
            int r3 = r3.position()
            int r2 = r2.get(r3)
            int r1 = r1 * r2
            r2 = r15
            if (r2 == 0) goto L4d
            r2 = r15
            goto L55
        L4d:
            r2 = r14
            r3 = r14
            int r3 = r3.position()
            int r2 = r2.get(r3)
        L55:
            int r1 = r1 * r2
            java.nio.FloatBuffer r0 = org.lwjgl.system.MemoryUtil.memFloatBufferSafe(r0, r1)
            return r0
    }

    public static native long nstbi_loadf_from_callbacks(long r0, long r2, long r4, long r6, long r8, int r10);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("float *")
    public static java.nio.FloatBuffer stbi_loadf_from_callbacks(@org.lwjgl.system.NativeType("stbi_io_callbacks const *") org.lwjgl.stb.STBIIOCallbacks r12, @org.lwjgl.system.NativeType("void *") long r13, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r15, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r16, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r17, int r18) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r16
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r17
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            long r0 = r0.address()
            org.lwjgl.stb.STBIIOCallbacks.validate(r0)
        L1e:
            r0 = r12
            long r0 = r0.address()
            r1 = r13
            r2 = r15
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r16
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r17
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r18
            long r0 = nstbi_loadf_from_callbacks(r0, r1, r2, r3, r4, r5)
            r19 = r0
            r0 = r19
            r1 = r15
            r2 = r15
            int r2 = r2.position()
            int r1 = r1.get(r2)
            r2 = r16
            r3 = r16
            int r3 = r3.position()
            int r2 = r2.get(r3)
            int r1 = r1 * r2
            r2 = r18
            if (r2 == 0) goto L57
            r2 = r18
            goto L61
        L57:
            r2 = r17
            r3 = r17
            int r3 = r3.position()
            int r2 = r2.get(r3)
        L61:
            int r1 = r1 * r2
            java.nio.FloatBuffer r0 = org.lwjgl.system.MemoryUtil.memFloatBufferSafe(r0, r1)
            return r0
    }

    public static native void stbi_hdr_to_ldr_gamma(float r0);

    public static native void stbi_hdr_to_ldr_scale(float r0);

    public static native void stbi_ldr_to_hdr_gamma(float r0);

    public static native void stbi_ldr_to_hdr_scale(float r0);

    public static native int nstbi_is_hdr(long r0);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbi_is_hdr(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r3
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            int r0 = nstbi_is_hdr(r0)
            if (r0 == 0) goto L18
            r0 = 1
            goto L19
        L18:
            r0 = 0
        L19:
            return r0
    }

    @org.lwjgl.system.NativeType("int")
    public static boolean stbi_is_hdr(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = r4
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L2b
            r0 = r5
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L2b
            r7 = r0
            r0 = r7
            int r0 = nstbi_is_hdr(r0)     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L20
            r0 = 1
            goto L21
        L20:
            r0 = 0
        L21:
            r9 = r0
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r9
            return r0
        L2b:
            r10 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r10
            throw r0
    }

    public static native int nstbi_is_hdr_from_memory(long r0, int r2);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbi_is_hdr_from_memory(@org.lwjgl.system.NativeType("stbi_uc const *") java.nio.ByteBuffer r4) {
            r0 = r4
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r4
            int r1 = r1.remaining()
            int r0 = nstbi_is_hdr_from_memory(r0, r1)
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    public static native int nstbi_is_hdr_from_callbacks(long r0, long r2);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbi_is_hdr_from_callbacks(@org.lwjgl.system.NativeType("stbi_io_callbacks const *") org.lwjgl.stb.STBIIOCallbacks r5, @org.lwjgl.system.NativeType("void *") long r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Ld
            r0 = r5
            long r0 = r0.address()
            org.lwjgl.stb.STBIIOCallbacks.validate(r0)
        Ld:
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            int r0 = nstbi_is_hdr_from_callbacks(r0, r1)
            if (r0 == 0) goto L1c
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            return r0
    }

    public static native long nstbi_failure_reason();

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String stbi_failure_reason() {
            long r0 = nstbi_failure_reason()
            r3 = r0
            r0 = r3
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCIISafe(r0)
            return r0
    }

    public static native void nstbi_image_free(long r0);

    public static void stbi_image_free(@org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r3) {
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nstbi_image_free(r0)
            return
    }

    public static void stbi_image_free(@org.lwjgl.system.NativeType("void *") java.nio.ShortBuffer r3) {
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nstbi_image_free(r0)
            return
    }

    public static void stbi_image_free(@org.lwjgl.system.NativeType("void *") java.nio.FloatBuffer r3) {
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nstbi_image_free(r0)
            return
    }

    public static native int nstbi_info(long r0, long r2, long r4, long r6);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbi_info(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r9, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r10, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r11, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r9
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r10
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nstbi_info(r0, r1, r2, r3)
            if (r0 == 0) goto L33
            r0 = 1
            goto L34
        L33:
            r0 = 0
        L34:
            return r0
    }

    @org.lwjgl.system.NativeType("int")
    public static boolean stbi_info(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r9, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r10, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r11, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L15:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r13 = r0
            r0 = r13
            int r0 = r0.getPointer()
            r14 = r0
            r0 = r13
            r1 = r9
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L55
            r0 = r13
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L55
            r15 = r0
            r0 = r15
            r1 = r10
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L55
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L55
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L55
            int r0 = nstbi_info(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L48
            r0 = 1
            goto L49
        L48:
            r0 = 0
        L49:
            r17 = r0
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            r0 = r17
            return r0
        L55:
            r18 = move-exception
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            r0 = r18
            throw r0
    }

    public static native int nstbi_info_from_memory(long r0, int r2, long r3, long r5, long r7);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbi_info_from_memory(@org.lwjgl.system.NativeType("stbi_uc const *") java.nio.ByteBuffer r10, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r11, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r12, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L15:
            r0 = r10
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r10
            int r1 = r1.remaining()
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r13
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            int r0 = nstbi_info_from_memory(r0, r1, r2, r3, r4)
            if (r0 == 0) goto L33
            r0 = 1
            goto L34
        L33:
            r0 = 0
        L34:
            return r0
    }

    public static native int nstbi_info_from_callbacks(long r0, long r2, long r4, long r6, long r8);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbi_info_from_callbacks(@org.lwjgl.system.NativeType("stbi_io_callbacks const *") org.lwjgl.stb.STBIIOCallbacks r11, @org.lwjgl.system.NativeType("void *") long r12, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r14, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r15, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r16) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r16
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            long r0 = r0.address()
            org.lwjgl.stb.STBIIOCallbacks.validate(r0)
        L1e:
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r14
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r15
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r16
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            int r0 = nstbi_info_from_callbacks(r0, r1, r2, r3, r4)
            if (r0 == 0) goto L3b
            r0 = 1
            goto L3c
        L3b:
            r0 = 0
        L3c:
            return r0
    }

    public static native int nstbi_is_16_bit(long r0);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbi_is_16_bit(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r3
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            int r0 = nstbi_is_16_bit(r0)
            if (r0 == 0) goto L18
            r0 = 1
            goto L19
        L18:
            r0 = 0
        L19:
            return r0
    }

    @org.lwjgl.system.NativeType("int")
    public static boolean stbi_is_16_bit(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = r4
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L2b
            r0 = r5
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L2b
            r7 = r0
            r0 = r7
            int r0 = nstbi_is_16_bit(r0)     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L20
            r0 = 1
            goto L21
        L20:
            r0 = 0
        L21:
            r9 = r0
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r9
            return r0
        L2b:
            r10 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r10
            throw r0
    }

    public static native int nstbi_is_16_bit_from_memory(long r0, int r2);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbi_is_16_bit_from_memory(@org.lwjgl.system.NativeType("stbi_uc const *") java.nio.ByteBuffer r4) {
            r0 = r4
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r4
            int r1 = r1.remaining()
            int r0 = nstbi_is_16_bit_from_memory(r0, r1)
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    public static native int nstbi_is_16_bit_from_callbacks(long r0, long r2);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbi_is_16_bit_from_callbacks(@org.lwjgl.system.NativeType("stbi_io_callbacks const *") org.lwjgl.stb.STBIIOCallbacks r5, @org.lwjgl.system.NativeType("void *") long r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Ld
            r0 = r5
            long r0 = r0.address()
            org.lwjgl.stb.STBIIOCallbacks.validate(r0)
        Ld:
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            int r0 = nstbi_is_16_bit_from_callbacks(r0, r1)
            if (r0 == 0) goto L1c
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            return r0
    }

    public static native void nstbi_set_unpremultiply_on_load(int r0);

    public static void stbi_set_unpremultiply_on_load(@org.lwjgl.system.NativeType("int") boolean r2) {
            r0 = r2
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            nstbi_set_unpremultiply_on_load(r0)
            return
    }

    public static native void nstbi_convert_iphone_png_to_rgb(int r0);

    public static void stbi_convert_iphone_png_to_rgb(@org.lwjgl.system.NativeType("int") boolean r2) {
            r0 = r2
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            nstbi_convert_iphone_png_to_rgb(r0)
            return
    }

    public static native void nstbi_set_flip_vertically_on_load(int r0);

    public static void stbi_set_flip_vertically_on_load(@org.lwjgl.system.NativeType("int") boolean r2) {
            r0 = r2
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            nstbi_set_flip_vertically_on_load(r0)
            return
    }

    public static native void nstbi_set_unpremultiply_on_load_thread(int r0);

    public static void stbi_set_unpremultiply_on_load_thread(@org.lwjgl.system.NativeType("int") boolean r2) {
            r0 = r2
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            nstbi_set_unpremultiply_on_load_thread(r0)
            return
    }

    public static native void nstbi_convert_iphone_png_to_rgb_thread(int r0);

    public static void stbi_convert_iphone_png_to_rgb_thread(@org.lwjgl.system.NativeType("int") boolean r2) {
            r0 = r2
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            nstbi_convert_iphone_png_to_rgb_thread(r0)
            return
    }

    public static native void stbi_set_flip_vertically_on_load_thread(int r0);

    public static native long nstbi_zlib_decode_malloc_guesssize(long r0, int r2, int r3, long r4);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char *")
    public static java.nio.ByteBuffer stbi_zlib_decode_malloc_guesssize(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r7, int r8) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r9 = r0
            r0 = r9
            int r0 = r0.getPointer()
            r10 = r0
            r0 = r9
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L38
            r11 = r0
            r0 = r7
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)     // Catch: java.lang.Throwable -> L38
            r1 = r7
            int r1 = r1.remaining()     // Catch: java.lang.Throwable -> L38
            r2 = r8
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L38
            long r0 = nstbi_zlib_decode_malloc_guesssize(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L38
            r12 = r0
            r0 = r12
            r1 = r11
            r2 = 0
            int r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L38
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)     // Catch: java.lang.Throwable -> L38
            r14 = r0
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r14
            return r0
        L38:
            r15 = move-exception
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r15
            throw r0
    }

    public static native long nstbi_zlib_decode_malloc_guesssize_headerflag(long r0, int r2, int r3, long r4, int r6);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char *")
    public static java.nio.ByteBuffer stbi_zlib_decode_malloc_guesssize_headerflag(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r8, int r9, @org.lwjgl.system.NativeType("int") boolean r10) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r11 = r0
            r0 = r11
            int r0 = r0.getPointer()
            r12 = r0
            r0 = r11
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L43
            r13 = r0
            r0 = r8
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)     // Catch: java.lang.Throwable -> L43
            r1 = r8
            int r1 = r1.remaining()     // Catch: java.lang.Throwable -> L43
            r2 = r9
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L43
            r4 = r10
            if (r4 == 0) goto L27
            r4 = 1
            goto L28
        L27:
            r4 = 0
        L28:
            long r0 = nstbi_zlib_decode_malloc_guesssize_headerflag(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L43
            r14 = r0
            r0 = r14
            r1 = r13
            r2 = 0
            int r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L43
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)     // Catch: java.lang.Throwable -> L43
            r16 = r0
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r16
            return r0
        L43:
            r17 = move-exception
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r17
            throw r0
    }

    public static native long nstbi_zlib_decode_malloc(long r0, int r2, long r3);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char *")
    public static java.nio.ByteBuffer stbi_zlib_decode_malloc(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L34
            r9 = r0
            r0 = r6
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)     // Catch: java.lang.Throwable -> L34
            r1 = r6
            int r1 = r1.remaining()     // Catch: java.lang.Throwable -> L34
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L34
            long r0 = nstbi_zlib_decode_malloc(r0, r1, r2)     // Catch: java.lang.Throwable -> L34
            r10 = r0
            r0 = r10
            r1 = r9
            r2 = 0
            int r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L34
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)     // Catch: java.lang.Throwable -> L34
            r12 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r12
            return r0
        L34:
            r13 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    public static native int nstbi_zlib_decode_buffer(long r0, int r2, long r3, int r5);

    public static int stbi_zlib_decode_buffer(@org.lwjgl.system.NativeType("char *") java.nio.ByteBuffer r7, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r8) {
            r0 = r7
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r1 = r1.remaining()
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r8
            int r3 = r3.remaining()
            int r0 = nstbi_zlib_decode_buffer(r0, r1, r2, r3)
            return r0
    }

    public static native long nstbi_zlib_decode_noheader_malloc(long r0, int r2, long r3);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char *")
    public static java.nio.ByteBuffer stbi_zlib_decode_noheader_malloc(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L34
            r9 = r0
            r0 = r6
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)     // Catch: java.lang.Throwable -> L34
            r1 = r6
            int r1 = r1.remaining()     // Catch: java.lang.Throwable -> L34
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L34
            long r0 = nstbi_zlib_decode_noheader_malloc(r0, r1, r2)     // Catch: java.lang.Throwable -> L34
            r10 = r0
            r0 = r10
            r1 = r9
            r2 = 0
            int r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L34
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)     // Catch: java.lang.Throwable -> L34
            r12 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r12
            return r0
        L34:
            r13 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    public static native int nstbi_zlib_decode_noheader_buffer(long r0, int r2, long r3, int r5);

    public static int stbi_zlib_decode_noheader_buffer(@org.lwjgl.system.NativeType("char *") java.nio.ByteBuffer r7, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r8) {
            r0 = r7
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r1 = r1.remaining()
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r8
            int r3 = r3.remaining()
            int r0 = nstbi_zlib_decode_noheader_buffer(r0, r1, r2, r3)
            return r0
    }

    public static native long nstbi_load(long r0, int[] r2, int[] r3, int[] r4, int r5);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("stbi_uc *")
    public static java.nio.ByteBuffer stbi_load(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r7, @org.lwjgl.system.NativeType("int *") int[] r8, @org.lwjgl.system.NativeType("int *") int[] r9, @org.lwjgl.system.NativeType("int *") int[] r10, int r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r0 = nstbi_load(r0, r1, r2, r3, r4)
            r12 = r0
            r0 = r12
            r1 = r8
            r2 = 0
            r1 = r1[r2]
            r2 = r9
            r3 = 0
            r2 = r2[r3]
            int r1 = r1 * r2
            r2 = r11
            if (r2 == 0) goto L3a
            r2 = r11
            goto L3d
        L3a:
            r2 = r10
            r3 = 0
            r2 = r2[r3]
        L3d:
            int r1 = r1 * r2
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("stbi_uc *")
    public static java.nio.ByteBuffer stbi_load(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r7, @org.lwjgl.system.NativeType("int *") int[] r8, @org.lwjgl.system.NativeType("int *") int[] r9, @org.lwjgl.system.NativeType("int *") int[] r10, int r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L15:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r12 = r0
            r0 = r12
            int r0 = r0.getPointer()
            r13 = r0
            r0 = r12
            r1 = r7
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L62
            r0 = r12
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L62
            r14 = r0
            r0 = r14
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r0 = nstbi_load(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L62
            r16 = r0
            r0 = r16
            r1 = r8
            r2 = 0
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L62
            r2 = r9
            r3 = 0
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L62
            int r1 = r1 * r2
            r2 = r11
            if (r2 == 0) goto L4f
            r2 = r11
            goto L52
        L4f:
            r2 = r10
            r3 = 0
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L62
        L52:
            int r1 = r1 * r2
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)     // Catch: java.lang.Throwable -> L62
            r18 = r0
            r0 = r12
            r1 = r13
            r0.setPointer(r1)
            r0 = r18
            return r0
        L62:
            r19 = move-exception
            r0 = r12
            r1 = r13
            r0.setPointer(r1)
            r0 = r19
            throw r0
    }

    public static native long nstbi_load_from_memory(long r0, int r2, int[] r3, int[] r4, int[] r5, int r6);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("stbi_uc *")
    public static java.nio.ByteBuffer stbi_load_from_memory(@org.lwjgl.system.NativeType("stbi_uc const *") java.nio.ByteBuffer r8, @org.lwjgl.system.NativeType("int *") int[] r9, @org.lwjgl.system.NativeType("int *") int[] r10, @org.lwjgl.system.NativeType("int *") int[] r11, int r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L15:
            r0 = r8
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r8
            int r1 = r1.remaining()
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            long r0 = nstbi_load_from_memory(r0, r1, r2, r3, r4, r5)
            r13 = r0
            r0 = r13
            r1 = r9
            r2 = 0
            r1 = r1[r2]
            r2 = r10
            r3 = 0
            r2 = r2[r3]
            int r1 = r1 * r2
            r2 = r12
            if (r2 == 0) goto L3a
            r2 = r12
            goto L3d
        L3a:
            r2 = r11
            r3 = 0
            r2 = r2[r3]
        L3d:
            int r1 = r1 * r2
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    public static native long nstbi_load_from_callbacks(long r0, long r2, int[] r4, int[] r5, int[] r6, int r7);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("stbi_uc *")
    public static java.nio.ByteBuffer stbi_load_from_callbacks(@org.lwjgl.system.NativeType("stbi_io_callbacks const *") org.lwjgl.stb.STBIIOCallbacks r9, @org.lwjgl.system.NativeType("void *") long r10, @org.lwjgl.system.NativeType("int *") int[] r12, @org.lwjgl.system.NativeType("int *") int[] r13, @org.lwjgl.system.NativeType("int *") int[] r14, int r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r9
            long r0 = r0.address()
            org.lwjgl.stb.STBIIOCallbacks.validate(r0)
        L1e:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            long r0 = nstbi_load_from_callbacks(r0, r1, r2, r3, r4, r5)
            r16 = r0
            r0 = r16
            r1 = r12
            r2 = 0
            r1 = r1[r2]
            r2 = r13
            r3 = 0
            r2 = r2[r3]
            int r1 = r1 * r2
            r2 = r15
            if (r2 == 0) goto L43
            r2 = r15
            goto L47
        L43:
            r2 = r14
            r3 = 0
            r2 = r2[r3]
        L47:
            int r1 = r1 * r2
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    public static native long nstbi_load_gif_from_memory(long r0, int r2, long r3, int[] r5, int[] r6, int[] r7, int[] r8, int r9);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("stbi_uc *")
    public static java.nio.ByteBuffer stbi_load_gif_from_memory(@org.lwjgl.system.NativeType("stbi_uc const *") java.nio.ByteBuffer r11, @org.lwjgl.system.NativeType("int **") org.lwjgl.PointerBuffer r12, @org.lwjgl.system.NativeType("int *") int[] r13, @org.lwjgl.system.NativeType("int *") int[] r14, @org.lwjgl.system.NativeType("int *") int[] r15, @org.lwjgl.system.NativeType("int *") int[] r16, int r17) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L21
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r16
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L21:
            r0 = r11
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r11
            int r1 = r1.remaining()
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            long r0 = nstbi_load_gif_from_memory(r0, r1, r2, r3, r4, r5, r6, r7)
            r18 = r0
            r0 = r18
            r1 = r13
            r2 = 0
            r1 = r1[r2]
            r2 = r14
            r3 = 0
            r2 = r2[r3]
            int r1 = r1 * r2
            r2 = r15
            r3 = 0
            r2 = r2[r3]
            int r1 = r1 * r2
            r2 = r17
            if (r2 == 0) goto L52
            r2 = r17
            goto L56
        L52:
            r2 = r16
            r3 = 0
            r2 = r2[r3]
        L56:
            int r1 = r1 * r2
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    public static native long nstbi_load_16(long r0, int[] r2, int[] r3, int[] r4, int r5);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("stbi_us *")
    public static java.nio.ShortBuffer stbi_load_16(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r7, @org.lwjgl.system.NativeType("int *") int[] r8, @org.lwjgl.system.NativeType("int *") int[] r9, @org.lwjgl.system.NativeType("int *") int[] r10, int r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r0 = nstbi_load_16(r0, r1, r2, r3, r4)
            r12 = r0
            r0 = r12
            r1 = r8
            r2 = 0
            r1 = r1[r2]
            r2 = r9
            r3 = 0
            r2 = r2[r3]
            int r1 = r1 * r2
            r2 = r11
            if (r2 == 0) goto L3a
            r2 = r11
            goto L3d
        L3a:
            r2 = r10
            r3 = 0
            r2 = r2[r3]
        L3d:
            int r1 = r1 * r2
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBufferSafe(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("stbi_us *")
    public static java.nio.ShortBuffer stbi_load_16(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r7, @org.lwjgl.system.NativeType("int *") int[] r8, @org.lwjgl.system.NativeType("int *") int[] r9, @org.lwjgl.system.NativeType("int *") int[] r10, int r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L15:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r12 = r0
            r0 = r12
            int r0 = r0.getPointer()
            r13 = r0
            r0 = r12
            r1 = r7
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L62
            r0 = r12
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L62
            r14 = r0
            r0 = r14
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r0 = nstbi_load_16(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L62
            r16 = r0
            r0 = r16
            r1 = r8
            r2 = 0
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L62
            r2 = r9
            r3 = 0
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L62
            int r1 = r1 * r2
            r2 = r11
            if (r2 == 0) goto L4f
            r2 = r11
            goto L52
        L4f:
            r2 = r10
            r3 = 0
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L62
        L52:
            int r1 = r1 * r2
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBufferSafe(r0, r1)     // Catch: java.lang.Throwable -> L62
            r18 = r0
            r0 = r12
            r1 = r13
            r0.setPointer(r1)
            r0 = r18
            return r0
        L62:
            r19 = move-exception
            r0 = r12
            r1 = r13
            r0.setPointer(r1)
            r0 = r19
            throw r0
    }

    public static native long nstbi_load_16_from_memory(long r0, int r2, int[] r3, int[] r4, int[] r5, int r6);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("stbi_us *")
    public static java.nio.ShortBuffer stbi_load_16_from_memory(@org.lwjgl.system.NativeType("stbi_uc const *") java.nio.ByteBuffer r8, @org.lwjgl.system.NativeType("int *") int[] r9, @org.lwjgl.system.NativeType("int *") int[] r10, @org.lwjgl.system.NativeType("int *") int[] r11, int r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L15:
            r0 = r8
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r8
            int r1 = r1.remaining()
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            long r0 = nstbi_load_16_from_memory(r0, r1, r2, r3, r4, r5)
            r13 = r0
            r0 = r13
            r1 = r9
            r2 = 0
            r1 = r1[r2]
            r2 = r10
            r3 = 0
            r2 = r2[r3]
            int r1 = r1 * r2
            r2 = r12
            if (r2 == 0) goto L3a
            r2 = r12
            goto L3d
        L3a:
            r2 = r11
            r3 = 0
            r2 = r2[r3]
        L3d:
            int r1 = r1 * r2
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBufferSafe(r0, r1)
            return r0
    }

    public static native long nstbi_load_16_from_callbacks(long r0, long r2, int[] r4, int[] r5, int[] r6, int r7);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("stbi_us *")
    public static java.nio.ShortBuffer stbi_load_16_from_callbacks(@org.lwjgl.system.NativeType("stbi_io_callbacks const *") org.lwjgl.stb.STBIIOCallbacks r9, @org.lwjgl.system.NativeType("void *") long r10, @org.lwjgl.system.NativeType("int *") int[] r12, @org.lwjgl.system.NativeType("int *") int[] r13, @org.lwjgl.system.NativeType("int *") int[] r14, int r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r9
            long r0 = r0.address()
            org.lwjgl.stb.STBIIOCallbacks.validate(r0)
        L1e:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            long r0 = nstbi_load_16_from_callbacks(r0, r1, r2, r3, r4, r5)
            r16 = r0
            r0 = r16
            r1 = r12
            r2 = 0
            r1 = r1[r2]
            r2 = r13
            r3 = 0
            r2 = r2[r3]
            int r1 = r1 * r2
            r2 = r15
            if (r2 == 0) goto L43
            r2 = r15
            goto L47
        L43:
            r2 = r14
            r3 = 0
            r2 = r2[r3]
        L47:
            int r1 = r1 * r2
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBufferSafe(r0, r1)
            return r0
    }

    public static native long nstbi_loadf(long r0, int[] r2, int[] r3, int[] r4, int r5);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("float *")
    public static java.nio.FloatBuffer stbi_loadf(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r7, @org.lwjgl.system.NativeType("int *") int[] r8, @org.lwjgl.system.NativeType("int *") int[] r9, @org.lwjgl.system.NativeType("int *") int[] r10, int r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r0 = nstbi_loadf(r0, r1, r2, r3, r4)
            r12 = r0
            r0 = r12
            r1 = r8
            r2 = 0
            r1 = r1[r2]
            r2 = r9
            r3 = 0
            r2 = r2[r3]
            int r1 = r1 * r2
            r2 = r11
            if (r2 == 0) goto L3a
            r2 = r11
            goto L3d
        L3a:
            r2 = r10
            r3 = 0
            r2 = r2[r3]
        L3d:
            int r1 = r1 * r2
            java.nio.FloatBuffer r0 = org.lwjgl.system.MemoryUtil.memFloatBufferSafe(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("float *")
    public static java.nio.FloatBuffer stbi_loadf(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r7, @org.lwjgl.system.NativeType("int *") int[] r8, @org.lwjgl.system.NativeType("int *") int[] r9, @org.lwjgl.system.NativeType("int *") int[] r10, int r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L15:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r12 = r0
            r0 = r12
            int r0 = r0.getPointer()
            r13 = r0
            r0 = r12
            r1 = r7
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L62
            r0 = r12
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L62
            r14 = r0
            r0 = r14
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r0 = nstbi_loadf(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L62
            r16 = r0
            r0 = r16
            r1 = r8
            r2 = 0
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L62
            r2 = r9
            r3 = 0
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L62
            int r1 = r1 * r2
            r2 = r11
            if (r2 == 0) goto L4f
            r2 = r11
            goto L52
        L4f:
            r2 = r10
            r3 = 0
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L62
        L52:
            int r1 = r1 * r2
            java.nio.FloatBuffer r0 = org.lwjgl.system.MemoryUtil.memFloatBufferSafe(r0, r1)     // Catch: java.lang.Throwable -> L62
            r18 = r0
            r0 = r12
            r1 = r13
            r0.setPointer(r1)
            r0 = r18
            return r0
        L62:
            r19 = move-exception
            r0 = r12
            r1 = r13
            r0.setPointer(r1)
            r0 = r19
            throw r0
    }

    public static native long nstbi_loadf_from_memory(long r0, int r2, int[] r3, int[] r4, int[] r5, int r6);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("float *")
    public static java.nio.FloatBuffer stbi_loadf_from_memory(@org.lwjgl.system.NativeType("stbi_uc const *") java.nio.ByteBuffer r8, @org.lwjgl.system.NativeType("int *") int[] r9, @org.lwjgl.system.NativeType("int *") int[] r10, @org.lwjgl.system.NativeType("int *") int[] r11, int r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L15:
            r0 = r8
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r8
            int r1 = r1.remaining()
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            long r0 = nstbi_loadf_from_memory(r0, r1, r2, r3, r4, r5)
            r13 = r0
            r0 = r13
            r1 = r9
            r2 = 0
            r1 = r1[r2]
            r2 = r10
            r3 = 0
            r2 = r2[r3]
            int r1 = r1 * r2
            r2 = r12
            if (r2 == 0) goto L3a
            r2 = r12
            goto L3d
        L3a:
            r2 = r11
            r3 = 0
            r2 = r2[r3]
        L3d:
            int r1 = r1 * r2
            java.nio.FloatBuffer r0 = org.lwjgl.system.MemoryUtil.memFloatBufferSafe(r0, r1)
            return r0
    }

    public static native long nstbi_loadf_from_callbacks(long r0, long r2, int[] r4, int[] r5, int[] r6, int r7);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("float *")
    public static java.nio.FloatBuffer stbi_loadf_from_callbacks(@org.lwjgl.system.NativeType("stbi_io_callbacks const *") org.lwjgl.stb.STBIIOCallbacks r9, @org.lwjgl.system.NativeType("void *") long r10, @org.lwjgl.system.NativeType("int *") int[] r12, @org.lwjgl.system.NativeType("int *") int[] r13, @org.lwjgl.system.NativeType("int *") int[] r14, int r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r9
            long r0 = r0.address()
            org.lwjgl.stb.STBIIOCallbacks.validate(r0)
        L1e:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            long r0 = nstbi_loadf_from_callbacks(r0, r1, r2, r3, r4, r5)
            r16 = r0
            r0 = r16
            r1 = r12
            r2 = 0
            r1 = r1[r2]
            r2 = r13
            r3 = 0
            r2 = r2[r3]
            int r1 = r1 * r2
            r2 = r15
            if (r2 == 0) goto L43
            r2 = r15
            goto L47
        L43:
            r2 = r14
            r3 = 0
            r2 = r2[r3]
        L47:
            int r1 = r1 * r2
            java.nio.FloatBuffer r0 = org.lwjgl.system.MemoryUtil.memFloatBufferSafe(r0, r1)
            return r0
    }

    public static native int nstbi_info(long r0, int[] r2, int[] r3, int[] r4);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbi_info(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r6, @org.lwjgl.system.NativeType("int *") int[] r7, @org.lwjgl.system.NativeType("int *") int[] r8, @org.lwjgl.system.NativeType("int *") int[] r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r6
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r6
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            r2 = r8
            r3 = r9
            int r0 = nstbi_info(r0, r1, r2, r3)
            if (r0 == 0) goto L2a
            r0 = 1
            goto L2b
        L2a:
            r0 = 0
        L2b:
            return r0
    }

    @org.lwjgl.system.NativeType("int")
    public static boolean stbi_info(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r6, @org.lwjgl.system.NativeType("int *") int[] r7, @org.lwjgl.system.NativeType("int *") int[] r8, @org.lwjgl.system.NativeType("int *") int[] r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L15:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r10 = r0
            r0 = r10
            int r0 = r0.getPointer()
            r11 = r0
            r0 = r10
            r1 = r6
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L4c
            r0 = r10
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L4c
            r12 = r0
            r0 = r12
            r1 = r7
            r2 = r8
            r3 = r9
            int r0 = nstbi_info(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L3f
            r0 = 1
            goto L40
        L3f:
            r0 = 0
        L40:
            r14 = r0
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            r0 = r14
            return r0
        L4c:
            r15 = move-exception
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            r0 = r15
            throw r0
    }

    public static native int nstbi_info_from_memory(long r0, int r2, int[] r3, int[] r4, int[] r5);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbi_info_from_memory(@org.lwjgl.system.NativeType("stbi_uc const *") java.nio.ByteBuffer r7, @org.lwjgl.system.NativeType("int *") int[] r8, @org.lwjgl.system.NativeType("int *") int[] r9, @org.lwjgl.system.NativeType("int *") int[] r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L15:
            r0 = r7
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r1 = r1.remaining()
            r2 = r8
            r3 = r9
            r4 = r10
            int r0 = nstbi_info_from_memory(r0, r1, r2, r3, r4)
            if (r0 == 0) goto L2a
            r0 = 1
            goto L2b
        L2a:
            r0 = 0
        L2b:
            return r0
    }

    public static native int nstbi_info_from_callbacks(long r0, long r2, int[] r4, int[] r5, int[] r6);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbi_info_from_callbacks(@org.lwjgl.system.NativeType("stbi_io_callbacks const *") org.lwjgl.stb.STBIIOCallbacks r8, @org.lwjgl.system.NativeType("void *") long r9, @org.lwjgl.system.NativeType("int *") int[] r11, @org.lwjgl.system.NativeType("int *") int[] r12, @org.lwjgl.system.NativeType("int *") int[] r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r8
            long r0 = r0.address()
            org.lwjgl.stb.STBIIOCallbacks.validate(r0)
        L1e:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r11
            r3 = r12
            r4 = r13
            int r0 = nstbi_info_from_callbacks(r0, r1, r2, r3, r4)
            if (r0 == 0) goto L32
            r0 = 1
            goto L33
        L32:
            r0 = 0
        L33:
            return r0
    }

    static {
            org.lwjgl.stb.LibSTB.initialize()
            return
    }
}
