package javassist.compiler;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/compiler/Lex.class */
public class Lex implements javassist.compiler.TokenId {
    private int lastChar;
    private java.lang.StringBuilder textBuffer;
    private javassist.compiler.Token currentToken;
    private javassist.compiler.Token lookAheadTokens;
    private java.lang.String input;
    private int position;
    private int maxlen;
    private int lineNumber;
    private static final int[] equalOps = null;
    private static final javassist.compiler.KeywordTable ktable = null;

    public Lex(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = -1
            r0.lastChar = r1
            r0 = r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            r0.textBuffer = r1
            r0 = r4
            javassist.compiler.Token r1 = new javassist.compiler.Token
            r2 = r1
            r2.<init>()
            r0.currentToken = r1
            r0 = r4
            r1 = 0
            r0.lookAheadTokens = r1
            r0 = r4
            r1 = r5
            r0.input = r1
            r0 = r4
            r1 = 0
            r0.position = r1
            r0 = r4
            r1 = r5
            int r1 = r1.length()
            r0.maxlen = r1
            r0 = r4
            r1 = 0
            r0.lineNumber = r1
            return
    }

    public int get() {
            r4 = this;
            r0 = r4
            javassist.compiler.Token r0 = r0.lookAheadTokens
            if (r0 != 0) goto L10
            r0 = r4
            r1 = r4
            javassist.compiler.Token r1 = r1.currentToken
            int r0 = r0.get(r1)
            return r0
        L10:
            r0 = r4
            r1 = r4
            javassist.compiler.Token r1 = r1.lookAheadTokens
            r2 = r1
            r5 = r2
            r0.currentToken = r1
            r0 = r4
            r1 = r4
            javassist.compiler.Token r1 = r1.lookAheadTokens
            javassist.compiler.Token r1 = r1.next
            r0.lookAheadTokens = r1
            r0 = r5
            int r0 = r0.tokenId
            return r0
    }

    public int lookAhead() {
            r3 = this;
            r0 = r3
            r1 = 0
            int r0 = r0.lookAhead(r1)
            return r0
    }

    public int lookAhead(int r5) {
            r4 = this;
            r0 = r4
            javassist.compiler.Token r0 = r0.lookAheadTokens
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L1e
            r0 = r4
            r1 = r4
            javassist.compiler.Token r1 = r1.currentToken
            r2 = r1
            r6 = r2
            r0.lookAheadTokens = r1
            r0 = r6
            r1 = 0
            r0.next = r1
            r0 = r4
            r1 = r6
            int r0 = r0.get(r1)
        L1e:
            r0 = r5
            int r5 = r5 + (-1)
            if (r0 <= 0) goto L47
            r0 = r6
            javassist.compiler.Token r0 = r0.next
            if (r0 != 0) goto L3f
            r0 = r6
            javassist.compiler.Token r1 = new javassist.compiler.Token
            r2 = r1
            r2.<init>()
            r2 = r1
            r7 = r2
            r0.next = r1
            r0 = r4
            r1 = r7
            int r0 = r0.get(r1)
        L3f:
            r0 = r6
            javassist.compiler.Token r0 = r0.next
            r6 = r0
            goto L1e
        L47:
            r0 = r4
            r1 = r6
            r0.currentToken = r1
            r0 = r6
            int r0 = r0.tokenId
            return r0
    }

    public java.lang.String getString() {
            r2 = this;
            r0 = r2
            javassist.compiler.Token r0 = r0.currentToken
            java.lang.String r0 = r0.textValue
            return r0
    }

    public long getLong() {
            r3 = this;
            r0 = r3
            javassist.compiler.Token r0 = r0.currentToken
            long r0 = r0.longValue
            return r0
    }

    public double getDouble() {
            r3 = this;
            r0 = r3
            javassist.compiler.Token r0 = r0.currentToken
            double r0 = r0.doubleValue
            return r0
    }

    private int get(javassist.compiler.Token r4) {
            r3 = this;
        L0:
            r0 = r3
            r1 = r4
            int r0 = r0.readLine(r1)
            r5 = r0
            r0 = r5
            r1 = 10
            if (r0 == r1) goto L0
            r0 = r4
            r1 = r5
            r0.tokenId = r1
            r0 = r5
            return r0
    }

    private int readLine(javassist.compiler.Token r6) {
            r5 = this;
            r0 = r5
            int r0 = r0.getNextNonWhiteChar()
            r7 = r0
            r0 = r7
            if (r0 >= 0) goto Lb
            r0 = r7
            return r0
        Lb:
            r0 = r7
            r1 = 10
            if (r0 != r1) goto L1e
            r0 = r5
            r1 = r0
            int r1 = r1.lineNumber
            r2 = 1
            int r1 = r1 + r2
            r0.lineNumber = r1
            r0 = 10
            return r0
        L1e:
            r0 = r7
            r1 = 39
            if (r0 != r1) goto L2a
            r0 = r5
            r1 = r6
            int r0 = r0.readCharConst(r1)
            return r0
        L2a:
            r0 = r7
            r1 = 34
            if (r0 != r1) goto L36
            r0 = r5
            r1 = r6
            int r0 = r0.readStringL(r1)
            return r0
        L36:
            r0 = 48
            r1 = r7
            if (r0 > r1) goto L49
            r0 = r7
            r1 = 57
            if (r0 > r1) goto L49
            r0 = r5
            r1 = r7
            r2 = r6
            int r0 = r0.readNumber(r1, r2)
            return r0
        L49:
            r0 = r7
            r1 = 46
            if (r0 != r1) goto L85
            r0 = r5
            int r0 = r0.getc()
            r7 = r0
            r0 = 48
            r1 = r7
            if (r0 > r1) goto L79
            r0 = r7
            r1 = 57
            if (r0 > r1) goto L79
            r0 = r5
            java.lang.StringBuilder r0 = r0.textBuffer
            r8 = r0
            r0 = r8
            r1 = 0
            r0.setLength(r1)
            r0 = r8
            r1 = 46
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = r8
            r2 = r7
            r3 = r6
            int r0 = r0.readDouble(r1, r2, r3)
            return r0
        L79:
            r0 = r5
            r1 = r7
            r0.ungetc(r1)
            r0 = r5
            r1 = 46
            int r0 = r0.readSeparator(r1)
            return r0
        L85:
            r0 = r7
            char r0 = (char) r0
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r0)
            if (r0 == 0) goto L94
            r0 = r5
            r1 = r7
            r2 = r6
            int r0 = r0.readIdentifier(r1, r2)
            return r0
        L94:
            r0 = r5
            r1 = r7
            int r0 = r0.readSeparator(r1)
            return r0
    }

    private int getNextNonWhiteChar() {
            r3 = this;
        L0:
            r0 = r3
            int r0 = r0.getc()
            r4 = r0
            r0 = r4
            r1 = 47
            if (r0 != r1) goto L69
            r0 = r3
            int r0 = r0.getc()
            r4 = r0
            r0 = r4
            r1 = 47
            if (r0 != r1) goto L2f
        L16:
            r0 = r3
            int r0 = r0.getc()
            r4 = r0
            r0 = r4
            r1 = 10
            if (r0 == r1) goto L69
            r0 = r4
            r1 = 13
            if (r0 == r1) goto L69
            r0 = r4
            r1 = -1
            if (r0 != r1) goto L16
            goto L69
        L2f:
            r0 = r4
            r1 = 42
            if (r0 != r1) goto L61
        L35:
            r0 = r3
            int r0 = r0.getc()
            r4 = r0
            r0 = r4
            r1 = -1
            if (r0 != r1) goto L42
            goto L69
        L42:
            r0 = r4
            r1 = 42
            if (r0 != r1) goto L35
            r0 = r3
            int r0 = r0.getc()
            r1 = r0
            r4 = r1
            r1 = 47
            if (r0 != r1) goto L59
            r0 = 32
            r4 = r0
            goto L69
        L59:
            r0 = r3
            r1 = r4
            r0.ungetc(r1)
            goto L35
        L61:
            r0 = r3
            r1 = r4
            r0.ungetc(r1)
            r0 = 47
            r4 = r0
        L69:
            r0 = r4
            boolean r0 = isBlank(r0)
            if (r0 != 0) goto L0
            r0 = r4
            return r0
    }

    private int readCharConst(javassist.compiler.Token r5) {
            r4 = this;
            r0 = 0
            r7 = r0
        L2:
            r0 = r4
            int r0 = r0.getc()
            r1 = r0
            r6 = r1
            r1 = 39
            if (r0 == r1) goto L3a
            r0 = r6
            r1 = 92
            if (r0 != r1) goto L1b
            r0 = r4
            int r0 = r0.readEscapeChar()
            r7 = r0
            goto L2
        L1b:
            r0 = r6
            r1 = 32
            if (r0 >= r1) goto L35
            r0 = r6
            r1 = 10
            if (r0 != r1) goto L31
            r0 = r4
            r1 = r0
            int r1 = r1.lineNumber
            r2 = 1
            int r1 = r1 + r2
            r0.lineNumber = r1
        L31:
            r0 = 500(0x1f4, float:7.0E-43)
            return r0
        L35:
            r0 = r6
            r7 = r0
            goto L2
        L3a:
            r0 = r5
            r1 = r7
            long r1 = (long) r1
            r0.longValue = r1
            r0 = 401(0x191, float:5.62E-43)
            return r0
    }

    private int readEscapeChar() {
            r4 = this;
            r0 = r4
            int r0 = r0.getc()
            r5 = r0
            r0 = r5
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 != r1) goto L11
            r0 = 10
            r5 = r0
            goto L45
        L11:
            r0 = r5
            r1 = 116(0x74, float:1.63E-43)
            if (r0 != r1) goto L1d
            r0 = 9
            r5 = r0
            goto L45
        L1d:
            r0 = r5
            r1 = 114(0x72, float:1.6E-43)
            if (r0 != r1) goto L29
            r0 = 13
            r5 = r0
            goto L45
        L29:
            r0 = r5
            r1 = 102(0x66, float:1.43E-43)
            if (r0 != r1) goto L35
            r0 = 12
            r5 = r0
            goto L45
        L35:
            r0 = r5
            r1 = 10
            if (r0 != r1) goto L45
            r0 = r4
            r1 = r0
            int r1 = r1.lineNumber
            r2 = 1
            int r1 = r1 + r2
            r0.lineNumber = r1
        L45:
            r0 = r5
            return r0
    }

    private int readStringL(javassist.compiler.Token r5) {
            r4 = this;
            r0 = r4
            java.lang.StringBuilder r0 = r0.textBuffer
            r7 = r0
            r0 = r7
            r1 = 0
            r0.setLength(r1)
        La:
            r0 = r4
            int r0 = r0.getc()
            r1 = r0
            r6 = r1
            r1 = 34
            if (r0 == r1) goto L45
            r0 = r6
            r1 = 92
            if (r0 != r1) goto L23
            r0 = r4
            int r0 = r0.readEscapeChar()
            r6 = r0
            goto L3b
        L23:
            r0 = r6
            r1 = 10
            if (r0 == r1) goto L2d
            r0 = r6
            if (r0 >= 0) goto L3b
        L2d:
            r0 = r4
            r1 = r0
            int r1 = r1.lineNumber
            r2 = 1
            int r1 = r1 + r2
            r0.lineNumber = r1
            r0 = 500(0x1f4, float:7.0E-43)
            return r0
        L3b:
            r0 = r7
            r1 = r6
            char r1 = (char) r1
            java.lang.StringBuilder r0 = r0.append(r1)
            goto La
        L45:
            r0 = r4
            int r0 = r0.getc()
            r6 = r0
            r0 = r6
            r1 = 10
            if (r0 != r1) goto L5d
            r0 = r4
            r1 = r0
            int r1 = r1.lineNumber
            r2 = 1
            int r1 = r1 + r2
            r0.lineNumber = r1
            goto L45
        L5d:
            r0 = r6
            boolean r0 = isBlank(r0)
            if (r0 != 0) goto L45
            goto L67
        L67:
            r0 = r6
            r1 = 34
            if (r0 == r1) goto La
            r0 = r4
            r1 = r6
            r0.ungetc(r1)
            goto L75
        L75:
            r0 = r5
            r1 = r7
            java.lang.String r1 = r1.toString()
            r0.textValue = r1
            r0 = 406(0x196, float:5.69E-43)
            return r0
    }

    private int readNumber(int r6, javassist.compiler.Token r7) {
            r5 = this;
            r0 = 0
            r8 = r0
            r0 = r5
            int r0 = r0.getc()
            r10 = r0
            r0 = r6
            r1 = 48
            if (r0 != r1) goto Le9
            r0 = r10
            r1 = 88
            if (r0 == r1) goto L1c
            r0 = r10
            r1 = 120(0x78, float:1.68E-43)
            if (r0 != r1) goto L96
        L1c:
            r0 = r5
            int r0 = r0.getc()
            r6 = r0
            r0 = 48
            r1 = r6
            if (r0 > r1) goto L3c
            r0 = r6
            r1 = 57
            if (r0 > r1) goto L3c
            r0 = r8
            r1 = 16
            long r0 = r0 * r1
            r1 = r6
            r2 = 48
            int r1 = r1 - r2
            long r1 = (long) r1
            long r0 = r0 + r1
            r8 = r0
            goto L1c
        L3c:
            r0 = 65
            r1 = r6
            if (r0 > r1) goto L5a
            r0 = r6
            r1 = 70
            if (r0 > r1) goto L5a
            r0 = r8
            r1 = 16
            long r0 = r0 * r1
            r1 = r6
            r2 = 65
            int r1 = r1 - r2
            r2 = 10
            int r1 = r1 + r2
            long r1 = (long) r1
            long r0 = r0 + r1
            r8 = r0
            goto L1c
        L5a:
            r0 = 97
            r1 = r6
            if (r0 > r1) goto L78
            r0 = r6
            r1 = 102(0x66, float:1.43E-43)
            if (r0 > r1) goto L78
            r0 = r8
            r1 = 16
            long r0 = r0 * r1
            r1 = r6
            r2 = 97
            int r1 = r1 - r2
            r2 = 10
            int r1 = r1 + r2
            long r1 = (long) r1
            long r0 = r0 + r1
            r8 = r0
            goto L1c
        L78:
            r0 = r7
            r1 = r8
            r0.longValue = r1
            r0 = r6
            r1 = 76
            if (r0 == r1) goto L89
            r0 = r6
            r1 = 108(0x6c, float:1.51E-43)
            if (r0 != r1) goto L8d
        L89:
            r0 = 403(0x193, float:5.65E-43)
            return r0
        L8d:
            r0 = r5
            r1 = r6
            r0.ungetc(r1)
            r0 = 402(0x192, float:5.63E-43)
            return r0
        L96:
            r0 = 48
            r1 = r10
            if (r0 > r1) goto Le9
            r0 = r10
            r1 = 55
            if (r0 > r1) goto Le9
            r0 = r10
            r1 = 48
            int r0 = r0 - r1
            long r0 = (long) r0
            r8 = r0
        Lab:
            r0 = r5
            int r0 = r0.getc()
            r6 = r0
            r0 = 48
            r1 = r6
            if (r0 > r1) goto Lcb
            r0 = r6
            r1 = 55
            if (r0 > r1) goto Lcb
            r0 = r8
            r1 = 8
            long r0 = r0 * r1
            r1 = r6
            r2 = 48
            int r1 = r1 - r2
            long r1 = (long) r1
            long r0 = r0 + r1
            r8 = r0
            goto Lab
        Lcb:
            r0 = r7
            r1 = r8
            r0.longValue = r1
            r0 = r6
            r1 = 76
            if (r0 == r1) goto Ldc
            r0 = r6
            r1 = 108(0x6c, float:1.51E-43)
            if (r0 != r1) goto Le0
        Ldc:
            r0 = 403(0x193, float:5.65E-43)
            return r0
        Le0:
            r0 = r5
            r1 = r6
            r0.ungetc(r1)
            r0 = 402(0x192, float:5.63E-43)
            return r0
        Le9:
            r0 = r6
            r1 = 48
            int r0 = r0 - r1
            long r0 = (long) r0
            r8 = r0
        Lef:
            r0 = 48
            r1 = r10
            if (r0 > r1) goto L114
            r0 = r10
            r1 = 57
            if (r0 > r1) goto L114
            r0 = r8
            r1 = 10
            long r0 = r0 * r1
            r1 = r10
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 48
            long r0 = r0 - r1
            r8 = r0
            r0 = r5
            int r0 = r0.getc()
            r10 = r0
            goto Lef
        L114:
            r0 = r7
            r1 = r8
            r0.longValue = r1
            r0 = r10
            r1 = 70
            if (r0 == r1) goto L127
            r0 = r10
            r1 = 102(0x66, float:1.43E-43)
            if (r0 != r1) goto L131
        L127:
            r0 = r7
            r1 = r8
            double r1 = (double) r1
            r0.doubleValue = r1
            r0 = 404(0x194, float:5.66E-43)
            return r0
        L131:
            r0 = r10
            r1 = 69
            if (r0 == r1) goto L154
            r0 = r10
            r1 = 101(0x65, float:1.42E-43)
            if (r0 == r1) goto L154
            r0 = r10
            r1 = 68
            if (r0 == r1) goto L154
            r0 = r10
            r1 = 100
            if (r0 == r1) goto L154
            r0 = r10
            r1 = 46
            if (r0 != r1) goto L171
        L154:
            r0 = r5
            java.lang.StringBuilder r0 = r0.textBuffer
            r11 = r0
            r0 = r11
            r1 = 0
            r0.setLength(r1)
            r0 = r11
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = r11
            r2 = r10
            r3 = r7
            int r0 = r0.readDouble(r1, r2, r3)
            return r0
        L171:
            r0 = r10
            r1 = 76
            if (r0 == r1) goto L17f
            r0 = r10
            r1 = 108(0x6c, float:1.51E-43)
            if (r0 != r1) goto L183
        L17f:
            r0 = 403(0x193, float:5.65E-43)
            return r0
        L183:
            r0 = r5
            r1 = r10
            r0.ungetc(r1)
            r0 = 402(0x192, float:5.63E-43)
            return r0
    }

    private int readDouble(java.lang.StringBuilder r5, int r6, javassist.compiler.Token r7) {
            r4 = this;
            r0 = r6
            r1 = 69
            if (r0 == r1) goto L3a
            r0 = r6
            r1 = 101(0x65, float:1.42E-43)
            if (r0 == r1) goto L3a
            r0 = r6
            r1 = 68
            if (r0 == r1) goto L3a
            r0 = r6
            r1 = 100
            if (r0 == r1) goto L3a
            r0 = r5
            r1 = r6
            char r1 = (char) r1
            java.lang.StringBuilder r0 = r0.append(r1)
        L1f:
            r0 = r4
            int r0 = r0.getc()
            r6 = r0
            r0 = 48
            r1 = r6
            if (r0 > r1) goto L3a
            r0 = r6
            r1 = 57
            if (r0 > r1) goto L3a
            r0 = r5
            r1 = r6
            char r1 = (char) r1
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L1f
        L3a:
            r0 = r6
            r1 = 69
            if (r0 == r1) goto L46
            r0 = r6
            r1 = 101(0x65, float:1.42E-43)
            if (r0 != r1) goto L85
        L46:
            r0 = r5
            r1 = r6
            char r1 = (char) r1
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            int r0 = r0.getc()
            r6 = r0
            r0 = r6
            r1 = 43
            if (r0 == r1) goto L5e
            r0 = r6
            r1 = 45
            if (r0 != r1) goto L6a
        L5e:
            r0 = r5
            r1 = r6
            char r1 = (char) r1
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            int r0 = r0.getc()
            r6 = r0
        L6a:
            r0 = 48
            r1 = r6
            if (r0 > r1) goto L85
            r0 = r6
            r1 = 57
            if (r0 > r1) goto L85
            r0 = r5
            r1 = r6
            char r1 = (char) r1
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            int r0 = r0.getc()
            r6 = r0
            goto L6a
        L85:
            r0 = r7
            r1 = r5
            java.lang.String r1 = r1.toString()     // Catch: java.lang.NumberFormatException -> L93
            double r1 = java.lang.Double.parseDouble(r1)     // Catch: java.lang.NumberFormatException -> L93
            r0.doubleValue = r1     // Catch: java.lang.NumberFormatException -> L93
            goto L99
        L93:
            r8 = move-exception
            r0 = 500(0x1f4, float:7.0E-43)
            return r0
        L99:
            r0 = r6
            r1 = 70
            if (r0 == r1) goto La5
            r0 = r6
            r1 = 102(0x66, float:1.43E-43)
            if (r0 != r1) goto La9
        La5:
            r0 = 404(0x194, float:5.66E-43)
            return r0
        La9:
            r0 = r6
            r1 = 68
            if (r0 == r1) goto Lba
            r0 = r6
            r1 = 100
            if (r0 == r1) goto Lba
            r0 = r4
            r1 = r6
            r0.ungetc(r1)
        Lba:
            r0 = 405(0x195, float:5.68E-43)
            return r0
    }

    private int readSeparator(int r5) {
            r4 = this;
            r0 = 33
            r1 = r5
            if (r0 > r1) goto Ld1
            r0 = r5
            r1 = 63
            if (r0 > r1) goto Ld1
            int[] r0 = javassist.compiler.Lex.equalOps
            r1 = r5
            r2 = 33
            int r1 = r1 - r2
            r0 = r0[r1]
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L1d
            r0 = r5
            return r0
        L1d:
            r0 = r4
            int r0 = r0.getc()
            r6 = r0
            r0 = r5
            r1 = r6
            if (r0 != r1) goto Lc5
            r0 = r5
            switch(r0) {
                case 38: goto L70;
                case 43: goto L68;
                case 45: goto L6c;
                case 60: goto L74;
                case 61: goto L64;
                case 62: goto L8c;
                default: goto Lc2;
            }
        L64:
            r0 = 358(0x166, float:5.02E-43)
            return r0
        L68:
            r0 = 362(0x16a, float:5.07E-43)
            return r0
        L6c:
            r0 = 363(0x16b, float:5.09E-43)
            return r0
        L70:
            r0 = 369(0x171, float:5.17E-43)
            return r0
        L74:
            r0 = r4
            int r0 = r0.getc()
            r7 = r0
            r0 = r7
            r1 = 61
            if (r0 != r1) goto L83
            r0 = 365(0x16d, float:5.11E-43)
            return r0
        L83:
            r0 = r4
            r1 = r7
            r0.ungetc(r1)
            r0 = 364(0x16c, float:5.1E-43)
            return r0
        L8c:
            r0 = r4
            int r0 = r0.getc()
            r7 = r0
            r0 = r7
            r1 = 61
            if (r0 != r1) goto L9b
            r0 = 367(0x16f, float:5.14E-43)
            return r0
        L9b:
            r0 = r7
            r1 = 62
            if (r0 != r1) goto Lb9
            r0 = r4
            int r0 = r0.getc()
            r7 = r0
            r0 = r7
            r1 = 61
            if (r0 != r1) goto Lb0
            r0 = 371(0x173, float:5.2E-43)
            return r0
        Lb0:
            r0 = r4
            r1 = r7
            r0.ungetc(r1)
            r0 = 370(0x172, float:5.18E-43)
            return r0
        Lb9:
            r0 = r4
            r1 = r7
            r0.ungetc(r1)
            r0 = 366(0x16e, float:5.13E-43)
            return r0
        Lc2:
            goto Lce
        Lc5:
            r0 = r6
            r1 = 61
            if (r0 != r1) goto Lce
            r0 = r8
            return r0
        Lce:
            goto L107
        Ld1:
            r0 = r5
            r1 = 94
            if (r0 != r1) goto Le6
            r0 = r4
            int r0 = r0.getc()
            r6 = r0
            r0 = r6
            r1 = 61
            if (r0 != r1) goto L107
            r0 = 360(0x168, float:5.04E-43)
            return r0
        Le6:
            r0 = r5
            r1 = 124(0x7c, float:1.74E-43)
            if (r0 != r1) goto L105
            r0 = r4
            int r0 = r0.getc()
            r6 = r0
            r0 = r6
            r1 = 61
            if (r0 != r1) goto Lfb
            r0 = 361(0x169, float:5.06E-43)
            return r0
        Lfb:
            r0 = r6
            r1 = 124(0x7c, float:1.74E-43)
            if (r0 != r1) goto L107
            r0 = 368(0x170, float:5.16E-43)
            return r0
        L105:
            r0 = r5
            return r0
        L107:
            r0 = r4
            r1 = r6
            r0.ungetc(r1)
            r0 = r5
            return r0
    }

    private int readIdentifier(int r4, javassist.compiler.Token r5) {
            r3 = this;
            r0 = r3
            java.lang.StringBuilder r0 = r0.textBuffer
            r6 = r0
            r0 = r6
            r1 = 0
            r0.setLength(r1)
        La:
            r0 = r6
            r1 = r4
            char r1 = (char) r1
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r3
            int r0 = r0.getc()
            r4 = r0
            r0 = r4
            char r0 = (char) r0
            boolean r0 = java.lang.Character.isJavaIdentifierPart(r0)
            if (r0 != 0) goto La
            r0 = r3
            r1 = r4
            r0.ungetc(r1)
            r0 = r6
            java.lang.String r0 = r0.toString()
            r7 = r0
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            r1 = r7
            int r0 = r0.lookup(r1)
            r8 = r0
            r0 = r8
            if (r0 < 0) goto L3b
            r0 = r8
            return r0
        L3b:
            r0 = r5
            r1 = r7
            r0.textValue = r1
            r0 = 400(0x190, float:5.6E-43)
            return r0
    }

    private static boolean isBlank(int r3) {
            r0 = r3
            r1 = 32
            if (r0 == r1) goto L1e
            r0 = r3
            r1 = 9
            if (r0 == r1) goto L1e
            r0 = r3
            r1 = 12
            if (r0 == r1) goto L1e
            r0 = r3
            r1 = 13
            if (r0 == r1) goto L1e
            r0 = r3
            r1 = 10
            if (r0 != r1) goto L22
        L1e:
            r0 = 1
            goto L23
        L22:
            r0 = 0
        L23:
            return r0
    }

    private static boolean isDigit(int r3) {
            r0 = 48
            r1 = r3
            if (r0 > r1) goto L10
            r0 = r3
            r1 = 57
            if (r0 > r1) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    private void ungetc(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.lastChar = r1
            return
    }

    public java.lang.String getTextAround() {
            r4 = this;
            r0 = r4
            int r0 = r0.position
            r1 = 10
            int r0 = r0 - r1
            r5 = r0
            r0 = r5
            if (r0 >= 0) goto Le
            r0 = 0
            r5 = r0
        Le:
            r0 = r4
            int r0 = r0.position
            r1 = 10
            int r0 = r0 + r1
            r6 = r0
            r0 = r6
            r1 = r4
            int r1 = r1.maxlen
            if (r0 <= r1) goto L23
            r0 = r4
            int r0 = r0.maxlen
            r6 = r0
        L23:
            r0 = r4
            java.lang.String r0 = r0.input
            r1 = r5
            r2 = r6
            java.lang.String r0 = r0.substring(r1, r2)
            return r0
    }

    private int getc() {
            r6 = this;
            r0 = r6
            int r0 = r0.lastChar
            if (r0 >= 0) goto L27
            r0 = r6
            int r0 = r0.position
            r1 = r6
            int r1 = r1.maxlen
            if (r0 >= r1) goto L25
            r0 = r6
            java.lang.String r0 = r0.input
            r1 = r6
            r2 = r1
            int r2 = r2.position
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.position = r3
            char r0 = r0.charAt(r1)
            return r0
        L25:
            r0 = -1
            return r0
        L27:
            r0 = r6
            int r0 = r0.lastChar
            r7 = r0
            r0 = r6
            r1 = -1
            r0.lastChar = r1
            r0 = r7
            return r0
    }

    static {
            r0 = 31
            int[] r0 = new int[r0]
            r1 = r0
            r2 = 0
            r3 = 350(0x15e, float:4.9E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 351(0x15f, float:4.92E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 352(0x160, float:4.93E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 353(0x161, float:4.95E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 354(0x162, float:4.96E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 355(0x163, float:4.97E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 14
            r3 = 356(0x164, float:4.99E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 15
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 16
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 17
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 18
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 19
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 20
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 21
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 22
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 23
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 24
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 25
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 26
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 27
            r3 = 357(0x165, float:5.0E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 28
            r3 = 358(0x166, float:5.02E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 29
            r3 = 359(0x167, float:5.03E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 30
            r3 = 0
            r1[r2] = r3
            javassist.compiler.Lex.equalOps = r0
            javassist.compiler.KeywordTable r0 = new javassist.compiler.KeywordTable
            r1 = r0
            r1.<init>()
            javassist.compiler.Lex.ktable = r0
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "abstract"
            r2 = 300(0x12c, float:4.2E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "boolean"
            r2 = 301(0x12d, float:4.22E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "break"
            r2 = 302(0x12e, float:4.23E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "byte"
            r2 = 303(0x12f, float:4.25E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "case"
            r2 = 304(0x130, float:4.26E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "catch"
            r2 = 305(0x131, float:4.27E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "char"
            r2 = 306(0x132, float:4.29E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "class"
            r2 = 307(0x133, float:4.3E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "const"
            r2 = 308(0x134, float:4.32E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "continue"
            r2 = 309(0x135, float:4.33E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "default"
            r2 = 310(0x136, float:4.34E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "do"
            r2 = 311(0x137, float:4.36E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "double"
            r2 = 312(0x138, float:4.37E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "else"
            r2 = 313(0x139, float:4.39E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "extends"
            r2 = 314(0x13a, float:4.4E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "false"
            r2 = 411(0x19b, float:5.76E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "final"
            r2 = 315(0x13b, float:4.41E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "finally"
            r2 = 316(0x13c, float:4.43E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "float"
            r2 = 317(0x13d, float:4.44E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "for"
            r2 = 318(0x13e, float:4.46E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "goto"
            r2 = 319(0x13f, float:4.47E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "if"
            r2 = 320(0x140, float:4.48E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "implements"
            r2 = 321(0x141, float:4.5E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "import"
            r2 = 322(0x142, float:4.51E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "instanceof"
            r2 = 323(0x143, float:4.53E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "int"
            r2 = 324(0x144, float:4.54E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "interface"
            r2 = 325(0x145, float:4.55E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "long"
            r2 = 326(0x146, float:4.57E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "native"
            r2 = 327(0x147, float:4.58E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "new"
            r2 = 328(0x148, float:4.6E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "null"
            r2 = 412(0x19c, float:5.77E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "package"
            r2 = 329(0x149, float:4.61E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "private"
            r2 = 330(0x14a, float:4.62E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "protected"
            r2 = 331(0x14b, float:4.64E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "public"
            r2 = 332(0x14c, float:4.65E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "return"
            r2 = 333(0x14d, float:4.67E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "short"
            r2 = 334(0x14e, float:4.68E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "static"
            r2 = 335(0x14f, float:4.7E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "strictfp"
            r2 = 347(0x15b, float:4.86E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "super"
            r2 = 336(0x150, float:4.71E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "switch"
            r2 = 337(0x151, float:4.72E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "synchronized"
            r2 = 338(0x152, float:4.74E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "this"
            r2 = 339(0x153, float:4.75E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "throw"
            r2 = 340(0x154, float:4.76E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "throws"
            r2 = 341(0x155, float:4.78E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "transient"
            r2 = 342(0x156, float:4.79E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "true"
            r2 = 410(0x19a, float:5.75E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "try"
            r2 = 343(0x157, float:4.8E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "void"
            r2 = 344(0x158, float:4.82E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "volatile"
            r2 = 345(0x159, float:4.83E-43)
            r0.append(r1, r2)
            javassist.compiler.KeywordTable r0 = javassist.compiler.Lex.ktable
            java.lang.String r1 = "while"
            r2 = 346(0x15a, float:4.85E-43)
            r0.append(r1, r2)
            return
    }
}
