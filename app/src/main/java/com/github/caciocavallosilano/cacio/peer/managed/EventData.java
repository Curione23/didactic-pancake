package com.github.caciocavallosilano.cacio.peer.managed;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/managed/EventData.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/managed/EventData.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/managed/EventData.class */
public class EventData {
    private static final int BUTTON_DOWN_MASK = 7168;
    private int id;
    private java.lang.Object source;
    private long time;
    private int modifiers;
    private int x;
    private int y;
    private int clickCount;
    private int button;
    private boolean popup;
    private java.awt.Rectangle updateRect;
    private int keyCode;
    private char keyChar;
    private int lastModifierState;

    public EventData() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public int getId() {
            r2 = this;
            r0 = r2
            int r0 = r0.id
            return r0
    }

    public void setId(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.id = r1
            return
    }

    public java.lang.Object getSource() {
            r2 = this;
            r0 = r2
            java.lang.Object r0 = r0.source
            return r0
    }

    public void setSource(java.lang.Object r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.source = r1
            return
    }

    public long getTime() {
            r3 = this;
            r0 = r3
            long r0 = r0.time
            return r0
    }

    public void setTime(long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.time = r1
            return
    }

    public int getModifiers() {
            r2 = this;
            r0 = r2
            int r0 = r0.modifiers
            return r0
    }

    public void setModifiers(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.modifiers = r1
            return
    }

    public int getX() {
            r2 = this;
            r0 = r2
            int r0 = r0.x
            return r0
    }

    public void setX(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.x = r1
            return
    }

    public int getY() {
            r2 = this;
            r0 = r2
            int r0 = r0.y
            return r0
    }

    public void setY(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.y = r1
            return
    }

    public int getClickCount() {
            r2 = this;
            r0 = r2
            int r0 = r0.clickCount
            return r0
    }

    public void setClickCount(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.clickCount = r1
            return
    }

    public int getButton() {
            r2 = this;
            r0 = r2
            int r0 = r0.button
            return r0
    }

    public void setButton(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.button = r1
            return
    }

    public boolean isPopup() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.popup
            return r0
    }

    public void setPopup(boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.popup = r1
            return
    }

    public java.awt.Rectangle getUpdateRect() {
            r2 = this;
            r0 = r2
            java.awt.Rectangle r0 = r0.updateRect
            return r0
    }

    public void setUpdateRect(java.awt.Rectangle r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.updateRect = r1
            return
    }

    public int getKeyCode() {
            r2 = this;
            r0 = r2
            int r0 = r0.keyCode
            return r0
    }

    public void setKeyCode(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.keyCode = r1
            return
    }

    public char getKeyChar() {
            r2 = this;
            r0 = r2
            char r0 = r0.keyChar
            return r0
    }

    public void setKeyChar(char r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.keyChar = r1
            return
    }

    public java.awt.AWTEvent createAWTEvent() {
            r16 = this;
            r0 = r16
            int r0 = r0.id
            switch(r0) {
                case 100: goto L142;
                case 101: goto L142;
                case 102: goto L142;
                case 103: goto L142;
                case 400: goto L11f;
                case 401: goto L11f;
                case 402: goto L11f;
                case 500: goto L98;
                case 501: goto L98;
                case 502: goto L98;
                case 503: goto L98;
                case 504: goto L98;
                case 505: goto L98;
                case 506: goto L98;
                case 507: goto Lda;
                case 800: goto L155;
                case 801: goto L155;
                default: goto L16c;
            }
        L98:
            r0 = r16
            int r0 = r0.lastModifierState
            r1 = r16
            int r1 = r1.modifiers
            r0 = r0 ^ r1
            r17 = r0
            r0 = r16
            r1 = r16
            int r1 = r1.modifiers
            r0.lastModifierState = r1
            java.awt.event.MouseEvent r0 = new java.awt.event.MouseEvent
            r1 = r0
            r2 = r16
            java.lang.Object r2 = r2.source
            java.awt.Component r2 = (java.awt.Component) r2
            r3 = r16
            int r3 = r3.id
            r4 = r16
            long r4 = r4.time
            r5 = r16
            int r5 = r5.modifiers
            r6 = r16
            int r6 = r6.x
            r7 = r16
            int r7 = r7.y
            r8 = r16
            int r8 = r8.clickCount
            r9 = r16
            boolean r9 = r9.popup
            r10 = r16
            r11 = r17
            int r10 = r10.getButton(r11)
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        Lda:
            r0 = r16
            int r0 = r0.lastModifierState
            r1 = r16
            int r1 = r1.modifiers
            r0 = r0 ^ r1
            r17 = r0
            r0 = r16
            r1 = r16
            int r1 = r1.modifiers
            r0.lastModifierState = r1
            java.awt.event.MouseWheelEvent r0 = new java.awt.event.MouseWheelEvent
            r1 = r0
            r2 = r16
            java.lang.Object r2 = r2.source
            java.awt.Component r2 = (java.awt.Component) r2
            r3 = 507(0x1fb, float:7.1E-43)
            r4 = r16
            long r4 = r4.time
            r5 = r16
            int r5 = r5.modifiers
            r6 = r16
            int r6 = r6.x
            r7 = r16
            int r7 = r7.y
            r8 = 1
            r9 = 0
            r10 = 0
            r11 = 3
            r12 = r16
            int r12 = r12.button
            r13 = 4
            if (r12 != r13) goto L11a
            r12 = -1
            goto L11b
        L11a:
            r12 = 1
        L11b:
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L11f:
            java.awt.event.KeyEvent r0 = new java.awt.event.KeyEvent
            r1 = r0
            r2 = r16
            java.lang.Object r2 = r2.source
            java.awt.Component r2 = (java.awt.Component) r2
            r3 = r16
            int r3 = r3.id
            r4 = r16
            long r4 = r4.time
            r5 = r16
            int r5 = r5.modifiers
            r6 = r16
            int r6 = r6.keyCode
            r7 = r16
            char r7 = r7.keyChar
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
        L142:
            java.awt.event.ComponentEvent r0 = new java.awt.event.ComponentEvent
            r1 = r0
            r2 = r16
            java.lang.Object r2 = r2.source
            java.awt.Component r2 = (java.awt.Component) r2
            r3 = r16
            int r3 = r3.id
            r1.<init>(r2, r3)
            return r0
        L155:
            java.awt.event.PaintEvent r0 = new java.awt.event.PaintEvent
            r1 = r0
            r2 = r16
            java.lang.Object r2 = r2.source
            java.awt.Component r2 = (java.awt.Component) r2
            r3 = r16
            int r3 = r3.id
            r4 = r16
            java.awt.Rectangle r4 = r4.updateRect
            r1.<init>(r2, r3, r4)
            return r0
        L16c:
            r0 = 0
            return r0
    }

    private int getButton(int r4) {
            r3 = this;
            r0 = r4
            r1 = 7168(0x1c00, float:1.0045E-41)
            r0 = r0 & r1
            switch(r0) {
                case 1024: goto L28;
                case 2048: goto L2a;
                case 4096: goto L2c;
                default: goto L2e;
            }
        L28:
            r0 = 1
            return r0
        L2a:
            r0 = 2
            return r0
        L2c:
            r0 = 3
            return r0
        L2e:
            r0 = 0
            return r0
    }

    public void clear() {
            r4 = this;
            r0 = r4
            r1 = 0
            r0.id = r1
            r0 = r4
            r1 = 0
            r0.source = r1
            r0 = r4
            r1 = 0
            r0.time = r1
            r0 = r4
            r1 = 0
            r0.modifiers = r1
            r0 = r4
            r1 = 0
            r0.x = r1
            r0 = r4
            r1 = 0
            r0.y = r1
            r0 = r4
            r1 = 0
            r0.clickCount = r1
            r0 = r4
            r1 = 0
            r0.button = r1
            r0 = r4
            r1 = 0
            r0.updateRect = r1
            return
    }

    public java.lang.String toString() {
            r7 = this;
            r0 = r7
            int r0 = r0.id
            switch(r0) {
                case 400: goto L124;
                case 401: goto L132;
                case 402: goto L140;
                case 500: goto Lde;
                case 501: goto L7e;
                case 502: goto L98;
                case 503: goto L68;
                case 504: goto Lb2;
                case 505: goto Lc8;
                case 506: goto Lf4;
                case 507: goto L10a;
                default: goto L14e;
            }
        L68:
            r0 = r7
            int r0 = r0.x
            r1 = r7
            int r1 = r1.y
            r2 = r7
            long r2 = r2.time
            r3 = r7
            int r3 = r3.modifiers
            java.lang.String r0 = "MOUSE_MOVED: " + r0 + ", " + r1 + ", time: " + r2 + ", mods: " + r0
            return r0
        L7e:
            r0 = r7
            int r0 = r0.x
            r1 = r7
            int r1 = r1.y
            r2 = r7
            long r2 = r2.time
            r3 = r7
            int r3 = r3.modifiers
            r4 = r7
            int r4 = r4.button
            java.lang.String r0 = "MOUSE_PRESSED: " + r0 + ", " + r1 + ", time: " + r2 + ", mods: " + r0 + " button: " + r3
            return r0
        L98:
            r0 = r7
            int r0 = r0.x
            r1 = r7
            int r1 = r1.y
            r2 = r7
            long r2 = r2.time
            r3 = r7
            int r3 = r3.modifiers
            r4 = r7
            int r4 = r4.button
            java.lang.String r0 = "MOUSE_RELEASED: " + r0 + ", " + r1 + ", time: " + r2 + ", mods: " + r0 + " button: " + r3
            return r0
        Lb2:
            r0 = r7
            int r0 = r0.x
            r1 = r7
            int r1 = r1.y
            r2 = r7
            long r2 = r2.time
            r3 = r7
            int r3 = r3.modifiers
            java.lang.String r0 = "MOUSE_ENTERED: " + r0 + ", " + r1 + ", time: " + r2 + ", mods: " + r0
            return r0
        Lc8:
            r0 = r7
            int r0 = r0.x
            r1 = r7
            int r1 = r1.y
            r2 = r7
            long r2 = r2.time
            r3 = r7
            int r3 = r3.modifiers
            java.lang.String r0 = "MOUSE_EXITED: " + r0 + ", " + r1 + ", time: " + r2 + ", mods: " + r0
            return r0
        Lde:
            r0 = r7
            int r0 = r0.x
            r1 = r7
            int r1 = r1.y
            r2 = r7
            long r2 = r2.time
            r3 = r7
            int r3 = r3.modifiers
            java.lang.String r0 = "MOUSE_CLICKED: " + r0 + ", " + r1 + ", time: " + r2 + ", mods: " + r0
            return r0
        Lf4:
            r0 = r7
            int r0 = r0.x
            r1 = r7
            int r1 = r1.y
            r2 = r7
            long r2 = r2.time
            r3 = r7
            int r3 = r3.modifiers
            java.lang.String r0 = "MOUSE_DRAGGED: " + r0 + ", " + r1 + ", time: " + r2 + ", mods: " + r0
            return r0
        L10a:
            r0 = r7
            int r0 = r0.x
            r1 = r7
            int r1 = r1.y
            r2 = r7
            long r2 = r2.time
            r3 = r7
            int r3 = r3.modifiers
            r4 = r7
            int r4 = r4.button
            java.lang.String r0 = "MOUSE_WHEEL: " + r0 + ", " + r1 + ", time: " + r2 + ", mods: " + r0 + " button: " + r3
            return r0
        L124:
            r0 = r7
            char r0 = r0.getKeyChar()
            r1 = r7
            int r1 = r1.keyCode
            java.lang.String r0 = "KEY_TYPED: " + r0 + " keycode = " + r1
            return r0
        L132:
            r0 = r7
            char r0 = r0.getKeyChar()
            r1 = r7
            int r1 = r1.keyCode
            java.lang.String r0 = "KEY_PRESSED: " + r0 + " keycode = " + r1
            return r0
        L140:
            r0 = r7
            char r0 = r0.getKeyChar()
            r1 = r7
            int r1 = r1.keyCode
            java.lang.String r0 = "KEY_RELEASED: " + r0 + " keycode = " + r1
            return r0
        L14e:
            java.lang.String r0 = "UNKNOWN/UNIMPLEMENTED"
            return r0
    }
}
