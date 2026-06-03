package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
public class TypefaceEmojiRasterizer {
    static final int HAS_GLYPH_ABSENT = 1;
    static final int HAS_GLYPH_EXISTS = 2;
    static final int HAS_GLYPH_UNKNOWN = 0;
    private static final java.lang.ThreadLocal<androidx.emoji2.text.flatbuffer.MetadataItem> sMetadataItem = null;
    private volatile int mCache;
    private final int mIndex;
    private final androidx.emoji2.text.MetadataRepo mMetadataRepo;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface HasGlyph {
    }

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.emoji2.text.TypefaceEmojiRasterizer.sMetadataItem = r0
            return
    }

    TypefaceEmojiRasterizer(androidx.emoji2.text.MetadataRepo r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mCache = r0
            r1.mMetadataRepo = r2
            r1.mIndex = r3
            return
    }

    private androidx.emoji2.text.flatbuffer.MetadataItem getMetadataItem() {
            r3 = this;
            java.lang.ThreadLocal<androidx.emoji2.text.flatbuffer.MetadataItem> r0 = androidx.emoji2.text.TypefaceEmojiRasterizer.sMetadataItem
            java.lang.Object r1 = r0.get()
            androidx.emoji2.text.flatbuffer.MetadataItem r1 = (androidx.emoji2.text.flatbuffer.MetadataItem) r1
            if (r1 != 0) goto L12
            androidx.emoji2.text.flatbuffer.MetadataItem r1 = new androidx.emoji2.text.flatbuffer.MetadataItem
            r1.<init>()
            r0.set(r1)
        L12:
            androidx.emoji2.text.MetadataRepo r0 = r3.mMetadataRepo
            androidx.emoji2.text.flatbuffer.MetadataList r0 = r0.getMetadataList()
            int r2 = r3.mIndex
            r0.list(r1, r2)
            return r1
    }

    public void draw(android.graphics.Canvas r10, float r11, float r12, android.graphics.Paint r13) {
            r9 = this;
            androidx.emoji2.text.MetadataRepo r0 = r9.mMetadataRepo
            android.graphics.Typeface r0 = r0.getTypeface()
            android.graphics.Typeface r1 = r13.getTypeface()
            r13.setTypeface(r0)
            int r0 = r9.mIndex
            int r4 = r0 * 2
            androidx.emoji2.text.MetadataRepo r0 = r9.mMetadataRepo
            char[] r3 = r0.getEmojiCharArray()
            r5 = 2
            r2 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r2.drawText(r3, r4, r5, r6, r7, r8)
            r13.setTypeface(r1)
            return
    }

    public int getCodepointAt(int r2) {
            r1 = this;
            androidx.emoji2.text.flatbuffer.MetadataItem r0 = r1.getMetadataItem()
            int r2 = r0.codepoints(r2)
            return r2
    }

    public int getCodepointsLength() {
            r1 = this;
            androidx.emoji2.text.flatbuffer.MetadataItem r0 = r1.getMetadataItem()
            int r0 = r0.codepointsLength()
            return r0
    }

    public short getCompatAdded() {
            r1 = this;
            androidx.emoji2.text.flatbuffer.MetadataItem r0 = r1.getMetadataItem()
            short r0 = r0.compatAdded()
            return r0
    }

    public int getHasGlyph() {
            r1 = this;
            int r0 = r1.mCache
            r0 = r0 & 3
            return r0
    }

    public int getHeight() {
            r1 = this;
            androidx.emoji2.text.flatbuffer.MetadataItem r0 = r1.getMetadataItem()
            short r0 = r0.height()
            return r0
    }

    public int getId() {
            r1 = this;
            androidx.emoji2.text.flatbuffer.MetadataItem r0 = r1.getMetadataItem()
            int r0 = r0.id()
            return r0
    }

    public short getSdkAdded() {
            r1 = this;
            androidx.emoji2.text.flatbuffer.MetadataItem r0 = r1.getMetadataItem()
            short r0 = r0.sdkAdded()
            return r0
    }

    public android.graphics.Typeface getTypeface() {
            r1 = this;
            androidx.emoji2.text.MetadataRepo r0 = r1.mMetadataRepo
            android.graphics.Typeface r0 = r0.getTypeface()
            return r0
    }

    public int getWidth() {
            r1 = this;
            androidx.emoji2.text.flatbuffer.MetadataItem r0 = r1.getMetadataItem()
            short r0 = r0.width()
            return r0
    }

    public boolean isDefaultEmoji() {
            r1 = this;
            androidx.emoji2.text.flatbuffer.MetadataItem r0 = r1.getMetadataItem()
            boolean r0 = r0.emojiStyle()
            return r0
    }

    public boolean isPreferredSystemRender() {
            r1 = this;
            int r0 = r1.mCache
            r0 = r0 & 4
            if (r0 <= 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public void resetHasGlyphCache() {
            r1 = this;
            boolean r0 = r1.isPreferredSystemRender()
            if (r0 == 0) goto La
            r0 = 4
            r1.mCache = r0
            goto Ld
        La:
            r0 = 0
            r1.mCache = r0
        Ld:
            return
    }

    public void setExclusion(boolean r2) {
            r1 = this;
            int r0 = r1.getHasGlyph()
            if (r2 == 0) goto Lb
            r2 = r0 | 4
            r1.mCache = r2
            goto Ld
        Lb:
            r1.mCache = r0
        Ld:
            return
    }

    public void setHasGlyph(boolean r2) {
            r1 = this;
            int r0 = r1.mCache
            r0 = r0 & 4
            if (r2 == 0) goto L9
            r2 = r0 | 2
            goto Lb
        L9:
            r2 = r0 | 1
        Lb:
            r1.mCache = r2
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = ", id:"
            r0.append(r1)
            int r1 = r4.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = ", codepoints:"
            r0.append(r1)
            int r1 = r4.getCodepointsLength()
            r2 = 0
        L26:
            if (r2 >= r1) goto L3b
            int r3 = r4.getCodepointAt(r2)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r0.append(r3)
            java.lang.String r3 = " "
            r0.append(r3)
            int r2 = r2 + 1
            goto L26
        L3b:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
