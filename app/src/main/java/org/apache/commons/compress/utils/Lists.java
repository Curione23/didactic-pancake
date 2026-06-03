package org.apache.commons.compress.utils;

/* JADX INFO: loaded from: classes2.dex */
public class Lists {
    private Lists() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <E> java.util.ArrayList<E> newArrayList() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    public static <E> java.util.ArrayList<E> newArrayList(java.util.Iterator<? extends E> r1) {
            java.util.ArrayList r0 = newArrayList()
            org.apache.commons.compress.utils.Iterators.addAll(r0, r1)
            return r0
    }
}
