package obf;

import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;

/*
 * Decompiled with CFR 0.150.
 */
public abstract class class_0759 {
    protected float lllIIIllIIIIlllIlIIllIIll;
    protected float lllIlIIlIIIlIlIIIllIlllIl;
    protected float IlIllllllIIlIIllllIIlIIIl;
    protected float lIlllIlllIIIIlIIlllIllIII;
    protected final Minecraft IlIIIIIllllllIIlllIllllll = Minecraft.getMinecraft();
    protected final LunarClient lIllllIIlIIIlIllllllIIIll = LunarClient.getInstance();

    public boolean lllIIIllIIIIlllIlIIllIIll(float f, float f2) {
        return f > this.lllIIIllIIIIlllIlIIllIIll && f < this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl && f2 > this.lllIlIIlIIIlIlIIIllIlllIl && f2 < this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(float f, float f2, boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll(f, f2, bl);
        return this.lllIIIllIIIIlllIlIIllIIll(f, f2);
    }

    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4) {
        this.lllIIIllIIIIlllIlIIllIIll = f;
        this.lllIlIIlIIIlIlIIIllIlllIl = f2;
        this.IlIllllllIIlIIllllIIlIIIl = f3;
        this.lIlllIlllIIIIlIIlllIllIII = f4;
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
    }

    public void lllIlIIlIIIlIlIIIllIlllIl() {
    }

    public void lllIIIllIIIIlllIlIIllIIll(char c, int n) {
    }

    public void IlIllllllIIlIIllllIIlIIIl() {
    }

    protected abstract void lllIIIllIIIIlllIlIIllIIll(float var1, float var2, boolean var3);

    public boolean lllIIIllIIIIlllIlIIllIIll(float f, float f2, int n, boolean bl) {
        return false;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(float f, float f2, int n, boolean bl) {
        return false;
    }

    protected boolean lllIIIllIIIIlllIlIIllIIll(float f, float f2, int n) {
        return false;
    }

    public void lllIIIllIIIIlllIlIIllIIll(float f) {
        this.lllIIIllIIIIlllIlIIllIIll = f;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(float f) {
        this.lllIlIIlIIIlIlIIIllIlllIl = f;
    }

    public void IlIllllllIIlIIllllIIlIIIl(float f) {
        this.IlIllllllIIlIIllllIIlIIIl = f;
    }

    public void lIlllIlllIIIIlIIlllIllIII(float f) {
        this.lIlllIlllIIIIlIIlllIllIII = f;
    }

    public float lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public float IlIIIIIllllllIIlllIllllll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public float lIllllIIlIIIlIllllllIIIll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public float IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }
}

