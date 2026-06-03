package org.lwjgl.system.jemalloc;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/jemalloc/ExtentMerge.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/jemalloc/ExtentMerge.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/jemalloc/ExtentMerge.class */
public abstract class ExtentMerge extends org.lwjgl.system.Callback implements org.lwjgl.system.jemalloc.ExtentMergeI {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/jemalloc/ExtentMerge$Container.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/jemalloc/ExtentMerge$Container.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/jemalloc/ExtentMerge$Container.class */
    private static final class Container extends org.lwjgl.system.jemalloc.ExtentMerge {
        private final org.lwjgl.system.jemalloc.ExtentMergeI delegate;

        Container(long r5, org.lwjgl.system.jemalloc.ExtentMergeI r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r0.<init>(r1)
                r0 = r4
                r1 = r7
                r0.delegate = r1
                return
        }

        @Override // org.lwjgl.system.jemalloc.ExtentMergeI
        public boolean invoke(long r15, long r17, long r19, long r21, long r23, boolean r25, int r26) {
                r14 = this;
                r0 = r14
                org.lwjgl.system.jemalloc.ExtentMergeI r0 = r0.delegate
                r1 = r15
                r2 = r17
                r3 = r19
                r4 = r21
                r5 = r23
                r6 = r25
                r7 = r26
                boolean r0 = r0.invoke(r1, r2, r3, r4, r5, r6, r7)
                return r0
        }
    }

    public static org.lwjgl.system.jemalloc.ExtentMerge create(long r6) {
            r0 = r6
            org.lwjgl.system.CallbackI r0 = org.lwjgl.system.Callback.get(r0)
            org.lwjgl.system.jemalloc.ExtentMergeI r0 = (org.lwjgl.system.jemalloc.ExtentMergeI) r0
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof org.lwjgl.system.jemalloc.ExtentMerge
            if (r0 == 0) goto L16
            r0 = r8
            org.lwjgl.system.jemalloc.ExtentMerge r0 = (org.lwjgl.system.jemalloc.ExtentMerge) r0
            goto L1f
        L16:
            org.lwjgl.system.jemalloc.ExtentMerge$Container r0 = new org.lwjgl.system.jemalloc.ExtentMerge$Container
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L1f:
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.jemalloc.ExtentMerge createSafe(long r5) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto Le
        La:
            r0 = r5
            org.lwjgl.system.jemalloc.ExtentMerge r0 = create(r0)
        Le:
            return r0
    }

    public static org.lwjgl.system.jemalloc.ExtentMerge create(org.lwjgl.system.jemalloc.ExtentMergeI r6) {
            r0 = r6
            boolean r0 = r0 instanceof org.lwjgl.system.jemalloc.ExtentMerge
            if (r0 == 0) goto Le
            r0 = r6
            org.lwjgl.system.jemalloc.ExtentMerge r0 = (org.lwjgl.system.jemalloc.ExtentMerge) r0
            goto L1c
        Le:
            org.lwjgl.system.jemalloc.ExtentMerge$Container r0 = new org.lwjgl.system.jemalloc.ExtentMerge$Container
            r1 = r0
            r2 = r6
            long r2 = r2.address()
            r3 = r6
            r1.<init>(r2, r3)
        L1c:
            return r0
    }

    protected ExtentMerge() {
            r3 = this;
            r0 = r3
            java.lang.String r1 = "(pppppBi)B"
            r0.<init>(r1)
            return
    }

    ExtentMerge(long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            return
    }
}
