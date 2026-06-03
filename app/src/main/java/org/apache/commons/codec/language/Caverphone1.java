package org.apache.commons.codec.language;

/* JADX INFO: loaded from: classes2.dex */
public class Caverphone1 extends org.apache.commons.codec.language.AbstractCaverphone {
    private static final java.lang.String SIX_1 = "111111";

    public Caverphone1() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.apache.commons.codec.StringEncoder
    public java.lang.String encode(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "111111"
            if (r8 == 0) goto L1c3
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto Lc
            goto L1c3
        Lc:
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r8 = r8.toLowerCase(r1)
            java.lang.String r1 = "[^a-z]"
            java.lang.String r2 = ""
            java.lang.String r8 = r8.replaceAll(r1, r2)
            java.lang.String r1 = "^cough"
            java.lang.String r3 = "cou2f"
            java.lang.String r8 = r8.replaceAll(r1, r3)
            java.lang.String r1 = "^rough"
            java.lang.String r3 = "rou2f"
            java.lang.String r8 = r8.replaceAll(r1, r3)
            java.lang.String r1 = "^tough"
            java.lang.String r3 = "tou2f"
            java.lang.String r8 = r8.replaceAll(r1, r3)
            java.lang.String r1 = "^enough"
            java.lang.String r3 = "enou2f"
            java.lang.String r8 = r8.replaceAll(r1, r3)
            java.lang.String r1 = "^gn"
            java.lang.String r3 = "2n"
            java.lang.String r8 = r8.replaceAll(r1, r3)
            java.lang.String r1 = "mb$"
            java.lang.String r3 = "m2"
            java.lang.String r8 = r8.replaceAll(r1, r3)
            java.lang.String r1 = "cq"
            java.lang.String r3 = "2q"
            java.lang.String r8 = r8.replace(r1, r3)
            java.lang.String r1 = "ci"
            java.lang.String r3 = "si"
            java.lang.String r8 = r8.replace(r1, r3)
            java.lang.String r1 = "ce"
            java.lang.String r3 = "se"
            java.lang.String r8 = r8.replace(r1, r3)
            java.lang.String r1 = "cy"
            java.lang.String r3 = "sy"
            java.lang.String r8 = r8.replace(r1, r3)
            java.lang.String r1 = "tch"
            java.lang.String r3 = "2ch"
            java.lang.String r8 = r8.replace(r1, r3)
            java.lang.String r1 = "c"
            java.lang.String r3 = "k"
            java.lang.String r8 = r8.replace(r1, r3)
            java.lang.String r1 = "q"
            java.lang.String r8 = r8.replace(r1, r3)
            java.lang.String r1 = "x"
            java.lang.String r8 = r8.replace(r1, r3)
            java.lang.String r1 = "v"
            java.lang.String r4 = "f"
            java.lang.String r8 = r8.replace(r1, r4)
            java.lang.String r1 = "dg"
            java.lang.String r4 = "2g"
            java.lang.String r8 = r8.replace(r1, r4)
            java.lang.String r1 = "tio"
            java.lang.String r4 = "sio"
            java.lang.String r8 = r8.replace(r1, r4)
            java.lang.String r1 = "tia"
            java.lang.String r4 = "sia"
            java.lang.String r8 = r8.replace(r1, r4)
            java.lang.String r1 = "d"
            java.lang.String r4 = "t"
            java.lang.String r8 = r8.replace(r1, r4)
            java.lang.String r1 = "ph"
            java.lang.String r4 = "fh"
            java.lang.String r8 = r8.replace(r1, r4)
            java.lang.String r1 = "b"
            java.lang.String r4 = "p"
            java.lang.String r8 = r8.replace(r1, r4)
            java.lang.String r1 = "sh"
            java.lang.String r4 = "s2"
            java.lang.String r8 = r8.replace(r1, r4)
            java.lang.String r1 = "z"
            java.lang.String r4 = "s"
            java.lang.String r8 = r8.replace(r1, r4)
            java.lang.String r1 = "^[aeiou]"
            java.lang.String r4 = "A"
            java.lang.String r8 = r8.replaceAll(r1, r4)
            java.lang.String r1 = "[aeiou]"
            java.lang.String r5 = "3"
            java.lang.String r8 = r8.replaceAll(r1, r5)
            java.lang.String r1 = "3gh3"
            java.lang.String r6 = "3kh3"
            java.lang.String r8 = r8.replace(r1, r6)
            java.lang.String r1 = "gh"
            java.lang.String r6 = "22"
            java.lang.String r8 = r8.replace(r1, r6)
            java.lang.String r1 = "g"
            java.lang.String r8 = r8.replace(r1, r3)
            java.lang.String r1 = "s+"
            java.lang.String r3 = "S"
            java.lang.String r8 = r8.replaceAll(r1, r3)
            java.lang.String r1 = "t+"
            java.lang.String r3 = "T"
            java.lang.String r8 = r8.replaceAll(r1, r3)
            java.lang.String r1 = "p+"
            java.lang.String r3 = "P"
            java.lang.String r8 = r8.replaceAll(r1, r3)
            java.lang.String r1 = "k+"
            java.lang.String r3 = "K"
            java.lang.String r8 = r8.replaceAll(r1, r3)
            java.lang.String r1 = "f+"
            java.lang.String r3 = "F"
            java.lang.String r8 = r8.replaceAll(r1, r3)
            java.lang.String r1 = "m+"
            java.lang.String r3 = "M"
            java.lang.String r8 = r8.replaceAll(r1, r3)
            java.lang.String r1 = "n+"
            java.lang.String r3 = "N"
            java.lang.String r8 = r8.replaceAll(r1, r3)
            java.lang.String r1 = "w3"
            java.lang.String r3 = "W3"
            java.lang.String r8 = r8.replace(r1, r3)
            java.lang.String r1 = "wy"
            java.lang.String r3 = "Wy"
            java.lang.String r8 = r8.replace(r1, r3)
            java.lang.String r1 = "wh3"
            java.lang.String r3 = "Wh3"
            java.lang.String r8 = r8.replace(r1, r3)
            java.lang.String r1 = "why"
            java.lang.String r3 = "Why"
            java.lang.String r8 = r8.replace(r1, r3)
            java.lang.String r1 = "w"
            java.lang.String r3 = "2"
            java.lang.String r8 = r8.replace(r1, r3)
            java.lang.String r1 = "^h"
            java.lang.String r8 = r8.replaceAll(r1, r4)
            java.lang.String r1 = "h"
            java.lang.String r8 = r8.replace(r1, r3)
            java.lang.String r1 = "r3"
            java.lang.String r4 = "R3"
            java.lang.String r8 = r8.replace(r1, r4)
            java.lang.String r1 = "ry"
            java.lang.String r4 = "Ry"
            java.lang.String r8 = r8.replace(r1, r4)
            java.lang.String r1 = "r"
            java.lang.String r8 = r8.replace(r1, r3)
            java.lang.String r1 = "l3"
            java.lang.String r4 = "L3"
            java.lang.String r8 = r8.replace(r1, r4)
            java.lang.String r1 = "ly"
            java.lang.String r4 = "Ly"
            java.lang.String r8 = r8.replace(r1, r4)
            java.lang.String r1 = "l"
            java.lang.String r8 = r8.replace(r1, r3)
            java.lang.String r1 = "j"
            java.lang.String r4 = "y"
            java.lang.String r8 = r8.replace(r1, r4)
            java.lang.String r1 = "y3"
            java.lang.String r6 = "Y3"
            java.lang.String r8 = r8.replace(r1, r6)
            java.lang.String r8 = r8.replace(r4, r3)
            java.lang.String r8 = r8.replace(r3, r2)
            java.lang.String r8 = r8.replace(r5, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r8 = r1.append(r8)
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.String r8 = r8.toString()
            r1 = 0
            int r0 = r0.length()
            java.lang.String r8 = r8.substring(r1, r0)
            return r8
        L1c3:
            return r0
    }
}
