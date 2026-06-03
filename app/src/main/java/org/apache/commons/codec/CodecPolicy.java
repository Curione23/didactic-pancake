package org.apache.commons.codec;

/* JADX INFO: loaded from: classes2.dex */
public enum CodecPolicy extends java.lang.Enum<org.apache.commons.codec.CodecPolicy> {
    private static final /* synthetic */ org.apache.commons.codec.CodecPolicy[] $VALUES = null;
    public static final org.apache.commons.codec.CodecPolicy LENIENT = null;
    public static final org.apache.commons.codec.CodecPolicy STRICT = null;

    private static /* synthetic */ org.apache.commons.codec.CodecPolicy[] $values() {
            org.apache.commons.codec.CodecPolicy r0 = org.apache.commons.codec.CodecPolicy.STRICT
            org.apache.commons.codec.CodecPolicy r1 = org.apache.commons.codec.CodecPolicy.LENIENT
            org.apache.commons.codec.CodecPolicy[] r0 = new org.apache.commons.codec.CodecPolicy[]{r0, r1}
            return r0
    }

    static {
            org.apache.commons.codec.CodecPolicy r0 = new org.apache.commons.codec.CodecPolicy
            java.lang.String r1 = "STRICT"
            r2 = 0
            r0.<init>(r1, r2)
            org.apache.commons.codec.CodecPolicy.STRICT = r0
            org.apache.commons.codec.CodecPolicy r0 = new org.apache.commons.codec.CodecPolicy
            java.lang.String r1 = "LENIENT"
            r2 = 1
            r0.<init>(r1, r2)
            org.apache.commons.codec.CodecPolicy.LENIENT = r0
            org.apache.commons.codec.CodecPolicy[] r0 = $values()
            org.apache.commons.codec.CodecPolicy.$VALUES = r0
            return
    }

    CodecPolicy(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static org.apache.commons.codec.CodecPolicy valueOf(java.lang.String r1) {
            java.lang.Class<org.apache.commons.codec.CodecPolicy> r0 = org.apache.commons.codec.CodecPolicy.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            org.apache.commons.codec.CodecPolicy r1 = (org.apache.commons.codec.CodecPolicy) r1
            return r1
    }

    public static org.apache.commons.codec.CodecPolicy[] values() {
            org.apache.commons.codec.CodecPolicy[] r0 = org.apache.commons.codec.CodecPolicy.$VALUES
            java.lang.Object r0 = r0.clone()
            org.apache.commons.codec.CodecPolicy[] r0 = (org.apache.commons.codec.CodecPolicy[]) r0
            return r0
    }
}
