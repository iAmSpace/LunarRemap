package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.network.play.client.C12PacketUpdateSign;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class class_1679
extends class_0229 {
    private class_2219 lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl;
    private class_1197 lIlllIlllIIIIlIIlllIllIII;

    public class_1679(class_2219 class_22192) {
        this.lllIIIllIIIIlllIlIIllIIll = class_22192;
    }

    @Override
    public void n_() {
        this.lIlIlIIlIIIIlIIIIIlllIIII.clear();
        Keyboard.enableRepeatEvents((boolean)true);
        this.lIlllIlllIIIIlIIlllIllIII = new class_1197(0, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, this.lIIlIIIIIlIlllIlIIlIlIlll / 4 + 120, class_0616.lllIIIllIIIIlllIlIIllIIll("gui.done", new Object[0]));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.lIlllIlllIIIIlIIlllIllIII);
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(false);
    }

    @Override
    public void o_() {
        Keyboard.enableRepeatEvents((boolean)false);
        class_1764 class_17642 = this.lllllIlllIIllIlIIlIIIllII.llIIlIllIllllIlIIIIlIIlll();
        if (class_17642 != null) {
            class_17642.lllIIIllIIIIlllIlIIllIIll(new C12PacketUpdateSign(this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl, this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl, this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII, this.lllIIIllIIIIlllIlIIllIIll.IllIIlllllllIIlIIlIIIIlIl));
        }
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(true);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        ++this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        if (class_11972.IllIIIllIIIIlIlIlIllIIlll && class_11972.IIIllIllIIlIlIlIlIllllIIl == 0) {
            this.lllIIIllIIIIlllIlIIllIIll.llIIlIllIllllIlIIIIlIIlll();
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll((class_0229)null);
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(char c, int n) {
        if (n == 200) {
            this.IlIllllllIIlIIllllIIlIIIl = this.IlIllllllIIlIIllllIIlIIIl - 1 & 3;
        }
        if (n == 208 || n == 28 || n == 156) {
            this.IlIllllllIIlIIllllIIlIIIl = this.IlIllllllIIlIIllllIIlIIIl + 1 & 3;
        }
        if (n == 14 && this.lllIIIllIIIIlllIlIIllIIll.IllIIlllllllIIlIIlIIIIlIl[this.IlIllllllIIlIIllllIIlIIIl].length() > 0) {
            this.lllIIIllIIIIlllIlIIllIIll.IllIIlllllllIIlIIlIIIIlIl[this.IlIllllllIIlIIllllIIlIIIl] = this.lllIIIllIIIIlllIlIIllIIll.IllIIlllllllIIlIIlIIIIlIl[this.IlIllllllIIlIIllllIIlIIIl].substring(0, this.lllIIIllIIIIlllIlIIllIIll.IllIIlllllllIIlIIlIIIIlIl[this.IlIllllllIIlIIllllIIlIIIl].length() - 1);
        }
        if (class_1395.lllIIIllIIIIlllIlIIllIIll(c) && this.lllIIIllIIIIlllIlIIllIIll.IllIIlllllllIIlIIlIIIIlIl[this.IlIllllllIIlIIllllIIlIIIl].length() < 15) {
            this.lllIIIllIIIIlllIlIIllIIll.IllIIlllllllIIlIIlIIIIlIl[this.IlIllllllIIlIIllllIIlIIIl] = this.lllIIIllIIIIlllIlIIllIIll.IllIIlllllllIIlIIlIIIIlIl[this.IlIllllllIIlIIllllIIlIIIl] + c;
        }
        if (n == 1) {
            this.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        this.llIIlIllIllllIlIIIIlIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, class_0616.lllIIIllIIIIlllIlIIllIIll("sign.edit", new Object[0]), this.IlIlIIlllIIlIllIIIlllllIl / 2, 40, 0xFFFFFF);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(this.IlIlIIlllIIlIllIIIlllllIl / 2), (float)0.0f, (float)50.0f);
        float f2 = 93.75f;
        GL11.glScalef((float)(-f2), (float)(-f2), (float)(-f2));
        GL11.glRotatef((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        Block class_05492 = this.lllIIIllIIIIlllIlIIllIIll.IIIllIIlIIIIIIlIlIIllIIlI();
        if (class_05492 == Blocks.IlIlIllIIlIIIIlllIlIllIlI) {
            float f3 = (float)(this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII() * 360) / 16.0f;
            GL11.glRotatef((float)f3, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glTranslatef((float)0.0f, (float)-1.0625f, (float)0.0f);
        } else {
            int n3 = this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII();
            float f4 = 0.0f;
            if (n3 == 2) {
                f4 = 180.0f;
            }
            if (n3 == 4) {
                f4 = 90.0f;
            }
            if (n3 == 5) {
                f4 = -90.0f;
            }
            GL11.glRotatef((float)f4, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glTranslatef((float)0.0f, (float)-1.0625f, (float)0.0f);
        }
        if (this.lllIlIIlIIIlIlIIIllIlllIl / 6 % 2 == 0) {
            this.lllIIIllIIIIlllIlIIllIIll.IIIllIllIIlIlIlIlIllllIIl = this.IlIllllllIIlIIllllIIlIIIl;
        }
        class_1683.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, -0.5, -0.75, -0.5, 0.0f);
        this.lllIIIllIIIIlllIlIIllIIll.IIIllIllIIlIlIlIlIllllIIl = -1;
        GL11.glPopMatrix();
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
    }
}

