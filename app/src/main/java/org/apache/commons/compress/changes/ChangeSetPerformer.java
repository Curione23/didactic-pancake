package org.apache.commons.compress.changes;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.ArchiveOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class ChangeSetPerformer<I extends org.apache.commons.compress.archivers.ArchiveInputStream<E>, O extends org.apache.commons.compress.archivers.ArchiveOutputStream<E>, E extends org.apache.commons.compress.archivers.ArchiveEntry> {
    private final java.util.Set<org.apache.commons.compress.changes.Change<E>> changes;

    private interface ArchiveEntryIterator<E extends org.apache.commons.compress.archivers.ArchiveEntry> {
        java.io.InputStream getInputStream() throws java.io.IOException;

        boolean hasNext() throws java.io.IOException;

        E next();
    }

    private static final class ArchiveInputStreamIterator<E extends org.apache.commons.compress.archivers.ArchiveEntry> implements org.apache.commons.compress.changes.ChangeSetPerformer.ArchiveEntryIterator<E> {
        private final org.apache.commons.compress.archivers.ArchiveInputStream<E> inputStream;
        private E next;

        ArchiveInputStreamIterator(org.apache.commons.compress.archivers.ArchiveInputStream<E> r1) {
                r0 = this;
                r0.<init>()
                r0.inputStream = r1
                return
        }

        @Override // org.apache.commons.compress.changes.ChangeSetPerformer.ArchiveEntryIterator
        public java.io.InputStream getInputStream() {
                r1 = this;
                org.apache.commons.compress.archivers.ArchiveInputStream<E extends org.apache.commons.compress.archivers.ArchiveEntry> r0 = r1.inputStream
                return r0
        }

        @Override // org.apache.commons.compress.changes.ChangeSetPerformer.ArchiveEntryIterator
        public boolean hasNext() throws java.io.IOException {
                r1 = this;
                org.apache.commons.compress.archivers.ArchiveInputStream<E extends org.apache.commons.compress.archivers.ArchiveEntry> r0 = r1.inputStream
                org.apache.commons.compress.archivers.ArchiveEntry r0 = r0.getNextEntry()
                r1.next = r0
                if (r0 == 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // org.apache.commons.compress.changes.ChangeSetPerformer.ArchiveEntryIterator
        public E next() {
                r1 = this;
                E extends org.apache.commons.compress.archivers.ArchiveEntry r0 = r1.next
                return r0
        }
    }

    private static final class ZipFileIterator implements org.apache.commons.compress.changes.ChangeSetPerformer.ArchiveEntryIterator<org.apache.commons.compress.archivers.zip.ZipArchiveEntry> {
        private org.apache.commons.compress.archivers.zip.ZipArchiveEntry currentEntry;
        private final java.util.Enumeration<org.apache.commons.compress.archivers.zip.ZipArchiveEntry> nestedEnumeration;
        private final org.apache.commons.compress.archivers.zip.ZipFile zipFile;

        ZipFileIterator(org.apache.commons.compress.archivers.zip.ZipFile r1) {
                r0 = this;
                r0.<init>()
                r0.zipFile = r1
                java.util.Enumeration r1 = r1.getEntriesInPhysicalOrder()
                r0.nestedEnumeration = r1
                return
        }

        @Override // org.apache.commons.compress.changes.ChangeSetPerformer.ArchiveEntryIterator
        public java.io.InputStream getInputStream() throws java.io.IOException {
                r2 = this;
                org.apache.commons.compress.archivers.zip.ZipFile r0 = r2.zipFile
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry r1 = r2.currentEntry
                java.io.InputStream r0 = r0.getInputStream(r1)
                return r0
        }

        @Override // org.apache.commons.compress.changes.ChangeSetPerformer.ArchiveEntryIterator
        public boolean hasNext() {
                r1 = this;
                java.util.Enumeration<org.apache.commons.compress.archivers.zip.ZipArchiveEntry> r0 = r1.nestedEnumeration
                boolean r0 = r0.hasMoreElements()
                return r0
        }

        @Override // org.apache.commons.compress.changes.ChangeSetPerformer.ArchiveEntryIterator
        public /* bridge */ /* synthetic */ org.apache.commons.compress.archivers.ArchiveEntry next() {
                r1 = this;
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = r1.next()
                return r0
        }

        @Override // org.apache.commons.compress.changes.ChangeSetPerformer.ArchiveEntryIterator
        public org.apache.commons.compress.archivers.zip.ZipArchiveEntry next() {
                r1 = this;
                java.util.Enumeration<org.apache.commons.compress.archivers.zip.ZipArchiveEntry> r0 = r1.nestedEnumeration
                java.lang.Object r0 = r0.nextElement()
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = (org.apache.commons.compress.archivers.zip.ZipArchiveEntry) r0
                r1.currentEntry = r0
                return r0
        }
    }

    public ChangeSetPerformer(org.apache.commons.compress.changes.ChangeSet<E> r1) {
            r0 = this;
            r0.<init>()
            java.util.Set r1 = r1.getChanges()
            r0.changes = r1
            return
    }

    private void copyStream(java.io.InputStream r1, O r2, E r3) throws java.io.IOException {
            r0 = this;
            r2.putArchiveEntry(r3)
            org.apache.commons.io.IOUtils.copy(r1, r2)
            r2.closeArchiveEntry()
            return
    }

    private boolean isDeletedLater(java.util.Set<org.apache.commons.compress.changes.Change<E>> r5, E r6) {
            r4 = this;
            java.lang.String r6 = r6.getName()
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L4c
            java.util.Iterator r5 = r5.iterator()
        Le:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L4c
            java.lang.Object r0 = r5.next()
            org.apache.commons.compress.changes.Change r0 = (org.apache.commons.compress.changes.Change) r0
            org.apache.commons.compress.changes.Change$ChangeType r1 = r0.getType()
            java.lang.String r0 = r0.getTargetFileName()
            org.apache.commons.compress.changes.Change$ChangeType r2 = org.apache.commons.compress.changes.Change.ChangeType.DELETE
            r3 = 1
            if (r1 != r2) goto L2e
            boolean r2 = r6.equals(r0)
            if (r2 == 0) goto L2e
            return r3
        L2e:
            org.apache.commons.compress.changes.Change$ChangeType r2 = org.apache.commons.compress.changes.Change.ChangeType.DELETE_DIR
            if (r1 != r2) goto Le
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            boolean r0 = r6.startsWith(r0)
            if (r0 == 0) goto Le
            return r3
        L4c:
            r5 = 0
            return r5
    }

    private org.apache.commons.compress.changes.ChangeSetResults perform(org.apache.commons.compress.changes.ChangeSetPerformer.ArchiveEntryIterator<E> r9, O r10) throws java.io.IOException {
            r8 = this;
            org.apache.commons.compress.changes.ChangeSetResults r0 = new org.apache.commons.compress.changes.ChangeSetResults
            r0.<init>()
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            java.util.Set<org.apache.commons.compress.changes.Change<E extends org.apache.commons.compress.archivers.ArchiveEntry>> r2 = r8.changes
            r1.<init>(r2)
            java.util.Iterator r2 = r1.iterator()
        L10:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L44
            java.lang.Object r3 = r2.next()
            org.apache.commons.compress.changes.Change r3 = (org.apache.commons.compress.changes.Change) r3
            org.apache.commons.compress.changes.Change$ChangeType r4 = r3.getType()
            org.apache.commons.compress.changes.Change$ChangeType r5 = org.apache.commons.compress.changes.Change.ChangeType.ADD
            if (r4 != r5) goto L10
            boolean r4 = r3.isReplaceMode()
            if (r4 == 0) goto L10
            java.io.InputStream r4 = r3.getInputStream()
            org.apache.commons.compress.archivers.ArchiveEntry r5 = r3.getEntry()
            r8.copyStream(r4, r10, r5)
            r2.remove()
            org.apache.commons.compress.archivers.ArchiveEntry r3 = r3.getEntry()
            java.lang.String r3 = r3.getName()
            r0.addedFromChangeSet(r3)
            goto L10
        L44:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto Lc3
            org.apache.commons.compress.archivers.ArchiveEntry r2 = r9.next()
            java.util.Iterator r3 = r1.iterator()
        L52:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto La4
            java.lang.Object r4 = r3.next()
            org.apache.commons.compress.changes.Change r4 = (org.apache.commons.compress.changes.Change) r4
            org.apache.commons.compress.changes.Change$ChangeType r5 = r4.getType()
            java.lang.String r6 = r2.getName()
            org.apache.commons.compress.changes.Change$ChangeType r7 = org.apache.commons.compress.changes.Change.ChangeType.DELETE
            if (r5 != r7) goto L7d
            if (r6 == 0) goto L7d
            java.lang.String r4 = r4.getTargetFileName()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L52
            r3.remove()
            r0.deleted(r6)
            goto L44
        L7d:
            org.apache.commons.compress.changes.Change$ChangeType r7 = org.apache.commons.compress.changes.Change.ChangeType.DELETE_DIR
            if (r5 != r7) goto L52
            if (r6 == 0) goto L52
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r4 = r4.getTargetFileName()
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r5 = "/"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            boolean r4 = r6.startsWith(r4)
            if (r4 == 0) goto L52
            r0.deleted(r6)
            goto L44
        La4:
            boolean r3 = r8.isDeletedLater(r1, r2)
            if (r3 != 0) goto L44
            java.lang.String r3 = r2.getName()
            boolean r3 = r0.hasBeenAdded(r3)
            if (r3 != 0) goto L44
            java.io.InputStream r3 = r9.getInputStream()
            r8.copyStream(r3, r10, r2)
            java.lang.String r2 = r2.getName()
            r0.addedFromStream(r2)
            goto L44
        Lc3:
            java.util.Iterator r9 = r1.iterator()
        Lc7:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L109
            java.lang.Object r1 = r9.next()
            org.apache.commons.compress.changes.Change r1 = (org.apache.commons.compress.changes.Change) r1
            org.apache.commons.compress.changes.Change$ChangeType r2 = r1.getType()
            org.apache.commons.compress.changes.Change$ChangeType r3 = org.apache.commons.compress.changes.Change.ChangeType.ADD
            if (r2 != r3) goto Lc7
            boolean r2 = r1.isReplaceMode()
            if (r2 != 0) goto Lc7
            org.apache.commons.compress.archivers.ArchiveEntry r2 = r1.getEntry()
            java.lang.String r2 = r2.getName()
            boolean r2 = r0.hasBeenAdded(r2)
            if (r2 != 0) goto Lc7
            java.io.InputStream r2 = r1.getInputStream()
            org.apache.commons.compress.archivers.ArchiveEntry r3 = r1.getEntry()
            r8.copyStream(r2, r10, r3)
            r9.remove()
            org.apache.commons.compress.archivers.ArchiveEntry r1 = r1.getEntry()
            java.lang.String r1 = r1.getName()
            r0.addedFromChangeSet(r1)
            goto Lc7
        L109:
            r10.finish()
            return r0
    }

    public org.apache.commons.compress.changes.ChangeSetResults perform(I r2, O r3) throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.changes.ChangeSetPerformer$ArchiveInputStreamIterator r0 = new org.apache.commons.compress.changes.ChangeSetPerformer$ArchiveInputStreamIterator
            r0.<init>(r2)
            org.apache.commons.compress.changes.ChangeSetResults r2 = r1.perform(r0, r3)
            return r2
    }

    public org.apache.commons.compress.changes.ChangeSetResults perform(org.apache.commons.compress.archivers.zip.ZipFile r2, O r3) throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.changes.ChangeSetPerformer$ZipFileIterator r0 = new org.apache.commons.compress.changes.ChangeSetPerformer$ZipFileIterator
            r0.<init>(r2)
            org.apache.commons.compress.changes.ChangeSetResults r2 = r1.perform(r0, r3)
            return r2
    }
}
