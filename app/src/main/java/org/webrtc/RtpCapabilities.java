package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/RtpCapabilities.class */
public class RtpCapabilities {
    public java.util.List<org.webrtc.RtpCapabilities.CodecCapability> codecs;
    public java.util.List<org.webrtc.RtpCapabilities.HeaderExtensionCapability> headerExtensions;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/RtpCapabilities$CodecCapability.class */
    public static class CodecCapability {
        public int preferredPayloadType;
        public java.lang.String name;
        public org.webrtc.MediaStreamTrack.MediaType kind;
        public java.lang.Integer clockRate;
        public java.lang.Integer numChannels;
        public java.util.Map<java.lang.String, java.lang.String> parameters;
        public java.lang.String mimeType;

        public CodecCapability() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @org.webrtc.CalledByNative("CodecCapability")
        CodecCapability(int r4, java.lang.String r5, org.webrtc.MediaStreamTrack.MediaType r6, java.lang.Integer r7, java.lang.Integer r8, java.lang.String r9, java.util.Map<java.lang.String, java.lang.String> r10) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.preferredPayloadType = r1
                r0 = r3
                r1 = r5
                r0.name = r1
                r0 = r3
                r1 = r6
                r0.kind = r1
                r0 = r3
                r1 = r7
                r0.clockRate = r1
                r0 = r3
                r1 = r8
                r0.numChannels = r1
                r0 = r3
                r1 = r10
                r0.parameters = r1
                r0 = r3
                r1 = r9
                r0.mimeType = r1
                return
        }

        @org.webrtc.CalledByNative("CodecCapability")
        int getPreferredPayloadType() {
                r2 = this;
                r0 = r2
                int r0 = r0.preferredPayloadType
                return r0
        }

        @org.webrtc.CalledByNative("CodecCapability")
        java.lang.String getName() {
                r2 = this;
                r0 = r2
                java.lang.String r0 = r0.name
                return r0
        }

        @org.webrtc.CalledByNative("CodecCapability")
        org.webrtc.MediaStreamTrack.MediaType getKind() {
                r2 = this;
                r0 = r2
                org.webrtc.MediaStreamTrack$MediaType r0 = r0.kind
                return r0
        }

        @org.webrtc.CalledByNative("CodecCapability")
        java.lang.Integer getClockRate() {
                r2 = this;
                r0 = r2
                java.lang.Integer r0 = r0.clockRate
                return r0
        }

        @org.webrtc.CalledByNative("CodecCapability")
        java.lang.Integer getNumChannels() {
                r2 = this;
                r0 = r2
                java.lang.Integer r0 = r0.numChannels
                return r0
        }

        @org.webrtc.CalledByNative("CodecCapability")
        java.util.Map getParameters() {
                r2 = this;
                r0 = r2
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.parameters
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/RtpCapabilities$HeaderExtensionCapability.class */
    public static class HeaderExtensionCapability {
        private final java.lang.String uri;
        private final int preferredId;
        private final boolean preferredEncrypted;

        @org.webrtc.CalledByNative("HeaderExtensionCapability")
        HeaderExtensionCapability(java.lang.String r4, int r5, boolean r6) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.uri = r1
                r0 = r3
                r1 = r5
                r0.preferredId = r1
                r0 = r3
                r1 = r6
                r0.preferredEncrypted = r1
                return
        }

        @org.webrtc.CalledByNative("HeaderExtensionCapability")
        public java.lang.String getUri() {
                r2 = this;
                r0 = r2
                java.lang.String r0 = r0.uri
                return r0
        }

        @org.webrtc.CalledByNative("HeaderExtensionCapability")
        public int getPreferredId() {
                r2 = this;
                r0 = r2
                int r0 = r0.preferredId
                return r0
        }

        @org.webrtc.CalledByNative("HeaderExtensionCapability")
        public boolean getPreferredEncrypted() {
                r2 = this;
                r0 = r2
                boolean r0 = r0.preferredEncrypted
                return r0
        }
    }

    @org.webrtc.CalledByNative
    RtpCapabilities(java.util.List<org.webrtc.RtpCapabilities.CodecCapability> r4, java.util.List<org.webrtc.RtpCapabilities.HeaderExtensionCapability> r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r5
            r0.headerExtensions = r1
            r0 = r3
            r1 = r4
            r0.codecs = r1
            return
    }

    @org.webrtc.CalledByNative
    public java.util.List<org.webrtc.RtpCapabilities.HeaderExtensionCapability> getHeaderExtensions() {
            r2 = this;
            r0 = r2
            java.util.List<org.webrtc.RtpCapabilities$HeaderExtensionCapability> r0 = r0.headerExtensions
            return r0
    }

    @org.webrtc.CalledByNative
    java.util.List<org.webrtc.RtpCapabilities.CodecCapability> getCodecs() {
            r2 = this;
            r0 = r2
            java.util.List<org.webrtc.RtpCapabilities$CodecCapability> r0 = r0.codecs
            return r0
    }
}
