package com.google.android.material.sidesheet;

/* JADX INFO: loaded from: classes.dex */
abstract class SheetDelegate {
    SheetDelegate() {
            r0 = this;
            r0.<init>()
            return
    }

    abstract int calculateInnerMargin(android.view.ViewGroup.MarginLayoutParams r1);

    abstract float calculateSlideOffset(int r1);

    abstract int getCoplanarSiblingAdjacentMargin(android.view.ViewGroup.MarginLayoutParams r1);

    abstract int getExpandedOffset();

    abstract int getHiddenOffset();

    abstract int getMaxViewPositionHorizontal();

    abstract int getMinViewPositionHorizontal();

    abstract <V extends android.view.View> int getOuterEdge(V r1);

    abstract int getParentInnerEdge(androidx.coordinatorlayout.widget.CoordinatorLayout r1);

    abstract int getSheetEdge();

    abstract boolean isExpandingOutwards(float r1);

    abstract boolean isReleasedCloseToInnerEdge(android.view.View r1);

    abstract boolean isSwipeSignificant(float r1, float r2);

    abstract boolean shouldHide(android.view.View r1, float r2);

    abstract void updateCoplanarSiblingAdjacentMargin(android.view.ViewGroup.MarginLayoutParams r1, int r2);

    abstract void updateCoplanarSiblingLayoutParams(android.view.ViewGroup.MarginLayoutParams r1, int r2, int r3);
}
