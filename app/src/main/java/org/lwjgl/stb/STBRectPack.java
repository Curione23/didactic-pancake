package org.lwjgl.stb;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBRectPack.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBRectPack.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBRectPack.class */
public class STBRectPack {
    public static final int STBRP__MAXVAL = Integer.MAX_VALUE;
    public static final int STBRP_HEURISTIC_Skyline_default = 0;
    public static final int STBRP_HEURISTIC_Skyline_BL_sortHeight = 0;
    public static final int STBRP_HEURISTIC_Skyline_BF_sortHeight = 1;

    protected STBRectPack() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native int nstbrp_pack_rects(long r0, long r2, int r4);

    public static int stbrp_pack_rects(@org.lwjgl.system.NativeType("stbrp_context *") org.lwjgl.stb.STBRPContext r6, @org.lwjgl.system.NativeType("stbrp_rect *") org.lwjgl.stb.STBRPRect.Buffer r7) {
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            r2 = r7
            int r2 = r2.remaining()
            int r0 = nstbrp_pack_rects(r0, r1, r2)
            return r0
    }

    public static native void nstbrp_init_target(long r0, int r2, int r3, long r4, int r6);

    public static void stbrp_init_target(@org.lwjgl.system.NativeType("stbrp_context *") org.lwjgl.stb.STBRPContext r8, int r9, int r10, @org.lwjgl.system.NativeType("stbrp_node *") org.lwjgl.stb.STBRPNode.Buffer r11) {
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            r3 = r11
            long r3 = r3.address()
            r4 = r11
            int r4 = r4.remaining()
            nstbrp_init_target(r0, r1, r2, r3, r4)
            return
    }

    public static native void nstbrp_setup_allow_out_of_mem(long r0, int r2);

    public static void stbrp_setup_allow_out_of_mem(@org.lwjgl.system.NativeType("stbrp_context *") org.lwjgl.stb.STBRPContext r4, @org.lwjgl.system.NativeType("int") boolean r5) {
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            if (r1 == 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            nstbrp_setup_allow_out_of_mem(r0, r1)
            return
    }

    public static native void nstbrp_setup_heuristic(long r0, int r2);

    public static void stbrp_setup_heuristic(@org.lwjgl.system.NativeType("stbrp_context *") org.lwjgl.stb.STBRPContext r4, int r5) {
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstbrp_setup_heuristic(r0, r1)
            return
    }

    static {
            org.lwjgl.stb.LibSTB.initialize()
            return
    }
}
