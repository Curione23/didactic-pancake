package kotlinx.coroutines;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@kotlin.Metadata(d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0001\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0017\u0018\u00002\u00020X2\u00020\u00172\u00020\u007f2\u00030Ã\u0001:\u0006Ò\u0001Ó\u0001Ô\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001dJ\u0019\u0010!\u001a\u00020\u00012\b\u0010 \u001a\u0004\u0018\u00010\rH\u0017¢\u0006\u0004\b!\u0010\"J\u001f\u0010!\u001a\u00020\u00112\u000e\u0010 \u001a\n\u0018\u00010#j\u0004\u0018\u0001`$H\u0016¢\u0006\u0004\b!\u0010%J\u0017\u0010&\u001a\u00020\u00012\b\u0010 \u001a\u0004\u0018\u00010\r¢\u0006\u0004\b&\u0010\"J\u0019\u0010)\u001a\u00020\u00012\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\rH\u0016¢\u0006\u0004\b*\u0010+J\u001b\u0010,\u001a\u0004\u0018\u00010\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\rH\u0002¢\u0006\u0004\b.\u0010\"J\u000f\u00100\u001a\u00020/H\u0014¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\rH\u0016¢\u0006\u0004\b2\u0010\"J!\u00105\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b5\u00106J)\u0010;\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u0002072\u0006\u00109\u001a\u0002082\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b;\u0010<J\u0019\u0010=\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b=\u0010>J(\u0010C\u001a\u00020@2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010/2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\rH\u0080\b¢\u0006\u0004\bA\u0010BJ#\u0010D\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u0002072\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\bD\u0010EJ\u0019\u0010F\u001a\u0004\u0018\u0001082\u0006\u0010\u0014\u001a\u000203H\u0002¢\u0006\u0004\bF\u0010GJ\u0011\u0010H\u001a\u00060#j\u0002`$¢\u0006\u0004\bH\u0010IJ\u0013\u0010J\u001a\u00060#j\u0002`$H\u0016¢\u0006\u0004\bJ\u0010IJ\u0011\u0010M\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\bK\u0010LJ\u000f\u0010N\u001a\u0004\u0018\u00010\r¢\u0006\u0004\bN\u0010OJ'\u0010P\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0014\u001a\u0002072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0002¢\u0006\u0004\bP\u0010QJ\u0019\u0010R\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0014\u001a\u000203H\u0002¢\u0006\u0004\bR\u0010SJ\u0017\u0010U\u001a\u00020\u00012\u0006\u0010T\u001a\u00020\rH\u0014¢\u0006\u0004\bU\u0010\"J\u0017\u0010W\u001a\u00020\u00112\u0006\u0010T\u001a\u00020\rH\u0010¢\u0006\u0004\bV\u0010+J\u0019\u0010Z\u001a\u00020\u00112\b\u0010Y\u001a\u0004\u0018\u00010XH\u0004¢\u0006\u0004\bZ\u0010[JF\u0010d\u001a\u00020c2\u0006\u0010\\\u001a\u00020\u00012\u0006\u0010]\u001a\u00020\u00012'\u0010b\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b_\u0012\b\b`\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00110^j\u0002`a¢\u0006\u0004\bd\u0010eJ6\u0010d\u001a\u00020c2'\u0010b\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b_\u0012\b\b`\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00110^j\u0002`a¢\u0006\u0004\bd\u0010fJ\u0013\u0010g\u001a\u00020\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\bg\u0010\u001dJ\u000f\u0010h\u001a\u00020\u0001H\u0002¢\u0006\u0004\bh\u0010iJ\u0013\u0010j\u001a\u00020\u0011H\u0082@ø\u0001\u0000¢\u0006\u0004\bj\u0010\u001dJ&\u0010m\u001a\u00020l2\u0014\u0010k\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00110^H\u0082\b¢\u0006\u0004\bm\u0010nJ\u001b\u0010o\u001a\u0004\u0018\u00010\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\bo\u0010-J\u0019\u0010q\u001a\u00020\u00012\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\bp\u0010(J\u001b\u0010s\u001a\u0004\u0018\u00010\u00052\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\br\u0010-J@\u0010t\u001a\u00020\t2'\u0010b\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b_\u0012\b\b`\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00110^j\u0002`a2\u0006\u0010\\\u001a\u00020\u0001H\u0002¢\u0006\u0004\bt\u0010uJ\u000f\u0010w\u001a\u00020/H\u0010¢\u0006\u0004\bv\u00101J\u001f\u0010x\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\rH\u0002¢\u0006\u0004\bx\u0010yJ.\u0010{\u001a\u00020\u0011\"\n\b\u0000\u0010z\u0018\u0001*\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\rH\u0082\b¢\u0006\u0004\b{\u0010yJ\u0019\u0010\\\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\\\u0010+J\u0019\u0010|\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b|\u0010\u0016J\u000f\u0010}\u001a\u00020\u0011H\u0014¢\u0006\u0004\b}\u0010~J\u0019\u0010\u0081\u0001\u001a\u00020\u00112\u0007\u0010\u0080\u0001\u001a\u00020\u007f¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u001b\u0010\u0084\u0001\u001a\u00020\u00112\u0007\u0010\u0014\u001a\u00030\u0083\u0001H\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u001a\u0010\u0086\u0001\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001JI\u0010\u008c\u0001\u001a\u00020\u0011\"\u0005\b\u0000\u0010\u0088\u00012\u000e\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0089\u00012\u001d\u0010k\u001a\u0019\b\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00000\u008b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00050^ø\u0001\u0000¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001JX\u0010\u0091\u0001\u001a\u00020\u0011\"\u0004\b\u0000\u0010z\"\u0005\b\u0001\u0010\u0088\u00012\u000e\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u0089\u00012$\u0010k\u001a \b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00010\u008b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u008e\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001a\u0010\u0093\u0001\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0006\b\u0092\u0001\u0010\u0087\u0001JX\u0010\u0095\u0001\u001a\u00020\u0011\"\u0004\b\u0000\u0010z\"\u0005\b\u0001\u0010\u0088\u00012\u000e\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u0089\u00012$\u0010k\u001a \b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00010\u008b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u008e\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u0094\u0001\u0010\u0090\u0001J\u000f\u0010\u0096\u0001\u001a\u00020\u0001¢\u0006\u0005\b\u0096\u0001\u0010iJ\u001d\u0010\u0098\u0001\u001a\u00030\u0097\u00012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u001c\u0010\u009a\u0001\u001a\u00020/2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u0011\u0010\u009c\u0001\u001a\u00020/H\u0007¢\u0006\u0005\b\u009c\u0001\u00101J\u0011\u0010\u009d\u0001\u001a\u00020/H\u0016¢\u0006\u0005\b\u009d\u0001\u00101J$\u0010\u009e\u0001\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\"\u0010 \u0001\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u0002032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0006\b \u0001\u0010¡\u0001J(\u0010¢\u0001\u001a\u0004\u0018\u00010\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b¢\u0001\u0010£\u0001J&\u0010¤\u0001\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u0002032\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b¤\u0001\u0010¥\u0001J-\u0010¦\u0001\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u0002072\u0006\u0010\u0018\u001a\u0002082\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0082\u0010¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u0019\u0010©\u0001\u001a\u0004\u0018\u000108*\u00030¨\u0001H\u0002¢\u0006\u0006\b©\u0001\u0010ª\u0001J\u001f\u0010«\u0001\u001a\u00020\u0011*\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0005\b«\u0001\u0010yJ&\u0010¬\u0001\u001a\u00060#j\u0002`$*\u00020\r2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010/H\u0004¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001R\u001b\u0010±\u0001\u001a\t\u0012\u0004\u0012\u00020X0®\u00018F¢\u0006\b\u001a\u0006\b¯\u0001\u0010°\u0001R\u0018\u0010³\u0001\u001a\u0004\u0018\u00010\r8DX\u0084\u0004¢\u0006\u0007\u001a\u0005\b²\u0001\u0010OR\u0016\u0010µ\u0001\u001a\u00020\u00018DX\u0084\u0004¢\u0006\u0007\u001a\u0005\b´\u0001\u0010iR\u0016\u0010·\u0001\u001a\u00020\u00018PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b¶\u0001\u0010iR\u0016\u0010¸\u0001\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010iR\u0013\u0010¹\u0001\u001a\u00020\u00018F¢\u0006\u0007\u001a\u0005\b¹\u0001\u0010iR\u0013\u0010º\u0001\u001a\u00020\u00018F¢\u0006\u0007\u001a\u0005\bº\u0001\u0010iR\u0013\u0010»\u0001\u001a\u00020\u00018F¢\u0006\u0007\u001a\u0005\b»\u0001\u0010iR\u0016\u0010¼\u0001\u001a\u00020\u00018TX\u0094\u0004¢\u0006\u0007\u001a\u0005\b¼\u0001\u0010iR\u0019\u0010À\u0001\u001a\u0007\u0012\u0002\b\u00030½\u00018F¢\u0006\b\u001a\u0006\b¾\u0001\u0010¿\u0001R\u0016\u0010Â\u0001\u001a\u00020\u00018PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bÁ\u0001\u0010iR\u0015\u0010Æ\u0001\u001a\u00030Ã\u00018F¢\u0006\b\u001a\u0006\bÄ\u0001\u0010Å\u0001R.\u0010Ì\u0001\u001a\u0004\u0018\u00010\u00192\t\u0010Ç\u0001\u001a\u0004\u0018\u00010\u00198@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\bÈ\u0001\u0010É\u0001\"\u0006\bÊ\u0001\u0010Ë\u0001R\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00058@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÍ\u0001\u0010LR\u001e\u0010Ï\u0001\u001a\u0004\u0018\u00010\r*\u0004\u0018\u00010\u00058BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÎ\u0001\u0010>R\u001b\u0010Ð\u0001\u001a\u00020\u0001*\u0002038BX\u0082\u0004¢\u0006\b\u001a\u0006\bÐ\u0001\u0010Ñ\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Õ\u0001"}, d2 = {"Lkotlinx/coroutines/JobSupport;", "", "active", "<init>", "(Z)V", "", "expect", "Lkotlinx/coroutines/NodeList;", "list", "Lkotlinx/coroutines/JobNode;", "node", "addLastAtomic", "(Ljava/lang/Object;Lkotlinx/coroutines/NodeList;Lkotlinx/coroutines/JobNode;)Z", "", "rootCause", "", "exceptions", "", "addSuppressedExceptions", "(Ljava/lang/Throwable;Ljava/util/List;)V", "state", "afterCompletion", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/ChildJob;", "child", "Lkotlinx/coroutines/ChildHandle;", "attachChild", "(Lkotlinx/coroutines/ChildJob;)Lkotlinx/coroutines/ChildHandle;", "awaitInternal$kotlinx_coroutines_core", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitInternal", "awaitSuspend", "cause", "cancel", "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "(Ljava/util/concurrent/CancellationException;)V", "cancelCoroutine", "cancelImpl$kotlinx_coroutines_core", "(Ljava/lang/Object;)Z", "cancelImpl", "cancelInternal", "(Ljava/lang/Throwable;)V", "cancelMakeCompleting", "(Ljava/lang/Object;)Ljava/lang/Object;", "cancelParent", "", "cancellationExceptionMessage", "()Ljava/lang/String;", "childCancelled", "Lkotlinx/coroutines/Incomplete;", "update", "completeStateFinalization", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Object;)V", "Lkotlinx/coroutines/JobSupport$Finishing;", "Lkotlinx/coroutines/ChildHandleNode;", "lastChild", "proposedUpdate", "continueCompleting", "(Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)V", "createCauseException", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "message", "Lkotlinx/coroutines/JobCancellationException;", "defaultCancellationException$kotlinx_coroutines_core", "(Ljava/lang/String;Ljava/lang/Throwable;)Lkotlinx/coroutines/JobCancellationException;", "defaultCancellationException", "finalizeFinishingState", "(Lkotlinx/coroutines/JobSupport$Finishing;Ljava/lang/Object;)Ljava/lang/Object;", "firstChild", "(Lkotlinx/coroutines/Incomplete;)Lkotlinx/coroutines/ChildHandleNode;", "getCancellationException", "()Ljava/util/concurrent/CancellationException;", "getChildJobCancellationCause", "getCompletedInternal$kotlinx_coroutines_core", "()Ljava/lang/Object;", "getCompletedInternal", "getCompletionExceptionOrNull", "()Ljava/lang/Throwable;", "getFinalRootCause", "(Lkotlinx/coroutines/JobSupport$Finishing;Ljava/util/List;)Ljava/lang/Throwable;", "getOrPromoteCancellingList", "(Lkotlinx/coroutines/Incomplete;)Lkotlinx/coroutines/NodeList;", "exception", "handleJobException", "handleOnCompletionException$kotlinx_coroutines_core", "handleOnCompletionException", "Lkotlinx/coroutines/Job;", "parent", "initParentJob", "(Lkotlinx/coroutines/Job;)V", "onCancelling", "invokeImmediately", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnCompletion", "(ZZLkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "join", "joinInternal", "()Z", "joinSuspend", "block", "", "loopOnState", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Void;", "makeCancelling", "makeCompleting$kotlinx_coroutines_core", "makeCompleting", "makeCompletingOnce$kotlinx_coroutines_core", "makeCompletingOnce", "makeNode", "(Lkotlin/jvm/functions/Function1;Z)Lkotlinx/coroutines/JobNode;", "nameString$kotlinx_coroutines_core", "nameString", "notifyCancelling", "(Lkotlinx/coroutines/NodeList;Ljava/lang/Throwable;)V", "T", "notifyHandlers", "onCompletionInternal", "onStart", "()V", "Lkotlinx/coroutines/ParentJob;", "parentJob", "parentCancelled", "(Lkotlinx/coroutines/ParentJob;)V", "Lkotlinx/coroutines/Empty;", "promoteEmptyToNodeList", "(Lkotlinx/coroutines/Empty;)V", "promoteSingleToNodeList", "(Lkotlinx/coroutines/JobNode;)V", "R", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "Lkotlin/coroutines/Continuation;", "registerSelectClause0", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "registerSelectClause1Internal$kotlinx_coroutines_core", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V", "registerSelectClause1Internal", "removeNode$kotlinx_coroutines_core", "removeNode", "selectAwaitCompletion$kotlinx_coroutines_core", "selectAwaitCompletion", "start", "", "startInternal", "(Ljava/lang/Object;)I", "stateString", "(Ljava/lang/Object;)Ljava/lang/String;", "toDebugString", "toString", "tryFinalizeSimpleState", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Object;)Z", "tryMakeCancelling", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Throwable;)Z", "tryMakeCompleting", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "tryMakeCompletingSlowPath", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Object;)Ljava/lang/Object;", "tryWaitForChild", "(Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "nextChild", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/ChildHandleNode;", "notifyCompletion", "toCancellationException", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "Lkotlin/sequences/Sequence;", "getChildren", "()Lkotlin/sequences/Sequence;", "children", "getCompletionCause", "completionCause", "getCompletionCauseHandled", "completionCauseHandled", "getHandlesException$kotlinx_coroutines_core", "handlesException", "isActive", "isCancelled", "isCompleted", "isCompletedExceptionally", "isScopedCoroutine", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "key", "getOnCancelComplete$kotlinx_coroutines_core", "onCancelComplete", "Lkotlinx/coroutines/selects/SelectClause0;", "getOnJoin", "()Lkotlinx/coroutines/selects/SelectClause0;", "onJoin", "value", "getParentHandle$kotlinx_coroutines_core", "()Lkotlinx/coroutines/ChildHandle;", "setParentHandle$kotlinx_coroutines_core", "(Lkotlinx/coroutines/ChildHandle;)V", "parentHandle", "getState$kotlinx_coroutines_core", "getExceptionOrNull", "exceptionOrNull", "isCancelling", "(Lkotlinx/coroutines/Incomplete;)Z", "AwaitContinuation", "ChildCompletion", "Finishing", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class JobSupport implements kotlinx.coroutines.Job, kotlinx.coroutines.ChildJob, kotlinx.coroutines.ParentJob, kotlinx.coroutines.selects.SelectClause0 {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _state$FU = null;
    private volatile /* synthetic */ java.lang.Object _parentHandle;
    private volatile /* synthetic */ java.lang.Object _state;

    /* JADX INFO: compiled from: JobSupport.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/JobSupport$AwaitContinuation;", "T", "Lkotlinx/coroutines/CancellableContinuationImpl;", "delegate", "Lkotlin/coroutines/Continuation;", "job", "Lkotlinx/coroutines/JobSupport;", "(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/JobSupport;)V", "getContinuationCancellationCause", "", "parent", "Lkotlinx/coroutines/Job;", "nameString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class AwaitContinuation<T> extends kotlinx.coroutines.CancellableContinuationImpl<T> {
        private final kotlinx.coroutines.JobSupport job;

        public AwaitContinuation(kotlin.coroutines.Continuation<? super T> r2, kotlinx.coroutines.JobSupport r3) {
                r1 = this;
                r0 = 1
                r1.<init>(r2, r0)
                r1.job = r3
                return
        }

        @Override // kotlinx.coroutines.CancellableContinuationImpl
        public java.lang.Throwable getContinuationCancellationCause(kotlinx.coroutines.Job r3) {
                r2 = this;
                kotlinx.coroutines.JobSupport r0 = r2.job
                java.lang.Object r0 = r0.getState$kotlinx_coroutines_core()
                boolean r1 = r0 instanceof kotlinx.coroutines.JobSupport.Finishing
                if (r1 == 0) goto L14
                r1 = r0
                kotlinx.coroutines.JobSupport$Finishing r1 = (kotlinx.coroutines.JobSupport.Finishing) r1
                java.lang.Throwable r1 = r1.getRootCause()
                if (r1 == 0) goto L14
                return r1
            L14:
                boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
                if (r1 == 0) goto L1d
                kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
                java.lang.Throwable r3 = r0.cause
                return r3
            L1d:
                java.util.concurrent.CancellationException r3 = r3.getCancellationException()
                java.lang.Throwable r3 = (java.lang.Throwable) r3
                return r3
        }

        @Override // kotlinx.coroutines.CancellableContinuationImpl
        protected java.lang.String nameString() {
                r1 = this;
                java.lang.String r0 = "AwaitContinuation"
                return r0
        }
    }

    /* JADX INFO: compiled from: JobSupport.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/JobSupport$ChildCompletion;", "Lkotlinx/coroutines/JobNode;", "parent", "Lkotlinx/coroutines/JobSupport;", "state", "Lkotlinx/coroutines/JobSupport$Finishing;", "child", "Lkotlinx/coroutines/ChildHandleNode;", "proposedUpdate", "", "(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)V", "invoke", "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class ChildCompletion extends kotlinx.coroutines.JobNode {
        private final kotlinx.coroutines.ChildHandleNode child;
        private final kotlinx.coroutines.JobSupport parent;
        private final java.lang.Object proposedUpdate;
        private final kotlinx.coroutines.JobSupport.Finishing state;

        public ChildCompletion(kotlinx.coroutines.JobSupport r1, kotlinx.coroutines.JobSupport.Finishing r2, kotlinx.coroutines.ChildHandleNode r3, java.lang.Object r4) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                r0.state = r2
                r0.child = r3
                r0.proposedUpdate = r4
                return
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.invoke2(r1)
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
        }

        @Override // kotlinx.coroutines.CompletionHandlerBase
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public void invoke2(java.lang.Throwable r4) {
                r3 = this;
                kotlinx.coroutines.JobSupport r4 = r3.parent
                kotlinx.coroutines.JobSupport$Finishing r0 = r3.state
                kotlinx.coroutines.ChildHandleNode r1 = r3.child
                java.lang.Object r2 = r3.proposedUpdate
                kotlinx.coroutines.JobSupport.access$continueCompleting(r4, r0, r1, r2)
                return
        }
    }

    /* JADX INFO: compiled from: JobSupport.kt */
    @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0002\u0018\u00002\u00060\u0018j\u0002`,2\u00020-B!\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00050\rj\b\u0012\u0004\u0012\u00020\u0005`\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R(\u0010\u001e\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00188B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b!\u0010 R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010 \"\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b$\u0010 R\u001a\u0010\u0002\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0002\u0010%\u001a\u0004\b&\u0010'R(\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\f¨\u0006+"}, d2 = {"Lkotlinx/coroutines/JobSupport$Finishing;", "Lkotlinx/coroutines/NodeList;", "list", "", "isCompleting", "", "rootCause", "<init>", "(Lkotlinx/coroutines/NodeList;ZLjava/lang/Throwable;)V", "exception", "", "addExceptionLocked", "(Ljava/lang/Throwable;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "allocateList", "()Ljava/util/ArrayList;", "proposedException", "", "sealLocked", "(Ljava/lang/Throwable;)Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "", "value", "getExceptionsHolder", "()Ljava/lang/Object;", "setExceptionsHolder", "(Ljava/lang/Object;)V", "exceptionsHolder", "isActive", "()Z", "isCancelling", "setCompleting", "(Z)V", "isSealed", "Lkotlinx/coroutines/NodeList;", "getList", "()Lkotlinx/coroutines/NodeList;", "getRootCause", "()Ljava/lang/Throwable;", "setRootCause", "kotlinx-coroutines-core", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lkotlinx/coroutines/Incomplete;"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class Finishing implements kotlinx.coroutines.Incomplete {
        private volatile /* synthetic */ java.lang.Object _exceptionsHolder;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ java.lang.Object _rootCause;
        private final kotlinx.coroutines.NodeList list;

        public Finishing(kotlinx.coroutines.NodeList r1, boolean r2, java.lang.Throwable r3) {
                r0 = this;
                r0.<init>()
                r0.list = r1
                r0._isCompleting = r2
                r0._rootCause = r3
                r1 = 0
                r0._exceptionsHolder = r1
                return
        }

        private final java.util.ArrayList<java.lang.Throwable> allocateList() {
                r2 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 4
                r0.<init>(r1)
                return r0
        }

        private final java.lang.Object getExceptionsHolder() {
                r1 = this;
                java.lang.Object r0 = r1._exceptionsHolder
                return r0
        }

        private final void setExceptionsHolder(java.lang.Object r1) {
                r0 = this;
                r0._exceptionsHolder = r1
                return
        }

        public final void addExceptionLocked(java.lang.Throwable r4) {
                r3 = this;
                java.lang.Throwable r0 = r3.getRootCause()
                if (r0 != 0) goto La
                r3.setRootCause(r4)
                return
            La:
                if (r4 != r0) goto Ld
                return
            Ld:
                java.lang.Object r0 = r3.getExceptionsHolder()
                if (r0 != 0) goto L17
                r3.setExceptionsHolder(r4)
                goto L35
            L17:
                boolean r1 = r0 instanceof java.lang.Throwable
                if (r1 == 0) goto L2c
                if (r4 != r0) goto L1e
                return
            L1e:
                java.util.ArrayList r1 = r3.allocateList()
                r1.add(r0)
                r1.add(r4)
                r3.setExceptionsHolder(r1)
                goto L35
            L2c:
                boolean r1 = r0 instanceof java.util.ArrayList
                if (r1 == 0) goto L36
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                r0.add(r4)
            L35:
                return
            L36:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "State is "
                r1.<init>(r2)
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r0 = r0.toString()
                java.lang.String r0 = r0.toString()
                r4.<init>(r0)
                throw r4
        }

        @Override // kotlinx.coroutines.Incomplete
        public kotlinx.coroutines.NodeList getList() {
                r1 = this;
                kotlinx.coroutines.NodeList r0 = r1.list
                return r0
        }

        public final java.lang.Throwable getRootCause() {
                r1 = this;
                java.lang.Object r0 = r1._rootCause
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                return r0
        }

        @Override // kotlinx.coroutines.Incomplete
        public boolean isActive() {
                r1 = this;
                java.lang.Throwable r0 = r1.getRootCause()
                if (r0 != 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public final boolean isCancelling() {
                r1 = this;
                java.lang.Throwable r0 = r1.getRootCause()
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public final boolean isCompleting() {
                r1 = this;
                int r0 = r1._isCompleting
                return r0
        }

        public final boolean isSealed() {
                r2 = this;
                java.lang.Object r0 = r2.getExceptionsHolder()
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.JobSupportKt.access$getSEALED$p()
                if (r0 != r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        public final java.util.List<java.lang.Throwable> sealLocked(java.lang.Throwable r4) {
                r3 = this;
                java.lang.Object r0 = r3.getExceptionsHolder()
                if (r0 != 0) goto Lb
                java.util.ArrayList r0 = r3.allocateList()
                goto L1e
            Lb:
                boolean r1 = r0 instanceof java.lang.Throwable
                if (r1 == 0) goto L18
                java.util.ArrayList r1 = r3.allocateList()
                r1.add(r0)
                r0 = r1
                goto L1e
            L18:
                boolean r1 = r0 instanceof java.util.ArrayList
                if (r1 == 0) goto L3d
                java.util.ArrayList r0 = (java.util.ArrayList) r0
            L1e:
                java.lang.Throwable r1 = r3.getRootCause()
                if (r1 == 0) goto L28
                r2 = 0
                r0.add(r2, r1)
            L28:
                if (r4 == 0) goto L33
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r1)
                if (r1 != 0) goto L33
                r0.add(r4)
            L33:
                kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.JobSupportKt.access$getSEALED$p()
                r3.setExceptionsHolder(r4)
                java.util.List r0 = (java.util.List) r0
                return r0
            L3d:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "State is "
                r1.<init>(r2)
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r0 = r0.toString()
                java.lang.String r0 = r0.toString()
                r4.<init>(r0)
                throw r4
        }

        public final void setCompleting(boolean r1) {
                r0 = this;
                r0._isCompleting = r1
                return
        }

        public final void setRootCause(java.lang.Throwable r1) {
                r0 = this;
                r0._rootCause = r1
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Finishing[cancelling="
                r0.<init>(r1)
                boolean r1 = r2.isCancelling()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", completing="
                java.lang.StringBuilder r0 = r0.append(r1)
                boolean r1 = r2.isCompleting()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", rootCause="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.Throwable r1 = r2.getRootCause()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", exceptions="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.Object r1 = r2.getExceptionsHolder()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", list="
                java.lang.StringBuilder r0 = r0.append(r1)
                kotlinx.coroutines.NodeList r1 = r2.getList()
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 93
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_state"
            java.lang.Class<kotlinx.coroutines.JobSupport> r2 = kotlinx.coroutines.JobSupport.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.JobSupport._state$FU = r0
            return
    }

    public JobSupport(boolean r1) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto La
            kotlinx.coroutines.Empty r1 = kotlinx.coroutines.JobSupportKt.access$getEMPTY_ACTIVE$p()
            goto Le
        La:
            kotlinx.coroutines.Empty r1 = kotlinx.coroutines.JobSupportKt.access$getEMPTY_NEW$p()
        Le:
            r0._state = r1
            r1 = 0
            r0._parentHandle = r1
            return
    }

    public static final /* synthetic */ java.lang.Object access$awaitSuspend(kotlinx.coroutines.JobSupport r0, kotlin.coroutines.Continuation r1) {
            java.lang.Object r0 = r0.awaitSuspend(r1)
            return r0
    }

    public static final /* synthetic */ java.lang.String access$cancellationExceptionMessage(kotlinx.coroutines.JobSupport r0) {
            java.lang.String r0 = r0.cancellationExceptionMessage()
            return r0
    }

    public static final /* synthetic */ void access$continueCompleting(kotlinx.coroutines.JobSupport r0, kotlinx.coroutines.JobSupport.Finishing r1, kotlinx.coroutines.ChildHandleNode r2, java.lang.Object r3) {
            r0.continueCompleting(r1, r2, r3)
            return
    }

    public static final /* synthetic */ java.lang.Object access$joinSuspend(kotlinx.coroutines.JobSupport r0, kotlin.coroutines.Continuation r1) {
            java.lang.Object r0 = r0.joinSuspend(r1)
            return r0
    }

    private final boolean addLastAtomic(java.lang.Object r3, kotlinx.coroutines.NodeList r4, kotlinx.coroutines.JobNode r5) {
            r2 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r4
            kotlinx.coroutines.JobSupport$addLastAtomic$$inlined$addLastIf$1 r0 = new kotlinx.coroutines.JobSupport$addLastAtomic$$inlined$addLastIf$1
            kotlinx.coroutines.internal.LockFreeLinkedListNode r5 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r5
            r0.<init>(r5, r2, r3)
            kotlinx.coroutines.internal.LockFreeLinkedListNode$CondAddOp r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp) r0
        Lb:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = r4.getPrevNode()
            int r3 = r3.tryCondAddNext(r5, r4, r0)
            r1 = 1
            if (r3 == r1) goto L1b
            r1 = 2
            if (r3 == r1) goto L1a
            goto Lb
        L1a:
            r1 = 0
        L1b:
            return r1
    }

    private final void addSuppressedExceptions(java.lang.Throwable r5, java.util.List<? extends java.lang.Throwable> r6) {
            r4 = this;
            int r0 = r6.size()
            r1 = 1
            if (r0 > r1) goto L8
            return
        L8:
            int r0 = r6.size()
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            r1.<init>(r0)
            java.util.Map r1 = (java.util.Map) r1
            java.util.Set r0 = java.util.Collections.newSetFromMap(r1)
            boolean r1 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r1 != 0) goto L1f
            r1 = r5
            goto L23
        L1f:
            java.lang.Throwable r1 = kotlinx.coroutines.internal.StackTraceRecoveryKt.unwrapImpl(r5)
        L23:
            java.util.Iterator r6 = r6.iterator()
        L27:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L50
            java.lang.Object r2 = r6.next()
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            boolean r3 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r3 != 0) goto L3a
            goto L3e
        L3a:
            java.lang.Throwable r2 = kotlinx.coroutines.internal.StackTraceRecoveryKt.unwrapImpl(r2)
        L3e:
            if (r2 == r5) goto L27
            if (r2 == r1) goto L27
            boolean r3 = r2 instanceof java.util.concurrent.CancellationException
            if (r3 != 0) goto L27
            boolean r3 = r0.add(r2)
            if (r3 == 0) goto L27
            kotlin.ExceptionsKt.addSuppressed(r5, r2)
            goto L27
        L50:
            return
    }

    private final java.lang.Object awaitSuspend(kotlin.coroutines.Continuation<java.lang.Object> r5) {
            r4 = this;
            kotlinx.coroutines.JobSupport$AwaitContinuation r0 = new kotlinx.coroutines.JobSupport$AwaitContinuation
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r5)
            r0.<init>(r1, r4)
            r0.initCancellability()
            r1 = r0
            kotlinx.coroutines.CancellableContinuation r1 = (kotlinx.coroutines.CancellableContinuation) r1
            kotlinx.coroutines.ResumeAwaitOnCompletion r2 = new kotlinx.coroutines.ResumeAwaitOnCompletion
            r3 = r0
            kotlinx.coroutines.CancellableContinuationImpl r3 = (kotlinx.coroutines.CancellableContinuationImpl) r3
            r2.<init>(r3)
            kotlinx.coroutines.CompletionHandlerBase r2 = (kotlinx.coroutines.CompletionHandlerBase) r2
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlinx.coroutines.DisposableHandle r2 = r4.invokeOnCompletion(r2)
            kotlinx.coroutines.CancellableContinuationKt.disposeOnCancellation(r1, r2)
            java.lang.Object r0 = r0.getResult()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L2f
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r5)
        L2f:
            return r0
    }

    private final java.lang.Object cancelMakeCompleting(java.lang.Object r7) {
            r6 = this;
        L0:
            java.lang.Object r0 = r6.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 == 0) goto L2d
            boolean r1 = r0 instanceof kotlinx.coroutines.JobSupport.Finishing
            if (r1 == 0) goto L16
            r1 = r0
            kotlinx.coroutines.JobSupport$Finishing r1 = (kotlinx.coroutines.JobSupport.Finishing) r1
            boolean r1 = r1.isCompleting()
            if (r1 == 0) goto L16
            goto L2d
        L16:
            kotlinx.coroutines.CompletedExceptionally r1 = new kotlinx.coroutines.CompletedExceptionally
            java.lang.Throwable r2 = r6.createCauseException(r7)
            r3 = 2
            r4 = 0
            r5 = 0
            r1.<init>(r2, r5, r3, r4)
            java.lang.Object r0 = r6.tryMakeCompleting(r0, r1)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_RETRY$p()
            if (r0 == r1) goto L0
            return r0
        L2d:
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            return r7
    }

    private final boolean cancelParent(java.lang.Throwable r5) {
            r4 = this;
            boolean r0 = r4.isScopedCoroutine()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r5 instanceof java.util.concurrent.CancellationException
            kotlinx.coroutines.ChildHandle r2 = r4.getParentHandle$kotlinx_coroutines_core()
            if (r2 == 0) goto L20
            kotlinx.coroutines.NonDisposableHandle r3 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            if (r2 != r3) goto L15
            goto L20
        L15:
            boolean r5 = r2.childCancelled(r5)
            if (r5 != 0) goto L1f
            if (r0 == 0) goto L1e
            goto L1f
        L1e:
            r1 = 0
        L1f:
            return r1
        L20:
            return r0
    }

    private final void completeStateFinalization(kotlinx.coroutines.Incomplete r4, java.lang.Object r5) {
            r3 = this;
            kotlinx.coroutines.ChildHandle r0 = r3.getParentHandle$kotlinx_coroutines_core()
            if (r0 == 0) goto L10
            r0.dispose()
            kotlinx.coroutines.NonDisposableHandle r0 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            kotlinx.coroutines.ChildHandle r0 = (kotlinx.coroutines.ChildHandle) r0
            r3.setParentHandle$kotlinx_coroutines_core(r0)
        L10:
            boolean r0 = r5 instanceof kotlinx.coroutines.CompletedExceptionally
            r1 = 0
            if (r0 == 0) goto L18
            kotlinx.coroutines.CompletedExceptionally r5 = (kotlinx.coroutines.CompletedExceptionally) r5
            goto L19
        L18:
            r5 = r1
        L19:
            if (r5 == 0) goto L1d
            java.lang.Throwable r1 = r5.cause
        L1d:
            boolean r5 = r4 instanceof kotlinx.coroutines.JobNode
            if (r5 == 0) goto L4d
            r5 = r4
            kotlinx.coroutines.JobNode r5 = (kotlinx.coroutines.JobNode) r5     // Catch: java.lang.Throwable -> L28
            r5.invoke(r1)     // Catch: java.lang.Throwable -> L28
            goto L56
        L28:
            r5 = move-exception
            kotlinx.coroutines.CompletionHandlerException r0 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Exception in completion handler "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " for "
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.StringBuilder r4 = r4.append(r3)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4, r5)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r3.handleOnCompletionException$kotlinx_coroutines_core(r0)
            goto L56
        L4d:
            kotlinx.coroutines.NodeList r4 = r4.getList()
            if (r4 == 0) goto L56
            r3.notifyCompletion(r4, r1)
        L56:
            return
    }

    private final void continueCompleting(kotlinx.coroutines.JobSupport.Finishing r2, kotlinx.coroutines.ChildHandleNode r3, java.lang.Object r4) {
            r1 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L13
            java.lang.Object r0 = r1.getState$kotlinx_coroutines_core()
            if (r0 != r2) goto Ld
            goto L13
        Ld:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L13:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            kotlinx.coroutines.ChildHandleNode r3 = r1.nextChild(r3)
            if (r3 == 0) goto L22
            boolean r3 = r1.tryWaitForChild(r2, r3, r4)
            if (r3 == 0) goto L22
            return
        L22:
            java.lang.Object r2 = r1.finalizeFinishingState(r2, r4)
            r1.afterCompletion(r2)
            return
    }

    private final java.lang.Throwable createCauseException(java.lang.Object r4) {
            r3 = this;
            if (r4 != 0) goto L4
            r0 = 1
            goto L6
        L4:
            boolean r0 = r4 instanceof java.lang.Throwable
        L6:
            if (r0 == 0) goto L1c
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 != 0) goto L26
            kotlinx.coroutines.JobCancellationException r4 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r0 = access$cancellationExceptionMessage(r3)
            r1 = r3
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            r2 = 0
            r4.<init>(r0, r2, r1)
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            goto L26
        L1c:
            if (r4 == 0) goto L27
            kotlinx.coroutines.ParentJob r4 = (kotlinx.coroutines.ParentJob) r4
            java.util.concurrent.CancellationException r4 = r4.getChildJobCancellationCause()
            java.lang.Throwable r4 = (java.lang.Throwable) r4
        L26:
            return r4
        L27:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.ParentJob"
            r4.<init>(r0)
            throw r4
    }

    public static /* synthetic */ kotlinx.coroutines.JobCancellationException defaultCancellationException$kotlinx_coroutines_core$default(kotlinx.coroutines.JobSupport r1, java.lang.String r2, java.lang.Throwable r3, int r4, java.lang.Object r5) {
            if (r5 != 0) goto L1b
            r5 = r4 & 1
            r0 = 0
            if (r5 == 0) goto L8
            r2 = r0
        L8:
            r4 = r4 & 2
            if (r4 == 0) goto Ld
            r3 = r0
        Ld:
            kotlinx.coroutines.JobCancellationException r4 = new kotlinx.coroutines.JobCancellationException
            if (r2 != 0) goto L15
            java.lang.String r2 = access$cancellationExceptionMessage(r1)
        L15:
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            r4.<init>(r2, r3, r1)
            return r4
        L1b:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Super calls with default arguments not supported in this target, function: defaultCancellationException"
            r1.<init>(r2)
            throw r1
    }

    private final java.lang.Object finalizeFinishingState(kotlinx.coroutines.JobSupport.Finishing r6, java.lang.Object r7) {
            r5 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L13
            java.lang.Object r0 = r5.getState$kotlinx_coroutines_core()
            if (r0 != r6) goto Ld
            goto L13
        Ld:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            r6.<init>()
            throw r6
        L13:
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L26
            boolean r0 = r6.isSealed()
            if (r0 != 0) goto L20
            goto L26
        L20:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            r6.<init>()
            throw r6
        L26:
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L39
            boolean r0 = r6.isCompleting()
            if (r0 == 0) goto L33
            goto L39
        L33:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            r6.<init>()
            throw r6
        L39:
            boolean r0 = r7 instanceof kotlinx.coroutines.CompletedExceptionally
            r1 = 0
            if (r0 == 0) goto L42
            r0 = r7
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            goto L43
        L42:
            r0 = r1
        L43:
            if (r0 == 0) goto L48
            java.lang.Throwable r0 = r0.cause
            goto L49
        L48:
            r0 = r1
        L49:
            monitor-enter(r6)
            boolean r2 = r6.isCancelling()     // Catch: java.lang.Throwable -> Laf
            java.util.List r3 = r6.sealLocked(r0)     // Catch: java.lang.Throwable -> Laf
            java.lang.Throwable r4 = r5.getFinalRootCause(r6, r3)     // Catch: java.lang.Throwable -> Laf
            if (r4 == 0) goto L5b
            r5.addSuppressedExceptions(r4, r3)     // Catch: java.lang.Throwable -> Laf
        L5b:
            monitor-exit(r6)
            if (r4 != 0) goto L5f
            goto L69
        L5f:
            if (r4 != r0) goto L62
            goto L69
        L62:
            kotlinx.coroutines.CompletedExceptionally r7 = new kotlinx.coroutines.CompletedExceptionally
            r0 = 0
            r3 = 2
            r7.<init>(r4, r0, r3, r1)
        L69:
            if (r4 == 0) goto L88
            boolean r0 = r5.cancelParent(r4)
            if (r0 != 0) goto L77
            boolean r0 = r5.handleJobException(r4)
            if (r0 == 0) goto L88
        L77:
            if (r7 == 0) goto L80
            r0 = r7
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            r0.makeHandled()
            goto L88
        L80:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally"
            r6.<init>(r7)
            throw r6
        L88:
            if (r2 != 0) goto L8d
            r5.onCancelling(r4)
        L8d:
            r5.onCompletionInternal(r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.JobSupport._state$FU
            java.lang.Object r1 = kotlinx.coroutines.JobSupportKt.boxIncomplete(r7)
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r5, r6, r1)
            boolean r1 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r1 == 0) goto La9
            if (r0 == 0) goto La3
            goto La9
        La3:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            r6.<init>()
            throw r6
        La9:
            kotlinx.coroutines.Incomplete r6 = (kotlinx.coroutines.Incomplete) r6
            r5.completeStateFinalization(r6, r7)
            return r7
        Laf:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    private final kotlinx.coroutines.ChildHandleNode firstChild(kotlinx.coroutines.Incomplete r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlinx.coroutines.ChildHandleNode
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r3
            kotlinx.coroutines.ChildHandleNode r0 = (kotlinx.coroutines.ChildHandleNode) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 != 0) goto L19
            kotlinx.coroutines.NodeList r3 = r3.getList()
            if (r3 == 0) goto L1a
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            kotlinx.coroutines.ChildHandleNode r1 = r2.nextChild(r3)
            goto L1a
        L19:
            r1 = r0
        L1a:
            return r1
    }

    private final java.lang.Throwable getExceptionOrNull(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlinx.coroutines.CompletedExceptionally
            r1 = 0
            if (r0 == 0) goto L8
            kotlinx.coroutines.CompletedExceptionally r3 = (kotlinx.coroutines.CompletedExceptionally) r3
            goto L9
        L8:
            r3 = r1
        L9:
            if (r3 == 0) goto Ld
            java.lang.Throwable r1 = r3.cause
        Ld:
            return r1
    }

    private final java.lang.Throwable getFinalRootCause(kotlinx.coroutines.JobSupport.Finishing r5, java.util.List<? extends java.lang.Throwable> r6) {
            r4 = this;
            boolean r0 = r6.isEmpty()
            r1 = 0
            if (r0 == 0) goto L1d
            boolean r5 = r5.isCancelling()
            if (r5 == 0) goto L1c
            kotlinx.coroutines.JobCancellationException r5 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r6 = access$cancellationExceptionMessage(r4)
            r0 = r4
            kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
            r5.<init>(r6, r1, r0)
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            return r5
        L1c:
            return r1
        L1d:
            r5 = r6
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r0 = r5.iterator()
        L24:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            boolean r3 = r3 instanceof java.util.concurrent.CancellationException
            if (r3 != 0) goto L24
            goto L37
        L36:
            r2 = r1
        L37:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            if (r2 == 0) goto L3c
            return r2
        L3c:
            r0 = 0
            java.lang.Object r6 = r6.get(r0)
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            boolean r0 = r6 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r0 == 0) goto L64
            java.util.Iterator r5 = r5.iterator()
        L4b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L5f
            java.lang.Object r0 = r5.next()
            r2 = r0
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            if (r2 == r6) goto L4b
            boolean r2 = r2 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r2 == 0) goto L4b
            r1 = r0
        L5f:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L64
            return r1
        L64:
            return r6
    }

    private final kotlinx.coroutines.NodeList getOrPromoteCancellingList(kotlinx.coroutines.Incomplete r4) {
            r3 = this;
            kotlinx.coroutines.NodeList r0 = r4.getList()
            if (r0 != 0) goto L37
            boolean r0 = r4 instanceof kotlinx.coroutines.Empty
            if (r0 == 0) goto L10
            kotlinx.coroutines.NodeList r0 = new kotlinx.coroutines.NodeList
            r0.<init>()
            goto L37
        L10:
            boolean r0 = r4 instanceof kotlinx.coroutines.JobNode
            if (r0 == 0) goto L1e
            kotlinx.coroutines.JobNode r4 = (kotlinx.coroutines.JobNode) r4
            r3.promoteSingleToNodeList(r4)
            r0 = 0
            r4 = r0
            kotlinx.coroutines.NodeList r4 = (kotlinx.coroutines.NodeList) r4
            goto L37
        L1e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "State should have list: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L37:
            return r0
    }

    private final boolean isCancelling(kotlinx.coroutines.Incomplete r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlinx.coroutines.JobSupport.Finishing
            if (r0 == 0) goto Le
            kotlinx.coroutines.JobSupport$Finishing r2 = (kotlinx.coroutines.JobSupport.Finishing) r2
            boolean r2 = r2.isCancelling()
            if (r2 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    private final boolean joinInternal() {
            r2 = this;
        L0:
            java.lang.Object r0 = r2.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 != 0) goto La
            r0 = 0
            return r0
        La:
            int r0 = r2.startInternal(r0)
            if (r0 < 0) goto L0
            r0 = 1
            return r0
    }

    private final java.lang.Object joinSuspend(kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
            r4 = this;
            kotlinx.coroutines.CancellableContinuationImpl r0 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r5)
            r2 = 1
            r0.<init>(r1, r2)
            r0.initCancellability()
            r1 = r0
            kotlinx.coroutines.CancellableContinuation r1 = (kotlinx.coroutines.CancellableContinuation) r1
            kotlinx.coroutines.ResumeOnCompletion r2 = new kotlinx.coroutines.ResumeOnCompletion
            r3 = r1
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            r2.<init>(r3)
            kotlinx.coroutines.CompletionHandlerBase r2 = (kotlinx.coroutines.CompletionHandlerBase) r2
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlinx.coroutines.DisposableHandle r2 = r4.invokeOnCompletion(r2)
            kotlinx.coroutines.CancellableContinuationKt.disposeOnCancellation(r1, r2)
            java.lang.Object r0 = r0.getResult()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L30
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r5)
        L30:
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r5) goto L37
            return r0
        L37:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
    }

    private final java.lang.Void loopOnState(kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> r2) {
            r1 = this;
        L0:
            java.lang.Object r0 = r1.getState$kotlinx_coroutines_core()
            r2.invoke(r0)
            goto L0
    }

    private final java.lang.Object makeCancelling(java.lang.Object r7) {
            r6 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r6.getState$kotlinx_coroutines_core()
            boolean r3 = r2 instanceof kotlinx.coroutines.JobSupport.Finishing
            if (r3 == 0) goto L4f
            monitor-enter(r2)
            r3 = r2
            kotlinx.coroutines.JobSupport$Finishing r3 = (kotlinx.coroutines.JobSupport.Finishing) r3     // Catch: java.lang.Throwable -> L4c
            boolean r3 = r3.isSealed()     // Catch: java.lang.Throwable -> L4c
            if (r3 == 0) goto L1a
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.JobSupportKt.access$getTOO_LATE_TO_CANCEL$p()     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r2)
            return r7
        L1a:
            r3 = r2
            kotlinx.coroutines.JobSupport$Finishing r3 = (kotlinx.coroutines.JobSupport.Finishing) r3     // Catch: java.lang.Throwable -> L4c
            boolean r3 = r3.isCancelling()     // Catch: java.lang.Throwable -> L4c
            if (r7 != 0) goto L25
            if (r3 != 0) goto L31
        L25:
            if (r1 != 0) goto L2b
            java.lang.Throwable r1 = r6.createCauseException(r7)     // Catch: java.lang.Throwable -> L4c
        L2b:
            r7 = r2
            kotlinx.coroutines.JobSupport$Finishing r7 = (kotlinx.coroutines.JobSupport.Finishing) r7     // Catch: java.lang.Throwable -> L4c
            r7.addExceptionLocked(r1)     // Catch: java.lang.Throwable -> L4c
        L31:
            r7 = r2
            kotlinx.coroutines.JobSupport$Finishing r7 = (kotlinx.coroutines.JobSupport.Finishing) r7     // Catch: java.lang.Throwable -> L4c
            java.lang.Throwable r7 = r7.getRootCause()     // Catch: java.lang.Throwable -> L4c
            if (r3 != 0) goto L3b
            r0 = r7
        L3b:
            monitor-exit(r2)
            if (r0 == 0) goto L47
            kotlinx.coroutines.JobSupport$Finishing r2 = (kotlinx.coroutines.JobSupport.Finishing) r2
            kotlinx.coroutines.NodeList r7 = r2.getList()
            r6.notifyCancelling(r7, r0)
        L47:
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            return r7
        L4c:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        L4f:
            boolean r3 = r2 instanceof kotlinx.coroutines.Incomplete
            if (r3 == 0) goto L9e
            if (r1 != 0) goto L59
            java.lang.Throwable r1 = r6.createCauseException(r7)
        L59:
            r3 = r2
            kotlinx.coroutines.Incomplete r3 = (kotlinx.coroutines.Incomplete) r3
            boolean r4 = r3.isActive()
            if (r4 == 0) goto L6d
            boolean r2 = r6.tryMakeCancelling(r3, r1)
            if (r2 == 0) goto L2
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            return r7
        L6d:
            kotlinx.coroutines.CompletedExceptionally r3 = new kotlinx.coroutines.CompletedExceptionally
            r4 = 0
            r5 = 2
            r3.<init>(r1, r4, r5, r0)
            java.lang.Object r3 = r6.tryMakeCompleting(r2, r3)
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            if (r3 == r4) goto L85
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_RETRY$p()
            if (r3 == r2) goto L2
            return r3
        L85:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot happen in "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L9e:
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.JobSupportKt.access$getTOO_LATE_TO_CANCEL$p()
            return r7
    }

    private final kotlinx.coroutines.JobNode makeNode(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r2, boolean r3) {
            r1 = this;
            r0 = 0
            if (r3 == 0) goto L17
            boolean r3 = r2 instanceof kotlinx.coroutines.JobCancellingNode
            if (r3 == 0) goto La
            r0 = r2
            kotlinx.coroutines.JobCancellingNode r0 = (kotlinx.coroutines.JobCancellingNode) r0
        La:
            if (r0 != 0) goto L14
            kotlinx.coroutines.InvokeOnCancelling r3 = new kotlinx.coroutines.InvokeOnCancelling
            r3.<init>(r2)
            r0 = r3
            kotlinx.coroutines.JobCancellingNode r0 = (kotlinx.coroutines.JobCancellingNode) r0
        L14:
            kotlinx.coroutines.JobNode r0 = (kotlinx.coroutines.JobNode) r0
            goto L39
        L17:
            boolean r3 = r2 instanceof kotlinx.coroutines.JobNode
            if (r3 == 0) goto L1e
            r0 = r2
            kotlinx.coroutines.JobNode r0 = (kotlinx.coroutines.JobNode) r0
        L1e:
            if (r0 == 0) goto L31
            boolean r2 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r2 == 0) goto L39
            boolean r2 = r0 instanceof kotlinx.coroutines.JobCancellingNode
            if (r2 != 0) goto L2b
            goto L39
        L2b:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L31:
            kotlinx.coroutines.InvokeOnCompletion r3 = new kotlinx.coroutines.InvokeOnCompletion
            r3.<init>(r2)
            r0 = r3
            kotlinx.coroutines.JobNode r0 = (kotlinx.coroutines.JobNode) r0
        L39:
            r0.setJob(r1)
            return r0
    }

    private final kotlinx.coroutines.ChildHandleNode nextChild(kotlinx.coroutines.internal.LockFreeLinkedListNode r2) {
            r1 = this;
        L0:
            boolean r0 = r2.isRemoved()
            if (r0 == 0) goto Lb
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = r2.getPrevNode()
            goto L0
        Lb:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = r2.getNextNode()
            boolean r0 = r2.isRemoved()
            if (r0 != 0) goto Lb
            boolean r0 = r2 instanceof kotlinx.coroutines.ChildHandleNode
            if (r0 == 0) goto L1c
            kotlinx.coroutines.ChildHandleNode r2 = (kotlinx.coroutines.ChildHandleNode) r2
            return r2
        L1c:
            boolean r0 = r2 instanceof kotlinx.coroutines.NodeList
            if (r0 == 0) goto Lb
            r2 = 0
            return r2
    }

    private final void notifyCancelling(kotlinx.coroutines.NodeList r7, java.lang.Throwable r8) {
            r6 = this;
            r6.onCancelling(r8)
            kotlinx.coroutines.internal.LockFreeLinkedListHead r7 = (kotlinx.coroutines.internal.LockFreeLinkedListHead) r7
            java.lang.Object r0 = r7.getNext()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r1 = 0
        Lc:
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r7)
            if (r2 != 0) goto L4d
            boolean r2 = r0 instanceof kotlinx.coroutines.JobCancellingNode
            if (r2 == 0) goto L48
            r2 = r0
            kotlinx.coroutines.JobNode r2 = (kotlinx.coroutines.JobNode) r2
            r2.invoke(r8)     // Catch: java.lang.Throwable -> L1d
            goto L48
        L1d:
            r3 = move-exception
            r4 = r1
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == 0) goto L28
            kotlin.ExceptionsKt.addSuppressed(r4, r3)
            if (r4 != 0) goto L48
        L28:
            kotlinx.coroutines.CompletionHandlerException r1 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Exception in completion handler "
            r4.<init>(r5)
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r4 = " for "
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r3)
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        L48:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.getNextNode()
            goto Lc
        L4d:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L54
            r6.handleOnCompletionException$kotlinx_coroutines_core(r1)
        L54:
            r6.cancelParent(r8)
            return
    }

    private final void notifyCompletion(kotlinx.coroutines.NodeList r7, java.lang.Throwable r8) {
            r6 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListHead r7 = (kotlinx.coroutines.internal.LockFreeLinkedListHead) r7
            java.lang.Object r0 = r7.getNext()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r1 = 0
        L9:
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r7)
            if (r2 != 0) goto L4a
            boolean r2 = r0 instanceof kotlinx.coroutines.JobNode
            if (r2 == 0) goto L45
            r2 = r0
            kotlinx.coroutines.JobNode r2 = (kotlinx.coroutines.JobNode) r2
            r2.invoke(r8)     // Catch: java.lang.Throwable -> L1a
            goto L45
        L1a:
            r3 = move-exception
            r4 = r1
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == 0) goto L25
            kotlin.ExceptionsKt.addSuppressed(r4, r3)
            if (r4 != 0) goto L45
        L25:
            kotlinx.coroutines.CompletionHandlerException r1 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Exception in completion handler "
            r4.<init>(r5)
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r4 = " for "
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r3)
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        L45:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.getNextNode()
            goto L9
        L4a:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L51
            r6.handleOnCompletionException$kotlinx_coroutines_core(r1)
        L51:
            return
    }

    private final /* synthetic */ <T extends kotlinx.coroutines.JobNode> void notifyHandlers(kotlinx.coroutines.NodeList r7, java.lang.Throwable r8) {
            r6 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListHead r7 = (kotlinx.coroutines.internal.LockFreeLinkedListHead) r7
            java.lang.Object r0 = r7.getNext()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r1 = 0
        L9:
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r7)
            if (r2 != 0) goto L56
            r2 = 3
            java.lang.String r3 = "T"
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r2, r3)
            boolean r2 = r0 instanceof kotlinx.coroutines.internal.LockFreeLinkedListNode
            if (r2 == 0) goto L51
            r2 = r0
            kotlinx.coroutines.JobNode r2 = (kotlinx.coroutines.JobNode) r2
            r2.invoke(r8)     // Catch: java.lang.Throwable -> L20
            goto L51
        L20:
            r3 = move-exception
            r4 = r1
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == 0) goto L2e
            r5 = r4
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            kotlin.ExceptionsKt.addSuppressed(r4, r3)
            if (r4 != 0) goto L51
        L2e:
            r1 = r6
            kotlinx.coroutines.JobSupport r1 = (kotlinx.coroutines.JobSupport) r1
            kotlinx.coroutines.CompletionHandlerException r1 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Exception in completion handler "
            r4.<init>(r5)
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r4 = " for "
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r3)
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        L51:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.getNextNode()
            goto L9
        L56:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L60
            r7 = r1
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            r6.handleOnCompletionException$kotlinx_coroutines_core(r1)
        L60:
            return
    }

    private final void promoteEmptyToNodeList(kotlinx.coroutines.Empty r3) {
            r2 = this;
            kotlinx.coroutines.NodeList r0 = new kotlinx.coroutines.NodeList
            r0.<init>()
            boolean r1 = r3.isActive()
            if (r1 == 0) goto Le
            kotlinx.coroutines.Incomplete r0 = (kotlinx.coroutines.Incomplete) r0
            goto L16
        Le:
            kotlinx.coroutines.InactiveNodeList r1 = new kotlinx.coroutines.InactiveNodeList
            r1.<init>(r0)
            r0 = r1
            kotlinx.coroutines.Incomplete r0 = (kotlinx.coroutines.Incomplete) r0
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.JobSupport._state$FU
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r2, r3, r0)
            return
    }

    private final void promoteSingleToNodeList(kotlinx.coroutines.JobNode r3) {
            r2 = this;
            kotlinx.coroutines.NodeList r0 = new kotlinx.coroutines.NodeList
            r0.<init>()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r3.addOneIfEmpty(r0)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r3.getNextNode()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.JobSupport._state$FU
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r2, r3, r0)
            return
    }

    private final int startInternal(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.Empty
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L22
            r0 = r5
            kotlinx.coroutines.Empty r0 = (kotlinx.coroutines.Empty) r0
            boolean r0 = r0.isActive()
            if (r0 == 0) goto L11
            return r3
        L11:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.JobSupport._state$FU
            kotlinx.coroutines.Empty r3 = kotlinx.coroutines.JobSupportKt.access$getEMPTY_ACTIVE$p()
            boolean r5 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r4, r5, r3)
            if (r5 != 0) goto L1e
            return r1
        L1e:
            r4.onStart()
            return r2
        L22:
            boolean r0 = r5 instanceof kotlinx.coroutines.InactiveNodeList
            if (r0 == 0) goto L3a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.JobSupport._state$FU
            r3 = r5
            kotlinx.coroutines.InactiveNodeList r3 = (kotlinx.coroutines.InactiveNodeList) r3
            kotlinx.coroutines.NodeList r3 = r3.getList()
            boolean r5 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r4, r5, r3)
            if (r5 != 0) goto L36
            return r1
        L36:
            r4.onStart()
            return r2
        L3a:
            return r3
    }

    private final java.lang.String stateString(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlinx.coroutines.JobSupport.Finishing
            java.lang.String r1 = "Active"
            if (r0 == 0) goto L1a
            kotlinx.coroutines.JobSupport$Finishing r3 = (kotlinx.coroutines.JobSupport.Finishing) r3
            boolean r0 = r3.isCancelling()
            if (r0 == 0) goto L11
            java.lang.String r1 = "Cancelling"
            goto L33
        L11:
            boolean r3 = r3.isCompleting()
            if (r3 == 0) goto L33
            java.lang.String r1 = "Completing"
            goto L33
        L1a:
            boolean r0 = r3 instanceof kotlinx.coroutines.Incomplete
            if (r0 == 0) goto L2a
            kotlinx.coroutines.Incomplete r3 = (kotlinx.coroutines.Incomplete) r3
            boolean r3 = r3.isActive()
            if (r3 == 0) goto L27
            goto L33
        L27:
            java.lang.String r1 = "New"
            goto L33
        L2a:
            boolean r3 = r3 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r3 == 0) goto L31
            java.lang.String r1 = "Cancelled"
            goto L33
        L31:
            java.lang.String r1 = "Completed"
        L33:
            return r1
    }

    public static /* synthetic */ java.util.concurrent.CancellationException toCancellationException$default(kotlinx.coroutines.JobSupport r0, java.lang.Throwable r1, java.lang.String r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto Lc
            r3 = r3 & 1
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            java.util.concurrent.CancellationException r0 = r0.toCancellationException(r1, r2)
            return r0
        Lc:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: toCancellationException"
            r0.<init>(r1)
            throw r0
    }

    private final boolean tryFinalizeSimpleState(kotlinx.coroutines.Incomplete r3, java.lang.Object r4) {
            r2 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L15
            boolean r0 = r3 instanceof kotlinx.coroutines.Empty
            if (r0 != 0) goto L15
            boolean r0 = r3 instanceof kotlinx.coroutines.JobNode
            if (r0 == 0) goto Lf
            goto L15
        Lf:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
        L15:
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L26
            boolean r0 = r4 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r0 != 0) goto L20
            goto L26
        L20:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
        L26:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.JobSupport._state$FU
            java.lang.Object r1 = kotlinx.coroutines.JobSupportKt.boxIncomplete(r4)
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r2, r3, r1)
            if (r0 != 0) goto L34
            r3 = 0
            return r3
        L34:
            r0 = 0
            r2.onCancelling(r0)
            r2.onCompletionInternal(r4)
            r2.completeStateFinalization(r3, r4)
            r3 = 1
            return r3
    }

    private final boolean tryMakeCancelling(kotlinx.coroutines.Incomplete r5, java.lang.Throwable r6) {
            r4 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L11
            boolean r0 = r5 instanceof kotlinx.coroutines.JobSupport.Finishing
            if (r0 != 0) goto Lb
            goto L11
        Lb:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L11:
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L24
            boolean r0 = r5.isActive()
            if (r0 == 0) goto L1e
            goto L24
        L1e:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L24:
            kotlinx.coroutines.NodeList r0 = r4.getOrPromoteCancellingList(r5)
            r1 = 0
            if (r0 != 0) goto L2c
            return r1
        L2c:
            kotlinx.coroutines.JobSupport$Finishing r2 = new kotlinx.coroutines.JobSupport$Finishing
            r2.<init>(r0, r1, r6)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.JobSupport._state$FU
            boolean r5 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r3, r4, r5, r2)
            if (r5 != 0) goto L3a
            return r1
        L3a:
            r4.notifyCancelling(r0, r6)
            r5 = 1
            return r5
    }

    private final java.lang.Object tryMakeCompleting(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            boolean r0 = r2 instanceof kotlinx.coroutines.Incomplete
            if (r0 != 0) goto L9
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            return r2
        L9:
            boolean r0 = r2 instanceof kotlinx.coroutines.Empty
            if (r0 != 0) goto L11
            boolean r0 = r2 instanceof kotlinx.coroutines.JobNode
            if (r0 == 0) goto L27
        L11:
            boolean r0 = r2 instanceof kotlinx.coroutines.ChildHandleNode
            if (r0 != 0) goto L27
            boolean r0 = r3 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r0 != 0) goto L27
            kotlinx.coroutines.Incomplete r2 = (kotlinx.coroutines.Incomplete) r2
            boolean r2 = r1.tryFinalizeSimpleState(r2, r3)
            if (r2 == 0) goto L22
            return r3
        L22:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_RETRY$p()
            return r2
        L27:
            kotlinx.coroutines.Incomplete r2 = (kotlinx.coroutines.Incomplete) r2
            java.lang.Object r2 = r1.tryMakeCompletingSlowPath(r2, r3)
            return r2
    }

    private final java.lang.Object tryMakeCompletingSlowPath(kotlinx.coroutines.Incomplete r8, java.lang.Object r9) {
            r7 = this;
            kotlinx.coroutines.NodeList r0 = r7.getOrPromoteCancellingList(r8)
            if (r0 != 0) goto Lb
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_RETRY$p()
            return r8
        Lb:
            boolean r1 = r8 instanceof kotlinx.coroutines.JobSupport.Finishing
            r2 = 0
            if (r1 == 0) goto L14
            r1 = r8
            kotlinx.coroutines.JobSupport$Finishing r1 = (kotlinx.coroutines.JobSupport.Finishing) r1
            goto L15
        L14:
            r1 = r2
        L15:
            r3 = 0
            if (r1 != 0) goto L1d
            kotlinx.coroutines.JobSupport$Finishing r1 = new kotlinx.coroutines.JobSupport$Finishing
            r1.<init>(r0, r3, r2)
        L1d:
            kotlin.jvm.internal.Ref$ObjectRef r3 = new kotlin.jvm.internal.Ref$ObjectRef
            r3.<init>()
            monitor-enter(r1)
            boolean r4 = r1.isCompleting()     // Catch: java.lang.Throwable -> L9c
            if (r4 == 0) goto L2f
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()     // Catch: java.lang.Throwable -> L9c
            monitor-exit(r1)
            return r8
        L2f:
            r4 = 1
            r1.setCompleting(r4)     // Catch: java.lang.Throwable -> L9c
            if (r1 == r8) goto L43
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.JobSupport._state$FU     // Catch: java.lang.Throwable -> L9c
            boolean r5 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r5, r7, r8, r1)     // Catch: java.lang.Throwable -> L9c
            if (r5 != 0) goto L43
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_RETRY$p()     // Catch: java.lang.Throwable -> L9c
            monitor-exit(r1)
            return r8
        L43:
            boolean r5 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()     // Catch: java.lang.Throwable -> L9c
            if (r5 == 0) goto L56
            boolean r5 = r1.isSealed()     // Catch: java.lang.Throwable -> L9c
            if (r5 != 0) goto L50
            goto L56
        L50:
            java.lang.AssertionError r8 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L9c
            r8.<init>()     // Catch: java.lang.Throwable -> L9c
            throw r8     // Catch: java.lang.Throwable -> L9c
        L56:
            boolean r5 = r1.isCancelling()     // Catch: java.lang.Throwable -> L9c
            boolean r6 = r9 instanceof kotlinx.coroutines.CompletedExceptionally     // Catch: java.lang.Throwable -> L9c
            if (r6 == 0) goto L62
            r6 = r9
            kotlinx.coroutines.CompletedExceptionally r6 = (kotlinx.coroutines.CompletedExceptionally) r6     // Catch: java.lang.Throwable -> L9c
            goto L63
        L62:
            r6 = r2
        L63:
            if (r6 == 0) goto L6a
            java.lang.Throwable r6 = r6.cause     // Catch: java.lang.Throwable -> L9c
            r1.addExceptionLocked(r6)     // Catch: java.lang.Throwable -> L9c
        L6a:
            java.lang.Throwable r6 = r1.getRootCause()     // Catch: java.lang.Throwable -> L9c
            r4 = r4 ^ r5
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L9c
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L9c
            if (r4 == 0) goto L7a
            r2 = r6
        L7a:
            r3.element = r2     // Catch: java.lang.Throwable -> L9c
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L9c
            monitor-exit(r1)
            T r2 = r3.element
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            if (r2 == 0) goto L88
            r7.notifyCancelling(r0, r2)
        L88:
            kotlinx.coroutines.ChildHandleNode r8 = r7.firstChild(r8)
            if (r8 == 0) goto L97
            boolean r8 = r7.tryWaitForChild(r1, r8, r9)
            if (r8 == 0) goto L97
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN
            return r8
        L97:
            java.lang.Object r8 = r7.finalizeFinishingState(r1, r9)
            return r8
        L9c:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
    }

    private final boolean tryWaitForChild(kotlinx.coroutines.JobSupport.Finishing r8, kotlinx.coroutines.ChildHandleNode r9, java.lang.Object r10) {
            r7 = this;
        L0:
            kotlinx.coroutines.ChildJob r0 = r9.childJob
            r1 = r0
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            kotlinx.coroutines.JobSupport$ChildCompletion r0 = new kotlinx.coroutines.JobSupport$ChildCompletion
            r0.<init>(r7, r8, r9, r10)
            kotlinx.coroutines.CompletionHandlerBase r0 = (kotlinx.coroutines.CompletionHandlerBase) r0
            r4 = r0
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r5 = 1
            r6 = 0
            r2 = 0
            r3 = 0
            kotlinx.coroutines.DisposableHandle r0 = kotlinx.coroutines.Job.DefaultImpls.invokeOnCompletion$default(r1, r2, r3, r4, r5, r6)
            kotlinx.coroutines.NonDisposableHandle r1 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            if (r0 == r1) goto L1d
            r8 = 1
            return r8
        L1d:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r9 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r9
            kotlinx.coroutines.ChildHandleNode r9 = r7.nextChild(r9)
            if (r9 != 0) goto L0
            r8 = 0
            return r8
    }

    protected void afterCompletion(java.lang.Object r1) {
            r0 = this;
            return
    }

    @Override // kotlinx.coroutines.Job
    public final kotlinx.coroutines.ChildHandle attachChild(kotlinx.coroutines.ChildJob r7) {
            r6 = this;
            r0 = r6
            kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
            kotlinx.coroutines.ChildHandleNode r1 = new kotlinx.coroutines.ChildHandleNode
            r1.<init>(r7)
            kotlinx.coroutines.CompletionHandlerBase r1 = (kotlinx.coroutines.CompletionHandlerBase) r1
            r3 = r1
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r4 = 2
            r5 = 0
            r1 = 1
            r2 = 0
            kotlinx.coroutines.DisposableHandle r7 = kotlinx.coroutines.Job.DefaultImpls.invokeOnCompletion$default(r0, r1, r2, r3, r4, r5)
            kotlinx.coroutines.ChildHandle r7 = (kotlinx.coroutines.ChildHandle) r7
            return r7
    }

    public final java.lang.Object awaitInternal$kotlinx_coroutines_core(kotlin.coroutines.Continuation<java.lang.Object> r3) {
            r2 = this;
        L0:
            java.lang.Object r0 = r2.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 != 0) goto L28
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 == 0) goto L23
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            java.lang.Throwable r0 = r0.cause
            boolean r1 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r1 == 0) goto L22
            boolean r1 = r3 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r1 != 0) goto L1b
            throw r0
        L1b:
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r3 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r3
            java.lang.Throwable r3 = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(r0, r3)
            throw r3
        L22:
            throw r0
        L23:
            java.lang.Object r3 = kotlinx.coroutines.JobSupportKt.unboxState(r0)
            return r3
        L28:
            int r0 = r2.startInternal(r0)
            if (r0 < 0) goto L0
            java.lang.Object r3 = r2.awaitSuspend(r3)
            return r3
    }

    @Override // kotlinx.coroutines.Job
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
            r0 = this;
            kotlinx.coroutines.Job.DefaultImpls.cancel(r0)
            return
    }

    @Override // kotlinx.coroutines.Job
    public void cancel(java.util.concurrent.CancellationException r4) {
            r3 = this;
            if (r4 != 0) goto L11
            kotlinx.coroutines.JobCancellationException r4 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r0 = access$cancellationExceptionMessage(r3)
            r1 = r3
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            r2 = 0
            r4.<init>(r0, r2, r1)
            java.util.concurrent.CancellationException r4 = (java.util.concurrent.CancellationException) r4
        L11:
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            r3.cancelInternal(r4)
            return
    }

    @Override // kotlinx.coroutines.Job
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Added since 1.2.0 for binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean cancel(java.lang.Throwable r5) {
            r4 = this;
            r0 = 1
            r1 = 0
            if (r5 == 0) goto La
            java.util.concurrent.CancellationException r5 = toCancellationException$default(r4, r5, r1, r0, r1)
            if (r5 != 0) goto L18
        La:
            kotlinx.coroutines.JobCancellationException r5 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r2 = access$cancellationExceptionMessage(r4)
            r3 = r4
            kotlinx.coroutines.Job r3 = (kotlinx.coroutines.Job) r3
            r5.<init>(r2, r1, r3)
            java.util.concurrent.CancellationException r5 = (java.util.concurrent.CancellationException) r5
        L18:
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            r4.cancelInternal(r5)
            return r0
    }

    public final boolean cancelCoroutine(java.lang.Throwable r1) {
            r0 = this;
            boolean r1 = r0.cancelImpl$kotlinx_coroutines_core(r1)
            return r1
    }

    public final boolean cancelImpl$kotlinx_coroutines_core(java.lang.Object r4) {
            r3 = this;
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            boolean r1 = r3.getOnCancelComplete$kotlinx_coroutines_core()
            r2 = 1
            if (r1 == 0) goto L14
            java.lang.Object r0 = r3.cancelMakeCompleting(r4)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN
            if (r0 != r1) goto L14
            return r2
        L14:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            if (r0 != r1) goto L1e
            java.lang.Object r0 = r3.makeCancelling(r4)
        L1e:
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            if (r0 != r4) goto L25
            goto L35
        L25:
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN
            if (r0 != r4) goto L2a
            goto L35
        L2a:
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.JobSupportKt.access$getTOO_LATE_TO_CANCEL$p()
            if (r0 != r4) goto L32
            r2 = 0
            goto L35
        L32:
            r3.afterCompletion(r0)
        L35:
            return r2
    }

    public void cancelInternal(java.lang.Throwable r1) {
            r0 = this;
            r0.cancelImpl$kotlinx_coroutines_core(r1)
            return
    }

    protected java.lang.String cancellationExceptionMessage() {
            r1 = this;
            java.lang.String r0 = "Job was cancelled"
            return r0
    }

    public boolean childCancelled(java.lang.Throwable r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.util.concurrent.CancellationException
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            boolean r3 = r2.cancelImpl$kotlinx_coroutines_core(r3)
            if (r3 == 0) goto L13
            boolean r3 = r2.getHandlesException$kotlinx_coroutines_core()
            if (r3 == 0) goto L13
            goto L14
        L13:
            r1 = 0
        L14:
            return r1
    }

    public final kotlinx.coroutines.JobCancellationException defaultCancellationException$kotlinx_coroutines_core(java.lang.String r3, java.lang.Throwable r4) {
            r2 = this;
            kotlinx.coroutines.JobCancellationException r0 = new kotlinx.coroutines.JobCancellationException
            if (r3 != 0) goto L8
            java.lang.String r3 = access$cancellationExceptionMessage(r2)
        L8:
            r1 = r2
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            r0.<init>(r3, r4, r1)
            return r0
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r1, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> r2) {
            r0 = this;
            java.lang.Object r1 = kotlinx.coroutines.Job.DefaultImpls.fold(r0, r1, r2)
            return r1
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> r1) {
            r0 = this;
            kotlin.coroutines.CoroutineContext$Element r1 = kotlinx.coroutines.Job.DefaultImpls.get(r0, r1)
            return r1
    }

    @Override // kotlinx.coroutines.Job
    public final java.util.concurrent.CancellationException getCancellationException() {
            r4 = this;
            java.lang.Object r0 = r4.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.JobSupport.Finishing
            java.lang.String r2 = "Job is still new or active: "
            if (r1 == 0) goto L47
            kotlinx.coroutines.JobSupport$Finishing r0 = (kotlinx.coroutines.JobSupport.Finishing) r0
            java.lang.Throwable r0 = r0.getRootCause()
            if (r0 == 0) goto L30
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r4)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r3 = " is cancelling"
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.util.concurrent.CancellationException r0 = r4.toCancellationException(r0, r1)
            if (r0 == 0) goto L30
            goto L7b
        L30:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L47:
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 != 0) goto L7c
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            r2 = 0
            if (r1 == 0) goto L5a
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            java.lang.Throwable r0 = r0.cause
            r1 = 1
            java.util.concurrent.CancellationException r0 = toCancellationException$default(r4, r0, r2, r1, r2)
            goto L7b
        L5a:
            kotlinx.coroutines.JobCancellationException r0 = new kotlinx.coroutines.JobCancellationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r4)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r3 = " has completed normally"
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r3 = r4
            kotlinx.coroutines.Job r3 = (kotlinx.coroutines.Job) r3
            r0.<init>(r1, r2, r3)
            java.util.concurrent.CancellationException r0 = (java.util.concurrent.CancellationException) r0
        L7b:
            return r0
        L7c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlinx.coroutines.ParentJob
    public java.util.concurrent.CancellationException getChildJobCancellationCause() {
            r5 = this;
            java.lang.Object r0 = r5.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.JobSupport.Finishing
            r2 = 0
            if (r1 == 0) goto L11
            r1 = r0
            kotlinx.coroutines.JobSupport$Finishing r1 = (kotlinx.coroutines.JobSupport.Finishing) r1
            java.lang.Throwable r1 = r1.getRootCause()
            goto L20
        L11:
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 == 0) goto L1b
            r1 = r0
            kotlinx.coroutines.CompletedExceptionally r1 = (kotlinx.coroutines.CompletedExceptionally) r1
            java.lang.Throwable r1 = r1.cause
            goto L20
        L1b:
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 != 0) goto L47
            r1 = r2
        L20:
            boolean r3 = r1 instanceof java.util.concurrent.CancellationException
            if (r3 == 0) goto L27
            r2 = r1
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L27:
            if (r2 != 0) goto L46
            kotlinx.coroutines.JobCancellationException r2 = new kotlinx.coroutines.JobCancellationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Parent job is "
            r3.<init>(r4)
            java.lang.String r0 = r5.stateString(r0)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r0 = r0.toString()
            r3 = r5
            kotlinx.coroutines.Job r3 = (kotlinx.coroutines.Job) r3
            r2.<init>(r0, r1, r3)
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L46:
            return r2
        L47:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Cannot be cancelling child in this state: "
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // kotlinx.coroutines.Job
    public final kotlin.sequences.Sequence<kotlinx.coroutines.Job> getChildren() {
            r2 = this;
            kotlinx.coroutines.JobSupport$children$1 r0 = new kotlinx.coroutines.JobSupport$children$1
            r1 = 0
            r0.<init>(r2, r1)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.sequence(r0)
            return r0
    }

    public final java.lang.Object getCompletedInternal$kotlinx_coroutines_core() {
            r2 = this;
            java.lang.Object r0 = r2.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 != 0) goto L16
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 != 0) goto L11
            java.lang.Object r0 = kotlinx.coroutines.JobSupportKt.unboxState(r0)
            return r0
        L11:
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            java.lang.Throwable r0 = r0.cause
            throw r0
        L16:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This job has not completed yet"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    protected final java.lang.Throwable getCompletionCause() {
            r3 = this;
            java.lang.Object r0 = r3.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.JobSupport.Finishing
            java.lang.String r2 = "Job is still new or active: "
            if (r1 == 0) goto L2a
            kotlinx.coroutines.JobSupport$Finishing r0 = (kotlinx.coroutines.JobSupport.Finishing) r0
            java.lang.Throwable r0 = r0.getRootCause()
            if (r0 == 0) goto L13
            goto L38
        L13:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L2a:
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 != 0) goto L39
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 == 0) goto L37
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            java.lang.Throwable r0 = r0.cause
            goto L38
        L37:
            r0 = 0
        L38:
            return r0
        L39:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    protected final boolean getCompletionCauseHandled() {
            r2 = this;
            java.lang.Object r0 = r2.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 == 0) goto L12
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            boolean r0 = r0.getHandled()
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    public final java.lang.Throwable getCompletionExceptionOrNull() {
            r2 = this;
            java.lang.Object r0 = r2.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 != 0) goto Ld
            java.lang.Throwable r0 = r2.getExceptionOrNull(r0)
            return r0
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This job has not completed yet"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public boolean getHandlesException$kotlinx_coroutines_core() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.CoroutineContext.Key<?> getKey() {
            r1 = this;
            kotlinx.coroutines.Job$Key r0 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Key r0 = (kotlin.coroutines.CoroutineContext.Key) r0
            return r0
    }

    public boolean getOnCancelComplete$kotlinx_coroutines_core() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.Job
    public final kotlinx.coroutines.selects.SelectClause0 getOnJoin() {
            r1 = this;
            r0 = r1
            kotlinx.coroutines.selects.SelectClause0 r0 = (kotlinx.coroutines.selects.SelectClause0) r0
            return r0
    }

    public final kotlinx.coroutines.ChildHandle getParentHandle$kotlinx_coroutines_core() {
            r1 = this;
            java.lang.Object r0 = r1._parentHandle
            kotlinx.coroutines.ChildHandle r0 = (kotlinx.coroutines.ChildHandle) r0
            return r0
    }

    public final java.lang.Object getState$kotlinx_coroutines_core() {
            r2 = this;
        L0:
            java.lang.Object r0 = r2._state
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.OpDescriptor
            if (r1 != 0) goto L7
            return r0
        L7:
            kotlinx.coroutines.internal.OpDescriptor r0 = (kotlinx.coroutines.internal.OpDescriptor) r0
            r0.perform(r2)
            goto L0
    }

    protected boolean handleJobException(java.lang.Throwable r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void handleOnCompletionException$kotlinx_coroutines_core(java.lang.Throwable r1) {
            r0 = this;
            throw r1
    }

    protected final void initParentJob(kotlinx.coroutines.Job r2) {
            r1 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L13
            kotlinx.coroutines.ChildHandle r0 = r1.getParentHandle$kotlinx_coroutines_core()
            if (r0 != 0) goto Ld
            goto L13
        Ld:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L13:
            if (r2 != 0) goto L1d
            kotlinx.coroutines.NonDisposableHandle r2 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            kotlinx.coroutines.ChildHandle r2 = (kotlinx.coroutines.ChildHandle) r2
            r1.setParentHandle$kotlinx_coroutines_core(r2)
            return
        L1d:
            r2.start()
            r0 = r1
            kotlinx.coroutines.ChildJob r0 = (kotlinx.coroutines.ChildJob) r0
            kotlinx.coroutines.ChildHandle r2 = r2.attachChild(r0)
            r1.setParentHandle$kotlinx_coroutines_core(r2)
            boolean r0 = r1.isCompleted()
            if (r0 == 0) goto L3a
            r2.dispose()
            kotlinx.coroutines.NonDisposableHandle r2 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            kotlinx.coroutines.ChildHandle r2 = (kotlinx.coroutines.ChildHandle) r2
            r1.setParentHandle$kotlinx_coroutines_core(r2)
        L3a:
            return
    }

    @Override // kotlinx.coroutines.Job
    public final kotlinx.coroutines.DisposableHandle invokeOnCompletion(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r3) {
            r2 = this;
            r0 = 0
            r1 = 1
            kotlinx.coroutines.DisposableHandle r3 = r2.invokeOnCompletion(r0, r1, r3)
            return r3
    }

    @Override // kotlinx.coroutines.Job
    public final kotlinx.coroutines.DisposableHandle invokeOnCompletion(boolean r7, boolean r8, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r9) {
            r6 = this;
            kotlinx.coroutines.JobNode r0 = r6.makeNode(r9, r7)
        L4:
            java.lang.Object r1 = r6.getState$kotlinx_coroutines_core()
            boolean r2 = r1 instanceof kotlinx.coroutines.Empty
            if (r2 == 0) goto L24
            r2 = r1
            kotlinx.coroutines.Empty r2 = (kotlinx.coroutines.Empty) r2
            boolean r3 = r2.isActive()
            if (r3 == 0) goto L20
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.JobSupport._state$FU
            boolean r1 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r2, r6, r1, r0)
            if (r1 == 0) goto L4
            kotlinx.coroutines.DisposableHandle r0 = (kotlinx.coroutines.DisposableHandle) r0
            return r0
        L20:
            r6.promoteEmptyToNodeList(r2)
            goto L4
        L24:
            boolean r2 = r1 instanceof kotlinx.coroutines.Incomplete
            r3 = 0
            if (r2 == 0) goto L8a
            r2 = r1
            kotlinx.coroutines.Incomplete r2 = (kotlinx.coroutines.Incomplete) r2
            kotlinx.coroutines.NodeList r2 = r2.getList()
            if (r2 != 0) goto L42
            if (r1 == 0) goto L3a
            kotlinx.coroutines.JobNode r1 = (kotlinx.coroutines.JobNode) r1
            r6.promoteSingleToNodeList(r1)
            goto L4
        L3a:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "null cannot be cast to non-null type kotlinx.coroutines.JobNode"
            r7.<init>(r8)
            throw r7
        L42:
            kotlinx.coroutines.NonDisposableHandle r4 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            if (r7 == 0) goto L77
            boolean r5 = r1 instanceof kotlinx.coroutines.JobSupport.Finishing
            if (r5 == 0) goto L77
            monitor-enter(r1)
            r3 = r1
            kotlinx.coroutines.JobSupport$Finishing r3 = (kotlinx.coroutines.JobSupport.Finishing) r3     // Catch: java.lang.Throwable -> L74
            java.lang.Throwable r3 = r3.getRootCause()     // Catch: java.lang.Throwable -> L74
            if (r3 == 0) goto L61
            boolean r5 = r9 instanceof kotlinx.coroutines.ChildHandleNode     // Catch: java.lang.Throwable -> L74
            if (r5 == 0) goto L70
            r5 = r1
            kotlinx.coroutines.JobSupport$Finishing r5 = (kotlinx.coroutines.JobSupport.Finishing) r5     // Catch: java.lang.Throwable -> L74
            boolean r5 = r5.isCompleting()     // Catch: java.lang.Throwable -> L74
            if (r5 != 0) goto L70
        L61:
            boolean r4 = r6.addLastAtomic(r1, r2, r0)     // Catch: java.lang.Throwable -> L74
            if (r4 != 0) goto L69
            monitor-exit(r1)
            goto L4
        L69:
            if (r3 != 0) goto L6f
            kotlinx.coroutines.DisposableHandle r0 = (kotlinx.coroutines.DisposableHandle) r0     // Catch: java.lang.Throwable -> L74
            monitor-exit(r1)
            return r0
        L6f:
            r4 = r0
        L70:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L74
            monitor-exit(r1)
            goto L77
        L74:
            r7 = move-exception
            monitor-exit(r1)
            throw r7
        L77:
            if (r3 == 0) goto L81
            if (r8 == 0) goto L7e
            r9.invoke(r3)
        L7e:
            kotlinx.coroutines.DisposableHandle r4 = (kotlinx.coroutines.DisposableHandle) r4
            return r4
        L81:
            boolean r1 = r6.addLastAtomic(r1, r2, r0)
            if (r1 == 0) goto L4
            kotlinx.coroutines.DisposableHandle r0 = (kotlinx.coroutines.DisposableHandle) r0
            return r0
        L8a:
            if (r8 == 0) goto L9b
            boolean r7 = r1 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r7 == 0) goto L93
            kotlinx.coroutines.CompletedExceptionally r1 = (kotlinx.coroutines.CompletedExceptionally) r1
            goto L94
        L93:
            r1 = r3
        L94:
            if (r1 == 0) goto L98
            java.lang.Throwable r3 = r1.cause
        L98:
            r9.invoke(r3)
        L9b:
            kotlinx.coroutines.NonDisposableHandle r7 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            kotlinx.coroutines.DisposableHandle r7 = (kotlinx.coroutines.DisposableHandle) r7
            return r7
    }

    @Override // kotlinx.coroutines.Job
    public boolean isActive() {
            r2 = this;
            java.lang.Object r0 = r2.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 == 0) goto L12
            kotlinx.coroutines.Incomplete r0 = (kotlinx.coroutines.Incomplete) r0
            boolean r0 = r0.isActive()
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCancelled() {
            r2 = this;
            java.lang.Object r0 = r2.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 != 0) goto L17
            boolean r1 = r0 instanceof kotlinx.coroutines.JobSupport.Finishing
            if (r1 == 0) goto L15
            kotlinx.coroutines.JobSupport$Finishing r0 = (kotlinx.coroutines.JobSupport.Finishing) r0
            boolean r0 = r0.isCancelling()
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            goto L18
        L17:
            r0 = 1
        L18:
            return r0
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCompleted() {
            r1 = this;
            java.lang.Object r0 = r1.getState$kotlinx_coroutines_core()
            boolean r0 = r0 instanceof kotlinx.coroutines.Incomplete
            r0 = r0 ^ 1
            return r0
    }

    public final boolean isCompletedExceptionally() {
            r1 = this;
            java.lang.Object r0 = r1.getState$kotlinx_coroutines_core()
            boolean r0 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            return r0
    }

    protected boolean isScopedCoroutine() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.Job
    public final java.lang.Object join(kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r1 = this;
            boolean r0 = r1.joinInternal()
            if (r0 != 0) goto L10
            kotlin.coroutines.CoroutineContext r2 = r2.getContext()
            kotlinx.coroutines.JobKt.ensureActive(r2)
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L10:
            java.lang.Object r2 = r1.joinSuspend(r2)
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r0) goto L1b
            return r2
        L1b:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
    }

    public final boolean makeCompleting$kotlinx_coroutines_core(java.lang.Object r4) {
            r3 = this;
        L0:
            java.lang.Object r0 = r3.getState$kotlinx_coroutines_core()
            java.lang.Object r0 = r3.tryMakeCompleting(r0, r4)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            if (r0 != r1) goto L10
            r4 = 0
            return r4
        L10:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN
            r2 = 1
            if (r0 != r1) goto L16
            return r2
        L16:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_RETRY$p()
            if (r0 == r1) goto L0
            r3.afterCompletion(r0)
            return r2
    }

    public final java.lang.Object makeCompletingOnce$kotlinx_coroutines_core(java.lang.Object r4) {
            r3 = this;
        L0:
            java.lang.Object r0 = r3.getState$kotlinx_coroutines_core()
            java.lang.Object r0 = r3.tryMakeCompleting(r0, r4)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            if (r0 == r1) goto L15
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_RETRY$p()
            if (r0 == r1) goto L0
            return r0
        L15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Job "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " is already complete or completing, but is being completed with "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.Throwable r4 = r3.getExceptionOrNull(r4)
            r0.<init>(r1, r4)
            throw r0
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> r1) {
            r0 = this;
            kotlin.coroutines.CoroutineContext r1 = kotlinx.coroutines.Job.DefaultImpls.minusKey(r0, r1)
            return r1
    }

    public java.lang.String nameString$kotlinx_coroutines_core() {
            r1 = this;
            java.lang.String r0 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r1)
            return r0
    }

    protected void onCancelling(java.lang.Throwable r1) {
            r0 = this;
            return
    }

    protected void onCompletionInternal(java.lang.Object r1) {
            r0 = this;
            return
    }

    protected void onStart() {
            r0 = this;
            return
    }

    @Override // kotlinx.coroutines.ChildJob
    public final void parentCancelled(kotlinx.coroutines.ParentJob r1) {
            r0 = this;
            r0.cancelImpl$kotlinx_coroutines_core(r1)
            return
    }

    @Override // kotlin.coroutines.CoroutineContext
    public kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.CoroutineContext r1) {
            r0 = this;
            kotlin.coroutines.CoroutineContext r1 = kotlinx.coroutines.Job.DefaultImpls.plus(r0, r1)
            return r1
    }

    @Override // kotlinx.coroutines.Job
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    public kotlinx.coroutines.Job plus(kotlinx.coroutines.Job r1) {
            r0 = this;
            kotlinx.coroutines.Job r1 = kotlinx.coroutines.Job.DefaultImpls.plus(r0, r1)
            return r1
    }

    @Override // kotlinx.coroutines.selects.SelectClause0
    public final <R> void registerSelectClause0(kotlinx.coroutines.selects.SelectInstance<? super R> r3, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r4) {
            r2 = this;
        L0:
            java.lang.Object r0 = r2.getState$kotlinx_coroutines_core()
            boolean r1 = r3.isSelected()
            if (r1 == 0) goto Lb
            return
        Lb:
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 != 0) goto L1d
            boolean r0 = r3.trySelect()
            if (r0 == 0) goto L1c
            kotlin.coroutines.Continuation r3 = r3.getCompletion()
            kotlinx.coroutines.intrinsics.UndispatchedKt.startCoroutineUnintercepted(r4, r3)
        L1c:
            return
        L1d:
            int r0 = r2.startInternal(r0)
            if (r0 != 0) goto L0
            kotlinx.coroutines.SelectJoinOnCompletion r0 = new kotlinx.coroutines.SelectJoinOnCompletion
            r0.<init>(r3, r4)
            kotlinx.coroutines.CompletionHandlerBase r0 = (kotlinx.coroutines.CompletionHandlerBase) r0
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            kotlinx.coroutines.DisposableHandle r4 = r2.invokeOnCompletion(r0)
            r3.disposeOnSelect(r4)
            return
    }

    public final <T, R> void registerSelectClause1Internal$kotlinx_coroutines_core(kotlinx.coroutines.selects.SelectInstance<? super R> r3, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r4) {
            r2 = this;
        L0:
            java.lang.Object r0 = r2.getState$kotlinx_coroutines_core()
            boolean r1 = r3.isSelected()
            if (r1 == 0) goto Lb
            return
        Lb:
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 != 0) goto L2d
            boolean r1 = r3.trySelect()
            if (r1 == 0) goto L2c
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 == 0) goto L21
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            java.lang.Throwable r4 = r0.cause
            r3.resumeSelectWithException(r4)
            goto L2c
        L21:
            java.lang.Object r0 = kotlinx.coroutines.JobSupportKt.unboxState(r0)
            kotlin.coroutines.Continuation r3 = r3.getCompletion()
            kotlinx.coroutines.intrinsics.UndispatchedKt.startCoroutineUnintercepted(r4, r0, r3)
        L2c:
            return
        L2d:
            int r0 = r2.startInternal(r0)
            if (r0 != 0) goto L0
            kotlinx.coroutines.SelectAwaitOnCompletion r0 = new kotlinx.coroutines.SelectAwaitOnCompletion
            r0.<init>(r3, r4)
            kotlinx.coroutines.CompletionHandlerBase r0 = (kotlinx.coroutines.CompletionHandlerBase) r0
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            kotlinx.coroutines.DisposableHandle r4 = r2.invokeOnCompletion(r0)
            r3.disposeOnSelect(r4)
            return
    }

    public final void removeNode$kotlinx_coroutines_core(kotlinx.coroutines.JobNode r4) {
            r3 = this;
        L0:
            java.lang.Object r0 = r3.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.JobNode
            if (r1 == 0) goto L18
            if (r0 == r4) goto Lb
            return
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.JobSupport._state$FU
            kotlinx.coroutines.Empty r2 = kotlinx.coroutines.JobSupportKt.access$getEMPTY_ACTIVE$p()
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r3, r0, r2)
            if (r0 == 0) goto L0
            return
        L18:
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 == 0) goto L27
            kotlinx.coroutines.Incomplete r0 = (kotlinx.coroutines.Incomplete) r0
            kotlinx.coroutines.NodeList r0 = r0.getList()
            if (r0 == 0) goto L27
            r4.mo2317remove()
        L27:
            return
    }

    public final <T, R> void selectAwaitCompletion$kotlinx_coroutines_core(kotlinx.coroutines.selects.SelectInstance<? super R> r7, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r8) {
            r6 = this;
            java.lang.Object r0 = r6.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 == 0) goto L10
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            java.lang.Throwable r8 = r0.cause
            r7.resumeSelectWithException(r8)
            goto L1f
        L10:
            java.lang.Object r1 = kotlinx.coroutines.JobSupportKt.unboxState(r0)
            kotlin.coroutines.Continuation r2 = r7.getCompletion()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r8
            kotlinx.coroutines.intrinsics.CancellableKt.startCoroutineCancellable$default(r0, r1, r2, r3, r4, r5)
        L1f:
            return
    }

    public final void setParentHandle$kotlinx_coroutines_core(kotlinx.coroutines.ChildHandle r1) {
            r0 = this;
            r0._parentHandle = r1
            return
    }

    @Override // kotlinx.coroutines.Job
    public final boolean start() {
            r2 = this;
        L0:
            java.lang.Object r0 = r2.getState$kotlinx_coroutines_core()
            int r0 = r2.startInternal(r0)
            if (r0 == 0) goto Lf
            r1 = 1
            if (r0 == r1) goto Le
            goto L0
        Le:
            return r1
        Lf:
            r0 = 0
            return r0
    }

    protected final java.util.concurrent.CancellationException toCancellationException(java.lang.Throwable r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = r3 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L8
            r0 = r3
            java.util.concurrent.CancellationException r0 = (java.util.concurrent.CancellationException) r0
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 != 0) goto L1b
            kotlinx.coroutines.JobCancellationException r0 = new kotlinx.coroutines.JobCancellationException
            if (r4 != 0) goto L13
            java.lang.String r4 = access$cancellationExceptionMessage(r2)
        L13:
            r1 = r2
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            r0.<init>(r4, r3, r1)
            java.util.concurrent.CancellationException r0 = (java.util.concurrent.CancellationException) r0
        L1b:
            return r0
    }

    public final java.lang.String toDebugString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.nameString$kotlinx_coroutines_core()
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 123(0x7b, float:1.72E-43)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.Object r1 = r2.getState$kotlinx_coroutines_core()
            java.lang.String r1 = r2.stateString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.toDebugString()
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 64
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
