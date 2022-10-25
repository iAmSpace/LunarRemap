package obf;

import net.minecraft.client.Minecraft;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0124 {
    private static int lIlllIlllIIIIlIIlllIllIII = "u2CXyEg4Fy32".length() - 2;
    private double IlIIIIIllllllIIlllIllllll;
    public int lllIIIllIIIIlllIlIIllIIll;
    public float lllIlIIlIIIlIlIIIllIlllIl;
    public float IlIllllllIIlIIllllIIlIIIl;
    private long lIllllIIlIIIlIllllllIIIll = Minecraft.getSystemTime();
    private long IIIllIIlIIIIIIlIlIIllIIlI = System.nanoTime() / 1000000L;
    private long IllIIlllllllIIlIIlIIIIlIl;
    private double IIIllIllIIlIlIlIlIllllIIl = 1.0;

    public void lllIIIllIIIIlllIlIIllIIll() {
        long l = Minecraft.getSystemTime();
        long l2 = l - this.lIllllIIlIIIlIllllllIIIll;
        long l3 = System.nanoTime() / 1000000L;
        double d = (double)l3 / 1000.0;
        if (l2 <= 1000L && l2 >= 0L) {
            this.IllIIlllllllIIlIIlIIIIlIl += l2;
            if (this.IllIIlllllllIIlIIlIIIIlIl > 1000L) {
                long l4 = l3 - this.IIIllIIlIIIIIIlIlIIllIIlI;
                double d2 = (double)this.IllIIlllllllIIlIIlIIIIlIl / (double)l4;
                this.IIIllIllIIlIlIlIlIllllIIl += (d2 - this.IIIllIllIIlIlIlIlIllllIIl) * (double)0.2f;
                this.IIIllIIlIIIIIIlIlIIllIIlI = l3;
                this.IllIIlllllllIIlIIlIIIIlIl = 0L;
            }
            if (this.IllIIlllllllIIlIIlIIIIlIl < 0L) {
                this.IIIllIIlIIIIIIlIlIIllIIlI = l3;
            }
        } else {
            this.IlIIIIIllllllIIlllIllllll = d;
        }
        this.lIllllIIlIIIlIllllllIIIll = l;
        double d3 = (d - this.IlIIIIIllllllIIlllIllllll) * this.IIIllIllIIlIlIlIlIllllIIl;
        this.IlIIIIIllllllIIlllIllllll = d;
        if (d3 < 0.0) {
            d3 = 0.0;
        }
        if (d3 > 1.0) {
            d3 = 1.0;
        }
        this.IlIllllllIIlIIllllIIlIIIl = (float)((double)this.IlIllllllIIlIIllllIIlIIIl + d3 * (double)(lIlllIlllIIIIlIIlllIllIII * 2));
        this.lllIIIllIIIIlllIlIIllIIll = (int)this.IlIllllllIIlIIllllIIlIIIl;
        this.IlIllllllIIlIIllllIIlIIIl -= (float)this.lllIIIllIIIIlllIlIIllIIll;
        if (this.lllIIIllIIIIlllIlIIllIIll > 10) {
            this.lllIIIllIIIIlllIlIIllIIll = 10;
        }
        this.lllIlIIlIIIlIlIIIllIlllIl = this.IlIllllllIIlIIllllIIlIIIl;
    }
}

