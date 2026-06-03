package kotlin.text;

/* JADX INFO: compiled from: HexFormat.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"HexFormat", "Lkotlin/text/HexFormat;", "builderAction", "Lkotlin/Function1;", "Lkotlin/text/HexFormat$Builder;", "", "Lkotlin/ExtensionFunctionType;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class HexFormatKt {
    private static final kotlin.text.HexFormat HexFormat(kotlin.jvm.functions.Function1<? super kotlin.text.HexFormat.Builder, kotlin.Unit> r1) {
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.text.HexFormat$Builder r0 = new kotlin.text.HexFormat$Builder
            r0.<init>()
            r1.invoke(r0)
            kotlin.text.HexFormat r1 = r0.build()
            return r1
    }
}
