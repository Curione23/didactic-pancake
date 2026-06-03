package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PropertyReference extends kotlin.jvm.internal.CallableReference implements kotlin.reflect.KProperty {
    private final boolean syntheticJavaProperty;

    public PropertyReference() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.syntheticJavaProperty = r0
            return
    }

    public PropertyReference(java.lang.Object r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.syntheticJavaProperty = r1
            return
    }

    public PropertyReference(java.lang.Object r10, java.lang.Class r11, java.lang.String r12, java.lang.String r13, int r14) {
            r9 = this;
            r0 = r14 & 1
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L8
            r8 = r2
            goto L9
        L8:
            r8 = r1
        L9:
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            r10 = 2
            r11 = r14 & 2
            if (r11 != r10) goto L17
            r1 = r2
        L17:
            r9.syntheticJavaProperty = r1
            return
    }

    @Override // kotlin.jvm.internal.CallableReference
    public kotlin.reflect.KCallable compute() {
            r1 = this;
            boolean r0 = r1.syntheticJavaProperty
            if (r0 == 0) goto L6
            r0 = r1
            goto La
        L6:
            kotlin.reflect.KCallable r0 = super.compute()
        La:
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof kotlin.jvm.internal.PropertyReference
            r2 = 0
            if (r1 == 0) goto L46
            kotlin.jvm.internal.PropertyReference r5 = (kotlin.jvm.internal.PropertyReference) r5
            kotlin.reflect.KDeclarationContainer r1 = r4.getOwner()
            kotlin.reflect.KDeclarationContainer r3 = r5.getOwner()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L44
            java.lang.String r1 = r4.getName()
            java.lang.String r3 = r5.getName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L44
            java.lang.String r1 = r4.getSignature()
            java.lang.String r3 = r5.getSignature()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L44
            java.lang.Object r1 = r4.getBoundReceiver()
            java.lang.Object r5 = r5.getBoundReceiver()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
            if (r5 == 0) goto L44
            goto L45
        L44:
            r0 = r2
        L45:
            return r0
        L46:
            boolean r0 = r5 instanceof kotlin.reflect.KProperty
            if (r0 == 0) goto L53
            kotlin.reflect.KCallable r0 = r4.compute()
            boolean r5 = r5.equals(r0)
            return r5
        L53:
            return r2
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected /* bridge */ /* synthetic */ kotlin.reflect.KCallable getReflected() {
            r1 = this;
            kotlin.reflect.KProperty r0 = r1.getReflected()
            return r0
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected kotlin.reflect.KProperty getReflected() {
            r2 = this;
            boolean r0 = r2.syntheticJavaProperty
            if (r0 != 0) goto Lb
            kotlin.reflect.KCallable r0 = super.getReflected()
            kotlin.reflect.KProperty r0 = (kotlin.reflect.KProperty) r0
            return r0
        Lb:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Kotlin reflection is not yet supported for synthetic Java properties"
            r0.<init>(r1)
            throw r0
    }

    public int hashCode() {
            r2 = this;
            kotlin.reflect.KDeclarationContainer r0 = r2.getOwner()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.getName()
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.getSignature()
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // kotlin.reflect.KProperty
    public boolean isConst() {
            r1 = this;
            kotlin.reflect.KProperty r0 = r1.getReflected()
            boolean r0 = r0.isConst()
            return r0
    }

    @Override // kotlin.reflect.KProperty
    public boolean isLateinit() {
            r1 = this;
            kotlin.reflect.KProperty r0 = r1.getReflected()
            boolean r0 = r0.isLateinit()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            kotlin.reflect.KCallable r0 = r2.compute()
            if (r0 == r2) goto Lb
            java.lang.String r0 = r0.toString()
            return r0
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "property "
            r0.<init>(r1)
            java.lang.String r1 = r2.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " (Kotlin reflection is not available)"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
