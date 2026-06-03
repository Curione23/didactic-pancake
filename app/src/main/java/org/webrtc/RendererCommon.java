package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/RendererCommon.class */
public class RendererCommon {
    private static float BALANCED_VISIBLE_FRACTION;

    /* JADX INFO: renamed from: org.webrtc.RendererCommon$1, reason: invalid class name */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/RendererCommon$1.class */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$RendererCommon$ScalingType = null;

        static {
                org.webrtc.RendererCommon$ScalingType[] r0 = org.webrtc.RendererCommon.ScalingType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.webrtc.RendererCommon.AnonymousClass1.$SwitchMap$org$webrtc$RendererCommon$ScalingType = r0
                int[] r0 = org.webrtc.RendererCommon.AnonymousClass1.$SwitchMap$org$webrtc$RendererCommon$ScalingType     // Catch: java.lang.NoSuchFieldError -> L17
                org.webrtc.RendererCommon$ScalingType r1 = org.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_FIT     // Catch: java.lang.NoSuchFieldError -> L17
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L17
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L17
                goto L18
            L17:
                r4 = move-exception
            L18:
                int[] r0 = org.webrtc.RendererCommon.AnonymousClass1.$SwitchMap$org$webrtc$RendererCommon$ScalingType     // Catch: java.lang.NoSuchFieldError -> L26
                org.webrtc.RendererCommon$ScalingType r1 = org.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_FILL     // Catch: java.lang.NoSuchFieldError -> L26
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L26
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L26
                goto L27
            L26:
                r4 = move-exception
            L27:
                int[] r0 = org.webrtc.RendererCommon.AnonymousClass1.$SwitchMap$org$webrtc$RendererCommon$ScalingType     // Catch: java.lang.NoSuchFieldError -> L35
                org.webrtc.RendererCommon$ScalingType r1 = org.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_BALANCED     // Catch: java.lang.NoSuchFieldError -> L35
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L35
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L35
                goto L36
            L35:
                r4 = move-exception
            L36:
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/RendererCommon$GlDrawer.class */
    public interface GlDrawer {
        void drawOes(int r1, float[] r2, int r3, int r4, int r5, int r6, int r7, int r8);

        void drawRgb(int r1, float[] r2, int r3, int r4, int r5, int r6, int r7, int r8);

        void drawYuv(int[] r1, float[] r2, int r3, int r4, int r5, int r6, int r7, int r8);

        void release();
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/RendererCommon$RendererEvents.class */
    public interface RendererEvents {
        void onFirstFrameRendered();

        void onFrameResolutionChanged(int r1, int r2, int r3);
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/RendererCommon$ScalingType.class */
    public enum ScalingType extends java.lang.Enum<org.webrtc.RendererCommon.ScalingType> {
        public static final org.webrtc.RendererCommon.ScalingType SCALE_ASPECT_FIT = null;
        public static final org.webrtc.RendererCommon.ScalingType SCALE_ASPECT_FILL = null;
        public static final org.webrtc.RendererCommon.ScalingType SCALE_ASPECT_BALANCED = null;
        private static final /* synthetic */ org.webrtc.RendererCommon.ScalingType[] $VALUES = null;

        public static org.webrtc.RendererCommon.ScalingType[] values() {
                org.webrtc.RendererCommon$ScalingType[] r0 = org.webrtc.RendererCommon.ScalingType.$VALUES
                java.lang.Object r0 = r0.clone()
                org.webrtc.RendererCommon$ScalingType[] r0 = (org.webrtc.RendererCommon.ScalingType[]) r0
                return r0
        }

        public static org.webrtc.RendererCommon.ScalingType valueOf(java.lang.String r3) {
                java.lang.Class<org.webrtc.RendererCommon$ScalingType> r0 = org.webrtc.RendererCommon.ScalingType.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                org.webrtc.RendererCommon$ScalingType r0 = (org.webrtc.RendererCommon.ScalingType) r0
                return r0
        }

        ScalingType(java.lang.String r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        private static /* synthetic */ org.webrtc.RendererCommon.ScalingType[] $values() {
                r0 = 3
                org.webrtc.RendererCommon$ScalingType[] r0 = new org.webrtc.RendererCommon.ScalingType[r0]
                r1 = r0
                r2 = 0
                org.webrtc.RendererCommon$ScalingType r3 = org.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_FIT
                r1[r2] = r3
                r1 = r0
                r2 = 1
                org.webrtc.RendererCommon$ScalingType r3 = org.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_FILL
                r1[r2] = r3
                r1 = r0
                r2 = 2
                org.webrtc.RendererCommon$ScalingType r3 = org.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_BALANCED
                r1[r2] = r3
                return r0
        }

        static {
                org.webrtc.RendererCommon$ScalingType r0 = new org.webrtc.RendererCommon$ScalingType
                r1 = r0
                java.lang.String r2 = "SCALE_ASPECT_FIT"
                r3 = 0
                r1.<init>(r2, r3)
                org.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_FIT = r0
                org.webrtc.RendererCommon$ScalingType r0 = new org.webrtc.RendererCommon$ScalingType
                r1 = r0
                java.lang.String r2 = "SCALE_ASPECT_FILL"
                r3 = 1
                r1.<init>(r2, r3)
                org.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_FILL = r0
                org.webrtc.RendererCommon$ScalingType r0 = new org.webrtc.RendererCommon$ScalingType
                r1 = r0
                java.lang.String r2 = "SCALE_ASPECT_BALANCED"
                r3 = 2
                r1.<init>(r2, r3)
                org.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_BALANCED = r0
                org.webrtc.RendererCommon$ScalingType[] r0 = $values()
                org.webrtc.RendererCommon.ScalingType.$VALUES = r0
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/RendererCommon$VideoLayoutMeasure.class */
    public static class VideoLayoutMeasure {
        private float visibleFractionMatchOrientation;
        private float visibleFractionMismatchOrientation;

        public VideoLayoutMeasure() {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                org.webrtc.RendererCommon$ScalingType r1 = org.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_BALANCED
                float r1 = org.webrtc.RendererCommon.convertScalingTypeToVisibleFraction(r1)
                r0.visibleFractionMatchOrientation = r1
                r0 = r3
                org.webrtc.RendererCommon$ScalingType r1 = org.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_BALANCED
                float r1 = org.webrtc.RendererCommon.convertScalingTypeToVisibleFraction(r1)
                r0.visibleFractionMismatchOrientation = r1
                return
        }

        public void setScalingType(org.webrtc.RendererCommon.ScalingType r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r5
                r0.setScalingType(r1, r2)
                return
        }

        public void setScalingType(org.webrtc.RendererCommon.ScalingType r4, org.webrtc.RendererCommon.ScalingType r5) {
                r3 = this;
                r0 = r3
                r1 = r4
                float r1 = org.webrtc.RendererCommon.convertScalingTypeToVisibleFraction(r1)
                r0.visibleFractionMatchOrientation = r1
                r0 = r3
                r1 = r5
                float r1 = org.webrtc.RendererCommon.convertScalingTypeToVisibleFraction(r1)
                r0.visibleFractionMismatchOrientation = r1
                return
        }

        public void setVisibleFraction(float r4, float r5) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.visibleFractionMatchOrientation = r1
                r0 = r3
                r1 = r5
                r0.visibleFractionMismatchOrientation = r1
                return
        }

        public android.graphics.Point measure(int r6, int r7, int r8, int r9) {
                r5 = this;
                r0 = 2147483647(0x7fffffff, float:NaN)
                r1 = r6
                int r0 = android.view.View.getDefaultSize(r0, r1)
                r10 = r0
                r0 = 2147483647(0x7fffffff, float:NaN)
                r1 = r7
                int r0 = android.view.View.getDefaultSize(r0, r1)
                r11 = r0
                r0 = r8
                if (r0 == 0) goto L23
                r0 = r9
                if (r0 == 0) goto L23
                r0 = r10
                if (r0 == 0) goto L23
                r0 = r11
                if (r0 != 0) goto L2f
            L23:
                android.graphics.Point r0 = new android.graphics.Point
                r1 = r0
                r2 = r10
                r3 = r11
                r1.<init>(r2, r3)
                return r0
            L2f:
                r0 = r8
                float r0 = (float) r0
                r1 = r9
                float r1 = (float) r1
                float r0 = r0 / r1
                r12 = r0
                r0 = r10
                float r0 = (float) r0
                r1 = r11
                float r1 = (float) r1
                float r0 = r0 / r1
                r13 = r0
                r0 = r12
                r1 = 1065353216(0x3f800000, float:1.0)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto L4b
                r0 = 1
                goto L4c
            L4b:
                r0 = 0
            L4c:
                r1 = r13
                r2 = 1065353216(0x3f800000, float:1.0)
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 <= 0) goto L57
                r1 = 1
                goto L58
            L57:
                r1 = 0
            L58:
                if (r0 != r1) goto L62
                r0 = r5
                float r0 = r0.visibleFractionMatchOrientation
                goto L66
            L62:
                r0 = r5
                float r0 = r0.visibleFractionMismatchOrientation
            L66:
                r14 = r0
                r0 = r14
                r1 = r12
                r2 = r10
                r3 = r11
                android.graphics.Point r0 = org.webrtc.RendererCommon.getDisplaySize(r0, r1, r2, r3)
                r15 = r0
                r0 = r6
                int r0 = android.view.View.MeasureSpec.getMode(r0)
                r1 = 1073741824(0x40000000, float:2.0)
                if (r0 != r1) goto L85
                r0 = r15
                r1 = r10
                r0.x = r1
            L85:
                r0 = r7
                int r0 = android.view.View.MeasureSpec.getMode(r0)
                r1 = 1073741824(0x40000000, float:2.0)
                if (r0 != r1) goto L95
                r0 = r15
                r1 = r11
                r0.y = r1
            L95:
                r0 = r15
                return r0
        }
    }

    public RendererCommon() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static float[] getLayoutMatrix(boolean r6, float r7, float r8) {
            r0 = 1065353216(0x3f800000, float:1.0)
            r9 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r10 = r0
            r0 = r8
            r1 = r7
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L13
            r0 = r7
            r1 = r8
            float r0 = r0 / r1
            r10 = r0
            goto L17
        L13:
            r0 = r8
            r1 = r7
            float r0 = r0 / r1
            r9 = r0
        L17:
            r0 = r6
            if (r0 == 0) goto L20
            r0 = r9
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r0 = r0 * r1
            r9 = r0
        L20:
            r0 = 16
            float[] r0 = new float[r0]
            r11 = r0
            r0 = r11
            r1 = 0
            android.opengl.Matrix.setIdentityM(r0, r1)
            r0 = r11
            r1 = 0
            r2 = r9
            r3 = r10
            r4 = 1065353216(0x3f800000, float:1.0)
            android.opengl.Matrix.scaleM(r0, r1, r2, r3, r4)
            r0 = r11
            adjustOrigin(r0)
            r0 = r11
            return r0
    }

    public static android.graphics.Matrix convertMatrixToAndroidGraphicsMatrix(float[] r6) {
            r0 = 9
            float[] r0 = new float[r0]
            r1 = r0
            r2 = 0
            r3 = r6
            r4 = 0
            r3 = r3[r4]
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = r6
            r4 = 4
            r3 = r3[r4]
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = r6
            r4 = 12
            r3 = r3[r4]
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = r6
            r4 = 1
            r3 = r3[r4]
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = r6
            r4 = 5
            r3 = r3[r4]
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = r6
            r4 = 13
            r3 = r3[r4]
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = r6
            r4 = 3
            r3 = r3[r4]
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = r6
            r4 = 7
            r3 = r3[r4]
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = r6
            r4 = 15
            r3 = r3[r4]
            r1[r2] = r3
            r7 = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r8
            r1 = r7
            r0.setValues(r1)
            r0 = r8
            return r0
    }

    public static float[] convertMatrixFromAndroidGraphicsMatrix(android.graphics.Matrix r6) {
            r0 = 9
            float[] r0 = new float[r0]
            r7 = r0
            r0 = r6
            r1 = r7
            r0.getValues(r1)
            r0 = 16
            float[] r0 = new float[r0]
            r1 = r0
            r2 = 0
            r3 = r7
            r4 = 0
            r3 = r3[r4]
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = r7
            r4 = 3
            r3 = r3[r4]
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = r7
            r4 = 6
            r3 = r3[r4]
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = r7
            r4 = 1
            r3 = r3[r4]
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = r7
            r4 = 4
            r3 = r3[r4]
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = r7
            r4 = 7
            r3 = r3[r4]
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 1065353216(0x3f800000, float:1.0)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = r7
            r4 = 2
            r3 = r3[r4]
            r1[r2] = r3
            r1 = r0
            r2 = 13
            r3 = r7
            r4 = 5
            r3 = r3[r4]
            r1[r2] = r3
            r1 = r0
            r2 = 14
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 15
            r3 = r7
            r4 = 8
            r3 = r3[r4]
            r1[r2] = r3
            r8 = r0
            r0 = r8
            return r0
    }

    public static android.graphics.Point getDisplaySize(org.webrtc.RendererCommon.ScalingType r5, float r6, int r7, int r8) {
            r0 = r5
            float r0 = convertScalingTypeToVisibleFraction(r0)
            r1 = r6
            r2 = r7
            r3 = r8
            android.graphics.Point r0 = getDisplaySize(r0, r1, r2, r3)
            return r0
    }

    private static void adjustOrigin(float[] r8) {
            r0 = r8
            r1 = 12
            r2 = r0; r3 = r1; 
            r2 = r2[r3]
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = r8
            r5 = 0
            r4 = r4[r5]
            r5 = r8
            r6 = 4
            r5 = r5[r6]
            float r4 = r4 + r5
            float r3 = r3 * r4
            float r2 = r2 - r3
            r0[r1] = r2
            r0 = r8
            r1 = 13
            r2 = r0; r3 = r1; 
            r2 = r2[r3]
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = r8
            r5 = 1
            r4 = r4[r5]
            r5 = r8
            r6 = 5
            r5 = r5[r6]
            float r4 = r4 + r5
            float r3 = r3 * r4
            float r2 = r2 - r3
            r0[r1] = r2
            r0 = r8
            r1 = 12
            r2 = r0; r3 = r1; 
            r2 = r2[r3]
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            r0[r1] = r2
            r0 = r8
            r1 = 13
            r2 = r0; r3 = r1; 
            r2 = r2[r3]
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            r0[r1] = r2
            return
    }

    private static float convertScalingTypeToVisibleFraction(org.webrtc.RendererCommon.ScalingType r3) {
            int[] r0 = org.webrtc.RendererCommon.AnonymousClass1.$SwitchMap$org$webrtc$RendererCommon$ScalingType
            r1 = r3
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L24;
                case 2: goto L26;
                case 3: goto L28;
                default: goto L2c;
            }
        L24:
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
        L26:
            r0 = 0
            return r0
        L28:
            float r0 = org.webrtc.RendererCommon.BALANCED_VISIBLE_FRACTION
            return r0
        L2c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static android.graphics.Point getDisplaySize(float r5, float r6, int r7, int r8) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Lc
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L16
        Lc:
            android.graphics.Point r0 = new android.graphics.Point
            r1 = r0
            r2 = r7
            r3 = r8
            r1.<init>(r2, r3)
            return r0
        L16:
            r0 = r7
            r1 = r8
            float r1 = (float) r1
            r2 = r5
            float r1 = r1 / r2
            r2 = r6
            float r1 = r1 * r2
            int r1 = java.lang.Math.round(r1)
            int r0 = java.lang.Math.min(r0, r1)
            r9 = r0
            r0 = r8
            r1 = r7
            float r1 = (float) r1
            r2 = r5
            float r1 = r1 / r2
            r2 = r6
            float r1 = r1 / r2
            int r1 = java.lang.Math.round(r1)
            int r0 = java.lang.Math.min(r0, r1)
            r10 = r0
            android.graphics.Point r0 = new android.graphics.Point
            r1 = r0
            r2 = r9
            r3 = r10
            r1.<init>(r2, r3)
            return r0
    }

    static {
            r0 = 1058013184(0x3f100000, float:0.5625)
            org.webrtc.RendererCommon.BALANCED_VISIBLE_FRACTION = r0
            return
    }
}
