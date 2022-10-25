package obf;

import net.minecraft.client.Minecraft;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1328
extends class_1585 {
    public double IlIlIIlIlIllIIlIlIIllIIIl;
    public double lllllIlllIIllIlIIlIIIllII;

    public class_1328(String string) {
        super(string);
    }

    @Override
    public void IllIIIllIIIIlIlIlIllIIlll() {
        Minecraft class_06672 = Minecraft.getMinecraft();
        if (class_06672.theWorld != null && class_06672.lIIIIlIlIIlllllIIllIIlIII != null) {
            this.lllIIIllIIIIlllIlIIllIIll(class_06672.theWorld, class_06672.lIIIIlIlIIlllllIIllIIlIII.IlIIlllllIIlIlIlllllIllll, class_06672.lIIIIlIlIIlllllIIllIIlIII.IllIIIIllIIllIllIlllIlIIl, class_06672.lIIIIlIlIIlllllIIllIIlIII.IIIIlIllIlIIlIIlIllIlIlll, false, false);
        } else {
            this.lllIIIllIIIIlllIlIIllIIll(null, 0.0, 0.0, 0.0, true, false);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, double d, double d2, double d3, boolean bl, boolean bl2) {
        if (!this.lllIIIllIIIIlllIlIIllIIll.isEmpty()) {
            double d4 = 0.0;
            if (class_13342 != null && !bl) {
                class_2208 class_22082 = class_13342.lIlIllIIlIIlIIlIIlIIlIIll();
                double d5 = (double)class_22082.lllIIIllIIIIlllIlIIllIIll - d;
                double d6 = (double)class_22082.IlIllllllIIlIIllllIIlIIIl - d2;
                d4 = -(((d3 %= 360.0) - 90.0) * Math.PI / 180.0 - Math.atan2(d6, d5));
                if (!class_13342.IlIlIIlllIIlIllIIIlllllIl.lIlllIlllIIIIlIIlllIllIII()) {
                    d4 = Math.random() * Math.PI * 2.0;
                }
            }
            if (bl2) {
                this.IlIlIIlIlIllIIlIlIIllIIIl = d4;
            } else {
                double d7;
                for (d7 = d4 - this.IlIlIIlIlIllIIlIlIIllIIIl; d7 < -Math.PI; d7 += Math.PI * 2) {
                }
                while (d7 >= Math.PI) {
                    d7 -= Math.PI * 2;
                }
                if (d7 < -1.0) {
                    d7 = -1.0;
                }
                if (d7 > 1.0) {
                    d7 = 1.0;
                }
                this.lllllIlllIIllIlIIlIIIllII += d7 * 0.1;
                this.lllllIlllIIllIlIIlIIIllII *= 0.8;
                this.IlIlIIlIlIllIIlIlIIllIIIl += this.lllllIlllIIllIlIIlIIIllII;
            }
            int n = (int)((this.IlIlIIlIlIllIIlIlIIllIIIl / (Math.PI * 2) + 1.0) * (double)this.lllIIIllIIIIlllIlIIllIIll.size()) % this.lllIIIllIIIIlllIlIIllIIll.size();
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

