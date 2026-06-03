package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
interface FilterEncoder extends org.tukaani.xz.FilterCoder {
    long getFilterID();

    byte[] getFilterProps();

    org.tukaani.xz.FinishableOutputStream getOutputStream(org.tukaani.xz.FinishableOutputStream r1, org.tukaani.xz.ArrayCache r2);

    boolean supportsFlushing();
}
