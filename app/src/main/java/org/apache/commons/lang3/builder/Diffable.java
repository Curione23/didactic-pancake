package org.apache.commons.lang3.builder;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface Diffable<T> {
    org.apache.commons.lang3.builder.DiffResult<T> diff(T r1);
}
