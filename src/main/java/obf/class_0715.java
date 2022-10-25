package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

class class_0715
extends class_1197 {
    private final boolean lllIIIllIIIIlllIlIIllIIll;

    public class_0715(int n, int n2, int n3, boolean bl) {
        super(n, n2, n3, 12, 19, "");
        this.lllIIIllIIIIlllIlIIllIIll = bl;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(Minecraft class_06672, int n, int n2) {
        if (this.lIIIIlIlIIlllllIIllIIlIII) {
            class_06672.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(class_1669.IIIllIIlIIIIIIlIlIIllIIlI());
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            boolean bl = n >= this.lIllllIIlIIIlIllllllIIIll && n2 >= this.IIIllIIlIIIIIIlIlIIllIIlI && n < this.lIllllIIlIIIlIllllllIIIll + this.lIlllIlllIIIIlIIlllIllIII && n2 < this.IIIllIIlIIIIIIlIlIIllIIlI + this.IlIIIIIllllllIIlllIllllll;
            int n3 = 0;
            int n4 = 176;
            if (!this.IllIIIllIIIIlIlIlIllIIlll) {
                n4 += this.lIlllIlllIIIIlIIlllIllIII * 2;
            } else if (bl) {
                n4 += this.lIlllIlllIIIIlIIlllIllIII;
            }
            if (!this.lllIIIllIIIIlllIlIIllIIll) {
                n3 += this.IlIIIIIllllllIIlllIllllll;
            }
            class_0715.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll, this.IIIllIIlIIIIIIlIlIIllIIlI, n4, n3, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll);
        }
    }
}

