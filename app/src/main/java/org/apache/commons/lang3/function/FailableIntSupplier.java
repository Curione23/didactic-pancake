package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface FailableIntSupplier<E extends java.lang.Throwable> {
    int getAsInt() throws java.lang.Throwable;
}
