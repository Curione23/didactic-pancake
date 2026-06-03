package org.apache.commons.compress.changes;

import org.apache.commons.compress.archivers.ArchiveEntry;

/* JADX INFO: loaded from: classes2.dex */
final class Change<E extends org.apache.commons.compress.archivers.ArchiveEntry> {
    private final E entry;
    private final java.io.InputStream inputStream;
    private final boolean replaceMode;
    private final java.lang.String targetFileName;
    private final org.apache.commons.compress.changes.Change.ChangeType type;

    enum ChangeType extends java.lang.Enum<org.apache.commons.compress.changes.Change.ChangeType> {
        private static final /* synthetic */ org.apache.commons.compress.changes.Change.ChangeType[] $VALUES = null;
        public static final org.apache.commons.compress.changes.Change.ChangeType ADD = null;
        public static final org.apache.commons.compress.changes.Change.ChangeType DELETE = null;
        public static final org.apache.commons.compress.changes.Change.ChangeType DELETE_DIR = null;
        public static final org.apache.commons.compress.changes.Change.ChangeType MOVE = null;

        private static /* synthetic */ org.apache.commons.compress.changes.Change.ChangeType[] $values() {
                org.apache.commons.compress.changes.Change$ChangeType r0 = org.apache.commons.compress.changes.Change.ChangeType.DELETE
                org.apache.commons.compress.changes.Change$ChangeType r1 = org.apache.commons.compress.changes.Change.ChangeType.ADD
                org.apache.commons.compress.changes.Change$ChangeType r2 = org.apache.commons.compress.changes.Change.ChangeType.MOVE
                org.apache.commons.compress.changes.Change$ChangeType r3 = org.apache.commons.compress.changes.Change.ChangeType.DELETE_DIR
                org.apache.commons.compress.changes.Change$ChangeType[] r0 = new org.apache.commons.compress.changes.Change.ChangeType[]{r0, r1, r2, r3}
                return r0
        }

        static {
                org.apache.commons.compress.changes.Change$ChangeType r0 = new org.apache.commons.compress.changes.Change$ChangeType
                java.lang.String r1 = "DELETE"
                r2 = 0
                r0.<init>(r1, r2)
                org.apache.commons.compress.changes.Change.ChangeType.DELETE = r0
                org.apache.commons.compress.changes.Change$ChangeType r0 = new org.apache.commons.compress.changes.Change$ChangeType
                java.lang.String r1 = "ADD"
                r2 = 1
                r0.<init>(r1, r2)
                org.apache.commons.compress.changes.Change.ChangeType.ADD = r0
                org.apache.commons.compress.changes.Change$ChangeType r0 = new org.apache.commons.compress.changes.Change$ChangeType
                java.lang.String r1 = "MOVE"
                r2 = 2
                r0.<init>(r1, r2)
                org.apache.commons.compress.changes.Change.ChangeType.MOVE = r0
                org.apache.commons.compress.changes.Change$ChangeType r0 = new org.apache.commons.compress.changes.Change$ChangeType
                java.lang.String r1 = "DELETE_DIR"
                r2 = 3
                r0.<init>(r1, r2)
                org.apache.commons.compress.changes.Change.ChangeType.DELETE_DIR = r0
                org.apache.commons.compress.changes.Change$ChangeType[] r0 = $values()
                org.apache.commons.compress.changes.Change.ChangeType.$VALUES = r0
                return
        }

        ChangeType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.apache.commons.compress.changes.Change.ChangeType valueOf(java.lang.String r1) {
                java.lang.Class<org.apache.commons.compress.changes.Change$ChangeType> r0 = org.apache.commons.compress.changes.Change.ChangeType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.apache.commons.compress.changes.Change$ChangeType r1 = (org.apache.commons.compress.changes.Change.ChangeType) r1
                return r1
        }

        public static org.apache.commons.compress.changes.Change.ChangeType[] values() {
                org.apache.commons.compress.changes.Change$ChangeType[] r0 = org.apache.commons.compress.changes.Change.ChangeType.$VALUES
                java.lang.Object r0 = r0.clone()
                org.apache.commons.compress.changes.Change$ChangeType[] r0 = (org.apache.commons.compress.changes.Change.ChangeType[]) r0
                return r0
        }
    }

    Change(java.lang.String r2, org.apache.commons.compress.changes.Change.ChangeType r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "fileName"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            java.lang.String r2 = (java.lang.String) r2
            r1.targetFileName = r2
            r1.type = r3
            r2 = 0
            r1.inputStream = r2
            r1.entry = r2
            r2 = 1
            r1.replaceMode = r2
            return
    }

    Change(E r2, java.io.InputStream r3, boolean r4) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "archiveEntry"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            org.apache.commons.compress.archivers.ArchiveEntry r2 = (org.apache.commons.compress.archivers.ArchiveEntry) r2
            r1.entry = r2
            java.lang.String r2 = "inputStream"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r3, r2)
            java.io.InputStream r2 = (java.io.InputStream) r2
            r1.inputStream = r2
            org.apache.commons.compress.changes.Change$ChangeType r2 = org.apache.commons.compress.changes.Change.ChangeType.ADD
            r1.type = r2
            r2 = 0
            r1.targetFileName = r2
            r1.replaceMode = r4
            return
    }

    E getEntry() {
            r1 = this;
            E extends org.apache.commons.compress.archivers.ArchiveEntry r0 = r1.entry
            return r0
    }

    java.io.InputStream getInputStream() {
            r1 = this;
            java.io.InputStream r0 = r1.inputStream
            return r0
    }

    java.lang.String getTargetFileName() {
            r1 = this;
            java.lang.String r0 = r1.targetFileName
            return r0
    }

    org.apache.commons.compress.changes.Change.ChangeType getType() {
            r1 = this;
            org.apache.commons.compress.changes.Change$ChangeType r0 = r1.type
            return r0
    }

    boolean isReplaceMode() {
            r1 = this;
            boolean r0 = r1.replaceMode
            return r0
    }
}
