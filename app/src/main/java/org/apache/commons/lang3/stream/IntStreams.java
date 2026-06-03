package org.apache.commons.lang3.stream;

/* JADX INFO: loaded from: classes2.dex */
public class IntStreams {
    @java.lang.Deprecated
    public IntStreams() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.stream.IntStream range(int r1) {
            r0 = 0
            java.util.stream.IntStream r1 = java.util.stream.IntStream.range(r0, r1)
            return r1
    }

    public static java.util.stream.IntStream rangeClosed(int r1) {
            r0 = 0
            java.util.stream.IntStream r1 = java.util.stream.IntStream.rangeClosed(r0, r1)
            return r1
    }
}
