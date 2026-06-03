package org.apache.commons.io.output;

/* JADX INFO: loaded from: classes2.dex */
public class ThresholdingOutputStream extends java.io.OutputStream {
    private static final org.apache.commons.io.function.IOFunction<org.apache.commons.io.output.ThresholdingOutputStream, java.io.OutputStream> NOOP_OS_GETTER = null;
    private final org.apache.commons.io.function.IOFunction<org.apache.commons.io.output.ThresholdingOutputStream, java.io.OutputStream> outputStreamGetter;
    private final int threshold;
    private final org.apache.commons.io.function.IOConsumer<org.apache.commons.io.output.ThresholdingOutputStream> thresholdConsumer;
    private boolean thresholdExceeded;
    private long written;

    static {
            org.apache.commons.io.output.ThresholdingOutputStream$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.output.ThresholdingOutputStream$$ExternalSyntheticLambda0
            r0.<init>()
            org.apache.commons.io.output.ThresholdingOutputStream.NOOP_OS_GETTER = r0
            return
    }

    public ThresholdingOutputStream(int r3) {
            r2 = this;
            org.apache.commons.io.function.IOConsumer r0 = org.apache.commons.io.function.IOConsumer.noop()
            org.apache.commons.io.function.IOFunction<org.apache.commons.io.output.ThresholdingOutputStream, java.io.OutputStream> r1 = org.apache.commons.io.output.ThresholdingOutputStream.NOOP_OS_GETTER
            r2.<init>(r3, r0, r1)
            return
    }

    public ThresholdingOutputStream(int r1, org.apache.commons.io.function.IOConsumer<org.apache.commons.io.output.ThresholdingOutputStream> r2, org.apache.commons.io.function.IOFunction<org.apache.commons.io.output.ThresholdingOutputStream, java.io.OutputStream> r3) {
            r0 = this;
            r0.<init>()
            if (r1 >= 0) goto L6
            r1 = 0
        L6:
            r0.threshold = r1
            if (r2 != 0) goto Le
            org.apache.commons.io.function.IOConsumer r2 = org.apache.commons.io.function.IOConsumer.noop()
        Le:
            r0.thresholdConsumer = r2
            if (r3 != 0) goto L14
            org.apache.commons.io.function.IOFunction<org.apache.commons.io.output.ThresholdingOutputStream, java.io.OutputStream> r3 = org.apache.commons.io.output.ThresholdingOutputStream.NOOP_OS_GETTER
        L14:
            r0.outputStreamGetter = r3
            return
    }

    static /* synthetic */ java.io.OutputStream lambda$static$0(org.apache.commons.io.output.ThresholdingOutputStream r0) throws java.io.IOException {
            org.apache.commons.io.output.NullOutputStream r0 = org.apache.commons.io.output.NullOutputStream.INSTANCE
            return r0
    }

    protected void checkThreshold(int r5) throws java.io.IOException {
            r4 = this;
            boolean r0 = r4.thresholdExceeded
            if (r0 != 0) goto L15
            long r0 = r4.written
            long r2 = (long) r5
            long r0 = r0 + r2
            int r5 = r4.threshold
            long r2 = (long) r5
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L15
            r5 = 1
            r4.thresholdExceeded = r5
            r4.thresholdReached()
        L15:
            return
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            r1.flush()     // Catch: java.io.IOException -> L3
        L3:
            java.io.OutputStream r0 = r1.getStream()
            r0.close()
            return
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r0 = r1.getStream()
            r0.flush()
            return
    }

    public long getByteCount() {
            r2 = this;
            long r0 = r2.written
            return r0
    }

    protected java.io.OutputStream getOutputStream() throws java.io.IOException {
            r1 = this;
            org.apache.commons.io.function.IOFunction<org.apache.commons.io.output.ThresholdingOutputStream, java.io.OutputStream> r0 = r1.outputStreamGetter
            java.lang.Object r0 = r0.apply(r1)
            java.io.OutputStream r0 = (java.io.OutputStream) r0
            return r0
    }

    @java.lang.Deprecated
    protected java.io.OutputStream getStream() throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r0 = r1.getOutputStream()
            return r0
    }

    public int getThreshold() {
            r1 = this;
            int r0 = r1.threshold
            return r0
    }

    public boolean isThresholdExceeded() {
            r4 = this;
            long r0 = r4.written
            int r2 = r4.threshold
            long r2 = (long) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    protected void resetByteCount() {
            r2 = this;
            r0 = 0
            r2.thresholdExceeded = r0
            r0 = 0
            r2.written = r0
            return
    }

    protected void setByteCount(long r1) {
            r0 = this;
            r0.written = r1
            return
    }

    protected void thresholdReached() throws java.io.IOException {
            r1 = this;
            org.apache.commons.io.function.IOConsumer<org.apache.commons.io.output.ThresholdingOutputStream> r0 = r1.thresholdConsumer
            r0.accept(r1)
            return
    }

    @Override // java.io.OutputStream
    public void write(int r5) throws java.io.IOException {
            r4 = this;
            r0 = 1
            r4.checkThreshold(r0)
            java.io.OutputStream r0 = r4.getStream()
            r0.write(r5)
            long r0 = r4.written
            r2 = 1
            long r0 = r0 + r2
            r4.written = r0
            return
    }

    @Override // java.io.OutputStream
    public void write(byte[] r5) throws java.io.IOException {
            r4 = this;
            int r0 = r5.length
            r4.checkThreshold(r0)
            java.io.OutputStream r0 = r4.getStream()
            r0.write(r5)
            long r0 = r4.written
            int r5 = r5.length
            long r2 = (long) r5
            long r0 = r0 + r2
            r4.written = r0
            return
    }

    @Override // java.io.OutputStream
    public void write(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            r2.checkThreshold(r5)
            java.io.OutputStream r0 = r2.getStream()
            r0.write(r3, r4, r5)
            long r3 = r2.written
            long r0 = (long) r5
            long r3 = r3 + r0
            r2.written = r3
            return
    }
}
