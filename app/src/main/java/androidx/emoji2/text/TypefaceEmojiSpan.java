package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
public final class TypefaceEmojiSpan extends androidx.emoji2.text.EmojiSpan {
    private static android.graphics.Paint sDebugPaint;
    private android.text.TextPaint mWorkingPaint;

    public TypefaceEmojiSpan(androidx.emoji2.text.TypefaceEmojiRasterizer r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private android.text.TextPaint applyCharacterSpanStyles(java.lang.CharSequence r3, int r4, int r5, android.graphics.Paint r6) {
            r2 = this;
            boolean r0 = r3 instanceof android.text.Spanned
            r1 = 0
            if (r0 == 0) goto L3e
            android.text.Spanned r3 = (android.text.Spanned) r3
            java.lang.Class<android.text.style.CharacterStyle> r0 = android.text.style.CharacterStyle.class
            java.lang.Object[] r3 = r3.getSpans(r4, r5, r0)
            android.text.style.CharacterStyle[] r3 = (android.text.style.CharacterStyle[]) r3
            int r4 = r3.length
            if (r4 == 0) goto L36
            int r4 = r3.length
            r5 = 0
            r0 = 1
            if (r4 != r0) goto L1c
            r4 = r3[r5]
            if (r4 != r2) goto L1c
            goto L36
        L1c:
            android.text.TextPaint r4 = r2.mWorkingPaint
            if (r4 != 0) goto L27
            android.text.TextPaint r4 = new android.text.TextPaint
            r4.<init>()
            r2.mWorkingPaint = r4
        L27:
            r4.set(r6)
        L2a:
            int r6 = r3.length
            if (r5 >= r6) goto L35
            r6 = r3[r5]
            r6.updateDrawState(r4)
            int r5 = r5 + 1
            goto L2a
        L35:
            return r4
        L36:
            boolean r3 = r6 instanceof android.text.TextPaint
            if (r3 == 0) goto L3d
            android.text.TextPaint r6 = (android.text.TextPaint) r6
            return r6
        L3d:
            return r1
        L3e:
            boolean r3 = r6 instanceof android.text.TextPaint
            if (r3 == 0) goto L45
            android.text.TextPaint r6 = (android.text.TextPaint) r6
            return r6
        L45:
            return r1
    }

    private static android.graphics.Paint getDebugPaint() {
            android.graphics.Paint r0 = androidx.emoji2.text.TypefaceEmojiSpan.sDebugPaint
            if (r0 != 0) goto L1d
            android.text.TextPaint r0 = new android.text.TextPaint
            r0.<init>()
            androidx.emoji2.text.TypefaceEmojiSpan.sDebugPaint = r0
            androidx.emoji2.text.EmojiCompat r1 = androidx.emoji2.text.EmojiCompat.get()
            int r1 = r1.getEmojiSpanIndicatorColor()
            r0.setColor(r1)
            android.graphics.Paint r0 = androidx.emoji2.text.TypefaceEmojiSpan.sDebugPaint
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
        L1d:
            android.graphics.Paint r0 = androidx.emoji2.text.TypefaceEmojiSpan.sDebugPaint
            return r0
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas r14, java.lang.CharSequence r15, int r16, int r17, float r18, int r19, int r20, int r21, android.graphics.Paint r22) {
            r13 = this;
            r7 = r18
            r8 = r19
            r9 = r21
            r10 = r13
            r0 = r15
            r1 = r16
            r2 = r17
            r11 = r22
            android.text.TextPaint r12 = r13.applyCharacterSpanStyles(r15, r1, r2, r11)
            if (r12 == 0) goto L29
            int r0 = r12.bgColor
            if (r0 == 0) goto L29
            int r0 = r13.getWidth()
            float r0 = (float) r0
            float r4 = r7 + r0
            float r5 = (float) r8
            float r6 = (float) r9
            r0 = r13
            r1 = r14
            r2 = r12
            r3 = r18
            r0.drawBackground(r1, r2, r3, r4, r5, r6)
        L29:
            androidx.emoji2.text.EmojiCompat r0 = androidx.emoji2.text.EmojiCompat.get()
            boolean r0 = r0.isEmojiSpanIndicatorEnabled()
            if (r0 == 0) goto L46
            float r2 = (float) r8
            int r0 = r13.getWidth()
            float r0 = (float) r0
            float r3 = r7 + r0
            float r4 = (float) r9
            android.graphics.Paint r5 = getDebugPaint()
            r0 = r14
            r1 = r18
            r0.drawRect(r1, r2, r3, r4, r5)
        L46:
            androidx.emoji2.text.TypefaceEmojiRasterizer r0 = r13.getTypefaceRasterizer()
            r1 = r20
            float r1 = (float) r1
            r2 = r14
            if (r12 == 0) goto L51
            r11 = r12
        L51:
            r0.draw(r14, r7, r1, r11)
            return
    }

    void drawBackground(android.graphics.Canvas r9, android.text.TextPaint r10, float r11, float r12, float r13, float r14) {
            r8 = this;
            int r0 = r10.getColor()
            android.graphics.Paint$Style r1 = r10.getStyle()
            int r2 = r10.bgColor
            r10.setColor(r2)
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r10.setStyle(r2)
            r2 = r9
            r3 = r11
            r4 = r13
            r5 = r12
            r6 = r14
            r7 = r10
            r2.drawRect(r3, r4, r5, r6, r7)
            r10.setStyle(r1)
            r10.setColor(r0)
            return
    }
}
