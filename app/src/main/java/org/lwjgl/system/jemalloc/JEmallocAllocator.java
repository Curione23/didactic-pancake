package org.lwjgl.system.jemalloc;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/jemalloc/JEmallocAllocator.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/jemalloc/JEmallocAllocator.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/jemalloc/JEmallocAllocator.class */
public class JEmallocAllocator implements org.lwjgl.system.MemoryUtil.MemoryAllocator {
    public JEmallocAllocator() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
    public long getMalloc() {
            r3 = this;
            long r0 = org.lwjgl.system.jemalloc.JEmalloc.Functions.malloc
            return r0
    }

    @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
    public long getCalloc() {
            r3 = this;
            long r0 = org.lwjgl.system.jemalloc.JEmalloc.Functions.calloc
            return r0
    }

    @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
    public long getRealloc() {
            r3 = this;
            long r0 = org.lwjgl.system.jemalloc.JEmalloc.Functions.realloc
            return r0
    }

    @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
    public long getFree() {
            r3 = this;
            long r0 = org.lwjgl.system.jemalloc.JEmalloc.Functions.free
            return r0
    }

    @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
    public long getAlignedAlloc() {
            r3 = this;
            long r0 = org.lwjgl.system.jemalloc.JEmalloc.Functions.aligned_alloc
            return r0
    }

    @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
    public long getAlignedFree() {
            r3 = this;
            long r0 = org.lwjgl.system.jemalloc.JEmalloc.Functions.free
            return r0
    }

    @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
    public long malloc(long r4) {
            r3 = this;
            r0 = r4
            long r0 = org.lwjgl.system.jemalloc.JEmalloc.nje_malloc(r0)
            return r0
    }

    @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
    public long calloc(long r6, long r8) {
            r5 = this;
            r0 = r6
            r1 = r8
            long r0 = org.lwjgl.system.jemalloc.JEmalloc.nje_calloc(r0, r1)
            return r0
    }

    @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
    public long realloc(long r6, long r8) {
            r5 = this;
            r0 = r6
            r1 = r8
            long r0 = org.lwjgl.system.jemalloc.JEmalloc.nje_realloc(r0, r1)
            return r0
    }

    @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
    public void free(long r4) {
            r3 = this;
            r0 = r4
            org.lwjgl.system.jemalloc.JEmalloc.nje_free(r0)
            return
    }

    @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
    public long aligned_alloc(long r6, long r8) {
            r5 = this;
            r0 = r6
            r1 = r8
            long r0 = org.lwjgl.system.jemalloc.JEmalloc.nje_aligned_alloc(r0, r1)
            return r0
    }

    @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
    public void aligned_free(long r4) {
            r3 = this;
            r0 = r4
            org.lwjgl.system.jemalloc.JEmalloc.nje_free(r0)
            return
    }

    static {
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.jemalloc.JEmalloc.getLibrary()
            return
    }
}
