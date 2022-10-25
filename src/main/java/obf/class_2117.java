package obf;

import net.minecraft.client.Minecraft;

/*
 * Decompiled with CFR 0.150.
 */
public abstract class class_2117 {
    public float lllIlIIlIIIlIlIIIllIlllIl;
    public int IlIllllllIIlIIllllIIlIIIl = 0;
    protected int lIlllIlllIIIIlIIlllIllIII;
    protected int IlIIIIIllllllIIlllIllllll;
    protected int lIllllIIlIIIlIllllllIIIll;
    protected int IIIllIIlIIIIIIlIlIIllIIlI;

    public class_2117(float f) {
        this.lllIlIIlIIIlIlIIIllIlllIl = f;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4) {
        this.lIlllIlllIIIIlIIlllIllIII = n;
        this.IlIIIIIllllllIIlllIllllll = n2;
        this.lIllllIIlIIIlIllllllIIIll = n3;
        this.IIIllIIlIIIIIIlIlIIllIIlI = n4;
    }

    public abstract void lllIIIllIIIIlllIlIIllIIll(int var1, int var2, float var3);

    public abstract void lllIIIllIIIIlllIlIIllIIll(int var1, int var2, int var3);

    public boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return (float)n > (float)this.lIlllIlllIIIIlIIlllIllIII * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n < (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 > (float)(this.IlIIIIIllllllIIlllIllllll + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 < (float)(this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl && Minecraft.getMinecraft().lllllIlllIIllIlIIlIIIllII instanceof class_0822;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
    }

    public int lllIIIllIIIIlllIlIIllIIll() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }
}

