package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
public interface ZipExtraField {
    public static final int EXTRAFIELD_HEADER_SIZE = 4;

    byte[] getCentralDirectoryData();

    org.apache.commons.compress.archivers.zip.ZipShort getCentralDirectoryLength();

    org.apache.commons.compress.archivers.zip.ZipShort getHeaderId();

    byte[] getLocalFileDataData();

    org.apache.commons.compress.archivers.zip.ZipShort getLocalFileDataLength();

    void parseFromCentralDirectoryData(byte[] r1, int r2, int r3) throws java.util.zip.ZipException;

    void parseFromLocalFileData(byte[] r1, int r2, int r3) throws java.util.zip.ZipException;
}
