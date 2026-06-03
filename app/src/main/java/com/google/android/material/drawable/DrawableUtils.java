package com.google.android.material.drawable;

/* JADX INFO: loaded from: classes.dex */
public final class DrawableUtils {
    public static final int INTRINSIC_SIZE = -1;
    private static final int UNSPECIFIED_HEIGHT = -1;
    private static final int UNSPECIFIED_WIDTH = -1;

    private static class OutlineCompatL {
        private OutlineCompatL() {
                r0 = this;
                r0.<init>()
                return
        }

        static void setConvexPath(android.graphics.Outline r0, android.graphics.Path r1) {
                r0.setConvexPath(r1)
                return
        }
    }

    private static class OutlineCompatR {
        private OutlineCompatR() {
                r0 = this;
                r0.<init>()
                return
        }

        static void setPath(android.graphics.Outline r0, android.graphics.Path r1) {
                r0.setPath(r1)
                return
        }
    }

    private DrawableUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.graphics.drawable.Drawable compositeTwoLayeredDrawable(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2) {
            r0 = -1
            android.graphics.drawable.Drawable r1 = compositeTwoLayeredDrawable(r1, r2, r0, r0)
            return r1
    }

    public static android.graphics.drawable.Drawable compositeTwoLayeredDrawable(android.graphics.drawable.Drawable r4, android.graphics.drawable.Drawable r5, int r6, int r7) {
            if (r4 != 0) goto L3
            return r5
        L3:
            if (r5 != 0) goto L6
            return r4
        L6:
            r0 = -1
            if (r6 != r0) goto Ld
            int r6 = getTopLayerIntrinsicWidth(r4, r5)
        Ld:
            if (r7 != r0) goto L13
            int r7 = getTopLayerIntrinsicHeight(r4, r5)
        L13:
            int r0 = r4.getIntrinsicWidth()
            if (r6 > r0) goto L20
            int r0 = r4.getIntrinsicHeight()
            if (r7 > r0) goto L20
            goto L44
        L20:
            float r6 = (float) r6
            float r7 = (float) r7
            float r6 = r6 / r7
            int r7 = r4.getIntrinsicWidth()
            float r7 = (float) r7
            int r0 = r4.getIntrinsicHeight()
            float r0 = (float) r0
            float r7 = r7 / r0
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 < 0) goto L3d
            int r7 = r4.getIntrinsicWidth()
            float r0 = (float) r7
            float r0 = r0 / r6
            int r6 = (int) r0
            r3 = r7
            r7 = r6
            r6 = r3
            goto L44
        L3d:
            int r7 = r4.getIntrinsicHeight()
            float r0 = (float) r7
            float r6 = r6 * r0
            int r6 = (int) r6
        L44:
            android.graphics.drawable.LayerDrawable r0 = new android.graphics.drawable.LayerDrawable
            r1 = 2
            android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r5
            r0.<init>(r1)
            r0.setLayerSize(r4, r6, r7)
            r5 = 17
            r0.setLayerGravity(r4, r5)
            return r0
    }

    public static android.graphics.drawable.Drawable createTintableDrawableIfNeeded(android.graphics.drawable.Drawable r1, android.content.res.ColorStateList r2, android.graphics.PorterDuff.Mode r3) {
            r0 = 0
            android.graphics.drawable.Drawable r1 = createTintableMutatedDrawableIfNeeded(r1, r2, r3, r0)
            return r1
    }

    public static android.graphics.drawable.Drawable createTintableMutatedDrawableIfNeeded(android.graphics.drawable.Drawable r1, android.content.res.ColorStateList r2, android.graphics.PorterDuff.Mode r3) {
            r0 = 0
            android.graphics.drawable.Drawable r1 = createTintableMutatedDrawableIfNeeded(r1, r2, r3, r0)
            return r1
    }

    private static android.graphics.drawable.Drawable createTintableMutatedDrawableIfNeeded(android.graphics.drawable.Drawable r0, android.content.res.ColorStateList r1, android.graphics.PorterDuff.Mode r2, boolean r3) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            if (r1 == 0) goto L14
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
            android.graphics.drawable.Drawable r0 = r0.mutate()
            if (r2 == 0) goto L19
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(r0, r2)
            goto L19
        L14:
            if (r3 == 0) goto L19
            r0.mutate()
        L19:
            return r0
    }

    public static int[] getCheckedState(int[] r3) {
            r0 = 0
        L1:
            int r1 = r3.length
            r2 = 16842912(0x10100a0, float:2.3694006E-38)
            if (r0 >= r1) goto L1a
            r1 = r3[r0]
            if (r1 != r2) goto Lc
            return r3
        Lc:
            if (r1 != 0) goto L17
            java.lang.Object r3 = r3.clone()
            int[] r3 = (int[]) r3
            r3[r0] = r2
            return r3
        L17:
            int r0 = r0 + 1
            goto L1
        L1a:
            int r0 = r3.length
            int r0 = r0 + 1
            int[] r0 = java.util.Arrays.copyOf(r3, r0)
            int r3 = r3.length
            r0[r3] = r2
            return r0
    }

    public static android.content.res.ColorStateList getColorStateListOrNull(android.graphics.drawable.Drawable r2) {
            boolean r0 = r2 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto Lf
            android.graphics.drawable.ColorDrawable r2 = (android.graphics.drawable.ColorDrawable) r2
            int r2 = r2.getColor()
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            return r2
        Lf:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L20
            boolean r0 = r2 instanceof android.graphics.drawable.ColorStateListDrawable
            if (r0 == 0) goto L20
            android.graphics.drawable.ColorStateListDrawable r2 = (android.graphics.drawable.ColorStateListDrawable) r2
            android.content.res.ColorStateList r2 = r2.getColorStateList()
            return r2
        L20:
            r2 = 0
            return r2
    }

    private static int getTopLayerIntrinsicHeight(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2) {
            int r2 = r2.getIntrinsicHeight()
            r0 = -1
            if (r2 == r0) goto L8
            goto Lc
        L8:
            int r2 = r1.getIntrinsicHeight()
        Lc:
            return r2
    }

    private static int getTopLayerIntrinsicWidth(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2) {
            int r2 = r2.getIntrinsicWidth()
            r0 = -1
            if (r2 == r0) goto L8
            goto Lc
        L8:
            int r2 = r1.getIntrinsicWidth()
        Lc:
            return r2
    }

    public static int[] getUncheckedState(int[] r6) {
            int r0 = r6.length
            int[] r0 = new int[r0]
            int r1 = r6.length
            r2 = 0
            r3 = r2
        L6:
            if (r2 >= r1) goto L17
            r4 = r6[r2]
            r5 = 16842912(0x10100a0, float:2.3694006E-38)
            if (r4 == r5) goto L14
            int r5 = r3 + 1
            r0[r3] = r4
            r3 = r5
        L14:
            int r2 = r2 + 1
            goto L6
        L17:
            return r0
    }

    public static android.util.AttributeSet parseDrawableXml(android.content.Context r3, int r4, java.lang.CharSequence r5) {
            android.content.res.Resources r3 = r3.getResources()     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            android.content.res.XmlResourceParser r3 = r3.getXml(r4)     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
        L8:
            int r0 = r3.next()     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            r1 = 2
            if (r0 == r1) goto L12
            r2 = 1
            if (r0 != r2) goto L8
        L12:
            if (r0 != r1) goto L42
            java.lang.String r0 = r3.getName()     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            boolean r0 = android.text.TextUtils.equals(r0, r5)     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            if (r0 == 0) goto L23
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r3)     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            return r3
        L23:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            r0.<init>()     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            java.lang.String r1 = "Must have a <"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            java.lang.StringBuilder r5 = r0.append(r5)     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            java.lang.String r0 = "> start tag"
            java.lang.StringBuilder r5 = r5.append(r0)     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            java.lang.String r5 = r5.toString()     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            r3.<init>(r5)     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            throw r3     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
        L42:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            java.lang.String r5 = "No start tag found"
            r3.<init>(r5)     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            throw r3     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
        L4a:
            r3 = move-exception
            goto L4d
        L4c:
            r3 = move-exception
        L4d:
            android.content.res.Resources$NotFoundException r5 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Can't load badge resource ID #0x"
            r0.<init>(r1)
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            r5.initCause(r3)
            throw r5
    }

    public static void setOutlineToPath(android.graphics.Outline r2, android.graphics.Path r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto La
            com.google.android.material.drawable.DrawableUtils.OutlineCompatR.setPath(r2, r3)
            goto L1d
        La:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L14
            com.google.android.material.drawable.DrawableUtils.OutlineCompatL.setConvexPath(r2, r3)     // Catch: java.lang.IllegalArgumentException -> L1d
            goto L1d
        L14:
            boolean r0 = r3.isConvex()
            if (r0 == 0) goto L1d
            com.google.android.material.drawable.DrawableUtils.OutlineCompatL.setConvexPath(r2, r3)
        L1d:
            return
    }

    public static void setRippleDrawableRadius(android.graphics.drawable.RippleDrawable r0, int r1) {
            r0.setRadius(r1)
            return
    }

    public static void setTint(android.graphics.drawable.Drawable r1, int r2) {
            if (r2 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            if (r0 == 0) goto Lb
            androidx.core.graphics.drawable.DrawableCompat.setTint(r1, r2)
            goto Lf
        Lb:
            r2 = 0
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r1, r2)
        Lf:
            return
    }

    public static android.graphics.PorterDuffColorFilter updateTintFilter(android.graphics.drawable.Drawable r1, android.content.res.ColorStateList r2, android.graphics.PorterDuff.Mode r3) {
            if (r2 == 0) goto L14
            if (r3 != 0) goto L5
            goto L14
        L5:
            int[] r1 = r1.getState()
            r0 = 0
            int r1 = r2.getColorForState(r1, r0)
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            r2.<init>(r1, r3)
            return r2
        L14:
            r1 = 0
            return r1
    }
}
