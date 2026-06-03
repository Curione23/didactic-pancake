package com.github.caciocavallosilano.cacio.peer;

import java.awt.Component;
import javax.swing.JComponent;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioContainerPeer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioContainerPeer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioContainerPeer.class */
abstract class CacioContainerPeer<AWTComponentType extends java.awt.Component, SwingComponentType extends javax.swing.JComponent> extends com.github.caciocavallosilano.cacio.peer.CacioComponentPeer<AWTComponentType, SwingComponentType> implements java.awt.peer.ContainerPeer {
    private boolean isLayouting;

    public CacioContainerPeer(AWTComponentType r5, com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    boolean isLayouting() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.isLayouting
            return r0
    }

    public void beginLayout() {
            r3 = this;
            r0 = r3
            r1 = 1
            r0.isLayouting = r1
            return
    }

    public void endLayout() {
            r8 = this;
            r0 = r8
            sun.awt.RepaintArea r0 = r0.getPaintArea()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L32
            sun.awt.AWTAccessor$ComponentAccessor r0 = sun.awt.AWTAccessor.getComponentAccessor()
            r1 = r8
            java.awt.Component r1 = r1.getAWTComponent()
            boolean r0 = r0.getIgnoreRepaint(r1)
            if (r0 != 0) goto L32
            r0 = r8
            java.awt.event.PaintEvent r1 = new java.awt.event.PaintEvent
            r2 = r1
            r3 = r8
            java.awt.Component r3 = r3.getAWTComponent()
            r4 = 800(0x320, float:1.121E-42)
            java.awt.Rectangle r5 = new java.awt.Rectangle
            r6 = r5
            r6.<init>()
            r2.<init>(r3, r4, r5)
            r0.handlePeerEvent(r1)
        L32:
            r0 = r8
            r1 = 0
            r0.isLayouting = r1
            return
    }

    public void beginValidate() {
            r1 = this;
            return
    }

    public void endValidate() {
            r1 = this;
            return
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    public java.awt.Insets getInsets() {
            r2 = this;
            r0 = r2
            com.github.caciocavallosilano.cacio.peer.PlatformWindow r0 = r0.platformWindow
            java.awt.Insets r0 = r0.getInsets()
            return r0
    }

    public boolean isRestackSupported() {
            r2 = this;
            r0 = r2
            com.github.caciocavallosilano.cacio.peer.PlatformWindow r0 = r0.platformWindow
            boolean r0 = r0.isRestackSupported()
            return r0
    }

    public void restack() {
            r2 = this;
            r0 = r2
            com.github.caciocavallosilano.cacio.peer.PlatformWindow r0 = r0.platformWindow
            r0.restack()
            return
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    public void setFont(java.awt.Font r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            super.setFont(r1)
            r0 = r3
            java.awt.Component r0 = r0.getAWTComponent()
            java.awt.Container r0 = (java.awt.Container) r0
            r5 = r0
            r0 = r5
            int r0 = r0.getComponentCount()
            r6 = r0
            r0 = 0
            r7 = r0
        L15:
            r0 = r7
            r1 = r6
            if (r0 >= r1) goto L5b
            r0 = r5
            r1 = r7
            java.awt.Component r0 = r0.getComponent(r1)
            r8 = r0
            sun.awt.AWTAccessor$ComponentAccessor r0 = sun.awt.AWTAccessor.getComponentAccessor()
            r1 = r8
            java.awt.Font r0 = r0.getFont(r1)
            if (r0 != 0) goto L55
            r0 = r8
            java.awt.peer.ComponentPeer r0 = getPeer(r0)
            r9 = r0
            r0 = r9
            boolean r0 = r0 instanceof com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
            if (r0 == 0) goto L55
            r0 = r9
            com.github.caciocavallosilano.cacio.peer.CacioComponentPeer r0 = (com.github.caciocavallosilano.cacio.peer.CacioComponentPeer) r0
            r10 = r0
            r0 = r10
            java.awt.Font r0 = r0.getFont()
            r1 = r4
            if (r0 == r1) goto L55
            r0 = r10
            r1 = r4
            r0.setFont(r1)
        L55:
            int r7 = r7 + 1
            goto L15
        L5b:
            return
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    public void setForeground(java.awt.Color r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            super.setForeground(r1)
            r0 = r3
            java.awt.Component r0 = r0.getAWTComponent()
            java.awt.Container r0 = (java.awt.Container) r0
            r5 = r0
            r0 = r5
            int r0 = r0.getComponentCount()
            r6 = r0
            r0 = 0
            r7 = r0
        L15:
            r0 = r7
            r1 = r6
            if (r0 >= r1) goto L5b
            r0 = r5
            r1 = r7
            java.awt.Component r0 = r0.getComponent(r1)
            r8 = r0
            sun.awt.AWTAccessor$ComponentAccessor r0 = sun.awt.AWTAccessor.getComponentAccessor()
            r1 = r8
            java.awt.Color r0 = r0.getForeground(r1)
            if (r0 != 0) goto L55
            r0 = r8
            java.awt.peer.ComponentPeer r0 = getPeer(r0)
            r9 = r0
            r0 = r9
            boolean r0 = r0 instanceof com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
            if (r0 == 0) goto L55
            r0 = r9
            com.github.caciocavallosilano.cacio.peer.CacioComponentPeer r0 = (com.github.caciocavallosilano.cacio.peer.CacioComponentPeer) r0
            r10 = r0
            r0 = r10
            java.awt.Color r0 = r0.getForeground()
            r1 = r4
            if (r0 == r1) goto L55
            r0 = r10
            r1 = r4
            r0.setForeground(r1)
        L55:
            int r7 = r7 + 1
            goto L15
        L5b:
            return
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    public void setBackground(java.awt.Color r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            super.setBackground(r1)
            r0 = r3
            java.awt.Component r0 = r0.getAWTComponent()
            java.awt.Container r0 = (java.awt.Container) r0
            r5 = r0
            r0 = r5
            int r0 = r0.getComponentCount()
            r6 = r0
            r0 = 0
            r7 = r0
        L15:
            r0 = r7
            r1 = r6
            if (r0 >= r1) goto L5b
            r0 = r5
            r1 = r7
            java.awt.Component r0 = r0.getComponent(r1)
            r8 = r0
            sun.awt.AWTAccessor$ComponentAccessor r0 = sun.awt.AWTAccessor.getComponentAccessor()
            r1 = r8
            java.awt.Color r0 = r0.getBackground(r1)
            if (r0 != 0) goto L55
            r0 = r8
            java.awt.peer.ComponentPeer r0 = getPeer(r0)
            r9 = r0
            r0 = r9
            boolean r0 = r0 instanceof com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
            if (r0 == 0) goto L55
            r0 = r9
            com.github.caciocavallosilano.cacio.peer.CacioComponentPeer r0 = (com.github.caciocavallosilano.cacio.peer.CacioComponentPeer) r0
            r10 = r0
            r0 = r10
            java.awt.Color r0 = r0.getBackground()
            r1 = r4
            if (r0 == r1) goto L55
            r0 = r10
            r1 = r4
            r0.setBackground(r1)
        L55:
            int r7 = r7 + 1
            goto L15
        L5b:
            return
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    public void setEnabled(boolean r4) {
            r3 = this;
            r0 = r4
            if (r0 == 0) goto Lc
            r0 = r3
            boolean r0 = r0.isParentsEnabled()
            if (r0 != 0) goto Lc
            return
        Lc:
            r0 = r3
            r1 = r4
            r0.setEnabledImpl(r1)
            return
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    void setEnabledImpl(boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            super.setEnabledImpl(r1)
            r0 = r3
            java.awt.Component r0 = r0.getAWTComponent()
            java.awt.Container r0 = (java.awt.Container) r0
            r5 = r0
            r0 = r5
            int r0 = r0.getComponentCount()
            r6 = r0
            r0 = 0
            r7 = r0
        L15:
            r0 = r7
            r1 = r6
            if (r0 >= r1) goto L5f
            r0 = r5
            r1 = r7
            java.awt.Component r0 = r0.getComponent(r1)
            r8 = r0
            r0 = r4
            if (r0 == 0) goto L34
            sun.awt.AWTAccessor$ComponentAccessor r0 = sun.awt.AWTAccessor.getComponentAccessor()
            r1 = r8
            boolean r0 = r0.isEnabled(r1)
            if (r0 == 0) goto L59
        L34:
            r0 = r8
            java.awt.peer.ComponentPeer r0 = getPeer(r0)
            r9 = r0
            r0 = r9
            boolean r0 = r0 instanceof com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
            if (r0 == 0) goto L59
            r0 = r9
            com.github.caciocavallosilano.cacio.peer.CacioComponentPeer r0 = (com.github.caciocavallosilano.cacio.peer.CacioComponentPeer) r0
            r10 = r0
            r0 = r10
            boolean r0 = r0.isEnabled()
            r1 = r4
            if (r0 == r1) goto L59
            r0 = r10
            r1 = r4
            r0.setEnabledImpl(r1)
        L59:
            int r7 = r7 + 1
            goto L15
        L5f:
            return
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    protected void peerPaint(java.awt.Graphics r5, boolean r6) {
            r4 = this;
            r0 = r6
            if (r0 != 0) goto La
            r0 = r4
            r1 = r5
            r2 = r6
            super.peerPaint(r1, r2)
        La:
            return
    }
}
