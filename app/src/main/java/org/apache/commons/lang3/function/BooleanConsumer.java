package org.apache.commons.lang3.function;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface BooleanConsumer {
    public static final org.apache.commons.lang3.function.BooleanConsumer NOP = null;

    static {
            org.apache.commons.lang3.function.BooleanConsumer$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.function.BooleanConsumer$$ExternalSyntheticLambda0
            r0.<init>()
            org.apache.commons.lang3.function.BooleanConsumer.NOP = r0
            return
    }

    static /* synthetic */ void lambda$andThen$1(org.apache.commons.lang3.function.BooleanConsumer r0, org.apache.commons.lang3.function.BooleanConsumer r1, boolean r2) {
            r0.accept(r2)
            r1.accept(r2)
            return
    }

    static /* synthetic */ void lambda$static$0(boolean r0) {
            return
    }

    static org.apache.commons.lang3.function.BooleanConsumer nop() {
            org.apache.commons.lang3.function.BooleanConsumer r0 = org.apache.commons.lang3.function.BooleanConsumer.NOP
            return r0
    }

    void accept(boolean r1);

    default org.apache.commons.lang3.function.BooleanConsumer andThen(org.apache.commons.lang3.function.BooleanConsumer r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            org.apache.commons.lang3.function.BooleanConsumer$$ExternalSyntheticLambda1 r0 = new org.apache.commons.lang3.function.BooleanConsumer$$ExternalSyntheticLambda1
            r0.<init>(r1, r2)
            return r0
    }
}
