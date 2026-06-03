package androidx.browser.trusted;

/* JADX INFO: loaded from: classes.dex */
public interface TrustedWebActivityDisplayMode {
    public static final java.lang.String KEY_ID = "androidx.browser.trusted.displaymode.KEY_ID";

    public static class DefaultMode implements androidx.browser.trusted.TrustedWebActivityDisplayMode {
        private static final int ID = 0;

        public DefaultMode() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.browser.trusted.TrustedWebActivityDisplayMode
        public android.os.Bundle toBundle() {
                r3 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "androidx.browser.trusted.displaymode.KEY_ID"
                r2 = 0
                r0.putInt(r1, r2)
                return r0
        }
    }

    public static class ImmersiveMode implements androidx.browser.trusted.TrustedWebActivityDisplayMode {
        private static final int ID = 1;
        public static final java.lang.String KEY_CUTOUT_MODE = "androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE";
        public static final java.lang.String KEY_STICKY = "androidx.browser.trusted.displaymode.KEY_STICKY";
        private final boolean mIsSticky;
        private final int mLayoutInDisplayCutoutMode;

        public ImmersiveMode(boolean r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.mIsSticky = r1
                r0.mLayoutInDisplayCutoutMode = r2
                return
        }

        static androidx.browser.trusted.TrustedWebActivityDisplayMode fromBundle(android.os.Bundle r3) {
                androidx.browser.trusted.TrustedWebActivityDisplayMode$ImmersiveMode r0 = new androidx.browser.trusted.TrustedWebActivityDisplayMode$ImmersiveMode
                java.lang.String r1 = "androidx.browser.trusted.displaymode.KEY_STICKY"
                boolean r1 = r3.getBoolean(r1)
                java.lang.String r2 = "androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE"
                int r3 = r3.getInt(r2)
                r0.<init>(r1, r3)
                return r0
        }

        public boolean isSticky() {
                r1 = this;
                boolean r0 = r1.mIsSticky
                return r0
        }

        public int layoutInDisplayCutoutMode() {
                r1 = this;
                int r0 = r1.mLayoutInDisplayCutoutMode
                return r0
        }

        @Override // androidx.browser.trusted.TrustedWebActivityDisplayMode
        public android.os.Bundle toBundle() {
                r3 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "androidx.browser.trusted.displaymode.KEY_ID"
                r2 = 1
                r0.putInt(r1, r2)
                java.lang.String r1 = "androidx.browser.trusted.displaymode.KEY_STICKY"
                boolean r2 = r3.mIsSticky
                r0.putBoolean(r1, r2)
                java.lang.String r1 = "androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE"
                int r2 = r3.mLayoutInDisplayCutoutMode
                r0.putInt(r1, r2)
                return r0
        }
    }

    static androidx.browser.trusted.TrustedWebActivityDisplayMode fromBundle(android.os.Bundle r2) {
            java.lang.String r0 = "androidx.browser.trusted.displaymode.KEY_ID"
            int r0 = r2.getInt(r0)
            r1 = 1
            if (r0 == r1) goto Lf
            androidx.browser.trusted.TrustedWebActivityDisplayMode$DefaultMode r2 = new androidx.browser.trusted.TrustedWebActivityDisplayMode$DefaultMode
            r2.<init>()
            return r2
        Lf:
            androidx.browser.trusted.TrustedWebActivityDisplayMode r2 = androidx.browser.trusted.TrustedWebActivityDisplayMode.ImmersiveMode.fromBundle(r2)
            return r2
    }

    android.os.Bundle toBundle();
}
