package org.lwjgl.system;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/FunctionProviderLocal.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/FunctionProviderLocal.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/FunctionProviderLocal.class */
public interface FunctionProviderLocal extends org.lwjgl.system.FunctionProvider {
    default long getFunctionAddress(long r7, java.lang.CharSequence r9) {
            r6 = this;
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackPush()
            r10 = r0
            r0 = 0
            r11 = r0
            r0 = r6
            r1 = r7
            r2 = r10
            r3 = r9
            java.nio.ByteBuffer r2 = r2.ASCII(r3)     // Catch: java.lang.Throwable -> L3d java.lang.Throwable -> L46
            long r0 = r0.getFunctionAddress(r1, r2)     // Catch: java.lang.Throwable -> L3d java.lang.Throwable -> L46
            r12 = r0
            r0 = r10
            if (r0 == 0) goto L3a
            r0 = r11
            if (r0 == 0) goto L35
            r0 = r10
            r0.close()     // Catch: java.lang.Throwable -> L29
            goto L3a
        L29:
            r14 = move-exception
            r0 = r11
            r1 = r14
            r0.addSuppressed(r1)
            goto L3a
        L35:
            r0 = r10
            r0.close()
        L3a:
            r0 = r12
            return r0
        L3d:
            r12 = move-exception
            r0 = r12
            r11 = r0
            r0 = r12
            throw r0     // Catch: java.lang.Throwable -> L46
        L46:
            r15 = move-exception
            r0 = r10
            if (r0 == 0) goto L6b
            r0 = r11
            if (r0 == 0) goto L66
            r0 = r10
            r0.close()     // Catch: java.lang.Throwable -> L5a
            goto L6b
        L5a:
            r16 = move-exception
            r0 = r11
            r1 = r16
            r0.addSuppressed(r1)
            goto L6b
        L66:
            r0 = r10
            r0.close()
        L6b:
            r0 = r15
            throw r0
    }

    long getFunctionAddress(long r1, java.nio.ByteBuffer r3);
}
