package androidx.lifecycle;

/* JADX INFO: compiled from: Lifecycling.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\r\u001a\u00020\f2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u0001H\u0002J\u001e\u0010\u0010\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u000b2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\bH\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0007J\u0014\u0010\u0015\u001a\u00020\u00042\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\bH\u0002J\u0016\u0010\u0016\u001a\u00020\u00172\f\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bH\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u0001H\u0007J\u0014\u0010\u001a\u001a\u00020\u00042\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\t\u001a \u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b0\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Landroidx/lifecycle/Lifecycling;", "", "()V", "GENERATED_CALLBACK", "", "REFLECTIVE_CALLBACK", "callbackCache", "", "Ljava/lang/Class;", "classToAdapters", "", "Ljava/lang/reflect/Constructor;", "Landroidx/lifecycle/GeneratedAdapter;", "createGeneratedAdapter", "constructor", "object", "generatedConstructor", "klass", "getAdapterName", "", "className", "getObserverConstructorType", "isLifecycleParent", "", "lifecycleEventObserver", "Landroidx/lifecycle/LifecycleEventObserver;", "resolveObserverCallbackType", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Lifecycling {
    private static final int GENERATED_CALLBACK = 2;
    public static final androidx.lifecycle.Lifecycling INSTANCE = null;
    private static final int REFLECTIVE_CALLBACK = 1;
    private static final java.util.Map<java.lang.Class<?>, java.lang.Integer> callbackCache = null;
    private static final java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>>> classToAdapters = null;

    static {
            androidx.lifecycle.Lifecycling r0 = new androidx.lifecycle.Lifecycling
            r0.<init>()
            androidx.lifecycle.Lifecycling.INSTANCE = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            androidx.lifecycle.Lifecycling.callbackCache = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            androidx.lifecycle.Lifecycling.classToAdapters = r0
            return
    }

    private Lifecycling() {
            r0 = this;
            r0.<init>()
            return
    }

    private final androidx.lifecycle.GeneratedAdapter createGeneratedAdapter(java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter> r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.reflect.InvocationTargetException -> L10 java.lang.InstantiationException -> L19 java.lang.IllegalAccessException -> L22
            java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L10 java.lang.InstantiationException -> L19 java.lang.IllegalAccessException -> L22
            java.lang.String r2 = "{\n            constructo…tance(`object`)\n        }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L10 java.lang.InstantiationException -> L19 java.lang.IllegalAccessException -> L22
            androidx.lifecycle.GeneratedAdapter r1 = (androidx.lifecycle.GeneratedAdapter) r1     // Catch: java.lang.reflect.InvocationTargetException -> L10 java.lang.InstantiationException -> L19 java.lang.IllegalAccessException -> L22
            return r1
        L10:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r2.<init>(r1)
            throw r2
        L19:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r2.<init>(r1)
            throw r2
        L22:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r2.<init>(r1)
            throw r2
    }

    private final java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter> generatedConstructor(java.lang.Class<?> r5) {
            r4 = this;
            java.lang.Package r0 = r5.getPackage()     // Catch: java.lang.NoSuchMethodException -> L7a java.lang.ClassNotFoundException -> L83
            java.lang.String r1 = r5.getCanonicalName()     // Catch: java.lang.NoSuchMethodException -> L7a java.lang.ClassNotFoundException -> L83
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.getName()     // Catch: java.lang.NoSuchMethodException -> L7a java.lang.ClassNotFoundException -> L83
            goto L11
        Lf:
            java.lang.String r0 = ""
        L11:
            java.lang.String r2 = "fullPackage"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)     // Catch: java.lang.NoSuchMethodException -> L7a java.lang.ClassNotFoundException -> L83
            r2 = r0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch: java.lang.NoSuchMethodException -> L7a java.lang.ClassNotFoundException -> L83
            int r2 = r2.length()     // Catch: java.lang.NoSuchMethodException -> L7a java.lang.ClassNotFoundException -> L83
            r3 = 1
            if (r2 != 0) goto L21
            goto L34
        L21:
            java.lang.String r2 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L7a java.lang.ClassNotFoundException -> L83
            int r2 = r0.length()     // Catch: java.lang.NoSuchMethodException -> L7a java.lang.ClassNotFoundException -> L83
            int r2 = r2 + r3
            java.lang.String r1 = r1.substring(r2)     // Catch: java.lang.NoSuchMethodException -> L7a java.lang.ClassNotFoundException -> L83
            java.lang.String r2 = "this as java.lang.String).substring(startIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L7a java.lang.ClassNotFoundException -> L83
        L34:
            java.lang.String r2 = "if (fullPackage.isEmpty(…g(fullPackage.length + 1)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L7a java.lang.ClassNotFoundException -> L83
            java.lang.String r1 = getAdapterName(r1)     // Catch: java.lang.NoSuchMethodException -> L7a java.lang.ClassNotFoundException -> L83
            r2 = r0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch: java.lang.NoSuchMethodException -> L7a java.lang.ClassNotFoundException -> L83
            int r2 = r2.length()     // Catch: java.lang.NoSuchMethodException -> L7a java.lang.ClassNotFoundException -> L83
            if (r2 != 0) goto L47
            goto L5e
        L47:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.NoSuchMethodException -> L7a java.lang.ClassNotFoundException -> L83
            r2.<init>()     // Catch: java.lang.NoSuchMethodException -> L7a java.lang.ClassNotFoundException -> L83
            java.lang.StringBuilder r0 = r2.append(r0)     // Catch: java.lang.NoSuchMethodException -> L7a java.lang.ClassNotFoundException -> L83
            r2 = 46
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.NoSuchMethodException -> L7a java.lang.ClassNotFoundException -> L83
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.NoSuchMethodException -> L7a java.lang.ClassNotFoundException -> L83
            java.lang.String r1 = r0.toString()     // Catch: java.lang.NoSuchMethodException -> L7a java.lang.ClassNotFoundException -> L83
        L5e:
            java.lang.Class r0 = java.lang.Class.forName(r1)     // Catch: java.lang.NoSuchMethodException -> L7a java.lang.ClassNotFoundException -> L83
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)     // Catch: java.lang.NoSuchMethodException -> L7a java.lang.ClassNotFoundException -> L83
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L7a java.lang.ClassNotFoundException -> L83
            r2 = 0
            r1[r2] = r5     // Catch: java.lang.NoSuchMethodException -> L7a java.lang.ClassNotFoundException -> L83
            java.lang.reflect.Constructor r5 = r0.getDeclaredConstructor(r1)     // Catch: java.lang.NoSuchMethodException -> L7a java.lang.ClassNotFoundException -> L83
            boolean r0 = r5.isAccessible()     // Catch: java.lang.NoSuchMethodException -> L7a java.lang.ClassNotFoundException -> L83
            if (r0 != 0) goto L84
            r5.setAccessible(r3)     // Catch: java.lang.NoSuchMethodException -> L7a java.lang.ClassNotFoundException -> L83
            goto L84
        L7a:
            r5 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            r0.<init>(r5)
            throw r0
        L83:
            r5 = 0
        L84:
            return r5
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getAdapterName(java.lang.String r7) {
            java.lang.String r0 = "className"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r5 = 4
            r6 = 0
            java.lang.String r2 = "."
            java.lang.String r3 = "_"
            r4 = 0
            r1 = r7
            java.lang.String r7 = kotlin.text.StringsKt.replace$default(r1, r2, r3, r4, r5, r6)
            java.lang.StringBuilder r7 = r0.append(r7)
            java.lang.String r0 = "_LifecycleAdapter"
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r7 = r7.toString()
            return r7
    }

    private final int getObserverConstructorType(java.lang.Class<?> r4) {
            r3 = this;
            java.util.Map<java.lang.Class<?>, java.lang.Integer> r0 = androidx.lifecycle.Lifecycling.callbackCache
            java.lang.Object r1 = r0.get(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto Lf
            int r4 = r1.intValue()
            return r4
        Lf:
            int r1 = r3.resolveObserverCallbackType(r4)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0.put(r4, r2)
            return r1
    }

    private final boolean isLifecycleParent(java.lang.Class<?> r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            java.lang.Class<androidx.lifecycle.LifecycleObserver> r0 = androidx.lifecycle.LifecycleObserver.class
            boolean r2 = r0.isAssignableFrom(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.lifecycle.LifecycleEventObserver lifecycleEventObserver(java.lang.Object r6) {
            java.lang.String r0 = "object"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            boolean r0 = r6 instanceof androidx.lifecycle.LifecycleEventObserver
            boolean r1 = r6 instanceof androidx.lifecycle.DefaultLifecycleObserver
            if (r0 == 0) goto L1a
            if (r1 == 0) goto L1a
            androidx.lifecycle.DefaultLifecycleObserverAdapter r0 = new androidx.lifecycle.DefaultLifecycleObserverAdapter
            r1 = r6
            androidx.lifecycle.DefaultLifecycleObserver r1 = (androidx.lifecycle.DefaultLifecycleObserver) r1
            androidx.lifecycle.LifecycleEventObserver r6 = (androidx.lifecycle.LifecycleEventObserver) r6
            r0.<init>(r1, r6)
            androidx.lifecycle.LifecycleEventObserver r0 = (androidx.lifecycle.LifecycleEventObserver) r0
            return r0
        L1a:
            if (r1 == 0) goto L27
            androidx.lifecycle.DefaultLifecycleObserverAdapter r0 = new androidx.lifecycle.DefaultLifecycleObserverAdapter
            androidx.lifecycle.DefaultLifecycleObserver r6 = (androidx.lifecycle.DefaultLifecycleObserver) r6
            r1 = 0
            r0.<init>(r6, r1)
            androidx.lifecycle.LifecycleEventObserver r0 = (androidx.lifecycle.LifecycleEventObserver) r0
            return r0
        L27:
            if (r0 == 0) goto L2c
            androidx.lifecycle.LifecycleEventObserver r6 = (androidx.lifecycle.LifecycleEventObserver) r6
            return r6
        L2c:
            java.lang.Class r0 = r6.getClass()
            androidx.lifecycle.Lifecycling r1 = androidx.lifecycle.Lifecycling.INSTANCE
            int r2 = r1.getObserverConstructorType(r0)
            r3 = 2
            if (r2 != r3) goto L7f
            java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>>> r2 = androidx.lifecycle.Lifecycling.classToAdapters
            java.lang.Object r0 = r2.get(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            java.util.List r0 = (java.util.List) r0
            int r2 = r0.size()
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L5e
            java.lang.Object r0 = r0.get(r3)
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            androidx.lifecycle.GeneratedAdapter r6 = r1.createGeneratedAdapter(r0, r6)
            androidx.lifecycle.SingleGeneratedAdapterObserver r0 = new androidx.lifecycle.SingleGeneratedAdapterObserver
            r0.<init>(r6)
            androidx.lifecycle.LifecycleEventObserver r0 = (androidx.lifecycle.LifecycleEventObserver) r0
            return r0
        L5e:
            int r1 = r0.size()
            androidx.lifecycle.GeneratedAdapter[] r2 = new androidx.lifecycle.GeneratedAdapter[r1]
        L64:
            if (r3 >= r1) goto L77
            androidx.lifecycle.Lifecycling r4 = androidx.lifecycle.Lifecycling.INSTANCE
            java.lang.Object r5 = r0.get(r3)
            java.lang.reflect.Constructor r5 = (java.lang.reflect.Constructor) r5
            androidx.lifecycle.GeneratedAdapter r4 = r4.createGeneratedAdapter(r5, r6)
            r2[r3] = r4
            int r3 = r3 + 1
            goto L64
        L77:
            androidx.lifecycle.CompositeGeneratedAdaptersObserver r6 = new androidx.lifecycle.CompositeGeneratedAdaptersObserver
            r6.<init>(r2)
            androidx.lifecycle.LifecycleEventObserver r6 = (androidx.lifecycle.LifecycleEventObserver) r6
            return r6
        L7f:
            androidx.lifecycle.ReflectiveGenericLifecycleObserver r0 = new androidx.lifecycle.ReflectiveGenericLifecycleObserver
            r0.<init>(r6)
            androidx.lifecycle.LifecycleEventObserver r0 = (androidx.lifecycle.LifecycleEventObserver) r0
            return r0
    }

    private final int resolveObserverCallbackType(java.lang.Class<?> r9) {
            r8 = this;
            java.lang.String r0 = r9.getCanonicalName()
            r1 = 1
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.reflect.Constructor r0 = r8.generatedConstructor(r9)
            r2 = 2
            if (r0 == 0) goto L19
            java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>>> r1 = androidx.lifecycle.Lifecycling.classToAdapters
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            r1.put(r9, r0)
            return r2
        L19:
            androidx.lifecycle.ClassesInfoCache r0 = androidx.lifecycle.ClassesInfoCache.sInstance
            boolean r0 = r0.hasLifecycleMethods(r9)
            if (r0 == 0) goto L22
            return r1
        L22:
            java.lang.Class r0 = r9.getSuperclass()
            boolean r3 = r8.isLifecycleParent(r0)
            if (r3 == 0) goto L4b
            java.lang.String r3 = "superclass"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            int r3 = r8.getObserverConstructorType(r0)
            if (r3 != r1) goto L38
            return r1
        L38:
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>>> r4 = androidx.lifecycle.Lifecycling.classToAdapters
            java.lang.Object r0 = r4.get(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            r3.<init>(r0)
            java.util.List r3 = (java.util.List) r3
            goto L4c
        L4b:
            r3 = 0
        L4c:
            java.lang.Class[] r0 = r9.getInterfaces()
            java.lang.String r4 = "klass.interfaces"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            int r4 = r0.length
            r5 = 0
        L57:
            if (r5 >= r4) goto L88
            r6 = r0[r5]
            boolean r7 = r8.isLifecycleParent(r6)
            if (r7 != 0) goto L62
            goto L85
        L62:
            java.lang.String r7 = "intrface"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            int r7 = r8.getObserverConstructorType(r6)
            if (r7 != r1) goto L6e
            return r1
        L6e:
            if (r3 != 0) goto L77
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r3 = (java.util.List) r3
        L77:
            java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>>> r7 = androidx.lifecycle.Lifecycling.classToAdapters
            java.lang.Object r6 = r7.get(r6)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            java.util.Collection r6 = (java.util.Collection) r6
            r3.addAll(r6)
        L85:
            int r5 = r5 + 1
            goto L57
        L88:
            if (r3 == 0) goto L90
            java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>>> r0 = androidx.lifecycle.Lifecycling.classToAdapters
            r0.put(r9, r3)
            return r2
        L90:
            return r1
    }
}
