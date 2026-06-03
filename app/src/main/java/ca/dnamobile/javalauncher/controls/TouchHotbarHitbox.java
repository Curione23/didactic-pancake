package ca.dnamobile.javalauncher.controls;

/* JADX INFO: loaded from: classes.dex */
public final class TouchHotbarHitbox {
    public static final int SLOT_COUNT = 9;

    private static final class RenderScale {
        final boolean fromGameBuffer;
        final float gameBufferHeight;
        final float gameBufferWidth;
        final int resolutionScalePercent;
        final float x;
        final float y;

        RenderScale(float r1, float r2, float r3, float r4, int r5, boolean r6) {
                r0 = this;
                r0.<init>()
                r0.x = r1
                r0.y = r2
                r0.gameBufferWidth = r3
                r0.gameBufferHeight = r4
                r0.resolutionScalePercent = r5
                r0.fromGameBuffer = r6
                return
        }
    }

    public static final class Result {
        public final float gameBufferHeight;
        public final float gameBufferWidth;
        public final android.graphics.RectF hotbarBounds;
        public final int minecraftGuiScale;
        public final boolean optionsFileFound;
        public final int overrideScale;
        public final boolean renderScaleFromGameBuffer;
        public final float renderScaleX;
        public final float renderScaleY;
        public final int resolutionScalePercent;
        public final float scale;
        public final float slotWidth;
        public final android.graphics.RectF touchBounds;
        public final boolean usedEstimateFallback;

        private Result(android.graphics.RectF r1, android.graphics.RectF r2, float r3, int r4, int r5, boolean r6, boolean r7, ca.dnamobile.javalauncher.controls.TouchHotbarHitbox.RenderScale r8) {
                r0 = this;
                r0.<init>()
                r0.hotbarBounds = r1
                r0.touchBounds = r2
                r0.scale = r3
                r0.overrideScale = r4
                r0.minecraftGuiScale = r5
                r0.optionsFileFound = r6
                r0.usedEstimateFallback = r7
                float r2 = r8.x
                r0.renderScaleX = r2
                float r2 = r8.y
                r0.renderScaleY = r2
                float r2 = r8.gameBufferWidth
                r0.gameBufferWidth = r2
                float r2 = r8.gameBufferHeight
                r0.gameBufferHeight = r2
                int r2 = r8.resolutionScalePercent
                r0.resolutionScalePercent = r2
                boolean r2 = r8.fromGameBuffer
                r0.renderScaleFromGameBuffer = r2
                float r1 = r1.width()
                r2 = 1091567616(0x41100000, float:9.0)
                float r1 = r1 / r2
                r2 = 1065353216(0x3f800000, float:1.0)
                float r1 = java.lang.Math.max(r2, r1)
                r0.slotWidth = r1
                return
        }

        /* synthetic */ Result(android.graphics.RectF r1, android.graphics.RectF r2, float r3, int r4, int r5, boolean r6, boolean r7, ca.dnamobile.javalauncher.controls.TouchHotbarHitbox.RenderScale r8, ca.dnamobile.javalauncher.controls.TouchHotbarHitbox.ResultIA r9) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return
        }

        public java.lang.String scaleSourceLabel() {
                r1 = this;
                int r0 = r1.overrideScale
                if (r0 <= 0) goto L7
                java.lang.String r0 = "manual"
                return r0
            L7:
                boolean r0 = r1.optionsFileFound
                if (r0 == 0) goto L15
                int r0 = r1.minecraftGuiScale
                if (r0 > 0) goto L12
                java.lang.String r0 = "mc-auto"
                goto L14
            L12:
                java.lang.String r0 = "mc"
            L14:
                return r0
            L15:
                java.lang.String r0 = "estimate"
                return r0
        }

        public int slotFor(float r2, float r3) {
                r1 = this;
                android.graphics.RectF r0 = r1.touchBounds
                boolean r3 = r0.contains(r2, r3)
                r0 = -1
                if (r3 != 0) goto La
                return r0
            La:
                android.graphics.RectF r3 = r1.hotbarBounds
                float r3 = r3.left
                int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r3 < 0) goto L45
                android.graphics.RectF r3 = r1.hotbarBounds
                float r3 = r3.right
                int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r3 < 0) goto L1b
                goto L45
            L1b:
                android.graphics.RectF r3 = r1.hotbarBounds
                float r3 = r3.left
                float r2 = r2 - r3
                android.graphics.RectF r3 = r1.hotbarBounds
                float r3 = r3.width()
                r0 = 1065353216(0x3f800000, float:1.0)
                float r3 = r3 - r0
                r0 = 0
                float r2 = ca.dnamobile.javalauncher.controls.TouchHotbarHitbox.m430$$Nest$smclamp(r2, r0, r3)
                r3 = 1091567616(0x41100000, float:9.0)
                float r2 = r2 * r3
                android.graphics.RectF r3 = r1.hotbarBounds
                float r3 = r3.width()
                float r2 = r2 / r3
                int r2 = (int) r2
                r3 = 8
                int r2 = java.lang.Math.min(r3, r2)
                r3 = 0
                int r2 = java.lang.Math.max(r3, r2)
                return r2
            L45:
                return r0
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.controls.TouchHotbarHitbox$Result-IA, reason: invalid class name */
    /* JADX INFO: compiled from: D8$$SyntheticClass */
    public final /* synthetic */ class ResultIA {
    }

    /* JADX INFO: renamed from: -$$Nest$smclamp, reason: not valid java name */
    static /* bridge */ /* synthetic */ float m430$$Nest$smclamp(float r0, float r1, float r2) {
            float r0 = clamp(r0, r1, r2)
            return r0
    }

    private TouchHotbarHitbox() {
            r0 = this;
            r0.<init>()
            return
    }

    public static ca.dnamobile.javalauncher.controls.TouchHotbarHitbox.Result calculate(android.content.Context r6, float r7, float r8, float r9, float r10) {
            r1 = 0
            r0 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            ca.dnamobile.javalauncher.controls.TouchHotbarHitbox$Result r6 = calculate(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static ca.dnamobile.javalauncher.controls.TouchHotbarHitbox.Result calculate(android.content.Context r16, java.io.File r17, float r18, float r19, float r20, float r21) {
            r0 = 0
            int r1 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r1 <= 0) goto L8
            r1 = r18
            goto La
        L8:
            r1 = r20
        La:
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = java.lang.Math.max(r2, r1)
            int r0 = (r19 > r0 ? 1 : (r19 == r0 ? 0 : -1))
            if (r0 <= 0) goto L17
            r0 = r19
            goto L19
        L17:
            r0 = r21
        L19:
            float r0 = java.lang.Math.max(r2, r0)
            android.content.res.Resources r3 = r16.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r3 = java.lang.Math.max(r2, r3)
            int r8 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getHotbarGuiScaleOverride(r16)
            r4 = r16
            r5 = r20
            r6 = r21
            ca.dnamobile.javalauncher.controls.TouchHotbarHitbox$RenderScale r12 = resolveRenderScale(r4, r1, r0, r5, r6)
            r5 = 1
            r6 = 0
            if (r17 == 0) goto L45
            boolean r7 = r17.isFile()
            if (r7 == 0) goto L45
            r10 = r5
            goto L46
        L45:
            r10 = r6
        L46:
            if (r10 == 0) goto L4e
            int r7 = ca.dnamobile.javalauncher.controls.MinecraftGuiScaleResolver.readGuiScaleCached(r17)
            r9 = r7
            goto L4f
        L4e:
            r9 = r6
        L4f:
            if (r8 <= 0) goto L54
            float r5 = (float) r8
            r11 = r6
            goto L68
        L54:
            if (r10 == 0) goto L62
            float r7 = r12.gameBufferWidth
            float r11 = r12.gameBufferHeight
            int r7 = ca.dnamobile.javalauncher.controls.MinecraftGuiScaleResolver.resolveRequestedScaleForFramebuffer(r9, r7, r11)
            float r7 = (float) r7
            r11 = r6
            r6 = r5
            goto L67
        L62:
            float r7 = estimateHotbarGuiScale(r1, r0)
            r11 = r5
        L67:
            r5 = r7
        L68:
            if (r6 == 0) goto L6d
            float r7 = r12.x
            goto L6e
        L6d:
            r7 = r2
        L6e:
            float r7 = r7 * r5
            if (r6 == 0) goto L73
            float r2 = r12.y
        L73:
            float r5 = r5 * r2
            float r2 = r7 + r5
            r6 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r6
            float r13 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getHotbarWidthGui(r16)
            float r13 = r13 * r7
            float r7 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getHotbarHeightGui(r16)
            float r7 = r7 * r5
            float r14 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getHotbarXOffsetDp(r16)
            float r14 = r14 * r3
            float r15 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getHotbarYOffsetDp(r16)
            float r15 = r15 * r3
            float r4 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getHotbarVerticalPaddingDp(r16)
            float r4 = r4 * r3
            float r5 = r5 * r6
            float r3 = java.lang.Math.max(r4, r5)
            float r1 = r1 / r6
            float r4 = r13 / r6
            float r1 = r1 - r4
            float r1 = r1 + r14
            float r0 = r0 - r7
            float r0 = r0 - r15
            android.graphics.RectF r5 = new android.graphics.RectF
            float r13 = r13 + r1
            float r7 = r7 + r0
            r5.<init>(r1, r0, r13, r7)
            android.graphics.RectF r6 = new android.graphics.RectF
            float r0 = r5.left
            float r1 = r5.top
            float r1 = r1 - r3
            float r4 = r5.right
            float r7 = r5.bottom
            float r7 = r7 + r3
            r6.<init>(r0, r1, r4, r7)
            ca.dnamobile.javalauncher.controls.TouchHotbarHitbox$Result r0 = new ca.dnamobile.javalauncher.controls.TouchHotbarHitbox$Result
            r13 = 0
            r4 = r0
            r7 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
    }

    private static float clamp(float r0, float r1, float r2) {
            float r0 = java.lang.Math.min(r2, r0)
            float r0 = java.lang.Math.max(r1, r0)
            return r0
    }

    private static float estimateHotbarGuiScale(float r4, float r5) {
            float r0 = java.lang.Math.min(r4, r5)
            r1 = 1135869952(0x43b40000, float:360.0)
            float r0 = r0 / r1
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.max(r1, r0)
            r2 = 1134559232(0x43a00000, float:320.0)
            float r4 = r4 / r2
            double r2 = (double) r4
            double r2 = java.lang.Math.floor(r2)
            float r4 = (float) r2
            r2 = 1131413504(0x43700000, float:240.0)
            float r5 = r5 / r2
            double r2 = (double) r5
            double r2 = java.lang.Math.floor(r2)
            float r5 = (float) r2
            float r4 = java.lang.Math.min(r4, r5)
            float r4 = java.lang.Math.max(r1, r4)
            float r4 = java.lang.Math.min(r0, r4)
            float r4 = java.lang.Math.max(r1, r4)
            return r4
    }

    private static ca.dnamobile.javalauncher.controls.TouchHotbarHitbox.RenderScale resolveRenderScale(android.content.Context r10, float r11, float r12, float r13, float r14) {
            int r5 = ca.dnamobile.javalauncher.settings.LauncherPreferences.getGameResolutionScalePercent(r10)
            r10 = 1065353216(0x3f800000, float:1.0)
            float r11 = java.lang.Math.max(r10, r11)
            float r12 = java.lang.Math.max(r10, r12)
            int r0 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r0 <= 0) goto L13
            goto L14
        L13:
            r13 = r11
        L14:
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 <= 0) goto L19
            goto L1a
        L19:
            r14 = r12
        L1a:
            float r0 = java.lang.Math.max(r10, r13)
            float r0 = r11 / r0
            r1 = 1048576000(0x3e800000, float:0.25)
            r2 = 1082130432(0x40800000, float:4.0)
            float r0 = clamp(r0, r1, r2)
            float r3 = java.lang.Math.max(r10, r14)
            float r3 = r12 / r3
            float r3 = clamp(r3, r1, r2)
            float r4 = r0 - r10
            float r4 = java.lang.Math.abs(r4)
            r6 = 1020054733(0x3ccccccd, float:0.025)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r7 = 0
            if (r4 > 0) goto L4d
            float r4 = r3 - r10
            float r4 = java.lang.Math.abs(r4)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L4b
            goto L4d
        L4b:
            r4 = r7
            goto L4e
        L4d:
            r4 = 1
        L4e:
            if (r4 != 0) goto L6b
            if (r5 <= 0) goto L6b
            r8 = 1120403456(0x42c80000, float:100.0)
            float r9 = (float) r5
            float r8 = r8 / r9
            float r1 = clamp(r8, r1, r2)
            float r10 = r1 - r10
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r10 <= 0) goto L6b
            float r11 = r11 / r1
            float r12 = r12 / r1
            r3 = r11
            r4 = r12
            r2 = r1
            r6 = r7
            goto L70
        L6b:
            r1 = r0
            r2 = r3
            r6 = r4
            r3 = r13
            r4 = r14
        L70:
            ca.dnamobile.javalauncher.controls.TouchHotbarHitbox$RenderScale r10 = new ca.dnamobile.javalauncher.controls.TouchHotbarHitbox$RenderScale
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r10
    }

    public static int slotForTouch(android.content.Context r8, float r9, float r10, float r11, float r12, float r13, float r14) {
            r1 = 0
            r0 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            int r8 = slotForTouch(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static int slotForTouch(android.content.Context r0, java.io.File r1, float r2, float r3, float r4, float r5, float r6, float r7) {
            ca.dnamobile.javalauncher.controls.TouchHotbarHitbox$Result r0 = calculate(r0, r1, r2, r3, r4, r5)
            int r0 = r0.slotFor(r6, r7)
            return r0
    }
}
