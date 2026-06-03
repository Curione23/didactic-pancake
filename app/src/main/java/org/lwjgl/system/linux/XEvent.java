package org.lwjgl.system.linux;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/XEvent.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/XEvent.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/XEvent.class */
public class XEvent extends org.lwjgl.system.Struct<org.lwjgl.system.linux.XEvent> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int TYPE = 0;
    public static final int XANY = 0;
    public static final int XKEY = 0;
    public static final int XBUTTON = 0;
    public static final int XMOTION = 0;
    public static final int XCROSSING = 0;
    public static final int XFOCUS = 0;
    public static final int XEXPOSE = 0;
    public static final int XGRAPHICSEXPOSE = 0;
    public static final int XNOEXPOSE = 0;
    public static final int XVISIBILITY = 0;
    public static final int XCREATEWINDOW = 0;
    public static final int XDESTROYWINDOW = 0;
    public static final int XUNMAP = 0;
    public static final int XMAP = 0;
    public static final int XMAPREQUEST = 0;
    public static final int XREPARENT = 0;
    public static final int XCONFIGURE = 0;
    public static final int XGRAVITY = 0;
    public static final int XRESIZEREQUEST = 0;
    public static final int XCONFIGUREREQUEST = 0;
    public static final int XCIRCULATE = 0;
    public static final int XCIRCULATEREQUEST = 0;
    public static final int XPROPERTY = 0;
    public static final int XSELECTIONCLEAR = 0;
    public static final int XSELECTIONREQUEST = 0;
    public static final int XSELECTION = 0;
    public static final int XCOLORMAP = 0;
    public static final int XCLIENT = 0;
    public static final int XMAPPING = 0;
    public static final int XERROR = 0;
    public static final int XKEYMAP = 0;
    public static final int XGENERIC = 0;
    public static final int XCOOKIE = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/XEvent$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/XEvent$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/XEvent$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.linux.XEvent, org.lwjgl.system.linux.XEvent.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.linux.XEvent ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.linux.XEvent.SIZEOF
                int r2 = r2 / r3
                r0.<init>(r1, r2)
                return
        }

        public Buffer(long r10, int r12) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = 0
                r3 = -1
                r4 = 0
                r5 = r12
                r6 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        Buffer(long r10, @javax.annotation.Nullable java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected org.lwjgl.system.linux.XEvent.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.system.linux.XEvent getElementFactory() {
                r2 = this;
                org.lwjgl.system.linux.XEvent r0 = org.lwjgl.system.linux.XEvent.Buffer.ELEMENT_FACTORY
                return r0
        }

        public int type() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.XEvent.ntype(r0)
                return r0
        }

        public org.lwjgl.system.linux.XAnyEvent xany() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.XAnyEvent r0 = org.lwjgl.system.linux.XEvent.nxany(r0)
                return r0
        }

        public org.lwjgl.system.linux.XKeyEvent xkey() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.XKeyEvent r0 = org.lwjgl.system.linux.XEvent.nxkey(r0)
                return r0
        }

        public org.lwjgl.system.linux.XButtonEvent xbutton() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.XButtonEvent r0 = org.lwjgl.system.linux.XEvent.nxbutton(r0)
                return r0
        }

        public org.lwjgl.system.linux.XMotionEvent xmotion() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.XMotionEvent r0 = org.lwjgl.system.linux.XEvent.nxmotion(r0)
                return r0
        }

        public org.lwjgl.system.linux.XCrossingEvent xcrossing() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.XCrossingEvent r0 = org.lwjgl.system.linux.XEvent.nxcrossing(r0)
                return r0
        }

        public org.lwjgl.system.linux.XFocusChangeEvent xfocus() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.XFocusChangeEvent r0 = org.lwjgl.system.linux.XEvent.nxfocus(r0)
                return r0
        }

        public org.lwjgl.system.linux.XExposeEvent xexpose() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.XExposeEvent r0 = org.lwjgl.system.linux.XEvent.nxexpose(r0)
                return r0
        }

        public org.lwjgl.system.linux.XGraphicsExposeEvent xgraphicsexpose() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.XGraphicsExposeEvent r0 = org.lwjgl.system.linux.XEvent.nxgraphicsexpose(r0)
                return r0
        }

        public org.lwjgl.system.linux.XNoExposeEvent xnoexpose() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.XNoExposeEvent r0 = org.lwjgl.system.linux.XEvent.nxnoexpose(r0)
                return r0
        }

        public org.lwjgl.system.linux.XVisibilityEvent xvisibility() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.XVisibilityEvent r0 = org.lwjgl.system.linux.XEvent.nxvisibility(r0)
                return r0
        }

        public org.lwjgl.system.linux.XCreateWindowEvent xcreatewindow() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.XCreateWindowEvent r0 = org.lwjgl.system.linux.XEvent.nxcreatewindow(r0)
                return r0
        }

        public org.lwjgl.system.linux.XDestroyWindowEvent xdestroywindow() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.XDestroyWindowEvent r0 = org.lwjgl.system.linux.XEvent.nxdestroywindow(r0)
                return r0
        }

        public org.lwjgl.system.linux.XUnmapEvent xunmap() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.XUnmapEvent r0 = org.lwjgl.system.linux.XEvent.nxunmap(r0)
                return r0
        }

        public org.lwjgl.system.linux.XMapEvent xmap() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.XMapEvent r0 = org.lwjgl.system.linux.XEvent.nxmap(r0)
                return r0
        }

        public org.lwjgl.system.linux.XMapRequestEvent xmaprequest() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.XMapRequestEvent r0 = org.lwjgl.system.linux.XEvent.nxmaprequest(r0)
                return r0
        }

        public org.lwjgl.system.linux.XReparentEvent xreparent() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.XReparentEvent r0 = org.lwjgl.system.linux.XEvent.nxreparent(r0)
                return r0
        }

        public org.lwjgl.system.linux.XConfigureEvent xconfigure() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.XConfigureEvent r0 = org.lwjgl.system.linux.XEvent.nxconfigure(r0)
                return r0
        }

        public org.lwjgl.system.linux.XGravityEvent xgravity() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.XGravityEvent r0 = org.lwjgl.system.linux.XEvent.nxgravity(r0)
                return r0
        }

        public org.lwjgl.system.linux.XResizeRequestEvent xresizerequest() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.XResizeRequestEvent r0 = org.lwjgl.system.linux.XEvent.nxresizerequest(r0)
                return r0
        }

        public org.lwjgl.system.linux.XConfigureRequestEvent xconfigurerequest() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.XConfigureRequestEvent r0 = org.lwjgl.system.linux.XEvent.nxconfigurerequest(r0)
                return r0
        }

        public org.lwjgl.system.linux.XCirculateEvent xcirculate() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.XCirculateEvent r0 = org.lwjgl.system.linux.XEvent.nxcirculate(r0)
                return r0
        }

        public org.lwjgl.system.linux.XCirculateRequestEvent xcirculaterequest() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.XCirculateRequestEvent r0 = org.lwjgl.system.linux.XEvent.nxcirculaterequest(r0)
                return r0
        }

        public org.lwjgl.system.linux.XPropertyEvent xproperty() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.XPropertyEvent r0 = org.lwjgl.system.linux.XEvent.nxproperty(r0)
                return r0
        }

        public org.lwjgl.system.linux.XSelectionClearEvent xselectionclear() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.XSelectionClearEvent r0 = org.lwjgl.system.linux.XEvent.nxselectionclear(r0)
                return r0
        }

        public org.lwjgl.system.linux.XSelectionRequestEvent xselectionrequest() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.XSelectionRequestEvent r0 = org.lwjgl.system.linux.XEvent.nxselectionrequest(r0)
                return r0
        }

        public org.lwjgl.system.linux.XSelectionEvent xselection() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.XSelectionEvent r0 = org.lwjgl.system.linux.XEvent.nxselection(r0)
                return r0
        }

        public org.lwjgl.system.linux.XColormapEvent xcolormap() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.XColormapEvent r0 = org.lwjgl.system.linux.XEvent.nxcolormap(r0)
                return r0
        }

        public org.lwjgl.system.linux.XClientMessageEvent xclient() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.XClientMessageEvent r0 = org.lwjgl.system.linux.XEvent.nxclient(r0)
                return r0
        }

        public org.lwjgl.system.linux.XMappingEvent xmapping() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.XMappingEvent r0 = org.lwjgl.system.linux.XEvent.nxmapping(r0)
                return r0
        }

        public org.lwjgl.system.linux.XErrorEvent xerror() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.XErrorEvent r0 = org.lwjgl.system.linux.XEvent.nxerror(r0)
                return r0
        }

        public org.lwjgl.system.linux.XKeymapEvent xkeymap() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.XKeymapEvent r0 = org.lwjgl.system.linux.XEvent.nxkeymap(r0)
                return r0
        }

        public org.lwjgl.system.linux.XGenericEvent xgeneric() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.XGenericEvent r0 = org.lwjgl.system.linux.XEvent.nxgeneric(r0)
                return r0
        }

        public org.lwjgl.system.linux.XGenericEventCookie xcookie() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.XGenericEventCookie r0 = org.lwjgl.system.linux.XEvent.nxcookie(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.XEvent r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.XEvent$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.linux.XEvent r0 = org.lwjgl.system.linux.XEvent.create(r0)
                org.lwjgl.system.linux.XEvent.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected XEvent(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.linux.XEvent create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.linux.XEvent r0 = new org.lwjgl.system.linux.XEvent
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public XEvent(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.linux.XEvent.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.linux.XEvent.SIZEOF
            return r0
    }

    public int type() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ntype(r0)
            return r0
    }

    public org.lwjgl.system.linux.XAnyEvent xany() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.XAnyEvent r0 = nxany(r0)
            return r0
    }

    public org.lwjgl.system.linux.XKeyEvent xkey() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.XKeyEvent r0 = nxkey(r0)
            return r0
    }

    public org.lwjgl.system.linux.XButtonEvent xbutton() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.XButtonEvent r0 = nxbutton(r0)
            return r0
    }

    public org.lwjgl.system.linux.XMotionEvent xmotion() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.XMotionEvent r0 = nxmotion(r0)
            return r0
    }

    public org.lwjgl.system.linux.XCrossingEvent xcrossing() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.XCrossingEvent r0 = nxcrossing(r0)
            return r0
    }

    public org.lwjgl.system.linux.XFocusChangeEvent xfocus() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.XFocusChangeEvent r0 = nxfocus(r0)
            return r0
    }

    public org.lwjgl.system.linux.XExposeEvent xexpose() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.XExposeEvent r0 = nxexpose(r0)
            return r0
    }

    public org.lwjgl.system.linux.XGraphicsExposeEvent xgraphicsexpose() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.XGraphicsExposeEvent r0 = nxgraphicsexpose(r0)
            return r0
    }

    public org.lwjgl.system.linux.XNoExposeEvent xnoexpose() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.XNoExposeEvent r0 = nxnoexpose(r0)
            return r0
    }

    public org.lwjgl.system.linux.XVisibilityEvent xvisibility() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.XVisibilityEvent r0 = nxvisibility(r0)
            return r0
    }

    public org.lwjgl.system.linux.XCreateWindowEvent xcreatewindow() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.XCreateWindowEvent r0 = nxcreatewindow(r0)
            return r0
    }

    public org.lwjgl.system.linux.XDestroyWindowEvent xdestroywindow() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.XDestroyWindowEvent r0 = nxdestroywindow(r0)
            return r0
    }

    public org.lwjgl.system.linux.XUnmapEvent xunmap() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.XUnmapEvent r0 = nxunmap(r0)
            return r0
    }

    public org.lwjgl.system.linux.XMapEvent xmap() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.XMapEvent r0 = nxmap(r0)
            return r0
    }

    public org.lwjgl.system.linux.XMapRequestEvent xmaprequest() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.XMapRequestEvent r0 = nxmaprequest(r0)
            return r0
    }

    public org.lwjgl.system.linux.XReparentEvent xreparent() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.XReparentEvent r0 = nxreparent(r0)
            return r0
    }

    public org.lwjgl.system.linux.XConfigureEvent xconfigure() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.XConfigureEvent r0 = nxconfigure(r0)
            return r0
    }

    public org.lwjgl.system.linux.XGravityEvent xgravity() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.XGravityEvent r0 = nxgravity(r0)
            return r0
    }

    public org.lwjgl.system.linux.XResizeRequestEvent xresizerequest() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.XResizeRequestEvent r0 = nxresizerequest(r0)
            return r0
    }

    public org.lwjgl.system.linux.XConfigureRequestEvent xconfigurerequest() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.XConfigureRequestEvent r0 = nxconfigurerequest(r0)
            return r0
    }

    public org.lwjgl.system.linux.XCirculateEvent xcirculate() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.XCirculateEvent r0 = nxcirculate(r0)
            return r0
    }

    public org.lwjgl.system.linux.XCirculateRequestEvent xcirculaterequest() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.XCirculateRequestEvent r0 = nxcirculaterequest(r0)
            return r0
    }

    public org.lwjgl.system.linux.XPropertyEvent xproperty() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.XPropertyEvent r0 = nxproperty(r0)
            return r0
    }

    public org.lwjgl.system.linux.XSelectionClearEvent xselectionclear() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.XSelectionClearEvent r0 = nxselectionclear(r0)
            return r0
    }

    public org.lwjgl.system.linux.XSelectionRequestEvent xselectionrequest() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.XSelectionRequestEvent r0 = nxselectionrequest(r0)
            return r0
    }

    public org.lwjgl.system.linux.XSelectionEvent xselection() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.XSelectionEvent r0 = nxselection(r0)
            return r0
    }

    public org.lwjgl.system.linux.XColormapEvent xcolormap() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.XColormapEvent r0 = nxcolormap(r0)
            return r0
    }

    public org.lwjgl.system.linux.XClientMessageEvent xclient() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.XClientMessageEvent r0 = nxclient(r0)
            return r0
    }

    public org.lwjgl.system.linux.XMappingEvent xmapping() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.XMappingEvent r0 = nxmapping(r0)
            return r0
    }

    public org.lwjgl.system.linux.XErrorEvent xerror() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.XErrorEvent r0 = nxerror(r0)
            return r0
    }

    public org.lwjgl.system.linux.XKeymapEvent xkeymap() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.XKeymapEvent r0 = nxkeymap(r0)
            return r0
    }

    public org.lwjgl.system.linux.XGenericEvent xgeneric() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.XGenericEvent r0 = nxgeneric(r0)
            return r0
    }

    public org.lwjgl.system.linux.XGenericEventCookie xcookie() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.XGenericEventCookie r0 = nxcookie(r0)
            return r0
    }

    public static org.lwjgl.system.linux.XEvent malloc() {
            org.lwjgl.system.linux.XEvent r0 = new org.lwjgl.system.linux.XEvent
            r1 = r0
            int r2 = org.lwjgl.system.linux.XEvent.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XEvent calloc() {
            org.lwjgl.system.linux.XEvent r0 = new org.lwjgl.system.linux.XEvent
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.XEvent.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XEvent create() {
            int r0 = org.lwjgl.system.linux.XEvent.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.linux.XEvent r0 = new org.lwjgl.system.linux.XEvent
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XEvent create(long r6) {
            org.lwjgl.system.linux.XEvent r0 = new org.lwjgl.system.linux.XEvent
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.XEvent createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.XEvent r0 = new org.lwjgl.system.linux.XEvent
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.XEvent.Buffer malloc(int r6) {
            org.lwjgl.system.linux.XEvent$Buffer r0 = new org.lwjgl.system.linux.XEvent$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.XEvent.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XEvent.Buffer calloc(int r7) {
            org.lwjgl.system.linux.XEvent$Buffer r0 = new org.lwjgl.system.linux.XEvent$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.linux.XEvent.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XEvent.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.linux.XEvent.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.linux.XEvent$Buffer r0 = new org.lwjgl.system.linux.XEvent$Buffer
            r1 = r0
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r11
            r4 = -1
            r5 = 0
            r6 = r10
            r7 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
    }

    public static org.lwjgl.system.linux.XEvent.Buffer create(long r6, int r8) {
            org.lwjgl.system.linux.XEvent$Buffer r0 = new org.lwjgl.system.linux.XEvent$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.XEvent.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.XEvent$Buffer r0 = new org.lwjgl.system.linux.XEvent$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XEvent mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.linux.XEvent r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XEvent callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.linux.XEvent r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XEvent mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.system.linux.XEvent r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XEvent callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.system.linux.XEvent r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XEvent.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.linux.XEvent$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XEvent.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.linux.XEvent$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XEvent.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.system.linux.XEvent$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XEvent.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.system.linux.XEvent$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.system.linux.XEvent malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.linux.XEvent r0 = new org.lwjgl.system.linux.XEvent
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.XEvent.ALIGNOF
            int r4 = org.lwjgl.system.linux.XEvent.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XEvent calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.linux.XEvent r0 = new org.lwjgl.system.linux.XEvent
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XEvent.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.linux.XEvent.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XEvent.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.XEvent$Buffer r0 = new org.lwjgl.system.linux.XEvent$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.XEvent.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.XEvent.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XEvent.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.XEvent$Buffer r0 = new org.lwjgl.system.linux.XEvent$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.XEvent.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.XEvent.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int ntype(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XEvent.TYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.system.linux.XAnyEvent nxany(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XEvent.XANY
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.XAnyEvent r0 = org.lwjgl.system.linux.XAnyEvent.create(r0)
            return r0
    }

    public static org.lwjgl.system.linux.XKeyEvent nxkey(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XEvent.XKEY
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.XKeyEvent r0 = org.lwjgl.system.linux.XKeyEvent.create(r0)
            return r0
    }

    public static org.lwjgl.system.linux.XButtonEvent nxbutton(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XEvent.XBUTTON
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.XButtonEvent r0 = org.lwjgl.system.linux.XButtonEvent.create(r0)
            return r0
    }

    public static org.lwjgl.system.linux.XMotionEvent nxmotion(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XEvent.XMOTION
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.XMotionEvent r0 = org.lwjgl.system.linux.XMotionEvent.create(r0)
            return r0
    }

    public static org.lwjgl.system.linux.XCrossingEvent nxcrossing(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XEvent.XCROSSING
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.XCrossingEvent r0 = org.lwjgl.system.linux.XCrossingEvent.create(r0)
            return r0
    }

    public static org.lwjgl.system.linux.XFocusChangeEvent nxfocus(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XEvent.XFOCUS
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.XFocusChangeEvent r0 = org.lwjgl.system.linux.XFocusChangeEvent.create(r0)
            return r0
    }

    public static org.lwjgl.system.linux.XExposeEvent nxexpose(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XEvent.XEXPOSE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.XExposeEvent r0 = org.lwjgl.system.linux.XExposeEvent.create(r0)
            return r0
    }

    public static org.lwjgl.system.linux.XGraphicsExposeEvent nxgraphicsexpose(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XEvent.XGRAPHICSEXPOSE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.XGraphicsExposeEvent r0 = org.lwjgl.system.linux.XGraphicsExposeEvent.create(r0)
            return r0
    }

    public static org.lwjgl.system.linux.XNoExposeEvent nxnoexpose(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XEvent.XNOEXPOSE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.XNoExposeEvent r0 = org.lwjgl.system.linux.XNoExposeEvent.create(r0)
            return r0
    }

    public static org.lwjgl.system.linux.XVisibilityEvent nxvisibility(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XEvent.XVISIBILITY
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.XVisibilityEvent r0 = org.lwjgl.system.linux.XVisibilityEvent.create(r0)
            return r0
    }

    public static org.lwjgl.system.linux.XCreateWindowEvent nxcreatewindow(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XEvent.XCREATEWINDOW
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.XCreateWindowEvent r0 = org.lwjgl.system.linux.XCreateWindowEvent.create(r0)
            return r0
    }

    public static org.lwjgl.system.linux.XDestroyWindowEvent nxdestroywindow(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XEvent.XDESTROYWINDOW
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.XDestroyWindowEvent r0 = org.lwjgl.system.linux.XDestroyWindowEvent.create(r0)
            return r0
    }

    public static org.lwjgl.system.linux.XUnmapEvent nxunmap(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XEvent.XUNMAP
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.XUnmapEvent r0 = org.lwjgl.system.linux.XUnmapEvent.create(r0)
            return r0
    }

    public static org.lwjgl.system.linux.XMapEvent nxmap(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XEvent.XMAP
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.XMapEvent r0 = org.lwjgl.system.linux.XMapEvent.create(r0)
            return r0
    }

    public static org.lwjgl.system.linux.XMapRequestEvent nxmaprequest(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XEvent.XMAPREQUEST
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.XMapRequestEvent r0 = org.lwjgl.system.linux.XMapRequestEvent.create(r0)
            return r0
    }

    public static org.lwjgl.system.linux.XReparentEvent nxreparent(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XEvent.XREPARENT
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.XReparentEvent r0 = org.lwjgl.system.linux.XReparentEvent.create(r0)
            return r0
    }

    public static org.lwjgl.system.linux.XConfigureEvent nxconfigure(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XEvent.XCONFIGURE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.XConfigureEvent r0 = org.lwjgl.system.linux.XConfigureEvent.create(r0)
            return r0
    }

    public static org.lwjgl.system.linux.XGravityEvent nxgravity(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XEvent.XGRAVITY
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.XGravityEvent r0 = org.lwjgl.system.linux.XGravityEvent.create(r0)
            return r0
    }

    public static org.lwjgl.system.linux.XResizeRequestEvent nxresizerequest(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XEvent.XRESIZEREQUEST
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.XResizeRequestEvent r0 = org.lwjgl.system.linux.XResizeRequestEvent.create(r0)
            return r0
    }

    public static org.lwjgl.system.linux.XConfigureRequestEvent nxconfigurerequest(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XEvent.XCONFIGUREREQUEST
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.XConfigureRequestEvent r0 = org.lwjgl.system.linux.XConfigureRequestEvent.create(r0)
            return r0
    }

    public static org.lwjgl.system.linux.XCirculateEvent nxcirculate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XEvent.XCIRCULATE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.XCirculateEvent r0 = org.lwjgl.system.linux.XCirculateEvent.create(r0)
            return r0
    }

    public static org.lwjgl.system.linux.XCirculateRequestEvent nxcirculaterequest(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XEvent.XCIRCULATEREQUEST
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.XCirculateRequestEvent r0 = org.lwjgl.system.linux.XCirculateRequestEvent.create(r0)
            return r0
    }

    public static org.lwjgl.system.linux.XPropertyEvent nxproperty(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XEvent.XPROPERTY
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.XPropertyEvent r0 = org.lwjgl.system.linux.XPropertyEvent.create(r0)
            return r0
    }

    public static org.lwjgl.system.linux.XSelectionClearEvent nxselectionclear(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XEvent.XSELECTIONCLEAR
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.XSelectionClearEvent r0 = org.lwjgl.system.linux.XSelectionClearEvent.create(r0)
            return r0
    }

    public static org.lwjgl.system.linux.XSelectionRequestEvent nxselectionrequest(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XEvent.XSELECTIONREQUEST
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.XSelectionRequestEvent r0 = org.lwjgl.system.linux.XSelectionRequestEvent.create(r0)
            return r0
    }

    public static org.lwjgl.system.linux.XSelectionEvent nxselection(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XEvent.XSELECTION
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.XSelectionEvent r0 = org.lwjgl.system.linux.XSelectionEvent.create(r0)
            return r0
    }

    public static org.lwjgl.system.linux.XColormapEvent nxcolormap(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XEvent.XCOLORMAP
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.XColormapEvent r0 = org.lwjgl.system.linux.XColormapEvent.create(r0)
            return r0
    }

    public static org.lwjgl.system.linux.XClientMessageEvent nxclient(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XEvent.XCLIENT
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.XClientMessageEvent r0 = org.lwjgl.system.linux.XClientMessageEvent.create(r0)
            return r0
    }

    public static org.lwjgl.system.linux.XMappingEvent nxmapping(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XEvent.XMAPPING
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.XMappingEvent r0 = org.lwjgl.system.linux.XMappingEvent.create(r0)
            return r0
    }

    public static org.lwjgl.system.linux.XErrorEvent nxerror(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XEvent.XERROR
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.XErrorEvent r0 = org.lwjgl.system.linux.XErrorEvent.create(r0)
            return r0
    }

    public static org.lwjgl.system.linux.XKeymapEvent nxkeymap(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XEvent.XKEYMAP
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.XKeymapEvent r0 = org.lwjgl.system.linux.XKeymapEvent.create(r0)
            return r0
    }

    public static org.lwjgl.system.linux.XGenericEvent nxgeneric(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XEvent.XGENERIC
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.XGenericEvent r0 = org.lwjgl.system.linux.XGenericEvent.create(r0)
            return r0
    }

    public static org.lwjgl.system.linux.XGenericEventCookie nxcookie(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XEvent.XCOOKIE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.XGenericEventCookie r0 = org.lwjgl.system.linux.XGenericEventCookie.create(r0)
            return r0
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.system.linux.XEvent r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 35
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.XAnyEvent.SIZEOF
            int r4 = org.lwjgl.system.linux.XAnyEvent.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.system.linux.XKeyEvent.SIZEOF
            int r4 = org.lwjgl.system.linux.XKeyEvent.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.system.linux.XButtonEvent.SIZEOF
            int r4 = org.lwjgl.system.linux.XButtonEvent.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.system.linux.XMotionEvent.SIZEOF
            int r4 = org.lwjgl.system.linux.XMotionEvent.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.system.linux.XCrossingEvent.SIZEOF
            int r4 = org.lwjgl.system.linux.XCrossingEvent.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.system.linux.XFocusChangeEvent.SIZEOF
            int r4 = org.lwjgl.system.linux.XFocusChangeEvent.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.system.linux.XExposeEvent.SIZEOF
            int r4 = org.lwjgl.system.linux.XExposeEvent.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            int r3 = org.lwjgl.system.linux.XGraphicsExposeEvent.SIZEOF
            int r4 = org.lwjgl.system.linux.XGraphicsExposeEvent.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            int r3 = org.lwjgl.system.linux.XNoExposeEvent.SIZEOF
            int r4 = org.lwjgl.system.linux.XNoExposeEvent.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            int r3 = org.lwjgl.system.linux.XVisibilityEvent.SIZEOF
            int r4 = org.lwjgl.system.linux.XVisibilityEvent.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            int r3 = org.lwjgl.system.linux.XCreateWindowEvent.SIZEOF
            int r4 = org.lwjgl.system.linux.XCreateWindowEvent.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            int r3 = org.lwjgl.system.linux.XDestroyWindowEvent.SIZEOF
            int r4 = org.lwjgl.system.linux.XDestroyWindowEvent.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            int r3 = org.lwjgl.system.linux.XUnmapEvent.SIZEOF
            int r4 = org.lwjgl.system.linux.XUnmapEvent.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            int r3 = org.lwjgl.system.linux.XMapEvent.SIZEOF
            int r4 = org.lwjgl.system.linux.XMapEvent.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 15
            int r3 = org.lwjgl.system.linux.XMapRequestEvent.SIZEOF
            int r4 = org.lwjgl.system.linux.XMapRequestEvent.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 16
            int r3 = org.lwjgl.system.linux.XReparentEvent.SIZEOF
            int r4 = org.lwjgl.system.linux.XReparentEvent.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 17
            int r3 = org.lwjgl.system.linux.XConfigureEvent.SIZEOF
            int r4 = org.lwjgl.system.linux.XConfigureEvent.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 18
            int r3 = org.lwjgl.system.linux.XGravityEvent.SIZEOF
            int r4 = org.lwjgl.system.linux.XGravityEvent.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 19
            int r3 = org.lwjgl.system.linux.XResizeRequestEvent.SIZEOF
            int r4 = org.lwjgl.system.linux.XResizeRequestEvent.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 20
            int r3 = org.lwjgl.system.linux.XConfigureRequestEvent.SIZEOF
            int r4 = org.lwjgl.system.linux.XConfigureRequestEvent.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 21
            int r3 = org.lwjgl.system.linux.XCirculateEvent.SIZEOF
            int r4 = org.lwjgl.system.linux.XCirculateEvent.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 22
            int r3 = org.lwjgl.system.linux.XCirculateRequestEvent.SIZEOF
            int r4 = org.lwjgl.system.linux.XCirculateRequestEvent.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 23
            int r3 = org.lwjgl.system.linux.XPropertyEvent.SIZEOF
            int r4 = org.lwjgl.system.linux.XPropertyEvent.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 24
            int r3 = org.lwjgl.system.linux.XSelectionClearEvent.SIZEOF
            int r4 = org.lwjgl.system.linux.XSelectionClearEvent.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 25
            int r3 = org.lwjgl.system.linux.XSelectionRequestEvent.SIZEOF
            int r4 = org.lwjgl.system.linux.XSelectionRequestEvent.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 26
            int r3 = org.lwjgl.system.linux.XSelectionEvent.SIZEOF
            int r4 = org.lwjgl.system.linux.XSelectionEvent.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 27
            int r3 = org.lwjgl.system.linux.XColormapEvent.SIZEOF
            int r4 = org.lwjgl.system.linux.XColormapEvent.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 28
            int r3 = org.lwjgl.system.linux.XClientMessageEvent.SIZEOF
            int r4 = org.lwjgl.system.linux.XClientMessageEvent.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 29
            int r3 = org.lwjgl.system.linux.XMappingEvent.SIZEOF
            int r4 = org.lwjgl.system.linux.XMappingEvent.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 30
            int r3 = org.lwjgl.system.linux.XErrorEvent.SIZEOF
            int r4 = org.lwjgl.system.linux.XErrorEvent.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 31
            int r3 = org.lwjgl.system.linux.XKeymapEvent.SIZEOF
            int r4 = org.lwjgl.system.linux.XKeymapEvent.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 32
            int r3 = org.lwjgl.system.linux.XGenericEvent.SIZEOF
            int r4 = org.lwjgl.system.linux.XGenericEvent.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 33
            int r3 = org.lwjgl.system.linux.XGenericEventCookie.SIZEOF
            int r4 = org.lwjgl.system.linux.XGenericEventCookie.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 34
            r3 = 24
            int r4 = org.lwjgl.system.linux.XEvent.CLONG_SIZE
            r5 = 1
            org.lwjgl.system.Struct$Member r3 = __padding(r3, r4, r5)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __union(r0)
            r7 = r0
            r0 = r7
            int r0 = r0.getSize()
            org.lwjgl.system.linux.XEvent.SIZEOF = r0
            r0 = r7
            int r0 = r0.getAlignment()
            org.lwjgl.system.linux.XEvent.ALIGNOF = r0
            r0 = r7
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XEvent.TYPE = r0
            r0 = r7
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XEvent.XANY = r0
            r0 = r7
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XEvent.XKEY = r0
            r0 = r7
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XEvent.XBUTTON = r0
            r0 = r7
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XEvent.XMOTION = r0
            r0 = r7
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XEvent.XCROSSING = r0
            r0 = r7
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XEvent.XFOCUS = r0
            r0 = r7
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XEvent.XEXPOSE = r0
            r0 = r7
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XEvent.XGRAPHICSEXPOSE = r0
            r0 = r7
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XEvent.XNOEXPOSE = r0
            r0 = r7
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XEvent.XVISIBILITY = r0
            r0 = r7
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XEvent.XCREATEWINDOW = r0
            r0 = r7
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XEvent.XDESTROYWINDOW = r0
            r0 = r7
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XEvent.XUNMAP = r0
            r0 = r7
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XEvent.XMAP = r0
            r0 = r7
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XEvent.XMAPREQUEST = r0
            r0 = r7
            r1 = 16
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XEvent.XREPARENT = r0
            r0 = r7
            r1 = 17
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XEvent.XCONFIGURE = r0
            r0 = r7
            r1 = 18
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XEvent.XGRAVITY = r0
            r0 = r7
            r1 = 19
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XEvent.XRESIZEREQUEST = r0
            r0 = r7
            r1 = 20
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XEvent.XCONFIGUREREQUEST = r0
            r0 = r7
            r1 = 21
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XEvent.XCIRCULATE = r0
            r0 = r7
            r1 = 22
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XEvent.XCIRCULATEREQUEST = r0
            r0 = r7
            r1 = 23
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XEvent.XPROPERTY = r0
            r0 = r7
            r1 = 24
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XEvent.XSELECTIONCLEAR = r0
            r0 = r7
            r1 = 25
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XEvent.XSELECTIONREQUEST = r0
            r0 = r7
            r1 = 26
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XEvent.XSELECTION = r0
            r0 = r7
            r1 = 27
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XEvent.XCOLORMAP = r0
            r0 = r7
            r1 = 28
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XEvent.XCLIENT = r0
            r0 = r7
            r1 = 29
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XEvent.XMAPPING = r0
            r0 = r7
            r1 = 30
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XEvent.XERROR = r0
            r0 = r7
            r1 = 31
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XEvent.XKEYMAP = r0
            r0 = r7
            r1 = 32
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XEvent.XGENERIC = r0
            r0 = r7
            r1 = 33
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XEvent.XCOOKIE = r0
            return
    }
}
