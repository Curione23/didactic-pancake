package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface FailableIntBinaryOperator<E extends java.lang.Throwable> {
    int applyAsInt(int r1, int r2) throws java.lang.Throwable;
}
