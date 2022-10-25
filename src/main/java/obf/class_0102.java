package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class class_0102
extends class_1197 {
    private boolean lllIIIllIIIIlllIlIIllIIll = true;

    public class_0102(int n, int n2, int n3, int n4, int n5, String string, boolean bl) {
        this(n, n2, n3, n4, n5, string);
        this.lllIIIllIIIIlllIlIIllIIll = bl;
    }

    public class_0102(int n, int n2, int n3, int n4, int n5, String string) {
        super(n, n2, n3, n4, n5, string);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(Minecraft class_06672, int n, int n2) {
        if (this.lIIIIlIlIIlllllIIllIIlIII) {
            class_1854 class_18542 = class_06672.IlIlllIIIIIIlIIllIIllIlll;
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            this.IlIlIIlIlIllIIlIlIIllIIIl = n >= this.lIllllIIlIIIlIllllllIIIll && n2 >= this.IIIllIIlIIIIIIlIlIIllIIlI && n < this.lIllllIIlIIIlIllllllIIIll + this.lIlllIlllIIIIlIIlllIllIII && n2 < this.IIIllIIlIIIIIIlIlIIllIIlI + this.IlIIIIIllllllIIlllIllllll;
            int n3 = this.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlIlIllIIlIlIIllIIIl);
            if (this.lllIIIllIIIIlllIlIIllIIll) {
                class_0210.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll, this.IIIllIIlIIIIIIlIlIIllIIlI, this.lIllllIIlIIIlIllllllIIIll + this.lIlllIlllIIIIlIIlllIllIII, this.IIIllIIlIIIIIIlIlIIllIIlI + this.IlIIIIIllllllIIlllIllllll, this.IlIlIIlIlIllIIlIlIIllIIIl ? -15395563 : -14540254);
            }
            this.lllIlIIlIIIlIlIIIllIlllIl(class_06672, n, n2);
            int n4 = -3092272;
            if (!this.IllIIIllIIIIlIlIlIllIIlll) {
                n4 = -986896;
            } else if (this.IlIlIIlIlIllIIlIlIIllIIIl) {
                n4 = -1;
            }
            LunarClient.getInstance().robotoLight16px.lllIlIIlIIIlIlIIIllIlllIl(this.IllIIlllllllIIlIIlIIIIlIl, this.lIllllIIlIIIlIllllllIIIll + this.lIlllIlllIIIIlIIlllIllIII / 2, this.IIIllIIlIIIIIIlIlIIllIIlI + this.IlIIIIIllllllIIlllIllllll / 2 - (this.lllIIIllIIIIlllIlIIllIIll ? 5 : 4), n4);
        }
    }
}

