package org.lwjgl.util.shaderc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/shaderc/GLSLIncludeSystemFunc.class */
public abstract class GLSLIncludeSystemFunc extends org.lwjgl.system.Callback implements org.lwjgl.util.shaderc.GLSLIncludeSystemFuncI {

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/shaderc/GLSLIncludeSystemFunc$Container.class */
    private static final class Container extends org.lwjgl.util.shaderc.GLSLIncludeSystemFunc {
        private final org.lwjgl.util.shaderc.GLSLIncludeSystemFuncI delegate;

        Container(long r5, org.lwjgl.util.shaderc.GLSLIncludeSystemFuncI r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r0.<init>(r1)
                r0 = r4
                r1 = r7
                r0.delegate = r1
                return
        }

        @Override // org.lwjgl.util.shaderc.GLSLIncludeSystemFuncI
        public long invoke(long r11, long r13, long r15, long r17) {
                r10 = this;
                r0 = r10
                org.lwjgl.util.shaderc.GLSLIncludeSystemFuncI r0 = r0.delegate
                r1 = r11
                r2 = r13
                r3 = r15
                r4 = r17
                long r0 = r0.invoke(r1, r2, r3, r4)
                return r0
        }
    }

    public static org.lwjgl.util.shaderc.GLSLIncludeSystemFunc create(long r6) {
            r0 = r6
            org.lwjgl.system.CallbackI r0 = org.lwjgl.system.Callback.get(r0)
            org.lwjgl.util.shaderc.GLSLIncludeSystemFuncI r0 = (org.lwjgl.util.shaderc.GLSLIncludeSystemFuncI) r0
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof org.lwjgl.util.shaderc.GLSLIncludeSystemFunc
            if (r0 == 0) goto L16
            r0 = r8
            org.lwjgl.util.shaderc.GLSLIncludeSystemFunc r0 = (org.lwjgl.util.shaderc.GLSLIncludeSystemFunc) r0
            goto L1f
        L16:
            org.lwjgl.util.shaderc.GLSLIncludeSystemFunc$Container r0 = new org.lwjgl.util.shaderc.GLSLIncludeSystemFunc$Container
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L1f:
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLIncludeSystemFunc createSafe(long r5) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto Le
        La:
            r0 = r5
            org.lwjgl.util.shaderc.GLSLIncludeSystemFunc r0 = create(r0)
        Le:
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLIncludeSystemFunc create(org.lwjgl.util.shaderc.GLSLIncludeSystemFuncI r6) {
            r0 = r6
            boolean r0 = r0 instanceof org.lwjgl.util.shaderc.GLSLIncludeSystemFunc
            if (r0 == 0) goto Le
            r0 = r6
            org.lwjgl.util.shaderc.GLSLIncludeSystemFunc r0 = (org.lwjgl.util.shaderc.GLSLIncludeSystemFunc) r0
            goto L1c
        Le:
            org.lwjgl.util.shaderc.GLSLIncludeSystemFunc$Container r0 = new org.lwjgl.util.shaderc.GLSLIncludeSystemFunc$Container
            r1 = r0
            r2 = r6
            long r2 = r2.address()
            r3 = r6
            r1.<init>(r2, r3)
        L1c:
            return r0
    }

    protected GLSLIncludeSystemFunc() {
            r3 = this;
            r0 = r3
            org.lwjgl.system.Callback$Descriptor r1 = org.lwjgl.util.shaderc.GLSLIncludeSystemFunc.DESCRIPTOR
            r0.<init>(r1)
            return
    }

    GLSLIncludeSystemFunc(long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            return
    }
}
