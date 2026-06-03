package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface FailableCallable<R, E extends java.lang.Throwable> {
    R call() throws java.lang.Throwable;
}
