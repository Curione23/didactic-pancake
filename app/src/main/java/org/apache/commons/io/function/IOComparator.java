package org.apache.commons.io.function;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface IOComparator<T> {
    static /* synthetic */ int lambda$asComparator$0(org.apache.commons.io.function.IOComparator r0, java.lang.Object r1, java.lang.Object r2) {
            int r1 = org.apache.commons.io.function.Uncheck.compare(r0, r1, r2)
            return r1
    }

    default java.util.Comparator<T> asComparator() {
            r1 = this;
            org.apache.commons.io.function.IOComparator$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.function.IOComparator$$ExternalSyntheticLambda0
            r0.<init>(r1)
            return r0
    }

    int compare(T r1, T r2) throws java.io.IOException;
}
