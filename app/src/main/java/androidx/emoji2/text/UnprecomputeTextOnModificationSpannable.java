package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
class UnprecomputeTextOnModificationSpannable implements android.text.Spannable {
    private android.text.Spannable mDelegate;
    private boolean mSafeToWrite;

    private static class CharSequenceHelper_API24 {
        private CharSequenceHelper_API24() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.util.stream.IntStream chars(java.lang.CharSequence r0) {
                java.util.stream.IntStream r0 = r0.chars()
                return r0
        }

        static java.util.stream.IntStream codePoints(java.lang.CharSequence r0) {
                java.util.stream.IntStream r0 = r0.codePoints()
                return r0
        }
    }

    static class PrecomputedTextDetector {
        PrecomputedTextDetector() {
                r0 = this;
                r0.<init>()
                return
        }

        boolean isPrecomputedText(java.lang.CharSequence r1) {
                r0 = this;
                boolean r1 = r1 instanceof androidx.core.text.PrecomputedTextCompat
                return r1
        }
    }

    static class PrecomputedTextDetector_28 extends androidx.emoji2.text.UnprecomputeTextOnModificationSpannable.PrecomputedTextDetector {
        PrecomputedTextDetector_28() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.emoji2.text.UnprecomputeTextOnModificationSpannable.PrecomputedTextDetector
        boolean isPrecomputedText(java.lang.CharSequence r2) {
                r1 = this;
                boolean r0 = r2 instanceof android.text.PrecomputedText
                if (r0 != 0) goto Lb
                boolean r2 = r2 instanceof androidx.core.text.PrecomputedTextCompat
                if (r2 == 0) goto L9
                goto Lb
            L9:
                r2 = 0
                goto Lc
            Lb:
                r2 = 1
            Lc:
                return r2
        }
    }

    UnprecomputeTextOnModificationSpannable(android.text.Spannable r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mSafeToWrite = r0
            r1.mDelegate = r2
            return
    }

    UnprecomputeTextOnModificationSpannable(android.text.Spanned r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mSafeToWrite = r0
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r2)
            r1.mDelegate = r0
            return
    }

    UnprecomputeTextOnModificationSpannable(java.lang.CharSequence r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mSafeToWrite = r0
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r2)
            r1.mDelegate = r0
            return
    }

    private void ensureSafeWrites() {
            r2 = this;
            android.text.Spannable r0 = r2.mDelegate
            boolean r1 = r2.mSafeToWrite
            if (r1 != 0) goto L17
            androidx.emoji2.text.UnprecomputeTextOnModificationSpannable$PrecomputedTextDetector r1 = precomputedTextDetector()
            boolean r1 = r1.isPrecomputedText(r0)
            if (r1 == 0) goto L17
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r0)
            r2.mDelegate = r1
        L17:
            r0 = 1
            r2.mSafeToWrite = r0
            return
    }

    static androidx.emoji2.text.UnprecomputeTextOnModificationSpannable.PrecomputedTextDetector precomputedTextDetector() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto Lc
            androidx.emoji2.text.UnprecomputeTextOnModificationSpannable$PrecomputedTextDetector r0 = new androidx.emoji2.text.UnprecomputeTextOnModificationSpannable$PrecomputedTextDetector
            r0.<init>()
            goto L11
        Lc:
            androidx.emoji2.text.UnprecomputeTextOnModificationSpannable$PrecomputedTextDetector_28 r0 = new androidx.emoji2.text.UnprecomputeTextOnModificationSpannable$PrecomputedTextDetector_28
            r0.<init>()
        L11:
            return r0
    }

    @Override // java.lang.CharSequence
    public char charAt(int r2) {
            r1 = this;
            android.text.Spannable r0 = r1.mDelegate
            char r2 = r0.charAt(r2)
            return r2
    }

    @Override // java.lang.CharSequence
    public java.util.stream.IntStream chars() {
            r1 = this;
            android.text.Spannable r0 = r1.mDelegate
            java.util.stream.IntStream r0 = androidx.emoji2.text.UnprecomputeTextOnModificationSpannable.CharSequenceHelper_API24.chars(r0)
            return r0
    }

    @Override // java.lang.CharSequence
    public java.util.stream.IntStream codePoints() {
            r1 = this;
            android.text.Spannable r0 = r1.mDelegate
            java.util.stream.IntStream r0 = androidx.emoji2.text.UnprecomputeTextOnModificationSpannable.CharSequenceHelper_API24.codePoints(r0)
            return r0
    }

    @Override // android.text.Spanned
    public int getSpanEnd(java.lang.Object r2) {
            r1 = this;
            android.text.Spannable r0 = r1.mDelegate
            int r2 = r0.getSpanEnd(r2)
            return r2
    }

    @Override // android.text.Spanned
    public int getSpanFlags(java.lang.Object r2) {
            r1 = this;
            android.text.Spannable r0 = r1.mDelegate
            int r2 = r0.getSpanFlags(r2)
            return r2
    }

    @Override // android.text.Spanned
    public int getSpanStart(java.lang.Object r2) {
            r1 = this;
            android.text.Spannable r0 = r1.mDelegate
            int r2 = r0.getSpanStart(r2)
            return r2
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int r2, int r3, java.lang.Class<T> r4) {
            r1 = this;
            android.text.Spannable r0 = r1.mDelegate
            java.lang.Object[] r2 = r0.getSpans(r2, r3, r4)
            return r2
    }

    android.text.Spannable getUnwrappedSpannable() {
            r1 = this;
            android.text.Spannable r0 = r1.mDelegate
            return r0
    }

    @Override // java.lang.CharSequence
    public int length() {
            r1 = this;
            android.text.Spannable r0 = r1.mDelegate
            int r0 = r0.length()
            return r0
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int r2, int r3, java.lang.Class r4) {
            r1 = this;
            android.text.Spannable r0 = r1.mDelegate
            int r2 = r0.nextSpanTransition(r2, r3, r4)
            return r2
    }

    @Override // android.text.Spannable
    public void removeSpan(java.lang.Object r2) {
            r1 = this;
            r1.ensureSafeWrites()
            android.text.Spannable r0 = r1.mDelegate
            r0.removeSpan(r2)
            return
    }

    @Override // android.text.Spannable
    public void setSpan(java.lang.Object r2, int r3, int r4, int r5) {
            r1 = this;
            r1.ensureSafeWrites()
            android.text.Spannable r0 = r1.mDelegate
            r0.setSpan(r2, r3, r4, r5)
            return
    }

    @Override // java.lang.CharSequence
    public java.lang.CharSequence subSequence(int r2, int r3) {
            r1 = this;
            android.text.Spannable r0 = r1.mDelegate
            java.lang.CharSequence r2 = r0.subSequence(r2, r3)
            return r2
    }

    @Override // java.lang.CharSequence
    public java.lang.String toString() {
            r1 = this;
            android.text.Spannable r0 = r1.mDelegate
            java.lang.String r0 = r0.toString()
            return r0
    }
}
