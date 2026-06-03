package org.lwjgl.util.glu;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/GLU.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/GLU.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/GLU.class */
public class GLU {
    static final float PI = 3.1415927f;
    public static final int GLU_INVALID_ENUM = 100900;
    public static final int GLU_INVALID_VALUE = 100901;
    public static final int GLU_OUT_OF_MEMORY = 100902;
    public static final int GLU_INCOMPATIBLE_GL_VERSION = 100903;
    public static final int GLU_VERSION = 100800;
    public static final int GLU_EXTENSIONS = 100801;
    public static final boolean GLU_TRUE = true;
    public static final boolean GLU_FALSE = false;
    public static final int GLU_SMOOTH = 100000;
    public static final int GLU_FLAT = 100001;
    public static final int GLU_NONE = 100002;
    public static final int GLU_POINT = 100010;
    public static final int GLU_LINE = 100011;
    public static final int GLU_FILL = 100012;
    public static final int GLU_SILHOUETTE = 100013;
    public static final int GLU_OUTSIDE = 100020;
    public static final int GLU_INSIDE = 100021;
    public static final double GLU_TESS_MAX_COORD = 1.0E150d;
    public static final double TESS_MAX_COORD = 1.0E150d;
    public static final int GLU_TESS_WINDING_RULE = 100140;
    public static final int GLU_TESS_BOUNDARY_ONLY = 100141;
    public static final int GLU_TESS_TOLERANCE = 100142;
    public static final int GLU_TESS_WINDING_ODD = 100130;
    public static final int GLU_TESS_WINDING_NONZERO = 100131;
    public static final int GLU_TESS_WINDING_POSITIVE = 100132;
    public static final int GLU_TESS_WINDING_NEGATIVE = 100133;
    public static final int GLU_TESS_WINDING_ABS_GEQ_TWO = 100134;
    public static final int GLU_TESS_BEGIN = 100100;
    public static final int GLU_TESS_VERTEX = 100101;
    public static final int GLU_TESS_END = 100102;
    public static final int GLU_TESS_ERROR = 100103;
    public static final int GLU_TESS_EDGE_FLAG = 100104;
    public static final int GLU_TESS_COMBINE = 100105;
    public static final int GLU_TESS_BEGIN_DATA = 100106;
    public static final int GLU_TESS_VERTEX_DATA = 100107;
    public static final int GLU_TESS_END_DATA = 100108;
    public static final int GLU_TESS_ERROR_DATA = 100109;
    public static final int GLU_TESS_EDGE_FLAG_DATA = 100110;
    public static final int GLU_TESS_COMBINE_DATA = 100111;
    public static final int GLU_TESS_ERROR1 = 100151;
    public static final int GLU_TESS_ERROR2 = 100152;
    public static final int GLU_TESS_ERROR3 = 100153;
    public static final int GLU_TESS_ERROR4 = 100154;
    public static final int GLU_TESS_ERROR5 = 100155;
    public static final int GLU_TESS_ERROR6 = 100156;
    public static final int GLU_TESS_ERROR7 = 100157;
    public static final int GLU_TESS_ERROR8 = 100158;
    public static final int GLU_TESS_MISSING_BEGIN_POLYGON = 100151;
    public static final int GLU_TESS_MISSING_BEGIN_CONTOUR = 100152;
    public static final int GLU_TESS_MISSING_END_POLYGON = 100153;
    public static final int GLU_TESS_MISSING_END_CONTOUR = 100154;
    public static final int GLU_TESS_COORD_TOO_LARGE = 100155;
    public static final int GLU_TESS_NEED_COMBINE_CALLBACK = 100156;
    public static final int GLU_AUTO_LOAD_MATRIX = 100200;
    public static final int GLU_CULLING = 100201;
    public static final int GLU_SAMPLING_TOLERANCE = 100203;
    public static final int GLU_DISPLAY_MODE = 100204;
    public static final int GLU_PARAMETRIC_TOLERANCE = 100202;
    public static final int GLU_SAMPLING_METHOD = 100205;
    public static final int GLU_U_STEP = 100206;
    public static final int GLU_V_STEP = 100207;
    public static final int GLU_PATH_LENGTH = 100215;
    public static final int GLU_PARAMETRIC_ERROR = 100216;
    public static final int GLU_DOMAIN_DISTANCE = 100217;
    public static final int GLU_MAP1_TRIM_2 = 100210;
    public static final int GLU_MAP1_TRIM_3 = 100211;
    public static final int GLU_OUTLINE_POLYGON = 100240;
    public static final int GLU_OUTLINE_PATCH = 100241;
    public static final int GLU_NURBS_ERROR1 = 100251;
    public static final int GLU_NURBS_ERROR2 = 100252;
    public static final int GLU_NURBS_ERROR3 = 100253;
    public static final int GLU_NURBS_ERROR4 = 100254;
    public static final int GLU_NURBS_ERROR5 = 100255;
    public static final int GLU_NURBS_ERROR6 = 100256;
    public static final int GLU_NURBS_ERROR7 = 100257;
    public static final int GLU_NURBS_ERROR8 = 100258;
    public static final int GLU_NURBS_ERROR9 = 100259;
    public static final int GLU_NURBS_ERROR10 = 100260;
    public static final int GLU_NURBS_ERROR11 = 100261;
    public static final int GLU_NURBS_ERROR12 = 100262;
    public static final int GLU_NURBS_ERROR13 = 100263;
    public static final int GLU_NURBS_ERROR14 = 100264;
    public static final int GLU_NURBS_ERROR15 = 100265;
    public static final int GLU_NURBS_ERROR16 = 100266;
    public static final int GLU_NURBS_ERROR17 = 100267;
    public static final int GLU_NURBS_ERROR18 = 100268;
    public static final int GLU_NURBS_ERROR19 = 100269;
    public static final int GLU_NURBS_ERROR20 = 100270;
    public static final int GLU_NURBS_ERROR21 = 100271;
    public static final int GLU_NURBS_ERROR22 = 100272;
    public static final int GLU_NURBS_ERROR23 = 100273;
    public static final int GLU_NURBS_ERROR24 = 100274;
    public static final int GLU_NURBS_ERROR25 = 100275;
    public static final int GLU_NURBS_ERROR26 = 100276;
    public static final int GLU_NURBS_ERROR27 = 100277;
    public static final int GLU_NURBS_ERROR28 = 100278;
    public static final int GLU_NURBS_ERROR29 = 100279;
    public static final int GLU_NURBS_ERROR30 = 100280;
    public static final int GLU_NURBS_ERROR31 = 100281;
    public static final int GLU_NURBS_ERROR32 = 100282;
    public static final int GLU_NURBS_ERROR33 = 100283;
    public static final int GLU_NURBS_ERROR34 = 100284;
    public static final int GLU_NURBS_ERROR35 = 100285;
    public static final int GLU_NURBS_ERROR36 = 100286;
    public static final int GLU_NURBS_ERROR37 = 100287;
    public static final int GLU_CW = 100120;
    public static final int GLU_CCW = 100121;
    public static final int GLU_INTERIOR = 100122;
    public static final int GLU_EXTERIOR = 100123;
    public static final int GLU_UNKNOWN = 100124;
    public static final int GLU_BEGIN = 100100;
    public static final int GLU_VERTEX = 100101;
    public static final int GLU_END = 100102;
    public static final int GLU_ERROR = 100103;
    public static final int GLU_EDGE_FLAG = 100104;

    public GLU() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void gluLookAt(float r10, float r11, float r12, float r13, float r14, float r15, float r16, float r17, float r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            org.lwjgl.util.glu.Project.gluLookAt(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void gluOrtho2D(float r13, float r14, float r15, float r16) {
            r0 = r13
            double r0 = (double) r0
            r1 = r14
            double r1 = (double) r1
            r2 = r15
            double r2 = (double) r2
            r3 = r16
            double r3 = (double) r3
            r4 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            org.lwjgl.opengl.GL11.glOrtho(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void gluPerspective(float r5, float r6, float r7, float r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.util.glu.Project.gluPerspective(r0, r1, r2, r3)
            return
    }

    public static boolean gluProject(float r8, float r9, float r10, java.nio.FloatBuffer r11, java.nio.FloatBuffer r12, java.nio.IntBuffer r13, java.nio.FloatBuffer r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            boolean r0 = org.lwjgl.util.glu.Project.gluProject(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static boolean gluUnProject(float r8, float r9, float r10, java.nio.FloatBuffer r11, java.nio.FloatBuffer r12, java.nio.IntBuffer r13, java.nio.FloatBuffer r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            boolean r0 = org.lwjgl.util.glu.Project.gluUnProject(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static void gluPickMatrix(float r6, float r7, float r8, float r9, java.nio.IntBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.util.glu.Project.gluPickMatrix(r0, r1, r2, r3, r4)
            return
    }

    public static java.lang.String gluGetString(int r2) {
            r0 = r2
            java.lang.String r0 = org.lwjgl.util.glu.Registry.gluGetString(r0)
            return r0
    }

    public static boolean gluCheckExtension(java.lang.String r3, java.lang.String r4) {
            r0 = r3
            r1 = r4
            boolean r0 = org.lwjgl.util.glu.Registry.gluCheckExtension(r0, r1)
            return r0
    }

    public static int gluBuild2DMipmaps(int r8, int r9, int r10, int r11, int r12, int r13, java.nio.ByteBuffer r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            int r0 = org.lwjgl.util.glu.MipMap.gluBuild2DMipmaps(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static int gluScaleImage(int r10, int r11, int r12, int r13, java.nio.ByteBuffer r14, int r15, int r16, int r17, java.nio.ByteBuffer r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            int r0 = org.lwjgl.util.glu.MipMap.gluScaleImage(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    public static java.lang.String gluErrorString(int r2) {
            r0 = r2
            switch(r0) {
                case 100900: goto L1c;
                case 100901: goto L1f;
                case 100902: goto L22;
                default: goto L25;
            }
        L1c:
            java.lang.String r0 = "Invalid enum (glu)"
            return r0
        L1f:
            java.lang.String r0 = "Invalid value (glu)"
            return r0
        L22:
            java.lang.String r0 = "Out of memory (glu)"
            return r0
        L25:
            r0 = r2
            java.lang.String r0 = org.lwjgl.opengl.Util.translateGLErrorString(r0)
            return r0
    }

    public static org.lwjgl.util.glu.GLUtessellator gluNewTess() {
            org.lwjgl.util.glu.tessellation.GLUtessellatorImpl r0 = new org.lwjgl.util.glu.tessellation.GLUtessellatorImpl
            r1 = r0
            r1.<init>()
            return r0
    }
}
