package org.lwjgl.openal;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/ALCcontext.class */
public final class ALCcontext {
    final long context;
    private boolean valid;

    ALCcontext(long r5) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = r5
            r0.context = r1
            r0 = r4
            r1 = 1
            r0.valid = r1
            return
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof org.lwjgl.openal.ALCcontext
            if (r0 == 0) goto L1c
            r0 = r6
            org.lwjgl.openal.ALCcontext r0 = (org.lwjgl.openal.ALCcontext) r0
            long r0 = r0.context
            r1 = r5
            long r1 = r1.context
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            return r0
        L1c:
            r0 = r5
            r1 = r6
            boolean r0 = super.equals(r1)
            return r0
    }

    static java.nio.IntBuffer createAttributeList(int r3, int r4, int r5) {
            r0 = 7
            java.nio.IntBuffer r0 = org.lwjgl.BufferUtils.createIntBuffer(r0)
            r6 = r0
            r0 = r6
            r1 = 4103(0x1007, float:5.75E-42)
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r6
            r1 = r3
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r6
            r1 = 4104(0x1008, float:5.751E-42)
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r6
            r1 = r4
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r6
            r1 = 4105(0x1009, float:5.752E-42)
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r6
            r1 = r5
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r6
            r1 = 0
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r6
            return r0
    }

    void setInvalid() {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.valid = r1
            return
    }

    public boolean isValid() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.valid
            return r0
    }
}
