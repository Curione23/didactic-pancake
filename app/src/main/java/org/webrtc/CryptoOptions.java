package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/CryptoOptions.class */
public final class CryptoOptions {
    private final org.webrtc.CryptoOptions.Srtp srtp;
    private final org.webrtc.CryptoOptions.SFrame sframe;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/CryptoOptions$Builder.class */
    public static class Builder {
        private boolean enableGcmCryptoSuites;
        private boolean enableAes128Sha1_32CryptoCipher;
        private boolean enableEncryptedRtpHeaderExtensions;
        private boolean requireFrameEncryption;

        private Builder() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        public org.webrtc.CryptoOptions.Builder setEnableGcmCryptoSuites(boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.enableGcmCryptoSuites = r1
                r0 = r3
                return r0
        }

        public org.webrtc.CryptoOptions.Builder setEnableAes128Sha1_32CryptoCipher(boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.enableAes128Sha1_32CryptoCipher = r1
                r0 = r3
                return r0
        }

        public org.webrtc.CryptoOptions.Builder setEnableEncryptedRtpHeaderExtensions(boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.enableEncryptedRtpHeaderExtensions = r1
                r0 = r3
                return r0
        }

        public org.webrtc.CryptoOptions.Builder setRequireFrameEncryption(boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.requireFrameEncryption = r1
                r0 = r3
                return r0
        }

        public org.webrtc.CryptoOptions createCryptoOptions() {
                r7 = this;
                org.webrtc.CryptoOptions r0 = new org.webrtc.CryptoOptions
                r1 = r0
                r2 = r7
                boolean r2 = r2.enableGcmCryptoSuites
                r3 = r7
                boolean r3 = r3.enableAes128Sha1_32CryptoCipher
                r4 = r7
                boolean r4 = r4.enableEncryptedRtpHeaderExtensions
                r5 = r7
                boolean r5 = r5.requireFrameEncryption
                r1.<init>(r2, r3, r4, r5)
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/CryptoOptions$SFrame.class */
    public final class SFrame {
        private final boolean requireFrameEncryption;
        final /* synthetic */ org.webrtc.CryptoOptions this$0;

        private SFrame(org.webrtc.CryptoOptions r4, boolean r5) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.this$0 = r1
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r5
                r0.requireFrameEncryption = r1
                return
        }

        @org.webrtc.CalledByNative("SFrame")
        public boolean getRequireFrameEncryption() {
                r2 = this;
                r0 = r2
                boolean r0 = r0.requireFrameEncryption
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/CryptoOptions$Srtp.class */
    public final class Srtp {
        private final boolean enableGcmCryptoSuites;
        private final boolean enableAes128Sha1_32CryptoCipher;
        private final boolean enableEncryptedRtpHeaderExtensions;
        final /* synthetic */ org.webrtc.CryptoOptions this$0;

        private Srtp(org.webrtc.CryptoOptions r4, boolean r5, boolean r6, boolean r7) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.this$0 = r1
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r5
                r0.enableGcmCryptoSuites = r1
                r0 = r3
                r1 = r6
                r0.enableAes128Sha1_32CryptoCipher = r1
                r0 = r3
                r1 = r7
                r0.enableEncryptedRtpHeaderExtensions = r1
                return
        }

        @org.webrtc.CalledByNative("Srtp")
        public boolean getEnableGcmCryptoSuites() {
                r2 = this;
                r0 = r2
                boolean r0 = r0.enableGcmCryptoSuites
                return r0
        }

        @org.webrtc.CalledByNative("Srtp")
        public boolean getEnableAes128Sha1_32CryptoCipher() {
                r2 = this;
                r0 = r2
                boolean r0 = r0.enableAes128Sha1_32CryptoCipher
                return r0
        }

        @org.webrtc.CalledByNative("Srtp")
        public boolean getEnableEncryptedRtpHeaderExtensions() {
                r2 = this;
                r0 = r2
                boolean r0 = r0.enableEncryptedRtpHeaderExtensions
                return r0
        }
    }

    private CryptoOptions(boolean r9, boolean r10, boolean r11, boolean r12) {
            r8 = this;
            r0 = r8
            r0.<init>()
            r0 = r8
            org.webrtc.CryptoOptions$Srtp r1 = new org.webrtc.CryptoOptions$Srtp
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r2.<init>(r3, r4, r5, r6)
            r0.srtp = r1
            r0 = r8
            org.webrtc.CryptoOptions$SFrame r1 = new org.webrtc.CryptoOptions$SFrame
            r2 = r1
            r3 = r8
            r4 = r12
            r2.<init>(r3, r4)
            r0.sframe = r1
            return
    }

    public static org.webrtc.CryptoOptions.Builder builder() {
            org.webrtc.CryptoOptions$Builder r0 = new org.webrtc.CryptoOptions$Builder
            r1 = r0
            r1.<init>()
            return r0
    }

    @org.webrtc.CalledByNative
    public org.webrtc.CryptoOptions.Srtp getSrtp() {
            r2 = this;
            r0 = r2
            org.webrtc.CryptoOptions$Srtp r0 = r0.srtp
            return r0
    }

    @org.webrtc.CalledByNative
    public org.webrtc.CryptoOptions.SFrame getSFrame() {
            r2 = this;
            r0 = r2
            org.webrtc.CryptoOptions$SFrame r0 = r0.sframe
            return r0
    }
}
