package org.apache.commons.lang3.text;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public abstract class StrLookup<V> {
    private static final org.apache.commons.lang3.text.StrLookup<java.lang.String> NONE_LOOKUP = null;
    private static final org.apache.commons.lang3.text.StrLookup<java.lang.String> SYSTEM_PROPERTIES_LOOKUP = null;

    /* JADX INFO: renamed from: org.apache.commons.lang3.text.StrLookup$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static class MapStrLookup<V> extends org.apache.commons.lang3.text.StrLookup<V> {
        private final java.util.Map<java.lang.String, V> map;

        MapStrLookup(java.util.Map<java.lang.String, V> r1) {
                r0 = this;
                r0.<init>()
                r0.map = r1
                return
        }

        @Override // org.apache.commons.lang3.text.StrLookup
        public java.lang.String lookup(java.lang.String r3) {
                r2 = this;
                java.util.Map<java.lang.String, V> r0 = r2.map
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                java.lang.Object r3 = r0.get(r3)
                java.lang.String r3 = java.util.Objects.toString(r3, r1)
                return r3
        }
    }

    private static final class SystemPropertiesStrLookup extends org.apache.commons.lang3.text.StrLookup<java.lang.String> {
        private SystemPropertiesStrLookup() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ SystemPropertiesStrLookup(org.apache.commons.lang3.text.StrLookup.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.lang3.text.StrLookup
        public java.lang.String lookup(java.lang.String r1) {
                r0 = this;
                java.lang.String r1 = org.apache.commons.lang3.SystemProperties.getProperty(r1)
                return r1
        }
    }

    static {
            org.apache.commons.lang3.text.StrLookup$MapStrLookup r0 = new org.apache.commons.lang3.text.StrLookup$MapStrLookup
            r1 = 0
            r0.<init>(r1)
            org.apache.commons.lang3.text.StrLookup.NONE_LOOKUP = r0
            org.apache.commons.lang3.text.StrLookup$SystemPropertiesStrLookup r0 = new org.apache.commons.lang3.text.StrLookup$SystemPropertiesStrLookup
            r0.<init>(r1)
            org.apache.commons.lang3.text.StrLookup.SYSTEM_PROPERTIES_LOOKUP = r0
            return
    }

    protected StrLookup() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <V> org.apache.commons.lang3.text.StrLookup<V> mapLookup(java.util.Map<java.lang.String, V> r1) {
            org.apache.commons.lang3.text.StrLookup$MapStrLookup r0 = new org.apache.commons.lang3.text.StrLookup$MapStrLookup
            r0.<init>(r1)
            return r0
    }

    public static org.apache.commons.lang3.text.StrLookup<?> noneLookup() {
            org.apache.commons.lang3.text.StrLookup<java.lang.String> r0 = org.apache.commons.lang3.text.StrLookup.NONE_LOOKUP
            return r0
    }

    public static org.apache.commons.lang3.text.StrLookup<java.lang.String> systemPropertiesLookup() {
            org.apache.commons.lang3.text.StrLookup<java.lang.String> r0 = org.apache.commons.lang3.text.StrLookup.SYSTEM_PROPERTIES_LOOKUP
            return r0
    }

    public abstract java.lang.String lookup(java.lang.String r1);
}
