package com.google.android.material.sidesheet;

/* JADX INFO: loaded from: classes.dex */
final class RightSheetDelegate extends com.google.android.material.sidesheet.SheetDelegate {
    final com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> sheetBehavior;

    RightSheetDelegate(com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r1) {
            r0 = this;
            r0.<init>()
            r0.sheetBehavior = r1
            return
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    int calculateInnerMargin(android.view.ViewGroup.MarginLayoutParams r1) {
            r0 = this;
            int r1 = r1.rightMargin
            return r1
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    float calculateSlideOffset(int r3) {
            r2 = this;
            int r0 = r2.getHiddenOffset()
            float r0 = (float) r0
            int r1 = r2.getExpandedOffset()
            float r1 = (float) r1
            float r1 = r0 - r1
            float r3 = (float) r3
            float r0 = r0 - r3
            float r0 = r0 / r1
            return r0
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    int getCoplanarSiblingAdjacentMargin(android.view.ViewGroup.MarginLayoutParams r1) {
            r0 = this;
            int r1 = r1.rightMargin
            return r1
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    int getExpandedOffset() {
            r2 = this;
            int r0 = r2.getHiddenOffset()
            com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r1 = r2.sheetBehavior
            int r1 = r1.getChildWidth()
            int r0 = r0 - r1
            com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r1 = r2.sheetBehavior
            int r1 = r1.getInnerMargin()
            int r0 = r0 - r1
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            return r0
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    int getHiddenOffset() {
            r1 = this;
            com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r0 = r1.sheetBehavior
            int r0 = r0.getParentWidth()
            return r0
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    int getMaxViewPositionHorizontal() {
            r1 = this;
            com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r0 = r1.sheetBehavior
            int r0 = r0.getParentWidth()
            return r0
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    int getMinViewPositionHorizontal() {
            r1 = this;
            int r0 = r1.getExpandedOffset()
            return r0
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    <V extends android.view.View> int getOuterEdge(V r2) {
            r1 = this;
            int r2 = r2.getLeft()
            com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r0 = r1.sheetBehavior
            int r0 = r0.getInnerMargin()
            int r2 = r2 - r0
            return r2
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public int getParentInnerEdge(androidx.coordinatorlayout.widget.CoordinatorLayout r1) {
            r0 = this;
            int r1 = r1.getRight()
            return r1
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    int getSheetEdge() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    boolean isExpandingOutwards(float r2) {
            r1 = this;
            r0 = 0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 >= 0) goto L7
            r2 = 1
            goto L8
        L7:
            r2 = 0
        L8:
            return r2
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    boolean isReleasedCloseToInnerEdge(android.view.View r3) {
            r2 = this;
            int r3 = r3.getLeft()
            int r0 = r2.getHiddenOffset()
            int r1 = r2.getExpandedOffset()
            int r0 = r0 + r1
            int r0 = r0 / 2
            if (r3 <= r0) goto L13
            r3 = 1
            goto L14
        L13:
            r3 = 0
        L14:
            return r3
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    boolean isSwipeSignificant(float r1, float r2) {
            r0 = this;
            boolean r2 = com.google.android.material.sidesheet.SheetUtils.isSwipeMostlyHorizontal(r1, r2)
            if (r2 == 0) goto L17
            float r1 = java.lang.Math.abs(r1)
            com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r2 = r0.sheetBehavior
            int r2 = r2.getSignificantVelocityThreshold()
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L17
            r1 = 1
            goto L18
        L17:
            r1 = 0
        L18:
            return r1
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    boolean shouldHide(android.view.View r2, float r3) {
            r1 = this;
            int r2 = r2.getRight()
            float r2 = (float) r2
            com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r0 = r1.sheetBehavior
            float r0 = r0.getHideFriction()
            float r3 = r3 * r0
            float r2 = r2 + r3
            float r2 = java.lang.Math.abs(r2)
            com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r3 = r1.sheetBehavior
            float r3 = r3.getHideThreshold()
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L1d
            r2 = 1
            goto L1e
        L1d:
            r2 = 0
        L1e:
            return r2
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    void updateCoplanarSiblingAdjacentMargin(android.view.ViewGroup.MarginLayoutParams r1, int r2) {
            r0 = this;
            r1.rightMargin = r2
            return
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    void updateCoplanarSiblingLayoutParams(android.view.ViewGroup.MarginLayoutParams r1, int r2, int r3) {
            r0 = this;
            com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r3 = r0.sheetBehavior
            int r3 = r3.getParentWidth()
            if (r2 > r3) goto Lb
            int r3 = r3 - r2
            r1.rightMargin = r3
        Lb:
            return
    }
}
