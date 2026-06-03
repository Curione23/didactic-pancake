package org.apache.commons.lang3.builder;

import java.lang.Throwable;
import org.apache.commons.lang3.builder.AbstractSupplier;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractSupplier<T, B extends org.apache.commons.lang3.builder.AbstractSupplier<T, B, E>, E extends java.lang.Throwable> implements org.apache.commons.lang3.function.FailableSupplier<T, E> {
    public AbstractSupplier() {
            r0 = this;
            r0.<init>()
            return
    }

    protected B asThis() {
            r0 = this;
            return r0
    }
}
