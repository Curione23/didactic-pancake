package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatMultiAutoCompleteTextView extends android.widget.MultiAutoCompleteTextView implements androidx.core.view.TintableBackgroundView, androidx.appcompat.widget.EmojiCompatConfigurationView, androidx.core.widget.TintableCompoundDrawablesView {
    private static final int[] TINT_ATTRS = null;
    private final androidx.appcompat.widget.AppCompatEmojiEditTextHelper mAppCompatEmojiEditTextHelper;
    private final androidx.appcompat.widget.AppCompatBackgroundHelper mBackgroundTintHelper;
    private final androidx.appcompat.widget.AppCompatTextHelper mTextHelper;

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView> {
        private int mBackgroundTintId;
        private int mBackgroundTintModeId;
        private int mDrawableTintId;
        private int mDrawableTintModeId;
        private boolean mPropertiesMapped;

        public InspectionCompanion() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mPropertiesMapped = r0
                return
        }

        @Override // android.view.inspector.InspectionCompanion
        public void mapProperties(android.view.inspector.PropertyMapper r3) {
                r2 = this;
                java.lang.String r0 = "backgroundTint"
                int r1 = androidx.appcompat.R.attr.backgroundTint
                int r0 = r3.mapObject(r0, r1)
                r2.mBackgroundTintId = r0
                java.lang.String r0 = "backgroundTintMode"
                int r1 = androidx.appcompat.R.attr.backgroundTintMode
                int r0 = r3.mapObject(r0, r1)
                r2.mBackgroundTintModeId = r0
                java.lang.String r0 = "drawableTint"
                int r1 = androidx.appcompat.R.attr.drawableTint
                int r0 = r3.mapObject(r0, r1)
                r2.mDrawableTintId = r0
                java.lang.String r0 = "drawableTintMode"
                int r1 = androidx.appcompat.R.attr.drawableTintMode
                int r3 = r3.mapObject(r0, r1)
                r2.mDrawableTintModeId = r3
                r3 = 1
                r2.mPropertiesMapped = r3
                return
        }

        /* JADX INFO: renamed from: readProperties, reason: avoid collision after fix types in other method */
        public void readProperties2(androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView r3, android.view.inspector.PropertyReader r4) {
                r2 = this;
                boolean r0 = r2.mPropertiesMapped
                if (r0 == 0) goto L29
                int r0 = r2.mBackgroundTintId
                android.content.res.ColorStateList r1 = r3.getBackgroundTintList()
                r4.readObject(r0, r1)
                int r0 = r2.mBackgroundTintModeId
                android.graphics.PorterDuff$Mode r1 = r3.getBackgroundTintMode()
                r4.readObject(r0, r1)
                int r0 = r2.mDrawableTintId
                android.content.res.ColorStateList r1 = r3.getCompoundDrawableTintList()
                r4.readObject(r0, r1)
                int r0 = r2.mDrawableTintModeId
                android.graphics.PorterDuff$Mode r3 = r3.getCompoundDrawableTintMode()
                r4.readObject(r0, r3)
                return
            L29:
                android.view.inspector.InspectionCompanion$UninitializedPropertyMapException r3 = new android.view.inspector.InspectionCompanion$UninitializedPropertyMapException
                r3.<init>()
                throw r3
        }

        @Override // android.view.inspector.InspectionCompanion
        public /* bridge */ /* synthetic */ void readProperties(androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView r1, android.view.inspector.PropertyReader r2) {
                r0 = this;
                androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView r1 = (androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView) r1
                r0.readProperties2(r1, r2)
                return
        }
    }

    static {
            r0 = 16843126(0x1010176, float:2.3694606E-38)
            int[] r0 = new int[]{r0}
            androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView.TINT_ATTRS = r0
            return
    }

    public AppCompatMultiAutoCompleteTextView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public AppCompatMultiAutoCompleteTextView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.appcompat.R.attr.autoCompleteTextViewStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public AppCompatMultiAutoCompleteTextView(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            android.content.Context r3 = androidx.appcompat.widget.TintContextWrapper.wrap(r3)
            r2.<init>(r3, r4, r5)
            android.content.Context r3 = r2.getContext()
            androidx.appcompat.widget.ThemeUtils.checkAppCompatTheme(r2, r3)
            android.content.Context r3 = r2.getContext()
            int[] r0 = androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView.TINT_ATTRS
            r1 = 0
            androidx.appcompat.widget.TintTypedArray r3 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r3, r4, r0, r5, r1)
            boolean r0 = r3.hasValue(r1)
            if (r0 == 0) goto L26
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r1)
            r2.setDropDownBackgroundDrawable(r0)
        L26:
            r3.recycle()
            androidx.appcompat.widget.AppCompatBackgroundHelper r3 = new androidx.appcompat.widget.AppCompatBackgroundHelper
            r3.<init>(r2)
            r2.mBackgroundTintHelper = r3
            r3.loadFromAttributes(r4, r5)
            androidx.appcompat.widget.AppCompatTextHelper r3 = new androidx.appcompat.widget.AppCompatTextHelper
            r3.<init>(r2)
            r2.mTextHelper = r3
            r3.loadFromAttributes(r4, r5)
            r3.applyCompoundDrawablesTints()
            androidx.appcompat.widget.AppCompatEmojiEditTextHelper r3 = new androidx.appcompat.widget.AppCompatEmojiEditTextHelper
            r3.<init>(r2)
            r2.mAppCompatEmojiEditTextHelper = r3
            r3.loadFromAttributes(r4, r5)
            r2.initEmojiKeyListener(r3)
            return
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto La
            r0.applySupportBackgroundTint()
        La:
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto L11
            r0.applyCompoundDrawablesTints()
        L11:
            return
    }

    @Override // androidx.core.view.TintableBackgroundView
    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.getSupportBackgroundTintList()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // androidx.core.view.TintableBackgroundView
    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.getSupportBackgroundTintMode()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            android.content.res.ColorStateList r0 = r0.getCompoundDrawableTintList()
            return r0
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            android.graphics.PorterDuff$Mode r0 = r0.getCompoundDrawableTintMode()
            return r0
    }

    void initEmojiKeyListener(androidx.appcompat.widget.AppCompatEmojiEditTextHelper r6) {
            r5 = this;
            android.text.method.KeyListener r0 = r5.getKeyListener()
            boolean r1 = r6.isEmojiCapableKeyListener(r0)
            if (r1 == 0) goto L30
            boolean r1 = super.isFocusable()
            boolean r2 = super.isClickable()
            boolean r3 = super.isLongClickable()
            int r4 = super.getInputType()
            android.text.method.KeyListener r6 = r6.getKeyListener(r0)
            if (r6 != r0) goto L21
            return
        L21:
            super.setKeyListener(r6)
            super.setRawInputType(r4)
            super.setFocusable(r1)
            super.setClickable(r2)
            super.setLongClickable(r3)
        L30:
            return
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public boolean isEmojiCompatEnabled() {
            r1 = this;
            androidx.appcompat.widget.AppCompatEmojiEditTextHelper r0 = r1.mAppCompatEmojiEditTextHelper
            boolean r0 = r0.isEnabled()
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r3) {
            r2 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r3)
            android.view.inputmethod.InputConnection r0 = androidx.appcompat.widget.AppCompatHintHelper.onCreateInputConnection(r0, r3, r2)
            androidx.appcompat.widget.AppCompatEmojiEditTextHelper r1 = r2.mAppCompatEmojiEditTextHelper
            android.view.inputmethod.InputConnection r3 = r1.onCreateInputConnection(r0, r3)
            return r3
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            super.setBackgroundDrawable(r2)
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto La
            r0.onSetBackgroundDrawable(r2)
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            super.setBackgroundResource(r2)
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto La
            r0.onSetBackgroundResource(r2)
        La:
            return
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawables(r1, r2, r3, r4)
            androidx.appcompat.widget.AppCompatTextHelper r1 = r0.mTextHelper
            if (r1 == 0) goto La
            r1.onSetCompoundDrawables()
        La:
            return
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesRelative(r1, r2, r3, r4)
            androidx.appcompat.widget.AppCompatTextHelper r1 = r0.mTextHelper
            if (r1 == 0) goto La
            r1.onSetCompoundDrawables()
        La:
            return
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            r1.setDropDownBackgroundDrawable(r2)
            return
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public void setEmojiCompatEnabled(boolean r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatEmojiEditTextHelper r0 = r1.mAppCompatEmojiEditTextHelper
            r0.setEnabled(r2)
            return
    }

    @Override // android.widget.TextView
    public void setKeyListener(android.text.method.KeyListener r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatEmojiEditTextHelper r0 = r1.mAppCompatEmojiEditTextHelper
            android.text.method.KeyListener r2 = r0.getKeyListener(r2)
            super.setKeyListener(r2)
            return
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto L7
            r0.setSupportBackgroundTintList(r2)
        L7:
            return
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto L7
            r0.setSupportBackgroundTintMode(r2)
        L7:
            return
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            r0.setCompoundDrawableTintList(r2)
            androidx.appcompat.widget.AppCompatTextHelper r2 = r1.mTextHelper
            r2.applyCompoundDrawablesTints()
            return
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            r0.setCompoundDrawableTintMode(r2)
            androidx.appcompat.widget.AppCompatTextHelper r2 = r1.mTextHelper
            r2.applyCompoundDrawablesTints()
            return
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context r2, int r3) {
            r1 = this;
            super.setTextAppearance(r2, r3)
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto La
            r0.onSetTextAppearance(r2, r3)
        La:
            return
    }
}
