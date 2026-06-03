package org.apache.commons.lang3.function;

/* JADX INFO: loaded from: classes2.dex */
public final class MethodInvokers {
    private MethodInvokers() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T, U> java.util.function.BiConsumer<T, U> asBiConsumer(java.lang.reflect.Method r1) {
            java.lang.Class<java.util.function.BiConsumer> r0 = java.util.function.BiConsumer.class
            java.lang.Object r1 = asInterfaceInstance(r0, r1)
            java.util.function.BiConsumer r1 = (java.util.function.BiConsumer) r1
            return r1
    }

    public static <T, U, R> java.util.function.BiFunction<T, U, R> asBiFunction(java.lang.reflect.Method r1) {
            java.lang.Class<java.util.function.BiFunction> r0 = java.util.function.BiFunction.class
            java.lang.Object r1 = asInterfaceInstance(r0, r1)
            java.util.function.BiFunction r1 = (java.util.function.BiFunction) r1
            return r1
    }

    public static <T, U> org.apache.commons.lang3.function.FailableBiConsumer<T, U, java.lang.Throwable> asFailableBiConsumer(java.lang.reflect.Method r1) {
            java.lang.Class<org.apache.commons.lang3.function.FailableBiConsumer> r0 = org.apache.commons.lang3.function.FailableBiConsumer.class
            java.lang.Object r1 = asInterfaceInstance(r0, r1)
            org.apache.commons.lang3.function.FailableBiConsumer r1 = (org.apache.commons.lang3.function.FailableBiConsumer) r1
            return r1
    }

    public static <T, U, R> org.apache.commons.lang3.function.FailableBiFunction<T, U, R, java.lang.Throwable> asFailableBiFunction(java.lang.reflect.Method r1) {
            java.lang.Class<org.apache.commons.lang3.function.FailableBiFunction> r0 = org.apache.commons.lang3.function.FailableBiFunction.class
            java.lang.Object r1 = asInterfaceInstance(r0, r1)
            org.apache.commons.lang3.function.FailableBiFunction r1 = (org.apache.commons.lang3.function.FailableBiFunction) r1
            return r1
    }

    public static <T, R> org.apache.commons.lang3.function.FailableFunction<T, R, java.lang.Throwable> asFailableFunction(java.lang.reflect.Method r1) {
            java.lang.Class<org.apache.commons.lang3.function.FailableFunction> r0 = org.apache.commons.lang3.function.FailableFunction.class
            java.lang.Object r1 = asInterfaceInstance(r0, r1)
            org.apache.commons.lang3.function.FailableFunction r1 = (org.apache.commons.lang3.function.FailableFunction) r1
            return r1
    }

    public static <R> org.apache.commons.lang3.function.FailableSupplier<R, java.lang.Throwable> asFailableSupplier(java.lang.reflect.Method r1) {
            java.lang.Class<org.apache.commons.lang3.function.FailableSupplier> r0 = org.apache.commons.lang3.function.FailableSupplier.class
            java.lang.Object r1 = asInterfaceInstance(r0, r1)
            org.apache.commons.lang3.function.FailableSupplier r1 = (org.apache.commons.lang3.function.FailableSupplier) r1
            return r1
    }

    public static <T, R> java.util.function.Function<T, R> asFunction(java.lang.reflect.Method r1) {
            java.lang.Class<java.util.function.Function> r0 = java.util.function.Function.class
            java.lang.Object r1 = asInterfaceInstance(r0, r1)
            java.util.function.Function r1 = (java.util.function.Function) r1
            return r1
    }

    public static <T> T asInterfaceInstance(java.lang.Class<T> r1, java.lang.reflect.Method r2) {
            java.lang.String r0 = "interfaceClass"
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1, r0)
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.invoke.MethodHandle r2 = unreflectUnchecked(r2)
            java.lang.Object r1 = java.lang.invoke.MethodHandleProxies.asInterfaceInstance(r1, r2)
            return r1
    }

    public static <R> java.util.function.Supplier<R> asSupplier(java.lang.reflect.Method r1) {
            java.lang.Class<java.util.function.Supplier> r0 = java.util.function.Supplier.class
            java.lang.Object r1 = asInterfaceInstance(r0, r1)
            java.util.function.Supplier r1 = (java.util.function.Supplier) r1
            return r1
    }

    private static java.lang.reflect.Method requireMethod(java.lang.reflect.Method r1) {
            java.lang.String r0 = "method"
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1, r0)
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            return r1
    }

    private static java.lang.invoke.MethodHandle unreflect(java.lang.reflect.Method r1) throws java.lang.IllegalAccessException {
            java.lang.invoke.MethodHandles$Lookup r0 = java.lang.invoke.MethodHandles.lookup()
            java.lang.reflect.Method r1 = requireMethod(r1)
            java.lang.invoke.MethodHandle r1 = r0.unreflect(r1)
            return r1
    }

    private static java.lang.invoke.MethodHandle unreflectUnchecked(java.lang.reflect.Method r1) {
            java.lang.invoke.MethodHandle r1 = unreflect(r1)     // Catch: java.lang.IllegalAccessException -> L5
            return r1
        L5:
            r1 = move-exception
            org.apache.commons.lang3.exception.UncheckedIllegalAccessException r0 = new org.apache.commons.lang3.exception.UncheckedIllegalAccessException
            r0.<init>(r1)
            throw r0
    }
}
