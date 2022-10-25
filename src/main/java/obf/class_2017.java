package obf;

import net.minecraft.client.Minecraft;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2017
extends class_1585 {
    private double IlIlIIlIlIllIIlIlIIllIIIl;
    private double lllllIlllIIllIlIIlIIIllII;

    public class_2017(String string) {
        super(string);
    }

    @Override
    public void IllIIIllIIIIlIlIlIllIIlll() {
        if (!this.lllIIIllIIIIlllIlIIllIIll.isEmpty()) {
            double d;
            Minecraft class_06672 = Minecraft.getMinecraft();
            double d2 = 0.0;
            if (class_06672.theWorld != null && class_06672.lIIIIlIlIIlllllIIllIIlIII != null) {
                float f = class_06672.theWorld.IlIllllllIIlIIllllIIlIIIl(1.0f);
                d2 = f;
                if (!class_06672.theWorld.IlIlIIlllIIlIllIIIlllllIl.lIlllIlllIIIIlIIlllIllIII()) {
                    d2 = Math.random();
                }
            }
            for (d = d2 - this.IlIlIIlIlIllIIlIlIIllIIIl; d < -0.5; d += 1.0) {
            }
            while (d >= 0.5) {
                d -= 1.0;
            }
            if (d < -1.0) {
                d = -1.0;
            }
            if (d > 1.0) {
                d = 1.0;
            }
            this.lllllIlllIIllIlIIlIIIllII += d * 0.1;
            this.lllllIlllIIllIlIIlIIIllII *= 0.8;
            this.IlIlIIlIlIllIIlIlIIllIIIl += this.lllllIlllIIllIlIIlIIIllII;
            int n = (int)((this.IlIlIIlIlIllIIlIlIIllIIIl + 1.0) * (double)this.lllIIIllIIIIlllIlIIllIIll.size()) % this.lllIIIllIIIIlllIlIIllIIll.size();
            while (n < 0) {
                n = (n + this.lllIIIllIIIIlllIlIIllIIll.size()) % this.lllIIIllIIIIlllIlIIllIIll.size();
            }
            if (n != this.IIIllIIlIIIIIIlIlIIllIIlI) {
                this.IIIllIIlIIIIIIlIlIIllIIlI = n;
                class_0231.lllIIIllIIIIlllIlIIllIIll((int[][])this.lllIIIllIIIIlllIlIIllIIll.get(this.IIIllIIlIIIIIIlIlIIllIIlI), this.IlIIIIIllllllIIlllIllllll, this.lIllllIIlIIIlIllllllIIIll, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, false, false);
            }
        }
    }
}

