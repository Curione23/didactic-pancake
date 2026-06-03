package org.lwjgl.stb;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/LibSTB.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/stb/LibSTB.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/LibSTB.class */
final class LibSTB {
    private LibSTB() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    static void initialize() {
            return
    }

    private static native void setupMalloc(long r0, long r2, long r4, long r6, long r8, long r10);

    static {
            java.lang.String r0 = "lwjgl_stb"
            java.lang.String r0 = org.lwjgl.system.Platform.mapLibraryNameBundled(r0)
            r13 = r0
            void r0 = java.lang.System::load
            void r1 = java.lang.System::loadLibrary
            java.lang.Class<org.lwjgl.stb.LibSTB> r2 = org.lwjgl.stb.LibSTB.class
            java.lang.String r3 = "org.lwjgl.stb"
            r4 = r13
            org.lwjgl.system.Library.loadSystem(r0, r1, r2, r3, r4)
            org.lwjgl.system.Configuration<java.lang.Boolean> r0 = org.lwjgl.system.Configuration.DEBUG_MEMORY_ALLOCATOR_INTERNAL
            r1 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            org.lwjgl.system.MemoryUtil$MemoryAllocator r0 = org.lwjgl.system.MemoryUtil.getAllocator(r0)
            r14 = r0
            r0 = r14
            long r0 = r0.getMalloc()
            r1 = r14
            long r1 = r1.getCalloc()
            r2 = r14
            long r2 = r2.getRealloc()
            r3 = r14
            long r3 = r3.getFree()
            r4 = r14
            long r4 = r4.getAlignedAlloc()
            r5 = r14
            long r5 = r5.getAlignedFree()
            setupMalloc(r0, r1, r2, r3, r4, r5)
            return
    }
}
