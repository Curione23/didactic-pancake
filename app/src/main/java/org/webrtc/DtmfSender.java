package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/DtmfSender.class */
public class DtmfSender {
    private long nativeDtmfSender;

    public DtmfSender(long r5) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = r5
            r0.nativeDtmfSender = r1
            return
    }

    public boolean canInsertDtmf() {
            r3 = this;
            r0 = r3
            r0.checkDtmfSenderExists()
            r0 = r3
            long r0 = r0.nativeDtmfSender
            boolean r0 = nativeCanInsertDtmf(r0)
            return r0
    }

    public boolean insertDtmf(java.lang.String r7, int r8, int r9) {
            r6 = this;
            r0 = r6
            r0.checkDtmfSenderExists()
            r0 = r6
            long r0 = r0.nativeDtmfSender
            r1 = r7
            r2 = r8
            r3 = r9
            boolean r0 = nativeInsertDtmf(r0, r1, r2, r3)
            return r0
    }

    public java.lang.String tones() {
            r3 = this;
            r0 = r3
            r0.checkDtmfSenderExists()
            r0 = r3
            long r0 = r0.nativeDtmfSender
            java.lang.String r0 = nativeTones(r0)
            return r0
    }

    public int duration() {
            r3 = this;
            r0 = r3
            r0.checkDtmfSenderExists()
            r0 = r3
            long r0 = r0.nativeDtmfSender
            int r0 = nativeDuration(r0)
            return r0
    }

    public int interToneGap() {
            r3 = this;
            r0 = r3
            r0.checkDtmfSenderExists()
            r0 = r3
            long r0 = r0.nativeDtmfSender
            int r0 = nativeInterToneGap(r0)
            return r0
    }

    public void dispose() {
            r4 = this;
            r0 = r4
            r0.checkDtmfSenderExists()
            r0 = r4
            long r0 = r0.nativeDtmfSender
            org.webrtc.JniCommon.nativeReleaseRef(r0)
            r0 = r4
            r1 = 0
            r0.nativeDtmfSender = r1
            return
    }

    private void checkDtmfSenderExists() {
            r5 = this;
            r0 = r5
            long r0 = r0.nativeDtmfSender
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L13
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "DtmfSender has been disposed."
            r1.<init>(r2)
            throw r0
        L13:
            return
    }

    private static native boolean nativeCanInsertDtmf(long r0);

    private static native boolean nativeInsertDtmf(long r0, java.lang.String r2, int r3, int r4);

    private static native java.lang.String nativeTones(long r0);

    private static native int nativeDuration(long r0);

    private static native int nativeInterToneGap(long r0);
}
