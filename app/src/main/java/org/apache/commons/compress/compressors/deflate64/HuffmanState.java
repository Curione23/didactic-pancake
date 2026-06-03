package org.apache.commons.compress.compressors.deflate64;

/* JADX INFO: loaded from: classes2.dex */
enum HuffmanState extends java.lang.Enum<org.apache.commons.compress.compressors.deflate64.HuffmanState> {
    private static final /* synthetic */ org.apache.commons.compress.compressors.deflate64.HuffmanState[] $VALUES = null;
    public static final org.apache.commons.compress.compressors.deflate64.HuffmanState DYNAMIC_CODES = null;
    public static final org.apache.commons.compress.compressors.deflate64.HuffmanState FIXED_CODES = null;
    public static final org.apache.commons.compress.compressors.deflate64.HuffmanState INITIAL = null;
    public static final org.apache.commons.compress.compressors.deflate64.HuffmanState STORED = null;

    private static /* synthetic */ org.apache.commons.compress.compressors.deflate64.HuffmanState[] $values() {
            org.apache.commons.compress.compressors.deflate64.HuffmanState r0 = org.apache.commons.compress.compressors.deflate64.HuffmanState.INITIAL
            org.apache.commons.compress.compressors.deflate64.HuffmanState r1 = org.apache.commons.compress.compressors.deflate64.HuffmanState.STORED
            org.apache.commons.compress.compressors.deflate64.HuffmanState r2 = org.apache.commons.compress.compressors.deflate64.HuffmanState.DYNAMIC_CODES
            org.apache.commons.compress.compressors.deflate64.HuffmanState r3 = org.apache.commons.compress.compressors.deflate64.HuffmanState.FIXED_CODES
            org.apache.commons.compress.compressors.deflate64.HuffmanState[] r0 = new org.apache.commons.compress.compressors.deflate64.HuffmanState[]{r0, r1, r2, r3}
            return r0
    }

    static {
            org.apache.commons.compress.compressors.deflate64.HuffmanState r0 = new org.apache.commons.compress.compressors.deflate64.HuffmanState
            java.lang.String r1 = "INITIAL"
            r2 = 0
            r0.<init>(r1, r2)
            org.apache.commons.compress.compressors.deflate64.HuffmanState.INITIAL = r0
            org.apache.commons.compress.compressors.deflate64.HuffmanState r0 = new org.apache.commons.compress.compressors.deflate64.HuffmanState
            java.lang.String r1 = "STORED"
            r2 = 1
            r0.<init>(r1, r2)
            org.apache.commons.compress.compressors.deflate64.HuffmanState.STORED = r0
            org.apache.commons.compress.compressors.deflate64.HuffmanState r0 = new org.apache.commons.compress.compressors.deflate64.HuffmanState
            java.lang.String r1 = "DYNAMIC_CODES"
            r2 = 2
            r0.<init>(r1, r2)
            org.apache.commons.compress.compressors.deflate64.HuffmanState.DYNAMIC_CODES = r0
            org.apache.commons.compress.compressors.deflate64.HuffmanState r0 = new org.apache.commons.compress.compressors.deflate64.HuffmanState
            java.lang.String r1 = "FIXED_CODES"
            r2 = 3
            r0.<init>(r1, r2)
            org.apache.commons.compress.compressors.deflate64.HuffmanState.FIXED_CODES = r0
            org.apache.commons.compress.compressors.deflate64.HuffmanState[] r0 = $values()
            org.apache.commons.compress.compressors.deflate64.HuffmanState.$VALUES = r0
            return
    }

    HuffmanState(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static org.apache.commons.compress.compressors.deflate64.HuffmanState valueOf(java.lang.String r1) {
            java.lang.Class<org.apache.commons.compress.compressors.deflate64.HuffmanState> r0 = org.apache.commons.compress.compressors.deflate64.HuffmanState.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            org.apache.commons.compress.compressors.deflate64.HuffmanState r1 = (org.apache.commons.compress.compressors.deflate64.HuffmanState) r1
            return r1
    }

    public static org.apache.commons.compress.compressors.deflate64.HuffmanState[] values() {
            org.apache.commons.compress.compressors.deflate64.HuffmanState[] r0 = org.apache.commons.compress.compressors.deflate64.HuffmanState.$VALUES
            java.lang.Object r0 = r0.clone()
            org.apache.commons.compress.compressors.deflate64.HuffmanState[] r0 = (org.apache.commons.compress.compressors.deflate64.HuffmanState[]) r0
            return r0
    }
}
