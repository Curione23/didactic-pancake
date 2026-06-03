package androidx.core.graphics;

/* JADX INFO: compiled from: Canvas.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a.\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\b\u001a.\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\b\u001a.\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\b\u001a\u00020\n2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\b\u001aF\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\b\u001aF\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\b\u001a0\u0010\u0011\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\b\u001aD\u0010\u0014\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\f2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\b\u001a&\u0010\u0018\u001a\u00020\u0001*\u00020\u00022\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\b\u001aN\u0010\u0019\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\f2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\b\u001a:\u0010\u001c\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\f2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\b\u001a:\u0010\u001d\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\f2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\b¨\u0006\u001e"}, d2 = {"withClip", "", "Landroid/graphics/Canvas;", "clipPath", "Landroid/graphics/Path;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "clipRect", "Landroid/graphics/Rect;", "Landroid/graphics/RectF;", "left", "", "top", "right", "bottom", "", "withMatrix", "matrix", "Landroid/graphics/Matrix;", "withRotation", "degrees", "pivotX", "pivotY", "withSave", "withScale", "x", "y", "withSkew", "withTranslation", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CanvasKt {
    public static final void withClip(android.graphics.Canvas r1, float r2, float r3, float r4, float r5, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r6) {
            int r0 = r1.save()
            r1.clipRect(r2, r3, r4, r5)
            r2 = 1
            r6.invoke(r1)     // Catch: java.lang.Throwable -> L15
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r1.restoreToCount(r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            return
        L15:
            r3 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r1.restoreToCount(r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r3
    }

    public static final void withClip(android.graphics.Canvas r1, int r2, int r3, int r4, int r5, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r6) {
            int r0 = r1.save()
            r1.clipRect(r2, r3, r4, r5)
            r2 = 1
            r6.invoke(r1)     // Catch: java.lang.Throwable -> L15
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r1.restoreToCount(r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            return
        L15:
            r3 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r1.restoreToCount(r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r3
    }

    public static final void withClip(android.graphics.Canvas r1, android.graphics.Path r2, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r3) {
            int r0 = r1.save()
            r1.clipPath(r2)
            r2 = 1
            r3.invoke(r1)     // Catch: java.lang.Throwable -> L15
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r1.restoreToCount(r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            return
        L15:
            r3 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r1.restoreToCount(r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r3
    }

    public static final void withClip(android.graphics.Canvas r1, android.graphics.Rect r2, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r3) {
            int r0 = r1.save()
            r1.clipRect(r2)
            r2 = 1
            r3.invoke(r1)     // Catch: java.lang.Throwable -> L15
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r1.restoreToCount(r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            return
        L15:
            r3 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r1.restoreToCount(r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r3
    }

    public static final void withClip(android.graphics.Canvas r1, android.graphics.RectF r2, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r3) {
            int r0 = r1.save()
            r1.clipRect(r2)
            r2 = 1
            r3.invoke(r1)     // Catch: java.lang.Throwable -> L15
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r1.restoreToCount(r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            return
        L15:
            r3 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r1.restoreToCount(r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r3
    }

    public static final void withMatrix(android.graphics.Canvas r1, android.graphics.Matrix r2, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r3) {
            int r0 = r1.save()
            r1.concat(r2)
            r2 = 1
            r3.invoke(r1)     // Catch: java.lang.Throwable -> L15
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r1.restoreToCount(r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            return
        L15:
            r3 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r1.restoreToCount(r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r3
    }

    public static /* synthetic */ void withMatrix$default(android.graphics.Canvas r0, android.graphics.Matrix r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) {
            r4 = 1
            r3 = r3 & r4
            if (r3 == 0) goto L9
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
        L9:
            int r3 = r0.save()
            r0.concat(r1)
            r2.invoke(r0)     // Catch: java.lang.Throwable -> L1d
            kotlin.jvm.internal.InlineMarker.finallyStart(r4)
            r0.restoreToCount(r3)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r4)
            return
        L1d:
            r1 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r4)
            r0.restoreToCount(r3)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r4)
            throw r1
    }

    public static final void withRotation(android.graphics.Canvas r1, float r2, float r3, float r4, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r5) {
            int r0 = r1.save()
            r1.rotate(r2, r3, r4)
            r2 = 1
            r5.invoke(r1)     // Catch: java.lang.Throwable -> L15
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r1.restoreToCount(r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            return
        L15:
            r3 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r1.restoreToCount(r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r3
    }

    public static /* synthetic */ void withRotation$default(android.graphics.Canvas r1, float r2, float r3, float r4, kotlin.jvm.functions.Function1 r5, int r6, java.lang.Object r7) {
            r7 = r6 & 1
            r0 = 0
            if (r7 == 0) goto L6
            r2 = r0
        L6:
            r7 = r6 & 2
            if (r7 == 0) goto Lb
            r3 = r0
        Lb:
            r6 = r6 & 4
            if (r6 == 0) goto L10
            r4 = r0
        L10:
            int r6 = r1.save()
            r1.rotate(r2, r3, r4)
            r2 = 1
            r5.invoke(r1)     // Catch: java.lang.Throwable -> L25
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r1.restoreToCount(r6)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            return
        L25:
            r3 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r1.restoreToCount(r6)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r3
    }

    public static final void withSave(android.graphics.Canvas r2, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r3) {
            int r0 = r2.save()
            r1 = 1
            r3.invoke(r2)     // Catch: java.lang.Throwable -> L12
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            r2.restoreToCount(r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            return
        L12:
            r3 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            r2.restoreToCount(r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r3
    }

    public static final void withScale(android.graphics.Canvas r1, float r2, float r3, float r4, float r5, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r6) {
            int r0 = r1.save()
            r1.scale(r2, r3, r4, r5)
            r2 = 1
            r6.invoke(r1)     // Catch: java.lang.Throwable -> L15
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r1.restoreToCount(r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            return
        L15:
            r3 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r1.restoreToCount(r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r3
    }

    public static /* synthetic */ void withScale$default(android.graphics.Canvas r1, float r2, float r3, float r4, float r5, kotlin.jvm.functions.Function1 r6, int r7, java.lang.Object r8) {
            r8 = r7 & 1
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L7
            r2 = r0
        L7:
            r8 = r7 & 2
            if (r8 == 0) goto Lc
            r3 = r0
        Lc:
            r8 = r7 & 4
            r0 = 0
            if (r8 == 0) goto L12
            r4 = r0
        L12:
            r7 = r7 & 8
            if (r7 == 0) goto L17
            r5 = r0
        L17:
            int r7 = r1.save()
            r1.scale(r2, r3, r4, r5)
            r2 = 1
            r6.invoke(r1)     // Catch: java.lang.Throwable -> L2c
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r1.restoreToCount(r7)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            return
        L2c:
            r3 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r1.restoreToCount(r7)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r3
    }

    public static final void withSkew(android.graphics.Canvas r1, float r2, float r3, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r4) {
            int r0 = r1.save()
            r1.skew(r2, r3)
            r2 = 1
            r4.invoke(r1)     // Catch: java.lang.Throwable -> L15
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r1.restoreToCount(r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            return
        L15:
            r3 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r1.restoreToCount(r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r3
    }

    public static /* synthetic */ void withSkew$default(android.graphics.Canvas r1, float r2, float r3, kotlin.jvm.functions.Function1 r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            r0 = 0
            if (r6 == 0) goto L6
            r2 = r0
        L6:
            r5 = r5 & 2
            if (r5 == 0) goto Lb
            r3 = r0
        Lb:
            int r5 = r1.save()
            r1.skew(r2, r3)
            r2 = 1
            r4.invoke(r1)     // Catch: java.lang.Throwable -> L20
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r1.restoreToCount(r5)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            return
        L20:
            r3 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r1.restoreToCount(r5)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r3
    }

    public static final void withTranslation(android.graphics.Canvas r1, float r2, float r3, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r4) {
            int r0 = r1.save()
            r1.translate(r2, r3)
            r2 = 1
            r4.invoke(r1)     // Catch: java.lang.Throwable -> L15
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r1.restoreToCount(r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            return
        L15:
            r3 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r1.restoreToCount(r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r3
    }

    public static /* synthetic */ void withTranslation$default(android.graphics.Canvas r1, float r2, float r3, kotlin.jvm.functions.Function1 r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            r0 = 0
            if (r6 == 0) goto L6
            r2 = r0
        L6:
            r5 = r5 & 2
            if (r5 == 0) goto Lb
            r3 = r0
        Lb:
            int r5 = r1.save()
            r1.translate(r2, r3)
            r2 = 1
            r4.invoke(r1)     // Catch: java.lang.Throwable -> L20
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r1.restoreToCount(r5)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            return
        L20:
            r3 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r1.restoreToCount(r5)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r3
    }
}
