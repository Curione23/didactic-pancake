package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: FastServiceLoader.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\t\u001a\u00020\u0004H\u0082\bJ1\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\bH\u0002¢\u0006\u0002\u0010\u0010J*\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0012\"\u0004\b\u0000\u0010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012H\u0000¢\u0006\u0002\b\u0014J/\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0012\"\u0004\b\u0000\u0010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\b2\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J,\u0010\u001d\u001a\u0002H\u001e\"\u0004\b\u0000\u0010\u001e*\u00020\u001f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u0002H\u001e0!H\u0082\b¢\u0006\u0002\u0010\"R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lkotlinx/coroutines/internal/FastServiceLoader;", "", "()V", "PREFIX", "", "createInstanceOf", "Lkotlinx/coroutines/internal/MainDispatcherFactory;", "baseClass", "Ljava/lang/Class;", "serviceClass", "getProviderInstance", "S", "name", "loader", "Ljava/lang/ClassLoader;", "service", "(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/Class;)Ljava/lang/Object;", "load", "", "loadMainDispatcherFactory", "loadMainDispatcherFactory$kotlinx_coroutines_core", "loadProviders", "loadProviders$kotlinx_coroutines_core", "parse", "url", "Ljava/net/URL;", "parseFile", "r", "Ljava/io/BufferedReader;", "use", "R", "Ljava/util/jar/JarFile;", "block", "Lkotlin/Function1;", "(Ljava/util/jar/JarFile;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class FastServiceLoader {
    public static final kotlinx.coroutines.internal.FastServiceLoader INSTANCE = null;
    private static final java.lang.String PREFIX = "META-INF/services/";

    static {
            kotlinx.coroutines.internal.FastServiceLoader r0 = new kotlinx.coroutines.internal.FastServiceLoader
            r0.<init>()
            kotlinx.coroutines.internal.FastServiceLoader.INSTANCE = r0
            return
    }

    private FastServiceLoader() {
            r0 = this;
            r0.<init>()
            return
    }

    private final kotlinx.coroutines.internal.MainDispatcherFactory createInstanceOf(java.lang.Class<kotlinx.coroutines.internal.MainDispatcherFactory> r3, java.lang.String r4) {
            r2 = this;
            java.lang.ClassLoader r0 = r3.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L1d
            r1 = 1
            java.lang.Class r4 = java.lang.Class.forName(r4, r1, r0)     // Catch: java.lang.ClassNotFoundException -> L1d
            r0 = 0
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch: java.lang.ClassNotFoundException -> L1d
            java.lang.reflect.Constructor r4 = r4.getDeclaredConstructor(r1)     // Catch: java.lang.ClassNotFoundException -> L1d
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.ClassNotFoundException -> L1d
            java.lang.Object r4 = r4.newInstance(r0)     // Catch: java.lang.ClassNotFoundException -> L1d
            java.lang.Object r3 = r3.cast(r4)     // Catch: java.lang.ClassNotFoundException -> L1d
            kotlinx.coroutines.internal.MainDispatcherFactory r3 = (kotlinx.coroutines.internal.MainDispatcherFactory) r3     // Catch: java.lang.ClassNotFoundException -> L1d
            goto L21
        L1d:
            r3 = 0
            r4 = r3
            kotlinx.coroutines.internal.MainDispatcherFactory r4 = (kotlinx.coroutines.internal.MainDispatcherFactory) r4
        L21:
            return r3
    }

    private final <S> S getProviderInstance(java.lang.String r2, java.lang.ClassLoader r3, java.lang.Class<S> r4) {
            r1 = this;
            r0 = 0
            java.lang.Class r2 = java.lang.Class.forName(r2, r0, r3)
            boolean r3 = r4.isAssignableFrom(r2)
            if (r3 == 0) goto L1c
            java.lang.Class[] r3 = new java.lang.Class[r0]
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.Object r2 = r2.newInstance(r3)
            java.lang.Object r2 = r4.cast(r2)
            return r2
        L1c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Expected service of class "
            r3.<init>(r0)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = ", but found "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    private final <S> java.util.List<S> load(java.lang.Class<S> r1, java.lang.ClassLoader r2) {
            r0 = this;
            java.util.List r1 = r0.loadProviders$kotlinx_coroutines_core(r1, r2)     // Catch: java.lang.Throwable -> L5
            goto Lf
        L5:
            java.util.ServiceLoader r1 = java.util.ServiceLoader.load(r1, r2)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r1 = kotlin.collections.CollectionsKt.toList(r1)
        Lf:
            return r1
    }

    private final java.util.List<java.lang.String> parse(java.net.URL r6) {
            r5 = this;
            java.lang.String r0 = r6.toString()
            java.lang.String r1 = "jar"
            r2 = 0
            r3 = 2
            r4 = 0
            boolean r1 = kotlin.text.StringsKt.startsWith$default(r0, r1, r2, r3, r4)
            if (r1 == 0) goto L62
            java.lang.String r6 = "jar:file:"
            java.lang.String r6 = kotlin.text.StringsKt.substringAfter$default(r0, r6, r4, r3, r4)
            r1 = 33
            java.lang.String r6 = kotlin.text.StringsKt.substringBefore$default(r6, r1, r4, r3, r4)
            java.lang.String r1 = "!/"
            java.lang.String r0 = kotlin.text.StringsKt.substringAfter$default(r0, r1, r4, r3, r4)
            java.util.jar.JarFile r1 = new java.util.jar.JarFile
            r1.<init>(r6, r2)
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L56
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L56
            java.util.zip.ZipEntry r3 = new java.util.zip.ZipEntry     // Catch: java.lang.Throwable -> L56
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L56
            java.io.InputStream r0 = r1.getInputStream(r3)     // Catch: java.lang.Throwable -> L56
            java.lang.String r3 = "UTF-8"
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L56
            java.io.Reader r2 = (java.io.Reader) r2     // Catch: java.lang.Throwable -> L56
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L56
            java.io.Closeable r6 = (java.io.Closeable) r6     // Catch: java.lang.Throwable -> L56
            r0 = r6
            java.io.BufferedReader r0 = (java.io.BufferedReader) r0     // Catch: java.lang.Throwable -> L4f
            kotlinx.coroutines.internal.FastServiceLoader r2 = kotlinx.coroutines.internal.FastServiceLoader.INSTANCE     // Catch: java.lang.Throwable -> L4f
            java.util.List r0 = r2.parseFile(r0)     // Catch: java.lang.Throwable -> L4f
            kotlin.io.CloseableKt.closeFinally(r6, r4)     // Catch: java.lang.Throwable -> L56
            r1.close()
            return r0
        L4f:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L51
        L51:
            r2 = move-exception
            kotlin.io.CloseableKt.closeFinally(r6, r0)     // Catch: java.lang.Throwable -> L56
            throw r2     // Catch: java.lang.Throwable -> L56
        L56:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L58
        L58:
            r0 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L5d
            throw r0
        L5d:
            r0 = move-exception
            kotlin.ExceptionsKt.addSuppressed(r6, r0)
            throw r6
        L62:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.io.InputStream r6 = r6.openStream()
            r1.<init>(r6)
            java.io.Reader r1 = (java.io.Reader) r1
            r0.<init>(r1)
            java.io.Closeable r0 = (java.io.Closeable) r0
            r6 = r0
            java.io.BufferedReader r6 = (java.io.BufferedReader) r6     // Catch: java.lang.Throwable -> L81
            kotlinx.coroutines.internal.FastServiceLoader r1 = kotlinx.coroutines.internal.FastServiceLoader.INSTANCE     // Catch: java.lang.Throwable -> L81
            java.util.List r6 = r1.parseFile(r6)     // Catch: java.lang.Throwable -> L81
            kotlin.io.CloseableKt.closeFinally(r0, r4)
            return r6
        L81:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L83
        L83:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r6)
            throw r1
    }

    private final java.util.List<java.lang.String> parseFile(java.io.BufferedReader r7) {
            r6 = this;
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Set r0 = (java.util.Set) r0
        L7:
            java.lang.String r1 = r7.readLine()
            if (r1 != 0) goto L14
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r7 = kotlin.collections.CollectionsKt.toList(r0)
            return r7
        L14:
            java.lang.String r2 = "#"
            r3 = 2
            r4 = 0
            java.lang.String r1 = kotlin.text.StringsKt.substringBefore$default(r1, r2, r4, r3, r4)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.CharSequence r1 = kotlin.text.StringsKt.trim(r1)
            java.lang.String r1 = r1.toString()
            r2 = r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r3 = 0
        L2a:
            int r4 = r2.length()
            if (r3 >= r4) goto L5b
            char r4 = r2.charAt(r3)
            r5 = 46
            if (r4 == r5) goto L58
            boolean r4 = java.lang.Character.isJavaIdentifierPart(r4)
            if (r4 == 0) goto L3f
            goto L58
        L3f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Illegal service provider class name: "
            r7.<init>(r0)
            java.lang.StringBuilder r7 = r7.append(r1)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r0.<init>(r7)
            throw r0
        L58:
            int r3 = r3 + 1
            goto L2a
        L5b:
            int r2 = r2.length()
            if (r2 <= 0) goto L7
            r0.add(r1)
            goto L7
    }

    private final <R> R use(java.util.jar.JarFile r3, kotlin.jvm.functions.Function1<? super java.util.jar.JarFile, ? extends R> r4) {
            r2 = this;
            r0 = 1
            java.lang.Object r4 = r4.invoke(r3)     // Catch: java.lang.Throwable -> Lf
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            r3.close()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            return r4
        Lf:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L11
        L11:
            r1 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            r3.close()     // Catch: java.lang.Throwable -> L1c
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            throw r1
        L1c:
            r3 = move-exception
            kotlin.ExceptionsKt.addSuppressed(r4, r3)
            throw r4
    }

    public final java.util.List<kotlinx.coroutines.internal.MainDispatcherFactory> loadMainDispatcherFactory$kotlinx_coroutines_core() {
            r7 = this;
            java.lang.Class<kotlinx.coroutines.internal.MainDispatcherFactory> r0 = kotlinx.coroutines.internal.MainDispatcherFactory.class
            boolean r1 = kotlinx.coroutines.internal.FastServiceLoaderKt.getANDROID_DETECTED()
            if (r1 != 0) goto L11
            java.lang.ClassLoader r1 = r0.getClassLoader()
            java.util.List r0 = r7.load(r0, r1)
            return r0
        L11:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L69
            r2 = 2
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "kotlinx.coroutines.android.AndroidDispatcherFactory"
            r3 = 0
            r4 = 1
            r5 = 0
            java.lang.ClassLoader r6 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L37 java.lang.Throwable -> L69
            java.lang.Class r2 = java.lang.Class.forName(r2, r4, r6)     // Catch: java.lang.ClassNotFoundException -> L37 java.lang.Throwable -> L69
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.ClassNotFoundException -> L37 java.lang.Throwable -> L69
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r6)     // Catch: java.lang.ClassNotFoundException -> L37 java.lang.Throwable -> L69
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch: java.lang.ClassNotFoundException -> L37 java.lang.Throwable -> L69
            java.lang.Object r2 = r2.newInstance(r6)     // Catch: java.lang.ClassNotFoundException -> L37 java.lang.Throwable -> L69
            java.lang.Object r2 = r0.cast(r2)     // Catch: java.lang.ClassNotFoundException -> L37 java.lang.Throwable -> L69
            kotlinx.coroutines.internal.MainDispatcherFactory r2 = (kotlinx.coroutines.internal.MainDispatcherFactory) r2     // Catch: java.lang.ClassNotFoundException -> L37 java.lang.Throwable -> L69
            goto L3b
        L37:
            r2 = r3
            kotlinx.coroutines.internal.MainDispatcherFactory r2 = (kotlinx.coroutines.internal.MainDispatcherFactory) r2     // Catch: java.lang.Throwable -> L69
            r2 = r3
        L3b:
            if (r2 == 0) goto L40
            r1.add(r2)     // Catch: java.lang.Throwable -> L69
        L40:
            java.lang.String r2 = "kotlinx.coroutines.test.internal.TestMainDispatcherFactory"
            java.lang.ClassLoader r6 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L5e java.lang.Throwable -> L69
            java.lang.Class r2 = java.lang.Class.forName(r2, r4, r6)     // Catch: java.lang.ClassNotFoundException -> L5e java.lang.Throwable -> L69
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch: java.lang.ClassNotFoundException -> L5e java.lang.Throwable -> L69
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r4)     // Catch: java.lang.ClassNotFoundException -> L5e java.lang.Throwable -> L69
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch: java.lang.ClassNotFoundException -> L5e java.lang.Throwable -> L69
            java.lang.Object r2 = r2.newInstance(r4)     // Catch: java.lang.ClassNotFoundException -> L5e java.lang.Throwable -> L69
            java.lang.Object r2 = r0.cast(r2)     // Catch: java.lang.ClassNotFoundException -> L5e java.lang.Throwable -> L69
            kotlinx.coroutines.internal.MainDispatcherFactory r2 = (kotlinx.coroutines.internal.MainDispatcherFactory) r2     // Catch: java.lang.ClassNotFoundException -> L5e java.lang.Throwable -> L69
            r3 = r2
            goto L61
        L5e:
            r2 = r3
            kotlinx.coroutines.internal.MainDispatcherFactory r2 = (kotlinx.coroutines.internal.MainDispatcherFactory) r2     // Catch: java.lang.Throwable -> L69
        L61:
            if (r3 == 0) goto L66
            r1.add(r3)     // Catch: java.lang.Throwable -> L69
        L66:
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L69
            goto L71
        L69:
            java.lang.ClassLoader r1 = r0.getClassLoader()
            java.util.List r1 = r7.load(r0, r1)
        L71:
            return r1
    }

    public final <S> java.util.List<S> loadProviders$kotlinx_coroutines_core(java.lang.Class<S> r5, java.lang.ClassLoader r6) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "META-INF/services/"
            r0.<init>(r1)
            java.lang.String r1 = r5.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.util.Enumeration r0 = r6.getResources(r0)
            java.util.ArrayList r0 = java.util.Collections.list(r0)
            java.lang.String r1 = "list(this)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.util.List r0 = (java.util.List) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.Iterator r0 = r0.iterator()
        L2f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r2 = r0.next()
            java.net.URL r2 = (java.net.URL) r2
            kotlinx.coroutines.internal.FastServiceLoader r3 = kotlinx.coroutines.internal.FastServiceLoader.INSTANCE
            java.util.List r2 = r3.parse(r2)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            kotlin.collections.CollectionsKt.addAll(r1, r2)
            goto L2f
        L47:
            java.util.List r1 = (java.util.List) r1
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Set r0 = kotlin.collections.CollectionsKt.toSet(r1)
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L84
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r2)
            r1.<init>(r2)
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.Iterator r0 = r0.iterator()
        L6b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L81
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            kotlinx.coroutines.internal.FastServiceLoader r3 = kotlinx.coroutines.internal.FastServiceLoader.INSTANCE
            java.lang.Object r2 = r3.getProviderInstance(r2, r6, r5)
            r1.add(r2)
            goto L6b
        L81:
            java.util.List r1 = (java.util.List) r1
            return r1
        L84:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "No providers were loaded with FastServiceLoader"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }
}
