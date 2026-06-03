package org.lwjgl.util.vma;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaFreeDeviceMemoryFunction.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaFreeDeviceMemoryFunction.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaFreeDeviceMemoryFunction.class */
public abstract class VmaFreeDeviceMemoryFunction extends org.lwjgl.system.Callback implements org.lwjgl.util.vma.VmaFreeDeviceMemoryFunctionI {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaFreeDeviceMemoryFunction$Container.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaFreeDeviceMemoryFunction$Container.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaFreeDeviceMemoryFunction$Container.class */
    private static final class Container extends org.lwjgl.util.vma.VmaFreeDeviceMemoryFunction {
        private final org.lwjgl.util.vma.VmaFreeDeviceMemoryFunctionI delegate;

        Container(long r5, org.lwjgl.util.vma.VmaFreeDeviceMemoryFunctionI r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r0.<init>(r1)
                r0 = r4
                r1 = r7
                r0.delegate = r1
                return
        }

        @Override // org.lwjgl.util.vma.VmaFreeDeviceMemoryFunctionI
        public void invoke(long r12, int r14, long r15, long r17, long r19) {
                r11 = this;
                r0 = r11
                org.lwjgl.util.vma.VmaFreeDeviceMemoryFunctionI r0 = r0.delegate
                r1 = r12
                r2 = r14
                r3 = r15
                r4 = r17
                r5 = r19
                r0.invoke(r1, r2, r3, r4, r5)
                return
        }
    }

    public static org.lwjgl.util.vma.VmaFreeDeviceMemoryFunction create(long r6) {
            r0 = r6
            org.lwjgl.system.CallbackI r0 = org.lwjgl.system.Callback.get(r0)
            org.lwjgl.util.vma.VmaFreeDeviceMemoryFunctionI r0 = (org.lwjgl.util.vma.VmaFreeDeviceMemoryFunctionI) r0
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof org.lwjgl.util.vma.VmaFreeDeviceMemoryFunction
            if (r0 == 0) goto L16
            r0 = r8
            org.lwjgl.util.vma.VmaFreeDeviceMemoryFunction r0 = (org.lwjgl.util.vma.VmaFreeDeviceMemoryFunction) r0
            goto L1f
        L16:
            org.lwjgl.util.vma.VmaFreeDeviceMemoryFunction$Container r0 = new org.lwjgl.util.vma.VmaFreeDeviceMemoryFunction$Container
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L1f:
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.vma.VmaFreeDeviceMemoryFunction createSafe(long r5) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto Le
        La:
            r0 = r5
            org.lwjgl.util.vma.VmaFreeDeviceMemoryFunction r0 = create(r0)
        Le:
            return r0
    }

    public static org.lwjgl.util.vma.VmaFreeDeviceMemoryFunction create(org.lwjgl.util.vma.VmaFreeDeviceMemoryFunctionI r6) {
            r0 = r6
            boolean r0 = r0 instanceof org.lwjgl.util.vma.VmaFreeDeviceMemoryFunction
            if (r0 == 0) goto Le
            r0 = r6
            org.lwjgl.util.vma.VmaFreeDeviceMemoryFunction r0 = (org.lwjgl.util.vma.VmaFreeDeviceMemoryFunction) r0
            goto L1c
        Le:
            org.lwjgl.util.vma.VmaFreeDeviceMemoryFunction$Container r0 = new org.lwjgl.util.vma.VmaFreeDeviceMemoryFunction$Container
            r1 = r0
            r2 = r6
            long r2 = r2.address()
            r3 = r6
            r1.<init>(r2, r3)
        L1c:
            return r0
    }

    protected VmaFreeDeviceMemoryFunction() {
            r3 = this;
            r0 = r3
            org.lwjgl.system.libffi.FFICIF r1 = org.lwjgl.util.vma.VmaFreeDeviceMemoryFunction.CIF
            r0.<init>(r1)
            return
    }

    VmaFreeDeviceMemoryFunction(long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            return
    }
}
