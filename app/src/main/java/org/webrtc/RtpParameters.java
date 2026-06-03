package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/RtpParameters.class */
public class RtpParameters {
    public final java.lang.String transactionId;

    @androidx.annotation.Nullable
    public org.webrtc.RtpParameters.DegradationPreference degradationPreference;
    private final org.webrtc.RtpParameters.Rtcp rtcp;
    private final java.util.List<org.webrtc.RtpParameters.HeaderExtension> headerExtensions;
    public final java.util.List<org.webrtc.RtpParameters.Encoding> encodings;
    public final java.util.List<org.webrtc.RtpParameters.Codec> codecs;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/RtpParameters$Codec.class */
    public static class Codec {
        public int payloadType;
        public java.lang.String name;
        org.webrtc.MediaStreamTrack.MediaType kind;
        public java.lang.Integer clockRate;
        public java.lang.Integer numChannels;
        public java.util.Map<java.lang.String, java.lang.String> parameters;

        @org.webrtc.CalledByNative("Codec")
        Codec(int r4, java.lang.String r5, org.webrtc.MediaStreamTrack.MediaType r6, java.lang.Integer r7, java.lang.Integer r8, java.util.Map<java.lang.String, java.lang.String> r9) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.payloadType = r1
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
                r1 = r9
                r0.parameters = r1
                return
        }

        @org.webrtc.CalledByNative("Codec")
        int getPayloadType() {
                r2 = this;
                r0 = r2
                int r0 = r0.payloadType
                return r0
        }

        @org.webrtc.CalledByNative("Codec")
        java.lang.String getName() {
                r2 = this;
                r0 = r2
                java.lang.String r0 = r0.name
                return r0
        }

        @org.webrtc.CalledByNative("Codec")
        org.webrtc.MediaStreamTrack.MediaType getKind() {
                r2 = this;
                r0 = r2
                org.webrtc.MediaStreamTrack$MediaType r0 = r0.kind
                return r0
        }

        @org.webrtc.CalledByNative("Codec")
        java.lang.Integer getClockRate() {
                r2 = this;
                r0 = r2
                java.lang.Integer r0 = r0.clockRate
                return r0
        }

        @org.webrtc.CalledByNative("Codec")
        java.lang.Integer getNumChannels() {
                r2 = this;
                r0 = r2
                java.lang.Integer r0 = r0.numChannels
                return r0
        }

        @org.webrtc.CalledByNative("Codec")
        java.util.Map getParameters() {
                r2 = this;
                r0 = r2
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.parameters
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/RtpParameters$DegradationPreference.class */
    public enum DegradationPreference extends java.lang.Enum<org.webrtc.RtpParameters.DegradationPreference> {
        public static final org.webrtc.RtpParameters.DegradationPreference DISABLED = null;
        public static final org.webrtc.RtpParameters.DegradationPreference MAINTAIN_FRAMERATE = null;
        public static final org.webrtc.RtpParameters.DegradationPreference MAINTAIN_RESOLUTION = null;
        public static final org.webrtc.RtpParameters.DegradationPreference BALANCED = null;
        private static final /* synthetic */ org.webrtc.RtpParameters.DegradationPreference[] $VALUES = null;

        public static org.webrtc.RtpParameters.DegradationPreference[] values() {
                org.webrtc.RtpParameters$DegradationPreference[] r0 = org.webrtc.RtpParameters.DegradationPreference.$VALUES
                java.lang.Object r0 = r0.clone()
                org.webrtc.RtpParameters$DegradationPreference[] r0 = (org.webrtc.RtpParameters.DegradationPreference[]) r0
                return r0
        }

        public static org.webrtc.RtpParameters.DegradationPreference valueOf(java.lang.String r3) {
                java.lang.Class<org.webrtc.RtpParameters$DegradationPreference> r0 = org.webrtc.RtpParameters.DegradationPreference.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                org.webrtc.RtpParameters$DegradationPreference r0 = (org.webrtc.RtpParameters.DegradationPreference) r0
                return r0
        }

        DegradationPreference(java.lang.String r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        @org.webrtc.CalledByNative("DegradationPreference")
        static org.webrtc.RtpParameters.DegradationPreference fromNativeIndex(int r3) {
                org.webrtc.RtpParameters$DegradationPreference[] r0 = values()
                r1 = r3
                r0 = r0[r1]
                return r0
        }

        private static /* synthetic */ org.webrtc.RtpParameters.DegradationPreference[] $values() {
                r0 = 4
                org.webrtc.RtpParameters$DegradationPreference[] r0 = new org.webrtc.RtpParameters.DegradationPreference[r0]
                r1 = r0
                r2 = 0
                org.webrtc.RtpParameters$DegradationPreference r3 = org.webrtc.RtpParameters.DegradationPreference.DISABLED
                r1[r2] = r3
                r1 = r0
                r2 = 1
                org.webrtc.RtpParameters$DegradationPreference r3 = org.webrtc.RtpParameters.DegradationPreference.MAINTAIN_FRAMERATE
                r1[r2] = r3
                r1 = r0
                r2 = 2
                org.webrtc.RtpParameters$DegradationPreference r3 = org.webrtc.RtpParameters.DegradationPreference.MAINTAIN_RESOLUTION
                r1[r2] = r3
                r1 = r0
                r2 = 3
                org.webrtc.RtpParameters$DegradationPreference r3 = org.webrtc.RtpParameters.DegradationPreference.BALANCED
                r1[r2] = r3
                return r0
        }

        static {
                org.webrtc.RtpParameters$DegradationPreference r0 = new org.webrtc.RtpParameters$DegradationPreference
                r1 = r0
                java.lang.String r2 = "DISABLED"
                r3 = 0
                r1.<init>(r2, r3)
                org.webrtc.RtpParameters.DegradationPreference.DISABLED = r0
                org.webrtc.RtpParameters$DegradationPreference r0 = new org.webrtc.RtpParameters$DegradationPreference
                r1 = r0
                java.lang.String r2 = "MAINTAIN_FRAMERATE"
                r3 = 1
                r1.<init>(r2, r3)
                org.webrtc.RtpParameters.DegradationPreference.MAINTAIN_FRAMERATE = r0
                org.webrtc.RtpParameters$DegradationPreference r0 = new org.webrtc.RtpParameters$DegradationPreference
                r1 = r0
                java.lang.String r2 = "MAINTAIN_RESOLUTION"
                r3 = 2
                r1.<init>(r2, r3)
                org.webrtc.RtpParameters.DegradationPreference.MAINTAIN_RESOLUTION = r0
                org.webrtc.RtpParameters$DegradationPreference r0 = new org.webrtc.RtpParameters$DegradationPreference
                r1 = r0
                java.lang.String r2 = "BALANCED"
                r3 = 3
                r1.<init>(r2, r3)
                org.webrtc.RtpParameters.DegradationPreference.BALANCED = r0
                org.webrtc.RtpParameters$DegradationPreference[] r0 = $values()
                org.webrtc.RtpParameters.DegradationPreference.$VALUES = r0
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/RtpParameters$Encoding.class */
    public static class Encoding {

        @androidx.annotation.Nullable
        public java.lang.String rid;
        public boolean active;
        public double bitratePriority;
        public int networkPriority;

        @androidx.annotation.Nullable
        public java.lang.Integer maxBitrateBps;

        @androidx.annotation.Nullable
        public java.lang.Integer minBitrateBps;

        @androidx.annotation.Nullable
        public java.lang.Integer maxFramerate;

        @androidx.annotation.Nullable
        public java.lang.Integer numTemporalLayers;

        @androidx.annotation.Nullable
        public java.lang.Double scaleResolutionDownBy;
        public java.lang.Long ssrc;
        public boolean adaptiveAudioPacketTime;

        public Encoding(java.lang.String r5, boolean r6, java.lang.Double r7) {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                r1 = 1
                r0.active = r1
                r0 = r4
                r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                r0.bitratePriority = r1
                r0 = r4
                r1 = 1
                r0.networkPriority = r1
                r0 = r4
                r1 = r5
                r0.rid = r1
                r0 = r4
                r1 = r6
                r0.active = r1
                r0 = r4
                r1 = r7
                r0.scaleResolutionDownBy = r1
                return
        }

        @org.webrtc.CalledByNative("Encoding")
        Encoding(java.lang.String r5, boolean r6, double r7, int r9, java.lang.Integer r10, java.lang.Integer r11, java.lang.Integer r12, java.lang.Integer r13, java.lang.Double r14, java.lang.Long r15, boolean r16) {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                r1 = 1
                r0.active = r1
                r0 = r4
                r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                r0.bitratePriority = r1
                r0 = r4
                r1 = 1
                r0.networkPriority = r1
                r0 = r4
                r1 = r5
                r0.rid = r1
                r0 = r4
                r1 = r6
                r0.active = r1
                r0 = r4
                r1 = r7
                r0.bitratePriority = r1
                r0 = r4
                r1 = r9
                r0.networkPriority = r1
                r0 = r4
                r1 = r10
                r0.maxBitrateBps = r1
                r0 = r4
                r1 = r11
                r0.minBitrateBps = r1
                r0 = r4
                r1 = r12
                r0.maxFramerate = r1
                r0 = r4
                r1 = r13
                r0.numTemporalLayers = r1
                r0 = r4
                r1 = r14
                r0.scaleResolutionDownBy = r1
                r0 = r4
                r1 = r15
                r0.ssrc = r1
                r0 = r4
                r1 = r16
                r0.adaptiveAudioPacketTime = r1
                return
        }

        @androidx.annotation.Nullable
        @org.webrtc.CalledByNative("Encoding")
        java.lang.String getRid() {
                r2 = this;
                r0 = r2
                java.lang.String r0 = r0.rid
                return r0
        }

        @org.webrtc.CalledByNative("Encoding")
        boolean getActive() {
                r2 = this;
                r0 = r2
                boolean r0 = r0.active
                return r0
        }

        @org.webrtc.CalledByNative("Encoding")
        double getBitratePriority() {
                r3 = this;
                r0 = r3
                double r0 = r0.bitratePriority
                return r0
        }

        @org.webrtc.CalledByNative("Encoding")
        int getNetworkPriority() {
                r2 = this;
                r0 = r2
                int r0 = r0.networkPriority
                return r0
        }

        @androidx.annotation.Nullable
        @org.webrtc.CalledByNative("Encoding")
        java.lang.Integer getMaxBitrateBps() {
                r2 = this;
                r0 = r2
                java.lang.Integer r0 = r0.maxBitrateBps
                return r0
        }

        @androidx.annotation.Nullable
        @org.webrtc.CalledByNative("Encoding")
        java.lang.Integer getMinBitrateBps() {
                r2 = this;
                r0 = r2
                java.lang.Integer r0 = r0.minBitrateBps
                return r0
        }

        @androidx.annotation.Nullable
        @org.webrtc.CalledByNative("Encoding")
        java.lang.Integer getMaxFramerate() {
                r2 = this;
                r0 = r2
                java.lang.Integer r0 = r0.maxFramerate
                return r0
        }

        @androidx.annotation.Nullable
        @org.webrtc.CalledByNative("Encoding")
        java.lang.Integer getNumTemporalLayers() {
                r2 = this;
                r0 = r2
                java.lang.Integer r0 = r0.numTemporalLayers
                return r0
        }

        @androidx.annotation.Nullable
        @org.webrtc.CalledByNative("Encoding")
        java.lang.Double getScaleResolutionDownBy() {
                r2 = this;
                r0 = r2
                java.lang.Double r0 = r0.scaleResolutionDownBy
                return r0
        }

        @org.webrtc.CalledByNative("Encoding")
        java.lang.Long getSsrc() {
                r2 = this;
                r0 = r2
                java.lang.Long r0 = r0.ssrc
                return r0
        }

        @org.webrtc.CalledByNative("Encoding")
        boolean getAdaptivePTime() {
                r2 = this;
                r0 = r2
                boolean r0 = r0.adaptiveAudioPacketTime
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/RtpParameters$HeaderExtension.class */
    public static class HeaderExtension {
        private final java.lang.String uri;
        private final int id;
        private final boolean encrypted;

        @org.webrtc.CalledByNative("HeaderExtension")
        HeaderExtension(java.lang.String r4, int r5, boolean r6) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.uri = r1
                r0 = r3
                r1 = r5
                r0.id = r1
                r0 = r3
                r1 = r6
                r0.encrypted = r1
                return
        }

        @org.webrtc.CalledByNative("HeaderExtension")
        public java.lang.String getUri() {
                r2 = this;
                r0 = r2
                java.lang.String r0 = r0.uri
                return r0
        }

        @org.webrtc.CalledByNative("HeaderExtension")
        public int getId() {
                r2 = this;
                r0 = r2
                int r0 = r0.id
                return r0
        }

        @org.webrtc.CalledByNative("HeaderExtension")
        public boolean getEncrypted() {
                r2 = this;
                r0 = r2
                boolean r0 = r0.encrypted
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/RtpParameters$Rtcp.class */
    public static class Rtcp {
        private final java.lang.String cname;
        private final boolean reducedSize;

        @org.webrtc.CalledByNative("Rtcp")
        Rtcp(java.lang.String r4, boolean r5) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.cname = r1
                r0 = r3
                r1 = r5
                r0.reducedSize = r1
                return
        }

        @org.webrtc.CalledByNative("Rtcp")
        public java.lang.String getCname() {
                r2 = this;
                r0 = r2
                java.lang.String r0 = r0.cname
                return r0
        }

        @org.webrtc.CalledByNative("Rtcp")
        public boolean getReducedSize() {
                r2 = this;
                r0 = r2
                boolean r0 = r0.reducedSize
                return r0
        }
    }

    @org.webrtc.CalledByNative
    RtpParameters(java.lang.String r4, org.webrtc.RtpParameters.DegradationPreference r5, org.webrtc.RtpParameters.Rtcp r6, java.util.List<org.webrtc.RtpParameters.HeaderExtension> r7, java.util.List<org.webrtc.RtpParameters.Encoding> r8, java.util.List<org.webrtc.RtpParameters.Codec> r9) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.transactionId = r1
            r0 = r3
            r1 = r5
            r0.degradationPreference = r1
            r0 = r3
            r1 = r6
            r0.rtcp = r1
            r0 = r3
            r1 = r7
            r0.headerExtensions = r1
            r0 = r3
            r1 = r8
            r0.encodings = r1
            r0 = r3
            r1 = r9
            r0.codecs = r1
            return
    }

    @org.webrtc.CalledByNative
    java.lang.String getTransactionId() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.transactionId
            return r0
    }

    @org.webrtc.CalledByNative
    org.webrtc.RtpParameters.DegradationPreference getDegradationPreference() {
            r2 = this;
            r0 = r2
            org.webrtc.RtpParameters$DegradationPreference r0 = r0.degradationPreference
            return r0
    }

    @org.webrtc.CalledByNative
    public org.webrtc.RtpParameters.Rtcp getRtcp() {
            r2 = this;
            r0 = r2
            org.webrtc.RtpParameters$Rtcp r0 = r0.rtcp
            return r0
    }

    @org.webrtc.CalledByNative
    public java.util.List<org.webrtc.RtpParameters.HeaderExtension> getHeaderExtensions() {
            r2 = this;
            r0 = r2
            java.util.List<org.webrtc.RtpParameters$HeaderExtension> r0 = r0.headerExtensions
            return r0
    }

    @org.webrtc.CalledByNative
    java.util.List<org.webrtc.RtpParameters.Encoding> getEncodings() {
            r2 = this;
            r0 = r2
            java.util.List<org.webrtc.RtpParameters$Encoding> r0 = r0.encodings
            return r0
    }

    @org.webrtc.CalledByNative
    java.util.List<org.webrtc.RtpParameters.Codec> getCodecs() {
            r2 = this;
            r0 = r2
            java.util.List<org.webrtc.RtpParameters$Codec> r0 = r0.codecs
            return r0
    }
}
