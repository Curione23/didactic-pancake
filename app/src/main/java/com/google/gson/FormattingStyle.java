package com.google.gson;

/* JADX INFO: loaded from: classes2.dex */
public class FormattingStyle {
    public static final com.google.gson.FormattingStyle COMPACT = null;
    public static final com.google.gson.FormattingStyle PRETTY = null;
    private final java.lang.String indent;
    private final java.lang.String newline;
    private final boolean spaceAfterSeparators;

    static {
            com.google.gson.FormattingStyle r0 = new com.google.gson.FormattingStyle
            java.lang.String r1 = ""
            r2 = 0
            r0.<init>(r1, r1, r2)
            com.google.gson.FormattingStyle.COMPACT = r0
            com.google.gson.FormattingStyle r0 = new com.google.gson.FormattingStyle
            java.lang.String r1 = "  "
            r2 = 1
            java.lang.String r3 = "\n"
            r0.<init>(r3, r1, r2)
            com.google.gson.FormattingStyle.PRETTY = r0
            return
    }

    private FormattingStyle(java.lang.String r2, java.lang.String r3, boolean r4) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "newline == null"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.String r0 = "indent == null"
            java.util.Objects.requireNonNull(r3, r0)
            java.lang.String r0 = "[\r\n]*"
            boolean r0 = r2.matches(r0)
            if (r0 == 0) goto L2c
            java.lang.String r0 = "[ \t]*"
            boolean r0 = r3.matches(r0)
            if (r0 == 0) goto L24
            r1.newline = r2
            r1.indent = r3
            r1.spaceAfterSeparators = r4
            return
        L24:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Only combinations of spaces and tabs are allowed in indent."
            r2.<init>(r3)
            throw r2
        L2c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Only combinations of \\n and \\r are allowed in newline."
            r2.<init>(r3)
            throw r2
    }

    public java.lang.String getIndent() {
            r1 = this;
            java.lang.String r0 = r1.indent
            return r0
    }

    public java.lang.String getNewline() {
            r1 = this;
            java.lang.String r0 = r1.newline
            return r0
    }

    public boolean usesSpaceAfterSeparators() {
            r1 = this;
            boolean r0 = r1.spaceAfterSeparators
            return r0
    }

    public com.google.gson.FormattingStyle withIndent(java.lang.String r4) {
            r3 = this;
            com.google.gson.FormattingStyle r0 = new com.google.gson.FormattingStyle
            java.lang.String r1 = r3.newline
            boolean r2 = r3.spaceAfterSeparators
            r0.<init>(r1, r4, r2)
            return r0
    }

    public com.google.gson.FormattingStyle withNewline(java.lang.String r4) {
            r3 = this;
            com.google.gson.FormattingStyle r0 = new com.google.gson.FormattingStyle
            java.lang.String r1 = r3.indent
            boolean r2 = r3.spaceAfterSeparators
            r0.<init>(r4, r1, r2)
            return r0
    }

    public com.google.gson.FormattingStyle withSpaceAfterSeparators(boolean r4) {
            r3 = this;
            com.google.gson.FormattingStyle r0 = new com.google.gson.FormattingStyle
            java.lang.String r1 = r3.newline
            java.lang.String r2 = r3.indent
            r0.<init>(r1, r2, r4)
            return r0
    }
}
