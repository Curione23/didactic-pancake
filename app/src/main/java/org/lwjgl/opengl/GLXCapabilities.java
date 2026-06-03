package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLXCapabilities.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLXCapabilities.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLXCapabilities.class */
public final class GLXCapabilities {
    public final long glXQueryExtensionsString;
    public final long glXGetClientString;
    public final long glXQueryServerString;
    public final long glXGetCurrentDisplay;
    public final long glXGetFBConfigs;
    public final long glXChooseFBConfig;
    public final long glXGetFBConfigAttrib;
    public final long glXGetVisualFromFBConfig;
    public final long glXCreateWindow;
    public final long glXCreatePixmap;
    public final long glXDestroyPixmap;
    public final long glXCreatePbuffer;
    public final long glXDestroyPbuffer;
    public final long glXQueryDrawable;
    public final long glXCreateNewContext;
    public final long glXMakeContextCurrent;
    public final long glXGetCurrentReadDrawable;
    public final long glXQueryContext;
    public final long glXSelectEvent;
    public final long glXGetSelectedEvent;
    public final long glXGetProcAddress;
    public final long glXBlitContextFramebufferAMD;
    public final long glXCreateAssociatedContextAMD;
    public final long glXCreateAssociatedContextAttribsAMD;
    public final long glXDeleteAssociatedContextAMD;
    public final long glXGetContextGPUIDAMD;
    public final long glXGetCurrentAssociatedContextAMD;
    public final long glXGetGPUIDsAMD;
    public final long glXGetGPUInfoAMD;
    public final long glXMakeAssociatedContextCurrentAMD;
    public final long glXCreateContextAttribsARB;
    public final long glXGetProcAddressARB;
    public final long glXGetCurrentDisplayEXT;
    public final long glXQueryContextInfoEXT;
    public final long glXGetContextIDEXT;
    public final long glXImportContextEXT;
    public final long glXFreeContextEXT;
    public final long glXSwapIntervalEXT;
    public final long glXBindTexImageEXT;
    public final long glXReleaseTexImageEXT;
    public final long glXCopyBufferSubDataNV;
    public final long glXNamedCopyBufferSubDataNV;
    public final long glXCopyImageSubDataNV;
    public final long glXDelayBeforeSwapNV;
    public final long glXJoinSwapGroupNV;
    public final long glXBindSwapBarrierNV;
    public final long glXQuerySwapGroupNV;
    public final long glXQueryMaxSwapGroupsNV;
    public final long glXQueryFrameCountNV;
    public final long glXResetFrameCountNV;
    public final long glXMakeCurrentReadSGI;
    public final long glXGetCurrentReadDrawableSGI;
    public final long glXSwapIntervalSGI;
    public final long glXGetVideoSyncSGI;
    public final long glXWaitVideoSyncSGI;
    public final long glXGetFBConfigAttribSGIX;
    public final long glXChooseFBConfigSGIX;
    public final long glXCreateGLXPixmapWithConfigSGIX;
    public final long glXCreateContextWithConfigSGIX;
    public final long glXGetVisualFromFBConfigSGIX;
    public final long glXGetFBConfigFromVisualSGIX;
    public final long glXCreateGLXPbufferSGIX;
    public final long glXDestroyGLXPbufferSGIX;
    public final long glXQueryGLXPbufferSGIX;
    public final long glXSelectEventSGIX;
    public final long glXGetSelectedEventSGIX;
    public final long glXBindSwapBarrierSGIX;
    public final long glXQueryMaxSwapBarriersSGIX;
    public final long glXJoinSwapGroupSGIX;
    public final boolean GLX11;
    public final boolean GLX12;
    public final boolean GLX13;
    public final boolean GLX14;
    public final boolean GLX_AMD_gpu_association;
    public final boolean GLX_ARB_context_flush_control;
    public final boolean GLX_ARB_create_context;
    public final boolean GLX_ARB_create_context_no_error;
    public final boolean GLX_ARB_create_context_profile;
    public final boolean GLX_ARB_create_context_robustness;
    public final boolean GLX_ARB_fbconfig_float;
    public final boolean GLX_ARB_framebuffer_sRGB;
    public final boolean GLX_ARB_get_proc_address;
    public final boolean GLX_ARB_multisample;
    public final boolean GLX_ARB_robustness_application_isolation;
    public final boolean GLX_ARB_robustness_share_group_isolation;
    public final boolean GLX_ARB_vertex_buffer_object;
    public final boolean GLX_EXT_buffer_age;
    public final boolean GLX_EXT_context_priority;
    public final boolean GLX_EXT_create_context_es2_profile;
    public final boolean GLX_EXT_create_context_es_profile;
    public final boolean GLX_EXT_fbconfig_packed_float;
    public final boolean GLX_EXT_framebuffer_sRGB;
    public final boolean GLX_EXT_get_drawable_type;
    public final boolean GLX_EXT_import_context;
    public final boolean GLX_EXT_no_config_context;
    public final boolean GLX_EXT_stereo_tree;
    public final boolean GLX_EXT_swap_control;
    public final boolean GLX_EXT_swap_control_tear;
    public final boolean GLX_EXT_texture_from_pixmap;
    public final boolean GLX_EXT_visual_info;
    public final boolean GLX_EXT_visual_rating;
    public final boolean GLX_INTEL_swap_event;
    public final boolean GLX_NV_copy_buffer;
    public final boolean GLX_NV_copy_image;
    public final boolean GLX_NV_delay_before_swap;
    public final boolean GLX_NV_float_buffer;
    public final boolean GLX_NV_multigpu_context;
    public final boolean GLX_NV_multisample_coverage;
    public final boolean GLX_NV_robustness_video_memory_purge;
    public final boolean GLX_NV_swap_group;
    public final boolean GLX_SGI_make_current_read;
    public final boolean GLX_SGI_swap_control;
    public final boolean GLX_SGI_video_sync;
    public final boolean GLX_SGIX_fbconfig;
    public final boolean GLX_SGIX_pbuffer;
    public final boolean GLX_SGIX_swap_barrier;
    public final boolean GLX_SGIX_swap_group;

    GLXCapabilities(org.lwjgl.system.FunctionProvider r6, java.util.Set<java.lang.String> r7) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = 69
            long[] r0 = new long[r0]
            r8 = r0
            r0 = r5
            r1 = r6
            r2 = r8
            r3 = r7
            boolean r1 = check_GLX11(r1, r2, r3)
            r0.GLX11 = r1
            r0 = r5
            r1 = r6
            r2 = r8
            r3 = r7
            boolean r1 = check_GLX12(r1, r2, r3)
            r0.GLX12 = r1
            r0 = r5
            r1 = r6
            r2 = r8
            r3 = r7
            boolean r1 = check_GLX13(r1, r2, r3)
            r0.GLX13 = r1
            r0 = r5
            r1 = r6
            r2 = r8
            r3 = r7
            boolean r1 = check_GLX14(r1, r2, r3)
            r0.GLX14 = r1
            r0 = r5
            r1 = r6
            r2 = r8
            r3 = r7
            boolean r1 = check_GLX_AMD_gpu_association(r1, r2, r3)
            r0.GLX_AMD_gpu_association = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "GLX_ARB_context_flush_control"
            boolean r1 = r1.contains(r2)
            r0.GLX_ARB_context_flush_control = r1
            r0 = r5
            r1 = r6
            r2 = r8
            r3 = r7
            boolean r1 = check_GLX_ARB_create_context(r1, r2, r3)
            r0.GLX_ARB_create_context = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "GLX_ARB_create_context_no_error"
            boolean r1 = r1.contains(r2)
            r0.GLX_ARB_create_context_no_error = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "GLX_ARB_create_context_profile"
            boolean r1 = r1.contains(r2)
            r0.GLX_ARB_create_context_profile = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "GLX_ARB_create_context_robustness"
            boolean r1 = r1.contains(r2)
            r0.GLX_ARB_create_context_robustness = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "GLX_ARB_fbconfig_float"
            boolean r1 = r1.contains(r2)
            r0.GLX_ARB_fbconfig_float = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "GLX_ARB_framebuffer_sRGB"
            boolean r1 = r1.contains(r2)
            r0.GLX_ARB_framebuffer_sRGB = r1
            r0 = r5
            r1 = r6
            r2 = r8
            r3 = r7
            boolean r1 = check_GLX_ARB_get_proc_address(r1, r2, r3)
            r0.GLX_ARB_get_proc_address = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "GLX_ARB_multisample"
            boolean r1 = r1.contains(r2)
            r0.GLX_ARB_multisample = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "GLX_ARB_robustness_application_isolation"
            boolean r1 = r1.contains(r2)
            r0.GLX_ARB_robustness_application_isolation = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "GLX_ARB_robustness_share_group_isolation"
            boolean r1 = r1.contains(r2)
            r0.GLX_ARB_robustness_share_group_isolation = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "GLX_ARB_vertex_buffer_object"
            boolean r1 = r1.contains(r2)
            r0.GLX_ARB_vertex_buffer_object = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "GLX_EXT_buffer_age"
            boolean r1 = r1.contains(r2)
            r0.GLX_EXT_buffer_age = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "GLX_EXT_context_priority"
            boolean r1 = r1.contains(r2)
            r0.GLX_EXT_context_priority = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "GLX_EXT_create_context_es2_profile"
            boolean r1 = r1.contains(r2)
            r0.GLX_EXT_create_context_es2_profile = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "GLX_EXT_create_context_es_profile"
            boolean r1 = r1.contains(r2)
            r0.GLX_EXT_create_context_es_profile = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "GLX_EXT_fbconfig_packed_float"
            boolean r1 = r1.contains(r2)
            r0.GLX_EXT_fbconfig_packed_float = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "GLX_EXT_framebuffer_sRGB"
            boolean r1 = r1.contains(r2)
            r0.GLX_EXT_framebuffer_sRGB = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "GLX_EXT_get_drawable_type"
            boolean r1 = r1.contains(r2)
            r0.GLX_EXT_get_drawable_type = r1
            r0 = r5
            r1 = r6
            r2 = r8
            r3 = r7
            boolean r1 = check_GLX_EXT_import_context(r1, r2, r3)
            r0.GLX_EXT_import_context = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "GLX_EXT_no_config_context"
            boolean r1 = r1.contains(r2)
            r0.GLX_EXT_no_config_context = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "GLX_EXT_stereo_tree"
            boolean r1 = r1.contains(r2)
            r0.GLX_EXT_stereo_tree = r1
            r0 = r5
            r1 = r6
            r2 = r8
            r3 = r7
            boolean r1 = check_GLX_EXT_swap_control(r1, r2, r3)
            r0.GLX_EXT_swap_control = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "GLX_EXT_swap_control_tear"
            boolean r1 = r1.contains(r2)
            r0.GLX_EXT_swap_control_tear = r1
            r0 = r5
            r1 = r6
            r2 = r8
            r3 = r7
            boolean r1 = check_GLX_EXT_texture_from_pixmap(r1, r2, r3)
            r0.GLX_EXT_texture_from_pixmap = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "GLX_EXT_visual_info"
            boolean r1 = r1.contains(r2)
            r0.GLX_EXT_visual_info = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "GLX_EXT_visual_rating"
            boolean r1 = r1.contains(r2)
            r0.GLX_EXT_visual_rating = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "GLX_INTEL_swap_event"
            boolean r1 = r1.contains(r2)
            r0.GLX_INTEL_swap_event = r1
            r0 = r5
            r1 = r6
            r2 = r8
            r3 = r7
            boolean r1 = check_GLX_NV_copy_buffer(r1, r2, r3)
            r0.GLX_NV_copy_buffer = r1
            r0 = r5
            r1 = r6
            r2 = r8
            r3 = r7
            boolean r1 = check_GLX_NV_copy_image(r1, r2, r3)
            r0.GLX_NV_copy_image = r1
            r0 = r5
            r1 = r6
            r2 = r8
            r3 = r7
            boolean r1 = check_GLX_NV_delay_before_swap(r1, r2, r3)
            r0.GLX_NV_delay_before_swap = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "GLX_NV_float_buffer"
            boolean r1 = r1.contains(r2)
            r0.GLX_NV_float_buffer = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "GLX_NV_multigpu_context"
            boolean r1 = r1.contains(r2)
            r0.GLX_NV_multigpu_context = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "GLX_NV_multisample_coverage"
            boolean r1 = r1.contains(r2)
            r0.GLX_NV_multisample_coverage = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "GLX_NV_robustness_video_memory_purge"
            boolean r1 = r1.contains(r2)
            r0.GLX_NV_robustness_video_memory_purge = r1
            r0 = r5
            r1 = r6
            r2 = r8
            r3 = r7
            boolean r1 = check_GLX_NV_swap_group(r1, r2, r3)
            r0.GLX_NV_swap_group = r1
            r0 = r5
            r1 = r6
            r2 = r8
            r3 = r7
            boolean r1 = check_GLX_SGI_make_current_read(r1, r2, r3)
            r0.GLX_SGI_make_current_read = r1
            r0 = r5
            r1 = r6
            r2 = r8
            r3 = r7
            boolean r1 = check_GLX_SGI_swap_control(r1, r2, r3)
            r0.GLX_SGI_swap_control = r1
            r0 = r5
            r1 = r6
            r2 = r8
            r3 = r7
            boolean r1 = check_GLX_SGI_video_sync(r1, r2, r3)
            r0.GLX_SGI_video_sync = r1
            r0 = r5
            r1 = r6
            r2 = r8
            r3 = r7
            boolean r1 = check_GLX_SGIX_fbconfig(r1, r2, r3)
            r0.GLX_SGIX_fbconfig = r1
            r0 = r5
            r1 = r6
            r2 = r8
            r3 = r7
            boolean r1 = check_GLX_SGIX_pbuffer(r1, r2, r3)
            r0.GLX_SGIX_pbuffer = r1
            r0 = r5
            r1 = r6
            r2 = r8
            r3 = r7
            boolean r1 = check_GLX_SGIX_swap_barrier(r1, r2, r3)
            r0.GLX_SGIX_swap_barrier = r1
            r0 = r5
            r1 = r6
            r2 = r8
            r3 = r7
            boolean r1 = check_GLX_SGIX_swap_group(r1, r2, r3)
            r0.GLX_SGIX_swap_group = r1
            r0 = r5
            r1 = r8
            r2 = 0
            r1 = r1[r2]
            r0.glXQueryExtensionsString = r1
            r0 = r5
            r1 = r8
            r2 = 1
            r1 = r1[r2]
            r0.glXGetClientString = r1
            r0 = r5
            r1 = r8
            r2 = 2
            r1 = r1[r2]
            r0.glXQueryServerString = r1
            r0 = r5
            r1 = r8
            r2 = 3
            r1 = r1[r2]
            r0.glXGetCurrentDisplay = r1
            r0 = r5
            r1 = r8
            r2 = 4
            r1 = r1[r2]
            r0.glXGetFBConfigs = r1
            r0 = r5
            r1 = r8
            r2 = 5
            r1 = r1[r2]
            r0.glXChooseFBConfig = r1
            r0 = r5
            r1 = r8
            r2 = 6
            r1 = r1[r2]
            r0.glXGetFBConfigAttrib = r1
            r0 = r5
            r1 = r8
            r2 = 7
            r1 = r1[r2]
            r0.glXGetVisualFromFBConfig = r1
            r0 = r5
            r1 = r8
            r2 = 8
            r1 = r1[r2]
            r0.glXCreateWindow = r1
            r0 = r5
            r1 = r8
            r2 = 9
            r1 = r1[r2]
            r0.glXCreatePixmap = r1
            r0 = r5
            r1 = r8
            r2 = 10
            r1 = r1[r2]
            r0.glXDestroyPixmap = r1
            r0 = r5
            r1 = r8
            r2 = 11
            r1 = r1[r2]
            r0.glXCreatePbuffer = r1
            r0 = r5
            r1 = r8
            r2 = 12
            r1 = r1[r2]
            r0.glXDestroyPbuffer = r1
            r0 = r5
            r1 = r8
            r2 = 13
            r1 = r1[r2]
            r0.glXQueryDrawable = r1
            r0 = r5
            r1 = r8
            r2 = 14
            r1 = r1[r2]
            r0.glXCreateNewContext = r1
            r0 = r5
            r1 = r8
            r2 = 15
            r1 = r1[r2]
            r0.glXMakeContextCurrent = r1
            r0 = r5
            r1 = r8
            r2 = 16
            r1 = r1[r2]
            r0.glXGetCurrentReadDrawable = r1
            r0 = r5
            r1 = r8
            r2 = 17
            r1 = r1[r2]
            r0.glXQueryContext = r1
            r0 = r5
            r1 = r8
            r2 = 18
            r1 = r1[r2]
            r0.glXSelectEvent = r1
            r0 = r5
            r1 = r8
            r2 = 19
            r1 = r1[r2]
            r0.glXGetSelectedEvent = r1
            r0 = r5
            r1 = r8
            r2 = 20
            r1 = r1[r2]
            r0.glXGetProcAddress = r1
            r0 = r5
            r1 = r8
            r2 = 21
            r1 = r1[r2]
            r0.glXBlitContextFramebufferAMD = r1
            r0 = r5
            r1 = r8
            r2 = 22
            r1 = r1[r2]
            r0.glXCreateAssociatedContextAMD = r1
            r0 = r5
            r1 = r8
            r2 = 23
            r1 = r1[r2]
            r0.glXCreateAssociatedContextAttribsAMD = r1
            r0 = r5
            r1 = r8
            r2 = 24
            r1 = r1[r2]
            r0.glXDeleteAssociatedContextAMD = r1
            r0 = r5
            r1 = r8
            r2 = 25
            r1 = r1[r2]
            r0.glXGetContextGPUIDAMD = r1
            r0 = r5
            r1 = r8
            r2 = 26
            r1 = r1[r2]
            r0.glXGetCurrentAssociatedContextAMD = r1
            r0 = r5
            r1 = r8
            r2 = 27
            r1 = r1[r2]
            r0.glXGetGPUIDsAMD = r1
            r0 = r5
            r1 = r8
            r2 = 28
            r1 = r1[r2]
            r0.glXGetGPUInfoAMD = r1
            r0 = r5
            r1 = r8
            r2 = 29
            r1 = r1[r2]
            r0.glXMakeAssociatedContextCurrentAMD = r1
            r0 = r5
            r1 = r8
            r2 = 30
            r1 = r1[r2]
            r0.glXCreateContextAttribsARB = r1
            r0 = r5
            r1 = r8
            r2 = 31
            r1 = r1[r2]
            r0.glXGetProcAddressARB = r1
            r0 = r5
            r1 = r8
            r2 = 32
            r1 = r1[r2]
            r0.glXGetCurrentDisplayEXT = r1
            r0 = r5
            r1 = r8
            r2 = 33
            r1 = r1[r2]
            r0.glXQueryContextInfoEXT = r1
            r0 = r5
            r1 = r8
            r2 = 34
            r1 = r1[r2]
            r0.glXGetContextIDEXT = r1
            r0 = r5
            r1 = r8
            r2 = 35
            r1 = r1[r2]
            r0.glXImportContextEXT = r1
            r0 = r5
            r1 = r8
            r2 = 36
            r1 = r1[r2]
            r0.glXFreeContextEXT = r1
            r0 = r5
            r1 = r8
            r2 = 37
            r1 = r1[r2]
            r0.glXSwapIntervalEXT = r1
            r0 = r5
            r1 = r8
            r2 = 38
            r1 = r1[r2]
            r0.glXBindTexImageEXT = r1
            r0 = r5
            r1 = r8
            r2 = 39
            r1 = r1[r2]
            r0.glXReleaseTexImageEXT = r1
            r0 = r5
            r1 = r8
            r2 = 40
            r1 = r1[r2]
            r0.glXCopyBufferSubDataNV = r1
            r0 = r5
            r1 = r8
            r2 = 41
            r1 = r1[r2]
            r0.glXNamedCopyBufferSubDataNV = r1
            r0 = r5
            r1 = r8
            r2 = 42
            r1 = r1[r2]
            r0.glXCopyImageSubDataNV = r1
            r0 = r5
            r1 = r8
            r2 = 43
            r1 = r1[r2]
            r0.glXDelayBeforeSwapNV = r1
            r0 = r5
            r1 = r8
            r2 = 44
            r1 = r1[r2]
            r0.glXJoinSwapGroupNV = r1
            r0 = r5
            r1 = r8
            r2 = 45
            r1 = r1[r2]
            r0.glXBindSwapBarrierNV = r1
            r0 = r5
            r1 = r8
            r2 = 46
            r1 = r1[r2]
            r0.glXQuerySwapGroupNV = r1
            r0 = r5
            r1 = r8
            r2 = 47
            r1 = r1[r2]
            r0.glXQueryMaxSwapGroupsNV = r1
            r0 = r5
            r1 = r8
            r2 = 48
            r1 = r1[r2]
            r0.glXQueryFrameCountNV = r1
            r0 = r5
            r1 = r8
            r2 = 49
            r1 = r1[r2]
            r0.glXResetFrameCountNV = r1
            r0 = r5
            r1 = r8
            r2 = 50
            r1 = r1[r2]
            r0.glXMakeCurrentReadSGI = r1
            r0 = r5
            r1 = r8
            r2 = 51
            r1 = r1[r2]
            r0.glXGetCurrentReadDrawableSGI = r1
            r0 = r5
            r1 = r8
            r2 = 52
            r1 = r1[r2]
            r0.glXSwapIntervalSGI = r1
            r0 = r5
            r1 = r8
            r2 = 53
            r1 = r1[r2]
            r0.glXGetVideoSyncSGI = r1
            r0 = r5
            r1 = r8
            r2 = 54
            r1 = r1[r2]
            r0.glXWaitVideoSyncSGI = r1
            r0 = r5
            r1 = r8
            r2 = 55
            r1 = r1[r2]
            r0.glXGetFBConfigAttribSGIX = r1
            r0 = r5
            r1 = r8
            r2 = 56
            r1 = r1[r2]
            r0.glXChooseFBConfigSGIX = r1
            r0 = r5
            r1 = r8
            r2 = 57
            r1 = r1[r2]
            r0.glXCreateGLXPixmapWithConfigSGIX = r1
            r0 = r5
            r1 = r8
            r2 = 58
            r1 = r1[r2]
            r0.glXCreateContextWithConfigSGIX = r1
            r0 = r5
            r1 = r8
            r2 = 59
            r1 = r1[r2]
            r0.glXGetVisualFromFBConfigSGIX = r1
            r0 = r5
            r1 = r8
            r2 = 60
            r1 = r1[r2]
            r0.glXGetFBConfigFromVisualSGIX = r1
            r0 = r5
            r1 = r8
            r2 = 61
            r1 = r1[r2]
            r0.glXCreateGLXPbufferSGIX = r1
            r0 = r5
            r1 = r8
            r2 = 62
            r1 = r1[r2]
            r0.glXDestroyGLXPbufferSGIX = r1
            r0 = r5
            r1 = r8
            r2 = 63
            r1 = r1[r2]
            r0.glXQueryGLXPbufferSGIX = r1
            r0 = r5
            r1 = r8
            r2 = 64
            r1 = r1[r2]
            r0.glXSelectEventSGIX = r1
            r0 = r5
            r1 = r8
            r2 = 65
            r1 = r1[r2]
            r0.glXGetSelectedEventSGIX = r1
            r0 = r5
            r1 = r8
            r2 = 66
            r1 = r1[r2]
            r0.glXBindSwapBarrierSGIX = r1
            r0 = r5
            r1 = r8
            r2 = 67
            r1 = r1[r2]
            r0.glXQueryMaxSwapBarriersSGIX = r1
            r0 = r5
            r1 = r8
            r2 = 68
            r1 = r1[r2]
            r0.glXJoinSwapGroupSGIX = r1
            return
    }

    private static boolean check_GLX11(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "GLX11"
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
            r3 = 3
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "glXQueryExtensionsString"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "glXGetClientString"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "glXQueryServerString"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L41
            java.lang.String r0 = "GLX"
            java.lang.String r1 = "GLX11"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L45
        L41:
            r0 = 1
            goto L46
        L45:
            r0 = 0
        L46:
            return r0
    }

    private static boolean check_GLX12(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "GLX12"
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
            r5 = 3
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "glXGetCurrentDisplay"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L2f
            java.lang.String r0 = "GLX"
            java.lang.String r1 = "GLX12"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L33
        L2f:
            r0 = 1
            goto L34
        L33:
            r0 = 0
        L34:
            return r0
    }

    private static boolean check_GLX13(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "GLX13"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = r8
            r1 = r9
            r2 = 16
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 4
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 5
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 6
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 7
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = 8
            r3[r4] = r5
            r3 = r2
            r4 = 5
            r5 = 9
            r3[r4] = r5
            r3 = r2
            r4 = 6
            r5 = 10
            r3[r4] = r5
            r3 = r2
            r4 = 7
            r5 = 11
            r3[r4] = r5
            r3 = r2
            r4 = 8
            r5 = 12
            r3[r4] = r5
            r3 = r2
            r4 = 9
            r5 = 13
            r3[r4] = r5
            r3 = r2
            r4 = 10
            r5 = 14
            r3[r4] = r5
            r3 = r2
            r4 = 11
            r5 = 15
            r3[r4] = r5
            r3 = r2
            r4 = 12
            r5 = 16
            r3[r4] = r5
            r3 = r2
            r4 = 13
            r5 = 17
            r3[r4] = r5
            r3 = r2
            r4 = 14
            r5 = 18
            r3[r4] = r5
            r3 = r2
            r4 = 15
            r5 = 19
            r3[r4] = r5
            r3 = 16
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "glXGetFBConfigs"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "glXChooseFBConfig"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "glXGetFBConfigAttrib"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "glXGetVisualFromFBConfig"
            r4[r5] = r6
            r4 = r3
            r5 = 4
            java.lang.String r6 = "glXCreateWindow"
            r4[r5] = r6
            r4 = r3
            r5 = 5
            java.lang.String r6 = "glXCreatePixmap"
            r4[r5] = r6
            r4 = r3
            r5 = 6
            java.lang.String r6 = "glXDestroyPixmap"
            r4[r5] = r6
            r4 = r3
            r5 = 7
            java.lang.String r6 = "glXCreatePbuffer"
            r4[r5] = r6
            r4 = r3
            r5 = 8
            java.lang.String r6 = "glXDestroyPbuffer"
            r4[r5] = r6
            r4 = r3
            r5 = 9
            java.lang.String r6 = "glXQueryDrawable"
            r4[r5] = r6
            r4 = r3
            r5 = 10
            java.lang.String r6 = "glXCreateNewContext"
            r4[r5] = r6
            r4 = r3
            r5 = 11
            java.lang.String r6 = "glXMakeContextCurrent"
            r4[r5] = r6
            r4 = r3
            r5 = 12
            java.lang.String r6 = "glXGetCurrentReadDrawable"
            r4[r5] = r6
            r4 = r3
            r5 = 13
            java.lang.String r6 = "glXQueryContext"
            r4[r5] = r6
            r4 = r3
            r5 = 14
            java.lang.String r6 = "glXSelectEvent"
            r4[r5] = r6
            r4 = r3
            r5 = 15
            java.lang.String r6 = "glXGetSelectedEvent"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto Lda
            java.lang.String r0 = "GLX"
            java.lang.String r1 = "GLX13"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto Lde
        Lda:
            r0 = 1
            goto Ldf
        Lde:
            r0 = 0
        Ldf:
            return r0
    }

    private static boolean check_GLX14(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "GLX14"
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
            r5 = 20
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "glXGetProcAddress"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L30
            java.lang.String r0 = "GLX"
            java.lang.String r1 = "GLX14"
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

    private static boolean check_GLX_AMD_gpu_association(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "GLX_AMD_gpu_association"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = r8
            r1 = r9
            r2 = 9
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 21
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 22
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 23
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 24
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = 25
            r3[r4] = r5
            r3 = r2
            r4 = 5
            r5 = 26
            r3[r4] = r5
            r3 = r2
            r4 = 6
            r5 = 27
            r3[r4] = r5
            r3 = r2
            r4 = 7
            r5 = 28
            r3[r4] = r5
            r3 = r2
            r4 = 8
            r5 = 29
            r3[r4] = r5
            r3 = 9
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "glXBlitContextFramebufferAMD"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "glXCreateAssociatedContextAMD"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "glXCreateAssociatedContextAttribsAMD"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "glXDeleteAssociatedContextAMD"
            r4[r5] = r6
            r4 = r3
            r5 = 4
            java.lang.String r6 = "glXGetContextGPUIDAMD"
            r4[r5] = r6
            r4 = r3
            r5 = 5
            java.lang.String r6 = "glXGetCurrentAssociatedContextAMD"
            r4[r5] = r6
            r4 = r3
            r5 = 6
            java.lang.String r6 = "glXGetGPUIDsAMD"
            r4[r5] = r6
            r4 = r3
            r5 = 7
            java.lang.String r6 = "glXGetGPUInfoAMD"
            r4[r5] = r6
            r4 = r3
            r5 = 8
            java.lang.String r6 = "glXMakeAssociatedContextCurrentAMD"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L88
            java.lang.String r0 = "GLX"
            java.lang.String r1 = "GLX_AMD_gpu_association"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L8c
        L88:
            r0 = 1
            goto L8d
        L8c:
            r0 = 0
        L8d:
            return r0
    }

    private static boolean check_GLX_ARB_create_context(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "GLX_ARB_create_context"
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
            r5 = 30
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "glXCreateContextAttribsARB"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L30
            java.lang.String r0 = "GLX"
            java.lang.String r1 = "GLX_ARB_create_context"
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

    private static boolean check_GLX_ARB_get_proc_address(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "GLX_ARB_get_proc_address"
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
            java.lang.String r6 = "glXGetProcAddressARB"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L30
            java.lang.String r0 = "GLX"
            java.lang.String r1 = "GLX_ARB_get_proc_address"
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

    private static boolean check_GLX_EXT_import_context(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "GLX_EXT_import_context"
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
            r5 = 32
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 33
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 34
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 35
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = 36
            r3[r4] = r5
            r3 = 5
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "glXGetCurrentDisplayEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "glXQueryContextInfoEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "glXGetContextIDEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "glXImportContextEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 4
            java.lang.String r6 = "glXFreeContextEXT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L58
            java.lang.String r0 = "GLX"
            java.lang.String r1 = "GLX_EXT_import_context"
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

    private static boolean check_GLX_EXT_swap_control(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "GLX_EXT_swap_control"
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
            r5 = 37
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "glXSwapIntervalEXT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L30
            java.lang.String r0 = "GLX"
            java.lang.String r1 = "GLX_EXT_swap_control"
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

    private static boolean check_GLX_EXT_texture_from_pixmap(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "GLX_EXT_texture_from_pixmap"
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
            r5 = 38
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 39
            r3[r4] = r5
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "glXBindTexImageEXT"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "glXReleaseTexImageEXT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L3a
            java.lang.String r0 = "GLX"
            java.lang.String r1 = "GLX_EXT_texture_from_pixmap"
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

    private static boolean check_GLX_NV_copy_buffer(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "GLX_NV_copy_buffer"
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
            r5 = 40
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 41
            r3[r4] = r5
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "glXCopyBufferSubDataNV"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "glXNamedCopyBufferSubDataNV"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L3a
            java.lang.String r0 = "GLX"
            java.lang.String r1 = "GLX_NV_copy_buffer"
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

    private static boolean check_GLX_NV_copy_image(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "GLX_NV_copy_image"
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
            r5 = 42
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "glXCopyImageSubDataNV"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L30
            java.lang.String r0 = "GLX"
            java.lang.String r1 = "GLX_NV_copy_image"
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

    private static boolean check_GLX_NV_delay_before_swap(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "GLX_NV_delay_before_swap"
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
            r5 = 43
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "glXDelayBeforeSwapNV"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L30
            java.lang.String r0 = "GLX"
            java.lang.String r1 = "GLX_NV_delay_before_swap"
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

    private static boolean check_GLX_NV_swap_group(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "GLX_NV_swap_group"
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
            r5 = 44
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 45
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 46
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 47
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = 48
            r3[r4] = r5
            r3 = r2
            r4 = 5
            r5 = 49
            r3[r4] = r5
            r3 = 6
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "glXJoinSwapGroupNV"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "glXBindSwapBarrierNV"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "glXQuerySwapGroupNV"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "glXQueryMaxSwapGroupsNV"
            r4[r5] = r6
            r4 = r3
            r5 = 4
            java.lang.String r6 = "glXQueryFrameCountNV"
            r4[r5] = r6
            r4 = r3
            r5 = 5
            java.lang.String r6 = "glXResetFrameCountNV"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L64
            java.lang.String r0 = "GLX"
            java.lang.String r1 = "GLX_NV_swap_group"
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

    private static boolean check_GLX_SGI_make_current_read(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "GLX_SGI_make_current_read"
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
            r5 = 50
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 51
            r3[r4] = r5
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "glXMakeCurrentReadSGI"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "glXGetCurrentReadDrawableSGI"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L3a
            java.lang.String r0 = "GLX"
            java.lang.String r1 = "GLX_SGI_make_current_read"
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

    private static boolean check_GLX_SGI_swap_control(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "GLX_SGI_swap_control"
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
            r5 = 52
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "glXSwapIntervalSGI"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L30
            java.lang.String r0 = "GLX"
            java.lang.String r1 = "GLX_SGI_swap_control"
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

    private static boolean check_GLX_SGI_video_sync(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "GLX_SGI_video_sync"
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
            r5 = 53
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 54
            r3[r4] = r5
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "glXGetVideoSyncSGI"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "glXWaitVideoSyncSGI"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L3a
            java.lang.String r0 = "GLX"
            java.lang.String r1 = "GLX_SGI_video_sync"
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

    private static boolean check_GLX_SGIX_fbconfig(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "GLX_SGIX_fbconfig"
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
            r5 = 55
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 56
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 57
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 58
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = 59
            r3[r4] = r5
            r3 = r2
            r4 = 5
            r5 = 60
            r3[r4] = r5
            r3 = 6
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "glXGetFBConfigAttribSGIX"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "glXChooseFBConfigSGIX"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "glXCreateGLXPixmapWithConfigSGIX"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "glXCreateContextWithConfigSGIX"
            r4[r5] = r6
            r4 = r3
            r5 = 4
            java.lang.String r6 = "glXGetVisualFromFBConfigSGIX"
            r4[r5] = r6
            r4 = r3
            r5 = 5
            java.lang.String r6 = "glXGetFBConfigFromVisualSGIX"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L64
            java.lang.String r0 = "GLX"
            java.lang.String r1 = "GLX_SGIX_fbconfig"
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

    private static boolean check_GLX_SGIX_pbuffer(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "GLX_SGIX_pbuffer"
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
            r5 = 61
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 62
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 63
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 64
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = 65
            r3[r4] = r5
            r3 = 5
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "glXCreateGLXPbufferSGIX"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "glXDestroyGLXPbufferSGIX"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "glXQueryGLXPbufferSGIX"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "glXSelectEventSGIX"
            r4[r5] = r6
            r4 = r3
            r5 = 4
            java.lang.String r6 = "glXGetSelectedEventSGIX"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L59
            java.lang.String r0 = "GLX"
            java.lang.String r1 = "GLX_SGIX_pbuffer"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L5d
        L59:
            r0 = 1
            goto L5e
        L5d:
            r0 = 0
        L5e:
            return r0
    }

    private static boolean check_GLX_SGIX_swap_barrier(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "GLX_SGIX_swap_barrier"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 2
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 66
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 67
            r3[r4] = r5
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "glXBindSwapBarrierSGIX"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "glXQueryMaxSwapBarriersSGIX"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L3e
            java.lang.String r0 = "GLX"
            java.lang.String r1 = "GLX_SGIX_swap_barrier"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L42
        L3e:
            r0 = 1
            goto L43
        L42:
            r0 = 0
        L43:
            return r0
    }

    private static boolean check_GLX_SGIX_swap_group(org.lwjgl.system.FunctionProvider r8, long[] r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "GLX_SGIX_swap_group"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 68
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "glXJoinSwapGroupSGIX"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L33
            java.lang.String r0 = "GLX"
            java.lang.String r1 = "GLX_SGIX_swap_group"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L37
        L33:
            r0 = 1
            goto L38
        L37:
            r0 = 0
        L38:
            return r0
    }
}
