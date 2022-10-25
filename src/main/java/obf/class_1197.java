package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.opengl.GL11;

public class class_1197
extends class_0210 {
    protected static final ResourceLocation IlIllllllIIlIIllllIIlIIIl = new ResourceLocation("textures/gui/widgets.png");
    protected int lIlllIlllIIIIlIIlllIllIII = 200;
    protected int IlIIIIIllllllIIlllIllllll = 20;
    public int lIllllIIlIIIlIllllllIIIll;
    public int IIIllIIlIIIIIIlIlIIllIIlI;
    public String IllIIlllllllIIlIIlIIIIlIl;
    public int IIIllIllIIlIlIlIlIllllIIl;
    public boolean IllIIIllIIIIlIlIlIllIIlll = true;
    public boolean lIIIIlIlIIlllllIIllIIlIII = true;
    protected boolean IlIlIIlIlIllIIlIlIIllIIIl;

    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public class_1197(int n, int n2, int n3, String string) {
        this(n, n2, n3, 200, 20, string);
    }

    public class_1197(int n, int n2, int n3, int n4, int n5, String string) {
        this.IIIllIllIIlIlIlIlIllllIIl = n;
        this.lIllllIIlIIIlIllllllIIIll = n2;
        this.IIIllIIlIIIIIIlIlIIllIIlI = n3;
        this.lIlllIlllIIIIlIIlllIllIII = n4;
        this.IlIIIIIllllllIIlllIllllll = n5;
        this.IllIIlllllllIIlIIlIIIIlIl = string;
    }

    public int lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        int n = 1;
        if (!this.IllIIIllIIIIlIlIlIllIIlll) {
            n = 0;
        } else if (bl) {
            n = 2;
        }
        return n;
    }

    public void lllIIIllIIIIlllIlIIllIIll(Minecraft class_06672, int n, int n2) {
        if (this.lIIIIlIlIIlllllIIllIIlIII) {
            class_1854 class_18542 = class_06672.IlIlllIIIIIIlIIllIIllIlll;
            class_06672.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(IlIllllllIIlIIllllIIlIIIl);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            this.IlIlIIlIlIllIIlIlIIllIIIl = n >= this.lIllllIIlIIIlIllllllIIIll && n2 >= this.IIIllIIlIIIIIIlIlIIllIIlI && n < this.lIllllIIlIIIlIllllllIIIll + this.lIlllIlllIIIIlIIlllIllIII && n2 < this.IIIllIIlIIIIIIlIlIIllIIlI + this.IlIIIIIllllllIIlllIllllll;
            int n3 = this.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlIlIllIIlIlIIllIIIl);
            GL11.glEnable((int)3042);
            OpenGlHelper.glBlendFunc(770, 771, 1, 0);
            GL11.glBlendFunc((int)770, (int)771);
            class_1197.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll, this.IIIllIIlIIIIIIlIlIIllIIlI, 0, 46 + n3 * 20, this.lIlllIlllIIIIlIIlllIllIII / 2, this.IlIIIIIllllllIIlllIllllll);
            class_1197.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll + this.lIlllIlllIIIIlIIlllIllIII / 2, this.IIIllIIlIIIIIIlIlIIllIIlI, 200 - this.lIlllIlllIIIIlIIlllIllIII / 2, 46 + n3 * 20, this.lIlllIlllIIIIlIIlllIllIII / 2, this.IlIIIIIllllllIIlllIllllll);
            this.lllIlIIlIIIlIlIIIllIlllIl(class_06672, n, n2);
            int n4 = 0xE0E0E0;
            if (!this.IllIIIllIIIIlIlIlIllIIlll) {
                n4 = 0xA0A0A0;
            } else if (this.IlIlIIlIlIllIIlIlIIllIIIl) {
                n4 = 0xFFFFA0;
            }
            this.lllIIIllIIIIlllIlIIllIIll(class_18542, this.IllIIlllllllIIlIIlIIIIlIl, this.lIllllIIlIIIlIllllllIIIll + this.lIlllIlllIIIIlIIlllIllIII / 2, this.IIIllIIlIIIIIIlIlIIllIIlI + (this.IlIIIIIllllllIIlllIllllll - 8) / 2, n4);
        }
    }

    protected void lllIlIIlIIIlIlIIIllIlllIl(Minecraft class_06672, int n, int n2) {
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
    }

    public boolean IlIllllllIIlIIllllIIlIIIl(Minecraft class_06672, int n, int n2) {
        return this.IllIIIllIIIIlIlIlIllIIlll && this.lIIIIlIlIIlllllIIllIIlIII && n >= this.lIllllIIlIIIlIllllllIIIll && n2 >= this.IIIllIIlIIIIIIlIlIIllIIlI && n < this.lIllllIIlIIIlIllllllIIIll + this.lIlllIlllIIIIlIIlllIllIII && n2 < this.IIIllIIlIIIIIIlIlIIllIIlI + this.IlIIIIIllllllIIlllIllllll;
    }

    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return this.IlIlIIlIlIllIIlIlIIllIIIl;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1300 class_13002) {
        class_13002.lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
    }

    public int IlIIIIIllllllIIlllIllllll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public int lIllllIIlIIIlIllllllIIIll() {
        return this.IlIIIIIllllllIIlllIllllll;
    }
}

