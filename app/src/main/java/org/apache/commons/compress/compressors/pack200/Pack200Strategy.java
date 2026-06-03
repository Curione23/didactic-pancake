package org.apache.commons.compress.compressors.pack200;

/* JADX INFO: loaded from: classes2.dex */
public enum Pack200Strategy extends java.lang.Enum<org.apache.commons.compress.compressors.pack200.Pack200Strategy> {
    private static final /* synthetic */ org.apache.commons.compress.compressors.pack200.Pack200Strategy[] $VALUES = null;
    public static final org.apache.commons.compress.compressors.pack200.Pack200Strategy IN_MEMORY = null;
    public static final org.apache.commons.compress.compressors.pack200.Pack200Strategy TEMP_FILE = null;



    private static /* synthetic */ org.apache.commons.compress.compressors.pack200.Pack200Strategy[] $values() {
            org.apache.commons.compress.compressors.pack200.Pack200Strategy r0 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.IN_MEMORY
            org.apache.commons.compress.compressors.pack200.Pack200Strategy r1 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE
            org.apache.commons.compress.compressors.pack200.Pack200Strategy[] r0 = new org.apache.commons.compress.compressors.pack200.Pack200Strategy[]{r0, r1}
            return r0
    }

    static {
            org.apache.commons.compress.compressors.pack200.Pack200Strategy$1 r0 = new org.apache.commons.compress.compressors.pack200.Pack200Strategy$1
            java.lang.String r1 = "IN_MEMORY"
            r2 = 0
            r0.<init>(r1, r2)
            org.apache.commons.compress.compressors.pack200.Pack200Strategy.IN_MEMORY = r0
            org.apache.commons.compress.compressors.pack200.Pack200Strategy$2 r0 = new org.apache.commons.compress.compressors.pack200.Pack200Strategy$2
            java.lang.String r1 = "TEMP_FILE"
            r2 = 1
            r0.<init>(r1, r2)
            org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE = r0
            org.apache.commons.compress.compressors.pack200.Pack200Strategy[] r0 = $values()
            org.apache.commons.compress.compressors.pack200.Pack200Strategy.$VALUES = r0
            return
    }

    Pack200Strategy(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    /* synthetic */ Pack200Strategy(java.lang.String r1, int r2, org.apache.commons.compress.compressors.pack200.Pack200Strategy.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static org.apache.commons.compress.compressors.pack200.Pack200Strategy valueOf(java.lang.String r1) {
            java.lang.Class<org.apache.commons.compress.compressors.pack200.Pack200Strategy> r0 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            org.apache.commons.compress.compressors.pack200.Pack200Strategy r1 = (org.apache.commons.compress.compressors.pack200.Pack200Strategy) r1
            return r1
    }

    public static org.apache.commons.compress.compressors.pack200.Pack200Strategy[] values() {
            org.apache.commons.compress.compressors.pack200.Pack200Strategy[] r0 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.$VALUES
            java.lang.Object r0 = r0.clone()
            org.apache.commons.compress.compressors.pack200.Pack200Strategy[] r0 = (org.apache.commons.compress.compressors.pack200.Pack200Strategy[]) r0
            return r0
    }

    abstract org.apache.commons.compress.compressors.pack200.AbstractStreamBridge newStreamBridge() throws java.io.IOException;
}
