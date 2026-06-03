package moe.yushi.authlibinjector.httpd;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/httpd/DebugApiEndpoint.class */
public class DebugApiEndpoint {
    public DebugApiEndpoint() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public moe.yushi.authlibinjector.internal.fi.iki.elonen.Response serve(moe.yushi.authlibinjector.internal.fi.iki.elonen.IHTTPSession r6) {
            r5 = this;
            r0 = r6
            java.lang.String r0 = r0.getUri()
            java.lang.String r1 = "/debug/metrics"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L8c
            r0 = r6
            java.lang.String r0 = r0.getMethod()
            java.lang.String r1 = "GET"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L8c
            moe.yushi.authlibinjector.transform.ClassTransformer r0 = moe.yushi.authlibinjector.AuthlibInjector.getClassTransformer()
            moe.yushi.authlibinjector.transform.PerformanceMetrics r0 = r0.performanceMetrics
            r7 = r0
            moe.yushi.authlibinjector.internal.org.json.simple.JSONObject r0 = new moe.yushi.authlibinjector.internal.org.json.simple.JSONObject
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r8
            java.lang.String r1 = "totalTime"
            r2 = r7
            long r2 = r2.getTotalTime()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r8
            java.lang.String r1 = "matchTime"
            r2 = r7
            long r2 = r2.getMatchTime()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r8
            java.lang.String r1 = "scanTime"
            r2 = r7
            long r2 = r2.getScanTime()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r8
            java.lang.String r1 = "analysisTime"
            r2 = r7
            long r2 = r2.getAnalysisTime()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r8
            java.lang.String r1 = "classesScanned"
            r2 = r7
            long r2 = r2.getClassesScanned()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r8
            java.lang.String r1 = "classesSkipped"
            r2 = r7
            long r2 = r2.getClassesSkipped()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.OK
            java.lang.String r1 = "application/json; charset=utf-8"
            r2 = r8
            java.lang.String r2 = r2.toJSONString()
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Response r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Response.newFixedLength(r0, r1, r2)
            return r0
        L8c:
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.NOT_FOUND
            r1 = 0
            r2 = 0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Response r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Response.newFixedLength(r0, r1, r2)
            return r0
    }
}
