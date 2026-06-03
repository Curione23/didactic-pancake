package okhttp3;

/* JADX INFO: compiled from: Dns.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\b"}, d2 = {"Lokhttp3/Dns;", "", "lookup", "", "Ljava/net/InetAddress;", "hostname", "", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Dns {
    public static final okhttp3.Dns.Companion Companion = null;
    public static final okhttp3.Dns SYSTEM = null;

    /* JADX INFO: compiled from: Dns.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0006"}, d2 = {"Lokhttp3/Dns$Companion;", "", "()V", "SYSTEM", "Lokhttp3/Dns;", "DnsSystem", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ okhttp3.Dns.Companion $$INSTANCE = null;

        /* JADX INFO: compiled from: Dns.kt */
        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lokhttp3/Dns$Companion$DnsSystem;", "Lokhttp3/Dns;", "()V", "lookup", "", "Ljava/net/InetAddress;", "hostname", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        private static final class DnsSystem implements okhttp3.Dns {
            public DnsSystem() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // okhttp3.Dns
            public java.util.List<java.net.InetAddress> lookup(java.lang.String r5) {
                    r4 = this;
                    java.lang.String r0 = "hostname"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                    java.net.InetAddress[] r0 = java.net.InetAddress.getAllByName(r5)     // Catch: java.lang.NullPointerException -> L15
                    java.lang.String r1 = "getAllByName(hostname)"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.NullPointerException -> L15
                    java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch: java.lang.NullPointerException -> L15
                    java.util.List r5 = kotlin.collections.ArraysKt.toList(r0)     // Catch: java.lang.NullPointerException -> L15
                    return r5
                L15:
                    r0 = move-exception
                    java.net.UnknownHostException r1 = new java.net.UnknownHostException
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    java.lang.String r3 = "Broken system behaviour for dns lookup of "
                    r2.<init>(r3)
                    java.lang.StringBuilder r5 = r2.append(r5)
                    java.lang.String r5 = r5.toString()
                    r1.<init>(r5)
                    java.lang.Throwable r0 = (java.lang.Throwable) r0
                    r1.initCause(r0)
                    java.lang.Throwable r1 = (java.lang.Throwable) r1
                    throw r1
            }
        }

        static {
                okhttp3.Dns$Companion r0 = new okhttp3.Dns$Companion
                r0.<init>()
                okhttp3.Dns.Companion.$$INSTANCE = r0
                return
        }

        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            okhttp3.Dns$Companion r0 = okhttp3.Dns.Companion.$$INSTANCE
            okhttp3.Dns.Companion = r0
            okhttp3.Dns$Companion$DnsSystem r0 = new okhttp3.Dns$Companion$DnsSystem
            r0.<init>()
            okhttp3.Dns r0 = (okhttp3.Dns) r0
            okhttp3.Dns.SYSTEM = r0
            return
    }

    java.util.List<java.net.InetAddress> lookup(java.lang.String r1) throws java.net.UnknownHostException;
}
