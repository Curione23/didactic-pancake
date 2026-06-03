package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/SessionDescription.class */
public class SessionDescription {
    public final org.webrtc.SessionDescription.Type type;
    public final java.lang.String description;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/SessionDescription$Type.class */
    public enum Type extends java.lang.Enum<org.webrtc.SessionDescription.Type> {
        public static final org.webrtc.SessionDescription.Type OFFER = null;
        public static final org.webrtc.SessionDescription.Type PRANSWER = null;
        public static final org.webrtc.SessionDescription.Type ANSWER = null;
        public static final org.webrtc.SessionDescription.Type ROLLBACK = null;
        private static final /* synthetic */ org.webrtc.SessionDescription.Type[] $VALUES = null;

        public static org.webrtc.SessionDescription.Type[] values() {
                org.webrtc.SessionDescription$Type[] r0 = org.webrtc.SessionDescription.Type.$VALUES
                java.lang.Object r0 = r0.clone()
                org.webrtc.SessionDescription$Type[] r0 = (org.webrtc.SessionDescription.Type[]) r0
                return r0
        }

        public static org.webrtc.SessionDescription.Type valueOf(java.lang.String r3) {
                java.lang.Class<org.webrtc.SessionDescription$Type> r0 = org.webrtc.SessionDescription.Type.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                org.webrtc.SessionDescription$Type r0 = (org.webrtc.SessionDescription.Type) r0
                return r0
        }

        Type(java.lang.String r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        public java.lang.String canonicalForm() {
                r3 = this;
                r0 = r3
                java.lang.String r0 = r0.name()
                java.util.Locale r1 = java.util.Locale.US
                java.lang.String r0 = r0.toLowerCase(r1)
                return r0
        }

        @org.webrtc.CalledByNative("Type")
        public static org.webrtc.SessionDescription.Type fromCanonicalForm(java.lang.String r4) {
                java.lang.Class<org.webrtc.SessionDescription$Type> r0 = org.webrtc.SessionDescription.Type.class
                r1 = r4
                java.util.Locale r2 = java.util.Locale.US
                java.lang.String r1 = r1.toUpperCase(r2)
                java.lang.Enum r0 = valueOf(r0, r1)
                org.webrtc.SessionDescription$Type r0 = (org.webrtc.SessionDescription.Type) r0
                return r0
        }

        private static /* synthetic */ org.webrtc.SessionDescription.Type[] $values() {
                r0 = 4
                org.webrtc.SessionDescription$Type[] r0 = new org.webrtc.SessionDescription.Type[r0]
                r1 = r0
                r2 = 0
                org.webrtc.SessionDescription$Type r3 = org.webrtc.SessionDescription.Type.OFFER
                r1[r2] = r3
                r1 = r0
                r2 = 1
                org.webrtc.SessionDescription$Type r3 = org.webrtc.SessionDescription.Type.PRANSWER
                r1[r2] = r3
                r1 = r0
                r2 = 2
                org.webrtc.SessionDescription$Type r3 = org.webrtc.SessionDescription.Type.ANSWER
                r1[r2] = r3
                r1 = r0
                r2 = 3
                org.webrtc.SessionDescription$Type r3 = org.webrtc.SessionDescription.Type.ROLLBACK
                r1[r2] = r3
                return r0
        }

        static {
                org.webrtc.SessionDescription$Type r0 = new org.webrtc.SessionDescription$Type
                r1 = r0
                java.lang.String r2 = "OFFER"
                r3 = 0
                r1.<init>(r2, r3)
                org.webrtc.SessionDescription.Type.OFFER = r0
                org.webrtc.SessionDescription$Type r0 = new org.webrtc.SessionDescription$Type
                r1 = r0
                java.lang.String r2 = "PRANSWER"
                r3 = 1
                r1.<init>(r2, r3)
                org.webrtc.SessionDescription.Type.PRANSWER = r0
                org.webrtc.SessionDescription$Type r0 = new org.webrtc.SessionDescription$Type
                r1 = r0
                java.lang.String r2 = "ANSWER"
                r3 = 2
                r1.<init>(r2, r3)
                org.webrtc.SessionDescription.Type.ANSWER = r0
                org.webrtc.SessionDescription$Type r0 = new org.webrtc.SessionDescription$Type
                r1 = r0
                java.lang.String r2 = "ROLLBACK"
                r3 = 3
                r1.<init>(r2, r3)
                org.webrtc.SessionDescription.Type.ROLLBACK = r0
                org.webrtc.SessionDescription$Type[] r0 = $values()
                org.webrtc.SessionDescription.Type.$VALUES = r0
                return
        }
    }

    @org.webrtc.CalledByNative
    public SessionDescription(org.webrtc.SessionDescription.Type r4, java.lang.String r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.type = r1
            r0 = r3
            r1 = r5
            r0.description = r1
            return
    }

    @org.webrtc.CalledByNative
    java.lang.String getDescription() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.description
            return r0
    }

    @org.webrtc.CalledByNative
    java.lang.String getTypeInCanonicalForm() {
            r2 = this;
            r0 = r2
            org.webrtc.SessionDescription$Type r0 = r0.type
            java.lang.String r0 = r0.canonicalForm()
            return r0
    }
}
