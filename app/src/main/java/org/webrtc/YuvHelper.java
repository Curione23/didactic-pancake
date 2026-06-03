package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/YuvHelper.class */
public class YuvHelper {
    public YuvHelper() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void I420Copy(java.nio.ByteBuffer r15, int r16, java.nio.ByteBuffer r17, int r18, java.nio.ByteBuffer r19, int r20, java.nio.ByteBuffer r21, int r22, int r23, int r24, int r25, int r26, int r27) {
            r0 = r22
            r1 = 1
            int r0 = r0 + r1
            r1 = 2
            int r0 = r0 / r1
            r28 = r0
            r0 = r23
            r1 = 1
            int r0 = r0 + r1
            r1 = 2
            int r0 = r0 / r1
            r29 = r0
            r0 = 0
            r30 = r0
            r0 = 0
            r1 = r24
            r2 = r23
            int r1 = r1 * r2
            int r0 = r0 + r1
            r31 = r0
            r0 = 0
            r1 = r24
            r2 = r25
            int r1 = r1 * r2
            int r0 = r0 + r1
            r32 = r0
            r0 = r32
            r1 = r26
            r2 = r29
            int r1 = r1 * r2
            int r0 = r0 + r1
            r33 = r0
            r0 = r32
            r1 = r26
            r2 = r27
            int r1 = r1 * r2
            int r0 = r0 + r1
            r34 = r0
            r0 = r34
            r1 = r26
            r2 = r29
            r3 = 1
            int r2 = r2 - r3
            int r1 = r1 * r2
            int r0 = r0 + r1
            r1 = r28
            int r0 = r0 + r1
            r35 = r0
            r0 = r21
            int r0 = r0.capacity()
            r1 = r35
            if (r0 >= r1) goto L66
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r2 = r35
            r3 = r21
            int r3 = r3.capacity()
            java.lang.String r2 = "Expected destination buffer capacity to be at least " + r2 + " was " + r3
            r1.<init>(r2)
            throw r0
        L66:
            r0 = r21
            r1 = r31
            java.nio.ByteBuffer r0 = r0.limit(r1)
            r0 = r21
            r1 = 0
            java.nio.ByteBuffer r0 = r0.position(r1)
            r0 = r21
            java.nio.ByteBuffer r0 = r0.slice()
            r36 = r0
            r0 = r21
            r1 = r33
            java.nio.ByteBuffer r0 = r0.limit(r1)
            r0 = r21
            r1 = r32
            java.nio.ByteBuffer r0 = r0.position(r1)
            r0 = r21
            java.nio.ByteBuffer r0 = r0.slice()
            r37 = r0
            r0 = r21
            r1 = r35
            java.nio.ByteBuffer r0 = r0.limit(r1)
            r0 = r21
            r1 = r34
            java.nio.ByteBuffer r0 = r0.position(r1)
            r0 = r21
            java.nio.ByteBuffer r0 = r0.slice()
            r38 = r0
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r36
            r7 = r24
            r8 = r37
            r9 = r26
            r10 = r38
            r11 = r26
            r12 = r22
            r13 = r23
            I420Copy(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
    }

    public static void I420Copy(java.nio.ByteBuffer r15, int r16, java.nio.ByteBuffer r17, int r18, java.nio.ByteBuffer r19, int r20, java.nio.ByteBuffer r21, int r22, int r23) {
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r22
            r10 = r23
            r11 = r22
            r12 = 1
            int r11 = r11 + r12
            r12 = 2
            int r11 = r11 / r12
            r12 = r23
            r13 = 1
            int r12 = r12 + r13
            r13 = 2
            int r12 = r12 / r13
            I420Copy(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
    }

    public static void I420Copy(java.nio.ByteBuffer r15, int r16, java.nio.ByteBuffer r17, int r18, java.nio.ByteBuffer r19, int r20, java.nio.ByteBuffer r21, int r22, int r23, int r24, int r25) {
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r24
            r12 = 1
            int r11 = r11 + r12
            r12 = 2
            int r11 = r11 / r12
            r12 = r25
            r13 = 1
            int r12 = r12 + r13
            r13 = 2
            int r12 = r12 / r13
            I420Copy(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
    }

    public static void I420ToNV12(java.nio.ByteBuffer r13, int r14, java.nio.ByteBuffer r15, int r16, java.nio.ByteBuffer r17, int r18, java.nio.ByteBuffer r19, int r20, int r21, int r22, int r23) {
            r0 = r21
            r1 = 1
            int r0 = r0 + r1
            r1 = 2
            int r0 = r0 / r1
            r24 = r0
            r0 = r20
            r1 = 1
            int r0 = r0 + r1
            r1 = 2
            int r0 = r0 / r1
            r25 = r0
            r0 = 0
            r26 = r0
            r0 = 0
            r1 = r22
            r2 = r21
            int r1 = r1 * r2
            int r0 = r0 + r1
            r27 = r0
            r0 = 0
            r1 = r22
            r2 = r23
            int r1 = r1 * r2
            int r0 = r0 + r1
            r28 = r0
            r0 = r28
            r1 = r25
            r2 = r24
            int r1 = r1 * r2
            r2 = 2
            int r1 = r1 * r2
            int r0 = r0 + r1
            r29 = r0
            r0 = r19
            int r0 = r0.capacity()
            r1 = r29
            if (r0 >= r1) goto L4f
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r2 = r29
            r3 = r19
            int r3 = r3.capacity()
            java.lang.String r2 = "Expected destination buffer capacity to be at least " + r2 + " was " + r3
            r1.<init>(r2)
            throw r0
        L4f:
            r0 = r19
            r1 = r27
            java.nio.ByteBuffer r0 = r0.limit(r1)
            r0 = r19
            r1 = 0
            java.nio.ByteBuffer r0 = r0.position(r1)
            r0 = r19
            java.nio.ByteBuffer r0 = r0.slice()
            r30 = r0
            r0 = r19
            r1 = r29
            java.nio.ByteBuffer r0 = r0.limit(r1)
            r0 = r19
            r1 = r28
            java.nio.ByteBuffer r0 = r0.position(r1)
            r0 = r19
            java.nio.ByteBuffer r0 = r0.slice()
            r31 = r0
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r30
            r7 = r22
            r8 = r31
            r9 = r25
            r10 = 2
            int r9 = r9 * r10
            r10 = r20
            r11 = r21
            I420ToNV12(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public static void I420ToNV12(java.nio.ByteBuffer r12, int r13, java.nio.ByteBuffer r14, int r15, java.nio.ByteBuffer r16, int r17, java.nio.ByteBuffer r18, int r19, int r20) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r19
            r10 = r20
            I420ToNV12(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void I420Rotate(java.nio.ByteBuffer r16, int r17, java.nio.ByteBuffer r18, int r19, java.nio.ByteBuffer r20, int r21, java.nio.ByteBuffer r22, int r23, int r24, int r25) {
            r0 = r16
            java.lang.String r1 = "srcY"
            java.lang.Object r0 = checkNotNull(r0, r1)
            r0 = r18
            java.lang.String r1 = "srcU"
            java.lang.Object r0 = checkNotNull(r0, r1)
            r0 = r20
            java.lang.String r1 = "srcV"
            java.lang.Object r0 = checkNotNull(r0, r1)
            r0 = r22
            java.lang.String r1 = "dst"
            java.lang.Object r0 = checkNotNull(r0, r1)
            r0 = r25
            r1 = 180(0xb4, float:2.52E-43)
            int r0 = r0 % r1
            if (r0 != 0) goto L2c
            r0 = r23
            goto L2e
        L2c:
            r0 = r24
        L2e:
            r26 = r0
            r0 = r25
            r1 = 180(0xb4, float:2.52E-43)
            int r0 = r0 % r1
            if (r0 != 0) goto L3e
            r0 = r24
            goto L40
        L3e:
            r0 = r23
        L40:
            r27 = r0
            r0 = r27
            r1 = 1
            int r0 = r0 + r1
            r1 = 2
            int r0 = r0 / r1
            r28 = r0
            r0 = r26
            r1 = 1
            int r0 = r0 + r1
            r1 = 2
            int r0 = r0 / r1
            r29 = r0
            r0 = r26
            r1 = r27
            int r0 = r0 * r1
            r1 = r29
            r2 = r28
            int r1 = r1 * r2
            r2 = 2
            int r1 = r1 * r2
            int r0 = r0 + r1
            r30 = r0
            r0 = r22
            int r0 = r0.capacity()
            r1 = r30
            if (r0 >= r1) goto L7f
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r2 = r30
            r3 = r22
            int r3 = r3.capacity()
            java.lang.String r2 = "Expected destination buffer capacity to be at least " + r2 + " was " + r3
            r1.<init>(r2)
            throw r0
        L7f:
            r0 = 0
            r31 = r0
            r0 = r27
            r1 = r26
            int r0 = r0 * r1
            r32 = r0
            r0 = r32
            r1 = r28
            r2 = r29
            int r1 = r1 * r2
            int r0 = r0 + r1
            r33 = r0
            r0 = r22
            r1 = 0
            java.nio.ByteBuffer r0 = r0.position(r1)
            r0 = r22
            java.nio.ByteBuffer r0 = r0.slice()
            r34 = r0
            r0 = r22
            r1 = r32
            java.nio.ByteBuffer r0 = r0.position(r1)
            r0 = r22
            java.nio.ByteBuffer r0 = r0.slice()
            r35 = r0
            r0 = r22
            r1 = r33
            java.nio.ByteBuffer r0 = r0.position(r1)
            r0 = r22
            java.nio.ByteBuffer r0 = r0.slice()
            r36 = r0
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r34
            r7 = r26
            r8 = r35
            r9 = r29
            r10 = r36
            r11 = r29
            r12 = r23
            r13 = r24
            r14 = r25
            nativeI420Rotate(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
    }

    public static void copyPlane(java.nio.ByteBuffer r7, int r8, java.nio.ByteBuffer r9, int r10, int r11, int r12) {
            r0 = r7
            java.lang.String r1 = "src"
            java.lang.Object r0 = checkNotNull(r0, r1)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r1 = r8
            r2 = r9
            java.lang.String r3 = "dst"
            java.lang.Object r2 = checkNotNull(r2, r3)
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            r3 = r10
            r4 = r11
            r5 = r12
            nativeCopyPlane(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void ABGRToI420(java.nio.ByteBuffer r11, int r12, java.nio.ByteBuffer r13, int r14, java.nio.ByteBuffer r15, int r16, java.nio.ByteBuffer r17, int r18, int r19, int r20) {
            r0 = r11
            java.lang.String r1 = "src"
            java.lang.Object r0 = checkNotNull(r0, r1)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r1 = r12
            r2 = r13
            java.lang.String r3 = "dstY"
            java.lang.Object r2 = checkNotNull(r2, r3)
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            r3 = r14
            r4 = r15
            java.lang.String r5 = "dstU"
            java.lang.Object r4 = checkNotNull(r4, r5)
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            r5 = r16
            r6 = r17
            java.lang.String r7 = "dstV"
            java.lang.Object r6 = checkNotNull(r6, r7)
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            r7 = r18
            r8 = r19
            r9 = r20
            nativeABGRToI420(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void I420Copy(java.nio.ByteBuffer r15, int r16, java.nio.ByteBuffer r17, int r18, java.nio.ByteBuffer r19, int r20, java.nio.ByteBuffer r21, int r22, java.nio.ByteBuffer r23, int r24, java.nio.ByteBuffer r25, int r26, int r27, int r28) {
            r0 = r15
            java.lang.String r1 = "srcY"
            java.lang.Object r0 = checkNotNull(r0, r1)
            r0 = r17
            java.lang.String r1 = "srcU"
            java.lang.Object r0 = checkNotNull(r0, r1)
            r0 = r19
            java.lang.String r1 = "srcV"
            java.lang.Object r0 = checkNotNull(r0, r1)
            r0 = r21
            java.lang.String r1 = "dstY"
            java.lang.Object r0 = checkNotNull(r0, r1)
            r0 = r23
            java.lang.String r1 = "dstU"
            java.lang.Object r0 = checkNotNull(r0, r1)
            r0 = r25
            java.lang.String r1 = "dstV"
            java.lang.Object r0 = checkNotNull(r0, r1)
            r0 = r27
            if (r0 <= 0) goto L38
            r0 = r28
            if (r0 > 0) goto L42
        L38:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "I420Copy: width and height should not be negative"
            r1.<init>(r2)
            throw r0
        L42:
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r26
            r12 = r27
            r13 = r28
            nativeI420Copy(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
    }

    public static void I420ToNV12(java.nio.ByteBuffer r13, int r14, java.nio.ByteBuffer r15, int r16, java.nio.ByteBuffer r17, int r18, java.nio.ByteBuffer r19, int r20, java.nio.ByteBuffer r21, int r22, int r23, int r24) {
            r0 = r13
            java.lang.String r1 = "srcY"
            java.lang.Object r0 = checkNotNull(r0, r1)
            r0 = r15
            java.lang.String r1 = "srcU"
            java.lang.Object r0 = checkNotNull(r0, r1)
            r0 = r17
            java.lang.String r1 = "srcV"
            java.lang.Object r0 = checkNotNull(r0, r1)
            r0 = r19
            java.lang.String r1 = "dstY"
            java.lang.Object r0 = checkNotNull(r0, r1)
            r0 = r21
            java.lang.String r1 = "dstUV"
            java.lang.Object r0 = checkNotNull(r0, r1)
            r0 = r23
            if (r0 <= 0) goto L30
            r0 = r24
            if (r0 > 0) goto L3a
        L30:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "I420ToNV12: width and height should not be negative"
            r1.<init>(r2)
            throw r0
        L3a:
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            nativeI420ToNV12(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public static void I420Rotate(java.nio.ByteBuffer r16, int r17, java.nio.ByteBuffer r18, int r19, java.nio.ByteBuffer r20, int r21, java.nio.ByteBuffer r22, int r23, java.nio.ByteBuffer r24, int r25, java.nio.ByteBuffer r26, int r27, int r28, int r29, int r30) {
            r0 = r16
            java.lang.String r1 = "srcY"
            java.lang.Object r0 = checkNotNull(r0, r1)
            r0 = r18
            java.lang.String r1 = "srcU"
            java.lang.Object r0 = checkNotNull(r0, r1)
            r0 = r20
            java.lang.String r1 = "srcV"
            java.lang.Object r0 = checkNotNull(r0, r1)
            r0 = r22
            java.lang.String r1 = "dstY"
            java.lang.Object r0 = checkNotNull(r0, r1)
            r0 = r24
            java.lang.String r1 = "dstU"
            java.lang.Object r0 = checkNotNull(r0, r1)
            r0 = r26
            java.lang.String r1 = "dstV"
            java.lang.Object r0 = checkNotNull(r0, r1)
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = r28
            r13 = r29
            r14 = r30
            nativeI420Rotate(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
    }

    private static <T> T checkNotNull(T r4, java.lang.String r5) {
            r0 = r4
            if (r0 != 0) goto L12
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r0
            r2 = r5
            java.lang.String r2 = r2 + " should not be null"
            r1.<init>(r2)
            throw r0
        L12:
            r0 = r4
            return r0
    }

    private static native void nativeCopyPlane(java.nio.ByteBuffer r0, int r1, java.nio.ByteBuffer r2, int r3, int r4, int r5);

    private static native void nativeI420Copy(java.nio.ByteBuffer r0, int r1, java.nio.ByteBuffer r2, int r3, java.nio.ByteBuffer r4, int r5, java.nio.ByteBuffer r6, int r7, java.nio.ByteBuffer r8, int r9, java.nio.ByteBuffer r10, int r11, int r12, int r13);

    private static native void nativeI420ToNV12(java.nio.ByteBuffer r0, int r1, java.nio.ByteBuffer r2, int r3, java.nio.ByteBuffer r4, int r5, java.nio.ByteBuffer r6, int r7, java.nio.ByteBuffer r8, int r9, int r10, int r11);

    private static native void nativeI420Rotate(java.nio.ByteBuffer r0, int r1, java.nio.ByteBuffer r2, int r3, java.nio.ByteBuffer r4, int r5, java.nio.ByteBuffer r6, int r7, java.nio.ByteBuffer r8, int r9, java.nio.ByteBuffer r10, int r11, int r12, int r13, int r14);

    private static native void nativeABGRToI420(java.nio.ByteBuffer r0, int r1, java.nio.ByteBuffer r2, int r3, java.nio.ByteBuffer r4, int r5, java.nio.ByteBuffer r6, int r7, int r8, int r9);
}
