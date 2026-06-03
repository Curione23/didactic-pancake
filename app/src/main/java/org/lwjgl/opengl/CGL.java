package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/CGL.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/CGL.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/CGL.class */
public class CGL {
    public static final int kCGLPFAAllRenderers = 1;
    public static final int kCGLPFATripleBuffer = 3;
    public static final int kCGLPFADoubleBuffer = 5;
    public static final int kCGLPFAStereo = 6;
    public static final int kCGLPFAColorSize = 8;
    public static final int kCGLPFAAlphaSize = 11;
    public static final int kCGLPFADepthSize = 12;
    public static final int kCGLPFAStencilSize = 13;
    public static final int kCGLPFAMinimumPolicy = 51;
    public static final int kCGLPFAMaximumPolicy = 52;
    public static final int kCGLPFASampleBuffers = 55;
    public static final int kCGLPFASamples = 56;
    public static final int kCGLPFAColorFloat = 58;
    public static final int kCGLPFAMultisample = 59;
    public static final int kCGLPFASupersample = 60;
    public static final int kCGLPFASampleAlpha = 61;
    public static final int kCGLPFARendererID = 70;
    public static final int kCGLPFASingleRenderer = 71;
    public static final int kCGLPFANoRecovery = 72;
    public static final int kCGLPFAAccelerated = 73;
    public static final int kCGLPFAClosestPolicy = 74;
    public static final int kCGLPFABackingStore = 76;
    public static final int kCGLPFABackingVolatile = 77;
    public static final int kCGLPFADisplayMask = 84;
    public static final int kCGLPFAAllowOfflineRenderers = 96;
    public static final int kCGLPFAAcceleratedCompute = 97;
    public static final int kCGLPFAOpenGLProfile = 99;
    public static final int kCGLPFASupportsAutomaticGraphicsSwitching = 101;
    public static final int kCGLPFAVirtualScreenCount = 128;
    public static final int kCGLPFAAuxBuffers = 7;
    public static final int kCGLPFAAccumSize = 14;
    public static final int kCGLPFAOffScreen = 53;
    public static final int kCGLPFAAuxDepthStencil = 57;
    public static final int kCGLPFAWindow = 80;
    public static final int kCGLPFACompliant = 83;
    public static final int kCGLPFAPBuffer = 90;
    public static final int kCGLPFARemotePBuffer = 91;
    public static final int kCGLPFARobust = 75;
    public static final int kCGLPFAMPSafe = 78;
    public static final int kCGLPFAMultiScreen = 81;
    public static final int kCGLPFAFullScreen = 54;
    public static final int kCGLRPOffScreen = 53;
    public static final int kCGLRPRendererID = 70;
    public static final int kCGLRPAccelerated = 73;
    public static final int kCGLRPBackingStore = 76;
    public static final int kCGLRPWindow = 80;
    public static final int kCGLRPCompliant = 83;
    public static final int kCGLRPDisplayMask = 84;
    public static final int kCGLRPBufferModes = 100;
    public static final int kCGLRPColorModes = 103;
    public static final int kCGLRPAccumModes = 104;
    public static final int kCGLRPDepthModes = 105;
    public static final int kCGLRPStencilModes = 106;
    public static final int kCGLRPMaxAuxBuffers = 107;
    public static final int kCGLRPMaxSampleBuffers = 108;
    public static final int kCGLRPMaxSamples = 109;
    public static final int kCGLRPSampleModes = 110;
    public static final int kCGLRPSampleAlpha = 111;
    public static final int kCGLRPVideoMemory = 120;
    public static final int kCGLRPTextureMemory = 121;
    public static final int kCGLRPGPUVertProcCapable = 122;
    public static final int kCGLRPGPUFragProcCapable = 123;
    public static final int kCGLRPRendererCount = 128;
    public static final int kCGLRPOnline = 129;
    public static final int kCGLRPAcceleratedCompute = 130;
    public static final int kCGLRPVideoMemoryMegabytes = 131;
    public static final int kCGLRPTextureMemoryMegabytes = 132;
    public static final int kCGLRPRobust = 75;
    public static final int kCGLRPMPSafe = 78;
    public static final int kCGLRPMultiScreen = 81;
    public static final int kCGLRPFullScreen = 54;
    public static final int kCGLCESwapRectangle = 201;
    public static final int kCGLCESwapLimit = 203;
    public static final int kCGLCERasterization = 221;
    public static final int kCGLCEStateValidation = 301;
    public static final int kCGLCESurfaceBackingSize = 305;
    public static final int kCGLCEDisplayListOptimization = 307;
    public static final int kCGLCEMPEngine = 313;
    public static final int kCGLCPSwapRectangle = 200;
    public static final int kCGLCPSwapInterval = 222;
    public static final int kCGLCPDispatchTableSize = 224;
    public static final int kCGLCPClientStorage = 226;
    public static final int kCGLCPSurfaceTexture = 228;
    public static final int kCGLCPSurfaceOrder = 235;
    public static final int kCGLCPSurfaceOpacity = 236;
    public static final int kCGLCPSurfaceBackingSize = 304;
    public static final int kCGLCPSurfaceSurfaceVolatile = 306;
    public static final int kCGLCPReclaimResources = 308;
    public static final int kCGLCPCurrentRendererID = 309;
    public static final int kCGLCPGPUVertexProcessing = 310;
    public static final int kCGLCPGPUFragmentProcessing = 311;
    public static final int kCGLCPHasDrawable = 314;
    public static final int kCGLCPMPSwapsInFlight = 315;
    public static final int kCGLGOFormatCacheSize = 501;
    public static final int kCGLGOClearFormatCache = 502;
    public static final int kCGLGORetainRenderers = 503;
    public static final int kCGLGOResetLibrary = 504;
    public static final int kCGLGOUseErrorHandler = 505;
    public static final int kCGLGOUseBuildCache = 506;
    public static final int kCGLOGLPVersion_Legacy = 4096;
    public static final int kCGLOGLPVersion_3_2_Core = 12800;
    public static final int kCGLNoError = 0;
    public static final int kCGLBadAttribute = 10000;
    public static final int kCGLBadProperty = 10001;
    public static final int kCGLBadPixelFormat = 10002;
    public static final int kCGLBadRendererInfo = 10003;
    public static final int kCGLBadContext = 10004;
    public static final int kCGLBadDrawable = 10005;
    public static final int kCGLBadDisplay = 10006;
    public static final int kCGLBadState = 10007;
    public static final int kCGLBadValue = 10008;
    public static final int kCGLBadMatch = 10009;
    public static final int kCGLBadEnumeration = 10010;
    public static final int kCGLBadOffScreen = 10011;
    public static final int kCGLBadFullScreen = 10012;
    public static final int kCGLBadWindow = 10013;
    public static final int kCGLBadAddress = 10014;
    public static final int kCGLBadCodeModule = 10015;
    public static final int kCGLBadAlloc = 10016;
    public static final int kCGLBadConnection = 10017;
    public static final int kCGLMonoscopicBit = 1;
    public static final int kCGLStereoscopicBit = 2;
    public static final int kCGLSingleBufferBit = 4;
    public static final int kCGLDoubleBufferBit = 8;
    public static final int kCGLTripleBufferBit = 16;
    public static final int kCGL0Bit = 1;
    public static final int kCGL1Bit = 2;
    public static final int kCGL2Bit = 4;
    public static final int kCGL3Bit = 8;
    public static final int kCGL4Bit = 16;
    public static final int kCGL5Bit = 32;
    public static final int kCGL6Bit = 64;
    public static final int kCGL8Bit = 128;
    public static final int kCGL10Bit = 256;
    public static final int kCGL12Bit = 512;
    public static final int kCGL16Bit = 1024;
    public static final int kCGL24Bit = 2048;
    public static final int kCGL32Bit = 4096;
    public static final int kCGL48Bit = 8192;
    public static final int kCGL64Bit = 16384;
    public static final int kCGL96Bit = 32768;
    public static final int kCGL128Bit = 65536;
    public static final int kCGLRGB444Bit = 64;
    public static final int kCGLARGB4444Bit = 128;
    public static final int kCGLRGB444A8Bit = 256;
    public static final int kCGLRGB555Bit = 512;
    public static final int kCGLARGB1555Bit = 1024;
    public static final int kCGLRGB555A8Bit = 2048;
    public static final int kCGLRGB565Bit = 4096;
    public static final int kCGLRGB565A8Bit = 8192;
    public static final int kCGLRGB888Bit = 16384;
    public static final int kCGLARGB8888Bit = 32768;
    public static final int kCGLRGB888A8Bit = 65536;
    public static final int kCGLRGB101010Bit = 131072;
    public static final int kCGLARGB2101010Bit = 262144;
    public static final int kCGLRGB101010_A8Bit = 524288;
    public static final int kCGLRGB121212Bit = 1048576;
    public static final int kCGLARGB12121212Bit = 2097152;
    public static final int kCGLRGB161616Bit = 4194304;
    public static final int kCGLRGBA16161616Bit = 8388608;
    public static final int kCGLRGBFloat64Bit = 16777216;
    public static final int kCGLRGBAFloat64Bit = 33554432;
    public static final int kCGLRGBFloat128Bit = 67108864;
    public static final int kCGLRGBAFloat128Bit = 134217728;
    public static final int kCGLRGBFloat256Bit = 268435456;
    public static final int kCGLRGBAFloat256Bit = 536870912;
    public static final int kCGLSupersampleBit = 1;
    public static final int kCGLMultisampleBit = 2;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/CGL$Functions.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/CGL$Functions.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/CGL$Functions.class */
    public static final class Functions {
        public static final long GetCurrentContext = 0;
        public static final long SetCurrentContext = 0;
        public static final long GetShareGroup = 0;
        public static final long ChoosePixelFormat = 0;
        public static final long DestroyPixelFormat = 0;
        public static final long DescribePixelFormat = 0;
        public static final long ReleasePixelFormat = 0;
        public static final long RetainPixelFormat = 0;
        public static final long GetPixelFormatRetainCount = 0;
        public static final long QueryRendererInfo = 0;
        public static final long DestroyRendererInfo = 0;
        public static final long DescribeRenderer = 0;
        public static final long CreateContext = 0;
        public static final long DestroyContext = 0;
        public static final long CopyContext = 0;
        public static final long RetainContext = 0;
        public static final long ReleaseContext = 0;
        public static final long GetContextRetainCount = 0;
        public static final long GetPixelFormat = 0;
        public static final long CreatePBuffer = 0;
        public static final long DestroyPBuffer = 0;
        public static final long DescribePBuffer = 0;
        public static final long TexImagePBuffer = 0;
        public static final long RetainPBuffer = 0;
        public static final long ReleasePBuffer = 0;
        public static final long GetPBufferRetainCount = 0;
        public static final long SetOffScreen = 0;
        public static final long GetOffScreen = 0;
        public static final long SetFullScreen = 0;
        public static final long SetFullScreenOnDisplay = 0;
        public static final long SetPBuffer = 0;
        public static final long GetPBuffer = 0;
        public static final long ClearDrawable = 0;
        public static final long FlushDrawable = 0;
        public static final long Enable = 0;
        public static final long Disable = 0;
        public static final long IsEnabled = 0;
        public static final long SetParameter = 0;
        public static final long GetParameter = 0;
        public static final long SetVirtualScreen = 0;
        public static final long GetVirtualScreen = 0;
        public static final long UpdateContext = 0;
        public static final long SetGlobalOption = 0;
        public static final long GetGlobalOption = 0;
        public static final long LockContext = 0;
        public static final long UnlockContext = 0;
        public static final long GetVersion = 0;
        public static final long ErrorString = 0;

        private Functions() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static {
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLGetCurrentContext"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.GetCurrentContext = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLSetCurrentContext"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.SetCurrentContext = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLGetShareGroup"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.GetShareGroup = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLChoosePixelFormat"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.ChoosePixelFormat = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLDestroyPixelFormat"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.DestroyPixelFormat = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLDescribePixelFormat"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.DescribePixelFormat = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLReleasePixelFormat"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.ReleasePixelFormat = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLRetainPixelFormat"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.RetainPixelFormat = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLGetPixelFormatRetainCount"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.GetPixelFormatRetainCount = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLQueryRendererInfo"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.QueryRendererInfo = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLDestroyRendererInfo"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.DestroyRendererInfo = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLDescribeRenderer"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.DescribeRenderer = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLCreateContext"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.CreateContext = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLDestroyContext"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.DestroyContext = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLCopyContext"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.CopyContext = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLRetainContext"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.RetainContext = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLReleaseContext"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.ReleaseContext = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLGetContextRetainCount"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.GetContextRetainCount = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLGetPixelFormat"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.GetPixelFormat = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLCreatePBuffer"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.CreatePBuffer = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLDestroyPBuffer"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.DestroyPBuffer = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLDescribePBuffer"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.DescribePBuffer = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLTexImagePBuffer"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.TexImagePBuffer = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLRetainPBuffer"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.RetainPBuffer = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLReleasePBuffer"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.ReleasePBuffer = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLGetPBufferRetainCount"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.GetPBufferRetainCount = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLSetOffScreen"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.SetOffScreen = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLGetOffScreen"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.GetOffScreen = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLSetFullScreen"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.SetFullScreen = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLSetFullScreenOnDisplay"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.SetFullScreenOnDisplay = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLSetPBuffer"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.SetPBuffer = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLGetPBuffer"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.GetPBuffer = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLClearDrawable"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.ClearDrawable = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLFlushDrawable"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.FlushDrawable = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLEnable"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.Enable = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLDisable"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.Disable = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLIsEnabled"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.IsEnabled = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLSetParameter"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.SetParameter = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLGetParameter"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.GetParameter = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLSetVirtualScreen"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.SetVirtualScreen = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLGetVirtualScreen"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.GetVirtualScreen = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLUpdateContext"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.UpdateContext = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLSetGlobalOption"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.SetGlobalOption = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLGetGlobalOption"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.GetGlobalOption = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLLockContext"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.LockContext = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLUnlockContext"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.UnlockContext = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLGetVersion"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.GetVersion = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "CGLErrorString"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.CGL.Functions.ErrorString = r0
                return
        }
    }

    protected CGL() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @org.lwjgl.system.NativeType("CGLContextObj")
    public static long CGLGetCurrentContext() {
            long r0 = org.lwjgl.opengl.CGL.Functions.GetCurrentContext
            r3 = r0
            r0 = r3
            long r0 = org.lwjgl.system.JNI.callP(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLSetCurrentContext(@org.lwjgl.system.NativeType("CGLContextObj") long r5) {
            long r0 = org.lwjgl.opengl.CGL.Functions.SetCurrentContext
            r7 = r0
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLShareGroupObj")
    public static long CGLGetShareGroup(@org.lwjgl.system.NativeType("CGLContextObj") long r5) {
            long r0 = org.lwjgl.opengl.CGL.Functions.GetShareGroup
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.callPP(r0, r1)
            return r0
    }

    public static int nCGLChoosePixelFormat(long r9, long r11, long r13) {
            long r0 = org.lwjgl.opengl.CGL.Functions.ChoosePixelFormat
            r15 = r0
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLChoosePixelFormat(@org.lwjgl.system.NativeType("CGLPixelFormatAttribute const *") java.nio.IntBuffer r7, @org.lwjgl.system.NativeType("CGLPixelFormatObj *") org.lwjgl.PointerBuffer r8, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r7
            org.lwjgl.system.Checks.checkNT(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L14:
            r0 = r7
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nCGLChoosePixelFormat(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLDestroyPixelFormat(@org.lwjgl.system.NativeType("CGLPixelFormatObj") long r5) {
            long r0 = org.lwjgl.opengl.CGL.Functions.DestroyPixelFormat
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1)
            return r0
    }

    public static int nCGLDescribePixelFormat(long r9, int r11, int r12, long r13) {
            long r0 = org.lwjgl.opengl.CGL.Functions.DescribePixelFormat
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r15
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLDescribePixelFormat(@org.lwjgl.system.NativeType("CGLPixelFormatObj") long r7, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("CGLPixelFormatAttribute") int r10, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nCGLDescribePixelFormat(r0, r1, r2, r3)
            return r0
    }

    public static void CGLReleasePixelFormat(@org.lwjgl.system.NativeType("CGLPixelFormatObj") long r5) {
            long r0 = org.lwjgl.opengl.CGL.Functions.ReleasePixelFormat
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("CGLPixelFormatObj")
    public static long CGLRetainPixelFormat(@org.lwjgl.system.NativeType("CGLPixelFormatObj") long r5) {
            long r0 = org.lwjgl.opengl.CGL.Functions.RetainPixelFormat
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.callPP(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("GLuint")
    public static int CGLGetPixelFormatRetainCount(@org.lwjgl.system.NativeType("CGLPixelFormatObj") long r5) {
            long r0 = org.lwjgl.opengl.CGL.Functions.GetPixelFormatRetainCount
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1)
            return r0
    }

    public static int nCGLQueryRendererInfo(int r8, long r9, long r11) {
            long r0 = org.lwjgl.opengl.CGL.Functions.QueryRendererInfo
            r13 = r0
            r0 = r8
            r1 = r9
            r2 = r11
            r3 = r13
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLQueryRendererInfo(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("CGLRendererInfoObj *") org.lwjgl.PointerBuffer r7, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nCGLQueryRendererInfo(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLDestroyRendererInfo(@org.lwjgl.system.NativeType("CGLRendererInfoObj") long r5) {
            long r0 = org.lwjgl.opengl.CGL.Functions.DestroyRendererInfo
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1)
            return r0
    }

    public static int nCGLDescribeRenderer(long r9, int r11, int r12, long r13) {
            long r0 = org.lwjgl.opengl.CGL.Functions.DescribeRenderer
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r15
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLDescribeRenderer(@org.lwjgl.system.NativeType("CGLRendererInfoObj") long r7, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("CGLRendererProperty") int r10, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nCGLDescribeRenderer(r0, r1, r2, r3)
            return r0
    }

    public static int nCGLCreateContext(long r9, long r11, long r13) {
            long r0 = org.lwjgl.opengl.CGL.Functions.CreateContext
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLCreateContext(@org.lwjgl.system.NativeType("CGLPixelFormatObj") long r7, @org.lwjgl.system.NativeType("CGLContextObj") long r9, @org.lwjgl.system.NativeType("CGLContextObj *") org.lwjgl.PointerBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r7
            r1 = r9
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nCGLCreateContext(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLDestroyContext(@org.lwjgl.system.NativeType("CGLContextObj") long r5) {
            long r0 = org.lwjgl.opengl.CGL.Functions.DestroyContext
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLCopyContext(@org.lwjgl.system.NativeType("CGLContextObj") long r8, @org.lwjgl.system.NativeType("CGLContextObj") long r10, @org.lwjgl.system.NativeType("GLbitfield") int r12) {
            long r0 = org.lwjgl.opengl.CGL.Functions.CopyContext
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r8
            r1 = r10
            r2 = r12
            r3 = r13
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLContextObj")
    public static long CGLRetainContext(@org.lwjgl.system.NativeType("CGLContextObj") long r5) {
            long r0 = org.lwjgl.opengl.CGL.Functions.RetainContext
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.callPP(r0, r1)
            return r0
    }

    public static void CGLReleaseContext(@org.lwjgl.system.NativeType("CGLContextObj") long r5) {
            long r0 = org.lwjgl.opengl.CGL.Functions.ReleaseContext
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("GLuint")
    public static int CGLGetContextRetainCount(@org.lwjgl.system.NativeType("CGLContextObj") long r5) {
            long r0 = org.lwjgl.opengl.CGL.Functions.GetContextRetainCount
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLPixelFormatObj")
    public static long CGLGetPixelFormat(@org.lwjgl.system.NativeType("CGLContextObj") long r5) {
            long r0 = org.lwjgl.opengl.CGL.Functions.GetPixelFormat
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.callPP(r0, r1)
            return r0
    }

    public static int nCGLCreatePBuffer(int r10, int r11, int r12, int r13, int r14, long r15) {
            long r0 = org.lwjgl.opengl.CGL.Functions.CreatePBuffer
            r17 = r0
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r17
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLCreatePBuffer(@org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("GLsizei") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("CGLPBufferObj *") org.lwjgl.PointerBuffer r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            int r0 = nCGLCreatePBuffer(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLDestroyPBuffer(@org.lwjgl.system.NativeType("CGLPBufferObj") long r5) {
            long r0 = org.lwjgl.opengl.CGL.Functions.DestroyPBuffer
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1)
            return r0
    }

    public static int nCGLDescribePBuffer(long r15, long r17, long r19, long r21, long r23, long r25) {
            long r0 = org.lwjgl.opengl.CGL.Functions.DescribePBuffer
            r27 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r15
            r1 = r17
            r2 = r19
            r3 = r21
            r4 = r23
            r5 = r25
            r6 = r27
            int r0 = org.lwjgl.system.JNI.callPPPPPPI(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLDescribePBuffer(@org.lwjgl.system.NativeType("CGLPBufferObj") long r13, @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r15, @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r16, @org.lwjgl.system.NativeType("GLenum *") java.nio.IntBuffer r17, @org.lwjgl.system.NativeType("GLenum *") java.nio.IntBuffer r18, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r19) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L22
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r16
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r17
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r18
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r19
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L22:
            r0 = r13
            r1 = r15
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r16
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r17
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r18
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r19
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            int r0 = nCGLDescribePBuffer(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLTexImagePBuffer(@org.lwjgl.system.NativeType("CGLContextObj") long r8, @org.lwjgl.system.NativeType("CGLPBufferObj") long r10, @org.lwjgl.system.NativeType("GLenum") int r12) {
            long r0 = org.lwjgl.opengl.CGL.Functions.TexImagePBuffer
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r8
            r1 = r10
            r2 = r12
            r3 = r13
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLPBufferObj")
    public static long CGLRetainPBuffer(@org.lwjgl.system.NativeType("CGLPBufferObj") long r5) {
            long r0 = org.lwjgl.opengl.CGL.Functions.RetainPBuffer
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.callPP(r0, r1)
            return r0
    }

    public static void CGLReleasePBuffer(@org.lwjgl.system.NativeType("CGLPBufferObj") long r5) {
            long r0 = org.lwjgl.opengl.CGL.Functions.ReleasePBuffer
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("GLuint")
    public static int CGLGetPBufferRetainCount(@org.lwjgl.system.NativeType("CGLPBufferObj") long r5) {
            long r0 = org.lwjgl.opengl.CGL.Functions.GetPBufferRetainCount
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1)
            return r0
    }

    public static int nCGLSetOffScreen(long r10, int r12, int r13, int r14, long r15) {
            long r0 = org.lwjgl.opengl.CGL.Functions.SetOffScreen
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r10
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r17
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLSetOffScreen(@org.lwjgl.system.NativeType("CGLContextObj") long r8, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r13
            r1 = r12
            r2 = r11
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        Lf:
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            int r0 = nCGLSetOffScreen(r0, r1, r2, r3, r4)
            return r0
    }

    public static int nCGLGetOffScreen(long r13, long r15, long r17, long r19, long r21) {
            long r0 = org.lwjgl.opengl.CGL.Functions.GetOffScreen
            r23 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r13
            r1 = r15
            r2 = r17
            r3 = r19
            r4 = r21
            r5 = r23
            int r0 = org.lwjgl.system.JNI.callPPPPPI(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLGetOffScreen(@org.lwjgl.system.NativeType("CGLContextObj") long r11, @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r13, @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r14, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r15, @org.lwjgl.system.NativeType("void **") org.lwjgl.PointerBuffer r16) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1c
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r16
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1c:
            r0 = r11
            r1 = r13
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r14
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r15
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r16
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            int r0 = nCGLGetOffScreen(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLSetFullScreen(@org.lwjgl.system.NativeType("CGLContextObj") long r5) {
            long r0 = org.lwjgl.opengl.CGL.Functions.SetFullScreen
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLSetFullScreenOnDisplay(@org.lwjgl.system.NativeType("CGLContextObj") long r6, @org.lwjgl.system.NativeType("GLuint") int r8) {
            long r0 = org.lwjgl.opengl.CGL.Functions.SetFullScreenOnDisplay
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r6
            r1 = r8
            r2 = r9
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLSetPBuffer(@org.lwjgl.system.NativeType("CGLContextObj") long r10, @org.lwjgl.system.NativeType("CGLPBufferObj") long r12, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16) {
            long r0 = org.lwjgl.opengl.CGL.Functions.SetPBuffer
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r10
            r1 = r12
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static int nCGLGetPBuffer(long r13, long r15, long r17, long r19, long r21) {
            long r0 = org.lwjgl.opengl.CGL.Functions.GetPBuffer
            r23 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r13
            r1 = r15
            r2 = r17
            r3 = r19
            r4 = r21
            r5 = r23
            int r0 = org.lwjgl.system.JNI.callPPPPPI(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLGetPBuffer(@org.lwjgl.system.NativeType("CGLContextObj") long r11, @org.lwjgl.system.NativeType("CGLPBufferObj *") org.lwjgl.PointerBuffer r13, @org.lwjgl.system.NativeType("GLenum *") java.nio.IntBuffer r14, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r15, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r16) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1c
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r16
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1c:
            r0 = r11
            r1 = r13
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r14
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r15
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r16
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            int r0 = nCGLGetPBuffer(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLClearDrawable(@org.lwjgl.system.NativeType("CGLContextObj") long r5) {
            long r0 = org.lwjgl.opengl.CGL.Functions.ClearDrawable
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLFlushDrawable(@org.lwjgl.system.NativeType("CGLContextObj") long r5) {
            long r0 = org.lwjgl.opengl.CGL.Functions.FlushDrawable
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLEnable(@org.lwjgl.system.NativeType("CGLContextObj") long r6, @org.lwjgl.system.NativeType("CGLContextEnable") int r8) {
            long r0 = org.lwjgl.opengl.CGL.Functions.Enable
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r6
            r1 = r8
            r2 = r9
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLDisable(@org.lwjgl.system.NativeType("CGLContextObj") long r6, @org.lwjgl.system.NativeType("CGLContextEnable") int r8) {
            long r0 = org.lwjgl.opengl.CGL.Functions.Disable
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r6
            r1 = r8
            r2 = r9
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1, r2)
            return r0
    }

    public static int nCGLIsEnabled(long r8, int r10, long r11) {
            long r0 = org.lwjgl.opengl.CGL.Functions.IsEnabled
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r13
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLIsEnabled(@org.lwjgl.system.NativeType("CGLContextObj") long r6, @org.lwjgl.system.NativeType("CGLContextEnable") int r8, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r8
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nCGLIsEnabled(r0, r1, r2)
            return r0
    }

    public static int nCGLSetParameter(long r8, int r10, long r11) {
            long r0 = org.lwjgl.opengl.CGL.Functions.SetParameter
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r13
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLSetParameter(@org.lwjgl.system.NativeType("CGLContextObj") long r6, @org.lwjgl.system.NativeType("CGLContextParameter") int r8, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r8
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nCGLSetParameter(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLSetParameter(@org.lwjgl.system.NativeType("CGLContextObj") long r6, @org.lwjgl.system.NativeType("CGLContextParameter") int r8, @org.lwjgl.system.NativeType("GLint const *") int r9) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r10 = r0
            r0 = r10
            int r0 = r0.getPointer()
            r11 = r0
            r0 = r10
            r1 = r9
            java.nio.IntBuffer r0 = r0.ints(r1)     // Catch: java.lang.Throwable -> L2a
            r12 = r0
            r0 = r6
            r1 = r8
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            int r0 = nCGLSetParameter(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r13 = r0
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            r0 = r13
            return r0
        L2a:
            r14 = move-exception
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            r0 = r14
            throw r0
    }

    public static int nCGLGetParameter(long r8, int r10, long r11) {
            long r0 = org.lwjgl.opengl.CGL.Functions.GetParameter
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r13
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLGetParameter(@org.lwjgl.system.NativeType("CGLContextObj") long r6, @org.lwjgl.system.NativeType("CGLContextParameter") int r8, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r8
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nCGLGetParameter(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLSetVirtualScreen(@org.lwjgl.system.NativeType("CGLContextObj") long r6, @org.lwjgl.system.NativeType("GLint") int r8) {
            long r0 = org.lwjgl.opengl.CGL.Functions.SetVirtualScreen
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r6
            r1 = r8
            r2 = r9
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1, r2)
            return r0
    }

    public static int nCGLGetVirtualScreen(long r7, long r9) {
            long r0 = org.lwjgl.opengl.CGL.Functions.GetVirtualScreen
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLGetVirtualScreen(@org.lwjgl.system.NativeType("CGLContextObj") long r5, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            int r0 = nCGLGetVirtualScreen(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLUpdateContext(@org.lwjgl.system.NativeType("CGLContextObj") long r5) {
            long r0 = org.lwjgl.opengl.CGL.Functions.UpdateContext
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1)
            return r0
    }

    public static int nCGLSetGlobalOption(int r6, long r7) {
            long r0 = org.lwjgl.opengl.CGL.Functions.SetGlobalOption
            r9 = r0
            r0 = r6
            r1 = r7
            r2 = r9
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLSetGlobalOption(@org.lwjgl.system.NativeType("CGLGlobalOption") int r4, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            int r0 = nCGLSetGlobalOption(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLSetGlobalOption(@org.lwjgl.system.NativeType("CGLGlobalOption") int r4, @org.lwjgl.system.NativeType("GLint const *") int r5) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r6 = r0
            r0 = r6
            int r0 = r0.getPointer()
            r7 = r0
            r0 = r6
            r1 = r5
            java.nio.IntBuffer r0 = r0.ints(r1)     // Catch: java.lang.Throwable -> L23
            r8 = r0
            r0 = r4
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L23
            int r0 = nCGLSetGlobalOption(r0, r1)     // Catch: java.lang.Throwable -> L23
            r9 = r0
            r0 = r6
            r1 = r7
            r0.setPointer(r1)
            r0 = r9
            return r0
        L23:
            r10 = move-exception
            r0 = r6
            r1 = r7
            r0.setPointer(r1)
            r0 = r10
            throw r0
    }

    public static int nCGLGetGlobalOption(int r6, long r7) {
            long r0 = org.lwjgl.opengl.CGL.Functions.GetGlobalOption
            r9 = r0
            r0 = r6
            r1 = r7
            r2 = r9
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLGetGlobalOption(@org.lwjgl.system.NativeType("CGLGlobalOption") int r4, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            int r0 = nCGLGetGlobalOption(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLLockContext(@org.lwjgl.system.NativeType("CGLContextObj") long r5) {
            long r0 = org.lwjgl.opengl.CGL.Functions.LockContext
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLUnlockContext(@org.lwjgl.system.NativeType("CGLContextObj") long r5) {
            long r0 = org.lwjgl.opengl.CGL.Functions.UnlockContext
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1)
            return r0
    }

    public static void nCGLGetVersion(long r7, long r9) {
            long r0 = org.lwjgl.opengl.CGL.Functions.GetVersion
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void CGLGetVersion(@org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r5, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nCGLGetVersion(r0, r1)
            return
    }

    public static long nCGLErrorString(int r4) {
            long r0 = org.lwjgl.opengl.CGL.Functions.ErrorString
            r5 = r0
            r0 = r4
            r1 = r5
            long r0 = org.lwjgl.system.JNI.callP(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String CGLErrorString(@org.lwjgl.system.NativeType("CGLError") int r3) {
            r0 = r3
            long r0 = nCGLErrorString(r0)
            r4 = r0
            r0 = r4
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCIISafe(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLChoosePixelFormat(@org.lwjgl.system.NativeType("CGLPixelFormatAttribute const *") int[] r7, @org.lwjgl.system.NativeType("CGLPixelFormatObj *") org.lwjgl.PointerBuffer r8, @org.lwjgl.system.NativeType("GLint *") int[] r9) {
            long r0 = org.lwjgl.opengl.CGL.Functions.ChoosePixelFormat
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r7
            org.lwjgl.system.Checks.checkNT(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r7
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            r3 = r10
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLDescribePixelFormat(@org.lwjgl.system.NativeType("CGLPixelFormatObj") long r8, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("CGLPixelFormatAttribute") int r11, @org.lwjgl.system.NativeType("GLint *") int[] r12) {
            long r0 = org.lwjgl.opengl.CGL.Functions.DescribePixelFormat
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L16
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L16:
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLQueryRendererInfo(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("CGLRendererInfoObj *") org.lwjgl.PointerBuffer r8, @org.lwjgl.system.NativeType("GLint *") int[] r9) {
            long r0 = org.lwjgl.opengl.CGL.Functions.QueryRendererInfo
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L14:
            r0 = r7
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            r3 = r10
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLDescribeRenderer(@org.lwjgl.system.NativeType("CGLRendererInfoObj") long r8, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("CGLRendererProperty") int r11, @org.lwjgl.system.NativeType("GLint *") int[] r12) {
            long r0 = org.lwjgl.opengl.CGL.Functions.DescribeRenderer
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L16
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L16:
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLDescribePBuffer(@org.lwjgl.system.NativeType("CGLPBufferObj") long r10, @org.lwjgl.system.NativeType("GLsizei *") int[] r12, @org.lwjgl.system.NativeType("GLsizei *") int[] r13, @org.lwjgl.system.NativeType("GLenum *") int[] r14, @org.lwjgl.system.NativeType("GLenum *") int[] r15, @org.lwjgl.system.NativeType("GLint *") int[] r16) {
            long r0 = org.lwjgl.opengl.CGL.Functions.DescribePBuffer
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L2c
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
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
            r0 = r16
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L2c:
            r0 = r10
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            int r0 = org.lwjgl.system.JNI.callPPPPPPI(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLGetOffScreen(@org.lwjgl.system.NativeType("CGLContextObj") long r10, @org.lwjgl.system.NativeType("GLsizei *") int[] r12, @org.lwjgl.system.NativeType("GLsizei *") int[] r13, @org.lwjgl.system.NativeType("GLint *") int[] r14, @org.lwjgl.system.NativeType("void **") org.lwjgl.PointerBuffer r15) {
            long r0 = org.lwjgl.opengl.CGL.Functions.GetOffScreen
            r16 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L26
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
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
        L26:
            r0 = r10
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r16
            int r0 = org.lwjgl.system.JNI.callPPPPPI(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLGetPBuffer(@org.lwjgl.system.NativeType("CGLContextObj") long r10, @org.lwjgl.system.NativeType("CGLPBufferObj *") org.lwjgl.PointerBuffer r12, @org.lwjgl.system.NativeType("GLenum *") int[] r13, @org.lwjgl.system.NativeType("GLint *") int[] r14, @org.lwjgl.system.NativeType("GLint *") int[] r15) {
            long r0 = org.lwjgl.opengl.CGL.Functions.GetPBuffer
            r16 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L26
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
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
        L26:
            r0 = r10
            r1 = r12
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            int r0 = org.lwjgl.system.JNI.callPPPPPI(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLIsEnabled(@org.lwjgl.system.NativeType("CGLContextObj") long r7, @org.lwjgl.system.NativeType("CGLContextEnable") int r9, @org.lwjgl.system.NativeType("GLint *") int[] r10) {
            long r0 = org.lwjgl.opengl.CGL.Functions.IsEnabled
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L15:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLSetParameter(@org.lwjgl.system.NativeType("CGLContextObj") long r7, @org.lwjgl.system.NativeType("CGLContextParameter") int r9, @org.lwjgl.system.NativeType("GLint const *") int[] r10) {
            long r0 = org.lwjgl.opengl.CGL.Functions.SetParameter
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L15:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLGetParameter(@org.lwjgl.system.NativeType("CGLContextObj") long r7, @org.lwjgl.system.NativeType("CGLContextParameter") int r9, @org.lwjgl.system.NativeType("GLint *") int[] r10) {
            long r0 = org.lwjgl.opengl.CGL.Functions.GetParameter
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L15:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLGetVirtualScreen(@org.lwjgl.system.NativeType("CGLContextObj") long r6, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            long r0 = org.lwjgl.opengl.CGL.Functions.GetVirtualScreen
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L14:
            r0 = r6
            r1 = r8
            r2 = r9
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLSetGlobalOption(@org.lwjgl.system.NativeType("CGLGlobalOption") int r5, @org.lwjgl.system.NativeType("GLint const *") int[] r6) {
            long r0 = org.lwjgl.opengl.CGL.Functions.SetGlobalOption
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lf:
            r0 = r5
            r1 = r6
            r2 = r7
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("CGLError")
    public static int CGLGetGlobalOption(@org.lwjgl.system.NativeType("CGLGlobalOption") int r5, @org.lwjgl.system.NativeType("GLint *") int[] r6) {
            long r0 = org.lwjgl.opengl.CGL.Functions.GetGlobalOption
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lf:
            r0 = r5
            r1 = r6
            r2 = r7
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1, r2)
            return r0
    }

    public static void CGLGetVersion(@org.lwjgl.system.NativeType("GLint *") int[] r5, @org.lwjgl.system.NativeType("GLint *") int[] r6) {
            long r0 = org.lwjgl.opengl.CGL.Functions.GetVersion
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L14:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }
}
