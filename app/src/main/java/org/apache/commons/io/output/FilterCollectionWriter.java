package org.apache.commons.io.output;

/* JADX INFO: loaded from: classes2.dex */
public class FilterCollectionWriter extends java.io.Writer {
    protected final java.util.Collection<java.io.Writer> EMPTY_WRITERS;
    protected final java.util.Collection<java.io.Writer> writers;

    public static /* synthetic */ boolean $r8$lambda$DcwFmRaIeDgUX6N_2AmWDbx2MFM(java.lang.Object r0) {
            boolean r0 = java.util.Objects.nonNull(r0)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$aoY79gZ5tQ3Wwt2L9WFHHcWNU0I(java.io.Writer r0) {
            r0.flush()
            return
    }

    public static /* synthetic */ void $r8$lambda$mQg58y2Apz_LwQMgrQ3umIGisyY(java.io.Writer r0) {
            r0.close()
            return
    }

    protected FilterCollectionWriter(java.util.Collection<java.io.Writer> r2) {
            r1 = this;
            r1.<init>()
            java.util.List r0 = java.util.Collections.emptyList()
            r1.EMPTY_WRITERS = r0
            if (r2 != 0) goto Lc
            r2 = r0
        Lc:
            r1.writers = r2
            return
    }

    protected FilterCollectionWriter(java.io.Writer... r2) {
            r1 = this;
            r1.<init>()
            java.util.List r0 = java.util.Collections.emptyList()
            r1.EMPTY_WRITERS = r0
            if (r2 != 0) goto Lc
            goto L10
        Lc:
            java.util.List r0 = java.util.Arrays.asList(r2)
        L10:
            r1.writers = r0
            return
    }

    private org.apache.commons.io.output.FilterCollectionWriter forAllWriters(org.apache.commons.io.function.IOConsumer<java.io.Writer> r2) throws org.apache.commons.io.IOExceptionList {
            r1 = this;
            java.util.stream.Stream r0 = r1.writers()
            org.apache.commons.io.function.IOConsumer.forAll(r2, r0)
            return r1
    }

    static /* synthetic */ void lambda$append$0(char r0, java.io.Writer r1) throws java.io.IOException {
            r1.append(r0)
            return
    }

    static /* synthetic */ void lambda$append$1(java.lang.CharSequence r0, java.io.Writer r1) throws java.io.IOException {
            r1.append(r0)
            return
    }

    static /* synthetic */ void lambda$append$2(java.lang.CharSequence r0, int r1, int r2, java.io.Writer r3) throws java.io.IOException {
            r3.append(r0, r1, r2)
            return
    }

    static /* synthetic */ void lambda$write$3(char[] r0, java.io.Writer r1) throws java.io.IOException {
            r1.write(r0)
            return
    }

    static /* synthetic */ void lambda$write$4(char[] r0, int r1, int r2, java.io.Writer r3) throws java.io.IOException {
            r3.write(r0, r1, r2)
            return
    }

    static /* synthetic */ void lambda$write$5(int r0, java.io.Writer r1) throws java.io.IOException {
            r1.write(r0)
            return
    }

    static /* synthetic */ void lambda$write$6(java.lang.String r0, java.io.Writer r1) throws java.io.IOException {
            r1.write(r0)
            return
    }

    static /* synthetic */ void lambda$write$7(java.lang.String r0, int r1, int r2, java.io.Writer r3) throws java.io.IOException {
            r3.write(r0, r1, r2)
            return
    }

    private java.util.stream.Stream<java.io.Writer> writers() {
            r2 = this;
            java.util.Collection<java.io.Writer> r0 = r2.writers
            java.util.stream.Stream r0 = r0.stream()
            org.apache.commons.io.output.FilterCollectionWriter$$ExternalSyntheticLambda10 r1 = new org.apache.commons.io.output.FilterCollectionWriter$$ExternalSyntheticLambda10
            r1.<init>()
            java.util.stream.Stream r0 = r0.filter(r1)
            return r0
    }

    @Override // java.io.Writer, java.lang.Appendable
    public java.io.Writer append(char r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.io.output.FilterCollectionWriter$$ExternalSyntheticLambda9 r0 = new org.apache.commons.io.output.FilterCollectionWriter$$ExternalSyntheticLambda9
            r0.<init>(r2)
            org.apache.commons.io.output.FilterCollectionWriter r2 = r1.forAllWriters(r0)
            return r2
    }

    @Override // java.io.Writer, java.lang.Appendable
    public java.io.Writer append(java.lang.CharSequence r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.io.output.FilterCollectionWriter$$ExternalSyntheticLambda3 r0 = new org.apache.commons.io.output.FilterCollectionWriter$$ExternalSyntheticLambda3
            r0.<init>(r2)
            org.apache.commons.io.output.FilterCollectionWriter r2 = r1.forAllWriters(r0)
            return r2
    }

    @Override // java.io.Writer, java.lang.Appendable
    public java.io.Writer append(java.lang.CharSequence r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            org.apache.commons.io.output.FilterCollectionWriter$$ExternalSyntheticLambda1 r0 = new org.apache.commons.io.output.FilterCollectionWriter$$ExternalSyntheticLambda1
            r0.<init>(r2, r3, r4)
            org.apache.commons.io.output.FilterCollectionWriter r2 = r1.forAllWriters(r0)
            return r2
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ java.lang.Appendable append(char r1) throws java.io.IOException {
            r0 = this;
            java.io.Writer r1 = r0.append(r1)
            return r1
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence r1) throws java.io.IOException {
            r0 = this;
            java.io.Writer r1 = r0.append(r1)
            return r1
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence r1, int r2, int r3) throws java.io.IOException {
            r0 = this;
            java.io.Writer r1 = r0.append(r1, r2, r3)
            return r1
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            org.apache.commons.io.output.FilterCollectionWriter$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.output.FilterCollectionWriter$$ExternalSyntheticLambda0
            r0.<init>()
            r1.forAllWriters(r0)
            return
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws java.io.IOException {
            r1 = this;
            org.apache.commons.io.output.FilterCollectionWriter$$ExternalSyntheticLambda6 r0 = new org.apache.commons.io.output.FilterCollectionWriter$$ExternalSyntheticLambda6
            r0.<init>()
            r1.forAllWriters(r0)
            return
    }

    @Override // java.io.Writer
    public void write(int r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.io.output.FilterCollectionWriter$$ExternalSyntheticLambda8 r0 = new org.apache.commons.io.output.FilterCollectionWriter$$ExternalSyntheticLambda8
            r0.<init>(r2)
            r1.forAllWriters(r0)
            return
    }

    @Override // java.io.Writer
    public void write(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.io.output.FilterCollectionWriter$$ExternalSyntheticLambda2 r0 = new org.apache.commons.io.output.FilterCollectionWriter$$ExternalSyntheticLambda2
            r0.<init>(r2)
            r1.forAllWriters(r0)
            return
    }

    @Override // java.io.Writer
    public void write(java.lang.String r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            org.apache.commons.io.output.FilterCollectionWriter$$ExternalSyntheticLambda7 r0 = new org.apache.commons.io.output.FilterCollectionWriter$$ExternalSyntheticLambda7
            r0.<init>(r2, r3, r4)
            r1.forAllWriters(r0)
            return
    }

    @Override // java.io.Writer
    public void write(char[] r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.io.output.FilterCollectionWriter$$ExternalSyntheticLambda4 r0 = new org.apache.commons.io.output.FilterCollectionWriter$$ExternalSyntheticLambda4
            r0.<init>(r2)
            r1.forAllWriters(r0)
            return
    }

    @Override // java.io.Writer
    public void write(char[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            org.apache.commons.io.output.FilterCollectionWriter$$ExternalSyntheticLambda5 r0 = new org.apache.commons.io.output.FilterCollectionWriter$$ExternalSyntheticLambda5
            r0.<init>(r2, r3, r4)
            r1.forAllWriters(r0)
            return
    }
}
