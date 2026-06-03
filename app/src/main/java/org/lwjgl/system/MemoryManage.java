package org.lwjgl.system;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryManage.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryManage.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryManage.class */
final class MemoryManage {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryManage$1.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryManage$1.class
     */
    /* JADX INFO: renamed from: org.lwjgl.system.MemoryManage$1, reason: invalid class name */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryManage$1.class */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$lwjgl$system$MemoryUtil$MemoryAllocationReport$Aggregate = null;

        static {
                org.lwjgl.system.MemoryUtil$MemoryAllocationReport$Aggregate[] r0 = org.lwjgl.system.MemoryUtil.MemoryAllocationReport.Aggregate.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.lwjgl.system.MemoryManage.AnonymousClass1.$SwitchMap$org$lwjgl$system$MemoryUtil$MemoryAllocationReport$Aggregate = r0
                int[] r0 = org.lwjgl.system.MemoryManage.AnonymousClass1.$SwitchMap$org$lwjgl$system$MemoryUtil$MemoryAllocationReport$Aggregate     // Catch: java.lang.NoSuchFieldError -> L17
                org.lwjgl.system.MemoryUtil$MemoryAllocationReport$Aggregate r1 = org.lwjgl.system.MemoryUtil.MemoryAllocationReport.Aggregate.ALL     // Catch: java.lang.NoSuchFieldError -> L17
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L17
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L17
                goto L18
            L17:
                r4 = move-exception
            L18:
                int[] r0 = org.lwjgl.system.MemoryManage.AnonymousClass1.$SwitchMap$org$lwjgl$system$MemoryUtil$MemoryAllocationReport$Aggregate     // Catch: java.lang.NoSuchFieldError -> L26
                org.lwjgl.system.MemoryUtil$MemoryAllocationReport$Aggregate r1 = org.lwjgl.system.MemoryUtil.MemoryAllocationReport.Aggregate.GROUP_BY_METHOD     // Catch: java.lang.NoSuchFieldError -> L26
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L26
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L26
                goto L27
            L26:
                r4 = move-exception
            L27:
                int[] r0 = org.lwjgl.system.MemoryManage.AnonymousClass1.$SwitchMap$org$lwjgl$system$MemoryUtil$MemoryAllocationReport$Aggregate     // Catch: java.lang.NoSuchFieldError -> L35
                org.lwjgl.system.MemoryUtil$MemoryAllocationReport$Aggregate r1 = org.lwjgl.system.MemoryUtil.MemoryAllocationReport.Aggregate.GROUP_BY_STACKTRACE     // Catch: java.lang.NoSuchFieldError -> L35
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L35
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L35
                goto L36
            L35:
                r4 = move-exception
            L36:
                return
        }
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryManage$DebugAllocator.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryManage$DebugAllocator.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryManage$DebugAllocator.class */
    static class DebugAllocator implements org.lwjgl.system.MemoryUtil.MemoryAllocator {
        private static final java.util.concurrent.ConcurrentMap<org.lwjgl.system.MemoryManage.DebugAllocator.Allocation, org.lwjgl.system.MemoryManage.DebugAllocator.Allocation> ALLOCATIONS = null;
        private static final java.util.concurrent.ConcurrentMap<java.lang.Long, java.lang.String> THREADS = null;
        private final org.lwjgl.system.MemoryUtil.MemoryAllocator allocator;
        private final long[] callbacks;







        /* JADX WARN: Classes with same name are omitted, all sources:
          DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryManage$DebugAllocator$Allocation.class
          DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryManage$DebugAllocator$Allocation.class
         */
        /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryManage$DebugAllocator$Allocation.class */
        private static class Allocation {
            final long address;
            final long size;
            final long threadId;

            @javax.annotation.Nullable
            private final java.lang.Object[] stacktrace;

            Allocation(long r5, long r7, long r9, @javax.annotation.Nullable java.lang.Object[] r11) {
                    r4 = this;
                    r0 = r4
                    r0.<init>()
                    r0 = r4
                    r1 = r5
                    r0.address = r1
                    r0 = r4
                    r1 = r7
                    r0.size = r1
                    r0 = r4
                    r1 = r9
                    r0.threadId = r1
                    r0 = r4
                    r1 = r11
                    r0.stacktrace = r1
                    return
            }

            @javax.annotation.Nullable
            private java.lang.StackTraceElement[] getElements() {
                    r2 = this;
                    r0 = r2
                    java.lang.Object[] r0 = r0.stacktrace
                    if (r0 != 0) goto Lb
                    r0 = 0
                    goto L12
                Lb:
                    r0 = r2
                    java.lang.Object[] r0 = r0.stacktrace
                    java.lang.StackTraceElement[] r0 = org.lwjgl.system.StackWalkUtil.stackWalkArray(r0)
                L12:
                    return r0
            }

            public boolean equals(java.lang.Object r6) {
                    r5 = this;
                    r0 = r5
                    long r0 = r0.address
                    r1 = r6
                    org.lwjgl.system.MemoryManage$DebugAllocator$Allocation r1 = (org.lwjgl.system.MemoryManage.DebugAllocator.Allocation) r1
                    long r1 = r1.address
                    int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                    if (r0 != 0) goto L13
                    r0 = 1
                    goto L14
                L13:
                    r0 = 0
                L14:
                    return r0
            }

            public int hashCode() {
                    r3 = this;
                    r0 = r3
                    long r0 = r0.address
                    int r0 = java.lang.Long.hashCode(r0)
                    return r0
            }

            static /* synthetic */ java.lang.StackTraceElement[] access$100(org.lwjgl.system.MemoryManage.DebugAllocator.Allocation r2) {
                    r0 = r2
                    java.lang.StackTraceElement[] r0 = r0.getElements()
                    return r0
            }
        }

        /* JADX WARN: Classes with same name are omitted, all sources:
          DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryManage$DebugAllocator$AllocationKey.class
          DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryManage$DebugAllocator$AllocationKey.class
         */
        /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryManage$DebugAllocator$AllocationKey.class */
        private static class AllocationKey {
            final java.lang.StackTraceElement[] elements;

            AllocationKey(java.lang.StackTraceElement[] r4) {
                    r3 = this;
                    r0 = r3
                    r0.<init>()
                    r0 = r3
                    r1 = r4
                    r0.elements = r1
                    return
            }

            public boolean equals(java.lang.Object r4) {
                    r3 = this;
                    r0 = r3
                    r1 = r4
                    if (r0 == r1) goto L16
                    r0 = r3
                    java.lang.StackTraceElement[] r0 = r0.elements
                    r1 = r4
                    org.lwjgl.system.MemoryManage$DebugAllocator$AllocationKey r1 = (org.lwjgl.system.MemoryManage.DebugAllocator.AllocationKey) r1
                    java.lang.StackTraceElement[] r1 = r1.elements
                    boolean r0 = java.util.Arrays.equals(r0, r1)
                    if (r0 == 0) goto L1a
                L16:
                    r0 = 1
                    goto L1b
                L1a:
                    r0 = 0
                L1b:
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    r0 = r2
                    java.lang.StackTraceElement[] r0 = r0.elements
                    int r0 = java.util.Arrays.hashCode(r0)
                    return r0
            }
        }

        /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryManage$DebugAllocator$CallbackIV.class */
        @java.lang.FunctionalInterface
        public interface CallbackIV extends org.lwjgl.system.CallbackI {
            public static final org.lwjgl.system.Callback.Descriptor DESCRIPTOR = null;

            default org.lwjgl.system.Callback.Descriptor getDescriptor() {
                    r2 = this;
                    org.lwjgl.system.Callback$Descriptor r0 = org.lwjgl.system.MemoryManage.DebugAllocator.CallbackIV.DESCRIPTOR
                    return r0
            }

            @Override // org.lwjgl.system.CallbackI
            default void callback(long r5, long r7) {
                    r4 = this;
                    r0 = r7
                    long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
                    long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
                    r9 = r0
                    r0 = r4
                    r1 = r9
                    r0.invoke(r1)
                    return
            }

            void invoke(long r1);

            static {
                    org.lwjgl.system.Callback$Descriptor r0 = new org.lwjgl.system.Callback$Descriptor
                    r1 = r0
                    java.lang.invoke.MethodHandles$Lookup r2 = java.lang.invoke.MethodHandles.lookup()
                    org.lwjgl.system.libffi.FFIType r3 = org.lwjgl.system.libffi.LibFFI.ffi_type_void
                    r4 = 1
                    org.lwjgl.system.libffi.FFIType[] r4 = new org.lwjgl.system.libffi.FFIType[r4]
                    r5 = r4
                    r6 = 0
                    org.lwjgl.system.libffi.FFIType r7 = org.lwjgl.system.libffi.LibFFI.ffi_type_pointer
                    r5[r6] = r7
                    org.lwjgl.system.libffi.FFICIF r3 = org.lwjgl.system.APIUtil.apiCreateCIF(r3, r4)
                    r1.<init>(r2, r3)
                    org.lwjgl.system.MemoryManage.DebugAllocator.CallbackIV.DESCRIPTOR = r0
                    return
            }
        }

        /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryManage$DebugAllocator$CallbackPP.class */
        @java.lang.FunctionalInterface
        public interface CallbackPP extends org.lwjgl.system.CallbackI {
            public static final org.lwjgl.system.Callback.Descriptor DESCRIPTOR = null;

            default org.lwjgl.system.Callback.Descriptor getDescriptor() {
                    r2 = this;
                    org.lwjgl.system.Callback$Descriptor r0 = org.lwjgl.system.MemoryManage.DebugAllocator.CallbackPP.DESCRIPTOR
                    return r0
            }

            @Override // org.lwjgl.system.CallbackI
            default void callback(long r7, long r9) {
                    r6 = this;
                    r0 = r9
                    long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
                    long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
                    r11 = r0
                    r0 = r7
                    r1 = r6
                    r2 = r11
                    long r1 = r1.invoke(r2)
                    org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
                    return
            }

            long invoke(long r1);

            static {
                    org.lwjgl.system.Callback$Descriptor r0 = new org.lwjgl.system.Callback$Descriptor
                    r1 = r0
                    java.lang.invoke.MethodHandles$Lookup r2 = java.lang.invoke.MethodHandles.lookup()
                    org.lwjgl.system.libffi.FFIType r3 = org.lwjgl.system.libffi.LibFFI.ffi_type_pointer
                    r4 = 1
                    org.lwjgl.system.libffi.FFIType[] r4 = new org.lwjgl.system.libffi.FFIType[r4]
                    r5 = r4
                    r6 = 0
                    org.lwjgl.system.libffi.FFIType r7 = org.lwjgl.system.libffi.LibFFI.ffi_type_pointer
                    r5[r6] = r7
                    org.lwjgl.system.libffi.FFICIF r3 = org.lwjgl.system.APIUtil.apiCreateCIF(r3, r4)
                    r1.<init>(r2, r3)
                    org.lwjgl.system.MemoryManage.DebugAllocator.CallbackPP.DESCRIPTOR = r0
                    return
            }
        }

        /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryManage$DebugAllocator$CallbackPPP.class */
        @java.lang.FunctionalInterface
        public interface CallbackPPP extends org.lwjgl.system.CallbackI {
            public static final org.lwjgl.system.Callback.Descriptor DESCRIPTOR = null;

            default org.lwjgl.system.Callback.Descriptor getDescriptor() {
                    r2 = this;
                    org.lwjgl.system.Callback$Descriptor r0 = org.lwjgl.system.MemoryManage.DebugAllocator.CallbackPPP.DESCRIPTOR
                    return r0
            }

            @Override // org.lwjgl.system.CallbackI
            default void callback(long r9, long r11) {
                    r8 = this;
                    r0 = r11
                    long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
                    long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
                    r13 = r0
                    r0 = r11
                    int r1 = org.lwjgl.system.MemoryManage.DebugAllocator.CallbackPPP.POINTER_SIZE
                    long r1 = (long) r1
                    long r0 = r0 + r1
                    long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
                    long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
                    r15 = r0
                    r0 = r9
                    r1 = r8
                    r2 = r13
                    r3 = r15
                    long r1 = r1.invoke(r2, r3)
                    org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
                    return
            }

            long invoke(long r1, long r3);

            static {
                    org.lwjgl.system.Callback$Descriptor r0 = new org.lwjgl.system.Callback$Descriptor
                    r1 = r0
                    java.lang.invoke.MethodHandles$Lookup r2 = java.lang.invoke.MethodHandles.lookup()
                    org.lwjgl.system.libffi.FFIType r3 = org.lwjgl.system.libffi.LibFFI.ffi_type_pointer
                    r4 = 2
                    org.lwjgl.system.libffi.FFIType[] r4 = new org.lwjgl.system.libffi.FFIType[r4]
                    r5 = r4
                    r6 = 0
                    org.lwjgl.system.libffi.FFIType r7 = org.lwjgl.system.libffi.LibFFI.ffi_type_pointer
                    r5[r6] = r7
                    r5 = r4
                    r6 = 1
                    org.lwjgl.system.libffi.FFIType r7 = org.lwjgl.system.libffi.LibFFI.ffi_type_pointer
                    r5[r6] = r7
                    org.lwjgl.system.libffi.FFICIF r3 = org.lwjgl.system.APIUtil.apiCreateCIF(r3, r4)
                    r1.<init>(r2, r3)
                    org.lwjgl.system.MemoryManage.DebugAllocator.CallbackPPP.DESCRIPTOR = r0
                    return
            }
        }

        DebugAllocator(org.lwjgl.system.MemoryUtil.MemoryAllocator r9) {
                r8 = this;
                r0 = r8
                r0.<init>()
                r0 = r8
                r1 = r9
                r0.allocator = r1
                r0 = r8
                r1 = 6
                long[] r1 = new long[r1]
                r2 = r1
                r3 = 0
                org.lwjgl.system.MemoryManage$DebugAllocator$1 r4 = new org.lwjgl.system.MemoryManage$DebugAllocator$1
                r5 = r4
                r6 = r8
                r5.<init>(r6)
                long r4 = r4.address()
                r2[r3] = r4
                r2 = r1
                r3 = 1
                org.lwjgl.system.MemoryManage$DebugAllocator$2 r4 = new org.lwjgl.system.MemoryManage$DebugAllocator$2
                r5 = r4
                r6 = r8
                r5.<init>(r6)
                long r4 = r4.address()
                r2[r3] = r4
                r2 = r1
                r3 = 2
                org.lwjgl.system.MemoryManage$DebugAllocator$3 r4 = new org.lwjgl.system.MemoryManage$DebugAllocator$3
                r5 = r4
                r6 = r8
                r5.<init>(r6)
                long r4 = r4.address()
                r2[r3] = r4
                r2 = r1
                r3 = 3
                org.lwjgl.system.MemoryManage$DebugAllocator$4 r4 = new org.lwjgl.system.MemoryManage$DebugAllocator$4
                r5 = r4
                r6 = r8
                r5.<init>(r6)
                long r4 = r4.address()
                r2[r3] = r4
                r2 = r1
                r3 = 4
                org.lwjgl.system.MemoryManage$DebugAllocator$5 r4 = new org.lwjgl.system.MemoryManage$DebugAllocator$5
                r5 = r4
                r6 = r8
                r5.<init>(r6)
                long r4 = r4.address()
                r2[r3] = r4
                r2 = r1
                r3 = 5
                org.lwjgl.system.MemoryManage$DebugAllocator$6 r4 = new org.lwjgl.system.MemoryManage$DebugAllocator$6
                r5 = r4
                r6 = r8
                r5.<init>(r6)
                long r4 = r4.address()
                r2[r3] = r4
                r0.callbacks = r1
                java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
                java.lang.Thread r1 = new java.lang.Thread
                r2 = r1
                r3 = r8
                void r3 = () -> { // java.lang.Runnable.run():void
                    r3.lambda$new$0();
                }
                r2.<init>(r3)
                r0.addShutdownHook(r1)
                return
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public long getMalloc() {
                r3 = this;
                r0 = r3
                long[] r0 = r0.callbacks
                r1 = 0
                r0 = r0[r1]
                return r0
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public long getCalloc() {
                r3 = this;
                r0 = r3
                long[] r0 = r0.callbacks
                r1 = 1
                r0 = r0[r1]
                return r0
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public long getRealloc() {
                r3 = this;
                r0 = r3
                long[] r0 = r0.callbacks
                r1 = 2
                r0 = r0[r1]
                return r0
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public long getFree() {
                r3 = this;
                r0 = r3
                long[] r0 = r0.callbacks
                r1 = 3
                r0 = r0[r1]
                return r0
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public long getAlignedAlloc() {
                r3 = this;
                r0 = r3
                long[] r0 = r0.callbacks
                r1 = 4
                r0 = r0[r1]
                return r0
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public long getAlignedFree() {
                r3 = this;
                r0 = r3
                long[] r0 = r0.callbacks
                r1 = 5
                r0 = r0[r1]
                return r0
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public long malloc(long r6) {
                r5 = this;
                r0 = r5
                org.lwjgl.system.MemoryUtil$MemoryAllocator r0 = r0.allocator
                r1 = r6
                long r0 = r0.malloc(r1)
                r1 = r6
                long r0 = track(r0, r1)
                return r0
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public long calloc(long r8, long r10) {
                r7 = this;
                r0 = r7
                org.lwjgl.system.MemoryUtil$MemoryAllocator r0 = r0.allocator
                r1 = r8
                r2 = r10
                long r0 = r0.calloc(r1, r2)
                r1 = r8
                r2 = r10
                long r1 = r1 * r2
                long r0 = track(r0, r1)
                return r0
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public long realloc(long r7, long r9) {
                r6 = this;
                r0 = r7
                long r0 = untrack(r0)
                r11 = r0
                r0 = r6
                org.lwjgl.system.MemoryUtil$MemoryAllocator r0 = r0.allocator
                r1 = r7
                r2 = r9
                long r0 = r0.realloc(r1, r2)
                r13 = r0
                r0 = r13
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto L24
                r0 = r13
                r1 = r9
                long r0 = track(r0, r1)
                goto L31
            L24:
                r0 = r9
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto L31
                r0 = r7
                r1 = r11
                long r0 = track(r0, r1)
            L31:
                r0 = r13
                return r0
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public void free(long r5) {
                r4 = this;
                r0 = r5
                long r0 = untrack(r0)
                r0 = r4
                org.lwjgl.system.MemoryUtil$MemoryAllocator r0 = r0.allocator
                r1 = r5
                r0.free(r1)
                return
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public long aligned_alloc(long r7, long r9) {
                r6 = this;
                r0 = r6
                org.lwjgl.system.MemoryUtil$MemoryAllocator r0 = r0.allocator
                r1 = r7
                r2 = r9
                long r0 = r0.aligned_alloc(r1, r2)
                r1 = r9
                long r0 = track(r0, r1)
                return r0
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public void aligned_free(long r5) {
                r4 = this;
                r0 = r5
                long r0 = untrack(r0)
                r0 = r4
                org.lwjgl.system.MemoryUtil$MemoryAllocator r0 = r0.allocator
                r1 = r5
                r0.aligned_free(r1)
                return
        }

        static long track(long r11, long r13) {
                r0 = r11
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto L69
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r15 = r0
                java.util.concurrent.ConcurrentMap<java.lang.Long, java.lang.String> r0 = org.lwjgl.system.MemoryManage.DebugAllocator.THREADS
                r1 = r15
                long r1 = r1.getId()
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r2 = r15
                java.lang.String r2 = r2.getName()
                java.lang.Object r0 = r0.putIfAbsent(r1, r2)
                org.lwjgl.system.MemoryManage$DebugAllocator$Allocation r0 = new org.lwjgl.system.MemoryManage$DebugAllocator$Allocation
                r1 = r0
                r2 = r11
                r3 = r13
                r4 = r15
                long r4 = r4.getId()
                org.lwjgl.system.Configuration<java.lang.Boolean> r5 = org.lwjgl.system.Configuration.DEBUG_MEMORY_ALLOCATOR_FAST
                r6 = 0
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
                java.lang.Object r5 = r5.get(r6)
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L43
                r5 = 0
                goto L46
            L43:
                java.lang.Object[] r5 = org.lwjgl.system.StackWalkUtil.stackWalkGetTrace()
            L46:
                r1.<init>(r2, r3, r4, r5)
                r16 = r0
                java.util.concurrent.ConcurrentMap<org.lwjgl.system.MemoryManage$DebugAllocator$Allocation, org.lwjgl.system.MemoryManage$DebugAllocator$Allocation> r0 = org.lwjgl.system.MemoryManage.DebugAllocator.ALLOCATIONS
                r1 = r16
                r2 = r16
                java.lang.Object r0 = r0.put(r1, r2)
                org.lwjgl.system.MemoryManage$DebugAllocator$Allocation r0 = (org.lwjgl.system.MemoryManage.DebugAllocator.Allocation) r0
                r17 = r0
                r0 = r17
                if (r0 == 0) goto L69
                r0 = r11
                r1 = r17
                r2 = r16
                trackAbort(r0, r1, r2)
            L69:
                r0 = r11
                return r0
        }

        private static void trackAbort(long r5, org.lwjgl.system.MemoryManage.DebugAllocator.Allocation r7, org.lwjgl.system.MemoryManage.DebugAllocator.Allocation r8) {
                r0 = r5
                java.lang.String r0 = java.lang.Long.toHexString(r0)
                java.lang.String r0 = r0.toUpperCase()
                r9 = r0
                r0 = r7
                java.lang.String r1 = "Old"
                r2 = r9
                trackAbortPrint(r0, r1, r2)
                r0 = r8
                java.lang.String r1 = "New"
                r2 = r9
                trackAbortPrint(r0, r1, r2)
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = r2
                r3.<init>()
                java.lang.String r3 = "The memory address specified is already being tracked: 0x"
                java.lang.StringBuilder r2 = r2.append(r3)
                r3 = r9
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r0
        }

        private static void trackAbortPrint(org.lwjgl.system.MemoryManage.DebugAllocator.Allocation r5, java.lang.String r6, java.lang.String r7) {
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r2 = 512(0x200, float:7.17E-43)
                r1.<init>(r2)
                r8 = r0
                r0 = r8
                java.lang.String r1 = "[LWJGL] "
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = r6
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " allocation with size "
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = r5
                long r1 = r1.size
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", thread "
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = r5
                long r1 = r1.threadId
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " ("
                java.lang.StringBuilder r0 = r0.append(r1)
                java.util.concurrent.ConcurrentMap<java.lang.Long, java.lang.String> r1 = org.lwjgl.system.MemoryManage.DebugAllocator.THREADS
                r2 = r5
                long r2 = r2.threadId
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                java.lang.Object r1 = r1.get(r2)
                java.lang.String r1 = (java.lang.String) r1
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "), address: 0x"
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = r7
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "\n"
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r5
                java.lang.StackTraceElement[] r0 = org.lwjgl.system.MemoryManage.DebugAllocator.Allocation.access$100(r0)
                r9 = r0
                r0 = r9
                if (r0 == 0) goto L95
                r0 = r9
                r10 = r0
                r0 = r10
                int r0 = r0.length
                r11 = r0
                r0 = 0
                r12 = r0
            L6d:
                r0 = r12
                r1 = r11
                if (r0 >= r1) goto L95
                r0 = r10
                r1 = r12
                r0 = r0[r1]
                r13 = r0
                r0 = r8
                java.lang.String r1 = "\tat "
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = r13
                java.lang.String r1 = r1.toString()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "\n"
                java.lang.StringBuilder r0 = r0.append(r1)
                int r12 = r12 + 1
                goto L6d
            L95:
                java.io.PrintStream r0 = org.lwjgl.system.APIUtil.DEBUG_STREAM
                r1 = r8
                r0.print(r1)
                return
        }

        static long untrack(long r11) {
                r0 = r11
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto L8
                r0 = 0
                return r0
            L8:
                java.util.concurrent.ConcurrentMap<org.lwjgl.system.MemoryManage$DebugAllocator$Allocation, org.lwjgl.system.MemoryManage$DebugAllocator$Allocation> r0 = org.lwjgl.system.MemoryManage.DebugAllocator.ALLOCATIONS
                org.lwjgl.system.MemoryManage$DebugAllocator$Allocation r1 = new org.lwjgl.system.MemoryManage$DebugAllocator$Allocation
                r2 = r1
                r3 = r11
                r4 = 0
                r5 = 0
                r6 = 0
                r2.<init>(r3, r4, r5, r6)
                java.lang.Object r0 = r0.remove(r1)
                org.lwjgl.system.MemoryManage$DebugAllocator$Allocation r0 = (org.lwjgl.system.MemoryManage.DebugAllocator.Allocation) r0
                r13 = r0
                r0 = r13
                if (r0 != 0) goto L27
                r0 = r11
                untrackAbort(r0)
            L27:
                r0 = r13
                long r0 = r0.size
                return r0
        }

        private static void untrackAbort(long r5) {
                r0 = r5
                java.lang.String r0 = java.lang.Long.toHexString(r0)
                java.lang.String r0 = r0.toUpperCase()
                r7 = r0
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = r2
                r3.<init>()
                java.lang.String r3 = "The memory address specified is not being tracked: 0x"
                java.lang.StringBuilder r2 = r2.append(r3)
                r3 = r7
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r0
        }

        static void report(org.lwjgl.system.MemoryUtil.MemoryAllocationReport r11) {
                java.util.concurrent.ConcurrentMap<org.lwjgl.system.MemoryManage$DebugAllocator$Allocation, org.lwjgl.system.MemoryManage$DebugAllocator$Allocation> r0 = org.lwjgl.system.MemoryManage.DebugAllocator.ALLOCATIONS
                java.util.Set r0 = r0.keySet()
                java.util.Iterator r0 = r0.iterator()
                r12 = r0
            Le:
                r0 = r12
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L4c
                r0 = r12
                java.lang.Object r0 = r0.next()
                org.lwjgl.system.MemoryManage$DebugAllocator$Allocation r0 = (org.lwjgl.system.MemoryManage.DebugAllocator.Allocation) r0
                r13 = r0
                r0 = r11
                r1 = r13
                long r1 = r1.address
                r2 = r13
                long r2 = r2.size
                r3 = r13
                long r3 = r3.threadId
                java.util.concurrent.ConcurrentMap<java.lang.Long, java.lang.String> r4 = org.lwjgl.system.MemoryManage.DebugAllocator.THREADS
                r5 = r13
                long r5 = r5.threadId
                java.lang.Long r5 = java.lang.Long.valueOf(r5)
                java.lang.Object r4 = r4.get(r5)
                java.lang.String r4 = (java.lang.String) r4
                r5 = r13
                java.lang.StackTraceElement[] r5 = org.lwjgl.system.MemoryManage.DebugAllocator.Allocation.access$100(r5)
                r0.invoke(r1, r2, r3, r4, r5)
                goto Le
            L4c:
                return
        }

        private static <T> void aggregate(T r6, long r7, java.util.Map<T, java.util.concurrent.atomic.AtomicLong> r9) {
                r0 = r9
                r1 = r6
                void r2 = (v0) -> { // java.util.function.Function.apply(java.lang.Object):java.lang.Object
                    return lambda$aggregate$1(v0);
                }
                java.lang.Object r0 = r0.computeIfAbsent(r1, r2)
                java.util.concurrent.atomic.AtomicLong r0 = (java.util.concurrent.atomic.AtomicLong) r0
                r10 = r0
                r0 = r10
                r1 = r10
                long r1 = r1.get()
                r2 = r7
                long r1 = r1 + r2
                r0.set(r1)
                return
        }

        static void report(org.lwjgl.system.MemoryUtil.MemoryAllocationReport r3, org.lwjgl.system.MemoryUtil.MemoryAllocationReport.Aggregate r4, boolean r5) {
                int[] r0 = org.lwjgl.system.MemoryManage.AnonymousClass1.$SwitchMap$org$lwjgl$system$MemoryUtil$MemoryAllocationReport$Aggregate
                r1 = r4
                int r1 = r1.ordinal()
                r0 = r0[r1]
                switch(r0) {
                    case 1: goto L24;
                    case 2: goto L2c;
                    case 3: goto L34;
                    default: goto L39;
                }
            L24:
                r0 = r3
                r1 = r5
                reportAll(r0, r1)
                goto L39
            L2c:
                r0 = r3
                r1 = r5
                reportByMethod(r0, r1)
                goto L39
            L34:
                r0 = r3
                r1 = r5
                reportByStacktrace(r0, r1)
            L39:
                return
        }

        private static void reportAll(org.lwjgl.system.MemoryUtil.MemoryAllocationReport r10, boolean r11) {
                r0 = r11
                if (r0 == 0) goto L9f
                java.util.HashMap r0 = new java.util.HashMap
                r1 = r0
                r1.<init>()
                r12 = r0
                java.util.concurrent.ConcurrentMap<org.lwjgl.system.MemoryManage$DebugAllocator$Allocation, org.lwjgl.system.MemoryManage$DebugAllocator$Allocation> r0 = org.lwjgl.system.MemoryManage.DebugAllocator.ALLOCATIONS
                java.util.Collection r0 = r0.values()
                java.util.Iterator r0 = r0.iterator()
                r13 = r0
            L1a:
                r0 = r13
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L42
                r0 = r13
                java.lang.Object r0 = r0.next()
                org.lwjgl.system.MemoryManage$DebugAllocator$Allocation r0 = (org.lwjgl.system.MemoryManage.DebugAllocator.Allocation) r0
                r14 = r0
                r0 = r14
                long r0 = r0.threadId
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r1 = r14
                long r1 = r1.size
                r2 = r12
                aggregate(r0, r1, r2)
                goto L1a
            L42:
                r0 = r12
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                r13 = r0
            L4e:
                r0 = r13
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L9c
                r0 = r13
                java.lang.Object r0 = r0.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                r14 = r0
                r0 = r10
                r1 = 0
                r2 = r14
                java.lang.Object r2 = r2.getValue()
                java.util.concurrent.atomic.AtomicLong r2 = (java.util.concurrent.atomic.AtomicLong) r2
                long r2 = r2.get()
                r3 = r14
                java.lang.Object r3 = r3.getKey()
                java.lang.Long r3 = (java.lang.Long) r3
                long r3 = r3.longValue()
                java.util.concurrent.ConcurrentMap<java.lang.Long, java.lang.String> r4 = org.lwjgl.system.MemoryManage.DebugAllocator.THREADS
                r5 = r14
                java.lang.Object r5 = r5.getKey()
                java.lang.Object r4 = r4.get(r5)
                java.lang.String r4 = (java.lang.String) r4
                r5 = 0
                java.lang.StackTraceElement[] r5 = (java.lang.StackTraceElement[]) r5
                r0.invoke(r1, r2, r3, r4, r5)
                goto L4e
            L9c:
                goto Ldf
            L9f:
                r0 = 0
                r12 = r0
                java.util.concurrent.ConcurrentMap<org.lwjgl.system.MemoryManage$DebugAllocator$Allocation, org.lwjgl.system.MemoryManage$DebugAllocator$Allocation> r0 = org.lwjgl.system.MemoryManage.DebugAllocator.ALLOCATIONS
                java.util.Collection r0 = r0.values()
                java.util.Iterator r0 = r0.iterator()
                r14 = r0
            Lb0:
                r0 = r14
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto Ld1
                r0 = r14
                java.lang.Object r0 = r0.next()
                org.lwjgl.system.MemoryManage$DebugAllocator$Allocation r0 = (org.lwjgl.system.MemoryManage.DebugAllocator.Allocation) r0
                r15 = r0
                r0 = r12
                r1 = r15
                long r1 = r1.size
                long r0 = r0 + r1
                r12 = r0
                goto Lb0
            Ld1:
                r0 = r10
                r1 = 0
                r2 = r12
                r3 = 0
                r4 = 0
                r5 = 0
                java.lang.StackTraceElement[] r5 = (java.lang.StackTraceElement[]) r5
                r0.invoke(r1, r2, r3, r4, r5)
            Ldf:
                return
        }

        private static void reportByMethod(org.lwjgl.system.MemoryUtil.MemoryAllocationReport r13, boolean r14) {
                r0 = r14
                if (r0 == 0) goto L102
                java.util.HashMap r0 = new java.util.HashMap
                r1 = r0
                r1.<init>()
                r15 = r0
                java.util.concurrent.ConcurrentMap<org.lwjgl.system.MemoryManage$DebugAllocator$Allocation, org.lwjgl.system.MemoryManage$DebugAllocator$Allocation> r0 = org.lwjgl.system.MemoryManage.DebugAllocator.ALLOCATIONS
                java.util.Set r0 = r0.keySet()
                java.util.Iterator r0 = r0.iterator()
                r16 = r0
            L1a:
                r0 = r16
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L63
                r0 = r16
                java.lang.Object r0 = r0.next()
                org.lwjgl.system.MemoryManage$DebugAllocator$Allocation r0 = (org.lwjgl.system.MemoryManage.DebugAllocator.Allocation) r0
                r17 = r0
                r0 = r17
                java.lang.StackTraceElement[] r0 = org.lwjgl.system.MemoryManage.DebugAllocator.Allocation.access$100(r0)
                r18 = r0
                r0 = r18
                if (r0 == 0) goto L60
                r0 = r15
                r1 = r17
                long r1 = r1.threadId
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                void r2 = (v0) -> { // java.util.function.Function.apply(java.lang.Object):java.lang.Object
                    return lambda$reportByMethod$2(v0);
                }
                java.lang.Object r0 = r0.computeIfAbsent(r1, r2)
                java.util.Map r0 = (java.util.Map) r0
                r19 = r0
                r0 = r18
                r1 = 0
                r0 = r0[r1]
                r1 = r17
                long r1 = r1.size
                r2 = r19
                aggregate(r0, r1, r2)
            L60:
                goto L1a
            L63:
                r0 = r15
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                r16 = r0
            L6f:
                r0 = r16
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto Lff
                r0 = r16
                java.lang.Object r0 = r0.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                r17 = r0
                r0 = r17
                java.lang.Object r0 = r0.getKey()
                java.lang.Long r0 = (java.lang.Long) r0
                long r0 = r0.longValue()
                r18 = r0
                java.util.concurrent.ConcurrentMap<java.lang.Long, java.lang.String> r0 = org.lwjgl.system.MemoryManage.DebugAllocator.THREADS
                r1 = r18
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                java.lang.Object r0 = r0.get(r1)
                java.lang.String r0 = (java.lang.String) r0
                r20 = r0
                r0 = r17
                java.lang.Object r0 = r0.getValue()
                java.util.Map r0 = (java.util.Map) r0
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                r21 = r0
            Lba:
                r0 = r21
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto Lfc
                r0 = r21
                java.lang.Object r0 = r0.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                r22 = r0
                r0 = r13
                r1 = 0
                r2 = r22
                java.lang.Object r2 = r2.getValue()
                java.util.concurrent.atomic.AtomicLong r2 = (java.util.concurrent.atomic.AtomicLong) r2
                long r2 = r2.get()
                r3 = r18
                r4 = r20
                r5 = 1
                java.lang.StackTraceElement[] r5 = new java.lang.StackTraceElement[r5]
                r6 = r5
                r7 = 0
                r8 = r22
                java.lang.Object r8 = r8.getKey()
                java.lang.StackTraceElement r8 = (java.lang.StackTraceElement) r8
                r6[r7] = r8
                r0.invoke(r1, r2, r3, r4, r5)
                goto Lba
            Lfc:
                goto L6f
            Lff:
                goto L192
            L102:
                java.util.HashMap r0 = new java.util.HashMap
                r1 = r0
                r1.<init>()
                r15 = r0
                java.util.concurrent.ConcurrentMap<org.lwjgl.system.MemoryManage$DebugAllocator$Allocation, org.lwjgl.system.MemoryManage$DebugAllocator$Allocation> r0 = org.lwjgl.system.MemoryManage.DebugAllocator.ALLOCATIONS
                java.util.Set r0 = r0.keySet()
                java.util.Iterator r0 = r0.iterator()
                r16 = r0
            L118:
                r0 = r16
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L148
                r0 = r16
                java.lang.Object r0 = r0.next()
                org.lwjgl.system.MemoryManage$DebugAllocator$Allocation r0 = (org.lwjgl.system.MemoryManage.DebugAllocator.Allocation) r0
                r17 = r0
                r0 = r17
                java.lang.StackTraceElement[] r0 = org.lwjgl.system.MemoryManage.DebugAllocator.Allocation.access$100(r0)
                r18 = r0
                r0 = r18
                if (r0 == 0) goto L145
                r0 = r18
                r1 = 0
                r0 = r0[r1]
                r1 = r17
                long r1 = r1.size
                r2 = r15
                aggregate(r0, r1, r2)
            L145:
                goto L118
            L148:
                r0 = r15
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                r16 = r0
            L154:
                r0 = r16
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L192
                r0 = r16
                java.lang.Object r0 = r0.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                r17 = r0
                r0 = r13
                r1 = 0
                r2 = r17
                java.lang.Object r2 = r2.getValue()
                java.util.concurrent.atomic.AtomicLong r2 = (java.util.concurrent.atomic.AtomicLong) r2
                long r2 = r2.get()
                r3 = 0
                r4 = 0
                r5 = 1
                java.lang.StackTraceElement[] r5 = new java.lang.StackTraceElement[r5]
                r6 = r5
                r7 = 0
                r8 = r17
                java.lang.Object r8 = r8.getKey()
                java.lang.StackTraceElement r8 = (java.lang.StackTraceElement) r8
                r6[r7] = r8
                r0.invoke(r1, r2, r3, r4, r5)
                goto L154
            L192:
                return
        }

        private static void reportByStacktrace(org.lwjgl.system.MemoryUtil.MemoryAllocationReport r11, boolean r12) {
                r0 = r12
                if (r0 == 0) goto Lff
                java.util.HashMap r0 = new java.util.HashMap
                r1 = r0
                r1.<init>()
                r13 = r0
                java.util.concurrent.ConcurrentMap<org.lwjgl.system.MemoryManage$DebugAllocator$Allocation, org.lwjgl.system.MemoryManage$DebugAllocator$Allocation> r0 = org.lwjgl.system.MemoryManage.DebugAllocator.ALLOCATIONS
                java.util.Set r0 = r0.keySet()
                java.util.Iterator r0 = r0.iterator()
                r14 = r0
            L1a:
                r0 = r14
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L68
                r0 = r14
                java.lang.Object r0 = r0.next()
                org.lwjgl.system.MemoryManage$DebugAllocator$Allocation r0 = (org.lwjgl.system.MemoryManage.DebugAllocator.Allocation) r0
                r15 = r0
                r0 = r15
                java.lang.StackTraceElement[] r0 = org.lwjgl.system.MemoryManage.DebugAllocator.Allocation.access$100(r0)
                r16 = r0
                r0 = r16
                if (r0 == 0) goto L65
                r0 = r13
                r1 = r15
                long r1 = r1.threadId
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                void r2 = (v0) -> { // java.util.function.Function.apply(java.lang.Object):java.lang.Object
                    return lambda$reportByStacktrace$3(v0);
                }
                java.lang.Object r0 = r0.computeIfAbsent(r1, r2)
                java.util.Map r0 = (java.util.Map) r0
                r17 = r0
                org.lwjgl.system.MemoryManage$DebugAllocator$AllocationKey r0 = new org.lwjgl.system.MemoryManage$DebugAllocator$AllocationKey
                r1 = r0
                r2 = r16
                r1.<init>(r2)
                r1 = r15
                long r1 = r1.size
                r2 = r17
                aggregate(r0, r1, r2)
            L65:
                goto L1a
            L68:
                r0 = r13
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                r14 = r0
            L74:
                r0 = r14
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto Lfc
                r0 = r14
                java.lang.Object r0 = r0.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                r15 = r0
                r0 = r15
                java.lang.Object r0 = r0.getKey()
                java.lang.Long r0 = (java.lang.Long) r0
                long r0 = r0.longValue()
                r16 = r0
                r0 = r15
                java.lang.Object r0 = r0.getValue()
                java.util.Map r0 = (java.util.Map) r0
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                r18 = r0
            Lad:
                r0 = r18
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto Lf9
                r0 = r18
                java.lang.Object r0 = r0.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                r19 = r0
                r0 = r11
                r1 = 0
                r2 = r19
                java.lang.Object r2 = r2.getValue()
                java.util.concurrent.atomic.AtomicLong r2 = (java.util.concurrent.atomic.AtomicLong) r2
                long r2 = r2.get()
                r3 = r16
                java.util.concurrent.ConcurrentMap<java.lang.Long, java.lang.String> r4 = org.lwjgl.system.MemoryManage.DebugAllocator.THREADS
                r5 = r16
                java.lang.Long r5 = java.lang.Long.valueOf(r5)
                java.lang.Object r4 = r4.get(r5)
                java.lang.String r4 = (java.lang.String) r4
                r5 = r19
                java.lang.Object r5 = r5.getKey()
                org.lwjgl.system.MemoryManage$DebugAllocator$AllocationKey r5 = (org.lwjgl.system.MemoryManage.DebugAllocator.AllocationKey) r5
                java.lang.StackTraceElement[] r5 = r5.elements
                r0.invoke(r1, r2, r3, r4, r5)
                goto Lad
            Lf9:
                goto L74
            Lfc:
                goto L190
            Lff:
                java.util.HashMap r0 = new java.util.HashMap
                r1 = r0
                r1.<init>()
                r13 = r0
                java.util.concurrent.ConcurrentMap<org.lwjgl.system.MemoryManage$DebugAllocator$Allocation, org.lwjgl.system.MemoryManage$DebugAllocator$Allocation> r0 = org.lwjgl.system.MemoryManage.DebugAllocator.ALLOCATIONS
                java.util.Set r0 = r0.keySet()
                java.util.Iterator r0 = r0.iterator()
                r14 = r0
            L115:
                r0 = r14
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L14a
                r0 = r14
                java.lang.Object r0 = r0.next()
                org.lwjgl.system.MemoryManage$DebugAllocator$Allocation r0 = (org.lwjgl.system.MemoryManage.DebugAllocator.Allocation) r0
                r15 = r0
                r0 = r15
                java.lang.StackTraceElement[] r0 = org.lwjgl.system.MemoryManage.DebugAllocator.Allocation.access$100(r0)
                r16 = r0
                r0 = r16
                if (r0 == 0) goto L147
                org.lwjgl.system.MemoryManage$DebugAllocator$AllocationKey r0 = new org.lwjgl.system.MemoryManage$DebugAllocator$AllocationKey
                r1 = r0
                r2 = r16
                r1.<init>(r2)
                r1 = r15
                long r1 = r1.size
                r2 = r13
                aggregate(r0, r1, r2)
            L147:
                goto L115
            L14a:
                r0 = r13
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                r14 = r0
            L156:
                r0 = r14
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L190
                r0 = r14
                java.lang.Object r0 = r0.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                r15 = r0
                r0 = r11
                r1 = 0
                r2 = r15
                java.lang.Object r2 = r2.getValue()
                java.util.concurrent.atomic.AtomicLong r2 = (java.util.concurrent.atomic.AtomicLong) r2
                long r2 = r2.get()
                r3 = 0
                r4 = 0
                r5 = r15
                java.lang.Object r5 = r5.getKey()
                org.lwjgl.system.MemoryManage$DebugAllocator$AllocationKey r5 = (org.lwjgl.system.MemoryManage.DebugAllocator.AllocationKey) r5
                java.lang.StackTraceElement[] r5 = r5.elements
                r0.invoke(r1, r2, r3, r4, r5)
                goto L156
            L190:
                return
        }

        private static /* synthetic */ java.util.Map lambda$reportByStacktrace$3(java.lang.Long r3) {
                java.util.HashMap r0 = new java.util.HashMap
                r1 = r0
                r1.<init>()
                return r0
        }

        private static /* synthetic */ java.util.Map lambda$reportByMethod$2(java.lang.Long r3) {
                java.util.HashMap r0 = new java.util.HashMap
                r1 = r0
                r1.<init>()
                return r0
        }

        private static /* synthetic */ java.util.concurrent.atomic.AtomicLong lambda$aggregate$1(java.lang.Object r3) {
                java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
                r1 = r0
                r1.<init>()
                return r0
        }

        private /* synthetic */ void lambda$new$0() {
                r5 = this;
                r0 = r5
                long[] r0 = r0.callbacks
                r6 = r0
                r0 = r6
                int r0 = r0.length
                r7 = r0
                r0 = 0
                r8 = r0
            La:
                r0 = r8
                r1 = r7
                if (r0 >= r1) goto L1f
                r0 = r6
                r1 = r8
                r0 = r0[r1]
                r9 = r0
                r0 = r9
                org.lwjgl.system.Callback.free(r0)
                int r8 = r8 + 1
                goto La
            L1f:
                java.util.concurrent.ConcurrentMap<org.lwjgl.system.MemoryManage$DebugAllocator$Allocation, org.lwjgl.system.MemoryManage$DebugAllocator$Allocation> r0 = org.lwjgl.system.MemoryManage.DebugAllocator.ALLOCATIONS
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L2b
                return
            L2b:
                r0 = 0
                r6 = r0
                java.util.concurrent.ConcurrentMap<org.lwjgl.system.MemoryManage$DebugAllocator$Allocation, org.lwjgl.system.MemoryManage$DebugAllocator$Allocation> r0 = org.lwjgl.system.MemoryManage.DebugAllocator.ALLOCATIONS
                java.util.Set r0 = r0.keySet()
                java.util.Iterator r0 = r0.iterator()
                r7 = r0
            L3b:
                r0 = r7
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto Lf6
                r0 = r7
                java.lang.Object r0 = r0.next()
                org.lwjgl.system.MemoryManage$DebugAllocator$Allocation r0 = (org.lwjgl.system.MemoryManage.DebugAllocator.Allocation) r0
                r8 = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r2 = 512(0x200, float:7.17E-43)
                r1.<init>(r2)
                r9 = r0
                r0 = r9
                java.lang.String r1 = "[LWJGL] "
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = r8
                long r1 = r1.size
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " bytes leaked, thread "
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = r8
                long r1 = r1.threadId
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " ("
                java.lang.StringBuilder r0 = r0.append(r1)
                java.util.concurrent.ConcurrentMap<java.lang.Long, java.lang.String> r1 = org.lwjgl.system.MemoryManage.DebugAllocator.THREADS
                r2 = r8
                long r2 = r2.threadId
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                java.lang.Object r1 = r1.get(r2)
                java.lang.String r1 = (java.lang.String) r1
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "), address: 0x"
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = r8
                long r1 = r1.address
                java.lang.String r1 = java.lang.Long.toHexString(r1)
                java.lang.String r1 = r1.toUpperCase()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "\n"
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r8
                java.lang.StackTraceElement[] r0 = org.lwjgl.system.MemoryManage.DebugAllocator.Allocation.access$100(r0)
                r10 = r0
                r0 = r10
                if (r0 == 0) goto Le9
                r0 = r10
                r11 = r0
                r0 = r11
                int r0 = r0.length
                r12 = r0
                r0 = 0
                r13 = r0
            Lbd:
                r0 = r13
                r1 = r12
                if (r0 >= r1) goto Le6
                r0 = r11
                r1 = r13
                r0 = r0[r1]
                r14 = r0
                r0 = r9
                java.lang.String r1 = "\tat "
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = r14
                java.lang.String r1 = r1.toString()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "\n"
                java.lang.StringBuilder r0 = r0.append(r1)
                int r13 = r13 + 1
                goto Lbd
            Le6:
                goto Leb
            Le9:
                r0 = 1
                r6 = r0
            Leb:
                java.io.PrintStream r0 = org.lwjgl.system.APIUtil.DEBUG_STREAM
                r1 = r9
                r0.print(r1)
                goto L3b
            Lf6:
                r0 = r6
                if (r0 == 0) goto L102
                java.io.PrintStream r0 = org.lwjgl.system.APIUtil.DEBUG_STREAM
                java.lang.String r1 = "[LWJGL] Reminder: disable Configuration.DEBUG_MEMORY_ALLOCATOR_FAST to get stacktraces of leaking allocations.\n"
                r0.print(r1)
            L102:
                return
        }

        static {
                java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
                r1 = r0
                r1.<init>()
                org.lwjgl.system.MemoryManage.DebugAllocator.ALLOCATIONS = r0
                java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
                r1 = r0
                r1.<init>()
                org.lwjgl.system.MemoryManage.DebugAllocator.THREADS = r0
                return
        }
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryManage$StdlibAllocator.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryManage$StdlibAllocator.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryManage$StdlibAllocator.class */
    private static class StdlibAllocator implements org.lwjgl.system.MemoryUtil.MemoryAllocator {
        private StdlibAllocator() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public long getMalloc() {
                r3 = this;
                long r0 = org.lwjgl.system.MemoryAccessJNI.malloc
                return r0
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public long getCalloc() {
                r3 = this;
                long r0 = org.lwjgl.system.MemoryAccessJNI.calloc
                return r0
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public long getRealloc() {
                r3 = this;
                long r0 = org.lwjgl.system.MemoryAccessJNI.realloc
                return r0
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public long getFree() {
                r3 = this;
                long r0 = org.lwjgl.system.MemoryAccessJNI.free
                return r0
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public long getAlignedAlloc() {
                r3 = this;
                long r0 = org.lwjgl.system.MemoryAccessJNI.aligned_alloc
                return r0
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public long getAlignedFree() {
                r3 = this;
                long r0 = org.lwjgl.system.MemoryAccessJNI.aligned_free
                return r0
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public long malloc(long r4) {
                r3 = this;
                r0 = r4
                long r0 = org.lwjgl.system.libc.LibCStdlib.nmalloc(r0)
                return r0
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public long calloc(long r6, long r8) {
                r5 = this;
                r0 = r6
                r1 = r8
                long r0 = org.lwjgl.system.libc.LibCStdlib.ncalloc(r0, r1)
                return r0
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public long realloc(long r6, long r8) {
                r5 = this;
                r0 = r6
                r1 = r8
                long r0 = org.lwjgl.system.libc.LibCStdlib.nrealloc(r0, r1)
                return r0
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public void free(long r4) {
                r3 = this;
                r0 = r4
                org.lwjgl.system.libc.LibCStdlib.nfree(r0)
                return
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public long aligned_alloc(long r6, long r8) {
                r5 = this;
                r0 = r6
                r1 = r8
                long r0 = org.lwjgl.system.libc.LibCStdlib.naligned_alloc(r0, r1)
                return r0
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public void aligned_free(long r4) {
                r3 = this;
                r0 = r4
                org.lwjgl.system.libc.LibCStdlib.naligned_free(r0)
                return
        }

        /* synthetic */ StdlibAllocator(org.lwjgl.system.MemoryManage.AnonymousClass1 r3) {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    private MemoryManage() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    static org.lwjgl.system.MemoryUtil.MemoryAllocator getInstance() {
            org.lwjgl.system.Configuration<java.lang.Object> r0 = org.lwjgl.system.Configuration.MEMORY_ALLOCATOR
            java.lang.Object r0 = r0.get()
            r6 = r0
            r0 = r6
            boolean r0 = r0 instanceof org.lwjgl.system.MemoryUtil.MemoryAllocator
            if (r0 == 0) goto L13
            r0 = r6
            org.lwjgl.system.MemoryUtil$MemoryAllocator r0 = (org.lwjgl.system.MemoryUtil.MemoryAllocator) r0
            return r0
        L13:
            java.lang.String r0 = "system"
            r1 = r6
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7d
            r0 = r6
            if (r0 == 0) goto L29
            java.lang.String r0 = "jemalloc"
            r1 = r6
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2f
        L29:
            java.lang.String r0 = "org.lwjgl.system.jemalloc.JEmallocAllocator"
            r7 = r0
            goto L43
        L2f:
            java.lang.String r0 = "rpmalloc"
            r1 = r6
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3e
            java.lang.String r0 = "org.lwjgl.system.rpmalloc.RPmallocAllocator"
            r7 = r0
            goto L43
        L3e:
            r0 = r6
            java.lang.String r0 = r0.toString()
            r7 = r0
        L43:
            r0 = r7
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L5b
            r8 = r0
            r0 = r8
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L5b
            java.lang.reflect.Constructor r0 = r0.getConstructor(r1)     // Catch: java.lang.Throwable -> L5b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Throwable -> L5b
            org.lwjgl.system.MemoryUtil$MemoryAllocator r0 = (org.lwjgl.system.MemoryUtil.MemoryAllocator) r0     // Catch: java.lang.Throwable -> L5b
            return r0
        L5b:
            r8 = move-exception
            boolean r0 = org.lwjgl.system.Checks.DEBUG
            if (r0 == 0) goto L6d
            r0 = r6
            if (r0 == 0) goto L6d
            r0 = r8
            java.io.PrintStream r1 = org.lwjgl.system.APIUtil.DEBUG_STREAM
            r0.printStackTrace(r1)
        L6d:
            java.lang.String r0 = "Warning: Failed to instantiate memory allocator: %s. Using the system default."
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r7
            r2[r3] = r4
            java.lang.String r0 = java.lang.String.format(r0, r1)
            org.lwjgl.system.APIUtil.apiLog(r0)
        L7d:
            org.lwjgl.system.MemoryManage$StdlibAllocator r0 = new org.lwjgl.system.MemoryManage$StdlibAllocator
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            return r0
    }
}
