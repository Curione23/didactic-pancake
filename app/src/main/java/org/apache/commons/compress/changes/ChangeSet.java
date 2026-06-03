package org.apache.commons.compress.changes;

import org.apache.commons.compress.archivers.ArchiveEntry;

/* JADX INFO: loaded from: classes2.dex */
public final class ChangeSet<E extends org.apache.commons.compress.archivers.ArchiveEntry> {
    private final java.util.Set<org.apache.commons.compress.changes.Change<E>> changes;

    public ChangeSet() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.changes = r0
            return
    }

    private void addAddition(org.apache.commons.compress.changes.Change<E> r5) {
            r4 = this;
            org.apache.commons.compress.changes.Change$ChangeType r0 = org.apache.commons.compress.changes.Change.ChangeType.ADD
            org.apache.commons.compress.changes.Change$ChangeType r1 = r5.getType()
            if (r0 != r1) goto L59
            java.io.InputStream r0 = r5.getInputStream()
            if (r0 != 0) goto Lf
            goto L59
        Lf:
            java.util.Set<org.apache.commons.compress.changes.Change<E extends org.apache.commons.compress.archivers.ArchiveEntry>> r0 = r4.changes
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L54
            java.util.Set<org.apache.commons.compress.changes.Change<E extends org.apache.commons.compress.archivers.ArchiveEntry>> r0 = r4.changes
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L54
            java.lang.Object r1 = r0.next()
            org.apache.commons.compress.changes.Change r1 = (org.apache.commons.compress.changes.Change) r1
            org.apache.commons.compress.changes.Change$ChangeType r2 = r1.getType()
            org.apache.commons.compress.changes.Change$ChangeType r3 = org.apache.commons.compress.changes.Change.ChangeType.ADD
            if (r2 != r3) goto L1d
            org.apache.commons.compress.archivers.ArchiveEntry r2 = r1.getEntry()
            if (r2 == 0) goto L1d
            org.apache.commons.compress.archivers.ArchiveEntry r1 = r1.getEntry()
            org.apache.commons.compress.archivers.ArchiveEntry r2 = r5.getEntry()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L1d
            boolean r1 = r5.isReplaceMode()
            if (r1 == 0) goto L53
            r0.remove()
            java.util.Set<org.apache.commons.compress.changes.Change<E extends org.apache.commons.compress.archivers.ArchiveEntry>> r0 = r4.changes
            r0.add(r5)
        L53:
            return
        L54:
            java.util.Set<org.apache.commons.compress.changes.Change<E extends org.apache.commons.compress.archivers.ArchiveEntry>> r0 = r4.changes
            r0.add(r5)
        L59:
            return
    }

    private void addDeletion(org.apache.commons.compress.changes.Change<E> r7) {
            r6 = this;
            org.apache.commons.compress.changes.Change$ChangeType r0 = org.apache.commons.compress.changes.Change.ChangeType.DELETE
            org.apache.commons.compress.changes.Change$ChangeType r1 = r7.getType()
            if (r0 == r1) goto L10
            org.apache.commons.compress.changes.Change$ChangeType r0 = org.apache.commons.compress.changes.Change.ChangeType.DELETE_DIR
            org.apache.commons.compress.changes.Change$ChangeType r1 = r7.getType()
            if (r0 != r1) goto L16
        L10:
            java.lang.String r0 = r7.getTargetFileName()
            if (r0 != 0) goto L17
        L16:
            return
        L17:
            java.lang.String r0 = r7.getTargetFileName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r2 = "/.*"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            if (r0 == 0) goto L8b
            java.util.Set<org.apache.commons.compress.changes.Change<E extends org.apache.commons.compress.archivers.ArchiveEntry>> r2 = r6.changes
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L8b
            java.util.Set<org.apache.commons.compress.changes.Change<E extends org.apache.commons.compress.archivers.ArchiveEntry>> r2 = r6.changes
            java.util.Iterator r2 = r2.iterator()
        L42:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L8b
            java.lang.Object r3 = r2.next()
            org.apache.commons.compress.changes.Change r3 = (org.apache.commons.compress.changes.Change) r3
            org.apache.commons.compress.changes.Change$ChangeType r4 = r3.getType()
            org.apache.commons.compress.changes.Change$ChangeType r5 = org.apache.commons.compress.changes.Change.ChangeType.ADD
            if (r4 != r5) goto L42
            org.apache.commons.compress.archivers.ArchiveEntry r4 = r3.getEntry()
            if (r4 == 0) goto L42
            org.apache.commons.compress.archivers.ArchiveEntry r3 = r3.getEntry()
            java.lang.String r3 = r3.getName()
            if (r3 != 0) goto L67
            goto L42
        L67:
            org.apache.commons.compress.changes.Change$ChangeType r4 = org.apache.commons.compress.changes.Change.ChangeType.DELETE
            org.apache.commons.compress.changes.Change$ChangeType r5 = r7.getType()
            if (r4 != r5) goto L75
            boolean r4 = r0.equals(r3)
            if (r4 != 0) goto L87
        L75:
            org.apache.commons.compress.changes.Change$ChangeType r4 = org.apache.commons.compress.changes.Change.ChangeType.DELETE_DIR
            org.apache.commons.compress.changes.Change$ChangeType r5 = r7.getType()
            if (r4 != r5) goto L42
            java.util.regex.Matcher r3 = r1.matcher(r3)
            boolean r3 = r3.matches()
            if (r3 == 0) goto L42
        L87:
            r2.remove()
            goto L42
        L8b:
            java.util.Set<org.apache.commons.compress.changes.Change<E extends org.apache.commons.compress.archivers.ArchiveEntry>> r0 = r6.changes
            r0.add(r7)
            return
    }

    public void add(E r2, java.io.InputStream r3) {
            r1 = this;
            r0 = 1
            r1.add(r2, r3, r0)
            return
    }

    public void add(E r2, java.io.InputStream r3, boolean r4) {
            r1 = this;
            org.apache.commons.compress.changes.Change r0 = new org.apache.commons.compress.changes.Change
            r0.<init>(r2, r3, r4)
            r1.addAddition(r0)
            return
    }

    public void delete(java.lang.String r3) {
            r2 = this;
            org.apache.commons.compress.changes.Change r0 = new org.apache.commons.compress.changes.Change
            org.apache.commons.compress.changes.Change$ChangeType r1 = org.apache.commons.compress.changes.Change.ChangeType.DELETE
            r0.<init>(r3, r1)
            r2.addDeletion(r0)
            return
    }

    public void deleteDir(java.lang.String r3) {
            r2 = this;
            org.apache.commons.compress.changes.Change r0 = new org.apache.commons.compress.changes.Change
            org.apache.commons.compress.changes.Change$ChangeType r1 = org.apache.commons.compress.changes.Change.ChangeType.DELETE_DIR
            r0.<init>(r3, r1)
            r2.addDeletion(r0)
            return
    }

    java.util.Set<org.apache.commons.compress.changes.Change<E>> getChanges() {
            r2 = this;
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            java.util.Set<org.apache.commons.compress.changes.Change<E extends org.apache.commons.compress.archivers.ArchiveEntry>> r1 = r2.changes
            r0.<init>(r1)
            return r0
    }
}
