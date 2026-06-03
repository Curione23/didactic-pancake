package org.lwjgl.stb;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBImageResize.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBImageResize.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBImageResize.class */
public class STBImageResize {
    public static final int STBIR_ALPHA_CHANNEL_NONE = -1;
    public static final int STBIR_FLAG_ALPHA_PREMULTIPLIED = 1;
    public static final int STBIR_FLAG_ALPHA_USES_COLORSPACE = 2;
    public static final int STBIR_EDGE_CLAMP = 1;
    public static final int STBIR_EDGE_REFLECT = 2;
    public static final int STBIR_EDGE_WRAP = 3;
    public static final int STBIR_EDGE_ZERO = 4;
    public static final int STBIR_FILTER_DEFAULT = 0;
    public static final int STBIR_FILTER_BOX = 1;
    public static final int STBIR_FILTER_TRIANGLE = 2;
    public static final int STBIR_FILTER_CUBICBSPLINE = 3;
    public static final int STBIR_FILTER_CATMULLROM = 4;
    public static final int STBIR_FILTER_MITCHELL = 5;
    public static final int STBIR_COLORSPACE_LINEAR = 0;
    public static final int STBIR_COLORSPACE_SRGB = 1;
    public static final int STBIR_TYPE_UINT8 = 0;
    public static final int STBIR_TYPE_UINT16 = 1;
    public static final int STBIR_TYPE_UINT32 = 2;
    public static final int STBIR_TYPE_FLOAT = 3;

    protected STBImageResize() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native int nstbir_resize_uint8(long r0, int r2, int r3, int r4, long r5, int r7, int r8, int r9, int r10);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbir_resize_uint8(@org.lwjgl.system.NativeType("unsigned char const *") java.nio.ByteBuffer r12, int r13, int r14, int r15, @org.lwjgl.system.NativeType("unsigned char *") java.nio.ByteBuffer r16, int r17, int r18, int r19, int r20) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L2f
            r0 = r12
            r1 = r14
            r2 = r15
            if (r2 != 0) goto L13
            r2 = r13
            r3 = r20
            int r2 = r2 * r3
            goto L14
        L13:
            r2 = r15
        L14:
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r16
            r1 = r18
            r2 = r19
            if (r2 != 0) goto L29
            r2 = r17
            r3 = r20
            int r2 = r2 * r3
            goto L2b
        L29:
            r2 = r19
        L2b:
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L2f:
            r0 = r12
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            int r0 = nstbir_resize_uint8(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 == 0) goto L4d
            r0 = 1
            goto L4e
        L4d:
            r0 = 0
        L4e:
            return r0
    }

    public static native int nstbir_resize_float(long r0, int r2, int r3, int r4, long r5, int r7, int r8, int r9, int r10);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbir_resize_float(@org.lwjgl.system.NativeType("float const *") java.nio.FloatBuffer r12, int r13, int r14, int r15, @org.lwjgl.system.NativeType("float *") java.nio.FloatBuffer r16, int r17, int r18, int r19, int r20) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L33
            r0 = r12
            r1 = r14
            r2 = r15
            if (r2 != 0) goto L13
            r2 = r13
            r3 = r20
            int r2 = r2 * r3
            goto L16
        L13:
            r2 = r15
            r3 = 2
            int r2 = r2 >> r3
        L16:
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r16
            r1 = r18
            r2 = r19
            if (r2 != 0) goto L2b
            r2 = r17
            r3 = r20
            int r2 = r2 * r3
            goto L2f
        L2b:
            r2 = r19
            r3 = 2
            int r2 = r2 >> r3
        L2f:
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L33:
            r0 = r12
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            int r0 = nstbir_resize_float(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 == 0) goto L51
            r0 = 1
            goto L52
        L51:
            r0 = 0
        L52:
            return r0
    }

    public static native int nstbir_resize_uint8_srgb(long r0, int r2, int r3, int r4, long r5, int r7, int r8, int r9, int r10, int r11, int r12);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbir_resize_uint8_srgb(@org.lwjgl.system.NativeType("unsigned char const *") java.nio.ByteBuffer r14, int r15, int r16, int r17, @org.lwjgl.system.NativeType("unsigned char *") java.nio.ByteBuffer r18, int r19, int r20, int r21, int r22, int r23, int r24) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L2f
            r0 = r14
            r1 = r16
            r2 = r17
            if (r2 != 0) goto L13
            r2 = r15
            r3 = r22
            int r2 = r2 * r3
            goto L14
        L13:
            r2 = r17
        L14:
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r18
            r1 = r20
            r2 = r21
            if (r2 != 0) goto L29
            r2 = r19
            r3 = r22
            int r2 = r2 * r3
            goto L2b
        L29:
            r2 = r21
        L2b:
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L2f:
            r0 = r14
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            int r0 = nstbir_resize_uint8_srgb(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r0 == 0) goto L51
            r0 = 1
            goto L52
        L51:
            r0 = 0
        L52:
            return r0
    }

    public static native int nstbir_resize_uint8_srgb_edgemode(long r0, int r2, int r3, int r4, long r5, int r7, int r8, int r9, int r10, int r11, int r12, int r13);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbir_resize_uint8_srgb_edgemode(@org.lwjgl.system.NativeType("unsigned char const *") java.nio.ByteBuffer r15, int r16, int r17, int r18, @org.lwjgl.system.NativeType("unsigned char *") java.nio.ByteBuffer r19, int r20, int r21, int r22, int r23, int r24, int r25, @org.lwjgl.system.NativeType("stbir_edge") int r26) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L2f
            r0 = r15
            r1 = r17
            r2 = r18
            if (r2 != 0) goto L13
            r2 = r16
            r3 = r23
            int r2 = r2 * r3
            goto L14
        L13:
            r2 = r18
        L14:
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r19
            r1 = r21
            r2 = r22
            if (r2 != 0) goto L29
            r2 = r20
            r3 = r23
            int r2 = r2 * r3
            goto L2b
        L29:
            r2 = r22
        L2b:
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L2f:
            r0 = r15
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r26
            int r0 = nstbir_resize_uint8_srgb_edgemode(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r0 == 0) goto L53
            r0 = 1
            goto L54
        L53:
            r0 = 0
        L54:
            return r0
    }

    public static native int nstbir_resize_uint8_generic(long r0, int r2, int r3, int r4, long r5, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15, long r16);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbir_resize_uint8_generic(@org.lwjgl.system.NativeType("unsigned char const *") java.nio.ByteBuffer r19, int r20, int r21, int r22, @org.lwjgl.system.NativeType("unsigned char *") java.nio.ByteBuffer r23, int r24, int r25, int r26, int r27, int r28, int r29, @org.lwjgl.system.NativeType("stbir_edge") int r30, @org.lwjgl.system.NativeType("stbir_filter") int r31, @org.lwjgl.system.NativeType("stbir_colorspace") int r32) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L2f
            r0 = r19
            r1 = r21
            r2 = r22
            if (r2 != 0) goto L13
            r2 = r20
            r3 = r27
            int r2 = r2 * r3
            goto L14
        L13:
            r2 = r22
        L14:
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r23
            r1 = r25
            r2 = r26
            if (r2 != 0) goto L29
            r2 = r24
            r3 = r27
            int r2 = r2 * r3
            goto L2b
        L29:
            r2 = r26
        L2b:
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L2f:
            r0 = r19
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r24
            r6 = r25
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            r12 = r31
            r13 = r32
            r14 = 0
            int r0 = nstbir_resize_uint8_generic(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r0 == 0) goto L58
            r0 = 1
            goto L59
        L58:
            r0 = 0
        L59:
            return r0
    }

    public static native int nstbir_resize_uint16_generic(long r0, int r2, int r3, int r4, long r5, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15, long r16);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbir_resize_uint16_generic(@org.lwjgl.system.NativeType("stbir_uint16 const *") java.nio.ShortBuffer r19, int r20, int r21, int r22, @org.lwjgl.system.NativeType("stbir_uint16 *") java.nio.ShortBuffer r23, int r24, int r25, int r26, int r27, int r28, int r29, @org.lwjgl.system.NativeType("stbir_edge") int r30, @org.lwjgl.system.NativeType("stbir_filter") int r31, @org.lwjgl.system.NativeType("stbir_colorspace") int r32) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L33
            r0 = r19
            r1 = r21
            r2 = r22
            if (r2 != 0) goto L13
            r2 = r20
            r3 = r27
            int r2 = r2 * r3
            goto L16
        L13:
            r2 = r22
            r3 = 1
            int r2 = r2 >> r3
        L16:
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r23
            r1 = r25
            r2 = r26
            if (r2 != 0) goto L2b
            r2 = r24
            r3 = r27
            int r2 = r2 * r3
            goto L2f
        L2b:
            r2 = r26
            r3 = 1
            int r2 = r2 >> r3
        L2f:
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L33:
            r0 = r19
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r24
            r6 = r25
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            r12 = r31
            r13 = r32
            r14 = 0
            int r0 = nstbir_resize_uint16_generic(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r0 == 0) goto L5c
            r0 = 1
            goto L5d
        L5c:
            r0 = 0
        L5d:
            return r0
    }

    public static native int nstbir_resize_float_generic(long r0, int r2, int r3, int r4, long r5, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15, long r16);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbir_resize_float_generic(@org.lwjgl.system.NativeType("float const *") java.nio.FloatBuffer r19, int r20, int r21, int r22, @org.lwjgl.system.NativeType("float *") java.nio.FloatBuffer r23, int r24, int r25, int r26, int r27, int r28, int r29, @org.lwjgl.system.NativeType("stbir_edge") int r30, @org.lwjgl.system.NativeType("stbir_filter") int r31, @org.lwjgl.system.NativeType("stbir_colorspace") int r32) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L33
            r0 = r19
            r1 = r21
            r2 = r22
            if (r2 != 0) goto L13
            r2 = r20
            r3 = r27
            int r2 = r2 * r3
            goto L16
        L13:
            r2 = r22
            r3 = 2
            int r2 = r2 >> r3
        L16:
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r23
            r1 = r25
            r2 = r26
            if (r2 != 0) goto L2b
            r2 = r24
            r3 = r27
            int r2 = r2 * r3
            goto L2f
        L2b:
            r2 = r26
            r3 = 2
            int r2 = r2 >> r3
        L2f:
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L33:
            r0 = r19
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r24
            r6 = r25
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            r12 = r31
            r13 = r32
            r14 = 0
            int r0 = nstbir_resize_float_generic(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r0 == 0) goto L5c
            r0 = 1
            goto L5d
        L5c:
            r0 = 0
        L5d:
            return r0
    }

    public static native int nstbir_resize(long r0, int r2, int r3, int r4, long r5, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, long r19);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbir_resize(@org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r22, int r23, int r24, int r25, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r26, int r27, int r28, int r29, @org.lwjgl.system.NativeType("stbir_datatype") int r30, int r31, int r32, int r33, @org.lwjgl.system.NativeType("stbir_edge") int r34, @org.lwjgl.system.NativeType("stbir_edge") int r35, @org.lwjgl.system.NativeType("stbir_filter") int r36, @org.lwjgl.system.NativeType("stbir_filter") int r37, @org.lwjgl.system.NativeType("stbir_colorspace") int r38) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L3b
            r0 = r22
            r1 = r24
            r2 = r25
            if (r2 != 0) goto L19
            r2 = r23
            r3 = r31
            int r2 = r2 * r3
            r3 = r30
            int r3 = getTypeShift(r3)
            int r2 = r2 << r3
            goto L1a
        L19:
            r2 = r25
        L1a:
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r26
            r1 = r28
            r2 = r29
            if (r2 != 0) goto L35
            r2 = r27
            r3 = r31
            int r2 = r2 * r3
            r3 = r30
            int r3 = getTypeShift(r3)
            int r2 = r2 << r3
            goto L37
        L35:
            r2 = r29
        L37:
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L3b:
            r0 = r22
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r27
            r6 = r28
            r7 = r29
            r8 = r30
            r9 = r31
            r10 = r32
            r11 = r33
            r12 = r34
            r13 = r35
            r14 = r36
            r15 = r37
            r16 = r38
            r17 = 0
            int r0 = nstbir_resize(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L6a
            r0 = 1
            goto L6b
        L6a:
            r0 = 0
        L6b:
            return r0
    }

    public static native int nstbir_resize_subpixel(long r0, int r2, int r3, int r4, long r5, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, long r19, float r21, float r22, float r23, float r24);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbir_resize_subpixel(@org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r26, int r27, int r28, int r29, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r30, int r31, int r32, int r33, @org.lwjgl.system.NativeType("stbir_datatype") int r34, int r35, int r36, int r37, @org.lwjgl.system.NativeType("stbir_edge") int r38, @org.lwjgl.system.NativeType("stbir_edge") int r39, @org.lwjgl.system.NativeType("stbir_filter") int r40, @org.lwjgl.system.NativeType("stbir_filter") int r41, @org.lwjgl.system.NativeType("stbir_colorspace") int r42, float r43, float r44, float r45, float r46) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L3b
            r0 = r26
            r1 = r28
            r2 = r29
            if (r2 != 0) goto L19
            r2 = r27
            r3 = r35
            int r2 = r2 * r3
            r3 = r34
            int r3 = getTypeShift(r3)
            int r2 = r2 << r3
            goto L1a
        L19:
            r2 = r29
        L1a:
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r30
            r1 = r32
            r2 = r33
            if (r2 != 0) goto L35
            r2 = r31
            r3 = r35
            int r2 = r2 * r3
            r3 = r34
            int r3 = getTypeShift(r3)
            int r2 = r2 << r3
            goto L37
        L35:
            r2 = r33
        L37:
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L3b:
            r0 = r26
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r31
            r6 = r32
            r7 = r33
            r8 = r34
            r9 = r35
            r10 = r36
            r11 = r37
            r12 = r38
            r13 = r39
            r14 = r40
            r15 = r41
            r16 = r42
            r17 = 0
            r18 = r43
            r19 = r44
            r20 = r45
            r21 = r46
            int r0 = nstbir_resize_subpixel(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            if (r0 == 0) goto L72
            r0 = 1
            goto L73
        L72:
            r0 = 0
        L73:
            return r0
    }

    public static native int nstbir_resize_region(long r0, int r2, int r3, int r4, long r5, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, long r19, float r21, float r22, float r23, float r24);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbir_resize_region(@org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r26, int r27, int r28, int r29, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r30, int r31, int r32, int r33, @org.lwjgl.system.NativeType("stbir_datatype") int r34, int r35, int r36, int r37, @org.lwjgl.system.NativeType("stbir_edge") int r38, @org.lwjgl.system.NativeType("stbir_edge") int r39, @org.lwjgl.system.NativeType("stbir_filter") int r40, @org.lwjgl.system.NativeType("stbir_filter") int r41, @org.lwjgl.system.NativeType("stbir_colorspace") int r42, float r43, float r44, float r45, float r46) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L3b
            r0 = r26
            r1 = r28
            r2 = r29
            if (r2 != 0) goto L19
            r2 = r27
            r3 = r35
            int r2 = r2 * r3
            r3 = r34
            int r3 = getTypeShift(r3)
            int r2 = r2 << r3
            goto L1a
        L19:
            r2 = r29
        L1a:
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r30
            r1 = r32
            r2 = r33
            if (r2 != 0) goto L35
            r2 = r31
            r3 = r35
            int r2 = r2 * r3
            r3 = r34
            int r3 = getTypeShift(r3)
            int r2 = r2 << r3
            goto L37
        L35:
            r2 = r33
        L37:
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L3b:
            r0 = r26
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r31
            r6 = r32
            r7 = r33
            r8 = r34
            r9 = r35
            r10 = r36
            r11 = r37
            r12 = r38
            r13 = r39
            r14 = r40
            r15 = r41
            r16 = r42
            r17 = 0
            r18 = r43
            r19 = r44
            r20 = r45
            r21 = r46
            int r0 = nstbir_resize_region(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            if (r0 == 0) goto L72
            r0 = 1
            goto L73
        L72:
            r0 = 0
        L73:
            return r0
    }

    public static native int nstbir_resize_float(float[] r0, int r1, int r2, int r3, float[] r4, int r5, int r6, int r7, int r8);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbir_resize_float(@org.lwjgl.system.NativeType("float const *") float[] r10, int r11, int r12, int r13, @org.lwjgl.system.NativeType("float *") float[] r14, int r15, int r16, int r17, int r18) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L33
            r0 = r10
            r1 = r12
            r2 = r13
            if (r2 != 0) goto L13
            r2 = r11
            r3 = r18
            int r2 = r2 * r3
            goto L16
        L13:
            r2 = r13
            r3 = 2
            int r2 = r2 >> r3
        L16:
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r14
            r1 = r16
            r2 = r17
            if (r2 != 0) goto L2b
            r2 = r15
            r3 = r18
            int r2 = r2 * r3
            goto L2f
        L2b:
            r2 = r17
            r3 = 2
            int r2 = r2 >> r3
        L2f:
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L33:
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            int r0 = nstbir_resize_float(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 == 0) goto L4b
            r0 = 1
            goto L4c
        L4b:
            r0 = 0
        L4c:
            return r0
    }

    public static native int nstbir_resize_uint16_generic(short[] r0, int r1, int r2, int r3, short[] r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, long r14);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbir_resize_uint16_generic(@org.lwjgl.system.NativeType("stbir_uint16 const *") short[] r17, int r18, int r19, int r20, @org.lwjgl.system.NativeType("stbir_uint16 *") short[] r21, int r22, int r23, int r24, int r25, int r26, int r27, @org.lwjgl.system.NativeType("stbir_edge") int r28, @org.lwjgl.system.NativeType("stbir_filter") int r29, @org.lwjgl.system.NativeType("stbir_colorspace") int r30) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L33
            r0 = r17
            r1 = r19
            r2 = r20
            if (r2 != 0) goto L13
            r2 = r18
            r3 = r25
            int r2 = r2 * r3
            goto L16
        L13:
            r2 = r20
            r3 = 1
            int r2 = r2 >> r3
        L16:
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r21
            r1 = r23
            r2 = r24
            if (r2 != 0) goto L2b
            r2 = r22
            r3 = r25
            int r2 = r2 * r3
            goto L2f
        L2b:
            r2 = r24
            r3 = 1
            int r2 = r2 >> r3
        L2f:
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L33:
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r11 = r28
            r12 = r29
            r13 = r30
            r14 = 0
            int r0 = nstbir_resize_uint16_generic(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r0 == 0) goto L56
            r0 = 1
            goto L57
        L56:
            r0 = 0
        L57:
            return r0
    }

    public static native int nstbir_resize_float_generic(float[] r0, int r1, int r2, int r3, float[] r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, long r14);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbir_resize_float_generic(@org.lwjgl.system.NativeType("float const *") float[] r17, int r18, int r19, int r20, @org.lwjgl.system.NativeType("float *") float[] r21, int r22, int r23, int r24, int r25, int r26, int r27, @org.lwjgl.system.NativeType("stbir_edge") int r28, @org.lwjgl.system.NativeType("stbir_filter") int r29, @org.lwjgl.system.NativeType("stbir_colorspace") int r30) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L33
            r0 = r17
            r1 = r19
            r2 = r20
            if (r2 != 0) goto L13
            r2 = r18
            r3 = r25
            int r2 = r2 * r3
            goto L16
        L13:
            r2 = r20
            r3 = 2
            int r2 = r2 >> r3
        L16:
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r21
            r1 = r23
            r2 = r24
            if (r2 != 0) goto L2b
            r2 = r22
            r3 = r25
            int r2 = r2 * r3
            goto L2f
        L2b:
            r2 = r24
            r3 = 2
            int r2 = r2 >> r3
        L2f:
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L33:
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r11 = r28
            r12 = r29
            r13 = r30
            r14 = 0
            int r0 = nstbir_resize_float_generic(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r0 == 0) goto L56
            r0 = 1
            goto L57
        L56:
            r0 = 0
        L57:
            return r0
    }

    private static int getTypeShift(int r2) {
            r0 = r2
            switch(r0) {
                case 0: goto L1c;
                case 1: goto L1e;
                default: goto L20;
            }
        L1c:
            r0 = 0
            return r0
        L1e:
            r0 = 1
            return r0
        L20:
            r0 = 2
            return r0
    }

    static {
            org.lwjgl.stb.LibSTB.initialize()
            return
    }
}
