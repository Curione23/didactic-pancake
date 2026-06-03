package org.apache.commons.codec.language.bm;

/* JADX INFO: loaded from: classes2.dex */
public enum RuleType extends java.lang.Enum<org.apache.commons.codec.language.bm.RuleType> {
    private static final /* synthetic */ org.apache.commons.codec.language.bm.RuleType[] $VALUES = null;
    public static final org.apache.commons.codec.language.bm.RuleType APPROX = null;
    public static final org.apache.commons.codec.language.bm.RuleType EXACT = null;
    public static final org.apache.commons.codec.language.bm.RuleType RULES = null;
    private final java.lang.String name;

    private static /* synthetic */ org.apache.commons.codec.language.bm.RuleType[] $values() {
            org.apache.commons.codec.language.bm.RuleType r0 = org.apache.commons.codec.language.bm.RuleType.APPROX
            org.apache.commons.codec.language.bm.RuleType r1 = org.apache.commons.codec.language.bm.RuleType.EXACT
            org.apache.commons.codec.language.bm.RuleType r2 = org.apache.commons.codec.language.bm.RuleType.RULES
            org.apache.commons.codec.language.bm.RuleType[] r0 = new org.apache.commons.codec.language.bm.RuleType[]{r0, r1, r2}
            return r0
    }

    static {
            org.apache.commons.codec.language.bm.RuleType r0 = new org.apache.commons.codec.language.bm.RuleType
            r1 = 0
            java.lang.String r2 = "approx"
            java.lang.String r3 = "APPROX"
            r0.<init>(r3, r1, r2)
            org.apache.commons.codec.language.bm.RuleType.APPROX = r0
            org.apache.commons.codec.language.bm.RuleType r0 = new org.apache.commons.codec.language.bm.RuleType
            r1 = 1
            java.lang.String r2 = "exact"
            java.lang.String r3 = "EXACT"
            r0.<init>(r3, r1, r2)
            org.apache.commons.codec.language.bm.RuleType.EXACT = r0
            org.apache.commons.codec.language.bm.RuleType r0 = new org.apache.commons.codec.language.bm.RuleType
            r1 = 2
            java.lang.String r2 = "rules"
            java.lang.String r3 = "RULES"
            r0.<init>(r3, r1, r2)
            org.apache.commons.codec.language.bm.RuleType.RULES = r0
            org.apache.commons.codec.language.bm.RuleType[] r0 = $values()
            org.apache.commons.codec.language.bm.RuleType.$VALUES = r0
            return
    }

    RuleType(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.name = r3
            return
    }

    public static org.apache.commons.codec.language.bm.RuleType valueOf(java.lang.String r1) {
            java.lang.Class<org.apache.commons.codec.language.bm.RuleType> r0 = org.apache.commons.codec.language.bm.RuleType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            org.apache.commons.codec.language.bm.RuleType r1 = (org.apache.commons.codec.language.bm.RuleType) r1
            return r1
    }

    public static org.apache.commons.codec.language.bm.RuleType[] values() {
            org.apache.commons.codec.language.bm.RuleType[] r0 = org.apache.commons.codec.language.bm.RuleType.$VALUES
            java.lang.Object r0 = r0.clone()
            org.apache.commons.codec.language.bm.RuleType[] r0 = (org.apache.commons.codec.language.bm.RuleType[]) r0
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }
}
