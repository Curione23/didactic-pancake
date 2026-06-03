package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAllocationFunction.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAllocationFunction.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAllocationFunction.class */
public abstract class VkAllocationFunction extends org.lwjgl.system.Callback implements org.lwjgl.vulkan.VkAllocationFunctionI {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAllocationFunction$Container.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAllocationFunction$Container.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAllocationFunction$Container.class */
    private static final class Container extends org.lwjgl.vulkan.VkAllocationFunction {
        private final org.lwjgl.vulkan.VkAllocationFunctionI delegate;

        Container(long r5, org.lwjgl.vulkan.VkAllocationFunctionI r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r0.<init>(r1)
                r0 = r4
                r1 = r7
                r0.delegate = r1
                return
        }

        @Override // org.lwjgl.vulkan.VkAllocationFunctionI
        public long invoke(long r10, long r12, long r14, int r16) {
                r9 = this;
                r0 = r9
                org.lwjgl.vulkan.VkAllocationFunctionI r0 = r0.delegate
                r1 = r10
                r2 = r12
                r3 = r14
                r4 = r16
                long r0 = r0.invoke(r1, r2, r3, r4)
                return r0
        }
    }

    public static org.lwjgl.vulkan.VkAllocationFunction create(long r6) {
            r0 = r6
            org.lwjgl.system.CallbackI r0 = org.lwjgl.system.Callback.get(r0)
            org.lwjgl.vulkan.VkAllocationFunctionI r0 = (org.lwjgl.vulkan.VkAllocationFunctionI) r0
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof org.lwjgl.vulkan.VkAllocationFunction
            if (r0 == 0) goto L16
            r0 = r8
            org.lwjgl.vulkan.VkAllocationFunction r0 = (org.lwjgl.vulkan.VkAllocationFunction) r0
            goto L1f
        L16:
            org.lwjgl.vulkan.VkAllocationFunction$Container r0 = new org.lwjgl.vulkan.VkAllocationFunction$Container
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L1f:
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkAllocationFunction createSafe(long r5) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto Le
        La:
            r0 = r5
            org.lwjgl.vulkan.VkAllocationFunction r0 = create(r0)
        Le:
            return r0
    }

    public static org.lwjgl.vulkan.VkAllocationFunction create(org.lwjgl.vulkan.VkAllocationFunctionI r6) {
            r0 = r6
            boolean r0 = r0 instanceof org.lwjgl.vulkan.VkAllocationFunction
            if (r0 == 0) goto Le
            r0 = r6
            org.lwjgl.vulkan.VkAllocationFunction r0 = (org.lwjgl.vulkan.VkAllocationFunction) r0
            goto L1c
        Le:
            org.lwjgl.vulkan.VkAllocationFunction$Container r0 = new org.lwjgl.vulkan.VkAllocationFunction$Container
            r1 = r0
            r2 = r6
            long r2 = r2.address()
            r3 = r6
            r1.<init>(r2, r3)
        L1c:
            return r0
    }

    protected VkAllocationFunction() {
            r3 = this;
            r0 = r3
            org.lwjgl.system.libffi.FFICIF r1 = org.lwjgl.vulkan.VkAllocationFunction.CIF
            r0.<init>(r1)
            return
    }

    VkAllocationFunction(long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            return
    }
}
