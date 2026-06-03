package org.lwjgl.stb;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBImageWrite.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBImageWrite.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBImageWrite.class */
public class STBImageWrite {
    public static final java.nio.IntBuffer stbi_write_png_compression_level = null;
    public static final java.nio.IntBuffer stbi_write_force_png_filter = null;
    public static final org.lwjgl.PointerBuffer stbi_zlib_compress = null;
    public static final java.nio.IntBuffer stbi_write_tga_with_rle = null;

    protected STBImageWrite() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native int nstbi_write_png(long r0, int r2, int r3, int r4, long r5, int r7);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbi_write_png(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r9, int r10, int r11, int r12, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r13, int r14) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r9
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r13
            r1 = r14
            if (r1 == 0) goto L16
            r1 = r14
            goto L19
        L16:
            r1 = r10
            r2 = r12
            int r1 = r1 * r2
        L19:
            r2 = r11
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L1e:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r14
            int r0 = nstbi_write_png(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L36
            r0 = 1
            goto L37
        L36:
            r0 = 0
        L37:
            return r0
    }

    @org.lwjgl.system.NativeType("int")
    public static boolean stbi_write_png(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r9, int r10, int r11, int r12, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r13, int r14) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1a
            r0 = r13
            r1 = r14
            if (r1 == 0) goto L12
            r1 = r14
            goto L15
        L12:
            r1 = r10
            r2 = r12
            int r1 = r1 * r2
        L15:
            r2 = r11
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L1a:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r15 = r0
            r0 = r15
            int r0 = r0.getPointer()
            r16 = r0
            r0 = r15
            r1 = r9
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L58
            r0 = r15
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L58
            r17 = r0
            r0 = r17
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)     // Catch: java.lang.Throwable -> L58
            r5 = r14
            int r0 = nstbi_write_png(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L58
            if (r0 == 0) goto L4b
            r0 = 1
            goto L4c
        L4b:
            r0 = 0
        L4c:
            r19 = r0
            r0 = r15
            r1 = r16
            r0.setPointer(r1)
            r0 = r19
            return r0
        L58:
            r20 = move-exception
            r0 = r15
            r1 = r16
            r0.setPointer(r1)
            r0 = r20
            throw r0
    }

    private static native long nstbi_write_png_compression_level();

    @org.lwjgl.system.NativeType("int *")
    private static java.nio.IntBuffer stbi_write_png_compression_level() {
            long r0 = nstbi_write_png_compression_level()
            r4 = r0
            r0 = r4
            r1 = 1
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    private static native long nstbi_write_force_png_filter();

    @org.lwjgl.system.NativeType("int *")
    private static java.nio.IntBuffer stbi_write_force_png_filter() {
            long r0 = nstbi_write_force_png_filter()
            r4 = r0
            r0 = r4
            r1 = 1
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    private static native long nstbi_zlib_compress();

    @org.lwjgl.system.NativeType("unsigned char * (*) (unsigned char *, int, int *, int) *")
    private static org.lwjgl.PointerBuffer stbi_zlib_compress() {
            long r0 = nstbi_zlib_compress()
            r4 = r0
            r0 = r4
            r1 = 1
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBuffer(r0, r1)
            return r0
    }

    public static native int nstbi_write_bmp(long r0, int r2, int r3, int r4, long r5);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbi_write_bmp(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r8, int r9, int r10, int r11, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r8
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r12
            r1 = r9
            r2 = r10
            int r1 = r1 * r2
            r2 = r11
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L14:
            r0 = r8
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            int r0 = nstbi_write_bmp(r0, r1, r2, r3, r4)
            if (r0 == 0) goto L2a
            r0 = 1
            goto L2b
        L2a:
            r0 = 0
        L2b:
            return r0
    }

    @org.lwjgl.system.NativeType("int")
    public static boolean stbi_write_bmp(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r8, int r9, int r10, int r11, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r12
            r1 = r9
            r2 = r10
            int r1 = r1 * r2
            r2 = r11
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r13 = r0
            r0 = r13
            int r0 = r0.getPointer()
            r14 = r0
            r0 = r13
            r1 = r8
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L4c
            r0 = r13
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L4c
            r15 = r0
            r0 = r15
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)     // Catch: java.lang.Throwable -> L4c
            int r0 = nstbi_write_bmp(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L3f
            r0 = 1
            goto L40
        L3f:
            r0 = 0
        L40:
            r17 = r0
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            r0 = r17
            return r0
        L4c:
            r18 = move-exception
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            r0 = r18
            throw r0
    }

    public static native int nstbi_write_tga(long r0, int r2, int r3, int r4, long r5);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbi_write_tga(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r8, int r9, int r10, int r11, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r8
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r12
            r1 = r9
            r2 = r10
            int r1 = r1 * r2
            r2 = r11
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L14:
            r0 = r8
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            int r0 = nstbi_write_tga(r0, r1, r2, r3, r4)
            if (r0 == 0) goto L2a
            r0 = 1
            goto L2b
        L2a:
            r0 = 0
        L2b:
            return r0
    }

    @org.lwjgl.system.NativeType("int")
    public static boolean stbi_write_tga(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r8, int r9, int r10, int r11, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r12
            r1 = r9
            r2 = r10
            int r1 = r1 * r2
            r2 = r11
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r13 = r0
            r0 = r13
            int r0 = r0.getPointer()
            r14 = r0
            r0 = r13
            r1 = r8
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L4c
            r0 = r13
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L4c
            r15 = r0
            r0 = r15
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)     // Catch: java.lang.Throwable -> L4c
            int r0 = nstbi_write_tga(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L3f
            r0 = 1
            goto L40
        L3f:
            r0 = 0
        L40:
            r17 = r0
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            r0 = r17
            return r0
        L4c:
            r18 = move-exception
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            r0 = r18
            throw r0
    }

    private static native long nstbi_write_tga_with_rle();

    @org.lwjgl.system.NativeType("int *")
    private static java.nio.IntBuffer stbi_write_tga_with_rle() {
            long r0 = nstbi_write_tga_with_rle()
            r4 = r0
            r0 = r4
            r1 = 1
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public static native int nstbi_write_hdr(long r0, int r2, int r3, int r4, long r5);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbi_write_hdr(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r8, int r9, int r10, int r11, @org.lwjgl.system.NativeType("float const *") java.nio.FloatBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r8
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r12
            r1 = r9
            r2 = r10
            int r1 = r1 * r2
            r2 = r11
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L14:
            r0 = r8
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            int r0 = nstbi_write_hdr(r0, r1, r2, r3, r4)
            if (r0 == 0) goto L2a
            r0 = 1
            goto L2b
        L2a:
            r0 = 0
        L2b:
            return r0
    }

    @org.lwjgl.system.NativeType("int")
    public static boolean stbi_write_hdr(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r8, int r9, int r10, int r11, @org.lwjgl.system.NativeType("float const *") java.nio.FloatBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r12
            r1 = r9
            r2 = r10
            int r1 = r1 * r2
            r2 = r11
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r13 = r0
            r0 = r13
            int r0 = r0.getPointer()
            r14 = r0
            r0 = r13
            r1 = r8
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L4c
            r0 = r13
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L4c
            r15 = r0
            r0 = r15
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)     // Catch: java.lang.Throwable -> L4c
            int r0 = nstbi_write_hdr(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L3f
            r0 = 1
            goto L40
        L3f:
            r0 = 0
        L40:
            r17 = r0
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            r0 = r17
            return r0
        L4c:
            r18 = move-exception
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            r0 = r18
            throw r0
    }

    public static native int nstbi_write_jpg(long r0, int r2, int r3, int r4, long r5, int r7);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbi_write_jpg(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r9, int r10, int r11, int r12, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r13, int r14) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r9
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r13
            r1 = r10
            r2 = r11
            int r1 = r1 * r2
            r2 = r12
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L14:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r14
            int r0 = nstbi_write_jpg(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L2c
            r0 = 1
            goto L2d
        L2c:
            r0 = 0
        L2d:
            return r0
    }

    @org.lwjgl.system.NativeType("int")
    public static boolean stbi_write_jpg(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r9, int r10, int r11, int r12, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r13, int r14) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r13
            r1 = r10
            r2 = r11
            int r1 = r1 * r2
            r2 = r12
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r15 = r0
            r0 = r15
            int r0 = r0.getPointer()
            r16 = r0
            r0 = r15
            r1 = r9
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L4e
            r0 = r15
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L4e
            r17 = r0
            r0 = r17
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)     // Catch: java.lang.Throwable -> L4e
            r5 = r14
            int r0 = nstbi_write_jpg(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L41
            r0 = 1
            goto L42
        L41:
            r0 = 0
        L42:
            r19 = r0
            r0 = r15
            r1 = r16
            r0.setPointer(r1)
            r0 = r19
            return r0
        L4e:
            r20 = move-exception
            r0 = r15
            r1 = r16
            r0.setPointer(r1)
            r0 = r20
            throw r0
    }

    public static native int nstbi_write_png_to_func(long r0, long r2, int r4, int r5, int r6, long r7, int r9);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbi_write_png_to_func(@org.lwjgl.system.NativeType("stbi_write_func *") org.lwjgl.stb.STBIWriteCallbackI r11, @org.lwjgl.system.NativeType("void *") long r12, int r14, int r15, int r16, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r17, int r18) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1c
            r0 = r17
            r1 = r18
            if (r1 == 0) goto L12
            r1 = r18
            goto L16
        L12:
            r1 = r14
            r2 = r16
            int r1 = r1 * r2
        L16:
            r2 = r15
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L1c:
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            r6 = r18
            int r0 = nstbi_write_png_to_func(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L39
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
    }

    public static native int nstbi_write_bmp_to_func(long r0, long r2, int r4, int r5, int r6, long r7);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbi_write_bmp_to_func(@org.lwjgl.system.NativeType("stbi_write_func *") org.lwjgl.stb.STBIWriteCallbackI r10, @org.lwjgl.system.NativeType("void *") long r11, int r13, int r14, int r15, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r16) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r16
            r1 = r13
            r2 = r14
            int r1 = r1 * r2
            r2 = r15
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L12:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            int r0 = nstbi_write_bmp_to_func(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L2d
            r0 = 1
            goto L2e
        L2d:
            r0 = 0
        L2e:
            return r0
    }

    public static native int nstbi_write_tga_to_func(long r0, long r2, int r4, int r5, int r6, long r7);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbi_write_tga_to_func(@org.lwjgl.system.NativeType("stbi_write_func *") org.lwjgl.stb.STBIWriteCallbackI r10, @org.lwjgl.system.NativeType("void *") long r11, int r13, int r14, int r15, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r16) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r16
            r1 = r13
            r2 = r14
            int r1 = r1 * r2
            r2 = r15
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L12:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            int r0 = nstbi_write_tga_to_func(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L2d
            r0 = 1
            goto L2e
        L2d:
            r0 = 0
        L2e:
            return r0
    }

    public static native int nstbi_write_hdr_to_func(long r0, long r2, int r4, int r5, int r6, long r7);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbi_write_hdr_to_func(@org.lwjgl.system.NativeType("stbi_write_func *") org.lwjgl.stb.STBIWriteCallbackI r10, @org.lwjgl.system.NativeType("void *") long r11, int r13, int r14, int r15, @org.lwjgl.system.NativeType("float const *") java.nio.FloatBuffer r16) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r16
            r1 = r13
            r2 = r14
            int r1 = r1 * r2
            r2 = r15
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L12:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            int r0 = nstbi_write_hdr_to_func(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L2d
            r0 = 1
            goto L2e
        L2d:
            r0 = 0
        L2e:
            return r0
    }

    public static native int nstbi_write_jpg_to_func(long r0, long r2, int r4, int r5, int r6, long r7, int r9);

    public static int stbi_write_jpg_to_func(@org.lwjgl.system.NativeType("stbi_write_func *") org.lwjgl.stb.STBIWriteCallbackI r11, @org.lwjgl.system.NativeType("void *") long r12, int r14, int r15, int r16, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r17, int r18) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r17
            r1 = r14
            r2 = r15
            int r1 = r1 * r2
            r2 = r16
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L12:
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            r6 = r18
            int r0 = nstbi_write_jpg_to_func(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static native void nstbi_flip_vertically_on_write(int r0);

    public static void stbi_flip_vertically_on_write(@org.lwjgl.system.NativeType("int") boolean r2) {
            r0 = r2
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            nstbi_flip_vertically_on_write(r0)
            return
    }

    public static native int nstbi_write_hdr(long r0, int r2, int r3, int r4, float[] r5);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbi_write_hdr(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r7, int r8, int r9, int r10, @org.lwjgl.system.NativeType("float const *") float[] r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r11
            r1 = r8
            r2 = r9
            int r1 = r1 * r2
            r2 = r10
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L14:
            r0 = r7
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            int r0 = nstbi_write_hdr(r0, r1, r2, r3, r4)
            if (r0 == 0) goto L27
            r0 = 1
            goto L28
        L27:
            r0 = 0
        L28:
            return r0
    }

    @org.lwjgl.system.NativeType("int")
    public static boolean stbi_write_hdr(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r7, int r8, int r9, int r10, @org.lwjgl.system.NativeType("float const *") float[] r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r11
            r1 = r8
            r2 = r9
            int r1 = r1 * r2
            r2 = r10
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r12 = r0
            r0 = r12
            int r0 = r0.getPointer()
            r13 = r0
            r0 = r12
            r1 = r7
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L49
            r0 = r12
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L49
            r14 = r0
            r0 = r14
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            int r0 = nstbi_write_hdr(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L3c
            r0 = 1
            goto L3d
        L3c:
            r0 = 0
        L3d:
            r16 = r0
            r0 = r12
            r1 = r13
            r0.setPointer(r1)
            r0 = r16
            return r0
        L49:
            r17 = move-exception
            r0 = r12
            r1 = r13
            r0.setPointer(r1)
            r0 = r17
            throw r0
    }

    public static native int nstbi_write_hdr_to_func(long r0, long r2, int r4, int r5, int r6, float[] r7);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbi_write_hdr_to_func(@org.lwjgl.system.NativeType("stbi_write_func *") org.lwjgl.stb.STBIWriteCallbackI r9, @org.lwjgl.system.NativeType("void *") long r10, int r12, int r13, int r14, @org.lwjgl.system.NativeType("float const *") float[] r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r15
            r1 = r12
            r2 = r13
            int r1 = r1 * r2
            r2 = r14
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L12:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            int r0 = nstbi_write_hdr_to_func(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L2a
            r0 = 1
            goto L2b
        L2a:
            r0 = 0
        L2b:
            return r0
    }

    static {
            org.lwjgl.stb.LibSTB.initialize()
            java.nio.IntBuffer r0 = stbi_write_png_compression_level()
            org.lwjgl.stb.STBImageWrite.stbi_write_png_compression_level = r0
            java.nio.IntBuffer r0 = stbi_write_force_png_filter()
            org.lwjgl.stb.STBImageWrite.stbi_write_force_png_filter = r0
            org.lwjgl.PointerBuffer r0 = stbi_zlib_compress()
            org.lwjgl.stb.STBImageWrite.stbi_zlib_compress = r0
            java.nio.IntBuffer r0 = stbi_write_tga_with_rle()
            org.lwjgl.stb.STBImageWrite.stbi_write_tga_with_rle = r0
            return
    }
}
