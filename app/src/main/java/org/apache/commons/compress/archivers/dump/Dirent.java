package org.apache.commons.compress.archivers.dump;

/* JADX INFO: loaded from: classes2.dex */
final class Dirent {
    private final int ino;
    private final java.lang.String name;
    private final int parentIno;
    private final int type;

    Dirent(int r1, int r2, int r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.ino = r1
            r0.parentIno = r2
            r0.type = r3
            r0.name = r4
            return
    }

    int getIno() {
            r1 = this;
            int r0 = r1.ino
            return r0
    }

    java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    int getParentIno() {
            r1 = this;
            int r0 = r1.parentIno
            return r0
    }

    int getType() {
            r1 = this;
            int r0 = r1.type
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.ino
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = r2.name
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "[%d]: %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }
}
