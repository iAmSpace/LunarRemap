package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.LinkedList;
import java.util.Queue;

public class class_1952
extends Thread {
    private final Queue lllIIIllIIIIlllIlIIllIIll = new LinkedList();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        try {
            while (true) {
                Queue queue = this.lllIIIllIIIIlllIlIIllIIll;
                synchronized (queue) {
                    this.lllIIIllIIIIlllIlIIllIIll.wait();
                    class_1878 class_18782 = (class_1878)this.lllIIIllIIIIlllIlIIllIIll.poll();
                    if (class_18782 != null) {
                        class_18782.lllIlIIlIIIlIlIIIllIlllIl();
                    }
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void lllIIIllIIIIlllIlIIllIIll(class_1878 class_18782) {
        Queue queue = this.lllIIIllIIIIlllIlIIllIIll;
        synchronized (queue) {
            this.lllIIIllIIIIlllIlIIllIIll.offer(class_18782);
            this.lllIIIllIIIIlllIlIIllIIll.notify();
        }
    }
}

