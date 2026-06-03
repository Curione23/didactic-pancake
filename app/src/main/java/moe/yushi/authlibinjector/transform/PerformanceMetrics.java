package moe.yushi.authlibinjector.transform;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/transform/PerformanceMetrics.class */
public class PerformanceMetrics {
    volatile long totalTime;
    volatile long matchTime;
    volatile long scanTime;
    volatile long analysisTime;
    volatile long classesScanned;
    volatile long classesSkipped;

    public PerformanceMetrics() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public synchronized long getTotalTime() {
            r3 = this;
            r0 = r3
            long r0 = r0.totalTime
            return r0
    }

    public synchronized long getMatchTime() {
            r3 = this;
            r0 = r3
            long r0 = r0.matchTime
            return r0
    }

    public synchronized long getScanTime() {
            r3 = this;
            r0 = r3
            long r0 = r0.scanTime
            return r0
    }

    public synchronized long getAnalysisTime() {
            r3 = this;
            r0 = r3
            long r0 = r0.analysisTime
            return r0
    }

    public synchronized long getClassesScanned() {
            r3 = this;
            r0 = r3
            long r0 = r0.classesScanned
            return r0
    }

    public synchronized long getClassesSkipped() {
            r3 = this;
            r0 = r3
            long r0 = r0.classesSkipped
            return r0
    }
}
