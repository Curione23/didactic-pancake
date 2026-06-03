package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
public class TimestampedObserver extends org.apache.commons.io.input.ObservableInputStream.Observer {
    private volatile java.time.Instant closeInstant;
    private final java.time.Instant openInstant;

    public TimestampedObserver() {
            r1 = this;
            r1.<init>()
            java.time.Instant r0 = java.time.Instant.now()
            r1.openInstant = r0
            return
    }

    @Override // org.apache.commons.io.input.ObservableInputStream.Observer
    public void closed() throws java.io.IOException {
            r1 = this;
            java.time.Instant r0 = java.time.Instant.now()
            r1.closeInstant = r0
            return
    }

    public java.time.Instant getCloseInstant() {
            r1 = this;
            java.time.Instant r0 = r1.closeInstant
            return r0
    }

    public java.time.Instant getOpenInstant() {
            r1 = this;
            java.time.Instant r0 = r1.openInstant
            return r0
    }

    public java.time.Duration getOpenToCloseDuration() {
            r2 = this;
            java.time.Instant r0 = r2.openInstant
            java.time.Instant r1 = r2.closeInstant
            java.time.Duration r0 = java.time.Duration.between(r0, r1)
            return r0
    }

    public java.time.Duration getOpenToNowDuration() {
            r2 = this;
            java.time.Instant r0 = r2.openInstant
            java.time.Instant r1 = java.time.Instant.now()
            java.time.Duration r0 = java.time.Duration.between(r0, r1)
            return r0
    }

    public boolean isClosed() {
            r1 = this;
            java.time.Instant r0 = r1.closeInstant
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TimestampedObserver [openInstant="
            r0.<init>(r1)
            java.time.Instant r1 = r2.openInstant
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", closeInstant="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.time.Instant r1 = r2.closeInstant
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
