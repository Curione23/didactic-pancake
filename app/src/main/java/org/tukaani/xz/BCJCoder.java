package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
abstract class BCJCoder implements org.tukaani.xz.FilterCoder {
    public static final long ARM64_FILTER_ID = 10;
    public static final long ARMTHUMB_FILTER_ID = 8;
    public static final long ARM_FILTER_ID = 7;
    public static final long IA64_FILTER_ID = 6;
    public static final long POWERPC_FILTER_ID = 5;
    public static final long RISCV_FILTER_ID = 11;
    public static final long SPARC_FILTER_ID = 9;
    public static final long X86_FILTER_ID = 4;

    BCJCoder() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isBCJFilterID(long r2) {
            r0 = 4
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto Le
            r0 = 11
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 > 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
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
