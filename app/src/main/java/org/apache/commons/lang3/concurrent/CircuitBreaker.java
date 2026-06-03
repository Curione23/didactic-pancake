package org.apache.commons.lang3.concurrent;

/* JADX INFO: loaded from: classes2.dex */
public interface CircuitBreaker<T> {
    boolean checkState();

    void close();

    boolean incrementAndCheckState(T r1);

    boolean isClosed();

    boolean isOpen();

    void open();
}
