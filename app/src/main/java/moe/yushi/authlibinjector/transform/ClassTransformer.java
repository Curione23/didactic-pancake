package moe.yushi.authlibinjector.transform;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/transform/ClassTransformer.class */
public class ClassTransformer implements java.lang.instrument.ClassFileTransformer {
    public final java.util.List<moe.yushi.authlibinjector.transform.TransformUnit> units;
    public final java.util.List<moe.yushi.authlibinjector.transform.ClassLoadingListener> listeners;
    public final moe.yushi.authlibinjector.transform.PerformanceMetrics performanceMetrics;
    private java.lang.String[] ignores;

    /* JADX INFO: renamed from: moe.yushi.authlibinjector.transform.ClassTransformer$1, reason: invalid class name */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/transform/ClassTransformer$1.class */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/transform/ClassTransformer$TransformHandle.class */
    private class TransformHandle {
        private final java.lang.String className;
        private final java.lang.ClassLoader classLoader;
        private byte[] classBuffer;
        private moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassReader cachedClassReader;
        private java.util.List<java.lang.String> cachedConstants;
        private java.util.List<moe.yushi.authlibinjector.transform.TransformUnit> appliedTransformers;
        private boolean addCallbackMetafactory;
        private java.util.Map<java.lang.String, java.util.function.Consumer<moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassVisitor>> generatedMethods;
        final /* synthetic */ moe.yushi.authlibinjector.transform.ClassTransformer this$0;



        /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/transform/ClassTransformer$TransformHandle$TransformContextImpl.class */
        private class TransformContextImpl implements moe.yushi.authlibinjector.transform.TransformContext {
            public boolean modifiedMark;
            public boolean callbackMetafactoryRequested;
            final /* synthetic */ moe.yushi.authlibinjector.transform.ClassTransformer.TransformHandle this$1;

            private TransformContextImpl(moe.yushi.authlibinjector.transform.ClassTransformer.TransformHandle r4) {
                    r3 = this;
                    r0 = r3
                    r1 = r4
                    r0.this$1 = r1
                    r0 = r3
                    r0.<init>()
                    r0 = r3
                    r1 = 0
                    r0.callbackMetafactoryRequested = r1
                    return
            }

            @Override // moe.yushi.authlibinjector.transform.TransformContext
            public void markModified() {
                    r3 = this;
                    r0 = r3
                    r1 = 1
                    r0.modifiedMark = r1
                    return
            }

            @Override // moe.yushi.authlibinjector.transform.TransformContext
            public java.util.List<java.lang.String> getStringConstants() {
                    r2 = this;
                    r0 = r2
                    moe.yushi.authlibinjector.transform.ClassTransformer$TransformHandle r0 = r0.this$1
                    java.util.List r0 = moe.yushi.authlibinjector.transform.ClassTransformer.TransformHandle.access$000(r0)
                    return r0
            }

            @Override // moe.yushi.authlibinjector.transform.TransformContext
            public java.lang.String getClassName() {
                    r2 = this;
                    r0 = r2
                    moe.yushi.authlibinjector.transform.ClassTransformer$TransformHandle r0 = r0.this$1
                    java.lang.String r0 = moe.yushi.authlibinjector.transform.ClassTransformer.TransformHandle.access$100(r0)
                    return r0
            }

            @Override // moe.yushi.authlibinjector.transform.TransformContext
            public boolean isInterface() {
                    r2 = this;
                    r0 = r2
                    moe.yushi.authlibinjector.transform.ClassTransformer$TransformHandle r0 = r0.this$1
                    boolean r0 = moe.yushi.authlibinjector.transform.ClassTransformer.TransformHandle.access$200(r0)
                    return r0
            }

            @Override // moe.yushi.authlibinjector.transform.TransformContext
            public void invokeCallback(moe.yushi.authlibinjector.internal.org.objectweb.asm.MethodVisitor r6, java.lang.Class<?> r7, java.lang.String r8) {
                    r5 = this;
                    r0 = r5
                    moe.yushi.authlibinjector.transform.ClassTransformer$TransformHandle r0 = r0.this$1
                    int r0 = moe.yushi.authlibinjector.transform.ClassTransformer.TransformHandle.access$300(r0)
                    r1 = 65535(0xffff, float:9.1834E-41)
                    r0 = r0 & r1
                    r1 = 50
                    if (r0 < r1) goto L13
                    r0 = 1
                    goto L14
                L13:
                    r0 = 0
                L14:
                    r9 = r0
                    r0 = r9
                    if (r0 == 0) goto L2e
                    r0 = r5
                    moe.yushi.authlibinjector.transform.ClassTransformer$TransformHandle r0 = r0.this$1
                    r1 = 1
                    boolean r0 = moe.yushi.authlibinjector.transform.ClassTransformer.TransformHandle.access$402(r0, r1)
                    r0 = r6
                    r1 = r7
                    r2 = r8
                    r3 = r5
                    moe.yushi.authlibinjector.transform.CallbackSupport.callWithInvokeDynamic(r0, r1, r2, r3)
                    goto L35
                L2e:
                    r0 = r6
                    r1 = r7
                    r2 = r8
                    r3 = r5
                    moe.yushi.authlibinjector.transform.CallbackSupport.callWithIntermediateMethod(r0, r1, r2, r3)
                L35:
                    return
            }

            @Override // moe.yushi.authlibinjector.transform.TransformContext
            public void addGeneratedMethod(java.lang.String r5, java.util.function.Consumer<moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassVisitor> r6) {
                    r4 = this;
                    r0 = r4
                    moe.yushi.authlibinjector.transform.ClassTransformer$TransformHandle r0 = r0.this$1
                    java.util.Map r0 = moe.yushi.authlibinjector.transform.ClassTransformer.TransformHandle.access$500(r0)
                    if (r0 != 0) goto L19
                    r0 = r4
                    moe.yushi.authlibinjector.transform.ClassTransformer$TransformHandle r0 = r0.this$1
                    java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
                    r2 = r1
                    r2.<init>()
                    java.util.Map r0 = moe.yushi.authlibinjector.transform.ClassTransformer.TransformHandle.access$502(r0, r1)
                L19:
                    r0 = r4
                    moe.yushi.authlibinjector.transform.ClassTransformer$TransformHandle r0 = r0.this$1
                    java.util.Map r0 = moe.yushi.authlibinjector.transform.ClassTransformer.TransformHandle.access$500(r0)
                    r1 = r5
                    r2 = r6
                    java.lang.Object r0 = r0.put(r1, r2)
                    return
            }

            /* synthetic */ TransformContextImpl(moe.yushi.authlibinjector.transform.ClassTransformer.TransformHandle r4, moe.yushi.authlibinjector.transform.ClassTransformer.AnonymousClass1 r5) {
                    r3 = this;
                    r0 = r3
                    r1 = r4
                    r0.<init>(r1)
                    return
            }
        }

        public TransformHandle(moe.yushi.authlibinjector.transform.ClassTransformer r4, java.lang.ClassLoader r5, java.lang.String r6, byte[] r7) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.this$0 = r1
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = 0
                r0.addCallbackMetafactory = r1
                r0 = r3
                r1 = r6
                r0.className = r1
                r0 = r3
                r1 = r7
                r0.classBuffer = r1
                r0 = r3
                r1 = r5
                r0.classLoader = r1
                return
        }

        private moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassReader getClassReader() {
                r5 = this;
                r0 = r5
                moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassReader r0 = r0.cachedClassReader
                if (r0 != 0) goto L16
                r0 = r5
                moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassReader r1 = new moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassReader
                r2 = r1
                r3 = r5
                byte[] r3 = r3.classBuffer
                r2.<init>(r3)
                r0.cachedClassReader = r1
            L16:
                r0 = r5
                moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassReader r0 = r0.cachedClassReader
                return r0
        }

        private boolean isInterface() {
                r3 = this;
                r0 = r3
                moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassReader r0 = r0.getClassReader()
                int r0 = r0.getAccess()
                r1 = 512(0x200, float:7.17E-43)
                r0 = r0 & r1
                if (r0 == 0) goto L12
                r0 = 1
                goto L13
            L12:
                r0 = 0
            L13:
                return r0
        }

        private java.util.List<java.lang.String> getStringConstants() {
                r3 = this;
                r0 = r3
                java.util.List<java.lang.String> r0 = r0.cachedConstants
                if (r0 != 0) goto L12
                r0 = r3
                r1 = r3
                moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassReader r1 = r1.getClassReader()
                java.util.List r1 = moe.yushi.authlibinjector.transform.ClassTransformer.access$600(r1)
                r0.cachedConstants = r1
            L12:
                r0 = r3
                java.util.List<java.lang.String> r0 = r0.cachedConstants
                return r0
        }

        private int getClassVersion() {
                r4 = this;
                r0 = r4
                moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassReader r0 = r0.getClassReader()
                r5 = r0
                r0 = r5
                r1 = r5
                r2 = 1
                int r1 = r1.getItem(r2)
                r2 = 7
                int r1 = r1 - r2
                int r0 = r0.readInt(r1)
                return r0
        }

        public void accept(moe.yushi.authlibinjector.transform.TransformUnit... r9) {
                r8 = this;
                long r0 = java.lang.System.nanoTime()
                r10 = r0
                moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassWriter r0 = new moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassWriter
                r1 = r0
                r2 = 1
                r1.<init>(r2)
                r12 = r0
                r0 = r9
                int r0 = r0.length
                moe.yushi.authlibinjector.transform.ClassTransformer$TransformHandle$TransformContextImpl[] r0 = new moe.yushi.authlibinjector.transform.ClassTransformer.TransformHandle.TransformContextImpl[r0]
                r13 = r0
                r0 = r12
                r14 = r0
                r0 = r9
                int r0 = r0.length
                r1 = 1
                int r0 = r0 - r1
                r15 = r0
            L1f:
                r0 = r15
                if (r0 < 0) goto L68
                moe.yushi.authlibinjector.transform.ClassTransformer$TransformHandle$TransformContextImpl r0 = new moe.yushi.authlibinjector.transform.ClassTransformer$TransformHandle$TransformContextImpl
                r1 = r0
                r2 = r8
                r3 = 0
                r1.<init>(r2, r3)
                r16 = r0
                r0 = r9
                r1 = r15
                r0 = r0[r1]
                r1 = r8
                java.lang.ClassLoader r1 = r1.classLoader
                r2 = r8
                java.lang.String r2 = r2.className
                r3 = r14
                r4 = r16
                java.util.Optional r0 = r0.transform(r1, r2, r3, r4)
                r17 = r0
                r0 = r17
                boolean r0 = r0.isPresent()
                if (r0 != 0) goto L51
                goto L62
            L51:
                r0 = r13
                r1 = r15
                r2 = r16
                r0[r1] = r2
                r0 = r17
                java.lang.Object r0 = r0.get()
                moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassVisitor r0 = (moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassVisitor) r0
                r14 = r0
            L62:
                int r15 = r15 + (-1)
                goto L1f
            L68:
                long r0 = java.lang.System.nanoTime()
                r15 = r0
                r0 = r8
                moe.yushi.authlibinjector.transform.ClassTransformer r0 = r0.this$0
                moe.yushi.authlibinjector.transform.PerformanceMetrics r0 = r0.performanceMetrics
                r1 = r0
                r17 = r1
                monitor-enter(r0)
                r0 = r8
                moe.yushi.authlibinjector.transform.ClassTransformer r0 = r0.this$0     // Catch: java.lang.Throwable -> L91
                moe.yushi.authlibinjector.transform.PerformanceMetrics r0 = r0.performanceMetrics     // Catch: java.lang.Throwable -> L91
                r1 = r0
                long r1 = r1.scanTime     // Catch: java.lang.Throwable -> L91
                r2 = r15
                r3 = r10
                long r2 = r2 - r3
                long r1 = r1 + r2
                r0.scanTime = r1     // Catch: java.lang.Throwable -> L91
                r0 = r17
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L91
                goto L99
            L91:
                r18 = move-exception
                r0 = r17
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L91
                r0 = r18
                throw r0
            L99:
                r0 = r14
                r1 = r12
                if (r0 != r1) goto La1
                return
            La1:
                long r0 = java.lang.System.nanoTime()
                r10 = r0
                r0 = r8
                moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassReader r0 = r0.getClassReader()
                r1 = r14
                r2 = 0
                r0.accept(r1, r2)
                long r0 = java.lang.System.nanoTime()
                r15 = r0
                r0 = r8
                moe.yushi.authlibinjector.transform.ClassTransformer r0 = r0.this$0
                moe.yushi.authlibinjector.transform.PerformanceMetrics r0 = r0.performanceMetrics
                r1 = r0
                r17 = r1
                monitor-enter(r0)
                r0 = r8
                moe.yushi.authlibinjector.transform.ClassTransformer r0 = r0.this$0     // Catch: java.lang.Throwable -> Ld8
                moe.yushi.authlibinjector.transform.PerformanceMetrics r0 = r0.performanceMetrics     // Catch: java.lang.Throwable -> Ld8
                r1 = r0
                long r1 = r1.analysisTime     // Catch: java.lang.Throwable -> Ld8
                r2 = r15
                r3 = r10
                long r2 = r2 - r3
                long r1 = r1 + r2
                r0.analysisTime = r1     // Catch: java.lang.Throwable -> Ld8
                r0 = r17
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld8
                goto Le0
            Ld8:
                r19 = move-exception
                r0 = r17
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld8
                r0 = r19
                throw r0
            Le0:
                r0 = 0
                r17 = r0
                r0 = 0
                r18 = r0
            Le6:
                r0 = r18
                r1 = r9
                int r1 = r1.length
                if (r0 >= r1) goto L168
                r0 = r13
                r1 = r18
                r0 = r0[r1]
                r19 = r0
                r0 = r19
                if (r0 == 0) goto L162
                r0 = r19
                boolean r0 = r0.modifiedMark
                if (r0 != 0) goto L104
                goto L162
            L104:
                moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.INFO
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r2 = r1
                r2.<init>()
                java.lang.String r2 = "Transformed ["
                java.lang.StringBuilder r1 = r1.append(r2)
                r2 = r8
                java.lang.String r2 = r2.className
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = "] with ["
                java.lang.StringBuilder r1 = r1.append(r2)
                r2 = r9
                r3 = r18
                r2 = r2[r3]
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = "]"
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                moe.yushi.authlibinjector.util.Logging.log(r0, r1)
                r0 = r8
                java.util.List<moe.yushi.authlibinjector.transform.TransformUnit> r0 = r0.appliedTransformers
                if (r0 != 0) goto L143
                r0 = r8
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = r1
                r2.<init>()
                r0.appliedTransformers = r1
            L143:
                r0 = r8
                java.util.List<moe.yushi.authlibinjector.transform.TransformUnit> r0 = r0.appliedTransformers
                r1 = r9
                r2 = r18
                r1 = r1[r2]
                boolean r0 = r0.add(r1)
                r0 = r8
                r1 = r0
                boolean r1 = r1.addCallbackMetafactory
                r2 = r19
                boolean r2 = r2.callbackMetafactoryRequested
                r1 = r1 | r2
                r0.addCallbackMetafactory = r1
                r0 = 1
                r17 = r0
            L162:
                int r18 = r18 + 1
                goto Le6
            L168:
                r0 = r17
                if (r0 == 0) goto L176
                r0 = r8
                r1 = r12
                byte[] r1 = r1.toByteArray()
                r0.updateClassBuffer(r1)
            L176:
                return
        }

        private void injectCallbackMetafactory() {
                r7 = this;
                moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.DEBUG
                java.lang.String r1 = "Adding callback metafactory"
                moe.yushi.authlibinjector.util.Logging.log(r0, r1)
                r0 = r7
                int r0 = r0.getClassVersion()
                r8 = r0
                r0 = r8
                r1 = 65535(0xffff, float:9.1834E-41)
                r0 = r0 & r1
                r9 = r0
                r0 = r9
                r1 = 51
                if (r0 >= r1) goto L40
                r0 = 51
                r10 = r0
                moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.DEBUG
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r2 = r1
                r2.<init>()
                java.lang.String r2 = "Upgrading class version from "
                java.lang.StringBuilder r1 = r1.append(r2)
                r2 = r8
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = " to "
                java.lang.StringBuilder r1 = r1.append(r2)
                r2 = r10
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                moe.yushi.authlibinjector.util.Logging.log(r0, r1)
                goto L42
            L40:
                r0 = r8
                r10 = r0
            L42:
                r0 = r7
                moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassReader r0 = r0.getClassReader()
                r11 = r0
                moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassWriter r0 = new moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassWriter
                r1 = r0
                r2 = r11
                r3 = 1
                r1.<init>(r2, r3)
                r12 = r0
                moe.yushi.authlibinjector.transform.ClassTransformer$TransformHandle$1 r0 = new moe.yushi.authlibinjector.transform.ClassTransformer$TransformHandle$1
                r1 = r0
                r2 = r7
                r3 = 589824(0x90000, float:8.2652E-40)
                r4 = r12
                r5 = r10
                r1.<init>(r2, r3, r4, r5)
                r13 = r0
                r0 = r11
                r1 = r13
                r2 = 0
                r0.accept(r1, r2)
                r0 = r7
                r1 = r12
                byte[] r1 = r1.toByteArray()
                r0.updateClassBuffer(r1)
                return
        }

        private void injectGeneratedMethods() {
                r6 = this;
                r0 = r6
                moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassReader r0 = r0.getClassReader()
                r7 = r0
                moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassWriter r0 = new moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassWriter
                r1 = r0
                r2 = r7
                r3 = 1
                r1.<init>(r2, r3)
                r8 = r0
                moe.yushi.authlibinjector.transform.ClassTransformer$TransformHandle$2 r0 = new moe.yushi.authlibinjector.transform.ClassTransformer$TransformHandle$2
                r1 = r0
                r2 = r6
                r3 = 589824(0x90000, float:8.2652E-40)
                r4 = r8
                r1.<init>(r2, r3, r4)
                r9 = r0
                r0 = r7
                r1 = r9
                r2 = 0
                r0.accept(r1, r2)
                r0 = r6
                r1 = r8
                byte[] r1 = r1.toByteArray()
                r0.updateClassBuffer(r1)
                return
        }

        private void updateClassBuffer(byte[] r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.classBuffer = r1
                r0 = r3
                r1 = 0
                r0.cachedClassReader = r1
                r0 = r3
                r1 = 0
                r0.cachedConstants = r1
                return
        }

        public java.util.Optional<byte[]> finish() {
                r2 = this;
                r0 = r2
                java.util.List<moe.yushi.authlibinjector.transform.TransformUnit> r0 = r0.appliedTransformers
                if (r0 == 0) goto L13
                r0 = r2
                java.util.List<moe.yushi.authlibinjector.transform.TransformUnit> r0 = r0.appliedTransformers
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L17
            L13:
                java.util.Optional r0 = java.util.Optional.empty()
                return r0
            L17:
                r0 = r2
                boolean r0 = r0.addCallbackMetafactory
                if (r0 == 0) goto L22
                r0 = r2
                r0.injectCallbackMetafactory()
            L22:
                r0 = r2
                java.util.Map<java.lang.String, java.util.function.Consumer<moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassVisitor>> r0 = r0.generatedMethods
                if (r0 == 0) goto L2d
                r0 = r2
                r0.injectGeneratedMethods()
            L2d:
                r0 = r2
                byte[] r0 = r0.classBuffer
                java.util.Optional r0 = java.util.Optional.of(r0)
                return r0
        }

        public java.util.List<moe.yushi.authlibinjector.transform.TransformUnit> getAppliedTransformers() {
                r2 = this;
                r0 = r2
                java.util.List<moe.yushi.authlibinjector.transform.TransformUnit> r0 = r0.appliedTransformers
                if (r0 != 0) goto Ld
                java.util.List r0 = java.util.Collections.emptyList()
                goto L11
            Ld:
                r0 = r2
                java.util.List<moe.yushi.authlibinjector.transform.TransformUnit> r0 = r0.appliedTransformers
            L11:
                return r0
        }

        public byte[] getFinalResult() {
                r2 = this;
                r0 = r2
                byte[] r0 = r0.classBuffer
                return r0
        }

        static /* synthetic */ java.util.List access$000(moe.yushi.authlibinjector.transform.ClassTransformer.TransformHandle r2) {
                r0 = r2
                java.util.List r0 = r0.getStringConstants()
                return r0
        }

        static /* synthetic */ java.lang.String access$100(moe.yushi.authlibinjector.transform.ClassTransformer.TransformHandle r2) {
                r0 = r2
                java.lang.String r0 = r0.className
                return r0
        }

        static /* synthetic */ boolean access$200(moe.yushi.authlibinjector.transform.ClassTransformer.TransformHandle r2) {
                r0 = r2
                boolean r0 = r0.isInterface()
                return r0
        }

        static /* synthetic */ int access$300(moe.yushi.authlibinjector.transform.ClassTransformer.TransformHandle r2) {
                r0 = r2
                int r0 = r0.getClassVersion()
                return r0
        }

        static /* synthetic */ boolean access$402(moe.yushi.authlibinjector.transform.ClassTransformer.TransformHandle r4, boolean r5) {
                r0 = r4
                r1 = r5
                r2 = r1; r1 = r0; r0 = r2; 
                r1.addCallbackMetafactory = r2
                return r0
        }

        static /* synthetic */ java.util.Map access$500(moe.yushi.authlibinjector.transform.ClassTransformer.TransformHandle r2) {
                r0 = r2
                java.util.Map<java.lang.String, java.util.function.Consumer<moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassVisitor>> r0 = r0.generatedMethods
                return r0
        }

        static /* synthetic */ java.util.Map access$502(moe.yushi.authlibinjector.transform.ClassTransformer.TransformHandle r4, java.util.Map r5) {
                r0 = r4
                r1 = r5
                r2 = r1; r1 = r0; r0 = r2; 
                r1.generatedMethods = r2
                return r0
        }
    }

    public ClassTransformer() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r2 = r1
            r2.<init>()
            r0.units = r1
            r0 = r4
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r2 = r1
            r2.<init>()
            r0.listeners = r1
            r0 = r4
            moe.yushi.authlibinjector.transform.PerformanceMetrics r1 = new moe.yushi.authlibinjector.transform.PerformanceMetrics
            r2 = r1
            r2.<init>()
            r0.performanceMetrics = r1
            r0 = r4
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            r0.ignores = r1
            return
    }

    public byte[] transform(java.lang.ClassLoader r9, java.lang.String r10, java.lang.Class<?> r11, java.security.ProtectionDomain r12, byte[] r13) throws java.lang.instrument.IllegalClassFormatException {
            r8 = this;
            r0 = r10
            if (r0 == 0) goto L18d
            r0 = r13
            if (r0 == 0) goto L18d
            long r0 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L16b
            r14 = r0
            r0 = r10
            r1 = 47
            r2 = 46
            java.lang.String r0 = r0.replace(r1, r2)     // Catch: java.lang.Throwable -> L16b
            r16 = r0
            r0 = r8
            java.lang.String[] r0 = r0.ignores     // Catch: java.lang.Throwable -> L16b
            r17 = r0
            r0 = r17
            int r0 = r0.length     // Catch: java.lang.Throwable -> L16b
            r18 = r0
            r0 = 0
            r19 = r0
        L26:
            r0 = r19
            r1 = r18
            if (r0 >= r1) goto La3
            r0 = r17
            r1 = r19
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L16b
            r20 = r0
            r0 = r16
            r1 = r20
            boolean r0 = r0.startsWith(r1)     // Catch: java.lang.Throwable -> L16b
            if (r0 == 0) goto L9d
            r0 = r8
            java.util.List<moe.yushi.authlibinjector.transform.ClassLoadingListener> r0 = r0.listeners     // Catch: java.lang.Throwable -> L16b
            r1 = r9
            r2 = r16
            r3 = r13
            byte[] r1 = (v3) -> { // java.util.function.Consumer.accept(java.lang.Object):void
                lambda$transform$0(r1, r2, r3, v3);
            }     // Catch: java.lang.Throwable -> L16b
            r0.forEach(r1)     // Catch: java.lang.Throwable -> L16b
            long r0 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L16b
            r21 = r0
            r0 = r8
            moe.yushi.authlibinjector.transform.PerformanceMetrics r0 = r0.performanceMetrics     // Catch: java.lang.Throwable -> L16b
            r1 = r0
            r23 = r1
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L16b
            r0 = r8
            moe.yushi.authlibinjector.transform.PerformanceMetrics r0 = r0.performanceMetrics     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L16b
            r1 = r0
            long r1 = r1.classesSkipped     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L16b
            r2 = 1
            long r1 = r1 + r2
            r0.classesSkipped = r1     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L16b
            r0 = r8
            moe.yushi.authlibinjector.transform.PerformanceMetrics r0 = r0.performanceMetrics     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L16b
            r1 = r0
            long r1 = r1.totalTime     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L16b
            r2 = r21
            r3 = r14
            long r2 = r2 - r3
            long r1 = r1 + r2
            r0.totalTime = r1     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L16b
            r0 = r8
            moe.yushi.authlibinjector.transform.PerformanceMetrics r0 = r0.performanceMetrics     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L16b
            r1 = r0
            long r1 = r1.matchTime     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L16b
            r2 = r21
            r3 = r14
            long r2 = r2 - r3
            long r1 = r1 + r2
            r0.matchTime = r1     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L16b
            r0 = r23
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L16b
            goto L9b
        L93:
            r24 = move-exception
            r0 = r23
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L16b
            r0 = r24
            throw r0     // Catch: java.lang.Throwable -> L16b
        L9b:
            r0 = 0
            return r0
        L9d:
            int r19 = r19 + 1
            goto L26
        La3:
            long r0 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L16b
            r17 = r0
            moe.yushi.authlibinjector.transform.ClassTransformer$TransformHandle r0 = new moe.yushi.authlibinjector.transform.ClassTransformer$TransformHandle     // Catch: java.lang.Throwable -> L16b
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r16
            r5 = r13
            r1.<init>(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L16b
            r19 = r0
            r0 = r8
            java.util.List<moe.yushi.authlibinjector.transform.TransformUnit> r0 = r0.units     // Catch: java.lang.Throwable -> L16b
            r1 = 0
            moe.yushi.authlibinjector.transform.TransformUnit[] r1 = new moe.yushi.authlibinjector.transform.TransformUnit[r1]     // Catch: java.lang.Throwable -> L16b
            java.lang.Object[] r0 = r0.toArray(r1)     // Catch: java.lang.Throwable -> L16b
            moe.yushi.authlibinjector.transform.TransformUnit[] r0 = (moe.yushi.authlibinjector.transform.TransformUnit[]) r0     // Catch: java.lang.Throwable -> L16b
            r20 = r0
            r0 = r19
            r1 = r20
            r0.accept(r1)     // Catch: java.lang.Throwable -> L16b
            r0 = r19
            java.util.Optional r0 = r0.finish()     // Catch: java.lang.Throwable -> L16b
            r21 = r0
            boolean r0 = moe.yushi.authlibinjector.Config.printUntransformedClass     // Catch: java.lang.Throwable -> L16b
            if (r0 == 0) goto L104
            r0 = r21
            boolean r0 = r0.isPresent()     // Catch: java.lang.Throwable -> L16b
            if (r0 != 0) goto L104
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.DEBUG     // Catch: java.lang.Throwable -> L16b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16b
            r2 = r1
            r2.<init>()     // Catch: java.lang.Throwable -> L16b
            java.lang.String r2 = "No transformation is applied to ["
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L16b
            r2 = r16
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L16b
            java.lang.String r2 = "]"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L16b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L16b
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)     // Catch: java.lang.Throwable -> L16b
        L104:
            r0 = r8
            java.util.List<moe.yushi.authlibinjector.transform.ClassLoadingListener> r0 = r0.listeners     // Catch: java.lang.Throwable -> L16b
            r1 = r9
            r2 = r16
            r3 = r19
            byte[] r1 = (v3) -> { // java.util.function.Consumer.accept(java.lang.Object):void
                lambda$transform$1(r1, r2, r3, v3);
            }     // Catch: java.lang.Throwable -> L16b
            r0.forEach(r1)     // Catch: java.lang.Throwable -> L16b
            long r0 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L16b
            r22 = r0
            r0 = r8
            moe.yushi.authlibinjector.transform.PerformanceMetrics r0 = r0.performanceMetrics     // Catch: java.lang.Throwable -> L16b
            r1 = r0
            r24 = r1
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L16b
            r0 = r8
            moe.yushi.authlibinjector.transform.PerformanceMetrics r0 = r0.performanceMetrics     // Catch: java.lang.Throwable -> L159 java.lang.Throwable -> L16b
            r1 = r0
            long r1 = r1.classesScanned     // Catch: java.lang.Throwable -> L159 java.lang.Throwable -> L16b
            r2 = 1
            long r1 = r1 + r2
            r0.classesScanned = r1     // Catch: java.lang.Throwable -> L159 java.lang.Throwable -> L16b
            r0 = r8
            moe.yushi.authlibinjector.transform.PerformanceMetrics r0 = r0.performanceMetrics     // Catch: java.lang.Throwable -> L159 java.lang.Throwable -> L16b
            r1 = r0
            long r1 = r1.totalTime     // Catch: java.lang.Throwable -> L159 java.lang.Throwable -> L16b
            r2 = r22
            r3 = r14
            long r2 = r2 - r3
            long r1 = r1 + r2
            r0.totalTime = r1     // Catch: java.lang.Throwable -> L159 java.lang.Throwable -> L16b
            r0 = r8
            moe.yushi.authlibinjector.transform.PerformanceMetrics r0 = r0.performanceMetrics     // Catch: java.lang.Throwable -> L159 java.lang.Throwable -> L16b
            r1 = r0
            long r1 = r1.matchTime     // Catch: java.lang.Throwable -> L159 java.lang.Throwable -> L16b
            r2 = r17
            r3 = r14
            long r2 = r2 - r3
            long r1 = r1 + r2
            r0.matchTime = r1     // Catch: java.lang.Throwable -> L159 java.lang.Throwable -> L16b
            r0 = r24
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L159 java.lang.Throwable -> L16b
            goto L161
        L159:
            r25 = move-exception
            r0 = r24
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L159 java.lang.Throwable -> L16b
            r0 = r25
            throw r0     // Catch: java.lang.Throwable -> L16b
        L161:
            r0 = r21
            r1 = 0
            java.lang.Object r0 = r0.orElse(r1)     // Catch: java.lang.Throwable -> L16b
            byte[] r0 = (byte[]) r0     // Catch: java.lang.Throwable -> L16b
            return r0
        L16b:
            r14 = move-exception
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.WARNING
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Failed to transform ["
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r10
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "]"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = r14
            moe.yushi.authlibinjector.util.Logging.log(r0, r1, r2)
        L18d:
            r0 = 0
            return r0
    }

    private static java.util.List<java.lang.String> extractStringConstants(moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassReader r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r4
            int r0 = r0.getItemCount()
            r6 = r0
            r0 = r4
            int r0 = r0.getMaxStringLength()
            char[] r0 = new char[r0]
            r7 = r0
            r0 = 1
            r8 = r0
        L17:
            r0 = r8
            r1 = r6
            if (r0 >= r1) goto L59
            r0 = r4
            r1 = r8
            int r0 = r0.getItem(r1)
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L2d
            goto L53
        L2d:
            r0 = r4
            r1 = r9
            r2 = 1
            int r1 = r1 - r2
            int r0 = r0.readByte(r1)
            r10 = r0
            r0 = r10
            r1 = 8
            if (r0 != r1) goto L53
            r0 = r4
            r1 = r8
            r2 = r7
            java.lang.Object r0 = r0.readConst(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r11 = r0
            r0 = r5
            r1 = r11
            boolean r0 = r0.add(r1)
        L53:
            int r8 = r8 + 1
            goto L17
        L59:
            r0 = r5
            return r0
    }

    public void setIgnores(java.util.Collection<java.lang.String> r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            java.lang.String[] r2 = r2.ignores
            java.lang.Object[] r1 = r1.toArray(r2)
            java.lang.String[] r1 = (java.lang.String[]) r1
            r0.ignores = r1
            return
    }

    private static /* synthetic */ void lambda$transform$1(java.lang.ClassLoader r6, java.lang.String r7, moe.yushi.authlibinjector.transform.ClassTransformer.TransformHandle r8, moe.yushi.authlibinjector.transform.ClassLoadingListener r9) {
            r0 = r9
            r1 = r6
            r2 = r7
            r3 = r8
            byte[] r3 = r3.getFinalResult()
            r4 = r8
            java.util.List r4 = r4.getAppliedTransformers()
            r0.onClassLoading(r1, r2, r3, r4)
            return
    }

    private static /* synthetic */ void lambda$transform$0(java.lang.ClassLoader r6, java.lang.String r7, byte[] r8, moe.yushi.authlibinjector.transform.ClassLoadingListener r9) {
            r0 = r9
            r1 = r6
            r2 = r7
            r3 = r8
            java.util.List r4 = java.util.Collections.emptyList()
            r0.onClassLoading(r1, r2, r3, r4)
            return
    }

    static /* synthetic */ java.util.List access$600(moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassReader r2) {
            r0 = r2
            java.util.List r0 = extractStringConstants(r0)
            return r0
    }
}
