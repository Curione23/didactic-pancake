package org.lwjgl.system.jemalloc;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/jemalloc/ExtentHooks.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/jemalloc/ExtentHooks.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/jemalloc/ExtentHooks.class */
@org.lwjgl.system.NativeType("struct extent_hooks_t")
public class ExtentHooks extends org.lwjgl.system.Struct implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int ALLOC = 0;
    public static final int DALLOC = 0;
    public static final int DESTROY = 0;
    public static final int COMMIT = 0;
    public static final int DECOMMIT = 0;
    public static final int PURGE_LAZY = 0;
    public static final int PURGE_FORCED = 0;
    public static final int SPLIT = 0;
    public static final int MERGE = 0;

    public ExtentHooks(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.jemalloc.ExtentHooks.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.jemalloc.ExtentHooks.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("extent_alloc_t")
    public org.lwjgl.system.jemalloc.ExtentAlloc alloc() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.jemalloc.ExtentAlloc r0 = nalloc(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("extent_dalloc_t")
    public org.lwjgl.system.jemalloc.ExtentDalloc dalloc() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.jemalloc.ExtentDalloc r0 = ndalloc(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("extent_destroy_t")
    public org.lwjgl.system.jemalloc.ExtentDestroy destroy() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.jemalloc.ExtentDestroy r0 = ndestroy(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("extent_commit_t")
    public org.lwjgl.system.jemalloc.ExtentCommit commit() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.jemalloc.ExtentCommit r0 = ncommit(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("extent_decommit_t")
    public org.lwjgl.system.jemalloc.ExtentDecommit decommit() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.jemalloc.ExtentDecommit r0 = ndecommit(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("extent_purge_t")
    public org.lwjgl.system.jemalloc.ExtentPurge purge_lazy() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.jemalloc.ExtentPurge r0 = npurge_lazy(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("extent_purge_t")
    public org.lwjgl.system.jemalloc.ExtentPurge purge_forced() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.jemalloc.ExtentPurge r0 = npurge_forced(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("extent_split_t")
    public org.lwjgl.system.jemalloc.ExtentSplit split() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.jemalloc.ExtentSplit r0 = nsplit(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("extent_merge_t")
    public org.lwjgl.system.jemalloc.ExtentMerge merge() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.jemalloc.ExtentMerge r0 = nmerge(r0)
            return r0
    }

    public org.lwjgl.system.jemalloc.ExtentHooks alloc(@org.lwjgl.system.NativeType("extent_alloc_t") org.lwjgl.system.jemalloc.ExtentAllocI r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nalloc(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.jemalloc.ExtentHooks dalloc(@javax.annotation.Nullable @org.lwjgl.system.NativeType("extent_dalloc_t") org.lwjgl.system.jemalloc.ExtentDallocI r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndalloc(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.jemalloc.ExtentHooks destroy(@javax.annotation.Nullable @org.lwjgl.system.NativeType("extent_destroy_t") org.lwjgl.system.jemalloc.ExtentDestroyI r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndestroy(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.jemalloc.ExtentHooks commit(@javax.annotation.Nullable @org.lwjgl.system.NativeType("extent_commit_t") org.lwjgl.system.jemalloc.ExtentCommitI r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncommit(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.jemalloc.ExtentHooks decommit(@javax.annotation.Nullable @org.lwjgl.system.NativeType("extent_decommit_t") org.lwjgl.system.jemalloc.ExtentDecommitI r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndecommit(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.jemalloc.ExtentHooks purge_lazy(@javax.annotation.Nullable @org.lwjgl.system.NativeType("extent_purge_t") org.lwjgl.system.jemalloc.ExtentPurgeI r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npurge_lazy(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.jemalloc.ExtentHooks purge_forced(@javax.annotation.Nullable @org.lwjgl.system.NativeType("extent_purge_t") org.lwjgl.system.jemalloc.ExtentPurgeI r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npurge_forced(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.jemalloc.ExtentHooks split(@javax.annotation.Nullable @org.lwjgl.system.NativeType("extent_split_t") org.lwjgl.system.jemalloc.ExtentSplitI r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsplit(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.jemalloc.ExtentHooks merge(@javax.annotation.Nullable @org.lwjgl.system.NativeType("extent_merge_t") org.lwjgl.system.jemalloc.ExtentMergeI r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmerge(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.jemalloc.ExtentHooks set(org.lwjgl.system.jemalloc.ExtentAllocI r4, org.lwjgl.system.jemalloc.ExtentDallocI r5, org.lwjgl.system.jemalloc.ExtentDestroyI r6, org.lwjgl.system.jemalloc.ExtentCommitI r7, org.lwjgl.system.jemalloc.ExtentDecommitI r8, org.lwjgl.system.jemalloc.ExtentPurgeI r9, org.lwjgl.system.jemalloc.ExtentPurgeI r10, org.lwjgl.system.jemalloc.ExtentSplitI r11, org.lwjgl.system.jemalloc.ExtentMergeI r12) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.system.jemalloc.ExtentHooks r0 = r0.alloc(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.system.jemalloc.ExtentHooks r0 = r0.dalloc(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.system.jemalloc.ExtentHooks r0 = r0.destroy(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.system.jemalloc.ExtentHooks r0 = r0.commit(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.system.jemalloc.ExtentHooks r0 = r0.decommit(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.system.jemalloc.ExtentHooks r0 = r0.purge_lazy(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.system.jemalloc.ExtentHooks r0 = r0.purge_forced(r1)
            r0 = r3
            r1 = r11
            org.lwjgl.system.jemalloc.ExtentHooks r0 = r0.split(r1)
            r0 = r3
            r1 = r12
            org.lwjgl.system.jemalloc.ExtentHooks r0 = r0.merge(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.system.jemalloc.ExtentHooks set(org.lwjgl.system.jemalloc.ExtentHooks r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.system.jemalloc.ExtentHooks.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.system.jemalloc.ExtentHooks malloc() {
            java.lang.Class<org.lwjgl.system.jemalloc.ExtentHooks> r0 = org.lwjgl.system.jemalloc.ExtentHooks.class
            int r1 = org.lwjgl.system.jemalloc.ExtentHooks.SIZEOF
            long r1 = (long) r1
            long r1 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r1)
            org.lwjgl.system.Struct r0 = wrap(r0, r1)
            org.lwjgl.system.jemalloc.ExtentHooks r0 = (org.lwjgl.system.jemalloc.ExtentHooks) r0
            return r0
    }

    public static org.lwjgl.system.jemalloc.ExtentHooks calloc() {
            java.lang.Class<org.lwjgl.system.jemalloc.ExtentHooks> r0 = org.lwjgl.system.jemalloc.ExtentHooks.class
            r1 = 1
            int r2 = org.lwjgl.system.jemalloc.ExtentHooks.SIZEOF
            long r2 = (long) r2
            long r1 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r1, r2)
            org.lwjgl.system.Struct r0 = wrap(r0, r1)
            org.lwjgl.system.jemalloc.ExtentHooks r0 = (org.lwjgl.system.jemalloc.ExtentHooks) r0
            return r0
    }

    public static org.lwjgl.system.jemalloc.ExtentHooks create() {
            int r0 = org.lwjgl.system.jemalloc.ExtentHooks.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r5 = r0
            java.lang.Class<org.lwjgl.system.jemalloc.ExtentHooks> r0 = org.lwjgl.system.jemalloc.ExtentHooks.class
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r5
            org.lwjgl.system.Struct r0 = wrap(r0, r1, r2)
            org.lwjgl.system.jemalloc.ExtentHooks r0 = (org.lwjgl.system.jemalloc.ExtentHooks) r0
            return r0
    }

    public static org.lwjgl.system.jemalloc.ExtentHooks create(long r4) {
            java.lang.Class<org.lwjgl.system.jemalloc.ExtentHooks> r0 = org.lwjgl.system.jemalloc.ExtentHooks.class
            r1 = r4
            org.lwjgl.system.Struct r0 = wrap(r0, r1)
            org.lwjgl.system.jemalloc.ExtentHooks r0 = (org.lwjgl.system.jemalloc.ExtentHooks) r0
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.jemalloc.ExtentHooks createSafe(long r5) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            java.lang.Class<org.lwjgl.system.jemalloc.ExtentHooks> r0 = org.lwjgl.system.jemalloc.ExtentHooks.class
            r1 = r5
            org.lwjgl.system.Struct r0 = wrap(r0, r1)
            org.lwjgl.system.jemalloc.ExtentHooks r0 = (org.lwjgl.system.jemalloc.ExtentHooks) r0
        L13:
            return r0
    }

    public static org.lwjgl.system.jemalloc.ExtentHooks mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.jemalloc.ExtentHooks r0 = mallocStack(r0)
            return r0
    }

    public static org.lwjgl.system.jemalloc.ExtentHooks callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.jemalloc.ExtentHooks r0 = callocStack(r0)
            return r0
    }

    public static org.lwjgl.system.jemalloc.ExtentHooks mallocStack(org.lwjgl.system.MemoryStack r5) {
            java.lang.Class<org.lwjgl.system.jemalloc.ExtentHooks> r0 = org.lwjgl.system.jemalloc.ExtentHooks.class
            r1 = r5
            int r2 = org.lwjgl.system.jemalloc.ExtentHooks.ALIGNOF
            int r3 = org.lwjgl.system.jemalloc.ExtentHooks.SIZEOF
            long r1 = r1.nmalloc(r2, r3)
            org.lwjgl.system.Struct r0 = wrap(r0, r1)
            org.lwjgl.system.jemalloc.ExtentHooks r0 = (org.lwjgl.system.jemalloc.ExtentHooks) r0
            return r0
    }

    public static org.lwjgl.system.jemalloc.ExtentHooks callocStack(org.lwjgl.system.MemoryStack r6) {
            java.lang.Class<org.lwjgl.system.jemalloc.ExtentHooks> r0 = org.lwjgl.system.jemalloc.ExtentHooks.class
            r1 = r6
            int r2 = org.lwjgl.system.jemalloc.ExtentHooks.ALIGNOF
            r3 = 1
            int r4 = org.lwjgl.system.jemalloc.ExtentHooks.SIZEOF
            long r1 = r1.ncalloc(r2, r3, r4)
            org.lwjgl.system.Struct r0 = wrap(r0, r1)
            org.lwjgl.system.jemalloc.ExtentHooks r0 = (org.lwjgl.system.jemalloc.ExtentHooks) r0
            return r0
    }

    public static org.lwjgl.system.jemalloc.ExtentAlloc nalloc(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.jemalloc.ExtentHooks.ALLOC
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.system.jemalloc.ExtentAlloc r0 = org.lwjgl.system.jemalloc.ExtentAlloc.create(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.jemalloc.ExtentDalloc ndalloc(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.jemalloc.ExtentHooks.DALLOC
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.system.jemalloc.ExtentDalloc r0 = org.lwjgl.system.jemalloc.ExtentDalloc.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.jemalloc.ExtentDestroy ndestroy(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.jemalloc.ExtentHooks.DESTROY
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.system.jemalloc.ExtentDestroy r0 = org.lwjgl.system.jemalloc.ExtentDestroy.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.jemalloc.ExtentCommit ncommit(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.jemalloc.ExtentHooks.COMMIT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.system.jemalloc.ExtentCommit r0 = org.lwjgl.system.jemalloc.ExtentCommit.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.jemalloc.ExtentDecommit ndecommit(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.jemalloc.ExtentHooks.DECOMMIT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.system.jemalloc.ExtentDecommit r0 = org.lwjgl.system.jemalloc.ExtentDecommit.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.jemalloc.ExtentPurge npurge_lazy(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.jemalloc.ExtentHooks.PURGE_LAZY
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.system.jemalloc.ExtentPurge r0 = org.lwjgl.system.jemalloc.ExtentPurge.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.jemalloc.ExtentPurge npurge_forced(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.jemalloc.ExtentHooks.PURGE_FORCED
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.system.jemalloc.ExtentPurge r0 = org.lwjgl.system.jemalloc.ExtentPurge.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.jemalloc.ExtentSplit nsplit(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.jemalloc.ExtentHooks.SPLIT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.system.jemalloc.ExtentSplit r0 = org.lwjgl.system.jemalloc.ExtentSplit.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.jemalloc.ExtentMerge nmerge(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.jemalloc.ExtentHooks.MERGE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.system.jemalloc.ExtentMerge r0 = org.lwjgl.system.jemalloc.ExtentMerge.createSafe(r0)
            return r0
    }

    public static void nalloc(long r5, org.lwjgl.system.jemalloc.ExtentAllocI r7) {
            r0 = r5
            int r1 = org.lwjgl.system.jemalloc.ExtentHooks.ALLOC
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void ndalloc(long r5, @javax.annotation.Nullable org.lwjgl.system.jemalloc.ExtentDallocI r7) {
            r0 = r5
            int r1 = org.lwjgl.system.jemalloc.ExtentHooks.DALLOC
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void ndestroy(long r5, @javax.annotation.Nullable org.lwjgl.system.jemalloc.ExtentDestroyI r7) {
            r0 = r5
            int r1 = org.lwjgl.system.jemalloc.ExtentHooks.DESTROY
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void ncommit(long r5, @javax.annotation.Nullable org.lwjgl.system.jemalloc.ExtentCommitI r7) {
            r0 = r5
            int r1 = org.lwjgl.system.jemalloc.ExtentHooks.COMMIT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void ndecommit(long r5, @javax.annotation.Nullable org.lwjgl.system.jemalloc.ExtentDecommitI r7) {
            r0 = r5
            int r1 = org.lwjgl.system.jemalloc.ExtentHooks.DECOMMIT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npurge_lazy(long r5, @javax.annotation.Nullable org.lwjgl.system.jemalloc.ExtentPurgeI r7) {
            r0 = r5
            int r1 = org.lwjgl.system.jemalloc.ExtentHooks.PURGE_LAZY
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npurge_forced(long r5, @javax.annotation.Nullable org.lwjgl.system.jemalloc.ExtentPurgeI r7) {
            r0 = r5
            int r1 = org.lwjgl.system.jemalloc.ExtentHooks.PURGE_FORCED
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nsplit(long r5, @javax.annotation.Nullable org.lwjgl.system.jemalloc.ExtentSplitI r7) {
            r0 = r5
            int r1 = org.lwjgl.system.jemalloc.ExtentHooks.SPLIT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nmerge(long r5, @javax.annotation.Nullable org.lwjgl.system.jemalloc.ExtentMergeI r7) {
            r0 = r5
            int r1 = org.lwjgl.system.jemalloc.ExtentHooks.MERGE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.jemalloc.ExtentHooks.ALLOC
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            return
    }

    public static void validate(long r7, int r9) {
            r0 = 0
            r10 = r0
        L2:
            r0 = r10
            r1 = r9
            if (r0 >= r1) goto L1b
            r0 = r7
            r1 = r10
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            int r2 = org.lwjgl.system.jemalloc.ExtentHooks.SIZEOF
            long r2 = (long) r2
            long r1 = r1 * r2
            long r0 = r0 + r1
            validate(r0)
            int r10 = r10 + 1
            goto L2
        L1b:
            return
    }

    static {
            r0 = 9
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.system.jemalloc.ExtentHooks.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.jemalloc.ExtentHooks.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.system.jemalloc.ExtentHooks.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.system.jemalloc.ExtentHooks.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.system.jemalloc.ExtentHooks.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.system.jemalloc.ExtentHooks.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.system.jemalloc.ExtentHooks.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.system.jemalloc.ExtentHooks.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            int r3 = org.lwjgl.system.jemalloc.ExtentHooks.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.system.jemalloc.ExtentHooks.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.system.jemalloc.ExtentHooks.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.jemalloc.ExtentHooks.ALLOC = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.jemalloc.ExtentHooks.DALLOC = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.jemalloc.ExtentHooks.DESTROY = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.jemalloc.ExtentHooks.COMMIT = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.jemalloc.ExtentHooks.DECOMMIT = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.jemalloc.ExtentHooks.PURGE_LAZY = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.jemalloc.ExtentHooks.PURGE_FORCED = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.jemalloc.ExtentHooks.SPLIT = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.jemalloc.ExtentHooks.MERGE = r0
            return
    }
}
