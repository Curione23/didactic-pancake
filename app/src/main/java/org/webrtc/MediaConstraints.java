package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/MediaConstraints.class */
public class MediaConstraints {
    public final java.util.List<org.webrtc.MediaConstraints.KeyValuePair> mandatory;
    public final java.util.List<org.webrtc.MediaConstraints.KeyValuePair> optional;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/MediaConstraints$KeyValuePair.class */
    public static class KeyValuePair {
        private final java.lang.String key;
        private final java.lang.String value;

        public KeyValuePair(java.lang.String r4, java.lang.String r5) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.key = r1
                r0 = r3
                r1 = r5
                r0.value = r1
                return
        }

        @org.webrtc.CalledByNative("KeyValuePair")
        public java.lang.String getKey() {
                r2 = this;
                r0 = r2
                java.lang.String r0 = r0.key
                return r0
        }

        @org.webrtc.CalledByNative("KeyValuePair")
        public java.lang.String getValue() {
                r2 = this;
                r0 = r2
                java.lang.String r0 = r0.value
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                r0 = r3
                java.lang.String r0 = r0.key
                r1 = r3
                java.lang.String r1 = r1.value
                java.lang.String r0 = r0 + ": " + r1
                return r0
        }

        public boolean equals(@androidx.annotation.Nullable java.lang.Object r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                if (r0 != r1) goto L7
                r0 = 1
                return r0
            L7:
                r0 = r4
                if (r0 == 0) goto L16
                r0 = r3
                java.lang.Class r0 = r0.getClass()
                r1 = r4
                java.lang.Class r1 = r1.getClass()
                if (r0 == r1) goto L18
            L16:
                r0 = 0
                return r0
            L18:
                r0 = r4
                org.webrtc.MediaConstraints$KeyValuePair r0 = (org.webrtc.MediaConstraints.KeyValuePair) r0
                r5 = r0
                r0 = r3
                java.lang.String r0 = r0.key
                r1 = r5
                java.lang.String r1 = r1.key
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L3d
                r0 = r3
                java.lang.String r0 = r0.value
                r1 = r5
                java.lang.String r1 = r1.value
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L3d
                r0 = 1
                goto L3e
            L3d:
                r0 = 0
            L3e:
                return r0
        }

        public int hashCode() {
                r3 = this;
                r0 = r3
                java.lang.String r0 = r0.key
                int r0 = r0.hashCode()
                r1 = r3
                java.lang.String r1 = r1.value
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    public MediaConstraints() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.mandatory = r1
            r0 = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.optional = r1
            return
    }

    private static java.lang.String stringifyKeyValuePairList(java.util.List<org.webrtc.MediaConstraints.KeyValuePair> r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "["
            r1.<init>(r2)
            r5 = r0
            r0 = r4
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
        L11:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L3f
            r0 = r6
            java.lang.Object r0 = r0.next()
            org.webrtc.MediaConstraints$KeyValuePair r0 = (org.webrtc.MediaConstraints.KeyValuePair) r0
            r7 = r0
            r0 = r5
            int r0 = r0.length()
            r1 = 1
            if (r0 <= r1) goto L33
            r0 = r5
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
        L33:
            r0 = r5
            r1 = r7
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L11
        L3f:
            r0 = r5
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            r0 = r3
            java.util.List<org.webrtc.MediaConstraints$KeyValuePair> r0 = r0.mandatory
            java.lang.String r0 = stringifyKeyValuePairList(r0)
            r1 = r3
            java.util.List<org.webrtc.MediaConstraints$KeyValuePair> r1 = r1.optional
            java.lang.String r1 = stringifyKeyValuePairList(r1)
            java.lang.String r0 = "mandatory: " + r0 + ", optional: " + r1
            return r0
    }

    @org.webrtc.CalledByNative
    java.util.List<org.webrtc.MediaConstraints.KeyValuePair> getMandatory() {
            r2 = this;
            r0 = r2
            java.util.List<org.webrtc.MediaConstraints$KeyValuePair> r0 = r0.mandatory
            return r0
    }

    @org.webrtc.CalledByNative
    java.util.List<org.webrtc.MediaConstraints.KeyValuePair> getOptional() {
            r2 = this;
            r0 = r2
            java.util.List<org.webrtc.MediaConstraints$KeyValuePair> r0 = r0.optional
            return r0
    }
}
