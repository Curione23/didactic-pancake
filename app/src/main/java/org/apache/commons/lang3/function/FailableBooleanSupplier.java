package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface FailableBooleanSupplier<E extends java.lang.Throwable> {
    boolean getAsBoolean() throws java.lang.Throwable;
}
