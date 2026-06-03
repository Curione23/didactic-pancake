package com.google.android.material.sidesheet;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends android.view.View> extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<V> implements com.google.android.material.sidesheet.Sheet<com.google.android.material.sidesheet.SideSheetCallback> {
    private static final int DEFAULT_ACCESSIBILITY_PANE_TITLE = 0;
    private static final int DEF_STYLE_RES = 0;
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    private static final int NO_MAX_SIZE = -1;
    static final int SIGNIFICANT_VEL_THRESHOLD = 500;
    private android.content.res.ColorStateList backgroundTint;
    private final java.util.Set<com.google.android.material.sidesheet.SideSheetCallback> callbacks;
    private int childWidth;
    private int coplanarSiblingViewId;
    private java.lang.ref.WeakReference<android.view.View> coplanarSiblingViewRef;
    private final androidx.customview.widget.ViewDragHelper.Callback dragCallback;
    private boolean draggable;
    private float elevation;
    private float hideFriction;
    private boolean ignoreEvents;
    private int initialX;
    private int innerMargin;
    private int lastStableState;
    private com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable;
    private float maximumVelocity;
    private int parentInnerEdge;
    private int parentWidth;
    private com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel;
    private com.google.android.material.sidesheet.SheetDelegate sheetDelegate;
    private com.google.android.material.motion.MaterialSideContainerBackHelper sideContainerBackHelper;
    private int state;
    private final com.google.android.material.sidesheet.SideSheetBehavior<V>.StateSettlingTracker stateSettlingTracker;
    private android.view.VelocityTracker velocityTracker;
    private androidx.customview.widget.ViewDragHelper viewDragHelper;
    private java.lang.ref.WeakReference<V> viewRef;



    protected static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.sidesheet.SideSheetBehavior.SavedState> CREATOR = null;
        final int state;


        static {
                com.google.android.material.sidesheet.SideSheetBehavior$SavedState$1 r0 = new com.google.android.material.sidesheet.SideSheetBehavior$SavedState$1
                r0.<init>()
                com.google.android.material.sidesheet.SideSheetBehavior.SavedState.CREATOR = r0
                return
        }

        public SavedState(android.os.Parcel r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        public SavedState(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                int r1 = r1.readInt()
                r0.state = r1
                return
        }

        public SavedState(android.os.Parcelable r1, com.google.android.material.sidesheet.SideSheetBehavior<?> r2) {
                r0 = this;
                r0.<init>(r1)
                int r1 = com.google.android.material.sidesheet.SideSheetBehavior.access$000(r2)
                r0.state = r1
                return
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                int r2 = r0.state
                r1.writeInt(r2)
                return
        }
    }

    class StateSettlingTracker {
        private final java.lang.Runnable continueSettlingRunnable;
        private boolean isContinueSettlingRunnablePosted;
        private int targetState;
        final /* synthetic */ com.google.android.material.sidesheet.SideSheetBehavior this$0;

        StateSettlingTracker(com.google.android.material.sidesheet.SideSheetBehavior r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                com.google.android.material.sidesheet.SideSheetBehavior$StateSettlingTracker$$ExternalSyntheticLambda0 r1 = new com.google.android.material.sidesheet.SideSheetBehavior$StateSettlingTracker$$ExternalSyntheticLambda0
                r1.<init>(r0)
                r0.continueSettlingRunnable = r1
                return
        }

        void continueSettlingToState(int r2) {
                r1 = this;
                com.google.android.material.sidesheet.SideSheetBehavior r0 = r1.this$0
                java.lang.ref.WeakReference r0 = com.google.android.material.sidesheet.SideSheetBehavior.access$100(r0)
                if (r0 == 0) goto L2f
                com.google.android.material.sidesheet.SideSheetBehavior r0 = r1.this$0
                java.lang.ref.WeakReference r0 = com.google.android.material.sidesheet.SideSheetBehavior.access$100(r0)
                java.lang.Object r0 = r0.get()
                if (r0 != 0) goto L15
                goto L2f
            L15:
                r1.targetState = r2
                boolean r2 = r1.isContinueSettlingRunnablePosted
                if (r2 != 0) goto L2f
                com.google.android.material.sidesheet.SideSheetBehavior r2 = r1.this$0
                java.lang.ref.WeakReference r2 = com.google.android.material.sidesheet.SideSheetBehavior.access$100(r2)
                java.lang.Object r2 = r2.get()
                android.view.View r2 = (android.view.View) r2
                java.lang.Runnable r0 = r1.continueSettlingRunnable
                androidx.core.view.ViewCompat.postOnAnimation(r2, r0)
                r2 = 1
                r1.isContinueSettlingRunnablePosted = r2
            L2f:
                return
        }

        /* JADX INFO: renamed from: lambda$new$0$com-google-android-material-sidesheet-SideSheetBehavior$StateSettlingTracker, reason: not valid java name */
        /* synthetic */ void m680xe5f914a3() {
                r2 = this;
                r0 = 0
                r2.isContinueSettlingRunnablePosted = r0
                com.google.android.material.sidesheet.SideSheetBehavior r0 = r2.this$0
                androidx.customview.widget.ViewDragHelper r0 = com.google.android.material.sidesheet.SideSheetBehavior.access$800(r0)
                if (r0 == 0) goto L1e
                com.google.android.material.sidesheet.SideSheetBehavior r0 = r2.this$0
                androidx.customview.widget.ViewDragHelper r0 = com.google.android.material.sidesheet.SideSheetBehavior.access$800(r0)
                r1 = 1
                boolean r0 = r0.continueSettling(r1)
                if (r0 == 0) goto L1e
                int r0 = r2.targetState
                r2.continueSettlingToState(r0)
                goto L2e
            L1e:
                com.google.android.material.sidesheet.SideSheetBehavior r0 = r2.this$0
                int r0 = com.google.android.material.sidesheet.SideSheetBehavior.access$000(r0)
                r1 = 2
                if (r0 != r1) goto L2e
                com.google.android.material.sidesheet.SideSheetBehavior r0 = r2.this$0
                int r1 = r2.targetState
                r0.setStateInternal(r1)
            L2e:
                return
        }
    }

    static {
            int r0 = com.google.android.material.R.string.side_sheet_accessibility_pane_title
            com.google.android.material.sidesheet.SideSheetBehavior.DEFAULT_ACCESSIBILITY_PANE_TITLE = r0
            int r0 = com.google.android.material.R.style.Widget_Material3_SideSheet
            com.google.android.material.sidesheet.SideSheetBehavior.DEF_STYLE_RES = r0
            return
    }

    public SideSheetBehavior() {
            r1 = this;
            r1.<init>()
            com.google.android.material.sidesheet.SideSheetBehavior$StateSettlingTracker r0 = new com.google.android.material.sidesheet.SideSheetBehavior$StateSettlingTracker
            r0.<init>(r1)
            r1.stateSettlingTracker = r0
            r0 = 1
            r1.draggable = r0
            r0 = 5
            r1.state = r0
            r1.lastStableState = r0
            r0 = 1036831949(0x3dcccccd, float:0.1)
            r1.hideFriction = r0
            r0 = -1
            r1.coplanarSiblingViewId = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.callbacks = r0
            com.google.android.material.sidesheet.SideSheetBehavior$1 r0 = new com.google.android.material.sidesheet.SideSheetBehavior$1
            r0.<init>(r1)
            r1.dragCallback = r0
            return
    }

    public SideSheetBehavior(android.content.Context r6, android.util.AttributeSet r7) {
            r5 = this;
            r5.<init>(r6, r7)
            com.google.android.material.sidesheet.SideSheetBehavior$StateSettlingTracker r0 = new com.google.android.material.sidesheet.SideSheetBehavior$StateSettlingTracker
            r0.<init>(r5)
            r5.stateSettlingTracker = r0
            r0 = 1
            r5.draggable = r0
            r1 = 5
            r5.state = r1
            r5.lastStableState = r1
            r1 = 1036831949(0x3dcccccd, float:0.1)
            r5.hideFriction = r1
            r1 = -1
            r5.coplanarSiblingViewId = r1
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            r5.callbacks = r2
            com.google.android.material.sidesheet.SideSheetBehavior$1 r2 = new com.google.android.material.sidesheet.SideSheetBehavior$1
            r2.<init>(r5)
            r5.dragCallback = r2
            int[] r2 = com.google.android.material.R.styleable.SideSheetBehavior_Layout
            android.content.res.TypedArray r2 = r6.obtainStyledAttributes(r7, r2)
            int r3 = com.google.android.material.R.styleable.SideSheetBehavior_Layout_backgroundTint
            boolean r3 = r2.hasValue(r3)
            if (r3 == 0) goto L3e
            int r3 = com.google.android.material.R.styleable.SideSheetBehavior_Layout_backgroundTint
            android.content.res.ColorStateList r3 = com.google.android.material.resources.MaterialResources.getColorStateList(r6, r2, r3)
            r5.backgroundTint = r3
        L3e:
            int r3 = com.google.android.material.R.styleable.SideSheetBehavior_Layout_shapeAppearance
            boolean r3 = r2.hasValue(r3)
            if (r3 == 0) goto L53
            r3 = 0
            int r4 = com.google.android.material.sidesheet.SideSheetBehavior.DEF_STYLE_RES
            com.google.android.material.shape.ShapeAppearanceModel$Builder r7 = com.google.android.material.shape.ShapeAppearanceModel.builder(r6, r7, r3, r4)
            com.google.android.material.shape.ShapeAppearanceModel r7 = r7.build()
            r5.shapeAppearanceModel = r7
        L53:
            int r7 = com.google.android.material.R.styleable.SideSheetBehavior_Layout_coplanarSiblingViewId
            boolean r7 = r2.hasValue(r7)
            if (r7 == 0) goto L64
            int r7 = com.google.android.material.R.styleable.SideSheetBehavior_Layout_coplanarSiblingViewId
            int r7 = r2.getResourceId(r7, r1)
            r5.setCoplanarSiblingViewId(r7)
        L64:
            r5.createMaterialShapeDrawableIfNeeded(r6)
            int r7 = com.google.android.material.R.styleable.SideSheetBehavior_Layout_android_elevation
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r7 = r2.getDimension(r7, r1)
            r5.elevation = r7
            int r7 = com.google.android.material.R.styleable.SideSheetBehavior_Layout_behavior_draggable
            boolean r7 = r2.getBoolean(r7, r0)
            r5.setDraggable(r7)
            r2.recycle()
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            int r6 = r6.getScaledMaximumFlingVelocity()
            float r6 = (float) r6
            r5.maximumVelocity = r6
            return
    }

    static /* synthetic */ int access$000(com.google.android.material.sidesheet.SideSheetBehavior r0) {
            int r0 = r0.state
            return r0
    }

    static /* synthetic */ java.lang.ref.WeakReference access$100(com.google.android.material.sidesheet.SideSheetBehavior r0) {
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r0.viewRef
            return r0
    }

    static /* synthetic */ com.google.android.material.sidesheet.SheetDelegate access$200(com.google.android.material.sidesheet.SideSheetBehavior r0) {
            com.google.android.material.sidesheet.SheetDelegate r0 = r0.sheetDelegate
            return r0
    }

    static /* synthetic */ void access$300(com.google.android.material.sidesheet.SideSheetBehavior r0, android.view.View r1, int r2) {
            r0.dispatchOnSlide(r1, r2)
            return
    }

    static /* synthetic */ boolean access$400(com.google.android.material.sidesheet.SideSheetBehavior r0) {
            boolean r0 = r0.draggable
            return r0
    }

    static /* synthetic */ int access$500(com.google.android.material.sidesheet.SideSheetBehavior r0, android.view.View r1, float r2, float r3) {
            int r0 = r0.calculateTargetStateOnViewReleased(r1, r2, r3)
            return r0
    }

    static /* synthetic */ void access$600(com.google.android.material.sidesheet.SideSheetBehavior r0, android.view.View r1, int r2, boolean r3) {
            r0.startSettling(r1, r2, r3)
            return
    }

    static /* synthetic */ int access$700(com.google.android.material.sidesheet.SideSheetBehavior r0) {
            int r0 = r0.childWidth
            return r0
    }

    static /* synthetic */ androidx.customview.widget.ViewDragHelper access$800(com.google.android.material.sidesheet.SideSheetBehavior r0) {
            androidx.customview.widget.ViewDragHelper r0 = r0.viewDragHelper
            return r0
    }

    private int calculateCurrentOffset(int r3, V r4) {
            r2 = this;
            int r0 = r2.state
            r1 = 1
            if (r0 == r1) goto L2e
            r1 = 2
            if (r0 == r1) goto L2e
            r3 = 3
            if (r0 == r3) goto L2c
            r3 = 5
            if (r0 != r3) goto L15
            com.google.android.material.sidesheet.SheetDelegate r3 = r2.sheetDelegate
            int r3 = r3.getHiddenOffset()
            goto L35
        L15:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Unexpected value: "
            r4.<init>(r0)
            int r0 = r2.state
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L2c:
            r3 = 0
            goto L35
        L2e:
            com.google.android.material.sidesheet.SheetDelegate r0 = r2.sheetDelegate
            int r4 = r0.getOuterEdge(r4)
            int r3 = r3 - r4
        L35:
            return r3
    }

    private float calculateDragDistance(float r1, float r2) {
            r0 = this;
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            return r1
    }

    private int calculateTargetStateOnViewReleased(android.view.View r4, float r5, float r6) {
            r3 = this;
            boolean r0 = r3.isExpandingOutwards(r5)
            r1 = 3
            if (r0 == 0) goto L8
            goto L47
        L8:
            boolean r0 = r3.shouldHide(r4, r5)
            r2 = 5
            if (r0 == 0) goto L21
            com.google.android.material.sidesheet.SheetDelegate r0 = r3.sheetDelegate
            boolean r5 = r0.isSwipeSignificant(r5, r6)
            if (r5 != 0) goto L1f
            com.google.android.material.sidesheet.SheetDelegate r5 = r3.sheetDelegate
            boolean r4 = r5.isReleasedCloseToInnerEdge(r4)
            if (r4 == 0) goto L47
        L1f:
            r1 = r2
            goto L47
        L21:
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 == 0) goto L2c
            boolean r5 = com.google.android.material.sidesheet.SheetUtils.isSwipeMostlyHorizontal(r5, r6)
            if (r5 != 0) goto L1f
        L2c:
            int r4 = r4.getLeft()
            int r5 = r3.getExpandedOffset()
            int r5 = r4 - r5
            int r5 = java.lang.Math.abs(r5)
            com.google.android.material.sidesheet.SheetDelegate r6 = r3.sheetDelegate
            int r6 = r6.getHiddenOffset()
            int r4 = r4 - r6
            int r4 = java.lang.Math.abs(r4)
            if (r5 >= r4) goto L1f
        L47:
            return r1
    }

    private void clearCoplanarSiblingView() {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.coplanarSiblingViewRef
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            r0 = 0
            r1.coplanarSiblingViewRef = r0
            return
    }

    private androidx.core.view.accessibility.AccessibilityViewCommand createAccessibilityViewCommandForState(int r2) {
            r1 = this;
            com.google.android.material.sidesheet.SideSheetBehavior$$ExternalSyntheticLambda1 r0 = new com.google.android.material.sidesheet.SideSheetBehavior$$ExternalSyntheticLambda1
            r0.<init>(r1, r2)
            return r0
    }

    private void createMaterialShapeDrawableIfNeeded(android.content.Context r4) {
            r3 = this;
            com.google.android.material.shape.ShapeAppearanceModel r0 = r3.shapeAppearanceModel
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.material.shape.MaterialShapeDrawable r0 = new com.google.android.material.shape.MaterialShapeDrawable
            com.google.android.material.shape.ShapeAppearanceModel r1 = r3.shapeAppearanceModel
            r0.<init>(r1)
            r3.materialShapeDrawable = r0
            r0.initializeElevationOverlay(r4)
            android.content.res.ColorStateList r0 = r3.backgroundTint
            if (r0 == 0) goto L1b
            com.google.android.material.shape.MaterialShapeDrawable r4 = r3.materialShapeDrawable
            r4.setFillColor(r0)
            goto L32
        L1b:
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r4 = r4.getTheme()
            r1 = 16842801(0x1010031, float:2.3693695E-38)
            r2 = 1
            r4.resolveAttribute(r1, r0, r2)
            com.google.android.material.shape.MaterialShapeDrawable r4 = r3.materialShapeDrawable
            int r0 = r0.data
            r4.setTint(r0)
        L32:
            return
    }

    private void dispatchOnSlide(android.view.View r3, int r4) {
            r2 = this;
            java.util.Set<com.google.android.material.sidesheet.SideSheetCallback> r0 = r2.callbacks
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L24
            com.google.android.material.sidesheet.SheetDelegate r0 = r2.sheetDelegate
            float r4 = r0.calculateSlideOffset(r4)
            java.util.Set<com.google.android.material.sidesheet.SideSheetCallback> r0 = r2.callbacks
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            com.google.android.material.sidesheet.SheetCallback r1 = (com.google.android.material.sidesheet.SheetCallback) r1
            r1.onSlide(r3, r4)
            goto L14
        L24:
            return
    }

    private void ensureAccessibilityPaneTitleIsSet(android.view.View r3) {
            r2 = this;
            java.lang.CharSequence r0 = androidx.core.view.ViewCompat.getAccessibilityPaneTitle(r3)
            if (r0 != 0) goto L13
            android.content.res.Resources r0 = r3.getResources()
            int r1 = com.google.android.material.sidesheet.SideSheetBehavior.DEFAULT_ACCESSIBILITY_PANE_TITLE
            java.lang.String r0 = r0.getString(r1)
            androidx.core.view.ViewCompat.setAccessibilityPaneTitle(r3, r0)
        L13:
            return
    }

    public static <V extends android.view.View> com.google.android.material.sidesheet.SideSheetBehavior<V> from(V r1) {
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r0 = r1 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams
            if (r0 == 0) goto L1d
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r1
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r1 = r1.getBehavior()
            boolean r0 = r1 instanceof com.google.android.material.sidesheet.SideSheetBehavior
            if (r0 == 0) goto L15
            com.google.android.material.sidesheet.SideSheetBehavior r1 = (com.google.android.material.sidesheet.SideSheetBehavior) r1
            return r1
        L15:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The view is not associated with SideSheetBehavior"
            r1.<init>(r0)
            throw r1
        L1d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The view is not a child of CoordinatorLayout"
            r1.<init>(r0)
            throw r1
    }

    private int getChildMeasureSpec(int r1, int r2, int r3, int r4) {
            r0 = this;
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r1, r2, r4)
            r2 = -1
            if (r3 != r2) goto L8
            return r1
        L8:
            int r2 = android.view.View.MeasureSpec.getMode(r1)
            int r1 = android.view.View.MeasureSpec.getSize(r1)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r2 == r4) goto L22
            if (r1 != 0) goto L17
            goto L1b
        L17:
            int r3 = java.lang.Math.min(r1, r3)
        L1b:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r1)
            return r1
        L22:
            int r1 = java.lang.Math.min(r1, r3)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r4)
            return r1
    }

    private android.animation.ValueAnimator.AnimatorUpdateListener getCoplanarFinishAnimatorUpdateListener() {
            r4 = this;
            android.view.View r0 = r4.getCoplanarSiblingView()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            if (r2 != 0) goto L11
            return r1
        L11:
            com.google.android.material.sidesheet.SheetDelegate r1 = r4.sheetDelegate
            int r1 = r1.getCoplanarSiblingAdjacentMargin(r2)
            com.google.android.material.sidesheet.SideSheetBehavior$$ExternalSyntheticLambda2 r3 = new com.google.android.material.sidesheet.SideSheetBehavior$$ExternalSyntheticLambda2
            r3.<init>(r4, r2, r1, r0)
            return r3
    }

    private int getGravityFromSheetEdge() {
            r2 = this;
            com.google.android.material.sidesheet.SheetDelegate r0 = r2.sheetDelegate
            r1 = 5
            if (r0 == 0) goto Ld
            int r0 = r0.getSheetEdge()
            if (r0 != 0) goto Lc
            goto Ld
        Lc:
            r1 = 3
        Ld:
            return r1
    }

    private androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams getViewLayoutParams() {
            r2 = this;
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r2.viewRef
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L1b
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r1 = r1 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams
            if (r1 == 0) goto L1b
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
            return r0
        L1b:
            r0 = 0
            return r0
    }

    private boolean hasLeftMargin() {
            r1 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = r1.getViewLayoutParams()
            if (r0 == 0) goto Lc
            int r0 = r0.leftMargin
            if (r0 <= 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    private boolean hasRightMargin() {
            r1 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = r1.getViewLayoutParams()
            if (r0 == 0) goto Lc
            int r0 = r0.rightMargin
            if (r0 <= 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    private boolean isDraggedFarEnough(android.view.MotionEvent r3) {
            r2 = this;
            boolean r0 = r2.shouldHandleDraggingWithHelper()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r2.initialX
            float r0 = (float) r0
            float r3 = r3.getX()
            float r3 = r2.calculateDragDistance(r0, r3)
            androidx.customview.widget.ViewDragHelper r0 = r2.viewDragHelper
            int r0 = r0.getTouchSlop()
            float r0 = (float) r0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L1f
            r1 = 1
        L1f:
            return r1
    }

    private boolean isExpandingOutwards(float r2) {
            r1 = this;
            com.google.android.material.sidesheet.SheetDelegate r0 = r1.sheetDelegate
            boolean r2 = r0.isExpandingOutwards(r2)
            return r2
    }

    private boolean isLayingOut(V r2) {
            r1 = this;
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == 0) goto L14
            boolean r0 = r0.isLayoutRequested()
            if (r0 == 0) goto L14
            boolean r2 = androidx.core.view.ViewCompat.isAttachedToWindow(r2)
            if (r2 == 0) goto L14
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            return r2
    }

    private boolean isSettling(android.view.View r2, int r3, boolean r4) {
            r1 = this;
            int r3 = r1.getOuterEdgeOffsetForState(r3)
            androidx.customview.widget.ViewDragHelper r0 = r1.getViewDragHelper()
            if (r0 == 0) goto L23
            if (r4 == 0) goto L17
            int r2 = r2.getTop()
            boolean r2 = r0.settleCapturedViewAt(r3, r2)
            if (r2 == 0) goto L23
            goto L21
        L17:
            int r4 = r2.getTop()
            boolean r2 = r0.smoothSlideViewTo(r2, r3, r4)
            if (r2 == 0) goto L23
        L21:
            r2 = 1
            goto L24
        L23:
            r2 = 0
        L24:
            return r2
    }

    private void maybeAssignCoplanarSiblingViewBasedId(androidx.coordinatorlayout.widget.CoordinatorLayout r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.coplanarSiblingViewRef
            if (r0 != 0) goto L16
            int r0 = r2.coplanarSiblingViewId
            r1 = -1
            if (r0 == r1) goto L16
            android.view.View r3 = r3.findViewById(r0)
            if (r3 == 0) goto L16
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r2.coplanarSiblingViewRef = r0
        L16:
            return
    }

    private void replaceAccessibilityActionForState(V r2, androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat r3, int r4) {
            r1 = this;
            r0 = 0
            androidx.core.view.accessibility.AccessibilityViewCommand r4 = r1.createAccessibilityViewCommandForState(r4)
            androidx.core.view.ViewCompat.replaceAccessibilityAction(r2, r3, r0, r4)
            return
    }

    private void resetVelocity() {
            r1 = this;
            android.view.VelocityTracker r0 = r1.velocityTracker
            if (r0 == 0) goto La
            r0.recycle()
            r0 = 0
            r1.velocityTracker = r0
        La:
            return
    }

    private void runAfterLayout(V r2, java.lang.Runnable r3) {
            r1 = this;
            boolean r0 = r1.isLayingOut(r2)
            if (r0 == 0) goto La
            r2.post(r3)
            goto Ld
        La:
            r3.run()
        Ld:
            return
    }

    private void setSheetEdge(int r4) {
            r3 = this;
            com.google.android.material.sidesheet.SheetDelegate r0 = r3.sheetDelegate
            if (r0 == 0) goto Lc
            int r0 = r0.getSheetEdge()
            if (r0 == r4) goto Lb
            goto Lc
        Lb:
            return
        Lc:
            r0 = 0
            if (r4 != 0) goto L35
            com.google.android.material.sidesheet.RightSheetDelegate r4 = new com.google.android.material.sidesheet.RightSheetDelegate
            r4.<init>(r3)
            r3.sheetDelegate = r4
            com.google.android.material.shape.ShapeAppearanceModel r4 = r3.shapeAppearanceModel
            if (r4 == 0) goto L34
            boolean r4 = r3.hasRightMargin()
            if (r4 != 0) goto L34
            com.google.android.material.shape.ShapeAppearanceModel r4 = r3.shapeAppearanceModel
            com.google.android.material.shape.ShapeAppearanceModel$Builder r4 = r4.toBuilder()
            com.google.android.material.shape.ShapeAppearanceModel$Builder r1 = r4.setTopRightCornerSize(r0)
            r1.setBottomRightCornerSize(r0)
            com.google.android.material.shape.ShapeAppearanceModel r4 = r4.build()
            r3.updateMaterialShapeDrawable(r4)
        L34:
            return
        L35:
            r1 = 1
            if (r4 != r1) goto L5e
            com.google.android.material.sidesheet.LeftSheetDelegate r4 = new com.google.android.material.sidesheet.LeftSheetDelegate
            r4.<init>(r3)
            r3.sheetDelegate = r4
            com.google.android.material.shape.ShapeAppearanceModel r4 = r3.shapeAppearanceModel
            if (r4 == 0) goto L5d
            boolean r4 = r3.hasLeftMargin()
            if (r4 != 0) goto L5d
            com.google.android.material.shape.ShapeAppearanceModel r4 = r3.shapeAppearanceModel
            com.google.android.material.shape.ShapeAppearanceModel$Builder r4 = r4.toBuilder()
            com.google.android.material.shape.ShapeAppearanceModel$Builder r1 = r4.setTopLeftCornerSize(r0)
            r1.setBottomLeftCornerSize(r0)
            com.google.android.material.shape.ShapeAppearanceModel r4 = r4.build()
            r3.updateMaterialShapeDrawable(r4)
        L5d:
            return
        L5e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid sheet edge position value: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = ". Must be 0 or 1."
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    private void setSheetEdge(V r1, int r2) {
            r0 = this;
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r1
            int r1 = r1.gravity
            int r1 = androidx.core.view.GravityCompat.getAbsoluteGravity(r1, r2)
            r2 = 3
            if (r1 != r2) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            r0.setSheetEdge(r1)
            return
    }

    private boolean shouldHandleDraggingWithHelper() {
            r2 = this;
            androidx.customview.widget.ViewDragHelper r0 = r2.viewDragHelper
            if (r0 == 0) goto Le
            boolean r0 = r2.draggable
            r1 = 1
            if (r0 != 0) goto Lf
            int r0 = r2.state
            if (r0 != r1) goto Le
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    private boolean shouldInterceptTouchEvent(V r2) {
            r1 = this;
            boolean r0 = r2.isShown()
            if (r0 != 0) goto Lc
            java.lang.CharSequence r2 = androidx.core.view.ViewCompat.getAccessibilityPaneTitle(r2)
            if (r2 == 0) goto L12
        Lc:
            boolean r2 = r1.draggable
            if (r2 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    private void startSettling(android.view.View r1, int r2, boolean r3) {
            r0 = this;
            boolean r1 = r0.isSettling(r1, r2, r3)
            if (r1 == 0) goto L10
            r1 = 2
            r0.setStateInternal(r1)
            com.google.android.material.sidesheet.SideSheetBehavior<V>$StateSettlingTracker r1 = r0.stateSettlingTracker
            r1.continueSettlingToState(r2)
            goto L13
        L10:
            r0.setStateInternal(r2)
        L13:
            return
    }

    private void updateAccessibilityActions() {
            r3 = this;
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r3.viewRef
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto Le
            return
        Le:
            r1 = 262144(0x40000, float:3.67342E-40)
            androidx.core.view.ViewCompat.removeAccessibilityAction(r0, r1)
            r1 = 1048576(0x100000, float:1.469368E-39)
            androidx.core.view.ViewCompat.removeAccessibilityAction(r0, r1)
            int r1 = r3.state
            r2 = 5
            if (r1 == r2) goto L22
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r1 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS
            r3.replaceAccessibilityActionForState(r0, r1, r2)
        L22:
            int r1 = r3.state
            r2 = 3
            if (r1 == r2) goto L2c
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r1 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND
            r3.replaceAccessibilityActionForState(r0, r1, r2)
        L2c:
            return
    }

    private void updateCoplanarSiblingBackProgress() {
            r4 = this;
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r4.viewRef
            if (r0 == 0) goto L38
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto Lb
            goto L38
        Lb:
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r4.viewRef
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            android.view.View r1 = r4.getCoplanarSiblingView()
            if (r1 != 0) goto L1a
            return
        L1a:
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            if (r2 != 0) goto L23
            return
        L23:
            int r3 = r4.childWidth
            float r3 = (float) r3
            float r0 = r0.getScaleX()
            float r3 = r3 * r0
            int r0 = r4.innerMargin
            float r0 = (float) r0
            float r3 = r3 + r0
            int r0 = (int) r3
            com.google.android.material.sidesheet.SheetDelegate r3 = r4.sheetDelegate
            r3.updateCoplanarSiblingAdjacentMargin(r2, r0)
            r1.requestLayout()
        L38:
            return
    }

    private void updateMaterialShapeDrawable(com.google.android.material.shape.ShapeAppearanceModel r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.materialShapeDrawable
            if (r0 == 0) goto L7
            r0.setShapeAppearanceModel(r2)
        L7:
            return
    }

    private void updateSheetVisibility(android.view.View r3) {
            r2 = this;
            int r0 = r2.state
            r1 = 5
            if (r0 != r1) goto L7
            r0 = 4
            goto L8
        L7:
            r0 = 0
        L8:
            int r1 = r3.getVisibility()
            if (r1 == r0) goto L11
            r3.setVisibility(r0)
        L11:
            return
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public /* bridge */ /* synthetic */ void addCallback(com.google.android.material.sidesheet.SheetCallback r1) {
            r0 = this;
            com.google.android.material.sidesheet.SideSheetCallback r1 = (com.google.android.material.sidesheet.SideSheetCallback) r1
            r0.addCallback(r1)
            return
    }

    public void addCallback(com.google.android.material.sidesheet.SideSheetCallback r2) {
            r1 = this;
            java.util.Set<com.google.android.material.sidesheet.SideSheetCallback> r0 = r1.callbacks
            r0.add(r2)
            return
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
            r1 = this;
            com.google.android.material.motion.MaterialSideContainerBackHelper r0 = r1.sideContainerBackHelper
            if (r0 != 0) goto L5
            return
        L5:
            r0.cancelBackProgress()
            return
    }

    public void expand() {
            r1 = this;
            r0 = 3
            r1.setState(r0)
            return
    }

    com.google.android.material.motion.MaterialSideContainerBackHelper getBackHelper() {
            r1 = this;
            com.google.android.material.motion.MaterialSideContainerBackHelper r0 = r1.sideContainerBackHelper
            return r0
    }

    int getChildWidth() {
            r1 = this;
            int r0 = r1.childWidth
            return r0
    }

    public android.view.View getCoplanarSiblingView() {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.coplanarSiblingViewRef
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public int getExpandedOffset() {
            r1 = this;
            com.google.android.material.sidesheet.SheetDelegate r0 = r1.sheetDelegate
            int r0 = r0.getExpandedOffset()
            return r0
    }

    public float getHideFriction() {
            r1 = this;
            float r0 = r1.hideFriction
            return r0
    }

    float getHideThreshold() {
            r1 = this;
            r0 = 1056964608(0x3f000000, float:0.5)
            return r0
    }

    int getInnerMargin() {
            r1 = this;
            int r0 = r1.innerMargin
            return r0
    }

    public int getLastStableState() {
            r1 = this;
            int r0 = r1.lastStableState
            return r0
    }

    int getOuterEdgeOffsetForState(int r4) {
            r3 = this;
            r0 = 3
            if (r4 == r0) goto L22
            r0 = 5
            if (r4 != r0) goto Ld
            com.google.android.material.sidesheet.SheetDelegate r4 = r3.sheetDelegate
            int r4 = r4.getHiddenOffset()
            return r4
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid state to get outer edge offset: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L22:
            int r4 = r3.getExpandedOffset()
            return r4
    }

    int getParentInnerEdge() {
            r1 = this;
            int r0 = r1.parentInnerEdge
            return r0
    }

    int getParentWidth() {
            r1 = this;
            int r0 = r1.parentWidth
            return r0
    }

    int getSignificantVelocityThreshold() {
            r1 = this;
            r0 = 500(0x1f4, float:7.0E-43)
            return r0
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public int getState() {
            r1 = this;
            int r0 = r1.state
            return r0
    }

    androidx.customview.widget.ViewDragHelper getViewDragHelper() {
            r1 = this;
            androidx.customview.widget.ViewDragHelper r0 = r1.viewDragHelper
            return r0
    }

    float getXVelocity() {
            r3 = this;
            android.view.VelocityTracker r0 = r3.velocityTracker
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r1 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.maximumVelocity
            r0.computeCurrentVelocity(r1, r2)
            android.view.VelocityTracker r0 = r3.velocityTracker
            float r0 = r0.getXVelocity()
            return r0
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
            r5 = this;
            com.google.android.material.motion.MaterialSideContainerBackHelper r0 = r5.sideContainerBackHelper
            if (r0 != 0) goto L5
            return
        L5:
            androidx.activity.BackEventCompat r0 = r0.onHandleBackInvoked()
            if (r0 == 0) goto L25
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            if (r1 >= r2) goto L12
            goto L25
        L12:
            com.google.android.material.motion.MaterialSideContainerBackHelper r1 = r5.sideContainerBackHelper
            int r2 = r5.getGravityFromSheetEdge()
            com.google.android.material.sidesheet.SideSheetBehavior$2 r3 = new com.google.android.material.sidesheet.SideSheetBehavior$2
            r3.<init>(r5)
            android.animation.ValueAnimator$AnimatorUpdateListener r4 = r5.getCoplanarFinishAnimatorUpdateListener()
            r1.finishBackProgress(r0, r2, r3, r4)
            return
        L25:
            r0 = 5
            r5.setState(r0)
            return
    }

    public void hide() {
            r1 = this;
            r0 = 5
            r1.setState(r0)
            return
    }

    public boolean isDraggable() {
            r1 = this;
            boolean r0 = r1.draggable
            return r0
    }

    /* JADX INFO: renamed from: lambda$createAccessibilityViewCommandForState$2$com-google-android-material-sidesheet-SideSheetBehavior, reason: not valid java name */
    /* synthetic */ boolean m677x564aa398(int r1, android.view.View r2, androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments r3) {
            r0 = this;
            r0.setState(r1)
            r1 = 1
            return r1
    }

    /* JADX INFO: renamed from: lambda$getCoplanarFinishAnimatorUpdateListener$1$com-google-android-material-sidesheet-SideSheetBehavior, reason: not valid java name */
    /* synthetic */ void m678xc3af8fb4(android.view.ViewGroup.MarginLayoutParams r3, int r4, android.view.View r5, android.animation.ValueAnimator r6) {
            r2 = this;
            com.google.android.material.sidesheet.SheetDelegate r0 = r2.sheetDelegate
            r1 = 0
            float r6 = r6.getAnimatedFraction()
            int r4 = com.google.android.material.animation.AnimationUtils.lerp(r4, r1, r6)
            r0.updateCoplanarSiblingAdjacentMargin(r3, r4)
            r5.requestLayout()
            return
    }

    /* JADX INFO: renamed from: lambda$setState$0$com-google-android-material-sidesheet-SideSheetBehavior, reason: not valid java name */
    /* synthetic */ void m679xc0f1d0a9(int r3) {
            r2 = this;
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r2.viewRef
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto Le
            r1 = 0
            r2.startSettling(r0, r3, r1)
        Le:
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams r1) {
            r0 = this;
            super.onAttachedToLayoutParams(r1)
            r1 = 0
            r0.viewRef = r1
            r0.viewDragHelper = r1
            r0.sideContainerBackHelper = r1
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDetachedFromLayoutParams() {
            r1 = this;
            super.onDetachedFromLayoutParams()
            r0 = 0
            r1.viewRef = r0
            r1.viewDragHelper = r0
            r1.sideContainerBackHelper = r0
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.MotionEvent r5) {
            r2 = this;
            boolean r3 = r2.shouldInterceptTouchEvent(r4)
            r4 = 1
            r0 = 0
            if (r3 != 0) goto Lb
            r2.ignoreEvents = r4
            return r0
        Lb:
            int r3 = r5.getActionMasked()
            if (r3 != 0) goto L14
            r2.resetVelocity()
        L14:
            android.view.VelocityTracker r1 = r2.velocityTracker
            if (r1 != 0) goto L1e
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r2.velocityTracker = r1
        L1e:
            android.view.VelocityTracker r1 = r2.velocityTracker
            r1.addMovement(r5)
            if (r3 == 0) goto L32
            if (r3 == r4) goto L2b
            r1 = 3
            if (r3 == r1) goto L2b
            goto L39
        L2b:
            boolean r3 = r2.ignoreEvents
            if (r3 == 0) goto L39
            r2.ignoreEvents = r0
            return r0
        L32:
            float r3 = r5.getX()
            int r3 = (int) r3
            r2.initialX = r3
        L39:
            boolean r3 = r2.ignoreEvents
            if (r3 != 0) goto L48
            androidx.customview.widget.ViewDragHelper r3 = r2.viewDragHelper
            if (r3 == 0) goto L48
            boolean r3 = r3.shouldInterceptTouchEvent(r5)
            if (r3 == 0) goto L48
            goto L49
        L48:
            r4 = r0
        L49:
            return r4
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout r5, V r6, int r7) {
            r4 = this;
            boolean r0 = androidx.core.view.ViewCompat.getFitsSystemWindows(r5)
            r1 = 1
            if (r0 == 0) goto L10
            boolean r0 = androidx.core.view.ViewCompat.getFitsSystemWindows(r6)
            if (r0 != 0) goto L10
            r6.setFitsSystemWindows(r1)
        L10:
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r4.viewRef
            if (r0 != 0) goto L54
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r6)
            r4.viewRef = r0
            com.google.android.material.motion.MaterialSideContainerBackHelper r0 = new com.google.android.material.motion.MaterialSideContainerBackHelper
            r0.<init>(r6)
            r4.sideContainerBackHelper = r0
            com.google.android.material.shape.MaterialShapeDrawable r0 = r4.materialShapeDrawable
            if (r0 == 0) goto L3b
            androidx.core.view.ViewCompat.setBackground(r6, r0)
            com.google.android.material.shape.MaterialShapeDrawable r0 = r4.materialShapeDrawable
            float r2 = r4.elevation
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 != 0) goto L37
            float r2 = androidx.core.view.ViewCompat.getElevation(r6)
        L37:
            r0.setElevation(r2)
            goto L42
        L3b:
            android.content.res.ColorStateList r0 = r4.backgroundTint
            if (r0 == 0) goto L42
            androidx.core.view.ViewCompat.setBackgroundTintList(r6, r0)
        L42:
            r4.updateSheetVisibility(r6)
            r4.updateAccessibilityActions()
            int r0 = androidx.core.view.ViewCompat.getImportantForAccessibility(r6)
            if (r0 != 0) goto L51
            androidx.core.view.ViewCompat.setImportantForAccessibility(r6, r1)
        L51:
            r4.ensureAccessibilityPaneTitleIsSet(r6)
        L54:
            r4.setSheetEdge(r6, r7)
            androidx.customview.widget.ViewDragHelper r0 = r4.viewDragHelper
            if (r0 != 0) goto L63
            androidx.customview.widget.ViewDragHelper$Callback r0 = r4.dragCallback
            androidx.customview.widget.ViewDragHelper r0 = androidx.customview.widget.ViewDragHelper.create(r5, r0)
            r4.viewDragHelper = r0
        L63:
            com.google.android.material.sidesheet.SheetDelegate r0 = r4.sheetDelegate
            int r0 = r0.getOuterEdge(r6)
            r5.onLayoutChild(r6, r7)
            int r7 = r5.getWidth()
            r4.parentWidth = r7
            com.google.android.material.sidesheet.SheetDelegate r7 = r4.sheetDelegate
            int r7 = r7.getParentInnerEdge(r5)
            r4.parentInnerEdge = r7
            int r7 = r6.getWidth()
            r4.childWidth = r7
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
            if (r7 == 0) goto L8f
            com.google.android.material.sidesheet.SheetDelegate r2 = r4.sheetDelegate
            int r7 = r2.calculateInnerMargin(r7)
            goto L90
        L8f:
            r7 = 0
        L90:
            r4.innerMargin = r7
            int r7 = r4.calculateCurrentOffset(r0, r6)
            androidx.core.view.ViewCompat.offsetLeftAndRight(r6, r7)
            r4.maybeAssignCoplanarSiblingViewBasedId(r5)
            java.util.Set<com.google.android.material.sidesheet.SideSheetCallback> r5 = r4.callbacks
            java.util.Iterator r5 = r5.iterator()
        La2:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto Lb8
            java.lang.Object r7 = r5.next()
            com.google.android.material.sidesheet.SheetCallback r7 = (com.google.android.material.sidesheet.SheetCallback) r7
            boolean r0 = r7 instanceof com.google.android.material.sidesheet.SideSheetCallback
            if (r0 == 0) goto La2
            com.google.android.material.sidesheet.SideSheetCallback r7 = (com.google.android.material.sidesheet.SideSheetCallback) r7
            r7.onLayout(r6)
            goto La2
        Lb8:
            return r1
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(androidx.coordinatorlayout.widget.CoordinatorLayout r4, V r5, int r6, int r7, int r8, int r9) {
            r3 = this;
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r4.getPaddingLeft()
            int r2 = r4.getPaddingRight()
            int r1 = r1 + r2
            int r2 = r0.leftMargin
            int r1 = r1 + r2
            int r2 = r0.rightMargin
            int r1 = r1 + r2
            int r1 = r1 + r7
            int r7 = r0.width
            r2 = -1
            int r6 = r3.getChildMeasureSpec(r6, r1, r2, r7)
            int r7 = r4.getPaddingTop()
            int r4 = r4.getPaddingBottom()
            int r7 = r7 + r4
            int r4 = r0.topMargin
            int r7 = r7 + r4
            int r4 = r0.bottomMargin
            int r7 = r7 + r4
            int r7 = r7 + r9
            int r4 = r0.height
            int r4 = r3.getChildMeasureSpec(r8, r7, r2, r4)
            r5.measure(r6, r4)
            r4 = 1
            return r4
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3, android.os.Parcelable r4) {
            r1 = this;
            com.google.android.material.sidesheet.SideSheetBehavior$SavedState r4 = (com.google.android.material.sidesheet.SideSheetBehavior.SavedState) r4
            android.os.Parcelable r0 = r4.getSuperState()
            if (r0 == 0) goto Lf
            android.os.Parcelable r0 = r4.getSuperState()
            super.onRestoreInstanceState(r2, r3, r0)
        Lf:
            int r2 = r4.state
            r3 = 1
            if (r2 == r3) goto L1d
            int r2 = r4.state
            r3 = 2
            if (r2 != r3) goto L1a
            goto L1d
        L1a:
            int r2 = r4.state
            goto L1e
        L1d:
            r2 = 5
        L1e:
            r1.state = r2
            r1.lastStableState = r2
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public android.os.Parcelable onSaveInstanceState(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3) {
            r1 = this;
            com.google.android.material.sidesheet.SideSheetBehavior$SavedState r0 = new com.google.android.material.sidesheet.SideSheetBehavior$SavedState
            android.os.Parcelable r2 = super.onSaveInstanceState(r2, r3)
            r0.<init>(r2, r1)
            return r0
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.MotionEvent r5) {
            r2 = this;
            boolean r3 = r4.isShown()
            if (r3 != 0) goto L8
            r3 = 0
            return r3
        L8:
            int r3 = r5.getActionMasked()
            int r0 = r2.state
            r1 = 1
            if (r0 != r1) goto L14
            if (r3 != 0) goto L14
            return r1
        L14:
            boolean r0 = r2.shouldHandleDraggingWithHelper()
            if (r0 == 0) goto L1f
            androidx.customview.widget.ViewDragHelper r0 = r2.viewDragHelper
            r0.processTouchEvent(r5)
        L1f:
            if (r3 != 0) goto L24
            r2.resetVelocity()
        L24:
            android.view.VelocityTracker r0 = r2.velocityTracker
            if (r0 != 0) goto L2e
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r2.velocityTracker = r0
        L2e:
            android.view.VelocityTracker r0 = r2.velocityTracker
            r0.addMovement(r5)
            boolean r0 = r2.shouldHandleDraggingWithHelper()
            if (r0 == 0) goto L53
            r0 = 2
            if (r3 != r0) goto L53
            boolean r3 = r2.ignoreEvents
            if (r3 != 0) goto L53
            boolean r3 = r2.isDraggedFarEnough(r5)
            if (r3 == 0) goto L53
            androidx.customview.widget.ViewDragHelper r3 = r2.viewDragHelper
            int r0 = r5.getActionIndex()
            int r5 = r5.getPointerId(r0)
            r3.captureChildView(r4, r5)
        L53:
            boolean r3 = r2.ignoreEvents
            r3 = r3 ^ r1
            return r3
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public /* bridge */ /* synthetic */ void removeCallback(com.google.android.material.sidesheet.SheetCallback r1) {
            r0 = this;
            com.google.android.material.sidesheet.SideSheetCallback r1 = (com.google.android.material.sidesheet.SideSheetCallback) r1
            r0.removeCallback(r1)
            return
    }

    public void removeCallback(com.google.android.material.sidesheet.SideSheetCallback r2) {
            r1 = this;
            java.util.Set<com.google.android.material.sidesheet.SideSheetCallback> r0 = r1.callbacks
            r0.remove(r2)
            return
    }

    public void setCoplanarSiblingView(android.view.View r2) {
            r1 = this;
            r0 = -1
            r1.coplanarSiblingViewId = r0
            if (r2 != 0) goto L9
            r1.clearCoplanarSiblingView()
            goto L23
        L9:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.coplanarSiblingViewRef = r0
            java.lang.ref.WeakReference<V extends android.view.View> r2 = r1.viewRef
            if (r2 == 0) goto L23
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            boolean r0 = androidx.core.view.ViewCompat.isLaidOut(r2)
            if (r0 == 0) goto L23
            r2.requestLayout()
        L23:
            return
    }

    public void setCoplanarSiblingViewId(int r3) {
            r2 = this;
            r2.coplanarSiblingViewId = r3
            r2.clearCoplanarSiblingView()
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r2.viewRef
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = -1
            if (r3 == r1) goto L1b
            boolean r3 = androidx.core.view.ViewCompat.isLaidOut(r0)
            if (r3 == 0) goto L1b
            r0.requestLayout()
        L1b:
            return
    }

    public void setDraggable(boolean r1) {
            r0 = this;
            r0.draggable = r1
            return
    }

    public void setHideFriction(float r1) {
            r0 = this;
            r0.hideFriction = r1
            return
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public void setState(int r5) {
            r4 = this;
            r0 = 1
            if (r5 == r0) goto L27
            r1 = 2
            if (r5 != r1) goto L7
            goto L27
        L7:
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r4.viewRef
            if (r0 == 0) goto L23
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L12
            goto L23
        L12:
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r4.viewRef
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            com.google.android.material.sidesheet.SideSheetBehavior$$ExternalSyntheticLambda0 r1 = new com.google.android.material.sidesheet.SideSheetBehavior$$ExternalSyntheticLambda0
            r1.<init>(r4, r5)
            r4.runAfterLayout(r0, r1)
            goto L26
        L23:
            r4.setStateInternal(r5)
        L26:
            return
        L27:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "STATE_"
            r2.<init>(r3)
            if (r5 != r0) goto L35
            java.lang.String r5 = "DRAGGING"
            goto L37
        L35:
            java.lang.String r5 = "SETTLING"
        L37:
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r0 = " should not be set externally."
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5)
            throw r1
    }

    void setStateInternal(int r4) {
            r3 = this;
            int r0 = r3.state
            if (r0 != r4) goto L5
            return
        L5:
            r3.state = r4
            r0 = 3
            if (r4 == r0) goto Ld
            r0 = 5
            if (r4 != r0) goto Lf
        Ld:
            r3.lastStableState = r4
        Lf:
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r3.viewRef
            if (r0 != 0) goto L14
            return
        L14:
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto L1d
            return
        L1d:
            r3.updateSheetVisibility(r0)
            java.util.Set<com.google.android.material.sidesheet.SideSheetCallback> r1 = r3.callbacks
            java.util.Iterator r1 = r1.iterator()
        L26:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r1.next()
            com.google.android.material.sidesheet.SheetCallback r2 = (com.google.android.material.sidesheet.SheetCallback) r2
            r2.onStateChanged(r0, r4)
            goto L26
        L36:
            r3.updateAccessibilityActions()
            return
    }

    boolean shouldHide(android.view.View r2, float r3) {
            r1 = this;
            com.google.android.material.sidesheet.SheetDelegate r0 = r1.sheetDelegate
            boolean r2 = r0.shouldHide(r2, r3)
            return r2
    }

    public boolean shouldSkipSmoothAnimation() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(androidx.activity.BackEventCompat r2) {
            r1 = this;
            com.google.android.material.motion.MaterialSideContainerBackHelper r0 = r1.sideContainerBackHelper
            if (r0 != 0) goto L5
            return
        L5:
            r0.startBackProgress(r2)
            return
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(androidx.activity.BackEventCompat r3) {
            r2 = this;
            com.google.android.material.motion.MaterialSideContainerBackHelper r0 = r2.sideContainerBackHelper
            if (r0 != 0) goto L5
            return
        L5:
            int r1 = r2.getGravityFromSheetEdge()
            r0.updateBackProgress(r3, r1)
            r2.updateCoplanarSiblingBackProgress()
            return
    }
}
