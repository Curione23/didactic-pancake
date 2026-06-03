package org.lwjgl.openal;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTCallbackBufferType.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTCallbackBufferType.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTCallbackBufferType.class */
public abstract class SOFTCallbackBufferType extends org.lwjgl.system.Callback implements org.lwjgl.openal.SOFTCallbackBufferTypeI {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTCallbackBufferType$Container.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTCallbackBufferType$Container.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTCallbackBufferType$Container.class */
    private static final class Container extends org.lwjgl.openal.SOFTCallbackBufferType {
        private final org.lwjgl.openal.SOFTCallbackBufferTypeI delegate;

        Container(long r5, org.lwjgl.openal.SOFTCallbackBufferTypeI r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r0.<init>(r1)
                r0 = r4
                r1 = r7
                r0.delegate = r1
                return
        }

        @Override // org.lwjgl.openal.SOFTCallbackBufferTypeI
        public long invoke(long r8, long r10, int r12) {
                r7 = this;
                r0 = r7
                org.lwjgl.openal.SOFTCallbackBufferTypeI r0 = r0.delegate
                r1 = r8
                r2 = r10
                r3 = r12
                long r0 = r0.invoke(r1, r2, r3)
                return r0
        }
    }

    public static org.lwjgl.openal.SOFTCallbackBufferType create(long r6) {
            r0 = r6
            org.lwjgl.system.CallbackI r0 = org.lwjgl.system.Callback.get(r0)
            org.lwjgl.openal.SOFTCallbackBufferTypeI r0 = (org.lwjgl.openal.SOFTCallbackBufferTypeI) r0
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof org.lwjgl.openal.SOFTCallbackBufferType
            if (r0 == 0) goto L16
            r0 = r8
            org.lwjgl.openal.SOFTCallbackBufferType r0 = (org.lwjgl.openal.SOFTCallbackBufferType) r0
            goto L1f
        L16:
            org.lwjgl.openal.SOFTCallbackBufferType$Container r0 = new org.lwjgl.openal.SOFTCallbackBufferType$Container
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L1f:
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.openal.SOFTCallbackBufferType createSafe(long r5) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto Le
        La:
            r0 = r5
            org.lwjgl.openal.SOFTCallbackBufferType r0 = create(r0)
        Le:
            return r0
    }

    public static org.lwjgl.openal.SOFTCallbackBufferType create(org.lwjgl.openal.SOFTCallbackBufferTypeI r6) {
            r0 = r6
            boolean r0 = r0 instanceof org.lwjgl.openal.SOFTCallbackBufferType
            if (r0 == 0) goto Le
            r0 = r6
            org.lwjgl.openal.SOFTCallbackBufferType r0 = (org.lwjgl.openal.SOFTCallbackBufferType) r0
            goto L1c
        Le:
            org.lwjgl.openal.SOFTCallbackBufferType$Container r0 = new org.lwjgl.openal.SOFTCallbackBufferType$Container
            r1 = r0
            r2 = r6
            long r2 = r2.address()
            r3 = r6
            r1.<init>(r2, r3)
        L1c:
            return r0
    }

    protected SOFTCallbackBufferType() {
            r3 = this;
            r0 = r3
            org.lwjgl.system.libffi.FFICIF r1 = org.lwjgl.openal.SOFTCallbackBufferType.CIF
            r0.<init>(r1)
            return
    }

    SOFTCallbackBufferType(long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            return
    }
}
