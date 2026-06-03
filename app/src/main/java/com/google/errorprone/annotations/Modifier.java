package com.google.errorprone.annotations;

/* JADX INFO: loaded from: classes2.dex */
public enum Modifier extends java.lang.Enum<com.google.errorprone.annotations.Modifier> {
    private static final /* synthetic */ com.google.errorprone.annotations.Modifier[] $VALUES = null;
    public static final com.google.errorprone.annotations.Modifier ABSTRACT = null;
    public static final com.google.errorprone.annotations.Modifier DEFAULT = null;
    public static final com.google.errorprone.annotations.Modifier FINAL = null;
    public static final com.google.errorprone.annotations.Modifier NATIVE = null;
    public static final com.google.errorprone.annotations.Modifier PRIVATE = null;
    public static final com.google.errorprone.annotations.Modifier PROTECTED = null;
    public static final com.google.errorprone.annotations.Modifier PUBLIC = null;
    public static final com.google.errorprone.annotations.Modifier STATIC = null;
    public static final com.google.errorprone.annotations.Modifier STRICTFP = null;
    public static final com.google.errorprone.annotations.Modifier SYNCHRONIZED = null;
    public static final com.google.errorprone.annotations.Modifier TRANSIENT = null;
    public static final com.google.errorprone.annotations.Modifier VOLATILE = null;

    private static /* synthetic */ com.google.errorprone.annotations.Modifier[] $values() {
            com.google.errorprone.annotations.Modifier r0 = com.google.errorprone.annotations.Modifier.PUBLIC
            com.google.errorprone.annotations.Modifier r1 = com.google.errorprone.annotations.Modifier.PROTECTED
            com.google.errorprone.annotations.Modifier r2 = com.google.errorprone.annotations.Modifier.PRIVATE
            com.google.errorprone.annotations.Modifier r3 = com.google.errorprone.annotations.Modifier.ABSTRACT
            com.google.errorprone.annotations.Modifier r4 = com.google.errorprone.annotations.Modifier.DEFAULT
            com.google.errorprone.annotations.Modifier r5 = com.google.errorprone.annotations.Modifier.STATIC
            com.google.errorprone.annotations.Modifier r6 = com.google.errorprone.annotations.Modifier.FINAL
            com.google.errorprone.annotations.Modifier r7 = com.google.errorprone.annotations.Modifier.TRANSIENT
            com.google.errorprone.annotations.Modifier r8 = com.google.errorprone.annotations.Modifier.VOLATILE
            com.google.errorprone.annotations.Modifier r9 = com.google.errorprone.annotations.Modifier.SYNCHRONIZED
            com.google.errorprone.annotations.Modifier r10 = com.google.errorprone.annotations.Modifier.NATIVE
            com.google.errorprone.annotations.Modifier r11 = com.google.errorprone.annotations.Modifier.STRICTFP
            com.google.errorprone.annotations.Modifier[] r0 = new com.google.errorprone.annotations.Modifier[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
            return r0
    }

    static {
            com.google.errorprone.annotations.Modifier r0 = new com.google.errorprone.annotations.Modifier
            java.lang.String r1 = "PUBLIC"
            r2 = 0
            r0.<init>(r1, r2)
            com.google.errorprone.annotations.Modifier.PUBLIC = r0
            com.google.errorprone.annotations.Modifier r0 = new com.google.errorprone.annotations.Modifier
            java.lang.String r1 = "PROTECTED"
            r2 = 1
            r0.<init>(r1, r2)
            com.google.errorprone.annotations.Modifier.PROTECTED = r0
            com.google.errorprone.annotations.Modifier r0 = new com.google.errorprone.annotations.Modifier
            java.lang.String r1 = "PRIVATE"
            r2 = 2
            r0.<init>(r1, r2)
            com.google.errorprone.annotations.Modifier.PRIVATE = r0
            com.google.errorprone.annotations.Modifier r0 = new com.google.errorprone.annotations.Modifier
            java.lang.String r1 = "ABSTRACT"
            r2 = 3
            r0.<init>(r1, r2)
            com.google.errorprone.annotations.Modifier.ABSTRACT = r0
            com.google.errorprone.annotations.Modifier r0 = new com.google.errorprone.annotations.Modifier
            java.lang.String r1 = "DEFAULT"
            r2 = 4
            r0.<init>(r1, r2)
            com.google.errorprone.annotations.Modifier.DEFAULT = r0
            com.google.errorprone.annotations.Modifier r0 = new com.google.errorprone.annotations.Modifier
            java.lang.String r1 = "STATIC"
            r2 = 5
            r0.<init>(r1, r2)
            com.google.errorprone.annotations.Modifier.STATIC = r0
            com.google.errorprone.annotations.Modifier r0 = new com.google.errorprone.annotations.Modifier
            java.lang.String r1 = "FINAL"
            r2 = 6
            r0.<init>(r1, r2)
            com.google.errorprone.annotations.Modifier.FINAL = r0
            com.google.errorprone.annotations.Modifier r0 = new com.google.errorprone.annotations.Modifier
            java.lang.String r1 = "TRANSIENT"
            r2 = 7
            r0.<init>(r1, r2)
            com.google.errorprone.annotations.Modifier.TRANSIENT = r0
            com.google.errorprone.annotations.Modifier r0 = new com.google.errorprone.annotations.Modifier
            java.lang.String r1 = "VOLATILE"
            r2 = 8
            r0.<init>(r1, r2)
            com.google.errorprone.annotations.Modifier.VOLATILE = r0
            com.google.errorprone.annotations.Modifier r0 = new com.google.errorprone.annotations.Modifier
            java.lang.String r1 = "SYNCHRONIZED"
            r2 = 9
            r0.<init>(r1, r2)
            com.google.errorprone.annotations.Modifier.SYNCHRONIZED = r0
            com.google.errorprone.annotations.Modifier r0 = new com.google.errorprone.annotations.Modifier
            java.lang.String r1 = "NATIVE"
            r2 = 10
            r0.<init>(r1, r2)
            com.google.errorprone.annotations.Modifier.NATIVE = r0
            com.google.errorprone.annotations.Modifier r0 = new com.google.errorprone.annotations.Modifier
            java.lang.String r1 = "STRICTFP"
            r2 = 11
            r0.<init>(r1, r2)
            com.google.errorprone.annotations.Modifier.STRICTFP = r0
            com.google.errorprone.annotations.Modifier[] r0 = $values()
            com.google.errorprone.annotations.Modifier.$VALUES = r0
            return
    }

    Modifier(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.google.errorprone.annotations.Modifier valueOf(java.lang.String r1) {
            java.lang.Class<com.google.errorprone.annotations.Modifier> r0 = com.google.errorprone.annotations.Modifier.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.errorprone.annotations.Modifier r1 = (com.google.errorprone.annotations.Modifier) r1
            return r1
    }

    public static com.google.errorprone.annotations.Modifier[] values() {
            com.google.errorprone.annotations.Modifier[] r0 = com.google.errorprone.annotations.Modifier.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.errorprone.annotations.Modifier[] r0 = (com.google.errorprone.annotations.Modifier[]) r0
            return r0
    }
}
