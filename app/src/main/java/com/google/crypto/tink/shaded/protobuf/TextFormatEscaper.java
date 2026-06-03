package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
final class TextFormatEscaper {



    private interface ByteSequence {
        byte byteAt(int r1);

        int size();
    }

    private TextFormatEscaper() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.lang.String escapeBytes(com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            com.google.crypto.tink.shaded.protobuf.TextFormatEscaper$1 r0 = new com.google.crypto.tink.shaded.protobuf.TextFormatEscaper$1
            r0.<init>(r1)
            java.lang.String r1 = escapeBytes(r0)
            return r1
    }

    static java.lang.String escapeBytes(com.google.crypto.tink.shaded.protobuf.TextFormatEscaper.ByteSequence r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r5.size()
            r0.<init>(r1)
            r1 = 0
        La:
            int r2 = r5.size()
            if (r1 >= r2) goto L8f
            byte r2 = r5.byteAt(r1)
            r3 = 34
            if (r2 == r3) goto L86
            r3 = 39
            if (r2 == r3) goto L80
            r3 = 92
            if (r2 == r3) goto L7a
            switch(r2) {
                case 7: goto L74;
                case 8: goto L6e;
                case 9: goto L68;
                case 10: goto L62;
                case 11: goto L5c;
                case 12: goto L56;
                case 13: goto L50;
                default: goto L23;
            }
        L23:
            r4 = 32
            if (r2 < r4) goto L30
            r4 = 126(0x7e, float:1.77E-43)
            if (r2 > r4) goto L30
            char r2 = (char) r2
            r0.append(r2)
            goto L8b
        L30:
            r0.append(r3)
            int r3 = r2 >>> 6
            r3 = r3 & 3
            int r3 = r3 + 48
            char r3 = (char) r3
            r0.append(r3)
            int r3 = r2 >>> 3
            r3 = r3 & 7
            int r3 = r3 + 48
            char r3 = (char) r3
            r0.append(r3)
            r2 = r2 & 7
            int r2 = r2 + 48
            char r2 = (char) r2
            r0.append(r2)
            goto L8b
        L50:
            java.lang.String r2 = "\\r"
            r0.append(r2)
            goto L8b
        L56:
            java.lang.String r2 = "\\f"
            r0.append(r2)
            goto L8b
        L5c:
            java.lang.String r2 = "\\v"
            r0.append(r2)
            goto L8b
        L62:
            java.lang.String r2 = "\\n"
            r0.append(r2)
            goto L8b
        L68:
            java.lang.String r2 = "\\t"
            r0.append(r2)
            goto L8b
        L6e:
            java.lang.String r2 = "\\b"
            r0.append(r2)
            goto L8b
        L74:
            java.lang.String r2 = "\\a"
            r0.append(r2)
            goto L8b
        L7a:
            java.lang.String r2 = "\\\\"
            r0.append(r2)
            goto L8b
        L80:
            java.lang.String r2 = "\\'"
            r0.append(r2)
            goto L8b
        L86:
            java.lang.String r2 = "\\\""
            r0.append(r2)
        L8b:
            int r1 = r1 + 1
            goto La
        L8f:
            java.lang.String r5 = r0.toString()
            return r5
    }

    static java.lang.String escapeBytes(byte[] r1) {
            com.google.crypto.tink.shaded.protobuf.TextFormatEscaper$2 r0 = new com.google.crypto.tink.shaded.protobuf.TextFormatEscaper$2
            r0.<init>(r1)
            java.lang.String r1 = escapeBytes(r0)
            return r1
    }

    static java.lang.String escapeDoubleQuotesAndBackslashes(java.lang.String r2) {
            java.lang.String r0 = "\\"
            java.lang.String r1 = "\\\\"
            java.lang.String r2 = r2.replace(r0, r1)
            java.lang.String r0 = "\""
            java.lang.String r1 = "\\\""
            java.lang.String r2 = r2.replace(r0, r1)
            return r2
    }

    static java.lang.String escapeText(java.lang.String r0) {
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFromUtf8(r0)
            java.lang.String r0 = escapeBytes(r0)
            return r0
    }
}
