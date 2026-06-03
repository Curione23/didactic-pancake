package org.lwjgl.system;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/Pointer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/Pointer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/Pointer.class */
public interface Pointer {
    public static final int POINTER_SIZE = 0;
    public static final int POINTER_SHIFT = 0;
    public static final int CLONG_SIZE = 0;
    public static final int CLONG_SHIFT = 0;
    public static final boolean BITS32 = false;
    public static final boolean BITS64 = false;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/Pointer$Default.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/Pointer$Default.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/Pointer$Default.class */
    public static abstract class Default implements org.lwjgl.system.Pointer {
        protected static final sun.misc.Unsafe UNSAFE = null;
        protected static final long ADDRESS = 0;
        protected static final long BUFFER_CONTAINER = 0;
        protected static final long BUFFER_MARK = 0;
        protected static final long BUFFER_POSITION = 0;
        protected static final long BUFFER_LIMIT = 0;
        protected static final long BUFFER_CAPACITY = 0;
        protected long address;

        protected Default(long r6) {
                r5 = this;
                r0 = r5
                r0.<init>()
                boolean r0 = org.lwjgl.system.Checks.CHECKS
                if (r0 == 0) goto L18
                r0 = r6
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto L18
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                r1 = r0
                r1.<init>()
                throw r0
            L18:
                r0 = r5
                r1 = r6
                r0.address = r1
                return
        }

        @Override // org.lwjgl.system.Pointer
        public long address() {
                r3 = this;
                r0 = r3
                long r0 = r0.address
                return r0
        }

        public boolean equals(@javax.annotation.Nullable java.lang.Object r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                if (r0 != r1) goto L7
                r0 = 1
                return r0
            L7:
                r0 = r6
                boolean r0 = r0 instanceof org.lwjgl.system.Pointer
                if (r0 != 0) goto L10
                r0 = 0
                return r0
            L10:
                r0 = r6
                org.lwjgl.system.Pointer r0 = (org.lwjgl.system.Pointer) r0
                r7 = r0
                r0 = r5
                long r0 = r0.address
                r1 = r7
                long r1 = r1.address()
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto L27
                r0 = 1
                goto L28
            L27:
                r0 = 0
            L28:
                return r0
        }

        public int hashCode() {
                r6 = this;
                r0 = r6
                long r0 = r0.address
                r1 = r6
                long r1 = r1.address
                r2 = 32
                long r1 = r1 >>> r2
                long r0 = r0 ^ r1
                int r0 = (int) r0
                return r0
        }

        public java.lang.String toString() {
                r7 = this;
                java.lang.String r0 = "%s pointer [0x%X]"
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = r1
                r3 = 0
                r4 = r7
                java.lang.Class r4 = r4.getClass()
                java.lang.String r4 = r4.getSimpleName()
                r2[r3] = r4
                r2 = r1
                r3 = 1
                r4 = r7
                long r4 = r4.address
                java.lang.Long r4 = java.lang.Long.valueOf(r4)
                r2[r3] = r4
                java.lang.String r0 = java.lang.String.format(r0, r1)
                return r0
        }

        static {
                sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
                org.lwjgl.system.Pointer.Default.UNSAFE = r0
                sun.misc.Unsafe r0 = org.lwjgl.system.Pointer.Default.UNSAFE     // Catch: java.lang.Throwable -> L69
                java.lang.Class<org.lwjgl.system.Pointer$Default> r1 = org.lwjgl.system.Pointer.Default.class
                java.lang.String r2 = "address"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L69
                long r0 = r0.objectFieldOffset(r1)     // Catch: java.lang.Throwable -> L69
                org.lwjgl.system.Pointer.Default.ADDRESS = r0     // Catch: java.lang.Throwable -> L69
                sun.misc.Unsafe r0 = org.lwjgl.system.Pointer.Default.UNSAFE     // Catch: java.lang.Throwable -> L69
                java.lang.Class<org.lwjgl.system.CustomBuffer> r1 = org.lwjgl.system.CustomBuffer.class
                java.lang.String r2 = "container"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L69
                long r0 = r0.objectFieldOffset(r1)     // Catch: java.lang.Throwable -> L69
                org.lwjgl.system.Pointer.Default.BUFFER_CONTAINER = r0     // Catch: java.lang.Throwable -> L69
                sun.misc.Unsafe r0 = org.lwjgl.system.Pointer.Default.UNSAFE     // Catch: java.lang.Throwable -> L69
                java.lang.Class<org.lwjgl.system.CustomBuffer> r1 = org.lwjgl.system.CustomBuffer.class
                java.lang.String r2 = "mark"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L69
                long r0 = r0.objectFieldOffset(r1)     // Catch: java.lang.Throwable -> L69
                org.lwjgl.system.Pointer.Default.BUFFER_MARK = r0     // Catch: java.lang.Throwable -> L69
                sun.misc.Unsafe r0 = org.lwjgl.system.Pointer.Default.UNSAFE     // Catch: java.lang.Throwable -> L69
                java.lang.Class<org.lwjgl.system.CustomBuffer> r1 = org.lwjgl.system.CustomBuffer.class
                java.lang.String r2 = "position"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L69
                long r0 = r0.objectFieldOffset(r1)     // Catch: java.lang.Throwable -> L69
                org.lwjgl.system.Pointer.Default.BUFFER_POSITION = r0     // Catch: java.lang.Throwable -> L69
                sun.misc.Unsafe r0 = org.lwjgl.system.Pointer.Default.UNSAFE     // Catch: java.lang.Throwable -> L69
                java.lang.Class<org.lwjgl.system.CustomBuffer> r1 = org.lwjgl.system.CustomBuffer.class
                java.lang.String r2 = "limit"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L69
                long r0 = r0.objectFieldOffset(r1)     // Catch: java.lang.Throwable -> L69
                org.lwjgl.system.Pointer.Default.BUFFER_LIMIT = r0     // Catch: java.lang.Throwable -> L69
                sun.misc.Unsafe r0 = org.lwjgl.system.Pointer.Default.UNSAFE     // Catch: java.lang.Throwable -> L69
                java.lang.Class<org.lwjgl.system.CustomBuffer> r1 = org.lwjgl.system.CustomBuffer.class
                java.lang.String r2 = "capacity"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L69
                long r0 = r0.objectFieldOffset(r1)     // Catch: java.lang.Throwable -> L69
                org.lwjgl.system.Pointer.Default.BUFFER_CAPACITY = r0     // Catch: java.lang.Throwable -> L69
                goto L73
            L69:
                r4 = move-exception
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r1 = r0
                r2 = r4
                r1.<init>(r2)
                throw r0
            L73:
                return
        }
    }

    long address();

    static {
            int r0 = org.lwjgl.system.MemoryAccessJNI.getPointerSize()
            org.lwjgl.system.Pointer.POINTER_SIZE = r0
            int r0 = org.lwjgl.system.Pointer.POINTER_SIZE
            r1 = 8
            if (r0 != r1) goto L12
            r0 = 3
            goto L13
        L12:
            r0 = 2
        L13:
            org.lwjgl.system.Pointer.POINTER_SHIFT = r0
            int r0 = org.lwjgl.system.Pointer.POINTER_SIZE
            r1 = 8
            if (r0 != r1) goto L2b
            org.lwjgl.system.Platform r0 = org.lwjgl.system.Platform.get()
            org.lwjgl.system.Platform r1 = org.lwjgl.system.Platform.WINDOWS
            if (r0 != r1) goto L2b
            r0 = 4
            goto L2e
        L2b:
            int r0 = org.lwjgl.system.Pointer.POINTER_SIZE
        L2e:
            org.lwjgl.system.Pointer.CLONG_SIZE = r0
            int r0 = org.lwjgl.system.Pointer.CLONG_SIZE
            r1 = 8
            if (r0 != r1) goto L3d
            r0 = 3
            goto L3e
        L3d:
            r0 = 2
        L3e:
            org.lwjgl.system.Pointer.CLONG_SHIFT = r0
            int r0 = org.lwjgl.system.Pointer.POINTER_SIZE
            r1 = 8
            int r0 = r0 * r1
            r1 = 32
            if (r0 != r1) goto L50
            r0 = 1
            goto L51
        L50:
            r0 = 0
        L51:
            org.lwjgl.system.Pointer.BITS32 = r0
            int r0 = org.lwjgl.system.Pointer.POINTER_SIZE
            r1 = 8
            int r0 = r0 * r1
            r1 = 64
            if (r0 != r1) goto L63
            r0 = 1
            goto L64
        L63:
            r0 = 0
        L64:
            org.lwjgl.system.Pointer.BITS64 = r0
            return
    }
}
