package org.lwjgl.system.linux.liburing;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingSQE.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingSQE.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingSQE.class */
@org.lwjgl.system.NativeType("struct io_uring_sqe")
public class IOURingSQE extends org.lwjgl.system.Struct<org.lwjgl.system.linux.liburing.IOURingSQE> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int OPCODE = 0;
    public static final int FLAGS = 0;
    public static final int IOPRIO = 0;
    public static final int FD = 0;
    public static final int OFF = 0;
    public static final int ADDR2 = 0;
    public static final int CMD_OP = 0;
    public static final int __PAD1 = 0;
    public static final int ADDR = 0;
    public static final int SPLICE_OFF_IN = 0;
    public static final int LEN = 0;
    public static final int RW_FLAGS = 0;
    public static final int FSYNC_FLAGS = 0;
    public static final int POLL_EVENTS = 0;
    public static final int POLL32_EVENTS = 0;
    public static final int SYNC_RANGE_FLAGS = 0;
    public static final int MSG_FLAGS = 0;
    public static final int TIMEOUT_FLAGS = 0;
    public static final int ACCEPT_FLAGS = 0;
    public static final int CANCEL_FLAGS = 0;
    public static final int OPEN_FLAGS = 0;
    public static final int STATX_FLAGS = 0;
    public static final int FADVISE_ADVICE = 0;
    public static final int SPLICE_FLAGS = 0;
    public static final int RENAME_FLAGS = 0;
    public static final int UNLINK_FLAGS = 0;
    public static final int HARDLINK_FLAGS = 0;
    public static final int XATTR_FLAGS = 0;
    public static final int MSG_RING_FLAGS = 0;
    public static final int URING_CMD_FLAGS = 0;
    public static final int USER_DATA = 0;
    public static final int BUF_INDEX = 0;
    public static final int BUF_GROUP = 0;
    public static final int PERSONALITY = 0;
    public static final int SPLICE_FD_IN = 0;
    public static final int FILE_INDEX = 0;
    public static final int ADDR_LEN = 0;
    public static final int __PAD3 = 0;
    public static final int ADDR3 = 0;
    public static final int __PAD2 = 0;
    public static final int CMD = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingSQE$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingSQE$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingSQE$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.linux.liburing.IOURingSQE, org.lwjgl.system.linux.liburing.IOURingSQE.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.linux.liburing.IOURingSQE ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.SIZEOF
                int r2 = r2 / r3
                r0.<init>(r1, r2)
                return
        }

        public Buffer(long r10, int r12) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = 0
                r3 = -1
                r4 = 0
                r5 = r12
                r6 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        Buffer(long r10, @javax.annotation.Nullable java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
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
        protected org.lwjgl.system.linux.liburing.IOURingSQE.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.system.linux.liburing.IOURingSQE getElementFactory() {
                r2 = this;
                org.lwjgl.system.linux.liburing.IOURingSQE r0 = org.lwjgl.system.linux.liburing.IOURingSQE.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("__u8")
        public byte opcode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.system.linux.liburing.IOURingSQE.nopcode(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u8")
        public byte flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.system.linux.liburing.IOURingSQE.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u16")
        public short ioprio() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.system.linux.liburing.IOURingSQE.nioprio(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__s32")
        public int fd() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingSQE.nfd(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u64")
        public long off() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.liburing.IOURingSQE.noff(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u64")
        public long addr2() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.liburing.IOURingSQE.naddr2(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int cmd_op() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingSQE.ncmd_op(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int __pad1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingSQE.n__pad1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u64")
        public long addr() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.liburing.IOURingSQE.naddr(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u64")
        public long splice_off_in() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.liburing.IOURingSQE.nsplice_off_in(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int len() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingSQE.nlen(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__kernel_rwf_t")
        public int rw_flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingSQE.nrw_flags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int fsync_flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingSQE.nfsync_flags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u16")
        public short poll_events() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.system.linux.liburing.IOURingSQE.npoll_events(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int poll32_events() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingSQE.npoll32_events(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int sync_range_flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingSQE.nsync_range_flags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int msg_flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingSQE.nmsg_flags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int timeout_flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingSQE.ntimeout_flags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int accept_flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingSQE.naccept_flags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int cancel_flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingSQE.ncancel_flags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int open_flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingSQE.nopen_flags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int statx_flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingSQE.nstatx_flags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int fadvise_advice() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingSQE.nfadvise_advice(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int splice_flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingSQE.nsplice_flags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int rename_flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingSQE.nrename_flags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int unlink_flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingSQE.nunlink_flags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int hardlink_flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingSQE.nhardlink_flags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int xattr_flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingSQE.nxattr_flags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int msg_ring_flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingSQE.nmsg_ring_flags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int uring_cmd_flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingSQE.nuring_cmd_flags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u64")
        public long user_data() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.liburing.IOURingSQE.nuser_data(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u16")
        public short buf_index() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.system.linux.liburing.IOURingSQE.nbuf_index(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u16")
        public short buf_group() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.system.linux.liburing.IOURingSQE.nbuf_group(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u16")
        public short personality() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.system.linux.liburing.IOURingSQE.npersonality(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__s32")
        public int splice_fd_in() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingSQE.nsplice_fd_in(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int file_index() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingSQE.nfile_index(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u16")
        public short addr_len() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.system.linux.liburing.IOURingSQE.naddr_len(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u16[1]")
        public java.nio.ShortBuffer __pad3() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ShortBuffer r0 = org.lwjgl.system.linux.liburing.IOURingSQE.n__pad3(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u16")
        public short __pad3(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                short r0 = org.lwjgl.system.linux.liburing.IOURingSQE.n__pad3(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("__u64")
        public long addr3() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.liburing.IOURingSQE.naddr3(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u64[1]")
        public java.nio.LongBuffer __pad2() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.LongBuffer r0 = org.lwjgl.system.linux.liburing.IOURingSQE.n__pad2(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u64")
        public long __pad2(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                long r0 = org.lwjgl.system.linux.liburing.IOURingSQE.n__pad2(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("__u8[0]")
        public java.nio.ByteBuffer cmd() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.system.linux.liburing.IOURingSQE.ncmd(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u8")
        public byte cmd(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.system.linux.liburing.IOURingSQE.ncmd(r0, r1)
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer opcode(@org.lwjgl.system.NativeType("__u8") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQE.nopcode(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer flags(@org.lwjgl.system.NativeType("__u8") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQE.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer ioprio(@org.lwjgl.system.NativeType("__u16") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQE.nioprio(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer fd(@org.lwjgl.system.NativeType("__s32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQE.nfd(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer off(@org.lwjgl.system.NativeType("__u64") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.liburing.IOURingSQE.noff(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer addr2(@org.lwjgl.system.NativeType("__u64") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.liburing.IOURingSQE.naddr2(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer cmd_op(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQE.ncmd_op(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer __pad1(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQE.n__pad1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer addr(@org.lwjgl.system.NativeType("__u64") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.liburing.IOURingSQE.naddr(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer splice_off_in(@org.lwjgl.system.NativeType("__u64") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.liburing.IOURingSQE.nsplice_off_in(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer len(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQE.nlen(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer rw_flags(@org.lwjgl.system.NativeType("__kernel_rwf_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQE.nrw_flags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer fsync_flags(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQE.nfsync_flags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer poll_events(@org.lwjgl.system.NativeType("__u16") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQE.npoll_events(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer poll32_events(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQE.npoll32_events(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer sync_range_flags(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQE.nsync_range_flags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer msg_flags(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQE.nmsg_flags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer timeout_flags(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQE.ntimeout_flags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer accept_flags(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQE.naccept_flags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer cancel_flags(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQE.ncancel_flags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer open_flags(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQE.nopen_flags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer statx_flags(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQE.nstatx_flags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer fadvise_advice(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQE.nfadvise_advice(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer splice_flags(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQE.nsplice_flags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer rename_flags(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQE.nrename_flags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer unlink_flags(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQE.nunlink_flags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer hardlink_flags(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQE.nhardlink_flags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer xattr_flags(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQE.nxattr_flags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer msg_ring_flags(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQE.nmsg_ring_flags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer uring_cmd_flags(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQE.nuring_cmd_flags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer user_data(@org.lwjgl.system.NativeType("__u64") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.liburing.IOURingSQE.nuser_data(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer buf_index(@org.lwjgl.system.NativeType("__u16") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQE.nbuf_index(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer buf_group(@org.lwjgl.system.NativeType("__u16") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQE.nbuf_group(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer personality(@org.lwjgl.system.NativeType("__u16") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQE.npersonality(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer splice_fd_in(@org.lwjgl.system.NativeType("__s32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQE.nsplice_fd_in(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer file_index(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQE.nfile_index(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer addr_len(@org.lwjgl.system.NativeType("__u16") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQE.naddr_len(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer __pad3(@org.lwjgl.system.NativeType("__u16[1]") java.nio.ShortBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQE.n__pad3(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer __pad3(int r6, @org.lwjgl.system.NativeType("__u16") short r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.system.linux.liburing.IOURingSQE.n__pad3(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer addr3(@org.lwjgl.system.NativeType("__u64") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.liburing.IOURingSQE.naddr3(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer __pad2(@org.lwjgl.system.NativeType("__u64[1]") java.nio.LongBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQE.n__pad2(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer __pad2(int r7, @org.lwjgl.system.NativeType("__u64") long r8) {
                r6 = this;
                r0 = r6
                long r0 = r0.address()
                r1 = r7
                r2 = r8
                org.lwjgl.system.linux.liburing.IOURingSQE.n__pad2(r0, r1, r2)
                r0 = r6
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer cmd(@org.lwjgl.system.NativeType("__u8[0]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQE.ncmd(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQE.Buffer cmd(int r6, @org.lwjgl.system.NativeType("__u8") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.system.linux.liburing.IOURingSQE.ncmd(r0, r1, r2)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOURingSQE r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOURingSQE$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.linux.liburing.IOURingSQE r0 = org.lwjgl.system.linux.liburing.IOURingSQE.create(r0)
                org.lwjgl.system.linux.liburing.IOURingSQE.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected IOURingSQE(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.linux.liburing.IOURingSQE create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.linux.liburing.IOURingSQE r0 = new org.lwjgl.system.linux.liburing.IOURingSQE
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public IOURingSQE(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.linux.liburing.IOURingSQE.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("__u8")
    public byte opcode() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nopcode(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u8")
    public byte flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u16")
    public short ioprio() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nioprio(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__s32")
    public int fd() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nfd(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u64")
    public long off() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = noff(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u64")
    public long addr2() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = naddr2(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int cmd_op() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncmd_op(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int __pad1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = n__pad1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u64")
    public long addr() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = naddr(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u64")
    public long splice_off_in() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nsplice_off_in(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int len() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nlen(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__kernel_rwf_t")
    public int rw_flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nrw_flags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int fsync_flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nfsync_flags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u16")
    public short poll_events() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = npoll_events(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int poll32_events() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npoll32_events(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int sync_range_flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsync_range_flags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int msg_flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmsg_flags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int timeout_flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ntimeout_flags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int accept_flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = naccept_flags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int cancel_flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncancel_flags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int open_flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nopen_flags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int statx_flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nstatx_flags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int fadvise_advice() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nfadvise_advice(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int splice_flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsplice_flags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int rename_flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nrename_flags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int unlink_flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nunlink_flags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int hardlink_flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nhardlink_flags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int xattr_flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nxattr_flags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int msg_ring_flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmsg_ring_flags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int uring_cmd_flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nuring_cmd_flags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u64")
    public long user_data() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nuser_data(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u16")
    public short buf_index() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nbuf_index(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u16")
    public short buf_group() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nbuf_group(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u16")
    public short personality() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = npersonality(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__s32")
    public int splice_fd_in() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsplice_fd_in(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int file_index() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nfile_index(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u16")
    public short addr_len() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = naddr_len(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u16[1]")
    public java.nio.ShortBuffer __pad3() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ShortBuffer r0 = n__pad3(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u16")
    public short __pad3(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            short r0 = n__pad3(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("__u64")
    public long addr3() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = naddr3(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u64[1]")
    public java.nio.LongBuffer __pad2() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.LongBuffer r0 = n__pad2(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u64")
    public long __pad2(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            long r0 = n__pad2(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("__u8[0]")
    public java.nio.ByteBuffer cmd() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = ncmd(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u8")
    public byte cmd(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = ncmd(r0, r1)
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE opcode(@org.lwjgl.system.NativeType("__u8") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nopcode(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE flags(@org.lwjgl.system.NativeType("__u8") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE ioprio(@org.lwjgl.system.NativeType("__u16") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nioprio(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE fd(@org.lwjgl.system.NativeType("__s32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nfd(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE off(@org.lwjgl.system.NativeType("__u64") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            noff(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE addr2(@org.lwjgl.system.NativeType("__u64") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            naddr2(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE cmd_op(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncmd_op(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE __pad1(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            n__pad1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE addr(@org.lwjgl.system.NativeType("__u64") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            naddr(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE splice_off_in(@org.lwjgl.system.NativeType("__u64") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nsplice_off_in(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE len(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlen(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE rw_flags(@org.lwjgl.system.NativeType("__kernel_rwf_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nrw_flags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE fsync_flags(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nfsync_flags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE poll_events(@org.lwjgl.system.NativeType("__u16") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npoll_events(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE poll32_events(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npoll32_events(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE sync_range_flags(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsync_range_flags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE msg_flags(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmsg_flags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE timeout_flags(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntimeout_flags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE accept_flags(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            naccept_flags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE cancel_flags(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncancel_flags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE open_flags(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nopen_flags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE statx_flags(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstatx_flags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE fadvise_advice(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nfadvise_advice(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE splice_flags(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsplice_flags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE rename_flags(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nrename_flags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE unlink_flags(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nunlink_flags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE hardlink_flags(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nhardlink_flags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE xattr_flags(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nxattr_flags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE msg_ring_flags(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmsg_ring_flags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE uring_cmd_flags(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nuring_cmd_flags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE user_data(@org.lwjgl.system.NativeType("__u64") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nuser_data(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE buf_index(@org.lwjgl.system.NativeType("__u16") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbuf_index(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE buf_group(@org.lwjgl.system.NativeType("__u16") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbuf_group(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE personality(@org.lwjgl.system.NativeType("__u16") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npersonality(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE splice_fd_in(@org.lwjgl.system.NativeType("__s32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsplice_fd_in(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE file_index(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nfile_index(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE addr_len(@org.lwjgl.system.NativeType("__u16") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            naddr_len(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE __pad3(@org.lwjgl.system.NativeType("__u16[1]") java.nio.ShortBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            n__pad3(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE __pad3(int r6, @org.lwjgl.system.NativeType("__u16") short r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            n__pad3(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE addr3(@org.lwjgl.system.NativeType("__u64") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            naddr3(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE __pad2(@org.lwjgl.system.NativeType("__u64[1]") java.nio.LongBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            n__pad2(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE __pad2(int r7, @org.lwjgl.system.NativeType("__u64") long r8) {
            r6 = this;
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            n__pad2(r0, r1, r2)
            r0 = r6
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE cmd(@org.lwjgl.system.NativeType("__u8[0]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncmd(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE cmd(int r6, @org.lwjgl.system.NativeType("__u8") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            ncmd(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQE set(org.lwjgl.system.linux.liburing.IOURingSQE r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.system.linux.liburing.IOURingSQE.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingSQE malloc() {
            org.lwjgl.system.linux.liburing.IOURingSQE r0 = new org.lwjgl.system.linux.liburing.IOURingSQE
            r1 = r0
            int r2 = org.lwjgl.system.linux.liburing.IOURingSQE.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingSQE calloc() {
            org.lwjgl.system.linux.liburing.IOURingSQE r0 = new org.lwjgl.system.linux.liburing.IOURingSQE
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingSQE create() {
            int r0 = org.lwjgl.system.linux.liburing.IOURingSQE.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.linux.liburing.IOURingSQE r0 = new org.lwjgl.system.linux.liburing.IOURingSQE
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingSQE create(long r6) {
            org.lwjgl.system.linux.liburing.IOURingSQE r0 = new org.lwjgl.system.linux.liburing.IOURingSQE
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.liburing.IOURingSQE createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOURingSQE r0 = new org.lwjgl.system.linux.liburing.IOURingSQE
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingSQE.Buffer malloc(int r6) {
            org.lwjgl.system.linux.liburing.IOURingSQE$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingSQE$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingSQE.Buffer calloc(int r7) {
            org.lwjgl.system.linux.liburing.IOURingSQE$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingSQE$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingSQE.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.linux.liburing.IOURingSQE.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.linux.liburing.IOURingSQE$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingSQE$Buffer
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

    public static org.lwjgl.system.linux.liburing.IOURingSQE.Buffer create(long r6, int r8) {
            org.lwjgl.system.linux.liburing.IOURingSQE$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingSQE$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.liburing.IOURingSQE.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOURingSQE$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingSQE$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingSQE malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.linux.liburing.IOURingSQE r0 = new org.lwjgl.system.linux.liburing.IOURingSQE
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.ALIGNOF
            int r4 = org.lwjgl.system.linux.liburing.IOURingSQE.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingSQE calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.linux.liburing.IOURingSQE r0 = new org.lwjgl.system.linux.liburing.IOURingSQE
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.linux.liburing.IOURingSQE.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingSQE.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOURingSQE$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingSQE$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOURingSQE.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingSQE.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOURingSQE$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingSQE$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOURingSQE.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static byte nopcode(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.OPCODE
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static short nioprio(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.IOPRIO
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static int nfd(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.FD
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long noff(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.OFF
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long naddr2(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.ADDR2
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int ncmd_op(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.CMD_OP
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int n__pad1(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.__PAD1
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long naddr(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.ADDR
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long nsplice_off_in(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.SPLICE_OFF_IN
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int nlen(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.LEN
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nrw_flags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.RW_FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nfsync_flags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.FSYNC_FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static short npoll_events(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.POLL_EVENTS
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static int npoll32_events(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.POLL32_EVENTS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nsync_range_flags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.SYNC_RANGE_FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmsg_flags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.MSG_FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ntimeout_flags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.TIMEOUT_FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int naccept_flags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.ACCEPT_FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ncancel_flags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.CANCEL_FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nopen_flags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.OPEN_FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nstatx_flags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.STATX_FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nfadvise_advice(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.FADVISE_ADVICE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nsplice_flags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.SPLICE_FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nrename_flags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.RENAME_FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nunlink_flags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.UNLINK_FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nhardlink_flags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.HARDLINK_FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nxattr_flags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.XATTR_FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmsg_ring_flags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.MSG_RING_FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nuring_cmd_flags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.URING_CMD_FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nuser_data(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.USER_DATA
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static short nbuf_index(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.BUF_INDEX
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nbuf_group(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.BUF_GROUP
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short npersonality(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.PERSONALITY
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static int nsplice_fd_in(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.SPLICE_FD_IN
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nfile_index(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.FILE_INDEX
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static short naddr_len(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.ADDR_LEN
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static java.nio.ShortBuffer n__pad3(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingSQE.__PAD3
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 1
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBuffer(r0, r1)
            return r0
    }

    public static short n__pad3(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.__PAD3
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 1
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 2
            long r3 = r3 * r4
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static long naddr3(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.ADDR3
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static java.nio.LongBuffer n__pad2(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingSQE.__PAD2
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 1
            java.nio.LongBuffer r0 = org.lwjgl.system.MemoryUtil.memLongBuffer(r0, r1)
            return r0
    }

    public static long n__pad2(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.__PAD2
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 1
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 8
            long r3 = r3 * r4
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer ncmd(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingSQE.CMD
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 0
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte ncmd(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.CMD
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 0
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static void nopcode(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.OPCODE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nflags(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nioprio(long r7, short r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.IOPRIO
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putShort(r1, r2, r3)
            return
    }

    public static void nfd(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.FD
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void noff(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.OFF
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void naddr2(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.ADDR2
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void ncmd_op(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.CMD_OP
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void n__pad1(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.__PAD1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void naddr(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.ADDR
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nsplice_off_in(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.SPLICE_OFF_IN
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nlen(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.LEN
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nrw_flags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.RW_FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nfsync_flags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.FSYNC_FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npoll_events(long r7, short r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.POLL_EVENTS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putShort(r1, r2, r3)
            return
    }

    public static void npoll32_events(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.POLL32_EVENTS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nsync_range_flags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.SYNC_RANGE_FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nmsg_flags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.MSG_FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ntimeout_flags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.TIMEOUT_FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void naccept_flags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.ACCEPT_FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ncancel_flags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.CANCEL_FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nopen_flags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.OPEN_FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nstatx_flags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.STATX_FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nfadvise_advice(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.FADVISE_ADVICE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nsplice_flags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.SPLICE_FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nrename_flags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.RENAME_FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nunlink_flags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.UNLINK_FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nhardlink_flags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.HARDLINK_FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nxattr_flags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.XATTR_FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nmsg_ring_flags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.MSG_RING_FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nuring_cmd_flags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.URING_CMD_FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nuser_data(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.USER_DATA
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nbuf_index(long r7, short r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.BUF_INDEX
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putShort(r1, r2, r3)
            return
    }

    public static void nbuf_group(long r7, short r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.BUF_GROUP
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putShort(r1, r2, r3)
            return
    }

    public static void npersonality(long r7, short r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.PERSONALITY
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putShort(r1, r2, r3)
            return
    }

    public static void nsplice_fd_in(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.SPLICE_FD_IN
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nfile_index(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.FILE_INDEX
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void naddr_len(long r7, short r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.ADDR_LEN
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putShort(r1, r2, r3)
            return
    }

    public static void n__pad3(long r7, java.nio.ShortBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.system.linux.liburing.IOURingSQE.__PAD3
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 2
            int r2 = r2 * r3
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void n__pad3(long r9, int r11, short r12) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.__PAD3
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 1
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 2
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putShort(r1, r2, r3)
            return
    }

    public static void naddr3(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.ADDR3
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void n__pad2(long r7, java.nio.LongBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.system.linux.liburing.IOURingSQE.__PAD2
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 8
            int r2 = r2 * r3
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void n__pad2(long r9, int r11, long r12) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.__PAD2
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 1
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 8
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putLong(r1, r2, r3)
            return
    }

    public static void ncmd(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 0
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.system.linux.liburing.IOURingSQE.CMD
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 1
            int r2 = r2 * r3
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void ncmd(long r9, int r11, byte r12) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQE.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQE.CMD
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 0
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putByte(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.system.linux.liburing.IOURingSQE r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 13
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 3
            org.lwjgl.system.Struct$Member[] r3 = new org.lwjgl.system.Struct.Member[r3]
            r4 = r3
            r5 = 0
            r6 = 8
            org.lwjgl.system.Struct$Member r6 = __member(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 8
            org.lwjgl.system.Struct$Member r6 = __member(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = 2
            org.lwjgl.system.Struct$Member[] r6 = new org.lwjgl.system.Struct.Member[r6]
            r7 = r6
            r8 = 0
            r9 = 4
            org.lwjgl.system.Struct$Member r9 = __member(r9)
            r7[r8] = r9
            r7 = r6
            r8 = 1
            r9 = 4
            org.lwjgl.system.Struct$Member r9 = __member(r9)
            r7[r8] = r9
            org.lwjgl.system.Struct$Layout r6 = __struct(r6)
            r4[r5] = r6
            org.lwjgl.system.Struct$Layout r3 = __union(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 2
            org.lwjgl.system.Struct$Member[] r3 = new org.lwjgl.system.Struct.Member[r3]
            r4 = r3
            r5 = 0
            r6 = 8
            org.lwjgl.system.Struct$Member r6 = __member(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 8
            org.lwjgl.system.Struct$Member r6 = __member(r6)
            r4[r5] = r6
            org.lwjgl.system.Struct$Layout r3 = __union(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 19
            org.lwjgl.system.Struct$Member[] r3 = new org.lwjgl.system.Struct.Member[r3]
            r4 = r3
            r5 = 0
            r6 = 4
            org.lwjgl.system.Struct$Member r6 = __member(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 4
            org.lwjgl.system.Struct$Member r6 = __member(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = 2
            org.lwjgl.system.Struct$Member r6 = __member(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 3
            r6 = 4
            org.lwjgl.system.Struct$Member r6 = __member(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 4
            r6 = 4
            org.lwjgl.system.Struct$Member r6 = __member(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 5
            r6 = 4
            org.lwjgl.system.Struct$Member r6 = __member(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 6
            r6 = 4
            org.lwjgl.system.Struct$Member r6 = __member(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 7
            r6 = 4
            org.lwjgl.system.Struct$Member r6 = __member(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 8
            r6 = 4
            org.lwjgl.system.Struct$Member r6 = __member(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 9
            r6 = 4
            org.lwjgl.system.Struct$Member r6 = __member(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 10
            r6 = 4
            org.lwjgl.system.Struct$Member r6 = __member(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 11
            r6 = 4
            org.lwjgl.system.Struct$Member r6 = __member(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 12
            r6 = 4
            org.lwjgl.system.Struct$Member r6 = __member(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 13
            r6 = 4
            org.lwjgl.system.Struct$Member r6 = __member(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 14
            r6 = 4
            org.lwjgl.system.Struct$Member r6 = __member(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 15
            r6 = 4
            org.lwjgl.system.Struct$Member r6 = __member(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 16
            r6 = 4
            org.lwjgl.system.Struct$Member r6 = __member(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 17
            r6 = 4
            org.lwjgl.system.Struct$Member r6 = __member(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 18
            r6 = 4
            org.lwjgl.system.Struct$Member r6 = __member(r6)
            r4[r5] = r6
            org.lwjgl.system.Struct$Layout r3 = __union(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 2
            org.lwjgl.system.Struct$Member[] r3 = new org.lwjgl.system.Struct.Member[r3]
            r4 = r3
            r5 = 0
            r6 = 2
            org.lwjgl.system.Struct$Member r6 = __member(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 2
            org.lwjgl.system.Struct$Member r6 = __member(r6)
            r4[r5] = r6
            org.lwjgl.system.Struct$Layout r3 = __union(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 3
            org.lwjgl.system.Struct$Member[] r3 = new org.lwjgl.system.Struct.Member[r3]
            r4 = r3
            r5 = 0
            r6 = 4
            org.lwjgl.system.Struct$Member r6 = __member(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 4
            org.lwjgl.system.Struct$Member r6 = __member(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = 2
            org.lwjgl.system.Struct$Member[] r6 = new org.lwjgl.system.Struct.Member[r6]
            r7 = r6
            r8 = 0
            r9 = 2
            org.lwjgl.system.Struct$Member r9 = __member(r9)
            r7[r8] = r9
            r7 = r6
            r8 = 1
            r9 = 2
            r10 = 1
            org.lwjgl.system.Struct$Member r9 = __array(r9, r10)
            r7[r8] = r9
            org.lwjgl.system.Struct$Layout r6 = __struct(r6)
            r4[r5] = r6
            org.lwjgl.system.Struct$Layout r3 = __union(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 2
            org.lwjgl.system.Struct$Member[] r3 = new org.lwjgl.system.Struct.Member[r3]
            r4 = r3
            r5 = 0
            r6 = 2
            org.lwjgl.system.Struct$Member[] r6 = new org.lwjgl.system.Struct.Member[r6]
            r7 = r6
            r8 = 0
            r9 = 8
            org.lwjgl.system.Struct$Member r9 = __member(r9)
            r7[r8] = r9
            r7 = r6
            r8 = 1
            r9 = 8
            r10 = 1
            org.lwjgl.system.Struct$Member r9 = __array(r9, r10)
            r7[r8] = r9
            org.lwjgl.system.Struct$Layout r6 = __struct(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 1
            r7 = 0
            org.lwjgl.system.Struct$Member r6 = __array(r6, r7)
            r4[r5] = r6
            org.lwjgl.system.Struct$Layout r3 = __union(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r12 = r0
            r0 = r12
            int r0 = r0.getSize()
            org.lwjgl.system.linux.liburing.IOURingSQE.SIZEOF = r0
            r0 = r12
            int r0 = r0.getAlignment()
            org.lwjgl.system.linux.liburing.IOURingSQE.ALIGNOF = r0
            r0 = r12
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQE.OPCODE = r0
            r0 = r12
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQE.FLAGS = r0
            r0 = r12
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQE.IOPRIO = r0
            r0 = r12
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQE.FD = r0
            r0 = r12
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQE.OFF = r0
            r0 = r12
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQE.ADDR2 = r0
            r0 = r12
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQE.CMD_OP = r0
            r0 = r12
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQE.__PAD1 = r0
            r0 = r12
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQE.ADDR = r0
            r0 = r12
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQE.SPLICE_OFF_IN = r0
            r0 = r12
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQE.LEN = r0
            r0 = r12
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQE.RW_FLAGS = r0
            r0 = r12
            r1 = 16
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQE.FSYNC_FLAGS = r0
            r0 = r12
            r1 = 17
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQE.POLL_EVENTS = r0
            r0 = r12
            r1 = 18
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQE.POLL32_EVENTS = r0
            r0 = r12
            r1 = 19
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQE.SYNC_RANGE_FLAGS = r0
            r0 = r12
            r1 = 20
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQE.MSG_FLAGS = r0
            r0 = r12
            r1 = 21
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQE.TIMEOUT_FLAGS = r0
            r0 = r12
            r1 = 22
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQE.ACCEPT_FLAGS = r0
            r0 = r12
            r1 = 23
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQE.CANCEL_FLAGS = r0
            r0 = r12
            r1 = 24
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQE.OPEN_FLAGS = r0
            r0 = r12
            r1 = 25
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQE.STATX_FLAGS = r0
            r0 = r12
            r1 = 26
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQE.FADVISE_ADVICE = r0
            r0 = r12
            r1 = 27
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQE.SPLICE_FLAGS = r0
            r0 = r12
            r1 = 28
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQE.RENAME_FLAGS = r0
            r0 = r12
            r1 = 29
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQE.UNLINK_FLAGS = r0
            r0 = r12
            r1 = 30
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQE.HARDLINK_FLAGS = r0
            r0 = r12
            r1 = 31
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQE.XATTR_FLAGS = r0
            r0 = r12
            r1 = 32
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQE.MSG_RING_FLAGS = r0
            r0 = r12
            r1 = 33
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQE.URING_CMD_FLAGS = r0
            r0 = r12
            r1 = 34
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQE.USER_DATA = r0
            r0 = r12
            r1 = 36
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQE.BUF_INDEX = r0
            r0 = r12
            r1 = 37
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQE.BUF_GROUP = r0
            r0 = r12
            r1 = 38
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQE.PERSONALITY = r0
            r0 = r12
            r1 = 40
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQE.SPLICE_FD_IN = r0
            r0 = r12
            r1 = 41
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQE.FILE_INDEX = r0
            r0 = r12
            r1 = 43
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQE.ADDR_LEN = r0
            r0 = r12
            r1 = 44
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQE.__PAD3 = r0
            r0 = r12
            r1 = 47
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQE.ADDR3 = r0
            r0 = r12
            r1 = 48
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQE.__PAD2 = r0
            r0 = r12
            r1 = 49
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQE.CMD = r0
            return
    }
}
