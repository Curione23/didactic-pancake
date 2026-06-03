package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class AppCompatCheckedTextViewHelper {
    private android.content.res.ColorStateList mCheckMarkTintList;
    private android.graphics.PorterDuff.Mode mCheckMarkTintMode;
    private boolean mHasCheckMarkTint;
    private boolean mHasCheckMarkTintMode;
    private boolean mSkipNextApply;
    private final android.widget.CheckedTextView mView;

    AppCompatCheckedTextViewHelper(android.widget.CheckedTextView r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mCheckMarkTintList = r0
            r1.mCheckMarkTintMode = r0
            r0 = 0
            r1.mHasCheckMarkTint = r0
            r1.mHasCheckMarkTintMode = r0
            r1.mView = r2
            return
    }

    void applyCheckMarkTint() {
            r2 = this;
            android.widget.CheckedTextView r0 = r2.mView
            android.graphics.drawable.Drawable r0 = androidx.core.widget.CheckedTextViewCompat.getCheckMarkDrawable(r0)
            if (r0 == 0) goto L3e
            boolean r1 = r2.mHasCheckMarkTint
            if (r1 != 0) goto L10
            boolean r1 = r2.mHasCheckMarkTintMode
            if (r1 == 0) goto L3e
        L10:
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
            android.graphics.drawable.Drawable r0 = r0.mutate()
            boolean r1 = r2.mHasCheckMarkTint
            if (r1 == 0) goto L21
            android.content.res.ColorStateList r1 = r2.mCheckMarkTintList
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r1)
        L21:
            boolean r1 = r2.mHasCheckMarkTintMode
            if (r1 == 0) goto L2a
            android.graphics.PorterDuff$Mode r1 = r2.mCheckMarkTintMode
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(r0, r1)
        L2a:
            boolean r1 = r0.isStateful()
            if (r1 == 0) goto L39
            android.widget.CheckedTextView r1 = r2.mView
            int[] r1 = r1.getDrawableState()
            r0.setState(r1)
        L39:
            android.widget.CheckedTextView r1 = r2.mView
            r1.setCheckMarkDrawable(r0)
        L3e:
            return
    }

    android.content.res.ColorStateList getSupportCheckMarkTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.mCheckMarkTintList
            return r0
    }

    android.graphics.PorterDuff.Mode getSupportCheckMarkTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.mCheckMarkTintMode
            return r0
    }

    void loadFromAttributes(android.util.AttributeSet r11, int r12) {
            r10 = this;
            android.widget.CheckedTextView r0 = r10.mView
            android.content.Context r0 = r0.getContext()
            int[] r1 = androidx.appcompat.R.styleable.CheckedTextView
            r2 = 0
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r0, r11, r1, r12, r2)
            android.widget.CheckedTextView r3 = r10.mView
            android.content.Context r4 = r3.getContext()
            int[] r5 = androidx.appcompat.R.styleable.CheckedTextView
            android.content.res.TypedArray r7 = r0.getWrappedTypeArray()
            r9 = 0
            r6 = r11
            r8 = r12
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r3, r4, r5, r6, r7, r8, r9)
            int r11 = androidx.appcompat.R.styleable.CheckedTextView_checkMarkCompat     // Catch: java.lang.Throwable -> L8a
            boolean r11 = r0.hasValue(r11)     // Catch: java.lang.Throwable -> L8a
            if (r11 == 0) goto L3d
            int r11 = androidx.appcompat.R.styleable.CheckedTextView_checkMarkCompat     // Catch: java.lang.Throwable -> L8a
            int r11 = r0.getResourceId(r11, r2)     // Catch: java.lang.Throwable -> L8a
            if (r11 == 0) goto L3d
            android.widget.CheckedTextView r12 = r10.mView     // Catch: android.content.res.Resources.NotFoundException -> L3d java.lang.Throwable -> L8a
            android.content.Context r1 = r12.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L3d java.lang.Throwable -> L8a
            android.graphics.drawable.Drawable r11 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r1, r11)     // Catch: android.content.res.Resources.NotFoundException -> L3d java.lang.Throwable -> L8a
            r12.setCheckMarkDrawable(r11)     // Catch: android.content.res.Resources.NotFoundException -> L3d java.lang.Throwable -> L8a
            goto L5a
        L3d:
            int r11 = androidx.appcompat.R.styleable.CheckedTextView_android_checkMark     // Catch: java.lang.Throwable -> L8a
            boolean r11 = r0.hasValue(r11)     // Catch: java.lang.Throwable -> L8a
            if (r11 == 0) goto L5a
            int r11 = androidx.appcompat.R.styleable.CheckedTextView_android_checkMark     // Catch: java.lang.Throwable -> L8a
            int r11 = r0.getResourceId(r11, r2)     // Catch: java.lang.Throwable -> L8a
            if (r11 == 0) goto L5a
            android.widget.CheckedTextView r12 = r10.mView     // Catch: java.lang.Throwable -> L8a
            android.content.Context r1 = r12.getContext()     // Catch: java.lang.Throwable -> L8a
            android.graphics.drawable.Drawable r11 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r1, r11)     // Catch: java.lang.Throwable -> L8a
            r12.setCheckMarkDrawable(r11)     // Catch: java.lang.Throwable -> L8a
        L5a:
            int r11 = androidx.appcompat.R.styleable.CheckedTextView_checkMarkTint     // Catch: java.lang.Throwable -> L8a
            boolean r11 = r0.hasValue(r11)     // Catch: java.lang.Throwable -> L8a
            if (r11 == 0) goto L6d
            android.widget.CheckedTextView r11 = r10.mView     // Catch: java.lang.Throwable -> L8a
            int r12 = androidx.appcompat.R.styleable.CheckedTextView_checkMarkTint     // Catch: java.lang.Throwable -> L8a
            android.content.res.ColorStateList r12 = r0.getColorStateList(r12)     // Catch: java.lang.Throwable -> L8a
            androidx.core.widget.CheckedTextViewCompat.setCheckMarkTintList(r11, r12)     // Catch: java.lang.Throwable -> L8a
        L6d:
            int r11 = androidx.appcompat.R.styleable.CheckedTextView_checkMarkTintMode     // Catch: java.lang.Throwable -> L8a
            boolean r11 = r0.hasValue(r11)     // Catch: java.lang.Throwable -> L8a
            if (r11 == 0) goto L86
            android.widget.CheckedTextView r11 = r10.mView     // Catch: java.lang.Throwable -> L8a
            int r12 = androidx.appcompat.R.styleable.CheckedTextView_checkMarkTintMode     // Catch: java.lang.Throwable -> L8a
            r1 = -1
            int r12 = r0.getInt(r12, r1)     // Catch: java.lang.Throwable -> L8a
            r1 = 0
            android.graphics.PorterDuff$Mode r12 = androidx.appcompat.widget.DrawableUtils.parseTintMode(r12, r1)     // Catch: java.lang.Throwable -> L8a
            androidx.core.widget.CheckedTextViewCompat.setCheckMarkTintMode(r11, r12)     // Catch: java.lang.Throwable -> L8a
        L86:
            r0.recycle()
            return
        L8a:
            r11 = move-exception
            r0.recycle()
            throw r11
    }

    void onSetCheckMarkDrawable() {
            r1 = this;
            boolean r0 = r1.mSkipNextApply
            if (r0 == 0) goto L8
            r0 = 0
            r1.mSkipNextApply = r0
            return
        L8:
            r0 = 1
            r1.mSkipNextApply = r0
            r1.applyCheckMarkTint()
            return
    }

    void setSupportCheckMarkTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.mCheckMarkTintList = r1
            r1 = 1
            r0.mHasCheckMarkTint = r1
            r0.applyCheckMarkTint()
            return
    }

    void setSupportCheckMarkTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.mCheckMarkTintMode = r1
            r1 = 1
            r0.mHasCheckMarkTintMode = r1
            r0.applyCheckMarkTint()
            return
    }
}
