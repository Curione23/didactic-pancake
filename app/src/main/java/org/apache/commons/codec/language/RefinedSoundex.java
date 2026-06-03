package org.apache.commons.codec.language;

/* JADX INFO: loaded from: classes2.dex */
public class RefinedSoundex implements org.apache.commons.codec.StringEncoder {
    public static final org.apache.commons.codec.language.RefinedSoundex US_ENGLISH = null;
    private static final char[] US_ENGLISH_MAPPING = null;
    public static final java.lang.String US_ENGLISH_MAPPING_STRING = "01360240043788015936020505";
    private final char[] soundexMapping;

    static {
            java.lang.String r0 = "01360240043788015936020505"
            char[] r0 = r0.toCharArray()
            org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING = r0
            org.apache.commons.codec.language.RefinedSoundex r0 = new org.apache.commons.codec.language.RefinedSoundex
            r0.<init>()
            org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH = r0
            return
    }

    public RefinedSoundex() {
            r1 = this;
            r1.<init>()
            char[] r0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING
            r1.soundexMapping = r0
            return
    }

    public RefinedSoundex(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            char[] r1 = r1.toCharArray()
            r0.soundexMapping = r1
            return
    }

    public RefinedSoundex(char[] r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = r1.clone()
            char[] r1 = (char[]) r1
            r0.soundexMapping = r1
            return
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
            java.lang.String r0 = "Parameter supplied to RefinedSoundex encode is not of type java.lang.String"
            r2.<init>(r0)
            throw r2
    }

    @Override // org.apache.commons.codec.StringEncoder
    public java.lang.String encode(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = r0.soundex(r1)
            return r1
    }

    char getMappingCode(char r4) {
            r3 = this;
            boolean r0 = java.lang.Character.isLetter(r4)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            char r4 = java.lang.Character.toUpperCase(r4)
            int r4 = r4 + (-65)
            if (r4 < 0) goto L19
            char[] r0 = r3.soundexMapping
            int r2 = r0.length
            if (r4 < r2) goto L16
            goto L19
        L16:
            char r4 = r0[r4]
            return r4
        L19:
            return r1
    }

    public java.lang.String soundex(java.lang.String r5) {
            r4 = this;
            if (r5 != 0) goto L4
            r5 = 0
            return r5
        L4:
            java.lang.String r5 = org.apache.commons.codec.language.SoundexUtils.clean(r5)
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto Lf
            return r5
        Lf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            char r2 = r5.charAt(r1)
            r0.append(r2)
            r2 = 42
        L1e:
            int r3 = r5.length()
            if (r1 >= r3) goto L38
            char r3 = r5.charAt(r1)
            char r3 = r4.getMappingCode(r3)
            if (r3 != r2) goto L2f
            goto L35
        L2f:
            if (r3 == 0) goto L34
            r0.append(r3)
        L34:
            r2 = r3
        L35:
            int r1 = r1 + 1
            goto L1e
        L38:
            java.lang.String r5 = r0.toString()
            return r5
    }
}
