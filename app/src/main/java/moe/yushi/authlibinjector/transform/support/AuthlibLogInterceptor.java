package moe.yushi.authlibinjector.transform.support;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/transform/support/AuthlibLogInterceptor.class */
public class AuthlibLogInterceptor implements moe.yushi.authlibinjector.transform.TransformUnit {
    private static java.util.Set<java.lang.ClassLoader> interceptedClassloaders;


    public AuthlibLogInterceptor() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @moe.yushi.authlibinjector.transform.CallbackMethod
    public static void onClassLoading(java.lang.ClassLoader r4) {
            r0 = r4
            java.lang.String r1 = "org.apache.logging.log4j.LogManager"
            java.lang.Class r0 = r0.loadClass(r1)     // Catch: java.lang.ClassNotFoundException -> La
            r5 = r0
            goto Lc
        La:
            r6 = move-exception
            return
        Lc:
            r0 = r5
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r6 = r0
            java.util.Set<java.lang.ClassLoader> r0 = moe.yushi.authlibinjector.transform.support.AuthlibLogInterceptor.interceptedClassloaders
            r1 = r0
            r7 = r1
            monitor-enter(r0)
            java.util.Set<java.lang.ClassLoader> r0 = moe.yushi.authlibinjector.transform.support.AuthlibLogInterceptor.interceptedClassloaders     // Catch: java.lang.Throwable -> L2b
            r1 = r6
            boolean r0 = r0.add(r1)     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L26
            r0 = r7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            return
        L26:
            r0 = r7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            goto L32
        L2b:
            r8 = move-exception
            r0 = r7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            r0 = r8
            throw r0
        L32:
            r0 = r6
            registerLogHandle(r0)     // Catch: java.lang.Throwable -> L52
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.INFO     // Catch: java.lang.Throwable -> L52
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r2 = r1
            r2.<init>()     // Catch: java.lang.Throwable -> L52
            java.lang.String r2 = "Registered log handler on "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L52
            r2 = r6
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L52
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L52
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)     // Catch: java.lang.Throwable -> L52
            goto L6d
        L52:
            r7 = move-exception
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.WARNING
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Failed to register log handler on "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r6
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = r7
            moe.yushi.authlibinjector.util.Logging.log(r0, r1, r2)
        L6d:
            return
    }

    private static void registerLogHandle(java.lang.ClassLoader r8) throws java.lang.ReflectiveOperationException {
            java.lang.String r0 = "AUTHLIB_INJECTOR_CONSOLE_APPENDER"
            r9 = r0
            java.lang.String r0 = "AUTHLIB_INJECTOR_AUTHLIB_LOGGER"
            r10 = r0
            java.lang.String r0 = "com.mojang.authlib"
            r11 = r0
            r0 = r8
            java.lang.String r1 = "org.apache.logging.log4j.core.Layout"
            java.lang.Class r0 = r0.loadClass(r1)
            r12 = r0
            r0 = r8
            java.lang.String r1 = "org.apache.logging.log4j.core.Appender"
            java.lang.Class r0 = r0.loadClass(r1)
            r13 = r0
            r0 = r8
            java.lang.String r1 = "org.apache.logging.log4j.core.config.AppenderRef"
            java.lang.Class r0 = r0.loadClass(r1)
            r14 = r0
            r0 = r8
            java.lang.String r1 = "org.apache.logging.log4j.Level"
            java.lang.Class r0 = r0.loadClass(r1)
            r15 = r0
            r0 = r8
            java.lang.String r1 = "org.apache.logging.log4j.core.Filter"
            java.lang.Class r0 = r0.loadClass(r1)
            r16 = r0
            r0 = r8
            java.lang.String r1 = "org.apache.logging.log4j.core.config.LoggerConfig"
            java.lang.Class r0 = r0.loadClass(r1)
            r17 = r0
            r0 = r8
            java.lang.String r1 = "org.apache.logging.log4j.core.config.Configuration"
            java.lang.Class r0 = r0.loadClass(r1)
            r18 = r0
            r0 = r8
            java.lang.String r1 = "org.apache.logging.log4j.core.layout.PatternLayout"
            java.lang.Class r0 = r0.loadClass(r1)
            r19 = r0
            r0 = r8
            java.lang.String r1 = "org.apache.logging.log4j.core.appender.ConsoleAppender"
            java.lang.Class r0 = r0.loadClass(r1)
            r20 = r0
            r0 = r8
            java.lang.String r1 = "org.apache.logging.log4j.LogManager"
            java.lang.Class r0 = r0.loadClass(r1)
            java.lang.String r1 = "getContext"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = r2
            r4 = 0
            java.lang.Class r5 = java.lang.Boolean.TYPE
            r3[r4] = r5
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)
            r1 = 0
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            r21 = r0
            r0 = r8
            java.lang.String r1 = "org.apache.logging.log4j.core.LoggerContext"
            java.lang.Class r0 = r0.loadClass(r1)
            java.lang.String r1 = "getConfiguration"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)
            r1 = r21
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r0 = r0.invoke(r1, r2)
            r22 = r0
            r0 = r19
            java.lang.String r1 = "newBuilder"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> Lc7
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> Lc7
            r1 = 0
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.NoSuchMethodException -> Lc7
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.NoSuchMethodException -> Lc7
            r24 = r0
            r0 = r8
            java.lang.String r1 = "org.apache.logging.log4j.core.layout.PatternLayout$Builder"
            java.lang.Class r0 = r0.loadClass(r1)     // Catch: java.lang.NoSuchMethodException -> Lc7
            r25 = r0
            r0 = r25
            java.lang.String r1 = "build"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> Lc7
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> Lc7
            r1 = r24
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.NoSuchMethodException -> Lc7
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.NoSuchMethodException -> Lc7
            r23 = r0
            goto Lfb
        Lc7:
            r24 = move-exception
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r25 = r0
            r0 = r25
            java.lang.String r1 = "alwaysWriteExceptions"
            r2 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r25
            java.lang.String r1 = "noConsoleNoAnsi"
            r2 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r19
            java.lang.String r1 = "createLayout"
            r2 = r22
            r3 = r25
            java.lang.Object r0 = invokeCreateMethod(r0, r1, r2, r3)
            r23 = r0
        Lfb:
            r0 = r20
            java.lang.String r1 = "newBuilder"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L16f
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L16f
            r1 = 0
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.NoSuchMethodException -> L16f
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L16f
            r25 = r0
            r0 = r8
            java.lang.String r1 = "org.apache.logging.log4j.core.appender.ConsoleAppender$Builder"
            java.lang.Class r0 = r0.loadClass(r1)     // Catch: java.lang.NoSuchMethodException -> L16f
            r26 = r0
            r0 = r26
            java.lang.String r1 = "withLayout"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L16f
            r3 = r2
            r4 = 0
            r5 = r12
            r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L16f
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L16f
            r1 = r25
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.NoSuchMethodException -> L16f
            r3 = r2
            r4 = 0
            r5 = r23
            r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L16f
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L16f
            r0 = r26
            java.lang.String r1 = "withName"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L16f
            r3 = r2
            r4 = 0
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L16f
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L16f
            r1 = r25
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.NoSuchMethodException -> L16f
            r3 = r2
            r4 = 0
            java.lang.String r5 = "AUTHLIB_INJECTOR_CONSOLE_APPENDER"
            r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L16f
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L16f
            r0 = r26
            java.lang.String r1 = "build"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L16f
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L16f
            r1 = r25
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.NoSuchMethodException -> L16f
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L16f
            r24 = r0
            goto L1c9
        L16f:
            r25 = move-exception
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r26 = r0
            r0 = r26
            java.lang.String r1 = "Layout"
            r2 = r23
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r26
            java.lang.String r1 = "name"
            java.lang.String r2 = "AUTHLIB_INJECTOR_CONSOLE_APPENDER"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r26
            java.lang.String r1 = "follow"
            r2 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r26
            java.lang.String r1 = "direct"
            r2 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r26
            java.lang.String r1 = "ignoreExceptions"
            r2 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r20
            java.lang.String r1 = "createAppender"
            r2 = r22
            r3 = r26
            java.lang.Object r0 = invokeCreateMethod(r0, r1, r2, r3)
            r24 = r0
        L1c9:
            r0 = r13
            java.lang.String r1 = "start"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)
            r1 = r24
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r0 = r0.invoke(r1, r2)
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r26 = r0
            r0 = r26
            java.lang.String r1 = "ref"
            java.lang.String r2 = "AUTHLIB_INJECTOR_CONSOLE_APPENDER"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r14
            java.lang.String r1 = "createAppenderRef"
            r2 = r22
            r3 = r26
            java.lang.Object r0 = invokeCreateMethod(r0, r1, r2, r3)
            r25 = r0
            r0 = r14
            r1 = 1
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            r26 = r0
            r0 = r26
            r1 = 0
            r2 = r25
            java.lang.reflect.Array.set(r0, r1, r2)
            r0 = r17
            java.lang.String r1 = "newBuilder"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L30f
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L30f
            r1 = 0
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.NoSuchMethodException -> L30f
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L30f
            r28 = r0
            r0 = r8
            java.lang.String r1 = "org.apache.logging.log4j.core.config.LoggerConfig$Builder"
            java.lang.Class r0 = r0.loadClass(r1)     // Catch: java.lang.NoSuchMethodException -> L30f
            r29 = r0
            r0 = r29
            java.lang.String r1 = "withConfig"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L30f
            r3 = r2
            r4 = 0
            r5 = r18
            r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L30f
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L30f
            r1 = r28
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.NoSuchMethodException -> L30f
            r3 = r2
            r4 = 0
            r5 = r22
            r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L30f
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L30f
            r0 = r29
            java.lang.String r1 = "withAdditivity"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L30f
            r3 = r2
            r4 = 0
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L30f
            r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L30f
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L30f
            r1 = r28
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.NoSuchMethodException -> L30f
            r3 = r2
            r4 = 0
            r5 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.NoSuchMethodException -> L30f
            r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L30f
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L30f
            r0 = r29
            java.lang.String r1 = "withLevel"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L30f
            r3 = r2
            r4 = 0
            r5 = r15
            r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L30f
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L30f
            r1 = r28
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.NoSuchMethodException -> L30f
            r3 = r2
            r4 = 0
            r5 = r15
            java.lang.String r6 = "ALL"
            java.lang.reflect.Field r5 = r5.getDeclaredField(r6)     // Catch: java.lang.NoSuchMethodException -> L30f
            r6 = 0
            java.lang.Object r5 = r5.get(r6)     // Catch: java.lang.NoSuchMethodException -> L30f
            r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L30f
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L30f
            r0 = r29
            java.lang.String r1 = "withLoggerName"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L30f
            r3 = r2
            r4 = 0
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L30f
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L30f
            r1 = r28
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.NoSuchMethodException -> L30f
            r3 = r2
            r4 = 0
            java.lang.String r5 = "AUTHLIB_INJECTOR_AUTHLIB_LOGGER"
            r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L30f
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L30f
            r0 = r29
            java.lang.String r1 = "withIncludeLocation"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L30f
            r3 = r2
            r4 = 0
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L30f
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L30f
            r1 = r28
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.NoSuchMethodException -> L30f
            r3 = r2
            r4 = 0
            java.lang.String r5 = "com.mojang.authlib"
            r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L30f
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L30f
            r0 = r29
            java.lang.String r1 = "withRefs"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L30f
            r3 = r2
            r4 = 0
            r5 = r26
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.NoSuchMethodException -> L30f
            r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L30f
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L30f
            r1 = r28
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.NoSuchMethodException -> L30f
            r3 = r2
            r4 = 0
            r5 = r26
            r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L30f
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L30f
            r0 = r29
            java.lang.String r1 = "build"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L30f
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L30f
            r1 = r28
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.NoSuchMethodException -> L30f
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L30f
            r27 = r0
            goto L376
        L30f:
            r28 = move-exception
            r0 = r28
            r0.printStackTrace()
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r29 = r0
            r0 = r29
            java.lang.String r1 = "additivity"
            r2 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r29
            java.lang.String r1 = "level"
            r2 = r15
            java.lang.String r3 = "ALL"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r29
            java.lang.String r1 = "name"
            java.lang.String r2 = "AUTHLIB_INJECTOR_AUTHLIB_LOGGER"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r29
            java.lang.String r1 = "includeLocation"
            java.lang.String r2 = "com.mojang.authlib"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r29
            java.lang.String r1 = "AppenderRef"
            r2 = r26
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r17
            java.lang.String r1 = "createLogger"
            r2 = r22
            r3 = r29
            java.lang.Object r0 = invokeCreateMethod(r0, r1, r2, r3)
            r27 = r0
        L376:
            r0 = r17
            java.lang.String r1 = "addAppender"
            r2 = 3
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = r2
            r4 = 0
            r5 = r13
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r15
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r16
            r3[r4] = r5
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)
            r1 = r27
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r24
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 0
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 0
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            r0 = r18
            java.lang.String r1 = "addAppender"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L3cb
            r3 = r2
            r4 = 0
            r5 = r13
            r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L3cb
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L3cb
            r1 = r22
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.NoSuchMethodException -> L3cb
            r3 = r2
            r4 = 0
            r5 = r24
            r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L3cb
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L3cb
            goto L3ef
        L3cb:
            r28 = move-exception
            r0 = r18
            java.lang.String r1 = "getAppenders"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)
            r1 = r22
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r0 = r0.invoke(r1, r2)
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r1 = "AUTHLIB_INJECTOR_CONSOLE_APPENDER"
            r2 = r24
            java.lang.Object r0 = r0.put(r1, r2)
        L3ef:
            r0 = r18
            java.lang.String r1 = "addLogger"
            r2 = 2
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L41c
            r3 = r2
            r4 = 0
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L41c
            r3 = r2
            r4 = 1
            r5 = r17
            r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L41c
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L41c
            r1 = r22
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.NoSuchMethodException -> L41c
            r3 = r2
            r4 = 0
            java.lang.String r5 = "com.mojang.authlib"
            r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L41c
            r3 = r2
            r4 = 1
            r5 = r27
            r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L41c
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L41c
            goto L46b
        L41c:
            r28 = move-exception
            r0 = r8
            java.lang.String r1 = "org.apache.logging.log4j.core.config.BaseConfiguration"
            java.lang.Class r0 = r0.loadClass(r1)
            r29 = r0
            r0 = r29
            java.lang.String r1 = "loggers"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
            r30 = r0
            r0 = r30
            r1 = 1
            r0.setAccessible(r1)
            r0 = r30
            r1 = r22
            java.lang.Object r0 = r0.get(r1)
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r1 = "com.mojang.authlib"
            r2 = r27
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r29
            java.lang.String r1 = "setParents"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)
            r31 = r0
            r0 = r31
            r1 = 1
            r0.setAccessible(r1)
            r0 = r31
            r1 = r22
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r0 = r0.invoke(r1, r2)
        L46b:
            r0 = r8
            java.lang.String r1 = "org.apache.logging.log4j.core.LoggerContext"
            java.lang.Class r0 = r0.loadClass(r1)
            java.lang.String r1 = "updateLoggers"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = r2
            r4 = 0
            r5 = r18
            r3[r4] = r5
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)
            r1 = r21
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r22
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            return
    }

    private static java.lang.Object invokeCreateMethod(java.lang.Class<?> r4, java.lang.String r5, java.lang.Object r6, java.util.Map<java.lang.String, java.lang.Object> r7) throws java.lang.ReflectiveOperationException {
            r0 = r4
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r8 = r0
            r0 = r8
            java.lang.String r1 = "org.apache.logging.log4j.core.config.Configuration"
            java.lang.Class r0 = r0.loadClass(r1)
            r9 = r0
            r0 = r8
            java.lang.String r1 = "org.apache.logging.log4j.core.config.plugins.PluginAttribute"
            java.lang.Class r0 = r0.loadClass(r1)
            r10 = r0
            r0 = r10
            java.lang.String r1 = "value"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)
            r11 = r0
            r0 = r8
            java.lang.String r1 = "org.apache.logging.log4j.core.config.plugins.PluginElement"
            java.lang.Class r0 = r0.loadClass(r1)
            r12 = r0
            r0 = r12
            java.lang.String r1 = "value"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)
            r13 = r0
            r0 = r8
            java.lang.String r1 = "org.apache.logging.log4j.core.config.plugins.PluginFactory"
            java.lang.Class r0 = r0.loadClass(r1)
            r14 = r0
            r0 = r4
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
            java.util.stream.Stream r0 = java.util.stream.Stream.of(r0)
            r1 = r5
            java.lang.Object r1 = (v1) -> { // java.util.function.Predicate.test(java.lang.Object):boolean
                return lambda$invokeCreateMethod$0(r1, v1);
            }
            java.util.stream.Stream r0 = r0.filter(r1)
            r1 = r14
            java.lang.Object r1 = (v1) -> { // java.util.function.Predicate.test(java.lang.Object):boolean
                return lambda$invokeCreateMethod$1(r1, v1);
            }
            java.util.stream.Stream r0 = r0.filter(r1)
            java.util.Optional r0 = r0.findFirst()
            java.lang.Object r1 = java.lang.NoSuchMethodException::new
            java.lang.Object r0 = r0.orElseThrow(r1)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r15 = r0
            r0 = r15
            int r0 = r0.getParameterCount()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r16 = r0
            r0 = r15
            java.lang.reflect.Parameter[] r0 = r0.getParameters()
            r17 = r0
            r0 = 0
            r18 = r0
        L8d:
            r0 = r18
            r1 = r17
            int r1 = r1.length
            if (r0 >= r1) goto L141
            r0 = r17
            r1 = r18
            r0 = r0[r1]
            java.lang.Class r0 = r0.getType()
            r19 = r0
            r0 = 0
            r20 = r0
            r0 = r17
            r1 = r18
            r0 = r0[r1]
            r1 = r10
            java.lang.annotation.Annotation r0 = r0.getDeclaredAnnotation(r1)
            r21 = r0
            r0 = r21
            if (r0 == 0) goto Lc6
            r0 = r11
            r1 = r21
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r0 = r0.invoke(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r20 = r0
            goto Le7
        Lc6:
            r0 = r17
            r1 = r18
            r0 = r0[r1]
            r1 = r12
            java.lang.annotation.Annotation r0 = r0.getDeclaredAnnotation(r1)
            r21 = r0
            r0 = r21
            if (r0 == 0) goto Le7
            r0 = r13
            r1 = r21
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r0 = r0.invoke(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r20 = r0
        Le7:
            r0 = r20
            if (r0 != 0) goto Lff
            r0 = r9
            r1 = r19
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L13b
            r0 = r16
            r1 = r18
            r2 = r6
            r0[r1] = r2
            goto L13b
        Lff:
            r0 = r7
            r1 = r20
            java.lang.Object r0 = r0.get(r1)
            r22 = r0
            r0 = r22
            if (r0 == 0) goto L13b
            r0 = r19
            boolean r0 = r0.isPrimitive()
            if (r0 != 0) goto L120
            r0 = r19
            r1 = r22
            boolean r0 = r0.isInstance(r1)
            if (r0 == 0) goto L12a
        L120:
            r0 = r16
            r1 = r18
            r2 = r22
            r0[r1] = r2
            goto L13b
        L12a:
            r0 = r19
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            if (r0 != r1) goto L13b
            r0 = r16
            r1 = r18
            r2 = r22
            java.lang.String r2 = r2.toString()
            r0[r1] = r2
        L13b:
            int r18 = r18 + 1
            goto L8d
        L141:
            r0 = r15
            r1 = 0
            r2 = r16
            java.lang.Object r0 = r0.invoke(r1, r2)
            return r0
    }

    @Override // moe.yushi.authlibinjector.transform.TransformUnit
    public java.util.Optional<moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassVisitor> transform(java.lang.ClassLoader r9, java.lang.String r10, moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassVisitor r11, moe.yushi.authlibinjector.transform.TransformContext r12) {
            r8 = this;
            r0 = r10
            java.lang.String r1 = "com.mojang.authlib."
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L45
            java.util.Set<java.lang.ClassLoader> r0 = moe.yushi.authlibinjector.transform.support.AuthlibLogInterceptor.interceptedClassloaders
            r1 = r0
            r13 = r1
            monitor-enter(r0)
            java.util.Set<java.lang.ClassLoader> r0 = moe.yushi.authlibinjector.transform.support.AuthlibLogInterceptor.interceptedClassloaders     // Catch: java.lang.Throwable -> L2a
            r1 = r9
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L24
            java.util.Optional r0 = java.util.Optional.empty()     // Catch: java.lang.Throwable -> L2a
            r1 = r13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2a
            return r0
        L24:
            r0 = r13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            goto L32
        L2a:
            r14 = move-exception
            r0 = r13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            r0 = r14
            throw r0
        L32:
            moe.yushi.authlibinjector.transform.support.AuthlibLogInterceptor$1 r0 = new moe.yushi.authlibinjector.transform.support.AuthlibLogInterceptor$1
            r1 = r0
            r2 = r8
            r3 = 589824(0x90000, float:8.2652E-40)
            r4 = r11
            r5 = r10
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            java.util.Optional r0 = java.util.Optional.of(r0)
            return r0
        L45:
            java.util.Optional r0 = java.util.Optional.empty()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "Authlib Log Interceptor"
            return r0
    }

    private static /* synthetic */ boolean lambda$invokeCreateMethod$1(java.lang.Class r3, java.lang.reflect.Method r4) {
            r0 = r4
            r1 = r3
            java.lang.annotation.Annotation r0 = r0.getDeclaredAnnotation(r1)
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    private static /* synthetic */ boolean lambda$invokeCreateMethod$0(java.lang.String r3, java.lang.reflect.Method r4) {
            r0 = r4
            java.lang.String r0 = r0.getName()
            r1 = r3
            boolean r0 = r0.equals(r1)
            return r0
    }

    static {
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r1 = r0
            r1.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            moe.yushi.authlibinjector.transform.support.AuthlibLogInterceptor.interceptedClassloaders = r0
            return
    }
}
