package moe.yushi.authlibinjector.transform.support;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/transform/support/MainArgumentsTransformer.class */
public class MainArgumentsTransformer implements moe.yushi.authlibinjector.transform.TransformUnit {
    private static final java.util.List<java.util.function.Function<java.lang.String[], java.lang.String[]>> ARGUMENTS_LISTENERS = null;
    private static final java.util.List<java.util.function.Consumer<java.lang.String>> VERSION_SERIES_LISTENERS = null;


    public MainArgumentsTransformer() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // moe.yushi.authlibinjector.transform.TransformUnit
    public java.util.Optional<moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassVisitor> transform(java.lang.ClassLoader r8, java.lang.String r9, moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassVisitor r10, moe.yushi.authlibinjector.transform.TransformContext r11) {
            r7 = this;
            java.lang.String r0 = "net.minecraft.client.main.Main"
            r1 = r9
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1a
            moe.yushi.authlibinjector.transform.support.MainArgumentsTransformer$1 r0 = new moe.yushi.authlibinjector.transform.support.MainArgumentsTransformer$1
            r1 = r0
            r2 = r7
            r3 = 589824(0x90000, float:8.2652E-40)
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5)
            java.util.Optional r0 = java.util.Optional.of(r0)
            return r0
        L1a:
            java.util.Optional r0 = java.util.Optional.empty()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "Main Arguments Transformer"
            return r0
    }

    @moe.yushi.authlibinjector.transform.CallbackMethod
    public static java.lang.String[] processMainArguments(java.lang.String[] r5) {
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.DEBUG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Original main arguments: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r5
            java.util.stream.Stream r2 = java.util.stream.Stream.of(r2)
            java.lang.String r3 = " "
            java.util.stream.Collector r3 = java.util.stream.Collectors.joining(r3)
            java.lang.Object r2 = r2.collect(r3)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
            r0 = r5
            r6 = r0
            java.util.List<java.util.function.Function<java.lang.String[], java.lang.String[]>> r0 = moe.yushi.authlibinjector.transform.support.MainArgumentsTransformer.ARGUMENTS_LISTENERS
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
        L34:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L55
            r0 = r7
            java.lang.Object r0 = r0.next()
            java.util.function.Function r0 = (java.util.function.Function) r0
            r8 = r0
            r0 = r8
            r1 = r6
            java.lang.Object r0 = r0.apply(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r6 = r0
            goto L34
        L55:
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.DEBUG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Transformed main arguments: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r6
            java.util.stream.Stream r2 = java.util.stream.Stream.of(r2)
            java.lang.String r3 = " "
            java.util.stream.Collector r3 = java.util.stream.Collectors.joining(r3)
            java.lang.Object r2 = r2.collect(r3)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
            r0 = r6
            return r0
    }

    public static java.util.List<java.util.function.Function<java.lang.String[], java.lang.String[]>> getArgumentsListeners() {
            java.util.List<java.util.function.Function<java.lang.String[], java.lang.String[]>> r0 = moe.yushi.authlibinjector.transform.support.MainArgumentsTransformer.ARGUMENTS_LISTENERS
            return r0
    }

    public static java.util.Optional<java.lang.String> inferVersionSeries(java.lang.String[] r3) {
            r0 = 0
            r4 = r0
            r0 = r3
            r5 = r0
            r0 = r5
            int r0 = r0.length
            r6 = r0
            r0 = 0
            r7 = r0
        La:
            r0 = r7
            r1 = r6
            if (r0 >= r1) goto L41
            r0 = r5
            r1 = r7
            r0 = r0[r1]
            r8 = r0
            r0 = r4
            if (r0 == 0) goto L2f
            r0 = r8
            java.lang.String r1 = "--"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L29
            r0 = 0
            r4 = r0
            goto L2f
        L29:
            r0 = r8
            java.util.Optional r0 = java.util.Optional.of(r0)
            return r0
        L2f:
            java.lang.String r0 = "--assetIndex"
            r1 = r8
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3b
            r0 = 1
            r4 = r0
        L3b:
            int r7 = r7 + 1
            goto La
        L41:
            java.util.Optional r0 = java.util.Optional.empty()
            return r0
    }

    public static java.util.List<java.util.function.Consumer<java.lang.String>> getVersionSeriesListeners() {
            java.util.List<java.util.function.Consumer<java.lang.String>> r0 = moe.yushi.authlibinjector.transform.support.MainArgumentsTransformer.VERSION_SERIES_LISTENERS
            return r0
    }

    private static /* synthetic */ java.lang.String[] lambda$static$2(java.lang.String[] r3) {
            r0 = r3
            java.util.Optional r0 = inferVersionSeries(r0)
            java.lang.String[] r1 = (v0) -> { // java.util.function.Consumer.accept(java.lang.Object):void
                lambda$static$1(v0);
            }
            r0.ifPresent(r1)
            r0 = r3
            return r0
    }

    private static /* synthetic */ void lambda$static$1(java.lang.String r4) {
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.DEBUG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Version series detected: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r4
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
            java.util.List<java.util.function.Consumer<java.lang.String>> r0 = moe.yushi.authlibinjector.transform.support.MainArgumentsTransformer.VERSION_SERIES_LISTENERS
            r1 = r4
            void r1 = (v1) -> { // java.util.function.Consumer.accept(java.lang.Object):void
                lambda$static$0(r1, v1);
            }
            r0.forEach(r1)
            return
    }

    private static /* synthetic */ void lambda$static$0(java.lang.String r3, java.util.function.Consumer r4) {
            r0 = r4
            r1 = r3
            r0.accept(r1)
            return
    }

    static {
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r1 = r0
            r1.<init>()
            moe.yushi.authlibinjector.transform.support.MainArgumentsTransformer.ARGUMENTS_LISTENERS = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r1 = r0
            r1.<init>()
            moe.yushi.authlibinjector.transform.support.MainArgumentsTransformer.VERSION_SERIES_LISTENERS = r0
            java.util.List r0 = getArgumentsListeners()
            void r1 = (v0) -> { // java.util.function.Function.apply(java.lang.Object):java.lang.Object
                return lambda$static$2(v0);
            }
            boolean r0 = r0.add(r1)
            return
    }
}
