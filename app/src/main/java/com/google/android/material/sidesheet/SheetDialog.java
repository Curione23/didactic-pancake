package com.google.android.material.sidesheet;

import com.google.android.material.sidesheet.SheetCallback;

/* JADX INFO: loaded from: classes.dex */
abstract class SheetDialog<C extends com.google.android.material.sidesheet.SheetCallback> extends androidx.appcompat.app.AppCompatDialog {
    private static final int COORDINATOR_LAYOUT_ID = 0;
    private static final int TOUCH_OUTSIDE_ID = 0;
    private com.google.android.material.motion.MaterialBackOrchestrator backOrchestrator;
    private com.google.android.material.sidesheet.Sheet<C> behavior;
    boolean cancelable;
    private boolean canceledOnTouchOutside;
    private boolean canceledOnTouchOutsideSet;
    private android.widget.FrameLayout container;
    boolean dismissWithAnimation;
    private android.widget.FrameLayout sheet;


    static {
            int r0 = com.google.android.material.R.id.coordinator
            com.google.android.material.sidesheet.SheetDialog.COORDINATOR_LAYOUT_ID = r0
            int r0 = com.google.android.material.R.id.touch_outside
            com.google.android.material.sidesheet.SheetDialog.TOUCH_OUTSIDE_ID = r0
            return
    }

    SheetDialog(android.content.Context r1, int r2, int r3, int r4) {
            r0 = this;
            int r2 = getThemeResId(r1, r2, r3, r4)
            r0.<init>(r1, r2)
            r1 = 1
            r0.cancelable = r1
            r0.canceledOnTouchOutside = r1
            r0.supportRequestWindowFeature(r1)
            return
    }

    private void ensureContainerAndBehavior() {
            r3 = this;
            android.widget.FrameLayout r0 = r3.container
            if (r0 != 0) goto L35
            android.content.Context r0 = r3.getContext()
            int r1 = r3.getLayoutResId()
            r2 = 0
            android.view.View r0 = android.view.View.inflate(r0, r1, r2)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r3.container = r0
            int r1 = r3.getDialogId()
            android.view.View r0 = r0.findViewById(r1)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r3.sheet = r0
            com.google.android.material.sidesheet.Sheet r0 = r3.getBehaviorFromSheet(r0)
            r3.behavior = r0
            r3.addSheetCancelOnHideCallback(r0)
            com.google.android.material.motion.MaterialBackOrchestrator r0 = new com.google.android.material.motion.MaterialBackOrchestrator
            com.google.android.material.sidesheet.Sheet<C extends com.google.android.material.sidesheet.SheetCallback> r1 = r3.behavior
            android.widget.FrameLayout r2 = r3.sheet
            r0.<init>(r1, r2)
            r3.backOrchestrator = r0
        L35:
            return
    }

    private android.widget.FrameLayout getContainer() {
            r1 = this;
            android.widget.FrameLayout r0 = r1.container
            if (r0 != 0) goto L7
            r1.ensureContainerAndBehavior()
        L7:
            android.widget.FrameLayout r0 = r1.container
            return r0
    }

    private android.widget.FrameLayout getSheet() {
            r1 = this;
            android.widget.FrameLayout r0 = r1.sheet
            if (r0 != 0) goto L7
            r1.ensureContainerAndBehavior()
        L7:
            android.widget.FrameLayout r0 = r1.sheet
            return r0
    }

    private static int getThemeResId(android.content.Context r1, int r2, int r3, int r4) {
            if (r2 != 0) goto L16
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r1 = r1.getTheme()
            r0 = 1
            boolean r1 = r1.resolveAttribute(r3, r2, r0)
            if (r1 == 0) goto L15
            int r2 = r2.resourceId
            goto L16
        L15:
            r2 = r4
        L16:
            return r2
    }

    private void maybeUpdateWindowAnimationsBasedOnLayoutDirection() {
            r3 = this;
            android.view.Window r0 = r3.getWindow()
            if (r0 == 0) goto L31
            android.widget.FrameLayout r1 = r3.sheet
            if (r1 == 0) goto L31
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r1 = r1 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams
            if (r1 == 0) goto L31
            android.widget.FrameLayout r1 = r3.sheet
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r1
            int r1 = r1.gravity
            android.widget.FrameLayout r2 = r3.sheet
            int r2 = androidx.core.view.ViewCompat.getLayoutDirection(r2)
            int r1 = androidx.core.view.GravityCompat.getAbsoluteGravity(r1, r2)
            r2 = 3
            if (r1 != r2) goto L2c
            int r1 = com.google.android.material.R.style.Animation_Material3_SideSheetDialog_Left
            goto L2e
        L2c:
            int r1 = com.google.android.material.R.style.Animation_Material3_SideSheetDialog_Right
        L2e:
            r0.setWindowAnimations(r1)
        L31:
            return
    }

    private boolean shouldWindowCloseOnTouchOutside() {
            r3 = this;
            boolean r0 = r3.canceledOnTouchOutsideSet
            if (r0 != 0) goto L20
            android.content.Context r0 = r3.getContext()
            r1 = 16843611(0x101035b, float:2.3695965E-38)
            int[] r1 = new int[]{r1}
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1)
            r1 = 0
            r2 = 1
            boolean r1 = r0.getBoolean(r1, r2)
            r3.canceledOnTouchOutside = r1
            r0.recycle()
            r3.canceledOnTouchOutsideSet = r2
        L20:
            boolean r0 = r3.canceledOnTouchOutside
            return r0
    }

    private void updateListeningForBackCallbacks() {
            r2 = this;
            com.google.android.material.motion.MaterialBackOrchestrator r0 = r2.backOrchestrator
            if (r0 != 0) goto L5
            return
        L5:
            boolean r1 = r2.cancelable
            if (r1 == 0) goto Ld
            r0.startListeningForBackCallbacks()
            goto L10
        Ld:
            r0.stopListeningForBackCallbacks()
        L10:
            return
    }

    private android.view.View wrapInSheet(int r3, android.view.View r4, android.view.ViewGroup.LayoutParams r5) {
            r2 = this;
            r2.ensureContainerAndBehavior()
            android.widget.FrameLayout r0 = r2.getContainer()
            int r1 = com.google.android.material.sidesheet.SheetDialog.COORDINATOR_LAYOUT_ID
            android.view.View r0 = r0.findViewById(r1)
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            if (r3 == 0) goto L1c
            if (r4 != 0) goto L1c
            android.view.LayoutInflater r4 = r2.getLayoutInflater()
            r1 = 0
            android.view.View r4 = r4.inflate(r3, r0, r1)
        L1c:
            android.widget.FrameLayout r3 = r2.getSheet()
            r3.removeAllViews()
            if (r5 != 0) goto L29
            r3.addView(r4)
            goto L2c
        L29:
            r3.addView(r4, r5)
        L2c:
            int r3 = com.google.android.material.sidesheet.SheetDialog.TOUCH_OUTSIDE_ID
            android.view.View r3 = r0.findViewById(r3)
            com.google.android.material.sidesheet.SheetDialog$$ExternalSyntheticLambda0 r4 = new com.google.android.material.sidesheet.SheetDialog$$ExternalSyntheticLambda0
            r4.<init>(r2)
            r3.setOnClickListener(r4)
            android.widget.FrameLayout r3 = r2.getSheet()
            com.google.android.material.sidesheet.SheetDialog$1 r4 = new com.google.android.material.sidesheet.SheetDialog$1
            r4.<init>(r2)
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r3, r4)
            android.widget.FrameLayout r3 = r2.container
            return r3
    }

    abstract void addSheetCancelOnHideCallback(com.google.android.material.sidesheet.Sheet<C> r1);

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
            r3 = this;
            com.google.android.material.sidesheet.Sheet r0 = r3.getBehavior()
            boolean r1 = r3.dismissWithAnimation
            if (r1 == 0) goto L14
            int r1 = r0.getState()
            r2 = 5
            if (r1 != r2) goto L10
            goto L14
        L10:
            r0.setState(r2)
            goto L17
        L14:
            super.cancel()
        L17:
            return
    }

    com.google.android.material.sidesheet.Sheet<C> getBehavior() {
            r1 = this;
            com.google.android.material.sidesheet.Sheet<C extends com.google.android.material.sidesheet.SheetCallback> r0 = r1.behavior
            if (r0 != 0) goto L7
            r1.ensureContainerAndBehavior()
        L7:
            com.google.android.material.sidesheet.Sheet<C extends com.google.android.material.sidesheet.SheetCallback> r0 = r1.behavior
            return r0
    }

    abstract com.google.android.material.sidesheet.Sheet<C> getBehaviorFromSheet(android.widget.FrameLayout r1);

    abstract int getDialogId();

    abstract int getLayoutResId();

    abstract int getStateOnStart();

    public boolean isDismissWithSheetAnimationEnabled() {
            r1 = this;
            boolean r0 = r1.dismissWithAnimation
            return r0
    }

    /* JADX INFO: renamed from: lambda$wrapInSheet$0$com-google-android-material-sidesheet-SheetDialog, reason: not valid java name */
    /* synthetic */ void m676x401f75dd(android.view.View r1) {
            r0 = this;
            boolean r1 = r0.cancelable
            if (r1 == 0) goto L13
            boolean r1 = r0.isShowing()
            if (r1 == 0) goto L13
            boolean r1 = r0.shouldWindowCloseOnTouchOutside()
            if (r1 == 0) goto L13
            r0.cancel()
        L13:
            return
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            r0.maybeUpdateWindowAnimationsBasedOnLayoutDirection()
            r0.updateListeningForBackCallbacks()
            return
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    protected void onCreate(android.os.Bundle r2) {
            r1 = this;
            super.onCreate(r2)
            android.view.Window r2 = r1.getWindow()
            if (r2 == 0) goto L16
            r0 = 0
            r2.setStatusBarColor(r0)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.addFlags(r0)
            r0 = -1
            r2.setLayout(r0, r0)
        L16:
            return
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            com.google.android.material.motion.MaterialBackOrchestrator r0 = r1.backOrchestrator
            if (r0 == 0) goto La
            r0.stopListeningForBackCallbacks()
        La:
            return
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    protected void onStart() {
            r2 = this;
            super.onStart()
            com.google.android.material.sidesheet.Sheet<C extends com.google.android.material.sidesheet.SheetCallback> r0 = r2.behavior
            if (r0 == 0) goto L17
            int r0 = r0.getState()
            r1 = 5
            if (r0 != r1) goto L17
            com.google.android.material.sidesheet.Sheet<C extends com.google.android.material.sidesheet.SheetCallback> r0 = r2.behavior
            int r1 = r2.getStateOnStart()
            r0.setState(r1)
        L17:
            return
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean r2) {
            r1 = this;
            super.setCancelable(r2)
            boolean r0 = r1.cancelable
            if (r0 == r2) goto L9
            r1.cancelable = r2
        L9:
            android.view.Window r2 = r1.getWindow()
            if (r2 == 0) goto L12
            r1.updateListeningForBackCallbacks()
        L12:
            return
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean r3) {
            r2 = this;
            super.setCanceledOnTouchOutside(r3)
            r0 = 1
            if (r3 == 0) goto Lc
            boolean r1 = r2.cancelable
            if (r1 != 0) goto Lc
            r2.cancelable = r0
        Lc:
            r2.canceledOnTouchOutside = r3
            r2.canceledOnTouchOutsideSet = r0
            return
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(int r2) {
            r1 = this;
            r0 = 0
            android.view.View r2 = r1.wrapInSheet(r2, r0, r0)
            super.setContentView(r2)
            return
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(android.view.View r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            android.view.View r3 = r2.wrapInSheet(r0, r3, r1)
            super.setContentView(r3)
            return
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            r0 = 0
            android.view.View r2 = r1.wrapInSheet(r0, r2, r3)
            super.setContentView(r2)
            return
    }

    public void setDismissWithSheetAnimationEnabled(boolean r1) {
            r0 = this;
            r0.dismissWithAnimation = r1
            return
    }

    public void setSheetEdge(int r3) {
            r2 = this;
            android.widget.FrameLayout r0 = r2.sheet
            if (r0 == 0) goto L24
            boolean r0 = androidx.core.view.ViewCompat.isLaidOut(r0)
            if (r0 != 0) goto L1c
            android.widget.FrameLayout r0 = r2.sheet
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r1 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams
            if (r1 == 0) goto L1b
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
            r0.gravity = r3
            r2.maybeUpdateWindowAnimationsBasedOnLayoutDirection()
        L1b:
            return
        L1c:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Sheet view has been laid out; sheet edge cannot be changed once the sheet has been laid out."
            r3.<init>(r0)
            throw r3
        L24:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Sheet view reference is null; sheet edge cannot be changed if the sheet view is null."
            r3.<init>(r0)
            throw r3
    }
}
