package com.google.android.material.carousel;

/* JADX INFO: loaded from: classes.dex */
interface Maskable {
    android.graphics.RectF getMaskRectF();

    @java.lang.Deprecated
    float getMaskXPercentage();

    void setMaskRectF(android.graphics.RectF r1);

    @java.lang.Deprecated
    void setMaskXPercentage(float r1);

    void setOnMaskChangedListener(com.google.android.material.carousel.OnMaskChangedListener r1);
}
