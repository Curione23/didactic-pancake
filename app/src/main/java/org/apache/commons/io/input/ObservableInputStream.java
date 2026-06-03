package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
public class ObservableInputStream extends org.apache.commons.io.input.ProxyInputStream {
    private final java.util.List<org.apache.commons.io.input.ObservableInputStream.Observer> observers;

    public static abstract class Observer {
        public Observer() {
                r0 = this;
                r0.<init>()
                return
        }

        public void closed() throws java.io.IOException {
                r0 = this;
                return
        }

        public void data(int r1) throws java.io.IOException {
                r0 = this;
                return
        }

        public void data(byte[] r1, int r2, int r3) throws java.io.IOException {
                r0 = this;
                return
        }

        public void error(java.io.IOException r1) throws java.io.IOException {
                r0 = this;
                throw r1
        }

        public void finished() throws java.io.IOException {
                r0 = this;
                return
        }
    }

    public ObservableInputStream(java.io.InputStream r2) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.<init>(r2, r0)
            return
    }

    private ObservableInputStream(java.io.InputStream r1, java.util.List<org.apache.commons.io.input.ObservableInputStream.Observer> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.observers = r2
            return
    }

    public ObservableInputStream(java.io.InputStream r1, org.apache.commons.io.input.ObservableInputStream.Observer... r2) {
            r0 = this;
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.<init>(r1, r2)
            return
    }

    private void forEachObserver(org.apache.commons.io.function.IOConsumer<org.apache.commons.io.input.ObservableInputStream.Observer> r2) throws java.io.IOException {
            r1 = this;
            java.util.List<org.apache.commons.io.input.ObservableInputStream$Observer> r0 = r1.observers
            org.apache.commons.io.function.IOConsumer.forAll(r2, r0)
            return
    }

    static /* synthetic */ void lambda$noteDataByte$0(int r0, org.apache.commons.io.input.ObservableInputStream.Observer r1) throws java.io.IOException {
            r1.data(r0)
            return
    }

    static /* synthetic */ void lambda$noteDataBytes$1(byte[] r0, int r1, int r2, org.apache.commons.io.input.ObservableInputStream.Observer r3) throws java.io.IOException {
            r3.data(r0, r1, r2)
            return
    }

    static /* synthetic */ void lambda$noteError$2(java.io.IOException r0, org.apache.commons.io.input.ObservableInputStream.Observer r1) throws java.io.IOException {
            r1.error(r0)
            return
    }

    private void notify(byte[] r1, int r2, int r3, java.io.IOException r4) throws java.io.IOException {
            r0 = this;
            if (r4 != 0) goto Lf
            r4 = -1
            if (r3 != r4) goto L9
            r0.noteFinished()
            goto Le
        L9:
            if (r3 <= 0) goto Le
            r0.noteDataBytes(r1, r2, r3)
        Le:
            return
        Lf:
            r0.noteError(r4)
            throw r4
    }

    public void add(org.apache.commons.io.input.ObservableInputStream.Observer r2) {
            r1 = this;
            java.util.List<org.apache.commons.io.input.ObservableInputStream$Observer> r0 = r1.observers
            r0.add(r2)
            return
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            super.close()     // Catch: java.io.IOException -> L5
            r0 = 0
            goto L6
        L5:
            r0 = move-exception
        L6:
            if (r0 != 0) goto Lc
            r1.noteClosed()
            goto Lf
        Lc:
            r1.noteError(r0)
        Lf:
            return
    }

    public void consume() throws java.io.IOException {
            r0 = this;
            org.apache.commons.io.IOUtils.consume(r0)
            return
    }

    public java.util.List<org.apache.commons.io.input.ObservableInputStream.Observer> getObservers() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<org.apache.commons.io.input.ObservableInputStream$Observer> r1 = r2.observers
            r0.<init>(r1)
            return r0
    }

    protected void noteClosed() throws java.io.IOException {
            r1 = this;
            org.apache.commons.io.input.ObservableInputStream$$ExternalSyntheticLambda2 r0 = new org.apache.commons.io.input.ObservableInputStream$$ExternalSyntheticLambda2
            r0.<init>()
            r1.forEachObserver(r0)
            return
    }

    protected void noteDataByte(int r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.io.input.ObservableInputStream$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.input.ObservableInputStream$$ExternalSyntheticLambda0
            r0.<init>(r2)
            r1.forEachObserver(r0)
            return
    }

    protected void noteDataBytes(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            org.apache.commons.io.input.ObservableInputStream$$ExternalSyntheticLambda3 r0 = new org.apache.commons.io.input.ObservableInputStream$$ExternalSyntheticLambda3
            r0.<init>(r2, r3, r4)
            r1.forEachObserver(r0)
            return
    }

    protected void noteError(java.io.IOException r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.io.input.ObservableInputStream$$ExternalSyntheticLambda4 r0 = new org.apache.commons.io.input.ObservableInputStream$$ExternalSyntheticLambda4
            r0.<init>(r2)
            r1.forEachObserver(r0)
            return
    }

    protected void noteFinished() throws java.io.IOException {
            r1 = this;
            org.apache.commons.io.input.ObservableInputStream$$ExternalSyntheticLambda1 r0 = new org.apache.commons.io.input.ObservableInputStream$$ExternalSyntheticLambda1
            r0.<init>()
            r1.forEachObserver(r0)
            return
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
            r2 = this;
            int r0 = super.read()     // Catch: java.io.IOException -> L6
            r1 = 0
            goto L8
        L6:
            r1 = move-exception
            r0 = 0
        L8:
            if (r1 != 0) goto L15
            r1 = -1
            if (r0 != r1) goto L11
            r2.noteFinished()
            goto L14
        L11:
            r2.noteDataByte(r0)
        L14:
            return r0
        L15:
            r2.noteError(r1)
            throw r1
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r4) throws java.io.IOException {
            r3 = this;
            r0 = 0
            int r1 = super.read(r4)     // Catch: java.io.IOException -> L7
            r2 = 0
            goto L9
        L7:
            r2 = move-exception
            r1 = r0
        L9:
            r3.notify(r4, r0, r1, r2)
            return r1
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            int r4 = super.read(r2, r3, r4)     // Catch: java.io.IOException -> L6
            r0 = 0
            goto L8
        L6:
            r0 = move-exception
            r4 = 0
        L8:
            r1.notify(r2, r3, r4, r0)
            return r4
    }

    public void remove(org.apache.commons.io.input.ObservableInputStream.Observer r2) {
            r1 = this;
            java.util.List<org.apache.commons.io.input.ObservableInputStream$Observer> r0 = r1.observers
            r0.remove(r2)
            return
    }

    public void removeAllObservers() {
            r1 = this;
            java.util.List<org.apache.commons.io.input.ObservableInputStream$Observer> r0 = r1.observers
            r0.clear()
            return
    }
}
