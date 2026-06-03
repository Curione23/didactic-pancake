package androidx.core.content.res;

/* JADX INFO: loaded from: classes.dex */
public final class ColorStateListInflaterCompat {
    private static final java.lang.ThreadLocal<android.util.TypedValue> sTempTypedValue = null;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.core.content.res.ColorStateListInflaterCompat.sTempTypedValue = r0
            return
    }

    private ColorStateListInflaterCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.content.res.ColorStateList createFromXml(android.content.res.Resources r4, org.xmlpull.v1.XmlPullParser r5, android.content.res.Resources.Theme r6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L4:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto Lf
            r3 = 1
            if (r1 == r3) goto Lf
            goto L4
        Lf:
            if (r1 != r2) goto L16
            android.content.res.ColorStateList r4 = createFromXmlInner(r4, r5, r0, r6)
            return r4
        L16:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
    }

    public static android.content.res.ColorStateList createFromXmlInner(android.content.res.Resources r2, org.xmlpull.v1.XmlPullParser r3, android.util.AttributeSet r4, android.content.res.Resources.Theme r5) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            java.lang.String r0 = r3.getName()
            java.lang.String r1 = "selector"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L11
            android.content.res.ColorStateList r2 = inflate(r2, r3, r4, r5)
            return r2
        L11:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.getPositionDescription()
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r4 = ": invalid color state list tag "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    private static android.util.TypedValue getTypedValue() {
            java.lang.ThreadLocal<android.util.TypedValue> r0 = androidx.core.content.res.ColorStateListInflaterCompat.sTempTypedValue
            java.lang.Object r1 = r0.get()
            android.util.TypedValue r1 = (android.util.TypedValue) r1
            if (r1 != 0) goto L12
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            r0.set(r1)
        L12:
            return r1
    }

    public static android.content.res.ColorStateList inflate(android.content.res.Resources r0, int r1, android.content.res.Resources.Theme r2) {
            android.content.res.XmlResourceParser r1 = r0.getXml(r1)     // Catch: java.lang.Exception -> L9
            android.content.res.ColorStateList r0 = createFromXml(r0, r1, r2)     // Catch: java.lang.Exception -> L9
            return r0
        L9:
            r0 = move-exception
            java.lang.String r1 = "CSLCompat"
            java.lang.String r2 = "Failed to inflate ColorStateList."
            android.util.Log.e(r1, r2, r0)
            r0 = 0
            return r0
    }

    private static android.content.res.ColorStateList inflate(android.content.res.Resources r17, org.xmlpull.v1.XmlPullParser r18, android.util.AttributeSet r19, android.content.res.Resources.Theme r20) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r0 = r17
            r1 = r19
            r2 = r20
            int r3 = r18.getDepth()
            r4 = 1
            int r3 = r3 + r4
            r5 = 20
            int[][] r6 = new int[r5][]
            int[] r5 = new int[r5]
            r8 = 0
        L13:
            int r9 = r18.next()
            if (r9 == r4) goto Lf4
            int r10 = r18.getDepth()
            if (r10 >= r3) goto L22
            r11 = 3
            if (r9 == r11) goto Lf4
        L22:
            r11 = 2
            if (r9 != r11) goto Lef
            if (r10 > r3) goto Lef
            java.lang.String r9 = r18.getName()
            java.lang.String r10 = "item"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L35
            goto Lef
        L35:
            int[] r9 = androidx.core.R.styleable.ColorStateListItem
            android.content.res.TypedArray r9 = obtainAttributes(r0, r2, r1, r9)
            int r10 = androidx.core.R.styleable.ColorStateListItem_android_color
            r11 = -1
            int r10 = r9.getResourceId(r10, r11)
            r12 = -65281(0xffffffffffff00ff, float:NaN)
            if (r10 == r11) goto L61
            boolean r11 = isColorInt(r0, r10)
            if (r11 != 0) goto L61
            android.content.res.XmlResourceParser r10 = r0.getXml(r10)     // Catch: java.lang.Exception -> L5a
            android.content.res.ColorStateList r10 = createFromXml(r0, r10, r2)     // Catch: java.lang.Exception -> L5a
            int r10 = r10.getDefaultColor()     // Catch: java.lang.Exception -> L5a
            goto L67
        L5a:
            int r10 = androidx.core.R.styleable.ColorStateListItem_android_color
            int r10 = r9.getColor(r10, r12)
            goto L67
        L61:
            int r10 = androidx.core.R.styleable.ColorStateListItem_android_color
            int r10 = r9.getColor(r10, r12)
        L67:
            int r11 = androidx.core.R.styleable.ColorStateListItem_android_alpha
            boolean r11 = r9.hasValue(r11)
            r12 = 1065353216(0x3f800000, float:1.0)
            if (r11 == 0) goto L78
            int r11 = androidx.core.R.styleable.ColorStateListItem_android_alpha
            float r12 = r9.getFloat(r11, r12)
            goto L86
        L78:
            int r11 = androidx.core.R.styleable.ColorStateListItem_alpha
            boolean r11 = r9.hasValue(r11)
            if (r11 == 0) goto L86
            int r11 = androidx.core.R.styleable.ColorStateListItem_alpha
            float r12 = r9.getFloat(r11, r12)
        L86:
            int r11 = android.os.Build.VERSION.SDK_INT
            r13 = 31
            r14 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r11 < r13) goto L9d
            int r11 = androidx.core.R.styleable.ColorStateListItem_android_lStar
            boolean r11 = r9.hasValue(r11)
            if (r11 == 0) goto L9d
            int r11 = androidx.core.R.styleable.ColorStateListItem_android_lStar
            float r11 = r9.getFloat(r11, r14)
            goto La3
        L9d:
            int r11 = androidx.core.R.styleable.ColorStateListItem_lStar
            float r11 = r9.getFloat(r11, r14)
        La3:
            r9.recycle()
            int r9 = r19.getAttributeCount()
            int[] r13 = new int[r9]
            r14 = 0
            r15 = 0
        Lae:
            if (r14 >= r9) goto Lda
            int r4 = r1.getAttributeNameResource(r14)
            r7 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r4 == r7) goto Ld4
            r7 = 16843551(0x101031f, float:2.3695797E-38)
            if (r4 == r7) goto Ld4
            int r7 = androidx.core.R.attr.alpha
            if (r4 == r7) goto Ld4
            int r7 = androidx.core.R.attr.lStar
            if (r4 == r7) goto Ld4
            int r7 = r15 + 1
            r0 = 0
            boolean r16 = r1.getAttributeBooleanValue(r14, r0)
            if (r16 == 0) goto Ld0
            goto Ld1
        Ld0:
            int r4 = -r4
        Ld1:
            r13[r15] = r4
            r15 = r7
        Ld4:
            int r14 = r14 + 1
            r4 = 1
            r0 = r17
            goto Lae
        Lda:
            int[] r0 = android.util.StateSet.trimStateSet(r13, r15)
            int r4 = modulateColorAlpha(r10, r12, r11)
            int[] r5 = androidx.core.content.res.GrowingArrayUtils.append(r5, r8, r4)
            java.lang.Object[] r0 = androidx.core.content.res.GrowingArrayUtils.append(r6, r8, r0)
            r6 = r0
            int[][] r6 = (int[][]) r6
            int r8 = r8 + 1
        Lef:
            r4 = 1
            r0 = r17
            goto L13
        Lf4:
            int[] r0 = new int[r8]
            int[][] r1 = new int[r8][]
            r2 = 0
            java.lang.System.arraycopy(r5, r2, r0, r2, r8)
            java.lang.System.arraycopy(r6, r2, r1, r2, r8)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
    }

    private static boolean isColorInt(android.content.res.Resources r2, int r3) {
            android.util.TypedValue r0 = getTypedValue()
            r1 = 1
            r2.getValue(r3, r0, r1)
            int r2 = r0.type
            r3 = 28
            if (r2 < r3) goto L15
            int r2 = r0.type
            r3 = 31
            if (r2 > r3) goto L15
            goto L16
        L15:
            r1 = 0
        L16:
            return r1
    }

    private static int modulateColorAlpha(int r3, float r4, float r5) {
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r1 = 0
            if (r0 < 0) goto Le
            r0 = 1120403456(0x42c80000, float:100.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 > 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = r1
        Lf:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L18
            if (r0 != 0) goto L18
            return r3
        L18:
            int r2 = android.graphics.Color.alpha(r3)
            float r2 = (float) r2
            float r2 = r2 * r4
            r4 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r4
            int r4 = (int) r2
            r2 = 255(0xff, float:3.57E-43)
            int r4 = androidx.core.math.MathUtils.clamp(r4, r1, r2)
            if (r0 == 0) goto L3a
            androidx.core.content.res.CamColor r3 = androidx.core.content.res.CamColor.fromColor(r3)
            float r0 = r3.getHue()
            float r3 = r3.getChroma()
            int r3 = androidx.core.content.res.CamColor.toColor(r0, r3, r5)
        L3a:
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r3 & r5
            int r4 = r4 << 24
            r3 = r3 | r4
            return r3
    }

    private static android.content.res.TypedArray obtainAttributes(android.content.res.Resources r0, android.content.res.Resources.Theme r1, android.util.AttributeSet r2, int[] r3) {
            if (r1 != 0) goto L7
            android.content.res.TypedArray r0 = r0.obtainAttributes(r2, r3)
            goto Lc
        L7:
            r0 = 0
            android.content.res.TypedArray r0 = r1.obtainStyledAttributes(r2, r3, r0, r0)
        Lc:
            return r0
    }
}
