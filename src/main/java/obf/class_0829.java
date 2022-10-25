package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class class_0829
implements Runnable {
    public static final class_0829 lllIIIllIIIIlllIlIIllIIll = new class_0829();
    private List lllIlIIlIIIlIlIIIllIlllIl = Collections.synchronizedList(new ArrayList());
    private volatile long IlIllllllIIlIIllllIIlIIIl;
    private volatile long lIlllIlllIIIIlIIlllIllIII;
    private volatile boolean IlIIIIIllllllIIlllIllllll;

    private class_0829() {
        Thread thread = new Thread((Runnable)this, "File IO Thread");
        thread.setPriority(1);
        thread.start();
    }

    @Override
    public void run() {
        while (true) {
            this.lllIlIIlIIIlIlIIIllIlllIl();
        }
    }

    private void lllIlIIlIIIlIlIIIllIlllIl() {
        for (int i = 0; i < this.lllIlIIlIIIlIlIIIllIlllIl.size(); ++i) {
            class_0489 class_04892 = (class_0489)this.lllIlIIlIIIlIlIIIllIlllIl.get(i);
            boolean bl = class_04892.lllIIIllIIIIlllIlIIllIIll();
            if (!bl) {
                this.lllIlIIlIIIlIlIIIllIlllIl.remove(i--);
                ++this.lIlllIlllIIIIlIIlllIllIII;
            }
            try {
                Thread.sleep(this.IlIIIIIllllllIIlllIllllll ? 0L : 10L);
                continue;
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
        if (this.lllIlIIlIIIlIlIIIllIlllIl.isEmpty()) {
            try {
                Thread.sleep(25L);
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0489 class_04892) {
        if (!this.lllIlIIlIIIlIlIIIllIlllIl.contains(class_04892)) {
            ++this.IlIllllllIIlIIllllIIlIIIl;
            this.lllIlIIlIIIlIlIIIllIlllIl.add(class_04892);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        this.IlIIIIIllllllIIlllIllllll = true;
        while (this.IlIllllllIIlIIllllIIlIIIl != this.lIlllIlllIIIIlIIlllIllIII) {
            Thread.sleep(10L);
        }
        this.IlIIIIIllllllIIlllIllllll = false;
    }
}

