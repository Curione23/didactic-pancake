package org.lwjgl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/CLongBuffer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/CLongBuffer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/CLongBuffer.class */
public class CLongBuffer extends org.lwjgl.system.CustomBuffer<org.lwjgl.CLongBuffer> implements java.lang.Comparable<org.lwjgl.CLongBuffer> {
    protected CLongBuffer(long r10, @javax.annotation.Nullable java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
            r9 = this;
            r0 = r9
            r1 = r10
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public static org.lwjgl.CLongBuffer allocateDirect(int r10) {
            r0 = r10
            int r1 = org.lwjgl.CLongBuffer.CLONG_SHIFT
            int r0 = org.lwjgl.BufferUtils.getAllocationSize(r0, r1)
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r11 = r0
            org.lwjgl.CLongBuffer r0 = new org.lwjgl.CLongBuffer
            r1 = r0
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r11
            r4 = -1
            r5 = 0
            r6 = r10
            r7 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
    }

    public static org.lwjgl.CLongBuffer create(long r10, int r12) {
            org.lwjgl.CLongBuffer r0 = new org.lwjgl.CLongBuffer
            r1 = r0
            r2 = r10
            r3 = 0
            r4 = -1
            r5 = 0
            r6 = r12
            r7 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
    }

    public static org.lwjgl.CLongBuffer create(java.nio.ByteBuffer r10) {
            r0 = r10
            int r0 = r0.remaining()
            int r1 = org.lwjgl.CLongBuffer.CLONG_SHIFT
            int r0 = r0 >> r1
            r11 = r0
            org.lwjgl.CLongBuffer r0 = new org.lwjgl.CLongBuffer
            r1 = r0
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r10
            r4 = -1
            r5 = 0
            r6 = r11
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
    }

    @Override // org.lwjgl.system.CustomBuffer
    protected org.lwjgl.CLongBuffer self() {
            r2 = this;
            r0 = r2
            return r0
    }

    @Override // org.lwjgl.system.CustomBuffer
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.CLongBuffer.CLONG_SIZE
            return r0
    }

    public long get() {
            r7 = this;
            r0 = r7
            long r0 = r0.address
            r1 = r7
            int r1 = r1.nextGetIndex()
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            int r2 = org.lwjgl.CLongBuffer.CLONG_SIZE
            long r2 = (long) r2
            long r1 = r1 * r2
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long get(java.nio.ByteBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            int r1 = org.lwjgl.CLongBuffer.CLONG_SIZE
            if (r0 >= r1) goto L12
            java.nio.BufferUnderflowException r0 = new java.nio.BufferUnderflowException
            r1 = r0
            r1.<init>()
            throw r0
        L12:
            r0 = r4
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)     // Catch: java.lang.Throwable -> L29
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)     // Catch: java.lang.Throwable -> L29
            r5 = r0
            r0 = r4
            r1 = r4
            int r1 = r1.position()
            int r2 = org.lwjgl.CLongBuffer.CLONG_SIZE
            int r1 = r1 + r2
            java.nio.Buffer r0 = r0.position(r1)
            r0 = r5
            return r0
        L29:
            r7 = move-exception
            r0 = r4
            r1 = r4
            int r1 = r1.position()
            int r2 = org.lwjgl.CLongBuffer.CLONG_SIZE
            int r1 = r1 + r2
            java.nio.Buffer r0 = r0.position(r1)
            r0 = r7
            throw r0
    }

    public org.lwjgl.CLongBuffer put(long r8) {
            r7 = this;
            r0 = r7
            long r0 = r0.address
            r1 = r7
            int r1 = r1.nextPutIndex()
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            int r2 = org.lwjgl.CLongBuffer.CLONG_SIZE
            long r2 = (long) r2
            long r1 = r1 * r2
            long r0 = r0 + r1
            r1 = r8
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            r0 = r7
            return r0
    }

    public static void put(java.nio.ByteBuffer r5, long r6) {
            r0 = r5
            int r0 = r0.remaining()
            int r1 = org.lwjgl.CLongBuffer.CLONG_SIZE
            if (r0 >= r1) goto L12
            java.nio.BufferOverflowException r0 = new java.nio.BufferOverflowException
            r1 = r0
            r1.<init>()
            throw r0
        L12:
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)     // Catch: java.lang.Throwable -> L2a
            r1 = r6
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)     // Catch: java.lang.Throwable -> L2a
            r0 = r5
            r1 = r5
            int r1 = r1.position()
            int r2 = org.lwjgl.CLongBuffer.CLONG_SIZE
            int r1 = r1 + r2
            java.nio.Buffer r0 = r0.position(r1)
            goto L3a
        L2a:
            r8 = move-exception
            r0 = r5
            r1 = r5
            int r1 = r1.position()
            int r2 = org.lwjgl.CLongBuffer.CLONG_SIZE
            int r1 = r1 + r2
            java.nio.Buffer r0 = r0.position(r1)
            r0 = r8
            throw r0
        L3a:
            return
    }

    public long get(int r8) {
            r7 = this;
            r0 = r7
            long r0 = r0.address
            r1 = r8
            r2 = r7
            int r2 = r2.limit
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            int r2 = org.lwjgl.CLongBuffer.CLONG_SIZE
            long r2 = (long) r2
            long r1 = r1 * r2
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long get(java.nio.ByteBuffer r5, int r6) {
            r0 = r6
            int r1 = org.lwjgl.CLongBuffer.CLONG_SIZE
            r2 = r5
            int r2 = r2.limit()
            int r0 = org.lwjgl.system.CheckIntrinsics.checkFromIndexSize(r0, r1, r2)
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddress0(r0)
            r1 = r6
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public org.lwjgl.CLongBuffer put(int r8, long r9) {
            r7 = this;
            r0 = r7
            long r0 = r0.address
            r1 = r8
            r2 = r7
            int r2 = r2.limit
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            int r2 = org.lwjgl.CLongBuffer.CLONG_SIZE
            long r2 = (long) r2
            long r1 = r1 * r2
            long r0 = r0 + r1
            r1 = r9
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            r0 = r7
            return r0
    }

    public static void put(java.nio.ByteBuffer r5, int r6, long r7) {
            r0 = r6
            int r1 = org.lwjgl.CLongBuffer.CLONG_SIZE
            r2 = r5
            int r2 = r2.limit()
            int r0 = org.lwjgl.system.CheckIntrinsics.checkFromIndexSize(r0, r1, r2)
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddress0(r0)
            r1 = r6
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public org.lwjgl.CLongBuffer get(long[] r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = 0
            r3 = r6
            int r3 = r3.length
            org.lwjgl.CLongBuffer r0 = r0.get(r1, r2, r3)
            return r0
    }

    public org.lwjgl.CLongBuffer get(long[] r6, int r7, int r8) {
            r5 = this;
            int r0 = org.lwjgl.CLongBuffer.CLONG_SIZE
            r1 = 8
            if (r0 != r1) goto L28
            r0 = r5
            long r0 = r0.address()
            r1 = r5
            int r1 = r1.remaining()
            java.nio.LongBuffer r0 = org.lwjgl.system.MemoryUtil.memLongBuffer(r0, r1)
            r1 = r6
            r2 = r7
            r3 = r8
            java.nio.LongBuffer r0 = r0.get(r1, r2, r3)
            r0 = r5
            r1 = r5
            int r1 = r1.position()
            r2 = r8
            int r1 = r1 + r2
            org.lwjgl.system.CustomBuffer r0 = r0.position(r1)
            goto L2f
        L28:
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.get32(r1, r2, r3)
        L2f:
            r0 = r5
            return r0
    }

    private void get32(long[] r6, int r7, int r8) {
            r5 = this;
            r0 = r7
            r1 = r8
            r2 = r6
            int r2 = r2.length
            int r0 = org.lwjgl.system.CheckIntrinsics.checkFromIndexSize(r0, r1, r2)
            r0 = r5
            int r0 = r0.remaining()
            r1 = r8
            if (r0 >= r1) goto L18
            java.nio.BufferUnderflowException r0 = new java.nio.BufferUnderflowException
            r1 = r0
            r1.<init>()
            throw r0
        L18:
            r0 = r7
            r9 = r0
            r0 = r7
            r1 = r8
            int r0 = r0 + r1
            r10 = r0
        L20:
            r0 = r9
            r1 = r10
            if (r0 >= r1) goto L35
            r0 = r6
            r1 = r9
            r2 = r5
            long r2 = r2.get()
            r0[r1] = r2
            int r9 = r9 + 1
            goto L20
        L35:
            return
    }

    public org.lwjgl.CLongBuffer put(long[] r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = 0
            r3 = r6
            int r3 = r3.length
            org.lwjgl.CLongBuffer r0 = r0.put(r1, r2, r3)
            return r0
    }

    public org.lwjgl.CLongBuffer put(long[] r6, int r7, int r8) {
            r5 = this;
            int r0 = org.lwjgl.CLongBuffer.CLONG_SIZE
            r1 = 8
            if (r0 != r1) goto L28
            r0 = r5
            long r0 = r0.address()
            r1 = r5
            int r1 = r1.remaining()
            java.nio.LongBuffer r0 = org.lwjgl.system.MemoryUtil.memLongBuffer(r0, r1)
            r1 = r6
            r2 = r7
            r3 = r8
            java.nio.LongBuffer r0 = r0.put(r1, r2, r3)
            r0 = r5
            r1 = r5
            int r1 = r1.position()
            r2 = r8
            int r1 = r1 + r2
            org.lwjgl.system.CustomBuffer r0 = r0.position(r1)
            goto L2f
        L28:
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.put32(r1, r2, r3)
        L2f:
            r0 = r5
            return r0
    }

    private void put32(long[] r5, int r6, int r7) {
            r4 = this;
            r0 = r6
            r1 = r7
            r2 = r5
            int r2 = r2.length
            int r0 = org.lwjgl.system.CheckIntrinsics.checkFromIndexSize(r0, r1, r2)
            r0 = r4
            int r0 = r0.remaining()
            r1 = r7
            if (r0 >= r1) goto L18
            java.nio.BufferOverflowException r0 = new java.nio.BufferOverflowException
            r1 = r0
            r1.<init>()
            throw r0
        L18:
            r0 = r6
            r1 = r7
            int r0 = r0 + r1
            r8 = r0
            r0 = r6
            r9 = r0
        L20:
            r0 = r9
            r1 = r8
            if (r0 >= r1) goto L36
            r0 = r4
            r1 = r5
            r2 = r9
            r1 = r1[r2]
            org.lwjgl.CLongBuffer r0 = r0.put(r1)
            int r9 = r9 + 1
            goto L20
        L36:
            return
    }

    @Override // org.lwjgl.system.Pointer.Default
    public int hashCode() {
            r4 = this;
            r0 = 1
            r5 = r0
            r0 = r4
            int r0 = r0.position()
            r6 = r0
            r0 = r4
            int r0 = r0.limit()
            r1 = 1
            int r0 = r0 - r1
            r7 = r0
        Le:
            r0 = r7
            r1 = r6
            if (r0 < r1) goto L25
            r0 = 31
            r1 = r5
            int r0 = r0 * r1
            r1 = r4
            r2 = r7
            long r1 = r1.get(r2)
            int r1 = (int) r1
            int r0 = r0 + r1
            r5 = r0
            int r7 = r7 + (-1)
            goto Le
        L25:
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.system.Pointer.Default
    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof org.lwjgl.CLongBuffer
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            r0 = r6
            org.lwjgl.CLongBuffer r0 = (org.lwjgl.CLongBuffer) r0
            r7 = r0
            r0 = r5
            int r0 = r0.remaining()
            r1 = r7
            int r1 = r1.remaining()
            if (r0 == r1) goto L1b
            r0 = 0
            return r0
        L1b:
            r0 = r5
            int r0 = r0.position()
            r8 = r0
            r0 = r5
            int r0 = r0.limit()
            r1 = 1
            int r0 = r0 - r1
            r9 = r0
            r0 = r7
            int r0 = r0.limit()
            r1 = 1
            int r0 = r0 - r1
            r10 = r0
        L30:
            r0 = r9
            r1 = r8
            if (r0 < r1) goto L59
            r0 = r5
            r1 = r9
            long r0 = r0.get(r1)
            r11 = r0
            r0 = r7
            r1 = r10
            long r0 = r0.get(r1)
            r13 = r0
            r0 = r11
            r1 = r13
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L50
            r0 = 0
            return r0
        L50:
            int r9 = r9 + (-1)
            int r10 = r10 + (-1)
            goto L30
        L59:
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(org.lwjgl.CLongBuffer r6) {
            r5 = this;
            r0 = r5
            int r0 = r0.position()
            r1 = r5
            int r1 = r1.remaining()
            r2 = r6
            int r2 = r2.remaining()
            int r1 = java.lang.Math.min(r1, r2)
            int r0 = r0 + r1
            r7 = r0
            r0 = r5
            int r0 = r0.position()
            r8 = r0
            r0 = r6
            int r0 = r0.position()
            r9 = r0
        L1c:
            r0 = r8
            r1 = r7
            if (r0 >= r1) goto L50
            r0 = r5
            r1 = r8
            long r0 = r0.get(r1)
            r10 = r0
            r0 = r6
            r1 = r9
            long r0 = r0.get(r1)
            r12 = r0
            r0 = r10
            r1 = r12
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L3b
            goto L47
        L3b:
            r0 = r10
            r1 = r12
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L45
            r0 = -1
            return r0
        L45:
            r0 = 1
            return r0
        L47:
            int r8 = r8 + 1
            int r9 = r9 + 1
            goto L1c
        L50:
            r0 = r5
            int r0 = r0.remaining()
            r1 = r6
            int r1 = r1.remaining()
            int r0 = r0 - r1
            return r0
    }

    @Override // org.lwjgl.system.CustomBuffer
    protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
            r2 = this;
            r0 = r2
            org.lwjgl.CLongBuffer r0 = r0.self()
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(org.lwjgl.CLongBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.CLongBuffer r1 = (org.lwjgl.CLongBuffer) r1
            int r0 = r0.compareTo2(r1)
            return r0
    }
}
