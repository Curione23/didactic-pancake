package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
abstract class DeltaCoder implements org.tukaani.xz.FilterCoder {
    public static final long FILTER_ID = 3;

    DeltaCoder() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.tukaani.xz.FilterCoder
    public boolean changesSize() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.tukaani.xz.FilterCoder
    public boolean lastOK() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.tukaani.xz.FilterCoder
    public boolean nonLastOK() {
            r1 = this;
            r0 = 1
            return r0
    }
}
