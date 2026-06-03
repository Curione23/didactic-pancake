package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "This class is no longer supported, do not use it.")
@java.lang.Deprecated
public abstract class FunctionImpl implements kotlin.Function, java.io.Serializable, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function4, kotlin.jvm.functions.Function5, kotlin.jvm.functions.Function6, kotlin.jvm.functions.Function7, kotlin.jvm.functions.Function8, kotlin.jvm.functions.Function9, kotlin.jvm.functions.Function10, kotlin.jvm.functions.Function11, kotlin.jvm.functions.Function12, kotlin.jvm.functions.Function13, kotlin.jvm.functions.Function14, kotlin.jvm.functions.Function15, kotlin.jvm.functions.Function16, kotlin.jvm.functions.Function17, kotlin.jvm.functions.Function18, kotlin.jvm.functions.Function19, kotlin.jvm.functions.Function20, kotlin.jvm.functions.Function21, kotlin.jvm.functions.Function22 {
    public FunctionImpl() {
            r0 = this;
            r0.<init>()
            return
    }

    private void checkArity(int r2) {
            r1 = this;
            int r0 = r1.getArity()
            if (r0 == r2) goto L9
            r1.throwWrongArity(r2)
        L9:
            return
    }

    private void throwWrongArity(int r4) {
            r3 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Wrong function arity, expected: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = ", actual: "
            java.lang.StringBuilder r4 = r4.append(r1)
            int r1 = r3.getArity()
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public abstract int getArity();

    @Override // kotlin.jvm.functions.Function0
    public java.lang.Object invoke() {
            r1 = this;
            r0 = 0
            r1.checkArity(r0)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r0 = r1.invokeVararg(r0)
            return r0
    }

    @Override // kotlin.jvm.functions.Function1
    public java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            r0 = 1
            r1.checkArity(r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.Object r2 = r1.invokeVararg(r2)
            return r2
    }

    @Override // kotlin.jvm.functions.Function2
    public java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            r0 = 2
            r1.checkArity(r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.Object r2 = r1.invokeVararg(r2)
            return r2
    }

    @Override // kotlin.jvm.functions.Function3
    public java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            r0 = 3
            r1.checkArity(r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4}
            java.lang.Object r2 = r1.invokeVararg(r2)
            return r2
    }

    @Override // kotlin.jvm.functions.Function4
    public java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            r1 = this;
            r0 = 4
            r1.checkArity(r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4, r5}
            java.lang.Object r2 = r1.invokeVararg(r2)
            return r2
    }

    @Override // kotlin.jvm.functions.Function5
    public java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            r1 = this;
            r0 = 5
            r1.checkArity(r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4, r5, r6}
            java.lang.Object r2 = r1.invokeVararg(r2)
            return r2
    }

    @Override // kotlin.jvm.functions.Function6
    public java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
            r1 = this;
            r0 = 6
            r1.checkArity(r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4, r5, r6, r7}
            java.lang.Object r2 = r1.invokeVararg(r2)
            return r2
    }

    @Override // kotlin.jvm.functions.Function7
    public java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8) {
            r1 = this;
            r0 = 7
            r1.checkArity(r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4, r5, r6, r7, r8}
            java.lang.Object r2 = r1.invokeVararg(r2)
            return r2
    }

    @Override // kotlin.jvm.functions.Function8
    public java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9) {
            r1 = this;
            r0 = 8
            r1.checkArity(r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4, r5, r6, r7, r8, r9}
            java.lang.Object r2 = r1.invokeVararg(r2)
            return r2
    }

    @Override // kotlin.jvm.functions.Function9
    public java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10) {
            r1 = this;
            r0 = 9
            r1.checkArity(r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4, r5, r6, r7, r8, r9, r10}
            java.lang.Object r2 = r1.invokeVararg(r2)
            return r2
    }

    @Override // kotlin.jvm.functions.Function10
    public java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
            r1 = this;
            r0 = 10
            r1.checkArity(r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
            java.lang.Object r2 = r1.invokeVararg(r2)
            return r2
    }

    @Override // kotlin.jvm.functions.Function11
    public java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12) {
            r1 = this;
            r0 = 11
            r1.checkArity(r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12}
            java.lang.Object r2 = r1.invokeVararg(r2)
            return r2
    }

    @Override // kotlin.jvm.functions.Function12
    public java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13) {
            r1 = this;
            r0 = 12
            r1.checkArity(r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13}
            java.lang.Object r2 = r1.invokeVararg(r2)
            return r2
    }

    @Override // kotlin.jvm.functions.Function13
    public java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14) {
            r1 = this;
            r0 = 13
            r1.checkArity(r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14}
            java.lang.Object r2 = r1.invokeVararg(r2)
            return r2
    }

    @Override // kotlin.jvm.functions.Function14
    public java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15) {
            r1 = this;
            r0 = 14
            r1.checkArity(r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15}
            java.lang.Object r2 = r1.invokeVararg(r2)
            return r2
    }

    @Override // kotlin.jvm.functions.Function15
    public java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17) {
            r2 = this;
            r0 = r2
            r1 = 15
            r2.checkArity(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17}
            java.lang.Object r1 = r2.invokeVararg(r1)
            return r1
    }

    @Override // kotlin.jvm.functions.Function16
    public java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17, java.lang.Object r18) {
            r2 = this;
            r0 = r2
            r1 = 16
            r2.checkArity(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18}
            java.lang.Object r1 = r2.invokeVararg(r1)
            return r1
    }

    @Override // kotlin.jvm.functions.Function17
    public java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
            r2 = this;
            r0 = r2
            r1 = 17
            r2.checkArity(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19}
            java.lang.Object r1 = r2.invokeVararg(r1)
            return r1
    }

    @Override // kotlin.jvm.functions.Function18
    public java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19, java.lang.Object r20) {
            r2 = this;
            r0 = r2
            r1 = 18
            r2.checkArity(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20}
            java.lang.Object r1 = r2.invokeVararg(r1)
            return r1
    }

    @Override // kotlin.jvm.functions.Function19
    public java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21) {
            r2 = this;
            r0 = r2
            r1 = 19
            r2.checkArity(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}
            java.lang.Object r1 = r2.invokeVararg(r1)
            return r1
    }

    @Override // kotlin.jvm.functions.Function20
    public java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
            r2 = this;
            r0 = r2
            r1 = 20
            r2.checkArity(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22}
            java.lang.Object r1 = r2.invokeVararg(r1)
            return r1
    }

    @Override // kotlin.jvm.functions.Function21
    public java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22, java.lang.Object r23) {
            r2 = this;
            r0 = r2
            r1 = 21
            r2.checkArity(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23}
            java.lang.Object r1 = r2.invokeVararg(r1)
            return r1
    }

    @Override // kotlin.jvm.functions.Function22
    public java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22, java.lang.Object r23, java.lang.Object r24) {
            r2 = this;
            r0 = r2
            r1 = 22
            r2.checkArity(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24}
            java.lang.Object r1 = r2.invokeVararg(r1)
            return r1
    }

    public java.lang.Object invokeVararg(java.lang.Object... r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}
