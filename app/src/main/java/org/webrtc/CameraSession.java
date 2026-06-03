package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/CameraSession.class */
interface CameraSession {

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/CameraSession$CreateSessionCallback.class */
    public interface CreateSessionCallback {
        void onDone(org.webrtc.CameraSession r1);

        void onFailure(org.webrtc.CameraSession.FailureType r1, java.lang.String r2);
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/CameraSession$Events.class */
    public interface Events {
        void onCameraOpening();

        void onCameraError(org.webrtc.CameraSession r1, java.lang.String r2);

        void onCameraDisconnected(org.webrtc.CameraSession r1);

        void onCameraClosed(org.webrtc.CameraSession r1);

        void onFrameCaptured(org.webrtc.CameraSession r1, org.webrtc.VideoFrame r2);
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/CameraSession$FailureType.class */
    public enum FailureType extends java.lang.Enum<org.webrtc.CameraSession.FailureType> {
        public static final org.webrtc.CameraSession.FailureType ERROR = null;
        public static final org.webrtc.CameraSession.FailureType DISCONNECTED = null;
        private static final /* synthetic */ org.webrtc.CameraSession.FailureType[] $VALUES = null;

        public static org.webrtc.CameraSession.FailureType[] values() {
                org.webrtc.CameraSession$FailureType[] r0 = org.webrtc.CameraSession.FailureType.$VALUES
                java.lang.Object r0 = r0.clone()
                org.webrtc.CameraSession$FailureType[] r0 = (org.webrtc.CameraSession.FailureType[]) r0
                return r0
        }

        public static org.webrtc.CameraSession.FailureType valueOf(java.lang.String r3) {
                java.lang.Class<org.webrtc.CameraSession$FailureType> r0 = org.webrtc.CameraSession.FailureType.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                org.webrtc.CameraSession$FailureType r0 = (org.webrtc.CameraSession.FailureType) r0
                return r0
        }

        FailureType(java.lang.String r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        private static /* synthetic */ org.webrtc.CameraSession.FailureType[] $values() {
                r0 = 2
                org.webrtc.CameraSession$FailureType[] r0 = new org.webrtc.CameraSession.FailureType[r0]
                r1 = r0
                r2 = 0
                org.webrtc.CameraSession$FailureType r3 = org.webrtc.CameraSession.FailureType.ERROR
                r1[r2] = r3
                r1 = r0
                r2 = 1
                org.webrtc.CameraSession$FailureType r3 = org.webrtc.CameraSession.FailureType.DISCONNECTED
                r1[r2] = r3
                return r0
        }

        static {
                org.webrtc.CameraSession$FailureType r0 = new org.webrtc.CameraSession$FailureType
                r1 = r0
                java.lang.String r2 = "ERROR"
                r3 = 0
                r1.<init>(r2, r3)
                org.webrtc.CameraSession.FailureType.ERROR = r0
                org.webrtc.CameraSession$FailureType r0 = new org.webrtc.CameraSession$FailureType
                r1 = r0
                java.lang.String r2 = "DISCONNECTED"
                r3 = 1
                r1.<init>(r2, r3)
                org.webrtc.CameraSession.FailureType.DISCONNECTED = r0
                org.webrtc.CameraSession$FailureType[] r0 = $values()
                org.webrtc.CameraSession.FailureType.$VALUES = r0
                return
        }
    }

    void stop();

    static int getDeviceOrientation(android.content.Context r3) {
            r0 = r3
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            r4 = r0
            r0 = r4
            android.view.Display r0 = r0.getDefaultDisplay()
            int r0 = r0.getRotation()
            switch(r0) {
                case 0: goto L3b;
                case 1: goto L30;
                case 2: goto L33;
                case 3: goto L37;
                default: goto L3b;
            }
        L30:
            r0 = 90
            return r0
        L33:
            r0 = 180(0xb4, float:2.52E-43)
            return r0
        L37:
            r0 = 270(0x10e, float:3.78E-43)
            return r0
        L3b:
            r0 = 0
            return r0
    }

    static org.webrtc.VideoFrame.TextureBuffer createTextureBufferWithModifiedTransformMatrix(org.webrtc.TextureBufferImpl r5, boolean r6, int r7) {
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r8
            r1 = 1056964608(0x3f000000, float:0.5)
            r2 = 1056964608(0x3f000000, float:0.5)
            boolean r0 = r0.preTranslate(r1, r2)
            r0 = r6
            if (r0 == 0) goto L1d
            r0 = r8
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = 1065353216(0x3f800000, float:1.0)
            boolean r0 = r0.preScale(r1, r2)
        L1d:
            r0 = r8
            r1 = r7
            float r1 = (float) r1
            boolean r0 = r0.preRotate(r1)
            r0 = r8
            r1 = -1090519040(0xffffffffbf000000, float:-0.5)
            r2 = -1090519040(0xffffffffbf000000, float:-0.5)
            boolean r0 = r0.preTranslate(r1, r2)
            r0 = r5
            r1 = r8
            r2 = r5
            int r2 = r2.getWidth()
            r3 = r5
            int r3 = r3.getHeight()
            org.webrtc.TextureBufferImpl r0 = r0.applyTransformMatrix(r1, r2, r3)
            return r0
    }
}
