package org.apache.commons.lang3.builder;

/* JADX INFO: loaded from: classes2.dex */
final class Reflection {
    Reflection() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.lang.Object getUnchecked(java.lang.reflect.Field r1, java.lang.Object r2) {
            java.lang.String r0 = "field"
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1, r0)     // Catch: java.lang.IllegalAccessException -> Ld
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1     // Catch: java.lang.IllegalAccessException -> Ld
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.IllegalAccessException -> Ld
            return r1
        Ld:
            r1 = move-exception
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r1)
            throw r2
    }
}
