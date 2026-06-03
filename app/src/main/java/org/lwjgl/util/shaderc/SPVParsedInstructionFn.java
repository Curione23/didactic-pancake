package org.lwjgl.util.shaderc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/shaderc/SPVParsedInstructionFn.class */
public abstract class SPVParsedInstructionFn extends org.lwjgl.system.Callback implements org.lwjgl.util.shaderc.SPVParsedInstructionFnI {

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/shaderc/SPVParsedInstructionFn$Container.class */
    private static final class Container extends org.lwjgl.util.shaderc.SPVParsedInstructionFn {
        private final org.lwjgl.util.shaderc.SPVParsedInstructionFnI delegate;

        Container(long r5, org.lwjgl.util.shaderc.SPVParsedInstructionFnI r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r0.<init>(r1)
                r0 = r4
                r1 = r7
                r0.delegate = r1
                return
        }

        @Override // org.lwjgl.util.shaderc.SPVParsedInstructionFnI
        public int invoke(long r7, long r9) {
                r6 = this;
                r0 = r6
                org.lwjgl.util.shaderc.SPVParsedInstructionFnI r0 = r0.delegate
                r1 = r7
                r2 = r9
                int r0 = r0.invoke(r1, r2)
                return r0
        }
    }

    public static org.lwjgl.util.shaderc.SPVParsedInstructionFn create(long r6) {
            r0 = r6
            org.lwjgl.system.CallbackI r0 = org.lwjgl.system.Callback.get(r0)
            org.lwjgl.util.shaderc.SPVParsedInstructionFnI r0 = (org.lwjgl.util.shaderc.SPVParsedInstructionFnI) r0
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof org.lwjgl.util.shaderc.SPVParsedInstructionFn
            if (r0 == 0) goto L16
            r0 = r8
            org.lwjgl.util.shaderc.SPVParsedInstructionFn r0 = (org.lwjgl.util.shaderc.SPVParsedInstructionFn) r0
            goto L1f
        L16:
            org.lwjgl.util.shaderc.SPVParsedInstructionFn$Container r0 = new org.lwjgl.util.shaderc.SPVParsedInstructionFn$Container
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L1f:
            return r0
    }

    public static org.lwjgl.util.shaderc.SPVParsedInstructionFn createSafe(long r5) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto Le
        La:
            r0 = r5
            org.lwjgl.util.shaderc.SPVParsedInstructionFn r0 = create(r0)
        Le:
            return r0
    }

    public static org.lwjgl.util.shaderc.SPVParsedInstructionFn create(org.lwjgl.util.shaderc.SPVParsedInstructionFnI r6) {
            r0 = r6
            boolean r0 = r0 instanceof org.lwjgl.util.shaderc.SPVParsedInstructionFn
            if (r0 == 0) goto Le
            r0 = r6
            org.lwjgl.util.shaderc.SPVParsedInstructionFn r0 = (org.lwjgl.util.shaderc.SPVParsedInstructionFn) r0
            goto L1c
        Le:
            org.lwjgl.util.shaderc.SPVParsedInstructionFn$Container r0 = new org.lwjgl.util.shaderc.SPVParsedInstructionFn$Container
            r1 = r0
            r2 = r6
            long r2 = r2.address()
            r3 = r6
            r1.<init>(r2, r3)
        L1c:
            return r0
    }

    protected SPVParsedInstructionFn() {
            r3 = this;
            r0 = r3
            org.lwjgl.system.Callback$Descriptor r1 = org.lwjgl.util.shaderc.SPVParsedInstructionFn.DESCRIPTOR
            r0.<init>(r1)
            return
    }

    SPVParsedInstructionFn(long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            return
    }
}
