package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/TT_OS2.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/TT_OS2.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/TT_OS2.class */
public class TT_OS2 extends org.lwjgl.system.Struct<org.lwjgl.util.freetype.TT_OS2> {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int VERSION = 0;
    public static final int XAVGCHARWIDTH = 0;
    public static final int USWEIGHTCLASS = 0;
    public static final int USWIDTHCLASS = 0;
    public static final int FSTYPE = 0;
    public static final int YSUBSCRIPTXSIZE = 0;
    public static final int YSUBSCRIPTYSIZE = 0;
    public static final int YSUBSCRIPTXOFFSET = 0;
    public static final int YSUBSCRIPTYOFFSET = 0;
    public static final int YSUPERSCRIPTXSIZE = 0;
    public static final int YSUPERSCRIPTYSIZE = 0;
    public static final int YSUPERSCRIPTXOFFSET = 0;
    public static final int YSUPERSCRIPTYOFFSET = 0;
    public static final int YSTRIKEOUTSIZE = 0;
    public static final int YSTRIKEOUTPOSITION = 0;
    public static final int SFAMILYCLASS = 0;
    public static final int PANOSE = 0;
    public static final int ULUNICODERANGE1 = 0;
    public static final int ULUNICODERANGE2 = 0;
    public static final int ULUNICODERANGE3 = 0;
    public static final int ULUNICODERANGE4 = 0;
    public static final int ACHVENDID = 0;
    public static final int FSSELECTION = 0;
    public static final int USFIRSTCHARINDEX = 0;
    public static final int USLASTCHARINDEX = 0;
    public static final int STYPOASCENDER = 0;
    public static final int STYPODESCENDER = 0;
    public static final int STYPOLINEGAP = 0;
    public static final int USWINASCENT = 0;
    public static final int USWINDESCENT = 0;
    public static final int ULCODEPAGERANGE1 = 0;
    public static final int ULCODEPAGERANGE2 = 0;
    public static final int SXHEIGHT = 0;
    public static final int SCAPHEIGHT = 0;
    public static final int USDEFAULTCHAR = 0;
    public static final int USBREAKCHAR = 0;
    public static final int USMAXCONTEXT = 0;
    public static final int USLOWEROPTICALPOINTSIZE = 0;
    public static final int USUPPEROPTICALPOINTSIZE = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/TT_OS2$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/TT_OS2$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/TT_OS2$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.freetype.TT_OS2, org.lwjgl.util.freetype.TT_OS2.Buffer> {
        private static final org.lwjgl.util.freetype.TT_OS2 ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.freetype.TT_OS2.SIZEOF
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
        protected org.lwjgl.util.freetype.TT_OS2.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.freetype.TT_OS2 getElementFactory() {
                r2 = this;
                org.lwjgl.util.freetype.TT_OS2 r0 = org.lwjgl.util.freetype.TT_OS2.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short version() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_OS2.nversion(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short xAvgCharWidth() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_OS2.nxAvgCharWidth(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short usWeightClass() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_OS2.nusWeightClass(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short usWidthClass() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_OS2.nusWidthClass(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short fsType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_OS2.nfsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short ySubscriptXSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_OS2.nySubscriptXSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short ySubscriptYSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_OS2.nySubscriptYSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short ySubscriptXOffset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_OS2.nySubscriptXOffset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short ySubscriptYOffset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_OS2.nySubscriptYOffset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short ySuperscriptXSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_OS2.nySuperscriptXSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short ySuperscriptYSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_OS2.nySuperscriptYSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short ySuperscriptXOffset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_OS2.nySuperscriptXOffset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short ySuperscriptYOffset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_OS2.nySuperscriptYOffset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short yStrikeoutSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_OS2.nyStrikeoutSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short yStrikeoutPosition() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_OS2.nyStrikeoutPosition(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short sFamilyClass() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_OS2.nsFamilyClass(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Byte[10]")
        public java.nio.ByteBuffer panose() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.util.freetype.TT_OS2.npanose(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Byte")
        public byte panose(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.util.freetype.TT_OS2.npanose(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_ULong")
        public long ulUnicodeRange1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.TT_OS2.nulUnicodeRange1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_ULong")
        public long ulUnicodeRange2() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.TT_OS2.nulUnicodeRange2(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_ULong")
        public long ulUnicodeRange3() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.TT_OS2.nulUnicodeRange3(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_ULong")
        public long ulUnicodeRange4() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.TT_OS2.nulUnicodeRange4(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Char[4]")
        public java.nio.ByteBuffer achVendID() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.util.freetype.TT_OS2.nachVendID(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Char")
        public byte achVendID(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.util.freetype.TT_OS2.nachVendID(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short fsSelection() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_OS2.nfsSelection(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short usFirstCharIndex() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_OS2.nusFirstCharIndex(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short usLastCharIndex() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_OS2.nusLastCharIndex(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short sTypoAscender() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_OS2.nsTypoAscender(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short sTypoDescender() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_OS2.nsTypoDescender(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short sTypoLineGap() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_OS2.nsTypoLineGap(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short usWinAscent() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_OS2.nusWinAscent(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short usWinDescent() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_OS2.nusWinDescent(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_ULong")
        public long ulCodePageRange1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.TT_OS2.nulCodePageRange1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_ULong")
        public long ulCodePageRange2() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.TT_OS2.nulCodePageRange2(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short sxHeight() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_OS2.nsxHeight(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short sCapHeight() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_OS2.nsCapHeight(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short usDefaultChar() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_OS2.nusDefaultChar(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short usBreakChar() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_OS2.nusBreakChar(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short usMaxContext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_OS2.nusMaxContext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short usLowerOpticalPointSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_OS2.nusLowerOpticalPointSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short usUpperOpticalPointSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_OS2.nusUpperOpticalPointSize(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.TT_OS2 r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.TT_OS2$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.freetype.TT_OS2 r0 = org.lwjgl.util.freetype.TT_OS2.create(r0)
                org.lwjgl.util.freetype.TT_OS2.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected TT_OS2(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.freetype.TT_OS2 create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.freetype.TT_OS2 r0 = new org.lwjgl.util.freetype.TT_OS2
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public TT_OS2(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_OS2.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.freetype.TT_OS2.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short version() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nversion(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short xAvgCharWidth() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nxAvgCharWidth(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short usWeightClass() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nusWeightClass(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short usWidthClass() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nusWidthClass(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short fsType() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nfsType(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short ySubscriptXSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nySubscriptXSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short ySubscriptYSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nySubscriptYSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short ySubscriptXOffset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nySubscriptXOffset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short ySubscriptYOffset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nySubscriptYOffset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short ySuperscriptXSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nySuperscriptXSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short ySuperscriptYSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nySuperscriptYSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short ySuperscriptXOffset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nySuperscriptXOffset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short ySuperscriptYOffset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nySuperscriptYOffset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short yStrikeoutSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nyStrikeoutSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short yStrikeoutPosition() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nyStrikeoutPosition(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short sFamilyClass() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nsFamilyClass(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Byte[10]")
    public java.nio.ByteBuffer panose() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = npanose(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Byte")
    public byte panose(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = npanose(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_ULong")
    public long ulUnicodeRange1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nulUnicodeRange1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_ULong")
    public long ulUnicodeRange2() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nulUnicodeRange2(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_ULong")
    public long ulUnicodeRange3() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nulUnicodeRange3(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_ULong")
    public long ulUnicodeRange4() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nulUnicodeRange4(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Char[4]")
    public java.nio.ByteBuffer achVendID() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nachVendID(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Char")
    public byte achVendID(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = nachVendID(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short fsSelection() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nfsSelection(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short usFirstCharIndex() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nusFirstCharIndex(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short usLastCharIndex() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nusLastCharIndex(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short sTypoAscender() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nsTypoAscender(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short sTypoDescender() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nsTypoDescender(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short sTypoLineGap() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nsTypoLineGap(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short usWinAscent() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nusWinAscent(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short usWinDescent() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nusWinDescent(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_ULong")
    public long ulCodePageRange1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nulCodePageRange1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_ULong")
    public long ulCodePageRange2() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nulCodePageRange2(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short sxHeight() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nsxHeight(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short sCapHeight() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nsCapHeight(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short usDefaultChar() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nusDefaultChar(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short usBreakChar() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nusBreakChar(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short usMaxContext() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nusMaxContext(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short usLowerOpticalPointSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nusLowerOpticalPointSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short usUpperOpticalPointSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nusUpperOpticalPointSize(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.TT_OS2 create(long r6) {
            org.lwjgl.util.freetype.TT_OS2 r0 = new org.lwjgl.util.freetype.TT_OS2
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.TT_OS2 createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.TT_OS2 r0 = new org.lwjgl.util.freetype.TT_OS2
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.TT_OS2.Buffer create(long r6, int r8) {
            org.lwjgl.util.freetype.TT_OS2$Buffer r0 = new org.lwjgl.util.freetype.TT_OS2$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.TT_OS2.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.TT_OS2$Buffer r0 = new org.lwjgl.util.freetype.TT_OS2$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static short nversion(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_OS2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_OS2.VERSION
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nxAvgCharWidth(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_OS2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_OS2.XAVGCHARWIDTH
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nusWeightClass(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_OS2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_OS2.USWEIGHTCLASS
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nusWidthClass(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_OS2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_OS2.USWIDTHCLASS
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nfsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_OS2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_OS2.FSTYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nySubscriptXSize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_OS2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_OS2.YSUBSCRIPTXSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nySubscriptYSize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_OS2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_OS2.YSUBSCRIPTYSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nySubscriptXOffset(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_OS2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_OS2.YSUBSCRIPTXOFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nySubscriptYOffset(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_OS2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_OS2.YSUBSCRIPTYOFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nySuperscriptXSize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_OS2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_OS2.YSUPERSCRIPTXSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nySuperscriptYSize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_OS2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_OS2.YSUPERSCRIPTYSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nySuperscriptXOffset(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_OS2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_OS2.YSUPERSCRIPTXOFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nySuperscriptYOffset(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_OS2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_OS2.YSUPERSCRIPTYOFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nyStrikeoutSize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_OS2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_OS2.YSTRIKEOUTSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nyStrikeoutPosition(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_OS2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_OS2.YSTRIKEOUTPOSITION
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nsFamilyClass(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_OS2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_OS2.SFAMILYCLASS
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer npanose(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.TT_OS2.PANOSE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 10
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte npanose(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_OS2.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.util.freetype.TT_OS2.PANOSE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 10
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static long nulUnicodeRange1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.TT_OS2.ULUNICODERANGE1
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nulUnicodeRange2(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.TT_OS2.ULUNICODERANGE2
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nulUnicodeRange3(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.TT_OS2.ULUNICODERANGE3
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nulUnicodeRange4(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.TT_OS2.ULUNICODERANGE4
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static java.nio.ByteBuffer nachVendID(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.TT_OS2.ACHVENDID
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 4
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte nachVendID(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_OS2.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.util.freetype.TT_OS2.ACHVENDID
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 4
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static short nfsSelection(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_OS2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_OS2.FSSELECTION
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nusFirstCharIndex(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_OS2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_OS2.USFIRSTCHARINDEX
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nusLastCharIndex(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_OS2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_OS2.USLASTCHARINDEX
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nsTypoAscender(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_OS2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_OS2.STYPOASCENDER
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nsTypoDescender(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_OS2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_OS2.STYPODESCENDER
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nsTypoLineGap(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_OS2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_OS2.STYPOLINEGAP
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nusWinAscent(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_OS2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_OS2.USWINASCENT
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nusWinDescent(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_OS2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_OS2.USWINDESCENT
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static long nulCodePageRange1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.TT_OS2.ULCODEPAGERANGE1
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nulCodePageRange2(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.TT_OS2.ULCODEPAGERANGE2
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static short nsxHeight(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_OS2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_OS2.SXHEIGHT
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nsCapHeight(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_OS2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_OS2.SCAPHEIGHT
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nusDefaultChar(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_OS2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_OS2.USDEFAULTCHAR
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nusBreakChar(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_OS2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_OS2.USBREAKCHAR
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nusMaxContext(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_OS2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_OS2.USMAXCONTEXT
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nusLowerOpticalPointSize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_OS2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_OS2.USLOWEROPTICALPOINTSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nusUpperOpticalPointSize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_OS2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_OS2.USUPPEROPTICALPOINTSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.util.freetype.TT_OS2 r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 39
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 15
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 16
            r3 = 1
            r4 = 10
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 17
            int r3 = org.lwjgl.util.freetype.TT_OS2.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 18
            int r3 = org.lwjgl.util.freetype.TT_OS2.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 19
            int r3 = org.lwjgl.util.freetype.TT_OS2.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 20
            int r3 = org.lwjgl.util.freetype.TT_OS2.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 21
            r3 = 1
            r4 = 4
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 22
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 23
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 24
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 25
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 26
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 27
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 28
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 29
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 30
            int r3 = org.lwjgl.util.freetype.TT_OS2.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 31
            int r3 = org.lwjgl.util.freetype.TT_OS2.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 32
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 33
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 34
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 35
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 36
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 37
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 38
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.util.freetype.TT_OS2.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.util.freetype.TT_OS2.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_OS2.VERSION = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_OS2.XAVGCHARWIDTH = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_OS2.USWEIGHTCLASS = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_OS2.USWIDTHCLASS = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_OS2.FSTYPE = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_OS2.YSUBSCRIPTXSIZE = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_OS2.YSUBSCRIPTYSIZE = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_OS2.YSUBSCRIPTXOFFSET = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_OS2.YSUBSCRIPTYOFFSET = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_OS2.YSUPERSCRIPTXSIZE = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_OS2.YSUPERSCRIPTYSIZE = r0
            r0 = r6
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_OS2.YSUPERSCRIPTXOFFSET = r0
            r0 = r6
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_OS2.YSUPERSCRIPTYOFFSET = r0
            r0 = r6
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_OS2.YSTRIKEOUTSIZE = r0
            r0 = r6
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_OS2.YSTRIKEOUTPOSITION = r0
            r0 = r6
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_OS2.SFAMILYCLASS = r0
            r0 = r6
            r1 = 16
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_OS2.PANOSE = r0
            r0 = r6
            r1 = 17
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_OS2.ULUNICODERANGE1 = r0
            r0 = r6
            r1 = 18
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_OS2.ULUNICODERANGE2 = r0
            r0 = r6
            r1 = 19
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_OS2.ULUNICODERANGE3 = r0
            r0 = r6
            r1 = 20
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_OS2.ULUNICODERANGE4 = r0
            r0 = r6
            r1 = 21
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_OS2.ACHVENDID = r0
            r0 = r6
            r1 = 22
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_OS2.FSSELECTION = r0
            r0 = r6
            r1 = 23
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_OS2.USFIRSTCHARINDEX = r0
            r0 = r6
            r1 = 24
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_OS2.USLASTCHARINDEX = r0
            r0 = r6
            r1 = 25
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_OS2.STYPOASCENDER = r0
            r0 = r6
            r1 = 26
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_OS2.STYPODESCENDER = r0
            r0 = r6
            r1 = 27
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_OS2.STYPOLINEGAP = r0
            r0 = r6
            r1 = 28
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_OS2.USWINASCENT = r0
            r0 = r6
            r1 = 29
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_OS2.USWINDESCENT = r0
            r0 = r6
            r1 = 30
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_OS2.ULCODEPAGERANGE1 = r0
            r0 = r6
            r1 = 31
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_OS2.ULCODEPAGERANGE2 = r0
            r0 = r6
            r1 = 32
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_OS2.SXHEIGHT = r0
            r0 = r6
            r1 = 33
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_OS2.SCAPHEIGHT = r0
            r0 = r6
            r1 = 34
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_OS2.USDEFAULTCHAR = r0
            r0 = r6
            r1 = 35
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_OS2.USBREAKCHAR = r0
            r0 = r6
            r1 = 36
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_OS2.USMAXCONTEXT = r0
            r0 = r6
            r1 = 37
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_OS2.USLOWEROPTICALPOINTSIZE = r0
            r0 = r6
            r1 = 38
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_OS2.USUPPEROPTICALPOINTSIZE = r0
            return
    }
}
