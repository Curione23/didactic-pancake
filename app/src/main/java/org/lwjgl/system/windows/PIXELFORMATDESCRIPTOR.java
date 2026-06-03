package org.lwjgl.system.windows;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/PIXELFORMATDESCRIPTOR.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/PIXELFORMATDESCRIPTOR.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/PIXELFORMATDESCRIPTOR.class */
public class PIXELFORMATDESCRIPTOR extends org.lwjgl.system.Struct<org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int NSIZE = 0;
    public static final int NVERSION = 0;
    public static final int DWFLAGS = 0;
    public static final int IPIXELTYPE = 0;
    public static final int CCOLORBITS = 0;
    public static final int CREDBITS = 0;
    public static final int CREDSHIFT = 0;
    public static final int CGREENBITS = 0;
    public static final int CGREENSHIFT = 0;
    public static final int CBLUEBITS = 0;
    public static final int CBLUESHIFT = 0;
    public static final int CALPHABITS = 0;
    public static final int CALPHASHIFT = 0;
    public static final int CACCUMBITS = 0;
    public static final int CACCUMREDBITS = 0;
    public static final int CACCUMGREENBITS = 0;
    public static final int CACCUMBLUEBITS = 0;
    public static final int CACCUMALPHABITS = 0;
    public static final int CDEPTHBITS = 0;
    public static final int CSTENCILBITS = 0;
    public static final int CAUXBUFFERS = 0;
    public static final int ILAYERTYPE = 0;
    public static final int BRESERVED = 0;
    public static final int DWLAYERMASK = 0;
    public static final int DWVISIBLEMASK = 0;
    public static final int DWDAMAGEMASK = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/PIXELFORMATDESCRIPTOR$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/PIXELFORMATDESCRIPTOR$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/PIXELFORMATDESCRIPTOR$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR, org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.SIZEOF
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
        protected org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR getElementFactory() {
                r2 = this;
                org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("WORD")
        public short nSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.nnSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("WORD")
        public short nVersion() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.nnVersion(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("DWORD")
        public int dwFlags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ndwFlags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("BYTE")
        public byte iPixelType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.niPixelType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("BYTE")
        public byte cColorBits() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ncColorBits(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("BYTE")
        public byte cRedBits() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ncRedBits(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("BYTE")
        public byte cRedShift() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ncRedShift(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("BYTE")
        public byte cGreenBits() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ncGreenBits(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("BYTE")
        public byte cGreenShift() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ncGreenShift(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("BYTE")
        public byte cBlueBits() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ncBlueBits(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("BYTE")
        public byte cBlueShift() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ncBlueShift(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("BYTE")
        public byte cAlphaBits() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ncAlphaBits(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("BYTE")
        public byte cAlphaShift() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ncAlphaShift(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("BYTE")
        public byte cAccumBits() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ncAccumBits(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("BYTE")
        public byte cAccumRedBits() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ncAccumRedBits(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("BYTE")
        public byte cAccumGreenBits() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ncAccumGreenBits(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("BYTE")
        public byte cAccumBlueBits() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ncAccumBlueBits(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("BYTE")
        public byte cAccumAlphaBits() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ncAccumAlphaBits(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("BYTE")
        public byte cDepthBits() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ncDepthBits(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("BYTE")
        public byte cStencilBits() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ncStencilBits(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("BYTE")
        public byte cAuxBuffers() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ncAuxBuffers(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("BYTE")
        public byte iLayerType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.niLayerType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("BYTE")
        public byte bReserved() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.nbReserved(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("DWORD")
        public int dwLayerMask() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ndwLayerMask(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("DWORD")
        public int dwVisibleMask() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ndwVisibleMask(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("DWORD")
        public int dwDamageMask() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ndwDamageMask(r0)
                return r0
        }

        public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer nSize(@org.lwjgl.system.NativeType("WORD") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.nnSize(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer nVersion(@org.lwjgl.system.NativeType("WORD") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.nnVersion(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer dwFlags(@org.lwjgl.system.NativeType("DWORD") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ndwFlags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer iPixelType(@org.lwjgl.system.NativeType("BYTE") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.niPixelType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer cColorBits(@org.lwjgl.system.NativeType("BYTE") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ncColorBits(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer cRedBits(@org.lwjgl.system.NativeType("BYTE") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ncRedBits(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer cRedShift(@org.lwjgl.system.NativeType("BYTE") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ncRedShift(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer cGreenBits(@org.lwjgl.system.NativeType("BYTE") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ncGreenBits(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer cGreenShift(@org.lwjgl.system.NativeType("BYTE") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ncGreenShift(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer cBlueBits(@org.lwjgl.system.NativeType("BYTE") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ncBlueBits(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer cBlueShift(@org.lwjgl.system.NativeType("BYTE") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ncBlueShift(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer cAlphaBits(@org.lwjgl.system.NativeType("BYTE") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ncAlphaBits(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer cAlphaShift(@org.lwjgl.system.NativeType("BYTE") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ncAlphaShift(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer cAccumBits(@org.lwjgl.system.NativeType("BYTE") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ncAccumBits(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer cAccumRedBits(@org.lwjgl.system.NativeType("BYTE") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ncAccumRedBits(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer cAccumGreenBits(@org.lwjgl.system.NativeType("BYTE") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ncAccumGreenBits(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer cAccumBlueBits(@org.lwjgl.system.NativeType("BYTE") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ncAccumBlueBits(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer cAccumAlphaBits(@org.lwjgl.system.NativeType("BYTE") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ncAccumAlphaBits(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer cDepthBits(@org.lwjgl.system.NativeType("BYTE") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ncDepthBits(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer cStencilBits(@org.lwjgl.system.NativeType("BYTE") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ncStencilBits(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer cAuxBuffers(@org.lwjgl.system.NativeType("BYTE") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ncAuxBuffers(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer iLayerType(@org.lwjgl.system.NativeType("BYTE") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.niLayerType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer bReserved(@org.lwjgl.system.NativeType("BYTE") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.nbReserved(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer dwLayerMask(@org.lwjgl.system.NativeType("DWORD") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ndwLayerMask(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer dwVisibleMask(@org.lwjgl.system.NativeType("DWORD") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ndwVisibleMask(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer dwDamageMask(@org.lwjgl.system.NativeType("DWORD") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ndwDamageMask(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.create(r0)
                org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected PIXELFORMATDESCRIPTOR(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = new org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public PIXELFORMATDESCRIPTOR(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("WORD")
    public short nSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nnSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("WORD")
    public short nVersion() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nnVersion(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public int dwFlags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndwFlags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("BYTE")
    public byte iPixelType() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = niPixelType(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("BYTE")
    public byte cColorBits() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ncColorBits(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("BYTE")
    public byte cRedBits() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ncRedBits(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("BYTE")
    public byte cRedShift() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ncRedShift(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("BYTE")
    public byte cGreenBits() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ncGreenBits(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("BYTE")
    public byte cGreenShift() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ncGreenShift(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("BYTE")
    public byte cBlueBits() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ncBlueBits(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("BYTE")
    public byte cBlueShift() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ncBlueShift(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("BYTE")
    public byte cAlphaBits() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ncAlphaBits(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("BYTE")
    public byte cAlphaShift() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ncAlphaShift(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("BYTE")
    public byte cAccumBits() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ncAccumBits(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("BYTE")
    public byte cAccumRedBits() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ncAccumRedBits(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("BYTE")
    public byte cAccumGreenBits() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ncAccumGreenBits(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("BYTE")
    public byte cAccumBlueBits() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ncAccumBlueBits(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("BYTE")
    public byte cAccumAlphaBits() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ncAccumAlphaBits(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("BYTE")
    public byte cDepthBits() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ncDepthBits(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("BYTE")
    public byte cStencilBits() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ncStencilBits(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("BYTE")
    public byte cAuxBuffers() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ncAuxBuffers(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("BYTE")
    public byte iLayerType() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = niLayerType(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("BYTE")
    public byte bReserved() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nbReserved(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public int dwLayerMask() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndwLayerMask(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public int dwVisibleMask() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndwVisibleMask(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public int dwDamageMask() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndwDamageMask(r0)
            return r0
    }

    public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR nSize(@org.lwjgl.system.NativeType("WORD") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnSize(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR nVersion(@org.lwjgl.system.NativeType("WORD") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnVersion(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR dwFlags(@org.lwjgl.system.NativeType("DWORD") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndwFlags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR iPixelType(@org.lwjgl.system.NativeType("BYTE") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            niPixelType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR cColorBits(@org.lwjgl.system.NativeType("BYTE") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncColorBits(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR cRedBits(@org.lwjgl.system.NativeType("BYTE") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncRedBits(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR cRedShift(@org.lwjgl.system.NativeType("BYTE") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncRedShift(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR cGreenBits(@org.lwjgl.system.NativeType("BYTE") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncGreenBits(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR cGreenShift(@org.lwjgl.system.NativeType("BYTE") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncGreenShift(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR cBlueBits(@org.lwjgl.system.NativeType("BYTE") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncBlueBits(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR cBlueShift(@org.lwjgl.system.NativeType("BYTE") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncBlueShift(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR cAlphaBits(@org.lwjgl.system.NativeType("BYTE") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncAlphaBits(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR cAlphaShift(@org.lwjgl.system.NativeType("BYTE") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncAlphaShift(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR cAccumBits(@org.lwjgl.system.NativeType("BYTE") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncAccumBits(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR cAccumRedBits(@org.lwjgl.system.NativeType("BYTE") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncAccumRedBits(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR cAccumGreenBits(@org.lwjgl.system.NativeType("BYTE") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncAccumGreenBits(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR cAccumBlueBits(@org.lwjgl.system.NativeType("BYTE") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncAccumBlueBits(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR cAccumAlphaBits(@org.lwjgl.system.NativeType("BYTE") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncAccumAlphaBits(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR cDepthBits(@org.lwjgl.system.NativeType("BYTE") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncDepthBits(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR cStencilBits(@org.lwjgl.system.NativeType("BYTE") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncStencilBits(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR cAuxBuffers(@org.lwjgl.system.NativeType("BYTE") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncAuxBuffers(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR iLayerType(@org.lwjgl.system.NativeType("BYTE") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            niLayerType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR bReserved(@org.lwjgl.system.NativeType("BYTE") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbReserved(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR dwLayerMask(@org.lwjgl.system.NativeType("DWORD") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndwLayerMask(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR dwVisibleMask(@org.lwjgl.system.NativeType("DWORD") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndwVisibleMask(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR dwDamageMask(@org.lwjgl.system.NativeType("DWORD") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndwDamageMask(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR set(short r4, short r5, int r6, byte r7, byte r8, byte r9, byte r10, byte r11, byte r12, byte r13, byte r14, byte r15, byte r16, byte r17, byte r18, byte r19, byte r20, byte r21, byte r22, byte r23, byte r24, byte r25, byte r26, int r27, int r28, int r29) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = r0.nSize(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = r0.nVersion(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = r0.dwFlags(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = r0.iPixelType(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = r0.cColorBits(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = r0.cRedBits(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = r0.cRedShift(r1)
            r0 = r3
            r1 = r11
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = r0.cGreenBits(r1)
            r0 = r3
            r1 = r12
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = r0.cGreenShift(r1)
            r0 = r3
            r1 = r13
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = r0.cBlueBits(r1)
            r0 = r3
            r1 = r14
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = r0.cBlueShift(r1)
            r0 = r3
            r1 = r15
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = r0.cAlphaBits(r1)
            r0 = r3
            r1 = r16
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = r0.cAlphaShift(r1)
            r0 = r3
            r1 = r17
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = r0.cAccumBits(r1)
            r0 = r3
            r1 = r18
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = r0.cAccumRedBits(r1)
            r0 = r3
            r1 = r19
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = r0.cAccumGreenBits(r1)
            r0 = r3
            r1 = r20
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = r0.cAccumBlueBits(r1)
            r0 = r3
            r1 = r21
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = r0.cAccumAlphaBits(r1)
            r0 = r3
            r1 = r22
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = r0.cDepthBits(r1)
            r0 = r3
            r1 = r23
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = r0.cStencilBits(r1)
            r0 = r3
            r1 = r24
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = r0.cAuxBuffers(r1)
            r0 = r3
            r1 = r25
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = r0.iLayerType(r1)
            r0 = r3
            r1 = r26
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = r0.bReserved(r1)
            r0 = r3
            r1 = r27
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = r0.dwLayerMask(r1)
            r0 = r3
            r1 = r28
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = r0.dwVisibleMask(r1)
            r0 = r3
            r1 = r29
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = r0.dwDamageMask(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR set(org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR malloc() {
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = new org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR
            r1 = r0
            int r2 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR calloc() {
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = new org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR create() {
            int r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = new org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR create(long r6) {
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = new org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = new org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer malloc(int r6) {
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR$Buffer r0 = new org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer calloc(int r7) {
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR$Buffer r0 = new org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR$Buffer r0 = new org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR$Buffer
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

    public static org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer create(long r6, int r8) {
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR$Buffer r0 = new org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR$Buffer r0 = new org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = new org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ALIGNOF
            int r4 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = new org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR$Buffer r0 = new org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR$Buffer r0 = new org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static short nnSize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.NSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nnVersion(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.NVERSION
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static int ndwFlags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.DWFLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static byte niPixelType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.IPIXELTYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte ncColorBits(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CCOLORBITS
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte ncRedBits(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CREDBITS
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte ncRedShift(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CREDSHIFT
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte ncGreenBits(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CGREENBITS
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte ncGreenShift(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CGREENSHIFT
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte ncBlueBits(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CBLUEBITS
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte ncBlueShift(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CBLUESHIFT
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte ncAlphaBits(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CALPHABITS
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte ncAlphaShift(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CALPHASHIFT
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte ncAccumBits(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CACCUMBITS
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte ncAccumRedBits(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CACCUMREDBITS
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte ncAccumGreenBits(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CACCUMGREENBITS
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte ncAccumBlueBits(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CACCUMBLUEBITS
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte ncAccumAlphaBits(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CACCUMALPHABITS
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte ncDepthBits(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CDEPTHBITS
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte ncStencilBits(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CSTENCILBITS
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte ncAuxBuffers(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CAUXBUFFERS
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte niLayerType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ILAYERTYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nbReserved(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.BRESERVED
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static int ndwLayerMask(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.DWLAYERMASK
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndwVisibleMask(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.DWVISIBLEMASK
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndwDamageMask(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.DWDAMAGEMASK
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nnSize(long r7, short r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.NSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putShort(r1, r2, r3)
            return
    }

    public static void nnVersion(long r7, short r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.NVERSION
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putShort(r1, r2, r3)
            return
    }

    public static void ndwFlags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.DWFLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void niPixelType(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.IPIXELTYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ncColorBits(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CCOLORBITS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ncRedBits(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CREDBITS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ncRedShift(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CREDSHIFT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ncGreenBits(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CGREENBITS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ncGreenShift(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CGREENSHIFT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ncBlueBits(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CBLUEBITS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ncBlueShift(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CBLUESHIFT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ncAlphaBits(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CALPHABITS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ncAlphaShift(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CALPHASHIFT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ncAccumBits(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CACCUMBITS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ncAccumRedBits(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CACCUMREDBITS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ncAccumGreenBits(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CACCUMGREENBITS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ncAccumBlueBits(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CACCUMBLUEBITS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ncAccumAlphaBits(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CACCUMALPHABITS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ncDepthBits(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CDEPTHBITS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ncStencilBits(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CSTENCILBITS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ncAuxBuffers(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CAUXBUFFERS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void niLayerType(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ILAYERTYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nbReserved(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.BRESERVED
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ndwLayerMask(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.DWLAYERMASK
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndwVisibleMask(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.DWVISIBLEMASK
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndwDamageMask(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.DWDAMAGEMASK
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 26
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
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 15
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 16
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 17
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 18
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 19
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 20
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 21
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 22
            r3 = 1
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
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.NSIZE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.NVERSION = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.DWFLAGS = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.IPIXELTYPE = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CCOLORBITS = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CREDBITS = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CREDSHIFT = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CGREENBITS = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CGREENSHIFT = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CBLUEBITS = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CBLUESHIFT = r0
            r0 = r5
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CALPHABITS = r0
            r0 = r5
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CALPHASHIFT = r0
            r0 = r5
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CACCUMBITS = r0
            r0 = r5
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CACCUMREDBITS = r0
            r0 = r5
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CACCUMGREENBITS = r0
            r0 = r5
            r1 = 16
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CACCUMBLUEBITS = r0
            r0 = r5
            r1 = 17
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CACCUMALPHABITS = r0
            r0 = r5
            r1 = 18
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CDEPTHBITS = r0
            r0 = r5
            r1 = 19
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CSTENCILBITS = r0
            r0 = r5
            r1 = 20
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.CAUXBUFFERS = r0
            r0 = r5
            r1 = 21
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.ILAYERTYPE = r0
            r0 = r5
            r1 = 22
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.BRESERVED = r0
            r0 = r5
            r1 = 23
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.DWLAYERMASK = r0
            r0 = r5
            r1 = 24
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.DWVISIBLEMASK = r0
            r0 = r5
            r1 = 25
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.DWDAMAGEMASK = r0
            return
    }
}
