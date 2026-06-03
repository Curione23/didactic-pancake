package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/WGLCapabilities.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/WGLCapabilities.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/WGLCapabilities.class */
public final class WGLCapabilities {
    public final long wglGetGPUIDsAMD;
    public final long wglGetGPUInfoAMD;
    public final long wglGetContextGPUIDAMD;
    public final long wglCreateAssociatedContextAMD;
    public final long wglCreateAssociatedContextAttribsAMD;
    public final long wglDeleteAssociatedContextAMD;
    public final long wglMakeAssociatedContextCurrentAMD;
    public final long wglGetCurrentAssociatedContextAMD;
    public final long wglBlitContextFramebufferAMD;
    public final long wglCreateBufferRegionARB;
    public final long wglDeleteBufferRegionARB;
    public final long wglSaveBufferRegionARB;
    public final long wglRestoreBufferRegionARB;
    public final long wglCreateContextAttribsARB;
    public final long wglGetExtensionsStringARB;
    public final long wglMakeContextCurrentARB;
    public final long wglGetCurrentReadDCARB;
    public final long wglCreatePbufferARB;
    public final long wglGetPbufferDCARB;
    public final long wglReleasePbufferDCARB;
    public final long wglDestroyPbufferARB;
    public final long wglQueryPbufferARB;
    public final long wglGetPixelFormatAttribivARB;
    public final long wglGetPixelFormatAttribfvARB;
    public final long wglChoosePixelFormatARB;
    public final long wglBindTexImageARB;
    public final long wglReleaseTexImageARB;
    public final long wglSetPbufferAttribARB;
    public final long wglGetExtensionsStringEXT;
    public final long wglSwapIntervalEXT;
    public final long wglGetSwapIntervalEXT;
    public final long wglCopyImageSubDataNV;
    public final long wglDelayBeforeSwapNV;
    public final long wglDXSetResourceShareHandleNV;
    public final long wglDXOpenDeviceNV;
    public final long wglDXCloseDeviceNV;
    public final long wglDXRegisterObjectNV;
    public final long wglDXUnregisterObjectNV;
    public final long wglDXObjectAccessNV;
    public final long wglDXLockObjectsNV;
    public final long wglDXUnlockObjectsNV;
    public final long wglEnumGpusNV;
    public final long wglEnumGpuDevicesNV;
    public final long wglCreateAffinityDCNV;
    public final long wglEnumGpusFromAffinityDCNV;
    public final long wglDeleteDCNV;
    public final long wglJoinSwapGroupNV;
    public final long wglBindSwapBarrierNV;
    public final long wglQuerySwapGroupNV;
    public final long wglQueryMaxSwapGroupsNV;
    public final long wglQueryFrameCountNV;
    public final long wglResetFrameCountNV;
    public final long wglAllocateMemoryNV;
    public final long wglFreeMemoryNV;
    public final boolean WGL_AMD_gpu_association;
    public final boolean WGL_ARB_buffer_region;
    public final boolean WGL_ARB_context_flush_control;
    public final boolean WGL_ARB_create_context;
    public final boolean WGL_ARB_create_context_no_error;
    public final boolean WGL_ARB_create_context_profile;
    public final boolean WGL_ARB_create_context_robustness;
    public final boolean WGL_ARB_extensions_string;
    public final boolean WGL_ARB_framebuffer_sRGB;
    public final boolean WGL_ARB_make_current_read;
    public final boolean WGL_ARB_multisample;
    public final boolean WGL_ARB_pbuffer;
    public final boolean WGL_ARB_pixel_format;
    public final boolean WGL_ARB_pixel_format_float;
    public final boolean WGL_ARB_render_texture;
    public final boolean WGL_ARB_robustness_application_isolation;
    public final boolean WGL_ARB_robustness_share_group_isolation;
    public final boolean WGL_ATI_pixel_format_float;
    public final boolean WGL_ATI_render_texture_rectangle;
    public final boolean WGL_EXT_colorspace;
    public final boolean WGL_EXT_create_context_es2_profile;
    public final boolean WGL_EXT_create_context_es_profile;
    public final boolean WGL_EXT_depth_float;
    public final boolean WGL_EXT_extensions_string;
    public final boolean WGL_EXT_framebuffer_sRGB;
    public final boolean WGL_EXT_pixel_format_packed_float;
    public final boolean WGL_EXT_swap_control;
    public final boolean WGL_EXT_swap_control_tear;
    public final boolean WGL_NV_copy_image;
    public final boolean WGL_NV_delay_before_swap;
    public final boolean WGL_NV_DX_interop;
    public final boolean WGL_NV_DX_interop2;
    public final boolean WGL_NV_float_buffer;
    public final boolean WGL_NV_gpu_affinity;
    public final boolean WGL_NV_multigpu_context;
    public final boolean WGL_NV_multisample_coverage;
    public final boolean WGL_NV_render_depth_texture;
    public final boolean WGL_NV_render_texture_rectangle;
    public final boolean WGL_NV_swap_group;
    public final boolean WGL_NV_vertex_array_range;

    WGLCapabilities(org.lwjgl.system.FunctionProvider r6, java.util.Set<java.lang.String> r7) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = 54
            long[] r0 = new long[r0]
            r8 = r0
            r0 = r5
            r1 = r6
            r2 = r8
            r3 = r7
            boolean r1 = check_WGL_AMD_gpu_association(r1, r2, r3)
            r0.WGL_AMD_gpu_association = r1
            r0 = r5
            r1 = r6
            r2 = r8
            r3 = r7
            boolean r1 = check_WGL_ARB_buffer_region(r1, r2, r3)
            r0.WGL_ARB_buffer_region = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "WGL_ARB_context_flush_control"
            boolean r1 = r1.contains(r2)
            r0.WGL_ARB_context_flush_control = r1
            r0 = r5
            r1 = r6
            r2 = r8
            r3 = r7
            boolean r1 = check_WGL_ARB_create_context(r1, r2, r3)
            r0.WGL_ARB_create_context = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "WGL_ARB_create_context_no_error"
            boolean r1 = r1.contains(r2)
            r0.WGL_ARB_create_context_no_error = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "WGL_ARB_create_context_profile"
            boolean r1 = r1.contains(r2)
            r0.WGL_ARB_create_context_profile = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "WGL_ARB_create_context_robustness"
            boolean r1 = r1.contains(r2)
            r0.WGL_ARB_create_context_robustness = r1
            r0 = r5
            r1 = r6
            r2 = r8
            r3 = r7
            boolean r1 = check_WGL_ARB_extensions_string(r1, r2, r3)
            r0.WGL_ARB_extensions_string = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "WGL_ARB_framebuffer_sRGB"
            boolean r1 = r1.contains(r2)
            r0.WGL_ARB_framebuffer_sRGB = r1
            r0 = r5
            r1 = r6
            r2 = r8
            r3 = r7
            boolean r1 = check_WGL_ARB_make_current_read(r1, r2, r3)
            r0.WGL_ARB_make_current_read = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "WGL_ARB_multisample"
            boolean r1 = r1.contains(r2)
            r0.WGL_ARB_multisample = r1
            r0 = r5
            r1 = r6
            r2 = r8
            r3 = r7
            boolean r1 = check_WGL_ARB_pbuffer(r1, r2, r3)
            r0.WGL_ARB_pbuffer = r1
            r0 = r5
            r1 = r6
            r2 = r8
            r3 = r7
            boolean r1 = check_WGL_ARB_pixel_format(r1, r2, r3)
            r0.WGL_ARB_pixel_format = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "WGL_ARB_pixel_format_float"
            boolean r1 = r1.contains(r2)
            r0.WGL_ARB_pixel_format_float = r1
            r0 = r5
            r1 = r6
            r2 = r8
            r3 = r7
            boolean r1 = check_WGL_ARB_render_texture(r1, r2, r3)
            r0.WGL_ARB_render_texture = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "WGL_ARB_robustness_application_isolation"
            boolean r1 = r1.contains(r2)
            r0.WGL_ARB_robustness_application_isolation = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "WGL_ARB_robustness_share_group_isolation"
            boolean r1 = r1.contains(r2)
            r0.WGL_ARB_robustness_share_group_isolation = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "WGL_ATI_pixel_format_float"
            boolean r1 = r1.contains(r2)
            r0.WGL_ATI_pixel_format_float = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "WGL_ATI_render_texture_rectangle"
            boolean r1 = r1.contains(r2)
            r0.WGL_ATI_render_texture_rectangle = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "WGL_EXT_colorspace"
            boolean r1 = r1.contains(r2)
            r0.WGL_EXT_colorspace = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "WGL_EXT_create_context_es2_profile"
            boolean r1 = r1.contains(r2)
            r0.WGL_EXT_create_context_es2_profile = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "WGL_EXT_create_context_es_profile"
            boolean r1 = r1.contains(r2)
            r0.WGL_EXT_create_context_es_profile = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "WGL_EXT_depth_float"
            boolean r1 = r1.contains(r2)
            r0.WGL_EXT_depth_float = r1
            r0 = r5
            r1 = r6
            r2 = r8
            r3 = r7
            boolean r1 = check_WGL_EXT_extensions_string(r1, r2, r3)
            r0.WGL_EXT_extensions_string = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "WGL_EXT_framebuffer_sRGB"
            boolean r1 = r1.contains(r2)
            r0.WGL_EXT_framebuffer_sRGB = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "WGL_EXT_pixel_format_packed_float"
            boolean r1 = r1.contains(r2)
            r0.WGL_EXT_pixel_format_packed_float = r1
            r0 = r5
            r1 = r6
            r2 = r8
            r3 = r7
            boolean r1 = check_WGL_EXT_swap_control(r1, r2, r3)
            r0.WGL_EXT_swap_control = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "WGL_EXT_swap_control_tear"
            boolean r1 = r1.contains(r2)
            r0.WGL_EXT_swap_control_tear = r1
            r0 = r5
            r1 = r6
            r2 = r8
            r3 = r7
            boolean r1 = check_WGL_NV_copy_image(r1, r2, r3)
            r0.WGL_NV_copy_image = r1
            r0 = r5
            r1 = r6
            r2 = r8
            r3 = r7
            boolean r1 = check_WGL_NV_delay_before_swap(r1, r2, r3)
            r0.WGL_NV_delay_before_swap = r1
            r0 = r5
            r1 = r6
            r2 = r8
            r3 = r7
            boolean r1 = check_WGL_NV_DX_interop(r1, r2, r3)
            r0.WGL_NV_DX_interop = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "WGL_NV_DX_interop2"
            boolean r1 = r1.contains(r2)
            r0.WGL_NV_DX_interop2 = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "WGL_NV_float_buffer"
            boolean r1 = r1.contains(r2)
            r0.WGL_NV_float_buffer = r1
            r0 = r5
            r1 = r6
            r2 = r8
            r3 = r7
            boolean r1 = check_WGL_NV_gpu_affinity(r1, r2, r3)
            r0.WGL_NV_gpu_affinity = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "WGL_NV_multigpu_context"
            boolean r1 = r1.contains(r2)
            r0.WGL_NV_multigpu_context = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "WGL_NV_multisample_coverage"
            boolean r1 = r1.contains(r2)
            r0.WGL_NV_multisample_coverage = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "WGL_NV_render_depth_texture"
            boolean r1 = r1.contains(r2)
            r0.WGL_NV_render_depth_texture = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "WGL_NV_render_texture_rectangle"
            boolean r1 = r1.contains(r2)
            r0.WGL_NV_render_texture_rectangle = r1
            r0 = r5
            r1 = r6
            r2 = r8
            r3 = r7
            boolean r1 = check_WGL_NV_swap_group(r1, r2, r3)
            r0.WGL_NV_swap_group = r1
            r0 = r5
            r1 = r6
            r2 = r8
            r3 = r7
            boolean r1 = check_WGL_NV_vertex_array_range(r1, r2, r3)
            r0.WGL_NV_vertex_array_range = r1
            r0 = r5
            r1 = r8
            r2 = 0
            r1 = r1[r2]
            r0.wglGetGPUIDsAMD = r1
            r0 = r5
            r1 = r8
            r2 = 1
            r1 = r1[r2]
            r0.wglGetGPUInfoAMD = r1
            r0 = r5
            r1 = r8
            r2 = 2
            r1 = r1[r2]
            r0.wglGetContextGPUIDAMD = r1
            r0 = r5
            r1 = r8
            r2 = 3
            r1 = r1[r2]
            r0.wglCreateAssociatedContextAMD = r1
            r0 = r5
            r1 = r8
            r2 = 4
            r1 = r1[r2]
            r0.wglCreateAssociatedContextAttribsAMD = r1
            r0 = r5
            r1 = r8
            r2 = 5
            r1 = r1[r2]
            r0.wglDeleteAssociatedContextAMD = r1
            r0 = r5
            r1 = r8
            r2 = 6
            r1 = r1[r2]
            r0.wglMakeAssociatedContextCurrentAMD = r1
            r0 = r5
            r1 = r8
            r2 = 7
            r1 = r1[r2]
            r0.wglGetCurrentAssociatedContextAMD = r1
            r0 = r5
            r1 = r8
            r2 = 8
            r1 = r1[r2]
            r0.wglBlitContextFramebufferAMD = r1
            r0 = r5
            r1 = r8
            r2 = 9
            r1 = r1[r2]
            r0.wglCreateBufferRegionARB = r1
            r0 = r5
            r1 = r8
            r2 = 10
            r1 = r1[r2]
            r0.wglDeleteBufferRegionARB = r1
            r0 = r5
            r1 = r8
            r2 = 11
            r1 = r1[r2]
            r0.wglSaveBufferRegionARB = r1
            r0 = r5
            r1 = r8
            r2 = 12
            r1 = r1[r2]
            r0.wglRestoreBufferRegionARB = r1
            r0 = r5
            r1 = r8
            r2 = 13
            r1 = r1[r2]
            r0.wglCreateContextAttribsARB = r1
            r0 = r5
            r1 = r8
            r2 = 14
            r1 = r1[r2]
            r0.wglGetExtensionsStringARB = r1
            r0 = r5
            r1 = r8
            r2 = 15
            r1 = r1[r2]
            r0.wglMakeContextCurrentARB = r1
            r0 = r5
            r1 = r8
            r2 = 16
            r1 = r1[r2]
            r0.wglGetCurrentReadDCARB = r1
            r0 = r5
            r1 = r8
            r2 = 17
            r1 = r1[r2]
            r0.wglCreatePbufferARB = r1
            r0 = r5
            r1 = r8
            r2 = 18
            r1 = r1[r2]
            r0.wglGetPbufferDCARB = r1
            r0 = r5
            r1 = r8
            r2 = 19
            r1 = r1[r2]
            r0.wglReleasePbufferDCARB = r1
            r0 = r5
            r1 = r8
            r2 = 20
            r1 = r1[r2]
            r0.wglDestroyPbufferARB = r1
            r0 = r5
            r1 = r8
            r2 = 21
            r1 = r1[r2]
            r0.wglQueryPbufferARB = r1
            r0 = r5
            r1 = r8
            r2 = 22
            r1 = r1[r2]
            r0.wglGetPixelFormatAttribivARB = r1
            r0 = r5
            r1 = r8
            r2 = 23
            r1 = r1[r2]
            r0.wglGetPixelFormatAttribfvARB = r1
            r0 = r5
            r1 = r8
            r2 = 24
            r1 = r1[r2]
            r0.wglChoosePixelFormatARB = r1
            r0 = r5
            r1 = r8
            r2 = 25
            r1 = r1[r2]
            r0.wglBindTexImageARB = r1
            r0 = r5
            r1 = r8
            r2 = 26
            r1 = r1[r2]
            r0.wglReleaseTexImageARB = r1
            r0 = r5
            r1 = r8
            r2 = 27
            r1 = r1[r2]
            r0.wglSetPbufferAttribARB = r1
            r0 = r5
            r1 = r8
            r2 = 28
            r1 = r1[r2]
            r0.wglGetExtensionsStringEXT = r1
            r0 = r5
            r1 = r8
            r2 = 29
            r1 = r1[r2]
            r0.wglSwapIntervalEXT = r1
            r0 = r5
            r1 = r8
            r2 = 30
            r1 = r1[r2]
            r0.wglGetSwapIntervalEXT = r1
            r0 = r5
            r1 = r8
            r2 = 31
            r1 = r1[r2]
            r0.wglCopyImageSubDataNV = r1
            r0 = r5
            r1 = r8
            r2 = 32
            r1 = r1[r2]
            r0.wglDelayBeforeSwapNV = r1
            r0 = r5
            r1 = r8
            r2 = 33
            r1 = r1[r2]
            r0.wglDXSetResourceShareHandleNV = r1
            r0 = r5
            r1 = r8
            r2 = 34
            r1 = r1[r2]
            r0.wglDXOpenDeviceNV = r1
            r0 = r5
            r1 = r8
            r2 = 35
            r1 = r1[r2]
            r0.wglDXCloseDeviceNV = r1
            r0 = r5
            r1 = r8
            r2 = 36
            r1 = r1[r2]
            r0.wglDXRegisterObjectNV = r1
            r0 = r5
            r1 = r8
            r2 = 37
            r1 = r1[r2]
            r0.wglDXUnregisterObjectNV = r1
            r0 = r5
            r1 = r8
            r2 = 38
            r1 = r1[r2]
            r0.wglDXObjectAccessNV = r1
            r0 = r5
            r1 = r8
            r2 = 39
            r1 = r1[r2]
            r0.wglDXLockObjectsNV = r1
            r0 = r5
            r1 = r8
            r2 = 40
            r1 = r1[r2]
            r0.wglDXUnlockObjectsNV = r1
            r0 = r5
            r1 = r8
            r2 = 41
            r1 = r1[r2]
            r0.wglEnumGpusNV = r1
            r0 = r5
            r1 = r8
            r2 = 42
            r1 = r1[r2]
            r0.wglEnumGpuDevicesNV = r1
            r0 = r5
            r1 = r8
            r2 = 43
            r1 = r1[r2]
            r0.wglCreateAffinityDCNV = r1
            r0 = r5
            r1 = r8
            r2 = 44
            r1 = r1[r2]
            r0.wglEnumGpusFromAffinityDCNV = r1
            r0 = r5
            r1 = r8
            r2 = 45
            r1 = r1[r2]
            r0.wglDeleteDCNV = r1
            r0 = r5
            r1 = r8
            r2 = 46
            r1 = r1[r2]
            r0.wglJoinSwapGroupNV = r1
            r0 = r5
            r1 = r8
            r2 = 47
            r1 = r1[r2]
            r0.wglBindSwapBarrierNV = r1
            r0 = r5
            r1 = r8
            r2 = 48
            r1 = r1[r2]
            r0.wglQuerySwapGroupNV = r1
            r0 = r5
            r1 = r8
            r2 = 49
            r1 = r1[r2]
            r0.wglQueryMaxSwapGroupsNV = r1
            r0 = r5
            r1 = r8
            r2 = 50
            r1 = r1[r2]
            r0.wglQueryFrameCountNV = r1
            r0 = r5
            r1 = r8
            r2 = 51
            r1 = r1[r2]
            r0.wglResetFrameCountNV = r1
            r0 = r5
            r1 = r8
            r2 = 52
            r1 = r1[r2]
            r0.wglAllocateMemoryNV = r1
            r0 = r5
            r1 = r8
            r2 = 53
            r1 = r1[r2]
            r0.wglFreeMemoryNV = r1
            return
    }

    private static boolean check_WGL_AMD_gpu_association(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "WGL_AMD_gpu_association"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = r8
            r1 = r9
            r2 = 8
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 0
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 1
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 2
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 3
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = 4
            r3[r4] = r5
            r3 = r2
            r4 = 5
            r5 = 5
            r3[r4] = r5
            r3 = r2
            r4 = 6
            r5 = 6
            r3[r4] = r5
            r3 = r2
            r4 = 7
            r5 = 7
            r3[r4] = r5
            r3 = 8
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "wglGetGPUIDsAMD"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "wglGetGPUInfoAMD"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "wglGetContextGPUIDAMD"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "wglCreateAssociatedContextAMD"
            r4[r5] = r6
            r4 = r3
            r5 = 4
            java.lang.String r6 = "wglCreateAssociatedContextAttribsAMD"
            r4[r5] = r6
            r4 = r3
            r5 = 5
            java.lang.String r6 = "wglDeleteAssociatedContextAMD"
            r4[r5] = r6
            r4 = r3
            r5 = 6
            java.lang.String r6 = "wglMakeAssociatedContextCurrentAMD"
            r4[r5] = r6
            r4 = r3
            r5 = 7
            java.lang.String r6 = "wglGetCurrentAssociatedContextAMD"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L76
            java.lang.String r0 = "WGL"
            java.lang.String r1 = "WGL_AMD_gpu_association"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L7a
        L76:
            r0 = 1
            goto L7b
        L7a:
            r0 = 0
        L7b:
            return r0
    }

    private static boolean check_WGL_ARB_buffer_region(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "WGL_ARB_buffer_region"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = r8
            r1 = r9
            r2 = 4
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 9
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 10
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 11
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 12
            r3[r4] = r5
            r3 = 4
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "wglCreateBufferRegionARB"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "wglDeleteBufferRegionARB"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "wglSaveBufferRegionARB"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "wglRestoreBufferRegionARB"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L4e
            java.lang.String r0 = "WGL"
            java.lang.String r1 = "WGL_ARB_buffer_region"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L52
        L4e:
            r0 = 1
            goto L53
        L52:
            r0 = 0
        L53:
            return r0
    }

    private static boolean check_WGL_ARB_create_context(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "WGL_ARB_create_context"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 13
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "wglCreateContextAttribsARB"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L30
            java.lang.String r0 = "WGL"
            java.lang.String r1 = "WGL_ARB_create_context"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L34
        L30:
            r0 = 1
            goto L35
        L34:
            r0 = 0
        L35:
            return r0
    }

    private static boolean check_WGL_ARB_extensions_string(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "WGL_ARB_extensions_string"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 14
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "wglGetExtensionsStringARB"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L30
            java.lang.String r0 = "WGL"
            java.lang.String r1 = "WGL_ARB_extensions_string"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L34
        L30:
            r0 = 1
            goto L35
        L34:
            r0 = 0
        L35:
            return r0
    }

    private static boolean check_WGL_ARB_make_current_read(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "WGL_ARB_make_current_read"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = r8
            r1 = r9
            r2 = 2
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 15
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 16
            r3[r4] = r5
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "wglMakeContextCurrentARB"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "wglGetCurrentReadDCARB"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L3a
            java.lang.String r0 = "WGL"
            java.lang.String r1 = "WGL_ARB_make_current_read"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L3e
        L3a:
            r0 = 1
            goto L3f
        L3e:
            r0 = 0
        L3f:
            return r0
    }

    private static boolean check_WGL_ARB_pbuffer(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "WGL_ARB_pbuffer"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = r8
            r1 = r9
            r2 = 5
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 17
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 18
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 19
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 20
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = 21
            r3[r4] = r5
            r3 = 5
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "wglCreatePbufferARB"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "wglGetPbufferDCARB"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "wglReleasePbufferDCARB"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "wglDestroyPbufferARB"
            r4[r5] = r6
            r4 = r3
            r5 = 4
            java.lang.String r6 = "wglQueryPbufferARB"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L58
            java.lang.String r0 = "WGL"
            java.lang.String r1 = "WGL_ARB_pbuffer"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L5c
        L58:
            r0 = 1
            goto L5d
        L5c:
            r0 = 0
        L5d:
            return r0
    }

    private static boolean check_WGL_ARB_pixel_format(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "WGL_ARB_pixel_format"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = r8
            r1 = r9
            r2 = 3
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 22
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 23
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 24
            r3[r4] = r5
            r3 = 3
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "wglGetPixelFormatAttribivARB"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "wglGetPixelFormatAttribfvARB"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "wglChoosePixelFormatARB"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L44
            java.lang.String r0 = "WGL"
            java.lang.String r1 = "WGL_ARB_pixel_format"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L48
        L44:
            r0 = 1
            goto L49
        L48:
            r0 = 0
        L49:
            return r0
    }

    private static boolean check_WGL_ARB_render_texture(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "WGL_ARB_render_texture"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = r8
            r1 = r9
            r2 = 3
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 25
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 26
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 27
            r3[r4] = r5
            r3 = 3
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "wglBindTexImageARB"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "wglReleaseTexImageARB"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "wglSetPbufferAttribARB"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L44
            java.lang.String r0 = "WGL"
            java.lang.String r1 = "WGL_ARB_render_texture"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L48
        L44:
            r0 = 1
            goto L49
        L48:
            r0 = 0
        L49:
            return r0
    }

    private static boolean check_WGL_EXT_extensions_string(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "WGL_EXT_extensions_string"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 28
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "wglGetExtensionsStringEXT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L30
            java.lang.String r0 = "WGL"
            java.lang.String r1 = "WGL_EXT_extensions_string"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L34
        L30:
            r0 = 1
            goto L35
        L34:
            r0 = 0
        L35:
            return r0
    }

    private static boolean check_WGL_EXT_swap_control(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "WGL_EXT_swap_control"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = r8
            r1 = r9
            r2 = 2
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 29
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 30
            r3[r4] = r5
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "wglSwapIntervalEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "wglGetSwapIntervalEXT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L3a
            java.lang.String r0 = "WGL"
            java.lang.String r1 = "WGL_EXT_swap_control"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L3e
        L3a:
            r0 = 1
            goto L3f
        L3e:
            r0 = 0
        L3f:
            return r0
    }

    private static boolean check_WGL_NV_copy_image(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "WGL_NV_copy_image"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 31
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "wglCopyImageSubDataNV"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L30
            java.lang.String r0 = "WGL"
            java.lang.String r1 = "WGL_NV_copy_image"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L34
        L30:
            r0 = 1
            goto L35
        L34:
            r0 = 0
        L35:
            return r0
    }

    private static boolean check_WGL_NV_delay_before_swap(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "WGL_NV_delay_before_swap"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 32
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "wglDelayBeforeSwapNV"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L30
            java.lang.String r0 = "WGL"
            java.lang.String r1 = "WGL_NV_delay_before_swap"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L34
        L30:
            r0 = 1
            goto L35
        L34:
            r0 = 0
        L35:
            return r0
    }

    private static boolean check_WGL_NV_DX_interop(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "WGL_NV_DX_interop"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = r8
            r1 = r9
            r2 = 8
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 33
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 34
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 35
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 36
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = 37
            r3[r4] = r5
            r3 = r2
            r4 = 5
            r5 = 38
            r3[r4] = r5
            r3 = r2
            r4 = 6
            r5 = 39
            r3[r4] = r5
            r3 = r2
            r4 = 7
            r5 = 40
            r3[r4] = r5
            r3 = 8
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "wglDXSetResourceShareHandleNV"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "wglDXOpenDeviceNV"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "wglDXCloseDeviceNV"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "wglDXRegisterObjectNV"
            r4[r5] = r6
            r4 = r3
            r5 = 4
            java.lang.String r6 = "wglDXUnregisterObjectNV"
            r4[r5] = r6
            r4 = r3
            r5 = 5
            java.lang.String r6 = "wglDXObjectAccessNV"
            r4[r5] = r6
            r4 = r3
            r5 = 6
            java.lang.String r6 = "wglDXLockObjectsNV"
            r4[r5] = r6
            r4 = r3
            r5 = 7
            java.lang.String r6 = "wglDXUnlockObjectsNV"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L7c
            java.lang.String r0 = "WGL"
            java.lang.String r1 = "WGL_NV_DX_interop"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L80
        L7c:
            r0 = 1
            goto L81
        L80:
            r0 = 0
        L81:
            return r0
    }

    private static boolean check_WGL_NV_gpu_affinity(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "WGL_NV_gpu_affinity"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = r8
            r1 = r9
            r2 = 5
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 41
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 42
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 43
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 44
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = 45
            r3[r4] = r5
            r3 = 5
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "wglEnumGpusNV"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "wglEnumGpuDevicesNV"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "wglCreateAffinityDCNV"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "wglEnumGpusFromAffinityDCNV"
            r4[r5] = r6
            r4 = r3
            r5 = 4
            java.lang.String r6 = "wglDeleteDCNV"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L58
            java.lang.String r0 = "WGL"
            java.lang.String r1 = "WGL_NV_gpu_affinity"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L5c
        L58:
            r0 = 1
            goto L5d
        L5c:
            r0 = 0
        L5d:
            return r0
    }

    private static boolean check_WGL_NV_swap_group(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "WGL_NV_swap_group"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = r8
            r1 = r9
            r2 = 6
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 46
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 47
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 48
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 49
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = 50
            r3[r4] = r5
            r3 = r2
            r4 = 5
            r5 = 51
            r3[r4] = r5
            r3 = 6
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "wglJoinSwapGroupNV"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "wglBindSwapBarrierNV"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "wglQuerySwapGroupNV"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "wglQueryMaxSwapGroupsNV"
            r4[r5] = r6
            r4 = r3
            r5 = 4
            java.lang.String r6 = "wglQueryFrameCountNV"
            r4[r5] = r6
            r4 = r3
            r5 = 5
            java.lang.String r6 = "wglResetFrameCountNV"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L64
            java.lang.String r0 = "WGL"
            java.lang.String r1 = "WGL_NV_swap_group"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L68
        L64:
            r0 = 1
            goto L69
        L68:
            r0 = 0
        L69:
            return r0
    }

    private static boolean check_WGL_NV_vertex_array_range(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "WGL_NV_vertex_array_range"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = r8
            r1 = r9
            r2 = 2
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 52
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 53
            r3[r4] = r5
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "wglAllocateMemoryNV"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "wglFreeMemoryNV"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L3a
            java.lang.String r0 = "WGL"
            java.lang.String r1 = "WGL_NV_vertex_array_range"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L3e
        L3a:
            r0 = 1
            goto L3f
        L3e:
            r0 = 0
        L3f:
            return r0
    }
}
