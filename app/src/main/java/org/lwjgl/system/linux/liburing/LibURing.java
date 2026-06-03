package org.lwjgl.system.linux.liburing;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/LibURing.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/LibURing.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/LibURing.class */
public class LibURing {
    public static final long LIBURING_UDATA_TIMEOUT = -1;

    protected LibURing() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native long nio_uring_get_probe_ring(long r0);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("struct io_uring_probe *")
    public static org.lwjgl.system.linux.liburing.IOURingProbe io_uring_get_probe_ring(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r3) {
            r0 = r3
            long r0 = r0.address()
            long r0 = nio_uring_get_probe_ring(r0)
            r4 = r0
            r0 = r4
            org.lwjgl.system.linux.liburing.IOURingProbe r0 = org.lwjgl.system.linux.liburing.IOURingProbe.createSafe(r0)
            return r0
    }

    public static native long nio_uring_get_probe();

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("struct io_uring_probe *")
    public static org.lwjgl.system.linux.liburing.IOURingProbe io_uring_get_probe() {
            long r0 = nio_uring_get_probe()
            r3 = r0
            r0 = r3
            org.lwjgl.system.linux.liburing.IOURingProbe r0 = org.lwjgl.system.linux.liburing.IOURingProbe.createSafe(r0)
            return r0
    }

    public static native void nio_uring_free_probe(long r0);

    public static void io_uring_free_probe(@org.lwjgl.system.NativeType("struct io_uring_probe *") org.lwjgl.system.linux.liburing.IOURingProbe r3) {
            r0 = r3
            long r0 = r0.address()
            nio_uring_free_probe(r0)
            return
    }

    public static native int nio_uring_opcode_supported(long r0, int r2);

    public static int io_uring_opcode_supported(@org.lwjgl.system.NativeType("struct io_uring_probe const *") org.lwjgl.system.linux.liburing.IOURingProbe r4, int r5) {
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            int r0 = nio_uring_opcode_supported(r0, r1)
            return r0
    }

    public static native int nio_uring_queue_init_params(int r0, long r1, long r3);

    public static int io_uring_queue_init_params(@org.lwjgl.system.NativeType("unsigned") int r6, @org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r7, @org.lwjgl.system.NativeType("struct io_uring_params *") org.lwjgl.system.linux.liburing.IOURingParams r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = r2.address()
            int r0 = nio_uring_queue_init_params(r0, r1, r2)
            return r0
    }

    public static native int nio_uring_queue_init(int r0, long r1, int r3);

    public static int io_uring_queue_init(@org.lwjgl.system.NativeType("unsigned") int r5, @org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r6, @org.lwjgl.system.NativeType("unsigned") int r7) {
            r0 = r5
            r1 = r6
            long r1 = r1.address()
            r2 = r7
            int r0 = nio_uring_queue_init(r0, r1, r2)
            return r0
    }

    public static native int nio_uring_queue_mmap(int r0, long r1, long r3);

    public static int io_uring_queue_mmap(int r6, @org.lwjgl.system.NativeType("struct io_uring_params *") org.lwjgl.system.linux.liburing.IOURingParams r7, @org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = r2.address()
            int r0 = nio_uring_queue_mmap(r0, r1, r2)
            return r0
    }

    public static native int nio_uring_ring_dontfork(long r0);

    public static int io_uring_ring_dontfork(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r3) {
            r0 = r3
            long r0 = r0.address()
            int r0 = nio_uring_ring_dontfork(r0)
            return r0
    }

    public static native void nio_uring_queue_exit(long r0);

    public static void io_uring_queue_exit(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r3) {
            r0 = r3
            long r0 = r0.address()
            nio_uring_queue_exit(r0)
            return
    }

    public static native int nio_uring_peek_batch_cqe(long r0, long r2, int r4);

    @org.lwjgl.system.NativeType("unsigned")
    public static int io_uring_peek_batch_cqe(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r6, @org.lwjgl.system.NativeType("struct io_uring_cqe **") org.lwjgl.PointerBuffer r7) {
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r2 = r2.remaining()
            int r0 = nio_uring_peek_batch_cqe(r0, r1, r2)
            return r0
    }

    public static native int nio_uring_wait_cqes(long r0, long r2, int r4, long r5, long r7);

    public static int io_uring_wait_cqes(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r10, @org.lwjgl.system.NativeType("struct io_uring_cqe **") org.lwjgl.PointerBuffer r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("struct __kernel_timespec *") org.lwjgl.system.linux.KernelTimespec r12, @org.lwjgl.system.NativeType("sigset_t *") long r13) {
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r11
            int r2 = r2.remaining()
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r13
            int r0 = nio_uring_wait_cqes(r0, r1, r2, r3, r4)
            return r0
    }

    public static native int nio_uring_wait_cqe_timeout(long r0, long r2, long r4);

    public static int io_uring_wait_cqe_timeout(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r7, @org.lwjgl.system.NativeType("struct io_uring_cqe **") org.lwjgl.PointerBuffer r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("struct __kernel_timespec *") org.lwjgl.system.linux.KernelTimespec r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            int r0 = nio_uring_wait_cqe_timeout(r0, r1, r2)
            return r0
    }

    public static native int nio_uring_submit(long r0);

    public static int io_uring_submit(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r3) {
            r0 = r3
            long r0 = r0.address()
            int r0 = nio_uring_submit(r0)
            return r0
    }

    public static native int nio_uring_submit_and_wait(long r0, int r2);

    public static int io_uring_submit_and_wait(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r4, @org.lwjgl.system.NativeType("unsigned") int r5) {
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            int r0 = nio_uring_submit_and_wait(r0, r1)
            return r0
    }

    public static native int nio_uring_submit_and_wait_timeout(long r0, long r2, int r4, long r5, long r7);

    public static int io_uring_submit_and_wait_timeout(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r10, @org.lwjgl.system.NativeType("struct io_uring_cqe **") org.lwjgl.PointerBuffer r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("struct __kernel_timespec *") org.lwjgl.system.linux.KernelTimespec r12, @org.lwjgl.system.NativeType("sigset_t *") long r13) {
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r11
            int r2 = r2.remaining()
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r13
            int r0 = nio_uring_submit_and_wait_timeout(r0, r1, r2, r3, r4)
            return r0
    }

    public static native int nio_uring_register_buffers(long r0, long r2, int r4);

    public static int io_uring_register_buffers(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r6, @org.lwjgl.system.NativeType("struct iovec const *") org.lwjgl.system.linux.IOVec.Buffer r7) {
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            r2 = r7
            int r2 = r2.remaining()
            int r0 = nio_uring_register_buffers(r0, r1, r2)
            return r0
    }

    public static native int nio_uring_register_buffers_tags(long r0, long r2, long r4, int r6);

    public static int io_uring_register_buffers_tags(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r8, @org.lwjgl.system.NativeType("struct iovec const *") org.lwjgl.system.linux.IOVec.Buffer r9, @org.lwjgl.system.NativeType("__u64 const *") java.nio.LongBuffer r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r10
            r1 = r9
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            long r1 = r1.address()
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            int r3 = r3.remaining()
            int r0 = nio_uring_register_buffers_tags(r0, r1, r2, r3)
            return r0
    }

    public static native int nio_uring_register_buffers_sparse(long r0, int r2);

    public static int io_uring_register_buffers_sparse(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r4, @org.lwjgl.system.NativeType("unsigned") int r5) {
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            int r0 = nio_uring_register_buffers_sparse(r0, r1)
            return r0
    }

    public static native int nio_uring_register_buffers_update_tag(long r0, int r2, long r3, long r5, int r7);

    public static int io_uring_register_buffers_update_tag(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r9, @org.lwjgl.system.NativeType("unsigned") int r10, @org.lwjgl.system.NativeType("struct iovec const *") org.lwjgl.system.linux.IOVec.Buffer r11, @org.lwjgl.system.NativeType("__u64 const *") java.nio.LongBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r12
            r1 = r11
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            long r2 = r2.address()
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r11
            int r4 = r4.remaining()
            int r0 = nio_uring_register_buffers_update_tag(r0, r1, r2, r3, r4)
            return r0
    }

    public static native int nio_uring_unregister_buffers(long r0);

    public static int io_uring_unregister_buffers(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r3) {
            r0 = r3
            long r0 = r0.address()
            int r0 = nio_uring_unregister_buffers(r0)
            return r0
    }

    public static native int nio_uring_register_files(long r0, long r2, int r4);

    public static int io_uring_register_files(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r6, @org.lwjgl.system.NativeType("int const *") java.nio.IntBuffer r7) {
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r2 = r2.remaining()
            int r0 = nio_uring_register_files(r0, r1, r2)
            return r0
    }

    public static native int nio_uring_register_files_tags(long r0, long r2, long r4, int r6);

    public static int io_uring_register_files_tags(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r8, @org.lwjgl.system.NativeType("int const *") java.nio.IntBuffer r9, @org.lwjgl.system.NativeType("__u64 const *") java.nio.LongBuffer r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r10
            r1 = r9
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            int r3 = r3.remaining()
            int r0 = nio_uring_register_files_tags(r0, r1, r2, r3)
            return r0
    }

    public static native int nio_uring_register_files_sparse(long r0, int r2);

    public static int io_uring_register_files_sparse(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r4, @org.lwjgl.system.NativeType("unsigned") int r5) {
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            int r0 = nio_uring_register_files_sparse(r0, r1)
            return r0
    }

    public static native int nio_uring_register_files_update_tag(long r0, int r2, long r3, long r5, int r7);

    public static int io_uring_register_files_update_tag(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r9, @org.lwjgl.system.NativeType("unsigned") int r10, @org.lwjgl.system.NativeType("int const *") java.nio.IntBuffer r11, @org.lwjgl.system.NativeType("__u64 const *") java.nio.LongBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r12
            r1 = r11
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r11
            int r4 = r4.remaining()
            int r0 = nio_uring_register_files_update_tag(r0, r1, r2, r3, r4)
            return r0
    }

    public static native int nio_uring_unregister_files(long r0);

    public static int io_uring_unregister_files(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r3) {
            r0 = r3
            long r0 = r0.address()
            int r0 = nio_uring_unregister_files(r0)
            return r0
    }

    public static native int nio_uring_register_files_update(long r0, int r2, long r3, int r5);

    public static int io_uring_register_files_update(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r7, @org.lwjgl.system.NativeType("unsigned") int r8, @org.lwjgl.system.NativeType("int const *") java.nio.IntBuffer r9) {
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            int r3 = r3.remaining()
            int r0 = nio_uring_register_files_update(r0, r1, r2, r3)
            return r0
    }

    public static native int nio_uring_register_eventfd(long r0, int r2);

    public static int io_uring_register_eventfd(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r4, int r5) {
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            int r0 = nio_uring_register_eventfd(r0, r1)
            return r0
    }

    public static native int nio_uring_register_eventfd_async(long r0, int r2);

    public static int io_uring_register_eventfd_async(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r4, int r5) {
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            int r0 = nio_uring_register_eventfd_async(r0, r1)
            return r0
    }

    public static native int nio_uring_unregister_eventfd(long r0);

    public static int io_uring_unregister_eventfd(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r3) {
            r0 = r3
            long r0 = r0.address()
            int r0 = nio_uring_unregister_eventfd(r0)
            return r0
    }

    public static native int nio_uring_register_probe(long r0, long r2, int r4);

    public static int io_uring_register_probe(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r6, @org.lwjgl.system.NativeType("struct io_uring_probe *") org.lwjgl.system.linux.liburing.IOURingProbe r7, @org.lwjgl.system.NativeType("unsigned") int r8) {
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            int r0 = nio_uring_register_probe(r0, r1, r2)
            return r0
    }

    public static native int nio_uring_register_personality(long r0);

    public static int io_uring_register_personality(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r3) {
            r0 = r3
            long r0 = r0.address()
            int r0 = nio_uring_register_personality(r0)
            return r0
    }

    public static native int nio_uring_unregister_personality(long r0, int r2);

    public static int io_uring_unregister_personality(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r4, int r5) {
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            int r0 = nio_uring_unregister_personality(r0, r1)
            return r0
    }

    public static native int nio_uring_register_restrictions(long r0, long r2, int r4);

    public static int io_uring_register_restrictions(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r6, @org.lwjgl.system.NativeType("struct io_uring_restriction *") org.lwjgl.system.linux.liburing.IOURingRestriction.Buffer r7) {
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            r2 = r7
            int r2 = r2.remaining()
            int r0 = nio_uring_register_restrictions(r0, r1, r2)
            return r0
    }

    public static native int nio_uring_enable_rings(long r0);

    public static int io_uring_enable_rings(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r3) {
            r0 = r3
            long r0 = r0.address()
            int r0 = nio_uring_enable_rings(r0)
            return r0
    }

    public static native int n__io_uring_sqring_wait(long r0);

    public static int __io_uring_sqring_wait(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r3) {
            r0 = r3
            long r0 = r0.address()
            int r0 = n__io_uring_sqring_wait(r0)
            return r0
    }

    public static native int nio_uring_register_iowq_aff(long r0, long r2, long r4);

    public static int io_uring_register_iowq_aff(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r7, @org.lwjgl.system.NativeType("size_t") long r8, @org.lwjgl.system.NativeType("cpu_set_t const *") long r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            int r0 = nio_uring_register_iowq_aff(r0, r1, r2)
            return r0
    }

    public static native int nio_uring_unregister_iowq_aff(long r0);

    public static int io_uring_unregister_iowq_aff(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r3) {
            r0 = r3
            long r0 = r0.address()
            int r0 = nio_uring_unregister_iowq_aff(r0)
            return r0
    }

    public static native int nio_uring_register_iowq_max_workers(long r0, long r2);

    public static int io_uring_register_iowq_max_workers(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r5, @org.lwjgl.system.NativeType("unsigned int *") java.nio.IntBuffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r6
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            int r0 = nio_uring_register_iowq_max_workers(r0, r1)
            return r0
    }

    public static native int nio_uring_register_ring_fd(long r0);

    public static int io_uring_register_ring_fd(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r3) {
            r0 = r3
            long r0 = r0.address()
            int r0 = nio_uring_register_ring_fd(r0)
            return r0
    }

    public static native int nio_uring_unregister_ring_fd(long r0);

    public static int io_uring_unregister_ring_fd(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r3) {
            r0 = r3
            long r0 = r0.address()
            int r0 = nio_uring_unregister_ring_fd(r0)
            return r0
    }

    public static native int nio_uring_close_ring_fd(long r0);

    public static int io_uring_close_ring_fd(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r3) {
            r0 = r3
            long r0 = r0.address()
            int r0 = nio_uring_close_ring_fd(r0)
            return r0
    }

    public static native int nio_uring_register_buf_ring(long r0, long r2, int r4);

    public static int io_uring_register_buf_ring(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r6, @org.lwjgl.system.NativeType("struct io_uring_buf_reg *") org.lwjgl.system.linux.liburing.IOURingBufReg r7, @org.lwjgl.system.NativeType("unsigned int") int r8) {
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            int r0 = nio_uring_register_buf_ring(r0, r1, r2)
            return r0
    }

    public static native int nio_uring_unregister_buf_ring(long r0, int r2);

    public static int io_uring_unregister_buf_ring(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r4, int r5) {
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            int r0 = nio_uring_unregister_buf_ring(r0, r1)
            return r0
    }

    public static native int nio_uring_register_sync_cancel(long r0, long r2);

    public static int io_uring_register_sync_cancel(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r5, @org.lwjgl.system.NativeType("struct io_uring_sync_cancel_reg *") org.lwjgl.system.linux.liburing.IOURingSyncCancelReg r6) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r0 = nio_uring_register_sync_cancel(r0, r1)
            return r0
    }

    public static native int nio_uring_register_file_alloc_range(long r0, int r2, int r3);

    public static int io_uring_register_file_alloc_range(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r5, @org.lwjgl.system.NativeType("unsigned") int r6, @org.lwjgl.system.NativeType("unsigned") int r7) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            int r0 = nio_uring_register_file_alloc_range(r0, r1, r2)
            return r0
    }

    public static native int nio_uring_get_events(long r0);

    public static int io_uring_get_events(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r3) {
            r0 = r3
            long r0 = r0.address()
            int r0 = nio_uring_get_events(r0)
            return r0
    }

    public static native int nio_uring_submit_and_get_events(long r0);

    public static int io_uring_submit_and_get_events(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r3) {
            r0 = r3
            long r0 = r0.address()
            int r0 = nio_uring_submit_and_get_events(r0)
            return r0
    }

    public static native int nio_uring_enter(int r0, int r1, int r2, int r3, long r4);

    public static int io_uring_enter(@org.lwjgl.system.NativeType("unsigned int") int r7, @org.lwjgl.system.NativeType("unsigned int") int r8, @org.lwjgl.system.NativeType("unsigned int") int r9, @org.lwjgl.system.NativeType("unsigned int") int r10, @org.lwjgl.system.NativeType("sigset_t *") long r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lc:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            int r0 = nio_uring_enter(r0, r1, r2, r3, r4)
            return r0
    }

    public static native int nio_uring_enter2(int r0, int r1, int r2, int r3, long r4, long r6);

    public static int io_uring_enter2(@org.lwjgl.system.NativeType("unsigned int") int r9, @org.lwjgl.system.NativeType("unsigned int") int r10, @org.lwjgl.system.NativeType("unsigned int") int r11, @org.lwjgl.system.NativeType("unsigned int") int r12, @org.lwjgl.system.NativeType("sigset_t *") long r13, @org.lwjgl.system.NativeType("size_t") long r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lc:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r15
            int r0 = nio_uring_enter2(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static native int nio_uring_setup(int r0, long r1);

    public static int io_uring_setup(@org.lwjgl.system.NativeType("unsigned int") int r4, @org.lwjgl.system.NativeType("struct io_uring_params *") org.lwjgl.system.linux.liburing.IOURingParams r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            int r0 = nio_uring_setup(r0, r1)
            return r0
    }

    public static native int io_uring_register(@org.lwjgl.system.NativeType("unsigned int") int r0, @org.lwjgl.system.NativeType("unsigned int") int r1, @org.lwjgl.system.NativeType("void *") long r2, @org.lwjgl.system.NativeType("unsigned int") int r4);

    public static native long nio_uring_setup_buf_ring(long r0, int r2, int r3, int r4, long r5);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("struct io_uring_buf_ring *")
    public static org.lwjgl.system.linux.liburing.IOURingBufRing io_uring_setup_buf_ring(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r8, @org.lwjgl.system.NativeType("unsigned int") int r9, int r10, @org.lwjgl.system.NativeType("unsigned int") int r11, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            long r0 = nio_uring_setup_buf_ring(r0, r1, r2, r3, r4)
            r13 = r0
            r0 = r13
            org.lwjgl.system.linux.liburing.IOURingBufRing r0 = org.lwjgl.system.linux.liburing.IOURingBufRing.createSafe(r0)
            return r0
    }

    public static native int nio_uring_free_buf_ring(long r0, long r2, int r4, int r5);

    public static int io_uring_free_buf_ring(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r7, @org.lwjgl.system.NativeType("struct io_uring_buf_ring *") org.lwjgl.system.linux.liburing.IOURingBufRing r8, @org.lwjgl.system.NativeType("unsigned int") int r9, int r10) {
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            long r1 = r1.address()
            r2 = r9
            r3 = r10
            int r0 = nio_uring_free_buf_ring(r0, r1, r2, r3)
            return r0
    }

    public static native void nio_uring_cqe_seen(long r0, long r2);

    public static void io_uring_cqe_seen(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r5, @org.lwjgl.system.NativeType("struct io_uring_cqe *") org.lwjgl.system.linux.liburing.IOURingCQE r6) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            nio_uring_cqe_seen(r0, r1)
            return
    }

    public static native void nio_uring_sqe_set_data(long r0, long r2);

    public static void io_uring_sqe_set_data(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r5, @org.lwjgl.system.NativeType("void *") long r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nio_uring_sqe_set_data(r0, r1)
            return
    }

    public static native long nio_uring_cqe_get_data(long r0);

    @org.lwjgl.system.NativeType("void *")
    public static long io_uring_cqe_get_data(@org.lwjgl.system.NativeType("struct io_uring_cqe const *") org.lwjgl.system.linux.liburing.IOURingCQE r3) {
            r0 = r3
            long r0 = r0.address()
            long r0 = nio_uring_cqe_get_data(r0)
            return r0
    }

    public static native void nio_uring_sqe_set_data64(long r0, long r2);

    public static void io_uring_sqe_set_data64(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r5, @org.lwjgl.system.NativeType("__u64") long r6) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nio_uring_sqe_set_data64(r0, r1)
            return
    }

    public static native long nio_uring_cqe_get_data64(long r0);

    @org.lwjgl.system.NativeType("__u64")
    public static long io_uring_cqe_get_data64(@org.lwjgl.system.NativeType("struct io_uring_cqe const *") org.lwjgl.system.linux.liburing.IOURingCQE r3) {
            r0 = r3
            long r0 = r0.address()
            long r0 = nio_uring_cqe_get_data64(r0)
            return r0
    }

    public static native void nio_uring_sqe_set_flags(long r0, int r2);

    public static void io_uring_sqe_set_flags(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r4, @org.lwjgl.system.NativeType("unsigned int") int r5) {
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nio_uring_sqe_set_flags(r0, r1)
            return
    }

    public static native void nio_uring_prep_splice(long r0, int r2, long r3, int r5, long r6, int r8, int r9);

    public static void io_uring_prep_splice(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r11, int r12, @org.lwjgl.system.NativeType("int64_t") long r13, int r15, @org.lwjgl.system.NativeType("int64_t") long r16, @org.lwjgl.system.NativeType("unsigned int") int r18, @org.lwjgl.system.NativeType("unsigned int") int r19) {
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r16
            r5 = r18
            r6 = r19
            nio_uring_prep_splice(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static native void nio_uring_prep_tee(long r0, int r2, int r3, int r4, int r5);

    public static void io_uring_prep_tee(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r7, int r8, int r9, @org.lwjgl.system.NativeType("unsigned int") int r10, @org.lwjgl.system.NativeType("unsigned int") int r11) {
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            nio_uring_prep_tee(r0, r1, r2, r3, r4)
            return
    }

    public static native void nio_uring_prep_readv(long r0, int r2, long r3, int r5, int r6);

    public static void io_uring_prep_readv(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r8, int r9, @org.lwjgl.system.NativeType("struct iovec const *") org.lwjgl.system.linux.IOVec.Buffer r10, int r11) {
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            long r2 = r2.address()
            r3 = r10
            int r3 = r3.remaining()
            r4 = r11
            nio_uring_prep_readv(r0, r1, r2, r3, r4)
            return
    }

    public static native void nio_uring_prep_readv2(long r0, int r2, long r3, int r5, int r6, int r7);

    public static void io_uring_prep_readv2(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r9, int r10, @org.lwjgl.system.NativeType("struct iovec const *") org.lwjgl.system.linux.IOVec.Buffer r11, int r12, int r13) {
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            long r2 = r2.address()
            r3 = r11
            int r3 = r3.remaining()
            r4 = r12
            r5 = r13
            nio_uring_prep_readv2(r0, r1, r2, r3, r4, r5)
            return
    }

    public static native void nio_uring_prep_read_fixed(long r0, int r2, long r3, int r5, int r6, int r7);

    public static void io_uring_prep_read_fixed(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r9, int r10, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r11, int r12, int r13) {
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r11
            int r3 = r3.remaining()
            r4 = r12
            r5 = r13
            nio_uring_prep_read_fixed(r0, r1, r2, r3, r4, r5)
            return
    }

    public static native void nio_uring_prep_writev(long r0, int r2, long r3, int r5, int r6);

    public static void io_uring_prep_writev(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r8, int r9, @org.lwjgl.system.NativeType("struct iovec const *") org.lwjgl.system.linux.IOVec.Buffer r10, int r11) {
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            long r2 = r2.address()
            r3 = r10
            int r3 = r3.remaining()
            r4 = r11
            nio_uring_prep_writev(r0, r1, r2, r3, r4)
            return
    }

    public static native void nio_uring_prep_writev2(long r0, int r2, long r3, int r5, int r6, int r7);

    public static void io_uring_prep_writev2(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r9, int r10, @org.lwjgl.system.NativeType("struct iovec const *") org.lwjgl.system.linux.IOVec.Buffer r11, int r12, int r13) {
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            long r2 = r2.address()
            r3 = r11
            int r3 = r3.remaining()
            r4 = r12
            r5 = r13
            nio_uring_prep_writev2(r0, r1, r2, r3, r4, r5)
            return
    }

    public static native void nio_uring_prep_write_fixed(long r0, int r2, long r3, int r5, int r6, int r7);

    public static void io_uring_prep_write_fixed(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r9, int r10, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r11, int r12, int r13) {
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r11
            int r3 = r3.remaining()
            r4 = r12
            r5 = r13
            nio_uring_prep_write_fixed(r0, r1, r2, r3, r4, r5)
            return
    }

    public static native void nio_uring_prep_recvmsg(long r0, int r2, long r3, int r5);

    public static void io_uring_prep_recvmsg(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r7, int r8, @org.lwjgl.system.NativeType("struct msghdr *") org.lwjgl.system.linux.Msghdr r9, @org.lwjgl.system.NativeType("unsigned int") int r10) {
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r9
            long r2 = r2.address()
            r3 = r10
            nio_uring_prep_recvmsg(r0, r1, r2, r3)
            return
    }

    public static native void nio_uring_prep_recvmsg_multishot(long r0, int r2, long r3, int r5);

    public static void io_uring_prep_recvmsg_multishot(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r7, int r8, @org.lwjgl.system.NativeType("struct msghdr *") org.lwjgl.system.linux.Msghdr r9, @org.lwjgl.system.NativeType("unsigned") int r10) {
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r9
            long r2 = r2.address()
            r3 = r10
            nio_uring_prep_recvmsg_multishot(r0, r1, r2, r3)
            return
    }

    public static native void nio_uring_prep_sendmsg(long r0, int r2, long r3, int r5);

    public static void io_uring_prep_sendmsg(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r7, int r8, @org.lwjgl.system.NativeType("struct msghdr const *") org.lwjgl.system.linux.Msghdr r9, @org.lwjgl.system.NativeType("unsigned int") int r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Ld
            r0 = r9
            long r0 = r0.address()
            org.lwjgl.system.linux.Msghdr.validate(r0)
        Ld:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r9
            long r2 = r2.address()
            r3 = r10
            nio_uring_prep_sendmsg(r0, r1, r2, r3)
            return
    }

    public static native void nio_uring_prep_poll_add(long r0, int r2, int r3);

    public static void io_uring_prep_poll_add(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r5, int r6, @org.lwjgl.system.NativeType("unsigned int") int r7) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nio_uring_prep_poll_add(r0, r1, r2)
            return
    }

    public static native void nio_uring_prep_poll_multishot(long r0, int r2, int r3);

    public static void io_uring_prep_poll_multishot(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r5, int r6, @org.lwjgl.system.NativeType("unsigned int") int r7) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nio_uring_prep_poll_multishot(r0, r1, r2)
            return
    }

    public static native void nio_uring_prep_poll_remove(long r0, long r2);

    public static void io_uring_prep_poll_remove(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r5, @org.lwjgl.system.NativeType("__u64") long r6) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nio_uring_prep_poll_remove(r0, r1)
            return
    }

    public static native void nio_uring_prep_poll_update(long r0, long r2, long r4, int r6, int r7);

    public static void io_uring_prep_poll_update(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r9, @org.lwjgl.system.NativeType("__u64") long r10, @org.lwjgl.system.NativeType("__u64") long r12, @org.lwjgl.system.NativeType("unsigned int") int r14, @org.lwjgl.system.NativeType("unsigned int") int r15) {
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            r4 = r15
            nio_uring_prep_poll_update(r0, r1, r2, r3, r4)
            return
    }

    public static native void nio_uring_prep_fsync(long r0, int r2, int r3);

    public static void io_uring_prep_fsync(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r5, int r6, @org.lwjgl.system.NativeType("unsigned int") int r7) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nio_uring_prep_fsync(r0, r1, r2)
            return
    }

    public static native void nio_uring_prep_nop(long r0);

    public static void io_uring_prep_nop(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r3) {
            r0 = r3
            long r0 = r0.address()
            nio_uring_prep_nop(r0)
            return
    }

    public static native void nio_uring_prep_timeout(long r0, long r2, int r4, int r5);

    public static void io_uring_prep_timeout(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r7, @org.lwjgl.system.NativeType("struct __kernel_timespec *") org.lwjgl.system.linux.KernelTimespec r8, @org.lwjgl.system.NativeType("unsigned int") int r9, @org.lwjgl.system.NativeType("unsigned int") int r10) {
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            long r1 = r1.address()
            r2 = r9
            r3 = r10
            nio_uring_prep_timeout(r0, r1, r2, r3)
            return
    }

    public static native void nio_uring_prep_timeout_remove(long r0, long r2, int r4);

    public static void io_uring_prep_timeout_remove(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r6, @org.lwjgl.system.NativeType("__u64") long r7, @org.lwjgl.system.NativeType("unsigned int") int r9) {
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r9
            nio_uring_prep_timeout_remove(r0, r1, r2)
            return
    }

    public static native void nio_uring_prep_timeout_update(long r0, long r2, long r4, int r6);

    public static void io_uring_prep_timeout_update(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r8, @org.lwjgl.system.NativeType("struct __kernel_timespec *") org.lwjgl.system.linux.KernelTimespec r9, @org.lwjgl.system.NativeType("__u64") long r10, @org.lwjgl.system.NativeType("unsigned int") int r12) {
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            long r1 = r1.address()
            r2 = r10
            r3 = r12
            nio_uring_prep_timeout_update(r0, r1, r2, r3)
            return
    }

    public static native void nio_uring_prep_accept(long r0, int r2, long r3, long r5, int r7);

    public static void io_uring_prep_accept(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r9, int r10, @org.lwjgl.system.NativeType("struct sockaddr *") org.lwjgl.system.linux.Sockaddr r11, @org.lwjgl.system.NativeType("socklen_t *") java.nio.IntBuffer r12, int r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            long r2 = r2.address()
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r13
            nio_uring_prep_accept(r0, r1, r2, r3, r4)
            return
    }

    public static native void nio_uring_prep_accept_direct(long r0, int r2, long r3, long r5, int r7, int r8);

    public static void io_uring_prep_accept_direct(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r10, int r11, @org.lwjgl.system.NativeType("struct sockaddr *") org.lwjgl.system.linux.Sockaddr r12, @org.lwjgl.system.NativeType("socklen_t *") java.nio.IntBuffer r13, int r14, @org.lwjgl.system.NativeType("unsigned int") int r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r12
            long r2 = r2.address()
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r14
            r5 = r15
            nio_uring_prep_accept_direct(r0, r1, r2, r3, r4, r5)
            return
    }

    public static native void nio_uring_prep_multishot_accept(long r0, int r2, long r3, long r5, int r7);

    public static void io_uring_prep_multishot_accept(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r9, int r10, @org.lwjgl.system.NativeType("struct sockaddr *") org.lwjgl.system.linux.Sockaddr r11, @org.lwjgl.system.NativeType("socklen_t *") java.nio.IntBuffer r12, int r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            long r2 = r2.address()
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r13
            nio_uring_prep_multishot_accept(r0, r1, r2, r3, r4)
            return
    }

    public static native void nio_uring_prep_multishot_accept_direct(long r0, int r2, long r3, long r5, int r7);

    public static void io_uring_prep_multishot_accept_direct(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r9, int r10, @org.lwjgl.system.NativeType("struct sockaddr *") org.lwjgl.system.linux.Sockaddr r11, @org.lwjgl.system.NativeType("socklen_t *") java.nio.IntBuffer r12, int r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            long r2 = r2.address()
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r13
            nio_uring_prep_multishot_accept_direct(r0, r1, r2, r3, r4)
            return
    }

    public static native void nio_uring_prep_cancel64(long r0, long r2, int r4);

    public static void io_uring_prep_cancel64(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r6, @org.lwjgl.system.NativeType("__u64") long r7, int r9) {
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r9
            nio_uring_prep_cancel64(r0, r1, r2)
            return
    }

    public static native void nio_uring_prep_cancel(long r0, long r2, int r4);

    public static void io_uring_prep_cancel(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r6, @org.lwjgl.system.NativeType("void *") long r7, int r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r9
            nio_uring_prep_cancel(r0, r1, r2)
            return
    }

    public static native void nio_uring_prep_cancel_fd(long r0, int r2, int r3);

    public static void io_uring_prep_cancel_fd(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r5, int r6, @org.lwjgl.system.NativeType("unsigned int") int r7) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nio_uring_prep_cancel_fd(r0, r1, r2)
            return
    }

    public static native void nio_uring_prep_link_timeout(long r0, long r2, int r4);

    public static void io_uring_prep_link_timeout(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r6, @org.lwjgl.system.NativeType("struct __kernel_timespec *") org.lwjgl.system.linux.KernelTimespec r7, @org.lwjgl.system.NativeType("unsigned int") int r8) {
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            nio_uring_prep_link_timeout(r0, r1, r2)
            return
    }

    public static native void nio_uring_prep_connect(long r0, int r2, long r3, int r5);

    public static void io_uring_prep_connect(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r7, int r8, @org.lwjgl.system.NativeType("struct sockaddr const *") org.lwjgl.system.linux.Sockaddr r9, @org.lwjgl.system.NativeType("socklen_t") int r10) {
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r9
            long r2 = r2.address()
            r3 = r10
            nio_uring_prep_connect(r0, r1, r2, r3)
            return
    }

    public static native void nio_uring_prep_files_update(long r0, long r2, int r4, int r5);

    public static void io_uring_prep_files_update(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r7, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r8, int r9) {
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r8
            int r2 = r2.remaining()
            r3 = r9
            nio_uring_prep_files_update(r0, r1, r2, r3)
            return
    }

    public static native void nio_uring_prep_fallocate(long r0, int r2, int r3, long r4, long r6);

    public static void io_uring_prep_fallocate(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r9, int r10, int r11, @org.lwjgl.system.NativeType("off_t") long r12, @org.lwjgl.system.NativeType("off_t") long r14) {
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r14
            nio_uring_prep_fallocate(r0, r1, r2, r3, r4)
            return
    }

    public static native void nio_uring_prep_openat(long r0, int r2, long r3, int r5, int r6);

    public static void io_uring_prep_openat(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r8, int r9, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r10, int r11, int r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r10
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r11
            r4 = r12
            nio_uring_prep_openat(r0, r1, r2, r3, r4)
            return
    }

    public static void io_uring_prep_openat(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r8, int r9, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r10, int r11, int r12) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r13 = r0
            r0 = r13
            int r0 = r0.getPointer()
            r14 = r0
            r0 = r13
            r1 = r10
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L32
            r0 = r13
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L32
            r15 = r0
            r0 = r8
            long r0 = r0.address()     // Catch: java.lang.Throwable -> L32
            r1 = r9
            r2 = r15
            r3 = r11
            r4 = r12
            nio_uring_prep_openat(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L32
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            goto L3e
        L32:
            r17 = move-exception
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            r0 = r17
            throw r0
        L3e:
            return
    }

    public static native void nio_uring_prep_openat_direct(long r0, int r2, long r3, int r5, int r6, int r7);

    public static void io_uring_prep_openat_direct(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r9, int r10, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r11, int r12, int r13, @org.lwjgl.system.NativeType("unsigned int") int r14) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r11
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            r4 = r13
            r5 = r14
            nio_uring_prep_openat_direct(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void io_uring_prep_openat_direct(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r9, int r10, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r11, int r12, int r13, @org.lwjgl.system.NativeType("unsigned int") int r14) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r15 = r0
            r0 = r15
            int r0 = r0.getPointer()
            r16 = r0
            r0 = r15
            r1 = r11
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L34
            r0 = r15
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L34
            r17 = r0
            r0 = r9
            long r0 = r0.address()     // Catch: java.lang.Throwable -> L34
            r1 = r10
            r2 = r17
            r3 = r12
            r4 = r13
            r5 = r14
            nio_uring_prep_openat_direct(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L34
            r0 = r15
            r1 = r16
            r0.setPointer(r1)
            goto L40
        L34:
            r19 = move-exception
            r0 = r15
            r1 = r16
            r0.setPointer(r1)
            r0 = r19
            throw r0
        L40:
            return
    }

    public static native void nio_uring_prep_close(long r0, int r2);

    public static void io_uring_prep_close(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r4, int r5) {
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nio_uring_prep_close(r0, r1)
            return
    }

    public static native void nio_uring_prep_close_direct(long r0, int r2);

    public static void io_uring_prep_close_direct(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r4, @org.lwjgl.system.NativeType("unsigned int") int r5) {
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nio_uring_prep_close_direct(r0, r1)
            return
    }

    public static native void nio_uring_prep_read(long r0, int r2, long r3, int r5, int r6);

    public static void io_uring_prep_read(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r8, int r9, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r10, int r11) {
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r10
            int r3 = r3.remaining()
            r4 = r11
            nio_uring_prep_read(r0, r1, r2, r3, r4)
            return
    }

    public static native void nio_uring_prep_write(long r0, int r2, long r3, int r5, int r6);

    public static void io_uring_prep_write(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r8, int r9, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r10, int r11) {
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r10
            int r3 = r3.remaining()
            r4 = r11
            nio_uring_prep_write(r0, r1, r2, r3, r4)
            return
    }

    public static native void nio_uring_prep_statx(long r0, int r2, long r3, int r5, int r6, long r7);

    public static void io_uring_prep_statx(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r10, int r11, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r12, int r13, @org.lwjgl.system.NativeType("unsigned int") int r14, @org.lwjgl.system.NativeType("struct statx *") org.lwjgl.system.linux.Statx r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r12
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r13
            r4 = r14
            r5 = r15
            long r5 = r5.address()
            nio_uring_prep_statx(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void io_uring_prep_statx(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r10, int r11, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r12, int r13, @org.lwjgl.system.NativeType("unsigned int") int r14, @org.lwjgl.system.NativeType("struct statx *") org.lwjgl.system.linux.Statx r15) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r16 = r0
            r0 = r16
            int r0 = r0.getPointer()
            r17 = r0
            r0 = r16
            r1 = r12
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L37
            r0 = r16
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L37
            r18 = r0
            r0 = r10
            long r0 = r0.address()     // Catch: java.lang.Throwable -> L37
            r1 = r11
            r2 = r18
            r3 = r13
            r4 = r14
            r5 = r15
            long r5 = r5.address()     // Catch: java.lang.Throwable -> L37
            nio_uring_prep_statx(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L37
            r0 = r16
            r1 = r17
            r0.setPointer(r1)
            goto L43
        L37:
            r20 = move-exception
            r0 = r16
            r1 = r17
            r0.setPointer(r1)
            r0 = r20
            throw r0
        L43:
            return
    }

    public static native void nio_uring_prep_fadvise(long r0, int r2, int r3, long r4, int r6);

    public static void io_uring_prep_fadvise(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r8, int r9, int r10, @org.lwjgl.system.NativeType("off_t") long r11, int r13) {
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r13
            nio_uring_prep_fadvise(r0, r1, r2, r3, r4)
            return
    }

    public static native void nio_uring_prep_madvise(long r0, long r2, long r4, int r6);

    public static void io_uring_prep_madvise(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r8, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r9, int r10) {
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            int r2 = r2.remaining()
            long r2 = (long) r2
            r3 = r10
            nio_uring_prep_madvise(r0, r1, r2, r3)
            return
    }

    public static native void nio_uring_prep_send(long r0, int r2, long r3, long r5, int r7);

    public static void io_uring_prep_send(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r9, int r10, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r11, int r12) {
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r11
            int r3 = r3.remaining()
            long r3 = (long) r3
            r4 = r12
            nio_uring_prep_send(r0, r1, r2, r3, r4)
            return
    }

    public static native void nio_uring_prep_send_set_addr(long r0, long r2, short r4);

    public static void io_uring_prep_send_set_addr(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r6, @org.lwjgl.system.NativeType("struct sockaddr const *") org.lwjgl.system.linux.Sockaddr r7, @org.lwjgl.system.NativeType("__u16") short r8) {
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            nio_uring_prep_send_set_addr(r0, r1, r2)
            return
    }

    public static native void nio_uring_prep_sendto(long r0, int r2, long r3, long r5, int r7, long r8, int r10);

    public static void io_uring_prep_sendto(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r12, int r13, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r14, int r15, @org.lwjgl.system.NativeType("struct sockaddr const *") org.lwjgl.system.linux.Sockaddr r16, @org.lwjgl.system.NativeType("socklen_t") int r17) {
            r0 = r12
            long r0 = r0.address()
            r1 = r13
            r2 = r14
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r14
            int r3 = r3.remaining()
            long r3 = (long) r3
            r4 = r15
            r5 = r16
            long r5 = r5.address()
            r6 = r17
            nio_uring_prep_sendto(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static native void nio_uring_prep_send_zc(long r0, int r2, long r3, long r5, int r7, int r8);

    public static void io_uring_prep_send_zc(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r10, int r11, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r12, int r13, @org.lwjgl.system.NativeType("unsigned") int r14) {
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            int r3 = r3.remaining()
            long r3 = (long) r3
            r4 = r13
            r5 = r14
            nio_uring_prep_send_zc(r0, r1, r2, r3, r4, r5)
            return
    }

    public static native void nio_uring_prep_send_zc_fixed(long r0, int r2, long r3, long r5, int r7, int r8, int r9);

    public static void io_uring_prep_send_zc_fixed(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r11, int r12, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r13, int r14, @org.lwjgl.system.NativeType("unsigned") int r15, @org.lwjgl.system.NativeType("unsigned") int r16) {
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r13
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r13
            int r3 = r3.remaining()
            long r3 = (long) r3
            r4 = r14
            r5 = r15
            r6 = r16
            nio_uring_prep_send_zc_fixed(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static native void nio_uring_prep_sendmsg_zc(long r0, int r2, long r3, int r5);

    public static void io_uring_prep_sendmsg_zc(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r7, int r8, @org.lwjgl.system.NativeType("struct msghdr const *") org.lwjgl.system.linux.Msghdr r9, @org.lwjgl.system.NativeType("unsigned") int r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Ld
            r0 = r9
            long r0 = r0.address()
            org.lwjgl.system.linux.Msghdr.validate(r0)
        Ld:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r9
            long r2 = r2.address()
            r3 = r10
            nio_uring_prep_sendmsg_zc(r0, r1, r2, r3)
            return
    }

    public static native void nio_uring_prep_recv(long r0, int r2, long r3, long r5, int r7);

    public static void io_uring_prep_recv(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r9, int r10, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r11, int r12) {
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r11
            int r3 = r3.remaining()
            long r3 = (long) r3
            r4 = r12
            nio_uring_prep_recv(r0, r1, r2, r3, r4)
            return
    }

    public static native void nio_uring_prep_recv_multishot(long r0, int r2, long r3, long r5, int r7);

    public static void io_uring_prep_recv_multishot(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r9, int r10, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r11, int r12) {
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r11
            int r3 = r3.remaining()
            long r3 = (long) r3
            r4 = r12
            nio_uring_prep_recv_multishot(r0, r1, r2, r3, r4)
            return
    }

    public static native long nio_uring_recvmsg_validate(long r0, int r2, long r3);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("struct io_uring_recvmsg_out *")
    public static org.lwjgl.system.linux.liburing.IOURingRecvmsgOut io_uring_recvmsg_validate(@org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r6, @org.lwjgl.system.NativeType("struct msghdr *") org.lwjgl.system.linux.Msghdr r7) {
            r0 = r6
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r6
            int r1 = r1.remaining()
            r2 = r7
            long r2 = r2.address()
            long r0 = nio_uring_recvmsg_validate(r0, r1, r2)
            r8 = r0
            r0 = r8
            org.lwjgl.system.linux.liburing.IOURingRecvmsgOut r0 = org.lwjgl.system.linux.liburing.IOURingRecvmsgOut.createSafe(r0)
            return r0
    }

    public static native long nio_uring_recvmsg_name(long r0);

    @org.lwjgl.system.NativeType("void *")
    public static long io_uring_recvmsg_name(@org.lwjgl.system.NativeType("struct io_uring_recvmsg_out *") org.lwjgl.system.linux.liburing.IOURingRecvmsgOut r3) {
            r0 = r3
            long r0 = r0.address()
            long r0 = nio_uring_recvmsg_name(r0)
            return r0
    }

    public static native long nio_uring_recvmsg_cmsg_firsthdr(long r0, long r2);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("struct cmsghdr *")
    public static org.lwjgl.system.linux.CMsghdr io_uring_recvmsg_cmsg_firsthdr(@org.lwjgl.system.NativeType("struct io_uring_recvmsg_out *") org.lwjgl.system.linux.liburing.IOURingRecvmsgOut r5, @org.lwjgl.system.NativeType("struct msghdr *") org.lwjgl.system.linux.Msghdr r6) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            long r0 = nio_uring_recvmsg_cmsg_firsthdr(r0, r1)
            r7 = r0
            r0 = r7
            org.lwjgl.system.linux.CMsghdr r0 = org.lwjgl.system.linux.CMsghdr.createSafe(r0)
            return r0
    }

    public static native long nio_uring_recvmsg_cmsg_nexthdr(long r0, long r2, long r4);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("struct cmsghdr *")
    public static org.lwjgl.system.linux.CMsghdr io_uring_recvmsg_cmsg_nexthdr(@org.lwjgl.system.NativeType("struct io_uring_recvmsg_out *") org.lwjgl.system.linux.liburing.IOURingRecvmsgOut r7, @org.lwjgl.system.NativeType("struct msghdr *") org.lwjgl.system.linux.Msghdr r8, @org.lwjgl.system.NativeType("struct cmsghdr *") org.lwjgl.system.linux.CMsghdr r9) {
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            long r1 = r1.address()
            r2 = r9
            long r2 = r2.address()
            long r0 = nio_uring_recvmsg_cmsg_nexthdr(r0, r1, r2)
            r10 = r0
            r0 = r10
            org.lwjgl.system.linux.CMsghdr r0 = org.lwjgl.system.linux.CMsghdr.createSafe(r0)
            return r0
    }

    public static native long nio_uring_recvmsg_payload(long r0, long r2);

    @org.lwjgl.system.NativeType("void *")
    public static long io_uring_recvmsg_payload(@org.lwjgl.system.NativeType("struct io_uring_recvmsg_out *") org.lwjgl.system.linux.liburing.IOURingRecvmsgOut r5, @org.lwjgl.system.NativeType("struct msghdr *") org.lwjgl.system.linux.Msghdr r6) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            long r0 = nio_uring_recvmsg_payload(r0, r1)
            return r0
    }

    public static native int nio_uring_recvmsg_payload_length(long r0, int r2, long r3);

    @org.lwjgl.system.NativeType("unsigned int")
    public static int io_uring_recvmsg_payload_length(@org.lwjgl.system.NativeType("struct io_uring_recvmsg_out *") org.lwjgl.system.linux.liburing.IOURingRecvmsgOut r6, int r7, @org.lwjgl.system.NativeType("struct msghdr *") org.lwjgl.system.linux.Msghdr r8) {
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            long r2 = r2.address()
            int r0 = nio_uring_recvmsg_payload_length(r0, r1, r2)
            return r0
    }

    public static native void nio_uring_prep_openat2(long r0, int r2, long r3, long r5);

    public static void io_uring_prep_openat2(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r8, int r9, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r10, @org.lwjgl.system.NativeType("struct open_how *") org.lwjgl.system.linux.OpenHow r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r10
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r11
            long r3 = r3.address()
            nio_uring_prep_openat2(r0, r1, r2, r3)
            return
    }

    public static void io_uring_prep_openat2(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r8, int r9, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r10, @org.lwjgl.system.NativeType("struct open_how *") org.lwjgl.system.linux.OpenHow r11) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r12 = r0
            r0 = r12
            int r0 = r0.getPointer()
            r13 = r0
            r0 = r12
            r1 = r10
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L33
            r0 = r12
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L33
            r14 = r0
            r0 = r8
            long r0 = r0.address()     // Catch: java.lang.Throwable -> L33
            r1 = r9
            r2 = r14
            r3 = r11
            long r3 = r3.address()     // Catch: java.lang.Throwable -> L33
            nio_uring_prep_openat2(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L33
            r0 = r12
            r1 = r13
            r0.setPointer(r1)
            goto L3f
        L33:
            r16 = move-exception
            r0 = r12
            r1 = r13
            r0.setPointer(r1)
            r0 = r16
            throw r0
        L3f:
            return
    }

    public static native void nio_uring_prep_openat2_direct(long r0, int r2, long r3, long r5, int r7);

    public static void io_uring_prep_openat2_direct(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r9, int r10, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r11, @org.lwjgl.system.NativeType("struct open_how *") org.lwjgl.system.linux.OpenHow r12, @org.lwjgl.system.NativeType("unsigned int") int r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r11
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            long r3 = r3.address()
            r4 = r13
            nio_uring_prep_openat2_direct(r0, r1, r2, r3, r4)
            return
    }

    public static void io_uring_prep_openat2_direct(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r9, int r10, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r11, @org.lwjgl.system.NativeType("struct open_how *") org.lwjgl.system.linux.OpenHow r12, @org.lwjgl.system.NativeType("unsigned int") int r13) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r14 = r0
            r0 = r14
            int r0 = r0.getPointer()
            r15 = r0
            r0 = r14
            r1 = r11
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L35
            r0 = r14
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L35
            r16 = r0
            r0 = r9
            long r0 = r0.address()     // Catch: java.lang.Throwable -> L35
            r1 = r10
            r2 = r16
            r3 = r12
            long r3 = r3.address()     // Catch: java.lang.Throwable -> L35
            r4 = r13
            nio_uring_prep_openat2_direct(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L35
            r0 = r14
            r1 = r15
            r0.setPointer(r1)
            goto L41
        L35:
            r18 = move-exception
            r0 = r14
            r1 = r15
            r0.setPointer(r1)
            r0 = r18
            throw r0
        L41:
            return
    }

    public static native void nio_uring_prep_epoll_ctl(long r0, int r2, int r3, int r4, long r5);

    public static void io_uring_prep_epoll_ctl(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r8, int r9, int r10, int r11, @org.lwjgl.system.NativeType("struct epoll_event *") org.lwjgl.system.linux.EpollEvent r12) {
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            long r4 = r4.address()
            nio_uring_prep_epoll_ctl(r0, r1, r2, r3, r4)
            return
    }

    public static native void nio_uring_prep_provide_buffers(long r0, long r2, int r4, int r5, int r6, int r7);

    public static void io_uring_prep_provide_buffers(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r9, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r10, int r11, int r12, int r13) {
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r10
            int r2 = r2.remaining()
            r3 = r11
            r4 = r12
            r5 = r13
            nio_uring_prep_provide_buffers(r0, r1, r2, r3, r4, r5)
            return
    }

    public static native void nio_uring_prep_remove_buffers(long r0, int r2, int r3);

    public static void io_uring_prep_remove_buffers(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r5, int r6, int r7) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nio_uring_prep_remove_buffers(r0, r1, r2)
            return
    }

    public static native void nio_uring_prep_shutdown(long r0, int r2, int r3);

    public static void io_uring_prep_shutdown(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r5, int r6, int r7) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nio_uring_prep_shutdown(r0, r1, r2)
            return
    }

    public static native void nio_uring_prep_unlinkat(long r0, int r2, long r3, int r5);

    public static void io_uring_prep_unlinkat(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r7, int r8, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r9, int r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r9
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r10
            nio_uring_prep_unlinkat(r0, r1, r2, r3)
            return
    }

    public static void io_uring_prep_unlinkat(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r7, int r8, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r9, int r10) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r11 = r0
            r0 = r11
            int r0 = r0.getPointer()
            r12 = r0
            r0 = r11
            r1 = r9
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L30
            r0 = r11
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L30
            r13 = r0
            r0 = r7
            long r0 = r0.address()     // Catch: java.lang.Throwable -> L30
            r1 = r8
            r2 = r13
            r3 = r10
            nio_uring_prep_unlinkat(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L30
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            goto L3c
        L30:
            r15 = move-exception
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r15
            throw r0
        L3c:
            return
    }

    public static native void nio_uring_prep_unlink(long r0, long r2, int r4);

    public static void io_uring_prep_unlink(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r6, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r7, int r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r8
            nio_uring_prep_unlink(r0, r1, r2)
            return
    }

    public static void io_uring_prep_unlink(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r6, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r7, int r8) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r9 = r0
            r0 = r9
            int r0 = r0.getPointer()
            r10 = r0
            r0 = r9
            r1 = r7
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L2a
            r11 = r0
            r0 = r6
            long r0 = r0.address()     // Catch: java.lang.Throwable -> L2a
            r1 = r11
            r2 = r8
            nio_uring_prep_unlink(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            goto L35
        L2a:
            r13 = move-exception
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r13
            throw r0
        L35:
            return
    }

    public static native void nio_uring_prep_renameat(long r0, int r2, long r3, int r5, long r6, int r8);

    public static void io_uring_prep_renameat(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r10, int r11, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r12, int r13, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r14, @org.lwjgl.system.NativeType("unsigned int") int r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r12
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r14
            org.lwjgl.system.Checks.checkNT1(r0)
        Lf:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r13
            r4 = r14
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r15
            nio_uring_prep_renameat(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void io_uring_prep_renameat(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r10, int r11, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r12, int r13, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r14, @org.lwjgl.system.NativeType("unsigned int") int r15) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r16 = r0
            r0 = r16
            int r0 = r0.getPointer()
            r17 = r0
            r0 = r16
            r1 = r12
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L44
            r0 = r16
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L44
            r18 = r0
            r0 = r16
            r1 = r14
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L44
            r0 = r16
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L44
            r20 = r0
            r0 = r10
            long r0 = r0.address()     // Catch: java.lang.Throwable -> L44
            r1 = r11
            r2 = r18
            r3 = r13
            r4 = r20
            r5 = r15
            nio_uring_prep_renameat(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L44
            r0 = r16
            r1 = r17
            r0.setPointer(r1)
            goto L50
        L44:
            r22 = move-exception
            r0 = r16
            r1 = r17
            r0.setPointer(r1)
            r0 = r22
            throw r0
        L50:
            return
    }

    public static native void nio_uring_prep_rename(long r0, long r2, long r4);

    public static void io_uring_prep_rename(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r7, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r8, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r8
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r9
            org.lwjgl.system.Checks.checkNT1(r0)
        Le:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nio_uring_prep_rename(r0, r1, r2)
            return
    }

    public static void io_uring_prep_rename(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r7, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r8, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r9) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r10 = r0
            r0 = r10
            int r0 = r0.getPointer()
            r11 = r0
            r0 = r10
            r1 = r8
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L38
            r0 = r10
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L38
            r12 = r0
            r0 = r10
            r1 = r9
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L38
            r0 = r10
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L38
            r14 = r0
            r0 = r7
            long r0 = r0.address()     // Catch: java.lang.Throwable -> L38
            r1 = r12
            r2 = r14
            nio_uring_prep_rename(r0, r1, r2)     // Catch: java.lang.Throwable -> L38
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            goto L43
        L38:
            r16 = move-exception
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            r0 = r16
            throw r0
        L43:
            return
    }

    public static native void nio_uring_prep_sync_file_range(long r0, int r2, int r3, int r4, int r5);

    public static void io_uring_prep_sync_file_range(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r7, int r8, @org.lwjgl.system.NativeType("unsigned int") int r9, int r10, int r11) {
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            nio_uring_prep_sync_file_range(r0, r1, r2, r3, r4)
            return
    }

    public static native void nio_uring_prep_mkdirat(long r0, int r2, long r3, int r5);

    public static void io_uring_prep_mkdirat(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r7, int r8, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r9, int r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r9
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r10
            nio_uring_prep_mkdirat(r0, r1, r2, r3)
            return
    }

    public static void io_uring_prep_mkdirat(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r7, int r8, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r9, int r10) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r11 = r0
            r0 = r11
            int r0 = r0.getPointer()
            r12 = r0
            r0 = r11
            r1 = r9
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L30
            r0 = r11
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L30
            r13 = r0
            r0 = r7
            long r0 = r0.address()     // Catch: java.lang.Throwable -> L30
            r1 = r8
            r2 = r13
            r3 = r10
            nio_uring_prep_mkdirat(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L30
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            goto L3c
        L30:
            r15 = move-exception
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r15
            throw r0
        L3c:
            return
    }

    public static native void nio_uring_prep_mkdir(long r0, long r2, int r4);

    public static void io_uring_prep_mkdir(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r6, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r7, int r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r8
            nio_uring_prep_mkdir(r0, r1, r2)
            return
    }

    public static void io_uring_prep_mkdir(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r6, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r7, int r8) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r9 = r0
            r0 = r9
            int r0 = r0.getPointer()
            r10 = r0
            r0 = r9
            r1 = r7
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L2a
            r11 = r0
            r0 = r6
            long r0 = r0.address()     // Catch: java.lang.Throwable -> L2a
            r1 = r11
            r2 = r8
            nio_uring_prep_mkdir(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            goto L35
        L2a:
            r13 = move-exception
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r13
            throw r0
        L35:
            return
    }

    public static native void nio_uring_prep_symlinkat(long r0, long r2, int r4, long r5);

    public static void io_uring_prep_symlinkat(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r8, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r9, int r10, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r9
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r11
            org.lwjgl.system.Checks.checkNT1(r0)
        Le:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r10
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nio_uring_prep_symlinkat(r0, r1, r2, r3)
            return
    }

    public static void io_uring_prep_symlinkat(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r8, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r9, int r10, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r11) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r12 = r0
            r0 = r12
            int r0 = r0.getPointer()
            r13 = r0
            r0 = r12
            r1 = r9
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L40
            r0 = r12
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L40
            r14 = r0
            r0 = r12
            r1 = r11
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L40
            r0 = r12
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L40
            r16 = r0
            r0 = r8
            long r0 = r0.address()     // Catch: java.lang.Throwable -> L40
            r1 = r14
            r2 = r10
            r3 = r16
            nio_uring_prep_symlinkat(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L40
            r0 = r12
            r1 = r13
            r0.setPointer(r1)
            goto L4c
        L40:
            r18 = move-exception
            r0 = r12
            r1 = r13
            r0.setPointer(r1)
            r0 = r18
            throw r0
        L4c:
            return
    }

    public static native void nio_uring_prep_symlink(long r0, long r2, long r4);

    public static void io_uring_prep_symlink(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r7, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r8, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r8
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r9
            org.lwjgl.system.Checks.checkNT1(r0)
        Le:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nio_uring_prep_symlink(r0, r1, r2)
            return
    }

    public static void io_uring_prep_symlink(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r7, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r8, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r9) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r10 = r0
            r0 = r10
            int r0 = r0.getPointer()
            r11 = r0
            r0 = r10
            r1 = r8
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L38
            r0 = r10
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L38
            r12 = r0
            r0 = r10
            r1 = r9
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L38
            r0 = r10
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L38
            r14 = r0
            r0 = r7
            long r0 = r0.address()     // Catch: java.lang.Throwable -> L38
            r1 = r12
            r2 = r14
            nio_uring_prep_symlink(r0, r1, r2)     // Catch: java.lang.Throwable -> L38
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            goto L43
        L38:
            r16 = move-exception
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            r0 = r16
            throw r0
        L43:
            return
    }

    public static native void nio_uring_prep_linkat(long r0, int r2, long r3, int r5, long r6, int r8);

    public static void io_uring_prep_linkat(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r10, int r11, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r12, int r13, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r14, int r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r12
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r14
            org.lwjgl.system.Checks.checkNT1(r0)
        Lf:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r13
            r4 = r14
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r15
            nio_uring_prep_linkat(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void io_uring_prep_linkat(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r10, int r11, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r12, int r13, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r14, int r15) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r16 = r0
            r0 = r16
            int r0 = r0.getPointer()
            r17 = r0
            r0 = r16
            r1 = r12
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L44
            r0 = r16
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L44
            r18 = r0
            r0 = r16
            r1 = r14
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L44
            r0 = r16
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L44
            r20 = r0
            r0 = r10
            long r0 = r0.address()     // Catch: java.lang.Throwable -> L44
            r1 = r11
            r2 = r18
            r3 = r13
            r4 = r20
            r5 = r15
            nio_uring_prep_linkat(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L44
            r0 = r16
            r1 = r17
            r0.setPointer(r1)
            goto L50
        L44:
            r22 = move-exception
            r0 = r16
            r1 = r17
            r0.setPointer(r1)
            r0 = r22
            throw r0
        L50:
            return
    }

    public static native void nio_uring_prep_link(long r0, long r2, long r4, int r6);

    public static void io_uring_prep_link(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r8, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r9, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r10, int r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r9
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r10
            org.lwjgl.system.Checks.checkNT1(r0)
        Le:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r11
            nio_uring_prep_link(r0, r1, r2, r3)
            return
    }

    public static void io_uring_prep_link(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r8, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r9, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r10, int r11) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r12 = r0
            r0 = r12
            int r0 = r0.getPointer()
            r13 = r0
            r0 = r12
            r1 = r9
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L40
            r0 = r12
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L40
            r14 = r0
            r0 = r12
            r1 = r10
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L40
            r0 = r12
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L40
            r16 = r0
            r0 = r8
            long r0 = r0.address()     // Catch: java.lang.Throwable -> L40
            r1 = r14
            r2 = r16
            r3 = r11
            nio_uring_prep_link(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L40
            r0 = r12
            r1 = r13
            r0.setPointer(r1)
            goto L4c
        L40:
            r18 = move-exception
            r0 = r12
            r1 = r13
            r0.setPointer(r1)
            r0 = r18
            throw r0
        L4c:
            return
    }

    public static native void nio_uring_prep_msg_ring_cqe_flags(long r0, int r2, int r3, long r4, int r6, int r7);

    public static void io_uring_prep_msg_ring_cqe_flags(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r9, int r10, @org.lwjgl.system.NativeType("unsigned int") int r11, @org.lwjgl.system.NativeType("__u64") long r12, @org.lwjgl.system.NativeType("unsigned int") int r14, @org.lwjgl.system.NativeType("unsigned int") int r15) {
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r14
            r5 = r15
            nio_uring_prep_msg_ring_cqe_flags(r0, r1, r2, r3, r4, r5)
            return
    }

    public static native void nio_uring_prep_msg_ring(long r0, int r2, int r3, long r4, int r6);

    public static void io_uring_prep_msg_ring(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r8, int r9, @org.lwjgl.system.NativeType("unsigned int") int r10, @org.lwjgl.system.NativeType("__u64") long r11, @org.lwjgl.system.NativeType("unsigned int") int r13) {
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r13
            nio_uring_prep_msg_ring(r0, r1, r2, r3, r4)
            return
    }

    public static native void nio_uring_prep_msg_ring_fd(long r0, int r2, int r3, int r4, long r5, int r7);

    public static void io_uring_prep_msg_ring_fd(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r9, int r10, int r11, int r12, @org.lwjgl.system.NativeType("__u64") long r13, @org.lwjgl.system.NativeType("unsigned int") int r15) {
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r15
            nio_uring_prep_msg_ring_fd(r0, r1, r2, r3, r4, r5)
            return
    }

    public static native void nio_uring_prep_msg_ring_fd_alloc(long r0, int r2, int r3, long r4, int r6);

    public static void io_uring_prep_msg_ring_fd_alloc(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r8, int r9, int r10, @org.lwjgl.system.NativeType("__u64") long r11, @org.lwjgl.system.NativeType("unsigned int") int r13) {
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r13
            nio_uring_prep_msg_ring_fd_alloc(r0, r1, r2, r3, r4)
            return
    }

    public static native void nio_uring_prep_getxattr(long r0, long r2, long r4, long r6, int r8);

    public static void io_uring_prep_getxattr(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r10, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r11, @org.lwjgl.system.NativeType("char *") java.nio.ByteBuffer r12, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r11
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r13
            org.lwjgl.system.Checks.checkNT1(r0)
        Le:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r12
            int r4 = r4.remaining()
            nio_uring_prep_getxattr(r0, r1, r2, r3, r4)
            return
    }

    public static void io_uring_prep_getxattr(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r10, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r11, @org.lwjgl.system.NativeType("char *") java.nio.ByteBuffer r12, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r13) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r14 = r0
            r0 = r14
            int r0 = r0.getPointer()
            r15 = r0
            r0 = r14
            r1 = r11
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L47
            r0 = r14
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L47
            r16 = r0
            r0 = r14
            r1 = r13
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L47
            r0 = r14
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L47
            r18 = r0
            r0 = r10
            long r0 = r0.address()     // Catch: java.lang.Throwable -> L47
            r1 = r16
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L47
            r3 = r18
            r4 = r12
            int r4 = r4.remaining()     // Catch: java.lang.Throwable -> L47
            nio_uring_prep_getxattr(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L47
            r0 = r14
            r1 = r15
            r0.setPointer(r1)
            goto L53
        L47:
            r20 = move-exception
            r0 = r14
            r1 = r15
            r0.setPointer(r1)
            r0 = r20
            throw r0
        L53:
            return
    }

    public static native void nio_uring_prep_setxattr(long r0, long r2, long r4, long r6, int r8, int r9);

    public static void io_uring_prep_setxattr(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r11, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r12, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r13, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r14, int r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r12
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r14
            org.lwjgl.system.Checks.checkNT1(r0)
        Le:
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r13
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r14
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r15
            r5 = r13
            int r5 = r5.remaining()
            nio_uring_prep_setxattr(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void io_uring_prep_setxattr(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r11, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r12, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r13, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r14, int r15) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r16 = r0
            r0 = r16
            int r0 = r0.getPointer()
            r17 = r0
            r0 = r16
            r1 = r12
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L49
            r0 = r16
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L49
            r18 = r0
            r0 = r16
            r1 = r14
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L49
            r0 = r16
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L49
            r20 = r0
            r0 = r11
            long r0 = r0.address()     // Catch: java.lang.Throwable -> L49
            r1 = r18
            r2 = r13
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L49
            r3 = r20
            r4 = r15
            r5 = r13
            int r5 = r5.remaining()     // Catch: java.lang.Throwable -> L49
            nio_uring_prep_setxattr(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L49
            r0 = r16
            r1 = r17
            r0.setPointer(r1)
            goto L55
        L49:
            r22 = move-exception
            r0 = r16
            r1 = r17
            r0.setPointer(r1)
            r0 = r22
            throw r0
        L55:
            return
    }

    public static native void nio_uring_prep_fgetxattr(long r0, int r2, long r3, long r5, int r7);

    public static void io_uring_prep_fgetxattr(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r9, int r10, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r11, @org.lwjgl.system.NativeType("char *") java.nio.ByteBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r11
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r12
            int r4 = r4.remaining()
            nio_uring_prep_fgetxattr(r0, r1, r2, r3, r4)
            return
    }

    public static void io_uring_prep_fgetxattr(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r9, int r10, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r11, @org.lwjgl.system.NativeType("char *") java.nio.ByteBuffer r12) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r13 = r0
            r0 = r13
            int r0 = r0.getPointer()
            r14 = r0
            r0 = r13
            r1 = r11
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L37
            r0 = r13
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L37
            r15 = r0
            r0 = r9
            long r0 = r0.address()     // Catch: java.lang.Throwable -> L37
            r1 = r10
            r2 = r15
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L37
            r4 = r12
            int r4 = r4.remaining()     // Catch: java.lang.Throwable -> L37
            nio_uring_prep_fgetxattr(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L37
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            goto L43
        L37:
            r17 = move-exception
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            r0 = r17
            throw r0
        L43:
            return
    }

    public static native void nio_uring_prep_fsetxattr(long r0, int r2, long r3, long r5, int r7, int r8);

    public static void io_uring_prep_fsetxattr(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r10, int r11, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r12, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r13, int r14) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r12
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r14
            r5 = r13
            int r5 = r5.remaining()
            nio_uring_prep_fsetxattr(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void io_uring_prep_fsetxattr(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r10, int r11, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r12, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r13, int r14) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r15 = r0
            r0 = r15
            int r0 = r0.getPointer()
            r16 = r0
            r0 = r15
            r1 = r12
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L39
            r0 = r15
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L39
            r17 = r0
            r0 = r10
            long r0 = r0.address()     // Catch: java.lang.Throwable -> L39
            r1 = r11
            r2 = r17
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L39
            r4 = r14
            r5 = r13
            int r5 = r5.remaining()     // Catch: java.lang.Throwable -> L39
            nio_uring_prep_fsetxattr(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L39
            r0 = r15
            r1 = r16
            r0.setPointer(r1)
            goto L45
        L39:
            r19 = move-exception
            r0 = r15
            r1 = r16
            r0.setPointer(r1)
            r0 = r19
            throw r0
        L45:
            return
    }

    public static native void nio_uring_prep_socket(long r0, int r2, int r3, int r4, int r5);

    public static void io_uring_prep_socket(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r7, int r8, int r9, int r10, @org.lwjgl.system.NativeType("unsigned int") int r11) {
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            nio_uring_prep_socket(r0, r1, r2, r3, r4)
            return
    }

    public static native void nio_uring_prep_socket_direct(long r0, int r2, int r3, int r4, int r5, int r6);

    public static void io_uring_prep_socket_direct(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r8, int r9, int r10, int r11, @org.lwjgl.system.NativeType("unsigned int") int r12, @org.lwjgl.system.NativeType("unsigned int") int r13) {
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            nio_uring_prep_socket_direct(r0, r1, r2, r3, r4, r5)
            return
    }

    public static native void nio_uring_prep_socket_direct_alloc(long r0, int r2, int r3, int r4, int r5);

    public static void io_uring_prep_socket_direct_alloc(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r7, int r8, int r9, int r10, @org.lwjgl.system.NativeType("unsigned int") int r11) {
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            nio_uring_prep_socket_direct_alloc(r0, r1, r2, r3, r4)
            return
    }

    public static native int nio_uring_sq_ready(long r0);

    @org.lwjgl.system.NativeType("unsigned int")
    public static int io_uring_sq_ready(@org.lwjgl.system.NativeType("struct io_uring const *") org.lwjgl.system.linux.liburing.IOURing r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Ld
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.liburing.IOURing.validate(r0)
        Ld:
            r0 = r3
            long r0 = r0.address()
            int r0 = nio_uring_sq_ready(r0)
            return r0
    }

    public static native int nio_uring_sq_space_left(long r0);

    @org.lwjgl.system.NativeType("unsigned int")
    public static int io_uring_sq_space_left(@org.lwjgl.system.NativeType("struct io_uring const *") org.lwjgl.system.linux.liburing.IOURing r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Ld
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.liburing.IOURing.validate(r0)
        Ld:
            r0 = r3
            long r0 = r0.address()
            int r0 = nio_uring_sq_space_left(r0)
            return r0
    }

    public static native int nio_uring_sqring_wait(long r0);

    public static int io_uring_sqring_wait(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r3) {
            r0 = r3
            long r0 = r0.address()
            int r0 = nio_uring_sqring_wait(r0)
            return r0
    }

    public static native int nio_uring_cq_ready(long r0);

    @org.lwjgl.system.NativeType("unsigned int")
    public static int io_uring_cq_ready(@org.lwjgl.system.NativeType("struct io_uring const *") org.lwjgl.system.linux.liburing.IOURing r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Ld
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.liburing.IOURing.validate(r0)
        Ld:
            r0 = r3
            long r0 = r0.address()
            int r0 = nio_uring_cq_ready(r0)
            return r0
    }

    public static native boolean nio_uring_cq_has_overflow(long r0);

    @org.lwjgl.system.NativeType("bool")
    public static boolean io_uring_cq_has_overflow(@org.lwjgl.system.NativeType("struct io_uring const *") org.lwjgl.system.linux.liburing.IOURing r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Ld
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.liburing.IOURing.validate(r0)
        Ld:
            r0 = r3
            long r0 = r0.address()
            boolean r0 = nio_uring_cq_has_overflow(r0)
            return r0
    }

    public static native boolean nio_uring_cq_eventfd_enabled(long r0);

    @org.lwjgl.system.NativeType("bool")
    public static boolean io_uring_cq_eventfd_enabled(@org.lwjgl.system.NativeType("struct io_uring const *") org.lwjgl.system.linux.liburing.IOURing r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Ld
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.liburing.IOURing.validate(r0)
        Ld:
            r0 = r3
            long r0 = r0.address()
            boolean r0 = nio_uring_cq_eventfd_enabled(r0)
            return r0
    }

    public static native int nio_uring_cq_eventfd_toggle(long r0, boolean r2);

    public static int io_uring_cq_eventfd_toggle(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r4, @org.lwjgl.system.NativeType("bool") boolean r5) {
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            int r0 = nio_uring_cq_eventfd_toggle(r0, r1)
            return r0
    }

    public static native int nio_uring_wait_cqe_nr(long r0, long r2, int r4);

    public static int io_uring_wait_cqe_nr(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r6, @org.lwjgl.system.NativeType("struct io_uring_cqe **") org.lwjgl.PointerBuffer r7) {
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r2 = r2.remaining()
            int r0 = nio_uring_wait_cqe_nr(r0, r1, r2)
            return r0
    }

    public static native int nio_uring_peek_cqe(long r0, long r2);

    public static int io_uring_peek_cqe(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r5, @org.lwjgl.system.NativeType("struct io_uring_cqe **") org.lwjgl.PointerBuffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            int r0 = nio_uring_peek_cqe(r0, r1)
            return r0
    }

    public static native int nio_uring_wait_cqe(long r0, long r2);

    public static int io_uring_wait_cqe(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r5, @org.lwjgl.system.NativeType("struct io_uring_cqe **") org.lwjgl.PointerBuffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            int r0 = nio_uring_wait_cqe(r0, r1)
            return r0
    }

    public static native void nio_uring_buf_ring_advance(long r0, int r2);

    public static void io_uring_buf_ring_advance(@org.lwjgl.system.NativeType("struct io_uring_buf_ring *") org.lwjgl.system.linux.liburing.IOURingBufRing r4, int r5) {
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nio_uring_buf_ring_advance(r0, r1)
            return
    }

    public static native void nio_uring_buf_ring_cq_advance(long r0, long r2, int r4);

    public static void io_uring_buf_ring_cq_advance(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r6, @org.lwjgl.system.NativeType("struct io_uring_buf_ring *") org.lwjgl.system.linux.liburing.IOURingBufRing r7, int r8) {
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            nio_uring_buf_ring_cq_advance(r0, r1, r2)
            return
    }

    public static native long nio_uring_get_sqe(long r0);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("struct io_uring_sqe *")
    public static org.lwjgl.system.linux.liburing.IOURingSQE io_uring_get_sqe(@org.lwjgl.system.NativeType("struct io_uring *") org.lwjgl.system.linux.liburing.IOURing r3) {
            r0 = r3
            long r0 = r0.address()
            long r0 = nio_uring_get_sqe(r0)
            r4 = r0
            r0 = r4
            org.lwjgl.system.linux.liburing.IOURingSQE r0 = org.lwjgl.system.linux.liburing.IOURingSQE.createSafe(r0)
            return r0
    }

    public static native int io_uring_mlock_size(@org.lwjgl.system.NativeType("unsigned") int r0, @org.lwjgl.system.NativeType("unsigned") int r1);

    public static native int nio_uring_mlock_size_params(int r0, long r1);

    public static int io_uring_mlock_size_params(@org.lwjgl.system.NativeType("unsigned") int r4, @org.lwjgl.system.NativeType("struct io_uring_params *") org.lwjgl.system.linux.liburing.IOURingParams r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            int r0 = nio_uring_mlock_size_params(r0, r1)
            return r0
    }

    public static native int io_uring_major_version();

    public static native int io_uring_minor_version();

    @org.lwjgl.system.NativeType("bool")
    public static native boolean io_uring_check_version(int r0, int r1);

    public static int io_uring_buf_ring_mask(@org.lwjgl.system.NativeType("__u32") int r3) {
            r0 = r3
            r1 = 1
            int r0 = r0 - r1
            return r0
    }

    public static void io_uring_buf_ring_init(@org.lwjgl.system.NativeType("struct io_uring_buf_ring *") org.lwjgl.system.linux.liburing.IOURingBufRing r3) {
            r0 = r3
            r1 = 0
            org.lwjgl.system.linux.liburing.IOURingBufRing r0 = r0.tail(r1)
            return
    }

    public static void io_uring_buf_ring_add(@org.lwjgl.system.NativeType("struct io_uring_buf_ring *") org.lwjgl.system.linux.liburing.IOURingBufRing r4, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r5, @org.lwjgl.system.NativeType("unsigned short") short r6, int r7, int r8) {
            r0 = r4
            r1 = r4
            short r1 = r1.tail()
            r2 = r8
            int r1 = r1 + r2
            r2 = r7
            r1 = r1 & r2
            org.lwjgl.system.linux.liburing.IOURingBuf r0 = r0.bufs(r1)
            r9 = r0
            r0 = r9
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.linux.liburing.IOURingBuf r0 = r0.addr(r1)
            r0 = r9
            r1 = r5
            int r1 = r1.remaining()
            org.lwjgl.system.linux.liburing.IOURingBuf r0 = r0.len(r1)
            r0 = r9
            r1 = r6
            org.lwjgl.system.linux.liburing.IOURingBuf r0 = r0.bid(r1)
            return
    }

    static {
            org.lwjgl.system.Library.initialize()
            return
    }
}
