package androidx.core.view;

/* JADX INFO: compiled from: Menu.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010)\n\u0002\b\u0003\u001a\u0015\u0010\n\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0086\u0002\u001a0\u0010\r\u001a\u00020\u000e*\u00020\u00032!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000e0\u0010H\u0086\b\u001aE\u0010\u0013\u001a\u00020\u000e*\u00020\u000326\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000e0\u0014H\u0086\b\u001a\u0015\u0010\u0016\u001a\u00020\u0002*\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0007H\u0086\n\u001a\r\u0010\u0017\u001a\u00020\u000b*\u00020\u0003H\u0086\b\u001a\r\u0010\u0018\u001a\u00020\u000b*\u00020\u0003H\u0086\b\u001a\u0013\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a*\u00020\u0003H\u0086\u0002\u001a\u0015\u0010\u001b\u001a\u00020\u000e*\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0086\n\u001a\u0015\u0010\u001c\u001a\u00020\u000e*\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0007H\u0086\b\"\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0016\u0010\u0006\u001a\u00020\u0007*\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u001d"}, d2 = {"children", "Lkotlin/sequences/Sequence;", "Landroid/view/MenuItem;", "Landroid/view/Menu;", "getChildren", "(Landroid/view/Menu;)Lkotlin/sequences/Sequence;", "size", "", "getSize", "(Landroid/view/Menu;)I", "contains", "", "item", "forEach", "", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "forEachIndexed", "Lkotlin/Function2;", "index", "get", "isEmpty", "isNotEmpty", "iterator", "", "minusAssign", "removeItemAt", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MenuKt {

    /* JADX INFO: renamed from: androidx.core.view.MenuKt$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: Menu.kt */
    @kotlin.Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0005\u001a\u00020\u0006H\u0096\u0002J\t\u0010\u0007\u001a\u00020\u0002H\u0096\u0002J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"androidx/core/view/MenuKt$iterator$1", "", "Landroid/view/MenuItem;", "index", "", "hasNext", "", "next", "remove", "", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 implements java.util.Iterator<android.view.MenuItem>, kotlin.jvm.internal.markers.KMutableIterator {
        final /* synthetic */ android.view.Menu $this_iterator;
        private int index;

        AnonymousClass1(android.view.Menu r1) {
                r0 = this;
                r0.$this_iterator = r1
                r0.<init>()
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.index
                android.view.Menu r1 = r2.$this_iterator
                int r1 = r1.size()
                if (r0 >= r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public android.view.MenuItem next() {
                r3 = this;
                android.view.Menu r0 = r3.$this_iterator
                int r1 = r3.index
                int r2 = r1 + 1
                r3.index = r2
                android.view.MenuItem r0 = r0.getItem(r1)
                if (r0 == 0) goto Lf
                return r0
            Lf:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ android.view.MenuItem next() {
                r1 = this;
                android.view.MenuItem r0 = r1.next()
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                android.view.Menu r0 = r2.$this_iterator
                int r1 = r2.index
                int r1 = r1 + (-1)
                r2.index = r1
                android.view.MenuItem r1 = r0.getItem(r1)
                if (r1 == 0) goto L18
                int r1 = r1.getItemId()
                r0.removeItem(r1)
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                goto L19
            L18:
                r0 = 0
            L19:
                if (r0 == 0) goto L1c
                return
            L1c:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                r0.<init>()
                throw r0
        }
    }

    public static final boolean contains(android.view.Menu r4, android.view.MenuItem r5) {
            int r0 = r4.size()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L17
            android.view.MenuItem r3 = r4.getItem(r2)
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r5)
            if (r3 == 0) goto L14
            r4 = 1
            return r4
        L14:
            int r2 = r2 + 1
            goto L6
        L17:
            return r1
    }

    public static final void forEach(android.view.Menu r3, kotlin.jvm.functions.Function1<? super android.view.MenuItem, kotlin.Unit> r4) {
            int r0 = r3.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L11
            android.view.MenuItem r2 = r3.getItem(r1)
            r4.invoke(r2)
            int r1 = r1 + 1
            goto L5
        L11:
            return
    }

    public static final void forEachIndexed(android.view.Menu r4, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super android.view.MenuItem, kotlin.Unit> r5) {
            int r0 = r4.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L15
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            android.view.MenuItem r3 = r4.getItem(r1)
            r5.invoke(r2, r3)
            int r1 = r1 + 1
            goto L5
        L15:
            return
    }

    public static final android.view.MenuItem get(android.view.Menu r0, int r1) {
            android.view.MenuItem r0 = r0.getItem(r1)
            return r0
    }

    public static final kotlin.sequences.Sequence<android.view.MenuItem> getChildren(android.view.Menu r1) {
            androidx.core.view.MenuKt$children$1 r0 = new androidx.core.view.MenuKt$children$1
            r0.<init>(r1)
            kotlin.sequences.Sequence r0 = (kotlin.sequences.Sequence) r0
            return r0
    }

    public static final int getSize(android.view.Menu r0) {
            int r0 = r0.size()
            return r0
    }

    public static final boolean isEmpty(android.view.Menu r0) {
            int r0 = r0.size()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static final boolean isNotEmpty(android.view.Menu r0) {
            int r0 = r0.size()
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static final java.util.Iterator<android.view.MenuItem> iterator(android.view.Menu r1) {
            androidx.core.view.MenuKt$iterator$1 r0 = new androidx.core.view.MenuKt$iterator$1
            r0.<init>(r1)
            java.util.Iterator r0 = (java.util.Iterator) r0
            return r0
    }

    public static final void minusAssign(android.view.Menu r0, android.view.MenuItem r1) {
            int r1 = r1.getItemId()
            r0.removeItem(r1)
            return
    }

    public static final void removeItemAt(android.view.Menu r0, int r1) {
            android.view.MenuItem r1 = r0.getItem(r1)
            if (r1 == 0) goto L10
            int r1 = r1.getItemId()
            r0.removeItem(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 == 0) goto L14
            return
        L14:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
    }
}
