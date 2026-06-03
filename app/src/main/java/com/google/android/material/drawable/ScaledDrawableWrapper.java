package com.google.android.material.drawable;

/* JADX INFO: loaded from: classes.dex */
public class ScaledDrawableWrapper extends androidx.appcompat.graphics.drawable.DrawableWrapperCompat {
    private final int height;
    private final int width;

    public ScaledDrawableWrapper(android.graphics.drawable.Drawable r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1)
            r0.width = r2
            r0.height = r3
            return
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            int r0 = r1.height
            return r0
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            int r0 = r1.width
            return r0
    }
}
