package org.lwjgl.system;

import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/StructBuffer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/StructBuffer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/StructBuffer.class */
public abstract class StructBuffer<T extends org.lwjgl.system.Struct<T>, SELF extends org.lwjgl.system.StructBuffer<T, SELF>> extends org.lwjgl.system.CustomBuffer<SELF> implements java.lang.Iterable<T> {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/StructBuffer$StructIterator.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/StructBuffer$StructIterator.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/StructBuffer$StructIterator.class */
    private static class StructIterator<T extends org.lwjgl.system.Struct<T>> implements java.util.Iterator<T> {
        private long address;

        @javax.annotation.Nullable
        private java.nio.ByteBuffer container;
        private T factory;
        private int index;
        private int fence;

        StructIterator(long r5, @javax.annotation.Nullable java.nio.ByteBuffer r7, T r8, int r9, int r10) {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                r1 = r5
                r0.address = r1
                r0 = r4
                r1 = r7
                r0.container = r1
                r0 = r4
                r1 = r8
                r0.factory = r1
                r0 = r4
                r1 = r9
                r0.index = r1
                r0 = r4
                r1 = r10
                r0.fence = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r3 = this;
                r0 = r3
                int r0 = r0.index
                r1 = r3
                int r1 = r1.fence
                if (r0 >= r1) goto Lf
                r0 = 1
                goto L10
            Lf:
                r0 = 0
            L10:
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r8 = this;
                boolean r0 = org.lwjgl.system.Checks.CHECKS
                if (r0 == 0) goto L19
                r0 = r8
                int r0 = r0.fence
                r1 = r8
                int r1 = r1.index
                if (r0 > r1) goto L19
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r1 = r0
                r1.<init>()
                throw r0
            L19:
                r0 = r8
                T extends org.lwjgl.system.Struct<T> r0 = r0.factory
                r1 = r8
                long r1 = r1.address
                r2 = r8
                r3 = r2
                int r3 = r3.index
                r4 = r3; r3 = r2; r2 = r4; 
                r5 = 1
                int r4 = r4 + r5
                r3.index = r4
                long r2 = java.lang.Integer.toUnsignedLong(r2)
                r3 = r8
                T extends org.lwjgl.system.Struct<T> r3 = r3.factory
                int r3 = r3.sizeof()
                long r3 = (long) r3
                long r2 = r2 * r3
                long r1 = r1 + r2
                r2 = r8
                java.nio.ByteBuffer r2 = r2.container
                org.lwjgl.system.Struct r0 = r0.create(r1, r2)
                return r0
        }

        @Override // java.util.Iterator
        public void forEachRemaining(java.util.function.Consumer<? super T> r10) {
                r9 = this;
                r0 = r10
                java.lang.Object r0 = java.util.Objects.requireNonNull(r0)
                r0 = r9
                int r0 = r0.index
                r11 = r0
                r0 = r9
                T extends org.lwjgl.system.Struct<T> r0 = r0.factory     // Catch: java.lang.Throwable -> L45
                int r0 = r0.sizeof()     // Catch: java.lang.Throwable -> L45
                r12 = r0
            L12:
                r0 = r11
                r1 = r9
                int r1 = r1.fence     // Catch: java.lang.Throwable -> L45
                if (r0 >= r1) goto L3d
                r0 = r10
                r1 = r9
                T extends org.lwjgl.system.Struct<T> r1 = r1.factory     // Catch: java.lang.Throwable -> L45
                r2 = r9
                long r2 = r2.address     // Catch: java.lang.Throwable -> L45
                r3 = r11
                long r3 = java.lang.Integer.toUnsignedLong(r3)     // Catch: java.lang.Throwable -> L45
                r4 = r12
                long r4 = (long) r4     // Catch: java.lang.Throwable -> L45
                long r3 = r3 * r4
                long r2 = r2 + r3
                r3 = r9
                java.nio.ByteBuffer r3 = r3.container     // Catch: java.lang.Throwable -> L45
                org.lwjgl.system.Struct r1 = r1.create(r2, r3)     // Catch: java.lang.Throwable -> L45
                r0.accept(r1)     // Catch: java.lang.Throwable -> L45
                int r11 = r11 + 1
                goto L12
            L3d:
                r0 = r9
                r1 = r11
                r0.index = r1
                goto L4f
            L45:
                r13 = move-exception
                r0 = r9
                r1 = r11
                r0.index = r1
                r0 = r13
                throw r0
            L4f:
                return
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.Struct r0 = r0.next()
                return r0
        }
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/StructBuffer$StructSpliterator.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/StructBuffer$StructSpliterator.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/StructBuffer$StructSpliterator.class */
    private static class StructSpliterator<T extends org.lwjgl.system.Struct<T>> implements java.util.Spliterator<T> {
        private long address;

        @javax.annotation.Nullable
        private java.nio.ByteBuffer container;
        private T factory;
        private int index;
        private int fence;

        StructSpliterator(long r5, @javax.annotation.Nullable java.nio.ByteBuffer r7, T r8, int r9, int r10) {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                r1 = r5
                r0.address = r1
                r0 = r4
                r1 = r7
                r0.container = r1
                r0 = r4
                r1 = r8
                r0.factory = r1
                r0 = r4
                r1 = r9
                r0.index = r1
                r0 = r4
                r1 = r10
                r0.fence = r1
                return
        }

        @Override // java.util.Spliterator
        public boolean tryAdvance(java.util.function.Consumer<? super T> r10) {
                r9 = this;
                r0 = r10
                java.lang.Object r0 = java.util.Objects.requireNonNull(r0)
                r0 = r9
                int r0 = r0.index
                r1 = r9
                int r1 = r1.fence
                if (r0 >= r1) goto L3f
                r0 = r10
                r1 = r9
                T extends org.lwjgl.system.Struct<T> r1 = r1.factory
                r2 = r9
                long r2 = r2.address
                r3 = r9
                r4 = r3
                int r4 = r4.index
                r5 = r4; r4 = r3; r3 = r5; 
                r6 = 1
                int r5 = r5 + r6
                r4.index = r5
                long r3 = java.lang.Integer.toUnsignedLong(r3)
                r4 = r9
                T extends org.lwjgl.system.Struct<T> r4 = r4.factory
                int r4 = r4.sizeof()
                long r4 = (long) r4
                long r3 = r3 * r4
                long r2 = r2 + r3
                r3 = r9
                java.nio.ByteBuffer r3 = r3.container
                org.lwjgl.system.Struct r1 = r1.create(r2, r3)
                r0.accept(r1)
                r0 = 1
                return r0
            L3f:
                r0 = 0
                return r0
        }

        @Override // java.util.Spliterator
        @javax.annotation.Nullable
        public java.util.Spliterator<T> trySplit() {
                r11 = this;
                r0 = r11
                int r0 = r0.index
                r12 = r0
                r0 = r12
                r1 = r11
                int r1 = r1.fence
                int r0 = r0 + r1
                r1 = 1
                int r0 = r0 >>> r1
                r13 = r0
                r0 = r12
                r1 = r13
                if (r0 >= r1) goto L30
                org.lwjgl.system.StructBuffer$StructSpliterator r0 = new org.lwjgl.system.StructBuffer$StructSpliterator
                r1 = r0
                r2 = r11
                long r2 = r2.address
                r3 = r11
                java.nio.ByteBuffer r3 = r3.container
                r4 = r11
                T extends org.lwjgl.system.Struct<T> r4 = r4.factory
                r5 = r12
                r6 = r11
                r7 = r13
                r8 = r7; r7 = r6; r6 = r8; 
                r7.index = r8
                r1.<init>(r2, r3, r4, r5, r6)
                goto L31
            L30:
                r0 = 0
            L31:
                return r0
        }

        @Override // java.util.Spliterator
        public long estimateSize() {
                r3 = this;
                r0 = r3
                int r0 = r0.fence
                r1 = r3
                int r1 = r1.index
                int r0 = r0 - r1
                long r0 = (long) r0
                return r0
        }

        @Override // java.util.Spliterator
        public int characteristics() {
                r2 = this;
                r0 = 17744(0x4550, float:2.4865E-41)
                return r0
        }

        @Override // java.util.Spliterator
        public void forEachRemaining(java.util.function.Consumer<? super T> r10) {
                r9 = this;
                r0 = r10
                java.lang.Object r0 = java.util.Objects.requireNonNull(r0)
                r0 = r9
                int r0 = r0.index
                r11 = r0
                r0 = r9
                T extends org.lwjgl.system.Struct<T> r0 = r0.factory     // Catch: java.lang.Throwable -> L45
                int r0 = r0.sizeof()     // Catch: java.lang.Throwable -> L45
                r12 = r0
            L12:
                r0 = r11
                r1 = r9
                int r1 = r1.fence     // Catch: java.lang.Throwable -> L45
                if (r0 >= r1) goto L3d
                r0 = r10
                r1 = r9
                T extends org.lwjgl.system.Struct<T> r1 = r1.factory     // Catch: java.lang.Throwable -> L45
                r2 = r9
                long r2 = r2.address     // Catch: java.lang.Throwable -> L45
                r3 = r11
                long r3 = java.lang.Integer.toUnsignedLong(r3)     // Catch: java.lang.Throwable -> L45
                r4 = r12
                long r4 = (long) r4     // Catch: java.lang.Throwable -> L45
                long r3 = r3 * r4
                long r2 = r2 + r3
                r3 = r9
                java.nio.ByteBuffer r3 = r3.container     // Catch: java.lang.Throwable -> L45
                org.lwjgl.system.Struct r1 = r1.create(r2, r3)     // Catch: java.lang.Throwable -> L45
                r0.accept(r1)     // Catch: java.lang.Throwable -> L45
                int r11 = r11 + 1
                goto L12
            L3d:
                r0 = r9
                r1 = r11
                r0.index = r1
                goto L4f
            L45:
                r13 = move-exception
                r0 = r9
                r1 = r11
                r0.index = r1
                r0 = r13
                throw r0
            L4f:
                return
        }

        @Override // java.util.Spliterator
        public java.util.Comparator<? super T> getComparator() {
                r3 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                r1.<init>()
                throw r0
        }
    }

    protected StructBuffer(java.nio.ByteBuffer r10, int r11) {
            r9 = this;
            r0 = r9
            r1 = r10
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r10
            r3 = -1
            r4 = 0
            r5 = r11
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    protected StructBuffer(long r10, @javax.annotation.Nullable java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
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

    @Override // org.lwjgl.system.CustomBuffer
    public int sizeof() {
            r2 = this;
            r0 = r2
            org.lwjgl.system.Struct r0 = r0.getElementFactory()
            int r0 = r0.sizeof()
            return r0
    }

    public T get() {
            r8 = this;
            r0 = r8
            org.lwjgl.system.Struct r0 = r0.getElementFactory()
            r9 = r0
            r0 = r9
            r1 = r8
            long r1 = r1.address
            r2 = r8
            int r2 = r2.nextGetIndex()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = r9
            int r3 = r3.sizeof()
            long r3 = (long) r3
            long r2 = r2 * r3
            long r1 = r1 + r2
            r2 = r8
            java.nio.ByteBuffer r2 = r2.container
            org.lwjgl.system.Struct r0 = r0.create(r1, r2)
            return r0
    }

    public SELF get(T r8) {
            r7 = this;
            r0 = r7
            org.lwjgl.system.Struct r0 = r0.getElementFactory()
            int r0 = r0.sizeof()
            r9 = r0
            r0 = r7
            long r0 = r0.address
            r1 = r7
            int r1 = r1.nextGetIndex()
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = r9
            long r2 = (long) r2
            long r1 = r1 * r2
            long r0 = r0 + r1
            r1 = r8
            long r1 = r1.address()
            r2 = r9
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            org.lwjgl.system.CustomBuffer r0 = r0.self()
            org.lwjgl.system.StructBuffer r0 = (org.lwjgl.system.StructBuffer) r0
            return r0
    }

    public SELF put(T r10) {
            r9 = this;
            r0 = r9
            org.lwjgl.system.Struct r0 = r0.getElementFactory()
            int r0 = r0.sizeof()
            r11 = r0
            r0 = r10
            long r0 = r0.address()
            r1 = r9
            long r1 = r1.address
            r2 = r9
            int r2 = r2.nextPutIndex()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = r11
            long r3 = (long) r3
            long r2 = r2 * r3
            long r1 = r1 + r2
            r2 = r11
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r9
            org.lwjgl.system.CustomBuffer r0 = r0.self()
            org.lwjgl.system.StructBuffer r0 = (org.lwjgl.system.StructBuffer) r0
            return r0
    }

    public T get(int r9) {
            r8 = this;
            r0 = r8
            org.lwjgl.system.Struct r0 = r0.getElementFactory()
            r10 = r0
            r0 = r10
            r1 = r8
            long r1 = r1.address
            r2 = r9
            r3 = r8
            int r3 = r3.limit
            int r2 = check(r2, r3)
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = r10
            int r3 = r3.sizeof()
            long r3 = (long) r3
            long r2 = r2 * r3
            long r1 = r1 + r2
            r2 = r8
            java.nio.ByteBuffer r2 = r2.container
            org.lwjgl.system.Struct r0 = r0.create(r1, r2)
            return r0
    }

    public SELF get(int r8, T r9) {
            r7 = this;
            r0 = r7
            org.lwjgl.system.Struct r0 = r0.getElementFactory()
            int r0 = r0.sizeof()
            r10 = r0
            r0 = r7
            long r0 = r0.address
            r1 = r8
            r2 = r7
            int r2 = r2.limit
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = r10
            long r2 = (long) r2
            long r1 = r1 * r2
            long r0 = r0 + r1
            r1 = r9
            long r1 = r1.address()
            r2 = r10
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            org.lwjgl.system.CustomBuffer r0 = r0.self()
            org.lwjgl.system.StructBuffer r0 = (org.lwjgl.system.StructBuffer) r0
            return r0
    }

    public SELF put(int r10, T r11) {
            r9 = this;
            r0 = r9
            org.lwjgl.system.Struct r0 = r0.getElementFactory()
            int r0 = r0.sizeof()
            r12 = r0
            r0 = r11
            long r0 = r0.address()
            r1 = r9
            long r1 = r1.address
            r2 = r10
            r3 = r9
            int r3 = r3.limit
            long r2 = org.lwjgl.system.Checks.check(r2, r3)
            r3 = r12
            long r3 = (long) r3
            long r2 = r2 * r3
            long r1 = r1 + r2
            r2 = r12
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r9
            org.lwjgl.system.CustomBuffer r0 = r0.self()
            org.lwjgl.system.StructBuffer r0 = (org.lwjgl.system.StructBuffer) r0
            return r0
    }

    public SELF apply(java.util.function.Consumer<T> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.system.Struct r1 = r1.get()
            r0.accept(r1)
            r0 = r3
            org.lwjgl.system.CustomBuffer r0 = r0.self()
            org.lwjgl.system.StructBuffer r0 = (org.lwjgl.system.StructBuffer) r0
            return r0
    }

    public SELF apply(int r5, java.util.function.Consumer<T> r6) {
            r4 = this;
            r0 = r6
            r1 = r4
            r2 = r5
            org.lwjgl.system.Struct r1 = r1.get(r2)
            r0.accept(r1)
            r0 = r4
            org.lwjgl.system.CustomBuffer r0 = r0.self()
            org.lwjgl.system.StructBuffer r0 = (org.lwjgl.system.StructBuffer) r0
            return r0
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<T> iterator() {
            r9 = this;
            org.lwjgl.system.StructBuffer$StructIterator r0 = new org.lwjgl.system.StructBuffer$StructIterator
            r1 = r0
            r2 = r9
            long r2 = r2.address
            r3 = r9
            java.nio.ByteBuffer r3 = r3.container
            r4 = r9
            org.lwjgl.system.Struct r4 = r4.getElementFactory()
            r5 = r9
            int r5 = r5.position
            r6 = r9
            int r6 = r6.limit
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
    }

    @Override // java.lang.Iterable
    public void forEach(java.util.function.Consumer<? super T> r10) {
            r9 = this;
            r0 = r10
            java.lang.Object r0 = java.util.Objects.requireNonNull(r0)
            r0 = r9
            org.lwjgl.system.Struct r0 = r0.getElementFactory()
            r11 = r0
            r0 = r9
            int r0 = r0.position
            r12 = r0
            r0 = r9
            int r0 = r0.limit
            r13 = r0
            r0 = r11
            int r0 = r0.sizeof()
            r14 = r0
        L1b:
            r0 = r12
            r1 = r13
            if (r0 >= r1) goto L44
            r0 = r10
            r1 = r11
            r2 = r9
            long r2 = r2.address
            r3 = r12
            long r3 = java.lang.Integer.toUnsignedLong(r3)
            r4 = r9
            int r4 = r4.sizeof()
            long r4 = (long) r4
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r9
            java.nio.ByteBuffer r3 = r3.container
            org.lwjgl.system.Struct r1 = r1.create(r2, r3)
            r0.accept(r1)
            int r12 = r12 + 1
            goto L1b
        L44:
            return
    }

    @Override // java.lang.Iterable
    public java.util.Spliterator<T> spliterator() {
            r9 = this;
            org.lwjgl.system.StructBuffer$StructSpliterator r0 = new org.lwjgl.system.StructBuffer$StructSpliterator
            r1 = r0
            r2 = r9
            long r2 = r2.address
            r3 = r9
            java.nio.ByteBuffer r3 = r3.container
            r4 = r9
            org.lwjgl.system.Struct r4 = r4.getElementFactory()
            r5 = r9
            int r5 = r5.position
            r6 = r9
            int r6 = r6.limit
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
    }

    public java.util.stream.Stream<T> stream() {
            r3 = this;
            r0 = r3
            java.util.Spliterator r0 = r0.spliterator()
            r1 = 0
            java.util.stream.Stream r0 = java.util.stream.StreamSupport.stream(r0, r1)
            return r0
    }

    public java.util.stream.Stream<T> parallelStream() {
            r3 = this;
            r0 = r3
            java.util.Spliterator r0 = r0.spliterator()
            r1 = 1
            java.util.stream.Stream r0 = java.util.stream.StreamSupport.stream(r0, r1)
            return r0
    }

    protected abstract T getElementFactory();

    private static int check(int r3, int r4) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r3
            if (r0 < 0) goto Lf
            r0 = r4
            r1 = r3
            if (r0 > r1) goto L17
        Lf:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r1 = r0
            r1.<init>()
            throw r0
        L17:
            r0 = r3
            return r0
    }
}
