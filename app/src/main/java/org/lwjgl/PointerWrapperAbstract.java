package org.lwjgl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/PointerWrapperAbstract.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/PointerWrapperAbstract.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/PointerWrapperAbstract.class */
public abstract class PointerWrapperAbstract implements org.lwjgl.PointerWrapper {
    protected final long pointer;

    protected PointerWrapperAbstract(long r5) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = r5
            r0.pointer = r1
            return
    }

    public boolean isValid() {
            r5 = this;
            r0 = r5
            long r0 = r0.pointer
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    public final void checkValid() {
            r5 = this;
            boolean r0 = org.lwjgl.LWJGLUtil.DEBUG
            if (r0 == 0) goto L33
            r0 = r5
            boolean r0 = r0.isValid()
            if (r0 != 0) goto L33
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "This "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getSimpleName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " pointer is not valid."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L33:
            return
    }

    @Override // org.lwjgl.PointerWrapper
    public final long getPointer() {
            r3 = this;
            r0 = r3
            r0.checkValid()
            r0 = r3
            long r0 = r0.pointer
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = r6
            boolean r0 = r0 instanceof org.lwjgl.PointerWrapperAbstract
            if (r0 != 0) goto L10
            r0 = 0
            return r0
        L10:
            r0 = r6
            org.lwjgl.PointerWrapperAbstract r0 = (org.lwjgl.PointerWrapperAbstract) r0
            r7 = r0
            r0 = r5
            long r0 = r0.pointer
            r1 = r7
            long r1 = r1.pointer
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L23
            r0 = 0
            return r0
        L23:
            r0 = 1
            return r0
    }

    public int hashCode() {
            r6 = this;
            r0 = r6
            long r0 = r0.pointer
            r1 = r6
            long r1 = r1.pointer
            r2 = 32
            long r1 = r1 >>> r2
            long r0 = r0 ^ r1
            int r0 = (int) r0
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r4
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " pointer (0x"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            long r1 = r1.pointer
            java.lang.String r1 = java.lang.Long.toHexString(r1)
            java.lang.String r1 = r1.toUpperCase()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
