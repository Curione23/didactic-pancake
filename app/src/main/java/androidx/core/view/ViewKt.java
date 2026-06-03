package androidx.core.view;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000j\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a2\u0010 \u001a\u00020!*\u00020\u00022#\b\u0004\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020!0#H\u0086\b\u001a2\u0010'\u001a\u00020!*\u00020\u00022#\b\u0004\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020!0#H\u0086\b\u001a2\u0010(\u001a\u00020!*\u00020\u00022#\b\u0004\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020!0#H\u0086\b\u001a2\u0010)\u001a\u00020!*\u00020\u00022#\b\u0004\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020!0#H\u0086\b\u001a2\u0010*\u001a\u00020+*\u00020\u00022#\b\u0004\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020!0#H\u0086\b\u001a\u0014\u0010,\u001a\u00020-*\u00020\u00022\b\b\u0002\u0010.\u001a\u00020/\u001a%\u00100\u001a\u000201*\u00020\u00022\u0006\u00102\u001a\u0002032\u000e\b\u0004\u0010\"\u001a\b\u0012\u0004\u0012\u00020!04H\u0086\b\u001a \u00105\u001a\u000201*\u00020\u00022\u0006\u00102\u001a\u0002032\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!04\u001a\u0017\u00106\u001a\u00020!*\u00020\u00022\b\b\u0001\u00107\u001a\u00020\u0013H\u0086\b\u001a7\u00108\u001a\u00020!\"\n\b\u0000\u00109\u0018\u0001*\u00020:*\u00020\u00022\u0017\u0010;\u001a\u0013\u0012\u0004\u0012\u0002H9\u0012\u0004\u0012\u00020!0#¢\u0006\u0002\b<H\u0087\b¢\u0006\u0002\b=\u001a&\u00108\u001a\u00020!*\u00020\u00022\u0017\u0010;\u001a\u0013\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020!0#¢\u0006\u0002\b<H\u0086\b\u001a5\u0010>\u001a\u00020!*\u00020\u00022\b\b\u0003\u0010?\u001a\u00020\u00132\b\b\u0003\u0010@\u001a\u00020\u00132\b\b\u0003\u0010A\u001a\u00020\u00132\b\b\u0003\u0010B\u001a\u00020\u0013H\u0086\b\u001a5\u0010C\u001a\u00020!*\u00020\u00022\b\b\u0003\u0010D\u001a\u00020\u00132\b\b\u0003\u0010@\u001a\u00020\u00132\b\b\u0003\u0010E\u001a\u00020\u00132\b\b\u0003\u0010B\u001a\u00020\u0013H\u0086\b\"\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0004\"*\u0010\n\u001a\u00020\t*\u00020\u00022\u0006\u0010\b\u001a\u00020\t8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\"*\u0010\u000e\u001a\u00020\t*\u00020\u00022\u0006\u0010\b\u001a\u00020\t8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\r\"*\u0010\u0010\u001a\u00020\t*\u00020\u00022\u0006\u0010\b\u001a\u00020\t8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\r\"\u0016\u0010\u0012\u001a\u00020\u0013*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0016\u0010\u0016\u001a\u00020\u0013*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015\"\u0016\u0010\u0018\u001a\u00020\u0013*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015\"\u0016\u0010\u001a\u001a\u00020\u0013*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015\"\u0016\u0010\u001c\u001a\u00020\u0013*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0015\"\u0016\u0010\u001e\u001a\u00020\u0013*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0015¨\u0006F"}, d2 = {"allViews", "Lkotlin/sequences/Sequence;", "Landroid/view/View;", "getAllViews", "(Landroid/view/View;)Lkotlin/sequences/Sequence;", "ancestors", "Landroid/view/ViewParent;", "getAncestors", "value", "", "isGone", "(Landroid/view/View;)Z", "setGone", "(Landroid/view/View;Z)V", "isInvisible", "setInvisible", "isVisible", "setVisible", "marginBottom", "", "getMarginBottom", "(Landroid/view/View;)I", "marginEnd", "getMarginEnd", "marginLeft", "getMarginLeft", "marginRight", "getMarginRight", "marginStart", "getMarginStart", "marginTop", "getMarginTop", "doOnAttach", "", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "view", "doOnDetach", "doOnLayout", "doOnNextLayout", "doOnPreDraw", "Landroidx/core/view/OneShotPreDrawListener;", "drawToBitmap", "Landroid/graphics/Bitmap;", "config", "Landroid/graphics/Bitmap$Config;", "postDelayed", "Ljava/lang/Runnable;", "delayInMillis", "", "Lkotlin/Function0;", "postOnAnimationDelayed", "setPadding", "size", "updateLayoutParams", "T", "Landroid/view/ViewGroup$LayoutParams;", "block", "Lkotlin/ExtensionFunctionType;", "updateLayoutParamsTyped", "updatePadding", "left", "top", "right", "bottom", "updatePaddingRelative", "start", "end", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ViewKt {





    /* JADX INFO: renamed from: $r8$lambda$dpsg06okbB847jib5cr-d0X1meI, reason: not valid java name */
    public static /* synthetic */ void m45$r8$lambda$dpsg06okbB847jib5crd0X1meI(kotlin.jvm.functions.Function0 r0) {
            postOnAnimationDelayed$lambda$1(r0)
            return
    }

    public static final void doOnAttach(android.view.View r1, kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> r2) {
            boolean r0 = r1.isAttachedToWindow()
            if (r0 == 0) goto La
            r2.invoke(r1)
            goto L14
        La:
            androidx.core.view.ViewKt$doOnAttach$1 r0 = new androidx.core.view.ViewKt$doOnAttach$1
            r0.<init>(r1, r2)
            android.view.View$OnAttachStateChangeListener r0 = (android.view.View.OnAttachStateChangeListener) r0
            r1.addOnAttachStateChangeListener(r0)
        L14:
            return
    }

    public static final void doOnDetach(android.view.View r1, kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> r2) {
            boolean r0 = r1.isAttachedToWindow()
            if (r0 != 0) goto La
            r2.invoke(r1)
            goto L14
        La:
            androidx.core.view.ViewKt$doOnDetach$1 r0 = new androidx.core.view.ViewKt$doOnDetach$1
            r0.<init>(r1, r2)
            android.view.View$OnAttachStateChangeListener r0 = (android.view.View.OnAttachStateChangeListener) r0
            r1.addOnAttachStateChangeListener(r0)
        L14:
            return
    }

    public static final void doOnLayout(android.view.View r1, kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> r2) {
            boolean r0 = r1.isLaidOut()
            if (r0 == 0) goto L10
            boolean r0 = r1.isLayoutRequested()
            if (r0 != 0) goto L10
            r2.invoke(r1)
            goto L1a
        L10:
            androidx.core.view.ViewKt$doOnLayout$$inlined$doOnNextLayout$1 r0 = new androidx.core.view.ViewKt$doOnLayout$$inlined$doOnNextLayout$1
            r0.<init>(r2)
            android.view.View$OnLayoutChangeListener r0 = (android.view.View.OnLayoutChangeListener) r0
            r1.addOnLayoutChangeListener(r0)
        L1a:
            return
    }

    public static final void doOnNextLayout(android.view.View r1, kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> r2) {
            androidx.core.view.ViewKt$doOnNextLayout$1 r0 = new androidx.core.view.ViewKt$doOnNextLayout$1
            r0.<init>(r2)
            android.view.View$OnLayoutChangeListener r0 = (android.view.View.OnLayoutChangeListener) r0
            r1.addOnLayoutChangeListener(r0)
            return
    }

    public static final androidx.core.view.OneShotPreDrawListener doOnPreDraw(android.view.View r1, kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> r2) {
            androidx.core.view.ViewKt$doOnPreDraw$1 r0 = new androidx.core.view.ViewKt$doOnPreDraw$1
            r0.<init>(r2, r1)
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            androidx.core.view.OneShotPreDrawListener r1 = androidx.core.view.OneShotPreDrawListener.add(r1, r0)
            return r1
    }

    public static final android.graphics.Bitmap drawToBitmap(android.view.View r3, android.graphics.Bitmap.Config r4) {
            boolean r0 = r3.isLaidOut()
            if (r0 == 0) goto L2a
            int r0 = r3.getWidth()
            int r1 = r3.getHeight()
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r0, r1, r4)
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r4)
            int r1 = r3.getScrollX()
            float r1 = (float) r1
            float r1 = -r1
            int r2 = r3.getScrollY()
            float r2 = (float) r2
            float r2 = -r2
            r0.translate(r1, r2)
            r3.draw(r0)
            return r4
        L2a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "View needs to be laid out before calling drawToBitmap()"
            r3.<init>(r4)
            throw r3
    }

    public static /* synthetic */ android.graphics.Bitmap drawToBitmap$default(android.view.View r0, android.graphics.Bitmap.Config r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
        L6:
            android.graphics.Bitmap r0 = drawToBitmap(r0, r1)
            return r0
    }

    public static final kotlin.sequences.Sequence<android.view.View> getAllViews(android.view.View r2) {
            androidx.core.view.ViewKt$allViews$1 r0 = new androidx.core.view.ViewKt$allViews$1
            r1 = 0
            r0.<init>(r2, r1)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            kotlin.sequences.Sequence r2 = kotlin.sequences.SequencesKt.sequence(r0)
            return r2
    }

    public static final kotlin.sequences.Sequence<android.view.ViewParent> getAncestors(android.view.View r1) {
            android.view.ViewParent r1 = r1.getParent()
            androidx.core.view.ViewKt$ancestors$1 r0 = androidx.core.view.ViewKt$ancestors$1.INSTANCE
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.generateSequence(r1, r0)
            return r1
    }

    public static final int getMarginBottom(android.view.View r1) {
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lb
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            if (r1 == 0) goto L11
            int r1 = r1.bottomMargin
            goto L12
        L11:
            r1 = 0
        L12:
            return r1
    }

    public static final int getMarginEnd(android.view.View r1) {
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lf
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r1 = r1.getMarginEnd()
            goto L10
        Lf:
            r1 = 0
        L10:
            return r1
    }

    public static final int getMarginLeft(android.view.View r1) {
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lb
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            if (r1 == 0) goto L11
            int r1 = r1.leftMargin
            goto L12
        L11:
            r1 = 0
        L12:
            return r1
    }

    public static final int getMarginRight(android.view.View r1) {
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lb
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            if (r1 == 0) goto L11
            int r1 = r1.rightMargin
            goto L12
        L11:
            r1 = 0
        L12:
            return r1
    }

    public static final int getMarginStart(android.view.View r1) {
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lf
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r1 = r1.getMarginStart()
            goto L10
        Lf:
            r1 = 0
        L10:
            return r1
    }

    public static final int getMarginTop(android.view.View r1) {
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lb
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            if (r1 == 0) goto L11
            int r1 = r1.topMargin
            goto L12
        L11:
            r1 = 0
        L12:
            return r1
    }

    public static final boolean isGone(android.view.View r1) {
            int r1 = r1.getVisibility()
            r0 = 8
            if (r1 != r0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    public static final boolean isInvisible(android.view.View r1) {
            int r1 = r1.getVisibility()
            r0 = 4
            if (r1 != r0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    public static final boolean isVisible(android.view.View r0) {
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static final java.lang.Runnable postDelayed(android.view.View r1, long r2, kotlin.jvm.functions.Function0<kotlin.Unit> r4) {
            androidx.core.view.ViewKt$postDelayed$runnable$1 r0 = new androidx.core.view.ViewKt$postDelayed$runnable$1
            r0.<init>(r4)
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r1.postDelayed(r0, r2)
            return r0
    }

    public static final java.lang.Runnable postOnAnimationDelayed(android.view.View r1, long r2, kotlin.jvm.functions.Function0<kotlin.Unit> r4) {
            androidx.core.view.ViewKt$$ExternalSyntheticLambda0 r0 = new androidx.core.view.ViewKt$$ExternalSyntheticLambda0
            r0.<init>(r4)
            r1.postOnAnimationDelayed(r0, r2)
            return r0
    }

    private static final void postOnAnimationDelayed$lambda$1(kotlin.jvm.functions.Function0 r0) {
            r0.invoke()
            return
    }

    public static final void setGone(android.view.View r0, boolean r1) {
            if (r1 == 0) goto L5
            r1 = 8
            goto L6
        L5:
            r1 = 0
        L6:
            r0.setVisibility(r1)
            return
    }

    public static final void setInvisible(android.view.View r0, boolean r1) {
            if (r1 == 0) goto L4
            r1 = 4
            goto L5
        L4:
            r1 = 0
        L5:
            r0.setVisibility(r1)
            return
    }

    public static final void setPadding(android.view.View r0, int r1) {
            r0.setPadding(r1, r1, r1, r1)
            return
    }

    public static final void setVisible(android.view.View r0, boolean r1) {
            if (r1 == 0) goto L4
            r1 = 0
            goto L6
        L4:
            r1 = 8
        L6:
            r0.setVisibility(r1)
            return
    }

    public static final void updateLayoutParams(android.view.View r1, kotlin.jvm.functions.Function1<? super android.view.ViewGroup.LayoutParams, kotlin.Unit> r2) {
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            if (r0 == 0) goto Ld
            r2.invoke(r0)
            r1.setLayoutParams(r0)
            return
        Ld:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"
            r1.<init>(r2)
            throw r1
    }

    public static final /* synthetic */ <T extends android.view.ViewGroup.LayoutParams> void updateLayoutParamsTyped(android.view.View r3, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> r4) {
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            r1 = 1
            java.lang.String r2 = "T"
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r1, r2)
            r1 = r0
            android.view.ViewGroup$LayoutParams r1 = (android.view.ViewGroup.LayoutParams) r1
            r4.invoke(r0)
            r3.setLayoutParams(r0)
            return
    }

    public static final void updatePadding(android.view.View r0, int r1, int r2, int r3, int r4) {
            r0.setPadding(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void updatePadding$default(android.view.View r0, int r1, int r2, int r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L8
            int r1 = r0.getPaddingLeft()
        L8:
            r6 = r5 & 2
            if (r6 == 0) goto L10
            int r2 = r0.getPaddingTop()
        L10:
            r6 = r5 & 4
            if (r6 == 0) goto L18
            int r3 = r0.getPaddingRight()
        L18:
            r5 = r5 & 8
            if (r5 == 0) goto L20
            int r4 = r0.getPaddingBottom()
        L20:
            r0.setPadding(r1, r2, r3, r4)
            return
    }

    public static final void updatePaddingRelative(android.view.View r0, int r1, int r2, int r3, int r4) {
            r0.setPaddingRelative(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void updatePaddingRelative$default(android.view.View r0, int r1, int r2, int r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L8
            int r1 = r0.getPaddingStart()
        L8:
            r6 = r5 & 2
            if (r6 == 0) goto L10
            int r2 = r0.getPaddingTop()
        L10:
            r6 = r5 & 4
            if (r6 == 0) goto L18
            int r3 = r0.getPaddingEnd()
        L18:
            r5 = r5 & 8
            if (r5 == 0) goto L20
            int r4 = r0.getPaddingBottom()
        L20:
            r0.setPaddingRelative(r1, r2, r3, r4)
            return
    }
}
