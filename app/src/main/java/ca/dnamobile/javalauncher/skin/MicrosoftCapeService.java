package ca.dnamobile.javalauncher.skin;

/* JADX INFO: loaded from: classes.dex */
public final class MicrosoftCapeService {
    private static final java.lang.String ACTIVE_CAPE_URL = "https://api.minecraftservices.com/minecraft/profile/capes/active";
    private static final java.lang.String PROFILE_URL = "https://api.minecraftservices.com/minecraft/profile";

    public static final class CapeEntry {
        public final java.lang.String alias;
        public final java.lang.String id;
        public final java.lang.String state;
        public final java.lang.String url;

        private CapeEntry(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
                r0 = this;
                r0.<init>()
                r0.id = r1
                r0.alias = r2
                java.lang.String r1 = ca.dnamobile.javalauncher.skin.MicrosoftCapeService.m560$$Nest$smnormalizeTextureUrl(r3)
                r0.url = r1
                r0.state = r4
                return
        }

        /* synthetic */ CapeEntry(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, ca.dnamobile.javalauncher.skin.MicrosoftCapeService.CapeEntryIA r5) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        private static java.lang.String prettify(java.lang.String r10) {
                r0 = 95
                r1 = 32
                java.lang.String r0 = r10.replace(r0, r1)
                r2 = 45
                java.lang.String r0 = r0.replace(r2, r1)
                java.lang.String r0 = r0.trim()
                boolean r2 = r0.isEmpty()
                if (r2 == 0) goto L1b
                java.lang.String r10 = "Cape"
                return r10
            L1b:
                java.lang.String r2 = "\\s+"
                java.lang.String[] r0 = r0.split(r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                int r3 = r0.length
                r4 = 0
                r5 = r4
            L29:
                if (r5 >= r3) goto L61
                r6 = r0[r5]
                boolean r7 = r6.isEmpty()
                if (r7 == 0) goto L34
                goto L5e
            L34:
                int r7 = r2.length()
                if (r7 <= 0) goto L3d
                r2.append(r1)
            L3d:
                r7 = 1
                java.lang.String r8 = r6.substring(r4, r7)
                java.util.Locale r9 = java.util.Locale.ROOT
                java.lang.String r8 = r8.toUpperCase(r9)
                r2.append(r8)
                int r8 = r6.length()
                if (r8 <= r7) goto L5e
                java.lang.String r6 = r6.substring(r7)
                java.util.Locale r7 = java.util.Locale.ROOT
                java.lang.String r6 = r6.toLowerCase(r7)
                r2.append(r6)
            L5e:
                int r5 = r5 + 1
                goto L29
            L61:
                int r0 = r2.length()
                if (r0 != 0) goto L68
                goto L6c
            L68:
                java.lang.String r10 = r2.toString()
            L6c:
                return r10
        }

        public java.lang.String getDisplayName() {
                r1 = this;
                java.lang.String r0 = r1.alias
                java.lang.String r0 = r0.trim()
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L13
                java.lang.String r0 = r1.alias
                java.lang.String r0 = prettify(r0)
                return r0
            L13:
                java.lang.String r0 = r1.id
                java.lang.String r0 = prettify(r0)
                return r0
        }

        public boolean isActive() {
                r2 = this;
                java.lang.String r0 = "ACTIVE"
                java.lang.String r1 = r2.state
                boolean r0 = r0.equalsIgnoreCase(r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.skin.MicrosoftCapeService$CapeEntry-IA, reason: invalid class name */
    /* JADX INFO: compiled from: D8$$SyntheticClass */
    public final /* synthetic */ class CapeEntryIA {
    }

    public static final class Profile {
        public final java.util.List<ca.dnamobile.javalauncher.skin.MicrosoftCapeService.CapeEntry> capes;
        public final java.lang.String id;
        public final java.lang.String name;

        private Profile(java.lang.String r1, java.lang.String r2, java.util.List<ca.dnamobile.javalauncher.skin.MicrosoftCapeService.CapeEntry> r3) {
                r0 = this;
                r0.<init>()
                r0.id = r1
                r0.name = r2
                java.util.List r1 = java.util.Collections.unmodifiableList(r3)
                r0.capes = r1
                return
        }

        /* synthetic */ Profile(java.lang.String r1, java.lang.String r2, java.util.List r3, ca.dnamobile.javalauncher.skin.MicrosoftCapeService.ProfileIA r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        public ca.dnamobile.javalauncher.skin.MicrosoftCapeService.CapeEntry getActiveCape() {
                r3 = this;
                java.util.List<ca.dnamobile.javalauncher.skin.MicrosoftCapeService$CapeEntry> r0 = r3.capes
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L19
                java.lang.Object r1 = r0.next()
                ca.dnamobile.javalauncher.skin.MicrosoftCapeService$CapeEntry r1 = (ca.dnamobile.javalauncher.skin.MicrosoftCapeService.CapeEntry) r1
                boolean r2 = r1.isActive()
                if (r2 == 0) goto L6
                return r1
            L19:
                r0 = 0
                return r0
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.skin.MicrosoftCapeService$Profile-IA, reason: invalid class name */
    /* JADX INFO: compiled from: D8$$SyntheticClass */
    public final /* synthetic */ class ProfileIA {
    }

    /* JADX INFO: renamed from: -$$Nest$smnormalizeTextureUrl, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m560$$Nest$smnormalizeTextureUrl(java.lang.String r0) {
            java.lang.String r0 = normalizeTextureUrl(r0)
            return r0
    }

    private MicrosoftCapeService() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void activateCape(java.lang.String r2, java.lang.String r3) throws java.lang.Exception {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "capeId"
            r0.put(r1, r3)
            java.lang.String r3 = r0.toString()
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r3 = r3.getBytes(r0)
            java.lang.String r0 = "https://api.minecraftservices.com/minecraft/profile/capes/active"
            java.lang.String r1 = "PUT"
            java.net.HttpURLConnection r2 = openConnection(r0, r1, r2)
            java.lang.String r0 = "Content-Type"
            java.lang.String r1 = "application/json; charset=utf-8"
            r2.setRequestProperty(r0, r1)
            r0 = 1
            r2.setDoOutput(r0)
            java.io.OutputStream r0 = r2.getOutputStream()
            r0.write(r3)     // Catch: java.lang.Throwable -> L50
            if (r0 == 0) goto L33
            r0.close()
        L33:
            int r3 = r2.getResponseCode()
            java.lang.String r2 = readBody(r2, r3)
            r0 = 200(0xc8, float:2.8E-43)
            if (r3 < r0) goto L44
            r0 = 300(0x12c, float:4.2E-43)
            if (r3 >= r0) goto L44
            return
        L44:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unable to activate cape"
            java.lang.String r2 = buildError(r1, r3, r2)
            r0.<init>(r2)
            throw r0
        L50:
            r2 = move-exception
            if (r0 == 0) goto L5b
            r0.close()     // Catch: java.lang.Throwable -> L57
            goto L5b
        L57:
            r3 = move-exception
            r2.addSuppressed(r3)
        L5b:
            throw r2
    }

    private static java.lang.String buildError(java.lang.String r3, int r4, java.lang.String r5) {
            if (r5 != 0) goto L5
            java.lang.String r5 = ""
            goto L9
        L5:
            java.lang.String r5 = r5.trim()
        L9:
            int r0 = r5.length()
            r1 = 300(0x12c, float:4.2E-43)
            if (r0 <= r1) goto L29
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2 = 0
            java.lang.String r5 = r5.substring(r2, r1)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r0 = "..."
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
        L29:
            boolean r0 = r5.isEmpty()
            java.lang.String r1 = " (HTTP "
            if (r0 == 0) goto L4d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = ")"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            goto L6c
        L4d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = "): "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r3 = r3.toString()
        L6c:
            return r3
    }

    public static ca.dnamobile.javalauncher.skin.MicrosoftCapeService.Profile fetchProfile(java.lang.String r14) throws java.lang.Exception {
            java.lang.String r0 = "https://api.minecraftservices.com/minecraft/profile"
            java.lang.String r1 = "GET"
            java.net.HttpURLConnection r14 = openConnection(r0, r1, r14)
            int r0 = r14.getResponseCode()
            java.lang.String r14 = readBody(r14, r0)
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 < r1) goto L87
            r1 = 300(0x12c, float:4.2E-43)
            if (r0 >= r1) goto L87
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r14)
            java.lang.String r14 = "id"
            java.lang.String r1 = ""
            java.lang.String r2 = r0.optString(r14, r1)
            java.lang.String r3 = "name"
            java.lang.String r3 = r0.optString(r3, r1)
            java.lang.String r4 = "capes"
            org.json.JSONArray r0 = r0.optJSONArray(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r0 == 0) goto L80
            r5 = 0
        L39:
            int r6 = r0.length()
            if (r5 >= r6) goto L80
            org.json.JSONObject r6 = r0.optJSONObject(r5)
            if (r6 != 0) goto L46
            goto L7d
        L46:
            java.lang.String r7 = r6.optString(r14, r1)
            java.lang.String r9 = r7.trim()
            boolean r7 = r9.isEmpty()
            if (r7 == 0) goto L55
            goto L7d
        L55:
            ca.dnamobile.javalauncher.skin.MicrosoftCapeService$CapeEntry r7 = new ca.dnamobile.javalauncher.skin.MicrosoftCapeService$CapeEntry
            java.lang.String r8 = "alias"
            java.lang.String r8 = r6.optString(r8, r1)
            java.lang.String r10 = r8.trim()
            java.lang.String r8 = "url"
            java.lang.String r8 = r6.optString(r8, r1)
            java.lang.String r11 = r8.trim()
            java.lang.String r8 = "state"
            java.lang.String r6 = r6.optString(r8, r1)
            java.lang.String r12 = r6.trim()
            r13 = 0
            r8 = r7
            r8.<init>(r9, r10, r11, r12, r13)
            r4.add(r7)
        L7d:
            int r5 = r5 + 1
            goto L39
        L80:
            ca.dnamobile.javalauncher.skin.MicrosoftCapeService$Profile r14 = new ca.dnamobile.javalauncher.skin.MicrosoftCapeService$Profile
            r0 = 0
            r14.<init>(r2, r3, r4, r0)
            return r14
        L87:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unable to read Minecraft profile"
            java.lang.String r14 = buildError(r2, r0, r14)
            r1.<init>(r14)
            throw r1
    }

    public static void hideActiveCape(java.lang.String r3) throws java.lang.Exception {
            java.lang.String r0 = "https://api.minecraftservices.com/minecraft/profile/capes/active"
            java.lang.String r1 = "DELETE"
            java.net.HttpURLConnection r3 = openConnection(r0, r1, r3)
            int r0 = r3.getResponseCode()
            java.lang.String r3 = readBody(r3, r0)
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 < r1) goto L19
            r1 = 300(0x12c, float:4.2E-43)
            if (r0 >= r1) goto L19
            return
        L19:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unable to hide cape"
            java.lang.String r3 = buildError(r2, r0, r3)
            r1.<init>(r3)
            throw r1
    }

    private static java.lang.String normalizeTextureUrl(java.lang.String r3) {
            if (r3 != 0) goto L5
            java.lang.String r3 = ""
            return r3
        L5:
            java.lang.String r3 = r3.trim()
            java.lang.String r0 = "//"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "https:"
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            return r3
        L21:
            java.lang.String r0 = "http://textures.minecraft.net/"
            boolean r1 = r3.startsWith(r0)
            if (r1 == 0) goto L40
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "https://textures.minecraft.net/"
            r1.<init>(r2)
            int r0 = r0.length()
            java.lang.String r3 = r3.substring(r0)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
        L40:
            return r3
    }

    private static java.net.HttpURLConnection openConnection(java.lang.String r1, java.lang.String r2, java.lang.String r3) throws java.lang.Exception {
            java.net.URL r0 = new java.net.URL
            r0.<init>(r1)
            java.net.URLConnection r1 = r0.openConnection()
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1
            r1.setRequestMethod(r2)
            r2 = 15000(0x3a98, float:2.102E-41)
            r1.setConnectTimeout(r2)
            r2 = 20000(0x4e20, float:2.8026E-41)
            r1.setReadTimeout(r2)
            r2 = 0
            r1.setUseCaches(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "Bearer "
            r2.<init>(r0)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "Authorization"
            r1.setRequestProperty(r3, r2)
            java.lang.String r2 = "Accept"
            java.lang.String r3 = "application/json"
            r1.setRequestProperty(r2, r3)
            return r1
    }

    private static java.lang.String readBody(java.net.HttpURLConnection r4, int r5) {
            r0 = 200(0xc8, float:2.8E-43)
            java.lang.String r1 = ""
            if (r5 < r0) goto Lf
            r0 = 300(0x12c, float:4.2E-43)
            if (r5 >= r0) goto Lf
            java.io.InputStream r4 = r4.getInputStream()     // Catch: java.lang.Throwable -> L43
            goto L13
        Lf:
            java.io.InputStream r4 = r4.getErrorStream()     // Catch: java.lang.Throwable -> L43
        L13:
            if (r4 != 0) goto L16
            return r1
        L16:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            r5.<init>()     // Catch: java.lang.Throwable -> L43
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L43
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L43
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L43
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L43
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L43
        L27:
            java.lang.String r4 = r0.readLine()     // Catch: java.lang.Throwable -> L39
            if (r4 == 0) goto L31
            r5.append(r4)     // Catch: java.lang.Throwable -> L39
            goto L27
        L31:
            r0.close()     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L43
            return r4
        L39:
            r4 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L3e
            goto L42
        L3e:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch: java.lang.Throwable -> L43
        L42:
            throw r4     // Catch: java.lang.Throwable -> L43
        L43:
            return r1
    }
}
