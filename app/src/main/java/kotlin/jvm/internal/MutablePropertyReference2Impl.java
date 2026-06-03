package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public class MutablePropertyReference2Impl extends kotlin.jvm.internal.MutablePropertyReference2 {
    public MutablePropertyReference2Impl(java.lang.Class r1, java.lang.String r2, java.lang.String r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public MutablePropertyReference2Impl(kotlin.reflect.KDeclarationContainer r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r0 = r2
            kotlin.jvm.internal.ClassBasedDeclarationContainer r0 = (kotlin.jvm.internal.ClassBasedDeclarationContainer) r0
            java.lang.Class r0 = r0.getJClass()
            boolean r2 = r2 instanceof kotlin.reflect.KClass
            r2 = r2 ^ 1
            r1.<init>(r0, r3, r4, r2)
            return
    }

    @Override // kotlin.reflect.KProperty2
    public java.lang.Object get(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            kotlin.reflect.KProperty2$Getter r0 = r1.getGetter()
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.Object r2 = r0.call(r2)
            return r2
    }

    @Override // kotlin.reflect.KMutableProperty2
    public void set(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            kotlin.reflect.KMutableProperty2$Setter r0 = r1.getSetter()
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4}
            r0.call(r2)
            return
    }
}
