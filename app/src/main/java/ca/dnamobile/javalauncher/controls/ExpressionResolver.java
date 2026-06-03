package ca.dnamobile.javalauncher.controls;

/* JADX INFO: loaded from: classes.dex */
final class ExpressionResolver {
    private static final java.util.regex.Pattern DP_FUNCTION = null;
    private static final java.util.regex.Pattern PX_FUNCTION = null;
    private int position;
    private final java.lang.String text;

    static {
            java.lang.String r0 = "\\bpx\\s*\\(\\s*([-+]?[0-9]*\\.?[0-9]+)\\s*\\)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            ca.dnamobile.javalauncher.controls.ExpressionResolver.PX_FUNCTION = r0
            java.lang.String r0 = "\\bdp\\s*\\(\\s*([-+]?[0-9]*\\.?[0-9]+)\\s*\\)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            ca.dnamobile.javalauncher.controls.ExpressionResolver.DP_FUNCTION = r0
            return
    }

    private ExpressionResolver(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.text = r1
            return
    }

    private boolean match(char r3) {
            r2 = this;
            r2.skipSpaces()
            int r0 = r2.position
            java.lang.String r1 = r2.text
            int r1 = r1.length()
            if (r0 >= r1) goto L1e
            java.lang.String r0 = r2.text
            int r1 = r2.position
            char r0 = r0.charAt(r1)
            if (r0 != r3) goto L1e
            int r3 = r2.position
            r0 = 1
            int r3 = r3 + r0
            r2.position = r3
            return r0
        L1e:
            r3 = 0
            return r3
    }

    private double parseExpression() {
            r4 = this;
            double r0 = r4.parseTerm()
        L4:
            r4.skipSpaces()
            r2 = 43
            boolean r2 = r4.match(r2)
            if (r2 == 0) goto L15
            double r2 = r4.parseTerm()
            double r0 = r0 + r2
            goto L4
        L15:
            r2 = 45
            boolean r2 = r4.match(r2)
            if (r2 == 0) goto L23
            double r2 = r4.parseTerm()
            double r0 = r0 - r2
            goto L4
        L23:
            return r0
    }

    private double parseFactor() {
            r5 = this;
            r5.skipSpaces()
            r0 = 43
            boolean r0 = r5.match(r0)
            if (r0 == 0) goto L10
            double r0 = r5.parseFactor()
            return r0
        L10:
            r0 = 45
            boolean r0 = r5.match(r0)
            if (r0 == 0) goto L1e
            double r0 = r5.parseFactor()
            double r0 = -r0
            return r0
        L1e:
            r0 = 40
            boolean r0 = r5.match(r0)
            if (r0 == 0) goto L3b
            double r0 = r5.parseExpression()
            r2 = 41
            boolean r2 = r5.match(r2)
            if (r2 == 0) goto L33
            return r0
        L33:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Missing )"
            r0.<init>(r1)
            throw r0
        L3b:
            int r0 = r5.position
            r1 = 0
        L3e:
            int r2 = r5.position
            java.lang.String r3 = r5.text
            int r3 = r3.length()
            if (r2 >= r3) goto L6c
            java.lang.String r2 = r5.text
            int r3 = r5.position
            char r2 = r2.charAt(r3)
            r3 = 48
            r4 = 1
            if (r2 < r3) goto L5f
            r3 = 57
            if (r2 > r3) goto L5f
            int r2 = r5.position
            int r2 = r2 + r4
            r5.position = r2
            goto L3e
        L5f:
            r3 = 46
            if (r2 != r3) goto L6c
            if (r1 != 0) goto L6c
            int r1 = r5.position
            int r1 = r1 + r4
            r5.position = r1
            r1 = r4
            goto L3e
        L6c:
            int r1 = r5.position
            if (r0 == r1) goto L7b
            java.lang.String r2 = r5.text
            java.lang.String r0 = r2.substring(r0, r1)
            double r0 = java.lang.Double.parseDouble(r0)
            return r0
        L7b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected number at "
            r1.<init>(r2)
            int r2 = r5.position
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " in "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r5.text
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private double parseTerm() {
            r4 = this;
            double r0 = r4.parseFactor()
        L4:
            r4.skipSpaces()
            r2 = 42
            boolean r2 = r4.match(r2)
            if (r2 == 0) goto L15
            double r2 = r4.parseFactor()
            double r0 = r0 * r2
            goto L4
        L15:
            r2 = 47
            boolean r2 = r4.match(r2)
            if (r2 == 0) goto L23
            double r2 = r4.parseFactor()
            double r0 = r0 / r2
            goto L4
        L23:
            return r0
    }

    private static java.lang.String replaceUnitFunction(java.lang.String r1, java.util.regex.Pattern r2, float r3) {
            java.util.regex.Matcher r1 = r2.matcher(r1)
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
        L9:
            boolean r0 = r1.find()
            if (r0 == 0) goto L25
            r0 = 1
            java.lang.String r0 = r1.group(r0)
            float r0 = java.lang.Float.parseFloat(r0)
            float r0 = r0 * r3
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = java.util.regex.Matcher.quoteReplacement(r0)
            r1.appendReplacement(r2, r0)
            goto L9
        L25:
            r1.appendTail(r2)
            java.lang.String r1 = r2.toString()
            return r1
    }

    static float resolve(java.lang.String r9, float r10, int r11, int r12, float r13, float r14) {
            r7 = 1120403456(0x42c80000, float:100.0)
            r8 = 1065353216(0x3f800000, float:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            float r9 = resolve(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    static float resolve(java.lang.String r9, float r10, int r11, int r12, float r13, float r14, float r15, float r16) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r15
            float r0 = resolve(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    static float resolve(java.lang.String r5, float r6, int r7, int r8, float r9, float r10, float r11, float r12, float r13) {
            java.lang.String r0 = "Unexpected token at "
            if (r5 == 0) goto Lf0
            java.lang.String r1 = r5.trim()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L10
            goto Lf0
        L10:
            r1 = 0
            int r2 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r2 <= 0) goto L16
            goto L18
        L16:
            r11 = 1065353216(0x3f800000, float:1.0)
        L18:
            int r2 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r2 <= 0) goto L1d
            goto L1e
        L1d:
            r13 = r11
        L1e:
            int r2 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r2 <= 0) goto L23
            goto L25
        L23:
            r12 = 1120403456(0x42c80000, float:100.0)
        L25:
            r2 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 * r11
            java.lang.String r5 = r5.trim()
            java.lang.String r3 = "${screen_width}"
            java.lang.String r4 = java.lang.String.valueOf(r7)
            java.lang.String r5 = r5.replace(r3, r4)
            java.lang.String r3 = "${screen_height}"
            java.lang.String r4 = java.lang.String.valueOf(r8)
            java.lang.String r5 = r5.replace(r3, r4)
            java.lang.String r3 = "${width}"
            java.lang.String r4 = java.lang.String.valueOf(r9)
            java.lang.String r5 = r5.replace(r3, r4)
            java.lang.String r3 = "${height}"
            java.lang.String r4 = java.lang.String.valueOf(r10)
            java.lang.String r5 = r5.replace(r3, r4)
            java.lang.String r3 = "${preferred_scale}"
            java.lang.String r4 = java.lang.String.valueOf(r12)
            java.lang.String r5 = r5.replace(r3, r4)
            java.lang.String r3 = "${scale}"
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r5 = r5.replace(r3, r12)
            java.lang.String r12 = "${density}"
            java.lang.String r3 = java.lang.String.valueOf(r11)
            java.lang.String r5 = r5.replace(r12, r3)
            java.lang.String r12 = "${pixel_scale}"
            java.lang.String r3 = java.lang.String.valueOf(r13)
            java.lang.String r5 = r5.replace(r12, r3)
            java.lang.String r12 = "${margin}"
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r5 = r5.replace(r12, r2)
            float r7 = (float) r7
            float r7 = r7 - r9
            float r7 = java.lang.Math.max(r1, r7)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r9 = "${right}"
            java.lang.String r5 = r5.replace(r9, r7)
            float r7 = (float) r8
            float r7 = r7 - r10
            float r7 = java.lang.Math.max(r1, r7)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r8 = "${bottom}"
            java.lang.String r5 = r5.replace(r8, r7)
            java.util.regex.Pattern r7 = ca.dnamobile.javalauncher.controls.ExpressionResolver.PX_FUNCTION
            java.lang.String r5 = replaceUnitFunction(r5, r7, r13)
            java.util.regex.Pattern r7 = ca.dnamobile.javalauncher.controls.ExpressionResolver.DP_FUNCTION
            java.lang.String r5 = replaceUnitFunction(r5, r7, r11)
            ca.dnamobile.javalauncher.controls.ExpressionResolver r7 = new ca.dnamobile.javalauncher.controls.ExpressionResolver     // Catch: java.lang.Throwable -> Leb
            r7.<init>(r5)     // Catch: java.lang.Throwable -> Leb
            double r8 = r7.parseExpression()     // Catch: java.lang.Throwable -> Leb
            r7.skipSpaces()     // Catch: java.lang.Throwable -> Leb
            int r10 = r7.position     // Catch: java.lang.Throwable -> Leb
            int r11 = r5.length()     // Catch: java.lang.Throwable -> Leb
            if (r10 != r11) goto Ld6
            boolean r7 = java.lang.Double.isNaN(r8)     // Catch: java.lang.Throwable -> Leb
            if (r7 != 0) goto Ld5
            boolean r5 = java.lang.Double.isInfinite(r8)     // Catch: java.lang.Throwable -> Leb
            if (r5 == 0) goto Ld3
            goto Ld5
        Ld3:
            float r5 = (float) r8     // Catch: java.lang.Throwable -> Leb
            return r5
        Ld5:
            return r6
        Ld6:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Leb
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Leb
            r9.<init>(r0)     // Catch: java.lang.Throwable -> Leb
            int r7 = r7.position     // Catch: java.lang.Throwable -> Leb
            java.lang.StringBuilder r7 = r9.append(r7)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Leb
            r8.<init>(r7)     // Catch: java.lang.Throwable -> Leb
            throw r8     // Catch: java.lang.Throwable -> Leb
        Leb:
            float r5 = java.lang.Float.parseFloat(r5)     // Catch: java.lang.Throwable -> Lf0
            return r5
        Lf0:
            return r6
    }

    private void skipSpaces() {
            r2 = this;
        L0:
            int r0 = r2.position
            java.lang.String r1 = r2.text
            int r1 = r1.length()
            if (r0 >= r1) goto L1f
            java.lang.String r0 = r2.text
            int r1 = r2.position
            char r0 = r0.charAt(r1)
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 == 0) goto L1f
            int r0 = r2.position
            int r0 = r0 + 1
            r2.position = r0
            goto L0
        L1f:
            return
    }
}
