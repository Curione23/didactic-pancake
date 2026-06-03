package androidx.core.graphics;

/* JADX INFO: compiled from: Bitmap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0086\b\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a&\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010H\u0086\b\u001a\u0015\u0010\u0011\u001a\u00020\b*\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0013H\u0086\n\u001a\u0015\u0010\u0011\u001a\u00020\b*\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0014H\u0086\n\u001a\u001d\u0010\u0015\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H\u0086\n\u001a'\u0010\u0018\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\bH\u0086\b\u001a'\u0010\u001a\u001a\u00020\u000f*\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u0003H\u0086\n¨\u0006\u001c"}, d2 = {"createBitmap", "Landroid/graphics/Bitmap;", "width", "", "height", "config", "Landroid/graphics/Bitmap$Config;", "hasAlpha", "", "colorSpace", "Landroid/graphics/ColorSpace;", "applyCanvas", "block", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "", "Lkotlin/ExtensionFunctionType;", "contains", "p", "Landroid/graphics/Point;", "Landroid/graphics/PointF;", "get", "x", "y", "scale", "filter", "set", "color", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BitmapKt {
    public static final android.graphics.Bitmap applyCanvas(android.graphics.Bitmap r1, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r2) {
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r1)
            r2.invoke(r0)
            return r1
    }

    public static final boolean contains(android.graphics.Bitmap r2, android.graphics.Point r3) {
            int r0 = r2.getWidth()
            int r1 = r3.x
            if (r1 < 0) goto L18
            if (r1 >= r0) goto L18
            int r0 = r3.y
            if (r0 < 0) goto L18
            int r3 = r3.y
            int r2 = r2.getHeight()
            if (r3 >= r2) goto L18
            r2 = 1
            goto L19
        L18:
            r2 = 0
        L19:
            return r2
    }

    public static final boolean contains(android.graphics.Bitmap r3, android.graphics.PointF r4) {
            float r0 = r4.x
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L25
            float r0 = r4.x
            int r2 = r3.getWidth()
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L25
            float r0 = r4.y
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L25
            float r4 = r4.y
            int r3 = r3.getHeight()
            float r3 = (float) r3
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 >= 0) goto L25
            r3 = 1
            goto L26
        L25:
            r3 = 0
        L26:
            return r3
    }

    public static final android.graphics.Bitmap createBitmap(int r0, int r1, android.graphics.Bitmap.Config r2) {
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            return r0
    }

    public static final android.graphics.Bitmap createBitmap(int r0, int r1, android.graphics.Bitmap.Config r2, boolean r3, android.graphics.ColorSpace r4) {
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4)
            return r0
    }

    public static /* synthetic */ android.graphics.Bitmap createBitmap$default(int r0, int r1, android.graphics.Bitmap.Config r2, int r3, java.lang.Object r4) {
            r3 = r3 & 4
            if (r3 == 0) goto L6
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
        L6:
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ android.graphics.Bitmap createBitmap$default(int r0, int r1, android.graphics.Bitmap.Config r2, boolean r3, android.graphics.ColorSpace r4, int r5, java.lang.Object r6) {
            r6 = r5 & 4
            if (r6 == 0) goto L6
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
        L6:
            r6 = r5 & 8
            if (r6 == 0) goto Lb
            r3 = 1
        Lb:
            r5 = r5 & 16
            if (r5 == 0) goto L15
            android.graphics.ColorSpace$Named r4 = android.graphics.ColorSpace.Named.SRGB
            android.graphics.ColorSpace r4 = android.graphics.ColorSpace.get(r4)
        L15:
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4)
            return r0
    }

    public static final int get(android.graphics.Bitmap r0, int r1, int r2) {
            int r0 = r0.getPixel(r1, r2)
            return r0
    }

    public static final android.graphics.Bitmap scale(android.graphics.Bitmap r0, int r1, int r2, boolean r3) {
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ android.graphics.Bitmap scale$default(android.graphics.Bitmap r0, int r1, int r2, boolean r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 1
        L5:
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r0, r1, r2, r3)
            return r0
    }

    public static final void set(android.graphics.Bitmap r0, int r1, int r2, int r3) {
            r0.setPixel(r1, r2, r3)
            return
    }
}
