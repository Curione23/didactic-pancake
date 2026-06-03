package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes2.dex */
public class RuntimeEnvironment {
    @java.lang.Deprecated
    public RuntimeEnvironment() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.Boolean containsLine(java.lang.String r2, java.lang.String r3) {
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch: java.io.IOException -> L2a
            java.nio.file.Path r2 = java.nio.file.Paths.get(r2, r1)     // Catch: java.io.IOException -> L2a
            java.util.stream.Stream r2 = java.nio.file.Files.lines(r2)     // Catch: java.io.IOException -> L2a
            org.apache.commons.lang3.RuntimeEnvironment$$ExternalSyntheticLambda0 r1 = new org.apache.commons.lang3.RuntimeEnvironment$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L1e
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L1e
            boolean r3 = r2.anyMatch(r1)     // Catch: java.lang.Throwable -> L1e
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L1d
            r2.close()     // Catch: java.io.IOException -> L2a
        L1d:
            return r3
        L1e:
            r3 = move-exception
            if (r2 == 0) goto L29
            r2.close()     // Catch: java.lang.Throwable -> L25
            goto L29
        L25:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch: java.io.IOException -> L2a
        L29:
            throw r3     // Catch: java.io.IOException -> L2a
        L2a:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
    }

    public static java.lang.Boolean inContainer() {
            java.lang.Boolean r0 = inDocker()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L17
            java.lang.Boolean r0 = inPodman()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            goto L18
        L17:
            r0 = 1
        L18:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    static java.lang.Boolean inDocker() {
            java.lang.String r0 = "/proc/1/cgroup"
            java.lang.String r1 = "/docker"
            java.lang.Boolean r0 = containsLine(r0, r1)
            return r0
    }

    static java.lang.Boolean inPodman() {
            java.lang.String r0 = "/proc/1/environ"
            java.lang.String r1 = "container=podman"
            java.lang.Boolean r0 = containsLine(r0, r1)
            return r0
    }

    static java.lang.Boolean inWsl() {
            java.lang.String r0 = "/proc/1/environ"
            java.lang.String r1 = "container=wslcontainer_host_id"
            java.lang.Boolean r0 = containsLine(r0, r1)
            return r0
    }

    static /* synthetic */ boolean lambda$containsLine$0(java.lang.String r0, java.lang.String r1) {
            boolean r0 = r1.contains(r0)
            return r0
    }
}
