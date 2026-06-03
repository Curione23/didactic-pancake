package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
public interface ZipEncoding {
    boolean canEncode(java.lang.String r1);

    java.lang.String decode(byte[] r1) throws java.io.IOException;

    java.nio.ByteBuffer encode(java.lang.String r1) throws java.io.IOException;
}
