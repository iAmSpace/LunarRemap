package obf;

import net.minecraft.client.Minecraft;
import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0321 {
    private int lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private double IlIllllllIIlIIllllIIlIIIl;
    private double lIlllIlllIIIIlIIlllIllIII;
    private int IlIIIIIllllllIIlllIllllll;

    public class_0321(Minecraft class_06672, int n, int n2) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = n2;
        this.IlIIIIIllllllIIlllIllllll = 1;
        boolean bl = class_06672.lIlllIlllIIIIlIIlllIllIII();
        int n3 = class_06672.gameSettings.IllIIIIIllIIlllIlIIIlIlll;
        if (n3 == 0) {
            n3 = 1000;
        }
        while (this.IlIIIIIllllllIIlllIllllll < n3 && this.lllIIIllIIIIlllIlIIllIIll / (this.IlIIIIIllllllIIlllIllllll + 1) >= 320 && this.lllIlIIlIIIlIlIIIllIlllIl / (this.IlIIIIIllllllIIlllIllllll + 1) >= 240) {
            ++this.IlIIIIIllllllIIlllIllllll;
        }
        if (bl && this.IlIIIIIllllllIIlllIllllll % 2 != 0 && this.IlIIIIIllllllIIlllIllllll != 1) {
            --this.IlIIIIIllllllIIlllIllllll;
        }
        this.IlIllllllIIlIIllllIIlIIIl = (double)this.lllIIIllIIIIlllIlIIllIIll / (double)this.IlIIIIIllllllIIlllIllllll;
        this.lIlllIlllIIIIlIIlllIllIII = (double)this.lllIlIIlIIIlIlIIIllIlllIl / (double)this.IlIIIIIllllllIIlllIllllll;
        this.lllIIIllIIIIlllIlIIllIIll = MathHelper.lIllllIIlIIIlIllllllIIIll(this.IlIllllllIIlIIllllIIlIIIl);
        this.lllIlIIlIIIlIlIIIllIlllIl = MathHelper.lIllllIIlIIIlIllllllIIIll(this.lIlllIlllIIIIlIIlllIllIII);
    }

    public int lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public double IlIllllllIIlIIllllIIlIIIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public double lIlllIlllIIIIlIIlllIllIII() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public int IlIIIIIllllllIIlllIllllll() {
        return this.IlIIIIIllllllIIlllIllllll;
    }
}

