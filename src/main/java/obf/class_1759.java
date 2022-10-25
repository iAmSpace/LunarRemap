package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

class class_1759
extends class_1197 {
    private final ResourceLocation lllIIIllIIIIlllIlIIllIIll;
    private final int lllIlIIlIIIlIlIIIllIlllIl;
    private final int lllllIlllIIllIlIIlIIIllII;
    private boolean IlIlIIlllIIlIllIIIlllllIl;

    protected class_1759(int n, int n2, int n3, ResourceLocation class_17732, int n4, int n5) {
        super(n, n2, n3, 22, 22, "");
        this.lllIIIllIIIIlllIlIIllIIll = class_17732;
        this.lllIlIIlIIIlIlIIIllIlllIl = n4;
        this.lllllIlllIIllIlIIlIIIllII = n5;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(Minecraft class_06672, int n, int n2) {
        if (this.lIIIIlIlIIlllllIIllIIlIII) {
            class_06672.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(class_1653.lIllllIIlIIIlIllllllIIIll());
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            this.IlIlIIlIlIllIIlIlIIllIIIl = n >= this.lIllllIIlIIIlIllllllIIIll && n2 >= this.IIIllIIlIIIIIIlIlIIllIIlI && n < this.lIllllIIlIIIlIllllllIIIll + this.lIlllIlllIIIIlIIlllIllIII && n2 < this.IIIllIIlIIIIIIlIlIIllIIlI + this.IlIIIIIllllllIIlllIllllll;
            int n3 = 219;
            int n4 = 0;
            if (!this.IllIIIllIIIIlIlIlIllIIlll) {
                n4 += this.lIlllIlllIIIIlIIlllIllIII * 2;
            } else if (this.IlIlIIlllIIlIllIIIlllllIl) {
                n4 += this.lIlllIlllIIIIlIIlllIllIII * 1;
            } else if (this.IlIlIIlIlIllIIlIlIIllIIIl) {
                n4 += this.lIlllIlllIIIIlIIlllIllIII * 3;
            }
            class_1759.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll, this.IIIllIIlIIIIIIlIlIIllIIlI, n4, n3, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll);
            if (!class_1653.lIllllIIlIIIlIllllllIIIll().equals(this.lllIIIllIIIIlllIlIIllIIll)) {
                class_06672.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll);
            }
            class_1759.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll + 2, this.IIIllIIlIIIIIIlIlIIllIIlI + 2, this.lllIlIIlIIIlIlIIIllIlllIl, this.lllllIlllIIllIlIIlIIIllII, 18, 18);
        }
    }

    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return this.IlIlIIlllIIlIllIIIlllllIl;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(boolean bl) {
        this.IlIlIIlllIIlIllIIIlllllIl = bl;
    }
}

