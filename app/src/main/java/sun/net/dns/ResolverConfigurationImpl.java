package sun.net.dns;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/ResConfHack.jar:sun/net/dns/ResolverConfigurationImpl.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/ResConfHack.jar:sun/net/dns/ResolverConfigurationImpl.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/ResConfHack.jar:sun/net/dns/ResolverConfigurationImpl.class */
public class ResolverConfigurationImpl extends sun.net.dns.ResolverConfiguration {
    private static java.lang.Object lock;
    private static long lastRefresh;
    private static final int TIMEOUT = 300000;
    private final sun.net.dns.ResolverConfiguration.Options opts;
    private java.util.LinkedList<java.lang.String> searchlist;
    private java.util.LinkedList<java.lang.String> nameservers;
    static final /* synthetic */ boolean $assertionsDisabled = false;





    private java.util.LinkedList<java.lang.String> resolvconf(java.lang.String r7, int r8, int r9) {
            r6 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r1 = r0
            r1.<init>()
            r10 = r0
            java.lang.String r0 = "ext.net.resolvPath"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.io.IOException -> L191
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L32
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.io.IOException -> L191
            r1 = r0
            java.io.StringReader r2 = new java.io.StringReader     // Catch: java.io.IOException -> L191
            r3 = r2
            java.lang.String r4 = "nameserver 8.8.8.8"
            r3.<init>(r4)     // Catch: java.io.IOException -> L191
            r1.<init>(r2)     // Catch: java.io.IOException -> L191
            r12 = r0
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.io.IOException -> L191
            java.lang.String r1 = "ResConfHack/E: Resolv file path not set, 8.8.8.8 nameserver used by default"
            r0.println(r1)     // Catch: java.io.IOException -> L191
            goto L78
        L32:
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.io.IOException -> L47 java.io.IOException -> L191
            r1 = r0
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.io.IOException -> L47 java.io.IOException -> L191
            r3 = r2
            r4 = r11
            r3.<init>(r4)     // Catch: java.io.IOException -> L47 java.io.IOException -> L191
            r1.<init>(r2)     // Catch: java.io.IOException -> L47 java.io.IOException -> L191
            r12 = r0
            goto L78
        L47:
            r13 = move-exception
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.io.IOException -> L191
            r1 = r0
            java.io.StringReader r2 = new java.io.StringReader     // Catch: java.io.IOException -> L191
            r3 = r2
            java.lang.String r4 = "nameserver 8.8.8.8"
            r3.<init>(r4)     // Catch: java.io.IOException -> L191
            r1.<init>(r2)     // Catch: java.io.IOException -> L191
            r12 = r0
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.io.IOException -> L191
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L191
            r2 = r1
            r2.<init>()     // Catch: java.io.IOException -> L191
            java.lang.String r2 = "ResConfHack/E: Unable to read resolv.conf:"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.io.IOException -> L191
            r2 = r13
            java.lang.String r2 = r2.getMessage()     // Catch: java.io.IOException -> L191
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.io.IOException -> L191
            java.lang.String r1 = r1.toString()     // Catch: java.io.IOException -> L191
            r0.println(r1)     // Catch: java.io.IOException -> L191
        L78:
            r0 = r12
            java.lang.String r0 = r0.readLine()     // Catch: java.io.IOException -> L191
            r1 = r0
            r13 = r1
            if (r0 == 0) goto L189
            r0 = r8
            r14 = r0
            r0 = r13
            int r0 = r0.length()     // Catch: java.io.IOException -> L191
            if (r0 != 0) goto L91
            goto L78
        L91:
            r0 = r13
            r1 = 0
            char r0 = r0.charAt(r1)     // Catch: java.io.IOException -> L191
            r1 = 35
            if (r0 == r1) goto L78
            r0 = r13
            r1 = 0
            char r0 = r0.charAt(r1)     // Catch: java.io.IOException -> L191
            r1 = 59
            if (r0 != r1) goto Laa
            goto L78
        Laa:
            r0 = r13
            r1 = r7
            boolean r0 = r0.startsWith(r1)     // Catch: java.io.IOException -> L191
            if (r0 != 0) goto Lb6
            goto L78
        Lb6:
            r0 = r13
            r1 = r7
            int r1 = r1.length()     // Catch: java.io.IOException -> L191
            java.lang.String r0 = r0.substring(r1)     // Catch: java.io.IOException -> L191
            r15 = r0
            r0 = r15
            int r0 = r0.length()     // Catch: java.io.IOException -> L191
            if (r0 != 0) goto Lcc
            goto L78
        Lcc:
            r0 = r15
            r1 = 0
            char r0 = r0.charAt(r1)     // Catch: java.io.IOException -> L191
            r1 = 32
            if (r0 == r1) goto Le5
            r0 = r15
            r1 = 0
            char r0 = r0.charAt(r1)     // Catch: java.io.IOException -> L191
            r1 = 9
            if (r0 == r1) goto Le5
            goto L78
        Le5:
            java.util.StringTokenizer r0 = new java.util.StringTokenizer     // Catch: java.io.IOException -> L191
            r1 = r0
            r2 = r15
            java.lang.String r3 = " \t"
            r1.<init>(r2, r3)     // Catch: java.io.IOException -> L191
            r16 = r0
        Lf2:
            r0 = r16
            boolean r0 = r0.hasMoreTokens()     // Catch: java.io.IOException -> L191
            if (r0 == 0) goto L17c
            r0 = r16
            java.lang.String r0 = r0.nextToken()     // Catch: java.io.IOException -> L191
            r17 = r0
            r0 = r17
            r1 = 0
            char r0 = r0.charAt(r1)     // Catch: java.io.IOException -> L191
            r1 = 35
            if (r0 == r1) goto L17c
            r0 = r17
            r1 = 0
            char r0 = r0.charAt(r1)     // Catch: java.io.IOException -> L191
            r1 = 59
            if (r0 != r1) goto L11a
            goto L17c
        L11a:
            java.lang.String r0 = "nameserver"
            r1 = r7
            boolean r0 = r0.equals(r1)     // Catch: java.io.IOException -> L191
            if (r0 == 0) goto L166
            r0 = r17
            r1 = 58
            int r0 = r0.indexOf(r1)     // Catch: java.io.IOException -> L191
            if (r0 < 0) goto L166
            r0 = r17
            r1 = 46
            int r0 = r0.indexOf(r1)     // Catch: java.io.IOException -> L191
            if (r0 >= 0) goto L166
            r0 = r17
            r1 = 91
            int r0 = r0.indexOf(r1)     // Catch: java.io.IOException -> L191
            if (r0 >= 0) goto L166
            r0 = r17
            r1 = 93
            int r0 = r0.indexOf(r1)     // Catch: java.io.IOException -> L191
            if (r0 >= 0) goto L166
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L191
            r1 = r0
            r1.<init>()     // Catch: java.io.IOException -> L191
            java.lang.String r1 = "["
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.io.IOException -> L191
            r1 = r17
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.io.IOException -> L191
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.io.IOException -> L191
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> L191
            r17 = r0
        L166:
            r0 = r10
            r1 = r17
            boolean r0 = r0.add(r1)     // Catch: java.io.IOException -> L191
            int r14 = r14 + (-1)
            r0 = r14
            if (r0 != 0) goto L179
            goto L17c
        L179:
            goto Lf2
        L17c:
            int r9 = r9 + (-1)
            r0 = r9
            if (r0 != 0) goto L186
            goto L189
        L186:
            goto L78
        L189:
            r0 = r12
            r0.close()     // Catch: java.io.IOException -> L191
            goto L193
        L191:
            r11 = move-exception
        L193:
            r0 = r10
            return r0
    }

    private void loadConfig() {
            r5 = this;
            boolean r0 = sun.net.dns.ResolverConfigurationImpl.$assertionsDisabled
            if (r0 != 0) goto L17
            java.lang.Object r0 = sun.net.dns.ResolverConfigurationImpl.lock
            boolean r0 = java.lang.Thread.holdsLock(r0)
            if (r0 != 0) goto L17
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L17:
            long r0 = sun.net.dns.ResolverConfigurationImpl.lastRefresh
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L30
            long r0 = java.lang.System.currentTimeMillis()
            r6 = r0
            r0 = r6
            long r1 = sun.net.dns.ResolverConfigurationImpl.lastRefresh
            long r0 = r0 - r1
            r1 = 300000(0x493e0, double:1.482197E-318)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L30
            return
        L30:
            r0 = r5
            sun.net.dns.ResolverConfigurationImpl$1 r1 = new sun.net.dns.ResolverConfigurationImpl$1
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            r0.nameservers = r1
            r0 = r5
            r1 = r5
            java.util.LinkedList r1 = r1.getSearchList()
            r0.searchlist = r1
            long r0 = java.lang.System.currentTimeMillis()
            sun.net.dns.ResolverConfigurationImpl.lastRefresh = r0
            return
    }

    private java.util.LinkedList<java.lang.String> getSearchList() {
            r4 = this;
            sun.net.dns.ResolverConfigurationImpl$2 r0 = new sun.net.dns.ResolverConfigurationImpl$2
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L15
            r0 = r5
            return r0
        L15:
            java.lang.String r0 = localDomain0()
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L34
            r0 = r6
            int r0 = r0.length()
            if (r0 <= 0) goto L34
            java.util.LinkedList r0 = new java.util.LinkedList
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r5
            r1 = r6
            boolean r0 = r0.add(r1)
            r0 = r5
            return r0
        L34:
            sun.net.dns.ResolverConfigurationImpl$3 r0 = new sun.net.dns.ResolverConfigurationImpl$3
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L49
            r0 = r5
            return r0
        L49:
            java.util.LinkedList r0 = new java.util.LinkedList
            r1 = r0
            r1.<init>()
            r5 = r0
            java.lang.String r0 = fallbackDomain0()
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L66
            r0 = r7
            int r0 = r0.length()
            if (r0 <= 0) goto L66
            r0 = r5
            r1 = r7
            boolean r0 = r0.add(r1)
        L66:
            r0 = r5
            return r0
    }

    ResolverConfigurationImpl() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            sun.net.dns.OptionsImpl r1 = new sun.net.dns.OptionsImpl
            r2 = r1
            r2.<init>()
            r0.opts = r1
            return
    }

    public java.util.List<java.lang.String> searchlist() {
            r3 = this;
            java.lang.Object r0 = sun.net.dns.ResolverConfigurationImpl.lock
            r1 = r0
            r4 = r1
            monitor-enter(r0)
            r0 = r3
            r0.loadConfig()     // Catch: java.lang.Throwable -> L17
            r0 = r3
            java.util.LinkedList<java.lang.String> r0 = r0.searchlist     // Catch: java.lang.Throwable -> L17
            java.lang.Object r0 = r0.clone()     // Catch: java.lang.Throwable -> L17
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L17
            r1 = r4
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            return r0
        L17:
            r5 = move-exception
            r0 = r4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            r0 = r5
            throw r0
    }

    public java.util.List<java.lang.String> nameservers() {
            r3 = this;
            java.lang.Object r0 = sun.net.dns.ResolverConfigurationImpl.lock
            r1 = r0
            r4 = r1
            monitor-enter(r0)
            r0 = r3
            r0.loadConfig()     // Catch: java.lang.Throwable -> L17
            r0 = r3
            java.util.LinkedList<java.lang.String> r0 = r0.nameservers     // Catch: java.lang.Throwable -> L17
            java.lang.Object r0 = r0.clone()     // Catch: java.lang.Throwable -> L17
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L17
            r1 = r4
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            return r0
        L17:
            r5 = move-exception
            r0 = r4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            r0 = r5
            throw r0
    }

    public sun.net.dns.ResolverConfiguration.Options options() {
            r2 = this;
            r0 = r2
            sun.net.dns.ResolverConfiguration$Options r0 = r0.opts
            return r0
    }

    static native java.lang.String localDomain0();

    static native java.lang.String fallbackDomain0();

    static /* synthetic */ java.util.LinkedList access$000(sun.net.dns.ResolverConfigurationImpl r5, java.lang.String r6, int r7, int r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            java.util.LinkedList r0 = r0.resolvconf(r1, r2, r3)
            return r0
    }

    static {
            java.lang.Class<sun.net.dns.ResolverConfigurationImpl> r0 = sun.net.dns.ResolverConfigurationImpl.class
            boolean r0 = r0.desiredAssertionStatus()
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            sun.net.dns.ResolverConfigurationImpl.$assertionsDisabled = r0
            java.lang.Object r0 = new java.lang.Object
            r1 = r0
            r1.<init>()
            sun.net.dns.ResolverConfigurationImpl.lock = r0
            r0 = -1
            sun.net.dns.ResolverConfigurationImpl.lastRefresh = r0
            sun.net.dns.ResolverConfigurationImpl$4 r0 = new sun.net.dns.ResolverConfigurationImpl$4
            r1 = r0
            r1.<init>()
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            return
    }
}
