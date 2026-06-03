package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
public interface ExtraFieldParsingBehavior extends org.apache.commons.compress.archivers.zip.UnparseableExtraFieldBehavior {
    org.apache.commons.compress.archivers.zip.ZipExtraField createExtraField(org.apache.commons.compress.archivers.zip.ZipShort r1) throws java.util.zip.ZipException, java.lang.InstantiationException, java.lang.IllegalAccessException;

    org.apache.commons.compress.archivers.zip.ZipExtraField fill(org.apache.commons.compress.archivers.zip.ZipExtraField r1, byte[] r2, int r3, int r4, boolean r5) throws java.util.zip.ZipException;
}
