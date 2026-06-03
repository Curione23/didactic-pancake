package org.lwjgl.system;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/Callback.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/Callback.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/Callback.class */
public abstract class Callback implements org.lwjgl.system.Pointer, org.lwjgl.system.NativeResource {
    private static final boolean DEBUG_ALLOCATOR = false;
    private static final org.lwjgl.system.Callback.ClosureRegistry CLOSURE_REGISTRY = null;
    private static final long CALLBACK_HANDLER = 0;
    private long address;



    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/Callback$ClosureRegistry.class */
    private interface ClosureRegistry {
        void put(long r1, org.lwjgl.system.libffi.FFIClosure r3);

        org.lwjgl.system.libffi.FFIClosure get(long r1);

        org.lwjgl.system.libffi.FFIClosure remove(long r1);
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/Callback$Descriptor.class */
    public static final class Descriptor {
        final java.lang.invoke.MethodHandles.Lookup lookup;
        final org.lwjgl.system.libffi.FFICIF cif;

        public Descriptor(java.lang.invoke.MethodHandles.Lookup r4, org.lwjgl.system.libffi.FFICIF r5) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.lookup = r1
                r0 = r3
                r1 = r5
                r0.cif = r1
                return
        }
    }

    protected Callback(org.lwjgl.system.libffi.FFICIF r5) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = r5
            r2 = r4
            long r1 = create(r1, r2)
            r0.address = r1
            return
    }

    protected Callback(long r5) {
            r4 = this;
            r0 = r4
            r0.<init>()
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r4
            r1 = r5
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

    @Override // org.lwjgl.system.NativeResource
    public void free() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            free(r0)
            return
    }

    private static native long getCallbackHandler(java.lang.reflect.Method r0);

    static long create(org.lwjgl.system.libffi.FFICIF r9, java.lang.Object r10) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackPush()
            r14 = r0
            r0 = 0
            r15 = r0
            r0 = r14
            r1 = 1
            org.lwjgl.PointerBuffer r0 = r0.mallocPointer(r1)     // Catch: java.lang.Throwable -> L62 java.lang.Throwable -> L6b
            r16 = r0
            int r0 = org.lwjgl.system.libffi.FFIClosure.SIZEOF     // Catch: java.lang.Throwable -> L62 java.lang.Throwable -> L6b
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L62 java.lang.Throwable -> L6b
            r1 = r16
            org.lwjgl.system.libffi.FFIClosure r0 = org.lwjgl.system.libffi.LibFFI.ffi_closure_alloc(r0, r1)     // Catch: java.lang.Throwable -> L62 java.lang.Throwable -> L6b
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L26
            java.lang.OutOfMemoryError r0 = new java.lang.OutOfMemoryError     // Catch: java.lang.Throwable -> L62 java.lang.Throwable -> L6b
            r1 = r0
            r1.<init>()     // Catch: java.lang.Throwable -> L62 java.lang.Throwable -> L6b
            throw r0     // Catch: java.lang.Throwable -> L62 java.lang.Throwable -> L6b
        L26:
            r0 = r16
            r1 = 0
            long r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L62 java.lang.Throwable -> L6b
            r12 = r0
            boolean r0 = org.lwjgl.system.Callback.DEBUG_ALLOCATOR     // Catch: java.lang.Throwable -> L62 java.lang.Throwable -> L6b
            if (r0 == 0) goto L3c
            r0 = r12
            int r1 = org.lwjgl.system.libffi.FFIClosure.SIZEOF     // Catch: java.lang.Throwable -> L62 java.lang.Throwable -> L6b
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L62 java.lang.Throwable -> L6b
            long r0 = org.lwjgl.system.MemoryManage.DebugAllocator.track(r0, r1)     // Catch: java.lang.Throwable -> L62 java.lang.Throwable -> L6b
        L3c:
            r0 = r14
            if (r0 == 0) goto L93
            r0 = r15
            if (r0 == 0) goto L5a
            r0 = r14
            r0.close()     // Catch: java.lang.Throwable -> L4e
            goto L93
        L4e:
            r16 = move-exception
            r0 = r15
            r1 = r16
            r0.addSuppressed(r1)
            goto L93
        L5a:
            r0 = r14
            r0.close()
            goto L93
        L62:
            r16 = move-exception
            r0 = r16
            r15 = r0
            r0 = r16
            throw r0     // Catch: java.lang.Throwable -> L6b
        L6b:
            r17 = move-exception
            r0 = r14
            if (r0 == 0) goto L90
            r0 = r15
            if (r0 == 0) goto L8b
            r0 = r14
            r0.close()     // Catch: java.lang.Throwable -> L7f
            goto L90
        L7f:
            r18 = move-exception
            r0 = r15
            r1 = r18
            r0.addSuppressed(r1)
            goto L90
        L8b:
            r0 = r14
            r0.close()
        L90:
            r0 = r17
            throw r0
        L93:
            r0 = r10
            long r0 = org.lwjgl.system.jni.JNINativeInterface.NewGlobalRef(r0)
            r14 = r0
            r0 = r11
            r1 = r9
            long r2 = org.lwjgl.system.Callback.CALLBACK_HANDLER
            r3 = r14
            r4 = r12
            int r0 = org.lwjgl.system.libffi.LibFFI.ffi_prep_closure_loc(r0, r1, r2, r3, r4)
            r16 = r0
            r0 = r16
            if (r0 == 0) goto Lbe
            r0 = r14
            org.lwjgl.system.jni.JNINativeInterface.DeleteGlobalRef(r0)
            r0 = r11
            org.lwjgl.system.libffi.LibFFI.ffi_closure_free(r0)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "Failed to prepare the libffi closure"
            r1.<init>(r2)
            throw r0
        Lbe:
            org.lwjgl.system.Callback$ClosureRegistry r0 = org.lwjgl.system.Callback.CLOSURE_REGISTRY
            r1 = r12
            r2 = r11
            r0.put(r1, r2)
            r0 = r12
            return r0
    }

    public static <T extends org.lwjgl.system.CallbackI> T get(long r4) {
            org.lwjgl.system.Callback$ClosureRegistry r0 = org.lwjgl.system.Callback.CLOSURE_REGISTRY
            r1 = r4
            org.lwjgl.system.libffi.FFIClosure r0 = r0.get(r1)
            long r0 = r0.user_data()
            java.lang.Object r0 = org.lwjgl.system.MemoryUtil.memGlobalRefToObject(r0)
            org.lwjgl.system.CallbackI r0 = (org.lwjgl.system.CallbackI) r0
            return r0
    }

    @javax.annotation.Nullable
    public static <T extends org.lwjgl.system.CallbackI> T getSafe(long r5) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto Le
        La:
            r0 = r5
            org.lwjgl.system.CallbackI r0 = get(r0)
        Le:
            return r0
    }

    public static void free(long r4) {
            boolean r0 = org.lwjgl.system.Callback.DEBUG_ALLOCATOR
            if (r0 == 0) goto Lb
            r0 = r4
            long r0 = org.lwjgl.system.MemoryManage.DebugAllocator.untrack(r0)
        Lb:
            org.lwjgl.system.Callback$ClosureRegistry r0 = org.lwjgl.system.Callback.CLOSURE_REGISTRY
            r1 = r4
            org.lwjgl.system.libffi.FFIClosure r0 = r0.get(r1)
            r6 = r0
            r0 = r6
            long r0 = r0.user_data()
            org.lwjgl.system.jni.JNINativeInterface.DeleteGlobalRef(r0)
            r0 = r6
            org.lwjgl.system.libffi.LibFFI.ffi_closure_free(r0)
            return
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
            boolean r0 = r0 instanceof org.lwjgl.system.Callback
            if (r0 != 0) goto L10
            r0 = 0
            return r0
        L10:
            r0 = r6
            org.lwjgl.system.Callback r0 = (org.lwjgl.system.Callback) r0
            r7 = r0
            r0 = r5
            long r0 = r0.address
            r1 = r7
            long r1 = r1.address()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L25
            r0 = 1
            goto L26
        L25:
            r0 = 0
        L26:
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
            org.lwjgl.system.Configuration<java.lang.Boolean> r0 = org.lwjgl.system.Configuration.DEBUG_MEMORY_ALLOCATOR
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            org.lwjgl.system.Callback.DEBUG_ALLOCATOR = r0
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackPush()
            r7 = r0
            r0 = 0
            r8 = r0
            r0 = r7
            r1 = 1
            org.lwjgl.PointerBuffer r0 = r0.mallocPointer(r1)     // Catch: java.lang.Throwable -> L85 java.lang.Throwable -> L8a
            r9 = r0
            int r0 = org.lwjgl.system.libffi.FFIClosure.SIZEOF     // Catch: java.lang.Throwable -> L85 java.lang.Throwable -> L8a
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L85 java.lang.Throwable -> L8a
            r1 = r9
            org.lwjgl.system.libffi.FFIClosure r0 = org.lwjgl.system.libffi.LibFFI.ffi_closure_alloc(r0, r1)     // Catch: java.lang.Throwable -> L85 java.lang.Throwable -> L8a
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L34
            java.lang.OutOfMemoryError r0 = new java.lang.OutOfMemoryError     // Catch: java.lang.Throwable -> L85 java.lang.Throwable -> L8a
            r1 = r0
            r1.<init>()     // Catch: java.lang.Throwable -> L85 java.lang.Throwable -> L8a
            throw r0     // Catch: java.lang.Throwable -> L85 java.lang.Throwable -> L8a
        L34:
            r0 = r9
            r1 = 0
            long r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L85 java.lang.Throwable -> L8a
            r1 = r10
            long r1 = r1.address()     // Catch: java.lang.Throwable -> L85 java.lang.Throwable -> L8a
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L53
            java.lang.String r0 = "Closure Registry: simple"
            org.lwjgl.system.APIUtil.apiLog(r0)     // Catch: java.lang.Throwable -> L85 java.lang.Throwable -> L8a
            org.lwjgl.system.Callback$1 r0 = new org.lwjgl.system.Callback$1     // Catch: java.lang.Throwable -> L85 java.lang.Throwable -> L8a
            r1 = r0
            r1.<init>()     // Catch: java.lang.Throwable -> L85 java.lang.Throwable -> L8a
            org.lwjgl.system.Callback.CLOSURE_REGISTRY = r0     // Catch: java.lang.Throwable -> L85 java.lang.Throwable -> L8a
            goto L62
        L53:
            java.lang.String r0 = "Closure Registry: ConcurrentHashMap"
            org.lwjgl.system.APIUtil.apiLog(r0)     // Catch: java.lang.Throwable -> L85 java.lang.Throwable -> L8a
            org.lwjgl.system.Callback$2 r0 = new org.lwjgl.system.Callback$2     // Catch: java.lang.Throwable -> L85 java.lang.Throwable -> L8a
            r1 = r0
            r1.<init>()     // Catch: java.lang.Throwable -> L85 java.lang.Throwable -> L8a
            org.lwjgl.system.Callback.CLOSURE_REGISTRY = r0     // Catch: java.lang.Throwable -> L85 java.lang.Throwable -> L8a
        L62:
            r0 = r10
            org.lwjgl.system.libffi.LibFFI.ffi_closure_free(r0)     // Catch: java.lang.Throwable -> L85 java.lang.Throwable -> L8a
            r0 = r7
            if (r0 == 0) goto Lad
            r0 = r8
            if (r0 == 0) goto L7e
            r0 = r7
            r0.close()     // Catch: java.lang.Throwable -> L75
            goto Lad
        L75:
            r9 = move-exception
            r0 = r8
            r1 = r9
            r0.addSuppressed(r1)
            goto Lad
        L7e:
            r0 = r7
            r0.close()
            goto Lad
        L85:
            r9 = move-exception
            r0 = r9
            r8 = r0
            r0 = r9
            throw r0     // Catch: java.lang.Throwable -> L8a
        L8a:
            r11 = move-exception
            r0 = r7
            if (r0 == 0) goto Laa
            r0 = r8
            if (r0 == 0) goto La6
            r0 = r7
            r0.close()     // Catch: java.lang.Throwable -> L9b
            goto Laa
        L9b:
            r12 = move-exception
            r0 = r8
            r1 = r12
            r0.addSuppressed(r1)
            goto Laa
        La6:
            r0 = r7
            r0.close()
        Laa:
            r0 = r11
            throw r0
        Lad:
            java.lang.Class<org.lwjgl.system.CallbackI> r0 = org.lwjgl.system.CallbackI.class
            java.lang.String r1 = "callback"
            r2 = 2
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> Lcd
            r3 = r2
            r4 = 0
            java.lang.Class r5 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> Lcd
            r3[r4] = r5     // Catch: java.lang.Exception -> Lcd
            r3 = r2
            r4 = 1
            java.lang.Class r5 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> Lcd
            r3[r4] = r5     // Catch: java.lang.Exception -> Lcd
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Exception -> Lcd
            long r0 = getCallbackHandler(r0)     // Catch: java.lang.Exception -> Lcd
            org.lwjgl.system.Callback.CALLBACK_HANDLER = r0     // Catch: java.lang.Exception -> Lcd
            goto Ld9
        Lcd:
            r7 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Failed to initialize the native callback handler."
            r3 = r7
            r1.<init>(r2, r3)
            throw r0
        Ld9:
            org.lwjgl.system.MemoryUtil$MemoryAllocator r0 = org.lwjgl.system.MemoryUtil.getAllocator()
            return
    }
}
