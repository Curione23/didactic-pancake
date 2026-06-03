package org.lwjgl.system.windows;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/DEVMODE.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/DEVMODE.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/DEVMODE.class */
public class DEVMODE extends org.lwjgl.system.Struct<org.lwjgl.system.windows.DEVMODE> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int DMDEVICENAME = 0;
    public static final int DMSPECVERSION = 0;
    public static final int DMDRIVERVERSION = 0;
    public static final int DMSIZE = 0;
    public static final int DMDRIVEREXTRA = 0;
    public static final int DMFIELDS = 0;
    public static final int DMORIENTATION = 0;
    public static final int DMPAPERSIZE = 0;
    public static final int DMPAPERLENGTH = 0;
    public static final int DMPAPERWIDTH = 0;
    public static final int DMSCALE = 0;
    public static final int DMCOPIES = 0;
    public static final int DMDEFAULTSOURCE = 0;
    public static final int DMPRINTQUALITY = 0;
    public static final int DMPOSITION = 0;
    public static final int DMDISPLAYORIENTATION = 0;
    public static final int DMDISPLAYFIXEDOUTPUT = 0;
    public static final int DMCOLOR = 0;
    public static final int DMDUPLEX = 0;
    public static final int DMYRESOLUTION = 0;
    public static final int DMTTOPTION = 0;
    public static final int DMCOLLATE = 0;
    public static final int DMFORMNAME = 0;
    public static final int DMLOGPIXELS = 0;
    public static final int DMBITSPERPEL = 0;
    public static final int DMPELSWIDTH = 0;
    public static final int DMPELSHEIGHT = 0;
    public static final int DMDISPLAYFLAGS = 0;
    public static final int DMNUP = 0;
    public static final int DMDISPLAYFREQUENCY = 0;
    public static final int DMICMMETHOD = 0;
    public static final int DMICMINTENT = 0;
    public static final int DMMEDIATYPE = 0;
    public static final int DMDITHERTYPE = 0;
    public static final int DMRESERVED1 = 0;
    public static final int DMRESERVED2 = 0;
    public static final int DMPANNINGWIDTH = 0;
    public static final int DMPANNINGHEIGHT = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/DEVMODE$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/DEVMODE$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/DEVMODE$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.windows.DEVMODE, org.lwjgl.system.windows.DEVMODE.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.windows.DEVMODE ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.windows.DEVMODE.SIZEOF
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
        protected org.lwjgl.system.windows.DEVMODE.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.system.windows.DEVMODE getElementFactory() {
                r2 = this;
                org.lwjgl.system.windows.DEVMODE r0 = org.lwjgl.system.windows.DEVMODE.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("TCHAR[32]")
        public java.nio.ByteBuffer dmDeviceName() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.system.windows.DEVMODE.ndmDeviceName(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("TCHAR[32]")
        public java.lang.String dmDeviceNameString() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.lang.String r0 = org.lwjgl.system.windows.DEVMODE.ndmDeviceNameString(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("WORD")
        public short dmSpecVersion() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.system.windows.DEVMODE.ndmSpecVersion(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("WORD")
        public short dmDriverVersion() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.system.windows.DEVMODE.ndmDriverVersion(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("WORD")
        public short dmSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.system.windows.DEVMODE.ndmSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("WORD")
        public short dmDriverExtra() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.system.windows.DEVMODE.ndmDriverExtra(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("DWORD")
        public int dmFields() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.DEVMODE.ndmFields(r0)
                return r0
        }

        public short dmOrientation() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.system.windows.DEVMODE.ndmOrientation(r0)
                return r0
        }

        public short dmPaperSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.system.windows.DEVMODE.ndmPaperSize(r0)
                return r0
        }

        public short dmPaperLength() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.system.windows.DEVMODE.ndmPaperLength(r0)
                return r0
        }

        public short dmPaperWidth() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.system.windows.DEVMODE.ndmPaperWidth(r0)
                return r0
        }

        public short dmScale() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.system.windows.DEVMODE.ndmScale(r0)
                return r0
        }

        public short dmCopies() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.system.windows.DEVMODE.ndmCopies(r0)
                return r0
        }

        public short dmDefaultSource() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.system.windows.DEVMODE.ndmDefaultSource(r0)
                return r0
        }

        public short dmPrintQuality() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.system.windows.DEVMODE.ndmPrintQuality(r0)
                return r0
        }

        public org.lwjgl.system.windows.POINTL dmPosition() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.windows.POINTL r0 = org.lwjgl.system.windows.DEVMODE.ndmPosition(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("DWORD")
        public int dmDisplayOrientation() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.DEVMODE.ndmDisplayOrientation(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("DWORD")
        public int dmDisplayFixedOutput() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.DEVMODE.ndmDisplayFixedOutput(r0)
                return r0
        }

        public short dmColor() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.system.windows.DEVMODE.ndmColor(r0)
                return r0
        }

        public short dmDuplex() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.system.windows.DEVMODE.ndmDuplex(r0)
                return r0
        }

        public short dmYResolution() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.system.windows.DEVMODE.ndmYResolution(r0)
                return r0
        }

        public short dmTTOption() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.system.windows.DEVMODE.ndmTTOption(r0)
                return r0
        }

        public short dmCollate() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.system.windows.DEVMODE.ndmCollate(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("TCHAR[32]")
        public java.nio.ByteBuffer dmFormName() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.system.windows.DEVMODE.ndmFormName(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("TCHAR[32]")
        public java.lang.String dmFormNameString() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.lang.String r0 = org.lwjgl.system.windows.DEVMODE.ndmFormNameString(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("WORD")
        public short dmLogPixels() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.system.windows.DEVMODE.ndmLogPixels(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("DWORD")
        public int dmBitsPerPel() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.DEVMODE.ndmBitsPerPel(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("DWORD")
        public int dmPelsWidth() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.DEVMODE.ndmPelsWidth(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("DWORD")
        public int dmPelsHeight() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.DEVMODE.ndmPelsHeight(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("DWORD")
        public int dmDisplayFlags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.DEVMODE.ndmDisplayFlags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("DWORD")
        public int dmNup() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.DEVMODE.ndmNup(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("DWORD")
        public int dmDisplayFrequency() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.DEVMODE.ndmDisplayFrequency(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("DWORD")
        public int dmICMMethod() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.DEVMODE.ndmICMMethod(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("DWORD")
        public int dmICMIntent() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.DEVMODE.ndmICMIntent(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("DWORD")
        public int dmMediaType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.DEVMODE.ndmMediaType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("DWORD")
        public int dmDitherType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.DEVMODE.ndmDitherType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("DWORD")
        public int dmReserved1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.DEVMODE.ndmReserved1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("DWORD")
        public int dmReserved2() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.DEVMODE.ndmReserved2(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("DWORD")
        public int dmPanningWidth() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.DEVMODE.ndmPanningWidth(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("DWORD")
        public int dmPanningHeight() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.DEVMODE.ndmPanningHeight(r0)
                return r0
        }

        public org.lwjgl.system.windows.DEVMODE.Buffer dmSpecVersion(@org.lwjgl.system.NativeType("WORD") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.DEVMODE.ndmSpecVersion(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.DEVMODE.Buffer dmSize(@org.lwjgl.system.NativeType("WORD") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.DEVMODE.ndmSize(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.DEVMODE.Buffer dmDriverExtra(@org.lwjgl.system.NativeType("WORD") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.DEVMODE.ndmDriverExtra(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.windows.DEVMODE r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.windows.DEVMODE$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.windows.DEVMODE r0 = org.lwjgl.system.windows.DEVMODE.create(r0)
                org.lwjgl.system.windows.DEVMODE.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected DEVMODE(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.windows.DEVMODE create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.windows.DEVMODE r0 = new org.lwjgl.system.windows.DEVMODE
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public DEVMODE(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.windows.DEVMODE.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.windows.DEVMODE.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("TCHAR[32]")
    public java.nio.ByteBuffer dmDeviceName() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = ndmDeviceName(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("TCHAR[32]")
    public java.lang.String dmDeviceNameString() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.lang.String r0 = ndmDeviceNameString(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("WORD")
    public short dmSpecVersion() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = ndmSpecVersion(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("WORD")
    public short dmDriverVersion() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = ndmDriverVersion(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("WORD")
    public short dmSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = ndmSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("WORD")
    public short dmDriverExtra() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = ndmDriverExtra(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public int dmFields() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndmFields(r0)
            return r0
    }

    public short dmOrientation() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = ndmOrientation(r0)
            return r0
    }

    public short dmPaperSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = ndmPaperSize(r0)
            return r0
    }

    public short dmPaperLength() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = ndmPaperLength(r0)
            return r0
    }

    public short dmPaperWidth() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = ndmPaperWidth(r0)
            return r0
    }

    public short dmScale() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = ndmScale(r0)
            return r0
    }

    public short dmCopies() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = ndmCopies(r0)
            return r0
    }

    public short dmDefaultSource() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = ndmDefaultSource(r0)
            return r0
    }

    public short dmPrintQuality() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = ndmPrintQuality(r0)
            return r0
    }

    public org.lwjgl.system.windows.POINTL dmPosition() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.windows.POINTL r0 = ndmPosition(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public int dmDisplayOrientation() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndmDisplayOrientation(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public int dmDisplayFixedOutput() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndmDisplayFixedOutput(r0)
            return r0
    }

    public short dmColor() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = ndmColor(r0)
            return r0
    }

    public short dmDuplex() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = ndmDuplex(r0)
            return r0
    }

    public short dmYResolution() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = ndmYResolution(r0)
            return r0
    }

    public short dmTTOption() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = ndmTTOption(r0)
            return r0
    }

    public short dmCollate() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = ndmCollate(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("TCHAR[32]")
    public java.nio.ByteBuffer dmFormName() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = ndmFormName(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("TCHAR[32]")
    public java.lang.String dmFormNameString() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.lang.String r0 = ndmFormNameString(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("WORD")
    public short dmLogPixels() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = ndmLogPixels(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public int dmBitsPerPel() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndmBitsPerPel(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public int dmPelsWidth() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndmPelsWidth(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public int dmPelsHeight() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndmPelsHeight(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public int dmDisplayFlags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndmDisplayFlags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public int dmNup() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndmNup(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public int dmDisplayFrequency() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndmDisplayFrequency(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public int dmICMMethod() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndmICMMethod(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public int dmICMIntent() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndmICMIntent(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public int dmMediaType() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndmMediaType(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public int dmDitherType() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndmDitherType(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public int dmReserved1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndmReserved1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public int dmReserved2() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndmReserved2(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public int dmPanningWidth() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndmPanningWidth(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public int dmPanningHeight() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndmPanningHeight(r0)
            return r0
    }

    public org.lwjgl.system.windows.DEVMODE dmSpecVersion(@org.lwjgl.system.NativeType("WORD") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndmSpecVersion(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.DEVMODE dmSize(@org.lwjgl.system.NativeType("WORD") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndmSize(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.DEVMODE dmDriverExtra(@org.lwjgl.system.NativeType("WORD") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndmDriverExtra(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.DEVMODE set(org.lwjgl.system.windows.DEVMODE r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.system.windows.DEVMODE.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.system.windows.DEVMODE malloc() {
            org.lwjgl.system.windows.DEVMODE r0 = new org.lwjgl.system.windows.DEVMODE
            r1 = r0
            int r2 = org.lwjgl.system.windows.DEVMODE.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.DEVMODE calloc() {
            org.lwjgl.system.windows.DEVMODE r0 = new org.lwjgl.system.windows.DEVMODE
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.windows.DEVMODE.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.DEVMODE create() {
            int r0 = org.lwjgl.system.windows.DEVMODE.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.windows.DEVMODE r0 = new org.lwjgl.system.windows.DEVMODE
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.DEVMODE create(long r6) {
            org.lwjgl.system.windows.DEVMODE r0 = new org.lwjgl.system.windows.DEVMODE
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.windows.DEVMODE createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.windows.DEVMODE r0 = new org.lwjgl.system.windows.DEVMODE
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.windows.DEVMODE.Buffer malloc(int r6) {
            org.lwjgl.system.windows.DEVMODE$Buffer r0 = new org.lwjgl.system.windows.DEVMODE$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.windows.DEVMODE.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.DEVMODE.Buffer calloc(int r7) {
            org.lwjgl.system.windows.DEVMODE$Buffer r0 = new org.lwjgl.system.windows.DEVMODE$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.windows.DEVMODE.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.DEVMODE.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.windows.DEVMODE.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.windows.DEVMODE$Buffer r0 = new org.lwjgl.system.windows.DEVMODE$Buffer
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

    public static org.lwjgl.system.windows.DEVMODE.Buffer create(long r6, int r8) {
            org.lwjgl.system.windows.DEVMODE$Buffer r0 = new org.lwjgl.system.windows.DEVMODE$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.windows.DEVMODE.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.windows.DEVMODE$Buffer r0 = new org.lwjgl.system.windows.DEVMODE$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.DEVMODE mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.windows.DEVMODE r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.DEVMODE callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.windows.DEVMODE r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.DEVMODE mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.system.windows.DEVMODE r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.DEVMODE callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.system.windows.DEVMODE r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.DEVMODE.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.windows.DEVMODE$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.DEVMODE.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.windows.DEVMODE$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.DEVMODE.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.system.windows.DEVMODE$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.DEVMODE.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.system.windows.DEVMODE$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.system.windows.DEVMODE malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.windows.DEVMODE r0 = new org.lwjgl.system.windows.DEVMODE
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.windows.DEVMODE.ALIGNOF
            int r4 = org.lwjgl.system.windows.DEVMODE.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.DEVMODE calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.windows.DEVMODE r0 = new org.lwjgl.system.windows.DEVMODE
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.windows.DEVMODE.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.windows.DEVMODE.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.DEVMODE.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.windows.DEVMODE$Buffer r0 = new org.lwjgl.system.windows.DEVMODE$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.windows.DEVMODE.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.windows.DEVMODE.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.DEVMODE.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.windows.DEVMODE$Buffer r0 = new org.lwjgl.system.windows.DEVMODE$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.windows.DEVMODE.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.windows.DEVMODE.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static java.nio.ByteBuffer ndmDeviceName(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.DEVMODE.DMDEVICENAME
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 64
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static java.lang.String ndmDeviceNameString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.DEVMODE.DMDEVICENAME
            long r1 = (long) r1
            long r0 = r0 + r1
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF16(r0)
            return r0
    }

    public static short ndmSpecVersion(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.DEVMODE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.DEVMODE.DMSPECVERSION
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short ndmDriverVersion(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.DEVMODE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.DEVMODE.DMDRIVERVERSION
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short ndmSize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.DEVMODE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.DEVMODE.DMSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short ndmDriverExtra(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.DEVMODE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.DEVMODE.DMDRIVEREXTRA
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static int ndmFields(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.DEVMODE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.DEVMODE.DMFIELDS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static short ndmOrientation(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.DEVMODE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.DEVMODE.DMORIENTATION
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short ndmPaperSize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.DEVMODE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.DEVMODE.DMPAPERSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short ndmPaperLength(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.DEVMODE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.DEVMODE.DMPAPERLENGTH
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short ndmPaperWidth(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.DEVMODE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.DEVMODE.DMPAPERWIDTH
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short ndmScale(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.DEVMODE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.DEVMODE.DMSCALE
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short ndmCopies(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.DEVMODE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.DEVMODE.DMCOPIES
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short ndmDefaultSource(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.DEVMODE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.DEVMODE.DMDEFAULTSOURCE
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short ndmPrintQuality(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.DEVMODE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.DEVMODE.DMPRINTQUALITY
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static org.lwjgl.system.windows.POINTL ndmPosition(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.DEVMODE.DMPOSITION
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.windows.POINTL r0 = org.lwjgl.system.windows.POINTL.create(r0)
            return r0
    }

    public static int ndmDisplayOrientation(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.DEVMODE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.DEVMODE.DMDISPLAYORIENTATION
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndmDisplayFixedOutput(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.DEVMODE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.DEVMODE.DMDISPLAYFIXEDOUTPUT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static short ndmColor(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.DEVMODE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.DEVMODE.DMCOLOR
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short ndmDuplex(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.DEVMODE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.DEVMODE.DMDUPLEX
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short ndmYResolution(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.DEVMODE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.DEVMODE.DMYRESOLUTION
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short ndmTTOption(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.DEVMODE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.DEVMODE.DMTTOPTION
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short ndmCollate(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.DEVMODE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.DEVMODE.DMCOLLATE
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer ndmFormName(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.DEVMODE.DMFORMNAME
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 64
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static java.lang.String ndmFormNameString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.DEVMODE.DMFORMNAME
            long r1 = (long) r1
            long r0 = r0 + r1
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF16(r0)
            return r0
    }

    public static short ndmLogPixels(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.DEVMODE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.DEVMODE.DMLOGPIXELS
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static int ndmBitsPerPel(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.DEVMODE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.DEVMODE.DMBITSPERPEL
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndmPelsWidth(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.DEVMODE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.DEVMODE.DMPELSWIDTH
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndmPelsHeight(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.DEVMODE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.DEVMODE.DMPELSHEIGHT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndmDisplayFlags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.DEVMODE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.DEVMODE.DMDISPLAYFLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndmNup(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.DEVMODE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.DEVMODE.DMNUP
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndmDisplayFrequency(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.DEVMODE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.DEVMODE.DMDISPLAYFREQUENCY
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndmICMMethod(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.DEVMODE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.DEVMODE.DMICMMETHOD
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndmICMIntent(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.DEVMODE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.DEVMODE.DMICMINTENT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndmMediaType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.DEVMODE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.DEVMODE.DMMEDIATYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndmDitherType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.DEVMODE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.DEVMODE.DMDITHERTYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndmReserved1(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.DEVMODE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.DEVMODE.DMRESERVED1
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndmReserved2(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.DEVMODE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.DEVMODE.DMRESERVED2
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndmPanningWidth(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.DEVMODE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.DEVMODE.DMPANNINGWIDTH
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndmPanningHeight(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.DEVMODE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.DEVMODE.DMPANNINGHEIGHT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void ndmSpecVersion(long r7, short r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.DEVMODE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.DEVMODE.DMSPECVERSION
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putShort(r1, r2, r3)
            return
    }

    public static void ndmSize(long r7, short r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.DEVMODE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.DEVMODE.DMSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putShort(r1, r2, r3)
            return
    }

    public static void ndmDriverExtra(long r7, short r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.DEVMODE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.DEVMODE.DMDRIVEREXTRA
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putShort(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.system.windows.DEVMODE r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 27
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 2
            r4 = 32
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
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
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 2
            org.lwjgl.system.Struct$Member[] r3 = new org.lwjgl.system.Struct.Member[r3]
            r4 = r3
            r5 = 0
            r6 = 8
            org.lwjgl.system.Struct$Member[] r6 = new org.lwjgl.system.Struct.Member[r6]
            r7 = r6
            r8 = 0
            r9 = 2
            org.lwjgl.system.Struct$Member r9 = __member(r9)
            r7[r8] = r9
            r7 = r6
            r8 = 1
            r9 = 2
            org.lwjgl.system.Struct$Member r9 = __member(r9)
            r7[r8] = r9
            r7 = r6
            r8 = 2
            r9 = 2
            org.lwjgl.system.Struct$Member r9 = __member(r9)
            r7[r8] = r9
            r7 = r6
            r8 = 3
            r9 = 2
            org.lwjgl.system.Struct$Member r9 = __member(r9)
            r7[r8] = r9
            r7 = r6
            r8 = 4
            r9 = 2
            org.lwjgl.system.Struct$Member r9 = __member(r9)
            r7[r8] = r9
            r7 = r6
            r8 = 5
            r9 = 2
            org.lwjgl.system.Struct$Member r9 = __member(r9)
            r7[r8] = r9
            r7 = r6
            r8 = 6
            r9 = 2
            org.lwjgl.system.Struct$Member r9 = __member(r9)
            r7[r8] = r9
            r7 = r6
            r8 = 7
            r9 = 2
            org.lwjgl.system.Struct$Member r9 = __member(r9)
            r7[r8] = r9
            org.lwjgl.system.Struct$Layout r6 = __struct(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 3
            org.lwjgl.system.Struct$Member[] r6 = new org.lwjgl.system.Struct.Member[r6]
            r7 = r6
            r8 = 0
            int r9 = org.lwjgl.system.windows.POINTL.SIZEOF
            int r10 = org.lwjgl.system.windows.POINTL.ALIGNOF
            org.lwjgl.system.Struct$Member r9 = __member(r9, r10)
            r7[r8] = r9
            r7 = r6
            r8 = 1
            r9 = 4
            org.lwjgl.system.Struct$Member r9 = __member(r9)
            r7[r8] = r9
            r7 = r6
            r8 = 2
            r9 = 4
            org.lwjgl.system.Struct$Member r9 = __member(r9)
            r7[r8] = r9
            org.lwjgl.system.Struct$Layout r6 = __struct(r6)
            r4[r5] = r6
            org.lwjgl.system.Struct$Layout r3 = __union(r3)
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
            r4 = 32
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 15
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 16
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 17
            r3 = 2
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
            org.lwjgl.system.Struct$Layout r3 = __union(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 18
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 19
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 20
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 21
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 22
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 23
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 24
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 25
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 26
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r12 = r0
            r0 = r12
            int r0 = r0.getSize()
            org.lwjgl.system.windows.DEVMODE.SIZEOF = r0
            r0 = r12
            int r0 = r0.getAlignment()
            org.lwjgl.system.windows.DEVMODE.ALIGNOF = r0
            r0 = r12
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.DEVMODE.DMDEVICENAME = r0
            r0 = r12
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.DEVMODE.DMSPECVERSION = r0
            r0 = r12
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.DEVMODE.DMDRIVERVERSION = r0
            r0 = r12
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.DEVMODE.DMSIZE = r0
            r0 = r12
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.DEVMODE.DMDRIVEREXTRA = r0
            r0 = r12
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.DEVMODE.DMFIELDS = r0
            r0 = r12
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.DEVMODE.DMORIENTATION = r0
            r0 = r12
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.DEVMODE.DMPAPERSIZE = r0
            r0 = r12
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.DEVMODE.DMPAPERLENGTH = r0
            r0 = r12
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.DEVMODE.DMPAPERWIDTH = r0
            r0 = r12
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.DEVMODE.DMSCALE = r0
            r0 = r12
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.DEVMODE.DMCOPIES = r0
            r0 = r12
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.DEVMODE.DMDEFAULTSOURCE = r0
            r0 = r12
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.DEVMODE.DMPRINTQUALITY = r0
            r0 = r12
            r1 = 17
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.DEVMODE.DMPOSITION = r0
            r0 = r12
            r1 = 18
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.DEVMODE.DMDISPLAYORIENTATION = r0
            r0 = r12
            r1 = 19
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.DEVMODE.DMDISPLAYFIXEDOUTPUT = r0
            r0 = r12
            r1 = 20
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.DEVMODE.DMCOLOR = r0
            r0 = r12
            r1 = 21
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.DEVMODE.DMDUPLEX = r0
            r0 = r12
            r1 = 22
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.DEVMODE.DMYRESOLUTION = r0
            r0 = r12
            r1 = 23
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.DEVMODE.DMTTOPTION = r0
            r0 = r12
            r1 = 24
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.DEVMODE.DMCOLLATE = r0
            r0 = r12
            r1 = 25
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.DEVMODE.DMFORMNAME = r0
            r0 = r12
            r1 = 26
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.DEVMODE.DMLOGPIXELS = r0
            r0 = r12
            r1 = 27
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.DEVMODE.DMBITSPERPEL = r0
            r0 = r12
            r1 = 28
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.DEVMODE.DMPELSWIDTH = r0
            r0 = r12
            r1 = 29
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.DEVMODE.DMPELSHEIGHT = r0
            r0 = r12
            r1 = 31
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.DEVMODE.DMDISPLAYFLAGS = r0
            r0 = r12
            r1 = 32
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.DEVMODE.DMNUP = r0
            r0 = r12
            r1 = 33
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.DEVMODE.DMDISPLAYFREQUENCY = r0
            r0 = r12
            r1 = 34
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.DEVMODE.DMICMMETHOD = r0
            r0 = r12
            r1 = 35
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.DEVMODE.DMICMINTENT = r0
            r0 = r12
            r1 = 36
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.DEVMODE.DMMEDIATYPE = r0
            r0 = r12
            r1 = 37
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.DEVMODE.DMDITHERTYPE = r0
            r0 = r12
            r1 = 38
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.DEVMODE.DMRESERVED1 = r0
            r0 = r12
            r1 = 39
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.DEVMODE.DMRESERVED2 = r0
            r0 = r12
            r1 = 40
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.DEVMODE.DMPANNINGWIDTH = r0
            r0 = r12
            r1 = 41
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.DEVMODE.DMPANNINGHEIGHT = r0
            return
    }
}
