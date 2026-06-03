package dev.onvoid.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/droidbridge-devonvoid-android-webrtc-bridge.jar:dev/onvoid/webrtc/PeerConnectionFactory.class */
public class PeerConnectionFactory extends dev.onvoid.webrtc.internal.DisposableNativeObject {
    private java.lang.Object delegate;

    public PeerConnectionFactory() {
            r4 = this;
            r0 = r4
            r1 = 0
            r2 = 0
            r0.<init>(r1, r2)
            return
    }

    public PeerConnectionFactory(dev.onvoid.webrtc.media.audio.AudioProcessing r5) {
            r4 = this;
            r0 = r4
            r1 = 0
            r2 = r5
            r0.<init>(r1, r2)
            return
    }

    public PeerConnectionFactory(dev.onvoid.webrtc.media.audio.AudioDeviceModuleBase r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 0
            r0.<init>(r1, r2)
            return
    }

    public PeerConnectionFactory(dev.onvoid.webrtc.media.audio.AudioDeviceModuleBase r4, dev.onvoid.webrtc.media.audio.AudioProcessing r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            java.lang.Object r1 = dev.onvoid.webrtc.AndroidWebRtcBridge.createFactory()
            r0.delegate = r1
            return
    }

    public dev.onvoid.webrtc.RTCPeerConnection createPeerConnection(dev.onvoid.webrtc.RTCConfiguration r8, dev.onvoid.webrtc.PeerConnectionObserver r9) {
            r7 = this;
            r0 = r8
            java.lang.Object r0 = dev.onvoid.webrtc.AndroidWebRtcBridge.createRtcConfig(r0)     // Catch: java.lang.Throwable -> L45
            r10 = r0
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L45
            r11 = r0
            r0 = r9
            r1 = r11
            java.lang.Object r0 = dev.onvoid.webrtc.AndroidWebRtcBridge.createObserverProxy(r0, r1)     // Catch: java.lang.Throwable -> L45
            r12 = r0
            r0 = r7
            java.lang.Object r0 = r0.delegate     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = "createPeerConnection"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L45
            r3 = r2
            r4 = 0
            r5 = r10
            r3[r4] = r5     // Catch: java.lang.Throwable -> L45
            r3 = r2
            r4 = 1
            r5 = r12
            r3[r4] = r5     // Catch: java.lang.Throwable -> L45
            java.lang.Object r0 = dev.onvoid.webrtc.AndroidWebRtcBridge.invoke(r0, r1, r2)     // Catch: java.lang.Throwable -> L45
            r13 = r0
            r0 = r11
            r1 = 0
            r2 = r13
            r0[r1] = r2     // Catch: java.lang.Throwable -> L45
            r0 = r13
            if (r0 == 0) goto L43
            dev.onvoid.webrtc.RTCPeerConnection r0 = new dev.onvoid.webrtc.RTCPeerConnection     // Catch: java.lang.Throwable -> L45
            r1 = r0
            r2 = r13
            r3 = r9
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L45
            goto L44
        L43:
            r0 = 0
        L44:
            return r0
        L45:
            r10 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "DroidBridge Android WebRTC createPeerConnection failed"
            r3 = r10
            java.lang.Throwable r3 = dev.onvoid.webrtc.AndroidWebRtcBridge.unwrap(r3)
            r1.<init>(r2, r3)
            throw r0
    }

    public dev.onvoid.webrtc.media.audio.AudioTrackSource createAudioSource(dev.onvoid.webrtc.media.audio.AudioOptions r5) {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Audio tracks are not implemented in DroidBridge WebRTC bridge yet"
            r1.<init>(r2)
            throw r0
    }

    public dev.onvoid.webrtc.media.audio.AudioTrack createAudioTrack(java.lang.String r5, dev.onvoid.webrtc.media.audio.AudioTrackSource r6) {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Audio tracks are not implemented in DroidBridge WebRTC bridge yet"
            r1.<init>(r2)
            throw r0
    }

    public dev.onvoid.webrtc.media.video.VideoTrack createVideoTrack(java.lang.String r5, dev.onvoid.webrtc.media.video.VideoTrackSource r6) {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Video tracks are not implemented in DroidBridge WebRTC bridge yet"
            r1.<init>(r2)
            throw r0
    }

    public dev.onvoid.webrtc.RTCRtpCapabilities getRtpReceiverCapabilities(dev.onvoid.webrtc.media.MediaType r3) {
            r2 = this;
            r0 = 0
            return r0
    }

    public dev.onvoid.webrtc.RTCRtpCapabilities getRtpSenderCapabilities(dev.onvoid.webrtc.media.MediaType r3) {
            r2 = this;
            r0 = 0
            return r0
    }

    public void dispose() {
            r4 = this;
            r0 = r4
            java.lang.Object r0 = r0.delegate     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = "dispose"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L19
            java.lang.Object r0 = dev.onvoid.webrtc.AndroidWebRtcBridge.invoke(r0, r1, r2)     // Catch: java.lang.Throwable -> L19
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = "[DroidBridgeWebRTC] disposed PeerConnectionFactory"
            r0.println(r1)     // Catch: java.lang.Throwable -> L19
            goto L1a
        L19:
            r5 = move-exception
        L1a:
            return
    }
}
