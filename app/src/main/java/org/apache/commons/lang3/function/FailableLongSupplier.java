package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface FailableLongSupplier<E extends java.lang.Throwable> {
    long getAsLong() throws java.lang.Throwable;
}
