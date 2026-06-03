package com.nide8.login2.internal.org.json.simple.parser;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/nide8auth.jar:com/nide8/login2/internal/org/json/simple/parser/Yytoken.class */
class Yytoken {
    public static final int TYPE_VALUE = 0;
    public static final int TYPE_LEFT_BRACE = 1;
    public static final int TYPE_RIGHT_BRACE = 2;
    public static final int TYPE_LEFT_SQUARE = 3;
    public static final int TYPE_RIGHT_SQUARE = 4;
    public static final int TYPE_COMMA = 5;
    public static final int TYPE_COLON = 6;
    public static final int TYPE_EOF = -1;
    public int type;
    public java.lang.Object value;

    public Yytoken(int r4, java.lang.Object r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = 0
            r0.type = r1
            r0 = r3
            r1 = 0
            r0.value = r1
            r0 = r3
            r1 = r4
            r0.type = r1
            r0 = r3
            r1 = r5
            r0.value = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r3
            int r0 = r0.type
            switch(r0) {
                case -1: goto L8e;
                case 0: goto L3c;
                case 1: goto L52;
                case 2: goto L5c;
                case 3: goto L66;
                case 4: goto L70;
                case 5: goto L7a;
                case 6: goto L84;
                default: goto L95;
            }
        L3c:
            r0 = r4
            java.lang.String r1 = "VALUE("
            java.lang.StringBuffer r0 = r0.append(r1)
            r1 = r3
            java.lang.Object r1 = r1.value
            java.lang.StringBuffer r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuffer r0 = r0.append(r1)
            goto L95
        L52:
            r0 = r4
            java.lang.String r1 = "LEFT BRACE({)"
            java.lang.StringBuffer r0 = r0.append(r1)
            goto L95
        L5c:
            r0 = r4
            java.lang.String r1 = "RIGHT BRACE(})"
            java.lang.StringBuffer r0 = r0.append(r1)
            goto L95
        L66:
            r0 = r4
            java.lang.String r1 = "LEFT SQUARE([)"
            java.lang.StringBuffer r0 = r0.append(r1)
            goto L95
        L70:
            r0 = r4
            java.lang.String r1 = "RIGHT SQUARE(])"
            java.lang.StringBuffer r0 = r0.append(r1)
            goto L95
        L7a:
            r0 = r4
            java.lang.String r1 = "COMMA(,)"
            java.lang.StringBuffer r0 = r0.append(r1)
            goto L95
        L84:
            r0 = r4
            java.lang.String r1 = "COLON(:)"
            java.lang.StringBuffer r0 = r0.append(r1)
            goto L95
        L8e:
            r0 = r4
            java.lang.String r1 = "END OF FILE"
            java.lang.StringBuffer r0 = r0.append(r1)
        L95:
            r0 = r4
            java.lang.String r0 = r0.toString()
            return r0
    }
}
