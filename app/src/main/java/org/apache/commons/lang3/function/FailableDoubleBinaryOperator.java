package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface FailableDoubleBinaryOperator<E extends java.lang.Throwable> {
    double applyAsDouble(double r1, double r3) throws java.lang.Throwable;
}
