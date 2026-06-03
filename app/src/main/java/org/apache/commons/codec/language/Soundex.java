package org.apache.commons.codec.language;

/* JADX INFO: loaded from: classes2.dex */
public class Soundex implements org.apache.commons.codec.StringEncoder {
    public static final char SILENT_MARKER = '-';
    public static final org.apache.commons.codec.language.Soundex US_ENGLISH = null;
    public static final org.apache.commons.codec.language.Soundex US_ENGLISH_GENEALOGY = null;
    private static final char[] US_ENGLISH_MAPPING = null;
    public static final java.lang.String US_ENGLISH_MAPPING_STRING = "01230120022455012623010202";
    public static final org.apache.commons.codec.language.Soundex US_ENGLISH_SIMPLIFIED = null;

    @java.lang.Deprecated
    private int maxLength;
    private final char[] soundexMapping;
    private final boolean specialCaseHW;

    static {
            java.lang.String r0 = "01230120022455012623010202"
            char[] r1 = r0.toCharArray()
            org.apache.commons.codec.language.Soundex.US_ENGLISH_MAPPING = r1
            org.apache.commons.codec.language.Soundex r1 = new org.apache.commons.codec.language.Soundex
            r1.<init>()
            org.apache.commons.codec.language.Soundex.US_ENGLISH = r1
            org.apache.commons.codec.language.Soundex r1 = new org.apache.commons.codec.language.Soundex
            r2 = 0
            r1.<init>(r0, r2)
            org.apache.commons.codec.language.Soundex.US_ENGLISH_SIMPLIFIED = r1
            org.apache.commons.codec.language.Soundex r0 = new org.apache.commons.codec.language.Soundex
            java.lang.String r1 = "-123-12--22455-12623-1-2-2"
            r0.<init>(r1)
            org.apache.commons.codec.language.Soundex.US_ENGLISH_GENEALOGY = r0
            return
    }

    public Soundex() {
            r1 = this;
            r1.<init>()
            r0 = 4
            r1.maxLength = r0
            char[] r0 = org.apache.commons.codec.language.Soundex.US_ENGLISH_MAPPING
            r1.soundexMapping = r0
            r0 = 1
            r1.specialCaseHW = r0
            return
    }

    public Soundex(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            r0 = 4
            r1.maxLength = r0
            char[] r2 = r2.toCharArray()
            r1.soundexMapping = r2
            boolean r2 = r1.hasMarker(r2)
            r2 = r2 ^ 1
            r1.specialCaseHW = r2
            return
    }

    public Soundex(java.lang.String r2, boolean r3) {
            r1 = this;
            r1.<init>()
            r0 = 4
            r1.maxLength = r0
            char[] r2 = r2.toCharArray()
            r1.soundexMapping = r2
            r1.specialCaseHW = r3
            return
    }

    public Soundex(char[] r2) {
            r1 = this;
            r1.<init>()
            r0 = 4
            r1.maxLength = r0
            java.lang.Object r2 = r2.clone()
            char[] r2 = (char[]) r2
            r1.soundexMapping = r2
            boolean r2 = r1.hasMarker(r2)
            r2 = r2 ^ 1
            r1.specialCaseHW = r2
            return
    }

    private boolean hasMarker(char[] r6) {
            r5 = this;
            int r0 = r6.length
            r1 = 0
            r2 = r1
        L3:
            if (r2 >= r0) goto L10
            char r3 = r6[r2]
            r4 = 45
            if (r3 != r4) goto Ld
            r6 = 1
            return r6
        Ld:
            int r2 = r2 + 1
            goto L3
        L10:
            return r1
    }

    private char map(char r5) {
            r4 = this;
            int r0 = r5 + (-65)
            if (r0 < 0) goto Lc
            char[] r1 = r4.soundexMapping
            int r2 = r1.length
            if (r0 >= r2) goto Lc
            char r5 = r1[r0]
            return r5
        Lc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "The character is not mapped: "
            r2.<init>(r3)
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r2 = " (index="
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r0 = ")"
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5)
            throw r1
    }

    public int difference(java.lang.String r1, java.lang.String r2) throws org.apache.commons.codec.EncoderException {
            r0 = this;
            int r1 = org.apache.commons.codec.language.SoundexUtils.difference(r0, r1, r2)
            return r1
    }

    @Override // org.apache.commons.codec.Encoder
    public java.lang.Object encode(java.lang.Object r2) throws org.apache.commons.codec.EncoderException {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto Lb
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r1.soundex(r2)
            return r2
        Lb:
            org.apache.commons.codec.EncoderException r2 = new org.apache.commons.codec.EncoderException
            java.lang.String r0 = "Parameter supplied to Soundex encode is not of type java.lang.String"
            r2.<init>(r0)
            throw r2
    }

    @Override // org.apache.commons.codec.StringEncoder
    public java.lang.String encode(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = r0.soundex(r1)
            return r1
    }

    @java.lang.Deprecated
    public int getMaxLength() {
            r1 = this;
            int r0 = r1.maxLength
            return r0
    }

    @java.lang.Deprecated
    public void setMaxLength(int r1) {
            r0 = this;
            r0.maxLength = r1
            return
    }

    public java.lang.String soundex(java.lang.String r9) {
            r8 = this;
            if (r9 != 0) goto L4
            r9 = 0
            return r9
        L4:
            java.lang.String r9 = org.apache.commons.codec.language.SoundexUtils.clean(r9)
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto Lf
            return r9
        Lf:
            r0 = 4
            char[] r1 = new char[r0]
            r2 = 0
            r3 = 48
            r1[r2] = r3
            r4 = 1
            r1[r4] = r3
            r5 = 2
            r1[r5] = r3
            r5 = 3
            r1[r5] = r3
            char r5 = r9.charAt(r2)
            r1[r2] = r5
            char r2 = r8.map(r5)
            r5 = r4
        L2b:
            int r6 = r9.length()
            if (r4 >= r6) goto L5a
            if (r5 >= r0) goto L5a
            char r6 = r9.charAt(r4)
            boolean r7 = r8.specialCaseHW
            if (r7 == 0) goto L44
            r7 = 72
            if (r6 == r7) goto L57
            r7 = 87
            if (r6 != r7) goto L44
            goto L57
        L44:
            char r6 = r8.map(r6)
            r7 = 45
            if (r6 != r7) goto L4d
            goto L57
        L4d:
            if (r6 == r3) goto L56
            if (r6 == r2) goto L56
            int r2 = r5 + 1
            r1[r5] = r6
            r5 = r2
        L56:
            r2 = r6
        L57:
            int r4 = r4 + 1
            goto L2b
        L5a:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r1)
            return r9
    }
}
