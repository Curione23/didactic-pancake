package org.lwjgl.util.shaderc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/shaderc/SPVParsedHeaderFn.class */
public abstract class SPVParsedHeaderFn extends org.lwjgl.system.Callback implements org.lwjgl.util.shaderc.SPVParsedHeaderFnI {

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/shaderc/SPVParsedHeaderFn$Container.class */
    private static final class Container extends org.lwjgl.util.shaderc.SPVParsedHeaderFn {
        private final org.lwjgl.util.shaderc.SPVParsedHeaderFnI delegate;

        Container(long r5, org.lwjgl.util.shaderc.SPVParsedHeaderFnI r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r0.<init>(r1)
                r0 = r4
                r1 = r7
                r0.delegate = r1
                return
        }

        @Override // org.lwjgl.util.shaderc.SPVParsedHeaderFnI
        public int invoke(long r11, int r13, int r14, int r15, int r16, int r17, int r18) {
                r10 = this;
                r0 = r10
                org.lwjgl.util.shaderc.SPVParsedHeaderFnI r0 = r0.delegate
                r1 = r11
                r2 = r13
                r3 = r14
                r4 = r15
                r5 = r16
                r6 = r17
                r7 = r18
                int r0 = r0.invoke(r1, r2, r3, r4, r5, r6, r7)
                return r0
        }
    }

    public static org.lwjgl.util.shaderc.SPVParsedHeaderFn create(long r6) {
            r0 = r6
            org.lwjgl.system.CallbackI r0 = org.lwjgl.system.Callback.get(r0)
            org.lwjgl.util.shaderc.SPVParsedHeaderFnI r0 = (org.lwjgl.util.shaderc.SPVParsedHeaderFnI) r0
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof org.lwjgl.util.shaderc.SPVParsedHeaderFn
            if (r0 == 0) goto L16
            r0 = r8
            org.lwjgl.util.shaderc.SPVParsedHeaderFn r0 = (org.lwjgl.util.shaderc.SPVParsedHeaderFn) r0
            goto L1f
        L16:
            org.lwjgl.util.shaderc.SPVParsedHeaderFn$Container r0 = new org.lwjgl.util.shaderc.SPVParsedHeaderFn$Container
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L1f:
            return r0
    }

    public static org.lwjgl.util.shaderc.SPVParsedHeaderFn createSafe(long r5) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto Le
        La:
            r0 = r5
            org.lwjgl.util.shaderc.SPVParsedHeaderFn r0 = create(r0)
        Le:
            return r0
    }

    public static org.lwjgl.util.shaderc.SPVParsedHeaderFn create(org.lwjgl.util.shaderc.SPVParsedHeaderFnI r6) {
            r0 = r6
            boolean r0 = r0 instanceof org.lwjgl.util.shaderc.SPVParsedHeaderFn
            if (r0 == 0) goto Le
            r0 = r6
            org.lwjgl.util.shaderc.SPVParsedHeaderFn r0 = (org.lwjgl.util.shaderc.SPVParsedHeaderFn) r0
            goto L1c
        Le:
            org.lwjgl.util.shaderc.SPVParsedHeaderFn$Container r0 = new org.lwjgl.util.shaderc.SPVParsedHeaderFn$Container
            r1 = r0
            r2 = r6
            long r2 = r2.address()
            r3 = r6
            r1.<init>(r2, r3)
        L1c:
            return r0
    }

    protected SPVParsedHeaderFn() {
            r3 = this;
            r0 = r3
            org.lwjgl.system.Callback$Descriptor r1 = org.lwjgl.util.shaderc.SPVParsedHeaderFn.DESCRIPTOR
            r0.<init>(r1)
            return
    }

    SPVParsedHeaderFn(long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            return
    }
}
