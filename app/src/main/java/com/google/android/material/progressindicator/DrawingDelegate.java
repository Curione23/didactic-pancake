package com.google.android.material.progressindicator;

import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;

/* JADX INFO: loaded from: classes.dex */
abstract class DrawingDelegate<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> {
    S spec;

    protected static class ActiveIndicator {
        int color;
        float endFraction;
        int gapSize;
        float startFraction;

        protected ActiveIndicator() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public DrawingDelegate(S r1) {
            r0 = this;
            r0.<init>()
            r0.spec = r1
            return
    }

    abstract void adjustCanvas(android.graphics.Canvas r1, android.graphics.Rect r2, float r3, boolean r4, boolean r5);

    abstract void drawStopIndicator(android.graphics.Canvas r1, android.graphics.Paint r2, int r3, int r4);

    abstract void fillIndicator(android.graphics.Canvas r1, android.graphics.Paint r2, com.google.android.material.progressindicator.DrawingDelegate.ActiveIndicator r3, int r4);

    abstract void fillTrack(android.graphics.Canvas r1, android.graphics.Paint r2, float r3, float r4, int r5, int r6, int r7);

    abstract int getPreferredHeight();

    abstract int getPreferredWidth();

    void validateSpecAndAdjustCanvas(android.graphics.Canvas r2, android.graphics.Rect r3, float r4, boolean r5, boolean r6) {
            r1 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r1.spec
            r0.validateSpec()
            r1.adjustCanvas(r2, r3, r4, r5, r6)
            return
    }
}
