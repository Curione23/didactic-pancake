package org.apache.commons.lang3.time;

/* JADX INFO: loaded from: classes2.dex */
public class TimeZones {
    public static final java.util.TimeZone GMT = null;
    public static final java.lang.String GMT_ID = "GMT";

    /* JADX INFO: renamed from: $r8$lambda$oqniJWQ17vthcW-_7ixdu539rks, reason: not valid java name */
    public static /* synthetic */ java.util.TimeZone m2678$r8$lambda$oqniJWQ17vthcW_7ixdu539rks() {
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()
            return r0
    }

    static {
            java.lang.String r0 = "GMT"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            org.apache.commons.lang3.time.TimeZones.GMT = r0
            return
    }

    private TimeZones() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.TimeZone toTimeZone(java.util.TimeZone r1) {
            org.apache.commons.lang3.time.TimeZones$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.time.TimeZones$$ExternalSyntheticLambda0
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.lang3.ObjectUtils.getIfNull(r1, r0)
            java.util.TimeZone r1 = (java.util.TimeZone) r1
            return r1
    }
}
