package org.lwjgl.system;

import org.lwjgl.system.CustomBuffer;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/CustomBuffer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/CustomBuffer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/CustomBuffer.class */
public abstract class CustomBuffer<SELF extends org.lwjgl.system.CustomBuffer<SELF>> extends org.lwjgl.system.Pointer.Default {

    @javax.annotation.Nullable
    protected java.nio.ByteBuffer container;
    protected int mark;
    protected int position;
    protected int limit;
    protected int capacity;

    protected CustomBuffer(long r5, @javax.annotation.Nullable java.nio.ByteBuffer r7, int r8, int r9, int r10, int r11) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            r0 = r4
            r1 = r7
            r0.container = r1
            r0 = r4
            r1 = r8
            r0.mark = r1
            r0 = r4
            r1 = r9
            r0.position = r1
            r0 = r4
            r1 = r10
            r0.limit = r1
            r0 = r4
            r1 = r11
            r0.capacity = r1
            return
    }

    public abstract int sizeof();

    public long address0() {
            r3 = this;
            r0 = r3
            long r0 = r0.address
            return r0
    }

    @Override // org.lwjgl.system.Pointer.Default, org.lwjgl.system.Pointer
    public long address() {
            r7 = this;
            r0 = r7
            long r0 = r0.address
            r1 = r7
            int r1 = r1.position
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = r7
            int r2 = r2.sizeof()
            long r2 = (long) r2
            long r1 = r1 * r2
            long r0 = r0 + r1
            return r0
    }

    public long address(int r8) {
            r7 = this;
            r0 = r7
            long r0 = r0.address
            r1 = r8
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = r7
            int r2 = r2.sizeof()
            long r2 = (long) r2
            long r1 = r1 * r2
            long r0 = r0 + r1
            return r0
    }

    public void free() {
            r3 = this;
            r0 = r3
            long r0 = r0.address
            org.lwjgl.system.MemoryUtil.nmemFree(r0)
            return
    }

    public int capacity() {
            r2 = this;
            r0 = r2
            int r0 = r0.capacity
            return r0
    }

    public int position() {
            r2 = this;
            r0 = r2
            int r0 = r0.position
            return r0
    }

    public SELF position(int r4) {
            r3 = this;
            r0 = r4
            if (r0 < 0) goto Lc
            r0 = r3
            int r0 = r0.limit
            r1 = r4
            if (r0 >= r1) goto L14
        Lc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L14:
            r0 = r3
            r1 = r4
            r0.position = r1
            r0 = r4
            r1 = r3
            int r1 = r1.mark
            if (r0 >= r1) goto L26
            r0 = r3
            r1 = -1
            r0.mark = r1
        L26:
            r0 = r3
            org.lwjgl.system.CustomBuffer r0 = r0.self()
            return r0
    }

    public int limit() {
            r2 = this;
            r0 = r2
            int r0 = r0.limit
            return r0
    }

    public SELF limit(int r4) {
            r3 = this;
            r0 = r4
            if (r0 < 0) goto Lc
            r0 = r3
            int r0 = r0.capacity
            r1 = r4
            if (r0 >= r1) goto L14
        Lc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L14:
            r0 = r3
            r1 = r4
            r0.limit = r1
            r0 = r4
            r1 = r3
            int r1 = r1.position
            if (r0 >= r1) goto L26
            r0 = r3
            r1 = r4
            r0.position = r1
        L26:
            r0 = r4
            r1 = r3
            int r1 = r1.mark
            if (r0 >= r1) goto L33
            r0 = r3
            r1 = -1
            r0.mark = r1
        L33:
            r0 = r3
            org.lwjgl.system.CustomBuffer r0 = r0.self()
            return r0
    }

    public SELF mark() {
            r3 = this;
            r0 = r3
            r1 = r3
            int r1 = r1.position
            r0.mark = r1
            r0 = r3
            org.lwjgl.system.CustomBuffer r0 = r0.self()
            return r0
    }

    public SELF reset() {
            r3 = this;
            r0 = r3
            int r0 = r0.mark
            r4 = r0
            r0 = r4
            if (r0 >= 0) goto L11
            java.nio.InvalidMarkException r0 = new java.nio.InvalidMarkException
            r1 = r0
            r1.<init>()
            throw r0
        L11:
            r0 = r3
            r1 = r4
            r0.position = r1
            r0 = r3
            org.lwjgl.system.CustomBuffer r0 = r0.self()
            return r0
    }

    public SELF clear() {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.position = r1
            r0 = r3
            r1 = r3
            int r1 = r1.capacity
            r0.limit = r1
            r0 = r3
            r1 = -1
            r0.mark = r1
            r0 = r3
            org.lwjgl.system.CustomBuffer r0 = r0.self()
            return r0
    }

    public SELF flip() {
            r3 = this;
            r0 = r3
            r1 = r3
            int r1 = r1.position
            r0.limit = r1
            r0 = r3
            r1 = 0
            r0.position = r1
            r0 = r3
            r1 = -1
            r0.mark = r1
            r0 = r3
            org.lwjgl.system.CustomBuffer r0 = r0.self()
            return r0
    }

    public SELF rewind() {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.position = r1
            r0 = r3
            r1 = -1
            r0.mark = r1
            r0 = r3
            org.lwjgl.system.CustomBuffer r0 = r0.self()
            return r0
    }

    public int remaining() {
            r3 = this;
            r0 = r3
            int r0 = r0.limit
            r1 = r3
            int r1 = r1.position
            int r0 = r0 - r1
            return r0
    }

    public boolean hasRemaining() {
            r3 = this;
            r0 = r3
            int r0 = r0.position
            r1 = r3
            int r1 = r1.limit
            if (r0 >= r1) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    public SELF slice() {
            r11 = this;
            sun.misc.Unsafe r0 = org.lwjgl.system.CustomBuffer.UNSAFE     // Catch: java.lang.InstantiationException -> L11
            r1 = r11
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.InstantiationException -> L11
            java.lang.Object r0 = r0.allocateInstance(r1)     // Catch: java.lang.InstantiationException -> L11
            org.lwjgl.system.CustomBuffer r0 = (org.lwjgl.system.CustomBuffer) r0     // Catch: java.lang.InstantiationException -> L11
            r12 = r0
            goto L1b
        L11:
            r13 = move-exception
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r2 = r13
            r1.<init>(r2)
            throw r0
        L1b:
            sun.misc.Unsafe r0 = org.lwjgl.system.CustomBuffer.UNSAFE
            r1 = r12
            long r2 = org.lwjgl.system.CustomBuffer.ADDRESS
            r3 = r11
            long r3 = r3.address
            r4 = r11
            int r4 = r4.position
            long r4 = java.lang.Integer.toUnsignedLong(r4)
            r5 = r11
            int r5 = r5.sizeof()
            long r5 = (long) r5
            long r4 = r4 * r5
            long r3 = r3 + r4
            r0.putLong(r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.CustomBuffer.UNSAFE
            r1 = r12
            long r2 = org.lwjgl.system.CustomBuffer.BUFFER_MARK
            r3 = -1
            r0.putInt(r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.CustomBuffer.UNSAFE
            r1 = r12
            long r2 = org.lwjgl.system.CustomBuffer.BUFFER_LIMIT
            r3 = r11
            int r3 = r3.remaining()
            r0.putInt(r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.CustomBuffer.UNSAFE
            r1 = r12
            long r2 = org.lwjgl.system.CustomBuffer.BUFFER_CAPACITY
            r3 = r11
            int r3 = r3.remaining()
            r0.putInt(r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.CustomBuffer.UNSAFE
            r1 = r12
            long r2 = org.lwjgl.system.CustomBuffer.BUFFER_CONTAINER
            r3 = r11
            java.nio.ByteBuffer r3 = r3.container
            r0.putObject(r1, r2, r3)
            r0 = r12
            return r0
    }

    public SELF slice(int r12, int r13) {
            r11 = this;
            r0 = r11
            int r0 = r0.position
            r1 = r12
            int r0 = r0 + r1
            r14 = r0
            r0 = r12
            if (r0 < 0) goto L13
            r0 = r11
            int r0 = r0.limit
            r1 = r12
            if (r0 >= r1) goto L1b
        L13:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L1b:
            r0 = r13
            if (r0 < 0) goto L29
            r0 = r11
            int r0 = r0.capacity
            r1 = r14
            int r0 = r0 - r1
            r1 = r13
            if (r0 >= r1) goto L31
        L29:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L31:
            sun.misc.Unsafe r0 = org.lwjgl.system.CustomBuffer.UNSAFE     // Catch: java.lang.InstantiationException -> L43
            r1 = r11
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.InstantiationException -> L43
            java.lang.Object r0 = r0.allocateInstance(r1)     // Catch: java.lang.InstantiationException -> L43
            org.lwjgl.system.CustomBuffer r0 = (org.lwjgl.system.CustomBuffer) r0     // Catch: java.lang.InstantiationException -> L43
            r15 = r0
            goto L4f
        L43:
            r16 = move-exception
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r2 = r16
            r1.<init>(r2)
            throw r0
        L4f:
            sun.misc.Unsafe r0 = org.lwjgl.system.CustomBuffer.UNSAFE
            r1 = r15
            long r2 = org.lwjgl.system.CustomBuffer.ADDRESS
            r3 = r11
            long r3 = r3.address
            r4 = r14
            long r4 = java.lang.Integer.toUnsignedLong(r4)
            r5 = r11
            int r5 = r5.sizeof()
            long r5 = (long) r5
            long r4 = r4 * r5
            long r3 = r3 + r4
            r0.putLong(r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.CustomBuffer.UNSAFE
            r1 = r15
            long r2 = org.lwjgl.system.CustomBuffer.BUFFER_MARK
            r3 = -1
            r0.putInt(r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.CustomBuffer.UNSAFE
            r1 = r15
            long r2 = org.lwjgl.system.CustomBuffer.BUFFER_LIMIT
            r3 = r13
            r0.putInt(r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.CustomBuffer.UNSAFE
            r1 = r15
            long r2 = org.lwjgl.system.CustomBuffer.BUFFER_CAPACITY
            r3 = r13
            r0.putInt(r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.CustomBuffer.UNSAFE
            r1 = r15
            long r2 = org.lwjgl.system.CustomBuffer.BUFFER_CONTAINER
            r3 = r11
            java.nio.ByteBuffer r3 = r3.container
            r0.putObject(r1, r2, r3)
            r0 = r15
            return r0
    }

    public SELF duplicate() {
            r7 = this;
            sun.misc.Unsafe r0 = org.lwjgl.system.CustomBuffer.UNSAFE     // Catch: java.lang.InstantiationException -> L11
            r1 = r7
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.InstantiationException -> L11
            java.lang.Object r0 = r0.allocateInstance(r1)     // Catch: java.lang.InstantiationException -> L11
            org.lwjgl.system.CustomBuffer r0 = (org.lwjgl.system.CustomBuffer) r0     // Catch: java.lang.InstantiationException -> L11
            r8 = r0
            goto L1b
        L11:
            r9 = move-exception
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            throw r0
        L1b:
            sun.misc.Unsafe r0 = org.lwjgl.system.CustomBuffer.UNSAFE
            r1 = r8
            long r2 = org.lwjgl.system.CustomBuffer.ADDRESS
            r3 = r7
            long r3 = r3.address
            r0.putLong(r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.CustomBuffer.UNSAFE
            r1 = r8
            long r2 = org.lwjgl.system.CustomBuffer.BUFFER_MARK
            r3 = r7
            int r3 = r3.mark
            r0.putInt(r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.CustomBuffer.UNSAFE
            r1 = r8
            long r2 = org.lwjgl.system.CustomBuffer.BUFFER_POSITION
            r3 = r7
            int r3 = r3.position
            r0.putInt(r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.CustomBuffer.UNSAFE
            r1 = r8
            long r2 = org.lwjgl.system.CustomBuffer.BUFFER_LIMIT
            r3 = r7
            int r3 = r3.limit
            r0.putInt(r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.CustomBuffer.UNSAFE
            r1 = r8
            long r2 = org.lwjgl.system.CustomBuffer.BUFFER_CAPACITY
            r3 = r7
            int r3 = r3.capacity
            r0.putInt(r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.CustomBuffer.UNSAFE
            r1 = r8
            long r2 = org.lwjgl.system.CustomBuffer.BUFFER_CONTAINER
            r3 = r7
            java.nio.ByteBuffer r3 = r3.container
            r0.putObject(r1, r2, r3)
            r0 = r8
            return r0
    }

    public SELF put(SELF r10) {
            r9 = this;
            r0 = r10
            r1 = r9
            if (r0 != r1) goto Ld
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        Ld:
            r0 = r10
            int r0 = r0.remaining()
            r11 = r0
            r0 = r9
            int r0 = r0.remaining()
            r1 = r11
            if (r0 >= r1) goto L22
            java.nio.BufferOverflowException r0 = new java.nio.BufferOverflowException
            r1 = r0
            r1.<init>()
            throw r0
        L22:
            r0 = r10
            long r0 = r0.address()
            r1 = r9
            long r1 = r1.address()
            r2 = r11
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = r9
            int r3 = r3.sizeof()
            long r3 = (long) r3
            long r2 = r2 * r3
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r9
            r1 = r0
            int r1 = r1.position
            r2 = r11
            int r1 = r1 + r2
            r0.position = r1
            r0 = r9
            org.lwjgl.system.CustomBuffer r0 = r0.self()
            return r0
    }

    public SELF compact() {
            r9 = this;
            r0 = r9
            long r0 = r0.address()
            r1 = r9
            long r1 = r1.address
            r2 = r9
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = r9
            int r3 = r3.sizeof()
            long r3 = (long) r3
            long r2 = r2 * r3
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r9
            r1 = r9
            int r1 = r1.remaining()
            org.lwjgl.system.CustomBuffer r0 = r0.position(r1)
            r0 = r9
            r1 = r9
            int r1 = r1.capacity()
            org.lwjgl.system.CustomBuffer r0 = r0.limit(r1)
            r0 = r9
            r1 = -1
            r0.mark = r1
            r0 = r9
            org.lwjgl.system.CustomBuffer r0 = r0.self()
            return r0
    }

    @Override // org.lwjgl.system.Pointer.Default
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r3
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "[pos="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            int r1 = r1.position()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " lim="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            int r1 = r1.limit()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " cap="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            int r1 = r1.capacity()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    protected abstract SELF self();

    protected final int nextGetIndex() {
            r5 = this;
            r0 = r5
            int r0 = r0.position
            r1 = r5
            int r1 = r1.limit
            if (r0 >= r1) goto L17
            r0 = r5
            r1 = r0
            int r1 = r1.position
            r2 = r1; r1 = r0; r0 = r2; 
            r3 = 1
            int r2 = r2 + r3
            r1.position = r2
            return r0
        L17:
            java.nio.BufferUnderflowException r0 = new java.nio.BufferUnderflowException
            r1 = r0
            r1.<init>()
            throw r0
    }

    protected final int nextPutIndex() {
            r5 = this;
            r0 = r5
            int r0 = r0.position
            r1 = r5
            int r1 = r1.limit
            if (r0 >= r1) goto L17
            r0 = r5
            r1 = r0
            int r1 = r1.position
            r2 = r1; r1 = r0; r0 = r2; 
            r3 = 1
            int r2 = r2 + r3
            r1.position = r2
            return r0
        L17:
            java.nio.BufferOverflowException r0 = new java.nio.BufferOverflowException
            r1 = r0
            r1.<init>()
            throw r0
    }
}
