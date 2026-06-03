package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
public enum Zip64Mode extends java.lang.Enum<org.apache.commons.compress.archivers.zip.Zip64Mode> {
    private static final /* synthetic */ org.apache.commons.compress.archivers.zip.Zip64Mode[] $VALUES = null;
    public static final org.apache.commons.compress.archivers.zip.Zip64Mode Always = null;
    public static final org.apache.commons.compress.archivers.zip.Zip64Mode AlwaysWithCompatibility = null;
    public static final org.apache.commons.compress.archivers.zip.Zip64Mode AsNeeded = null;
    public static final org.apache.commons.compress.archivers.zip.Zip64Mode Never = null;

    private static /* synthetic */ org.apache.commons.compress.archivers.zip.Zip64Mode[] $values() {
            org.apache.commons.compress.archivers.zip.Zip64Mode r0 = org.apache.commons.compress.archivers.zip.Zip64Mode.Always
            org.apache.commons.compress.archivers.zip.Zip64Mode r1 = org.apache.commons.compress.archivers.zip.Zip64Mode.Never
            org.apache.commons.compress.archivers.zip.Zip64Mode r2 = org.apache.commons.compress.archivers.zip.Zip64Mode.AsNeeded
            org.apache.commons.compress.archivers.zip.Zip64Mode r3 = org.apache.commons.compress.archivers.zip.Zip64Mode.AlwaysWithCompatibility
            org.apache.commons.compress.archivers.zip.Zip64Mode[] r0 = new org.apache.commons.compress.archivers.zip.Zip64Mode[]{r0, r1, r2, r3}
            return r0
    }

    static {
            org.apache.commons.compress.archivers.zip.Zip64Mode r0 = new org.apache.commons.compress.archivers.zip.Zip64Mode
            java.lang.String r1 = "Always"
            r2 = 0
            r0.<init>(r1, r2)
            org.apache.commons.compress.archivers.zip.Zip64Mode.Always = r0
            org.apache.commons.compress.archivers.zip.Zip64Mode r0 = new org.apache.commons.compress.archivers.zip.Zip64Mode
            java.lang.String r1 = "Never"
            r2 = 1
            r0.<init>(r1, r2)
            org.apache.commons.compress.archivers.zip.Zip64Mode.Never = r0
            org.apache.commons.compress.archivers.zip.Zip64Mode r0 = new org.apache.commons.compress.archivers.zip.Zip64Mode
            java.lang.String r1 = "AsNeeded"
            r2 = 2
            r0.<init>(r1, r2)
            org.apache.commons.compress.archivers.zip.Zip64Mode.AsNeeded = r0
            org.apache.commons.compress.archivers.zip.Zip64Mode r0 = new org.apache.commons.compress.archivers.zip.Zip64Mode
            java.lang.String r1 = "AlwaysWithCompatibility"
            r2 = 3
            r0.<init>(r1, r2)
            org.apache.commons.compress.archivers.zip.Zip64Mode.AlwaysWithCompatibility = r0
            org.apache.commons.compress.archivers.zip.Zip64Mode[] r0 = $values()
            org.apache.commons.compress.archivers.zip.Zip64Mode.$VALUES = r0
            return
    }

    Zip64Mode(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static org.apache.commons.compress.archivers.zip.Zip64Mode valueOf(java.lang.String r1) {
            java.lang.Class<org.apache.commons.compress.archivers.zip.Zip64Mode> r0 = org.apache.commons.compress.archivers.zip.Zip64Mode.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            org.apache.commons.compress.archivers.zip.Zip64Mode r1 = (org.apache.commons.compress.archivers.zip.Zip64Mode) r1
            return r1
    }

    public static org.apache.commons.compress.archivers.zip.Zip64Mode[] values() {
            org.apache.commons.compress.archivers.zip.Zip64Mode[] r0 = org.apache.commons.compress.archivers.zip.Zip64Mode.$VALUES
            java.lang.Object r0 = r0.clone()
            org.apache.commons.compress.archivers.zip.Zip64Mode[] r0 = (org.apache.commons.compress.archivers.zip.Zip64Mode[]) r0
            return r0
    }
}
