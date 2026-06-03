package dev.onvoid.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/droidbridge-devonvoid-android-webrtc-bridge.jar:dev/onvoid/webrtc/RTCDataChannel.class */
public class RTCDataChannel extends dev.onvoid.webrtc.internal.DisposableNativeObject {
    final java.lang.Object delegate;
    private java.lang.Object observerProxy;
    private final java.util.concurrent.atomic.AtomicBoolean disposed;

    RTCDataChannel(java.lang.Object r6) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r2 = r1
            r3 = 0
            r2.<init>(r3)
            r0.disposed = r1
            r0 = r5
            r1 = r6
            r0.delegate = r1
            return
    }

    public void registerObserver(dev.onvoid.webrtc.RTCDataChannelObserver r8) {
            r7 = this;
            java.lang.String r0 = "org.webrtc.DataChannel$Observer"
            java.lang.Class r0 = dev.onvoid.webrtc.AndroidWebRtcBridge.cls(r0)     // Catch: java.lang.Throwable -> L37
            r9 = r0
            r0 = r7
            r1 = r9
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L37
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L37
            r3 = r2
            r4 = 0
            r5 = r9
            r3[r4] = r5     // Catch: java.lang.Throwable -> L37
            r3 = r8
            void r3 = (v1, v2, v3) -> { // java.lang.reflect.InvocationHandler.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object
                return lambda$registerObserver$0(r3, v1, v2, v3);
            }     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = java.lang.reflect.Proxy.newProxyInstance(r1, r2, r3)     // Catch: java.lang.Throwable -> L37
            r0.observerProxy = r1     // Catch: java.lang.Throwable -> L37
            r0 = r7
            java.lang.Object r0 = r0.delegate     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "registerObserver"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L37
            r3 = r2
            r4 = 0
            r5 = r7
            java.lang.Object r5 = r5.observerProxy     // Catch: java.lang.Throwable -> L37
            r3[r4] = r5     // Catch: java.lang.Throwable -> L37
            java.lang.Object r0 = dev.onvoid.webrtc.AndroidWebRtcBridge.invoke(r0, r1, r2)     // Catch: java.lang.Throwable -> L37
            goto L46
        L37:
            r9 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "registerObserver failed"
            r3 = r9
            java.lang.Throwable r3 = dev.onvoid.webrtc.AndroidWebRtcBridge.unwrap(r3)
            r1.<init>(r2, r3)
            throw r0
        L46:
            return
    }

    public void unregisterObserver() {
            r4 = this;
            r0 = r4
            java.lang.Object r0 = r0.delegate     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = "unregisterObserver"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L11
            java.lang.Object r0 = dev.onvoid.webrtc.AndroidWebRtcBridge.invoke(r0, r1, r2)     // Catch: java.lang.Throwable -> L11
            goto L12
        L11:
            r5 = move-exception
        L12:
            r0 = r4
            r1 = 0
            r0.observerProxy = r1
            return
    }

    public java.lang.String getLabel() {
            r3 = this;
            r0 = r3
            java.lang.String r1 = "label"
            java.lang.String r0 = r0.stringCall(r1)
            return r0
    }

    public boolean isReliable() {
            r2 = this;
            r0 = 1
            return r0
    }

    public boolean isOrdered() {
            r2 = this;
            r0 = 1
            return r0
    }

    public int getMaxPacketLifeTime() {
            r2 = this;
            r0 = -1
            return r0
    }

    public int getMaxRetransmits() {
            r2 = this;
            r0 = -1
            return r0
    }

    public java.lang.String getProtocol() {
            r2 = this;
            java.lang.String r0 = ""
            return r0
    }

    public boolean isNegotiated() {
            r2 = this;
            r0 = 0
            return r0
    }

    public int getId() {
            r4 = this;
            r0 = r4
            java.lang.Object r0 = r0.delegate     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "id"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L14
            java.lang.Object r0 = dev.onvoid.webrtc.AndroidWebRtcBridge.invoke(r0, r1, r2)     // Catch: java.lang.Throwable -> L14
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L14
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L14
            return r0
        L14:
            r5 = move-exception
            r0 = -1
            return r0
    }

    public dev.onvoid.webrtc.RTCDataChannelState getState() {
            r5 = this;
            java.lang.Class<dev.onvoid.webrtc.RTCDataChannelState> r0 = dev.onvoid.webrtc.RTCDataChannelState.class
            r1 = r5
            java.lang.Object r1 = r1.delegate     // Catch: java.lang.Throwable -> L19
            java.lang.String r2 = "state"
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L19
            java.lang.Object r1 = dev.onvoid.webrtc.AndroidWebRtcBridge.invoke(r1, r2, r3)     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L19
            java.lang.Enum r0 = dev.onvoid.webrtc.AndroidWebRtcBridge.enumValue(r0, r1)     // Catch: java.lang.Throwable -> L19
            dev.onvoid.webrtc.RTCDataChannelState r0 = (dev.onvoid.webrtc.RTCDataChannelState) r0     // Catch: java.lang.Throwable -> L19
            return r0
        L19:
            r6 = move-exception
            dev.onvoid.webrtc.RTCDataChannelState r0 = dev.onvoid.webrtc.RTCDataChannelState.CLOSED
            return r0
    }

    public long getBufferedAmount() {
            r4 = this;
            r0 = r4
            java.lang.Object r0 = r0.delegate     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "bufferedAmount"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L14
            java.lang.Object r0 = dev.onvoid.webrtc.AndroidWebRtcBridge.invoke(r0, r1, r2)     // Catch: java.lang.Throwable -> L14
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L14
            long r0 = r0.longValue()     // Catch: java.lang.Throwable -> L14
            return r0
        L14:
            r5 = move-exception
            r0 = 0
            return r0
    }

    public void close() {
            r4 = this;
            r0 = r4
            java.lang.Object r0 = r0.delegate     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = "close"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L11
            java.lang.Object r0 = dev.onvoid.webrtc.AndroidWebRtcBridge.invoke(r0, r1, r2)     // Catch: java.lang.Throwable -> L11
            goto L12
        L11:
            r5 = move-exception
        L12:
            return
    }

    public void dispose() {
            r4 = this;
            r0 = r4
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.disposed
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 != 0) goto Ld
            return
        Ld:
            r0 = r4
            r0.unregisterObserver()
            r0 = r4
            java.lang.Object r0 = r0.delegate     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = "close"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L22
            java.lang.Object r0 = dev.onvoid.webrtc.AndroidWebRtcBridge.invoke(r0, r1, r2)     // Catch: java.lang.Throwable -> L22
            goto L23
        L22:
            r5 = move-exception
        L23:
            r0 = r4
            java.lang.Object r0 = r0.delegate     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = "dispose"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r0 = dev.onvoid.webrtc.AndroidWebRtcBridge.invoke(r0, r1, r2)     // Catch: java.lang.Throwable -> L3c
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = "[DroidBridgeWebRTC] disposed data channel"
            r0.println(r1)     // Catch: java.lang.Throwable -> L3c
            goto L3d
        L3c:
            r5 = move-exception
        L3d:
            return
    }

    public void send(dev.onvoid.webrtc.RTCDataChannelBuffer r8) throws java.lang.Exception {
            r7 = this;
            java.lang.String r0 = "org.webrtc.DataChannel$Buffer"
            java.lang.Class r0 = dev.onvoid.webrtc.AndroidWebRtcBridge.cls(r0)
            r9 = r0
            r0 = r9
            r1 = 2
            java.lang.Class[] r1 = new java.lang.Class[r1]
            r2 = r1
            r3 = 0
            java.lang.Class<java.nio.ByteBuffer> r4 = java.nio.ByteBuffer.class
            r2[r3] = r4
            r2 = r1
            r3 = 1
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r2[r3] = r4
            java.lang.reflect.Constructor r0 = r0.getConstructor(r1)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r8
            java.nio.ByteBuffer r4 = r4.data
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r8
            boolean r4 = r4.binary
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2[r3] = r4
            java.lang.Object r0 = r0.newInstance(r1)
            r10 = r0
            r0 = r7
            java.lang.Object r0 = r0.delegate
            java.lang.String r1 = "send"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r10
            r3[r4] = r5
            java.lang.Object r0 = dev.onvoid.webrtc.AndroidWebRtcBridge.invoke(r0, r1, r2)
            r11 = r0
            r0 = r11
            boolean r0 = r0 instanceof java.lang.Boolean
            if (r0 == 0) goto L62
            r0 = r11
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L62
            java.lang.Exception r0 = new java.lang.Exception
            r1 = r0
            java.lang.String r2 = "DataChannel.send returned false"
            r1.<init>(r2)
            throw r0
        L62:
            return
    }

    private java.lang.String stringCall(java.lang.String r5) {
            r4 = this;
            r0 = r4
            java.lang.Object r0 = r0.delegate     // Catch: java.lang.Throwable -> L1b
            r1 = r5
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r0 = dev.onvoid.webrtc.AndroidWebRtcBridge.invoke(r0, r1, r2)     // Catch: java.lang.Throwable -> L1b
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L18
            r0 = r6
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L1b
            goto L1a
        L18:
            java.lang.String r0 = ""
        L1a:
            return r0
        L1b:
            r6 = move-exception
            java.lang.String r0 = ""
            return r0
    }

    protected void finalize() throws java.lang.Throwable {
            r2 = this;
            r0 = r2
            r0.dispose()     // Catch: java.lang.Throwable -> Lb
            r0 = r2
            super/*java.lang.Object*/.finalize()
            goto L12
        Lb:
            r3 = move-exception
            r0 = r2
            super/*java.lang.Object*/.finalize()
            r0 = r3
            throw r0
        L12:
            return
    }

    private static /* synthetic */ java.lang.Object lambda$registerObserver$0(dev.onvoid.webrtc.RTCDataChannelObserver r6, java.lang.Object r7, java.lang.reflect.Method r8, java.lang.Object[] r9) throws java.lang.Throwable {
            r0 = r6
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r8
            java.lang.String r0 = r0.getName()
            r10 = r0
            java.lang.String r0 = "onBufferedAmountChange"
            r1 = r10
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L31
            r0 = r9
            if (r0 == 0) goto L31
            r0 = r9
            int r0 = r0.length
            if (r0 <= 0) goto L31
            r0 = r6
            r1 = r9
            r2 = 0
            r1 = r1[r2]
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            r0.onBufferedAmountChange(r1)
            goto L88
        L31:
            java.lang.String r0 = "onStateChange"
            r1 = r10
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L44
            r0 = r6
            r0.onStateChange()
            goto L88
        L44:
            java.lang.String r0 = "onMessage"
            r1 = r10
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L88
            r0 = r9
            if (r0 == 0) goto L88
            r0 = r9
            int r0 = r0.length
            if (r0 <= 0) goto L88
            r0 = r9
            r1 = 0
            r0 = r0[r1]
            r11 = r0
            r0 = r11
            java.lang.String r1 = "data"
            java.lang.Object r0 = dev.onvoid.webrtc.AndroidWebRtcBridge.getField(r0, r1)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r12 = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1 = r11
            java.lang.String r2 = "binary"
            java.lang.Object r1 = dev.onvoid.webrtc.AndroidWebRtcBridge.getField(r1, r2)
            boolean r0 = r0.equals(r1)
            r13 = r0
            r0 = r6
            dev.onvoid.webrtc.RTCDataChannelBuffer r1 = new dev.onvoid.webrtc.RTCDataChannelBuffer
            r2 = r1
            r3 = r12
            r4 = r13
            r2.<init>(r3, r4)
            r0.onMessage(r1)
        L88:
            r0 = 0
            return r0
    }
}
