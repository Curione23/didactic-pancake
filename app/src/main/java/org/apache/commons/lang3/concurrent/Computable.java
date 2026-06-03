package org.apache.commons.lang3.concurrent;

/* JADX INFO: loaded from: classes2.dex */
public interface Computable<I, O> {
    O compute(I r1) throws java.lang.InterruptedException;
}
