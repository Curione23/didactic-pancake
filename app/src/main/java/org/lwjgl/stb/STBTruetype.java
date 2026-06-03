package org.lwjgl.stb;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBTruetype.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBTruetype.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBTruetype.class */
public class STBTruetype {
    public static final byte STBTT_vmove = 1;
    public static final byte STBTT_vline = 2;
    public static final byte STBTT_vcurve = 3;
    public static final byte STBTT_vcubic = 4;
    public static final int STBTT_MACSTYLE_DONTCARE = 0;
    public static final int STBTT_MACSTYLE_BOLD = 1;
    public static final int STBTT_MACSTYLE_ITALIC = 2;
    public static final int STBTT_MACSTYLE_UNDERSCORE = 4;
    public static final int STBTT_MACSTYLE_NONE = 8;
    public static final int STBTT_PLATFORM_ID_UNICODE = 0;
    public static final int STBTT_PLATFORM_ID_MAC = 1;
    public static final int STBTT_PLATFORM_ID_ISO = 2;
    public static final int STBTT_PLATFORM_ID_MICROSOFT = 3;
    public static final int STBTT_UNICODE_EID_UNICODE_1_0 = 0;
    public static final int STBTT_UNICODE_EID_UNICODE_1_1 = 1;
    public static final int STBTT_UNICODE_EID_ISO_10646 = 2;
    public static final int STBTT_UNICODE_EID_UNICODE_2_0_BMP = 3;
    public static final int STBTT_UNICODE_EID_UNICODE_2_0_FULL = 4;
    public static final int STBTT_MS_EID_SYMBOL = 0;
    public static final int STBTT_MS_EID_UNICODE_BMP = 1;
    public static final int STBTT_MS_EID_SHIFTJIS = 2;
    public static final int STBTT_MS_EID_UNICODE_FULL = 10;
    public static final int STBTT_MAC_EID_ROMAN = 0;
    public static final int STBTT_MAC_EID_JAPANESE = 1;
    public static final int STBTT_MAC_EID_CHINESE_TRAD = 2;
    public static final int STBTT_MAC_EID_KOREAN = 3;
    public static final int STBTT_MAC_EID_ARABIC = 4;
    public static final int STBTT_MAC_EID_HEBREW = 5;
    public static final int STBTT_MAC_EID_GREEK = 6;
    public static final int STBTT_MAC_EID_RUSSIAN = 7;
    public static final int STBTT_MS_LANG_ENGLISH = 1033;
    public static final int STBTT_MS_LANG_CHINESE = 2052;
    public static final int STBTT_MS_LANG_DUTCH = 1043;
    public static final int STBTT_MS_LANG_FRENCH = 1036;
    public static final int STBTT_MS_LANG_GERMAN = 1031;
    public static final int STBTT_MS_LANG_HEBREW = 1037;
    public static final int STBTT_MS_LANG_ITALIAN = 1040;
    public static final int STBTT_MS_LANG_JAPANESE = 1041;
    public static final int STBTT_MS_LANG_KOREAN = 1042;
    public static final int STBTT_MS_LANG_RUSSIAN = 1049;
    public static final int STBTT_MS_LANG_SPANISH = 1033;
    public static final int STBTT_MS_LANG_SWEDISH = 1053;
    public static final int STBTT_MAC_LANG_ENGLISH = 0;
    public static final int STBTT_MAC_LANG_ARABIC = 12;
    public static final int STBTT_MAC_LANG_DUTCH = 4;
    public static final int STBTT_MAC_LANG_FRENCH = 1;
    public static final int STBTT_MAC_LANG_GERMAN = 2;
    public static final int STBTT_MAC_LANG_HEBREW = 10;
    public static final int STBTT_MAC_LANG_ITALIAN = 3;
    public static final int STBTT_MAC_LANG_JAPANESE = 11;
    public static final int STBTT_MAC_LANG_KOREAN = 23;
    public static final int STBTT_MAC_LANG_RUSSIAN = 32;
    public static final int STBTT_MAC_LANG_SPANISH = 6;
    public static final int STBTT_MAC_LANG_SWEDISH = 5;
    public static final int STBTT_MAC_LANG_CHINESE_SIMPLIFIED = 33;
    public static final int STBTT_MAC_LANG_CHINESE_TRAD = 19;

    protected STBTruetype() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native int nstbtt_BakeFontBitmap(long r0, int r2, float r3, long r4, int r6, int r7, int r8, int r9, long r10);

    public static int stbtt_BakeFontBitmap(@org.lwjgl.system.NativeType("unsigned char const *") java.nio.ByteBuffer r13, float r14, @org.lwjgl.system.NativeType("unsigned char *") java.nio.ByteBuffer r15, int r16, int r17, int r18, @org.lwjgl.system.NativeType("stbtt_bakedchar *") org.lwjgl.stb.STBTTBakedChar.Buffer r19) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r15
            r1 = r16
            r2 = r17
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r13
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = 0
            r2 = r14
            r3 = r15
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            int r7 = r7.remaining()
            r8 = r19
            long r8 = r8.address()
            int r0 = nstbtt_BakeFontBitmap(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    public static native void nstbtt_GetBakedQuad(long r0, int r2, int r3, int r4, long r5, long r7, long r9, int r11);

    public static void stbtt_GetBakedQuad(@org.lwjgl.system.NativeType("stbtt_bakedchar const *") org.lwjgl.stb.STBTTBakedChar.Buffer r13, int r14, int r15, int r16, @org.lwjgl.system.NativeType("float *") java.nio.FloatBuffer r17, @org.lwjgl.system.NativeType("float *") java.nio.FloatBuffer r18, @org.lwjgl.system.NativeType("stbtt_aligned_quad *") org.lwjgl.stb.STBTTAlignedQuad r19, @org.lwjgl.system.NativeType("int") boolean r20) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r13
            r1 = r16
            r2 = 1
            int r1 = r1 + r2
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r17
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r18
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r13
            long r0 = r0.address()
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r18
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            r6 = r19
            long r6 = r6.address()
            r7 = r20
            if (r7 == 0) goto L38
            r7 = 1
            goto L39
        L38:
            r7 = 0
        L39:
            nstbtt_GetBakedQuad(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static native void nstbtt_GetScaledFontVMetrics(long r0, int r2, float r3, long r4, long r6, long r8);

    public static void stbtt_GetScaledFontVMetrics(@org.lwjgl.system.NativeType("unsigned char const *") java.nio.ByteBuffer r11, int r12, float r13, @org.lwjgl.system.NativeType("float *") java.nio.FloatBuffer r14, @org.lwjgl.system.NativeType("float *") java.nio.FloatBuffer r15, @org.lwjgl.system.NativeType("float *") java.nio.FloatBuffer r16) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r16
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r11
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r12
            r2 = r13
            r3 = r14
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r16
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nstbtt_GetScaledFontVMetrics(r0, r1, r2, r3, r4, r5)
            return
    }

    public static native int nstbtt_PackBegin(long r0, long r2, int r4, int r5, int r6, int r7, long r8);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbtt_PackBegin(@org.lwjgl.system.NativeType("stbtt_pack_context *") org.lwjgl.stb.STBTTPackContext r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("unsigned char *") java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16, @org.lwjgl.system.NativeType("void *") long r17) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r12
            r1 = r15
            if (r1 == 0) goto L11
            r1 = r15
            goto L12
        L11:
            r1 = r13
        L12:
            r2 = r14
            int r1 = r1 * r2
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L17:
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            int r0 = nstbtt_PackBegin(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L31
            r0 = 1
            goto L32
        L31:
            r0 = 0
        L32:
            return r0
    }

    @org.lwjgl.system.NativeType("int")
    public static boolean stbtt_PackBegin(@org.lwjgl.system.NativeType("stbtt_pack_context *") org.lwjgl.stb.STBTTPackContext r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("unsigned char *") java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r12
            r1 = r15
            if (r1 == 0) goto L11
            r1 = r15
            goto L12
        L11:
            r1 = r13
        L12:
            r2 = r14
            int r1 = r1 * r2
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L17:
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = 0
            int r0 = nstbtt_PackBegin(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L30
            r0 = 1
            goto L31
        L30:
            r0 = 0
        L31:
            return r0
    }

    public static native void nstbtt_PackEnd(long r0);

    public static void stbtt_PackEnd(@org.lwjgl.system.NativeType("stbtt_pack_context *") org.lwjgl.stb.STBTTPackContext r3) {
            r0 = r3
            long r0 = r0.address()
            nstbtt_PackEnd(r0)
            return
    }

    public static int STBTT_POINT_SIZE(int r2) {
            r0 = r2
            int r0 = -r0
            return r0
    }

    public static native int nstbtt_PackFontRange(long r0, long r2, int r4, float r5, int r6, int r7, long r8);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbtt_PackFontRange(@org.lwjgl.system.NativeType("stbtt_pack_context *") org.lwjgl.stb.STBTTPackContext r11, @org.lwjgl.system.NativeType("unsigned char const *") java.nio.ByteBuffer r12, int r13, float r14, int r15, @org.lwjgl.system.NativeType("stbtt_packedchar *") org.lwjgl.stb.STBTTPackedchar.Buffer r16) {
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            int r5 = r5.remaining()
            r6 = r16
            long r6 = r6.address()
            int r0 = nstbtt_PackFontRange(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L20
            r0 = 1
            goto L21
        L20:
            r0 = 0
        L21:
            return r0
    }

    public static native int nstbtt_PackFontRanges(long r0, long r2, int r4, long r5, int r7);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbtt_PackFontRanges(@org.lwjgl.system.NativeType("stbtt_pack_context *") org.lwjgl.stb.STBTTPackContext r9, @org.lwjgl.system.NativeType("unsigned char const *") java.nio.ByteBuffer r10, int r11, @org.lwjgl.system.NativeType("stbtt_pack_range *") org.lwjgl.stb.STBTTPackRange.Buffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r12
            long r0 = r0.address()
            r1 = r12
            int r1 = r1.remaining()
            int r2 = org.lwjgl.stb.STBTTPackRange.SIZEOF
            boolean r3 = org.lwjgl.stb.STBTTPackRange::validate
            org.lwjgl.system.Struct.validate(r0, r1, r2, r3)
        L19:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r11
            r3 = r12
            long r3 = r3.address()
            r4 = r12
            int r4 = r4.remaining()
            int r0 = nstbtt_PackFontRanges(r0, r1, r2, r3, r4)
            if (r0 == 0) goto L34
            r0 = 1
            goto L35
        L34:
            r0 = 0
        L35:
            return r0
    }

    public static native void nstbtt_PackSetOversampling(long r0, int r2, int r3);

    public static void stbtt_PackSetOversampling(@org.lwjgl.system.NativeType("stbtt_pack_context *") org.lwjgl.stb.STBTTPackContext r5, @org.lwjgl.system.NativeType("unsigned int") int r6, @org.lwjgl.system.NativeType("unsigned int") int r7) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nstbtt_PackSetOversampling(r0, r1, r2)
            return
    }

    public static native void nstbtt_PackSetSkipMissingCodepoints(long r0, int r2);

    public static void stbtt_PackSetSkipMissingCodepoints(@org.lwjgl.system.NativeType("stbtt_pack_context *") org.lwjgl.stb.STBTTPackContext r4, @org.lwjgl.system.NativeType("int") boolean r5) {
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            if (r1 == 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            nstbtt_PackSetSkipMissingCodepoints(r0, r1)
            return
    }

    public static native void nstbtt_GetPackedQuad(long r0, int r2, int r3, int r4, long r5, long r7, long r9, int r11);

    public static void stbtt_GetPackedQuad(@org.lwjgl.system.NativeType("stbtt_packedchar const *") org.lwjgl.stb.STBTTPackedchar.Buffer r13, int r14, int r15, int r16, @org.lwjgl.system.NativeType("float *") java.nio.FloatBuffer r17, @org.lwjgl.system.NativeType("float *") java.nio.FloatBuffer r18, @org.lwjgl.system.NativeType("stbtt_aligned_quad *") org.lwjgl.stb.STBTTAlignedQuad r19, @org.lwjgl.system.NativeType("int") boolean r20) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r13
            r1 = r16
            r2 = 1
            int r1 = r1 + r2
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r17
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r18
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r13
            long r0 = r0.address()
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r18
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            r6 = r19
            long r6 = r6.address()
            r7 = r20
            if (r7 == 0) goto L38
            r7 = 1
            goto L39
        L38:
            r7 = 0
        L39:
            nstbtt_GetPackedQuad(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static native int nstbtt_PackFontRangesGatherRects(long r0, long r2, long r4, int r6, long r7);

    public static int stbtt_PackFontRangesGatherRects(@org.lwjgl.system.NativeType("stbtt_pack_context *") org.lwjgl.stb.STBTTPackContext r10, @org.lwjgl.system.NativeType("stbtt_fontinfo *") org.lwjgl.stb.STBTTFontinfo r11, @org.lwjgl.system.NativeType("stbtt_pack_range *") org.lwjgl.stb.STBTTPackRange.Buffer r12, @org.lwjgl.system.NativeType("stbrp_rect *") org.lwjgl.stb.STBRPRect.Buffer r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r12
            long r0 = r0.address()
            r1 = r12
            int r1 = r1.remaining()
            int r2 = org.lwjgl.stb.STBTTPackRange.SIZEOF
            int r3 = org.lwjgl.stb.STBTTPackRange::validate
            org.lwjgl.system.Struct.validate(r0, r1, r2, r3)
        L19:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            long r1 = r1.address()
            r2 = r12
            long r2 = r2.address()
            r3 = r12
            int r3 = r3.remaining()
            r4 = r13
            long r4 = r4.address()
            int r0 = nstbtt_PackFontRangesGatherRects(r0, r1, r2, r3, r4)
            return r0
    }

    public static native void nstbtt_PackFontRangesPackRects(long r0, long r2, int r4);

    public static void stbtt_PackFontRangesPackRects(@org.lwjgl.system.NativeType("stbtt_pack_context *") org.lwjgl.stb.STBTTPackContext r6, @org.lwjgl.system.NativeType("stbrp_rect *") org.lwjgl.stb.STBRPRect.Buffer r7) {
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            r2 = r7
            int r2 = r2.remaining()
            nstbtt_PackFontRangesPackRects(r0, r1, r2)
            return
    }

    public static native int nstbtt_PackFontRangesRenderIntoRects(long r0, long r2, long r4, int r6, long r7);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbtt_PackFontRangesRenderIntoRects(@org.lwjgl.system.NativeType("stbtt_pack_context *") org.lwjgl.stb.STBTTPackContext r10, @org.lwjgl.system.NativeType("stbtt_fontinfo *") org.lwjgl.stb.STBTTFontinfo r11, @org.lwjgl.system.NativeType("stbtt_pack_range *") org.lwjgl.stb.STBTTPackRange.Buffer r12, @org.lwjgl.system.NativeType("stbrp_rect *") org.lwjgl.stb.STBRPRect.Buffer r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r12
            long r0 = r0.address()
            r1 = r12
            int r1 = r1.remaining()
            int r2 = org.lwjgl.stb.STBTTPackRange.SIZEOF
            boolean r3 = org.lwjgl.stb.STBTTPackRange::validate
            org.lwjgl.system.Struct.validate(r0, r1, r2, r3)
        L19:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            long r1 = r1.address()
            r2 = r12
            long r2 = r2.address()
            r3 = r12
            int r3 = r3.remaining()
            r4 = r13
            long r4 = r4.address()
            int r0 = nstbtt_PackFontRangesRenderIntoRects(r0, r1, r2, r3, r4)
            if (r0 == 0) goto L37
            r0 = 1
            goto L38
        L37:
            r0 = 0
        L38:
            return r0
    }

    public static native int nstbtt_GetNumberOfFonts(long r0);

    public static int stbtt_GetNumberOfFonts(@org.lwjgl.system.NativeType("unsigned char const *") java.nio.ByteBuffer r3) {
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            int r0 = nstbtt_GetNumberOfFonts(r0)
            return r0
    }

    public static native int nstbtt_GetFontOffsetForIndex(long r0, int r2);

    public static int stbtt_GetFontOffsetForIndex(@org.lwjgl.system.NativeType("unsigned char const *") java.nio.ByteBuffer r4, int r5) {
            r0 = r4
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r5
            int r0 = nstbtt_GetFontOffsetForIndex(r0, r1)
            return r0
    }

    public static native int nstbtt_InitFont(long r0, long r2, int r4);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbtt_InitFont(@org.lwjgl.system.NativeType("stbtt_fontinfo *") org.lwjgl.stb.STBTTFontinfo r6, @org.lwjgl.system.NativeType("unsigned char const *") java.nio.ByteBuffer r7, int r8) {
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r8
            int r0 = nstbtt_InitFont(r0, r1, r2)
            if (r0 == 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            return r0
    }

    @org.lwjgl.system.NativeType("int")
    public static boolean stbtt_InitFont(@org.lwjgl.system.NativeType("stbtt_fontinfo *") org.lwjgl.stb.STBTTFontinfo r6, @org.lwjgl.system.NativeType("unsigned char const *") java.nio.ByteBuffer r7) {
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = 0
            int r0 = nstbtt_InitFont(r0, r1, r2)
            if (r0 == 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            return r0
    }

    public static native int nstbtt_FindGlyphIndex(long r0, int r2);

    public static int stbtt_FindGlyphIndex(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r4, int r5) {
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            int r0 = nstbtt_FindGlyphIndex(r0, r1)
            return r0
    }

    public static native float nstbtt_ScaleForPixelHeight(long r0, float r2);

    public static float stbtt_ScaleForPixelHeight(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r4, float r5) {
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            float r0 = nstbtt_ScaleForPixelHeight(r0, r1)
            return r0
    }

    public static native float nstbtt_ScaleForMappingEmToPixels(long r0, float r2);

    public static float stbtt_ScaleForMappingEmToPixels(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r4, float r5) {
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            float r0 = nstbtt_ScaleForMappingEmToPixels(r0, r1)
            return r0
    }

    public static native void nstbtt_GetFontVMetrics(long r0, long r2, long r4, long r6);

    public static void stbtt_GetFontVMetrics(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L15:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            nstbtt_GetFontVMetrics(r0, r1, r2, r3)
            return
    }

    public static native int nstbtt_GetFontVMetricsOS2(long r0, long r2, long r4, long r6);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbtt_GetFontVMetricsOS2(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L15:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            int r0 = nstbtt_GetFontVMetricsOS2(r0, r1, r2, r3)
            if (r0 == 0) goto L2f
            r0 = 1
            goto L30
        L2f:
            r0 = 0
        L30:
            return r0
    }

    public static native void nstbtt_GetFontBoundingBox(long r0, long r2, long r4, long r6, long r8);

    public static void stbtt_GetFontBoundingBox(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r11, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r12, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r13, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r14, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1b:
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r13
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r14
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nstbtt_GetFontBoundingBox(r0, r1, r2, r3, r4)
            return
    }

    public static native void nstbtt_GetCodepointHMetrics(long r0, int r2, long r3, long r5);

    public static void stbtt_GetCodepointHMetrics(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r8, int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L10:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            nstbtt_GetCodepointHMetrics(r0, r1, r2, r3)
            return
    }

    public static native int nstbtt_GetCodepointKernAdvance(long r0, int r2, int r3);

    public static int stbtt_GetCodepointKernAdvance(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r5, int r6, int r7) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            int r0 = nstbtt_GetCodepointKernAdvance(r0, r1, r2)
            return r0
    }

    public static native int nstbtt_GetCodepointBox(long r0, int r2, long r3, long r5, long r7, long r9);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbtt_GetCodepointBox(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r12, int r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r14, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r16, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r17) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1c
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r16
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r17
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1c:
            r0 = r12
            long r0 = r0.address()
            r1 = r13
            r2 = r14
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r15
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r16
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            r5 = r17
            long r5 = org.lwjgl.system.MemoryUtil.memAddressSafe(r5)
            int r0 = nstbtt_GetCodepointBox(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L3d
            r0 = 1
            goto L3e
        L3d:
            r0 = 0
        L3e:
            return r0
    }

    public static native void nstbtt_GetGlyphHMetrics(long r0, int r2, long r3, long r5);

    public static void stbtt_GetGlyphHMetrics(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r8, int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L10:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            nstbtt_GetGlyphHMetrics(r0, r1, r2, r3)
            return
    }

    public static native int nstbtt_GetGlyphKernAdvance(long r0, int r2, int r3);

    public static int stbtt_GetGlyphKernAdvance(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r5, int r6, int r7) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            int r0 = nstbtt_GetGlyphKernAdvance(r0, r1, r2)
            return r0
    }

    public static native int nstbtt_GetGlyphBox(long r0, int r2, long r3, long r5, long r7, long r9);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbtt_GetGlyphBox(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r12, int r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r14, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r16, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r17) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1c
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r16
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r17
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1c:
            r0 = r12
            long r0 = r0.address()
            r1 = r13
            r2 = r14
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r15
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r16
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            r5 = r17
            long r5 = org.lwjgl.system.MemoryUtil.memAddressSafe(r5)
            int r0 = nstbtt_GetGlyphBox(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L3d
            r0 = 1
            goto L3e
        L3d:
            r0 = 0
        L3e:
            return r0
    }

    public static native int nstbtt_GetKerningTableLength(long r0);

    public static int stbtt_GetKerningTableLength(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r3) {
            r0 = r3
            long r0 = r0.address()
            int r0 = nstbtt_GetKerningTableLength(r0)
            return r0
    }

    public static native int nstbtt_GetKerningTable(long r0, long r2, int r4);

    public static int stbtt_GetKerningTable(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r6, @org.lwjgl.system.NativeType("stbtt_kerningentry *") org.lwjgl.stb.STBTTKerningentry.Buffer r7) {
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            r2 = r7
            int r2 = r2.remaining()
            int r0 = nstbtt_GetKerningTable(r0, r1, r2)
            return r0
    }

    public static native int nstbtt_IsGlyphEmpty(long r0, int r2);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbtt_IsGlyphEmpty(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r4, int r5) {
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            int r0 = nstbtt_IsGlyphEmpty(r0, r1)
            if (r0 == 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    public static native int nstbtt_GetCodepointShape(long r0, int r2, long r3);

    public static int stbtt_GetCodepointShape(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r6, int r7, @org.lwjgl.system.NativeType("stbtt_vertex **") org.lwjgl.PointerBuffer r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nstbtt_GetCodepointShape(r0, r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("int")
    public static org.lwjgl.stb.STBTTVertex.Buffer stbtt_GetCodepointShape(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r6, int r7) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = 0
            org.lwjgl.PointerBuffer r0 = r0.pointers(r1)     // Catch: java.lang.Throwable -> L34
            r10 = r0
            r0 = r6
            long r0 = r0.address()     // Catch: java.lang.Throwable -> L34
            r1 = r7
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L34
            int r0 = nstbtt_GetCodepointShape(r0, r1, r2)     // Catch: java.lang.Throwable -> L34
            r11 = r0
            r0 = r10
            r1 = 0
            long r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L34
            r1 = r11
            org.lwjgl.stb.STBTTVertex$Buffer r0 = org.lwjgl.stb.STBTTVertex.createSafe(r0, r1)     // Catch: java.lang.Throwable -> L34
            r12 = r0
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r12
            return r0
        L34:
            r13 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    public static native int nstbtt_GetGlyphShape(long r0, int r2, long r3);

    public static int stbtt_GetGlyphShape(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r6, int r7, @org.lwjgl.system.NativeType("stbtt_vertex **") org.lwjgl.PointerBuffer r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nstbtt_GetGlyphShape(r0, r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("int")
    public static org.lwjgl.stb.STBTTVertex.Buffer stbtt_GetGlyphShape(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r6, int r7) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = 0
            org.lwjgl.PointerBuffer r0 = r0.pointers(r1)     // Catch: java.lang.Throwable -> L34
            r10 = r0
            r0 = r6
            long r0 = r0.address()     // Catch: java.lang.Throwable -> L34
            r1 = r7
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L34
            int r0 = nstbtt_GetGlyphShape(r0, r1, r2)     // Catch: java.lang.Throwable -> L34
            r11 = r0
            r0 = r10
            r1 = 0
            long r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L34
            r1 = r11
            org.lwjgl.stb.STBTTVertex$Buffer r0 = org.lwjgl.stb.STBTTVertex.createSafe(r0, r1)     // Catch: java.lang.Throwable -> L34
            r12 = r0
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r12
            return r0
        L34:
            r13 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    public static native void nstbtt_FreeShape(long r0, long r2);

    public static void stbtt_FreeShape(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r5, @org.lwjgl.system.NativeType("stbtt_vertex *") org.lwjgl.stb.STBTTVertex.Buffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            nstbtt_FreeShape(r0, r1)
            return
    }

    public static native long nstbtt_FindSVGDoc(long r0, int r2);

    @org.lwjgl.system.NativeType("unsigned char *")
    public static long stbtt_FindSVGDoc(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r4, int r5) {
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            long r0 = nstbtt_FindSVGDoc(r0, r1)
            return r0
    }

    public static native int nstbtt_GetCodepointSVG(long r0, int r2, long r3);

    public static int stbtt_GetCodepointSVG(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r6, int r7, @org.lwjgl.system.NativeType("char const **") org.lwjgl.PointerBuffer r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nstbtt_GetCodepointSVG(r0, r1, r2)
            return r0
    }

    public static native int nstbtt_GetGlyphSVG(long r0, int r2, long r3);

    public static int stbtt_GetGlyphSVG(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r6, int r7, @org.lwjgl.system.NativeType("char const **") org.lwjgl.PointerBuffer r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nstbtt_GetGlyphSVG(r0, r1, r2)
            return r0
    }

    public static native void nstbtt_FreeBitmap(long r0, long r2);

    public static void stbtt_FreeBitmap(@org.lwjgl.system.NativeType("unsigned char *") java.nio.ByteBuffer r5, @org.lwjgl.system.NativeType("void *") long r6) {
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r6
            nstbtt_FreeBitmap(r0, r1)
            return
    }

    public static void stbtt_FreeBitmap(@org.lwjgl.system.NativeType("unsigned char *") java.nio.ByteBuffer r5) {
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = 0
            nstbtt_FreeBitmap(r0, r1)
            return
    }

    public static native long nstbtt_GetCodepointBitmap(long r0, float r2, float r3, int r4, long r5, long r7, long r9, long r11);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("unsigned char *")
    public static java.nio.ByteBuffer stbtt_GetCodepointBitmap(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r14, float r15, float r16, int r17, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r18, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r19, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r20, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r21) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r18
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r19
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r20
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r21
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1e:
            r0 = r14
            long r0 = r0.address()
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r19
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            r6 = r20
            long r6 = org.lwjgl.system.MemoryUtil.memAddressSafe(r6)
            r7 = r21
            long r7 = org.lwjgl.system.MemoryUtil.memAddressSafe(r7)
            long r0 = nstbtt_GetCodepointBitmap(r0, r1, r2, r3, r4, r5, r6, r7)
            r22 = r0
            r0 = r22
            r1 = r18
            r2 = r18
            int r2 = r2.position()
            int r1 = r1.get(r2)
            r2 = r19
            r3 = r19
            int r3 = r3.position()
            int r2 = r2.get(r3)
            int r1 = r1 * r2
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    public static native long nstbtt_GetCodepointBitmapSubpixel(long r0, float r2, float r3, float r4, float r5, int r6, long r7, long r9, long r11, long r13);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("unsigned char *")
    public static java.nio.ByteBuffer stbtt_GetCodepointBitmapSubpixel(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r16, float r17, float r18, float r19, float r20, int r21, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r22, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r23, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r24, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r25) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r22
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r23
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r24
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r25
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1e:
            r0 = r16
            long r0 = r0.address()
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            r7 = r23
            long r7 = org.lwjgl.system.MemoryUtil.memAddress(r7)
            r8 = r24
            long r8 = org.lwjgl.system.MemoryUtil.memAddressSafe(r8)
            r9 = r25
            long r9 = org.lwjgl.system.MemoryUtil.memAddressSafe(r9)
            long r0 = nstbtt_GetCodepointBitmapSubpixel(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r26 = r0
            r0 = r26
            r1 = r22
            r2 = r22
            int r2 = r2.position()
            int r1 = r1.get(r2)
            r2 = r23
            r3 = r23
            int r3 = r3.position()
            int r2 = r2.get(r3)
            int r1 = r1 * r2
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    public static native void nstbtt_MakeCodepointBitmap(long r0, long r2, int r4, int r5, int r6, float r7, float r8, int r9);

    public static void stbtt_MakeCodepointBitmap(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r11, @org.lwjgl.system.NativeType("unsigned char *") java.nio.ByteBuffer r12, int r13, int r14, int r15, float r16, float r17, int r18) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r12
            r1 = r15
            if (r1 == 0) goto L11
            r1 = r15
            goto L12
        L11:
            r1 = r13
        L12:
            r2 = r14
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            nstbtt_MakeCodepointBitmap(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static native void nstbtt_MakeCodepointBitmapSubpixel(long r0, long r2, int r4, int r5, int r6, float r7, float r8, float r9, float r10, int r11);

    public static void stbtt_MakeCodepointBitmapSubpixel(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r13, @org.lwjgl.system.NativeType("unsigned char *") java.nio.ByteBuffer r14, int r15, int r16, int r17, float r18, float r19, float r20, float r21, int r22) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r14
            r1 = r17
            if (r1 == 0) goto L11
            r1 = r17
            goto L12
        L11:
            r1 = r15
        L12:
            r2 = r16
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r13
            long r0 = r0.address()
            r1 = r14
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            nstbtt_MakeCodepointBitmapSubpixel(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static native void nstbtt_MakeCodepointBitmapSubpixelPrefilter(long r0, long r2, int r4, int r5, int r6, float r7, float r8, float r9, float r10, int r11, int r12, long r13, long r15, int r17);

    public static void stbtt_MakeCodepointBitmapSubpixelPrefilter(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r19, @org.lwjgl.system.NativeType("unsigned char *") java.nio.ByteBuffer r20, int r21, int r22, int r23, float r24, float r25, float r26, float r27, int r28, int r29, @org.lwjgl.system.NativeType("float *") java.nio.FloatBuffer r30, @org.lwjgl.system.NativeType("float *") java.nio.FloatBuffer r31, int r32) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L23
            r0 = r20
            r1 = r23
            if (r1 == 0) goto L11
            r1 = r23
            goto L12
        L11:
            r1 = r21
        L12:
            r2 = r22
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r30
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r31
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L23:
            r0 = r19
            long r0 = r0.address()
            r1 = r20
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            long r11 = org.lwjgl.system.MemoryUtil.memAddress(r11)
            r12 = r31
            long r12 = org.lwjgl.system.MemoryUtil.memAddress(r12)
            r13 = r32
            nstbtt_MakeCodepointBitmapSubpixelPrefilter(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
    }

    public static native void nstbtt_GetCodepointBitmapBox(long r0, int r2, float r3, float r4, long r5, long r7, long r9, long r11);

    public static void stbtt_GetCodepointBitmapBox(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r14, int r15, float r16, float r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r18, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r19, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r20, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r21) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r18
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r19
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r20
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r21
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1e:
            r0 = r14
            long r0 = r0.address()
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            r5 = r19
            long r5 = org.lwjgl.system.MemoryUtil.memAddressSafe(r5)
            r6 = r20
            long r6 = org.lwjgl.system.MemoryUtil.memAddressSafe(r6)
            r7 = r21
            long r7 = org.lwjgl.system.MemoryUtil.memAddressSafe(r7)
            nstbtt_GetCodepointBitmapBox(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static native void nstbtt_GetCodepointBitmapBoxSubpixel(long r0, int r2, float r3, float r4, float r5, float r6, long r7, long r9, long r11, long r13);

    public static void stbtt_GetCodepointBitmapBoxSubpixel(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r16, int r17, float r18, float r19, float r20, float r21, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r22, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r23, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r24, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r25) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r22
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r23
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r24
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r25
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1e:
            r0 = r16
            long r0 = r0.address()
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            long r6 = org.lwjgl.system.MemoryUtil.memAddressSafe(r6)
            r7 = r23
            long r7 = org.lwjgl.system.MemoryUtil.memAddressSafe(r7)
            r8 = r24
            long r8 = org.lwjgl.system.MemoryUtil.memAddressSafe(r8)
            r9 = r25
            long r9 = org.lwjgl.system.MemoryUtil.memAddressSafe(r9)
            nstbtt_GetCodepointBitmapBoxSubpixel(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static native long nstbtt_GetGlyphBitmap(long r0, float r2, float r3, int r4, long r5, long r7, long r9, long r11);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("unsigned char *")
    public static java.nio.ByteBuffer stbtt_GetGlyphBitmap(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r14, float r15, float r16, int r17, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r18, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r19, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r20, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r21) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r18
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r19
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r20
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r21
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1e:
            r0 = r14
            long r0 = r0.address()
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r19
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            r6 = r20
            long r6 = org.lwjgl.system.MemoryUtil.memAddressSafe(r6)
            r7 = r21
            long r7 = org.lwjgl.system.MemoryUtil.memAddressSafe(r7)
            long r0 = nstbtt_GetGlyphBitmap(r0, r1, r2, r3, r4, r5, r6, r7)
            r22 = r0
            r0 = r22
            r1 = r18
            r2 = r18
            int r2 = r2.position()
            int r1 = r1.get(r2)
            r2 = r19
            r3 = r19
            int r3 = r3.position()
            int r2 = r2.get(r3)
            int r1 = r1 * r2
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    public static native long nstbtt_GetGlyphBitmapSubpixel(long r0, float r2, float r3, float r4, float r5, int r6, long r7, long r9, long r11, long r13);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("unsigned char *")
    public static java.nio.ByteBuffer stbtt_GetGlyphBitmapSubpixel(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r16, float r17, float r18, float r19, float r20, int r21, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r22, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r23, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r24, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r25) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r22
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r23
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r24
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r25
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1e:
            r0 = r16
            long r0 = r0.address()
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            r7 = r23
            long r7 = org.lwjgl.system.MemoryUtil.memAddress(r7)
            r8 = r24
            long r8 = org.lwjgl.system.MemoryUtil.memAddressSafe(r8)
            r9 = r25
            long r9 = org.lwjgl.system.MemoryUtil.memAddressSafe(r9)
            long r0 = nstbtt_GetGlyphBitmapSubpixel(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r26 = r0
            r0 = r26
            r1 = r22
            r2 = r22
            int r2 = r2.position()
            int r1 = r1.get(r2)
            r2 = r23
            r3 = r23
            int r3 = r3.position()
            int r2 = r2.get(r3)
            int r1 = r1 * r2
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    public static native void nstbtt_MakeGlyphBitmap(long r0, long r2, int r4, int r5, int r6, float r7, float r8, int r9);

    public static void stbtt_MakeGlyphBitmap(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r11, @org.lwjgl.system.NativeType("unsigned char *") java.nio.ByteBuffer r12, int r13, int r14, int r15, float r16, float r17, int r18) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r12
            r1 = r15
            if (r1 == 0) goto L11
            r1 = r15
            goto L12
        L11:
            r1 = r13
        L12:
            r2 = r14
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            nstbtt_MakeGlyphBitmap(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static native void nstbtt_MakeGlyphBitmapSubpixel(long r0, long r2, int r4, int r5, int r6, float r7, float r8, float r9, float r10, int r11);

    public static void stbtt_MakeGlyphBitmapSubpixel(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r13, @org.lwjgl.system.NativeType("unsigned char *") java.nio.ByteBuffer r14, int r15, int r16, int r17, float r18, float r19, float r20, float r21, int r22) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r14
            r1 = r17
            if (r1 == 0) goto L11
            r1 = r17
            goto L12
        L11:
            r1 = r15
        L12:
            r2 = r16
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r13
            long r0 = r0.address()
            r1 = r14
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            nstbtt_MakeGlyphBitmapSubpixel(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static native void nstbtt_MakeGlyphBitmapSubpixelPrefilter(long r0, long r2, int r4, int r5, int r6, float r7, float r8, float r9, float r10, int r11, int r12, long r13, long r15, int r17);

    public static void stbtt_MakeGlyphBitmapSubpixelPrefilter(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r19, @org.lwjgl.system.NativeType("unsigned char *") java.nio.ByteBuffer r20, int r21, int r22, int r23, float r24, float r25, float r26, float r27, int r28, int r29, @org.lwjgl.system.NativeType("float *") java.nio.FloatBuffer r30, @org.lwjgl.system.NativeType("float *") java.nio.FloatBuffer r31, int r32) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L23
            r0 = r20
            r1 = r23
            if (r1 == 0) goto L11
            r1 = r23
            goto L12
        L11:
            r1 = r21
        L12:
            r2 = r22
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r30
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r31
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L23:
            r0 = r19
            long r0 = r0.address()
            r1 = r20
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            long r11 = org.lwjgl.system.MemoryUtil.memAddress(r11)
            r12 = r31
            long r12 = org.lwjgl.system.MemoryUtil.memAddress(r12)
            r13 = r32
            nstbtt_MakeGlyphBitmapSubpixelPrefilter(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
    }

    public static native void nstbtt_GetGlyphBitmapBox(long r0, int r2, float r3, float r4, long r5, long r7, long r9, long r11);

    public static void stbtt_GetGlyphBitmapBox(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r14, int r15, float r16, float r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r18, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r19, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r20, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r21) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r18
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r19
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r20
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r21
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1e:
            r0 = r14
            long r0 = r0.address()
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            r5 = r19
            long r5 = org.lwjgl.system.MemoryUtil.memAddressSafe(r5)
            r6 = r20
            long r6 = org.lwjgl.system.MemoryUtil.memAddressSafe(r6)
            r7 = r21
            long r7 = org.lwjgl.system.MemoryUtil.memAddressSafe(r7)
            nstbtt_GetGlyphBitmapBox(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static native void nstbtt_GetGlyphBitmapBoxSubpixel(long r0, int r2, float r3, float r4, float r5, float r6, long r7, long r9, long r11, long r13);

    public static void stbtt_GetGlyphBitmapBoxSubpixel(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r16, int r17, float r18, float r19, float r20, float r21, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r22, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r23, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r24, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r25) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r22
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r23
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r24
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r25
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1e:
            r0 = r16
            long r0 = r0.address()
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            long r6 = org.lwjgl.system.MemoryUtil.memAddressSafe(r6)
            r7 = r23
            long r7 = org.lwjgl.system.MemoryUtil.memAddressSafe(r7)
            r8 = r24
            long r8 = org.lwjgl.system.MemoryUtil.memAddressSafe(r8)
            r9 = r25
            long r9 = org.lwjgl.system.MemoryUtil.memAddressSafe(r9)
            nstbtt_GetGlyphBitmapBoxSubpixel(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static native void nstbtt_Rasterize(long r0, float r2, long r3, int r5, float r6, float r7, float r8, float r9, int r10, int r11, int r12, long r13);

    public static void stbtt_Rasterize(@org.lwjgl.system.NativeType("stbtt__bitmap *") org.lwjgl.stb.STBTTBitmap r16, float r17, @org.lwjgl.system.NativeType("stbtt_vertex *") org.lwjgl.stb.STBTTVertex.Buffer r18, float r19, float r20, float r21, float r22, int r23, int r24, @org.lwjgl.system.NativeType("int") boolean r25) {
            r0 = r16
            long r0 = r0.address()
            r1 = r17
            r2 = r18
            long r2 = r2.address()
            r3 = r18
            int r3 = r3.remaining()
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            if (r10 == 0) goto L21
            r10 = 1
            goto L22
        L21:
            r10 = 0
        L22:
            r11 = 0
            nstbtt_Rasterize(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public static native void nstbtt_FreeSDF(long r0, long r2);

    public static void stbtt_FreeSDF(@org.lwjgl.system.NativeType("unsigned char *") java.nio.ByteBuffer r5, @org.lwjgl.system.NativeType("void *") long r6) {
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r6
            nstbtt_FreeSDF(r0, r1)
            return
    }

    public static void stbtt_FreeSDF(@org.lwjgl.system.NativeType("unsigned char *") java.nio.ByteBuffer r5) {
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = 0
            nstbtt_FreeSDF(r0, r1)
            return
    }

    public static native long nstbtt_GetGlyphSDF(long r0, float r2, int r3, int r4, byte r5, float r6, long r7, long r9, long r11, long r13);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("unsigned char *")
    public static java.nio.ByteBuffer stbtt_GetGlyphSDF(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r16, float r17, int r18, int r19, @org.lwjgl.system.NativeType("unsigned char") byte r20, float r21, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r22, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r23, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r24, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r25) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r22
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r23
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r24
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r25
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1e:
            r0 = r16
            long r0 = r0.address()
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            r7 = r23
            long r7 = org.lwjgl.system.MemoryUtil.memAddress(r7)
            r8 = r24
            long r8 = org.lwjgl.system.MemoryUtil.memAddress(r8)
            r9 = r25
            long r9 = org.lwjgl.system.MemoryUtil.memAddress(r9)
            long r0 = nstbtt_GetGlyphSDF(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r26 = r0
            r0 = r26
            r1 = r22
            r2 = r22
            int r2 = r2.position()
            int r1 = r1.get(r2)
            r2 = r23
            r3 = r23
            int r3 = r3.position()
            int r2 = r2.get(r3)
            int r1 = r1 * r2
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    public static native long nstbtt_GetCodepointSDF(long r0, float r2, int r3, int r4, byte r5, float r6, long r7, long r9, long r11, long r13);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("unsigned char *")
    public static java.nio.ByteBuffer stbtt_GetCodepointSDF(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r16, float r17, int r18, int r19, @org.lwjgl.system.NativeType("unsigned char") byte r20, float r21, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r22, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r23, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r24, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r25) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r22
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r23
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r24
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r25
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1e:
            r0 = r16
            long r0 = r0.address()
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            r7 = r23
            long r7 = org.lwjgl.system.MemoryUtil.memAddress(r7)
            r8 = r24
            long r8 = org.lwjgl.system.MemoryUtil.memAddress(r8)
            r9 = r25
            long r9 = org.lwjgl.system.MemoryUtil.memAddress(r9)
            long r0 = nstbtt_GetCodepointSDF(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r26 = r0
            r0 = r26
            r1 = r22
            r2 = r22
            int r2 = r2.position()
            int r1 = r1.get(r2)
            r2 = r23
            r3 = r23
            int r3 = r3.position()
            int r2 = r2.get(r3)
            int r1 = r1 * r2
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    public static native int nstbtt_FindMatchingFont(long r0, long r2, int r4);

    public static int stbtt_FindMatchingFont(@org.lwjgl.system.NativeType("unsigned char const *") java.nio.ByteBuffer r6, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r7, int r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r6
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r8
            int r0 = nstbtt_FindMatchingFont(r0, r1, r2)
            return r0
    }

    public static int stbtt_FindMatchingFont(@org.lwjgl.system.NativeType("unsigned char const *") java.nio.ByteBuffer r6, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r7, int r8) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r9 = r0
            r0 = r9
            int r0 = r0.getPointer()
            r10 = r0
            r0 = r9
            r1 = r7
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L2c
            r0 = r9
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L2c
            r11 = r0
            r0 = r6
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)     // Catch: java.lang.Throwable -> L2c
            r1 = r11
            r2 = r8
            int r0 = nstbtt_FindMatchingFont(r0, r1, r2)     // Catch: java.lang.Throwable -> L2c
            r13 = r0
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r13
            return r0
        L2c:
            r14 = move-exception
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r14
            throw r0
    }

    public static native int nstbtt_CompareUTF8toUTF16_bigendian(long r0, int r2, long r3, int r5);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbtt_CompareUTF8toUTF16_bigendian(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r7, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r8) {
            r0 = r7
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r1 = r1.remaining()
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r8
            int r3 = r3.remaining()
            int r0 = nstbtt_CompareUTF8toUTF16_bigendian(r0, r1, r2, r3)
            if (r0 == 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            return r0
    }

    public static native long nstbtt_GetFontNameString(long r0, long r2, int r4, int r5, int r6, int r7);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public static java.nio.ByteBuffer stbtt_GetFontNameString(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r9, int r10, int r11, int r12, int r13) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r14 = r0
            r0 = r14
            int r0 = r0.getPointer()
            r15 = r0
            r0 = r14
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)
            r16 = r0
            r0 = r9
            long r0 = r0.address()     // Catch: java.lang.Throwable -> L3e
            r1 = r16
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L3e
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            long r0 = nstbtt_GetFontNameString(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L3e
            r17 = r0
            r0 = r17
            r1 = r16
            r2 = 0
            int r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L3e
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)     // Catch: java.lang.Throwable -> L3e
            r19 = r0
            r0 = r14
            r1 = r15
            r0.setPointer(r1)
            r0 = r19
            return r0
        L3e:
            r20 = move-exception
            r0 = r14
            r1 = r15
            r0.setPointer(r1)
            r0 = r20
            throw r0
    }

    public static native void nstbtt_GetBakedQuad(long r0, int r2, int r3, int r4, float[] r5, float[] r6, long r7, int r9);

    public static void stbtt_GetBakedQuad(@org.lwjgl.system.NativeType("stbtt_bakedchar const *") org.lwjgl.stb.STBTTBakedChar.Buffer r11, int r12, int r13, int r14, @org.lwjgl.system.NativeType("float *") float[] r15, @org.lwjgl.system.NativeType("float *") float[] r16, @org.lwjgl.system.NativeType("stbtt_aligned_quad *") org.lwjgl.stb.STBTTAlignedQuad r17, @org.lwjgl.system.NativeType("int") boolean r18) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            r1 = r14
            r2 = 1
            int r1 = r1 + r2
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r16
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            long r6 = r6.address()
            r7 = r18
            if (r7 == 0) goto L32
            r7 = 1
            goto L33
        L32:
            r7 = 0
        L33:
            nstbtt_GetBakedQuad(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static native void nstbtt_GetScaledFontVMetrics(long r0, int r2, float r3, float[] r4, float[] r5, float[] r6);

    public static void stbtt_GetScaledFontVMetrics(@org.lwjgl.system.NativeType("unsigned char const *") java.nio.ByteBuffer r8, int r9, float r10, @org.lwjgl.system.NativeType("float *") float[] r11, @org.lwjgl.system.NativeType("float *") float[] r12, @org.lwjgl.system.NativeType("float *") float[] r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r8
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            nstbtt_GetScaledFontVMetrics(r0, r1, r2, r3, r4, r5)
            return
    }

    public static native void nstbtt_GetPackedQuad(long r0, int r2, int r3, int r4, float[] r5, float[] r6, long r7, int r9);

    public static void stbtt_GetPackedQuad(@org.lwjgl.system.NativeType("stbtt_packedchar const *") org.lwjgl.stb.STBTTPackedchar.Buffer r11, int r12, int r13, int r14, @org.lwjgl.system.NativeType("float *") float[] r15, @org.lwjgl.system.NativeType("float *") float[] r16, @org.lwjgl.system.NativeType("stbtt_aligned_quad *") org.lwjgl.stb.STBTTAlignedQuad r17, @org.lwjgl.system.NativeType("int") boolean r18) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            r1 = r14
            r2 = 1
            int r1 = r1 + r2
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r16
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            long r6 = r6.address()
            r7 = r18
            if (r7 == 0) goto L32
            r7 = 1
            goto L33
        L32:
            r7 = 0
        L33:
            nstbtt_GetPackedQuad(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static native void nstbtt_GetFontVMetrics(long r0, int[] r2, int[] r3, int[] r4);

    public static void stbtt_GetFontVMetrics(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L15:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            r3 = r9
            nstbtt_GetFontVMetrics(r0, r1, r2, r3)
            return
    }

    public static native int nstbtt_GetFontVMetricsOS2(long r0, int[] r2, int[] r3, int[] r4);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbtt_GetFontVMetricsOS2(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L15:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            r3 = r9
            int r0 = nstbtt_GetFontVMetricsOS2(r0, r1, r2, r3)
            if (r0 == 0) goto L26
            r0 = 1
            goto L27
        L26:
            r0 = 0
        L27:
            return r0
    }

    public static native void nstbtt_GetFontBoundingBox(long r0, int[] r2, int[] r3, int[] r4, int[] r5);

    public static void stbtt_GetFontBoundingBox(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r7, @org.lwjgl.system.NativeType("int *") int[] r8, @org.lwjgl.system.NativeType("int *") int[] r9, @org.lwjgl.system.NativeType("int *") int[] r10, @org.lwjgl.system.NativeType("int *") int[] r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1b:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            nstbtt_GetFontBoundingBox(r0, r1, r2, r3, r4)
            return
    }

    public static native void nstbtt_GetCodepointHMetrics(long r0, int r2, int[] r3, int[] r4);

    public static void stbtt_GetCodepointHMetrics(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r6, int r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L10:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            r3 = r9
            nstbtt_GetCodepointHMetrics(r0, r1, r2, r3)
            return
    }

    public static native int nstbtt_GetCodepointBox(long r0, int r2, int[] r3, int[] r4, int[] r5, int[] r6);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbtt_GetCodepointBox(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r8, int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1c
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1c:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            int r0 = nstbtt_GetCodepointBox(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L31
            r0 = 1
            goto L32
        L31:
            r0 = 0
        L32:
            return r0
    }

    public static native void nstbtt_GetGlyphHMetrics(long r0, int r2, int[] r3, int[] r4);

    public static void stbtt_GetGlyphHMetrics(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r6, int r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L10:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            r3 = r9
            nstbtt_GetGlyphHMetrics(r0, r1, r2, r3)
            return
    }

    public static native int nstbtt_GetGlyphBox(long r0, int r2, int[] r3, int[] r4, int[] r5, int[] r6);

    @org.lwjgl.system.NativeType("int")
    public static boolean stbtt_GetGlyphBox(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r8, int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1c
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1c:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            int r0 = nstbtt_GetGlyphBox(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L31
            r0 = 1
            goto L32
        L31:
            r0 = 0
        L32:
            return r0
    }

    public static native long nstbtt_GetCodepointBitmap(long r0, float r2, float r3, int r4, int[] r5, int[] r6, int[] r7, int[] r8);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("unsigned char *")
    public static java.nio.ByteBuffer stbtt_GetCodepointBitmap(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r10, float r11, float r12, int r13, @org.lwjgl.system.NativeType("int *") int[] r14, @org.lwjgl.system.NativeType("int *") int[] r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r16, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r17) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r16
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r17
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1e:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            long r0 = nstbtt_GetCodepointBitmap(r0, r1, r2, r3, r4, r5, r6, r7)
            r18 = r0
            r0 = r18
            r1 = r14
            r2 = 0
            r1 = r1[r2]
            r2 = r15
            r3 = 0
            r2 = r2[r3]
            int r1 = r1 * r2
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    public static native long nstbtt_GetCodepointBitmapSubpixel(long r0, float r2, float r3, float r4, float r5, int r6, int[] r7, int[] r8, int[] r9, int[] r10);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("unsigned char *")
    public static java.nio.ByteBuffer stbtt_GetCodepointBitmapSubpixel(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r12, float r13, float r14, float r15, float r16, int r17, @org.lwjgl.system.NativeType("int *") int[] r18, @org.lwjgl.system.NativeType("int *") int[] r19, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r20, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r21) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r18
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r19
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r20
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r21
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1e:
            r0 = r12
            long r0 = r0.address()
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            long r0 = nstbtt_GetCodepointBitmapSubpixel(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r22 = r0
            r0 = r22
            r1 = r18
            r2 = 0
            r1 = r1[r2]
            r2 = r19
            r3 = 0
            r2 = r2[r3]
            int r1 = r1 * r2
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    public static native void nstbtt_MakeCodepointBitmapSubpixelPrefilter(long r0, long r2, int r4, int r5, int r6, float r7, float r8, float r9, float r10, int r11, int r12, float[] r13, float[] r14, int r15);

    public static void stbtt_MakeCodepointBitmapSubpixelPrefilter(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r17, @org.lwjgl.system.NativeType("unsigned char *") java.nio.ByteBuffer r18, int r19, int r20, int r21, float r22, float r23, float r24, float r25, int r26, int r27, @org.lwjgl.system.NativeType("float *") float[] r28, @org.lwjgl.system.NativeType("float *") float[] r29, int r30) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L23
            r0 = r18
            r1 = r21
            if (r1 == 0) goto L11
            r1 = r21
            goto L12
        L11:
            r1 = r19
        L12:
            r2 = r20
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r28
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r29
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L23:
            r0 = r17
            long r0 = r0.address()
            r1 = r18
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r11 = r28
            r12 = r29
            r13 = r30
            nstbtt_MakeCodepointBitmapSubpixelPrefilter(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
    }

    public static native void nstbtt_GetCodepointBitmapBox(long r0, int r2, float r3, float r4, int[] r5, int[] r6, int[] r7, int[] r8);

    public static void stbtt_GetCodepointBitmapBox(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r10, int r11, float r12, float r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r14, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r16, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r17) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r16
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r17
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1e:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            nstbtt_GetCodepointBitmapBox(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static native void nstbtt_GetCodepointBitmapBoxSubpixel(long r0, int r2, float r3, float r4, float r5, float r6, int[] r7, int[] r8, int[] r9, int[] r10);

    public static void stbtt_GetCodepointBitmapBoxSubpixel(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r12, int r13, float r14, float r15, float r16, float r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r18, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r19, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r20, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r21) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r18
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r19
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r20
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r21
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1e:
            r0 = r12
            long r0 = r0.address()
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            nstbtt_GetCodepointBitmapBoxSubpixel(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static native long nstbtt_GetGlyphBitmap(long r0, float r2, float r3, int r4, int[] r5, int[] r6, int[] r7, int[] r8);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("unsigned char *")
    public static java.nio.ByteBuffer stbtt_GetGlyphBitmap(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r10, float r11, float r12, int r13, @org.lwjgl.system.NativeType("int *") int[] r14, @org.lwjgl.system.NativeType("int *") int[] r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r16, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r17) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r16
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r17
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1e:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            long r0 = nstbtt_GetGlyphBitmap(r0, r1, r2, r3, r4, r5, r6, r7)
            r18 = r0
            r0 = r18
            r1 = r14
            r2 = 0
            r1 = r1[r2]
            r2 = r15
            r3 = 0
            r2 = r2[r3]
            int r1 = r1 * r2
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    public static native long nstbtt_GetGlyphBitmapSubpixel(long r0, float r2, float r3, float r4, float r5, int r6, int[] r7, int[] r8, int[] r9, int[] r10);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("unsigned char *")
    public static java.nio.ByteBuffer stbtt_GetGlyphBitmapSubpixel(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r12, float r13, float r14, float r15, float r16, int r17, @org.lwjgl.system.NativeType("int *") int[] r18, @org.lwjgl.system.NativeType("int *") int[] r19, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r20, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r21) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r18
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r19
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r20
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r21
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1e:
            r0 = r12
            long r0 = r0.address()
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            long r0 = nstbtt_GetGlyphBitmapSubpixel(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r22 = r0
            r0 = r22
            r1 = r18
            r2 = 0
            r1 = r1[r2]
            r2 = r19
            r3 = 0
            r2 = r2[r3]
            int r1 = r1 * r2
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    public static native void nstbtt_MakeGlyphBitmapSubpixelPrefilter(long r0, long r2, int r4, int r5, int r6, float r7, float r8, float r9, float r10, int r11, int r12, float[] r13, float[] r14, int r15);

    public static void stbtt_MakeGlyphBitmapSubpixelPrefilter(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r17, @org.lwjgl.system.NativeType("unsigned char *") java.nio.ByteBuffer r18, int r19, int r20, int r21, float r22, float r23, float r24, float r25, int r26, int r27, @org.lwjgl.system.NativeType("float *") float[] r28, @org.lwjgl.system.NativeType("float *") float[] r29, int r30) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L23
            r0 = r18
            r1 = r21
            if (r1 == 0) goto L11
            r1 = r21
            goto L12
        L11:
            r1 = r19
        L12:
            r2 = r20
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r28
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r29
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L23:
            r0 = r17
            long r0 = r0.address()
            r1 = r18
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r11 = r28
            r12 = r29
            r13 = r30
            nstbtt_MakeGlyphBitmapSubpixelPrefilter(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
    }

    public static native void nstbtt_GetGlyphBitmapBox(long r0, int r2, float r3, float r4, int[] r5, int[] r6, int[] r7, int[] r8);

    public static void stbtt_GetGlyphBitmapBox(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r10, int r11, float r12, float r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r14, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r16, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r17) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r16
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r17
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1e:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            nstbtt_GetGlyphBitmapBox(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static native void nstbtt_GetGlyphBitmapBoxSubpixel(long r0, int r2, float r3, float r4, float r5, float r6, int[] r7, int[] r8, int[] r9, int[] r10);

    public static void stbtt_GetGlyphBitmapBoxSubpixel(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r12, int r13, float r14, float r15, float r16, float r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r18, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r19, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r20, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r21) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r18
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r19
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r20
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r21
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1e:
            r0 = r12
            long r0 = r0.address()
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            nstbtt_GetGlyphBitmapBoxSubpixel(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static native long nstbtt_GetGlyphSDF(long r0, float r2, int r3, int r4, byte r5, float r6, int[] r7, int[] r8, int[] r9, int[] r10);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("unsigned char *")
    public static java.nio.ByteBuffer stbtt_GetGlyphSDF(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r12, float r13, int r14, int r15, @org.lwjgl.system.NativeType("unsigned char") byte r16, float r17, @org.lwjgl.system.NativeType("int *") int[] r18, @org.lwjgl.system.NativeType("int *") int[] r19, @org.lwjgl.system.NativeType("int *") int[] r20, @org.lwjgl.system.NativeType("int *") int[] r21) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r18
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r19
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r20
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r21
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1e:
            r0 = r12
            long r0 = r0.address()
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            long r0 = nstbtt_GetGlyphSDF(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r22 = r0
            r0 = r22
            r1 = r18
            r2 = 0
            r1 = r1[r2]
            r2 = r19
            r3 = 0
            r2 = r2[r3]
            int r1 = r1 * r2
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    public static native long nstbtt_GetCodepointSDF(long r0, float r2, int r3, int r4, byte r5, float r6, int[] r7, int[] r8, int[] r9, int[] r10);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("unsigned char *")
    public static java.nio.ByteBuffer stbtt_GetCodepointSDF(@org.lwjgl.system.NativeType("stbtt_fontinfo const *") org.lwjgl.stb.STBTTFontinfo r12, float r13, int r14, int r15, @org.lwjgl.system.NativeType("unsigned char") byte r16, float r17, @org.lwjgl.system.NativeType("int *") int[] r18, @org.lwjgl.system.NativeType("int *") int[] r19, @org.lwjgl.system.NativeType("int *") int[] r20, @org.lwjgl.system.NativeType("int *") int[] r21) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r18
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r19
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r20
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r21
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1e:
            r0 = r12
            long r0 = r0.address()
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            long r0 = nstbtt_GetCodepointSDF(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r22 = r0
            r0 = r22
            r1 = r18
            r2 = 0
            r1 = r1[r2]
            r2 = r19
            r3 = 0
            r2 = r2[r3]
            int r1 = r1 * r2
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    static {
            org.lwjgl.stb.LibSTB.initialize()
            return
    }
}
