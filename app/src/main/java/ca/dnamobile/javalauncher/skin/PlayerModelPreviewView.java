package ca.dnamobile.javalauncher.skin;

/* JADX INFO: loaded from: classes.dex */
public final class PlayerModelPreviewView extends android.view.View {
    private static final boolean DRAW_TEXTURE_PART_BOUNDS = false;
    private static final boolean DRAW_TEXTURE_PART_SHADOWS = false;
    private static final int FACE_BACK = 2;
    private static final int FACE_FRONT = 0;
    private static final int FACE_LEFT = 3;
    private static final int FACE_RIGHT = 1;
    private static final int PART_LEFT = 1;
    private static final int PART_RIGHT = 0;
    private boolean animationRunning;
    private final java.lang.Runnable animationTick;
    private android.graphics.Bitmap cape;
    private int capeGeneration;
    private java.lang.String capeUrl;
    private float downX;
    private float downYaw;
    private boolean dragging;
    private final android.graphics.Paint pixelPaint;
    private android.graphics.Bitmap skin;
    private int skinGeneration;
    private java.lang.String skinUrl;
    private boolean slimArms;
    private boolean slimArmsKnown;
    private final android.graphics.Paint uiPaint;
    private boolean userRotated;
    private float yawDegrees;


    private static final class Uv {
        final int h;
        final int w;
        final int x;
        final int y;

        Uv(int r1, int r2, int r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.x = r1
                r0.y = r2
                r0.w = r3
                r0.h = r4
                return
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$THe0xJj-_jK_F8UUaaNg385TeX8, reason: not valid java name */
    public static /* synthetic */ void m562$r8$lambda$THe0xJj_jK_F8UUaaNg385TeX8(ca.dnamobile.javalauncher.skin.PlayerModelPreviewView r0, java.lang.String r1, int r2) {
            r0.lambda$setCapeUrl$3(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$U4pwbGULlA0j0W8SWbYDzrV-fyM, reason: not valid java name */
    public static /* synthetic */ void m563$r8$lambda$U4pwbGULlA0j0W8SWbYDzrVfyM(ca.dnamobile.javalauncher.skin.PlayerModelPreviewView r0, java.lang.String r1, int r2) {
            r0.lambda$setSkinUrl$1(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$aj-7qJv9ZZU11Sh9G37hfBDZmzA, reason: not valid java name */
    public static /* synthetic */ void m564$r8$lambda$aj7qJv9ZZU11Sh9G37hfBDZmzA(ca.dnamobile.javalauncher.skin.PlayerModelPreviewView r0, int r1, android.graphics.Bitmap r2) {
            r0.lambda$setSkinUrl$0(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$y0ll-jKDXU6WeyWRNc4yT6cnOxg, reason: not valid java name */
    public static /* synthetic */ void m565$r8$lambda$y0lljKDXU6WeyWRNc4yT6cnOxg(ca.dnamobile.javalauncher.skin.PlayerModelPreviewView r0, int r1, android.graphics.Bitmap r2) {
            r0.lambda$setCapeUrl$2(r1, r2)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$fgetanimationRunning, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m566$$Nest$fgetanimationRunning(ca.dnamobile.javalauncher.skin.PlayerModelPreviewView r0) {
            boolean r0 = r0.animationRunning
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mhasSkin, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m567$$Nest$mhasSkin(ca.dnamobile.javalauncher.skin.PlayerModelPreviewView r0) {
            boolean r0 = r0.hasSkin()
            return r0
    }

    public PlayerModelPreviewView(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            android.graphics.Paint r2 = new android.graphics.Paint
            r0 = 4
            r2.<init>(r0)
            r1.pixelPaint = r2
            android.graphics.Paint r2 = new android.graphics.Paint
            r0 = 5
            r2.<init>(r0)
            r1.uiPaint = r2
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$1 r2 = new ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$1
            r2.<init>(r1)
            r1.animationTick = r2
            r1.init()
            return
    }

    public PlayerModelPreviewView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            android.graphics.Paint r1 = new android.graphics.Paint
            r2 = 4
            r1.<init>(r2)
            r0.pixelPaint = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r2 = 5
            r1.<init>(r2)
            r0.uiPaint = r1
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$1 r1 = new ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$1
            r1.<init>(r0)
            r0.animationTick = r1
            r0.init()
            return
    }

    public PlayerModelPreviewView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            android.graphics.Paint r1 = new android.graphics.Paint
            r2 = 4
            r1.<init>(r2)
            r0.pixelPaint = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r2 = 5
            r1.<init>(r2)
            r0.uiPaint = r1
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$1 r1 = new ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$1
            r1.<init>(r0)
            r0.animationTick = r1
            r0.init()
            return
    }

    private static int boundaryDifference(android.graphics.Bitmap r6, ca.dnamobile.javalauncher.skin.PlayerModelPreviewView.Uv r7, int r8) {
            int r0 = r7.x
            int r1 = r7.w
            int r0 = r0 + r1
            r1 = 1
            int r0 = r0 - r1
            int r2 = r7.y
            int r3 = r7.h
            android.graphics.Rect r0 = skinSourceRect(r6, r0, r2, r1, r3)
            int r2 = r7.y
            int r7 = r7.h
            android.graphics.Rect r7 = skinSourceRect(r6, r8, r2, r1, r7)
            r8 = 0
            if (r0 == 0) goto L4b
            if (r7 != 0) goto L1d
            goto L4b
        L1d:
            int r1 = r0.height()
            int r2 = r7.height()
            int r1 = java.lang.Math.min(r1, r2)
            if (r1 > 0) goto L2c
            return r8
        L2c:
            r2 = r8
        L2d:
            if (r8 >= r1) goto L49
            int r3 = r0.top
            int r3 = r3 + r8
            int r4 = r7.top
            int r4 = r4 + r8
            int r5 = r0.left
            int r3 = r6.getPixel(r5, r3)
            int r5 = r7.left
            int r4 = r6.getPixel(r5, r4)
            int r3 = colorDistance(r3, r4)
            int r2 = r2 + r3
            int r8 = r8 + 1
            goto L2d
        L49:
            int r2 = r2 / r1
            return r2
        L4b:
            return r8
    }

    private static int colorDistance(int r6, int r7) {
            int r0 = r6 >>> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r6 >>> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r2 = r6 >>> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r3 = r7 >>> 24
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r4 = r7 >>> 16
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r5 = r7 >>> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r0 = r0 - r3
            int r0 = java.lang.Math.abs(r0)
            int r1 = r1 - r4
            int r1 = java.lang.Math.abs(r1)
            int r0 = r0 + r1
            int r2 = r2 - r5
            int r1 = java.lang.Math.abs(r2)
            int r0 = r0 + r1
            int r6 = r6 - r7
            int r6 = java.lang.Math.abs(r6)
            int r0 = r0 + r6
            int r0 = r0 / 4
            return r0
    }

    private static boolean detectLikelySlimArms(android.graphics.Bitmap r9) {
            int r0 = r9.getWidth()
            r1 = 0
            r2 = 64
            if (r0 < r2) goto L63
            int r0 = r9.getHeight()
            if (r0 >= r2) goto L10
            goto L63
        L10:
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv r0 = new ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv
            r2 = 44
            r3 = 20
            r4 = 3
            r5 = 12
            r0.<init>(r2, r3, r4, r5)
            r2 = 47
            int r0 = boundaryDifference(r9, r0, r2)
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv r2 = new ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv
            r6 = 51
            r2.<init>(r6, r3, r4, r5)
            r3 = 54
            int r2 = boundaryDifference(r9, r2, r3)
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv r3 = new ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv
            r6 = 36
            r7 = 52
            r3.<init>(r6, r7, r4, r5)
            r6 = 39
            int r3 = boundaryDifference(r9, r3, r6)
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv r6 = new ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv
            r8 = 43
            r6.<init>(r8, r7, r4, r5)
            r4 = 46
            int r9 = boundaryDifference(r9, r6, r4)
            r4 = 34
            r5 = 1
            if (r0 <= r4) goto L52
            r0 = r5
            goto L53
        L52:
            r0 = r1
        L53:
            if (r2 <= r4) goto L57
            int r0 = r0 + 1
        L57:
            if (r3 <= r4) goto L5b
            int r0 = r0 + 1
        L5b:
            if (r9 <= r4) goto L5f
            int r0 = r0 + 1
        L5f:
            r9 = 2
            if (r0 < r9) goto L63
            r1 = r5
        L63:
            return r1
    }

    private static android.graphics.Bitmap downloadBitmap(java.lang.String r4) {
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L55
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L55
            java.net.URLConnection r4 = r1.openConnection()     // Catch: java.lang.Throwable -> L55
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch: java.lang.Throwable -> L55
            r1 = 12000(0x2ee0, float:1.6816E-41)
            r4.setConnectTimeout(r1)     // Catch: java.lang.Throwable -> L56
            r1 = 15000(0x3a98, float:2.102E-41)
            r4.setReadTimeout(r1)     // Catch: java.lang.Throwable -> L56
            r1 = 1
            r4.setUseCaches(r1)     // Catch: java.lang.Throwable -> L56
            int r1 = r4.getResponseCode()     // Catch: java.lang.Throwable -> L56
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 < r2) goto L4f
            r2 = 300(0x12c, float:4.2E-43)
            if (r1 < r2) goto L27
            goto L4f
        L27:
            java.io.InputStream r1 = r4.getInputStream()     // Catch: java.lang.Throwable -> L56
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L43
            r2.<init>()     // Catch: java.lang.Throwable -> L43
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L43
            r2.inPreferredConfig = r3     // Catch: java.lang.Throwable -> L43
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r1, r0, r2)     // Catch: java.lang.Throwable -> L43
            if (r1 == 0) goto L3d
            r1.close()     // Catch: java.lang.Throwable -> L56
        L3d:
            if (r4 == 0) goto L42
            r4.disconnect()
        L42:
            return r2
        L43:
            r2 = move-exception
            if (r1 == 0) goto L4e
            r1.close()     // Catch: java.lang.Throwable -> L4a
            goto L4e
        L4a:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch: java.lang.Throwable -> L56
        L4e:
            throw r2     // Catch: java.lang.Throwable -> L56
        L4f:
            if (r4 == 0) goto L54
            r4.disconnect()
        L54:
            return r0
        L55:
            r4 = r0
        L56:
            if (r4 == 0) goto L5b
            r4.disconnect()
        L5b:
            return r0
    }

    private float dp(float r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r2 = r2 * r0
            return r2
    }

    private void drawArm(android.graphics.Canvas r10, android.graphics.RectF r11, int r12, int r13, boolean r14) {
            r9 = this;
            r0 = 0
            r1 = 1
            if (r12 != r1) goto L6
            r12 = r1
            goto L7
        L6:
            r12 = r0
        L7:
            boolean r2 = r9.isOldSkin()
            if (r12 == 0) goto L14
            if (r2 != 0) goto L14
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv r0 = leftArmUv(r13, r0, r14)
            goto L18
        L14:
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv r0 = rightArmUv(r13, r0, r14)
        L18:
            r5 = r0
            if (r12 == 0) goto L22
            if (r2 != 0) goto L22
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv r12 = leftArmUv(r13, r1, r14)
            goto L26
        L22:
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv r12 = rightArmUv(r13, r1, r14)
        L26:
            r6 = r12
            r8 = 0
            r3 = r9
            r4 = r10
            r7 = r11
            boolean r12 = r3.drawSkinPart(r4, r5, r6, r7, r8)
            if (r12 != 0) goto L34
            r9.drawFallbackArm(r10, r11)
        L34:
            return
    }

    private void drawArmAnimated(android.graphics.Canvas r5, android.graphics.RectF r6, int r7, int r8, boolean r9, float r10) {
            r4 = this;
            float r0 = java.lang.Math.abs(r10)
            r1 = 1036831949(0x3dcccccd, float:0.1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto Lf
            r4.drawArm(r5, r6, r7, r8, r9)
            return
        Lf:
            r5.save()
            float r0 = r6.centerX()
            float r1 = r6.top
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = r4.dp(r2)
            float r2 = java.lang.Math.max(r2, r3)
            float r1 = r1 + r2
            r5.rotate(r10, r0, r1)
            r4.drawArm(r5, r6, r7, r8, r9)
            r5.restore()
            return
    }

    private void drawBackground(android.graphics.Canvas r11, float r12, float r13) {
            r10 = this;
            android.graphics.Paint r0 = r10.uiPaint
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            android.graphics.Paint r0 = r10.uiPaint
            r1 = 32
            r2 = 255(0xff, float:3.57E-43)
            int r1 = android.graphics.Color.argb(r1, r2, r2, r2)
            r0.setColor(r1)
            android.graphics.RectF r0 = new android.graphics.RectF
            r1 = 0
            r0.<init>(r1, r1, r12, r13)
            r12 = 1101004800(0x41a00000, float:20.0)
            float r13 = r10.dp(r12)
            float r1 = r10.dp(r12)
            android.graphics.Paint r3 = r10.uiPaint
            r11.drawRoundRect(r0, r13, r1, r3)
            android.graphics.Paint r13 = r10.uiPaint
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r13.setStyle(r1)
            android.graphics.Paint r13 = r10.uiPaint
            r1 = 1065353216(0x3f800000, float:1.0)
            float r3 = r10.dp(r1)
            float r3 = java.lang.Math.max(r1, r3)
            r13.setStrokeWidth(r3)
            android.graphics.Paint r13 = r10.uiPaint
            r3 = 72
            int r2 = android.graphics.Color.argb(r3, r2, r2, r2)
            r13.setColor(r2)
            float r13 = r0.left
            float r3 = r13 + r1
            float r13 = r0.top
            float r4 = r13 + r1
            float r13 = r0.right
            float r5 = r13 - r1
            float r13 = r0.bottom
            float r6 = r13 - r1
            float r7 = r10.dp(r12)
            float r8 = r10.dp(r12)
            android.graphics.Paint r9 = r10.uiPaint
            r2 = r11
            r2.drawRoundRect(r3, r4, r5, r6, r7, r8, r9)
            return
    }

    private void drawBody(android.graphics.Canvas r11, android.graphics.RectF r12, int r13) {
            r10 = this;
            r0 = 3
            r1 = 1
            if (r13 == r1) goto La
            if (r13 != r0) goto L7
            goto La
        L7:
            r2 = 8
            goto Lb
        La:
            r2 = 4
        Lb:
            r3 = 20
            if (r13 == r1) goto L1c
            r4 = 2
            if (r13 == r4) goto L19
            if (r13 == r0) goto L16
            r13 = r3
            goto L1e
        L16:
            r13 = 28
            goto L1e
        L19:
            r13 = 32
            goto L1e
        L1c:
            r13 = 16
        L1e:
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv r6 = new ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv
            r0 = 12
            r6.<init>(r13, r3, r2, r0)
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv r7 = new ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv
            r3 = 36
            r7.<init>(r13, r3, r2, r0)
            r9 = 0
            r4 = r10
            r5 = r11
            r8 = r12
            boolean r13 = r4.drawSkinPart(r5, r6, r7, r8, r9)
            if (r13 != 0) goto L43
            r13 = 126(0x7e, float:1.77E-43)
            r0 = 164(0xa4, float:2.3E-43)
            r2 = 68
            int r13 = android.graphics.Color.rgb(r2, r13, r0)
            r10.drawFallbackRect(r11, r12, r13, r1)
        L43:
            return
    }

    private void drawCapeBack(android.graphics.Canvas r8, android.graphics.RectF r9) {
            r7 = this;
            r4 = 10
            r5 = 16
            r2 = 1
            r3 = 1
            r0 = r7
            r1 = r8
            r6 = r9
            boolean r0 = r0.drawCapeRegion(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L15
            r7.drawCapePlaceholder(r8, r9)
            r7.drawOutline(r8, r9)
        L15:
            return
    }

    private void drawCapePlaceholder(android.graphics.Canvas r11, android.graphics.RectF r12) {
            r10 = this;
            android.graphics.Paint r0 = r10.uiPaint
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            android.graphics.Paint r0 = r10.uiPaint
            r1 = 54
            r2 = 45
            r3 = 76
            int r1 = android.graphics.Color.rgb(r3, r1, r2)
            r0.setColor(r1)
            android.graphics.RectF r0 = snapped(r12)
            android.graphics.Paint r1 = r10.uiPaint
            r11.drawRect(r0, r1)
            android.graphics.Paint r0 = r10.uiPaint
            r1 = 255(0xff, float:3.57E-43)
            r2 = 55
            int r1 = android.graphics.Color.argb(r2, r1, r1, r1)
            r0.setColor(r1)
            float r0 = r12.left
            float r1 = r12.width()
            r3 = 1036831949(0x3dcccccd, float:0.1)
            float r1 = r1 * r3
            float r5 = r0 + r1
            float r0 = r12.top
            float r1 = r12.height()
            r4 = 1031127695(0x3d75c28f, float:0.06)
            float r1 = r1 * r4
            float r6 = r0 + r1
            float r0 = r12.right
            float r1 = r12.width()
            float r1 = r1 * r3
            float r7 = r0 - r1
            float r0 = r12.top
            float r1 = r12.height()
            r3 = 1042536202(0x3e23d70a, float:0.16)
            float r1 = r1 * r3
            float r8 = r0 + r1
            android.graphics.Paint r9 = r10.uiPaint
            r4 = r11
            r4.drawRect(r5, r6, r7, r8, r9)
            android.graphics.Paint r0 = r10.uiPaint
            r1 = 0
            int r1 = android.graphics.Color.argb(r2, r1, r1, r1)
            r0.setColor(r1)
            float r0 = r12.right
            float r1 = r12.width()
            r2 = 1043878380(0x3e3851ec, float:0.18)
            float r1 = r1 * r2
            float r3 = r0 - r1
            float r4 = r12.top
            float r5 = r12.right
            float r6 = r12.bottom
            android.graphics.Paint r7 = r10.uiPaint
            r2 = r11
            r2.drawRect(r3, r4, r5, r6, r7)
            return
    }

    private boolean drawCapeRegion(android.graphics.Canvas r9, int r10, int r11, int r12, int r13, android.graphics.RectF r14) {
            r8 = this;
            android.graphics.Bitmap r0 = r8.cape
            r1 = 0
            if (r0 == 0) goto L69
            boolean r2 = r0.isRecycled()
            if (r2 == 0) goto Lc
            goto L69
        Lc:
            int r2 = r0.getWidth()
            int r3 = r0.getHeight()
            r4 = 12
            if (r2 < r4) goto L69
            r4 = 17
            if (r3 >= r4) goto L1d
            goto L69
        L1d:
            float r10 = (float) r10
            r4 = 1115684864(0x42800000, float:64.0)
            float r10 = r10 / r4
            float r5 = (float) r2
            float r10 = r10 * r5
            int r10 = java.lang.Math.round(r10)
            float r11 = (float) r11
            r6 = 1107296256(0x42000000, float:32.0)
            float r11 = r11 / r6
            float r7 = (float) r3
            float r11 = r11 * r7
            int r11 = java.lang.Math.round(r11)
            float r12 = (float) r12
            float r12 = r12 / r4
            float r12 = r12 * r5
            int r12 = java.lang.Math.round(r12)
            r4 = 1
            int r12 = java.lang.Math.max(r4, r12)
            float r13 = (float) r13
            float r13 = r13 / r6
            float r13 = r13 * r7
            int r13 = java.lang.Math.round(r13)
            int r13 = java.lang.Math.max(r4, r13)
            if (r10 < 0) goto L69
            if (r11 < 0) goto L69
            int r12 = r12 + r10
            if (r12 > r2) goto L69
            int r13 = r13 + r11
            if (r13 <= r3) goto L53
            goto L69
        L53:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r10, r11, r12, r13)
            boolean r10 = hasVisiblePixels(r0, r2)
            if (r10 != 0) goto L5f
            return r1
        L5f:
            android.graphics.RectF r10 = snapped(r14)
            android.graphics.Paint r11 = r8.pixelPaint
            r9.drawBitmap(r0, r2, r10, r11)
            return r4
        L69:
            return r1
    }

    private void drawCapeSide(android.graphics.Canvas r9, android.graphics.RectF r10, boolean r11) {
            r8 = this;
            if (r11 == 0) goto L4
            r0 = 0
            goto L6
        L4:
            r0 = 11
        L6:
            r3 = r0
            r5 = 1
            r6 = 16
            r4 = 1
            r1 = r8
            r2 = r9
            r7 = r10
            boolean r0 = r1.drawCapeRegion(r2, r3, r4, r5, r6, r7)
            if (r0 != 0) goto L26
            if (r11 == 0) goto L18
            r11 = 1
            goto L1a
        L18:
            r11 = 10
        L1a:
            r2 = r11
            r4 = 1
            r5 = 16
            r3 = 1
            r0 = r8
            r1 = r9
            r6 = r10
            boolean r0 = r0.drawCapeRegion(r1, r2, r3, r4, r5, r6)
        L26:
            if (r0 == 0) goto L29
            goto L2f
        L29:
            r8.drawCapePlaceholder(r9, r10)
            r8.drawOutline(r9, r10)
        L2f:
            return
    }

    private void drawFallbackArm(android.graphics.Canvas r9, android.graphics.RectF r10) {
            r8 = this;
            r0 = 126(0x7e, float:1.77E-43)
            r1 = 164(0xa4, float:2.3E-43)
            r2 = 68
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            r1 = 1
            r8.drawFallbackRect(r9, r10, r0, r1)
            android.graphics.Paint r0 = r8.uiPaint
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            android.graphics.Paint r0 = r8.uiPaint
            r1 = 142(0x8e, float:1.99E-43)
            r2 = 105(0x69, float:1.47E-43)
            r3 = 190(0xbe, float:2.66E-43)
            int r1 = android.graphics.Color.rgb(r3, r1, r2)
            r0.setColor(r1)
            float r3 = r10.left
            float r0 = r10.bottom
            float r1 = r10.height()
            r2 = 1046562734(0x3e6147ae, float:0.22)
            float r1 = r1 * r2
            float r4 = r0 - r1
            float r5 = r10.right
            float r6 = r10.bottom
            android.graphics.Paint r7 = r8.uiPaint
            r2 = r9
            r2.drawRect(r3, r4, r5, r6, r7)
            return
    }

    private void drawFallbackHead(android.graphics.Canvas r12, android.graphics.RectF r13, int r14) {
            r11 = this;
            r0 = 142(0x8e, float:1.99E-43)
            r1 = 105(0x69, float:1.47E-43)
            r2 = 190(0xbe, float:2.66E-43)
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            r1 = 1
            r11.drawFallbackRect(r12, r13, r0, r1)
            android.graphics.Paint r0 = r11.uiPaint
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            android.graphics.Paint r0 = r11.uiPaint
            r1 = 47
            r2 = 35
            r3 = 74
            int r1 = android.graphics.Color.rgb(r3, r1, r2)
            r0.setColor(r1)
            float r3 = r13.left
            float r4 = r13.top
            float r5 = r13.right
            float r0 = r13.top
            float r1 = r13.height()
            r2 = 1046562734(0x3e6147ae, float:0.22)
            float r1 = r1 * r2
            float r6 = r0 + r1
            android.graphics.Paint r7 = r11.uiPaint
            r2 = r12
            r2.drawRect(r3, r4, r5, r6, r7)
            if (r14 != 0) goto Lab
            android.graphics.Paint r14 = r11.uiPaint
            r0 = 70
            r1 = 88
            r2 = 55
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            r14.setColor(r0)
            float r14 = r13.left
            float r0 = r13.width()
            r1 = 1049582633(0x3e8f5c29, float:0.28)
            float r0 = r0 * r1
            float r3 = r14 + r0
            float r14 = r13.top
            float r0 = r13.height()
            r8 = 1053609165(0x3ecccccd, float:0.4)
            float r0 = r0 * r8
            float r4 = r14 + r0
            float r14 = r13.left
            float r0 = r13.width()
            r9 = 1052938076(0x3ec28f5c, float:0.38)
            float r0 = r0 * r9
            float r5 = r14 + r0
            float r14 = r13.top
            float r0 = r13.height()
            r10 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r10
            float r6 = r14 + r0
            android.graphics.Paint r7 = r11.uiPaint
            r2 = r12
            r2.drawRect(r3, r4, r5, r6, r7)
            float r14 = r13.right
            float r0 = r13.width()
            float r0 = r0 * r9
            float r3 = r14 - r0
            float r14 = r13.top
            float r0 = r13.height()
            float r0 = r0 * r8
            float r4 = r14 + r0
            float r14 = r13.right
            float r0 = r13.width()
            float r0 = r0 * r1
            float r5 = r14 - r0
            float r14 = r13.top
            float r13 = r13.height()
            float r13 = r13 * r10
            float r6 = r14 + r13
            android.graphics.Paint r7 = r11.uiPaint
            r2.drawRect(r3, r4, r5, r6, r7)
        Lab:
            return
    }

    private void drawFallbackRect(android.graphics.Canvas r3, android.graphics.RectF r4, int r5, boolean r6) {
            r2 = this;
            r2.drawShadow(r3, r4)
            android.graphics.Paint r0 = r2.uiPaint
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            android.graphics.Paint r0 = r2.uiPaint
            r0.setColor(r5)
            android.graphics.RectF r5 = snapped(r4)
            android.graphics.Paint r0 = r2.uiPaint
            r3.drawRect(r5, r0)
            if (r6 == 0) goto L1d
            r2.drawOutline(r3, r4)
        L1d:
            return
    }

    private void drawFrontBackModel(android.graphics.Canvas r17, float r18, float r19, float r20, boolean r21, boolean r22) {
            r16 = this;
            r7 = r16
            r8 = r17
            r0 = r18
            r3 = r21
            r1 = 1098907648(0x41800000, float:16.0)
            if (r22 == 0) goto Lf
            r2 = 1094713344(0x41400000, float:12.0)
            goto L10
        Lf:
            r2 = r1
        L10:
            float r2 = r2 * r20
            float r4 = r0 + r2
            r5 = 1107296256(0x42000000, float:32.0)
            float r5 = r5 * r20
            float r5 = r5 + r4
            float r1 = r1 * r20
            float r6 = r4 + r1
            r9 = r3 ^ 1
            if (r3 == 0) goto L23
            r10 = 2
            goto L24
        L23:
            r10 = 0
        L24:
            android.graphics.RectF r11 = new android.graphics.RectF
            r12 = 1112014848(0x42480000, float:50.0)
            float r12 = r12 * r20
            float r12 = r19 + r12
            r13 = 1120927744(0x42d00000, float:104.0)
            float r13 = r13 * r20
            float r13 = r19 + r13
            r11.<init>(r0, r12, r4, r13)
            android.graphics.RectF r14 = new android.graphics.RectF
            float r2 = r2 + r5
            r14.<init>(r5, r12, r2, r13)
            android.graphics.RectF r0 = new android.graphics.RectF
            r2 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 * r20
            float r2 = r19 + r2
            r13 = 1125384192(0x43140000, float:148.0)
            float r13 = r13 * r20
            float r13 = r19 + r13
            r0.<init>(r4, r2, r6, r13)
            android.graphics.RectF r15 = new android.graphics.RectF
            float r1 = r1 + r6
            r15.<init>(r6, r2, r1, r13)
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>(r4, r12, r5, r2)
            android.graphics.RectF r6 = new android.graphics.RectF
            r2 = 1099956224(0x41900000, float:18.0)
            float r2 = r2 * r20
            float r2 = r19 + r2
            r6.<init>(r4, r2, r5, r12)
            r7.drawLeg(r8, r0, r3, r10)
            r7.drawLeg(r8, r15, r9, r10)
            r7.drawBody(r8, r1, r10)
            if (r3 == 0) goto L8b
            boolean r0 = r16.hasCape()
            if (r0 == 0) goto L8b
            android.graphics.RectF r0 = new android.graphics.RectF
            float r2 = r1.left
            r4 = 1069547520(0x3fc00000, float:1.5)
            float r4 = r4 * r20
            float r2 = r2 + r4
            r5 = 1111490560(0x42400000, float:48.0)
            float r5 = r5 * r20
            float r5 = r19 + r5
            float r1 = r1.right
            float r1 = r1 - r4
            r0.<init>(r2, r5, r1, r13)
            r7.drawCapeBack(r8, r0)
        L8b:
            float r12 = r16.idleArmSwingDegrees()
            r0 = r16
            r1 = r17
            r2 = r11
            r3 = r21
            r4 = r10
            r5 = r22
            r11 = r6
            r6 = r12
            r0.drawArmAnimated(r1, r2, r3, r4, r5, r6)
            float r6 = -r12
            r2 = r14
            r3 = r9
            r0.drawArmAnimated(r1, r2, r3, r4, r5, r6)
            r7.drawHead(r8, r11, r10)
            return
    }

    private void drawHead(android.graphics.Canvas r9, android.graphics.RectF r10, int r11) {
            r8 = this;
            r0 = 1
            r1 = 8
            if (r11 == r0) goto L13
            r0 = 2
            if (r11 == r0) goto L10
            r0 = 3
            if (r11 == r0) goto Ld
            r0 = r1
            goto L14
        Ld:
            r0 = 16
            goto L14
        L10:
            r0 = 24
            goto L14
        L13:
            r0 = 0
        L14:
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv r4 = new ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv
            r4.<init>(r0, r1, r1, r1)
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv r5 = new ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv
            int r0 = r0 + 32
            r5.<init>(r0, r1, r1, r1)
            r7 = 1
            r2 = r8
            r3 = r9
            r6 = r10
            boolean r0 = r2.drawSkinPart(r3, r4, r5, r6, r7)
            if (r0 != 0) goto L2d
            r8.drawFallbackHead(r9, r10, r11)
        L2d:
            return
    }

    private void drawLeg(android.graphics.Canvas r10, android.graphics.RectF r11, int r12, int r13) {
            r9 = this;
            r0 = 0
            r1 = 1
            if (r12 != r1) goto L6
            r12 = r1
            goto L7
        L6:
            r12 = r0
        L7:
            boolean r2 = r9.isOldSkin()
            if (r12 == 0) goto L14
            if (r2 != 0) goto L14
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv r0 = leftLegUv(r13, r0)
            goto L18
        L14:
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv r0 = rightLegUv(r13, r0)
        L18:
            r5 = r0
            if (r12 == 0) goto L22
            if (r2 != 0) goto L22
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv r12 = leftLegUv(r13, r1)
            goto L26
        L22:
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv r12 = rightLegUv(r13, r1)
        L26:
            r6 = r12
            r8 = 0
            r3 = r9
            r4 = r10
            r7 = r11
            boolean r12 = r3.drawSkinPart(r4, r5, r6, r7, r8)
            if (r12 != 0) goto L44
            boolean r12 = r9.hasSkin()
            if (r12 != 0) goto L44
            r12 = 76
            r13 = 164(0xa4, float:2.3E-43)
            r0 = 67
            int r12 = android.graphics.Color.rgb(r0, r12, r13)
            r9.drawFallbackRect(r10, r11, r12, r1)
        L44:
            return
    }

    private void drawModel(android.graphics.Canvas r12, float r13, float r14, float r15, int r16, boolean r17) {
            r11 = this;
            r0 = r16
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L1b
            r3 = 3
            if (r0 != r3) goto La
            goto L1b
        La:
            r3 = 2
            if (r0 != r3) goto Lf
            r9 = r2
            goto L10
        Lf:
            r9 = r1
        L10:
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r10 = r17
            r4.drawFrontBackModel(r5, r6, r7, r8, r9, r10)
            goto L2a
        L1b:
            if (r0 != r2) goto L1f
            r5 = r2
            goto L20
        L1f:
            r5 = r1
        L20:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r6 = r17
            r0.drawSideModel(r1, r2, r3, r4, r5, r6)
        L2a:
            return
    }

    private void drawOutline(android.graphics.Canvas r4, android.graphics.RectF r5) {
            r3 = this;
            android.graphics.Paint r0 = r3.uiPaint
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r1)
            android.graphics.Paint r0 = r3.uiPaint
            r1 = 1058642330(0x3f19999a, float:0.6)
            float r1 = r3.dp(r1)
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = java.lang.Math.max(r2, r1)
            r0.setStrokeWidth(r1)
            android.graphics.Paint r0 = r3.uiPaint
            r1 = 90
            r2 = 0
            int r1 = android.graphics.Color.argb(r1, r2, r2, r2)
            r0.setColor(r1)
            android.graphics.RectF r5 = snapped(r5)
            android.graphics.Paint r0 = r3.uiPaint
            r4.drawRect(r5, r0)
            return
    }

    private void drawRotationHint(android.graphics.Canvas r4, float r5, float r6, int r7) {
            r3 = this;
            r0 = 1
            if (r7 == r0) goto L1b
            r0 = 2
            if (r7 == r0) goto Lf
            r0 = 3
            if (r7 == r0) goto Lc
            java.lang.String r7 = "Front"
            goto L1d
        Lc:
            java.lang.String r7 = "Left"
            goto L1d
        Lf:
            boolean r7 = r3.hasCape()
            if (r7 == 0) goto L18
            java.lang.String r7 = "Back • cape"
            goto L1d
        L18:
            java.lang.String r7 = "Back"
            goto L1d
        L1b:
            java.lang.String r7 = "Right"
        L1d:
            android.graphics.Paint r0 = r3.uiPaint
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            android.graphics.Paint r0 = r3.uiPaint
            r1 = 145(0x91, float:2.03E-43)
            r2 = 255(0xff, float:3.57E-43)
            int r1 = android.graphics.Color.argb(r1, r2, r2, r2)
            r0.setColor(r1)
            android.graphics.Paint r0 = r3.uiPaint
            r1 = 1091567616(0x41100000, float:9.0)
            float r2 = r3.dp(r1)
            r0.setTextSize(r2)
            android.graphics.Paint r0 = r3.uiPaint
            android.graphics.Paint$Align r2 = android.graphics.Paint.Align.CENTER
            r0.setTextAlign(r2)
            java.lang.String r0 = " • drag"
            java.lang.String r7 = r7.concat(r0)
            r0 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r0
            float r0 = r3.dp(r1)
            float r6 = r6 - r0
            android.graphics.Paint r0 = r3.uiPaint
            r4.drawText(r7, r5, r6, r0)
            return
    }

    private void drawShadow(android.graphics.Canvas r4, android.graphics.RectF r5) {
            r3 = this;
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r5)
            r5 = 1067030938(0x3f99999a, float:1.2)
            float r1 = r3.dp(r5)
            float r5 = r3.dp(r5)
            r0.offset(r1, r5)
            android.graphics.Paint r5 = r3.uiPaint
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r5.setStyle(r1)
            android.graphics.Paint r5 = r3.uiPaint
            r1 = 36
            r2 = 0
            int r1 = android.graphics.Color.argb(r1, r2, r2, r2)
            r5.setColor(r1)
            android.graphics.RectF r5 = snapped(r0)
            android.graphics.Paint r0 = r3.uiPaint
            r4.drawRect(r5, r0)
            return
    }

    private void drawSideModel(android.graphics.Canvas r15, float r16, float r17, float r18, boolean r19, boolean r20) {
            r14 = this;
            r7 = r14
            r8 = r15
            r0 = r19
            r1 = 1106771968(0x41f80000, float:31.0)
            float r1 = r1 * r18
            float r9 = r16 + r1
            if (r0 == 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 3
        Lf:
            r10 = r1
            r3 = r0 ^ 1
            r11 = 1098907648(0x41800000, float:16.0)
            if (r20 == 0) goto L19
            r1 = 1094713344(0x41400000, float:12.0)
            goto L1a
        L19:
            r1 = r11
        L1a:
            boolean r2 = r14.hasCape()
            r4 = 1125384192(0x43140000, float:148.0)
            if (r2 == 0) goto L48
            android.graphics.RectF r2 = new android.graphics.RectF
            if (r0 == 0) goto L29
            r5 = -1050673152(0xffffffffc1600000, float:-14.0)
            goto L2b
        L29:
            r5 = 1088421888(0x40e00000, float:7.0)
        L2b:
            float r5 = r5 * r18
            float r5 = r5 + r9
            r6 = 1111490560(0x42400000, float:48.0)
            float r6 = r6 * r18
            float r6 = r17 + r6
            if (r0 == 0) goto L39
            r12 = -1061158912(0xffffffffc0c00000, float:-6.0)
            goto L3b
        L39:
            r12 = 1097859072(0x41700000, float:15.0)
        L3b:
            float r12 = r12 * r18
            float r12 = r12 + r9
            float r13 = r18 * r4
            float r13 = r17 + r13
            r2.<init>(r5, r6, r12, r13)
            r14.drawCapeSide(r15, r2, r0)
        L48:
            android.graphics.RectF r2 = new android.graphics.RectF
            r5 = 1090519040(0x41000000, float:8.0)
            float r5 = r5 * r18
            float r6 = r9 - r5
            r12 = 1120403456(0x42c80000, float:100.0)
            float r12 = r12 * r18
            float r12 = r17 + r12
            float r5 = r5 + r9
            float r4 = r4 * r18
            float r4 = r17 + r4
            r2.<init>(r6, r12, r5, r4)
            r14.drawLeg(r15, r2, r3, r10)
            android.graphics.RectF r2 = new android.graphics.RectF
            r4 = 1112014848(0x42480000, float:50.0)
            float r4 = r4 * r18
            float r13 = r17 + r4
            r2.<init>(r6, r13, r5, r12)
            r14.drawBody(r15, r2, r10)
            android.graphics.RectF r2 = new android.graphics.RectF
            r4 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 + r4
            float r1 = r1 * r18
            float r1 = r9 - r1
            r5 = 1112276992(0x424c0000, float:51.0)
            float r5 = r5 * r18
            float r5 = r17 + r5
            float r4 = r4 * r18
            float r4 = r9 - r4
            r6 = 1121058816(0x42d20000, float:105.0)
            float r6 = r6 * r18
            float r6 = r17 + r6
            r2.<init>(r1, r5, r4, r6)
            if (r0 == 0) goto L92
            float r0 = r14.idleArmSwingDegrees()
            goto L97
        L92:
            float r0 = r14.idleArmSwingDegrees()
            float r0 = -r0
        L97:
            r6 = r0
            r0 = r14
            r1 = r15
            r4 = r10
            r5 = r20
            r0.drawArmAnimated(r1, r2, r3, r4, r5, r6)
            android.graphics.RectF r0 = new android.graphics.RectF
            float r1 = r18 * r11
            float r2 = r9 - r1
            r3 = 1099956224(0x41900000, float:18.0)
            float r3 = r3 * r18
            float r3 = r17 + r3
            float r9 = r9 + r1
            r0.<init>(r2, r3, r9, r13)
            r14.drawHead(r15, r0, r10)
            return
    }

    private boolean drawSkinPart(android.graphics.Canvas r6, ca.dnamobile.javalauncher.skin.PlayerModelPreviewView.Uv r7, ca.dnamobile.javalauncher.skin.PlayerModelPreviewView.Uv r8, android.graphics.RectF r9, boolean r10) {
            r5 = this;
            android.graphics.Bitmap r0 = r5.skin
            r1 = 0
            if (r0 == 0) goto L54
            boolean r2 = r0.isRecycled()
            if (r2 == 0) goto Lc
            goto L54
        Lc:
            int r2 = r7.x
            int r3 = r7.y
            int r4 = r7.w
            int r7 = r7.h
            android.graphics.Rect r7 = skinSourceRect(r0, r2, r3, r4, r7)
            int r2 = r8.x
            int r3 = r8.y
            int r4 = r8.w
            int r8 = r8.h
            android.graphics.Rect r8 = skinSourceRect(r0, r2, r3, r4, r8)
            r2 = 1
            if (r7 == 0) goto L37
            boolean r3 = hasVisiblePixels(r0, r7)
            if (r3 == 0) goto L37
            android.graphics.RectF r1 = snapped(r9)
            android.graphics.Paint r3 = r5.pixelPaint
            r6.drawBitmap(r0, r7, r1, r3)
            r1 = r2
        L37:
            if (r8 == 0) goto L52
            boolean r7 = hasUsefulOverlay(r0, r8)
            if (r7 == 0) goto L52
            if (r10 == 0) goto L48
            r7 = 1065940419(0x3f88f5c3, float:1.07)
            android.graphics.RectF r9 = expanded(r9, r7)
        L48:
            android.graphics.RectF r7 = snapped(r9)
            android.graphics.Paint r9 = r5.pixelPaint
            r6.drawBitmap(r0, r8, r7, r9)
            goto L53
        L52:
            r2 = r1
        L53:
            return r2
        L54:
            return r1
    }

    private static android.graphics.RectF expanded(android.graphics.RectF r5, float r6) {
            float r0 = r5.width()
            r1 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6 - r1
            float r0 = r0 * r6
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            float r2 = r5.height()
            float r2 = r2 * r6
            float r2 = r2 / r1
            android.graphics.RectF r6 = new android.graphics.RectF
            float r1 = r5.left
            float r1 = r1 - r0
            float r3 = r5.top
            float r3 = r3 - r2
            float r4 = r5.right
            float r4 = r4 + r0
            float r5 = r5.bottom
            float r5 = r5 + r2
            r6.<init>(r1, r3, r4, r5)
            return r6
    }

    private boolean hasCape() {
            r1 = this;
            android.graphics.Bitmap r0 = r1.cape
            if (r0 == 0) goto Lc
            boolean r0 = r0.isRecycled()
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    private boolean hasSkin() {
            r1 = this;
            android.graphics.Bitmap r0 = r1.skin
            if (r0 == 0) goto Lc
            boolean r0 = r0.isRecycled()
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    private static boolean hasUsefulOverlay(android.graphics.Bitmap r11, android.graphics.Rect r12) {
            int r0 = r11.getHeight()
            r1 = 64
            r2 = 0
            if (r0 >= r1) goto La
            return r2
        La:
            boolean r0 = r11.hasAlpha()
            if (r0 != 0) goto L11
            return r2
        L11:
            int r0 = r12.width()
            int r0 = r0 / 6
            r1 = 1
            int r0 = java.lang.Math.max(r1, r0)
            int r3 = r12.height()
            int r3 = r3 / 6
            int r3 = java.lang.Math.max(r1, r3)
            int r4 = r12.top
            r5 = r2
            r6 = r5
            r7 = r6
        L2b:
            int r8 = r12.bottom
            if (r4 >= r8) goto L4f
            int r8 = r12.left
        L31:
            int r9 = r12.right
            if (r8 >= r9) goto L4d
            int r9 = r11.getPixel(r8, r4)
            int r9 = r9 >>> 24
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r5 = r5 + 1
            r10 = 8
            if (r9 <= r10) goto L45
            int r6 = r6 + 1
        L45:
            r10 = 248(0xf8, float:3.48E-43)
            if (r9 >= r10) goto L4b
            int r7 = r7 + 1
        L4b:
            int r8 = r8 + r0
            goto L31
        L4d:
            int r4 = r4 + r3
            goto L2b
        L4f:
            if (r5 <= 0) goto L56
            if (r6 <= 0) goto L56
            if (r7 <= 0) goto L56
            r2 = r1
        L56:
            return r2
    }

    private static boolean hasVisiblePixels(android.graphics.Bitmap r7, android.graphics.Rect r8) {
            int r0 = r8.width()
            int r0 = r0 / 5
            r1 = 1
            int r0 = java.lang.Math.max(r1, r0)
            int r2 = r8.height()
            int r2 = r2 / 5
            int r2 = java.lang.Math.max(r1, r2)
            int r3 = r8.top
        L17:
            int r4 = r8.bottom
            if (r3 >= r4) goto L32
            int r4 = r8.left
        L1d:
            int r5 = r8.right
            if (r4 >= r5) goto L30
            int r5 = r7.getPixel(r4, r3)
            int r5 = r5 >>> 24
            r5 = r5 & 255(0xff, float:3.57E-43)
            r6 = 8
            if (r5 <= r6) goto L2e
            return r1
        L2e:
            int r4 = r4 + r0
            goto L1d
        L30:
            int r3 = r3 + r2
            goto L17
        L32:
            r7 = 0
            return r7
    }

    private float idleArmSwingDegrees() {
            r4 = this;
            boolean r0 = r4.dragging
            if (r0 == 0) goto L6
            r0 = 0
            return r0
        L6:
            long r0 = android.os.SystemClock.uptimeMillis()
            double r0 = (double) r0
            r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 / r2
            r2 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r0 = r0 * r2
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = r0 * r2
            r2 = 4604930618986332160(0x3fe8000000000000, double:0.75)
            double r0 = r0 * r2
            double r0 = java.lang.Math.sin(r0)
            float r0 = (float) r0
            r1 = 1082130432(0x40800000, float:4.0)
            float r0 = r0 * r1
            return r0
    }

    private void init() {
            r2 = this;
            r0 = 0
            r2.setWillNotDraw(r0)
            r1 = 1
            r2.setFocusable(r1)
            r2.setClickable(r1)
            android.graphics.Paint r1 = r2.pixelPaint
            r1.setAntiAlias(r0)
            android.graphics.Paint r1 = r2.pixelPaint
            r1.setFilterBitmap(r0)
            android.graphics.Paint r1 = r2.pixelPaint
            r1.setDither(r0)
            android.graphics.Paint r1 = r2.uiPaint
            r1.setFilterBitmap(r0)
            return
    }

    private boolean isOldSkin() {
            r2 = this;
            android.graphics.Bitmap r0 = r2.skin
            if (r0 == 0) goto L15
            boolean r1 = r0.isRecycled()
            if (r1 != 0) goto L15
            int r0 = r0.getHeight()
            r1 = 64
            if (r0 >= r1) goto L13
            goto L15
        L13:
            r0 = 0
            goto L16
        L15:
            r0 = 1
        L16:
            return r0
    }

    private boolean isSlimArms() {
            r2 = this;
            boolean r0 = r2.slimArmsKnown
            if (r0 == 0) goto L7
            boolean r0 = r2.slimArms
            return r0
        L7:
            android.graphics.Bitmap r0 = r2.skin
            if (r0 == 0) goto L1c
            boolean r1 = r0.isRecycled()
            if (r1 == 0) goto L12
            goto L1c
        L12:
            boolean r0 = detectLikelySlimArms(r0)
            r2.slimArms = r0
            r1 = 1
            r2.slimArmsKnown = r1
            return r0
        L1c:
            r0 = 0
            return r0
    }

    private /* synthetic */ void lambda$setCapeUrl$2(int r2, android.graphics.Bitmap r3) {
            r1 = this;
            int r0 = r1.capeGeneration
            if (r2 == r0) goto L10
            if (r3 == 0) goto Lf
            boolean r2 = r3.isRecycled()
            if (r2 != 0) goto Lf
            r3.recycle()
        Lf:
            return
        L10:
            r1.cape = r3
            r1.invalidate()
            return
    }

    private /* synthetic */ void lambda$setCapeUrl$3(java.lang.String r2, int r3) {
            r1 = this;
            android.graphics.Bitmap r2 = downloadBitmap(r2)
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$$ExternalSyntheticLambda3 r0 = new ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$$ExternalSyntheticLambda3
            r0.<init>(r1, r3, r2)
            r1.post(r0)
            return
    }

    private /* synthetic */ void lambda$setSkinUrl$0(int r2, android.graphics.Bitmap r3) {
            r1 = this;
            int r0 = r1.skinGeneration
            if (r2 == r0) goto L10
            if (r3 == 0) goto Lf
            boolean r2 = r3.isRecycled()
            if (r2 != 0) goto Lf
            r3.recycle()
        Lf:
            return
        L10:
            r1.skin = r3
            r2 = 0
            r1.slimArmsKnown = r2
            if (r3 == 0) goto L26
            boolean r2 = r3.isRecycled()
            if (r2 != 0) goto L26
            boolean r2 = detectLikelySlimArms(r3)
            r1.slimArms = r2
            r2 = 1
            r1.slimArmsKnown = r2
        L26:
            r1.invalidate()
            return
    }

    private /* synthetic */ void lambda$setSkinUrl$1(java.lang.String r2, int r3) {
            r1 = this;
            android.graphics.Bitmap r2 = downloadBitmap(r2)
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$$ExternalSyntheticLambda1 r0 = new ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$$ExternalSyntheticLambda1
            r0.<init>(r1, r3, r2)
            r1.post(r0)
            return
    }

    private static ca.dnamobile.javalauncher.skin.PlayerModelPreviewView.Uv leftArmUv(int r6, boolean r7, boolean r8) {
            if (r7 == 0) goto L5
            r7 = 48
            goto L7
        L5:
            r7 = 32
        L7:
            r0 = 2
            r1 = 1
            r2 = 3
            r3 = 4
            r4 = 12
            r5 = 52
            if (r8 == 0) goto L34
            if (r6 == r1) goto L2e
            if (r6 == r0) goto L26
            if (r6 == r2) goto L1e
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv r6 = new ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv
            int r7 = r7 + r3
            r6.<init>(r7, r5, r2, r4)
            return r6
        L1e:
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv r6 = new ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv
            int r7 = r7 + 7
            r6.<init>(r7, r5, r3, r4)
            return r6
        L26:
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv r6 = new ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv
            int r7 = r7 + 11
            r6.<init>(r7, r5, r2, r4)
            return r6
        L2e:
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv r6 = new ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv
            r6.<init>(r7, r5, r3, r4)
            return r6
        L34:
            if (r6 == r1) goto L50
            if (r6 == r0) goto L49
            if (r6 == r2) goto L41
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv r6 = new ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv
            int r7 = r7 + r3
            r6.<init>(r7, r5, r3, r4)
            return r6
        L41:
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv r6 = new ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv
            int r7 = r7 + 8
            r6.<init>(r7, r5, r3, r4)
            return r6
        L49:
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv r6 = new ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv
            int r7 = r7 + r4
            r6.<init>(r7, r5, r3, r4)
            return r6
        L50:
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv r6 = new ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv
            r6.<init>(r7, r5, r3, r4)
            return r6
    }

    private static ca.dnamobile.javalauncher.skin.PlayerModelPreviewView.Uv leftLegUv(int r4, boolean r5) {
            if (r5 == 0) goto L4
            r5 = 0
            goto L6
        L4:
            r5 = 16
        L6:
            r0 = 1
            r1 = 12
            r2 = 4
            r3 = 52
            if (r4 == r0) goto L2a
            r0 = 2
            if (r4 == r0) goto L23
            r0 = 3
            if (r4 == r0) goto L1b
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv r4 = new ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv
            int r5 = r5 + r2
            r4.<init>(r5, r3, r2, r1)
            return r4
        L1b:
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv r4 = new ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv
            int r5 = r5 + 8
            r4.<init>(r5, r3, r2, r1)
            return r4
        L23:
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv r4 = new ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv
            int r5 = r5 + r1
            r4.<init>(r5, r3, r2, r1)
            return r4
        L2a:
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv r4 = new ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv
            r4.<init>(r5, r3, r2, r1)
            return r4
    }

    private static java.lang.String normalizeTextureUrl(java.lang.String r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r3 = r3.trim()
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto Lf
            return r0
        Lf:
            java.lang.String r0 = "//"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "https:"
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            return r3
        L27:
            java.lang.String r0 = "http://textures.minecraft.net/"
            boolean r1 = r3.startsWith(r0)
            if (r1 == 0) goto L46
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "https://textures.minecraft.net/"
            r1.<init>(r2)
            int r0 = r0.length()
            java.lang.String r3 = r3.substring(r0)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
        L46:
            return r3
    }

    private static float normalizeYaw(float r2) {
            r0 = 1135869952(0x43b40000, float:360.0)
            float r2 = r2 % r0
            r1 = 0
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 >= 0) goto L9
            float r2 = r2 + r0
        L9:
            return r2
    }

    private static ca.dnamobile.javalauncher.skin.PlayerModelPreviewView.Uv rightArmUv(int r7, boolean r8, boolean r9) {
            if (r8 == 0) goto L5
            r8 = 36
            goto L7
        L5:
            r8 = 20
        L7:
            r0 = 40
            r1 = 44
            r2 = 2
            r3 = 1
            r4 = 3
            r5 = 4
            r6 = 12
            if (r9 == 0) goto L35
            if (r7 == r3) goto L2f
            if (r7 == r2) goto L27
            if (r7 == r4) goto L1f
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv r7 = new ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv
            r7.<init>(r1, r8, r4, r6)
            return r7
        L1f:
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv r7 = new ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv
            r9 = 47
            r7.<init>(r9, r8, r5, r6)
            return r7
        L27:
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv r7 = new ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv
            r9 = 51
            r7.<init>(r9, r8, r4, r6)
            return r7
        L2f:
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv r7 = new ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv
            r7.<init>(r0, r8, r5, r6)
            return r7
        L35:
            if (r7 == r3) goto L51
            if (r7 == r2) goto L49
            if (r7 == r4) goto L41
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv r7 = new ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv
            r7.<init>(r1, r8, r5, r6)
            return r7
        L41:
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv r7 = new ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv
            r9 = 48
            r7.<init>(r9, r8, r5, r6)
            return r7
        L49:
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv r7 = new ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv
            r9 = 52
            r7.<init>(r9, r8, r5, r6)
            return r7
        L51:
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv r7 = new ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv
            r7.<init>(r0, r8, r5, r6)
            return r7
    }

    private static ca.dnamobile.javalauncher.skin.PlayerModelPreviewView.Uv rightLegUv(int r3, boolean r4) {
            if (r4 == 0) goto L5
            r4 = 36
            goto L7
        L5:
            r4 = 20
        L7:
            r0 = 1
            r1 = 12
            r2 = 4
            if (r3 == r0) goto L27
            r0 = 2
            if (r3 == r0) goto L21
            r0 = 3
            if (r3 == r0) goto L19
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv r3 = new ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv
            r3.<init>(r2, r4, r2, r1)
            return r3
        L19:
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv r3 = new ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv
            r0 = 8
            r3.<init>(r0, r4, r2, r1)
            return r3
        L21:
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv r3 = new ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv
            r3.<init>(r1, r4, r2, r1)
            return r3
        L27:
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv r3 = new ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$Uv
            r0 = 0
            r3.<init>(r0, r4, r2, r1)
            return r3
    }

    private static boolean sameNullable(java.lang.String r0, java.lang.String r1) {
            if (r0 != 0) goto L8
            if (r1 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
        L8:
            boolean r0 = r0.equals(r1)
            return r0
    }

    private static android.graphics.Rect skinSourceRect(android.graphics.Bitmap r5, int r6, int r7, int r8, int r9) {
            int r0 = r5.getWidth()
            int r5 = r5.getHeight()
            r1 = 0
            r2 = 64
            if (r0 < r2) goto L7e
            r3 = 32
            if (r5 >= r3) goto L12
            goto L7e
        L12:
            int r4 = r5 * 2
            if (r4 != r0) goto L17
            goto L18
        L17:
            r3 = r2
        L18:
            if (r6 < 0) goto L7e
            if (r7 < 0) goto L7e
            int r4 = r6 + r8
            if (r4 > r2) goto L7e
            int r2 = r7 + r9
            if (r2 <= r3) goto L25
            goto L7e
        L25:
            float r1 = (float) r0
            r2 = 1115684864(0x42800000, float:64.0)
            float r1 = r1 / r2
            float r2 = (float) r5
            float r3 = (float) r3
            float r2 = r2 / r3
            int r3 = r0 + (-1)
            float r6 = (float) r6
            float r6 = r6 * r1
            int r6 = java.lang.Math.round(r6)
            int r6 = java.lang.Math.min(r3, r6)
            r3 = 0
            int r6 = java.lang.Math.max(r3, r6)
            int r4 = r5 + (-1)
            float r7 = (float) r7
            float r7 = r7 * r2
            int r7 = java.lang.Math.round(r7)
            int r7 = java.lang.Math.min(r4, r7)
            int r7 = java.lang.Math.max(r3, r7)
            float r8 = (float) r8
            float r8 = r8 * r1
            int r8 = java.lang.Math.round(r8)
            r1 = 1
            int r8 = java.lang.Math.max(r1, r8)
            float r9 = (float) r9
            float r9 = r9 * r2
            int r9 = java.lang.Math.round(r9)
            int r9 = java.lang.Math.max(r1, r9)
            int r1 = r6 + 1
            int r8 = r8 + r6
            int r8 = java.lang.Math.min(r0, r8)
            int r8 = java.lang.Math.max(r1, r8)
            int r0 = r7 + 1
            int r9 = r9 + r7
            int r5 = java.lang.Math.min(r5, r9)
            int r5 = java.lang.Math.max(r0, r5)
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>(r6, r7, r8, r5)
            return r9
        L7e:
            return r1
    }

    private static android.graphics.RectF snapped(android.graphics.RectF r4) {
            android.graphics.RectF r0 = new android.graphics.RectF
            float r1 = r4.left
            int r1 = java.lang.Math.round(r1)
            float r1 = (float) r1
            float r2 = r4.top
            int r2 = java.lang.Math.round(r2)
            float r2 = (float) r2
            float r3 = r4.right
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            float r4 = r4.bottom
            int r4 = java.lang.Math.round(r4)
            float r4 = (float) r4
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    private int viewDirection() {
            r2 = this;
            float r0 = r2.yawDegrees
            float r0 = normalizeYaw(r0)
            r1 = 1110704128(0x42340000, float:45.0)
            float r0 = r0 + r1
            r1 = 1119092736(0x42b40000, float:90.0)
            float r0 = r0 / r1
            double r0 = (double) r0
            double r0 = java.lang.Math.floor(r0)
            int r0 = (int) r0
            r0 = r0 & 3
            return r0
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            r0 = 1
            r1.animationRunning = r0
            java.lang.Runnable r0 = r1.animationTick
            r1.postOnAnimation(r0)
            return
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            r0 = 0
            r1.animationRunning = r0
            java.lang.Runnable r0 = r1.animationTick
            r1.removeCallbacks(r0)
            super.onDetachedFromWindow()
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r11) {
            r10 = this;
            super.onDraw(r11)
            int r0 = r10.getWidth()
            float r0 = (float) r0
            int r1 = r10.getHeight()
            float r1 = (float) r1
            r2 = 0
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 <= 0) goto L6c
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 > 0) goto L17
            goto L6c
        L17:
            r10.drawBackground(r11, r0, r1)
            int r2 = r10.viewDirection()
            r3 = 1
            if (r2 == r3) goto L26
            r4 = 3
            if (r2 != r4) goto L25
            goto L26
        L25:
            r3 = 0
        L26:
            boolean r9 = r10.isSlimArms()
            if (r9 == 0) goto L2f
            r4 = 1094713344(0x41400000, float:12.0)
            goto L31
        L2f:
            r4 = 1098907648(0x41800000, float:16.0)
        L31:
            if (r3 == 0) goto L36
            r3 = 1115160576(0x42780000, float:62.0)
            goto L3a
        L36:
            r3 = 1107296256(0x42000000, float:32.0)
            float r3 = r3 + r4
            float r3 = r3 + r4
        L3a:
            r4 = 1099956224(0x41900000, float:18.0)
            float r4 = r10.dp(r4)
            float r4 = r0 - r4
            float r4 = r4 / r3
            r5 = 1106247680(0x41f00000, float:30.0)
            float r5 = r10.dp(r5)
            float r5 = r1 - r5
            r6 = 1126170624(0x43200000, float:160.0)
            float r5 = r5 / r6
            float r7 = java.lang.Math.min(r4, r5)
            float r3 = r3 * r7
            float r3 = r0 - r3
            r4 = 1073741824(0x40000000, float:2.0)
            float r5 = r3 / r4
            float r6 = r6 * r7
            float r3 = r1 - r6
            float r3 = r3 / r4
            float r4 = r10.dp(r4)
            float r6 = r3 + r4
            r3 = r10
            r4 = r11
            r8 = r2
            r3.drawModel(r4, r5, r6, r7, r8, r9)
            r10.drawRotationHint(r11, r0, r1, r2)
        L6c:
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L3d
            if (r0 == r1) goto L2f
            r2 = 2
            if (r0 == r2) goto L10
            r4 = 3
            if (r0 == r4) goto L2f
            return r1
        L10:
            boolean r0 = r3.dragging
            if (r0 != 0) goto L15
            return r1
        L15:
            r3.userRotated = r1
            float r0 = r3.downYaw
            float r4 = r4.getX()
            float r2 = r3.downX
            float r4 = r4 - r2
            r2 = 1066611507(0x3f933333, float:1.15)
            float r4 = r4 * r2
            float r0 = r0 + r4
            float r4 = normalizeYaw(r0)
            r3.yawDegrees = r4
            r3.invalidate()
            return r1
        L2f:
            r4 = 0
            r3.dragging = r4
            android.view.ViewParent r0 = r3.getParent()
            r0.requestDisallowInterceptTouchEvent(r4)
            r3.performClick()
            return r1
        L3d:
            r3.dragging = r1
            float r4 = r4.getX()
            r3.downX = r4
            float r4 = r3.yawDegrees
            r3.downYaw = r4
            android.view.ViewParent r4 = r3.getParent()
            r4.requestDisallowInterceptTouchEvent(r1)
            return r1
    }

    @Override // android.view.View
    public boolean performClick() {
            r1 = this;
            super.performClick()
            r0 = 1
            return r0
    }

    public void setCapeUrl(java.lang.String r5) {
            r4 = this;
            java.lang.String r5 = normalizeTextureUrl(r5)
            java.lang.String r0 = r4.capeUrl
            boolean r0 = sameNullable(r5, r0)
            if (r0 == 0) goto Ld
            return
        Ld:
            r4.capeUrl = r5
            r0 = 0
            r4.cape = r0
            boolean r0 = r4.userRotated
            if (r0 != 0) goto L19
            r0 = 0
            r4.yawDegrees = r0
        L19:
            r4.invalidate()
            int r0 = r4.capeGeneration
            r1 = 1
            int r0 = r0 + r1
            r4.capeGeneration = r0
            if (r5 != 0) goto L25
            return
        L25:
            java.lang.Thread r2 = new java.lang.Thread
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$$ExternalSyntheticLambda2 r3 = new ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$$ExternalSyntheticLambda2
            r3.<init>(r4, r5, r0)
            java.lang.String r5 = "DroidBridgePlayerPreviewCape"
            r2.<init>(r3, r5)
            r2.setDaemon(r1)
            r2.start()
            return
    }

    public void setSkinUrl(java.lang.String r5) {
            r4 = this;
            java.lang.String r5 = normalizeTextureUrl(r5)
            java.lang.String r0 = r4.skinUrl
            boolean r0 = sameNullable(r5, r0)
            if (r0 == 0) goto Ld
            return
        Ld:
            r4.skinUrl = r5
            r0 = 0
            r4.skin = r0
            r0 = 0
            r4.slimArms = r0
            r4.slimArmsKnown = r0
            boolean r0 = r4.userRotated
            if (r0 != 0) goto L1e
            r0 = 0
            r4.yawDegrees = r0
        L1e:
            r4.invalidate()
            int r0 = r4.skinGeneration
            r1 = 1
            int r0 = r0 + r1
            r4.skinGeneration = r0
            if (r5 != 0) goto L2a
            return
        L2a:
            java.lang.Thread r2 = new java.lang.Thread
            ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$$ExternalSyntheticLambda0 r3 = new ca.dnamobile.javalauncher.skin.PlayerModelPreviewView$$ExternalSyntheticLambda0
            r3.<init>(r4, r5, r0)
            java.lang.String r5 = "DroidBridgePlayerPreviewSkin"
            r2.<init>(r3, r5)
            r2.setDaemon(r1)
            r2.start()
            return
    }
}
