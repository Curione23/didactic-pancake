package org.apache.commons.compress.archivers.sevenz;

/* JADX INFO: loaded from: classes2.dex */
final class Coder {
    final byte[] decompressionMethodId;
    final long numInStreams;
    final long numOutStreams;
    final byte[] properties;

    Coder(byte[] r1, long r2, long r4, byte[] r6) {
            r0 = this;
            r0.<init>()
            r0.decompressionMethodId = r1
            r0.numInStreams = r2
            r0.numOutStreams = r4
            r0.properties = r6
            return
    }
}
