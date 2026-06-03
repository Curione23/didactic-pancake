package androidx.fragment.app;

/* JADX INFO: compiled from: FragmentContainerView.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001<B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B#\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB\u001f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0011H\u0002J\"\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0017J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\"H\u0014J \u0010#\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010$\u001a\u00020%H\u0014J\u0010\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u0011H\u0016J\u0017\u0010(\u001a\u0002H)\"\n\b\u0000\u0010)*\u0004\u0018\u00010*¢\u0006\u0002\u0010+J\u0010\u0010,\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0017J\b\u0010-\u001a\u00020\u0016H\u0016J\u0010\u0010.\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u0011H\u0016J\u0010\u0010/\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\bH\u0016J\u0010\u00100\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u0011H\u0016J\u0018\u00101\u001a\u00020\u00162\u0006\u00102\u001a\u00020\b2\u0006\u00103\u001a\u00020\bH\u0016J\u0018\u00104\u001a\u00020\u00162\u0006\u00102\u001a\u00020\b2\u0006\u00103\u001a\u00020\bH\u0016J\u0010\u00105\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0013H\u0001J\u0012\u00106\u001a\u00020\u00162\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u0010\u00109\u001a\u00020\u00162\u0006\u0010:\u001a\u00020\u000eH\u0016J\u0010\u0010;\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u0011H\u0016R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "fm", "Landroidx/fragment/app/FragmentManager;", "(Landroid/content/Context;Landroid/util/AttributeSet;Landroidx/fragment/app/FragmentManager;)V", "applyWindowInsetsListener", "Landroid/view/View$OnApplyWindowInsetsListener;", "disappearingFragmentChildren", "", "Landroid/view/View;", "drawDisappearingViewsFirst", "", "transitioningFragmentViews", "addDisappearingFragmentView", "", "v", "addView", "child", "index", "params", "Landroid/view/ViewGroup$LayoutParams;", "dispatchApplyWindowInsets", "Landroid/view/WindowInsets;", "insets", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "drawChild", "drawingTime", "", "endViewTransition", "view", "getFragment", "F", "Landroidx/fragment/app/Fragment;", "()Landroidx/fragment/app/Fragment;", "onApplyWindowInsets", "removeAllViewsInLayout", "removeView", "removeViewAt", "removeViewInLayout", "removeViews", "start", "count", "removeViewsInLayout", "setDrawDisappearingViewsLast", "setLayoutTransition", "transition", "Landroid/animation/LayoutTransition;", "setOnApplyWindowInsetsListener", "listener", "startViewTransition", "Api20Impl", "fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class FragmentContainerView extends android.widget.FrameLayout {
    private android.view.View.OnApplyWindowInsetsListener applyWindowInsetsListener;
    private final java.util.List<android.view.View> disappearingFragmentChildren;
    private boolean drawDisappearingViewsFirst;
    private final java.util.List<android.view.View> transitioningFragmentViews;

    /* JADX INFO: compiled from: FragmentContainerView.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Landroidx/fragment/app/FragmentContainerView$Api20Impl;", "", "()V", "onApplyWindowInsets", "Landroid/view/WindowInsets;", "onApplyWindowInsetsListener", "Landroid/view/View$OnApplyWindowInsetsListener;", "v", "Landroid/view/View;", "insets", "fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Api20Impl {
        public static final androidx.fragment.app.FragmentContainerView.Api20Impl INSTANCE = null;

        static {
                androidx.fragment.app.FragmentContainerView$Api20Impl r0 = new androidx.fragment.app.FragmentContainerView$Api20Impl
                r0.<init>()
                androidx.fragment.app.FragmentContainerView.Api20Impl.INSTANCE = r0
                return
        }

        private Api20Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public final android.view.WindowInsets onApplyWindowInsets(android.view.View.OnApplyWindowInsetsListener r2, android.view.View r3, android.view.WindowInsets r4) {
                r1 = this;
                java.lang.String r0 = "onApplyWindowInsetsListener"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "v"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "insets"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                android.view.WindowInsets r2 = r2.onApplyWindowInsets(r3, r4)
                java.lang.String r3 = "onApplyWindowInsetsListe…lyWindowInsets(v, insets)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                return r2
        }
    }

    public FragmentContainerView(android.content.Context r2) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
            r1.disappearingFragmentChildren = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
            r1.transitioningFragmentViews = r2
            r2 = 1
            r1.drawDisappearingViewsFirst = r2
            return
    }

    public FragmentContainerView(android.content.Context r8, android.util.AttributeSet r9) {
            r7 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    public FragmentContainerView(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r2.<init>(r3, r4, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.List r5 = (java.util.List) r5
            r2.disappearingFragmentChildren = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.List r5 = (java.util.List) r5
            r2.transitioningFragmentViews = r5
            r5 = 1
            r2.drawDisappearingViewsFirst = r5
            if (r4 == 0) goto L6d
            java.lang.String r5 = r4.getClassAttribute()
            int[] r0 = androidx.fragment.R.styleable.FragmentContainerView
            java.lang.String r1 = "FragmentContainerView"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r1 = 0
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r0, r1, r1)
            if (r5 != 0) goto L3a
            int r4 = androidx.fragment.R.styleable.FragmentContainerView_android_name
            java.lang.String r5 = r3.getString(r4)
            java.lang.String r4 = "android:name"
            goto L3c
        L3a:
            java.lang.String r4 = "class"
        L3c:
            r3.recycle()
            if (r5 == 0) goto L6d
            boolean r3 = r2.isInEditMode()
            if (r3 == 0) goto L48
            goto L6d
        L48:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FragmentContainerView must be within a FragmentActivity to use "
            r0.<init>(r1)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r0 = "=\""
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.StringBuilder r4 = r4.append(r5)
            r5 = 34
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L6d:
            return
    }

    public /* synthetic */ FragmentContainerView(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            r0.<init>(r1, r2, r3)
            return
    }

    public FragmentContainerView(android.content.Context r6, android.util.AttributeSet r7, androidx.fragment.app.FragmentManager r8) {
            r5 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "attrs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "fm"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5.<init>(r6, r7)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            r5.disappearingFragmentChildren = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            r5.transitioningFragmentViews = r0
            r0 = 1
            r5.drawDisappearingViewsFirst = r0
            java.lang.String r1 = r7.getClassAttribute()
            int[] r2 = androidx.fragment.R.styleable.FragmentContainerView
            java.lang.String r3 = "FragmentContainerView"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r3 = 0
            android.content.res.TypedArray r2 = r6.obtainStyledAttributes(r7, r2, r3, r3)
            if (r1 != 0) goto L3f
            int r1 = androidx.fragment.R.styleable.FragmentContainerView_android_name
            java.lang.String r1 = r2.getString(r1)
        L3f:
            int r3 = androidx.fragment.R.styleable.FragmentContainerView_android_tag
            java.lang.String r3 = r2.getString(r3)
            r2.recycle()
            int r2 = r5.getId()
            androidx.fragment.app.Fragment r4 = r8.findFragmentById(r2)
            if (r1 == 0) goto Lab
            if (r4 != 0) goto Lab
            r4 = -1
            if (r2 != r4) goto L84
            if (r3 == 0) goto L69
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = " with tag "
            r6.<init>(r7)
            java.lang.StringBuilder r6 = r6.append(r3)
            java.lang.String r6 = r6.toString()
            goto L6b
        L69:
            java.lang.String r6 = ""
        L6b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "FragmentContainerView must have an android:id to add Fragment "
            r8.<init>(r0)
            java.lang.StringBuilder r8 = r8.append(r1)
            java.lang.StringBuilder r6 = r8.append(r6)
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        L84:
            androidx.fragment.app.FragmentFactory r2 = r8.getFragmentFactory()
            java.lang.ClassLoader r4 = r6.getClassLoader()
            androidx.fragment.app.Fragment r1 = r2.instantiate(r4, r1)
            java.lang.String r2 = "fm.fragmentFactory.insta…ontext.classLoader, name)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r2 = 0
            r1.onInflate(r6, r7, r2)
            androidx.fragment.app.FragmentTransaction r6 = r8.beginTransaction()
            androidx.fragment.app.FragmentTransaction r6 = r6.setReorderingAllowed(r0)
            r7 = r5
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            androidx.fragment.app.FragmentTransaction r6 = r6.add(r7, r1, r3)
            r6.commitNowAllowingStateLoss()
        Lab:
            r8.onContainerAvailable(r5)
            return
    }

    private final void addDisappearingFragmentView(android.view.View r2) {
            r1 = this;
            java.util.List<android.view.View> r0 = r1.transitioningFragmentViews
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto Ld
            java.util.List<android.view.View> r0 = r1.disappearingFragmentChildren
            r0.add(r2)
        Ld:
            return
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r2, int r3, android.view.ViewGroup.LayoutParams r4) {
            r1 = this;
            java.lang.String r0 = "child"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            androidx.fragment.app.Fragment r0 = androidx.fragment.app.FragmentManager.getViewFragment(r2)
            if (r0 == 0) goto Lf
            super.addView(r2, r3, r4)
            return
        Lf:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Views added to a FragmentContainerView must be associated with a Fragment. View "
            r3.<init>(r4)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r3 = " is not associated with a Fragment."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    @Override // android.view.ViewGroup, android.view.View
    public android.view.WindowInsets dispatchApplyWindowInsets(android.view.WindowInsets r5) {
            r4 = this;
            java.lang.String r0 = "insets"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r5)
            java.lang.String r1 = "toWindowInsetsCompat(insets)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            android.view.View$OnApplyWindowInsetsListener r1 = r4.applyWindowInsetsListener
            if (r1 == 0) goto L25
            androidx.fragment.app.FragmentContainerView$Api20Impl r0 = androidx.fragment.app.FragmentContainerView.Api20Impl.INSTANCE
            android.view.View$OnApplyWindowInsetsListener r1 = r4.applyWindowInsetsListener
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r2 = r4
            android.view.View r2 = (android.view.View) r2
            android.view.WindowInsets r0 = r0.onApplyWindowInsets(r1, r2, r5)
            androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r0)
            goto L2c
        L25:
            r1 = r4
            android.view.View r1 = (android.view.View) r1
            androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.ViewCompat.onApplyWindowInsets(r1, r0)
        L2c:
            java.lang.String r1 = "if (applyWindowInsetsLis…, insetsCompat)\n        }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            boolean r1 = r0.isConsumed()
            if (r1 != 0) goto L48
            int r1 = r4.getChildCount()
            r2 = 0
        L3c:
            if (r2 >= r1) goto L48
            android.view.View r3 = r4.getChildAt(r2)
            androidx.core.view.ViewCompat.dispatchApplyWindowInsets(r3, r0)
            int r2 = r2 + 1
            goto L3c
        L48:
            return r5
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas r5) {
            r4 = this;
            java.lang.String r0 = "canvas"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            boolean r0 = r4.drawDisappearingViewsFirst
            if (r0 == 0) goto L25
            java.util.List<android.view.View> r0 = r4.disappearingFragmentChildren
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            android.view.View r1 = (android.view.View) r1
            long r2 = r4.getDrawingTime()
            super.drawChild(r5, r1, r2)
            goto L11
        L25:
            super.dispatchDraw(r5)
            return
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(android.graphics.Canvas r2, android.view.View r3, long r4) {
            r1 = this;
            java.lang.String r0 = "canvas"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "child"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r1.drawDisappearingViewsFirst
            if (r0 == 0) goto L22
            java.util.List<android.view.View> r0 = r1.disappearingFragmentChildren
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L22
            java.util.List<android.view.View> r0 = r1.disappearingFragmentChildren
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L22
            r2 = 0
            return r2
        L22:
            boolean r2 = super.drawChild(r2, r3, r4)
            return r2
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(android.view.View r2) {
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.List<android.view.View> r0 = r1.transitioningFragmentViews
            r0.remove(r2)
            java.util.List<android.view.View> r0 = r1.disappearingFragmentChildren
            boolean r0 = r0.remove(r2)
            if (r0 == 0) goto L15
            r0 = 1
            r1.drawDisappearingViewsFirst = r0
        L15:
            super.endViewTransition(r2)
            return
    }

    public final <F extends androidx.fragment.app.Fragment> F getFragment() {
            r2 = this;
            r0 = r2
            android.view.View r0 = (android.view.View) r0
            androidx.fragment.app.FragmentManager r0 = androidx.fragment.app.FragmentManager.findFragmentManager(r0)
            int r1 = r2.getId()
            androidx.fragment.app.Fragment r0 = r0.findFragmentById(r1)
            return r0
    }

    @Override // android.view.View
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r2) {
            r1 = this;
            java.lang.String r0 = "insets"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            return r2
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
            r3 = this;
            int r0 = r3.getChildCount()
            int r0 = r0 + (-1)
        L6:
            r1 = -1
            if (r1 >= r0) goto L18
            android.view.View r1 = r3.getChildAt(r0)
            java.lang.String r2 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r3.addDisappearingFragmentView(r1)
            int r0 = r0 + (-1)
            goto L6
        L18:
            super.removeAllViewsInLayout()
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View r2) {
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.addDisappearingFragmentView(r2)
            super.removeView(r2)
            return
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int r3) {
            r2 = this;
            android.view.View r0 = r2.getChildAt(r3)
            java.lang.String r1 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.addDisappearingFragmentView(r0)
            super.removeViewAt(r3)
            return
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(android.view.View r2) {
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.addDisappearingFragmentView(r2)
            super.removeViewInLayout(r2)
            return
    }

    @Override // android.view.ViewGroup
    public void removeViews(int r5, int r6) {
            r4 = this;
            int r0 = r5 + r6
            r1 = r5
        L3:
            if (r1 >= r0) goto L14
            android.view.View r2 = r4.getChildAt(r1)
            java.lang.String r3 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r4.addDisappearingFragmentView(r2)
            int r1 = r1 + 1
            goto L3
        L14:
            super.removeViews(r5, r6)
            return
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int r5, int r6) {
            r4 = this;
            int r0 = r5 + r6
            r1 = r5
        L3:
            if (r1 >= r0) goto L14
            android.view.View r2 = r4.getChildAt(r1)
            java.lang.String r3 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r4.addDisappearingFragmentView(r2)
            int r1 = r1 + 1
            goto L3
        L14:
            super.removeViewsInLayout(r5, r6)
            return
    }

    public final void setDrawDisappearingViewsLast(boolean r1) {
            r0 = this;
            r0.drawDisappearingViewsFirst = r1
            return
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(android.animation.LayoutTransition r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\"."
            r2.<init>(r0)
            throw r2
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(android.view.View.OnApplyWindowInsetsListener r2) {
            r1 = this;
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.applyWindowInsetsListener = r2
            return
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(android.view.View r2) {
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            android.view.ViewParent r0 = r2.getParent()
            if (r0 != r1) goto L10
            java.util.List<android.view.View> r0 = r1.transitioningFragmentViews
            r0.add(r2)
        L10:
            super.startViewTransition(r2)
            return
    }
}
