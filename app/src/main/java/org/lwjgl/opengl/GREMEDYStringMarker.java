package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GREMEDYStringMarker.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GREMEDYStringMarker.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GREMEDYStringMarker.class */
public class GREMEDYStringMarker {
    protected GREMEDYStringMarker() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void nglStringMarkerGREMEDY(int r0, long r1);

    public static void glStringMarkerGREMEDY(@org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglStringMarkerGREMEDY(r0, r1)
            return
    }

    public static void glStringMarkerGREMEDY(@org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = r4
            r2 = 0
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L24
            r7 = r0
            r0 = r5
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L24
            r8 = r0
            r0 = r7
            r1 = r8
            nglStringMarkerGREMEDY(r0, r1)     // Catch: java.lang.Throwable -> L24
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            goto L2e
        L24:
            r10 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r10
            throw r0
        L2e:
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
