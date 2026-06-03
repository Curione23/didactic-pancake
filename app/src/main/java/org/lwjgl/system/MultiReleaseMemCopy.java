package org.lwjgl.system;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/MultiReleaseMemCopy.class */
final class MultiReleaseMemCopy {
    private MultiReleaseMemCopy() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    static void copy(long r10, long r12, long r14) {
            r0 = r14
            r1 = 160(0xa0, double:7.9E-322)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L37
            boolean r0 = org.lwjgl.system.Pointer.BITS64
            if (r0 == 0) goto L2a
            r0 = r10
            r1 = r12
            long r0 = r0 | r1
            r1 = 7
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L2a
            r0 = r10
            r1 = r12
            r2 = r14
            int r2 = (int) r2
            r3 = 255(0xff, float:3.57E-43)
            r2 = r2 & r3
            org.lwjgl.system.MemoryUtil.memCopyAligned64(r0, r1, r2)
            goto L36
        L2a:
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r10
            r3 = 0
            r4 = r12
            r5 = r14
            r0.copyMemory(r1, r2, r3, r4, r5)
        L36:
            return
        L37:
            r0 = r12
            r1 = r10
            r2 = r14
            long r0 = org.lwjgl.system.libc.LibCString.nmemcpy(r0, r1, r2)
            return
    }
}
