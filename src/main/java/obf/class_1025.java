package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

class class_1025
extends class_1197 {
    private final boolean lllIIIllIIIIlllIlIIllIIll;

    public class_1025(int n, int n2, int n3, boolean bl) {
        super(n, n2, n3, 23, 13, "");
        this.lllIIIllIIIIlllIlIIllIIll = bl;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(Minecraft class_06672, int n, int n2) {
        if (this.lIIIIlIlIIlllllIIllIIlIII) {
            boolean bl = n >= this.lIllllIIlIIIlIllllllIIIll && n2 >= this.IIIllIIlIIIIIIlIlIIllIIlI && n < this.lIllllIIlIIIlIllllllIIIll + this.lIlllIlllIIIIlIIlllIllIII && n2 < this.IIIllIIlIIIIIIlIlIIllIIlI + this.IlIIIIIllllllIIlllIllllll;
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            class_06672.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(class_1752.lIllllIIlIIIlIllllllIIIll());
            int n3 = 0;
            int n4 = 192;
            if (bl) {
                n3 += 23;
            }
            if (!this.lllIIIllIIIIlllIlIIllIIll) {
                n4 += 13;
            }
            class_1025.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll, this.IIIllIIlIIIIIIlIlIIllIIlI, n3, n4, 23, 13);
        }
    }
}

