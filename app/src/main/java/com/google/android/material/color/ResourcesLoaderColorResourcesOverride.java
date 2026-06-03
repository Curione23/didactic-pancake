package com.google.android.material.color;

/* JADX INFO: loaded from: classes.dex */
class ResourcesLoaderColorResourcesOverride implements com.google.android.material.color.ColorResourcesOverride {

    /* JADX INFO: renamed from: com.google.android.material.color.ResourcesLoaderColorResourcesOverride$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static class ResourcesLoaderColorResourcesOverrideSingleton {
        private static final com.google.android.material.color.ResourcesLoaderColorResourcesOverride INSTANCE = null;

        static {
                com.google.android.material.color.ResourcesLoaderColorResourcesOverride r0 = new com.google.android.material.color.ResourcesLoaderColorResourcesOverride
                r1 = 0
                r0.<init>(r1)
                com.google.android.material.color.ResourcesLoaderColorResourcesOverride.ResourcesLoaderColorResourcesOverrideSingleton.INSTANCE = r0
                return
        }

        private ResourcesLoaderColorResourcesOverrideSingleton() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ com.google.android.material.color.ResourcesLoaderColorResourcesOverride access$000() {
                com.google.android.material.color.ResourcesLoaderColorResourcesOverride r0 = com.google.android.material.color.ResourcesLoaderColorResourcesOverride.ResourcesLoaderColorResourcesOverrideSingleton.INSTANCE
                return r0
        }
    }

    private ResourcesLoaderColorResourcesOverride() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ ResourcesLoaderColorResourcesOverride(com.google.android.material.color.ResourcesLoaderColorResourcesOverride.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    static com.google.android.material.color.ColorResourcesOverride getInstance() {
            com.google.android.material.color.ResourcesLoaderColorResourcesOverride r0 = com.google.android.material.color.ResourcesLoaderColorResourcesOverride.ResourcesLoaderColorResourcesOverrideSingleton.access$000()
            return r0
    }

    @Override // com.google.android.material.color.ColorResourcesOverride
    public boolean applyIfPossible(android.content.Context r1, java.util.Map<java.lang.Integer, java.lang.Integer> r2) {
            r0 = this;
            boolean r2 = com.google.android.material.color.ResourcesLoaderUtils.addResourcesLoaderToContext(r1, r2)
            if (r2 == 0) goto Ld
            int r2 = com.google.android.material.R.style.ThemeOverlay_Material3_PersonalizedColors
            com.google.android.material.color.ThemeUtils.applyThemeOverlay(r1, r2)
            r1 = 1
            return r1
        Ld:
            r1 = 0
            return r1
    }

    @Override // com.google.android.material.color.ColorResourcesOverride
    public android.content.Context wrapContextIfPossible(android.content.Context r3, java.util.Map<java.lang.Integer, java.lang.Integer> r4) {
            r2 = this;
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = com.google.android.material.R.style.ThemeOverlay_Material3_PersonalizedColors
            r0.<init>(r3, r1)
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r0.applyOverrideConfiguration(r1)
            boolean r4 = com.google.android.material.color.ResourcesLoaderUtils.addResourcesLoaderToContext(r0, r4)
            if (r4 == 0) goto L16
            r3 = r0
        L16:
            return r3
    }
}
