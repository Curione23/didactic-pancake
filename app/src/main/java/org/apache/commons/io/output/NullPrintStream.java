package org.apache.commons.io.output;

/* JADX INFO: loaded from: classes2.dex */
public class NullPrintStream extends java.io.PrintStream {
    public static final org.apache.commons.io.output.NullPrintStream INSTANCE = null;

    @java.lang.Deprecated
    public static final org.apache.commons.io.output.NullPrintStream NULL_PRINT_STREAM = null;

    static {
            org.apache.commons.io.output.NullPrintStream r0 = new org.apache.commons.io.output.NullPrintStream
            r0.<init>()
            org.apache.commons.io.output.NullPrintStream.INSTANCE = r0
            org.apache.commons.io.output.NullPrintStream.NULL_PRINT_STREAM = r0
            return
    }

    @java.lang.Deprecated
    public NullPrintStream() {
            r1 = this;
            org.apache.commons.io.output.NullOutputStream r0 = org.apache.commons.io.output.NullOutputStream.INSTANCE
            r1.<init>(r0)
            return
    }
}
