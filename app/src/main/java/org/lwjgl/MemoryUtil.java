package org.lwjgl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/MemoryUtil.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/MemoryUtil.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/MemoryUtil.class */
public final class MemoryUtil {
    private static final java.nio.charset.Charset ascii = null;
    private static final java.nio.charset.Charset utf8 = null;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/MemoryUtil$Accessor.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/MemoryUtil$Accessor.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/MemoryUtil$Accessor.class */
    interface Accessor {
        long getAddress(java.nio.Buffer r1);
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/MemoryUtil$AccessorJNI.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/MemoryUtil$AccessorJNI.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/MemoryUtil$AccessorJNI.class */
    private static class AccessorJNI implements org.lwjgl.MemoryUtil.Accessor {
        private AccessorJNI() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // org.lwjgl.MemoryUtil.Accessor
        public long getAddress(java.nio.Buffer r4) {
                r3 = this;
                r0 = r4
                long r0 = org.lwjgl.BufferUtils.getBufferAddress(r0)
                return r0
        }
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/MemoryUtil$AccessorReflect.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/MemoryUtil$AccessorReflect.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/MemoryUtil$AccessorReflect.class */
    private static class AccessorReflect implements org.lwjgl.MemoryUtil.Accessor {
        private final java.lang.reflect.Field address;

        AccessorReflect() {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                java.lang.reflect.Field r1 = org.lwjgl.MemoryUtil.getAddressField()     // Catch: java.lang.NoSuchFieldException -> Le
                r0.address = r1     // Catch: java.lang.NoSuchFieldException -> Le
                goto L18
            Le:
                r5 = move-exception
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r1 = r0
                r2 = r5
                r1.<init>(r2)
                throw r0
            L18:
                r0 = r4
                java.lang.reflect.Field r0 = r0.address
                r1 = 1
                r0.setAccessible(r1)
                return
        }

        @Override // org.lwjgl.MemoryUtil.Accessor
        public long getAddress(java.nio.Buffer r4) {
                r3 = this;
                r0 = r3
                java.lang.reflect.Field r0 = r0.address     // Catch: java.lang.IllegalAccessException -> L9
                r1 = r4
                long r0 = r0.getLong(r1)     // Catch: java.lang.IllegalAccessException -> L9
                return r0
            L9:
                r5 = move-exception
                r0 = 0
                return r0
        }
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/MemoryUtil$CharSequenceNT.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/MemoryUtil$CharSequenceNT.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/MemoryUtil$CharSequenceNT.class */
    private static class CharSequenceNT implements java.lang.CharSequence {
        final java.lang.CharSequence source;

        CharSequenceNT(java.lang.CharSequence r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.source = r1
                return
        }

        @Override // java.lang.CharSequence
        public int length() {
                r3 = this;
                r0 = r3
                java.lang.CharSequence r0 = r0.source
                int r0 = r0.length()
                r1 = 1
                int r0 = r0 + r1
                return r0
        }

        @Override // java.lang.CharSequence
        public char charAt(int r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                java.lang.CharSequence r1 = r1.source
                int r1 = r1.length()
                if (r0 != r1) goto L11
                r0 = 0
                goto L1b
            L11:
                r0 = r3
                java.lang.CharSequence r0 = r0.source
                r1 = r4
                char r0 = r0.charAt(r1)
            L1b:
                return r0
        }

        @Override // java.lang.CharSequence
        public java.lang.CharSequence subSequence(int r8, int r9) {
                r7 = this;
                org.lwjgl.MemoryUtil$CharSequenceNT r0 = new org.lwjgl.MemoryUtil$CharSequenceNT
                r1 = r0
                r2 = r7
                java.lang.CharSequence r2 = r2.source
                r3 = r8
                r4 = r9
                r5 = r7
                java.lang.CharSequence r5 = r5.source
                int r5 = r5.length()
                int r4 = java.lang.Math.min(r4, r5)
                java.lang.CharSequence r2 = r2.subSequence(r3, r4)
                r1.<init>(r2)
                return r0
        }
    }

    private MemoryUtil() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static long getAddress0(java.nio.Buffer r3) {
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress0(r0)
            return r0
    }

    public static long getAddress0Safe(java.nio.Buffer r3) {
            r0 = r3
            if (r0 != 0) goto L8
            r0 = 0
            goto Lc
        L8:
            r0 = r3
            long r0 = getAddress0(r0)
        Lc:
            return r0
    }

    public static long getAddress0(org.lwjgl.PointerBuffer r3) {
            r0 = r3
            java.nio.ByteBuffer r0 = r0.getBuffer()
            long r0 = getAddress0(r0)
            return r0
    }

    public static long getAddress0Safe(org.lwjgl.PointerBuffer r3) {
            r0 = r3
            if (r0 != 0) goto L8
            r0 = 0
            goto Lf
        L8:
            r0 = r3
            java.nio.ByteBuffer r0 = r0.getBuffer()
            long r0 = getAddress0(r0)
        Lf:
            return r0
    }

    public static long getAddress(java.nio.ByteBuffer r3) {
            r0 = r3
            r1 = r3
            int r1 = r1.position()
            long r0 = getAddress(r0, r1)
            return r0
    }

    public static long getAddress(java.nio.ByteBuffer r5, int r6) {
            r0 = r5
            long r0 = getAddress0(r0)
            r1 = r6
            long r1 = (long) r1
            long r0 = r0 + r1
            return r0
    }

    public static long getAddress(java.nio.ShortBuffer r3) {
            r0 = r3
            r1 = r3
            int r1 = r1.position()
            long r0 = getAddress(r0, r1)
            return r0
    }

    public static long getAddress(java.nio.ShortBuffer r5, int r6) {
            r0 = r5
            long r0 = getAddress0(r0)
            r1 = r6
            r2 = 1
            int r1 = r1 << r2
            long r1 = (long) r1
            long r0 = r0 + r1
            return r0
    }

    public static long getAddress(java.nio.CharBuffer r3) {
            r0 = r3
            r1 = r3
            int r1 = r1.position()
            long r0 = getAddress(r0, r1)
            return r0
    }

    public static long getAddress(java.nio.CharBuffer r5, int r6) {
            r0 = r5
            long r0 = getAddress0(r0)
            r1 = r6
            r2 = 1
            int r1 = r1 << r2
            long r1 = (long) r1
            long r0 = r0 + r1
            return r0
    }

    public static long getAddress(java.nio.IntBuffer r3) {
            r0 = r3
            r1 = r3
            int r1 = r1.position()
            long r0 = getAddress(r0, r1)
            return r0
    }

    public static long getAddress(java.nio.IntBuffer r5, int r6) {
            r0 = r5
            long r0 = getAddress0(r0)
            r1 = r6
            r2 = 2
            int r1 = r1 << r2
            long r1 = (long) r1
            long r0 = r0 + r1
            return r0
    }

    public static long getAddress(java.nio.FloatBuffer r3) {
            r0 = r3
            r1 = r3
            int r1 = r1.position()
            long r0 = getAddress(r0, r1)
            return r0
    }

    public static long getAddress(java.nio.FloatBuffer r5, int r6) {
            r0 = r5
            long r0 = getAddress0(r0)
            r1 = r6
            r2 = 2
            int r1 = r1 << r2
            long r1 = (long) r1
            long r0 = r0 + r1
            return r0
    }

    public static long getAddress(java.nio.LongBuffer r3) {
            r0 = r3
            r1 = r3
            int r1 = r1.position()
            long r0 = getAddress(r0, r1)
            return r0
    }

    public static long getAddress(java.nio.LongBuffer r5, int r6) {
            r0 = r5
            long r0 = getAddress0(r0)
            r1 = r6
            r2 = 3
            int r1 = r1 << r2
            long r1 = (long) r1
            long r0 = r0 + r1
            return r0
    }

    public static long getAddress(java.nio.DoubleBuffer r3) {
            r0 = r3
            r1 = r3
            int r1 = r1.position()
            long r0 = getAddress(r0, r1)
            return r0
    }

    public static long getAddress(java.nio.DoubleBuffer r5, int r6) {
            r0 = r5
            long r0 = getAddress0(r0)
            r1 = r6
            r2 = 3
            int r1 = r1 << r2
            long r1 = (long) r1
            long r0 = r0 + r1
            return r0
    }

    public static long getAddress(org.lwjgl.PointerBuffer r3) {
            r0 = r3
            r1 = r3
            int r1 = r1.position()
            long r0 = getAddress(r0, r1)
            return r0
    }

    public static long getAddress(org.lwjgl.PointerBuffer r5, int r6) {
            r0 = r5
            long r0 = getAddress0(r0)
            r1 = r6
            int r2 = org.lwjgl.PointerBuffer.getPointerSize()
            int r1 = r1 * r2
            long r1 = (long) r1
            long r0 = r0 + r1
            return r0
    }

    public static long getAddressSafe(java.nio.ByteBuffer r3) {
            r0 = r3
            if (r0 != 0) goto L8
            r0 = 0
            goto Lc
        L8:
            r0 = r3
            long r0 = getAddress(r0)
        Lc:
            return r0
    }

    public static long getAddressSafe(java.nio.ByteBuffer r3, int r4) {
            r0 = r3
            if (r0 != 0) goto L8
            r0 = 0
            goto Ld
        L8:
            r0 = r3
            r1 = r4
            long r0 = getAddress(r0, r1)
        Ld:
            return r0
    }

    public static long getAddressSafe(java.nio.ShortBuffer r3) {
            r0 = r3
            if (r0 != 0) goto L8
            r0 = 0
            goto Lc
        L8:
            r0 = r3
            long r0 = getAddress(r0)
        Lc:
            return r0
    }

    public static long getAddressSafe(java.nio.ShortBuffer r3, int r4) {
            r0 = r3
            if (r0 != 0) goto L8
            r0 = 0
            goto Ld
        L8:
            r0 = r3
            r1 = r4
            long r0 = getAddress(r0, r1)
        Ld:
            return r0
    }

    public static long getAddressSafe(java.nio.CharBuffer r3) {
            r0 = r3
            if (r0 != 0) goto L8
            r0 = 0
            goto Lc
        L8:
            r0 = r3
            long r0 = getAddress(r0)
        Lc:
            return r0
    }

    public static long getAddressSafe(java.nio.CharBuffer r3, int r4) {
            r0 = r3
            if (r0 != 0) goto L8
            r0 = 0
            goto Ld
        L8:
            r0 = r3
            r1 = r4
            long r0 = getAddress(r0, r1)
        Ld:
            return r0
    }

    public static long getAddressSafe(java.nio.IntBuffer r3) {
            r0 = r3
            if (r0 != 0) goto L8
            r0 = 0
            goto Lc
        L8:
            r0 = r3
            long r0 = getAddress(r0)
        Lc:
            return r0
    }

    public static long getAddressSafe(java.nio.IntBuffer r3, int r4) {
            r0 = r3
            if (r0 != 0) goto L8
            r0 = 0
            goto Ld
        L8:
            r0 = r3
            r1 = r4
            long r0 = getAddress(r0, r1)
        Ld:
            return r0
    }

    public static long getAddressSafe(java.nio.FloatBuffer r3) {
            r0 = r3
            if (r0 != 0) goto L8
            r0 = 0
            goto Lc
        L8:
            r0 = r3
            long r0 = getAddress(r0)
        Lc:
            return r0
    }

    public static long getAddressSafe(java.nio.FloatBuffer r3, int r4) {
            r0 = r3
            if (r0 != 0) goto L8
            r0 = 0
            goto Ld
        L8:
            r0 = r3
            r1 = r4
            long r0 = getAddress(r0, r1)
        Ld:
            return r0
    }

    public static long getAddressSafe(java.nio.LongBuffer r3) {
            r0 = r3
            if (r0 != 0) goto L8
            r0 = 0
            goto Lc
        L8:
            r0 = r3
            long r0 = getAddress(r0)
        Lc:
            return r0
    }

    public static long getAddressSafe(java.nio.LongBuffer r3, int r4) {
            r0 = r3
            if (r0 != 0) goto L8
            r0 = 0
            goto Ld
        L8:
            r0 = r3
            r1 = r4
            long r0 = getAddress(r0, r1)
        Ld:
            return r0
    }

    public static long getAddressSafe(java.nio.DoubleBuffer r3) {
            r0 = r3
            if (r0 != 0) goto L8
            r0 = 0
            goto Lc
        L8:
            r0 = r3
            long r0 = getAddress(r0)
        Lc:
            return r0
    }

    public static long getAddressSafe(java.nio.DoubleBuffer r3, int r4) {
            r0 = r3
            if (r0 != 0) goto L8
            r0 = 0
            goto Ld
        L8:
            r0 = r3
            r1 = r4
            long r0 = getAddress(r0, r1)
        Ld:
            return r0
    }

    public static long getAddressSafe(org.lwjgl.PointerBuffer r3) {
            r0 = r3
            if (r0 != 0) goto L8
            r0 = 0
            goto Lc
        L8:
            r0 = r3
            long r0 = getAddress(r0)
        Lc:
            return r0
    }

    public static long getAddressSafe(org.lwjgl.PointerBuffer r3, int r4) {
            r0 = r3
            if (r0 != 0) goto L8
            r0 = 0
            goto Ld
        L8:
            r0 = r3
            r1 = r4
            long r0 = getAddress(r0, r1)
        Ld:
            return r0
    }

    public static java.nio.ByteBuffer encodeASCII(java.lang.CharSequence r3) {
            r0 = r3
            java.nio.charset.Charset r1 = org.lwjgl.MemoryUtil.ascii
            java.nio.ByteBuffer r0 = encode(r0, r1)
            return r0
    }

    public static java.nio.ByteBuffer encodeUTF8(java.lang.CharSequence r3) {
            r0 = r3
            java.nio.charset.Charset r1 = org.lwjgl.MemoryUtil.utf8
            java.nio.ByteBuffer r0 = encode(r0, r1)
            return r0
    }

    public static java.nio.ByteBuffer encodeUTF16(java.lang.CharSequence r2) {
            r0 = r2
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memUTF16(r0)
            return r0
    }

    private static java.nio.ByteBuffer encode(java.lang.CharSequence r4, java.nio.charset.Charset r5) {
            r0 = r4
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            org.lwjgl.MemoryUtil$CharSequenceNT r0 = new org.lwjgl.MemoryUtil$CharSequenceNT
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            java.nio.CharBuffer r0 = java.nio.CharBuffer.wrap(r0)
            r1 = r5
            java.nio.ByteBuffer r0 = encode(r0, r1)
            return r0
    }

    private static java.nio.ByteBuffer encode(java.nio.CharBuffer r5, java.nio.charset.Charset r6) {
            r0 = r6
            java.nio.charset.CharsetEncoder r0 = r0.newEncoder()
            r7 = r0
            r0 = r5
            int r0 = r0.remaining()
            float r0 = (float) r0
            r1 = r7
            float r1 = r1.averageBytesPerChar()
            float r0 = r0 * r1
            int r0 = (int) r0
            r8 = r0
            r0 = r8
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r9 = r0
            r0 = r8
            if (r0 != 0) goto L25
            r0 = r5
            int r0 = r0.remaining()
            if (r0 != 0) goto L25
            r0 = r9
            return r0
        L25:
            r0 = r7
            java.nio.charset.CharsetEncoder r0 = r0.reset()
        L2a:
            r0 = r5
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L3c
            r0 = r7
            r1 = r5
            r2 = r9
            r3 = 1
            java.nio.charset.CoderResult r0 = r0.encode(r1, r2, r3)
            goto L3f
        L3c:
            java.nio.charset.CoderResult r0 = java.nio.charset.CoderResult.UNDERFLOW
        L3f:
            r10 = r0
            r0 = r10
            boolean r0 = r0.isUnderflow()
            if (r0 == 0) goto L51
            r0 = r7
            r1 = r9
            java.nio.charset.CoderResult r0 = r0.flush(r1)
            r10 = r0
        L51:
            r0 = r10
            boolean r0 = r0.isUnderflow()
            if (r0 == 0) goto L5c
            goto L9c
        L5c:
            r0 = r10
            boolean r0 = r0.isOverflow()
            if (r0 == 0) goto L85
            r0 = 2
            r1 = r8
            int r0 = r0 * r1
            r1 = 1
            int r0 = r0 + r1
            r8 = r0
            r0 = r8
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r11 = r0
            r0 = r9
            java.nio.Buffer r0 = r0.flip()
            r0 = r11
            r1 = r9
            java.nio.ByteBuffer r0 = r0.put(r1)
            r0 = r11
            r9 = r0
            goto L2a
        L85:
            r0 = r10
            r0.throwException()     // Catch: java.nio.charset.CharacterCodingException -> L8d
            goto L99
        L8d:
            r11 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r11
            r1.<init>(r2)
            throw r0
        L99:
            goto L2a
        L9c:
            r0 = r9
            java.nio.Buffer r0 = r0.flip()
            r0 = r9
            return r0
    }

    public static java.lang.String decodeASCII(java.nio.ByteBuffer r3) {
            r0 = r3
            java.nio.charset.Charset r1 = org.lwjgl.MemoryUtil.ascii
            java.lang.String r0 = decode(r0, r1)
            return r0
    }

    public static java.lang.String decodeUTF8(java.nio.ByteBuffer r3) {
            r0 = r3
            java.nio.charset.Charset r1 = org.lwjgl.MemoryUtil.utf8
            java.lang.String r0 = decode(r0, r1)
            return r0
    }

    public static java.lang.String decodeUTF16(java.nio.ByteBuffer r2) {
            r0 = r2
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF16(r0)
            return r0
    }

    private static java.lang.String decode(java.nio.ByteBuffer r3, java.nio.charset.Charset r4) {
            r0 = r3
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r3
            r1 = r4
            java.lang.String r0 = decodeImpl(r0, r1)
            return r0
    }

    private static java.lang.String decodeImpl(java.nio.ByteBuffer r5, java.nio.charset.Charset r6) {
            r0 = r6
            java.nio.charset.CharsetDecoder r0 = r0.newDecoder()
            r7 = r0
            r0 = r5
            int r0 = r0.remaining()
            float r0 = (float) r0
            r1 = r7
            float r1 = r1.averageCharsPerByte()
            float r0 = r0 * r1
            int r0 = (int) r0
            r8 = r0
            r0 = r8
            java.nio.CharBuffer r0 = org.lwjgl.BufferUtils.createCharBuffer(r0)
            r9 = r0
            r0 = r8
            if (r0 != 0) goto L25
            r0 = r5
            int r0 = r0.remaining()
            if (r0 != 0) goto L25
            java.lang.String r0 = ""
            return r0
        L25:
            r0 = r7
            java.nio.charset.CharsetDecoder r0 = r0.reset()
        L2a:
            r0 = r5
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L3c
            r0 = r7
            r1 = r5
            r2 = r9
            r3 = 1
            java.nio.charset.CoderResult r0 = r0.decode(r1, r2, r3)
            goto L3f
        L3c:
            java.nio.charset.CoderResult r0 = java.nio.charset.CoderResult.UNDERFLOW
        L3f:
            r10 = r0
            r0 = r10
            boolean r0 = r0.isUnderflow()
            if (r0 == 0) goto L51
            r0 = r7
            r1 = r9
            java.nio.charset.CoderResult r0 = r0.flush(r1)
            r10 = r0
        L51:
            r0 = r10
            boolean r0 = r0.isUnderflow()
            if (r0 == 0) goto L5c
            goto L9c
        L5c:
            r0 = r10
            boolean r0 = r0.isOverflow()
            if (r0 == 0) goto L85
            r0 = 2
            r1 = r8
            int r0 = r0 * r1
            r1 = 1
            int r0 = r0 + r1
            r8 = r0
            r0 = r8
            java.nio.CharBuffer r0 = org.lwjgl.BufferUtils.createCharBuffer(r0)
            r11 = r0
            r0 = r9
            java.nio.Buffer r0 = r0.flip()
            r0 = r11
            r1 = r9
            java.nio.CharBuffer r0 = r0.put(r1)
            r0 = r11
            r9 = r0
            goto L2a
        L85:
            r0 = r10
            r0.throwException()     // Catch: java.nio.charset.CharacterCodingException -> L8d
            goto L99
        L8d:
            r11 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r11
            r1.<init>(r2)
            throw r0
        L99:
            goto L2a
        L9c:
            r0 = r9
            java.nio.Buffer r0 = r0.flip()
            r0 = r9
            java.lang.String r0 = r0.toString()
            return r0
    }

    private static org.lwjgl.MemoryUtil.Accessor loadAccessor(java.lang.String r2) throws java.lang.Exception {
            r0 = r2
            java.lang.Class r0 = java.lang.Class.forName(r0)
            java.lang.Object r0 = r0.newInstance()
            org.lwjgl.MemoryUtil$Accessor r0 = (org.lwjgl.MemoryUtil.Accessor) r0
            return r0
    }

    static java.lang.reflect.Field getAddressField() throws java.lang.NoSuchFieldException {
            java.lang.Class<java.nio.ByteBuffer> r0 = java.nio.ByteBuffer.class
            java.lang.String r1 = "address"
            java.lang.reflect.Field r0 = getDeclaredFieldRecursive(r0, r1)
            return r0
    }

    private static java.lang.reflect.Field getDeclaredFieldRecursive(java.lang.Class<?> r5, java.lang.String r6) throws java.lang.NoSuchFieldException {
            r0 = r5
            r7 = r0
        L2:
            r0 = r7
            r1 = r6
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.NoSuchFieldException -> L8
            return r0
        L8:
            r8 = move-exception
            r0 = r7
            java.lang.Class r0 = r0.getSuperclass()
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L2
            java.lang.NoSuchFieldException r0 = new java.lang.NoSuchFieldException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " does not exist in "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.String r3 = r3.getSimpleName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " or any of its superclasses."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    static {
            java.lang.String r0 = "ISO-8859-1"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            org.lwjgl.MemoryUtil.ascii = r0
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            org.lwjgl.MemoryUtil.utf8 = r0
            return
    }
}
