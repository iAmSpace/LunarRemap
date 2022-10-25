package obf;

import net.minecraft.client.Minecraft;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0834
extends Thread {
    final /* synthetic */ Minecraft lllIIIllIIIIlllIlIIllIIll;

    public class_0834(Minecraft class_06672, String string) {
        super(string);
        this.lllIIIllIIIIlllIlIIllIIll = class_06672;
    }

    @Override
    public void run() {
        while (this.lllIIIllIIIIlllIlIIllIIll.IlIlIIlllIllllllllIIIlIlI) {
            try {
                Thread.sleep(Integer.MAX_VALUE);
            }
            catch (InterruptedException interruptedException) {}
        }
    }
}

