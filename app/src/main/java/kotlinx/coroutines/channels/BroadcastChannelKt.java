package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: BroadcastChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"BroadcastChannel", "Lkotlinx/coroutines/channels/BroadcastChannel;", "E", "capacity", "", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class BroadcastChannelKt {
    public static final <E> kotlinx.coroutines.channels.BroadcastChannel<E> BroadcastChannel(int r1) {
            r0 = -2
            if (r1 == r0) goto L2e
            r0 = -1
            if (r1 == r0) goto L25
            if (r1 == 0) goto L1d
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r0) goto L15
            kotlinx.coroutines.channels.ArrayBroadcastChannel r0 = new kotlinx.coroutines.channels.ArrayBroadcastChannel
            r0.<init>(r1)
            kotlinx.coroutines.channels.BroadcastChannel r0 = (kotlinx.coroutines.channels.BroadcastChannel) r0
            goto L3c
        L15:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unsupported UNLIMITED capacity for BroadcastChannel"
            r1.<init>(r0)
            throw r1
        L1d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unsupported 0 capacity for BroadcastChannel"
            r1.<init>(r0)
            throw r1
        L25:
            kotlinx.coroutines.channels.ConflatedBroadcastChannel r1 = new kotlinx.coroutines.channels.ConflatedBroadcastChannel
            r1.<init>()
            r0 = r1
            kotlinx.coroutines.channels.BroadcastChannel r0 = (kotlinx.coroutines.channels.BroadcastChannel) r0
            goto L3c
        L2e:
            kotlinx.coroutines.channels.ArrayBroadcastChannel r1 = new kotlinx.coroutines.channels.ArrayBroadcastChannel
            kotlinx.coroutines.channels.Channel$Factory r0 = kotlinx.coroutines.channels.Channel.Factory
            int r0 = r0.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core()
            r1.<init>(r0)
            r0 = r1
            kotlinx.coroutines.channels.BroadcastChannel r0 = (kotlinx.coroutines.channels.BroadcastChannel) r0
        L3c:
            return r0
    }
}
