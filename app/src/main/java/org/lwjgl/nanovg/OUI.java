package org.lwjgl.nanovg;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/OUI.class */
public class OUI {
    public static final int UI_USERMASK = -16777216;
    public static final int UI_ANY = -1;
    public static final int UI_COLD = 0;
    public static final int UI_HOT = 1;
    public static final int UI_ACTIVE = 2;
    public static final int UI_FROZEN = 3;
    public static final int UI_ROW = 2;
    public static final int UI_COLUMN = 3;
    public static final int UI_LAYOUT = 0;
    public static final int UI_FLEX = 2;
    public static final int UI_NOWRAP = 0;
    public static final int UI_WRAP = 4;
    public static final int UI_START = 8;
    public static final int UI_MIDDLE = 0;
    public static final int UI_END = 16;
    public static final int UI_JUSTIFY = 24;
    public static final int UI_LEFT = 32;
    public static final int UI_TOP = 64;
    public static final int UI_RIGHT = 128;
    public static final int UI_DOWN = 256;
    public static final int UI_HFILL = 160;
    public static final int UI_VFILL = 320;
    public static final int UI_HCENTER = 0;
    public static final int UI_VCENTER = 0;
    public static final int UI_CENTER = 0;
    public static final int UI_FILL = 480;
    public static final int UI_BREAK = 512;
    public static final int UI_BUTTON0_DOWN = 1024;
    public static final int UI_BUTTON0_UP = 2048;
    public static final int UI_BUTTON0_HOT_UP = 4096;
    public static final int UI_BUTTON0_CAPTURE = 8192;
    public static final int UI_BUTTON2_DOWN = 16384;
    public static final int UI_SCROLL = 32768;
    public static final int UI_KEY_DOWN = 65536;
    public static final int UI_KEY_UP = 131072;
    public static final int UI_CHAR = 262144;

    protected OUI() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @org.lwjgl.system.NativeType("UIcontext *")
    public static native long uiCreateContext(@org.lwjgl.system.NativeType("unsigned int") int r0, @org.lwjgl.system.NativeType("unsigned int") int r1);

    public static native void uiMakeCurrent(@org.lwjgl.system.NativeType("UIcontext *") long r0);

    public static native void nuiDestroyContext(long r0);

    public static void uiDestroyContext(@org.lwjgl.system.NativeType("UIcontext *") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            nuiDestroyContext(r0)
            return
    }

    @org.lwjgl.system.NativeType("UIcontext *")
    public static native long uiGetContext();

    public static native void uiSetCursor(int r0, int r1);

    public static native void nuiGetCursor(long r0);

    @org.lwjgl.system.NativeType("UIvec2")
    public static org.lwjgl.nanovg.UIVec2 uiGetCursor(@org.lwjgl.system.NativeType("UIvec2") org.lwjgl.nanovg.UIVec2 r3) {
            r0 = r3
            long r0 = r0.address()
            nuiGetCursor(r0)
            r0 = r3
            return r0
    }

    public static native void nuiGetCursorDelta(long r0);

    @org.lwjgl.system.NativeType("UIvec2")
    public static org.lwjgl.nanovg.UIVec2 uiGetCursorDelta(@org.lwjgl.system.NativeType("UIvec2") org.lwjgl.nanovg.UIVec2 r3) {
            r0 = r3
            long r0 = r0.address()
            nuiGetCursorDelta(r0)
            r0 = r3
            return r0
    }

    public static native void nuiGetCursorStart(long r0);

    @org.lwjgl.system.NativeType("UIvec2")
    public static org.lwjgl.nanovg.UIVec2 uiGetCursorStart(@org.lwjgl.system.NativeType("UIvec2") org.lwjgl.nanovg.UIVec2 r3) {
            r0 = r3
            long r0 = r0.address()
            nuiGetCursorStart(r0)
            r0 = r3
            return r0
    }

    public static native void nuiGetCursorStartDelta(long r0);

    @org.lwjgl.system.NativeType("UIvec2")
    public static org.lwjgl.nanovg.UIVec2 uiGetCursorStartDelta(@org.lwjgl.system.NativeType("UIvec2") org.lwjgl.nanovg.UIVec2 r3) {
            r0 = r3
            long r0 = r0.address()
            nuiGetCursorStartDelta(r0)
            r0 = r3
            return r0
    }

    public static native void nuiSetButton(int r0, int r1, int r2);

    public static void uiSetButton(@org.lwjgl.system.NativeType("unsigned int") int r4, @org.lwjgl.system.NativeType("unsigned int") int r5, @org.lwjgl.system.NativeType("int") boolean r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            if (r2 == 0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            nuiSetButton(r0, r1, r2)
            return
    }

    public static native int nuiGetButton(int r0);

    @org.lwjgl.system.NativeType("int")
    public static boolean uiGetButton(@org.lwjgl.system.NativeType("unsigned int") int r2) {
            r0 = r2
            int r0 = nuiGetButton(r0)
            if (r0 == 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public static native int uiGetClicks();

    public static native void nuiSetKey(int r0, int r1, int r2);

    public static void uiSetKey(@org.lwjgl.system.NativeType("unsigned int") int r4, @org.lwjgl.system.NativeType("unsigned int") int r5, @org.lwjgl.system.NativeType("int") boolean r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            if (r2 == 0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            nuiSetKey(r0, r1, r2)
            return
    }

    public static native void uiSetChar(@org.lwjgl.system.NativeType("unsigned int") int r0);

    public static native void uiSetScroll(int r0, int r1);

    public static native void nuiGetScroll(long r0);

    @org.lwjgl.system.NativeType("UIvec2")
    public static org.lwjgl.nanovg.UIVec2 uiGetScroll(@org.lwjgl.system.NativeType("UIvec2") org.lwjgl.nanovg.UIVec2 r3) {
            r0 = r3
            long r0 = r0.address()
            nuiGetScroll(r0)
            r0 = r3
            return r0
    }

    public static native void uiBeginLayout();

    public static native void uiEndLayout();

    public static native void uiUpdateHotItem();

    public static native void uiProcess(int r0);

    public static native void uiClearState();

    public static native int uiItem();

    public static native void nuiSetFrozen(int r0, int r1);

    public static void uiSetFrozen(int r3, @org.lwjgl.system.NativeType("int") boolean r4) {
            r0 = r3
            r1 = r4
            if (r1 == 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            nuiSetFrozen(r0, r1)
            return
    }

    public static native void uiSetHandle(int r0, @org.lwjgl.system.NativeType("void *") long r1);

    public static native long nuiAllocHandle(int r0, int r1);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void *")
    public static java.nio.ByteBuffer uiAllocHandle(int r4, @org.lwjgl.system.NativeType("unsigned int") int r5) {
            r0 = r4
            r1 = r5
            long r0 = nuiAllocHandle(r0, r1)
            r6 = r0
            r0 = r6
            r1 = r5
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    public static native void nuiSetHandler(long r0);

    public static void uiSetHandler(@org.lwjgl.system.NativeType("UIhandler") org.lwjgl.nanovg.UIHandlerI r3) {
            r0 = r3
            long r0 = r0.address()
            nuiSetHandler(r0)
            return
    }

    public static native void uiSetEvents(int r0, @org.lwjgl.system.NativeType("unsigned int") int r1);

    public static native void uiSetFlags(int r0, @org.lwjgl.system.NativeType("unsigned int") int r1);

    public static native int uiInsert(int r0, int r1);

    public static native int uiAppend(int r0, int r1);

    public static native int uiInsertBack(int r0, int r1);

    public static native int uiInsertFront(int r0, int r1);

    public static native void uiSetSize(int r0, int r1, int r2);

    public static native void uiSetLayout(int r0, @org.lwjgl.system.NativeType("unsigned int") int r1);

    public static native void uiSetBox(int r0, @org.lwjgl.system.NativeType("unsigned int") int r1);

    public static native void nuiSetMargins(int r0, short r1, short r2, short r3, short r4);

    public static void uiSetMargins(int r6, @org.lwjgl.system.NativeType("short") int r7, @org.lwjgl.system.NativeType("short") int r8, @org.lwjgl.system.NativeType("short") int r9, @org.lwjgl.system.NativeType("short") int r10) {
            r0 = r6
            r1 = r7
            short r1 = (short) r1
            r2 = r8
            short r2 = (short) r2
            r3 = r9
            short r3 = (short) r3
            r4 = r10
            short r4 = (short) r4
            nuiSetMargins(r0, r1, r2, r3, r4)
            return
    }

    public static native void uiFocus(int r0);

    public static native int uiFirstChild(int r0);

    public static native int uiNextSibling(int r0);

    public static native int uiGetItemCount();

    @org.lwjgl.system.NativeType("unsigned int")
    public static native int uiGetAllocSize();

    @org.lwjgl.system.NativeType("UIitemState")
    public static native int uiGetState(int r0);

    @org.lwjgl.system.NativeType("void *")
    public static native long uiGetHandle(int r0);

    public static native int uiGetHotItem();

    public static native int uiGetFocusedItem();

    public static native int uiFindItem(int r0, int r1, int r2, @org.lwjgl.system.NativeType("unsigned int") int r3, @org.lwjgl.system.NativeType("unsigned int") int r4);

    public static native long nuiGetHandler();

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("UIhandler")
    public static org.lwjgl.nanovg.UIHandler uiGetHandler() {
            long r0 = nuiGetHandler()
            org.lwjgl.nanovg.UIHandler r0 = org.lwjgl.nanovg.UIHandler.createSafe(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned int")
    public static native int uiGetEvents(int r0);

    @org.lwjgl.system.NativeType("unsigned int")
    public static native int uiGetFlags(int r0);

    @org.lwjgl.system.NativeType("unsigned int")
    public static native int uiGetKey();

    @org.lwjgl.system.NativeType("unsigned int")
    public static native int uiGetModifier();

    public static native void nuiGetRect(int r0, long r1);

    @org.lwjgl.system.NativeType("UIrect")
    public static org.lwjgl.nanovg.UIRect uiGetRect(int r4, @org.lwjgl.system.NativeType("UIrect") org.lwjgl.nanovg.UIRect r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nuiGetRect(r0, r1)
            r0 = r5
            return r0
    }

    public static native int nuiContains(int r0, int r1, int r2);

    @org.lwjgl.system.NativeType("int")
    public static boolean uiContains(int r4, int r5, int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            int r0 = nuiContains(r0, r1, r2)
            if (r0 == 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    public static native int uiGetWidth(int r0);

    public static native int uiGetHeight(int r0);

    @org.lwjgl.system.NativeType("unsigned int")
    public static native int uiGetLayout(int r0);

    @org.lwjgl.system.NativeType("unsigned int")
    public static native int uiGetBox(int r0);

    public static native short uiGetMarginLeft(int r0);

    public static native short uiGetMarginTop(int r0);

    public static native short uiGetMarginRight(int r0);

    public static native short uiGetMarginDown(int r0);

    public static native int uiRecoverItem(int r0);

    public static native void uiRemapItem(int r0, int r1);

    public static native int uiGetLastItemCount();

    static {
            org.lwjgl.nanovg.LibNanoVG.initialize()
            return
    }
}
