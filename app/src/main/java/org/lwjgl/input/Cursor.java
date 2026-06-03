package org.lwjgl.input;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/input/Cursor.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/input/Cursor.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/input/Cursor.class */
public class Cursor {
    public static final int CURSOR_ONE_BIT_TRANSPARENCY = 1;
    public static final int CURSOR_8_BIT_ALPHA = 2;
    public static final int CURSOR_ANIMATION = 4;
    private final org.lwjgl.input.Cursor.CursorElement[] cursors;
    private int index;
    private boolean destroyed;
    private boolean isEmpty;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/input/Cursor$CursorElement.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/input/Cursor$CursorElement.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/input/Cursor$CursorElement.class */
    private static class CursorElement {
        final long cursorHandle;
        long delay;
        long timeout;

        CursorElement(int r6, int r7, long r8, long r10, org.lwjgl.glfw.GLFWImage r12) {
                r5 = this;
                r0 = r5
                r0.<init>()
                r0 = r5
                r1 = r8
                r0.delay = r1
                r0 = r5
                r1 = r10
                r0.timeout = r1
                r0 = r5
                r1 = r12
                r2 = r6
                r3 = r7
                long r1 = org.lwjgl.glfw.GLFW.glfwCreateCursor(r1, r2, r3)
                r0.cursorHandle = r1
                r0 = r5
                long r0 = r0.cursorHandle
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto L2d
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r1 = r0
                java.lang.String r2 = "Error creating GLFW cursor"
                r1.<init>(r2)
                throw r0
            L2d:
                return
        }
    }

    public Cursor(int r13, int r14, int r15, int r16, int r17, java.nio.IntBuffer r18, java.nio.IntBuffer r19) throws org.lwjgl.LWJGLException {
            r12 = this;
            r0 = r12
            r0.<init>()
            r0 = r12
            r1 = r17
            org.lwjgl.input.Cursor$CursorElement[] r1 = new org.lwjgl.input.Cursor.CursorElement[r1]
            r0.cursors = r1
            r0 = r18
            int r0 = r0.limit()
            java.nio.IntBuffer r0 = org.lwjgl.BufferUtils.createIntBuffer(r0)
            r20 = r0
            r0 = r13
            r1 = r14
            r2 = r17
            r3 = r18
            r4 = r20
            flipImages(r0, r1, r2, r3, r4)
            r0 = r13
            r1 = r14
            r2 = r20
            java.nio.ByteBuffer r0 = convertARGBIntBuffertoRGBAByteBuffer(r0, r1, r2)
            r21 = r0
            r0 = r17
            r1 = 1
            if (r0 != r1) goto L75
            r0 = r12
            r1 = 1
            r0.isEmpty = r1
            r0 = 0
            r22 = r0
        L39:
            r0 = r22
            r1 = r13
            r2 = r14
            int r1 = r1 * r2
            if (r0 >= r1) goto L75
            r0 = r21
            r1 = r22
            byte r0 = r0.get(r1)
            if (r0 == 0) goto L6f
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Encountered non-zero byte at "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r22
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ", custom cursor is not empty!"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r0 = r12
            r1 = 0
            r0.isEmpty = r1
        L6f:
            int r22 = r22 + 1
            goto L39
        L75:
            r0 = 0
            r22 = r0
        L78:
            r0 = r22
            r1 = r17
            if (r0 >= r1) goto Lf6
            r0 = r13
            r1 = r14
            int r0 = r0 * r1
            r23 = r0
            r0 = r23
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r24 = r0
            r0 = 0
            r25 = r0
        L8e:
            r0 = r25
            r1 = r23
            if (r0 >= r1) goto La6
            r0 = r24
            r1 = r21
            byte r1 = r1.get()
            java.nio.ByteBuffer r0 = r0.put(r1)
            int r25 = r25 + 1
            goto L8e
        La6:
            org.lwjgl.glfw.GLFWImage r0 = org.lwjgl.glfw.GLFWImage.malloc()
            r25 = r0
            r0 = r25
            r1 = r13
            org.lwjgl.glfw.GLFWImage r0 = r0.width(r1)
            r0 = r25
            r1 = r14
            org.lwjgl.glfw.GLFWImage r0 = r0.height(r1)
            r0 = r25
            r1 = r24
            org.lwjgl.glfw.GLFWImage r0 = r0.pixels(r1)
            r0 = r19
            if (r0 == 0) goto Ld1
            r0 = r19
            r1 = r22
            int r0 = r0.get(r1)
            long r0 = (long) r0
            goto Ld2
        Ld1:
            r0 = 0
        Ld2:
            r26 = r0
            long r0 = org.lwjgl.glfw.GLFW.glfwGetTimerValue()
            r28 = r0
            r0 = r12
            org.lwjgl.input.Cursor$CursorElement[] r0 = r0.cursors
            r1 = r22
            org.lwjgl.input.Cursor$CursorElement r2 = new org.lwjgl.input.Cursor$CursorElement
            r3 = r2
            r4 = r15
            r5 = r16
            r6 = r26
            r7 = r28
            r8 = r25
            r3.<init>(r4, r5, r6, r7, r8)
            r0[r1] = r2
            int r22 = r22 + 1
            goto L78
        Lf6:
            return
    }

    private static java.nio.ByteBuffer convertARGBIntBuffertoRGBAByteBuffer(int r3, int r4, java.nio.IntBuffer r5) {
            r0 = r3
            r1 = r4
            int r0 = r0 * r1
            r1 = 4
            int r0 = r0 * r1
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            r0 = 0
            r7 = r0
        Lc:
            r0 = r7
            r1 = r5
            int r1 = r1.limit()
            if (r0 >= r1) goto L5c
            r0 = r5
            r1 = r7
            int r0 = r0.get(r1)
            r8 = r0
            r0 = r8
            r1 = 24
            int r0 = r0 >>> r1
            byte r0 = (byte) r0
            r9 = r0
            r0 = r8
            r1 = 16
            int r0 = r0 >>> r1
            byte r0 = (byte) r0
            r10 = r0
            r0 = r8
            r1 = 8
            int r0 = r0 >>> r1
            byte r0 = (byte) r0
            r11 = r0
            r0 = r8
            byte r0 = (byte) r0
            r12 = r0
            r0 = r6
            r1 = r12
            java.nio.ByteBuffer r0 = r0.put(r1)
            r0 = r6
            r1 = r11
            java.nio.ByteBuffer r0 = r0.put(r1)
            r0 = r6
            r1 = r10
            java.nio.ByteBuffer r0 = r0.put(r1)
            r0 = r6
            r1 = r9
            java.nio.ByteBuffer r0 = r0.put(r1)
            int r7 = r7 + 1
            goto Lc
        L5c:
            r0 = r6
            java.nio.Buffer r0 = r0.flip()
            r0 = r6
            return r0
    }

    public static int getMinCursorSize() {
            r0 = 1
            return r0
    }

    public static int getMaxCursorSize() {
            r0 = 512(0x200, float:7.17E-43)
            return r0
    }

    public static int getCapabilities() {
            r0 = 6
            return r0
    }

    private static void flipImages(int r6, int r7, int r8, java.nio.IntBuffer r9, java.nio.IntBuffer r10) {
            r0 = 0
            r11 = r0
        L3:
            r0 = r11
            r1 = r8
            if (r0 >= r1) goto L21
            r0 = r11
            r1 = r6
            int r0 = r0 * r1
            r1 = r7
            int r0 = r0 * r1
            r12 = r0
            r0 = r6
            r1 = r7
            r2 = r12
            r3 = r9
            r4 = r10
            flipImage(r0, r1, r2, r3, r4)
            int r11 = r11 + 1
            goto L3
        L21:
            return
    }

    private static void flipImage(int r6, int r7, int r8, java.nio.IntBuffer r9, java.nio.IntBuffer r10) {
            r0 = 0
            r11 = r0
        L3:
            r0 = r11
            r1 = r7
            r2 = 1
            int r1 = r1 >> r2
            if (r0 >= r1) goto L6c
            r0 = r11
            r1 = r6
            int r0 = r0 * r1
            r1 = r8
            int r0 = r0 + r1
            r12 = r0
            r0 = r7
            r1 = r11
            int r0 = r0 - r1
            r1 = 1
            int r0 = r0 - r1
            r1 = r6
            int r0 = r0 * r1
            r1 = r8
            int r0 = r0 + r1
            r13 = r0
            r0 = 0
            r14 = r0
        L22:
            r0 = r14
            r1 = r6
            if (r0 >= r1) goto L66
            r0 = r12
            r1 = r14
            int r0 = r0 + r1
            r15 = r0
            r0 = r13
            r1 = r14
            int r0 = r0 + r1
            r16 = r0
            r0 = r9
            r1 = r15
            r2 = r9
            int r2 = r2.position()
            int r1 = r1 + r2
            int r0 = r0.get(r1)
            r17 = r0
            r0 = r10
            r1 = r15
            r2 = r9
            r3 = r16
            r4 = r9
            int r4 = r4.position()
            int r3 = r3 + r4
            int r2 = r2.get(r3)
            java.nio.IntBuffer r0 = r0.put(r1, r2)
            r0 = r10
            r1 = r16
            r2 = r17
            java.nio.IntBuffer r0 = r0.put(r1, r2)
            int r14 = r14 + 1
            goto L22
        L66:
            int r11 = r11 + 1
            goto L3
        L6c:
            return
    }

    long getHandle() {
            r3 = this;
            r0 = r3
            r0.checkValid()
            r0 = r3
            org.lwjgl.input.Cursor$CursorElement[] r0 = r0.cursors
            r1 = r3
            int r1 = r1.index
            r0 = r0[r1]
            long r0 = r0.cursorHandle
            return r0
    }

    private void checkValid() {
            r4 = this;
            r0 = r4
            boolean r0 = r0.destroyed
            if (r0 == 0) goto L11
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "The cursor is already destroyed"
            r1.<init>(r2)
            throw r0
        L11:
            return
    }

    public void destroy() {
            r3 = this;
            r0 = r3
            org.lwjgl.input.Cursor$CursorElement[] r0 = r0.cursors
            r4 = r0
            r0 = r4
            int r0 = r0.length
            r5 = r0
            r0 = 0
            r6 = r0
        La:
            r0 = r6
            r1 = r5
            if (r0 >= r1) goto L22
            r0 = r4
            r1 = r6
            r0 = r0[r1]
            r7 = r0
            r0 = r7
            long r0 = r0.cursorHandle
            org.lwjgl.glfw.GLFW.glfwDestroyCursor(r0)
            int r6 = r6 + 1
            goto La
        L22:
            r0 = r3
            r1 = 1
            r0.destroyed = r1
            return
    }

    protected void setTimeout() {
            r6 = this;
            r0 = r6
            r0.checkValid()
            r0 = r6
            org.lwjgl.input.Cursor$CursorElement[] r0 = r0.cursors
            r1 = r6
            int r1 = r1.index
            r0 = r0[r1]
            long r1 = org.lwjgl.glfw.GLFW.glfwGetTimerValue()
            r2 = r6
            org.lwjgl.input.Cursor$CursorElement[] r2 = r2.cursors
            r3 = r6
            int r3 = r3.index
            r2 = r2[r3]
            long r2 = r2.delay
            long r1 = r1 + r2
            r0.timeout = r1
            return
    }

    protected boolean hasTimedOut() {
            r5 = this;
            r0 = r5
            r0.checkValid()
            r0 = r5
            org.lwjgl.input.Cursor$CursorElement[] r0 = r0.cursors
            int r0 = r0.length
            r1 = 1
            if (r0 <= r1) goto L24
            r0 = r5
            org.lwjgl.input.Cursor$CursorElement[] r0 = r0.cursors
            r1 = r5
            int r1 = r1.index
            r0 = r0[r1]
            long r0 = r0.timeout
            long r1 = org.lwjgl.glfw.GLFW.glfwGetTimerValue()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            return r0
    }

    protected void nextCursor() {
            r5 = this;
            r0 = r5
            r0.checkValid()
            r0 = r5
            r1 = r5
            r2 = r1
            int r2 = r2.index
            r3 = 1
            int r2 = r2 + r3
            r3 = r2; r2 = r1; r1 = r3; 
            r2.index = r3
            r2 = r5
            org.lwjgl.input.Cursor$CursorElement[] r2 = r2.cursors
            int r2 = r2.length
            int r1 = r1 % r2
            r0.index = r1
            return
    }

    boolean isEmpty() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.isEmpty
            return r0
    }
}
