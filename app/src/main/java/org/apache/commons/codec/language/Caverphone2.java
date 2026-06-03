package org.apache.commons.codec.language;

/* JADX INFO: loaded from: classes2.dex */
public class Caverphone2 extends org.apache.commons.codec.language.AbstractCaverphone {
    private static final java.lang.String TEN_1 = "1111111111";

    public Caverphone2() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.apache.commons.codec.StringEncoder
    public java.lang.String encode(java.lang.String r9) {
            r8 = this;
            boolean r0 = org.apache.commons.codec.language.SoundexUtils.isEmpty(r9)
            java.lang.String r1 = "1111111111"
            if (r0 == 0) goto L9
            return r1
        L9:
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r9 = r9.toLowerCase(r0)
            java.lang.String r0 = "[^a-z]"
            java.lang.String r2 = ""
            java.lang.String r9 = r9.replaceAll(r0, r2)
            java.lang.String r0 = "e$"
            java.lang.String r9 = r9.replaceAll(r0, r2)
            java.lang.String r0 = "^cough"
            java.lang.String r3 = "cou2f"
            java.lang.String r9 = r9.replaceAll(r0, r3)
            java.lang.String r0 = "^rough"
            java.lang.String r3 = "rou2f"
            java.lang.String r9 = r9.replaceAll(r0, r3)
            java.lang.String r0 = "^tough"
            java.lang.String r3 = "tou2f"
            java.lang.String r9 = r9.replaceAll(r0, r3)
            java.lang.String r0 = "^enough"
            java.lang.String r3 = "enou2f"
            java.lang.String r9 = r9.replaceAll(r0, r3)
            java.lang.String r0 = "^trough"
            java.lang.String r3 = "trou2f"
            java.lang.String r9 = r9.replaceAll(r0, r3)
            java.lang.String r0 = "^gn"
            java.lang.String r3 = "2n"
            java.lang.String r9 = r9.replaceAll(r0, r3)
            java.lang.String r0 = "mb$"
            java.lang.String r3 = "m2"
            java.lang.String r9 = r9.replaceAll(r0, r3)
            java.lang.String r0 = "cq"
            java.lang.String r3 = "2q"
            java.lang.String r9 = r9.replace(r0, r3)
            java.lang.String r0 = "ci"
            java.lang.String r3 = "si"
            java.lang.String r9 = r9.replace(r0, r3)
            java.lang.String r0 = "ce"
            java.lang.String r3 = "se"
            java.lang.String r9 = r9.replace(r0, r3)
            java.lang.String r0 = "cy"
            java.lang.String r3 = "sy"
            java.lang.String r9 = r9.replace(r0, r3)
            java.lang.String r0 = "tch"
            java.lang.String r3 = "2ch"
            java.lang.String r9 = r9.replace(r0, r3)
            java.lang.String r0 = "c"
            java.lang.String r3 = "k"
            java.lang.String r9 = r9.replace(r0, r3)
            java.lang.String r0 = "q"
            java.lang.String r9 = r9.replace(r0, r3)
            java.lang.String r0 = "x"
            java.lang.String r9 = r9.replace(r0, r3)
            java.lang.String r0 = "v"
            java.lang.String r4 = "f"
            java.lang.String r9 = r9.replace(r0, r4)
            java.lang.String r0 = "dg"
            java.lang.String r4 = "2g"
            java.lang.String r9 = r9.replace(r0, r4)
            java.lang.String r0 = "tio"
            java.lang.String r4 = "sio"
            java.lang.String r9 = r9.replace(r0, r4)
            java.lang.String r0 = "tia"
            java.lang.String r4 = "sia"
            java.lang.String r9 = r9.replace(r0, r4)
            java.lang.String r0 = "d"
            java.lang.String r4 = "t"
            java.lang.String r9 = r9.replace(r0, r4)
            java.lang.String r0 = "ph"
            java.lang.String r4 = "fh"
            java.lang.String r9 = r9.replace(r0, r4)
            java.lang.String r0 = "b"
            java.lang.String r4 = "p"
            java.lang.String r9 = r9.replace(r0, r4)
            java.lang.String r0 = "sh"
            java.lang.String r4 = "s2"
            java.lang.String r9 = r9.replace(r0, r4)
            java.lang.String r0 = "z"
            java.lang.String r4 = "s"
            java.lang.String r9 = r9.replace(r0, r4)
            java.lang.String r0 = "^[aeiou]"
            java.lang.String r4 = "A"
            java.lang.String r9 = r9.replaceAll(r0, r4)
            java.lang.String r0 = "[aeiou]"
            java.lang.String r5 = "3"
            java.lang.String r9 = r9.replaceAll(r0, r5)
            java.lang.String r0 = "j"
            java.lang.String r6 = "y"
            java.lang.String r9 = r9.replace(r0, r6)
            java.lang.String r0 = "^y3"
            java.lang.String r7 = "Y3"
            java.lang.String r9 = r9.replaceAll(r0, r7)
            java.lang.String r0 = "^y"
            java.lang.String r9 = r9.replaceAll(r0, r4)
            java.lang.String r9 = r9.replace(r6, r5)
            java.lang.String r0 = "3gh3"
            java.lang.String r6 = "3kh3"
            java.lang.String r9 = r9.replace(r0, r6)
            java.lang.String r0 = "gh"
            java.lang.String r6 = "22"
            java.lang.String r9 = r9.replace(r0, r6)
            java.lang.String r0 = "g"
            java.lang.String r9 = r9.replace(r0, r3)
            java.lang.String r0 = "s+"
            java.lang.String r3 = "S"
            java.lang.String r9 = r9.replaceAll(r0, r3)
            java.lang.String r0 = "t+"
            java.lang.String r3 = "T"
            java.lang.String r9 = r9.replaceAll(r0, r3)
            java.lang.String r0 = "p+"
            java.lang.String r3 = "P"
            java.lang.String r9 = r9.replaceAll(r0, r3)
            java.lang.String r0 = "k+"
            java.lang.String r3 = "K"
            java.lang.String r9 = r9.replaceAll(r0, r3)
            java.lang.String r0 = "f+"
            java.lang.String r3 = "F"
            java.lang.String r9 = r9.replaceAll(r0, r3)
            java.lang.String r0 = "m+"
            java.lang.String r3 = "M"
            java.lang.String r9 = r9.replaceAll(r0, r3)
            java.lang.String r0 = "n+"
            java.lang.String r3 = "N"
            java.lang.String r9 = r9.replaceAll(r0, r3)
            java.lang.String r0 = "w3"
            java.lang.String r3 = "W3"
            java.lang.String r9 = r9.replace(r0, r3)
            java.lang.String r0 = "wh3"
            java.lang.String r3 = "Wh3"
            java.lang.String r9 = r9.replace(r0, r3)
            java.lang.String r0 = "w$"
            java.lang.String r9 = r9.replaceAll(r0, r5)
            java.lang.String r0 = "w"
            java.lang.String r3 = "2"
            java.lang.String r9 = r9.replace(r0, r3)
            java.lang.String r0 = "^h"
            java.lang.String r9 = r9.replaceAll(r0, r4)
            java.lang.String r0 = "h"
            java.lang.String r9 = r9.replace(r0, r3)
            java.lang.String r0 = "r3"
            java.lang.String r6 = "R3"
            java.lang.String r9 = r9.replace(r0, r6)
            java.lang.String r0 = "r$"
            java.lang.String r9 = r9.replaceAll(r0, r5)
            java.lang.String r0 = "r"
            java.lang.String r9 = r9.replace(r0, r3)
            java.lang.String r0 = "l3"
            java.lang.String r6 = "L3"
            java.lang.String r9 = r9.replace(r0, r6)
            java.lang.String r0 = "l$"
            java.lang.String r9 = r9.replaceAll(r0, r5)
            java.lang.String r0 = "l"
            java.lang.String r9 = r9.replace(r0, r3)
            java.lang.String r9 = r9.replace(r3, r2)
            java.lang.String r0 = "3$"
            java.lang.String r9 = r9.replaceAll(r0, r4)
            java.lang.String r9 = r9.replace(r5, r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r9 = r0.append(r9)
            java.lang.StringBuilder r9 = r9.append(r1)
            java.lang.String r9 = r9.toString()
            r0 = 0
            int r1 = r1.length()
            java.lang.String r9 = r9.substring(r0, r1)
            return r9
    }
}
