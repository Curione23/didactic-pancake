package org.lwjgl.system;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/FunctionProvider.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/FunctionProvider.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/FunctionProvider.class */
@java.lang.FunctionalInterface
public interface FunctionProvider {
    default long getFunctionAddress(java.lang.CharSequence r5) {
            r4 = this;
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackPush()
            r6 = r0
            r0 = 0
            r7 = r0
            r0 = r4
            r1 = r6
            r2 = r5
            java.nio.ByteBuffer r1 = r1.ASCII(r2)     // Catch: java.lang.Throwable -> L34 java.lang.Throwable -> L3c
            long r0 = r0.getFunctionAddress(r1)     // Catch: java.lang.Throwable -> L34 java.lang.Throwable -> L3c
            r8 = r0
            r0 = r6
            if (r0 == 0) goto L31
            r0 = r7
            if (r0 == 0) goto L2d
            r0 = r6
            r0.close()     // Catch: java.lang.Throwable -> L22
            goto L31
        L22:
            r10 = move-exception
            r0 = r7
            r1 = r10
            r0.addSuppressed(r1)
            goto L31
        L2d:
            r0 = r6
            r0.close()
        L31:
            r0 = r8
            return r0
        L34:
            r8 = move-exception
            r0 = r8
            r7 = r0
            r0 = r8
            throw r0     // Catch: java.lang.Throwable -> L3c
        L3c:
            r11 = move-exception
            r0 = r6
            if (r0 == 0) goto L5c
            r0 = r7
            if (r0 == 0) goto L58
            r0 = r6
            r0.close()     // Catch: java.lang.Throwable -> L4d
            goto L5c
        L4d:
            r12 = move-exception
            r0 = r7
            r1 = r12
            r0.addSuppressed(r1)
            goto L5c
        L58:
            r0 = r6
            r0.close()
        L5c:
            r0 = r11
            throw r0
    }

    long getFunctionAddress(java.nio.ByteBuffer r1);
}
