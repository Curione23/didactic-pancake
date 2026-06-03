package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
public class Zip64RequiredException extends java.util.zip.ZipException {
    static final java.lang.String ARCHIVE_TOO_BIG_MESSAGE = "Archive's size exceeds the limit of 4GByte.";
    static final java.lang.String CENTRAL_DIRECTORY_DISK_NUMBER_TOO_BIG_MESSAGE = "Number of the disk with the start of Central Directory exceeds the limit of 65535.";
    static final java.lang.String CENTRAL_DIRECTORY_SIZE_TOO_BIG_MESSAGE = "The size of the entire central directory exceeds the limit of 4GByte.";
    static final java.lang.String DISK_NUMBER_TOO_BIG_MESSAGE = "Number of the disk of End Of Central Directory exceeds the limit of 65535.";
    static final java.lang.String TOO_MANY_ENTRIES_MESSAGE = "Archive contains more than 65535 entries.";
    static final java.lang.String TOO_MANY_ENTRIES_ON_DISK_MESSAGE = "Number of entries on this disk exceeds the limit of 65535.";
    private static final long serialVersionUID = 20110809;

    public Zip64RequiredException(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static java.lang.String getEntryTooBigMessage(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r1) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.String r0 = "'s size exceeds the limit of 4GByte."
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r1 = r1.toString()
            return r1
    }
}
