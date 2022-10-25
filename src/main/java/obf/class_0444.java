package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class class_0444
extends class_1197 {
    private class_1835 lllllIlllIIllIlIIlIIIllII;
    public float lllIIIllIIIIlllIlIIllIIll = 1.0f;
    public boolean lllIlIIlIIIlIlIIIllIlllIl = false;
    private class_1002 IlIlIIlllIIlIllIIIlllllIl = null;

    public class_0444(int n, int n2, int n3, class_1002 class_10022, float f, class_1835 class_18352) {
        super(n, n2, n3, 150, 20, "");
        this.lllllIlllIIllIlIIlIIIllII = class_18352;
        this.IlIlIIlllIIlIllIIIlllllIl = class_10022;
        this.lllIIIllIIIIlllIlIIllIIll = f;
        this.IllIIlllllllIIlIIlIIIIlIl = this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(class_10022);
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        return 0;
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(Minecraft class_06672, int n, int n2) {
        if (this.lIIIIlIlIIlllllIIllIIlIII) {
            if (this.lllIlIIlIIIlIlIIIllIlllIl) {
                this.lllIIIllIIIIlllIlIIllIIll = (n - (this.lIllllIIlIIIlIllllllIIIll + 4)) / (this.lIlllIlllIIIIlIIlllIllIII - 8);
                if (this.lllIIIllIIIIlllIlIIllIIll < 0.0f) {
                    this.lllIIIllIIIIlllIlIIllIIll = 0.0f;
                }
                if (this.lllIIIllIIIIlllIlIIllIIll > 1.0f) {
                    this.lllIIIllIIIIlllIlIIllIIll = 1.0f;
                }
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlllIIlIllIIIlllllIl, this.lllIIIllIIIIlllIlIIllIIll);
                this.IllIIlllllllIIlIIlIIIIlIl = this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlllIIlIllIIIlllllIl);
            }
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            class_0444.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll + (int)(this.lllIIIllIIIIlllIlIIllIIll * (float)(this.lIlllIlllIIIIlIIlllIllIII - 8)), this.IIIllIIlIIIIIIlIlIIllIIlI, 0, 66, 4, 20);
            class_0444.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll + (int)(this.lllIIIllIIIIlllIlIIllIIll * (float)(this.lIlllIlllIIIIlIIlllIllIII - 8)) + 4, this.IIIllIIlIIIIIIlIlIIllIIlI, 196, 66, 4, 20);
        }
    }

    @Override
    public boolean IlIllllllIIlIIllllIIlIIIl(Minecraft class_06672, int n, int n2) {
        if (super.IlIllllllIIlIIllllIIlIIIl(class_06672, n, n2)) {
            this.lllIIIllIIIIlllIlIIllIIll = (n - (this.lIllllIIlIIIlIllllllIIIll + 4)) / (this.lIlllIlllIIIIlIIlllIllIII - 8);
            if (this.lllIIIllIIIIlllIlIIllIIll < 0.0f) {
                this.lllIIIllIIIIlllIlIIllIIll = 0.0f;
            }
            if (this.lllIIIllIIIIlllIlIIllIIll > 1.0f) {
                this.lllIIIllIIIIlllIlIIllIIll = 1.0f;
            }
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlllIIlIllIIIlllllIl, this.lllIIIllIIIIlllIlIIllIIll);
            this.IllIIlllllllIIlIIlIIIIlIl = this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlllIIlIllIIIlllllIl);
            this.lllIlIIlIIIlIlIIIllIlllIl = true;
            return true;
        }
        return false;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        this.lllIlIIlIIIlIlIIIllIlllIl = false;
    }
}

