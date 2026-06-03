package moe.yushi.authlibinjector.transform.support;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/transform/support/MC52974_1710Workaround.class */
public class MC52974_1710Workaround {
    private static final java.util.Map<java.lang.Object, java.util.Optional<java.lang.Object>> markedGameProfiles = null;

    /* JADX INFO: renamed from: moe.yushi.authlibinjector.transform.support.MC52974_1710Workaround$1, reason: invalid class name */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/transform/support/MC52974_1710Workaround$1.class */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/transform/support/MC52974_1710Workaround$S0CPacketSpawnPlayerTransformer.class */
    private static class S0CPacketSpawnPlayerTransformer implements moe.yushi.authlibinjector.transform.TransformUnit {


        private S0CPacketSpawnPlayerTransformer() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // moe.yushi.authlibinjector.transform.TransformUnit
        public java.util.Optional<moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassVisitor> transform(java.lang.ClassLoader r8, java.lang.String r9, moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassVisitor r10, moe.yushi.authlibinjector.transform.TransformContext r11) {
                r7 = this;
                r0 = r9
                java.lang.String r1 = "gb"
                java.lang.String r2 = "net.minecraft.network.play.server.S0CPacketSpawnPlayer"
                r3 = r7
                r4 = r10
                r5 = r11
                java.util.Optional<moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassVisitor> r3 = (v3) -> { // java.util.function.Function.apply(java.lang.Object):java.lang.Object
                    return r3.lambda$transform$0(r4, r5, v3);
                }
                java.util.Optional r0 = moe.yushi.authlibinjector.transform.support.MC52974_1710Workaround.access$000(r0, r1, r2, r3)
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "1.7.10 MC-52974 Workaround (S0CPacketSpawnPlayer)"
                return r0
        }

        private /* synthetic */ moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassVisitor lambda$transform$0(moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassVisitor r9, moe.yushi.authlibinjector.transform.TransformContext r10, java.lang.Boolean r11) {
                r8 = this;
                moe.yushi.authlibinjector.transform.support.MC52974_1710Workaround$S0CPacketSpawnPlayerTransformer$1 r0 = new moe.yushi.authlibinjector.transform.support.MC52974_1710Workaround$S0CPacketSpawnPlayerTransformer$1
                r1 = r0
                r2 = r8
                r3 = 589824(0x90000, float:8.2652E-40)
                r4 = r9
                r5 = r11
                r6 = r10
                r1.<init>(r2, r3, r4, r5, r6)
                return r0
        }

        /* synthetic */ S0CPacketSpawnPlayerTransformer(moe.yushi.authlibinjector.transform.support.MC52974_1710Workaround.AnonymousClass1 r3) {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/transform/support/MC52974_1710Workaround$SessionTransformer.class */
    private static class SessionTransformer implements moe.yushi.authlibinjector.transform.TransformUnit {


        private SessionTransformer() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // moe.yushi.authlibinjector.transform.TransformUnit
        public java.util.Optional<moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassVisitor> transform(java.lang.ClassLoader r8, java.lang.String r9, moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassVisitor r10, moe.yushi.authlibinjector.transform.TransformContext r11) {
                r7 = this;
                r0 = r9
                java.lang.String r1 = "bbs"
                java.lang.String r2 = "net.minecraft.util.Session"
                r3 = r7
                r4 = r10
                r5 = r11
                java.util.Optional<moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassVisitor> r3 = (v3) -> { // java.util.function.Function.apply(java.lang.Object):java.lang.Object
                    return r3.lambda$transform$0(r4, r5, v3);
                }
                java.util.Optional r0 = moe.yushi.authlibinjector.transform.support.MC52974_1710Workaround.access$000(r0, r1, r2, r3)
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "1.7.10 MC-52974 Workaround (Session)"
                return r0
        }

        private /* synthetic */ moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassVisitor lambda$transform$0(moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassVisitor r9, moe.yushi.authlibinjector.transform.TransformContext r10, java.lang.Boolean r11) {
                r8 = this;
                moe.yushi.authlibinjector.transform.support.MC52974_1710Workaround$SessionTransformer$1 r0 = new moe.yushi.authlibinjector.transform.support.MC52974_1710Workaround$SessionTransformer$1
                r1 = r0
                r2 = r8
                r3 = 589824(0x90000, float:8.2652E-40)
                r4 = r9
                r5 = r11
                r6 = r10
                r1.<init>(r2, r3, r4, r5, r6)
                return r0
        }

        /* synthetic */ SessionTransformer(moe.yushi.authlibinjector.transform.support.MC52974_1710Workaround.AnonymousClass1 r3) {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    private MC52974_1710Workaround() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void init() {
            java.util.List r0 = moe.yushi.authlibinjector.transform.support.MainArgumentsTransformer.getVersionSeriesListeners()
            void r1 = (v0) -> { // java.util.function.Consumer.accept(java.lang.Object):void
                lambda$init$0(v0);
            }
            boolean r0 = r0.add(r1)
            return
    }

    @moe.yushi.authlibinjector.transform.CallbackMethod
    public static void markGameProfile(java.lang.Object r4) {
            java.util.Map<java.lang.Object, java.util.Optional<java.lang.Object>> r0 = moe.yushi.authlibinjector.transform.support.MC52974_1710Workaround.markedGameProfiles
            r1 = r0
            r5 = r1
            monitor-enter(r0)
            java.util.Map<java.lang.Object, java.util.Optional<java.lang.Object>> r0 = moe.yushi.authlibinjector.transform.support.MC52974_1710Workaround.markedGameProfiles     // Catch: java.lang.Throwable -> L18
            r1 = r4
            java.util.Optional r2 = java.util.Optional.empty()     // Catch: java.lang.Throwable -> L18
            java.lang.Object r0 = r0.putIfAbsent(r1, r2)     // Catch: java.lang.Throwable -> L18
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            goto L1d
        L18:
            r6 = move-exception
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            r0 = r6
            throw r0
        L1d:
            return
    }

    @moe.yushi.authlibinjector.transform.CallbackMethod
    public static java.lang.Object accessGameProfile(java.lang.Object r8, java.lang.Object r9, boolean r10) {
            java.util.Map<java.lang.Object, java.util.Optional<java.lang.Object>> r0 = moe.yushi.authlibinjector.transform.support.MC52974_1710Workaround.markedGameProfiles
            r1 = r0
            r11 = r1
            monitor-enter(r0)
            java.util.Map<java.lang.Object, java.util.Optional<java.lang.Object>> r0 = moe.yushi.authlibinjector.transform.support.MC52974_1710Workaround.markedGameProfiles     // Catch: java.lang.Throwable -> L127
            r1 = r8
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L127
            java.util.Optional r0 = (java.util.Optional) r0     // Catch: java.lang.Throwable -> L127
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L122
            r0 = r12
            boolean r0 = r0.isPresent()     // Catch: java.lang.Throwable -> L127
            if (r0 == 0) goto L29
            r0 = r12
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L127
            r1 = r11
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L127
            return r0
        L29:
            r0 = r9
            if (r0 == 0) goto L122
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.INFO     // Catch: java.lang.Throwable -> L127
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L127
            r2 = r1
            r2.<init>()     // Catch: java.lang.Throwable -> L127
            java.lang.String r2 = "Filling properties for "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L127
            r2 = r8
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L127
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L127
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)     // Catch: java.lang.Throwable -> L127
            r0 = r9
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.ReflectiveOperationException -> L116 java.lang.Throwable -> L127
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.ReflectiveOperationException -> L116 java.lang.Throwable -> L127
            r13 = r0
            r0 = r13
            java.lang.String r1 = "com.mojang.authlib.GameProfile"
            java.lang.Class r0 = r0.loadClass(r1)     // Catch: java.lang.ReflectiveOperationException -> L116 java.lang.Throwable -> L127
            r14 = r0
            r0 = r14
            r1 = 2
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.ReflectiveOperationException -> L116 java.lang.Throwable -> L127
            r2 = r1
            r3 = 0
            java.lang.Class<java.util.UUID> r4 = java.util.UUID.class
            r2[r3] = r4     // Catch: java.lang.ReflectiveOperationException -> L116 java.lang.Throwable -> L127
            r2 = r1
            r3 = 1
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r2[r3] = r4     // Catch: java.lang.ReflectiveOperationException -> L116 java.lang.Throwable -> L127
            java.lang.reflect.Constructor r0 = r0.getConstructor(r1)     // Catch: java.lang.ReflectiveOperationException -> L116 java.lang.Throwable -> L127
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.ReflectiveOperationException -> L116 java.lang.Throwable -> L127
            r2 = r1
            r3 = 0
            r4 = r14
            java.lang.String r5 = "getId"
            r6 = 0
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch: java.lang.ReflectiveOperationException -> L116 java.lang.Throwable -> L127
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch: java.lang.ReflectiveOperationException -> L116 java.lang.Throwable -> L127
            r5 = r8
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.ReflectiveOperationException -> L116 java.lang.Throwable -> L127
            java.lang.Object r4 = r4.invoke(r5, r6)     // Catch: java.lang.ReflectiveOperationException -> L116 java.lang.Throwable -> L127
            r2[r3] = r4     // Catch: java.lang.ReflectiveOperationException -> L116 java.lang.Throwable -> L127
            r2 = r1
            r3 = 1
            r4 = r14
            java.lang.String r5 = "getName"
            r6 = 0
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch: java.lang.ReflectiveOperationException -> L116 java.lang.Throwable -> L127
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch: java.lang.ReflectiveOperationException -> L116 java.lang.Throwable -> L127
            r5 = r8
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.ReflectiveOperationException -> L116 java.lang.Throwable -> L127
            java.lang.Object r4 = r4.invoke(r5, r6)     // Catch: java.lang.ReflectiveOperationException -> L116 java.lang.Throwable -> L127
            r2[r3] = r4     // Catch: java.lang.ReflectiveOperationException -> L116 java.lang.Throwable -> L127
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.ReflectiveOperationException -> L116 java.lang.Throwable -> L127
            r15 = r0
            r0 = r13
            java.lang.String r1 = "net.minecraft.server.MinecraftServer"
            java.lang.Class r0 = r0.loadClass(r1)     // Catch: java.lang.ReflectiveOperationException -> L116 java.lang.Throwable -> L127
            r16 = r0
            r0 = r10
            if (r0 == 0) goto Lbb
            r0 = r16
            java.lang.String r1 = "av"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.ReflectiveOperationException -> L116 java.lang.Throwable -> L127
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.ReflectiveOperationException -> L116 java.lang.Throwable -> L127
            goto Lc6
        Lbb:
            r0 = r16
            java.lang.String r1 = "func_147130_as"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.ReflectiveOperationException -> L116 java.lang.Throwable -> L127
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.ReflectiveOperationException -> L116 java.lang.Throwable -> L127
        Lc6:
            r1 = r9
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.ReflectiveOperationException -> L116 java.lang.Throwable -> L127
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.ReflectiveOperationException -> L116 java.lang.Throwable -> L127
            r17 = r0
            r0 = r13
            java.lang.String r1 = "com.mojang.authlib.minecraft.MinecraftSessionService"
            java.lang.Class r0 = r0.loadClass(r1)     // Catch: java.lang.ReflectiveOperationException -> L116 java.lang.Throwable -> L127
            java.lang.String r1 = "fillProfileProperties"
            r2 = 2
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.ReflectiveOperationException -> L116 java.lang.Throwable -> L127
            r3 = r2
            r4 = 0
            r5 = r14
            r3[r4] = r5     // Catch: java.lang.ReflectiveOperationException -> L116 java.lang.Throwable -> L127
            r3 = r2
            r4 = 1
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.ReflectiveOperationException -> L116 java.lang.Throwable -> L127
            r3[r4] = r5     // Catch: java.lang.ReflectiveOperationException -> L116 java.lang.Throwable -> L127
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.ReflectiveOperationException -> L116 java.lang.Throwable -> L127
            r1 = r17
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.ReflectiveOperationException -> L116 java.lang.Throwable -> L127
            r3 = r2
            r4 = 0
            r5 = r15
            r3[r4] = r5     // Catch: java.lang.ReflectiveOperationException -> L116 java.lang.Throwable -> L127
            r3 = r2
            r4 = 1
            r5 = 1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.ReflectiveOperationException -> L116 java.lang.Throwable -> L127
            r3[r4] = r5     // Catch: java.lang.ReflectiveOperationException -> L116 java.lang.Throwable -> L127
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.ReflectiveOperationException -> L116 java.lang.Throwable -> L127
            r18 = r0
            java.util.Map<java.lang.Object, java.util.Optional<java.lang.Object>> r0 = moe.yushi.authlibinjector.transform.support.MC52974_1710Workaround.markedGameProfiles     // Catch: java.lang.ReflectiveOperationException -> L116 java.lang.Throwable -> L127
            r1 = r8
            r2 = r18
            java.util.Optional r2 = java.util.Optional.of(r2)     // Catch: java.lang.ReflectiveOperationException -> L116 java.lang.Throwable -> L127
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.ReflectiveOperationException -> L116 java.lang.Throwable -> L127
            r0 = r18
            r1 = r11
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L127
            return r0
        L116:
            r13 = move-exception
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.WARNING     // Catch: java.lang.Throwable -> L127
            java.lang.String r1 = "Failed to inject GameProfile properties"
            r2 = r13
            moe.yushi.authlibinjector.util.Logging.log(r0, r1, r2)     // Catch: java.lang.Throwable -> L127
        L122:
            r0 = r11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L127
            goto L12e
        L127:
            r19 = move-exception
            r0 = r11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L127
            r0 = r19
            throw r0
        L12e:
            r0 = r8
            return r0
    }

    private static <T> java.util.Optional<T> detectNotchName(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.util.function.Function<java.lang.Boolean, T> r6) {
            r0 = r4
            r1 = r3
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L16
            r0 = r6
            r1 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Object r0 = r0.apply(r1)
            java.util.Optional r0 = java.util.Optional.of(r0)
            return r0
        L16:
            r0 = r5
            r1 = r3
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2c
            r0 = r6
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Object r0 = r0.apply(r1)
            java.util.Optional r0 = java.util.Optional.of(r0)
            return r0
        L2c:
            java.util.Optional r0 = java.util.Optional.empty()
            return r0
    }

    private static /* synthetic */ void lambda$init$0(java.lang.String r5) {
            java.lang.String r0 = "1.7.10"
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L58
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.INFO
            java.lang.String r1 = "Enable MC-52974 Workaround for 1.7.10"
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
            moe.yushi.authlibinjector.transform.ClassTransformer r0 = moe.yushi.authlibinjector.AuthlibInjector.getClassTransformer()
            java.util.List<moe.yushi.authlibinjector.transform.TransformUnit> r0 = r0.units
            moe.yushi.authlibinjector.transform.support.MC52974_1710Workaround$SessionTransformer r1 = new moe.yushi.authlibinjector.transform.support.MC52974_1710Workaround$SessionTransformer
            r2 = r1
            r3 = 0
            r2.<init>(r3)
            boolean r0 = r0.add(r1)
            moe.yushi.authlibinjector.transform.ClassTransformer r0 = moe.yushi.authlibinjector.AuthlibInjector.getClassTransformer()
            java.util.List<moe.yushi.authlibinjector.transform.TransformUnit> r0 = r0.units
            moe.yushi.authlibinjector.transform.support.MC52974_1710Workaround$S0CPacketSpawnPlayerTransformer r1 = new moe.yushi.authlibinjector.transform.support.MC52974_1710Workaround$S0CPacketSpawnPlayerTransformer
            r2 = r1
            r3 = 0
            r2.<init>(r3)
            boolean r0 = r0.add(r1)
            r0 = 4
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = "bbs"
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.String r3 = "net.minecraft.util.Session"
            r1[r2] = r3
            r1 = r0
            r2 = 2
            java.lang.String r3 = "gb"
            r1[r2] = r3
            r1 = r0
            r2 = 3
            java.lang.String r3 = "net.minecraft.network.play.server.S0CPacketSpawnPlayer"
            r1[r2] = r3
            moe.yushi.authlibinjector.AuthlibInjector.retransformClasses(r0)
        L58:
            return
    }

    static /* synthetic */ java.util.Optional access$000(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.util.function.Function r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            java.util.Optional r0 = detectNotchName(r0, r1, r2, r3)
            return r0
    }

    static {
            moe.yushi.authlibinjector.util.WeakIdentityHashMap r0 = new moe.yushi.authlibinjector.util.WeakIdentityHashMap
            r1 = r0
            r1.<init>()
            moe.yushi.authlibinjector.transform.support.MC52974_1710Workaround.markedGameProfiles = r0
            return
    }
}
