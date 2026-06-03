package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
class DefaultGlyphChecker implements androidx.emoji2.text.EmojiCompat.GlyphChecker {
    private static final int PAINT_TEXT_SIZE = 10;
    private static final java.lang.ThreadLocal<java.lang.StringBuilder> sStringBuilder = null;
    private final android.text.TextPaint mTextPaint;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.emoji2.text.DefaultGlyphChecker.sStringBuilder = r0
            return
    }

    DefaultGlyphChecker() {
            r2 = this;
            r2.<init>()
            android.text.TextPaint r0 = new android.text.TextPaint
            r0.<init>()
            r2.mTextPaint = r0
            r1 = 1092616192(0x41200000, float:10.0)
            r0.setTextSize(r1)
            return
    }

    private static java.lang.StringBuilder getStringBuilder() {
            java.lang.ThreadLocal<java.lang.StringBuilder> r0 = androidx.emoji2.text.DefaultGlyphChecker.sStringBuilder
            java.lang.Object r1 = r0.get()
            if (r1 != 0) goto L10
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0.set(r1)
        L10:
            java.lang.Object r0 = r0.get()
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            return r0
    }

    @Override // androidx.emoji2.text.EmojiCompat.GlyphChecker
    public boolean hasGlyph(java.lang.CharSequence r2, int r3, int r4, int r5) {
            r1 = this;
            java.lang.StringBuilder r5 = getStringBuilder()
            r0 = 0
            r5.setLength(r0)
        L8:
            if (r3 >= r4) goto L14
            char r0 = r2.charAt(r3)
            r5.append(r0)
            int r3 = r3 + 1
            goto L8
        L14:
            android.text.TextPaint r2 = r1.mTextPaint
            java.lang.String r3 = r5.toString()
            boolean r2 = androidx.core.graphics.PaintCompat.hasGlyph(r2, r3)
            return r2
    }
}
