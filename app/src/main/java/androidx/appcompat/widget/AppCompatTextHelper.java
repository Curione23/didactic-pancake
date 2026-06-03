package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class AppCompatTextHelper {
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    private static final int TEXT_FONT_WEIGHT_UNSPECIFIED = -1;
    private boolean mAsyncFontPending;
    private final androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper;
    private androidx.appcompat.widget.TintInfo mDrawableBottomTint;
    private androidx.appcompat.widget.TintInfo mDrawableEndTint;
    private androidx.appcompat.widget.TintInfo mDrawableLeftTint;
    private androidx.appcompat.widget.TintInfo mDrawableRightTint;
    private androidx.appcompat.widget.TintInfo mDrawableStartTint;
    private androidx.appcompat.widget.TintInfo mDrawableTint;
    private androidx.appcompat.widget.TintInfo mDrawableTopTint;
    private android.graphics.Typeface mFontTypeface;
    private int mFontWeight;
    private int mStyle;
    private final android.widget.TextView mView;



    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.util.Locale forLanguageTag(java.lang.String r0) {
                java.util.Locale r0 = java.util.Locale.forLanguageTag(r0)
                return r0
        }
    }

    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.os.LocaleList forLanguageTags(java.lang.String r0) {
                android.os.LocaleList r0 = android.os.LocaleList.forLanguageTags(r0)
                return r0
        }

        static void setTextLocales(android.widget.TextView r0, android.os.LocaleList r1) {
                r0.setTextLocales(r1)
                return
        }
    }

    static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getAutoSizeStepGranularity(android.widget.TextView r0) {
                int r0 = r0.getAutoSizeStepGranularity()
                return r0
        }

        static void setAutoSizeTextTypeUniformWithConfiguration(android.widget.TextView r0, int r1, int r2, int r3, int r4) {
                r0.setAutoSizeTextTypeUniformWithConfiguration(r1, r2, r3, r4)
                return
        }

        static void setAutoSizeTextTypeUniformWithPresetSizes(android.widget.TextView r0, int[] r1, int r2) {
                r0.setAutoSizeTextTypeUniformWithPresetSizes(r1, r2)
                return
        }

        static boolean setFontVariationSettings(android.widget.TextView r0, java.lang.String r1) {
                boolean r0 = r0.setFontVariationSettings(r1)
                return r0
        }
    }

    static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.graphics.Typeface create(android.graphics.Typeface r0, int r1, boolean r2) {
                android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r1, r2)
                return r0
        }
    }

    AppCompatTextHelper(android.widget.TextView r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mStyle = r0
            r0 = -1
            r1.mFontWeight = r0
            r1.mView = r2
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = new androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper
            r0.<init>(r2)
            r1.mAutoSizeTextHelper = r0
            return
    }

    private void applyCompoundDrawableTint(android.graphics.drawable.Drawable r2, androidx.appcompat.widget.TintInfo r3) {
            r1 = this;
            if (r2 == 0) goto Ld
            if (r3 == 0) goto Ld
            android.widget.TextView r0 = r1.mView
            int[] r0 = r0.getDrawableState()
            androidx.appcompat.widget.AppCompatDrawableManager.tintDrawable(r2, r3, r0)
        Ld:
            return
    }

    private static androidx.appcompat.widget.TintInfo createTintInfo(android.content.Context r0, androidx.appcompat.widget.AppCompatDrawableManager r1, int r2) {
            android.content.res.ColorStateList r0 = r1.getTintList(r0, r2)
            if (r0 == 0) goto L11
            androidx.appcompat.widget.TintInfo r1 = new androidx.appcompat.widget.TintInfo
            r1.<init>()
            r2 = 1
            r1.mHasTintList = r2
            r1.mTintList = r0
            return r1
        L11:
            r0 = 0
            return r0
    }

    private void setCompoundDrawables(android.graphics.drawable.Drawable r6, android.graphics.drawable.Drawable r7, android.graphics.drawable.Drawable r8, android.graphics.drawable.Drawable r9, android.graphics.drawable.Drawable r10, android.graphics.drawable.Drawable r11) {
            r5 = this;
            r0 = 3
            r1 = 1
            r2 = 0
            r3 = 2
            if (r10 != 0) goto L52
            if (r11 == 0) goto L9
            goto L52
        L9:
            if (r6 != 0) goto L11
            if (r7 != 0) goto L11
            if (r8 != 0) goto L11
            if (r9 == 0) goto L71
        L11:
            android.widget.TextView r10 = r5.mView
            android.graphics.drawable.Drawable[] r10 = r10.getCompoundDrawablesRelative()
            r11 = r10[r2]
            if (r11 != 0) goto L40
            r4 = r10[r3]
            if (r4 == 0) goto L20
            goto L40
        L20:
            android.widget.TextView r10 = r5.mView
            android.graphics.drawable.Drawable[] r10 = r10.getCompoundDrawables()
            android.widget.TextView r11 = r5.mView
            if (r6 == 0) goto L2b
            goto L2d
        L2b:
            r6 = r10[r2]
        L2d:
            if (r7 == 0) goto L30
            goto L32
        L30:
            r7 = r10[r1]
        L32:
            if (r8 == 0) goto L35
            goto L37
        L35:
            r8 = r10[r3]
        L37:
            if (r9 == 0) goto L3a
            goto L3c
        L3a:
            r9 = r10[r0]
        L3c:
            r11.setCompoundDrawablesWithIntrinsicBounds(r6, r7, r8, r9)
            goto L71
        L40:
            if (r7 == 0) goto L43
            goto L45
        L43:
            r7 = r10[r1]
        L45:
            if (r9 == 0) goto L48
            goto L4a
        L48:
            r9 = r10[r0]
        L4a:
            android.widget.TextView r6 = r5.mView
            r8 = r10[r3]
            r6.setCompoundDrawablesRelativeWithIntrinsicBounds(r11, r7, r8, r9)
            return
        L52:
            android.widget.TextView r6 = r5.mView
            android.graphics.drawable.Drawable[] r6 = r6.getCompoundDrawablesRelative()
            if (r10 == 0) goto L5b
            goto L5d
        L5b:
            r10 = r6[r2]
        L5d:
            if (r7 == 0) goto L60
            goto L62
        L60:
            r7 = r6[r1]
        L62:
            if (r11 == 0) goto L65
            goto L67
        L65:
            r11 = r6[r3]
        L67:
            android.widget.TextView r8 = r5.mView
            if (r9 == 0) goto L6c
            goto L6e
        L6c:
            r9 = r6[r0]
        L6e:
            r8.setCompoundDrawablesRelativeWithIntrinsicBounds(r10, r7, r11, r9)
        L71:
            return
    }

    private void setCompoundTints() {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            r1.mDrawableLeftTint = r0
            r1.mDrawableTopTint = r0
            r1.mDrawableRightTint = r0
            r1.mDrawableBottomTint = r0
            r1.mDrawableStartTint = r0
            r1.mDrawableEndTint = r0
            return
    }

    private void setTextSizeInternal(int r2, float r3) {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            r0.setTextSizeInternal(r2, r3)
            return
    }

    private void updateTypefaceAndStyle(android.content.Context r10, androidx.appcompat.widget.TintTypedArray r11) {
            r9 = this;
            int r0 = androidx.appcompat.R.styleable.TextAppearance_android_textStyle
            int r1 = r9.mStyle
            int r0 = r11.getInt(r0, r1)
            r9.mStyle = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 2
            r2 = -1
            r3 = 28
            if (r0 < r3) goto L21
            int r0 = androidx.appcompat.R.styleable.TextAppearance_android_textFontWeight
            int r0 = r11.getInt(r0, r2)
            r9.mFontWeight = r0
            if (r0 == r2) goto L21
            int r0 = r9.mStyle
            r0 = r0 & r1
            r9.mStyle = r0
        L21:
            int r0 = androidx.appcompat.R.styleable.TextAppearance_android_fontFamily
            boolean r0 = r11.hasValue(r0)
            r4 = 1
            r5 = 0
            if (r0 != 0) goto L5b
            int r0 = androidx.appcompat.R.styleable.TextAppearance_fontFamily
            boolean r0 = r11.hasValue(r0)
            if (r0 == 0) goto L34
            goto L5b
        L34:
            int r10 = androidx.appcompat.R.styleable.TextAppearance_android_typeface
            boolean r10 = r11.hasValue(r10)
            if (r10 == 0) goto L5a
            r9.mAsyncFontPending = r5
            int r10 = androidx.appcompat.R.styleable.TextAppearance_android_typeface
            int r10 = r11.getInt(r10, r4)
            if (r10 == r4) goto L56
            if (r10 == r1) goto L51
            r11 = 3
            if (r10 == r11) goto L4c
            goto L5a
        L4c:
            android.graphics.Typeface r10 = android.graphics.Typeface.MONOSPACE
            r9.mFontTypeface = r10
            goto L5a
        L51:
            android.graphics.Typeface r10 = android.graphics.Typeface.SERIF
            r9.mFontTypeface = r10
            goto L5a
        L56:
            android.graphics.Typeface r10 = android.graphics.Typeface.SANS_SERIF
            r9.mFontTypeface = r10
        L5a:
            return
        L5b:
            r0 = 0
            r9.mFontTypeface = r0
            int r0 = androidx.appcompat.R.styleable.TextAppearance_fontFamily
            boolean r0 = r11.hasValue(r0)
            if (r0 == 0) goto L69
            int r0 = androidx.appcompat.R.styleable.TextAppearance_fontFamily
            goto L6b
        L69:
            int r0 = androidx.appcompat.R.styleable.TextAppearance_android_fontFamily
        L6b:
            int r6 = r9.mFontWeight
            int r7 = r9.mStyle
            boolean r10 = r10.isRestricted()
            if (r10 != 0) goto Lb1
            java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
            android.widget.TextView r8 = r9.mView
            r10.<init>(r8)
            androidx.appcompat.widget.AppCompatTextHelper$1 r8 = new androidx.appcompat.widget.AppCompatTextHelper$1
            r8.<init>(r9, r6, r7, r10)
            int r10 = r9.mStyle     // Catch: java.lang.Throwable -> Lb1
            android.graphics.Typeface r10 = r11.getFont(r0, r10, r8)     // Catch: java.lang.Throwable -> Lb1
            if (r10 == 0) goto La8
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lb1
            if (r6 < r3) goto La6
            int r6 = r9.mFontWeight     // Catch: java.lang.Throwable -> Lb1
            if (r6 == r2) goto La6
            android.graphics.Typeface r10 = android.graphics.Typeface.create(r10, r5)     // Catch: java.lang.Throwable -> Lb1
            int r6 = r9.mFontWeight     // Catch: java.lang.Throwable -> Lb1
            int r7 = r9.mStyle     // Catch: java.lang.Throwable -> Lb1
            r7 = r7 & r1
            if (r7 == 0) goto L9e
            r7 = r4
            goto L9f
        L9e:
            r7 = r5
        L9f:
            android.graphics.Typeface r10 = androidx.appcompat.widget.AppCompatTextHelper.Api28Impl.create(r10, r6, r7)     // Catch: java.lang.Throwable -> Lb1
            r9.mFontTypeface = r10     // Catch: java.lang.Throwable -> Lb1
            goto La8
        La6:
            r9.mFontTypeface = r10     // Catch: java.lang.Throwable -> Lb1
        La8:
            android.graphics.Typeface r10 = r9.mFontTypeface     // Catch: java.lang.Throwable -> Lb1
            if (r10 != 0) goto Lae
            r10 = r4
            goto Laf
        Lae:
            r10 = r5
        Laf:
            r9.mAsyncFontPending = r10     // Catch: java.lang.Throwable -> Lb1
        Lb1:
            android.graphics.Typeface r10 = r9.mFontTypeface
            if (r10 != 0) goto Ldf
            java.lang.String r10 = r11.getString(r0)
            if (r10 == 0) goto Ldf
            int r11 = android.os.Build.VERSION.SDK_INT
            if (r11 < r3) goto Ld7
            int r11 = r9.mFontWeight
            if (r11 == r2) goto Ld7
            android.graphics.Typeface r10 = android.graphics.Typeface.create(r10, r5)
            int r11 = r9.mFontWeight
            int r0 = r9.mStyle
            r0 = r0 & r1
            if (r0 == 0) goto Lcf
            goto Ld0
        Lcf:
            r4 = r5
        Ld0:
            android.graphics.Typeface r10 = androidx.appcompat.widget.AppCompatTextHelper.Api28Impl.create(r10, r11, r4)
            r9.mFontTypeface = r10
            goto Ldf
        Ld7:
            int r11 = r9.mStyle
            android.graphics.Typeface r10 = android.graphics.Typeface.create(r10, r11)
            r9.mFontTypeface = r10
        Ldf:
            return
    }

    void applyCompoundDrawablesTints() {
            r5 = this;
            androidx.appcompat.widget.TintInfo r0 = r5.mDrawableLeftTint
            r1 = 2
            r2 = 0
            if (r0 != 0) goto L12
            androidx.appcompat.widget.TintInfo r0 = r5.mDrawableTopTint
            if (r0 != 0) goto L12
            androidx.appcompat.widget.TintInfo r0 = r5.mDrawableRightTint
            if (r0 != 0) goto L12
            androidx.appcompat.widget.TintInfo r0 = r5.mDrawableBottomTint
            if (r0 == 0) goto L36
        L12:
            android.widget.TextView r0 = r5.mView
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawables()
            r3 = r0[r2]
            androidx.appcompat.widget.TintInfo r4 = r5.mDrawableLeftTint
            r5.applyCompoundDrawableTint(r3, r4)
            r3 = 1
            r3 = r0[r3]
            androidx.appcompat.widget.TintInfo r4 = r5.mDrawableTopTint
            r5.applyCompoundDrawableTint(r3, r4)
            r3 = r0[r1]
            androidx.appcompat.widget.TintInfo r4 = r5.mDrawableRightTint
            r5.applyCompoundDrawableTint(r3, r4)
            r3 = 3
            r0 = r0[r3]
            androidx.appcompat.widget.TintInfo r3 = r5.mDrawableBottomTint
            r5.applyCompoundDrawableTint(r0, r3)
        L36:
            androidx.appcompat.widget.TintInfo r0 = r5.mDrawableStartTint
            if (r0 != 0) goto L3e
            androidx.appcompat.widget.TintInfo r0 = r5.mDrawableEndTint
            if (r0 == 0) goto L52
        L3e:
            android.widget.TextView r0 = r5.mView
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            r2 = r0[r2]
            androidx.appcompat.widget.TintInfo r3 = r5.mDrawableStartTint
            r5.applyCompoundDrawableTint(r2, r3)
            r0 = r0[r1]
            androidx.appcompat.widget.TintInfo r1 = r5.mDrawableEndTint
            r5.applyCompoundDrawableTint(r0, r1)
        L52:
            return
    }

    void autoSizeText() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            r0.autoSizeText()
            return
    }

    int getAutoSizeMaxTextSize() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            int r0 = r0.getAutoSizeMaxTextSize()
            return r0
    }

    int getAutoSizeMinTextSize() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            int r0 = r0.getAutoSizeMinTextSize()
            return r0
    }

    int getAutoSizeStepGranularity() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            int r0 = r0.getAutoSizeStepGranularity()
            return r0
    }

    int[] getAutoSizeTextAvailableSizes() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            int[] r0 = r0.getAutoSizeTextAvailableSizes()
            return r0
    }

    int getAutoSizeTextType() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            int r0 = r0.getAutoSizeTextType()
            return r0
    }

    android.content.res.ColorStateList getCompoundDrawableTintList() {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.mTintList
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    android.graphics.PorterDuff.Mode getCompoundDrawableTintMode() {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            if (r0 == 0) goto L7
            android.graphics.PorterDuff$Mode r0 = r0.mTintMode
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    boolean isAutoSizeEnabled() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            boolean r0 = r0.isAutoSizeEnabled()
            return r0
    }

    void loadFromAttributes(android.util.AttributeSet r17, int r18) {
            r16 = this;
            r7 = r16
            r8 = r17
            r9 = r18
            android.widget.TextView r0 = r7.mView
            android.content.Context r10 = r0.getContext()
            androidx.appcompat.widget.AppCompatDrawableManager r11 = androidx.appcompat.widget.AppCompatDrawableManager.get()
            int[] r0 = androidx.appcompat.R.styleable.AppCompatTextHelper
            r12 = 0
            androidx.appcompat.widget.TintTypedArray r13 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r10, r8, r0, r9, r12)
            android.widget.TextView r0 = r7.mView
            android.content.Context r1 = r0.getContext()
            int[] r2 = androidx.appcompat.R.styleable.AppCompatTextHelper
            android.content.res.TypedArray r4 = r13.getWrappedTypeArray()
            r6 = 0
            r3 = r17
            r5 = r18
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r0, r1, r2, r3, r4, r5, r6)
            int r0 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_textAppearance
            r14 = -1
            int r0 = r13.getResourceId(r0, r14)
            int r1 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableLeft
            boolean r1 = r13.hasValue(r1)
            if (r1 == 0) goto L46
            int r1 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableLeft
            int r1 = r13.getResourceId(r1, r12)
            androidx.appcompat.widget.TintInfo r1 = createTintInfo(r10, r11, r1)
            r7.mDrawableLeftTint = r1
        L46:
            int r1 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableTop
            boolean r1 = r13.hasValue(r1)
            if (r1 == 0) goto L5a
            int r1 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableTop
            int r1 = r13.getResourceId(r1, r12)
            androidx.appcompat.widget.TintInfo r1 = createTintInfo(r10, r11, r1)
            r7.mDrawableTopTint = r1
        L5a:
            int r1 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableRight
            boolean r1 = r13.hasValue(r1)
            if (r1 == 0) goto L6e
            int r1 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableRight
            int r1 = r13.getResourceId(r1, r12)
            androidx.appcompat.widget.TintInfo r1 = createTintInfo(r10, r11, r1)
            r7.mDrawableRightTint = r1
        L6e:
            int r1 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableBottom
            boolean r1 = r13.hasValue(r1)
            if (r1 == 0) goto L82
            int r1 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableBottom
            int r1 = r13.getResourceId(r1, r12)
            androidx.appcompat.widget.TintInfo r1 = createTintInfo(r10, r11, r1)
            r7.mDrawableBottomTint = r1
        L82:
            int r1 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableStart
            boolean r1 = r13.hasValue(r1)
            if (r1 == 0) goto L96
            int r1 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableStart
            int r1 = r13.getResourceId(r1, r12)
            androidx.appcompat.widget.TintInfo r1 = createTintInfo(r10, r11, r1)
            r7.mDrawableStartTint = r1
        L96:
            int r1 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableEnd
            boolean r1 = r13.hasValue(r1)
            if (r1 == 0) goto Laa
            int r1 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableEnd
            int r1 = r13.getResourceId(r1, r12)
            androidx.appcompat.widget.TintInfo r1 = createTintInfo(r10, r11, r1)
            r7.mDrawableEndTint = r1
        Laa:
            r13.recycle()
            android.widget.TextView r1 = r7.mView
            android.text.method.TransformationMethod r1 = r1.getTransformationMethod()
            boolean r1 = r1 instanceof android.text.method.PasswordTransformationMethod
            r2 = 1
            r13 = 0
            if (r0 == r14) goto Lfa
            int[] r3 = androidx.appcompat.R.styleable.TextAppearance
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r10, r0, r3)
            if (r1 != 0) goto Ld1
            int r3 = androidx.appcompat.R.styleable.TextAppearance_textAllCaps
            boolean r3 = r0.hasValue(r3)
            if (r3 == 0) goto Ld1
            int r3 = androidx.appcompat.R.styleable.TextAppearance_textAllCaps
            boolean r3 = r0.getBoolean(r3, r12)
            r4 = r2
            goto Ld3
        Ld1:
            r3 = r12
            r4 = r3
        Ld3:
            r7.updateTypefaceAndStyle(r10, r0)
            int r5 = androidx.appcompat.R.styleable.TextAppearance_textLocale
            boolean r5 = r0.hasValue(r5)
            if (r5 == 0) goto Le5
            int r5 = androidx.appcompat.R.styleable.TextAppearance_textLocale
            java.lang.String r5 = r0.getString(r5)
            goto Le6
        Le5:
            r5 = r13
        Le6:
            int r6 = androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings
            boolean r6 = r0.hasValue(r6)
            if (r6 == 0) goto Lf5
            int r6 = androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings
            java.lang.String r6 = r0.getString(r6)
            goto Lf6
        Lf5:
            r6 = r13
        Lf6:
            r0.recycle()
            goto Lfe
        Lfa:
            r3 = r12
            r4 = r3
            r5 = r13
            r6 = r5
        Lfe:
            int[] r0 = androidx.appcompat.R.styleable.TextAppearance
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r10, r8, r0, r9, r12)
            if (r1 != 0) goto L115
            int r15 = androidx.appcompat.R.styleable.TextAppearance_textAllCaps
            boolean r15 = r0.hasValue(r15)
            if (r15 == 0) goto L115
            int r3 = androidx.appcompat.R.styleable.TextAppearance_textAllCaps
            boolean r3 = r0.getBoolean(r3, r12)
            goto L116
        L115:
            r2 = r4
        L116:
            int r4 = androidx.appcompat.R.styleable.TextAppearance_textLocale
            boolean r4 = r0.hasValue(r4)
            if (r4 == 0) goto L124
            int r4 = androidx.appcompat.R.styleable.TextAppearance_textLocale
            java.lang.String r5 = r0.getString(r4)
        L124:
            int r4 = androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings
            boolean r4 = r0.hasValue(r4)
            if (r4 == 0) goto L132
            int r4 = androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings
            java.lang.String r6 = r0.getString(r4)
        L132:
            int r4 = android.os.Build.VERSION.SDK_INT
            r15 = 28
            if (r4 < r15) goto L14e
            int r4 = androidx.appcompat.R.styleable.TextAppearance_android_textSize
            boolean r4 = r0.hasValue(r4)
            if (r4 == 0) goto L14e
            int r4 = androidx.appcompat.R.styleable.TextAppearance_android_textSize
            int r4 = r0.getDimensionPixelSize(r4, r14)
            if (r4 != 0) goto L14e
            android.widget.TextView r4 = r7.mView
            r15 = 0
            r4.setTextSize(r12, r15)
        L14e:
            r7.updateTypefaceAndStyle(r10, r0)
            r0.recycle()
            if (r1 != 0) goto L15b
            if (r2 == 0) goto L15b
            r7.setAllCaps(r3)
        L15b:
            android.graphics.Typeface r0 = r7.mFontTypeface
            if (r0 == 0) goto L170
            int r1 = r7.mFontWeight
            if (r1 != r14) goto L16b
            android.widget.TextView r1 = r7.mView
            int r2 = r7.mStyle
            r1.setTypeface(r0, r2)
            goto L170
        L16b:
            android.widget.TextView r1 = r7.mView
            r1.setTypeface(r0)
        L170:
            if (r6 == 0) goto L177
            android.widget.TextView r0 = r7.mView
            androidx.appcompat.widget.AppCompatTextHelper.Api26Impl.setFontVariationSettings(r0, r6)
        L177:
            if (r5 == 0) goto L182
            android.widget.TextView r0 = r7.mView
            android.os.LocaleList r1 = androidx.appcompat.widget.AppCompatTextHelper.Api24Impl.forLanguageTags(r5)
            androidx.appcompat.widget.AppCompatTextHelper.Api24Impl.setTextLocales(r0, r1)
        L182:
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r7.mAutoSizeTextHelper
            r0.loadFromAttributes(r8, r9)
            boolean r0 = androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 == 0) goto L1c6
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r7.mAutoSizeTextHelper
            int r0 = r0.getAutoSizeTextType()
            if (r0 == 0) goto L1c6
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r7.mAutoSizeTextHelper
            int[] r0 = r0.getAutoSizeTextAvailableSizes()
            int r1 = r0.length
            if (r1 <= 0) goto L1c6
            android.widget.TextView r1 = r7.mView
            int r1 = androidx.appcompat.widget.AppCompatTextHelper.Api26Impl.getAutoSizeStepGranularity(r1)
            float r1 = (float) r1
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 == 0) goto L1c1
            android.widget.TextView r0 = r7.mView
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r1 = r7.mAutoSizeTextHelper
            int r1 = r1.getAutoSizeMinTextSize()
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r2 = r7.mAutoSizeTextHelper
            int r2 = r2.getAutoSizeMaxTextSize()
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r3 = r7.mAutoSizeTextHelper
            int r3 = r3.getAutoSizeStepGranularity()
            androidx.appcompat.widget.AppCompatTextHelper.Api26Impl.setAutoSizeTextTypeUniformWithConfiguration(r0, r1, r2, r3, r12)
            goto L1c6
        L1c1:
            android.widget.TextView r1 = r7.mView
            androidx.appcompat.widget.AppCompatTextHelper.Api26Impl.setAutoSizeTextTypeUniformWithPresetSizes(r1, r0, r12)
        L1c6:
            int[] r0 = androidx.appcompat.R.styleable.AppCompatTextView
            androidx.appcompat.widget.TintTypedArray r8 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r10, r8, r0)
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_drawableLeftCompat
            int r0 = r8.getResourceId(r0, r14)
            if (r0 == r14) goto L1da
            android.graphics.drawable.Drawable r0 = r11.getDrawable(r10, r0)
            r1 = r0
            goto L1db
        L1da:
            r1 = r13
        L1db:
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_drawableTopCompat
            int r0 = r8.getResourceId(r0, r14)
            if (r0 == r14) goto L1e9
            android.graphics.drawable.Drawable r0 = r11.getDrawable(r10, r0)
            r2 = r0
            goto L1ea
        L1e9:
            r2 = r13
        L1ea:
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_drawableRightCompat
            int r0 = r8.getResourceId(r0, r14)
            if (r0 == r14) goto L1f8
            android.graphics.drawable.Drawable r0 = r11.getDrawable(r10, r0)
            r3 = r0
            goto L1f9
        L1f8:
            r3 = r13
        L1f9:
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_drawableBottomCompat
            int r0 = r8.getResourceId(r0, r14)
            if (r0 == r14) goto L207
            android.graphics.drawable.Drawable r0 = r11.getDrawable(r10, r0)
            r4 = r0
            goto L208
        L207:
            r4 = r13
        L208:
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_drawableStartCompat
            int r0 = r8.getResourceId(r0, r14)
            if (r0 == r14) goto L216
            android.graphics.drawable.Drawable r0 = r11.getDrawable(r10, r0)
            r5 = r0
            goto L217
        L216:
            r5 = r13
        L217:
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_drawableEndCompat
            int r0 = r8.getResourceId(r0, r14)
            if (r0 == r14) goto L225
            android.graphics.drawable.Drawable r0 = r11.getDrawable(r10, r0)
            r6 = r0
            goto L226
        L225:
            r6 = r13
        L226:
            r0 = r16
            r0.setCompoundDrawables(r1, r2, r3, r4, r5, r6)
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_drawableTint
            boolean r0 = r8.hasValue(r0)
            if (r0 == 0) goto L23e
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_drawableTint
            android.content.res.ColorStateList r0 = r8.getColorStateList(r0)
            android.widget.TextView r1 = r7.mView
            androidx.core.widget.TextViewCompat.setCompoundDrawableTintList(r1, r0)
        L23e:
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_drawableTintMode
            boolean r0 = r8.hasValue(r0)
            if (r0 == 0) goto L255
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_drawableTintMode
            int r0 = r8.getInt(r0, r14)
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.DrawableUtils.parseTintMode(r0, r13)
            android.widget.TextView r1 = r7.mView
            androidx.core.widget.TextViewCompat.setCompoundDrawableTintMode(r1, r0)
        L255:
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_firstBaselineToTopHeight
            int r0 = r8.getDimensionPixelSize(r0, r14)
            int r1 = androidx.appcompat.R.styleable.AppCompatTextView_lastBaselineToBottomHeight
            int r1 = r8.getDimensionPixelSize(r1, r14)
            int r2 = androidx.appcompat.R.styleable.AppCompatTextView_lineHeight
            boolean r2 = r8.hasValue(r2)
            if (r2 == 0) goto L28b
            int r2 = androidx.appcompat.R.styleable.AppCompatTextView_lineHeight
            android.util.TypedValue r2 = r8.peekValue(r2)
            if (r2 == 0) goto L283
            int r3 = r2.type
            r4 = 5
            if (r3 != r4) goto L283
            int r3 = r2.data
            int r3 = androidx.core.util.TypedValueCompat.getUnitFromComplexDimension(r3)
            int r2 = r2.data
            float r2 = android.util.TypedValue.complexToFloat(r2)
            goto L28d
        L283:
            int r2 = androidx.appcompat.R.styleable.AppCompatTextView_lineHeight
            int r2 = r8.getDimensionPixelSize(r2, r14)
            float r2 = (float) r2
            goto L28c
        L28b:
            r2 = r9
        L28c:
            r3 = r14
        L28d:
            r8.recycle()
            if (r0 == r14) goto L297
            android.widget.TextView r4 = r7.mView
            androidx.core.widget.TextViewCompat.setFirstBaselineToTopHeight(r4, r0)
        L297:
            if (r1 == r14) goto L29e
            android.widget.TextView r0 = r7.mView
            androidx.core.widget.TextViewCompat.setLastBaselineToBottomHeight(r0, r1)
        L29e:
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 == 0) goto L2b0
            if (r3 != r14) goto L2ab
            android.widget.TextView r0 = r7.mView
            int r1 = (int) r2
            androidx.core.widget.TextViewCompat.setLineHeight(r0, r1)
            goto L2b0
        L2ab:
            android.widget.TextView r0 = r7.mView
            androidx.core.widget.TextViewCompat.setLineHeight(r0, r3, r2)
        L2b0:
            return
    }

    void onAsyncTypefaceReceived(java.lang.ref.WeakReference<android.widget.TextView> r3, android.graphics.Typeface r4) {
            r2 = this;
            boolean r0 = r2.mAsyncFontPending
            if (r0 == 0) goto L24
            r2.mFontTypeface = r4
            java.lang.Object r3 = r3.get()
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L24
            boolean r0 = r3.isAttachedToWindow()
            if (r0 == 0) goto L1f
            int r0 = r2.mStyle
            androidx.appcompat.widget.AppCompatTextHelper$2 r1 = new androidx.appcompat.widget.AppCompatTextHelper$2
            r1.<init>(r2, r3, r4, r0)
            r3.post(r1)
            goto L24
        L1f:
            int r0 = r2.mStyle
            r3.setTypeface(r4, r0)
        L24:
            return
    }

    void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            boolean r1 = androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE
            if (r1 != 0) goto L7
            r0.autoSizeText()
        L7:
            return
    }

    void onSetCompoundDrawables() {
            r0 = this;
            r0.applyCompoundDrawablesTints()
            return
    }

    void onSetTextAppearance(android.content.Context r4, int r5) {
            r3 = this;
            int[] r0 = androidx.appcompat.R.styleable.TextAppearance
            androidx.appcompat.widget.TintTypedArray r5 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r4, r5, r0)
            int r0 = androidx.appcompat.R.styleable.TextAppearance_textAllCaps
            boolean r0 = r5.hasValue(r0)
            r1 = 0
            if (r0 == 0) goto L18
            int r0 = androidx.appcompat.R.styleable.TextAppearance_textAllCaps
            boolean r0 = r5.getBoolean(r0, r1)
            r3.setAllCaps(r0)
        L18:
            int r0 = androidx.appcompat.R.styleable.TextAppearance_android_textSize
            boolean r0 = r5.hasValue(r0)
            if (r0 == 0) goto L2f
            int r0 = androidx.appcompat.R.styleable.TextAppearance_android_textSize
            r2 = -1
            int r0 = r5.getDimensionPixelSize(r0, r2)
            if (r0 != 0) goto L2f
            android.widget.TextView r0 = r3.mView
            r2 = 0
            r0.setTextSize(r1, r2)
        L2f:
            r3.updateTypefaceAndStyle(r4, r5)
            int r4 = androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings
            boolean r4 = r5.hasValue(r4)
            if (r4 == 0) goto L47
            int r4 = androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings
            java.lang.String r4 = r5.getString(r4)
            if (r4 == 0) goto L47
            android.widget.TextView r0 = r3.mView
            androidx.appcompat.widget.AppCompatTextHelper.Api26Impl.setFontVariationSettings(r0, r4)
        L47:
            r5.recycle()
            android.graphics.Typeface r4 = r3.mFontTypeface
            if (r4 == 0) goto L55
            android.widget.TextView r5 = r3.mView
            int r0 = r3.mStyle
            r5.setTypeface(r4, r0)
        L55:
            return
    }

    void populateSurroundingTextIfNeeded(android.widget.TextView r3, android.view.inputmethod.InputConnection r4, android.view.inputmethod.EditorInfo r5) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 >= r1) goto Lf
            if (r4 == 0) goto Lf
            java.lang.CharSequence r3 = r3.getText()
            androidx.core.view.inputmethod.EditorInfoCompat.setInitialSurroundingText(r5, r3)
        Lf:
            return
    }

    void setAllCaps(boolean r2) {
            r1 = this;
            android.widget.TextView r0 = r1.mView
            r0.setAllCaps(r2)
            return
    }

    void setAutoSizeTextTypeUniformWithConfiguration(int r2, int r3, int r4, int r5) throws java.lang.IllegalArgumentException {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            r0.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5)
            return
    }

    void setAutoSizeTextTypeUniformWithPresetSizes(int[] r2, int r3) throws java.lang.IllegalArgumentException {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            r0.setAutoSizeTextTypeUniformWithPresetSizes(r2, r3)
            return
    }

    void setAutoSizeTextTypeWithDefaults(int r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            r0.setAutoSizeTextTypeWithDefaults(r2)
            return
    }

    void setCompoundDrawableTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.TintInfo r0 = new androidx.appcompat.widget.TintInfo
            r0.<init>()
            r1.mDrawableTint = r0
        Lb:
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            r0.mTintList = r2
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            if (r2 == 0) goto L15
            r2 = 1
            goto L16
        L15:
            r2 = 0
        L16:
            r0.mHasTintList = r2
            r1.setCompoundTints()
            return
    }

    void setCompoundDrawableTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.TintInfo r0 = new androidx.appcompat.widget.TintInfo
            r0.<init>()
            r1.mDrawableTint = r0
        Lb:
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            r0.mTintMode = r2
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            if (r2 == 0) goto L15
            r2 = 1
            goto L16
        L15:
            r2 = 0
        L16:
            r0.mHasTintMode = r2
            r1.setCompoundTints()
            return
    }

    void setTextSize(int r2, float r3) {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE
            if (r0 != 0) goto Ld
            boolean r0 = r1.isAutoSizeEnabled()
            if (r0 != 0) goto Ld
            r1.setTextSizeInternal(r2, r3)
        Ld:
            return
    }
}
