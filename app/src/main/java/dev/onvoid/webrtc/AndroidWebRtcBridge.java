package dev.onvoid.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/droidbridge-devonvoid-android-webrtc-bridge.jar:dev/onvoid/webrtc/AndroidWebRtcBridge.class */
final class AndroidWebRtcBridge {
    private static final java.util.Set<java.lang.Object> DISPOSED_PEERS = null;
    private static final java.util.concurrent.atomic.AtomicBoolean FD_MONITOR_STARTED = null;

    private AndroidWebRtcBridge() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    static java.lang.Class<?> cls(java.lang.String r5) throws java.lang.ClassNotFoundException {
            r0 = 4
            java.lang.ClassLoader[] r0 = new java.lang.ClassLoader[r0]
            r1 = r0
            r2 = 0
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r3 = r3.getContextClassLoader()
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.Class<dev.onvoid.webrtc.AndroidWebRtcBridge> r3 = dev.onvoid.webrtc.AndroidWebRtcBridge.class
            java.lang.ClassLoader r3 = r3.getClassLoader()
            r1[r2] = r3
            r1 = r0
            r2 = 2
            java.lang.Class<dev.onvoid.webrtc.AndroidWebRtcBridge> r3 = dev.onvoid.webrtc.AndroidWebRtcBridge.class
            java.lang.ClassLoader r3 = r3.getClassLoader()
            if (r3 == 0) goto L2a
            java.lang.Class<dev.onvoid.webrtc.AndroidWebRtcBridge> r3 = dev.onvoid.webrtc.AndroidWebRtcBridge.class
            java.lang.ClassLoader r3 = r3.getClassLoader()
            java.lang.ClassLoader r3 = r3.getParent()
            goto L2b
        L2a:
            r3 = 0
        L2b:
            r1[r2] = r3
            r1 = r0
            r2 = 3
            java.lang.ClassLoader r3 = java.lang.ClassLoader.getSystemClassLoader()
            r1[r2] = r3
            r6 = r0
            r0 = 0
            r7 = r0
            r0 = r6
            r8 = r0
            r0 = r8
            int r0 = r0.length
            r9 = r0
            r0 = 0
            r10 = r0
        L3e:
            r0 = r10
            r1 = r9
            if (r0 >= r1) goto L66
            r0 = r8
            r1 = r10
            r0 = r0[r1]
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L53
            goto L60
        L53:
            r0 = r5
            r1 = 1
            r2 = r11
            java.lang.Class r0 = java.lang.Class.forName(r0, r1, r2)     // Catch: java.lang.ClassNotFoundException -> L5b
            return r0
        L5b:
            r12 = move-exception
            r0 = r12
            r7 = r0
        L60:
            int r10 = r10 + 1
            goto L3e
        L66:
            r0 = r7
            if (r0 == 0) goto L6c
            r0 = r7
            throw r0
        L6c:
            r0 = r5
            java.lang.Class r0 = java.lang.Class.forName(r0)
            return r0
    }

    static java.lang.Object currentApplication() {
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = 0
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "android.app.ActivityThread"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "currentApplication"
            r4[r5] = r6
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "android.app.AppGlobals"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "getInitialApplication"
            r4[r5] = r6
            r1[r2] = r3
            r8 = r0
            r0 = r8
            r9 = r0
            r0 = r9
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r11 = r0
        L2e:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto L75
            r0 = r9
            r1 = r11
            r0 = r0[r1]
            r12 = r0
            r0 = r12
            r1 = 0
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L6d
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L6d
            r13 = r0
            r0 = r13
            r1 = r12
            r2 = 1
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L6d
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L6d
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Throwable -> L6d
            r14 = r0
            r0 = r14
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L6d
            r0 = r14
            r1 = 0
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L6d
            r15 = r0
            r0 = r15
            if (r0 == 0) goto L6a
            r0 = r15
            return r0
        L6a:
            goto L6f
        L6d:
            r13 = move-exception
        L6f:
            int r11 = r11 + 1
            goto L2e
        L75:
            java.lang.String r0 = "android.app.ActivityThread"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L116
            r9 = r0
            r0 = r9
            java.lang.String r1 = "currentActivityThread"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L116
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Throwable -> L116
            r10 = r0
            r0 = r10
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L116
            r0 = r10
            r1 = 0
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L116
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L116
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L113
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L116
            r1 = r0
            r2 = 0
            java.lang.String r3 = "getApplication"
            r1[r2] = r3     // Catch: java.lang.Throwable -> L116
            r1 = r0
            r2 = 1
            java.lang.String r3 = "getInitialApplication"
            r1[r2] = r3     // Catch: java.lang.Throwable -> L116
            r12 = r0
            r0 = r12
            int r0 = r0.length     // Catch: java.lang.Throwable -> L116
            r13 = r0
            r0 = 0
            r14 = r0
        Lb1:
            r0 = r14
            r1 = r13
            if (r0 >= r1) goto Lf0
            r0 = r12
            r1 = r14
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L116
            r15 = r0
            r0 = r9
            r1 = r15
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> Le8 java.lang.Throwable -> L116
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Throwable -> Le8 java.lang.Throwable -> L116
            r16 = r0
            r0 = r16
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> Le8 java.lang.Throwable -> L116
            r0 = r16
            r1 = r11
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Le8 java.lang.Throwable -> L116
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> Le8 java.lang.Throwable -> L116
            r17 = r0
            r0 = r17
            if (r0 == 0) goto Le5
            r0 = r17
            return r0
        Le5:
            goto Lea
        Le8:
            r16 = move-exception
        Lea:
            int r14 = r14 + 1
            goto Lb1
        Lf0:
            r0 = r9
            java.lang.String r1 = "mInitialApplication"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> L111 java.lang.Throwable -> L116
            r12 = r0
            r0 = r12
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L111 java.lang.Throwable -> L116
            r0 = r12
            r1 = r11
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L111 java.lang.Throwable -> L116
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L10e
            r0 = r13
            return r0
        L10e:
            goto L113
        L111:
            r12 = move-exception
        L113:
            goto L117
        L116:
            r9 = move-exception
        L117:
            r0 = 4
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = "ca.dnamobile.javalauncher.launcher.WebRtcAndroidContextBridge"
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.String r3 = "ca.dnamobile.javalauncher.launcher.AndroidWebRtcContextProvider"
            r1[r2] = r3
            r1 = r0
            r2 = 2
            java.lang.String r3 = "ca.dnamobile.javalauncher.JavaLauncherApplication"
            r1[r2] = r3
            r1 = r0
            r2 = 3
            java.lang.String r3 = "ca.dnamobile.javalauncher.DroidBridgeApplication"
            r1[r2] = r3
            r9 = r0
            r0 = r9
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r11 = r0
        L135:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto L212
            r0 = r9
            r1 = r11
            r0 = r0[r1]
            r12 = r0
            r0 = r12
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L20a
            r13 = r0
            r0 = 5
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L20a
            r1 = r0
            r2 = 0
            java.lang.String r3 = "application"
            r1[r2] = r3     // Catch: java.lang.Throwable -> L20a
            r1 = r0
            r2 = 1
            java.lang.String r3 = "app"
            r1[r2] = r3     // Catch: java.lang.Throwable -> L20a
            r1 = r0
            r2 = 2
            java.lang.String r3 = "context"
            r1[r2] = r3     // Catch: java.lang.Throwable -> L20a
            r1 = r0
            r2 = 3
            java.lang.String r3 = "sContext"
            r1[r2] = r3     // Catch: java.lang.Throwable -> L20a
            r1 = r0
            r2 = 4
            java.lang.String r3 = "INSTANCE"
            r1[r2] = r3     // Catch: java.lang.Throwable -> L20a
            r14 = r0
            r0 = r14
            int r0 = r0.length     // Catch: java.lang.Throwable -> L20a
            r15 = r0
            r0 = 0
            r16 = r0
        L16d:
            r0 = r16
            r1 = r15
            if (r0 >= r1) goto L1a5
            r0 = r14
            r1 = r16
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L20a
            r17 = r0
            r0 = r13
            r1 = r17
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> L19d java.lang.Throwable -> L20a
            r18 = r0
            r0 = r18
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L19d java.lang.Throwable -> L20a
            r0 = r18
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L19d java.lang.Throwable -> L20a
            r19 = r0
            r0 = r19
            if (r0 == 0) goto L19a
            r0 = r19
            return r0
        L19a:
            goto L19f
        L19d:
            r18 = move-exception
        L19f:
            int r16 = r16 + 1
            goto L16d
        L1a5:
            r0 = 4
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L20a
            r1 = r0
            r2 = 0
            java.lang.String r3 = "getApplication"
            r1[r2] = r3     // Catch: java.lang.Throwable -> L20a
            r1 = r0
            r2 = 1
            java.lang.String r3 = "getContext"
            r1[r2] = r3     // Catch: java.lang.Throwable -> L20a
            r1 = r0
            r2 = 2
            java.lang.String r3 = "current"
            r1[r2] = r3     // Catch: java.lang.Throwable -> L20a
            r1 = r0
            r2 = 3
            java.lang.String r3 = "get"
            r1[r2] = r3     // Catch: java.lang.Throwable -> L20a
            r14 = r0
            r0 = r14
            int r0 = r0.length     // Catch: java.lang.Throwable -> L20a
            r15 = r0
            r0 = 0
            r16 = r0
        L1c7:
            r0 = r16
            r1 = r15
            if (r0 >= r1) goto L207
            r0 = r14
            r1 = r16
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L20a
            r17 = r0
            r0 = r13
            r1 = r17
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L1ff java.lang.Throwable -> L20a
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Throwable -> L1ff java.lang.Throwable -> L20a
            r18 = r0
            r0 = r18
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L1ff java.lang.Throwable -> L20a
            r0 = r18
            r1 = 0
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1ff java.lang.Throwable -> L20a
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L1ff java.lang.Throwable -> L20a
            r19 = r0
            r0 = r19
            if (r0 == 0) goto L1fc
            r0 = r19
            return r0
        L1fc:
            goto L201
        L1ff:
            r18 = move-exception
        L201:
            int r16 = r16 + 1
            goto L1c7
        L207:
            goto L20c
        L20a:
            r13 = move-exception
        L20c:
            int r11 = r11 + 1
            goto L135
        L212:
            java.lang.String r0 = "android.app.Application"
            java.lang.Class r0 = cls(r0)     // Catch: java.lang.Throwable -> L226
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L226
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)     // Catch: java.lang.Throwable -> L226
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L226
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Throwable -> L226
            return r0
        L226:
            r9 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "Unable to resolve or create Android Context fallback for org.webrtc initialization"
            r3 = r9
            java.lang.Throwable r3 = unwrap(r3)
            r1.<init>(r2, r3)
            throw r0
    }

    static void loadAndroidNative() {
            java.lang.String r0 = "jingle_peerconnection_so"
            java.lang.System.loadLibrary(r0)     // Catch: java.lang.UnsatisfiedLinkError -> L8
            goto L9
        L8:
            r2 = move-exception
        L9:
            return
    }

    static void initializeAndroidWebRtc(java.lang.Class<?> r7) {
            java.lang.Object r0 = currentApplication()     // Catch: java.lang.Throwable -> L71
            r8 = r0
            java.lang.String r0 = "org.webrtc.PeerConnectionFactory$InitializationOptions"
            java.lang.Class r0 = cls(r0)     // Catch: java.lang.Throwable -> L71
            r9 = r0
            r0 = r9
            java.lang.String r1 = "builder"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L71
            r3 = r2
            r4 = 0
            java.lang.String r5 = "android.content.Context"
            java.lang.Class r5 = cls(r5)     // Catch: java.lang.Throwable -> L71
            r3[r4] = r5     // Catch: java.lang.Throwable -> L71
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L71
            r1 = 0
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L71
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L71
            r10 = r0
            r0 = r10
            java.lang.String r1 = "setEnableInternalTracer"
            r2 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L71
            callOptional(r0, r1, r2)     // Catch: java.lang.Throwable -> L71
            r0 = r10
            java.lang.String r1 = "setFieldTrials"
            java.lang.String r2 = ""
            callOptional(r0, r1, r2)     // Catch: java.lang.Throwable -> L71
            r0 = r10
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = "createInitializationOptions"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L71
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L71
            r1 = r10
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L71
            r11 = r0
            r0 = r7
            java.lang.String r1 = "initialize"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L71
            r3 = r2
            r4 = 0
            r5 = r9
            r3[r4] = r5     // Catch: java.lang.Throwable -> L71
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L71
            r1 = 0
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L71
            r3 = r2
            r4 = 0
            r5 = r11
            r3[r4] = r5     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L71
            goto L8e
        L71:
            r8 = move-exception
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "[DroidBridgeWebRTC] PeerConnectionFactory.initialize failed or already initialized: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r8
            java.lang.Throwable r2 = unwrap(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
        L8e:
            return
    }

    static void installFactoryOptions(java.lang.Object r7) {
            java.lang.String r0 = "org.webrtc.PeerConnectionFactory$Options"
            java.lang.Class r0 = cls(r0)     // Catch: java.lang.Throwable -> L5e
            r8 = r0
            r0 = r8
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L5e
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)     // Catch: java.lang.Throwable -> L5e
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Throwable -> L5e
            r9 = r0
            r0 = r9
            java.lang.String r1 = "disableNetworkMonitor"
            r2 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L5e
            setFieldIfExists(r0, r1, r2)     // Catch: java.lang.Throwable -> L5e
            r0 = r9
            java.lang.String r1 = "networkIgnoreMask"
            r2 = 16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L5e
            setFieldIfExists(r0, r1, r2)     // Catch: java.lang.Throwable -> L5e
            r0 = r9
            java.lang.String r1 = "disableEncryption"
            r2 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L5e
            setFieldIfExists(r0, r1, r2)     // Catch: java.lang.Throwable -> L5e
            r0 = r7
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r1 = "setOptions"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L5e
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5     // Catch: java.lang.Throwable -> L5e
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L5e
            r1 = r7
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L5e
            r3 = r2
            r4 = 0
            r5 = r9
            r3[r4] = r5     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L5e
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L5e
            java.lang.String r1 = "[DroidBridgeWebRTC] PeerConnectionFactory options: disableNetworkMonitor=true networkIgnoreMask=16(loopback)"
            r0.println(r1)     // Catch: java.lang.Throwable -> L5e
            goto L7b
        L5e:
            r8 = move-exception
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "[DroidBridgeWebRTC] PeerConnectionFactory options install failed: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r8
            java.lang.Throwable r2 = unwrap(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
        L7b:
            return
    }

    static java.lang.Object createFactory() {
            loadAndroidNative()     // Catch: java.lang.Throwable -> L6b
            startFdMonitor()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = "createFactory-start"
            logFdSnapshot(r0)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = "org.webrtc.PeerConnectionFactory"
            java.lang.Class r0 = cls(r0)     // Catch: java.lang.Throwable -> L6b
            r5 = r0
            r0 = r5
            initializeAndroidWebRtc(r0)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = "after-WebRTC-initialize"
            logFdSnapshot(r0)     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r0 = currentApplication()     // Catch: java.lang.Throwable -> L6b
            r6 = r0
            r0 = r5
            java.lang.String r1 = "builder"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L6b
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L6b
            r1 = 0
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L6b
            r7 = r0
            r0 = r7
            installFactoryOptions(r0)     // Catch: java.lang.Throwable -> L6b
            r0 = r7
            r1 = r6
            java.lang.Object r0 = installAndroidAudioDeviceModule(r0, r1)     // Catch: java.lang.Throwable -> L6b
            r8 = r0
            java.lang.String r0 = "after-ADM-create"
            logFdSnapshot(r0)     // Catch: java.lang.Throwable -> L6b
            r0 = r7
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r1 = "createPeerConnectionFactory"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L6b
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L6b
            r1 = r7
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L6b
            r9 = r0
            java.lang.String r0 = "after-PeerConnectionFactory-create"
            logFdSnapshot(r0)     // Catch: java.lang.Throwable -> L6b
            r0 = r8
            releaseAndroidAudioDeviceModule(r0)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = "after-ADM-release"
            logFdSnapshot(r0)     // Catch: java.lang.Throwable -> L6b
            r0 = r9
            return r0
        L6b:
            r5 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "DroidBridge Android WebRTC bridge failed to create org.webrtc.PeerConnectionFactory"
            r3 = r5
            java.lang.Throwable r3 = unwrap(r3)
            r1.<init>(r2, r3)
            throw r0
    }

    static java.lang.Object installAndroidAudioDeviceModule(java.lang.Object r7, java.lang.Object r8) {
            r0 = r8
            java.lang.Object r0 = createAndroidAudioDeviceModule(r0)     // Catch: java.lang.Throwable -> L3c
            r9 = r0
            r0 = r9
            if (r0 != 0) goto Lb
            r0 = 0
            return r0
        Lb:
            java.lang.String r0 = "org.webrtc.audio.AudioDeviceModule"
            java.lang.Class r0 = cls(r0)     // Catch: java.lang.Throwable -> L3c
            r10 = r0
            r0 = r7
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = "setAudioDeviceModule"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L3c
            r3 = r2
            r4 = 0
            r5 = r10
            r3[r4] = r5     // Catch: java.lang.Throwable -> L3c
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L3c
            r1 = r7
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L3c
            r3 = r2
            r4 = 0
            r5 = r9
            r3[r4] = r5     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L3c
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = "[DroidBridgeWebRTC] Installed Android JavaAudioDeviceModule"
            r0.println(r1)     // Catch: java.lang.Throwable -> L3c
            r0 = r9
            return r0
        L3c:
            r9 = move-exception
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "[DroidBridgeWebRTC] Android audio module install failed: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r9
            java.lang.Throwable r2 = unwrap(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r0 = 0
            return r0
    }

    static void releaseAndroidAudioDeviceModule(java.lang.Object r4) {
            r0 = r4
            if (r0 != 0) goto L5
            return
        L5:
            r0 = r4
            java.lang.String r1 = "release"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r0 = invoke(r0, r1, r2)     // Catch: java.lang.Throwable -> L1d
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = "[DroidBridgeWebRTC] Released JavaAudioDeviceModule after factory creation"
            r0.println(r1)     // Catch: java.lang.Throwable -> L1d
            goto L3b
        L1d:
            r5 = move-exception
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "[DroidBridgeWebRTC] JavaAudioDeviceModule release skipped: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r5
            java.lang.Throwable r2 = unwrap(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
        L3b:
            return
    }

    static java.lang.Object createAndroidAudioDeviceModule(java.lang.Object r7) {
            java.lang.String r0 = "org.webrtc.audio.JavaAudioDeviceModule"
            java.lang.Class r0 = cls(r0)     // Catch: java.lang.Throwable -> L99
            r8 = r0
            r0 = r8
            java.lang.String r1 = "builder"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L99
            r3 = r2
            r4 = 0
            java.lang.String r5 = "android.content.Context"
            java.lang.Class r5 = cls(r5)     // Catch: java.lang.Throwable -> L99
            r3[r4] = r5     // Catch: java.lang.Throwable -> L99
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L99
            r1 = 0
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L99
            r3 = r2
            r4 = 0
            r5 = r7
            r3[r4] = r5     // Catch: java.lang.Throwable -> L99
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L99
            r9 = r0
            r0 = r9
            java.lang.String r1 = "setUseHardwareAcousticEchoCanceler"
            r2 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L99
            callOptional(r0, r1, r2)     // Catch: java.lang.Throwable -> L99
            r0 = r9
            java.lang.String r1 = "setUseHardwareNoiseSuppressor"
            r2 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L99
            callOptional(r0, r1, r2)     // Catch: java.lang.Throwable -> L99
            r0 = r9
            java.lang.String r1 = "setUseLowLatency"
            r2 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L99
            callOptional(r0, r1, r2)     // Catch: java.lang.Throwable -> L99
            r0 = r9
            java.lang.String r1 = "setUseStereoInput"
            r2 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L99
            callOptional(r0, r1, r2)     // Catch: java.lang.Throwable -> L99
            r0 = r9
            java.lang.String r1 = "setUseStereoOutput"
            r2 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L99
            callOptional(r0, r1, r2)     // Catch: java.lang.Throwable -> L99
            r0 = r9
            java.lang.String r1 = "setInputSampleRate"
            r2 = 48000(0xbb80, float:6.7262E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L99
            callOptional(r0, r1, r2)     // Catch: java.lang.Throwable -> L99
            r0 = r9
            java.lang.String r1 = "setOutputSampleRate"
            r2 = 48000(0xbb80, float:6.7262E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L99
            callOptional(r0, r1, r2)     // Catch: java.lang.Throwable -> L99
            r0 = r9
            java.lang.String r1 = "setEnableVolumeLogger"
            r2 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L99
            callOptional(r0, r1, r2)     // Catch: java.lang.Throwable -> L99
            r0 = r9
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L99
            java.lang.String r1 = "createAudioDeviceModule"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L99
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L99
            r1 = r9
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L99
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L99
            return r0
        L99:
            r8 = move-exception
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "[DroidBridgeWebRTC] JavaAudioDeviceModule creation failed: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r8
            java.lang.Throwable r2 = unwrap(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r0 = 0
            return r0
    }

    static java.lang.Object createRtcConfig(dev.onvoid.webrtc.RTCConfiguration r7) throws java.lang.Exception {
            java.lang.String r0 = "org.webrtc.PeerConnection$RTCConfiguration"
            java.lang.Class r0 = cls(r0)
            r8 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r7
            if (r0 == 0) goto L4d
            r0 = r7
            java.util.List r0 = r0.iceServers
            if (r0 == 0) goto L4d
            r0 = r7
            java.util.List r0 = r0.iceServers
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
        L24:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L4d
            r0 = r10
            java.lang.Object r0 = r0.next()
            dev.onvoid.webrtc.RTCIceServer r0 = (dev.onvoid.webrtc.RTCIceServer) r0
            r11 = r0
            java.lang.String r0 = "from-minecraft"
            r1 = r11
            logIceServer(r0, r1)
            r0 = r9
            r1 = r11
            java.util.List r1 = createExpandedIceServers(r1)
            boolean r0 = r0.addAll(r1)
            goto L24
        L4d:
            r0 = r9
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L7c
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "[DroidBridgeWebRTC] RTCConfiguration has no ICE servers; adding fallback STUN servers."
            r0.println(r1)
            r0 = r9
            java.lang.String r1 = "stun:stun.l.google.com:19302"
            dev.onvoid.webrtc.RTCIceServer r1 = stunServer(r1)
            java.lang.Object r1 = createIceServer(r1)
            boolean r0 = r0.add(r1)
            r0 = r9
            java.lang.String r1 = "stun:stun.cloudflare.com:3478"
            dev.onvoid.webrtc.RTCIceServer r1 = stunServer(r1)
            java.lang.Object r1 = createIceServer(r1)
            boolean r0 = r0.add(r1)
            goto L99
        L7c:
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "[DroidBridgeWebRTC] RTCConfiguration expanded ICE server count="
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r9
            int r2 = r2.size()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
        L99:
            r0 = r8
            r1 = 1
            java.lang.Class[] r1 = new java.lang.Class[r1]
            r2 = r1
            r3 = 0
            java.lang.Class<java.util.List> r4 = java.util.List.class
            r2[r3] = r4
            java.lang.reflect.Constructor r0 = r0.getConstructor(r1)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r9
            r2[r3] = r4
            java.lang.Object r0 = r0.newInstance(r1)
            r10 = r0
            r0 = r10
            java.lang.String r1 = "iceTransportsType"
            java.lang.String r2 = "org.webrtc.PeerConnection$IceTransportsType"
            r3 = r7
            if (r3 == 0) goto Lcf
            r3 = r7
            dev.onvoid.webrtc.RTCIceTransportPolicy r3 = r3.iceTransportPolicy
            if (r3 == 0) goto Lcf
            r3 = r7
            dev.onvoid.webrtc.RTCIceTransportPolicy r3 = r3.iceTransportPolicy
            java.lang.String r3 = r3.name()
            goto Ld2
        Lcf:
            java.lang.String r3 = "ALL"
        Ld2:
            setEnumField(r0, r1, r2, r3)
            r0 = r10
            java.lang.String r1 = "bundlePolicy"
            java.lang.String r2 = "org.webrtc.PeerConnection$BundlePolicy"
            r3 = r7
            if (r3 == 0) goto Lf9
            r3 = r7
            dev.onvoid.webrtc.RTCBundlePolicy r3 = r3.bundlePolicy
            if (r3 == 0) goto Lf9
            r3 = r7
            dev.onvoid.webrtc.RTCBundlePolicy r3 = r3.bundlePolicy
            java.lang.String r3 = r3.name()
            java.lang.String r4 = "_"
            java.lang.String r5 = ""
            java.lang.String r3 = r3.replace(r4, r5)
            goto Lfc
        Lf9:
            java.lang.String r3 = "BALANCED"
        Lfc:
            setEnumField(r0, r1, r2, r3)
            r0 = r10
            java.lang.String r1 = "rtcpMuxPolicy"
            java.lang.String r2 = "org.webrtc.PeerConnection$RtcpMuxPolicy"
            r3 = r7
            if (r3 == 0) goto L11b
            r3 = r7
            dev.onvoid.webrtc.RTCRtcpMuxPolicy r3 = r3.rtcpMuxPolicy
            if (r3 == 0) goto L11b
            r3 = r7
            dev.onvoid.webrtc.RTCRtcpMuxPolicy r3 = r3.rtcpMuxPolicy
            java.lang.String r3 = r3.name()
            goto L11e
        L11b:
            java.lang.String r3 = "REQUIRE"
        L11e:
            setEnumField(r0, r1, r2, r3)
            r0 = r10
            java.lang.String r1 = "sdpSemantics"
            java.lang.String r2 = "org.webrtc.PeerConnection$SdpSemantics"
            java.lang.String r3 = "UNIFIED_PLAN"
            setEnumField(r0, r1, r2, r3)
            r0 = r10
            java.lang.String r1 = "candidateNetworkPolicy"
            java.lang.String r2 = "org.webrtc.PeerConnection$CandidateNetworkPolicy"
            java.lang.String r3 = "ALL"
            setEnumField(r0, r1, r2, r3)
            r0 = r10
            java.lang.String r1 = "continualGatheringPolicy"
            java.lang.String r2 = "org.webrtc.PeerConnection$ContinualGatheringPolicy"
            java.lang.String r3 = "GATHER_ONCE"
            setEnumField(r0, r1, r2, r3)
            r0 = r10
            java.lang.String r1 = "tcpCandidatePolicy"
            java.lang.String r2 = "org.webrtc.PeerConnection$TcpCandidatePolicy"
            java.lang.String r3 = "ENABLED"
            setEnumField(r0, r1, r2, r3)
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "[DroidBridgeWebRTC] RTCConfiguration policy: candidateNetworkPolicy=ALL continualGathering=GATHER_ONCE tcp=ENABLED"
            r0.println(r1)
            r0 = r10
            return r0
    }

    static dev.onvoid.webrtc.RTCIceServer stunServer(java.lang.String r4) {
            dev.onvoid.webrtc.RTCIceServer r0 = new dev.onvoid.webrtc.RTCIceServer
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.urls = r1
            r0 = r5
            java.util.List r0 = r0.urls
            r1 = r4
            boolean r0 = r0.add(r1)
            r0 = r5
            java.lang.String r1 = ""
            r0.username = r1
            r0 = r5
            java.lang.String r1 = ""
            r0.password = r1
            r0 = r5
            return r0
    }

    static java.util.List<java.lang.Object> createExpandedIceServers(dev.onvoid.webrtc.RTCIceServer r4) throws java.lang.Exception {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r4
            if (r0 == 0) goto L1f
            r0 = r4
            java.util.List r0 = r0.urls
            if (r0 == 0) goto L1f
            r0 = r4
            java.util.List r0 = r0.urls
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L2a
        L1f:
            r0 = r5
            r1 = r4
            java.lang.Object r1 = createIceServer(r1)
            boolean r0 = r0.add(r1)
            r0 = r5
            return r0
        L2a:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r4
            java.util.List r0 = r0.urls
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
        L3c:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Lc8
            r0 = r7
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L3c
            r0 = r8
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L63
            goto L3c
        L63:
            r0 = r8
            java.lang.String r0 = r0.trim()
            r9 = r0
            r0 = r6
            r1 = r9
            boolean r0 = r0.add(r1)
            r0 = r9
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            r10 = r0
            r0 = r10
            java.lang.String r1 = "turn:"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto Lc5
            r0 = r10
            java.lang.String r1 = "?transport="
            int r0 = r0.indexOf(r1)
            if (r0 >= 0) goto Lc5
            r0 = r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            r2 = r9
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "?transport=udp"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.add(r1)
            r0 = r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            r2 = r9
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "?transport=tcp"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.add(r1)
        Lc5:
            goto L3c
        Lc8:
            r0 = r6
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
        Lcd:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L115
            r0 = r7
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r8 = r0
            r0 = r4
            dev.onvoid.webrtc.RTCIceServer r0 = cloneIceServer(r0)
            r9 = r0
            r0 = r9
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.urls = r1
            r0 = r9
            java.util.List r0 = r0.urls
            r1 = r8
            boolean r0 = r0.add(r1)
            java.lang.String r0 = "expanded"
            r1 = r9
            logIceServer(r0, r1)
            r0 = r5
            r1 = r9
            java.lang.Object r1 = createIceServer(r1)
            boolean r0 = r0.add(r1)
            goto Lcd
        L115:
            r0 = r5
            return r0
    }

    static dev.onvoid.webrtc.RTCIceServer cloneIceServer(dev.onvoid.webrtc.RTCIceServer r5) {
            dev.onvoid.webrtc.RTCIceServer r0 = new dev.onvoid.webrtc.RTCIceServer
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r6
            r1 = r5
            if (r1 == 0) goto L22
            r1 = r5
            java.util.List r1 = r1.urls
            if (r1 == 0) goto L22
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r3 = r5
            java.util.List r3 = r3.urls
            r2.<init>(r3)
            goto L29
        L22:
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
        L29:
            r0.urls = r1
            r0 = r6
            r1 = r5
            if (r1 == 0) goto L38
            r1 = r5
            java.lang.String r1 = r1.username
            goto L3a
        L38:
            java.lang.String r1 = ""
        L3a:
            r0.username = r1
            r0 = r6
            r1 = r5
            if (r1 == 0) goto L49
            r1 = r5
            java.lang.String r1 = r1.password
            goto L4b
        L49:
            java.lang.String r1 = ""
        L4b:
            r0.password = r1
            r0 = r6
            r1 = r5
            if (r1 == 0) goto L5a
            r1 = r5
            dev.onvoid.webrtc.TlsCertPolicy r1 = r1.tlsCertPolicy
            goto L5b
        L5a:
            r1 = 0
        L5b:
            r0.tlsCertPolicy = r1
            r0 = r6
            r1 = r5
            if (r1 == 0) goto L6a
            r1 = r5
            java.lang.String r1 = r1.hostname
            goto L6b
        L6a:
            r1 = 0
        L6b:
            r0.hostname = r1
            r0 = r6
            r1 = r5
            if (r1 == 0) goto L88
            r1 = r5
            java.util.List r1 = r1.tlsAlpnProtocols
            if (r1 == 0) goto L88
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r3 = r5
            java.util.List r3 = r3.tlsAlpnProtocols
            r2.<init>(r3)
            goto L89
        L88:
            r1 = 0
        L89:
            r0.tlsAlpnProtocols = r1
            r0 = r6
            r1 = r5
            if (r1 == 0) goto La6
            r1 = r5
            java.util.List r1 = r1.tlsEllipticCurves
            if (r1 == 0) goto La6
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r3 = r5
            java.util.List r3 = r3.tlsEllipticCurves
            r2.<init>(r3)
            goto La7
        La6:
            r1 = 0
        La7:
            r0.tlsEllipticCurves = r1
            r0 = r6
            return r0
    }

    static void logIceServer(java.lang.String r4, dev.onvoid.webrtc.RTCIceServer r5) {
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L55
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r2 = r1
            r2.<init>()     // Catch: java.lang.Throwable -> L55
            java.lang.String r2 = "[DroidBridgeWebRTC] ICE server "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L55
            r2 = r4
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L55
            java.lang.String r2 = " urls="
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L55
            r2 = r5
            if (r2 == 0) goto L25
            r2 = r5
            java.util.List r2 = r2.urls     // Catch: java.lang.Throwable -> L55
            goto L26
        L25:
            r2 = 0
        L26:
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L55
            java.lang.String r2 = " user="
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L55
            r2 = r5
            if (r2 == 0) goto L48
            r2 = r5
            java.lang.String r2 = r2.username     // Catch: java.lang.Throwable -> L55
            if (r2 == 0) goto L48
            r2 = r5
            java.lang.String r2 = r2.username     // Catch: java.lang.Throwable -> L55
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L55
            if (r2 != 0) goto L48
            r2 = 1
            goto L49
        L48:
            r2 = 0
        L49:
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L55
            r0.println(r1)     // Catch: java.lang.Throwable -> L55
            goto L56
        L55:
            r6 = move-exception
        L56:
            return
    }

    static java.lang.Object createIceServer(dev.onvoid.webrtc.RTCIceServer r8) throws java.lang.Exception {
            java.lang.String r0 = "org.webrtc.PeerConnection$IceServer"
            java.lang.Class r0 = cls(r0)
            r9 = r0
            r0 = r8
            if (r0 == 0) goto L19
            r0 = r8
            java.util.List r0 = r0.urls
            if (r0 == 0) goto L19
            r0 = r8
            java.util.List r0 = r0.urls
            goto L1c
        L19:
            java.util.List r0 = java.util.Collections.emptyList()
        L1c:
            r10 = r0
            r0 = 0
            r11 = r0
            r0 = r9
            java.lang.reflect.Method[] r0 = r0.getMethods()
            r12 = r0
            r0 = r12
            int r0 = r0.length
            r13 = r0
            r0 = 0
            r14 = r0
        L2d:
            r0 = r14
            r1 = r13
            if (r0 >= r1) goto Lb4
            r0 = r12
            r1 = r14
            r0 = r0[r1]
            r15 = r0
            r0 = r15
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "builder"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4b
            goto Lae
        L4b:
            r0 = r15
            java.lang.Class[] r0 = r0.getParameterTypes()
            r16 = r0
            r0 = r16
            int r0 = r0.length
            r1 = 1
            if (r0 != r1) goto L78
            java.lang.Class<java.util.List> r0 = java.util.List.class
            r1 = r16
            r2 = 0
            r1 = r1[r2]
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L78
            r0 = r15
            r1 = 0
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r10
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            r11 = r0
            goto Lb4
        L78:
            r0 = r16
            int r0 = r0.length
            r1 = 1
            if (r0 != r1) goto Lae
            r0 = r16
            r1 = 0
            r0 = r0[r1]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            if (r0 != r1) goto Lae
            r0 = r15
            r1 = 0
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r10
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L9f
            java.lang.String r5 = ""
            goto La6
        L9f:
            r5 = r10
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
        La6:
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            r11 = r0
            goto Lb4
        Lae:
            int r14 = r14 + 1
            goto L2d
        Lb4:
            r0 = r11
            if (r0 != 0) goto Lc3
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException
            r1 = r0
            java.lang.String r2 = "PeerConnection.IceServer.builder"
            r1.<init>(r2)
            throw r0
        Lc3:
            r0 = r11
            java.lang.String r1 = "setUsername"
            r2 = r8
            if (r2 == 0) goto Ld9
            r2 = r8
            java.lang.String r2 = r2.username
            if (r2 == 0) goto Ld9
            r2 = r8
            java.lang.String r2 = r2.username
            goto Ldb
        Ld9:
            java.lang.String r2 = ""
        Ldb:
            callOptional(r0, r1, r2)
            r0 = r11
            java.lang.String r1 = "setPassword"
            r2 = r8
            if (r2 == 0) goto Lf4
            r2 = r8
            java.lang.String r2 = r2.password
            if (r2 == 0) goto Lf4
            r2 = r8
            java.lang.String r2 = r2.password
            goto Lf6
        Lf4:
            java.lang.String r2 = ""
        Lf6:
            callOptional(r0, r1, r2)
            r0 = r11
            java.lang.String r1 = "setHostname"
            r2 = r8
            if (r2 == 0) goto L10f
            r2 = r8
            java.lang.String r2 = r2.hostname
            if (r2 == 0) goto L10f
            r2 = r8
            java.lang.String r2 = r2.hostname
            goto L111
        L10f:
            java.lang.String r2 = ""
        L111:
            callOptional(r0, r1, r2)
            r0 = r8
            if (r0 == 0) goto L12a
            r0 = r8
            java.util.List r0 = r0.tlsAlpnProtocols
            if (r0 == 0) goto L12a
            r0 = r11
            java.lang.String r1 = "setTlsAlpnProtocols"
            r2 = r8
            java.util.List r2 = r2.tlsAlpnProtocols
            callOptional(r0, r1, r2)
        L12a:
            r0 = r8
            if (r0 == 0) goto L140
            r0 = r8
            java.util.List r0 = r0.tlsEllipticCurves
            if (r0 == 0) goto L140
            r0 = r11
            java.lang.String r1 = "setTlsEllipticCurves"
            r2 = r8
            java.util.List r2 = r2.tlsEllipticCurves
            callOptional(r0, r1, r2)
        L140:
            r0 = r11
            java.lang.Class r0 = r0.getClass()
            java.lang.String r1 = "createIceServer"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)
            r1 = r11
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r0 = r0.invoke(r1, r2)
            return r0
    }

    static java.lang.Object createObserverProxy(dev.onvoid.webrtc.PeerConnectionObserver r3) throws java.lang.Exception {
            r0 = r3
            r1 = 0
            java.lang.Object r0 = createObserverProxy(r0, r1)
            return r0
    }

    static java.lang.Object createObserverProxy(dev.onvoid.webrtc.PeerConnectionObserver r6, java.lang.Object[] r7) throws java.lang.Exception {
            java.lang.String r0 = "org.webrtc.PeerConnection$Observer"
            java.lang.Class r0 = cls(r0)
            r8 = r0
            r0 = r8
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r1 = 1
            java.lang.Class[] r1 = new java.lang.Class[r1]
            r2 = r1
            r3 = 0
            r4 = r8
            r2[r3] = r4
            r2 = r6
            r3 = r7
            java.lang.Object r2 = (v2, v3, v4) -> { // java.lang.reflect.InvocationHandler.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object
                return lambda$createObserverProxy$0(r2, r3, v2, v3, v4);
            }
            java.lang.Object r0 = java.lang.reflect.Proxy.newProxyInstance(r0, r1, r2)
            return r0
    }

    static void safeDisposePeerConnection(java.lang.Object r4) {
            r0 = r4
            if (r0 != 0) goto L5
            return
        L5:
            java.util.Set<java.lang.Object> r0 = dev.onvoid.webrtc.AndroidWebRtcBridge.DISPOSED_PEERS
            r1 = r4
            boolean r0 = r0.add(r1)
            if (r0 != 0) goto L12
            return
        L12:
            r0 = r4
            java.lang.String r1 = "close"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L21
            java.lang.Object r0 = invoke(r0, r1, r2)     // Catch: java.lang.Throwable -> L21
            goto L22
        L21:
            r5 = move-exception
        L22:
            r0 = r4
            java.lang.String r1 = "dispose"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L40
            java.lang.Object r0 = invoke(r0, r1, r2)     // Catch: java.lang.Throwable -> L40
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = "[DroidBridgeWebRTC] disposed closed peer connection"
            r0.println(r1)     // Catch: java.lang.Throwable -> L40
            java.lang.String r0 = "after-peer-dispose"
            logFdSnapshot(r0)     // Catch: java.lang.Throwable -> L40
            goto L41
        L40:
            r5 = move-exception
        L41:
            return
    }

    static java.lang.Object createSdpObserver(dev.onvoid.webrtc.CreateSessionDescriptionObserver r6, dev.onvoid.webrtc.SetSessionDescriptionObserver r7) throws java.lang.Exception {
            java.lang.String r0 = "org.webrtc.SdpObserver"
            java.lang.Class r0 = cls(r0)
            r8 = r0
            r0 = r8
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r1 = 1
            java.lang.Class[] r1 = new java.lang.Class[r1]
            r2 = r1
            r3 = 0
            r4 = r8
            r2[r3] = r4
            r2 = r6
            r3 = r7
            java.lang.Object r2 = (v2, v3, v4) -> { // java.lang.reflect.InvocationHandler.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object
                return lambda$createSdpObserver$1(r2, r3, v2, v3, v4);
            }
            java.lang.Object r0 = java.lang.reflect.Proxy.newProxyInstance(r0, r1, r2)
            return r0
    }

    static int countSdpCandidates(java.lang.String r3) {
            r0 = r3
            if (r0 == 0) goto Lb
            r0 = r3
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = 0
            r4 = r0
            r0 = r3
            java.lang.String r1 = "\\r?\\n"
            java.lang.String[] r0 = r0.split(r1)
            r5 = r0
            r0 = r5
            r6 = r0
            r0 = r6
            int r0 = r0.length
            r7 = r0
            r0 = 0
            r8 = r0
        L20:
            r0 = r8
            r1 = r7
            if (r0 >= r1) goto L46
            r0 = r6
            r1 = r8
            r0 = r0[r1]
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L40
            r0 = r9
            java.lang.String r1 = "a=candidate:"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L40
            int r4 = r4 + 1
        L40:
            int r8 = r8 + 1
            goto L20
        L46:
            r0 = r4
            return r0
    }

    static java.lang.String sdpSummary(dev.onvoid.webrtc.RTCSessionDescription r3) {
            r0 = r3
            if (r0 != 0) goto L8
            java.lang.String r0 = "<null>"
            return r0
        L8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "type="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            dev.onvoid.webrtc.RTCSdpType r1 = r1.sdpType
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " len="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.String r1 = r1.sdp
            if (r1 == 0) goto L33
            r1 = r3
            java.lang.String r1 = r1.sdp
            int r1 = r1.length()
            goto L34
        L33:
            r1 = 0
        L34:
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " candidates="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.String r1 = r1.sdp
            int r1 = countSdpCandidates(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    static java.lang.Object toAndroidSdp(dev.onvoid.webrtc.RTCSessionDescription r6) throws java.lang.Exception {
            java.lang.String r0 = "org.webrtc.SessionDescription"
            java.lang.Class r0 = cls(r0)
            r7 = r0
            java.lang.String r0 = "org.webrtc.SessionDescription$Type"
            java.lang.Class r0 = cls(r0)
            r8 = r0
            r0 = r6
            if (r0 == 0) goto L2c
            r0 = r6
            dev.onvoid.webrtc.RTCSdpType r0 = r0.sdpType
            if (r0 == 0) goto L2c
            r0 = r6
            dev.onvoid.webrtc.RTCSdpType r0 = r0.sdpType
            java.lang.String r0 = r0.name()
            java.lang.String r1 = "PR_ANSWER"
            java.lang.String r2 = "PRANSWER"
            java.lang.String r0 = r0.replace(r1, r2)
            goto L2f
        L2c:
            java.lang.String r0 = "OFFER"
        L2f:
            r9 = r0
            r0 = r8
            java.lang.Class<java.lang.Enum> r1 = java.lang.Enum.class
            java.lang.Class r0 = r0.asSubclass(r1)
            r1 = r9
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            r10 = r0
            r0 = r7
            r1 = 2
            java.lang.Class[] r1 = new java.lang.Class[r1]
            r2 = r1
            r3 = 0
            r4 = r8
            r2[r3] = r4
            r2 = r1
            r3 = 1
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r2[r3] = r4
            java.lang.reflect.Constructor r0 = r0.getConstructor(r1)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r10
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r6
            if (r4 == 0) goto L64
            r4 = r6
            java.lang.String r4 = r4.sdp
            goto L66
        L64:
            java.lang.String r4 = ""
        L66:
            r2[r3] = r4
            java.lang.Object r0 = r0.newInstance(r1)
            return r0
    }

    static dev.onvoid.webrtc.RTCSessionDescription fromAndroidSdp(java.lang.Object r5) throws java.lang.Exception {
            r0 = r5
            java.lang.String r1 = "type"
            java.lang.Object r0 = getField(r0, r1)
            r6 = r0
            r0 = r5
            java.lang.String r1 = "description"
            java.lang.Object r0 = getField(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            r7 = r0
            r0 = r6
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "PRANSWER"
            java.lang.String r2 = "PR_ANSWER"
            java.lang.String r0 = r0.replace(r1, r2)
            r8 = r0
            dev.onvoid.webrtc.RTCSessionDescription r0 = new dev.onvoid.webrtc.RTCSessionDescription
            r1 = r0
            java.lang.Class<dev.onvoid.webrtc.RTCSdpType> r2 = dev.onvoid.webrtc.RTCSdpType.class
            r3 = r8
            java.lang.Enum r2 = enumValue(r2, r3)
            dev.onvoid.webrtc.RTCSdpType r2 = (dev.onvoid.webrtc.RTCSdpType) r2
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    static java.lang.Object toAndroidIce(dev.onvoid.webrtc.RTCIceCandidate r6) throws java.lang.Exception {
            java.lang.String r0 = "org.webrtc.IceCandidate"
            java.lang.Class r0 = cls(r0)
            r1 = 3
            java.lang.Class[] r1 = new java.lang.Class[r1]
            r2 = r1
            r3 = 0
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r2[r3] = r4
            r2 = r1
            r3 = 1
            java.lang.Class r4 = java.lang.Integer.TYPE
            r2[r3] = r4
            r2 = r1
            r3 = 2
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r2[r3] = r4
            java.lang.reflect.Constructor r0 = r0.getConstructor(r1)
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r6
            java.lang.String r4 = r4.sdpMid
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r6
            int r4 = r4.sdpMLineIndex
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r3] = r4
            r2 = r1
            r3 = 2
            r4 = r6
            java.lang.String r4 = r4.sdp
            r2[r3] = r4
            java.lang.Object r0 = r0.newInstance(r1)
            return r0
    }

    static java.lang.Object toDataChannelInit(dev.onvoid.webrtc.RTCDataChannelInit r4) throws java.lang.Exception {
            java.lang.String r0 = "org.webrtc.DataChannel$Init"
            java.lang.Class r0 = cls(r0)
            r5 = r0
            r0 = r5
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.reflect.Constructor r0 = r0.getConstructor(r1)
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object r0 = r0.newInstance(r1)
            r6 = r0
            r0 = r4
            if (r0 == 0) goto L78
            r0 = r6
            java.lang.String r1 = "ordered"
            r2 = r4
            boolean r2 = r2.ordered
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            setFieldIfExists(r0, r1, r2)
            r0 = r6
            java.lang.String r1 = "negotiated"
            r2 = r4
            boolean r2 = r2.negotiated
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            setFieldIfExists(r0, r1, r2)
            r0 = r6
            java.lang.String r1 = "id"
            r2 = r4
            int r2 = r2.id
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            setFieldIfExists(r0, r1, r2)
            r0 = r6
            java.lang.String r1 = "maxRetransmits"
            r2 = r4
            int r2 = r2.maxRetransmits
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            setFieldIfExists(r0, r1, r2)
            r0 = r6
            java.lang.String r1 = "maxRetransmitTimeMs"
            r2 = r4
            int r2 = r2.maxPacketLifeTime
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            setFieldIfExists(r0, r1, r2)
            r0 = r6
            java.lang.String r1 = "protocol"
            r2 = r4
            java.lang.String r2 = r2.protocol
            if (r2 == 0) goto L73
            r2 = r4
            java.lang.String r2 = r2.protocol
            goto L75
        L73:
            java.lang.String r2 = ""
        L75:
            setFieldIfExists(r0, r1, r2)
        L78:
            r0 = r6
            return r0
    }

    static java.lang.Object mediaConstraints() throws java.lang.Exception {
            java.lang.String r0 = "org.webrtc.MediaConstraints"
            java.lang.Class r0 = cls(r0)
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.reflect.Constructor r0 = r0.getConstructor(r1)
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object r0 = r0.newInstance(r1)
            return r0
    }

    static java.lang.Object invoke(java.lang.Object r5, java.lang.String r6, java.lang.Object... r7) throws java.lang.Exception {
            r0 = r5
            boolean r0 = r0 instanceof java.lang.Class
            if (r0 == 0) goto Le
            r0 = r5
            java.lang.Class r0 = (java.lang.Class) r0
            goto L12
        Le:
            r0 = r5
            java.lang.Class r0 = r0.getClass()
        L12:
            r8 = r0
            r0 = r8
            java.lang.reflect.Method[] r0 = r0.getMethods()
            r9 = r0
            r0 = r9
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r11 = r0
        L21:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto L64
            r0 = r9
            r1 = r11
            r0 = r0[r1]
            r12 = r0
            r0 = r12
            java.lang.String r0 = r0.getName()
            r1 = r6
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5e
            r0 = r12
            java.lang.Class[] r0 = r0.getParameterTypes()
            int r0 = r0.length
            r1 = r7
            int r1 = r1.length
            if (r0 == r1) goto L49
            goto L5e
        L49:
            r0 = r12
            r1 = r5
            boolean r1 = r1 instanceof java.lang.Class     // Catch: java.lang.IllegalArgumentException -> L5c
            if (r1 == 0) goto L56
            r1 = 0
            goto L57
        L56:
            r1 = r5
        L57:
            r2 = r7
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.IllegalArgumentException -> L5c
            return r0
        L5c:
            r13 = move-exception
        L5e:
            int r11 = r11 + 1
            goto L21
        L64:
            r0 = r8
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
            r9 = r0
            r0 = r9
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r11 = r0
        L72:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto Lbb
            r0 = r9
            r1 = r11
            r0 = r0[r1]
            r12 = r0
            r0 = r12
            java.lang.String r0 = r0.getName()
            r1 = r6
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb5
            r0 = r12
            java.lang.Class[] r0 = r0.getParameterTypes()
            int r0 = r0.length
            r1 = r7
            int r1 = r1.length
            if (r0 == r1) goto L9a
            goto Lb5
        L9a:
            r0 = r12
            r1 = 1
            r0.setAccessible(r1)
            r0 = r12
            r1 = r5
            boolean r1 = r1 instanceof java.lang.Class     // Catch: java.lang.IllegalArgumentException -> Lb3
            if (r1 == 0) goto Lad
            r1 = 0
            goto Lae
        Lad:
            r1 = r5
        Lae:
            r2 = r7
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.IllegalArgumentException -> Lb3
            return r0
        Lb3:
            r13 = move-exception
        Lb5:
            int r11 = r11 + 1
            goto L72
        Lbb:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            r3 = r8
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "."
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "/"
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r7
            int r3 = r3.length
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    static void callOptional(java.lang.Object r7, java.lang.String r8, java.lang.Object r9) {
            r0 = r7
            r1 = r8
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L11
            r3 = r2
            r4 = 0
            r5 = r9
            r3[r4] = r5     // Catch: java.lang.Throwable -> L11
            java.lang.Object r0 = invoke(r0, r1, r2)     // Catch: java.lang.Throwable -> L11
            goto L12
        L11:
            r10 = move-exception
        L12:
            return
    }

    static java.lang.Object getField(java.lang.Object r3, java.lang.String r4) throws java.lang.Exception {
            r0 = r3
            java.lang.Class r0 = r0.getClass()
            r1 = r4
            java.lang.reflect.Field r0 = r0.getField(r1)
            r5 = r0
            r0 = r5
            r1 = r3
            java.lang.Object r0 = r0.get(r1)
            return r0
    }

    static int getIntField(java.lang.Object r3, java.lang.String r4) throws java.lang.Exception {
            r0 = r3
            r1 = r4
            java.lang.Object r0 = getField(r0, r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            return r0
    }

    static void setFieldIfExists(java.lang.Object r4, java.lang.String r5, java.lang.Object r6) {
            r0 = r4
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L12
            r1 = r5
            java.lang.reflect.Field r0 = r0.getField(r1)     // Catch: java.lang.Throwable -> L12
            r7 = r0
            r0 = r7
            r1 = r4
            r2 = r6
            r0.set(r1, r2)     // Catch: java.lang.Throwable -> L12
            goto L13
        L12:
            r7 = move-exception
        L13:
            return
    }

    static void setEnumField(java.lang.Object r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r0 = r5
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L25
            r1 = r6
            java.lang.reflect.Field r0 = r0.getField(r1)     // Catch: java.lang.Throwable -> L25
            r9 = r0
            r0 = r7
            java.lang.Class r0 = cls(r0)     // Catch: java.lang.Throwable -> L25
            r10 = r0
            r0 = r9
            r1 = r5
            r2 = r10
            java.lang.Class<java.lang.Enum> r3 = java.lang.Enum.class
            java.lang.Class r2 = r2.asSubclass(r3)     // Catch: java.lang.Throwable -> L25
            r3 = r8
            java.lang.Enum r2 = java.lang.Enum.valueOf(r2, r3)     // Catch: java.lang.Throwable -> L25
            r0.set(r1, r2)     // Catch: java.lang.Throwable -> L25
            goto L27
        L25:
            r9 = move-exception
        L27:
            return
    }

    static <E extends java.lang.Enum<E>> E enumValue(java.lang.Class<E> r5, java.lang.String r6) {
            r0 = r5
            r1 = r6
            java.lang.String r2 = "PRANSWER"
            java.lang.String r3 = "PR_ANSWER"
            java.lang.String r1 = r1.replace(r2, r3)     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = "MAXBUNDLE"
            java.lang.String r3 = "MAX_BUNDLE"
            java.lang.String r1 = r1.replace(r2, r3)     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = "MAXCOMPAT"
            java.lang.String r3 = "MAX_COMPAT"
            java.lang.String r1 = r1.replace(r2, r3)     // Catch: java.lang.Throwable -> L21
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)     // Catch: java.lang.Throwable -> L21
            return r0
        L21:
            r7 = move-exception
            r0 = r5
            java.lang.Object[] r0 = r0.getEnumConstants()
            java.lang.Enum[] r0 = (java.lang.Enum[]) r0
            r1 = 0
            r0 = r0[r1]
            return r0
    }

    static void startFdMonitor() {
            java.util.concurrent.atomic.AtomicBoolean r0 = dev.onvoid.webrtc.AndroidWebRtcBridge.FD_MONITOR_STARTED
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 != 0) goto Lc
            return
        Lc:
            java.lang.Thread r0 = new java.lang.Thread
            r1 = r0
            void r2 = () -> { // java.lang.Runnable.run():void
                lambda$startFdMonitor$2();
            }
            java.lang.String r3 = "DroidBridge-FD-Monitor"
            r1.<init>(r2, r3)
            r5 = r0
            r0 = r5
            r1 = 1
            r0.setDaemon(r1)
            r0 = r5
            r0.start()
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "[DroidBridgeWebRTC] FD monitor started"
            r0.println(r1)
            return
    }

    static void logFdSnapshot(java.lang.String r5) {
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L102
            r1 = r0
            java.lang.String r2 = "/proc/self/fd"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L102
            r6 = r0
            r0 = r6
            java.lang.String[] r0 = r0.list()     // Catch: java.lang.Throwable -> L102
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L19
            r0 = r7
            int r0 = r0.length     // Catch: java.lang.Throwable -> L102
            goto L1a
        L19:
            r0 = -1
        L1a:
            r8 = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L102
            r1 = r0
            r1.<init>()     // Catch: java.lang.Throwable -> L102
            r9 = r0
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L102
            r1 = r0
            r1.<init>()     // Catch: java.lang.Throwable -> L102
            r10 = r0
            r0 = r7
            if (r0 == 0) goto Lc5
            r0 = r7
            java.util.Arrays.sort(r0)     // Catch: java.lang.Throwable -> L102
            r0 = r7
            r11 = r0
            r0 = r11
            int r0 = r0.length     // Catch: java.lang.Throwable -> L102
            r12 = r0
            r0 = 0
            r13 = r0
        L40:
            r0 = r13
            r1 = r12
            if (r0 >= r1) goto Lc5
            r0 = r11
            r1 = r13
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L102
            r14 = r0
            r0 = r14
            java.lang.String r0 = readFdTarget(r0)     // Catch: java.lang.Throwable -> L102
            r15 = r0
            r0 = r15
            java.lang.String r0 = categorizeFdTarget(r0)     // Catch: java.lang.Throwable -> L102
            r16 = r0
            r0 = r9
            r1 = r16
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L102
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L102
            r17 = r0
            r0 = r9
            r1 = r16
            r2 = r17
            if (r2 != 0) goto L75
            r2 = 1
            goto L7c
        L75:
            r2 = r17
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L102
            r3 = 1
            int r2 = r2 + r3
        L7c:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L102
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.Throwable -> L102
            r0 = r10
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L102
            r1 = 12
            if (r0 >= r1) goto Lbf
            r0 = r15
            if (r0 == 0) goto Lbf
            r0 = r15
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L102
            if (r0 <= 0) goto Lbf
            r0 = r10
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L102
            r2 = r1
            r2.<init>()     // Catch: java.lang.Throwable -> L102
            r2 = r14
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L102
            java.lang.String r2 = "->"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L102
            r2 = r15
            r3 = 80
            java.lang.String r2 = abbreviate(r2, r3)     // Catch: java.lang.Throwable -> L102
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L102
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L102
            boolean r0 = r0.add(r1)     // Catch: java.lang.Throwable -> L102
        Lbf:
            int r13 = r13 + 1
            goto L40
        Lc5:
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L102
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L102
            r2 = r1
            r2.<init>()     // Catch: java.lang.Throwable -> L102
            java.lang.String r2 = "[DroidBridgeWebRTC] FD snapshot "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L102
            r2 = r5
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L102
            java.lang.String r2 = " count="
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L102
            r2 = r8
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L102
            java.lang.String r2 = " categories="
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L102
            r2 = r9
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L102
            java.lang.String r2 = " samples="
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L102
            r2 = r10
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L102
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L102
            r0.println(r1)     // Catch: java.lang.Throwable -> L102
            goto L12a
        L102:
            r6 = move-exception
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "[DroidBridgeWebRTC] FD snapshot failed "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r5
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ": "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r6
            java.lang.Throwable r2 = unwrap(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
        L12a:
            return
    }

    static java.lang.String readFdTarget(java.lang.String r6) {
            java.lang.String r0 = "/proc/self/fd"
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L19
            r2 = r1
            r3 = 0
            r4 = r6
            r2[r3] = r4     // Catch: java.lang.Throwable -> L19
            java.nio.file.Path r0 = java.nio.file.Paths.get(r0, r1)     // Catch: java.lang.Throwable -> L19
            r7 = r0
            r0 = r7
            java.nio.file.Path r0 = java.nio.file.Files.readSymbolicLink(r0)     // Catch: java.lang.Throwable -> L19
            r8 = r0
            r0 = r8
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L19
            return r0
        L19:
            r7 = move-exception
            java.lang.String r0 = ""
            return r0
    }

    static java.lang.String categorizeFdTarget(java.lang.String r3) {
            r0 = r3
            if (r0 == 0) goto Lb
            r0 = r3
            int r0 = r0.length()
            if (r0 != 0) goto Lf
        Lb:
            java.lang.String r0 = "unknown"
            return r0
        Lf:
            r0 = r3
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            r4 = r0
            r0 = r4
            java.lang.String r1 = "socket:"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L25
            java.lang.String r0 = "socket"
            return r0
        L25:
            r0 = r4
            java.lang.String r1 = "pipe:"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L33
            java.lang.String r0 = "pipe"
            return r0
        L33:
            r0 = r4
            java.lang.String r1 = "anon_inode:"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L41
            java.lang.String r0 = "anon_inode"
            return r0
        L41:
            r0 = r4
            java.lang.String r1 = "eventfd"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L4f
            java.lang.String r0 = "eventfd"
            return r0
        L4f:
            r0 = r4
            java.lang.String r1 = "eventpoll"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L5d
            java.lang.String r0 = "eventpoll"
            return r0
        L5d:
            r0 = r4
            java.lang.String r1 = "ashmem"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L6b
            java.lang.String r0 = "ashmem"
            return r0
        L6b:
            r0 = r4
            java.lang.String r1 = "dmabuf"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L89
            r0 = r4
            java.lang.String r1 = "kgsl"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L89
            r0 = r4
            java.lang.String r1 = "gpu"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L8d
        L89:
            java.lang.String r0 = "gpu"
            return r0
        L8d:
            r0 = r4
            java.lang.String r1 = "/dev/"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L9b
            java.lang.String r0 = "dev"
            return r0
        L9b:
            r0 = r4
            java.lang.String r1 = ".minecraft"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Lb9
            r0 = r4
            java.lang.String r1 = "/storage/"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Lb9
            r0 = r4
            java.lang.String r1 = "/data/"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto Lbd
        Lb9:
            java.lang.String r0 = "file"
            return r0
        Lbd:
            java.lang.String r0 = "other"
            return r0
    }

    static java.lang.String abbreviate(java.lang.String r6, int r7) {
            r0 = r6
            if (r0 != 0) goto L7
            java.lang.String r0 = ""
            return r0
        L7:
            r0 = r6
            r1 = 10
            r2 = 32
            java.lang.String r0 = r0.replace(r1, r2)
            r1 = 13
            r2 = 32
            java.lang.String r0 = r0.replace(r1, r2)
            r8 = r0
            r0 = r8
            int r0 = r0.length()
            r1 = r7
            if (r0 > r1) goto L21
            r0 = r8
            return r0
        L21:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r8
            r2 = 0
            r3 = 0
            r4 = r7
            int r3 = java.lang.Math.max(r3, r4)
            java.lang.String r1 = r1.substring(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "..."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    static java.lang.Throwable unwrap(java.lang.Throwable r2) {
        L0:
            r0 = r2
            boolean r0 = r0 instanceof java.lang.reflect.InvocationTargetException
            if (r0 == 0) goto L1c
            r0 = r2
            java.lang.reflect.InvocationTargetException r0 = (java.lang.reflect.InvocationTargetException) r0
            java.lang.Throwable r0 = r0.getTargetException()
            if (r0 == 0) goto L1c
            r0 = r2
            java.lang.reflect.InvocationTargetException r0 = (java.lang.reflect.InvocationTargetException) r0
            java.lang.Throwable r0 = r0.getTargetException()
            r2 = r0
            goto L0
        L1c:
            r0 = r2
            return r0
    }

    private static /* synthetic */ void lambda$startFdMonitor$2() {
            r0 = 0
            r4 = r0
        L2:
            r0 = r4
            r1 = 240(0xf0, float:3.36E-43)
            if (r0 >= r1) goto L37
            r0 = 10000(0x2710, double:4.9407E-320)
            java.lang.Thread.sleep(r0)     // Catch: java.lang.Throwable -> L3a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3a
            r1 = r0
            r1.<init>()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r1 = "periodic-"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L3a
            r1 = r4
            r2 = 1
            int r1 = r1 + r2
            r2 = 10
            int r1 = r1 * r2
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r1 = "s"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L3a
            logFdSnapshot(r0)     // Catch: java.lang.Throwable -> L3a
            int r4 = r4 + 1
            goto L2
        L37:
            goto L3b
        L3a:
            r4 = move-exception
        L3b:
            return
    }

    private static /* synthetic */ java.lang.Object lambda$createSdpObserver$1(dev.onvoid.webrtc.CreateSessionDescriptionObserver r4, dev.onvoid.webrtc.SetSessionDescriptionObserver r5, java.lang.Object r6, java.lang.reflect.Method r7, java.lang.Object[] r8) throws java.lang.Throwable {
            r0 = r7
            java.lang.String r0 = r0.getName()
            r9 = r0
            java.lang.String r0 = "onCreateSuccess"
            r1 = r9
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L81
            r0 = r4
            if (r0 == 0) goto L81
            r0 = r8
            if (r0 == 0) goto L81
            r0 = r8
            int r0 = r0.length
            r1 = 1
            if (r0 != r1) goto L81
            r0 = r8
            r1 = 0
            r0 = r0[r1]
            dev.onvoid.webrtc.RTCSessionDescription r0 = fromAndroidSdp(r0)
            r10 = r0
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "[DroidBridgeWebRTC] onCreateSuccess type="
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r10
            dev.onvoid.webrtc.RTCSdpType r2 = r2.sdpType
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " len="
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r10
            java.lang.String r2 = r2.sdp
            if (r2 == 0) goto L5b
            r2 = r10
            java.lang.String r2 = r2.sdp
            int r2 = r2.length()
            goto L5c
        L5b:
            r2 = 0
        L5c:
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " candidates="
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r10
            java.lang.String r2 = r2.sdp
            int r2 = countSdpCandidates(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r0 = r4
            r1 = r10
            r0.onSuccess(r1)
            goto L13d
        L81:
            java.lang.String r0 = "onSetSuccess"
            r1 = r9
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto La2
            r0 = r5
            if (r0 == 0) goto La2
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "[DroidBridgeWebRTC] onSetSuccess"
            r0.println(r1)
            r0 = r5
            r0.onSuccess()
            goto L13d
        La2:
            java.lang.String r0 = "onCreateFailure"
            r1 = r9
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lf1
            r0 = r4
            if (r0 == 0) goto Lf1
            r0 = r8
            if (r0 == 0) goto Lc6
            r0 = r8
            int r0 = r0.length
            if (r0 <= 0) goto Lc6
            r0 = r8
            r1 = 0
            r0 = r0[r1]
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Lc9
        Lc6:
            java.lang.String r0 = "unknown"
        Lc9:
            r10 = r0
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "[DroidBridgeWebRTC] onCreateFailure "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r10
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r0 = r4
            r1 = r10
            r0.onFailure(r1)
            goto L13d
        Lf1:
            java.lang.String r0 = "onSetFailure"
            r1 = r9
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L13d
            r0 = r5
            if (r0 == 0) goto L13d
            r0 = r8
            if (r0 == 0) goto L115
            r0 = r8
            int r0 = r0.length
            if (r0 <= 0) goto L115
            r0 = r8
            r1 = 0
            r0 = r0[r1]
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L118
        L115:
            java.lang.String r0 = "unknown"
        L118:
            r10 = r0
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "[DroidBridgeWebRTC] onSetFailure "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r10
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r0 = r5
            r1 = r10
            r0.onFailure(r1)
        L13d:
            r0 = 0
            return r0
    }

    private static /* synthetic */ java.lang.Object lambda$createObserverProxy$0(dev.onvoid.webrtc.PeerConnectionObserver r7, java.lang.Object[] r8, java.lang.Object r9, java.lang.reflect.Method r10, java.lang.Object[] r11) throws java.lang.Throwable {
            r0 = r7
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r10
            java.lang.String r0 = r0.getName()
            r12 = r0
            java.lang.String r0 = "onIceCandidate"
            r1 = r12
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L2e7
            if (r0 == 0) goto L9a
            r0 = r11
            if (r0 == 0) goto L9a
            r0 = r11
            int r0 = r0.length     // Catch: java.lang.Throwable -> L2e7
            r1 = 1
            if (r0 != r1) goto L9a
            r0 = r11
            r1 = 0
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L2e7
            r13 = r0
            r0 = r13
            java.lang.String r1 = "sdpMid"
            java.lang.Object r0 = getField(r0, r1)     // Catch: java.lang.Throwable -> L2e7
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L2e7
            r14 = r0
            r0 = r13
            java.lang.String r1 = "sdpMLineIndex"
            int r0 = getIntField(r0, r1)     // Catch: java.lang.Throwable -> L2e7
            r15 = r0
            r0 = r13
            java.lang.String r1 = "sdp"
            java.lang.Object r0 = getField(r0, r1)     // Catch: java.lang.Throwable -> L2e7
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L2e7
            r16 = r0
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L2e7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e7
            r2 = r1
            r2.<init>()     // Catch: java.lang.Throwable -> L2e7
            java.lang.String r2 = "[DroidBridgeWebRTC] onIceCandidate mid="
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L2e7
            r2 = r14
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L2e7
            java.lang.String r2 = " index="
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L2e7
            r2 = r15
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L2e7
            java.lang.String r2 = " sdp="
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L2e7
            r2 = r16
            r3 = 180(0xb4, float:2.52E-43)
            java.lang.String r2 = abbreviate(r2, r3)     // Catch: java.lang.Throwable -> L2e7
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L2e7
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2e7
            r0.println(r1)     // Catch: java.lang.Throwable -> L2e7
            r0 = r7
            dev.onvoid.webrtc.RTCIceCandidate r1 = new dev.onvoid.webrtc.RTCIceCandidate     // Catch: java.lang.Throwable -> L2e7
            r2 = r1
            r3 = r14
            r4 = r15
            r5 = r16
            r2.<init>(r3, r4, r5)     // Catch: java.lang.Throwable -> L2e7
            r0.onIceCandidate(r1)     // Catch: java.lang.Throwable -> L2e7
            goto L2e4
        L9a:
            java.lang.String r0 = "onDataChannel"
            r1 = r12
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L2e7
            if (r0 == 0) goto Lce
            r0 = r11
            if (r0 == 0) goto Lce
            r0 = r11
            int r0 = r0.length     // Catch: java.lang.Throwable -> L2e7
            r1 = 1
            if (r0 != r1) goto Lce
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L2e7
            java.lang.String r1 = "[DroidBridgeWebRTC] onDataChannel"
            r0.println(r1)     // Catch: java.lang.Throwable -> L2e7
            r0 = r7
            dev.onvoid.webrtc.RTCDataChannel r1 = new dev.onvoid.webrtc.RTCDataChannel     // Catch: java.lang.Throwable -> L2e7
            r2 = r1
            r3 = r11
            r4 = 0
            r3 = r3[r4]     // Catch: java.lang.Throwable -> L2e7
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2e7
            r0.onDataChannel(r1)     // Catch: java.lang.Throwable -> L2e7
            goto L2e4
        Lce:
            java.lang.String r0 = "onIceConnectionChange"
            r1 = r12
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L2e7
            if (r0 == 0) goto L139
            r0 = r11
            if (r0 == 0) goto L139
            r0 = r11
            int r0 = r0.length     // Catch: java.lang.Throwable -> L2e7
            r1 = 1
            if (r0 != r1) goto L139
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L2e7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e7
            r2 = r1
            r2.<init>()     // Catch: java.lang.Throwable -> L2e7
            java.lang.String r2 = "[DroidBridgeWebRTC] onIceConnectionChange "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L2e7
            r2 = r11
            r3 = 0
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L2e7
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L2e7
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2e7
            r0.println(r1)     // Catch: java.lang.Throwable -> L2e7
            r0 = r7
            java.lang.Class<dev.onvoid.webrtc.RTCIceConnectionState> r1 = dev.onvoid.webrtc.RTCIceConnectionState.class
            r2 = r11
            r3 = 0
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L2e7
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L2e7
            java.lang.Enum r1 = enumValue(r1, r2)     // Catch: java.lang.Throwable -> L2e7
            dev.onvoid.webrtc.RTCIceConnectionState r1 = (dev.onvoid.webrtc.RTCIceConnectionState) r1     // Catch: java.lang.Throwable -> L2e7
            r0.onIceConnectionChange(r1)     // Catch: java.lang.Throwable -> L2e7
            java.lang.String r0 = "CLOSED"
            r1 = r11
            r2 = 0
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L2e7
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L2e7
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L2e7
            if (r0 == 0) goto L2e4
            r0 = r8
            if (r0 == 0) goto L132
            r0 = r8
            r1 = 0
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L2e7
            goto L133
        L132:
            r0 = 0
        L133:
            safeDisposePeerConnection(r0)     // Catch: java.lang.Throwable -> L2e7
            goto L2e4
        L139:
            java.lang.String r0 = "onStandardizedIceConnectionChange"
            r1 = r12
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L2e7
            if (r0 == 0) goto L186
            r0 = r11
            if (r0 == 0) goto L186
            r0 = r11
            int r0 = r0.length     // Catch: java.lang.Throwable -> L2e7
            r1 = 1
            if (r0 != r1) goto L186
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L2e7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e7
            r2 = r1
            r2.<init>()     // Catch: java.lang.Throwable -> L2e7
            java.lang.String r2 = "[DroidBridgeWebRTC] onStandardizedIceConnectionChange "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L2e7
            r2 = r11
            r3 = 0
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L2e7
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L2e7
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2e7
            r0.println(r1)     // Catch: java.lang.Throwable -> L2e7
            r0 = r7
            java.lang.Class<dev.onvoid.webrtc.RTCIceConnectionState> r1 = dev.onvoid.webrtc.RTCIceConnectionState.class
            r2 = r11
            r3 = 0
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L2e7
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L2e7
            java.lang.Enum r1 = enumValue(r1, r2)     // Catch: java.lang.Throwable -> L2e7
            dev.onvoid.webrtc.RTCIceConnectionState r1 = (dev.onvoid.webrtc.RTCIceConnectionState) r1     // Catch: java.lang.Throwable -> L2e7
            r0.onStandardizedIceConnectionChange(r1)     // Catch: java.lang.Throwable -> L2e7
            goto L2e4
        L186:
            java.lang.String r0 = "onConnectionChange"
            r1 = r12
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L2e7
            if (r0 == 0) goto L1f1
            r0 = r11
            if (r0 == 0) goto L1f1
            r0 = r11
            int r0 = r0.length     // Catch: java.lang.Throwable -> L2e7
            r1 = 1
            if (r0 != r1) goto L1f1
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L2e7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e7
            r2 = r1
            r2.<init>()     // Catch: java.lang.Throwable -> L2e7
            java.lang.String r2 = "[DroidBridgeWebRTC] onConnectionChange "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L2e7
            r2 = r11
            r3 = 0
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L2e7
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L2e7
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2e7
            r0.println(r1)     // Catch: java.lang.Throwable -> L2e7
            r0 = r7
            java.lang.Class<dev.onvoid.webrtc.RTCPeerConnectionState> r1 = dev.onvoid.webrtc.RTCPeerConnectionState.class
            r2 = r11
            r3 = 0
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L2e7
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L2e7
            java.lang.Enum r1 = enumValue(r1, r2)     // Catch: java.lang.Throwable -> L2e7
            dev.onvoid.webrtc.RTCPeerConnectionState r1 = (dev.onvoid.webrtc.RTCPeerConnectionState) r1     // Catch: java.lang.Throwable -> L2e7
            r0.onConnectionChange(r1)     // Catch: java.lang.Throwable -> L2e7
            java.lang.String r0 = "CLOSED"
            r1 = r11
            r2 = 0
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L2e7
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L2e7
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L2e7
            if (r0 == 0) goto L2e4
            r0 = r8
            if (r0 == 0) goto L1ea
            r0 = r8
            r1 = 0
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L2e7
            goto L1eb
        L1ea:
            r0 = 0
        L1eb:
            safeDisposePeerConnection(r0)     // Catch: java.lang.Throwable -> L2e7
            goto L2e4
        L1f1:
            java.lang.String r0 = "onIceGatheringChange"
            r1 = r12
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L2e7
            if (r0 == 0) goto L23e
            r0 = r11
            if (r0 == 0) goto L23e
            r0 = r11
            int r0 = r0.length     // Catch: java.lang.Throwable -> L2e7
            r1 = 1
            if (r0 != r1) goto L23e
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L2e7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e7
            r2 = r1
            r2.<init>()     // Catch: java.lang.Throwable -> L2e7
            java.lang.String r2 = "[DroidBridgeWebRTC] onIceGatheringChange "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L2e7
            r2 = r11
            r3 = 0
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L2e7
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L2e7
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2e7
            r0.println(r1)     // Catch: java.lang.Throwable -> L2e7
            r0 = r7
            java.lang.Class<dev.onvoid.webrtc.RTCIceGatheringState> r1 = dev.onvoid.webrtc.RTCIceGatheringState.class
            r2 = r11
            r3 = 0
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L2e7
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L2e7
            java.lang.Enum r1 = enumValue(r1, r2)     // Catch: java.lang.Throwable -> L2e7
            dev.onvoid.webrtc.RTCIceGatheringState r1 = (dev.onvoid.webrtc.RTCIceGatheringState) r1     // Catch: java.lang.Throwable -> L2e7
            r0.onIceGatheringChange(r1)     // Catch: java.lang.Throwable -> L2e7
            goto L2e4
        L23e:
            java.lang.String r0 = "onSignalingChange"
            r1 = r12
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L2e7
            if (r0 == 0) goto L2a9
            r0 = r11
            if (r0 == 0) goto L2a9
            r0 = r11
            int r0 = r0.length     // Catch: java.lang.Throwable -> L2e7
            r1 = 1
            if (r0 != r1) goto L2a9
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L2e7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e7
            r2 = r1
            r2.<init>()     // Catch: java.lang.Throwable -> L2e7
            java.lang.String r2 = "[DroidBridgeWebRTC] onSignalingChange "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L2e7
            r2 = r11
            r3 = 0
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L2e7
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L2e7
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2e7
            r0.println(r1)     // Catch: java.lang.Throwable -> L2e7
            r0 = r7
            java.lang.Class<dev.onvoid.webrtc.RTCSignalingState> r1 = dev.onvoid.webrtc.RTCSignalingState.class
            r2 = r11
            r3 = 0
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L2e7
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L2e7
            java.lang.Enum r1 = enumValue(r1, r2)     // Catch: java.lang.Throwable -> L2e7
            dev.onvoid.webrtc.RTCSignalingState r1 = (dev.onvoid.webrtc.RTCSignalingState) r1     // Catch: java.lang.Throwable -> L2e7
            r0.onSignalingChange(r1)     // Catch: java.lang.Throwable -> L2e7
            java.lang.String r0 = "CLOSED"
            r1 = r11
            r2 = 0
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L2e7
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L2e7
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L2e7
            if (r0 == 0) goto L2e4
            r0 = r8
            if (r0 == 0) goto L2a2
            r0 = r8
            r1 = 0
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L2e7
            goto L2a3
        L2a2:
            r0 = 0
        L2a3:
            safeDisposePeerConnection(r0)     // Catch: java.lang.Throwable -> L2e7
            goto L2e4
        L2a9:
            java.lang.String r0 = "onRenegotiationNeeded"
            r1 = r12
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L2e7
            if (r0 == 0) goto L2bd
            r0 = r7
            r0.onRenegotiationNeeded()     // Catch: java.lang.Throwable -> L2e7
            goto L2e4
        L2bd:
            java.lang.String r0 = "onIceConnectionReceivingChange"
            r1 = r12
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L2e7
            if (r0 == 0) goto L2e4
            r0 = r11
            if (r0 == 0) goto L2e4
            r0 = r11
            int r0 = r0.length     // Catch: java.lang.Throwable -> L2e7
            r1 = 1
            if (r0 != r1) goto L2e4
            r0 = r7
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L2e7
            r2 = r11
            r3 = 0
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L2e7
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L2e7
            r0.onIceConnectionReceivingChange(r1)     // Catch: java.lang.Throwable -> L2e7
        L2e4:
            goto L2e9
        L2e7:
            r13 = move-exception
        L2e9:
            r0 = 0
            return r0
    }

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = r0
            r1.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            dev.onvoid.webrtc.AndroidWebRtcBridge.DISPOSED_PEERS = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            dev.onvoid.webrtc.AndroidWebRtcBridge.FD_MONITOR_STARTED = r0
            return
    }
}
