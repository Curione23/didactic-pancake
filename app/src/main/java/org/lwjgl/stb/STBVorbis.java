package org.lwjgl.stb;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBVorbis.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBVorbis.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBVorbis.class */
public class STBVorbis {
    public static final int VORBIS__no_error = 0;
    public static final int VORBIS_need_more_data = 1;
    public static final int VORBIS_invalid_api_mixing = 2;
    public static final int VORBIS_outofmem = 3;
    public static final int VORBIS_feature_not_supported = 4;
    public static final int VORBIS_too_many_channels = 5;
    public static final int VORBIS_file_open_failure = 6;
    public static final int VORBIS_seek_without_length = 7;
    public static final int VORBIS_unexpected_eof = 10;
    public static final int VORBIS_seek_invalid = 11;
    public static final int VORBIS_invalid_setup = 20;
    public static final int VORBIS_invalid_stream = 21;
    public static final int VORBIS_missing_capture_pattern = 30;
    public static final int VORBIS_invalid_stream_structure_version = 31;
    public static final int VORBIS_continued_packet_flag_invalid = 32;
    public static final int VORBIS_incorrect_stream_serial_number = 33;
    public static final int VORBIS_invalid_first_page = 34;
    public static final int VORBIS_bad_packet_type = 35;
    public static final int VORBIS_cant_find_last_page = 36;
    public static final int VORBIS_seek_failed = 37;
    public static final int VORBIS_ogg_skeleton_not_supported = 38;

    protected STBVorbis() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void nstb_vorbis_get_info(long r0, long r2);

    @org.lwjgl.system.NativeType("stb_vorbis_info")
    public static org.lwjgl.stb.STBVorbisInfo stb_vorbis_get_info(@org.lwjgl.system.NativeType("stb_vorbis *") long r5, @org.lwjgl.system.NativeType("stb_vorbis_info") org.lwjgl.stb.STBVorbisInfo r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r5
            r1 = r7
            long r1 = r1.address()
            nstb_vorbis_get_info(r0, r1)
            r0 = r7
            return r0
    }

    public static native void nstb_vorbis_get_comment(long r0, long r2);

    @org.lwjgl.system.NativeType("stb_vorbis_comment")
    public static org.lwjgl.stb.STBVorbisComment stb_vorbis_get_comment(@org.lwjgl.system.NativeType("stb_vorbis *") long r5, @org.lwjgl.system.NativeType("stb_vorbis_comment") org.lwjgl.stb.STBVorbisComment r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r5
            r1 = r7
            long r1 = r1.address()
            nstb_vorbis_get_comment(r0, r1)
            r0 = r7
            return r0
    }

    public static native int nstb_vorbis_get_error(long r0);

    public static int stb_vorbis_get_error(@org.lwjgl.system.NativeType("stb_vorbis *") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            int r0 = nstb_vorbis_get_error(r0)
            return r0
    }

    public static native void nstb_vorbis_close(long r0);

    public static void stb_vorbis_close(@org.lwjgl.system.NativeType("stb_vorbis *") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            nstb_vorbis_close(r0)
            return
    }

    public static native int nstb_vorbis_get_sample_offset(long r0);

    public static int stb_vorbis_get_sample_offset(@org.lwjgl.system.NativeType("stb_vorbis *") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            int r0 = nstb_vorbis_get_sample_offset(r0)
            return r0
    }

    public static native int nstb_vorbis_get_file_offset(long r0);

    @org.lwjgl.system.NativeType("unsigned int")
    public static int stb_vorbis_get_file_offset(@org.lwjgl.system.NativeType("stb_vorbis *") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            int r0 = nstb_vorbis_get_file_offset(r0)
            return r0
    }

    public static native long nstb_vorbis_open_pushdata(long r0, int r2, long r3, long r5, long r7);

    @org.lwjgl.system.NativeType("stb_vorbis *")
    public static long stb_vorbis_open_pushdata(@org.lwjgl.system.NativeType("unsigned char const *") java.nio.ByteBuffer r10, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r11, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("stb_vorbis_alloc const *") org.lwjgl.stb.STBVorbisAlloc r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r13
            if (r0 == 0) goto L1b
            r0 = r13
            long r0 = r0.address()
            org.lwjgl.stb.STBVorbisAlloc.validate(r0)
        L1b:
            r0 = r10
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r10
            int r1 = r1.remaining()
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r13
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            long r0 = nstb_vorbis_open_pushdata(r0, r1, r2, r3, r4)
            return r0
    }

    public static native int nstb_vorbis_decode_frame_pushdata(long r0, long r2, int r4, long r5, long r7, long r9);

    public static int stb_vorbis_decode_frame_pushdata(@org.lwjgl.system.NativeType("stb_vorbis *") long r12, @org.lwjgl.system.NativeType("unsigned char const *") java.nio.ByteBuffer r14, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r15, @org.lwjgl.system.NativeType("float ***") org.lwjgl.PointerBuffer r16, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r17) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1c
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r16
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r17
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1c:
            r0 = r12
            r1 = r14
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r14
            int r2 = r2.remaining()
            r3 = r15
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r16
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r17
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            int r0 = nstb_vorbis_decode_frame_pushdata(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static native void nstb_vorbis_flush_pushdata(long r0);

    public static void stb_vorbis_flush_pushdata(@org.lwjgl.system.NativeType("stb_vorbis *") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            nstb_vorbis_flush_pushdata(r0)
            return
    }

    public static native int nstb_vorbis_decode_filename(long r0, long r2, long r4, long r6);

    public static int stb_vorbis_decode_filename(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r9, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r10, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r11, @org.lwjgl.system.NativeType("short **") org.lwjgl.PointerBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r9
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r10
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nstb_vorbis_decode_filename(r0, r1, r2, r3)
            return r0
    }

    public static int stb_vorbis_decode_filename(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r9, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r10, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r11, @org.lwjgl.system.NativeType("short **") org.lwjgl.PointerBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L15:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r13 = r0
            r0 = r13
            int r0 = r0.getPointer()
            r14 = r0
            r0 = r13
            r1 = r9
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L4d
            r0 = r13
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L4d
            r15 = r0
            r0 = r15
            r1 = r10
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L4d
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L4d
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L4d
            int r0 = nstb_vorbis_decode_filename(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L4d
            r17 = r0
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            r0 = r17
            return r0
        L4d:
            r18 = move-exception
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            r0 = r18
            throw r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("int")
    public static java.nio.ShortBuffer stb_vorbis_decode_filename(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r9, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r10, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r12 = r0
            r0 = r12
            int r0 = r0.getPointer()
            r13 = r0
            r0 = r12
            r1 = r9
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L5e
            r0 = r12
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L5e
            r14 = r0
            r0 = r12
            r1 = 0
            org.lwjgl.PointerBuffer r0 = r0.pointers(r1)     // Catch: java.lang.Throwable -> L5e
            r16 = r0
            r0 = r14
            r1 = r10
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L5e
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L5e
            r3 = r16
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L5e
            int r0 = nstb_vorbis_decode_filename(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L5e
            r17 = r0
            r0 = r16
            r1 = 0
            long r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L5e
            r1 = r17
            r2 = r10
            r3 = 0
            int r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L5e
            int r1 = r1 * r2
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBufferSafe(r0, r1)     // Catch: java.lang.Throwable -> L5e
            r18 = r0
            r0 = r12
            r1 = r13
            r0.setPointer(r1)
            r0 = r18
            return r0
        L5e:
            r19 = move-exception
            r0 = r12
            r1 = r13
            r0.setPointer(r1)
            r0 = r19
            throw r0
    }

    public static native int nstb_vorbis_decode_memory(long r0, int r2, long r3, long r5, long r7);

    public static int stb_vorbis_decode_memory(@org.lwjgl.system.NativeType("unsigned char const *") java.nio.ByteBuffer r10, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r11, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r12, @org.lwjgl.system.NativeType("short **") org.lwjgl.PointerBuffer r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L15:
            r0 = r10
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r10
            int r1 = r1.remaining()
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r13
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            int r0 = nstb_vorbis_decode_memory(r0, r1, r2, r3, r4)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("int")
    public static java.nio.ShortBuffer stb_vorbis_decode_memory(@org.lwjgl.system.NativeType("unsigned char const *") java.nio.ByteBuffer r10, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r11, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r13 = r0
            r0 = r13
            int r0 = r0.getPointer()
            r14 = r0
            r0 = r13
            r1 = 0
            org.lwjgl.PointerBuffer r0 = r0.pointers(r1)     // Catch: java.lang.Throwable -> L57
            r15 = r0
            r0 = r10
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)     // Catch: java.lang.Throwable -> L57
            r1 = r10
            int r1 = r1.remaining()     // Catch: java.lang.Throwable -> L57
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L57
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L57
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)     // Catch: java.lang.Throwable -> L57
            int r0 = nstb_vorbis_decode_memory(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L57
            r16 = r0
            r0 = r15
            r1 = 0
            long r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L57
            r1 = r16
            r2 = r11
            r3 = 0
            int r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L57
            int r1 = r1 * r2
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBufferSafe(r0, r1)     // Catch: java.lang.Throwable -> L57
            r17 = r0
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            r0 = r17
            return r0
        L57:
            r18 = move-exception
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            r0 = r18
            throw r0
    }

    public static native long nstb_vorbis_open_memory(long r0, int r2, long r3, long r5);

    @org.lwjgl.system.NativeType("stb_vorbis *")
    public static long stb_vorbis_open_memory(@org.lwjgl.system.NativeType("unsigned char const *") java.nio.ByteBuffer r8, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("stb_vorbis_alloc const *") org.lwjgl.stb.STBVorbisAlloc r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L16
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            if (r0 == 0) goto L16
            r0 = r10
            long r0 = r0.address()
            org.lwjgl.stb.STBVorbisAlloc.validate(r0)
        L16:
            r0 = r8
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r8
            int r1 = r1.remaining()
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            long r0 = nstb_vorbis_open_memory(r0, r1, r2, r3)
            return r0
    }

    public static native long nstb_vorbis_open_filename(long r0, long r2, long r4);

    @org.lwjgl.system.NativeType("stb_vorbis *")
    public static long stb_vorbis_open_filename(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r7, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("stb_vorbis_alloc const *") org.lwjgl.stb.STBVorbisAlloc r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1a
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r9
            if (r0 == 0) goto L1a
            r0 = r9
            long r0 = r0.address()
            org.lwjgl.stb.STBVorbisAlloc.validate(r0)
        L1a:
            r0 = r7
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            long r0 = nstb_vorbis_open_filename(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("stb_vorbis *")
    public static long stb_vorbis_open_filename(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r7, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("stb_vorbis_alloc const *") org.lwjgl.stb.STBVorbisAlloc r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L16
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r9
            if (r0 == 0) goto L16
            r0 = r9
            long r0 = r0.address()
            org.lwjgl.stb.STBVorbisAlloc.validate(r0)
        L16:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r10 = r0
            r0 = r10
            int r0 = r0.getPointer()
            r11 = r0
            r0 = r10
            r1 = r7
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L45
            r0 = r10
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L45
            r12 = r0
            r0 = r12
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L45
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)     // Catch: java.lang.Throwable -> L45
            long r0 = nstb_vorbis_open_filename(r0, r1, r2)     // Catch: java.lang.Throwable -> L45
            r14 = r0
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            r0 = r14
            return r0
        L45:
            r16 = move-exception
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            r0 = r16
            throw r0
    }

    public static native int nstb_vorbis_seek_frame(long r0, int r2);

    @org.lwjgl.system.NativeType("int")
    public static boolean stb_vorbis_seek_frame(@org.lwjgl.system.NativeType("stb_vorbis *") long r4, @org.lwjgl.system.NativeType("unsigned int") int r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r4
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r4
            r1 = r6
            int r0 = nstb_vorbis_seek_frame(r0, r1)
            if (r0 == 0) goto L17
            r0 = 1
            goto L18
        L17:
            r0 = 0
        L18:
            return r0
    }

    public static native int nstb_vorbis_seek(long r0, int r2);

    @org.lwjgl.system.NativeType("int")
    public static boolean stb_vorbis_seek(@org.lwjgl.system.NativeType("stb_vorbis *") long r4, @org.lwjgl.system.NativeType("unsigned int") int r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r4
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r4
            r1 = r6
            int r0 = nstb_vorbis_seek(r0, r1)
            if (r0 == 0) goto L17
            r0 = 1
            goto L18
        L17:
            r0 = 0
        L18:
            return r0
    }

    public static native int nstb_vorbis_seek_start(long r0);

    @org.lwjgl.system.NativeType("int")
    public static boolean stb_vorbis_seek_start(@org.lwjgl.system.NativeType("stb_vorbis *") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            int r0 = nstb_vorbis_seek_start(r0)
            if (r0 == 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    public static native int nstb_vorbis_stream_length_in_samples(long r0);

    @org.lwjgl.system.NativeType("unsigned int")
    public static int stb_vorbis_stream_length_in_samples(@org.lwjgl.system.NativeType("stb_vorbis *") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            int r0 = nstb_vorbis_stream_length_in_samples(r0)
            return r0
    }

    public static native float nstb_vorbis_stream_length_in_seconds(long r0);

    public static float stb_vorbis_stream_length_in_seconds(@org.lwjgl.system.NativeType("stb_vorbis *") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            float r0 = nstb_vorbis_stream_length_in_seconds(r0)
            return r0
    }

    public static native int nstb_vorbis_get_frame_float(long r0, long r2, long r4);

    public static int stb_vorbis_get_frame_float(@org.lwjgl.system.NativeType("stb_vorbis *") long r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r9, @org.lwjgl.system.NativeType("float ***") org.lwjgl.PointerBuffer r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L15:
            r0 = r7
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nstb_vorbis_get_frame_float(r0, r1, r2)
            return r0
    }

    public static native int nstb_vorbis_get_frame_short(long r0, int r2, long r3, int r5);

    public static int stb_vorbis_get_frame_short(@org.lwjgl.system.NativeType("stb_vorbis *") long r7, @org.lwjgl.system.NativeType("short **") org.lwjgl.PointerBuffer r9, int r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r7
            r1 = r9
            int r1 = r1.remaining()
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r10
            int r0 = nstb_vorbis_get_frame_short(r0, r1, r2, r3)
            return r0
    }

    public static native int nstb_vorbis_get_frame_short_interleaved(long r0, int r2, long r3, int r5);

    public static int stb_vorbis_get_frame_short_interleaved(@org.lwjgl.system.NativeType("stb_vorbis *") long r7, int r9, @org.lwjgl.system.NativeType("short *") java.nio.ShortBuffer r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r7
            r1 = r9
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r10
            int r3 = r3.remaining()
            int r0 = nstb_vorbis_get_frame_short_interleaved(r0, r1, r2, r3)
            return r0
    }

    public static native int nstb_vorbis_get_samples_float(long r0, int r2, long r3, int r5);

    public static int stb_vorbis_get_samples_float(@org.lwjgl.system.NativeType("stb_vorbis *") long r7, @org.lwjgl.system.NativeType("float **") org.lwjgl.PointerBuffer r9, int r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r7
            r1 = r9
            int r1 = r1.remaining()
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r10
            int r0 = nstb_vorbis_get_samples_float(r0, r1, r2, r3)
            return r0
    }

    public static native int nstb_vorbis_get_samples_float_interleaved(long r0, int r2, long r3, int r5);

    public static int stb_vorbis_get_samples_float_interleaved(@org.lwjgl.system.NativeType("stb_vorbis *") long r7, int r9, @org.lwjgl.system.NativeType("float *") java.nio.FloatBuffer r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r7
            r1 = r9
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r10
            int r3 = r3.remaining()
            int r0 = nstb_vorbis_get_samples_float_interleaved(r0, r1, r2, r3)
            return r0
    }

    public static native int nstb_vorbis_get_samples_short(long r0, int r2, long r3, int r5);

    public static int stb_vorbis_get_samples_short(@org.lwjgl.system.NativeType("stb_vorbis *") long r7, @org.lwjgl.system.NativeType("short **") org.lwjgl.PointerBuffer r9, int r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r7
            r1 = r9
            int r1 = r1.remaining()
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r10
            int r0 = nstb_vorbis_get_samples_short(r0, r1, r2, r3)
            return r0
    }

    public static native int nstb_vorbis_get_samples_short_interleaved(long r0, int r2, long r3, int r5);

    public static int stb_vorbis_get_samples_short_interleaved(@org.lwjgl.system.NativeType("stb_vorbis *") long r7, int r9, @org.lwjgl.system.NativeType("short *") java.nio.ShortBuffer r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r7
            r1 = r9
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r10
            int r3 = r3.remaining()
            int r0 = nstb_vorbis_get_samples_short_interleaved(r0, r1, r2, r3)
            return r0
    }

    public static native long nstb_vorbis_open_pushdata(long r0, int r2, int[] r3, int[] r4, long r5);

    @org.lwjgl.system.NativeType("stb_vorbis *")
    public static long stb_vorbis_open_pushdata(@org.lwjgl.system.NativeType("unsigned char const *") java.nio.ByteBuffer r8, @org.lwjgl.system.NativeType("int *") int[] r9, @org.lwjgl.system.NativeType("int *") int[] r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("stb_vorbis_alloc const *") org.lwjgl.stb.STBVorbisAlloc r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            if (r0 == 0) goto L1b
            r0 = r11
            long r0 = r0.address()
            org.lwjgl.stb.STBVorbisAlloc.validate(r0)
        L1b:
            r0 = r8
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r8
            int r1 = r1.remaining()
            r2 = r9
            r3 = r10
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            long r0 = nstb_vorbis_open_pushdata(r0, r1, r2, r3, r4)
            return r0
    }

    public static native int nstb_vorbis_decode_frame_pushdata(long r0, long r2, int r4, int[] r5, long r6, int[] r8);

    public static int stb_vorbis_decode_frame_pushdata(@org.lwjgl.system.NativeType("stb_vorbis *") long r10, @org.lwjgl.system.NativeType("unsigned char const *") java.nio.ByteBuffer r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r13, @org.lwjgl.system.NativeType("float ***") org.lwjgl.PointerBuffer r14, @org.lwjgl.system.NativeType("int *") int[] r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1c
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1c:
            r0 = r10
            r1 = r12
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r12
            int r2 = r2.remaining()
            r3 = r13
            r4 = r14
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r15
            int r0 = nstb_vorbis_decode_frame_pushdata(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static native int nstb_vorbis_decode_filename(long r0, int[] r2, int[] r3, long r4);

    public static int stb_vorbis_decode_filename(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r7, @org.lwjgl.system.NativeType("int *") int[] r8, @org.lwjgl.system.NativeType("int *") int[] r9, @org.lwjgl.system.NativeType("short **") org.lwjgl.PointerBuffer r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r8
            r2 = r9
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nstb_vorbis_decode_filename(r0, r1, r2, r3)
            return r0
    }

    public static int stb_vorbis_decode_filename(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r7, @org.lwjgl.system.NativeType("int *") int[] r8, @org.lwjgl.system.NativeType("int *") int[] r9, @org.lwjgl.system.NativeType("short **") org.lwjgl.PointerBuffer r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L15:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r11 = r0
            r0 = r11
            int r0 = r0.getPointer()
            r12 = r0
            r0 = r11
            r1 = r7
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L47
            r0 = r11
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L47
            r13 = r0
            r0 = r13
            r1 = r8
            r2 = r9
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L47
            int r0 = nstb_vorbis_decode_filename(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L47
            r15 = r0
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r15
            return r0
        L47:
            r16 = move-exception
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r16
            throw r0
    }

    public static native int nstb_vorbis_decode_memory(long r0, int r2, int[] r3, int[] r4, long r5);

    public static int stb_vorbis_decode_memory(@org.lwjgl.system.NativeType("unsigned char const *") java.nio.ByteBuffer r8, @org.lwjgl.system.NativeType("int *") int[] r9, @org.lwjgl.system.NativeType("int *") int[] r10, @org.lwjgl.system.NativeType("short **") org.lwjgl.PointerBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L15:
            r0 = r8
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r8
            int r1 = r1.remaining()
            r2 = r9
            r3 = r10
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            int r0 = nstb_vorbis_decode_memory(r0, r1, r2, r3, r4)
            return r0
    }

    public static native long nstb_vorbis_open_memory(long r0, int r2, int[] r3, long r4);

    @org.lwjgl.system.NativeType("stb_vorbis *")
    public static long stb_vorbis_open_memory(@org.lwjgl.system.NativeType("unsigned char const *") java.nio.ByteBuffer r7, @org.lwjgl.system.NativeType("int *") int[] r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("stb_vorbis_alloc const *") org.lwjgl.stb.STBVorbisAlloc r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L16
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r9
            if (r0 == 0) goto L16
            r0 = r9
            long r0 = r0.address()
            org.lwjgl.stb.STBVorbisAlloc.validate(r0)
        L16:
            r0 = r7
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r1 = r1.remaining()
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            long r0 = nstb_vorbis_open_memory(r0, r1, r2, r3)
            return r0
    }

    public static native long nstb_vorbis_open_filename(long r0, int[] r2, long r3);

    @org.lwjgl.system.NativeType("stb_vorbis *")
    public static long stb_vorbis_open_filename(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r6, @org.lwjgl.system.NativeType("int *") int[] r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("stb_vorbis_alloc const *") org.lwjgl.stb.STBVorbisAlloc r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1a
            r0 = r6
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r8
            if (r0 == 0) goto L1a
            r0 = r8
            long r0 = r0.address()
            org.lwjgl.stb.STBVorbisAlloc.validate(r0)
        L1a:
            r0 = r6
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            long r0 = nstb_vorbis_open_filename(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("stb_vorbis *")
    public static long stb_vorbis_open_filename(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r6, @org.lwjgl.system.NativeType("int *") int[] r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("stb_vorbis_alloc const *") org.lwjgl.stb.STBVorbisAlloc r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L16
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r8
            if (r0 == 0) goto L16
            r0 = r8
            long r0 = r0.address()
            org.lwjgl.stb.STBVorbisAlloc.validate(r0)
        L16:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r9 = r0
            r0 = r9
            int r0 = r0.getPointer()
            r10 = r0
            r0 = r9
            r1 = r6
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L42
            r0 = r9
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L42
            r11 = r0
            r0 = r11
            r1 = r7
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)     // Catch: java.lang.Throwable -> L42
            long r0 = nstb_vorbis_open_filename(r0, r1, r2)     // Catch: java.lang.Throwable -> L42
            r13 = r0
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r13
            return r0
        L42:
            r15 = move-exception
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r15
            throw r0
    }

    public static native int nstb_vorbis_get_frame_float(long r0, int[] r2, long r3);

    public static int stb_vorbis_get_frame_float(@org.lwjgl.system.NativeType("stb_vorbis *") long r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r8, @org.lwjgl.system.NativeType("float ***") org.lwjgl.PointerBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L15:
            r0 = r6
            r1 = r8
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nstb_vorbis_get_frame_float(r0, r1, r2)
            return r0
    }

    public static native int nstb_vorbis_get_frame_short_interleaved(long r0, int r2, short[] r3, int r4);

    public static int stb_vorbis_get_frame_short_interleaved(@org.lwjgl.system.NativeType("stb_vorbis *") long r6, int r8, @org.lwjgl.system.NativeType("short *") short[] r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r9
            int r3 = r3.length
            int r0 = nstb_vorbis_get_frame_short_interleaved(r0, r1, r2, r3)
            return r0
    }

    public static native int nstb_vorbis_get_samples_float_interleaved(long r0, int r2, float[] r3, int r4);

    public static int stb_vorbis_get_samples_float_interleaved(@org.lwjgl.system.NativeType("stb_vorbis *") long r6, int r8, @org.lwjgl.system.NativeType("float *") float[] r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r9
            int r3 = r3.length
            int r0 = nstb_vorbis_get_samples_float_interleaved(r0, r1, r2, r3)
            return r0
    }

    public static native int nstb_vorbis_get_samples_short_interleaved(long r0, int r2, short[] r3, int r4);

    public static int stb_vorbis_get_samples_short_interleaved(@org.lwjgl.system.NativeType("stb_vorbis *") long r6, int r8, @org.lwjgl.system.NativeType("short *") short[] r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r9
            int r3 = r3.length
            int r0 = nstb_vorbis_get_samples_short_interleaved(r0, r1, r2, r3)
            return r0
    }

    static {
            org.lwjgl.stb.LibSTB.initialize()
            return
    }
}
