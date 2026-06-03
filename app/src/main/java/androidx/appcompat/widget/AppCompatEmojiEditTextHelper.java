package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class AppCompatEmojiEditTextHelper {
    private final androidx.emoji2.viewsintegration.EmojiEditTextHelper mEmojiEditTextHelper;
    private final android.widget.EditText mView;

    AppCompatEmojiEditTextHelper(android.widget.EditText r3) {
            r2 = this;
            r2.<init>()
            r2.mView = r3
            androidx.emoji2.viewsintegration.EmojiEditTextHelper r0 = new androidx.emoji2.viewsintegration.EmojiEditTextHelper
            r1 = 0
            r0.<init>(r3, r1)
            r2.mEmojiEditTextHelper = r0
            return
    }

    android.text.method.KeyListener getKeyListener(android.text.method.KeyListener r2) {
            r1 = this;
            boolean r0 = r1.isEmojiCapableKeyListener(r2)
            if (r0 == 0) goto Lc
            androidx.emoji2.viewsintegration.EmojiEditTextHelper r0 = r1.mEmojiEditTextHelper
            android.text.method.KeyListener r2 = r0.getKeyListener(r2)
        Lc:
            return r2
    }

    boolean isEmojiCapableKeyListener(android.text.method.KeyListener r1) {
            r0 = this;
            boolean r1 = r1 instanceof android.text.method.NumberKeyListener
            r1 = r1 ^ 1
            return r1
    }

    boolean isEnabled() {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiEditTextHelper r0 = r1.mEmojiEditTextHelper
            boolean r0 = r0.isEnabled()
            return r0
    }

    void loadFromAttributes(android.util.AttributeSet r4, int r5) {
            r3 = this;
            android.widget.EditText r0 = r3.mView
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

    android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.InputConnection r2, android.view.inputmethod.EditorInfo r3) {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiEditTextHelper r0 = r1.mEmojiEditTextHelper
            android.view.inputmethod.InputConnection r2 = r0.onCreateInputConnection(r2, r3)
            return r2
    }

    void setEnabled(boolean r2) {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiEditTextHelper r0 = r1.mEmojiEditTextHelper
            r0.setEnabled(r2)
            return
    }
}
