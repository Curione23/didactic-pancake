package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVMeshShader.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVMeshShader.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVMeshShader.class */
public class NVMeshShader {
    public static final int GL_MESH_SHADER_NV = 38233;
    public static final int GL_TASK_SHADER_NV = 38234;
    public static final int GL_MAX_MESH_UNIFORM_BLOCKS_NV = 36448;
    public static final int GL_MAX_MESH_TEXTURE_IMAGE_UNITS_NV = 36449;
    public static final int GL_MAX_MESH_IMAGE_UNIFORMS_NV = 36450;
    public static final int GL_MAX_MESH_UNIFORM_COMPONENTS_NV = 36451;
    public static final int GL_MAX_MESH_ATOMIC_COUNTER_BUFFERS_NV = 36452;
    public static final int GL_MAX_MESH_ATOMIC_COUNTERS_NV = 36453;
    public static final int GL_MAX_MESH_SHADER_STORAGE_BLOCKS_NV = 36454;
    public static final int GL_MAX_COMBINED_MESH_UNIFORM_COMPONENTS_NV = 36455;
    public static final int GL_MAX_TASK_UNIFORM_BLOCKS_NV = 36456;
    public static final int GL_MAX_TASK_TEXTURE_IMAGE_UNITS_NV = 36457;
    public static final int GL_MAX_TASK_IMAGE_UNIFORMS_NV = 36458;
    public static final int GL_MAX_TASK_UNIFORM_COMPONENTS_NV = 36459;
    public static final int GL_MAX_TASK_ATOMIC_COUNTER_BUFFERS_NV = 36460;
    public static final int GL_MAX_TASK_ATOMIC_COUNTERS_NV = 36461;
    public static final int GL_MAX_TASK_SHADER_STORAGE_BLOCKS_NV = 36462;
    public static final int GL_MAX_COMBINED_TASK_UNIFORM_COMPONENTS_NV = 36463;
    public static final int GL_MAX_MESH_WORK_GROUP_INVOCATIONS_NV = 38306;
    public static final int GL_MAX_TASK_WORK_GROUP_INVOCATIONS_NV = 38307;
    public static final int GL_MAX_MESH_TOTAL_MEMORY_SIZE_NV = 38198;
    public static final int GL_MAX_TASK_TOTAL_MEMORY_SIZE_NV = 38199;
    public static final int GL_MAX_MESH_OUTPUT_VERTICES_NV = 38200;
    public static final int GL_MAX_MESH_OUTPUT_PRIMITIVES_NV = 38201;
    public static final int GL_MAX_TASK_OUTPUT_COUNT_NV = 38202;
    public static final int GL_MAX_DRAW_MESH_TASKS_COUNT_NV = 38205;
    public static final int GL_MAX_MESH_VIEWS_NV = 38231;
    public static final int GL_MESH_OUTPUT_PER_VERTEX_GRANULARITY_NV = 37599;
    public static final int GL_MESH_OUTPUT_PER_PRIMITIVE_GRANULARITY_NV = 38211;
    public static final int GL_MAX_MESH_WORK_GROUP_SIZE_NV = 38203;
    public static final int GL_MAX_TASK_WORK_GROUP_SIZE_NV = 38204;
    public static final int GL_MESH_WORK_GROUP_SIZE_NV = 38206;
    public static final int GL_TASK_WORK_GROUP_SIZE_NV = 38207;
    public static final int GL_MESH_VERTICES_OUT_NV = 38265;
    public static final int GL_MESH_PRIMITIVES_OUT_NV = 38266;
    public static final int GL_MESH_OUTPUT_TYPE_NV = 38267;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_MESH_SHADER_NV = 38300;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_TASK_SHADER_NV = 38301;
    public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_MESH_SHADER_NV = 38302;
    public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TASK_SHADER_NV = 38303;
    public static final int GL_REFERENCED_BY_MESH_SHADER_NV = 38304;
    public static final int GL_REFERENCED_BY_TASK_SHADER_NV = 38305;
    public static final int GL_MESH_SUBROUTINE_NV = 38268;
    public static final int GL_TASK_SUBROUTINE_NV = 38269;
    public static final int GL_MESH_SUBROUTINE_UNIFORM_NV = 38270;
    public static final int GL_TASK_SUBROUTINE_UNIFORM_NV = 38271;
    public static final int GL_MESH_SHADER_BIT_NV = 64;
    public static final int GL_TASK_SHADER_BIT_NV = 128;

    protected NVMeshShader() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glDrawMeshTasksNV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLuint") int r1);

    public static native void glDrawMeshTasksIndirectNV(@org.lwjgl.system.NativeType("GLintptr") long r0);

    public static native void glMultiDrawMeshTasksIndirectNV(@org.lwjgl.system.NativeType("GLintptr") long r0, @org.lwjgl.system.NativeType("GLsizei") int r2, @org.lwjgl.system.NativeType("GLsizei") int r3);

    public static native void glMultiDrawMeshTasksIndirectCountNV(@org.lwjgl.system.NativeType("GLintptr") long r0, @org.lwjgl.system.NativeType("GLintptr") long r2, @org.lwjgl.system.NativeType("GLsizei") int r4, @org.lwjgl.system.NativeType("GLsizei") int r5);

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
