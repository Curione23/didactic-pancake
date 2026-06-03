package dev.onvoid.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/droidbridge-devonvoid-android-webrtc-bridge.jar:dev/onvoid/webrtc/RTCPeerConnection.class */
public class RTCPeerConnection extends dev.onvoid.webrtc.internal.NativeObject {
    final java.lang.Object delegate;
    final dev.onvoid.webrtc.PeerConnectionObserver observer;
    private final java.util.Set<dev.onvoid.webrtc.RTCDataChannel> dataChannels;
    private final java.util.concurrent.atomic.AtomicBoolean closed;

    RTCPeerConnection(java.lang.Object r6, dev.onvoid.webrtc.PeerConnectionObserver r7) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r2 = r1
            r2.<init>()
            java.util.Set r1 = java.util.Collections.newSetFromMap(r1)
            r0.dataChannels = r1
            r0 = r5
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r2 = r1
            r3 = 0
            r2.<init>(r3)
            r0.closed = r1
            r0 = r5
            r1 = r6
            r0.delegate = r1
            r0 = r5
            r1 = r7
            r0.observer = r1
            return
    }

    public dev.onvoid.webrtc.RTCRtpSender[] getSenders() {
            r2 = this;
            r0 = 0
            dev.onvoid.webrtc.RTCRtpSender[] r0 = new dev.onvoid.webrtc.RTCRtpSender[r0]
            return r0
    }

    public dev.onvoid.webrtc.RTCRtpReceiver[] getReceivers() {
            r2 = this;
            r0 = 0
            dev.onvoid.webrtc.RTCRtpReceiver[] r0 = new dev.onvoid.webrtc.RTCRtpReceiver[r0]
            return r0
    }

    public dev.onvoid.webrtc.RTCRtpTransceiver[] getTransceivers() {
            r2 = this;
            r0 = 0
            dev.onvoid.webrtc.RTCRtpTransceiver[] r0 = new dev.onvoid.webrtc.RTCRtpTransceiver[r0]
            return r0
    }

    public dev.onvoid.webrtc.RTCRtpSender addTrack(dev.onvoid.webrtc.media.MediaStreamTrack r5, java.util.List<java.lang.String> r6) {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Tracks are not implemented in DroidBridge WebRTC bridge yet"
            r1.<init>(r2)
            throw r0
    }

    public void removeTrack(dev.onvoid.webrtc.RTCRtpSender r2) {
            r1 = this;
            return
    }

    public dev.onvoid.webrtc.RTCRtpTransceiver addTransceiver(dev.onvoid.webrtc.media.MediaStreamTrack r5, dev.onvoid.webrtc.RTCRtpTransceiverInit r6) {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Tracks are not implemented in DroidBridge WebRTC bridge yet"
            r1.<init>(r2)
            throw r0
    }

    public dev.onvoid.webrtc.RTCDataChannel createDataChannel(java.lang.String r10, dev.onvoid.webrtc.RTCDataChannelInit r11) {
            r9 = this;
            dev.onvoid.webrtc.RTCDataChannel r0 = new dev.onvoid.webrtc.RTCDataChannel     // Catch: java.lang.Throwable -> L2d
            r1 = r0
            r2 = r9
            java.lang.Object r2 = r2.delegate     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = "createDataChannel"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L2d
            r5 = r4
            r6 = 0
            r7 = r10
            r5[r6] = r7     // Catch: java.lang.Throwable -> L2d
            r5 = r4
            r6 = 1
            r7 = r11
            java.lang.Object r7 = dev.onvoid.webrtc.AndroidWebRtcBridge.toDataChannelInit(r7)     // Catch: java.lang.Throwable -> L2d
            r5[r6] = r7     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r2 = dev.onvoid.webrtc.AndroidWebRtcBridge.invoke(r2, r3, r4)     // Catch: java.lang.Throwable -> L2d
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2d
            r12 = r0
            r0 = r9
            java.util.Set<dev.onvoid.webrtc.RTCDataChannel> r0 = r0.dataChannels     // Catch: java.lang.Throwable -> L2d
            r1 = r12
            boolean r0 = r0.add(r1)     // Catch: java.lang.Throwable -> L2d
            r0 = r12
            return r0
        L2d:
            r12 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "createDataChannel failed"
            r3 = r12
            java.lang.Throwable r3 = dev.onvoid.webrtc.AndroidWebRtcBridge.unwrap(r3)
            r1.<init>(r2, r3)
            throw r0
    }

    public void createOffer(dev.onvoid.webrtc.RTCOfferOptions r9, dev.onvoid.webrtc.CreateSessionDescriptionObserver r10) {
            r8 = this;
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L47
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47
            r2 = r1
            r2.<init>()     // Catch: java.lang.Throwable -> L47
            java.lang.String r2 = "[DroidBridgeWebRTC] createOffer iceRestart="
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L47
            r2 = r9
            if (r2 == 0) goto L1e
            r2 = r9
            boolean r2 = r2.iceRestart     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto L1e
            r2 = 1
            goto L1f
        L1e:
            r2 = 0
        L1f:
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L47
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L47
            r0.println(r1)     // Catch: java.lang.Throwable -> L47
            r0 = r8
            java.lang.Object r0 = r0.delegate     // Catch: java.lang.Throwable -> L47
            java.lang.String r1 = "createOffer"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L47
            r3 = r2
            r4 = 0
            r5 = r10
            r6 = 0
            java.lang.Object r5 = dev.onvoid.webrtc.AndroidWebRtcBridge.createSdpObserver(r5, r6)     // Catch: java.lang.Throwable -> L47
            r3[r4] = r5     // Catch: java.lang.Throwable -> L47
            r3 = r2
            r4 = 1
            java.lang.Object r5 = dev.onvoid.webrtc.AndroidWebRtcBridge.mediaConstraints()     // Catch: java.lang.Throwable -> L47
            r3[r4] = r5     // Catch: java.lang.Throwable -> L47
            java.lang.Object r0 = dev.onvoid.webrtc.AndroidWebRtcBridge.invoke(r0, r1, r2)     // Catch: java.lang.Throwable -> L47
            goto L55
        L47:
            r11 = move-exception
            r0 = r10
            r1 = r11
            java.lang.Throwable r1 = dev.onvoid.webrtc.AndroidWebRtcBridge.unwrap(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.onFailure(r1)
        L55:
            return
    }

    public void createAnswer(dev.onvoid.webrtc.RTCAnswerOptions r9, dev.onvoid.webrtc.CreateSessionDescriptionObserver r10) {
            r8 = this;
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = "[DroidBridgeWebRTC] createAnswer"
            r0.println(r1)     // Catch: java.lang.Throwable -> L27
            r0 = r8
            java.lang.Object r0 = r0.delegate     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = "createAnswer"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L27
            r3 = r2
            r4 = 0
            r5 = r10
            r6 = 0
            java.lang.Object r5 = dev.onvoid.webrtc.AndroidWebRtcBridge.createSdpObserver(r5, r6)     // Catch: java.lang.Throwable -> L27
            r3[r4] = r5     // Catch: java.lang.Throwable -> L27
            r3 = r2
            r4 = 1
            java.lang.Object r5 = dev.onvoid.webrtc.AndroidWebRtcBridge.mediaConstraints()     // Catch: java.lang.Throwable -> L27
            r3[r4] = r5     // Catch: java.lang.Throwable -> L27
            java.lang.Object r0 = dev.onvoid.webrtc.AndroidWebRtcBridge.invoke(r0, r1, r2)     // Catch: java.lang.Throwable -> L27
            goto L35
        L27:
            r11 = move-exception
            r0 = r10
            r1 = r11
            java.lang.Throwable r1 = dev.onvoid.webrtc.AndroidWebRtcBridge.unwrap(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.onFailure(r1)
        L35:
            return
    }

    public dev.onvoid.webrtc.RTCSessionDescription getCurrentLocalDescription() {
            r2 = this;
            r0 = r2
            dev.onvoid.webrtc.RTCSessionDescription r0 = r0.getLocalDescription()
            return r0
    }

    public dev.onvoid.webrtc.RTCSessionDescription getLocalDescription() {
            r3 = this;
            r0 = r3
            java.lang.String r1 = "getLocalDescription"
            dev.onvoid.webrtc.RTCSessionDescription r0 = r0.getDescription(r1)
            return r0
    }

    public dev.onvoid.webrtc.RTCSessionDescription getPendingLocalDescription() {
            r2 = this;
            r0 = r2
            dev.onvoid.webrtc.RTCSessionDescription r0 = r0.getLocalDescription()
            return r0
    }

    public dev.onvoid.webrtc.RTCSessionDescription getCurrentRemoteDescription() {
            r2 = this;
            r0 = r2
            dev.onvoid.webrtc.RTCSessionDescription r0 = r0.getRemoteDescription()
            return r0
    }

    public dev.onvoid.webrtc.RTCSessionDescription getRemoteDescription() {
            r3 = this;
            r0 = r3
            java.lang.String r1 = "getRemoteDescription"
            dev.onvoid.webrtc.RTCSessionDescription r0 = r0.getDescription(r1)
            return r0
    }

    public dev.onvoid.webrtc.RTCSessionDescription getPendingRemoteDescription() {
            r2 = this;
            r0 = r2
            dev.onvoid.webrtc.RTCSessionDescription r0 = r0.getRemoteDescription()
            return r0
    }

    private dev.onvoid.webrtc.RTCSessionDescription getDescription(java.lang.String r5) {
            r4 = this;
            r0 = r4
            java.lang.Object r0 = r0.delegate     // Catch: java.lang.Throwable -> L1a
            r1 = r5
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r0 = dev.onvoid.webrtc.AndroidWebRtcBridge.invoke(r0, r1, r2)     // Catch: java.lang.Throwable -> L1a
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L18
            r0 = r6
            dev.onvoid.webrtc.RTCSessionDescription r0 = dev.onvoid.webrtc.AndroidWebRtcBridge.fromAndroidSdp(r0)     // Catch: java.lang.Throwable -> L1a
            goto L19
        L18:
            r0 = 0
        L19:
            return r0
        L1a:
            r6 = move-exception
            r0 = 0
            return r0
    }

    public void setLocalDescription(dev.onvoid.webrtc.RTCSessionDescription r6, dev.onvoid.webrtc.SetSessionDescriptionObserver r7) {
            r5 = this;
            r0 = r5
            java.lang.String r1 = "setLocalDescription"
            r2 = r6
            r3 = r7
            r0.setDescription(r1, r2, r3)
            return
    }

    public void setRemoteDescription(dev.onvoid.webrtc.RTCSessionDescription r6, dev.onvoid.webrtc.SetSessionDescriptionObserver r7) {
            r5 = this;
            r0 = r5
            java.lang.String r1 = "setRemoteDescription"
            r2 = r6
            r3 = r7
            r0.setDescription(r1, r2, r3)
            return
    }

    private void setDescription(java.lang.String r9, dev.onvoid.webrtc.RTCSessionDescription r10, dev.onvoid.webrtc.SetSessionDescriptionObserver r11) {
            r8 = this;
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L44
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            r2 = r1
            r2.<init>()     // Catch: java.lang.Throwable -> L44
            java.lang.String r2 = "[DroidBridgeWebRTC] "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L44
            r2 = r9
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L44
            java.lang.String r2 = " "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L44
            r2 = r10
            java.lang.String r2 = dev.onvoid.webrtc.AndroidWebRtcBridge.sdpSummary(r2)     // Catch: java.lang.Throwable -> L44
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L44
            r0.println(r1)     // Catch: java.lang.Throwable -> L44
            r0 = r8
            java.lang.Object r0 = r0.delegate     // Catch: java.lang.Throwable -> L44
            r1 = r9
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L44
            r3 = r2
            r4 = 0
            r5 = 0
            r6 = r11
            java.lang.Object r5 = dev.onvoid.webrtc.AndroidWebRtcBridge.createSdpObserver(r5, r6)     // Catch: java.lang.Throwable -> L44
            r3[r4] = r5     // Catch: java.lang.Throwable -> L44
            r3 = r2
            r4 = 1
            r5 = r10
            java.lang.Object r5 = dev.onvoid.webrtc.AndroidWebRtcBridge.toAndroidSdp(r5)     // Catch: java.lang.Throwable -> L44
            r3[r4] = r5     // Catch: java.lang.Throwable -> L44
            java.lang.Object r0 = dev.onvoid.webrtc.AndroidWebRtcBridge.invoke(r0, r1, r2)     // Catch: java.lang.Throwable -> L44
            goto L7b
        L44:
            r12 = move-exception
            r0 = r12
            java.lang.Throwable r0 = dev.onvoid.webrtc.AndroidWebRtcBridge.unwrap(r0)
            r13 = r0
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "[DroidBridgeWebRTC] "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r9
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " failed: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r13
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r0 = r11
            r1 = r13
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.onFailure(r1)
        L7b:
            return
    }

    public void addIceCandidate(dev.onvoid.webrtc.RTCIceCandidate r8) {
            r7 = this;
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L83
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83
            r2 = r1
            r2.<init>()     // Catch: java.lang.Throwable -> L83
            java.lang.String r2 = "[DroidBridgeWebRTC] addIceCandidate mid="
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L83
            r2 = r8
            if (r2 == 0) goto L1a
            r2 = r8
            java.lang.String r2 = r2.sdpMid     // Catch: java.lang.Throwable -> L83
            goto L1b
        L1a:
            r2 = 0
        L1b:
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L83
            java.lang.String r2 = " index="
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L83
            r2 = r8
            if (r2 == 0) goto L2e
            r2 = r8
            int r2 = r2.sdpMLineIndex     // Catch: java.lang.Throwable -> L83
            goto L2f
        L2e:
            r2 = -1
        L2f:
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L83
            java.lang.String r2 = " sdp="
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L83
            r2 = r8
            if (r2 == 0) goto L42
            r2 = r8
            java.lang.String r2 = r2.sdp     // Catch: java.lang.Throwable -> L83
            goto L43
        L42:
            r2 = 0
        L43:
            r3 = 180(0xb4, float:2.52E-43)
            java.lang.String r2 = dev.onvoid.webrtc.AndroidWebRtcBridge.abbreviate(r2, r3)     // Catch: java.lang.Throwable -> L83
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L83
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L83
            r0.println(r1)     // Catch: java.lang.Throwable -> L83
            r0 = r7
            java.lang.Object r0 = r0.delegate     // Catch: java.lang.Throwable -> L83
            java.lang.String r1 = "addIceCandidate"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L83
            r3 = r2
            r4 = 0
            r5 = r8
            java.lang.Object r5 = dev.onvoid.webrtc.AndroidWebRtcBridge.toAndroidIce(r5)     // Catch: java.lang.Throwable -> L83
            r3[r4] = r5     // Catch: java.lang.Throwable -> L83
            java.lang.Object r0 = dev.onvoid.webrtc.AndroidWebRtcBridge.invoke(r0, r1, r2)     // Catch: java.lang.Throwable -> L83
            r9 = r0
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L83
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83
            r2 = r1
            r2.<init>()     // Catch: java.lang.Throwable -> L83
            java.lang.String r2 = "[DroidBridgeWebRTC] addIceCandidate result="
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L83
            r2 = r9
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L83
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L83
            r0.println(r1)     // Catch: java.lang.Throwable -> L83
            goto La0
        L83:
            r9 = move-exception
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "[DroidBridgeWebRTC] addIceCandidate failed: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r9
            java.lang.Throwable r2 = dev.onvoid.webrtc.AndroidWebRtcBridge.unwrap(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
        La0:
            return
    }

    public void removeIceCandidates(dev.onvoid.webrtc.RTCIceCandidate[] r2) {
            r1 = this;
            return
    }

    public dev.onvoid.webrtc.RTCSignalingState getSignalingState() {
            r5 = this;
            r0 = r5
            java.lang.Class<dev.onvoid.webrtc.RTCSignalingState> r1 = dev.onvoid.webrtc.RTCSignalingState.class
            java.lang.String r2 = "signalingState"
            dev.onvoid.webrtc.RTCSignalingState r3 = dev.onvoid.webrtc.RTCSignalingState.STABLE
            java.lang.Enum r0 = r0.stateCall(r1, r2, r3)
            dev.onvoid.webrtc.RTCSignalingState r0 = (dev.onvoid.webrtc.RTCSignalingState) r0
            return r0
    }

    public dev.onvoid.webrtc.RTCIceGatheringState getIceGatheringState() {
            r5 = this;
            r0 = r5
            java.lang.Class<dev.onvoid.webrtc.RTCIceGatheringState> r1 = dev.onvoid.webrtc.RTCIceGatheringState.class
            java.lang.String r2 = "iceGatheringState"
            dev.onvoid.webrtc.RTCIceGatheringState r3 = dev.onvoid.webrtc.RTCIceGatheringState.NEW
            java.lang.Enum r0 = r0.stateCall(r1, r2, r3)
            dev.onvoid.webrtc.RTCIceGatheringState r0 = (dev.onvoid.webrtc.RTCIceGatheringState) r0
            return r0
    }

    public dev.onvoid.webrtc.RTCIceConnectionState getIceConnectionState() {
            r5 = this;
            r0 = r5
            java.lang.Class<dev.onvoid.webrtc.RTCIceConnectionState> r1 = dev.onvoid.webrtc.RTCIceConnectionState.class
            java.lang.String r2 = "iceConnectionState"
            dev.onvoid.webrtc.RTCIceConnectionState r3 = dev.onvoid.webrtc.RTCIceConnectionState.NEW
            java.lang.Enum r0 = r0.stateCall(r1, r2, r3)
            dev.onvoid.webrtc.RTCIceConnectionState r0 = (dev.onvoid.webrtc.RTCIceConnectionState) r0
            return r0
    }

    public dev.onvoid.webrtc.RTCPeerConnectionState getConnectionState() {
            r5 = this;
            r0 = r5
            java.lang.Class<dev.onvoid.webrtc.RTCPeerConnectionState> r1 = dev.onvoid.webrtc.RTCPeerConnectionState.class
            java.lang.String r2 = "connectionState"
            dev.onvoid.webrtc.RTCPeerConnectionState r3 = dev.onvoid.webrtc.RTCPeerConnectionState.NEW
            java.lang.Enum r0 = r0.stateCall(r1, r2, r3)
            dev.onvoid.webrtc.RTCPeerConnectionState r0 = (dev.onvoid.webrtc.RTCPeerConnectionState) r0
            return r0
    }

    private <E extends java.lang.Enum<E>> E stateCall(java.lang.Class<E> r5, java.lang.String r6, E r7) {
            r4 = this;
            r0 = r4
            java.lang.Object r0 = r0.delegate     // Catch: java.lang.Throwable -> L20
            r1 = r6
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L20
            java.lang.Object r0 = dev.onvoid.webrtc.AndroidWebRtcBridge.invoke(r0, r1, r2)     // Catch: java.lang.Throwable -> L20
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L1d
            r0 = r5
            r1 = r8
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.Enum r0 = dev.onvoid.webrtc.AndroidWebRtcBridge.enumValue(r0, r1)     // Catch: java.lang.Throwable -> L20
            return r0
        L1d:
            goto L22
        L20:
            r8 = move-exception
        L22:
            r0 = r7
            return r0
    }

    public dev.onvoid.webrtc.RTCConfiguration getConfiguration() {
            r3 = this;
            dev.onvoid.webrtc.RTCConfiguration r0 = new dev.onvoid.webrtc.RTCConfiguration
            r1 = r0
            r1.<init>()
            return r0
    }

    public void setConfiguration(dev.onvoid.webrtc.RTCConfiguration r8) {
            r7 = this;
            r0 = r7
            java.lang.Object r0 = r0.delegate     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = "setConfiguration"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L19
            r3 = r2
            r4 = 0
            r5 = r8
            java.lang.Object r5 = dev.onvoid.webrtc.AndroidWebRtcBridge.createRtcConfig(r5)     // Catch: java.lang.Throwable -> L19
            r3[r4] = r5     // Catch: java.lang.Throwable -> L19
            java.lang.Object r0 = dev.onvoid.webrtc.AndroidWebRtcBridge.invoke(r0, r1, r2)     // Catch: java.lang.Throwable -> L19
            goto L1a
        L19:
            r9 = move-exception
        L1a:
            return
    }

    public void getStats(dev.onvoid.webrtc.RTCStatsCollectorCallback r4) {
            r3 = this;
            r0 = r4
            if (r0 == 0) goto Lb
            r0 = r4
            r1 = 0
            r0.onStatsDelivered(r1)
        Lb:
            return
    }

    public void getStats(dev.onvoid.webrtc.RTCRtpReceiver r4, dev.onvoid.webrtc.RTCStatsCollectorCallback r5) {
            r3 = this;
            r0 = r3
            r1 = r5
            r0.getStats(r1)
            return
    }

    public void getStats(dev.onvoid.webrtc.RTCRtpSender r4, dev.onvoid.webrtc.RTCStatsCollectorCallback r5) {
            r3 = this;
            r0 = r3
            r1 = r5
            r0.getStats(r1)
            return
    }

    public void restartIce() {
            r4 = this;
            r0 = r4
            java.lang.Object r0 = r0.delegate     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "restartIce"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = dev.onvoid.webrtc.AndroidWebRtcBridge.invoke(r0, r1, r2)     // Catch: java.lang.Throwable -> L12
            goto L13
        L12:
            r5 = move-exception
        L13:
            return
    }

    public void close() {
            r4 = this;
            r0 = r4
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.closed
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 != 0) goto Ld
            return
        Ld:
            r0 = r4
            java.util.Set<dev.onvoid.webrtc.RTCDataChannel> r0 = r0.dataChannels
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
        L17:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L35
            r0 = r5
            java.lang.Object r0 = r0.next()
            dev.onvoid.webrtc.RTCDataChannel r0 = (dev.onvoid.webrtc.RTCDataChannel) r0
            r6 = r0
            r0 = r6
            r0.dispose()     // Catch: java.lang.Throwable -> L31
            goto L32
        L31:
            r7 = move-exception
        L32:
            goto L17
        L35:
            r0 = r4
            java.util.Set<dev.onvoid.webrtc.RTCDataChannel> r0 = r0.dataChannels
            r0.clear()
            r0 = r4
            java.lang.Object r0 = r0.delegate
            dev.onvoid.webrtc.AndroidWebRtcBridge.safeDisposePeerConnection(r0)
            return
    }

    protected void finalize() throws java.lang.Throwable {
            r2 = this;
            r0 = r2
            r0.close()     // Catch: java.lang.Throwable -> Lb
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
}
