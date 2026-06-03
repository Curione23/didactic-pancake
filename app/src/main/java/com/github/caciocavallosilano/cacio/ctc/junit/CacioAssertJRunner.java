package com.github.caciocavallosilano.cacio.ctc.junit;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/junit/CacioAssertJRunner.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/junit/CacioAssertJRunner.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/junit/CacioAssertJRunner.class */
public class CacioAssertJRunner extends com.github.caciocavallosilano.cacio.ctc.junit.CacioTestRunner {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/junit/CacioAssertJRunner$MethodInvoker.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/junit/CacioAssertJRunner$MethodInvoker.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/junit/CacioAssertJRunner$MethodInvoker.class */
    class MethodInvoker extends org.junit.runners.model.Statement {
        private final org.junit.runners.model.FrameworkMethod testMethod;
        private final java.lang.Object target;
        private final org.assertj.swing.junit.runner.FailureScreenshotTaker screenshotTaker;
        final /* synthetic */ com.github.caciocavallosilano.cacio.ctc.junit.CacioAssertJRunner this$0;

        MethodInvoker(com.github.caciocavallosilano.cacio.ctc.junit.CacioAssertJRunner r4, org.junit.runners.model.FrameworkMethod r5, java.lang.Object r6, org.assertj.swing.junit.runner.FailureScreenshotTaker r7) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.this$0 = r1
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r5
                r0.testMethod = r1
                r0 = r3
                r1 = r6
                r0.target = r1
                r0 = r3
                r1 = r7
                r0.screenshotTaker = r1
                return
        }

        public void evaluate() throws java.lang.Throwable {
                r4 = this;
                r0 = r4
                org.junit.runners.model.FrameworkMethod r0 = r0.testMethod     // Catch: java.lang.Throwable -> L13
                r1 = r4
                java.lang.Object r1 = r1.target     // Catch: java.lang.Throwable -> L13
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L13
                java.lang.Object r0 = r0.invokeExplosively(r1, r2)     // Catch: java.lang.Throwable -> L13
                goto L1a
            L13:
                r5 = move-exception
                r0 = r4
                r0.takeScreenshot()
                r0 = r5
                throw r0
            L1a:
                return
        }

        private void takeScreenshot() {
                r4 = this;
                r0 = r4
                org.junit.runners.model.FrameworkMethod r0 = r0.testMethod
                java.lang.reflect.Method r0 = r0.getMethod()
                r5 = r0
                r0 = r5
                java.lang.Class r0 = r0.getDeclaringClass()
                r6 = r0
                r0 = r6
                r1 = r5
                boolean r0 = org.assertj.swing.annotation.GUITestFinder.isGUITest(r0, r1)
                if (r0 != 0) goto L16
                return
            L16:
                r0 = r4
                org.assertj.swing.junit.runner.FailureScreenshotTaker r0 = r0.screenshotTaker
                r1 = r6
                r2 = r5
                java.lang.String r1 = org.assertj.swing.junit.runner.Formatter.testNameFrom(r1, r2)
                r0.saveScreenshot(r1)
                return
        }
    }

    public CacioAssertJRunner(java.lang.Class<?> r4) throws org.junit.runners.model.InitializationError {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    protected org.junit.runners.model.Statement methodInvoker(org.junit.runners.model.FrameworkMethod r11, java.lang.Object r12) {
            r10 = this;
            com.github.caciocavallosilano.cacio.ctc.junit.CacioAssertJRunner$MethodInvoker r0 = new com.github.caciocavallosilano.cacio.ctc.junit.CacioAssertJRunner$MethodInvoker
            r1 = r0
            r2 = r10
            r3 = r11
            r4 = r12
            org.assertj.swing.junit.runner.FailureScreenshotTaker r5 = new org.assertj.swing.junit.runner.FailureScreenshotTaker
            r6 = r5
            org.assertj.swing.junit.runner.ImageFolderCreator r7 = new org.assertj.swing.junit.runner.ImageFolderCreator
            r8 = r7
            r8.<init>()
            java.io.File r7 = r7.createImageFolder()
            r6.<init>(r7)
            r1.<init>(r2, r3, r4, r5)
            return r0
    }
}
