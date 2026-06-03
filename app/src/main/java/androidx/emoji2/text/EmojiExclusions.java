package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
class EmojiExclusions {

    private static class EmojiExclusions_Api34 {
        private EmojiExclusions_Api34() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.util.Set<int[]> getExclusions() {
                java.util.Set r0 = androidx.emoji2.text.EmojiExclusions.EmojiExclusions_Reflections.getExclusions()
                return r0
        }
    }

    private static class EmojiExclusions_Reflections {
        private EmojiExclusions_Reflections() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.util.Set<int[]> getExclusions() {
                java.lang.String r0 = "android.text.EmojiConsistency"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L36
                java.lang.String r1 = "getEmojiConsistencySet"
                r2 = 0
                java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L36
                java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch: java.lang.Throwable -> L36
                java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L36
                r2 = 0
                java.lang.Object r0 = r0.invoke(r2, r1)     // Catch: java.lang.Throwable -> L36
                if (r0 != 0) goto L1d
                java.util.Set r0 = java.util.Collections.emptySet()     // Catch: java.lang.Throwable -> L36
                return r0
            L1d:
                java.util.Set r0 = (java.util.Set) r0     // Catch: java.lang.Throwable -> L36
                java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L36
            L23:
                boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L36
                if (r2 == 0) goto L35
                java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L36
                boolean r2 = r2 instanceof int[]     // Catch: java.lang.Throwable -> L36
                if (r2 != 0) goto L23
                java.util.Set r0 = java.util.Collections.emptySet()     // Catch: java.lang.Throwable -> L36
            L35:
                return r0
            L36:
                java.util.Set r0 = java.util.Collections.emptySet()
                return r0
        }
    }

    private EmojiExclusions() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.util.Set<int[]> getEmojiExclusions() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            java.util.Set r0 = androidx.emoji2.text.EmojiExclusions.EmojiExclusions_Api34.getExclusions()
            return r0
        Lb:
            java.util.Set r0 = androidx.emoji2.text.EmojiExclusions.EmojiExclusions_Reflections.getExclusions()
            return r0
    }
}
