package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class class_2193
extends class_1197 {
    public class_2193(int n, int n2, int n3) {
        super(n, n2, n3, 20, 20, "");
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(Minecraft class_06672, int n, int n2) {
        if (this.lIIIIlIlIIlllllIIllIIlIII) {
            class_06672.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(class_1197.IlIllllllIIlIIllllIIlIIIl);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            boolean bl = n >= this.lIllllIIlIIIlIllllllIIIll && n2 >= this.IIIllIIlIIIIIIlIlIIllIIlI && n < this.lIllllIIlIIIlIllllllIIIll + this.lIlllIlllIIIIlIIlllIllIII && n2 < this.IIIllIIlIIIIIIlIlIIllIIlI + this.IlIIIIIllllllIIlllIllllll;
            int n3 = 106;
            if (bl) {
                n3 += this.IlIIIIIllllllIIlllIllllll;
            }
            class_2193.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll, this.IIIllIIlIIIIIIlIlIIllIIlI, 0, n3, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll);
        }
    }
}

