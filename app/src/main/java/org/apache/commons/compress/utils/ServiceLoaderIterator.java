package org.apache.commons.compress.utils;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class ServiceLoaderIterator<E> implements java.util.Iterator<E> {
    private E nextServiceLoader;
    private final java.lang.Class<E> service;
    private final java.util.Iterator<E> serviceLoaderIterator;

    public ServiceLoaderIterator(java.lang.Class<E> r2) {
            r1 = this;
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()
            r1.<init>(r2, r0)
            return
    }

    public ServiceLoaderIterator(java.lang.Class<E> r1, java.lang.ClassLoader r2) {
            r0 = this;
            r0.<init>()
            r0.service = r1
            java.util.ServiceLoader r1 = java.util.ServiceLoader.load(r1, r2)
            java.util.Iterator r1 = r1.iterator()
            r0.serviceLoaderIterator = r1
            return
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r2 = this;
        L0:
            E r0 = r2.nextServiceLoader
            if (r0 != 0) goto L22
            java.util.Iterator<E> r0 = r2.serviceLoaderIterator     // Catch: java.util.ServiceConfigurationError -> L17
            boolean r0 = r0.hasNext()     // Catch: java.util.ServiceConfigurationError -> L17
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            java.util.Iterator<E> r0 = r2.serviceLoaderIterator     // Catch: java.util.ServiceConfigurationError -> L17
            java.lang.Object r0 = r0.next()     // Catch: java.util.ServiceConfigurationError -> L17
            r2.nextServiceLoader = r0     // Catch: java.util.ServiceConfigurationError -> L17
            goto L0
        L17:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            boolean r1 = r1 instanceof java.lang.SecurityException
            if (r1 == 0) goto L21
            goto L0
        L21:
            throw r0
        L22:
            r0 = 1
            return r0
    }

    @Override // java.util.Iterator
    public E next() {
            r3 = this;
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lc
            E r0 = r3.nextServiceLoader
            r1 = 0
            r3.nextServiceLoader = r1
            return r0
        Lc:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No more elements for service "
            r1.<init>(r2)
            java.lang.Class<E> r2 = r3.service
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r3 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "service="
            r1.<init>(r2)
            java.lang.Class<E> r2 = r3.service
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
