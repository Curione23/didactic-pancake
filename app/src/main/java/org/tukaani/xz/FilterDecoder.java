package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
interface FilterDecoder extends org.tukaani.xz.FilterCoder {
    java.io.InputStream getInputStream(java.io.InputStream r1, org.tukaani.xz.ArrayCache r2);

    int getMemoryUsage();
}
