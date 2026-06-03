package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface FailableDoubleSupplier<E extends java.lang.Throwable> {
    double getAsDouble() throws java.lang.Throwable;
}
