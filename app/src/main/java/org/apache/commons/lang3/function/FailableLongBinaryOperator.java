package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface FailableLongBinaryOperator<E extends java.lang.Throwable> {
    long applyAsLong(long r1, long r3) throws java.lang.Throwable;
}
