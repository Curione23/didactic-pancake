package org.apache.commons.io;

/* JADX INFO: loaded from: classes2.dex */
public enum StandardLineSeparator extends java.lang.Enum<org.apache.commons.io.StandardLineSeparator> {
    private static final /* synthetic */ org.apache.commons.io.StandardLineSeparator[] $VALUES = null;
    public static final org.apache.commons.io.StandardLineSeparator CR = null;
    public static final org.apache.commons.io.StandardLineSeparator CRLF = null;
    public static final org.apache.commons.io.StandardLineSeparator LF = null;
    private final java.lang.String lineSeparator;

    private static /* synthetic */ org.apache.commons.io.StandardLineSeparator[] $values() {
            org.apache.commons.io.StandardLineSeparator r0 = org.apache.commons.io.StandardLineSeparator.CR
            org.apache.commons.io.StandardLineSeparator r1 = org.apache.commons.io.StandardLineSeparator.CRLF
            org.apache.commons.io.StandardLineSeparator r2 = org.apache.commons.io.StandardLineSeparator.LF
            org.apache.commons.io.StandardLineSeparator[] r0 = new org.apache.commons.io.StandardLineSeparator[]{r0, r1, r2}
            return r0
    }

    static {
            org.apache.commons.io.StandardLineSeparator r0 = new org.apache.commons.io.StandardLineSeparator
            r1 = 0
            java.lang.String r2 = "\r"
            java.lang.String r3 = "CR"
            r0.<init>(r3, r1, r2)
            org.apache.commons.io.StandardLineSeparator.CR = r0
            org.apache.commons.io.StandardLineSeparator r0 = new org.apache.commons.io.StandardLineSeparator
            r1 = 1
            java.lang.String r2 = "\r\n"
            java.lang.String r3 = "CRLF"
            r0.<init>(r3, r1, r2)
            org.apache.commons.io.StandardLineSeparator.CRLF = r0
            org.apache.commons.io.StandardLineSeparator r0 = new org.apache.commons.io.StandardLineSeparator
            r1 = 2
            java.lang.String r2 = "\n"
            java.lang.String r3 = "LF"
            r0.<init>(r3, r1, r2)
            org.apache.commons.io.StandardLineSeparator.LF = r0
            org.apache.commons.io.StandardLineSeparator[] r0 = $values()
            org.apache.commons.io.StandardLineSeparator.$VALUES = r0
            return
    }

    StandardLineSeparator(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            java.lang.String r1 = "lineSeparator"
            java.lang.Object r1 = java.util.Objects.requireNonNull(r3, r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.lineSeparator = r1
            return
    }

    public static org.apache.commons.io.StandardLineSeparator valueOf(java.lang.String r1) {
            java.lang.Class<org.apache.commons.io.StandardLineSeparator> r0 = org.apache.commons.io.StandardLineSeparator.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            org.apache.commons.io.StandardLineSeparator r1 = (org.apache.commons.io.StandardLineSeparator) r1
            return r1
    }

    public static org.apache.commons.io.StandardLineSeparator[] values() {
            org.apache.commons.io.StandardLineSeparator[] r0 = org.apache.commons.io.StandardLineSeparator.$VALUES
            java.lang.Object r0 = r0.clone()
            org.apache.commons.io.StandardLineSeparator[] r0 = (org.apache.commons.io.StandardLineSeparator[]) r0
            return r0
    }

    public byte[] getBytes(java.nio.charset.Charset r2) {
            r1 = this;
            java.lang.String r0 = r1.lineSeparator
            byte[] r2 = r0.getBytes(r2)
            return r2
    }

    public java.lang.String getString() {
            r1 = this;
            java.lang.String r0 = r1.lineSeparator
            return r0
    }
}
