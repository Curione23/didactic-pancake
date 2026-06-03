package com.github.caciocavallosilano.cacio.ctc;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCDesktopPeer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCDesktopPeer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCDesktopPeer.class */
public class CTCDesktopPeer implements java.awt.peer.DesktopPeer {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCDesktopPeer$1.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCDesktopPeer$1.class
     */
    /* JADX INFO: renamed from: com.github.caciocavallosilano.cacio.ctc.CTCDesktopPeer$1, reason: invalid class name */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCDesktopPeer$1.class */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$awt$Desktop$Action = null;

        static {
                java.awt.Desktop$Action[] r0 = java.awt.Desktop.Action.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.github.caciocavallosilano.cacio.ctc.CTCDesktopPeer.AnonymousClass1.$SwitchMap$java$awt$Desktop$Action = r0
                int[] r0 = com.github.caciocavallosilano.cacio.ctc.CTCDesktopPeer.AnonymousClass1.$SwitchMap$java$awt$Desktop$Action     // Catch: java.lang.NoSuchFieldError -> L17
                java.awt.Desktop$Action r1 = java.awt.Desktop.Action.APP_QUIT_HANDLER     // Catch: java.lang.NoSuchFieldError -> L17
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L17
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L17
                goto L18
            L17:
                r4 = move-exception
            L18:
                int[] r0 = com.github.caciocavallosilano.cacio.ctc.CTCDesktopPeer.AnonymousClass1.$SwitchMap$java$awt$Desktop$Action     // Catch: java.lang.NoSuchFieldError -> L26
                java.awt.Desktop$Action r1 = java.awt.Desktop.Action.APP_ABOUT     // Catch: java.lang.NoSuchFieldError -> L26
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L26
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L26
                goto L27
            L26:
                r4 = move-exception
            L27:
                return
        }
    }

    public CTCDesktopPeer() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public boolean isSupported(java.awt.Desktop.Action r4) {
            r3 = this;
            int[] r0 = com.github.caciocavallosilano.cacio.ctc.CTCDesktopPeer.AnonymousClass1.$SwitchMap$java$awt$Desktop$Action
            r1 = r4
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L24;
                case 2: goto L24;
                default: goto L26;
            }
        L24:
            r0 = 1
            return r0
        L26:
            r0 = 0
            return r0
    }

    public void setAboutHandler(java.awt.desktop.AboutHandler r2) {
            r1 = this;
            return
    }

    public void setQuitHandler(java.awt.desktop.QuitHandler r2) {
            r1 = this;
            return
    }

    public void open(java.io.File r2) throws java.io.IOException {
            r1 = this;
            return
    }

    public void edit(java.io.File r5) throws java.io.IOException {
            r4 = this;
            java.io.IOException r0 = new java.io.IOException
            r1 = r0
            java.lang.String r2 = "Action not supported"
            r1.<init>(r2)
            throw r0
    }

    public void print(java.io.File r5) throws java.io.IOException {
            r4 = this;
            java.io.IOException r0 = new java.io.IOException
            r1 = r0
            java.lang.String r2 = "Action not supported"
            r1.<init>(r2)
            throw r0
    }

    public void mail(java.net.URI r5) throws java.io.IOException {
            r4 = this;
            java.io.IOException r0 = new java.io.IOException
            r1 = r0
            java.lang.String r2 = "Action not supported"
            r1.<init>(r2)
            throw r0
    }

    public void browse(java.net.URI r2) throws java.io.IOException {
            r1 = this;
            return
    }
}
