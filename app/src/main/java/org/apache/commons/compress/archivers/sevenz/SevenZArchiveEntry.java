package org.apache.commons.compress.archivers.sevenz;

/* JADX INFO: loaded from: classes2.dex */
public class SevenZArchiveEntry implements org.apache.commons.compress.archivers.ArchiveEntry {
    static final org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry[] EMPTY_SEVEN_Z_ARCHIVE_ENTRY_ARRAY = null;
    private java.nio.file.attribute.FileTime accessDate;
    private long compressedCrc;
    private long compressedSize;
    private java.lang.Iterable<? extends org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration> contentMethods;
    private long crc;
    private java.nio.file.attribute.FileTime creationDate;
    private boolean hasAccessDate;
    private boolean hasCrc;
    private boolean hasCreationDate;
    private boolean hasLastModifiedDate;
    private boolean hasStream;
    private boolean hasWindowsAttributes;
    private boolean isAntiItem;
    private boolean isDirectory;
    private java.nio.file.attribute.FileTime lastModifiedDate;
    private java.lang.String name;
    private long size;
    private int windowsAttributes;

    public static /* synthetic */ void $r8$lambda$8IPxU7dsJw6N4YzMNXp1SEHo4BQ(java.util.LinkedList r0, java.lang.Object r1) {
            r0.addLast(r1)
            return
    }

    static {
            r0 = 0
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry[] r0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry[r0]
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.EMPTY_SEVEN_Z_ARCHIVE_ENTRY_ARRAY = r0
            return
    }

    public SevenZArchiveEntry() {
            r0 = this;
            r0.<init>()
            return
    }

    private boolean equalSevenZMethods(java.lang.Iterable<? extends org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration> r5, java.lang.Iterable<? extends org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration> r6) {
            r4 = this;
            r0 = 1
            r1 = 0
            if (r5 != 0) goto L9
            if (r6 != 0) goto L7
            goto L8
        L7:
            r0 = r1
        L8:
            return r0
        L9:
            if (r6 != 0) goto Lc
            return r1
        Lc:
            java.util.Iterator r6 = r6.iterator()
            java.util.Iterator r5 = r5.iterator()
        L14:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L32
            java.lang.Object r2 = r5.next()
            org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration r2 = (org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration) r2
            boolean r3 = r6.hasNext()
            if (r3 != 0) goto L27
            return r1
        L27:
            java.lang.Object r3 = r6.next()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L14
            return r1
        L32:
            boolean r5 = r6.hasNext()
            r5 = r5 ^ r0
            return r5
    }

    @java.lang.Deprecated
    public static long javaTimeToNtfsTime(java.util.Date r2) {
            long r0 = org.apache.commons.io.file.attribute.FileTimes.toNtfsTime(r2)
            return r0
    }

    @java.lang.Deprecated
    public static java.util.Date ntfsTimeToJavaTime(long r0) {
            java.util.Date r0 = org.apache.commons.io.file.attribute.FileTimes.ntfsTimeToDate(r0)
            return r0
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto La0
            java.lang.Class r2 = r6.getClass()
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L13
            goto La0
        L13:
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r7 = (org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry) r7
            java.lang.String r2 = r6.name
            java.lang.String r3 = r7.name
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L9e
            boolean r2 = r6.hasStream
            boolean r3 = r7.hasStream
            if (r2 != r3) goto L9e
            boolean r2 = r6.isDirectory
            boolean r3 = r7.isDirectory
            if (r2 != r3) goto L9e
            boolean r2 = r6.isAntiItem
            boolean r3 = r7.isAntiItem
            if (r2 != r3) goto L9e
            boolean r2 = r6.hasCreationDate
            boolean r3 = r7.hasCreationDate
            if (r2 != r3) goto L9e
            boolean r2 = r6.hasLastModifiedDate
            boolean r3 = r7.hasLastModifiedDate
            if (r2 != r3) goto L9e
            boolean r2 = r6.hasAccessDate
            boolean r3 = r7.hasAccessDate
            if (r2 != r3) goto L9e
            java.nio.file.attribute.FileTime r2 = r6.creationDate
            java.nio.file.attribute.FileTime r3 = r7.creationDate
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L9e
            java.nio.file.attribute.FileTime r2 = r6.lastModifiedDate
            java.nio.file.attribute.FileTime r3 = r7.lastModifiedDate
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L9e
            java.nio.file.attribute.FileTime r2 = r6.accessDate
            java.nio.file.attribute.FileTime r3 = r7.accessDate
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L9e
            boolean r2 = r6.hasWindowsAttributes
            boolean r3 = r7.hasWindowsAttributes
            if (r2 != r3) goto L9e
            int r2 = r6.windowsAttributes
            int r3 = r7.windowsAttributes
            if (r2 != r3) goto L9e
            boolean r2 = r6.hasCrc
            boolean r3 = r7.hasCrc
            if (r2 != r3) goto L9e
            long r2 = r6.crc
            long r4 = r7.crc
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L9e
            long r2 = r6.compressedCrc
            long r4 = r7.compressedCrc
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L9e
            long r2 = r6.size
            long r4 = r7.size
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L9e
            long r2 = r6.compressedSize
            long r4 = r7.compressedSize
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L9e
            java.lang.Iterable<? extends org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration> r2 = r6.contentMethods
            java.lang.Iterable<? extends org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration> r7 = r7.contentMethods
            boolean r7 = r6.equalSevenZMethods(r2, r7)
            if (r7 == 0) goto L9e
            goto L9f
        L9e:
            r0 = r1
        L9f:
            return r0
        La0:
            return r1
    }

    public java.util.Date getAccessDate() {
            r1 = this;
            java.nio.file.attribute.FileTime r0 = r1.getAccessTime()
            java.util.Date r0 = org.apache.commons.io.file.attribute.FileTimes.toDate(r0)
            return r0
    }

    public java.nio.file.attribute.FileTime getAccessTime() {
            r2 = this;
            boolean r0 = r2.hasAccessDate
            if (r0 == 0) goto L7
            java.nio.file.attribute.FileTime r0 = r2.accessDate
            return r0
        L7:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "The entry doesn't have this timestamp"
            r0.<init>(r1)
            throw r0
    }

    @java.lang.Deprecated
    int getCompressedCrc() {
            r2 = this;
            long r0 = r2.compressedCrc
            int r0 = (int) r0
            return r0
    }

    long getCompressedCrcValue() {
            r2 = this;
            long r0 = r2.compressedCrc
            return r0
    }

    long getCompressedSize() {
            r2 = this;
            long r0 = r2.compressedSize
            return r0
    }

    public java.lang.Iterable<? extends org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration> getContentMethods() {
            r1 = this;
            java.lang.Iterable<? extends org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration> r0 = r1.contentMethods
            return r0
    }

    @java.lang.Deprecated
    public int getCrc() {
            r2 = this;
            long r0 = r2.crc
            int r0 = (int) r0
            return r0
    }

    public long getCrcValue() {
            r2 = this;
            long r0 = r2.crc
            return r0
    }

    public java.util.Date getCreationDate() {
            r1 = this;
            java.nio.file.attribute.FileTime r0 = r1.getCreationTime()
            java.util.Date r0 = org.apache.commons.io.file.attribute.FileTimes.toDate(r0)
            return r0
    }

    public java.nio.file.attribute.FileTime getCreationTime() {
            r2 = this;
            boolean r0 = r2.hasCreationDate
            if (r0 == 0) goto L7
            java.nio.file.attribute.FileTime r0 = r2.creationDate
            return r0
        L7:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "The entry doesn't have this timestamp"
            r0.<init>(r1)
            throw r0
    }

    public boolean getHasAccessDate() {
            r1 = this;
            boolean r0 = r1.hasAccessDate
            return r0
    }

    public boolean getHasCrc() {
            r1 = this;
            boolean r0 = r1.hasCrc
            return r0
    }

    public boolean getHasCreationDate() {
            r1 = this;
            boolean r0 = r1.hasCreationDate
            return r0
    }

    public boolean getHasLastModifiedDate() {
            r1 = this;
            boolean r0 = r1.hasLastModifiedDate
            return r0
    }

    public boolean getHasWindowsAttributes() {
            r1 = this;
            boolean r0 = r1.hasWindowsAttributes
            return r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveEntry
    public java.util.Date getLastModifiedDate() {
            r1 = this;
            java.nio.file.attribute.FileTime r0 = r1.getLastModifiedTime()
            java.util.Date r0 = org.apache.commons.io.file.attribute.FileTimes.toDate(r0)
            return r0
    }

    public java.nio.file.attribute.FileTime getLastModifiedTime() {
            r2 = this;
            boolean r0 = r2.hasLastModifiedDate
            if (r0 == 0) goto L7
            java.nio.file.attribute.FileTime r0 = r2.lastModifiedDate
            return r0
        L7:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "The entry doesn't have this timestamp"
            r0.<init>(r1)
            throw r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveEntry
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveEntry
    public long getSize() {
            r2 = this;
            long r0 = r2.size
            return r0
    }

    public int getWindowsAttributes() {
            r1 = this;
            int r0 = r1.windowsAttributes
            return r0
    }

    public boolean hasStream() {
            r1 = this;
            boolean r0 = r1.hasStream
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.getName()
            if (r0 != 0) goto L8
            r0 = 0
            goto Lc
        L8:
            int r0 = r0.hashCode()
        Lc:
            return r0
    }

    public boolean isAntiItem() {
            r1 = this;
            boolean r0 = r1.isAntiItem
            return r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveEntry
    public boolean isDirectory() {
            r1 = this;
            boolean r0 = r1.isDirectory
            return r0
    }

    public void setAccessDate(long r1) {
            r0 = this;
            java.nio.file.attribute.FileTime r1 = org.apache.commons.io.file.attribute.FileTimes.ntfsTimeToFileTime(r1)
            r0.accessDate = r1
            return
    }

    public void setAccessDate(java.util.Date r1) {
            r0 = this;
            java.nio.file.attribute.FileTime r1 = org.apache.commons.io.file.attribute.FileTimes.toFileTime(r1)
            r0.setAccessTime(r1)
            return
    }

    public void setAccessTime(java.nio.file.attribute.FileTime r2) {
            r1 = this;
            if (r2 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            r1.hasAccessDate = r0
            if (r0 == 0) goto Lb
            r1.accessDate = r2
        Lb:
            return
    }

    public void setAntiItem(boolean r1) {
            r0 = this;
            r0.isAntiItem = r1
            return
    }

    @java.lang.Deprecated
    void setCompressedCrc(int r3) {
            r2 = this;
            long r0 = (long) r3
            r2.compressedCrc = r0
            return
    }

    void setCompressedCrcValue(long r1) {
            r0 = this;
            r0.compressedCrc = r1
            return
    }

    void setCompressedSize(long r1) {
            r0 = this;
            r0.compressedSize = r1
            return
    }

    public void setContentMethods(java.lang.Iterable<? extends org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration> r3) {
            r2 = this;
            if (r3 == 0) goto L19
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.Objects.requireNonNull(r0)
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry$$ExternalSyntheticLambda0 r1 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry$$ExternalSyntheticLambda0
            r1.<init>(r0)
            r3.forEach(r1)
            java.util.List r3 = java.util.Collections.unmodifiableList(r0)
            r2.contentMethods = r3
            goto L1c
        L19:
            r3 = 0
            r2.contentMethods = r3
        L1c:
            return
    }

    public void setContentMethods(org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration... r1) {
            r0 = this;
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.setContentMethods(r1)
            return
    }

    @java.lang.Deprecated
    public void setCrc(int r3) {
            r2 = this;
            long r0 = (long) r3
            r2.crc = r0
            return
    }

    public void setCrcValue(long r1) {
            r0 = this;
            r0.crc = r1
            return
    }

    public void setCreationDate(long r1) {
            r0 = this;
            java.nio.file.attribute.FileTime r1 = org.apache.commons.io.file.attribute.FileTimes.ntfsTimeToFileTime(r1)
            r0.creationDate = r1
            return
    }

    public void setCreationDate(java.util.Date r1) {
            r0 = this;
            java.nio.file.attribute.FileTime r1 = org.apache.commons.io.file.attribute.FileTimes.toFileTime(r1)
            r0.setCreationTime(r1)
            return
    }

    public void setCreationTime(java.nio.file.attribute.FileTime r2) {
            r1 = this;
            if (r2 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            r1.hasCreationDate = r0
            if (r0 == 0) goto Lb
            r1.creationDate = r2
        Lb:
            return
    }

    public void setDirectory(boolean r1) {
            r0 = this;
            r0.isDirectory = r1
            return
    }

    public void setHasAccessDate(boolean r1) {
            r0 = this;
            r0.hasAccessDate = r1
            return
    }

    public void setHasCrc(boolean r1) {
            r0 = this;
            r0.hasCrc = r1
            return
    }

    public void setHasCreationDate(boolean r1) {
            r0 = this;
            r0.hasCreationDate = r1
            return
    }

    public void setHasLastModifiedDate(boolean r1) {
            r0 = this;
            r0.hasLastModifiedDate = r1
            return
    }

    public void setHasStream(boolean r1) {
            r0 = this;
            r0.hasStream = r1
            return
    }

    public void setHasWindowsAttributes(boolean r1) {
            r0 = this;
            r0.hasWindowsAttributes = r1
            return
    }

    public void setLastModifiedDate(long r1) {
            r0 = this;
            java.nio.file.attribute.FileTime r1 = org.apache.commons.io.file.attribute.FileTimes.ntfsTimeToFileTime(r1)
            r0.lastModifiedDate = r1
            return
    }

    public void setLastModifiedDate(java.util.Date r1) {
            r0 = this;
            java.nio.file.attribute.FileTime r1 = org.apache.commons.io.file.attribute.FileTimes.toFileTime(r1)
            r0.setLastModifiedTime(r1)
            return
    }

    public void setLastModifiedTime(java.nio.file.attribute.FileTime r2) {
            r1 = this;
            if (r2 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            r1.hasLastModifiedDate = r0
            if (r0 == 0) goto Lb
            r1.lastModifiedDate = r2
        Lb:
            return
    }

    public void setName(java.lang.String r1) {
            r0 = this;
            r0.name = r1
            return
    }

    public void setSize(long r1) {
            r0 = this;
            r0.size = r1
            return
    }

    public void setWindowsAttributes(int r1) {
            r0 = this;
            r0.windowsAttributes = r1
            return
    }
}
