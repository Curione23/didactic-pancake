package org.apache.commons.compress.archivers.ar;

/* JADX INFO: loaded from: classes2.dex */
public class ArArchiveOutputStream extends org.apache.commons.compress.archivers.ArchiveOutputStream<org.apache.commons.compress.archivers.ar.ArArchiveEntry> {
    public static final int LONGFILE_BSD = 1;
    public static final int LONGFILE_ERROR = 0;
    private static final char PAD = '\n';
    private static final char SPACE = ' ';
    private long entryOffset;
    private int headerPlus;
    private int longFileMode;
    private org.apache.commons.compress.archivers.ar.ArArchiveEntry prevEntry;
    private boolean prevEntryOpen;

    public ArArchiveOutputStream(java.io.OutputStream r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.longFileMode = r1
            return
    }

    private java.lang.String checkLength(java.lang.String r2, int r3, java.lang.String r4) throws java.io.IOException {
            r1 = this;
            int r0 = r2.length()
            if (r0 > r3) goto L7
            return r2
        L7:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " too long"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    private int pad(int r2, int r3, char r4) throws java.io.IOException {
            r1 = this;
            int r2 = r3 - r2
            if (r2 <= 0) goto Ld
            r0 = 0
        L5:
            if (r0 >= r2) goto Ld
            r1.write(r4)
            int r0 = r0 + 1
            goto L5
        Ld:
            return r3
    }

    private int write(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            byte[] r2 = r2.getBytes(r0)
            r1.write(r2)
            int r2 = r2.length
            return r2
    }

    private void writeArchiveHeader() throws java.io.IOException {
            r2 = this;
            java.io.OutputStream r0 = r2.out
            java.lang.String r1 = "!<arch>\n"
            byte[] r1 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes(r1)
            r0.write(r1)
            return
    }

    private int writeEntryHeader(org.apache.commons.compress.archivers.ar.ArArchiveEntry r12) throws java.io.IOException {
            r11 = this;
            java.lang.String r0 = r12.getName()
            int r1 = r0.length()
            int r2 = r11.longFileMode
            r3 = 16
            if (r2 != 0) goto L26
            if (r1 > r3) goto L11
            goto L26
        L11:
            java.io.IOException r12 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "File name too long, > 16 chars: "
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            throw r12
        L26:
            r4 = 1
            r5 = 32
            r6 = 0
            if (r4 != r2) goto L64
            if (r1 > r3) goto L35
            int r2 = r0.indexOf(r5)
            r7 = -1
            if (r2 <= r7) goto L64
        L35:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r7 = "#1/"
            r2.<init>(r7)
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r2 = r2.toString()
            int r7 = r2.length()
            if (r7 > r3) goto L4f
            int r2 = r11.write(r2)
            goto L69
        L4f:
            java.io.IOException r12 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "File length too long, > 16 chars: "
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            throw r12
        L64:
            int r2 = r11.write(r0)
            r4 = r6
        L69:
            int r2 = r11.pad(r2, r3, r5)
            long r7 = r12.getLastModified()
            java.lang.String r3 = java.lang.String.valueOf(r7)
            r7 = 12
            java.lang.String r8 = "Last modified"
            java.lang.String r3 = r11.checkLength(r3, r7, r8)
            int r3 = r11.write(r3)
            int r2 = r2 + r3
            r3 = 28
            int r2 = r11.pad(r2, r3, r5)
            int r3 = r12.getUserId()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r7 = "User ID"
            r8 = 6
            java.lang.String r3 = r11.checkLength(r3, r8, r7)
            int r3 = r11.write(r3)
            int r2 = r2 + r3
            r3 = 34
            int r2 = r11.pad(r2, r3, r5)
            int r3 = r12.getGroupId()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r7 = "Group ID"
            java.lang.String r3 = r11.checkLength(r3, r8, r7)
            int r3 = r11.write(r3)
            int r2 = r2 + r3
            r3 = 40
            int r2 = r11.pad(r2, r3, r5)
            int r3 = r12.getMode()
            r7 = 8
            java.lang.String r3 = java.lang.Integer.toString(r3, r7)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r8 = "File mode"
            java.lang.String r3 = r11.checkLength(r3, r7, r8)
            int r3 = r11.write(r3)
            int r2 = r2 + r3
            r3 = 48
            int r2 = r11.pad(r2, r3, r5)
            long r7 = r12.getLength()
            if (r4 == 0) goto Le1
            goto Le2
        Le1:
            r1 = r6
        Le2:
            long r9 = (long) r1
            long r7 = r7 + r9
            java.lang.String r12 = java.lang.String.valueOf(r7)
            r1 = 10
            java.lang.String r3 = "Size"
            java.lang.String r12 = r11.checkLength(r12, r1, r3)
            int r12 = r11.write(r12)
            int r2 = r2 + r12
            r12 = 58
            int r12 = r11.pad(r2, r12, r5)
            java.lang.String r1 = "`\n"
            int r1 = r11.write(r1)
            int r12 = r12 + r1
            if (r4 == 0) goto L109
            int r0 = r11.write(r0)
            int r12 = r12 + r0
        L109:
            return r12
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            r0 = 0
            boolean r1 = r2.isFinished()     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto La
            r2.finish()     // Catch: java.lang.Throwable -> L10
        La:
            r2.prevEntry = r0
            super.close()
            return
        L10:
            r1 = move-exception
            r2.prevEntry = r0
            super.close()
            throw r1
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public void closeArchiveEntry() throws java.io.IOException {
            r4 = this;
            r4.checkFinished()
            org.apache.commons.compress.archivers.ar.ArArchiveEntry r0 = r4.prevEntry
            if (r0 == 0) goto L25
            boolean r0 = r4.prevEntryOpen
            if (r0 == 0) goto L25
            int r0 = r4.headerPlus
            long r0 = (long) r0
            long r2 = r4.entryOffset
            long r0 = r0 + r2
            r2 = 2
            long r0 = r0 % r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L21
            java.io.OutputStream r0 = r4.out
            r1 = 10
            r0.write(r1)
        L21:
            r0 = 0
            r4.prevEntryOpen = r0
            return
        L25:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "No current entry to close"
            r0.<init>(r1)
            throw r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public /* bridge */ /* synthetic */ org.apache.commons.compress.archivers.ArchiveEntry createArchiveEntry(java.io.File r1, java.lang.String r2) throws java.io.IOException {
            r0 = this;
            org.apache.commons.compress.archivers.ar.ArArchiveEntry r1 = r0.createArchiveEntry(r1, r2)
            return r1
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public /* bridge */ /* synthetic */ org.apache.commons.compress.archivers.ArchiveEntry createArchiveEntry(java.nio.file.Path r1, java.lang.String r2, java.nio.file.LinkOption[] r3) throws java.io.IOException {
            r0 = this;
            org.apache.commons.compress.archivers.ar.ArArchiveEntry r1 = r0.createArchiveEntry(r1, r2, r3)
            return r1
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public org.apache.commons.compress.archivers.ar.ArArchiveEntry createArchiveEntry(java.io.File r2, java.lang.String r3) throws java.io.IOException {
            r1 = this;
            r1.checkFinished()
            org.apache.commons.compress.archivers.ar.ArArchiveEntry r0 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry
            r0.<init>(r2, r3)
            return r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public org.apache.commons.compress.archivers.ar.ArArchiveEntry createArchiveEntry(java.nio.file.Path r2, java.lang.String r3, java.nio.file.LinkOption... r4) throws java.io.IOException {
            r1 = this;
            r1.checkFinished()
            org.apache.commons.compress.archivers.ar.ArArchiveEntry r0 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry
            r0.<init>(r2, r3, r4)
            return r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public void finish() throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.prevEntryOpen
            if (r0 != 0) goto Lb
            r2.checkFinished()
            super.finish()
            return
        Lb:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "This archive contains unclosed entries."
            r0.<init>(r1)
            throw r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public /* bridge */ /* synthetic */ void putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry r1) throws java.io.IOException {
            r0 = this;
            org.apache.commons.compress.archivers.ar.ArArchiveEntry r1 = (org.apache.commons.compress.archivers.ar.ArArchiveEntry) r1
            r0.putArchiveEntry(r1)
            return
    }

    public void putArchiveEntry(org.apache.commons.compress.archivers.ar.ArArchiveEntry r5) throws java.io.IOException {
            r4 = this;
            r4.checkFinished()
            org.apache.commons.compress.archivers.ar.ArArchiveEntry r0 = r4.prevEntry
            if (r0 != 0) goto Lb
            r4.writeArchiveHeader()
            goto L1c
        Lb:
            long r0 = r0.getLength()
            long r2 = r4.entryOffset
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2c
            boolean r0 = r4.prevEntryOpen
            if (r0 == 0) goto L1c
            r4.closeArchiveEntry()
        L1c:
            r4.prevEntry = r5
            int r5 = r4.writeEntryHeader(r5)
            r4.headerPlus = r5
            r0 = 0
            r4.entryOffset = r0
            r5 = 1
            r4.prevEntryOpen = r5
            return
        L2c:
            java.io.IOException r5 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Length does not match entry ("
            r0.<init>(r1)
            org.apache.commons.compress.archivers.ar.ArArchiveEntry r1 = r4.prevEntry
            long r1 = r1.getLength()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " != "
            java.lang.StringBuilder r0 = r0.append(r1)
            long r1 = r4.entryOffset
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }

    public void setLongFileMode(int r1) {
            r0 = this;
            r0.longFileMode = r1
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            java.io.OutputStream r0 = r2.out
            r0.write(r3, r4, r5)
            r2.count(r5)
            long r3 = r2.entryOffset
            long r0 = (long) r5
            long r3 = r3 + r0
            r2.entryOffset = r3
            return
    }
}
