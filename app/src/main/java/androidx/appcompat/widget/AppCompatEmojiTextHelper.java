package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class AppCompatEmojiTextHelper {
    private final androidx.emoji2.viewsintegration.EmojiTextViewHelper mEmojiTextViewHelper;
    private final android.widget.TextView mView;

    AppCompatEmojiTextHelper(android.widget.TextView r3) {
            r2 = this;
            r2.<init>()
            r2.mView = r3
            androidx.emoji2.viewsintegration.EmojiTextViewHelper r0 = new androidx.emoji2.viewsintegration.EmojiTextViewHelper
            r1 = 0
            r0.<init>(r3, r1)
            r2.mEmojiTextViewHelper = r0
            return
    }

    android.text.InputFilter[] getFilters(android.text.InputFilter[] r2) {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiTextViewHelper r0 = r1.mEmojiTextViewHelper
            android.text.InputFilter[] r2 = r0.getFilters(r2)
            return r2
    }

    public boolean isEnabled() {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiTextViewHelper r0 = r1.mEmojiTextViewHelper
            boolean r0 = r0.isEnabled()
            return r0
    }

    void loadFromAttributes(android.util.AttributeSet r4, int r5) {
            r3 = this;
            android.widget.TextView r0 = r3.mView
            android.content.Context r0 = r0.getContext()
            int[] r1 = androidx.appcompat.R.styleable.AppCompatTextView
            r2 = 0
            android.content.res.TypedArray r4 = r0.obtainStyledAttributes(r4, r1, r5, r2)
            int r5 = androidx.appcompat.R.styleable.AppCompatTextView_emojiCompatEnabled     // Catch: java.lang.Throwable -> L23
            boolean r5 = r4.hasValue(r5)     // Catch: java.lang.Throwable -> L23
            r0 = 1
            if (r5 == 0) goto L1c
            int r5 = androidx.appcompat.R.styleable.AppCompatTextView_emojiCompatEnabled     // Catch: java.lang.Throwable -> L23
            boolean r0 = r4.getBoolean(r5, r0)     // Catch: java.lang.Throwable -> L23
        L1c:
            r4.recycle()
            r3.setEnabled(r0)
            return
        L23:
            r5 = move-exception
            r4.recycle()
            throw r5
    }

    void setAllCaps(boolean r2) {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiTextViewHelper r0 = r1.mEmojiTextViewHelper
            r0.setAllCaps(r2)
            return
    }

    void setEnabled(boolean r2) {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiTextViewHelper r0 = r1.mEmojiTextViewHelper
            r0.setEnabled(r2)
            return
    }

    public android.text.method.TransformationMethod wrapTransformationMethod(android.text.method.TransformationMethod r2) {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiTextViewHelper r0 = r1.mEmojiTextViewHelper
            android.text.method.TransformationMethod r2 = r0.wrapTransformationMethod(r2)
            return r2
    }
}
