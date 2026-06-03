package org.lwjgl.util.shaderc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/shaderc/GLSLangResourceLimits.class */
public class GLSLangResourceLimits {
    private static final org.lwjgl.system.SharedLibrary SHADERC = null;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/shaderc/GLSLangResourceLimits$Functions.class */
    public static final class Functions {
        public static final long resource = 0;
        public static final long default_resource = 0;
        public static final long default_resource_string = 0;
        public static final long decode_resource_limits = 0;

        private Functions() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static {
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLangResourceLimits.access$000()
                java.lang.String r1 = "glslang_resource"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLangResourceLimits.Functions.resource = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLangResourceLimits.access$000()
                java.lang.String r1 = "glslang_default_resource"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLangResourceLimits.Functions.default_resource = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLangResourceLimits.access$000()
                java.lang.String r1 = "glslang_default_resource_string"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLangResourceLimits.Functions.default_resource_string = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLangResourceLimits.access$000()
                java.lang.String r1 = "glslang_decode_resource_limits"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLangResourceLimits.Functions.decode_resource_limits = r0
                return
        }
    }

    public static org.lwjgl.system.SharedLibrary getLibrary() {
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLangResourceLimits.SHADERC
            return r0
    }

    protected GLSLangResourceLimits() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static long nglslang_resource() {
            long r0 = org.lwjgl.util.shaderc.GLSLangResourceLimits.Functions.resource
            r3 = r0
            r0 = r3
            long r0 = org.lwjgl.system.JNI.invokeP(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("glslang_resource_t *")
    public static org.lwjgl.util.shaderc.GLSLangResource glslang_resource() {
            long r0 = nglslang_resource()
            r3 = r0
            r0 = r3
            org.lwjgl.util.shaderc.GLSLangResource r0 = org.lwjgl.util.shaderc.GLSLangResource.createSafe(r0)
            return r0
    }

    public static long nglslang_default_resource() {
            long r0 = org.lwjgl.util.shaderc.GLSLangResourceLimits.Functions.default_resource
            r3 = r0
            r0 = r3
            long r0 = org.lwjgl.system.JNI.invokeP(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("glslang_resource_t const *")
    public static org.lwjgl.util.shaderc.GLSLangResource glslang_default_resource() {
            long r0 = nglslang_default_resource()
            r3 = r0
            r0 = r3
            org.lwjgl.util.shaderc.GLSLangResource r0 = org.lwjgl.util.shaderc.GLSLangResource.createSafe(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("const char *")
    public static long glslang_default_resource_string() {
            long r0 = org.lwjgl.util.shaderc.GLSLangResourceLimits.Functions.default_resource_string
            r3 = r0
            r0 = r3
            long r0 = org.lwjgl.system.JNI.invokeP(r0)
            return r0
    }

    public static void nglslang_decode_resource_limits(long r7, long r9) {
            long r0 = org.lwjgl.util.shaderc.GLSLangResourceLimits.Functions.decode_resource_limits
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2)
            return
    }

    public static void glslang_decode_resource_limits(@org.lwjgl.system.NativeType("glslang_resource_t *") org.lwjgl.util.shaderc.GLSLangResource r5, @org.lwjgl.system.NativeType("char *") java.nio.ByteBuffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r6
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglslang_decode_resource_limits(r0, r1)
            return
    }

    static /* synthetic */ org.lwjgl.system.SharedLibrary access$000() {
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLangResourceLimits.SHADERC
            return r0
    }

    static {
            java.lang.Class<org.lwjgl.util.shaderc.GLSLangResourceLimits> r0 = org.lwjgl.util.shaderc.GLSLangResourceLimits.class
            java.lang.String r1 = "org.lwjgl.shaderc"
            org.lwjgl.system.Configuration r2 = org.lwjgl.system.Configuration.GLSLANG_RESOURCE_LIBRARY_NAME
            void r3 = org.lwjgl.util.shaderc.Shaderc::getLibrary
            r4 = 0
            java.lang.String[] r4 = new java.lang.String[r4]
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.Library.loadNative(r0, r1, r2, r3, r4)
            org.lwjgl.util.shaderc.GLSLangResourceLimits.SHADERC = r0
            return
    }
}
