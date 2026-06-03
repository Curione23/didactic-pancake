package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/PeerConnection.class */
public class PeerConnection {
    private final java.util.List<org.webrtc.MediaStream> localStreams;
    private final long nativePeerConnection;
    private java.util.List<org.webrtc.RtpSender> senders;
    private java.util.List<org.webrtc.RtpReceiver> receivers;
    private java.util.List<org.webrtc.RtpTransceiver> transceivers;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/PeerConnection$AdapterType.class */
    public enum AdapterType extends java.lang.Enum<org.webrtc.PeerConnection.AdapterType> {
        public static final org.webrtc.PeerConnection.AdapterType UNKNOWN = null;
        public static final org.webrtc.PeerConnection.AdapterType ETHERNET = null;
        public static final org.webrtc.PeerConnection.AdapterType WIFI = null;
        public static final org.webrtc.PeerConnection.AdapterType CELLULAR = null;
        public static final org.webrtc.PeerConnection.AdapterType VPN = null;
        public static final org.webrtc.PeerConnection.AdapterType LOOPBACK = null;
        public static final org.webrtc.PeerConnection.AdapterType ADAPTER_TYPE_ANY = null;
        public static final org.webrtc.PeerConnection.AdapterType CELLULAR_2G = null;
        public static final org.webrtc.PeerConnection.AdapterType CELLULAR_3G = null;
        public static final org.webrtc.PeerConnection.AdapterType CELLULAR_4G = null;
        public static final org.webrtc.PeerConnection.AdapterType CELLULAR_5G = null;
        public final java.lang.Integer bitMask;
        private static final java.util.Map<java.lang.Integer, org.webrtc.PeerConnection.AdapterType> BY_BITMASK = null;
        private static final /* synthetic */ org.webrtc.PeerConnection.AdapterType[] $VALUES = null;

        public static org.webrtc.PeerConnection.AdapterType[] values() {
                org.webrtc.PeerConnection$AdapterType[] r0 = org.webrtc.PeerConnection.AdapterType.$VALUES
                java.lang.Object r0 = r0.clone()
                org.webrtc.PeerConnection$AdapterType[] r0 = (org.webrtc.PeerConnection.AdapterType[]) r0
                return r0
        }

        public static org.webrtc.PeerConnection.AdapterType valueOf(java.lang.String r3) {
                java.lang.Class<org.webrtc.PeerConnection$AdapterType> r0 = org.webrtc.PeerConnection.AdapterType.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                org.webrtc.PeerConnection$AdapterType r0 = (org.webrtc.PeerConnection.AdapterType) r0
                return r0
        }

        AdapterType(java.lang.String r5, int r6, java.lang.Integer r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                r0 = r4
                r1 = r7
                r0.bitMask = r1
                return
        }

        @androidx.annotation.Nullable
        @org.webrtc.CalledByNative("AdapterType")
        static org.webrtc.PeerConnection.AdapterType fromNativeIndex(int r3) {
                java.util.Map<java.lang.Integer, org.webrtc.PeerConnection$AdapterType> r0 = org.webrtc.PeerConnection.AdapterType.BY_BITMASK
                r1 = r3
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.Object r0 = r0.get(r1)
                org.webrtc.PeerConnection$AdapterType r0 = (org.webrtc.PeerConnection.AdapterType) r0
                return r0
        }

        private static /* synthetic */ org.webrtc.PeerConnection.AdapterType[] $values() {
                r0 = 11
                org.webrtc.PeerConnection$AdapterType[] r0 = new org.webrtc.PeerConnection.AdapterType[r0]
                r1 = r0
                r2 = 0
                org.webrtc.PeerConnection$AdapterType r3 = org.webrtc.PeerConnection.AdapterType.UNKNOWN
                r1[r2] = r3
                r1 = r0
                r2 = 1
                org.webrtc.PeerConnection$AdapterType r3 = org.webrtc.PeerConnection.AdapterType.ETHERNET
                r1[r2] = r3
                r1 = r0
                r2 = 2
                org.webrtc.PeerConnection$AdapterType r3 = org.webrtc.PeerConnection.AdapterType.WIFI
                r1[r2] = r3
                r1 = r0
                r2 = 3
                org.webrtc.PeerConnection$AdapterType r3 = org.webrtc.PeerConnection.AdapterType.CELLULAR
                r1[r2] = r3
                r1 = r0
                r2 = 4
                org.webrtc.PeerConnection$AdapterType r3 = org.webrtc.PeerConnection.AdapterType.VPN
                r1[r2] = r3
                r1 = r0
                r2 = 5
                org.webrtc.PeerConnection$AdapterType r3 = org.webrtc.PeerConnection.AdapterType.LOOPBACK
                r1[r2] = r3
                r1 = r0
                r2 = 6
                org.webrtc.PeerConnection$AdapterType r3 = org.webrtc.PeerConnection.AdapterType.ADAPTER_TYPE_ANY
                r1[r2] = r3
                r1 = r0
                r2 = 7
                org.webrtc.PeerConnection$AdapterType r3 = org.webrtc.PeerConnection.AdapterType.CELLULAR_2G
                r1[r2] = r3
                r1 = r0
                r2 = 8
                org.webrtc.PeerConnection$AdapterType r3 = org.webrtc.PeerConnection.AdapterType.CELLULAR_3G
                r1[r2] = r3
                r1 = r0
                r2 = 9
                org.webrtc.PeerConnection$AdapterType r3 = org.webrtc.PeerConnection.AdapterType.CELLULAR_4G
                r1[r2] = r3
                r1 = r0
                r2 = 10
                org.webrtc.PeerConnection$AdapterType r3 = org.webrtc.PeerConnection.AdapterType.CELLULAR_5G
                r1[r2] = r3
                return r0
        }

        static {
                org.webrtc.PeerConnection$AdapterType r0 = new org.webrtc.PeerConnection$AdapterType
                r1 = r0
                java.lang.String r2 = "UNKNOWN"
                r3 = 0
                r4 = 0
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r1.<init>(r2, r3, r4)
                org.webrtc.PeerConnection.AdapterType.UNKNOWN = r0
                org.webrtc.PeerConnection$AdapterType r0 = new org.webrtc.PeerConnection$AdapterType
                r1 = r0
                java.lang.String r2 = "ETHERNET"
                r3 = 1
                r4 = 1
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r1.<init>(r2, r3, r4)
                org.webrtc.PeerConnection.AdapterType.ETHERNET = r0
                org.webrtc.PeerConnection$AdapterType r0 = new org.webrtc.PeerConnection$AdapterType
                r1 = r0
                java.lang.String r2 = "WIFI"
                r3 = 2
                r4 = 2
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r1.<init>(r2, r3, r4)
                org.webrtc.PeerConnection.AdapterType.WIFI = r0
                org.webrtc.PeerConnection$AdapterType r0 = new org.webrtc.PeerConnection$AdapterType
                r1 = r0
                java.lang.String r2 = "CELLULAR"
                r3 = 3
                r4 = 4
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r1.<init>(r2, r3, r4)
                org.webrtc.PeerConnection.AdapterType.CELLULAR = r0
                org.webrtc.PeerConnection$AdapterType r0 = new org.webrtc.PeerConnection$AdapterType
                r1 = r0
                java.lang.String r2 = "VPN"
                r3 = 4
                r4 = 8
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r1.<init>(r2, r3, r4)
                org.webrtc.PeerConnection.AdapterType.VPN = r0
                org.webrtc.PeerConnection$AdapterType r0 = new org.webrtc.PeerConnection$AdapterType
                r1 = r0
                java.lang.String r2 = "LOOPBACK"
                r3 = 5
                r4 = 16
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r1.<init>(r2, r3, r4)
                org.webrtc.PeerConnection.AdapterType.LOOPBACK = r0
                org.webrtc.PeerConnection$AdapterType r0 = new org.webrtc.PeerConnection$AdapterType
                r1 = r0
                java.lang.String r2 = "ADAPTER_TYPE_ANY"
                r3 = 6
                r4 = 32
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r1.<init>(r2, r3, r4)
                org.webrtc.PeerConnection.AdapterType.ADAPTER_TYPE_ANY = r0
                org.webrtc.PeerConnection$AdapterType r0 = new org.webrtc.PeerConnection$AdapterType
                r1 = r0
                java.lang.String r2 = "CELLULAR_2G"
                r3 = 7
                r4 = 64
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r1.<init>(r2, r3, r4)
                org.webrtc.PeerConnection.AdapterType.CELLULAR_2G = r0
                org.webrtc.PeerConnection$AdapterType r0 = new org.webrtc.PeerConnection$AdapterType
                r1 = r0
                java.lang.String r2 = "CELLULAR_3G"
                r3 = 8
                r4 = 128(0x80, float:1.8E-43)
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r1.<init>(r2, r3, r4)
                org.webrtc.PeerConnection.AdapterType.CELLULAR_3G = r0
                org.webrtc.PeerConnection$AdapterType r0 = new org.webrtc.PeerConnection$AdapterType
                r1 = r0
                java.lang.String r2 = "CELLULAR_4G"
                r3 = 9
                r4 = 256(0x100, float:3.59E-43)
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r1.<init>(r2, r3, r4)
                org.webrtc.PeerConnection.AdapterType.CELLULAR_4G = r0
                org.webrtc.PeerConnection$AdapterType r0 = new org.webrtc.PeerConnection$AdapterType
                r1 = r0
                java.lang.String r2 = "CELLULAR_5G"
                r3 = 10
                r4 = 512(0x200, float:7.17E-43)
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r1.<init>(r2, r3, r4)
                org.webrtc.PeerConnection.AdapterType.CELLULAR_5G = r0
                org.webrtc.PeerConnection$AdapterType[] r0 = $values()
                org.webrtc.PeerConnection.AdapterType.$VALUES = r0
                java.util.HashMap r0 = new java.util.HashMap
                r1 = r0
                r1.<init>()
                org.webrtc.PeerConnection.AdapterType.BY_BITMASK = r0
                org.webrtc.PeerConnection$AdapterType[] r0 = values()
                r6 = r0
                r0 = r6
                int r0 = r0.length
                r7 = r0
                r0 = 0
                r8 = r0
            Le3:
                r0 = r8
                r1 = r7
                if (r0 >= r1) goto L100
                r0 = r6
                r1 = r8
                r0 = r0[r1]
                r9 = r0
                java.util.Map<java.lang.Integer, org.webrtc.PeerConnection$AdapterType> r0 = org.webrtc.PeerConnection.AdapterType.BY_BITMASK
                r1 = r9
                java.lang.Integer r1 = r1.bitMask
                r2 = r9
                java.lang.Object r0 = r0.put(r1, r2)
                int r8 = r8 + 1
                goto Le3
            L100:
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/PeerConnection$BundlePolicy.class */
    public enum BundlePolicy extends java.lang.Enum<org.webrtc.PeerConnection.BundlePolicy> {
        public static final org.webrtc.PeerConnection.BundlePolicy BALANCED = null;
        public static final org.webrtc.PeerConnection.BundlePolicy MAXBUNDLE = null;
        public static final org.webrtc.PeerConnection.BundlePolicy MAXCOMPAT = null;
        private static final /* synthetic */ org.webrtc.PeerConnection.BundlePolicy[] $VALUES = null;

        public static org.webrtc.PeerConnection.BundlePolicy[] values() {
                org.webrtc.PeerConnection$BundlePolicy[] r0 = org.webrtc.PeerConnection.BundlePolicy.$VALUES
                java.lang.Object r0 = r0.clone()
                org.webrtc.PeerConnection$BundlePolicy[] r0 = (org.webrtc.PeerConnection.BundlePolicy[]) r0
                return r0
        }

        public static org.webrtc.PeerConnection.BundlePolicy valueOf(java.lang.String r3) {
                java.lang.Class<org.webrtc.PeerConnection$BundlePolicy> r0 = org.webrtc.PeerConnection.BundlePolicy.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                org.webrtc.PeerConnection$BundlePolicy r0 = (org.webrtc.PeerConnection.BundlePolicy) r0
                return r0
        }

        BundlePolicy(java.lang.String r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        private static /* synthetic */ org.webrtc.PeerConnection.BundlePolicy[] $values() {
                r0 = 3
                org.webrtc.PeerConnection$BundlePolicy[] r0 = new org.webrtc.PeerConnection.BundlePolicy[r0]
                r1 = r0
                r2 = 0
                org.webrtc.PeerConnection$BundlePolicy r3 = org.webrtc.PeerConnection.BundlePolicy.BALANCED
                r1[r2] = r3
                r1 = r0
                r2 = 1
                org.webrtc.PeerConnection$BundlePolicy r3 = org.webrtc.PeerConnection.BundlePolicy.MAXBUNDLE
                r1[r2] = r3
                r1 = r0
                r2 = 2
                org.webrtc.PeerConnection$BundlePolicy r3 = org.webrtc.PeerConnection.BundlePolicy.MAXCOMPAT
                r1[r2] = r3
                return r0
        }

        static {
                org.webrtc.PeerConnection$BundlePolicy r0 = new org.webrtc.PeerConnection$BundlePolicy
                r1 = r0
                java.lang.String r2 = "BALANCED"
                r3 = 0
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.BundlePolicy.BALANCED = r0
                org.webrtc.PeerConnection$BundlePolicy r0 = new org.webrtc.PeerConnection$BundlePolicy
                r1 = r0
                java.lang.String r2 = "MAXBUNDLE"
                r3 = 1
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.BundlePolicy.MAXBUNDLE = r0
                org.webrtc.PeerConnection$BundlePolicy r0 = new org.webrtc.PeerConnection$BundlePolicy
                r1 = r0
                java.lang.String r2 = "MAXCOMPAT"
                r3 = 2
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.BundlePolicy.MAXCOMPAT = r0
                org.webrtc.PeerConnection$BundlePolicy[] r0 = $values()
                org.webrtc.PeerConnection.BundlePolicy.$VALUES = r0
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/PeerConnection$CandidateNetworkPolicy.class */
    public enum CandidateNetworkPolicy extends java.lang.Enum<org.webrtc.PeerConnection.CandidateNetworkPolicy> {
        public static final org.webrtc.PeerConnection.CandidateNetworkPolicy ALL = null;
        public static final org.webrtc.PeerConnection.CandidateNetworkPolicy LOW_COST = null;
        private static final /* synthetic */ org.webrtc.PeerConnection.CandidateNetworkPolicy[] $VALUES = null;

        public static org.webrtc.PeerConnection.CandidateNetworkPolicy[] values() {
                org.webrtc.PeerConnection$CandidateNetworkPolicy[] r0 = org.webrtc.PeerConnection.CandidateNetworkPolicy.$VALUES
                java.lang.Object r0 = r0.clone()
                org.webrtc.PeerConnection$CandidateNetworkPolicy[] r0 = (org.webrtc.PeerConnection.CandidateNetworkPolicy[]) r0
                return r0
        }

        public static org.webrtc.PeerConnection.CandidateNetworkPolicy valueOf(java.lang.String r3) {
                java.lang.Class<org.webrtc.PeerConnection$CandidateNetworkPolicy> r0 = org.webrtc.PeerConnection.CandidateNetworkPolicy.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                org.webrtc.PeerConnection$CandidateNetworkPolicy r0 = (org.webrtc.PeerConnection.CandidateNetworkPolicy) r0
                return r0
        }

        CandidateNetworkPolicy(java.lang.String r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        private static /* synthetic */ org.webrtc.PeerConnection.CandidateNetworkPolicy[] $values() {
                r0 = 2
                org.webrtc.PeerConnection$CandidateNetworkPolicy[] r0 = new org.webrtc.PeerConnection.CandidateNetworkPolicy[r0]
                r1 = r0
                r2 = 0
                org.webrtc.PeerConnection$CandidateNetworkPolicy r3 = org.webrtc.PeerConnection.CandidateNetworkPolicy.ALL
                r1[r2] = r3
                r1 = r0
                r2 = 1
                org.webrtc.PeerConnection$CandidateNetworkPolicy r3 = org.webrtc.PeerConnection.CandidateNetworkPolicy.LOW_COST
                r1[r2] = r3
                return r0
        }

        static {
                org.webrtc.PeerConnection$CandidateNetworkPolicy r0 = new org.webrtc.PeerConnection$CandidateNetworkPolicy
                r1 = r0
                java.lang.String r2 = "ALL"
                r3 = 0
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.CandidateNetworkPolicy.ALL = r0
                org.webrtc.PeerConnection$CandidateNetworkPolicy r0 = new org.webrtc.PeerConnection$CandidateNetworkPolicy
                r1 = r0
                java.lang.String r2 = "LOW_COST"
                r3 = 1
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.CandidateNetworkPolicy.LOW_COST = r0
                org.webrtc.PeerConnection$CandidateNetworkPolicy[] r0 = $values()
                org.webrtc.PeerConnection.CandidateNetworkPolicy.$VALUES = r0
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/PeerConnection$ContinualGatheringPolicy.class */
    public enum ContinualGatheringPolicy extends java.lang.Enum<org.webrtc.PeerConnection.ContinualGatheringPolicy> {
        public static final org.webrtc.PeerConnection.ContinualGatheringPolicy GATHER_ONCE = null;
        public static final org.webrtc.PeerConnection.ContinualGatheringPolicy GATHER_CONTINUALLY = null;
        private static final /* synthetic */ org.webrtc.PeerConnection.ContinualGatheringPolicy[] $VALUES = null;

        public static org.webrtc.PeerConnection.ContinualGatheringPolicy[] values() {
                org.webrtc.PeerConnection$ContinualGatheringPolicy[] r0 = org.webrtc.PeerConnection.ContinualGatheringPolicy.$VALUES
                java.lang.Object r0 = r0.clone()
                org.webrtc.PeerConnection$ContinualGatheringPolicy[] r0 = (org.webrtc.PeerConnection.ContinualGatheringPolicy[]) r0
                return r0
        }

        public static org.webrtc.PeerConnection.ContinualGatheringPolicy valueOf(java.lang.String r3) {
                java.lang.Class<org.webrtc.PeerConnection$ContinualGatheringPolicy> r0 = org.webrtc.PeerConnection.ContinualGatheringPolicy.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                org.webrtc.PeerConnection$ContinualGatheringPolicy r0 = (org.webrtc.PeerConnection.ContinualGatheringPolicy) r0
                return r0
        }

        ContinualGatheringPolicy(java.lang.String r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        private static /* synthetic */ org.webrtc.PeerConnection.ContinualGatheringPolicy[] $values() {
                r0 = 2
                org.webrtc.PeerConnection$ContinualGatheringPolicy[] r0 = new org.webrtc.PeerConnection.ContinualGatheringPolicy[r0]
                r1 = r0
                r2 = 0
                org.webrtc.PeerConnection$ContinualGatheringPolicy r3 = org.webrtc.PeerConnection.ContinualGatheringPolicy.GATHER_ONCE
                r1[r2] = r3
                r1 = r0
                r2 = 1
                org.webrtc.PeerConnection$ContinualGatheringPolicy r3 = org.webrtc.PeerConnection.ContinualGatheringPolicy.GATHER_CONTINUALLY
                r1[r2] = r3
                return r0
        }

        static {
                org.webrtc.PeerConnection$ContinualGatheringPolicy r0 = new org.webrtc.PeerConnection$ContinualGatheringPolicy
                r1 = r0
                java.lang.String r2 = "GATHER_ONCE"
                r3 = 0
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.ContinualGatheringPolicy.GATHER_ONCE = r0
                org.webrtc.PeerConnection$ContinualGatheringPolicy r0 = new org.webrtc.PeerConnection$ContinualGatheringPolicy
                r1 = r0
                java.lang.String r2 = "GATHER_CONTINUALLY"
                r3 = 1
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.ContinualGatheringPolicy.GATHER_CONTINUALLY = r0
                org.webrtc.PeerConnection$ContinualGatheringPolicy[] r0 = $values()
                org.webrtc.PeerConnection.ContinualGatheringPolicy.$VALUES = r0
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/PeerConnection$IceConnectionState.class */
    public enum IceConnectionState extends java.lang.Enum<org.webrtc.PeerConnection.IceConnectionState> {
        public static final org.webrtc.PeerConnection.IceConnectionState NEW = null;
        public static final org.webrtc.PeerConnection.IceConnectionState CHECKING = null;
        public static final org.webrtc.PeerConnection.IceConnectionState CONNECTED = null;
        public static final org.webrtc.PeerConnection.IceConnectionState COMPLETED = null;
        public static final org.webrtc.PeerConnection.IceConnectionState FAILED = null;
        public static final org.webrtc.PeerConnection.IceConnectionState DISCONNECTED = null;
        public static final org.webrtc.PeerConnection.IceConnectionState CLOSED = null;
        private static final /* synthetic */ org.webrtc.PeerConnection.IceConnectionState[] $VALUES = null;

        public static org.webrtc.PeerConnection.IceConnectionState[] values() {
                org.webrtc.PeerConnection$IceConnectionState[] r0 = org.webrtc.PeerConnection.IceConnectionState.$VALUES
                java.lang.Object r0 = r0.clone()
                org.webrtc.PeerConnection$IceConnectionState[] r0 = (org.webrtc.PeerConnection.IceConnectionState[]) r0
                return r0
        }

        public static org.webrtc.PeerConnection.IceConnectionState valueOf(java.lang.String r3) {
                java.lang.Class<org.webrtc.PeerConnection$IceConnectionState> r0 = org.webrtc.PeerConnection.IceConnectionState.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                org.webrtc.PeerConnection$IceConnectionState r0 = (org.webrtc.PeerConnection.IceConnectionState) r0
                return r0
        }

        IceConnectionState(java.lang.String r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        @org.webrtc.CalledByNative("IceConnectionState")
        static org.webrtc.PeerConnection.IceConnectionState fromNativeIndex(int r3) {
                org.webrtc.PeerConnection$IceConnectionState[] r0 = values()
                r1 = r3
                r0 = r0[r1]
                return r0
        }

        private static /* synthetic */ org.webrtc.PeerConnection.IceConnectionState[] $values() {
                r0 = 7
                org.webrtc.PeerConnection$IceConnectionState[] r0 = new org.webrtc.PeerConnection.IceConnectionState[r0]
                r1 = r0
                r2 = 0
                org.webrtc.PeerConnection$IceConnectionState r3 = org.webrtc.PeerConnection.IceConnectionState.NEW
                r1[r2] = r3
                r1 = r0
                r2 = 1
                org.webrtc.PeerConnection$IceConnectionState r3 = org.webrtc.PeerConnection.IceConnectionState.CHECKING
                r1[r2] = r3
                r1 = r0
                r2 = 2
                org.webrtc.PeerConnection$IceConnectionState r3 = org.webrtc.PeerConnection.IceConnectionState.CONNECTED
                r1[r2] = r3
                r1 = r0
                r2 = 3
                org.webrtc.PeerConnection$IceConnectionState r3 = org.webrtc.PeerConnection.IceConnectionState.COMPLETED
                r1[r2] = r3
                r1 = r0
                r2 = 4
                org.webrtc.PeerConnection$IceConnectionState r3 = org.webrtc.PeerConnection.IceConnectionState.FAILED
                r1[r2] = r3
                r1 = r0
                r2 = 5
                org.webrtc.PeerConnection$IceConnectionState r3 = org.webrtc.PeerConnection.IceConnectionState.DISCONNECTED
                r1[r2] = r3
                r1 = r0
                r2 = 6
                org.webrtc.PeerConnection$IceConnectionState r3 = org.webrtc.PeerConnection.IceConnectionState.CLOSED
                r1[r2] = r3
                return r0
        }

        static {
                org.webrtc.PeerConnection$IceConnectionState r0 = new org.webrtc.PeerConnection$IceConnectionState
                r1 = r0
                java.lang.String r2 = "NEW"
                r3 = 0
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.IceConnectionState.NEW = r0
                org.webrtc.PeerConnection$IceConnectionState r0 = new org.webrtc.PeerConnection$IceConnectionState
                r1 = r0
                java.lang.String r2 = "CHECKING"
                r3 = 1
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.IceConnectionState.CHECKING = r0
                org.webrtc.PeerConnection$IceConnectionState r0 = new org.webrtc.PeerConnection$IceConnectionState
                r1 = r0
                java.lang.String r2 = "CONNECTED"
                r3 = 2
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.IceConnectionState.CONNECTED = r0
                org.webrtc.PeerConnection$IceConnectionState r0 = new org.webrtc.PeerConnection$IceConnectionState
                r1 = r0
                java.lang.String r2 = "COMPLETED"
                r3 = 3
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.IceConnectionState.COMPLETED = r0
                org.webrtc.PeerConnection$IceConnectionState r0 = new org.webrtc.PeerConnection$IceConnectionState
                r1 = r0
                java.lang.String r2 = "FAILED"
                r3 = 4
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.IceConnectionState.FAILED = r0
                org.webrtc.PeerConnection$IceConnectionState r0 = new org.webrtc.PeerConnection$IceConnectionState
                r1 = r0
                java.lang.String r2 = "DISCONNECTED"
                r3 = 5
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.IceConnectionState.DISCONNECTED = r0
                org.webrtc.PeerConnection$IceConnectionState r0 = new org.webrtc.PeerConnection$IceConnectionState
                r1 = r0
                java.lang.String r2 = "CLOSED"
                r3 = 6
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.IceConnectionState.CLOSED = r0
                org.webrtc.PeerConnection$IceConnectionState[] r0 = $values()
                org.webrtc.PeerConnection.IceConnectionState.$VALUES = r0
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/PeerConnection$IceGatheringState.class */
    public enum IceGatheringState extends java.lang.Enum<org.webrtc.PeerConnection.IceGatheringState> {
        public static final org.webrtc.PeerConnection.IceGatheringState NEW = null;
        public static final org.webrtc.PeerConnection.IceGatheringState GATHERING = null;
        public static final org.webrtc.PeerConnection.IceGatheringState COMPLETE = null;
        private static final /* synthetic */ org.webrtc.PeerConnection.IceGatheringState[] $VALUES = null;

        public static org.webrtc.PeerConnection.IceGatheringState[] values() {
                org.webrtc.PeerConnection$IceGatheringState[] r0 = org.webrtc.PeerConnection.IceGatheringState.$VALUES
                java.lang.Object r0 = r0.clone()
                org.webrtc.PeerConnection$IceGatheringState[] r0 = (org.webrtc.PeerConnection.IceGatheringState[]) r0
                return r0
        }

        public static org.webrtc.PeerConnection.IceGatheringState valueOf(java.lang.String r3) {
                java.lang.Class<org.webrtc.PeerConnection$IceGatheringState> r0 = org.webrtc.PeerConnection.IceGatheringState.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                org.webrtc.PeerConnection$IceGatheringState r0 = (org.webrtc.PeerConnection.IceGatheringState) r0
                return r0
        }

        IceGatheringState(java.lang.String r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        @org.webrtc.CalledByNative("IceGatheringState")
        static org.webrtc.PeerConnection.IceGatheringState fromNativeIndex(int r3) {
                org.webrtc.PeerConnection$IceGatheringState[] r0 = values()
                r1 = r3
                r0 = r0[r1]
                return r0
        }

        private static /* synthetic */ org.webrtc.PeerConnection.IceGatheringState[] $values() {
                r0 = 3
                org.webrtc.PeerConnection$IceGatheringState[] r0 = new org.webrtc.PeerConnection.IceGatheringState[r0]
                r1 = r0
                r2 = 0
                org.webrtc.PeerConnection$IceGatheringState r3 = org.webrtc.PeerConnection.IceGatheringState.NEW
                r1[r2] = r3
                r1 = r0
                r2 = 1
                org.webrtc.PeerConnection$IceGatheringState r3 = org.webrtc.PeerConnection.IceGatheringState.GATHERING
                r1[r2] = r3
                r1 = r0
                r2 = 2
                org.webrtc.PeerConnection$IceGatheringState r3 = org.webrtc.PeerConnection.IceGatheringState.COMPLETE
                r1[r2] = r3
                return r0
        }

        static {
                org.webrtc.PeerConnection$IceGatheringState r0 = new org.webrtc.PeerConnection$IceGatheringState
                r1 = r0
                java.lang.String r2 = "NEW"
                r3 = 0
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.IceGatheringState.NEW = r0
                org.webrtc.PeerConnection$IceGatheringState r0 = new org.webrtc.PeerConnection$IceGatheringState
                r1 = r0
                java.lang.String r2 = "GATHERING"
                r3 = 1
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.IceGatheringState.GATHERING = r0
                org.webrtc.PeerConnection$IceGatheringState r0 = new org.webrtc.PeerConnection$IceGatheringState
                r1 = r0
                java.lang.String r2 = "COMPLETE"
                r3 = 2
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.IceGatheringState.COMPLETE = r0
                org.webrtc.PeerConnection$IceGatheringState[] r0 = $values()
                org.webrtc.PeerConnection.IceGatheringState.$VALUES = r0
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/PeerConnection$IceServer.class */
    public static class IceServer {

        @java.lang.Deprecated
        public final java.lang.String uri;
        public final java.util.List<java.lang.String> urls;
        public final java.lang.String username;
        public final java.lang.String password;
        public final org.webrtc.PeerConnection.TlsCertPolicy tlsCertPolicy;
        public final java.lang.String hostname;
        public final java.util.List<java.lang.String> tlsAlpnProtocols;
        public final java.util.List<java.lang.String> tlsEllipticCurves;

        /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/PeerConnection$IceServer$Builder.class */
        public static class Builder {

            @androidx.annotation.Nullable
            private final java.util.List<java.lang.String> urls;
            private java.lang.String username;
            private java.lang.String password;
            private org.webrtc.PeerConnection.TlsCertPolicy tlsCertPolicy;
            private java.lang.String hostname;
            private java.util.List<java.lang.String> tlsAlpnProtocols;
            private java.util.List<java.lang.String> tlsEllipticCurves;

            private Builder(java.util.List<java.lang.String> r5) {
                    r4 = this;
                    r0 = r4
                    r0.<init>()
                    r0 = r4
                    java.lang.String r1 = ""
                    r0.username = r1
                    r0 = r4
                    java.lang.String r1 = ""
                    r0.password = r1
                    r0 = r4
                    org.webrtc.PeerConnection$TlsCertPolicy r1 = org.webrtc.PeerConnection.TlsCertPolicy.TLS_CERT_POLICY_SECURE
                    r0.tlsCertPolicy = r1
                    r0 = r4
                    java.lang.String r1 = ""
                    r0.hostname = r1
                    r0 = r5
                    if (r0 == 0) goto L2a
                    r0 = r5
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto L38
                L2a:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    r1 = r0
                    r2 = r5
                    java.lang.String r2 = "urls == null || urls.isEmpty(): " + r2
                    r1.<init>(r2)
                    throw r0
                L38:
                    r0 = r4
                    r1 = r5
                    r0.urls = r1
                    return
            }

            public org.webrtc.PeerConnection.IceServer.Builder setUsername(java.lang.String r4) {
                    r3 = this;
                    r0 = r3
                    r1 = r4
                    r0.username = r1
                    r0 = r3
                    return r0
            }

            public org.webrtc.PeerConnection.IceServer.Builder setPassword(java.lang.String r4) {
                    r3 = this;
                    r0 = r3
                    r1 = r4
                    r0.password = r1
                    r0 = r3
                    return r0
            }

            public org.webrtc.PeerConnection.IceServer.Builder setTlsCertPolicy(org.webrtc.PeerConnection.TlsCertPolicy r4) {
                    r3 = this;
                    r0 = r3
                    r1 = r4
                    r0.tlsCertPolicy = r1
                    r0 = r3
                    return r0
            }

            public org.webrtc.PeerConnection.IceServer.Builder setHostname(java.lang.String r4) {
                    r3 = this;
                    r0 = r3
                    r1 = r4
                    r0.hostname = r1
                    r0 = r3
                    return r0
            }

            public org.webrtc.PeerConnection.IceServer.Builder setTlsAlpnProtocols(java.util.List<java.lang.String> r4) {
                    r3 = this;
                    r0 = r3
                    r1 = r4
                    r0.tlsAlpnProtocols = r1
                    r0 = r3
                    return r0
            }

            public org.webrtc.PeerConnection.IceServer.Builder setTlsEllipticCurves(java.util.List<java.lang.String> r4) {
                    r3 = this;
                    r0 = r3
                    r1 = r4
                    r0.tlsEllipticCurves = r1
                    r0 = r3
                    return r0
            }

            public org.webrtc.PeerConnection.IceServer createIceServer() {
                    r11 = this;
                    org.webrtc.PeerConnection$IceServer r0 = new org.webrtc.PeerConnection$IceServer
                    r1 = r0
                    r2 = r11
                    java.util.List<java.lang.String> r2 = r2.urls
                    r3 = 0
                    java.lang.Object r2 = r2.get(r3)
                    java.lang.String r2 = (java.lang.String) r2
                    r3 = r11
                    java.util.List<java.lang.String> r3 = r3.urls
                    r4 = r11
                    java.lang.String r4 = r4.username
                    r5 = r11
                    java.lang.String r5 = r5.password
                    r6 = r11
                    org.webrtc.PeerConnection$TlsCertPolicy r6 = r6.tlsCertPolicy
                    r7 = r11
                    java.lang.String r7 = r7.hostname
                    r8 = r11
                    java.util.List<java.lang.String> r8 = r8.tlsAlpnProtocols
                    r9 = r11
                    java.util.List<java.lang.String> r9 = r9.tlsEllipticCurves
                    r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
                    return r0
            }
        }

        @java.lang.Deprecated
        public IceServer(java.lang.String r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                java.lang.String r2 = ""
                java.lang.String r3 = ""
                r0.<init>(r1, r2, r3)
                return
        }

        @java.lang.Deprecated
        public IceServer(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
                r6 = this;
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                org.webrtc.PeerConnection$TlsCertPolicy r4 = org.webrtc.PeerConnection.TlsCertPolicy.TLS_CERT_POLICY_SECURE
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @java.lang.Deprecated
        public IceServer(java.lang.String r8, java.lang.String r9, java.lang.String r10, org.webrtc.PeerConnection.TlsCertPolicy r11) {
                r7 = this;
                r0 = r7
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                java.lang.String r5 = ""
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @java.lang.Deprecated
        public IceServer(java.lang.String r11, java.lang.String r12, java.lang.String r13, org.webrtc.PeerConnection.TlsCertPolicy r14, java.lang.String r15) {
                r10 = this;
                r0 = r10
                r1 = r11
                r2 = r11
                java.util.List r2 = java.util.Collections.singletonList(r2)
                r3 = r12
                r4 = r13
                r5 = r14
                r6 = r15
                r7 = 0
                r8 = 0
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return
        }

        private IceServer(java.lang.String r5, java.util.List<java.lang.String> r6, java.lang.String r7, java.lang.String r8, org.webrtc.PeerConnection.TlsCertPolicy r9, java.lang.String r10, java.util.List<java.lang.String> r11, java.util.List<java.lang.String> r12) {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r5
                if (r0 == 0) goto L15
                r0 = r6
                if (r0 == 0) goto L15
                r0 = r6
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L1f
            L15:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r1 = r0
                java.lang.String r2 = "uri == null || urls == null || urls.isEmpty()"
                r1.<init>(r2)
                throw r0
            L1f:
                r0 = r6
                java.util.Iterator r0 = r0.iterator()
                r13 = r0
            L27:
                r0 = r13
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L53
                r0 = r13
                java.lang.Object r0 = r0.next()
                java.lang.String r0 = (java.lang.String) r0
                r14 = r0
                r0 = r14
                if (r0 != 0) goto L50
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r1 = r0
                r2 = r6
                java.lang.String r2 = "urls element is null: " + r2
                r1.<init>(r2)
                throw r0
            L50:
                goto L27
            L53:
                r0 = r7
                if (r0 != 0) goto L61
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r1 = r0
                java.lang.String r2 = "username == null"
                r1.<init>(r2)
                throw r0
            L61:
                r0 = r8
                if (r0 != 0) goto L70
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r1 = r0
                java.lang.String r2 = "password == null"
                r1.<init>(r2)
                throw r0
            L70:
                r0 = r10
                if (r0 != 0) goto L7f
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r1 = r0
                java.lang.String r2 = "hostname == null"
                r1.<init>(r2)
                throw r0
            L7f:
                r0 = r4
                r1 = r5
                r0.uri = r1
                r0 = r4
                r1 = r6
                r0.urls = r1
                r0 = r4
                r1 = r7
                r0.username = r1
                r0 = r4
                r1 = r8
                r0.password = r1
                r0 = r4
                r1 = r9
                r0.tlsCertPolicy = r1
                r0 = r4
                r1 = r10
                r0.hostname = r1
                r0 = r4
                r1 = r11
                r0.tlsAlpnProtocols = r1
                r0 = r4
                r1 = r12
                r0.tlsEllipticCurves = r1
                return
        }

        public java.lang.String toString() {
                r8 = this;
                r0 = r8
                java.util.List<java.lang.String> r0 = r0.urls
                r1 = r8
                java.lang.String r1 = r1.username
                r2 = r8
                java.lang.String r2 = r2.password
                r3 = r8
                org.webrtc.PeerConnection$TlsCertPolicy r3 = r3.tlsCertPolicy
                r4 = r8
                java.lang.String r4 = r4.hostname
                r5 = r8
                java.util.List<java.lang.String> r5 = r5.tlsAlpnProtocols
                r6 = r8
                java.util.List<java.lang.String> r6 = r6.tlsEllipticCurves
                java.lang.String r0 = r0 + " [" + r1 + ":" + r2 + "] [" + r3 + "] [" + r4 + "] [" + r5 + "] [" + r6 + "]"
                return r0
        }

        public boolean equals(@androidx.annotation.Nullable java.lang.Object r4) {
                r3 = this;
                r0 = r4
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                r0 = r4
                r1 = r3
                if (r0 != r1) goto Ld
                r0 = 1
                return r0
            Ld:
                r0 = r4
                boolean r0 = r0 instanceof org.webrtc.PeerConnection.IceServer
                if (r0 != 0) goto L16
                r0 = 0
                return r0
            L16:
                r0 = r4
                org.webrtc.PeerConnection$IceServer r0 = (org.webrtc.PeerConnection.IceServer) r0
                r5 = r0
                r0 = r3
                java.lang.String r0 = r0.uri
                r1 = r5
                java.lang.String r1 = r1.uri
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L95
                r0 = r3
                java.util.List<java.lang.String> r0 = r0.urls
                r1 = r5
                java.util.List<java.lang.String> r1 = r1.urls
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L95
                r0 = r3
                java.lang.String r0 = r0.username
                r1 = r5
                java.lang.String r1 = r1.username
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L95
                r0 = r3
                java.lang.String r0 = r0.password
                r1 = r5
                java.lang.String r1 = r1.password
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L95
                r0 = r3
                org.webrtc.PeerConnection$TlsCertPolicy r0 = r0.tlsCertPolicy
                r1 = r5
                org.webrtc.PeerConnection$TlsCertPolicy r1 = r1.tlsCertPolicy
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L95
                r0 = r3
                java.lang.String r0 = r0.hostname
                r1 = r5
                java.lang.String r1 = r1.hostname
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L95
                r0 = r3
                java.util.List<java.lang.String> r0 = r0.tlsAlpnProtocols
                r1 = r5
                java.util.List<java.lang.String> r1 = r1.tlsAlpnProtocols
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L95
                r0 = r3
                java.util.List<java.lang.String> r0 = r0.tlsEllipticCurves
                r1 = r5
                java.util.List<java.lang.String> r1 = r1.tlsEllipticCurves
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L95
                r0 = 1
                goto L96
            L95:
                r0 = 0
            L96:
                return r0
        }

        public int hashCode() {
                r5 = this;
                r0 = 8
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = r0
                r2 = 0
                r3 = r5
                java.lang.String r3 = r3.uri
                r1[r2] = r3
                r1 = r0
                r2 = 1
                r3 = r5
                java.util.List<java.lang.String> r3 = r3.urls
                r1[r2] = r3
                r1 = r0
                r2 = 2
                r3 = r5
                java.lang.String r3 = r3.username
                r1[r2] = r3
                r1 = r0
                r2 = 3
                r3 = r5
                java.lang.String r3 = r3.password
                r1[r2] = r3
                r1 = r0
                r2 = 4
                r3 = r5
                org.webrtc.PeerConnection$TlsCertPolicy r3 = r3.tlsCertPolicy
                r1[r2] = r3
                r1 = r0
                r2 = 5
                r3 = r5
                java.lang.String r3 = r3.hostname
                r1[r2] = r3
                r1 = r0
                r2 = 6
                r3 = r5
                java.util.List<java.lang.String> r3 = r3.tlsAlpnProtocols
                r1[r2] = r3
                r1 = r0
                r2 = 7
                r3 = r5
                java.util.List<java.lang.String> r3 = r3.tlsEllipticCurves
                r1[r2] = r3
                r6 = r0
                r0 = r6
                int r0 = java.util.Arrays.hashCode(r0)
                return r0
        }

        public static org.webrtc.PeerConnection.IceServer.Builder builder(java.lang.String r4) {
                org.webrtc.PeerConnection$IceServer$Builder r0 = new org.webrtc.PeerConnection$IceServer$Builder
                r1 = r0
                r2 = r4
                java.util.List r2 = java.util.Collections.singletonList(r2)
                r1.<init>(r2)
                return r0
        }

        public static org.webrtc.PeerConnection.IceServer.Builder builder(java.util.List<java.lang.String> r4) {
                org.webrtc.PeerConnection$IceServer$Builder r0 = new org.webrtc.PeerConnection$IceServer$Builder
                r1 = r0
                r2 = r4
                r1.<init>(r2)
                return r0
        }

        @androidx.annotation.Nullable
        @org.webrtc.CalledByNative("IceServer")
        java.util.List<java.lang.String> getUrls() {
                r2 = this;
                r0 = r2
                java.util.List<java.lang.String> r0 = r0.urls
                return r0
        }

        @androidx.annotation.Nullable
        @org.webrtc.CalledByNative("IceServer")
        java.lang.String getUsername() {
                r2 = this;
                r0 = r2
                java.lang.String r0 = r0.username
                return r0
        }

        @androidx.annotation.Nullable
        @org.webrtc.CalledByNative("IceServer")
        java.lang.String getPassword() {
                r2 = this;
                r0 = r2
                java.lang.String r0 = r0.password
                return r0
        }

        @org.webrtc.CalledByNative("IceServer")
        org.webrtc.PeerConnection.TlsCertPolicy getTlsCertPolicy() {
                r2 = this;
                r0 = r2
                org.webrtc.PeerConnection$TlsCertPolicy r0 = r0.tlsCertPolicy
                return r0
        }

        @androidx.annotation.Nullable
        @org.webrtc.CalledByNative("IceServer")
        java.lang.String getHostname() {
                r2 = this;
                r0 = r2
                java.lang.String r0 = r0.hostname
                return r0
        }

        @org.webrtc.CalledByNative("IceServer")
        java.util.List<java.lang.String> getTlsAlpnProtocols() {
                r2 = this;
                r0 = r2
                java.util.List<java.lang.String> r0 = r0.tlsAlpnProtocols
                return r0
        }

        @org.webrtc.CalledByNative("IceServer")
        java.util.List<java.lang.String> getTlsEllipticCurves() {
                r2 = this;
                r0 = r2
                java.util.List<java.lang.String> r0 = r0.tlsEllipticCurves
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/PeerConnection$IceTransportsType.class */
    public enum IceTransportsType extends java.lang.Enum<org.webrtc.PeerConnection.IceTransportsType> {
        public static final org.webrtc.PeerConnection.IceTransportsType NONE = null;
        public static final org.webrtc.PeerConnection.IceTransportsType RELAY = null;
        public static final org.webrtc.PeerConnection.IceTransportsType NOHOST = null;
        public static final org.webrtc.PeerConnection.IceTransportsType ALL = null;
        private static final /* synthetic */ org.webrtc.PeerConnection.IceTransportsType[] $VALUES = null;

        public static org.webrtc.PeerConnection.IceTransportsType[] values() {
                org.webrtc.PeerConnection$IceTransportsType[] r0 = org.webrtc.PeerConnection.IceTransportsType.$VALUES
                java.lang.Object r0 = r0.clone()
                org.webrtc.PeerConnection$IceTransportsType[] r0 = (org.webrtc.PeerConnection.IceTransportsType[]) r0
                return r0
        }

        public static org.webrtc.PeerConnection.IceTransportsType valueOf(java.lang.String r3) {
                java.lang.Class<org.webrtc.PeerConnection$IceTransportsType> r0 = org.webrtc.PeerConnection.IceTransportsType.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                org.webrtc.PeerConnection$IceTransportsType r0 = (org.webrtc.PeerConnection.IceTransportsType) r0
                return r0
        }

        IceTransportsType(java.lang.String r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        private static /* synthetic */ org.webrtc.PeerConnection.IceTransportsType[] $values() {
                r0 = 4
                org.webrtc.PeerConnection$IceTransportsType[] r0 = new org.webrtc.PeerConnection.IceTransportsType[r0]
                r1 = r0
                r2 = 0
                org.webrtc.PeerConnection$IceTransportsType r3 = org.webrtc.PeerConnection.IceTransportsType.NONE
                r1[r2] = r3
                r1 = r0
                r2 = 1
                org.webrtc.PeerConnection$IceTransportsType r3 = org.webrtc.PeerConnection.IceTransportsType.RELAY
                r1[r2] = r3
                r1 = r0
                r2 = 2
                org.webrtc.PeerConnection$IceTransportsType r3 = org.webrtc.PeerConnection.IceTransportsType.NOHOST
                r1[r2] = r3
                r1 = r0
                r2 = 3
                org.webrtc.PeerConnection$IceTransportsType r3 = org.webrtc.PeerConnection.IceTransportsType.ALL
                r1[r2] = r3
                return r0
        }

        static {
                org.webrtc.PeerConnection$IceTransportsType r0 = new org.webrtc.PeerConnection$IceTransportsType
                r1 = r0
                java.lang.String r2 = "NONE"
                r3 = 0
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.IceTransportsType.NONE = r0
                org.webrtc.PeerConnection$IceTransportsType r0 = new org.webrtc.PeerConnection$IceTransportsType
                r1 = r0
                java.lang.String r2 = "RELAY"
                r3 = 1
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.IceTransportsType.RELAY = r0
                org.webrtc.PeerConnection$IceTransportsType r0 = new org.webrtc.PeerConnection$IceTransportsType
                r1 = r0
                java.lang.String r2 = "NOHOST"
                r3 = 2
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.IceTransportsType.NOHOST = r0
                org.webrtc.PeerConnection$IceTransportsType r0 = new org.webrtc.PeerConnection$IceTransportsType
                r1 = r0
                java.lang.String r2 = "ALL"
                r3 = 3
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.IceTransportsType.ALL = r0
                org.webrtc.PeerConnection$IceTransportsType[] r0 = $values()
                org.webrtc.PeerConnection.IceTransportsType.$VALUES = r0
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/PeerConnection$KeyType.class */
    public enum KeyType extends java.lang.Enum<org.webrtc.PeerConnection.KeyType> {
        public static final org.webrtc.PeerConnection.KeyType RSA = null;
        public static final org.webrtc.PeerConnection.KeyType ECDSA = null;
        private static final /* synthetic */ org.webrtc.PeerConnection.KeyType[] $VALUES = null;

        public static org.webrtc.PeerConnection.KeyType[] values() {
                org.webrtc.PeerConnection$KeyType[] r0 = org.webrtc.PeerConnection.KeyType.$VALUES
                java.lang.Object r0 = r0.clone()
                org.webrtc.PeerConnection$KeyType[] r0 = (org.webrtc.PeerConnection.KeyType[]) r0
                return r0
        }

        public static org.webrtc.PeerConnection.KeyType valueOf(java.lang.String r3) {
                java.lang.Class<org.webrtc.PeerConnection$KeyType> r0 = org.webrtc.PeerConnection.KeyType.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                org.webrtc.PeerConnection$KeyType r0 = (org.webrtc.PeerConnection.KeyType) r0
                return r0
        }

        KeyType(java.lang.String r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        private static /* synthetic */ org.webrtc.PeerConnection.KeyType[] $values() {
                r0 = 2
                org.webrtc.PeerConnection$KeyType[] r0 = new org.webrtc.PeerConnection.KeyType[r0]
                r1 = r0
                r2 = 0
                org.webrtc.PeerConnection$KeyType r3 = org.webrtc.PeerConnection.KeyType.RSA
                r1[r2] = r3
                r1 = r0
                r2 = 1
                org.webrtc.PeerConnection$KeyType r3 = org.webrtc.PeerConnection.KeyType.ECDSA
                r1[r2] = r3
                return r0
        }

        static {
                org.webrtc.PeerConnection$KeyType r0 = new org.webrtc.PeerConnection$KeyType
                r1 = r0
                java.lang.String r2 = "RSA"
                r3 = 0
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.KeyType.RSA = r0
                org.webrtc.PeerConnection$KeyType r0 = new org.webrtc.PeerConnection$KeyType
                r1 = r0
                java.lang.String r2 = "ECDSA"
                r3 = 1
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.KeyType.ECDSA = r0
                org.webrtc.PeerConnection$KeyType[] r0 = $values()
                org.webrtc.PeerConnection.KeyType.$VALUES = r0
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/PeerConnection$Observer.class */
    public interface Observer {
        @org.webrtc.CalledByNative("Observer")
        void onSignalingChange(org.webrtc.PeerConnection.SignalingState r1);

        @org.webrtc.CalledByNative("Observer")
        void onIceConnectionChange(org.webrtc.PeerConnection.IceConnectionState r1);

        @org.webrtc.CalledByNative("Observer")
        default void onStandardizedIceConnectionChange(org.webrtc.PeerConnection.IceConnectionState r2) {
                r1 = this;
                return
        }

        @org.webrtc.CalledByNative("Observer")
        default void onConnectionChange(org.webrtc.PeerConnection.PeerConnectionState r2) {
                r1 = this;
                return
        }

        @org.webrtc.CalledByNative("Observer")
        void onIceConnectionReceivingChange(boolean r1);

        @org.webrtc.CalledByNative("Observer")
        void onIceGatheringChange(org.webrtc.PeerConnection.IceGatheringState r1);

        @org.webrtc.CalledByNative("Observer")
        void onIceCandidate(org.webrtc.IceCandidate r1);

        @org.webrtc.CalledByNative("Observer")
        default void onIceCandidateError(org.webrtc.IceCandidateErrorEvent r2) {
                r1 = this;
                return
        }

        @org.webrtc.CalledByNative("Observer")
        void onIceCandidatesRemoved(org.webrtc.IceCandidate[] r1);

        @org.webrtc.CalledByNative("Observer")
        default void onSelectedCandidatePairChanged(org.webrtc.CandidatePairChangeEvent r2) {
                r1 = this;
                return
        }

        @org.webrtc.CalledByNative("Observer")
        void onAddStream(org.webrtc.MediaStream r1);

        @org.webrtc.CalledByNative("Observer")
        void onRemoveStream(org.webrtc.MediaStream r1);

        @org.webrtc.CalledByNative("Observer")
        void onDataChannel(org.webrtc.DataChannel r1);

        @org.webrtc.CalledByNative("Observer")
        void onRenegotiationNeeded();

        @org.webrtc.CalledByNative("Observer")
        default void onAddTrack(org.webrtc.RtpReceiver r2, org.webrtc.MediaStream[] r3) {
                r1 = this;
                return
        }

        @org.webrtc.CalledByNative("Observer")
        default void onRemoveTrack(org.webrtc.RtpReceiver r2) {
                r1 = this;
                return
        }

        @org.webrtc.CalledByNative("Observer")
        default void onTrack(org.webrtc.RtpTransceiver r2) {
                r1 = this;
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/PeerConnection$PeerConnectionState.class */
    public enum PeerConnectionState extends java.lang.Enum<org.webrtc.PeerConnection.PeerConnectionState> {
        public static final org.webrtc.PeerConnection.PeerConnectionState NEW = null;
        public static final org.webrtc.PeerConnection.PeerConnectionState CONNECTING = null;
        public static final org.webrtc.PeerConnection.PeerConnectionState CONNECTED = null;
        public static final org.webrtc.PeerConnection.PeerConnectionState DISCONNECTED = null;
        public static final org.webrtc.PeerConnection.PeerConnectionState FAILED = null;
        public static final org.webrtc.PeerConnection.PeerConnectionState CLOSED = null;
        private static final /* synthetic */ org.webrtc.PeerConnection.PeerConnectionState[] $VALUES = null;

        public static org.webrtc.PeerConnection.PeerConnectionState[] values() {
                org.webrtc.PeerConnection$PeerConnectionState[] r0 = org.webrtc.PeerConnection.PeerConnectionState.$VALUES
                java.lang.Object r0 = r0.clone()
                org.webrtc.PeerConnection$PeerConnectionState[] r0 = (org.webrtc.PeerConnection.PeerConnectionState[]) r0
                return r0
        }

        public static org.webrtc.PeerConnection.PeerConnectionState valueOf(java.lang.String r3) {
                java.lang.Class<org.webrtc.PeerConnection$PeerConnectionState> r0 = org.webrtc.PeerConnection.PeerConnectionState.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                org.webrtc.PeerConnection$PeerConnectionState r0 = (org.webrtc.PeerConnection.PeerConnectionState) r0
                return r0
        }

        PeerConnectionState(java.lang.String r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        @org.webrtc.CalledByNative("PeerConnectionState")
        static org.webrtc.PeerConnection.PeerConnectionState fromNativeIndex(int r3) {
                org.webrtc.PeerConnection$PeerConnectionState[] r0 = values()
                r1 = r3
                r0 = r0[r1]
                return r0
        }

        private static /* synthetic */ org.webrtc.PeerConnection.PeerConnectionState[] $values() {
                r0 = 6
                org.webrtc.PeerConnection$PeerConnectionState[] r0 = new org.webrtc.PeerConnection.PeerConnectionState[r0]
                r1 = r0
                r2 = 0
                org.webrtc.PeerConnection$PeerConnectionState r3 = org.webrtc.PeerConnection.PeerConnectionState.NEW
                r1[r2] = r3
                r1 = r0
                r2 = 1
                org.webrtc.PeerConnection$PeerConnectionState r3 = org.webrtc.PeerConnection.PeerConnectionState.CONNECTING
                r1[r2] = r3
                r1 = r0
                r2 = 2
                org.webrtc.PeerConnection$PeerConnectionState r3 = org.webrtc.PeerConnection.PeerConnectionState.CONNECTED
                r1[r2] = r3
                r1 = r0
                r2 = 3
                org.webrtc.PeerConnection$PeerConnectionState r3 = org.webrtc.PeerConnection.PeerConnectionState.DISCONNECTED
                r1[r2] = r3
                r1 = r0
                r2 = 4
                org.webrtc.PeerConnection$PeerConnectionState r3 = org.webrtc.PeerConnection.PeerConnectionState.FAILED
                r1[r2] = r3
                r1 = r0
                r2 = 5
                org.webrtc.PeerConnection$PeerConnectionState r3 = org.webrtc.PeerConnection.PeerConnectionState.CLOSED
                r1[r2] = r3
                return r0
        }

        static {
                org.webrtc.PeerConnection$PeerConnectionState r0 = new org.webrtc.PeerConnection$PeerConnectionState
                r1 = r0
                java.lang.String r2 = "NEW"
                r3 = 0
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.PeerConnectionState.NEW = r0
                org.webrtc.PeerConnection$PeerConnectionState r0 = new org.webrtc.PeerConnection$PeerConnectionState
                r1 = r0
                java.lang.String r2 = "CONNECTING"
                r3 = 1
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.PeerConnectionState.CONNECTING = r0
                org.webrtc.PeerConnection$PeerConnectionState r0 = new org.webrtc.PeerConnection$PeerConnectionState
                r1 = r0
                java.lang.String r2 = "CONNECTED"
                r3 = 2
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.PeerConnectionState.CONNECTED = r0
                org.webrtc.PeerConnection$PeerConnectionState r0 = new org.webrtc.PeerConnection$PeerConnectionState
                r1 = r0
                java.lang.String r2 = "DISCONNECTED"
                r3 = 3
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.PeerConnectionState.DISCONNECTED = r0
                org.webrtc.PeerConnection$PeerConnectionState r0 = new org.webrtc.PeerConnection$PeerConnectionState
                r1 = r0
                java.lang.String r2 = "FAILED"
                r3 = 4
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.PeerConnectionState.FAILED = r0
                org.webrtc.PeerConnection$PeerConnectionState r0 = new org.webrtc.PeerConnection$PeerConnectionState
                r1 = r0
                java.lang.String r2 = "CLOSED"
                r3 = 5
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.PeerConnectionState.CLOSED = r0
                org.webrtc.PeerConnection$PeerConnectionState[] r0 = $values()
                org.webrtc.PeerConnection.PeerConnectionState.$VALUES = r0
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/PeerConnection$PortPrunePolicy.class */
    public enum PortPrunePolicy extends java.lang.Enum<org.webrtc.PeerConnection.PortPrunePolicy> {
        public static final org.webrtc.PeerConnection.PortPrunePolicy NO_PRUNE = null;
        public static final org.webrtc.PeerConnection.PortPrunePolicy PRUNE_BASED_ON_PRIORITY = null;
        public static final org.webrtc.PeerConnection.PortPrunePolicy KEEP_FIRST_READY = null;
        private static final /* synthetic */ org.webrtc.PeerConnection.PortPrunePolicy[] $VALUES = null;

        public static org.webrtc.PeerConnection.PortPrunePolicy[] values() {
                org.webrtc.PeerConnection$PortPrunePolicy[] r0 = org.webrtc.PeerConnection.PortPrunePolicy.$VALUES
                java.lang.Object r0 = r0.clone()
                org.webrtc.PeerConnection$PortPrunePolicy[] r0 = (org.webrtc.PeerConnection.PortPrunePolicy[]) r0
                return r0
        }

        public static org.webrtc.PeerConnection.PortPrunePolicy valueOf(java.lang.String r3) {
                java.lang.Class<org.webrtc.PeerConnection$PortPrunePolicy> r0 = org.webrtc.PeerConnection.PortPrunePolicy.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                org.webrtc.PeerConnection$PortPrunePolicy r0 = (org.webrtc.PeerConnection.PortPrunePolicy) r0
                return r0
        }

        PortPrunePolicy(java.lang.String r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        private static /* synthetic */ org.webrtc.PeerConnection.PortPrunePolicy[] $values() {
                r0 = 3
                org.webrtc.PeerConnection$PortPrunePolicy[] r0 = new org.webrtc.PeerConnection.PortPrunePolicy[r0]
                r1 = r0
                r2 = 0
                org.webrtc.PeerConnection$PortPrunePolicy r3 = org.webrtc.PeerConnection.PortPrunePolicy.NO_PRUNE
                r1[r2] = r3
                r1 = r0
                r2 = 1
                org.webrtc.PeerConnection$PortPrunePolicy r3 = org.webrtc.PeerConnection.PortPrunePolicy.PRUNE_BASED_ON_PRIORITY
                r1[r2] = r3
                r1 = r0
                r2 = 2
                org.webrtc.PeerConnection$PortPrunePolicy r3 = org.webrtc.PeerConnection.PortPrunePolicy.KEEP_FIRST_READY
                r1[r2] = r3
                return r0
        }

        static {
                org.webrtc.PeerConnection$PortPrunePolicy r0 = new org.webrtc.PeerConnection$PortPrunePolicy
                r1 = r0
                java.lang.String r2 = "NO_PRUNE"
                r3 = 0
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.PortPrunePolicy.NO_PRUNE = r0
                org.webrtc.PeerConnection$PortPrunePolicy r0 = new org.webrtc.PeerConnection$PortPrunePolicy
                r1 = r0
                java.lang.String r2 = "PRUNE_BASED_ON_PRIORITY"
                r3 = 1
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.PortPrunePolicy.PRUNE_BASED_ON_PRIORITY = r0
                org.webrtc.PeerConnection$PortPrunePolicy r0 = new org.webrtc.PeerConnection$PortPrunePolicy
                r1 = r0
                java.lang.String r2 = "KEEP_FIRST_READY"
                r3 = 2
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.PortPrunePolicy.KEEP_FIRST_READY = r0
                org.webrtc.PeerConnection$PortPrunePolicy[] r0 = $values()
                org.webrtc.PeerConnection.PortPrunePolicy.$VALUES = r0
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/PeerConnection$RTCConfiguration.class */
    public static class RTCConfiguration {
        public org.webrtc.PeerConnection.IceTransportsType iceTransportsType;
        public java.util.List<org.webrtc.PeerConnection.IceServer> iceServers;
        public org.webrtc.PeerConnection.BundlePolicy bundlePolicy;

        @androidx.annotation.Nullable
        public org.webrtc.RtcCertificatePem certificate;
        public org.webrtc.PeerConnection.RtcpMuxPolicy rtcpMuxPolicy;
        public org.webrtc.PeerConnection.TcpCandidatePolicy tcpCandidatePolicy;
        public org.webrtc.PeerConnection.CandidateNetworkPolicy candidateNetworkPolicy;
        public int audioJitterBufferMaxPackets;
        public boolean audioJitterBufferFastAccelerate;
        public int iceConnectionReceivingTimeout;
        public int iceBackupCandidatePairPingInterval;
        public org.webrtc.PeerConnection.KeyType keyType;
        public org.webrtc.PeerConnection.ContinualGatheringPolicy continualGatheringPolicy;
        public int iceCandidatePoolSize;

        @java.lang.Deprecated
        public boolean pruneTurnPorts;
        public org.webrtc.PeerConnection.PortPrunePolicy turnPortPrunePolicy;
        public boolean presumeWritableWhenFullyRelayed;
        public boolean surfaceIceCandidatesOnIceTransportTypeChanged;

        @androidx.annotation.Nullable
        public java.lang.Integer iceCheckIntervalStrongConnectivityMs;

        @androidx.annotation.Nullable
        public java.lang.Integer iceCheckIntervalWeakConnectivityMs;

        @androidx.annotation.Nullable
        public java.lang.Integer iceCheckMinInterval;

        @androidx.annotation.Nullable
        public java.lang.Integer iceUnwritableTimeMs;

        @androidx.annotation.Nullable
        public java.lang.Integer iceUnwritableMinChecks;

        @androidx.annotation.Nullable
        public java.lang.Integer stunCandidateKeepaliveIntervalMs;

        @androidx.annotation.Nullable
        public java.lang.Integer stableWritableConnectionPingIntervalMs;
        public boolean disableIPv6OnWifi;
        public int maxIPv6Networks;
        public boolean enableDscp;
        public boolean enableCpuOveruseDetection;
        public boolean suspendBelowMinBitrate;

        @androidx.annotation.Nullable
        public java.lang.Integer screencastMinBitrate;
        public org.webrtc.PeerConnection.AdapterType networkPreference;
        public org.webrtc.PeerConnection.SdpSemantics sdpSemantics;

        @androidx.annotation.Nullable
        public org.webrtc.TurnCustomizer turnCustomizer;
        public boolean activeResetSrtpParams;

        @androidx.annotation.Nullable
        public org.webrtc.CryptoOptions cryptoOptions;

        @androidx.annotation.Nullable
        public java.lang.String turnLoggingId;
        public boolean enableImplicitRollback;
        public boolean offerExtmapAllowMixed;

        public RTCConfiguration(java.util.List<org.webrtc.PeerConnection.IceServer> r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                org.webrtc.PeerConnection$IceTransportsType r1 = org.webrtc.PeerConnection.IceTransportsType.ALL
                r0.iceTransportsType = r1
                r0 = r3
                org.webrtc.PeerConnection$BundlePolicy r1 = org.webrtc.PeerConnection.BundlePolicy.BALANCED
                r0.bundlePolicy = r1
                r0 = r3
                org.webrtc.PeerConnection$RtcpMuxPolicy r1 = org.webrtc.PeerConnection.RtcpMuxPolicy.REQUIRE
                r0.rtcpMuxPolicy = r1
                r0 = r3
                org.webrtc.PeerConnection$TcpCandidatePolicy r1 = org.webrtc.PeerConnection.TcpCandidatePolicy.ENABLED
                r0.tcpCandidatePolicy = r1
                r0 = r3
                org.webrtc.PeerConnection$CandidateNetworkPolicy r1 = org.webrtc.PeerConnection.CandidateNetworkPolicy.ALL
                r0.candidateNetworkPolicy = r1
                r0 = r3
                r1 = r4
                r0.iceServers = r1
                r0 = r3
                r1 = 50
                r0.audioJitterBufferMaxPackets = r1
                r0 = r3
                r1 = 0
                r0.audioJitterBufferFastAccelerate = r1
                r0 = r3
                r1 = -1
                r0.iceConnectionReceivingTimeout = r1
                r0 = r3
                r1 = -1
                r0.iceBackupCandidatePairPingInterval = r1
                r0 = r3
                org.webrtc.PeerConnection$KeyType r1 = org.webrtc.PeerConnection.KeyType.ECDSA
                r0.keyType = r1
                r0 = r3
                org.webrtc.PeerConnection$ContinualGatheringPolicy r1 = org.webrtc.PeerConnection.ContinualGatheringPolicy.GATHER_ONCE
                r0.continualGatheringPolicy = r1
                r0 = r3
                r1 = 0
                r0.iceCandidatePoolSize = r1
                r0 = r3
                r1 = 0
                r0.pruneTurnPorts = r1
                r0 = r3
                org.webrtc.PeerConnection$PortPrunePolicy r1 = org.webrtc.PeerConnection.PortPrunePolicy.NO_PRUNE
                r0.turnPortPrunePolicy = r1
                r0 = r3
                r1 = 0
                r0.presumeWritableWhenFullyRelayed = r1
                r0 = r3
                r1 = 0
                r0.surfaceIceCandidatesOnIceTransportTypeChanged = r1
                r0 = r3
                r1 = 0
                r0.iceCheckIntervalStrongConnectivityMs = r1
                r0 = r3
                r1 = 0
                r0.iceCheckIntervalWeakConnectivityMs = r1
                r0 = r3
                r1 = 0
                r0.iceCheckMinInterval = r1
                r0 = r3
                r1 = 0
                r0.iceUnwritableTimeMs = r1
                r0 = r3
                r1 = 0
                r0.iceUnwritableMinChecks = r1
                r0 = r3
                r1 = 0
                r0.stunCandidateKeepaliveIntervalMs = r1
                r0 = r3
                r1 = 0
                r0.stableWritableConnectionPingIntervalMs = r1
                r0 = r3
                r1 = 0
                r0.disableIPv6OnWifi = r1
                r0 = r3
                r1 = 5
                r0.maxIPv6Networks = r1
                r0 = r3
                r1 = 0
                r0.enableDscp = r1
                r0 = r3
                r1 = 1
                r0.enableCpuOveruseDetection = r1
                r0 = r3
                r1 = 0
                r0.suspendBelowMinBitrate = r1
                r0 = r3
                r1 = 0
                r0.screencastMinBitrate = r1
                r0 = r3
                org.webrtc.PeerConnection$AdapterType r1 = org.webrtc.PeerConnection.AdapterType.UNKNOWN
                r0.networkPreference = r1
                r0 = r3
                org.webrtc.PeerConnection$SdpSemantics r1 = org.webrtc.PeerConnection.SdpSemantics.UNIFIED_PLAN
                r0.sdpSemantics = r1
                r0 = r3
                r1 = 0
                r0.activeResetSrtpParams = r1
                r0 = r3
                r1 = 0
                r0.cryptoOptions = r1
                r0 = r3
                r1 = 0
                r0.turnLoggingId = r1
                r0 = r3
                r1 = 0
                r0.enableImplicitRollback = r1
                r0 = r3
                r1 = 1
                r0.offerExtmapAllowMixed = r1
                return
        }

        @org.webrtc.CalledByNative("RTCConfiguration")
        org.webrtc.PeerConnection.IceTransportsType getIceTransportsType() {
                r2 = this;
                r0 = r2
                org.webrtc.PeerConnection$IceTransportsType r0 = r0.iceTransportsType
                return r0
        }

        @org.webrtc.CalledByNative("RTCConfiguration")
        java.util.List<org.webrtc.PeerConnection.IceServer> getIceServers() {
                r2 = this;
                r0 = r2
                java.util.List<org.webrtc.PeerConnection$IceServer> r0 = r0.iceServers
                return r0
        }

        @org.webrtc.CalledByNative("RTCConfiguration")
        org.webrtc.PeerConnection.BundlePolicy getBundlePolicy() {
                r2 = this;
                r0 = r2
                org.webrtc.PeerConnection$BundlePolicy r0 = r0.bundlePolicy
                return r0
        }

        @org.webrtc.CalledByNative("RTCConfiguration")
        org.webrtc.PeerConnection.PortPrunePolicy getTurnPortPrunePolicy() {
                r2 = this;
                r0 = r2
                org.webrtc.PeerConnection$PortPrunePolicy r0 = r0.turnPortPrunePolicy
                return r0
        }

        @androidx.annotation.Nullable
        @org.webrtc.CalledByNative("RTCConfiguration")
        org.webrtc.RtcCertificatePem getCertificate() {
                r2 = this;
                r0 = r2
                org.webrtc.RtcCertificatePem r0 = r0.certificate
                return r0
        }

        @org.webrtc.CalledByNative("RTCConfiguration")
        org.webrtc.PeerConnection.RtcpMuxPolicy getRtcpMuxPolicy() {
                r2 = this;
                r0 = r2
                org.webrtc.PeerConnection$RtcpMuxPolicy r0 = r0.rtcpMuxPolicy
                return r0
        }

        @org.webrtc.CalledByNative("RTCConfiguration")
        org.webrtc.PeerConnection.TcpCandidatePolicy getTcpCandidatePolicy() {
                r2 = this;
                r0 = r2
                org.webrtc.PeerConnection$TcpCandidatePolicy r0 = r0.tcpCandidatePolicy
                return r0
        }

        @org.webrtc.CalledByNative("RTCConfiguration")
        org.webrtc.PeerConnection.CandidateNetworkPolicy getCandidateNetworkPolicy() {
                r2 = this;
                r0 = r2
                org.webrtc.PeerConnection$CandidateNetworkPolicy r0 = r0.candidateNetworkPolicy
                return r0
        }

        @org.webrtc.CalledByNative("RTCConfiguration")
        int getAudioJitterBufferMaxPackets() {
                r2 = this;
                r0 = r2
                int r0 = r0.audioJitterBufferMaxPackets
                return r0
        }

        @org.webrtc.CalledByNative("RTCConfiguration")
        boolean getAudioJitterBufferFastAccelerate() {
                r2 = this;
                r0 = r2
                boolean r0 = r0.audioJitterBufferFastAccelerate
                return r0
        }

        @org.webrtc.CalledByNative("RTCConfiguration")
        int getIceConnectionReceivingTimeout() {
                r2 = this;
                r0 = r2
                int r0 = r0.iceConnectionReceivingTimeout
                return r0
        }

        @org.webrtc.CalledByNative("RTCConfiguration")
        int getIceBackupCandidatePairPingInterval() {
                r2 = this;
                r0 = r2
                int r0 = r0.iceBackupCandidatePairPingInterval
                return r0
        }

        @org.webrtc.CalledByNative("RTCConfiguration")
        org.webrtc.PeerConnection.KeyType getKeyType() {
                r2 = this;
                r0 = r2
                org.webrtc.PeerConnection$KeyType r0 = r0.keyType
                return r0
        }

        @org.webrtc.CalledByNative("RTCConfiguration")
        org.webrtc.PeerConnection.ContinualGatheringPolicy getContinualGatheringPolicy() {
                r2 = this;
                r0 = r2
                org.webrtc.PeerConnection$ContinualGatheringPolicy r0 = r0.continualGatheringPolicy
                return r0
        }

        @org.webrtc.CalledByNative("RTCConfiguration")
        int getIceCandidatePoolSize() {
                r2 = this;
                r0 = r2
                int r0 = r0.iceCandidatePoolSize
                return r0
        }

        @org.webrtc.CalledByNative("RTCConfiguration")
        boolean getPruneTurnPorts() {
                r2 = this;
                r0 = r2
                boolean r0 = r0.pruneTurnPorts
                return r0
        }

        @org.webrtc.CalledByNative("RTCConfiguration")
        boolean getPresumeWritableWhenFullyRelayed() {
                r2 = this;
                r0 = r2
                boolean r0 = r0.presumeWritableWhenFullyRelayed
                return r0
        }

        @org.webrtc.CalledByNative("RTCConfiguration")
        boolean getSurfaceIceCandidatesOnIceTransportTypeChanged() {
                r2 = this;
                r0 = r2
                boolean r0 = r0.surfaceIceCandidatesOnIceTransportTypeChanged
                return r0
        }

        @androidx.annotation.Nullable
        @org.webrtc.CalledByNative("RTCConfiguration")
        java.lang.Integer getIceCheckIntervalStrongConnectivity() {
                r2 = this;
                r0 = r2
                java.lang.Integer r0 = r0.iceCheckIntervalStrongConnectivityMs
                return r0
        }

        @androidx.annotation.Nullable
        @org.webrtc.CalledByNative("RTCConfiguration")
        java.lang.Integer getIceCheckIntervalWeakConnectivity() {
                r2 = this;
                r0 = r2
                java.lang.Integer r0 = r0.iceCheckIntervalWeakConnectivityMs
                return r0
        }

        @androidx.annotation.Nullable
        @org.webrtc.CalledByNative("RTCConfiguration")
        java.lang.Integer getIceCheckMinInterval() {
                r2 = this;
                r0 = r2
                java.lang.Integer r0 = r0.iceCheckMinInterval
                return r0
        }

        @androidx.annotation.Nullable
        @org.webrtc.CalledByNative("RTCConfiguration")
        java.lang.Integer getIceUnwritableTimeout() {
                r2 = this;
                r0 = r2
                java.lang.Integer r0 = r0.iceUnwritableTimeMs
                return r0
        }

        @androidx.annotation.Nullable
        @org.webrtc.CalledByNative("RTCConfiguration")
        java.lang.Integer getIceUnwritableMinChecks() {
                r2 = this;
                r0 = r2
                java.lang.Integer r0 = r0.iceUnwritableMinChecks
                return r0
        }

        @androidx.annotation.Nullable
        @org.webrtc.CalledByNative("RTCConfiguration")
        java.lang.Integer getStunCandidateKeepaliveInterval() {
                r2 = this;
                r0 = r2
                java.lang.Integer r0 = r0.stunCandidateKeepaliveIntervalMs
                return r0
        }

        @androidx.annotation.Nullable
        @org.webrtc.CalledByNative("RTCConfiguration")
        java.lang.Integer getStableWritableConnectionPingIntervalMs() {
                r2 = this;
                r0 = r2
                java.lang.Integer r0 = r0.stableWritableConnectionPingIntervalMs
                return r0
        }

        @org.webrtc.CalledByNative("RTCConfiguration")
        boolean getDisableIPv6OnWifi() {
                r2 = this;
                r0 = r2
                boolean r0 = r0.disableIPv6OnWifi
                return r0
        }

        @org.webrtc.CalledByNative("RTCConfiguration")
        int getMaxIPv6Networks() {
                r2 = this;
                r0 = r2
                int r0 = r0.maxIPv6Networks
                return r0
        }

        @androidx.annotation.Nullable
        @org.webrtc.CalledByNative("RTCConfiguration")
        org.webrtc.TurnCustomizer getTurnCustomizer() {
                r2 = this;
                r0 = r2
                org.webrtc.TurnCustomizer r0 = r0.turnCustomizer
                return r0
        }

        @org.webrtc.CalledByNative("RTCConfiguration")
        boolean getEnableDscp() {
                r2 = this;
                r0 = r2
                boolean r0 = r0.enableDscp
                return r0
        }

        @org.webrtc.CalledByNative("RTCConfiguration")
        boolean getEnableCpuOveruseDetection() {
                r2 = this;
                r0 = r2
                boolean r0 = r0.enableCpuOveruseDetection
                return r0
        }

        @org.webrtc.CalledByNative("RTCConfiguration")
        boolean getSuspendBelowMinBitrate() {
                r2 = this;
                r0 = r2
                boolean r0 = r0.suspendBelowMinBitrate
                return r0
        }

        @androidx.annotation.Nullable
        @org.webrtc.CalledByNative("RTCConfiguration")
        java.lang.Integer getScreencastMinBitrate() {
                r2 = this;
                r0 = r2
                java.lang.Integer r0 = r0.screencastMinBitrate
                return r0
        }

        @org.webrtc.CalledByNative("RTCConfiguration")
        org.webrtc.PeerConnection.AdapterType getNetworkPreference() {
                r2 = this;
                r0 = r2
                org.webrtc.PeerConnection$AdapterType r0 = r0.networkPreference
                return r0
        }

        @org.webrtc.CalledByNative("RTCConfiguration")
        org.webrtc.PeerConnection.SdpSemantics getSdpSemantics() {
                r2 = this;
                r0 = r2
                org.webrtc.PeerConnection$SdpSemantics r0 = r0.sdpSemantics
                return r0
        }

        @org.webrtc.CalledByNative("RTCConfiguration")
        boolean getActiveResetSrtpParams() {
                r2 = this;
                r0 = r2
                boolean r0 = r0.activeResetSrtpParams
                return r0
        }

        @androidx.annotation.Nullable
        @org.webrtc.CalledByNative("RTCConfiguration")
        org.webrtc.CryptoOptions getCryptoOptions() {
                r2 = this;
                r0 = r2
                org.webrtc.CryptoOptions r0 = r0.cryptoOptions
                return r0
        }

        @androidx.annotation.Nullable
        @org.webrtc.CalledByNative("RTCConfiguration")
        java.lang.String getTurnLoggingId() {
                r2 = this;
                r0 = r2
                java.lang.String r0 = r0.turnLoggingId
                return r0
        }

        @org.webrtc.CalledByNative("RTCConfiguration")
        boolean getEnableImplicitRollback() {
                r2 = this;
                r0 = r2
                boolean r0 = r0.enableImplicitRollback
                return r0
        }

        @org.webrtc.CalledByNative("RTCConfiguration")
        boolean getOfferExtmapAllowMixed() {
                r2 = this;
                r0 = r2
                boolean r0 = r0.offerExtmapAllowMixed
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/PeerConnection$RtcpMuxPolicy.class */
    public enum RtcpMuxPolicy extends java.lang.Enum<org.webrtc.PeerConnection.RtcpMuxPolicy> {
        public static final org.webrtc.PeerConnection.RtcpMuxPolicy NEGOTIATE = null;
        public static final org.webrtc.PeerConnection.RtcpMuxPolicy REQUIRE = null;
        private static final /* synthetic */ org.webrtc.PeerConnection.RtcpMuxPolicy[] $VALUES = null;

        public static org.webrtc.PeerConnection.RtcpMuxPolicy[] values() {
                org.webrtc.PeerConnection$RtcpMuxPolicy[] r0 = org.webrtc.PeerConnection.RtcpMuxPolicy.$VALUES
                java.lang.Object r0 = r0.clone()
                org.webrtc.PeerConnection$RtcpMuxPolicy[] r0 = (org.webrtc.PeerConnection.RtcpMuxPolicy[]) r0
                return r0
        }

        public static org.webrtc.PeerConnection.RtcpMuxPolicy valueOf(java.lang.String r3) {
                java.lang.Class<org.webrtc.PeerConnection$RtcpMuxPolicy> r0 = org.webrtc.PeerConnection.RtcpMuxPolicy.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                org.webrtc.PeerConnection$RtcpMuxPolicy r0 = (org.webrtc.PeerConnection.RtcpMuxPolicy) r0
                return r0
        }

        RtcpMuxPolicy(java.lang.String r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        private static /* synthetic */ org.webrtc.PeerConnection.RtcpMuxPolicy[] $values() {
                r0 = 2
                org.webrtc.PeerConnection$RtcpMuxPolicy[] r0 = new org.webrtc.PeerConnection.RtcpMuxPolicy[r0]
                r1 = r0
                r2 = 0
                org.webrtc.PeerConnection$RtcpMuxPolicy r3 = org.webrtc.PeerConnection.RtcpMuxPolicy.NEGOTIATE
                r1[r2] = r3
                r1 = r0
                r2 = 1
                org.webrtc.PeerConnection$RtcpMuxPolicy r3 = org.webrtc.PeerConnection.RtcpMuxPolicy.REQUIRE
                r1[r2] = r3
                return r0
        }

        static {
                org.webrtc.PeerConnection$RtcpMuxPolicy r0 = new org.webrtc.PeerConnection$RtcpMuxPolicy
                r1 = r0
                java.lang.String r2 = "NEGOTIATE"
                r3 = 0
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.RtcpMuxPolicy.NEGOTIATE = r0
                org.webrtc.PeerConnection$RtcpMuxPolicy r0 = new org.webrtc.PeerConnection$RtcpMuxPolicy
                r1 = r0
                java.lang.String r2 = "REQUIRE"
                r3 = 1
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.RtcpMuxPolicy.REQUIRE = r0
                org.webrtc.PeerConnection$RtcpMuxPolicy[] r0 = $values()
                org.webrtc.PeerConnection.RtcpMuxPolicy.$VALUES = r0
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/PeerConnection$SdpSemantics.class */
    public enum SdpSemantics extends java.lang.Enum<org.webrtc.PeerConnection.SdpSemantics> {

        @java.lang.Deprecated
        public static final org.webrtc.PeerConnection.SdpSemantics PLAN_B = null;
        public static final org.webrtc.PeerConnection.SdpSemantics UNIFIED_PLAN = null;
        private static final /* synthetic */ org.webrtc.PeerConnection.SdpSemantics[] $VALUES = null;

        public static org.webrtc.PeerConnection.SdpSemantics[] values() {
                org.webrtc.PeerConnection$SdpSemantics[] r0 = org.webrtc.PeerConnection.SdpSemantics.$VALUES
                java.lang.Object r0 = r0.clone()
                org.webrtc.PeerConnection$SdpSemantics[] r0 = (org.webrtc.PeerConnection.SdpSemantics[]) r0
                return r0
        }

        public static org.webrtc.PeerConnection.SdpSemantics valueOf(java.lang.String r3) {
                java.lang.Class<org.webrtc.PeerConnection$SdpSemantics> r0 = org.webrtc.PeerConnection.SdpSemantics.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                org.webrtc.PeerConnection$SdpSemantics r0 = (org.webrtc.PeerConnection.SdpSemantics) r0
                return r0
        }

        SdpSemantics(java.lang.String r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        private static /* synthetic */ org.webrtc.PeerConnection.SdpSemantics[] $values() {
                r0 = 2
                org.webrtc.PeerConnection$SdpSemantics[] r0 = new org.webrtc.PeerConnection.SdpSemantics[r0]
                r1 = r0
                r2 = 0
                org.webrtc.PeerConnection$SdpSemantics r3 = org.webrtc.PeerConnection.SdpSemantics.PLAN_B
                r1[r2] = r3
                r1 = r0
                r2 = 1
                org.webrtc.PeerConnection$SdpSemantics r3 = org.webrtc.PeerConnection.SdpSemantics.UNIFIED_PLAN
                r1[r2] = r3
                return r0
        }

        static {
                org.webrtc.PeerConnection$SdpSemantics r0 = new org.webrtc.PeerConnection$SdpSemantics
                r1 = r0
                java.lang.String r2 = "PLAN_B"
                r3 = 0
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.SdpSemantics.PLAN_B = r0
                org.webrtc.PeerConnection$SdpSemantics r0 = new org.webrtc.PeerConnection$SdpSemantics
                r1 = r0
                java.lang.String r2 = "UNIFIED_PLAN"
                r3 = 1
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.SdpSemantics.UNIFIED_PLAN = r0
                org.webrtc.PeerConnection$SdpSemantics[] r0 = $values()
                org.webrtc.PeerConnection.SdpSemantics.$VALUES = r0
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/PeerConnection$SignalingState.class */
    public enum SignalingState extends java.lang.Enum<org.webrtc.PeerConnection.SignalingState> {
        public static final org.webrtc.PeerConnection.SignalingState STABLE = null;
        public static final org.webrtc.PeerConnection.SignalingState HAVE_LOCAL_OFFER = null;
        public static final org.webrtc.PeerConnection.SignalingState HAVE_LOCAL_PRANSWER = null;
        public static final org.webrtc.PeerConnection.SignalingState HAVE_REMOTE_OFFER = null;
        public static final org.webrtc.PeerConnection.SignalingState HAVE_REMOTE_PRANSWER = null;
        public static final org.webrtc.PeerConnection.SignalingState CLOSED = null;
        private static final /* synthetic */ org.webrtc.PeerConnection.SignalingState[] $VALUES = null;

        public static org.webrtc.PeerConnection.SignalingState[] values() {
                org.webrtc.PeerConnection$SignalingState[] r0 = org.webrtc.PeerConnection.SignalingState.$VALUES
                java.lang.Object r0 = r0.clone()
                org.webrtc.PeerConnection$SignalingState[] r0 = (org.webrtc.PeerConnection.SignalingState[]) r0
                return r0
        }

        public static org.webrtc.PeerConnection.SignalingState valueOf(java.lang.String r3) {
                java.lang.Class<org.webrtc.PeerConnection$SignalingState> r0 = org.webrtc.PeerConnection.SignalingState.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                org.webrtc.PeerConnection$SignalingState r0 = (org.webrtc.PeerConnection.SignalingState) r0
                return r0
        }

        SignalingState(java.lang.String r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        @org.webrtc.CalledByNative("SignalingState")
        static org.webrtc.PeerConnection.SignalingState fromNativeIndex(int r3) {
                org.webrtc.PeerConnection$SignalingState[] r0 = values()
                r1 = r3
                r0 = r0[r1]
                return r0
        }

        private static /* synthetic */ org.webrtc.PeerConnection.SignalingState[] $values() {
                r0 = 6
                org.webrtc.PeerConnection$SignalingState[] r0 = new org.webrtc.PeerConnection.SignalingState[r0]
                r1 = r0
                r2 = 0
                org.webrtc.PeerConnection$SignalingState r3 = org.webrtc.PeerConnection.SignalingState.STABLE
                r1[r2] = r3
                r1 = r0
                r2 = 1
                org.webrtc.PeerConnection$SignalingState r3 = org.webrtc.PeerConnection.SignalingState.HAVE_LOCAL_OFFER
                r1[r2] = r3
                r1 = r0
                r2 = 2
                org.webrtc.PeerConnection$SignalingState r3 = org.webrtc.PeerConnection.SignalingState.HAVE_LOCAL_PRANSWER
                r1[r2] = r3
                r1 = r0
                r2 = 3
                org.webrtc.PeerConnection$SignalingState r3 = org.webrtc.PeerConnection.SignalingState.HAVE_REMOTE_OFFER
                r1[r2] = r3
                r1 = r0
                r2 = 4
                org.webrtc.PeerConnection$SignalingState r3 = org.webrtc.PeerConnection.SignalingState.HAVE_REMOTE_PRANSWER
                r1[r2] = r3
                r1 = r0
                r2 = 5
                org.webrtc.PeerConnection$SignalingState r3 = org.webrtc.PeerConnection.SignalingState.CLOSED
                r1[r2] = r3
                return r0
        }

        static {
                org.webrtc.PeerConnection$SignalingState r0 = new org.webrtc.PeerConnection$SignalingState
                r1 = r0
                java.lang.String r2 = "STABLE"
                r3 = 0
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.SignalingState.STABLE = r0
                org.webrtc.PeerConnection$SignalingState r0 = new org.webrtc.PeerConnection$SignalingState
                r1 = r0
                java.lang.String r2 = "HAVE_LOCAL_OFFER"
                r3 = 1
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.SignalingState.HAVE_LOCAL_OFFER = r0
                org.webrtc.PeerConnection$SignalingState r0 = new org.webrtc.PeerConnection$SignalingState
                r1 = r0
                java.lang.String r2 = "HAVE_LOCAL_PRANSWER"
                r3 = 2
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.SignalingState.HAVE_LOCAL_PRANSWER = r0
                org.webrtc.PeerConnection$SignalingState r0 = new org.webrtc.PeerConnection$SignalingState
                r1 = r0
                java.lang.String r2 = "HAVE_REMOTE_OFFER"
                r3 = 3
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.SignalingState.HAVE_REMOTE_OFFER = r0
                org.webrtc.PeerConnection$SignalingState r0 = new org.webrtc.PeerConnection$SignalingState
                r1 = r0
                java.lang.String r2 = "HAVE_REMOTE_PRANSWER"
                r3 = 4
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.SignalingState.HAVE_REMOTE_PRANSWER = r0
                org.webrtc.PeerConnection$SignalingState r0 = new org.webrtc.PeerConnection$SignalingState
                r1 = r0
                java.lang.String r2 = "CLOSED"
                r3 = 5
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.SignalingState.CLOSED = r0
                org.webrtc.PeerConnection$SignalingState[] r0 = $values()
                org.webrtc.PeerConnection.SignalingState.$VALUES = r0
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/PeerConnection$TcpCandidatePolicy.class */
    public enum TcpCandidatePolicy extends java.lang.Enum<org.webrtc.PeerConnection.TcpCandidatePolicy> {
        public static final org.webrtc.PeerConnection.TcpCandidatePolicy ENABLED = null;
        public static final org.webrtc.PeerConnection.TcpCandidatePolicy DISABLED = null;
        private static final /* synthetic */ org.webrtc.PeerConnection.TcpCandidatePolicy[] $VALUES = null;

        public static org.webrtc.PeerConnection.TcpCandidatePolicy[] values() {
                org.webrtc.PeerConnection$TcpCandidatePolicy[] r0 = org.webrtc.PeerConnection.TcpCandidatePolicy.$VALUES
                java.lang.Object r0 = r0.clone()
                org.webrtc.PeerConnection$TcpCandidatePolicy[] r0 = (org.webrtc.PeerConnection.TcpCandidatePolicy[]) r0
                return r0
        }

        public static org.webrtc.PeerConnection.TcpCandidatePolicy valueOf(java.lang.String r3) {
                java.lang.Class<org.webrtc.PeerConnection$TcpCandidatePolicy> r0 = org.webrtc.PeerConnection.TcpCandidatePolicy.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                org.webrtc.PeerConnection$TcpCandidatePolicy r0 = (org.webrtc.PeerConnection.TcpCandidatePolicy) r0
                return r0
        }

        TcpCandidatePolicy(java.lang.String r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        private static /* synthetic */ org.webrtc.PeerConnection.TcpCandidatePolicy[] $values() {
                r0 = 2
                org.webrtc.PeerConnection$TcpCandidatePolicy[] r0 = new org.webrtc.PeerConnection.TcpCandidatePolicy[r0]
                r1 = r0
                r2 = 0
                org.webrtc.PeerConnection$TcpCandidatePolicy r3 = org.webrtc.PeerConnection.TcpCandidatePolicy.ENABLED
                r1[r2] = r3
                r1 = r0
                r2 = 1
                org.webrtc.PeerConnection$TcpCandidatePolicy r3 = org.webrtc.PeerConnection.TcpCandidatePolicy.DISABLED
                r1[r2] = r3
                return r0
        }

        static {
                org.webrtc.PeerConnection$TcpCandidatePolicy r0 = new org.webrtc.PeerConnection$TcpCandidatePolicy
                r1 = r0
                java.lang.String r2 = "ENABLED"
                r3 = 0
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.TcpCandidatePolicy.ENABLED = r0
                org.webrtc.PeerConnection$TcpCandidatePolicy r0 = new org.webrtc.PeerConnection$TcpCandidatePolicy
                r1 = r0
                java.lang.String r2 = "DISABLED"
                r3 = 1
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.TcpCandidatePolicy.DISABLED = r0
                org.webrtc.PeerConnection$TcpCandidatePolicy[] r0 = $values()
                org.webrtc.PeerConnection.TcpCandidatePolicy.$VALUES = r0
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/PeerConnection$TlsCertPolicy.class */
    public enum TlsCertPolicy extends java.lang.Enum<org.webrtc.PeerConnection.TlsCertPolicy> {
        public static final org.webrtc.PeerConnection.TlsCertPolicy TLS_CERT_POLICY_SECURE = null;
        public static final org.webrtc.PeerConnection.TlsCertPolicy TLS_CERT_POLICY_INSECURE_NO_CHECK = null;
        private static final /* synthetic */ org.webrtc.PeerConnection.TlsCertPolicy[] $VALUES = null;

        public static org.webrtc.PeerConnection.TlsCertPolicy[] values() {
                org.webrtc.PeerConnection$TlsCertPolicy[] r0 = org.webrtc.PeerConnection.TlsCertPolicy.$VALUES
                java.lang.Object r0 = r0.clone()
                org.webrtc.PeerConnection$TlsCertPolicy[] r0 = (org.webrtc.PeerConnection.TlsCertPolicy[]) r0
                return r0
        }

        public static org.webrtc.PeerConnection.TlsCertPolicy valueOf(java.lang.String r3) {
                java.lang.Class<org.webrtc.PeerConnection$TlsCertPolicy> r0 = org.webrtc.PeerConnection.TlsCertPolicy.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                org.webrtc.PeerConnection$TlsCertPolicy r0 = (org.webrtc.PeerConnection.TlsCertPolicy) r0
                return r0
        }

        TlsCertPolicy(java.lang.String r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        private static /* synthetic */ org.webrtc.PeerConnection.TlsCertPolicy[] $values() {
                r0 = 2
                org.webrtc.PeerConnection$TlsCertPolicy[] r0 = new org.webrtc.PeerConnection.TlsCertPolicy[r0]
                r1 = r0
                r2 = 0
                org.webrtc.PeerConnection$TlsCertPolicy r3 = org.webrtc.PeerConnection.TlsCertPolicy.TLS_CERT_POLICY_SECURE
                r1[r2] = r3
                r1 = r0
                r2 = 1
                org.webrtc.PeerConnection$TlsCertPolicy r3 = org.webrtc.PeerConnection.TlsCertPolicy.TLS_CERT_POLICY_INSECURE_NO_CHECK
                r1[r2] = r3
                return r0
        }

        static {
                org.webrtc.PeerConnection$TlsCertPolicy r0 = new org.webrtc.PeerConnection$TlsCertPolicy
                r1 = r0
                java.lang.String r2 = "TLS_CERT_POLICY_SECURE"
                r3 = 0
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.TlsCertPolicy.TLS_CERT_POLICY_SECURE = r0
                org.webrtc.PeerConnection$TlsCertPolicy r0 = new org.webrtc.PeerConnection$TlsCertPolicy
                r1 = r0
                java.lang.String r2 = "TLS_CERT_POLICY_INSECURE_NO_CHECK"
                r3 = 1
                r1.<init>(r2, r3)
                org.webrtc.PeerConnection.TlsCertPolicy.TLS_CERT_POLICY_INSECURE_NO_CHECK = r0
                org.webrtc.PeerConnection$TlsCertPolicy[] r0 = $values()
                org.webrtc.PeerConnection.TlsCertPolicy.$VALUES = r0
                return
        }
    }

    public PeerConnection(org.webrtc.NativePeerConnectionFactory r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            long r1 = r1.createNativePeerConnection()
            r0.<init>(r1)
            return
    }

    PeerConnection(long r5) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.localStreams = r1
            r0 = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.senders = r1
            r0 = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.receivers = r1
            r0 = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.transceivers = r1
            r0 = r4
            r1 = r5
            r0.nativePeerConnection = r1
            return
    }

    public org.webrtc.SessionDescription getLocalDescription() {
            r2 = this;
            r0 = r2
            org.webrtc.SessionDescription r0 = r0.nativeGetLocalDescription()
            return r0
    }

    public org.webrtc.SessionDescription getRemoteDescription() {
            r2 = this;
            r0 = r2
            org.webrtc.SessionDescription r0 = r0.nativeGetRemoteDescription()
            return r0
    }

    public org.webrtc.RtcCertificatePem getCertificate() {
            r2 = this;
            r0 = r2
            org.webrtc.RtcCertificatePem r0 = r0.nativeGetCertificate()
            return r0
    }

    public org.webrtc.DataChannel createDataChannel(java.lang.String r5, org.webrtc.DataChannel.Init r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            org.webrtc.DataChannel r0 = r0.nativeCreateDataChannel(r1, r2)
            return r0
    }

    public void createOffer(org.webrtc.SdpObserver r5, org.webrtc.MediaConstraints r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.nativeCreateOffer(r1, r2)
            return
    }

    public void createAnswer(org.webrtc.SdpObserver r5, org.webrtc.MediaConstraints r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.nativeCreateAnswer(r1, r2)
            return
    }

    public void setLocalDescription(org.webrtc.SdpObserver r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.nativeSetLocalDescriptionAutomatically(r1)
            return
    }

    public void setLocalDescription(org.webrtc.SdpObserver r5, org.webrtc.SessionDescription r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.nativeSetLocalDescription(r1, r2)
            return
    }

    public void setRemoteDescription(org.webrtc.SdpObserver r5, org.webrtc.SessionDescription r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.nativeSetRemoteDescription(r1, r2)
            return
    }

    public void restartIce() {
            r2 = this;
            r0 = r2
            r0.nativeRestartIce()
            return
    }

    public void setAudioPlayout(boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.nativeSetAudioPlayout(r1)
            return
    }

    public void setAudioRecording(boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.nativeSetAudioRecording(r1)
            return
    }

    public boolean setConfiguration(org.webrtc.PeerConnection.RTCConfiguration r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            boolean r0 = r0.nativeSetConfiguration(r1)
            return r0
    }

    public boolean addIceCandidate(org.webrtc.IceCandidate r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            java.lang.String r1 = r1.sdpMid
            r2 = r6
            int r2 = r2.sdpMLineIndex
            r3 = r6
            java.lang.String r3 = r3.sdp
            boolean r0 = r0.nativeAddIceCandidate(r1, r2, r3)
            return r0
    }

    public void addIceCandidate(org.webrtc.IceCandidate r7, org.webrtc.AddIceObserver r8) {
            r6 = this;
            r0 = r6
            r1 = r7
            java.lang.String r1 = r1.sdpMid
            r2 = r7
            int r2 = r2.sdpMLineIndex
            r3 = r7
            java.lang.String r3 = r3.sdp
            r4 = r8
            r0.nativeAddIceCandidateWithObserver(r1, r2, r3, r4)
            return
    }

    public boolean removeIceCandidates(org.webrtc.IceCandidate[] r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            boolean r0 = r0.nativeRemoveIceCandidates(r1)
            return r0
    }

    public boolean addStream(org.webrtc.MediaStream r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            long r1 = r1.getNativeMediaStream()
            boolean r0 = r0.nativeAddLocalStream(r1)
            r6 = r0
            r0 = r6
            if (r0 != 0) goto Lf
            r0 = 0
            return r0
        Lf:
            r0 = r4
            java.util.List<org.webrtc.MediaStream> r0 = r0.localStreams
            r1 = r5
            boolean r0 = r0.add(r1)
            r0 = 1
            return r0
    }

    public void removeStream(org.webrtc.MediaStream r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            long r1 = r1.getNativeMediaStream()
            r0.nativeRemoveLocalStream(r1)
            r0 = r4
            java.util.List<org.webrtc.MediaStream> r0 = r0.localStreams
            r1 = r5
            boolean r0 = r0.remove(r1)
            return
    }

    public org.webrtc.RtpSender createSender(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            org.webrtc.RtpSender r0 = r0.nativeCreateSender(r1, r2)
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L16
            r0 = r4
            java.util.List<org.webrtc.RtpSender> r0 = r0.senders
            r1 = r7
            boolean r0 = r0.add(r1)
        L16:
            r0 = r7
            return r0
    }

    public java.util.List<org.webrtc.RtpSender> getSenders() {
            r3 = this;
            r0 = r3
            java.util.List<org.webrtc.RtpSender> r0 = r0.senders
            java.util.Iterator r0 = r0.iterator()
            r4 = r0
        La:
            r0 = r4
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L24
            r0 = r4
            java.lang.Object r0 = r0.next()
            org.webrtc.RtpSender r0 = (org.webrtc.RtpSender) r0
            r5 = r0
            r0 = r5
            r0.dispose()
            goto La
        L24:
            r0 = r3
            r1 = r3
            java.util.List r1 = r1.nativeGetSenders()
            r0.senders = r1
            r0 = r3
            java.util.List<org.webrtc.RtpSender> r0 = r0.senders
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    public java.util.List<org.webrtc.RtpReceiver> getReceivers() {
            r3 = this;
            r0 = r3
            java.util.List<org.webrtc.RtpReceiver> r0 = r0.receivers
            java.util.Iterator r0 = r0.iterator()
            r4 = r0
        La:
            r0 = r4
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L24
            r0 = r4
            java.lang.Object r0 = r0.next()
            org.webrtc.RtpReceiver r0 = (org.webrtc.RtpReceiver) r0
            r5 = r0
            r0 = r5
            r0.dispose()
            goto La
        L24:
            r0 = r3
            r1 = r3
            java.util.List r1 = r1.nativeGetReceivers()
            r0.receivers = r1
            r0 = r3
            java.util.List<org.webrtc.RtpReceiver> r0 = r0.receivers
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    public java.util.List<org.webrtc.RtpTransceiver> getTransceivers() {
            r3 = this;
            r0 = r3
            java.util.List<org.webrtc.RtpTransceiver> r0 = r0.transceivers
            java.util.Iterator r0 = r0.iterator()
            r4 = r0
        La:
            r0 = r4
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L24
            r0 = r4
            java.lang.Object r0 = r0.next()
            org.webrtc.RtpTransceiver r0 = (org.webrtc.RtpTransceiver) r0
            r5 = r0
            r0 = r5
            r0.dispose()
            goto La
        L24:
            r0 = r3
            r1 = r3
            java.util.List r1 = r1.nativeGetTransceivers()
            r0.transceivers = r1
            r0 = r3
            java.util.List<org.webrtc.RtpTransceiver> r0 = r0.transceivers
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    public org.webrtc.RtpSender addTrack(org.webrtc.MediaStreamTrack r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            java.util.List r2 = java.util.Collections.emptyList()
            org.webrtc.RtpSender r0 = r0.addTrack(r1, r2)
            return r0
    }

    public org.webrtc.RtpSender addTrack(org.webrtc.MediaStreamTrack r6, java.util.List<java.lang.String> r7) {
            r5 = this;
            r0 = r6
            if (r0 == 0) goto L8
            r0 = r7
            if (r0 != 0) goto L12
        L8:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r0
            java.lang.String r2 = "No MediaStreamTrack specified in addTrack."
            r1.<init>(r2)
            throw r0
        L12:
            r0 = r5
            r1 = r6
            long r1 = r1.getNativeMediaStreamTrack()
            r2 = r7
            org.webrtc.RtpSender r0 = r0.nativeAddTrack(r1, r2)
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L2a
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "C++ addTrack failed."
            r1.<init>(r2)
            throw r0
        L2a:
            r0 = r5
            java.util.List<org.webrtc.RtpSender> r0 = r0.senders
            r1 = r8
            boolean r0 = r0.add(r1)
            r0 = r8
            return r0
    }

    public boolean removeTrack(org.webrtc.RtpSender r5) {
            r4 = this;
            r0 = r5
            if (r0 != 0) goto Le
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r0
            java.lang.String r2 = "No RtpSender specified for removeTrack."
            r1.<init>(r2)
            throw r0
        Le:
            r0 = r4
            r1 = r5
            long r1 = r1.getNativeRtpSender()
            boolean r0 = r0.nativeRemoveTrack(r1)
            return r0
    }

    public org.webrtc.RtpTransceiver addTransceiver(org.webrtc.MediaStreamTrack r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            org.webrtc.RtpTransceiver$RtpTransceiverInit r2 = new org.webrtc.RtpTransceiver$RtpTransceiverInit
            r3 = r2
            r3.<init>()
            org.webrtc.RtpTransceiver r0 = r0.addTransceiver(r1, r2)
            return r0
    }

    public org.webrtc.RtpTransceiver addTransceiver(org.webrtc.MediaStreamTrack r6, @androidx.annotation.Nullable org.webrtc.RtpTransceiver.RtpTransceiverInit r7) {
            r5 = this;
            r0 = r6
            if (r0 != 0) goto Le
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r0
            java.lang.String r2 = "No MediaStreamTrack specified for addTransceiver."
            r1.<init>(r2)
            throw r0
        Le:
            r0 = r7
            if (r0 != 0) goto L1a
            org.webrtc.RtpTransceiver$RtpTransceiverInit r0 = new org.webrtc.RtpTransceiver$RtpTransceiverInit
            r1 = r0
            r1.<init>()
            r7 = r0
        L1a:
            r0 = r5
            r1 = r6
            long r1 = r1.getNativeMediaStreamTrack()
            r2 = r7
            org.webrtc.RtpTransceiver r0 = r0.nativeAddTransceiverWithTrack(r1, r2)
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L32
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "C++ addTransceiver failed."
            r1.<init>(r2)
            throw r0
        L32:
            r0 = r5
            java.util.List<org.webrtc.RtpTransceiver> r0 = r0.transceivers
            r1 = r8
            boolean r0 = r0.add(r1)
            r0 = r8
            return r0
    }

    public org.webrtc.RtpTransceiver addTransceiver(org.webrtc.MediaStreamTrack.MediaType r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            org.webrtc.RtpTransceiver$RtpTransceiverInit r2 = new org.webrtc.RtpTransceiver$RtpTransceiverInit
            r3 = r2
            r3.<init>()
            org.webrtc.RtpTransceiver r0 = r0.addTransceiver(r1, r2)
            return r0
    }

    public org.webrtc.RtpTransceiver addTransceiver(org.webrtc.MediaStreamTrack.MediaType r5, @androidx.annotation.Nullable org.webrtc.RtpTransceiver.RtpTransceiverInit r6) {
            r4 = this;
            r0 = r5
            if (r0 != 0) goto Le
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r0
            java.lang.String r2 = "No MediaType specified for addTransceiver."
            r1.<init>(r2)
            throw r0
        Le:
            r0 = r6
            if (r0 != 0) goto L1a
            org.webrtc.RtpTransceiver$RtpTransceiverInit r0 = new org.webrtc.RtpTransceiver$RtpTransceiverInit
            r1 = r0
            r1.<init>()
            r6 = r0
        L1a:
            r0 = r4
            r1 = r5
            r2 = r6
            org.webrtc.RtpTransceiver r0 = r0.nativeAddTransceiverOfType(r1, r2)
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L2f
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "C++ addTransceiver failed."
            r1.<init>(r2)
            throw r0
        L2f:
            r0 = r4
            java.util.List<org.webrtc.RtpTransceiver> r0 = r0.transceivers
            r1 = r7
            boolean r0 = r0.add(r1)
            r0 = r7
            return r0
    }

    @java.lang.Deprecated
    public boolean getStats(org.webrtc.StatsObserver r6, @androidx.annotation.Nullable org.webrtc.MediaStreamTrack r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            if (r2 != 0) goto La
            r2 = 0
            goto Le
        La:
            r2 = r7
            long r2 = r2.getNativeMediaStreamTrack()
        Le:
            boolean r0 = r0.nativeOldGetStats(r1, r2)
            return r0
    }

    public void getStats(org.webrtc.RTCStatsCollectorCallback r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.nativeNewGetStats(r1)
            return
    }

    public void getStats(org.webrtc.RtpSender r6, org.webrtc.RTCStatsCollectorCallback r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            long r1 = r1.getNativeRtpSender()
            r2 = r7
            r0.nativeNewGetStatsSender(r1, r2)
            return
    }

    public void getStats(org.webrtc.RtpReceiver r6, org.webrtc.RTCStatsCollectorCallback r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            long r1 = r1.getNativeRtpReceiver()
            r2 = r7
            r0.nativeNewGetStatsReceiver(r1, r2)
            return
    }

    public boolean setBitrate(java.lang.Integer r6, java.lang.Integer r7, java.lang.Integer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            boolean r0 = r0.nativeSetBitrate(r1, r2, r3)
            return r0
    }

    public boolean startRtcEventLog(int r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = r0.nativeStartRtcEventLog(r1, r2)
            return r0
    }

    public void stopRtcEventLog() {
            r2 = this;
            r0 = r2
            r0.nativeStopRtcEventLog()
            return
    }

    public org.webrtc.PeerConnection.SignalingState signalingState() {
            r2 = this;
            r0 = r2
            org.webrtc.PeerConnection$SignalingState r0 = r0.nativeSignalingState()
            return r0
    }

    public org.webrtc.PeerConnection.IceConnectionState iceConnectionState() {
            r2 = this;
            r0 = r2
            org.webrtc.PeerConnection$IceConnectionState r0 = r0.nativeIceConnectionState()
            return r0
    }

    public org.webrtc.PeerConnection.PeerConnectionState connectionState() {
            r2 = this;
            r0 = r2
            org.webrtc.PeerConnection$PeerConnectionState r0 = r0.nativeConnectionState()
            return r0
    }

    public org.webrtc.PeerConnection.IceGatheringState iceGatheringState() {
            r2 = this;
            r0 = r2
            org.webrtc.PeerConnection$IceGatheringState r0 = r0.nativeIceGatheringState()
            return r0
    }

    public void close() {
            r2 = this;
            r0 = r2
            r0.nativeClose()
            return
    }

    public void dispose() {
            r4 = this;
            r0 = r4
            r0.close()
            r0 = r4
            java.util.List<org.webrtc.MediaStream> r0 = r0.localStreams
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
        Le:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L30
            r0 = r5
            java.lang.Object r0 = r0.next()
            org.webrtc.MediaStream r0 = (org.webrtc.MediaStream) r0
            r6 = r0
            r0 = r4
            r1 = r6
            long r1 = r1.getNativeMediaStream()
            r0.nativeRemoveLocalStream(r1)
            r0 = r6
            r0.dispose()
            goto Le
        L30:
            r0 = r4
            java.util.List<org.webrtc.MediaStream> r0 = r0.localStreams
            r0.clear()
            r0 = r4
            java.util.List<org.webrtc.RtpSender> r0 = r0.senders
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
        L43:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L5d
            r0 = r5
            java.lang.Object r0 = r0.next()
            org.webrtc.RtpSender r0 = (org.webrtc.RtpSender) r0
            r6 = r0
            r0 = r6
            r0.dispose()
            goto L43
        L5d:
            r0 = r4
            java.util.List<org.webrtc.RtpSender> r0 = r0.senders
            r0.clear()
            r0 = r4
            java.util.List<org.webrtc.RtpReceiver> r0 = r0.receivers
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
        L70:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L8a
            r0 = r5
            java.lang.Object r0 = r0.next()
            org.webrtc.RtpReceiver r0 = (org.webrtc.RtpReceiver) r0
            r6 = r0
            r0 = r6
            r0.dispose()
            goto L70
        L8a:
            r0 = r4
            java.util.List<org.webrtc.RtpTransceiver> r0 = r0.transceivers
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
        L94:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Lae
            r0 = r5
            java.lang.Object r0 = r0.next()
            org.webrtc.RtpTransceiver r0 = (org.webrtc.RtpTransceiver) r0
            r6 = r0
            r0 = r6
            r0.dispose()
            goto L94
        Lae:
            r0 = r4
            java.util.List<org.webrtc.RtpTransceiver> r0 = r0.transceivers
            r0.clear()
            r0 = r4
            java.util.List<org.webrtc.RtpReceiver> r0 = r0.receivers
            r0.clear()
            r0 = r4
            long r0 = r0.nativePeerConnection
            nativeFreeOwnedPeerConnection(r0)
            return
    }

    public long getNativePeerConnection() {
            r3 = this;
            r0 = r3
            long r0 = r0.nativeGetNativePeerConnection()
            return r0
    }

    @org.webrtc.CalledByNative
    long getNativeOwnedPeerConnection() {
            r3 = this;
            r0 = r3
            long r0 = r0.nativePeerConnection
            return r0
    }

    public static long createNativePeerConnectionObserver(org.webrtc.PeerConnection.Observer r3) {
            r0 = r3
            long r0 = nativeCreatePeerConnectionObserver(r0)
            return r0
    }

    private native long nativeGetNativePeerConnection();

    private native org.webrtc.SessionDescription nativeGetLocalDescription();

    private native org.webrtc.SessionDescription nativeGetRemoteDescription();

    private native org.webrtc.RtcCertificatePem nativeGetCertificate();

    private native org.webrtc.DataChannel nativeCreateDataChannel(java.lang.String r1, org.webrtc.DataChannel.Init r2);

    private native void nativeCreateOffer(org.webrtc.SdpObserver r1, org.webrtc.MediaConstraints r2);

    private native void nativeCreateAnswer(org.webrtc.SdpObserver r1, org.webrtc.MediaConstraints r2);

    private native void nativeSetLocalDescriptionAutomatically(org.webrtc.SdpObserver r1);

    private native void nativeSetLocalDescription(org.webrtc.SdpObserver r1, org.webrtc.SessionDescription r2);

    private native void nativeSetRemoteDescription(org.webrtc.SdpObserver r1, org.webrtc.SessionDescription r2);

    private native void nativeRestartIce();

    private native void nativeSetAudioPlayout(boolean r1);

    private native void nativeSetAudioRecording(boolean r1);

    private native boolean nativeSetBitrate(java.lang.Integer r1, java.lang.Integer r2, java.lang.Integer r3);

    private native org.webrtc.PeerConnection.SignalingState nativeSignalingState();

    private native org.webrtc.PeerConnection.IceConnectionState nativeIceConnectionState();

    private native org.webrtc.PeerConnection.PeerConnectionState nativeConnectionState();

    private native org.webrtc.PeerConnection.IceGatheringState nativeIceGatheringState();

    private native void nativeClose();

    private static native long nativeCreatePeerConnectionObserver(org.webrtc.PeerConnection.Observer r0);

    private static native void nativeFreeOwnedPeerConnection(long r0);

    private native boolean nativeSetConfiguration(org.webrtc.PeerConnection.RTCConfiguration r1);

    private native boolean nativeAddIceCandidate(java.lang.String r1, int r2, java.lang.String r3);

    private native void nativeAddIceCandidateWithObserver(java.lang.String r1, int r2, java.lang.String r3, org.webrtc.AddIceObserver r4);

    private native boolean nativeRemoveIceCandidates(org.webrtc.IceCandidate[] r1);

    private native boolean nativeAddLocalStream(long r1);

    private native void nativeRemoveLocalStream(long r1);

    private native boolean nativeOldGetStats(org.webrtc.StatsObserver r1, long r2);

    private native void nativeNewGetStats(org.webrtc.RTCStatsCollectorCallback r1);

    private native void nativeNewGetStatsSender(long r1, org.webrtc.RTCStatsCollectorCallback r3);

    private native void nativeNewGetStatsReceiver(long r1, org.webrtc.RTCStatsCollectorCallback r3);

    private native org.webrtc.RtpSender nativeCreateSender(java.lang.String r1, java.lang.String r2);

    private native java.util.List<org.webrtc.RtpSender> nativeGetSenders();

    private native java.util.List<org.webrtc.RtpReceiver> nativeGetReceivers();

    private native java.util.List<org.webrtc.RtpTransceiver> nativeGetTransceivers();

    private native org.webrtc.RtpSender nativeAddTrack(long r1, java.util.List<java.lang.String> r3);

    private native boolean nativeRemoveTrack(long r1);

    private native org.webrtc.RtpTransceiver nativeAddTransceiverWithTrack(long r1, org.webrtc.RtpTransceiver.RtpTransceiverInit r3);

    private native org.webrtc.RtpTransceiver nativeAddTransceiverOfType(org.webrtc.MediaStreamTrack.MediaType r1, org.webrtc.RtpTransceiver.RtpTransceiverInit r2);

    private native boolean nativeStartRtcEventLog(int r1, int r2);

    private native void nativeStopRtcEventLog();
}
