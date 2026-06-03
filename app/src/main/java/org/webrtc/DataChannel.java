package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/DataChannel.class */
public class DataChannel {
    private long nativeDataChannel;
    private long nativeObserver;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/DataChannel$Buffer.class */
    public static class Buffer {
        public final java.nio.ByteBuffer data;
        public final boolean binary;

        @org.webrtc.CalledByNative("Buffer")
        public Buffer(java.nio.ByteBuffer r4, boolean r5) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.data = r1
                r0 = r3
                r1 = r5
                r0.binary = r1
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/DataChannel$Init.class */
    public static class Init {
        public boolean ordered;
        public int maxRetransmitTimeMs;
        public int maxRetransmits;
        public java.lang.String protocol;
        public boolean negotiated;
        public int id;

        public Init() {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = 1
                r0.ordered = r1
                r0 = r3
                r1 = -1
                r0.maxRetransmitTimeMs = r1
                r0 = r3
                r1 = -1
                r0.maxRetransmits = r1
                r0 = r3
                java.lang.String r1 = ""
                r0.protocol = r1
                r0 = r3
                r1 = -1
                r0.id = r1
                return
        }

        @org.webrtc.CalledByNative("Init")
        boolean getOrdered() {
                r2 = this;
                r0 = r2
                boolean r0 = r0.ordered
                return r0
        }

        @org.webrtc.CalledByNative("Init")
        int getMaxRetransmitTimeMs() {
                r2 = this;
                r0 = r2
                int r0 = r0.maxRetransmitTimeMs
                return r0
        }

        @org.webrtc.CalledByNative("Init")
        int getMaxRetransmits() {
                r2 = this;
                r0 = r2
                int r0 = r0.maxRetransmits
                return r0
        }

        @org.webrtc.CalledByNative("Init")
        java.lang.String getProtocol() {
                r2 = this;
                r0 = r2
                java.lang.String r0 = r0.protocol
                return r0
        }

        @org.webrtc.CalledByNative("Init")
        boolean getNegotiated() {
                r2 = this;
                r0 = r2
                boolean r0 = r0.negotiated
                return r0
        }

        @org.webrtc.CalledByNative("Init")
        int getId() {
                r2 = this;
                r0 = r2
                int r0 = r0.id
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/DataChannel$Observer.class */
    public interface Observer {
        @org.webrtc.CalledByNative("Observer")
        void onBufferedAmountChange(long r1);

        @org.webrtc.CalledByNative("Observer")
        void onStateChange();

        @org.webrtc.CalledByNative("Observer")
        void onMessage(org.webrtc.DataChannel.Buffer r1);
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/DataChannel$State.class */
    public enum State extends java.lang.Enum<org.webrtc.DataChannel.State> {
        public static final org.webrtc.DataChannel.State CONNECTING = null;
        public static final org.webrtc.DataChannel.State OPEN = null;
        public static final org.webrtc.DataChannel.State CLOSING = null;
        public static final org.webrtc.DataChannel.State CLOSED = null;
        private static final /* synthetic */ org.webrtc.DataChannel.State[] $VALUES = null;

        public static org.webrtc.DataChannel.State[] values() {
                org.webrtc.DataChannel$State[] r0 = org.webrtc.DataChannel.State.$VALUES
                java.lang.Object r0 = r0.clone()
                org.webrtc.DataChannel$State[] r0 = (org.webrtc.DataChannel.State[]) r0
                return r0
        }

        public static org.webrtc.DataChannel.State valueOf(java.lang.String r3) {
                java.lang.Class<org.webrtc.DataChannel$State> r0 = org.webrtc.DataChannel.State.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                org.webrtc.DataChannel$State r0 = (org.webrtc.DataChannel.State) r0
                return r0
        }

        State(java.lang.String r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        @org.webrtc.CalledByNative("State")
        static org.webrtc.DataChannel.State fromNativeIndex(int r3) {
                org.webrtc.DataChannel$State[] r0 = values()
                r1 = r3
                r0 = r0[r1]
                return r0
        }

        private static /* synthetic */ org.webrtc.DataChannel.State[] $values() {
                r0 = 4
                org.webrtc.DataChannel$State[] r0 = new org.webrtc.DataChannel.State[r0]
                r1 = r0
                r2 = 0
                org.webrtc.DataChannel$State r3 = org.webrtc.DataChannel.State.CONNECTING
                r1[r2] = r3
                r1 = r0
                r2 = 1
                org.webrtc.DataChannel$State r3 = org.webrtc.DataChannel.State.OPEN
                r1[r2] = r3
                r1 = r0
                r2 = 2
                org.webrtc.DataChannel$State r3 = org.webrtc.DataChannel.State.CLOSING
                r1[r2] = r3
                r1 = r0
                r2 = 3
                org.webrtc.DataChannel$State r3 = org.webrtc.DataChannel.State.CLOSED
                r1[r2] = r3
                return r0
        }

        static {
                org.webrtc.DataChannel$State r0 = new org.webrtc.DataChannel$State
                r1 = r0
                java.lang.String r2 = "CONNECTING"
                r3 = 0
                r1.<init>(r2, r3)
                org.webrtc.DataChannel.State.CONNECTING = r0
                org.webrtc.DataChannel$State r0 = new org.webrtc.DataChannel$State
                r1 = r0
                java.lang.String r2 = "OPEN"
                r3 = 1
                r1.<init>(r2, r3)
                org.webrtc.DataChannel.State.OPEN = r0
                org.webrtc.DataChannel$State r0 = new org.webrtc.DataChannel$State
                r1 = r0
                java.lang.String r2 = "CLOSING"
                r3 = 2
                r1.<init>(r2, r3)
                org.webrtc.DataChannel.State.CLOSING = r0
                org.webrtc.DataChannel$State r0 = new org.webrtc.DataChannel$State
                r1 = r0
                java.lang.String r2 = "CLOSED"
                r3 = 3
                r1.<init>(r2, r3)
                org.webrtc.DataChannel.State.CLOSED = r0
                org.webrtc.DataChannel$State[] r0 = $values()
                org.webrtc.DataChannel.State.$VALUES = r0
                return
        }
    }

    @org.webrtc.CalledByNative
    public DataChannel(long r5) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = r5
            r0.nativeDataChannel = r1
            return
    }

    public void registerObserver(org.webrtc.DataChannel.Observer r6) {
            r5 = this;
            r0 = r5
            r0.checkDataChannelExists()
            r0 = r5
            long r0 = r0.nativeObserver
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L15
            r0 = r5
            r1 = r5
            long r1 = r1.nativeObserver
            r0.nativeUnregisterObserver(r1)
        L15:
            r0 = r5
            r1 = r5
            r2 = r6
            long r1 = r1.nativeRegisterObserver(r2)
            r0.nativeObserver = r1
            return
    }

    public void unregisterObserver() {
            r4 = this;
            r0 = r4
            r0.checkDataChannelExists()
            r0 = r4
            r1 = r4
            long r1 = r1.nativeObserver
            r0.nativeUnregisterObserver(r1)
            r0 = r4
            r1 = 0
            r0.nativeObserver = r1
            return
    }

    public java.lang.String label() {
            r2 = this;
            r0 = r2
            r0.checkDataChannelExists()
            r0 = r2
            java.lang.String r0 = r0.nativeLabel()
            return r0
    }

    public int id() {
            r2 = this;
            r0 = r2
            r0.checkDataChannelExists()
            r0 = r2
            int r0 = r0.nativeId()
            return r0
    }

    public org.webrtc.DataChannel.State state() {
            r2 = this;
            r0 = r2
            r0.checkDataChannelExists()
            r0 = r2
            org.webrtc.DataChannel$State r0 = r0.nativeState()
            return r0
    }

    public long bufferedAmount() {
            r3 = this;
            r0 = r3
            r0.checkDataChannelExists()
            r0 = r3
            long r0 = r0.nativeBufferedAmount()
            return r0
    }

    public void close() {
            r2 = this;
            r0 = r2
            r0.checkDataChannelExists()
            r0 = r2
            r0.nativeClose()
            return
    }

    public boolean send(org.webrtc.DataChannel.Buffer r5) {
            r4 = this;
            r0 = r4
            r0.checkDataChannelExists()
            r0 = r5
            java.nio.ByteBuffer r0 = r0.data
            int r0 = r0.remaining()
            byte[] r0 = new byte[r0]
            r6 = r0
            r0 = r5
            java.nio.ByteBuffer r0 = r0.data
            r1 = r6
            java.nio.ByteBuffer r0 = r0.get(r1)
            r0 = r4
            r1 = r6
            r2 = r5
            boolean r2 = r2.binary
            boolean r0 = r0.nativeSend(r1, r2)
            return r0
    }

    public void dispose() {
            r4 = this;
            r0 = r4
            r0.checkDataChannelExists()
            r0 = r4
            long r0 = r0.nativeDataChannel
            org.webrtc.JniCommon.nativeReleaseRef(r0)
            r0 = r4
            r1 = 0
            r0.nativeDataChannel = r1
            return
    }

    @org.webrtc.CalledByNative
    long getNativeDataChannel() {
            r3 = this;
            r0 = r3
            long r0 = r0.nativeDataChannel
            return r0
    }

    private void checkDataChannelExists() {
            r5 = this;
            r0 = r5
            long r0 = r0.nativeDataChannel
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L13
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "DataChannel has been disposed."
            r1.<init>(r2)
            throw r0
        L13:
            return
    }

    private native long nativeRegisterObserver(org.webrtc.DataChannel.Observer r1);

    private native void nativeUnregisterObserver(long r1);

    private native java.lang.String nativeLabel();

    private native int nativeId();

    private native org.webrtc.DataChannel.State nativeState();

    private native long nativeBufferedAmount();

    private native void nativeClose();

    private native boolean nativeSend(byte[] r1, boolean r2);
}
