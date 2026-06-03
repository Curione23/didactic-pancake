package org.lwjgl.system;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/Upcalls.class */
final class Upcalls {
    private static final boolean DEBUG_ALLOCATOR = false;
    private static final int CLOSURE_SIZE = 0;
    private static final org.lwjgl.system.Upcalls.ClosureRegistry CLOSURE_REGISTRY = null;
    private static final long CALLBACK_HANDLER = 0;



    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/Upcalls$ClosureRegistry.class */
    private interface ClosureRegistry {
        void put(long r1, org.lwjgl.system.libffi.FFIClosure r3);

        org.lwjgl.system.libffi.FFIClosure get(long r1);

        org.lwjgl.system.libffi.FFIClosure remove(long r1);
    }

    private Upcalls() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    private static native long getCallbackHandler(java.lang.reflect.Method r0);

    static long upcallCreate(org.lwjgl.system.Callback.Descriptor r9, java.lang.Object r10) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackPush()
            r14 = r0
            r0 = 0
            r15 = r0
            r0 = r14
            r1 = 1
            org.lwjgl.PointerBuffer r0 = r0.mallocPointer(r1)     // Catch: java.lang.Throwable -> L62 java.lang.Throwable -> L6b
            r16 = r0
            int r0 = org.lwjgl.system.Upcalls.CLOSURE_SIZE     // Catch: java.lang.Throwable -> L62 java.lang.Throwable -> L6b
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
            boolean r0 = org.lwjgl.system.Upcalls.DEBUG_ALLOCATOR     // Catch: java.lang.Throwable -> L62 java.lang.Throwable -> L6b
            if (r0 == 0) goto L3c
            r0 = r12
            int r1 = org.lwjgl.system.Upcalls.CLOSURE_SIZE     // Catch: java.lang.Throwable -> L62 java.lang.Throwable -> L6b
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
            org.lwjgl.system.libffi.FFICIF r1 = r1.cif
            long r2 = org.lwjgl.system.Upcalls.CALLBACK_HANDLER
            r3 = r14
            r4 = r12
            int r0 = org.lwjgl.system.libffi.LibFFI.ffi_prep_closure_loc(r0, r1, r2, r3, r4)
            r16 = r0
            r0 = r16
            if (r0 == 0) goto Lc1
            r0 = r14
            org.lwjgl.system.jni.JNINativeInterface.DeleteGlobalRef(r0)
            r0 = r11
            org.lwjgl.system.libffi.LibFFI.ffi_closure_free(r0)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "Failed to prepare the libffi closure"
            r1.<init>(r2)
            throw r0
        Lc1:
            org.lwjgl.system.Upcalls$ClosureRegistry r0 = org.lwjgl.system.Upcalls.CLOSURE_REGISTRY
            r1 = r12
            r2 = r11
            r0.put(r1, r2)
            r0 = r12
            return r0
    }

    static <T extends org.lwjgl.system.CallbackI> T upcallGet(long r4) {
            org.lwjgl.system.Upcalls$ClosureRegistry r0 = org.lwjgl.system.Upcalls.CLOSURE_REGISTRY
            r1 = r4
            org.lwjgl.system.libffi.FFIClosure r0 = r0.get(r1)
            long r0 = r0.user_data()
            java.lang.Object r0 = org.lwjgl.system.MemoryUtil.memGlobalRefToObject(r0)
            org.lwjgl.system.CallbackI r0 = (org.lwjgl.system.CallbackI) r0
            return r0
    }

    static void upcallFree(long r4) {
            boolean r0 = org.lwjgl.system.Upcalls.DEBUG_ALLOCATOR
            if (r0 == 0) goto Lb
            r0 = r4
            long r0 = org.lwjgl.system.MemoryManage.DebugAllocator.untrack(r0)
        Lb:
            org.lwjgl.system.Upcalls$ClosureRegistry r0 = org.lwjgl.system.Upcalls.CLOSURE_REGISTRY
            r1 = r4
            org.lwjgl.system.libffi.FFIClosure r0 = r0.remove(r1)
            r6 = r0
            r0 = r6
            long r0 = r0.user_data()
            org.lwjgl.system.jni.JNINativeInterface.DeleteGlobalRef(r0)
            r0 = r6
            org.lwjgl.system.libffi.LibFFI.ffi_closure_free(r0)
            return
    }

    static {
            org.lwjgl.system.Configuration<java.lang.Boolean> r0 = org.lwjgl.system.Configuration.DEBUG_MEMORY_ALLOCATOR
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            org.lwjgl.system.Upcalls.DEBUG_ALLOCATOR = r0
            long r0 = org.lwjgl.system.libffi.LibFFI.ffi_get_closure_size()
            int r0 = (int) r0
            org.lwjgl.system.Upcalls.CLOSURE_SIZE = r0
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackPush()
            r7 = r0
            r0 = 0
            r8 = r0
            r0 = r7
            r1 = 1
            org.lwjgl.PointerBuffer r0 = r0.mallocPointer(r1)     // Catch: java.lang.Throwable -> L8c java.lang.Throwable -> L91
            r9 = r0
            int r0 = org.lwjgl.system.Upcalls.CLOSURE_SIZE     // Catch: java.lang.Throwable -> L8c java.lang.Throwable -> L91
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L8c java.lang.Throwable -> L91
            r1 = r9
            org.lwjgl.system.libffi.FFIClosure r0 = org.lwjgl.system.libffi.LibFFI.ffi_closure_alloc(r0, r1)     // Catch: java.lang.Throwable -> L8c java.lang.Throwable -> L91
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L3b
            java.lang.OutOfMemoryError r0 = new java.lang.OutOfMemoryError     // Catch: java.lang.Throwable -> L8c java.lang.Throwable -> L91
            r1 = r0
            r1.<init>()     // Catch: java.lang.Throwable -> L8c java.lang.Throwable -> L91
            throw r0     // Catch: java.lang.Throwable -> L8c java.lang.Throwable -> L91
        L3b:
            r0 = r9
            r1 = 0
            long r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L8c java.lang.Throwable -> L91
            r1 = r10
            long r1 = r1.address()     // Catch: java.lang.Throwable -> L8c java.lang.Throwable -> L91
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L5a
            java.lang.String r0 = "Closure Registry: simple"
            org.lwjgl.system.APIUtil.apiLog(r0)     // Catch: java.lang.Throwable -> L8c java.lang.Throwable -> L91
            org.lwjgl.system.Upcalls$1 r0 = new org.lwjgl.system.Upcalls$1     // Catch: java.lang.Throwable -> L8c java.lang.Throwable -> L91
            r1 = r0
            r1.<init>()     // Catch: java.lang.Throwable -> L8c java.lang.Throwable -> L91
            org.lwjgl.system.Upcalls.CLOSURE_REGISTRY = r0     // Catch: java.lang.Throwable -> L8c java.lang.Throwable -> L91
            goto L69
        L5a:
            java.lang.String r0 = "Closure Registry: ConcurrentHashMap"
            org.lwjgl.system.APIUtil.apiLog(r0)     // Catch: java.lang.Throwable -> L8c java.lang.Throwable -> L91
            org.lwjgl.system.Upcalls$2 r0 = new org.lwjgl.system.Upcalls$2     // Catch: java.lang.Throwable -> L8c java.lang.Throwable -> L91
            r1 = r0
            r1.<init>()     // Catch: java.lang.Throwable -> L8c java.lang.Throwable -> L91
            org.lwjgl.system.Upcalls.CLOSURE_REGISTRY = r0     // Catch: java.lang.Throwable -> L8c java.lang.Throwable -> L91
        L69:
            r0 = r10
            org.lwjgl.system.libffi.LibFFI.ffi_closure_free(r0)     // Catch: java.lang.Throwable -> L8c java.lang.Throwable -> L91
            r0 = r7
            if (r0 == 0) goto Lb4
            r0 = r8
            if (r0 == 0) goto L85
            r0 = r7
            r0.close()     // Catch: java.lang.Throwable -> L7c
            goto Lb4
        L7c:
            r9 = move-exception
            r0 = r8
            r1 = r9
            r0.addSuppressed(r1)
            goto Lb4
        L85:
            r0 = r7
            r0.close()
            goto Lb4
        L8c:
            r9 = move-exception
            r0 = r9
            r8 = r0
            r0 = r9
            throw r0     // Catch: java.lang.Throwable -> L91
        L91:
            r11 = move-exception
            r0 = r7
            if (r0 == 0) goto Lb1
            r0 = r8
            if (r0 == 0) goto Lad
            r0 = r7
            r0.close()     // Catch: java.lang.Throwable -> La2
            goto Lb1
        La2:
            r12 = move-exception
            r0 = r8
            r1 = r12
            r0.addSuppressed(r1)
            goto Lb1
        Lad:
            r0 = r7
            r0.close()
        Lb1:
            r0 = r11
            throw r0
        Lb4:
            java.lang.Class<org.lwjgl.system.CallbackI> r0 = org.lwjgl.system.CallbackI.class
            java.lang.String r1 = "callback"
            r2 = 2
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> Ld4
            r3 = r2
            r4 = 0
            java.lang.Class r5 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> Ld4
            r3[r4] = r5     // Catch: java.lang.Exception -> Ld4
            r3 = r2
            r4 = 1
            java.lang.Class r5 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> Ld4
            r3[r4] = r5     // Catch: java.lang.Exception -> Ld4
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Exception -> Ld4
            long r0 = getCallbackHandler(r0)     // Catch: java.lang.Exception -> Ld4
            org.lwjgl.system.Upcalls.CALLBACK_HANDLER = r0     // Catch: java.lang.Exception -> Ld4
            goto Le0
        Ld4:
            r7 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Failed to initialize the native callback handler."
            r3 = r7
            r1.<init>(r2, r3)
            throw r0
        Le0:
            org.lwjgl.system.MemoryUtil$MemoryAllocator r0 = org.lwjgl.system.MemoryUtil.getAllocator()
            return
    }
}
