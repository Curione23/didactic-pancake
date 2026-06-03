package moe.yushi.authlibinjector.internal.fi.iki.elonen;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/internal/fi/iki/elonen/NanoHTTPD.class */
public abstract class NanoHTTPD {
    private final java.lang.String hostname;
    private final int port;
    private volatile java.net.ServerSocket serverSocket;
    private java.lang.Thread listenerThread;
    private final moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.AsyncRunner asyncRunner;

    /* JADX INFO: renamed from: moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD$1, reason: invalid class name */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/internal/fi/iki/elonen/NanoHTTPD$1.class */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/internal/fi/iki/elonen/NanoHTTPD$AsyncRunner.class */
    private static class AsyncRunner {
        private final java.util.concurrent.atomic.AtomicLong requestCount;
        private final java.util.List<moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.ClientHandler> running;

        private AsyncRunner() {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r2 = r1
                r2.<init>()
                r0.requestCount = r1
                r0 = r4
                java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
                r2 = r1
                r2.<init>()
                r0.running = r1
                return
        }

        public void closeAll() {
                r2 = this;
                r0 = r2
                java.util.List<moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD$ClientHandler> r0 = r0.running
                java.util.Iterator r0 = r0.iterator()
                r3 = r0
            La:
                r0 = r3
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L24
                r0 = r3
                java.lang.Object r0 = r0.next()
                moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD$ClientHandler r0 = (moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.ClientHandler) r0
                r4 = r0
                r0 = r4
                r0.close()
                goto La
            L24:
                return
        }

        public void closed(moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.ClientHandler r4) {
                r3 = this;
                r0 = r3
                java.util.List<moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD$ClientHandler> r0 = r0.running
                r1 = r4
                boolean r0 = r0.remove(r1)
                return
        }

        public void exec(moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.ClientHandler r6) {
                r5 = this;
                java.lang.Thread r0 = new java.lang.Thread
                r1 = r0
                r2 = r6
                r1.<init>(r2)
                r7 = r0
                r0 = r7
                r1 = 1
                r0.setDaemon(r1)
                r0 = r7
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r2 = r1
                r2.<init>()
                java.lang.String r2 = "NanoHttpd Request Processor (#"
                java.lang.StringBuilder r1 = r1.append(r2)
                r2 = r5
                java.util.concurrent.atomic.AtomicLong r2 = r2.requestCount
                long r2 = r2.incrementAndGet()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = ")"
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.setName(r1)
                r0 = r5
                java.util.List<moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD$ClientHandler> r0 = r0.running
                r1 = r6
                boolean r0 = r0.add(r1)
                r0 = r7
                r0.start()
                return
        }

        /* synthetic */ AsyncRunner(moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.AnonymousClass1 r3) {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/internal/fi/iki/elonen/NanoHTTPD$ClientHandler.class */
    private class ClientHandler implements java.lang.Runnable {
        private final java.io.InputStream inputStream;
        private final java.net.Socket acceptSocket;
        final /* synthetic */ moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD this$0;

        public ClientHandler(moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD r4, java.io.InputStream r5, java.net.Socket r6) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.this$0 = r1
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r5
                r0.inputStream = r1
                r0 = r3
                r1 = r6
                r0.acceptSocket = r1
                return
        }

        public void close() {
                r2 = this;
                r0 = r2
                java.io.InputStream r0 = r0.inputStream
                moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.safeClose(r0)
                r0 = r2
                java.net.Socket r0 = r0.acceptSocket
                moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.safeClose(r0)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r6 = this;
                r0 = 0
                r7 = r0
                r0 = r6
                java.net.Socket r0 = r0.acceptSocket     // Catch: moe.yushi.authlibinjector.internal.fi.iki.elonen.HTTPSession.ConnectionCloseException -> L5b java.lang.Exception -> L7c java.lang.Throwable -> La6
                java.io.OutputStream r0 = r0.getOutputStream()     // Catch: moe.yushi.authlibinjector.internal.fi.iki.elonen.HTTPSession.ConnectionCloseException -> L5b java.lang.Exception -> L7c java.lang.Throwable -> La6
                r7 = r0
                moe.yushi.authlibinjector.internal.fi.iki.elonen.HTTPSession r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.HTTPSession     // Catch: moe.yushi.authlibinjector.internal.fi.iki.elonen.HTTPSession.ConnectionCloseException -> L5b java.lang.Exception -> L7c java.lang.Throwable -> La6
                r1 = r0
                r2 = r6
                java.io.InputStream r2 = r2.inputStream     // Catch: moe.yushi.authlibinjector.internal.fi.iki.elonen.HTTPSession.ConnectionCloseException -> L5b java.lang.Exception -> L7c java.lang.Throwable -> La6
                r3 = r7
                r4 = r6
                java.net.Socket r4 = r4.acceptSocket     // Catch: moe.yushi.authlibinjector.internal.fi.iki.elonen.HTTPSession.ConnectionCloseException -> L5b java.lang.Exception -> L7c java.lang.Throwable -> La6
                java.net.SocketAddress r4 = r4.getRemoteSocketAddress()     // Catch: moe.yushi.authlibinjector.internal.fi.iki.elonen.HTTPSession.ConnectionCloseException -> L5b java.lang.Exception -> L7c java.lang.Throwable -> La6
                java.net.InetSocketAddress r4 = (java.net.InetSocketAddress) r4     // Catch: moe.yushi.authlibinjector.internal.fi.iki.elonen.HTTPSession.ConnectionCloseException -> L5b java.lang.Exception -> L7c java.lang.Throwable -> La6
                r1.<init>(r2, r3, r4)     // Catch: moe.yushi.authlibinjector.internal.fi.iki.elonen.HTTPSession.ConnectionCloseException -> L5b java.lang.Exception -> L7c java.lang.Throwable -> La6
                r8 = r0
            L21:
                r0 = r6
                java.net.Socket r0 = r0.acceptSocket     // Catch: moe.yushi.authlibinjector.internal.fi.iki.elonen.HTTPSession.ConnectionCloseException -> L5b java.lang.Exception -> L7c java.lang.Throwable -> La6
                boolean r0 = r0.isClosed()     // Catch: moe.yushi.authlibinjector.internal.fi.iki.elonen.HTTPSession.ConnectionCloseException -> L5b java.lang.Exception -> L7c java.lang.Throwable -> La6
                if (r0 != 0) goto L3b
                r0 = r8
                r1 = r6
                moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD r1 = r1.this$0     // Catch: moe.yushi.authlibinjector.internal.fi.iki.elonen.HTTPSession.ConnectionCloseException -> L5b java.lang.Exception -> L7c java.lang.Throwable -> La6
                void r1 = r1::serve     // Catch: moe.yushi.authlibinjector.internal.fi.iki.elonen.HTTPSession.ConnectionCloseException -> L5b java.lang.Exception -> L7c java.lang.Throwable -> La6
                r0.execute(r1)     // Catch: moe.yushi.authlibinjector.internal.fi.iki.elonen.HTTPSession.ConnectionCloseException -> L5b java.lang.Exception -> L7c java.lang.Throwable -> La6
                goto L21
            L3b:
                r0 = r7
                moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.safeClose(r0)
                r0 = r6
                java.io.InputStream r0 = r0.inputStream
                moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.safeClose(r0)
                r0 = r6
                java.net.Socket r0 = r0.acceptSocket
                moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.safeClose(r0)
                r0 = r6
                moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD r0 = r0.this$0
                moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD$AsyncRunner r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.access$000(r0)
                r1 = r6
                r0.closed(r1)
                goto Lc6
            L5b:
                r8 = move-exception
                r0 = r7
                moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.safeClose(r0)
                r0 = r6
                java.io.InputStream r0 = r0.inputStream
                moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.safeClose(r0)
                r0 = r6
                java.net.Socket r0 = r0.acceptSocket
                moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.safeClose(r0)
                r0 = r6
                moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD r0 = r0.this$0
                moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD$AsyncRunner r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.access$000(r0)
                r1 = r6
                r0.closed(r1)
                goto Lc6
            L7c:
                r8 = move-exception
                moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.ERROR     // Catch: java.lang.Throwable -> La6
                java.lang.String r1 = "Communication with the client broken, or an bug in the handler code"
                r2 = r8
                moe.yushi.authlibinjector.util.Logging.log(r0, r1, r2)     // Catch: java.lang.Throwable -> La6
                r0 = r7
                moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.safeClose(r0)
                r0 = r6
                java.io.InputStream r0 = r0.inputStream
                moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.safeClose(r0)
                r0 = r6
                java.net.Socket r0 = r0.acceptSocket
                moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.safeClose(r0)
                r0 = r6
                moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD r0 = r0.this$0
                moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD$AsyncRunner r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.access$000(r0)
                r1 = r6
                r0.closed(r1)
                goto Lc6
            La6:
                r9 = move-exception
                r0 = r7
                moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.safeClose(r0)
                r0 = r6
                java.io.InputStream r0 = r0.inputStream
                moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.safeClose(r0)
                r0 = r6
                java.net.Socket r0 = r0.acceptSocket
                moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.safeClose(r0)
                r0 = r6
                moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD r0 = r0.this$0
                moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD$AsyncRunner r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.access$000(r0)
                r1 = r6
                r0.closed(r1)
                r0 = r9
                throw r0
            Lc6:
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/internal/fi/iki/elonen/NanoHTTPD$ServerRunnable.class */
    private class ServerRunnable implements java.lang.Runnable {
        private static final int SOCKET_READ_TIMEOUT = 5000;
        private java.io.IOException bindException;
        private boolean hasBinded;
        final /* synthetic */ moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD this$0;

        private ServerRunnable(moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.this$0 = r1
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = 0
                r0.hasBinded = r1
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r7 = this;
                r0 = r7
                moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD r0 = r0.this$0     // Catch: java.io.IOException -> L42
                java.net.ServerSocket r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.access$300(r0)     // Catch: java.io.IOException -> L42
                r1 = r7
                moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD r1 = r1.this$0     // Catch: java.io.IOException -> L42
                java.lang.String r1 = moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.access$100(r1)     // Catch: java.io.IOException -> L42
                if (r1 == 0) goto L29
                java.net.InetSocketAddress r1 = new java.net.InetSocketAddress     // Catch: java.io.IOException -> L42
                r2 = r1
                r3 = r7
                moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD r3 = r3.this$0     // Catch: java.io.IOException -> L42
                java.lang.String r3 = moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.access$100(r3)     // Catch: java.io.IOException -> L42
                r4 = r7
                moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD r4 = r4.this$0     // Catch: java.io.IOException -> L42
                int r4 = moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.access$200(r4)     // Catch: java.io.IOException -> L42
                r2.<init>(r3, r4)     // Catch: java.io.IOException -> L42
                goto L37
            L29:
                java.net.InetSocketAddress r1 = new java.net.InetSocketAddress     // Catch: java.io.IOException -> L42
                r2 = r1
                r3 = r7
                moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD r3 = r3.this$0     // Catch: java.io.IOException -> L42
                int r3 = moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.access$200(r3)     // Catch: java.io.IOException -> L42
                r2.<init>(r3)     // Catch: java.io.IOException -> L42
            L37:
                r0.bind(r1)     // Catch: java.io.IOException -> L42
                r0 = r7
                r1 = 1
                r0.hasBinded = r1     // Catch: java.io.IOException -> L42
                goto L49
            L42:
                r8 = move-exception
                r0 = r7
                r1 = r8
                r0.bindException = r1
                return
            L49:
                r0 = r7
                moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD r0 = r0.this$0     // Catch: java.io.IOException -> L7a
                java.net.ServerSocket r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.access$300(r0)     // Catch: java.io.IOException -> L7a
                java.net.Socket r0 = r0.accept()     // Catch: java.io.IOException -> L7a
                r8 = r0
                r0 = r8
                r1 = 5000(0x1388, float:7.006E-42)
                r0.setSoTimeout(r1)     // Catch: java.io.IOException -> L7a
                r0 = r8
                java.io.InputStream r0 = r0.getInputStream()     // Catch: java.io.IOException -> L7a
                r9 = r0
                r0 = r7
                moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD r0 = r0.this$0     // Catch: java.io.IOException -> L7a
                moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD$AsyncRunner r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.access$000(r0)     // Catch: java.io.IOException -> L7a
                moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD$ClientHandler r1 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD$ClientHandler     // Catch: java.io.IOException -> L7a
                r2 = r1
                r3 = r7
                moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD r3 = r3.this$0     // Catch: java.io.IOException -> L7a
                r4 = r9
                r5 = r8
                r2.<init>(r3, r4, r5)     // Catch: java.io.IOException -> L7a
                r0.exec(r1)     // Catch: java.io.IOException -> L7a
                goto L84
            L7a:
                r8 = move-exception
                moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.DEBUG
                java.lang.String r1 = "Communication with the client broken"
                r2 = r8
                moe.yushi.authlibinjector.util.Logging.log(r0, r1, r2)
            L84:
                r0 = r7
                moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD r0 = r0.this$0
                java.net.ServerSocket r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.access$300(r0)
                boolean r0 = r0.isClosed()
                if (r0 == 0) goto L49
                return
        }

        /* synthetic */ ServerRunnable(moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD r4, moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.AnonymousClass1 r5) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
                return
        }

        static /* synthetic */ boolean access$600(moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.ServerRunnable r2) {
                r0 = r2
                boolean r0 = r0.hasBinded
                return r0
        }

        static /* synthetic */ java.io.IOException access$700(moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.ServerRunnable r2) {
                r0 = r2
                java.io.IOException r0 = r0.bindException
                return r0
        }
    }

    static final void safeClose(java.lang.Object r4) {
            r0 = r4
            if (r0 == 0) goto L43
            r0 = r4
            boolean r0 = r0 instanceof java.io.Closeable     // Catch: java.io.IOException -> L46
            if (r0 == 0) goto L17
            r0 = r4
            java.io.Closeable r0 = (java.io.Closeable) r0     // Catch: java.io.IOException -> L46
            r0.close()     // Catch: java.io.IOException -> L46
            goto L43
        L17:
            r0 = r4
            boolean r0 = r0 instanceof java.net.Socket     // Catch: java.io.IOException -> L46
            if (r0 == 0) goto L28
            r0 = r4
            java.net.Socket r0 = (java.net.Socket) r0     // Catch: java.io.IOException -> L46
            r0.close()     // Catch: java.io.IOException -> L46
            goto L43
        L28:
            r0 = r4
            boolean r0 = r0 instanceof java.net.ServerSocket     // Catch: java.io.IOException -> L46
            if (r0 == 0) goto L39
            r0 = r4
            java.net.ServerSocket r0 = (java.net.ServerSocket) r0     // Catch: java.io.IOException -> L46
            r0.close()     // Catch: java.io.IOException -> L46
            goto L43
        L39:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.io.IOException -> L46
            r1 = r0
            java.lang.String r2 = "Unknown object to close"
            r1.<init>(r2)     // Catch: java.io.IOException -> L46
            throw r0     // Catch: java.io.IOException -> L46
        L43:
            goto L50
        L46:
            r5 = move-exception
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.ERROR
            java.lang.String r1 = "Could not close"
            r2 = r5
            moe.yushi.authlibinjector.util.Logging.log(r0, r1, r2)
        L50:
            return
    }

    public NanoHTTPD(int r5) {
            r4 = this;
            r0 = r4
            r1 = 0
            r2 = r5
            r0.<init>(r1, r2)
            return
    }

    public NanoHTTPD(java.lang.String r6, int r7) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD$AsyncRunner r1 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD$AsyncRunner
            r2 = r1
            r3 = 0
            r2.<init>(r3)
            r0.asyncRunner = r1
            r0 = r5
            r1 = r6
            r0.hostname = r1
            r0 = r5
            r1 = r7
            r0.port = r1
            return
    }

    public final int getListeningPort() {
            r2 = this;
            r0 = r2
            java.net.ServerSocket r0 = r0.serverSocket
            if (r0 != 0) goto Lb
            r0 = -1
            goto L12
        Lb:
            r0 = r2
            java.net.ServerSocket r0 = r0.serverSocket
            int r0 = r0.getLocalPort()
        L12:
            return r0
    }

    public final boolean isAlive() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.wasStarted()
            if (r0 == 0) goto L1f
            r0 = r2
            java.net.ServerSocket r0 = r0.serverSocket
            boolean r0 = r0.isClosed()
            if (r0 != 0) goto L1f
            r0 = r2
            java.lang.Thread r0 = r0.listenerThread
            boolean r0 = r0.isAlive()
            if (r0 == 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            return r0
    }

    public java.lang.String getHostname() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.hostname
            return r0
    }

    public moe.yushi.authlibinjector.internal.fi.iki.elonen.Response serve(moe.yushi.authlibinjector.internal.fi.iki.elonen.IHTTPSession r5) {
            r4 = this;
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.NOT_FOUND
            java.lang.String r1 = "text/plain; charset=utf-8"
            java.lang.String r2 = "Not Found"
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Response r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Response.newFixedLength(r0, r1, r2)
            return r0
    }

    public void start() throws java.io.IOException {
            r3 = this;
            r0 = r3
            r1 = 1
            r0.start(r1)
            return
    }

    public void start(boolean r6) throws java.io.IOException {
            r5 = this;
            r0 = r5
            java.net.ServerSocket r1 = new java.net.ServerSocket
            r2 = r1
            r2.<init>()
            r0.serverSocket = r1
            r0 = r5
            java.net.ServerSocket r0 = r0.serverSocket
            r1 = 1
            r0.setReuseAddress(r1)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD$ServerRunnable r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD$ServerRunnable
            r1 = r0
            r2 = r5
            r3 = 0
            r1.<init>(r2, r3)
            r7 = r0
            r0 = r5
            java.lang.Thread r1 = new java.lang.Thread
            r2 = r1
            r3 = r7
            r2.<init>(r3)
            r0.listenerThread = r1
            r0 = r5
            java.lang.Thread r0 = r0.listenerThread
            r1 = r6
            r0.setDaemon(r1)
            r0 = r5
            java.lang.Thread r0 = r0.listenerThread
            java.lang.String r1 = "NanoHttpd Main Listener"
            r0.setName(r1)
            r0 = r5
            java.lang.Thread r0 = r0.listenerThread
            r0.start()
        L41:
            r0 = r7
            boolean r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.ServerRunnable.access$600(r0)
            if (r0 != 0) goto L5c
            r0 = r7
            java.io.IOException r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.ServerRunnable.access$700(r0)
            if (r0 != 0) goto L5c
            r0 = 10
            java.lang.Thread.sleep(r0)     // Catch: java.lang.Throwable -> L58
            goto L41
        L58:
            r8 = move-exception
            goto L41
        L5c:
            r0 = r7
            java.io.IOException r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.ServerRunnable.access$700(r0)
            if (r0 == 0) goto L68
            r0 = r7
            java.io.IOException r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.ServerRunnable.access$700(r0)
            throw r0
        L68:
            return
    }

    public void stop() {
            r4 = this;
            r0 = r4
            java.net.ServerSocket r0 = r0.serverSocket     // Catch: java.lang.Exception -> L1f
            safeClose(r0)     // Catch: java.lang.Exception -> L1f
            r0 = r4
            moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD$AsyncRunner r0 = r0.asyncRunner     // Catch: java.lang.Exception -> L1f
            r0.closeAll()     // Catch: java.lang.Exception -> L1f
            r0 = r4
            java.lang.Thread r0 = r0.listenerThread     // Catch: java.lang.Exception -> L1f
            if (r0 == 0) goto L1c
            r0 = r4
            java.lang.Thread r0 = r0.listenerThread     // Catch: java.lang.Exception -> L1f
            r0.join()     // Catch: java.lang.Exception -> L1f
        L1c:
            goto L29
        L1f:
            r5 = move-exception
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.ERROR
            java.lang.String r1 = "Could not stop all connections"
            r2 = r5
            moe.yushi.authlibinjector.util.Logging.log(r0, r1, r2)
        L29:
            return
    }

    public final boolean wasStarted() {
            r2 = this;
            r0 = r2
            java.net.ServerSocket r0 = r0.serverSocket
            if (r0 == 0) goto L12
            r0 = r2
            java.lang.Thread r0 = r0.listenerThread
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    static /* synthetic */ moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.AsyncRunner access$000(moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD r2) {
            r0 = r2
            moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD$AsyncRunner r0 = r0.asyncRunner
            return r0
    }

    static /* synthetic */ java.lang.String access$100(moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD r2) {
            r0 = r2
            java.lang.String r0 = r0.hostname
            return r0
    }

    static /* synthetic */ int access$200(moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD r2) {
            r0 = r2
            int r0 = r0.port
            return r0
    }

    static /* synthetic */ java.net.ServerSocket access$300(moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD r2) {
            r0 = r2
            java.net.ServerSocket r0 = r0.serverSocket
            return r0
    }
}
