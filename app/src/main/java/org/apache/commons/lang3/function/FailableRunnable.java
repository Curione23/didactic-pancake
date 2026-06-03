package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface FailableRunnable<E extends java.lang.Throwable> {
    void run() throws java.lang.Throwable;
}
