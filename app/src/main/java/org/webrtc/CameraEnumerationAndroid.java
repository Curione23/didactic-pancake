package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/CameraEnumerationAndroid.class */
public class CameraEnumerationAndroid {
    private static final java.lang.String TAG = "CameraEnumerationAndroid";
    static final java.util.ArrayList<org.webrtc.Size> COMMON_RESOLUTIONS = null;



    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/CameraEnumerationAndroid$CaptureFormat.class */
    public static class CaptureFormat {
        public final int width;
        public final int height;
        public final org.webrtc.CameraEnumerationAndroid.CaptureFormat.FramerateRange framerate;
        public final int imageFormat = 17;

        /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange.class */
        public static class FramerateRange {
            public int min;
            public int max;

            public FramerateRange(int r4, int r5) {
                    r3 = this;
                    r0 = r3
                    r0.<init>()
                    r0 = r3
                    r1 = r4
                    r0.min = r1
                    r0 = r3
                    r1 = r5
                    r0.max = r1
                    return
            }

            public java.lang.String toString() {
                    r4 = this;
                    r0 = r4
                    int r0 = r0.min
                    float r0 = (float) r0
                    r1 = 1148846080(0x447a0000, float:1000.0)
                    float r0 = r0 / r1
                    r1 = r4
                    int r1 = r1.max
                    float r1 = (float) r1
                    r2 = 1148846080(0x447a0000, float:1000.0)
                    float r1 = r1 / r2
                    java.lang.String r0 = "[" + r0 + ":" + r1 + "]"
                    return r0
            }

            public boolean equals(java.lang.Object r4) {
                    r3 = this;
                    r0 = r4
                    boolean r0 = r0 instanceof org.webrtc.CameraEnumerationAndroid.CaptureFormat.FramerateRange
                    if (r0 != 0) goto L9
                    r0 = 0
                    return r0
                L9:
                    r0 = r4
                    org.webrtc.CameraEnumerationAndroid$CaptureFormat$FramerateRange r0 = (org.webrtc.CameraEnumerationAndroid.CaptureFormat.FramerateRange) r0
                    r5 = r0
                    r0 = r3
                    int r0 = r0.min
                    r1 = r5
                    int r1 = r1.min
                    if (r0 != r1) goto L28
                    r0 = r3
                    int r0 = r0.max
                    r1 = r5
                    int r1 = r1.max
                    if (r0 != r1) goto L28
                    r0 = 1
                    goto L29
                L28:
                    r0 = 0
                L29:
                    return r0
            }

            public int hashCode() {
                    r4 = this;
                    r0 = 1
                    r1 = 65537(0x10001, float:9.1837E-41)
                    r2 = r4
                    int r2 = r2.min
                    int r1 = r1 * r2
                    int r0 = r0 + r1
                    r1 = r4
                    int r1 = r1.max
                    int r0 = r0 + r1
                    return r0
            }
        }

        public CaptureFormat(int r7, int r8, int r9, int r10) {
                r6 = this;
                r0 = r6
                r0.<init>()
                r0 = r6
                r1 = 17
                r0.imageFormat = r1
                r0 = r6
                r1 = r7
                r0.width = r1
                r0 = r6
                r1 = r8
                r0.height = r1
                r0 = r6
                org.webrtc.CameraEnumerationAndroid$CaptureFormat$FramerateRange r1 = new org.webrtc.CameraEnumerationAndroid$CaptureFormat$FramerateRange
                r2 = r1
                r3 = r9
                r4 = r10
                r2.<init>(r3, r4)
                r0.framerate = r1
                return
        }

        public CaptureFormat(int r4, int r5, org.webrtc.CameraEnumerationAndroid.CaptureFormat.FramerateRange r6) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = 17
                r0.imageFormat = r1
                r0 = r3
                r1 = r4
                r0.width = r1
                r0 = r3
                r1 = r5
                r0.height = r1
                r0 = r3
                r1 = r6
                r0.framerate = r1
                return
        }

        public int frameSize() {
                r4 = this;
                r0 = r4
                int r0 = r0.width
                r1 = r4
                int r1 = r1.height
                r2 = 17
                int r0 = frameSize(r0, r1, r2)
                return r0
        }

        public static int frameSize(int r4, int r5, int r6) {
                r0 = r6
                r1 = 17
                if (r0 == r1) goto L10
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r1 = r0
                java.lang.String r2 = "Don't know how to calculate the frame size of non-NV21 image formats."
                r1.<init>(r2)
                throw r0
            L10:
                r0 = r4
                r1 = r5
                int r0 = r0 * r1
                r1 = r6
                int r1 = android.graphics.ImageFormat.getBitsPerPixel(r1)
                int r0 = r0 * r1
                r1 = 8
                int r0 = r0 / r1
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                r0 = r4
                int r0 = r0.width
                r1 = r4
                int r1 = r1.height
                r2 = r4
                org.webrtc.CameraEnumerationAndroid$CaptureFormat$FramerateRange r2 = r2.framerate
                java.lang.String r0 = r0 + "x" + r1 + "@" + r2
                return r0
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                r0 = r4
                boolean r0 = r0 instanceof org.webrtc.CameraEnumerationAndroid.CaptureFormat
                if (r0 != 0) goto L9
                r0 = 0
                return r0
            L9:
                r0 = r4
                org.webrtc.CameraEnumerationAndroid$CaptureFormat r0 = (org.webrtc.CameraEnumerationAndroid.CaptureFormat) r0
                r5 = r0
                r0 = r3
                int r0 = r0.width
                r1 = r5
                int r1 = r1.width
                if (r0 != r1) goto L36
                r0 = r3
                int r0 = r0.height
                r1 = r5
                int r1 = r1.height
                if (r0 != r1) goto L36
                r0 = r3
                org.webrtc.CameraEnumerationAndroid$CaptureFormat$FramerateRange r0 = r0.framerate
                r1 = r5
                org.webrtc.CameraEnumerationAndroid$CaptureFormat$FramerateRange r1 = r1.framerate
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L36
                r0 = 1
                goto L37
            L36:
                r0 = 0
            L37:
                return r0
        }

        public int hashCode() {
                r4 = this;
                r0 = 1
                r1 = r4
                int r1 = r1.width
                r2 = 65497(0xffd9, float:9.1781E-41)
                int r1 = r1 * r2
                r2 = r4
                int r2 = r2.height
                int r1 = r1 + r2
                r2 = 251(0xfb, float:3.52E-43)
                int r1 = r1 * r2
                int r0 = r0 + r1
                r1 = r4
                org.webrtc.CameraEnumerationAndroid$CaptureFormat$FramerateRange r1 = r1.framerate
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/CameraEnumerationAndroid$ClosestComparator.class */
    private static abstract class ClosestComparator<T> implements java.util.Comparator<T> {
        private ClosestComparator() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        abstract int diff(T r1);

        @Override // java.util.Comparator
        public int compare(T r5, T r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                int r0 = r0.diff(r1)
                r1 = r4
                r2 = r6
                int r1 = r1.diff(r2)
                int r0 = r0 - r1
                return r0
        }
    }

    public CameraEnumerationAndroid() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static org.webrtc.CameraEnumerationAndroid.CaptureFormat.FramerateRange getClosestSupportedFramerateRange(java.util.List<org.webrtc.CameraEnumerationAndroid.CaptureFormat.FramerateRange> r5, int r6) {
            r0 = r5
            org.webrtc.CameraEnumerationAndroid$1 r1 = new org.webrtc.CameraEnumerationAndroid$1
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            java.lang.Object r0 = java.util.Collections.min(r0, r1)
            org.webrtc.CameraEnumerationAndroid$CaptureFormat$FramerateRange r0 = (org.webrtc.CameraEnumerationAndroid.CaptureFormat.FramerateRange) r0
            return r0
    }

    public static org.webrtc.Size getClosestSupportedSize(java.util.List<org.webrtc.Size> r6, int r7, int r8) {
            r0 = r6
            org.webrtc.CameraEnumerationAndroid$2 r1 = new org.webrtc.CameraEnumerationAndroid$2
            r2 = r1
            r3 = r7
            r4 = r8
            r2.<init>(r3, r4)
            java.lang.Object r0 = java.util.Collections.min(r0, r1)
            org.webrtc.Size r0 = (org.webrtc.Size) r0
            return r0
    }

    static void reportCameraResolution(org.webrtc.Histogram r4, org.webrtc.Size r5) {
            java.util.ArrayList<org.webrtc.Size> r0 = org.webrtc.CameraEnumerationAndroid.COMMON_RESOLUTIONS
            r1 = r5
            int r0 = r0.indexOf(r1)
            r6 = r0
            r0 = r4
            r1 = r6
            r2 = 1
            int r1 = r1 + r2
            r0.addSample(r1)
            return
    }

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = 20
            org.webrtc.Size[] r2 = new org.webrtc.Size[r2]
            r3 = r2
            r4 = 0
            org.webrtc.Size r5 = new org.webrtc.Size
            r6 = r5
            r7 = 160(0xa0, float:2.24E-43)
            r8 = 120(0x78, float:1.68E-43)
            r6.<init>(r7, r8)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            org.webrtc.Size r5 = new org.webrtc.Size
            r6 = r5
            r7 = 240(0xf0, float:3.36E-43)
            r8 = 160(0xa0, float:2.24E-43)
            r6.<init>(r7, r8)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            org.webrtc.Size r5 = new org.webrtc.Size
            r6 = r5
            r7 = 320(0x140, float:4.48E-43)
            r8 = 240(0xf0, float:3.36E-43)
            r6.<init>(r7, r8)
            r3[r4] = r5
            r3 = r2
            r4 = 3
            org.webrtc.Size r5 = new org.webrtc.Size
            r6 = r5
            r7 = 400(0x190, float:5.6E-43)
            r8 = 240(0xf0, float:3.36E-43)
            r6.<init>(r7, r8)
            r3[r4] = r5
            r3 = r2
            r4 = 4
            org.webrtc.Size r5 = new org.webrtc.Size
            r6 = r5
            r7 = 480(0x1e0, float:6.73E-43)
            r8 = 320(0x140, float:4.48E-43)
            r6.<init>(r7, r8)
            r3[r4] = r5
            r3 = r2
            r4 = 5
            org.webrtc.Size r5 = new org.webrtc.Size
            r6 = r5
            r7 = 640(0x280, float:8.97E-43)
            r8 = 360(0x168, float:5.04E-43)
            r6.<init>(r7, r8)
            r3[r4] = r5
            r3 = r2
            r4 = 6
            org.webrtc.Size r5 = new org.webrtc.Size
            r6 = r5
            r7 = 640(0x280, float:8.97E-43)
            r8 = 480(0x1e0, float:6.73E-43)
            r6.<init>(r7, r8)
            r3[r4] = r5
            r3 = r2
            r4 = 7
            org.webrtc.Size r5 = new org.webrtc.Size
            r6 = r5
            r7 = 768(0x300, float:1.076E-42)
            r8 = 480(0x1e0, float:6.73E-43)
            r6.<init>(r7, r8)
            r3[r4] = r5
            r3 = r2
            r4 = 8
            org.webrtc.Size r5 = new org.webrtc.Size
            r6 = r5
            r7 = 854(0x356, float:1.197E-42)
            r8 = 480(0x1e0, float:6.73E-43)
            r6.<init>(r7, r8)
            r3[r4] = r5
            r3 = r2
            r4 = 9
            org.webrtc.Size r5 = new org.webrtc.Size
            r6 = r5
            r7 = 800(0x320, float:1.121E-42)
            r8 = 600(0x258, float:8.41E-43)
            r6.<init>(r7, r8)
            r3[r4] = r5
            r3 = r2
            r4 = 10
            org.webrtc.Size r5 = new org.webrtc.Size
            r6 = r5
            r7 = 960(0x3c0, float:1.345E-42)
            r8 = 540(0x21c, float:7.57E-43)
            r6.<init>(r7, r8)
            r3[r4] = r5
            r3 = r2
            r4 = 11
            org.webrtc.Size r5 = new org.webrtc.Size
            r6 = r5
            r7 = 960(0x3c0, float:1.345E-42)
            r8 = 640(0x280, float:8.97E-43)
            r6.<init>(r7, r8)
            r3[r4] = r5
            r3 = r2
            r4 = 12
            org.webrtc.Size r5 = new org.webrtc.Size
            r6 = r5
            r7 = 1024(0x400, float:1.435E-42)
            r8 = 576(0x240, float:8.07E-43)
            r6.<init>(r7, r8)
            r3[r4] = r5
            r3 = r2
            r4 = 13
            org.webrtc.Size r5 = new org.webrtc.Size
            r6 = r5
            r7 = 1024(0x400, float:1.435E-42)
            r8 = 600(0x258, float:8.41E-43)
            r6.<init>(r7, r8)
            r3[r4] = r5
            r3 = r2
            r4 = 14
            org.webrtc.Size r5 = new org.webrtc.Size
            r6 = r5
            r7 = 1280(0x500, float:1.794E-42)
            r8 = 720(0x2d0, float:1.009E-42)
            r6.<init>(r7, r8)
            r3[r4] = r5
            r3 = r2
            r4 = 15
            org.webrtc.Size r5 = new org.webrtc.Size
            r6 = r5
            r7 = 1280(0x500, float:1.794E-42)
            r8 = 1024(0x400, float:1.435E-42)
            r6.<init>(r7, r8)
            r3[r4] = r5
            r3 = r2
            r4 = 16
            org.webrtc.Size r5 = new org.webrtc.Size
            r6 = r5
            r7 = 1920(0x780, float:2.69E-42)
            r8 = 1080(0x438, float:1.513E-42)
            r6.<init>(r7, r8)
            r3[r4] = r5
            r3 = r2
            r4 = 17
            org.webrtc.Size r5 = new org.webrtc.Size
            r6 = r5
            r7 = 1920(0x780, float:2.69E-42)
            r8 = 1440(0x5a0, float:2.018E-42)
            r6.<init>(r7, r8)
            r3[r4] = r5
            r3 = r2
            r4 = 18
            org.webrtc.Size r5 = new org.webrtc.Size
            r6 = r5
            r7 = 2560(0xa00, float:3.587E-42)
            r8 = 1440(0x5a0, float:2.018E-42)
            r6.<init>(r7, r8)
            r3[r4] = r5
            r3 = r2
            r4 = 19
            org.webrtc.Size r5 = new org.webrtc.Size
            r6 = r5
            r7 = 3840(0xf00, float:5.381E-42)
            r8 = 2160(0x870, float:3.027E-42)
            r6.<init>(r7, r8)
            r3[r4] = r5
            java.util.List r2 = java.util.Arrays.asList(r2)
            r1.<init>(r2)
            org.webrtc.CameraEnumerationAndroid.COMMON_RESOLUTIONS = r0
            return
    }
}
