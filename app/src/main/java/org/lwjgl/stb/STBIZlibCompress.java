package org.lwjgl.stb;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBIZlibCompress.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBIZlibCompress.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBIZlibCompress.class */
public abstract class STBIZlibCompress extends org.lwjgl.system.Callback implements org.lwjgl.stb.STBIZlibCompressI {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBIZlibCompress$Container.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBIZlibCompress$Container.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBIZlibCompress$Container.class */
    private static final class Container extends org.lwjgl.stb.STBIZlibCompress {
        private final org.lwjgl.stb.STBIZlibCompressI delegate;

        Container(long r5, org.lwjgl.stb.STBIZlibCompressI r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r0.<init>(r1)
                r0 = r4
                r1 = r7
                r0.delegate = r1
                return
        }

        @Override // org.lwjgl.stb.STBIZlibCompressI
        public long invoke(long r9, int r11, long r12, int r14) {
                r8 = this;
                r0 = r8
                org.lwjgl.stb.STBIZlibCompressI r0 = r0.delegate
                r1 = r9
                r2 = r11
                r3 = r12
                r4 = r14
                long r0 = r0.invoke(r1, r2, r3, r4)
                return r0
        }
    }

    public static org.lwjgl.stb.STBIZlibCompress create(long r6) {
            r0 = r6
            org.lwjgl.system.CallbackI r0 = org.lwjgl.system.Callback.get(r0)
            org.lwjgl.stb.STBIZlibCompressI r0 = (org.lwjgl.stb.STBIZlibCompressI) r0
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof org.lwjgl.stb.STBIZlibCompress
            if (r0 == 0) goto L16
            r0 = r8
            org.lwjgl.stb.STBIZlibCompress r0 = (org.lwjgl.stb.STBIZlibCompress) r0
            goto L1f
        L16:
            org.lwjgl.stb.STBIZlibCompress$Container r0 = new org.lwjgl.stb.STBIZlibCompress$Container
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L1f:
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.stb.STBIZlibCompress createSafe(long r5) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto Le
        La:
            r0 = r5
            org.lwjgl.stb.STBIZlibCompress r0 = create(r0)
        Le:
            return r0
    }

    public static org.lwjgl.stb.STBIZlibCompress create(org.lwjgl.stb.STBIZlibCompressI r6) {
            r0 = r6
            boolean r0 = r0 instanceof org.lwjgl.stb.STBIZlibCompress
            if (r0 == 0) goto Le
            r0 = r6
            org.lwjgl.stb.STBIZlibCompress r0 = (org.lwjgl.stb.STBIZlibCompress) r0
            goto L1c
        Le:
            org.lwjgl.stb.STBIZlibCompress$Container r0 = new org.lwjgl.stb.STBIZlibCompress$Container
            r1 = r0
            r2 = r6
            long r2 = r2.address()
            r3 = r6
            r1.<init>(r2, r3)
        L1c:
            return r0
    }

    protected STBIZlibCompress() {
            r3 = this;
            r0 = r3
            org.lwjgl.system.libffi.FFICIF r1 = org.lwjgl.stb.STBIZlibCompress.CIF
            r0.<init>(r1)
            return
    }

    STBIZlibCompress(long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            return
    }
}
