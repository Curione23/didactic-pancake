package moe.yushi.authlibinjector.util;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/util/UUIDUtils.class */
public final class UUIDUtils {
    public static java.lang.String toUnsignedUUID(java.util.UUID r4) {
            r0 = r4
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "-"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.replace(r1, r2)
            return r0
    }

    public static java.util.UUID fromUnsignedUUID(java.lang.String r5) {
            r0 = r5
            int r0 = r0.length()
            r1 = 32
            if (r0 != r1) goto L61
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r5
            r2 = 0
            r3 = 8
            java.lang.String r1 = r1.substring(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "-"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            r2 = 8
            r3 = 12
            java.lang.String r1 = r1.substring(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "-"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            r2 = 12
            r3 = 16
            java.lang.String r1 = r1.substring(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "-"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            r2 = 16
            r3 = 20
            java.lang.String r1 = r1.substring(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "-"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            r2 = 20
            r3 = 32
            java.lang.String r1 = r1.substring(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.util.UUID r0 = java.util.UUID.fromString(r0)
            return r0
        L61:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Invalid UUID: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    private UUIDUtils() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }
}
