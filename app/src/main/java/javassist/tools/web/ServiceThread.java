package javassist.tools.web;

/* JADX INFO: compiled from: Webserver.java */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/tools/web/ServiceThread.class */
class ServiceThread extends java.lang.Thread {
    javassist.tools.web.Webserver web;
    java.net.Socket sock;

    public ServiceThread(javassist.tools.web.Webserver r4, java.net.Socket r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.web = r1
            r0 = r3
            r1 = r5
            r0.sock = r1
            return
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
            r3 = this;
            r0 = r3
            javassist.tools.web.Webserver r0 = r0.web     // Catch: java.io.IOException -> Le
            r1 = r3
            java.net.Socket r1 = r1.sock     // Catch: java.io.IOException -> Le
            r0.process(r1)     // Catch: java.io.IOException -> Le
            goto Lf
        Le:
            r4 = move-exception
        Lf:
            return
    }
}
