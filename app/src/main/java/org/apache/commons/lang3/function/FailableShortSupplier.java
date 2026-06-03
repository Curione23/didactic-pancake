package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface FailableShortSupplier<E extends java.lang.Throwable> {
    short getAsShort() throws java.lang.Throwable;
}
