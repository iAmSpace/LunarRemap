package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.glu.Project
 */
import java.util.Random;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.Project;

public class class_0363
extends class_1522 {
    private static final ResourceLocation IIlIIlIlIlIllIIlIlIIIIlll = new ResourceLocation("textures/gui/container/enchanting_table.png");
    private static final ResourceLocation llIIIlllIlllIlIllIIIIllIl = new ResourceLocation("textures/entity/enchanting_table_book.png");
    private static final class_2157 IIIIlIllIlIIlIIlIllIlIlll = new class_2157();
    private Random IlIlIIlllIllllllllIIIlIlI = new Random();
    private class_1495 llllIIIIlIIIlIIIIIIlIllll = (class_1495)this.lIlllIlllIlIIIIlllIlIlIIl;
    public int lllIIIllIIIIlllIlIIllIIll;
    public float lllIlIIlIIIlIlIIIllIlllIl;
    public float IlIllllllIIlIIllllIIlIIIl;
    public float lIlllIlllIIIIlIIlllIllIII;
    public float IlIIIIIllllllIIlllIllllll;
    public float lIllllIIlIIIlIllllllIIIll;
    public float IIIllIIlIIIIIIlIlIIllIIlI;
    ItemStack IllIIlllllllIIlIIlIIIIlIl;
    private String llIIIIllIIIIIIIlIIIlIIIIl;

    public class_0363(class_0503 class_05032, class_1334 class_13342, int n, int n2, int n3, String string) {
        super(new class_1495(class_05032, class_13342, n, n2, n3));
        this.llIIIIllIIIIIIIlIIIlIIIIl = string;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(this.llIIIIllIIIIIIIlIIIlIIIIl == null ? class_0616.lllIIIllIIIIlllIlIIllIIll("container.enchant", new Object[0]) : this.llIIIIllIIIIIIIlIIIlIIIIl, 12, 5, 0x404040);
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(class_0616.lllIIIllIIIIlllIlIIllIIll("container.inventory", new Object[0]), 8, this.lIIIIlIlIIlllllIIllIIlIII - 96 + 2, 0x404040);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        super.IlIllllllIIlIIllllIIlIIIl();
        this.lIllllIIlIIIlIllllllIIIll();
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
        int n4 = (this.IlIlIIlllIIlIllIIIlllllIl - this.IllIIIllIIIIlIlIlIllIIlll) / 2;
        int n5 = (this.lIIlIIIIIlIlllIlIIlIlIlll - this.lIIIIlIlIIlllllIIllIIlIII) / 2;
        for (int i = 0; i < 3; ++i) {
            int n6 = n - (n4 + 60);
            int n7 = n2 - (n5 + 14 + 19 * i);
            if (n6 < 0 || n7 < 0 || n6 >= 108 || n7 >= 19 || !this.llllIIIIlIIIlIIIIIIlIllll.lllIlIIlIIIlIlIIIllIlllIl(this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII, i)) continue;
            this.lllllIlllIIllIlIIlIIIllII.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(this.llllIIIIlIIIlIIIIIIlIllll.lIlllIlllIIIIlIIlllIllIII, i);
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(float f, int n, int n2) {
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(IIlIIlIlIlIllIIlIlIIIIlll);
        int n3 = (this.IlIlIIlllIIlIllIIIlllllIl - this.IllIIIllIIIIlIlIlIllIIlll) / 2;
        int n4 = (this.lIIlIIIIIlIlllIlIIlIlIlll - this.lIIIIlIlIIlllllIIllIIlIII) / 2;
        class_0363.lllIIIllIIIIlllIlIIllIIll(n3, n4, 0, 0, this.IllIIIllIIIIlIlIlIllIIlll, this.lIIIIlIlIIlllllIIllIIlIII);
        GL11.glPushMatrix();
        GL11.glMatrixMode((int)5889);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        class_0321 class_03212 = new class_0321(this.lllllIlllIIllIlIIlIIIllII, this.lllllIlllIIllIlIIlIIIllII.displayWidth, this.lllllIlllIIllIlIIlIIIllII.displayHeight);
        GL11.glViewport((int)((class_03212.lllIIIllIIIIlllIlIIllIIll() - 320) / 2 * class_03212.IlIIIIIllllllIIlllIllllll()), (int)((class_03212.lllIlIIlIIIlIlIIIllIlllIl() - 240) / 2 * class_03212.IlIIIIIllllllIIlllIllllll()), (int)(320 * class_03212.IlIIIIIllllllIIlllIllllll()), (int)(240 * class_03212.IlIIIIIllllllIIlllIllllll()));
        GL11.glTranslatef((float)-0.34f, (float)0.23f, (float)0.0f);
        Project.gluPerspective((float)90.0f, (float)1.3333334f, (float)9.0f, (float)80.0f);
        float f2 = 1.0f;
        GL11.glMatrixMode((int)5888);
        GL11.glLoadIdentity();
        class_0624.lllIlIIlIIIlIlIIIllIlllIl();
        GL11.glTranslatef((float)0.0f, (float)3.3f, (float)-16.0f);
        GL11.glScalef((float)f2, (float)f2, (float)f2);
        float f3 = 5.0f;
        GL11.glScalef((float)f3, (float)f3, (float)f3);
        GL11.glRotatef((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(llIIIlllIlllIlIllIIIIllIl);
        GL11.glRotatef((float)20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        float f4 = this.IIIllIIlIIIIIIlIlIIllIIlI + (this.lIllllIIlIIIlIllllllIIIll - this.IIIllIIlIIIIIIlIlIIllIIlI) * f;
        GL11.glTranslatef((float)((1.0f - f4) * 0.2f), (float)((1.0f - f4) * 0.1f), (float)((1.0f - f4) * 0.25f));
        GL11.glRotatef((float)(-(1.0f - f4) * 90.0f - 90.0f), (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)180.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        float f5 = this.IlIllllllIIlIIllllIIlIIIl + (this.lllIlIIlIIIlIlIIIllIlllIl - this.IlIllllllIIlIIllllIIlIIIl) * f + 0.25f;
        float f6 = this.IlIllllllIIlIIllllIIlIIIl + (this.lllIlIIlIIIlIlIIIllIlllIl - this.IlIllllllIIlIIllllIIlIIIl) * f + 0.75f;
        f5 = (f5 - (float) MathHelper.lllIlIIlIIIlIlIIIllIlllIl((double)f5)) * 1.6f - 0.3f;
        f6 = (f6 - (float) MathHelper.lllIlIIlIIIlIlIIIllIlllIl((double)f6)) * 1.6f - 0.3f;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        GL11.glEnable((int)32826);
        IIIIlIllIlIIlIIlIllIlIlll.lllIIIllIIIIlllIlIIllIIll(null, 0.0f, f5, f6, f4, 0.0f, 0.0625f);
        GL11.glDisable((int)32826);
        class_0624.lllIIIllIIIIlllIlIIllIIll();
        GL11.glMatrixMode((int)5889);
        GL11.glViewport((int)0, (int)0, (int)this.lllllIlllIIllIlIIlIIIllII.displayWidth, (int)this.lllllIlllIIllIlIIlIIIllII.displayHeight);
        GL11.glPopMatrix();
        GL11.glMatrixMode((int)5888);
        GL11.glPopMatrix();
        class_0624.lllIIIllIIIIlllIlIIllIIll();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        class_0156.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this.llllIIIIlIIIlIIIIIIlIllll.lIllllIIlIIIlIllllllIIIll);
        for (int i = 0; i < 3; ++i) {
            String string = class_0156.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll();
            IlIlllIIIIIIlIIllIIllIlll = 0.0f;
            this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(IIlIIlIlIlIllIIlIlIIIIlll);
            int n5 = this.llllIIIIlIIIlIIIIIIlIllll.IIIllIIlIIIIIIlIlIIllIIlI[i];
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            if (n5 == 0) {
                class_0363.lllIIIllIIIIlllIlIIllIIll(n3 + 60, n4 + 14 + 19 * i, 0, 185, 108, 19);
                continue;
            }
            String string2 = "" + n5;
            class_1854 class_18542 = this.lllllIlllIIllIlIIlIIIllII.IlIlIIlIlIllIIlIlIIllIIIl;
            int n6 = 6839882;
            if (this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.lllIlllllIllIlIIlIlIIIlll < n5 && !this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII) {
                class_0363.lllIIIllIIIIlllIlIIllIIll(n3 + 60, n4 + 14 + 19 * i, 0, 185, 108, 19);
                class_18542.lllIIIllIIIIlllIlIIllIIll(string, n3 + 62, n4 + 16 + 19 * i, 104, (n6 & 0xFEFEFE) >> 1);
                class_18542 = this.lllllIlllIIllIlIIlIIIllII.IlIlllIIIIIIlIIllIIllIlll;
                n6 = 4226832;
                class_18542.lllIIIllIIIIlllIlIIllIIll(string2, (float)(n3 + 62 + 104 - class_18542.lllIIIllIIIIlllIlIIllIIll(string2)), (float)(n4 + 16 + 19 * i + 7), n6);
                continue;
            }
            int n7 = n - (n3 + 60);
            int n8 = n2 - (n4 + 14 + 19 * i);
            if (n7 >= 0 && n8 >= 0 && n7 < 108 && n8 < 19) {
                class_0363.lllIIIllIIIIlllIlIIllIIll(n3 + 60, n4 + 14 + 19 * i, 0, 204, 108, 19);
                n6 = 0xFFFF80;
            } else {
                class_0363.lllIIIllIIIIlllIlIIllIIll(n3 + 60, n4 + 14 + 19 * i, 0, 166, 108, 19);
            }
            class_18542.lllIIIllIIIIlllIlIIllIIll(string, n3 + 62, n4 + 16 + 19 * i, 104, n6);
            class_18542 = this.lllllIlllIIllIlIIlIIIllII.IlIlllIIIIIIlIIllIIllIlll;
            n6 = 8453920;
            class_18542.lllIIIllIIIIlllIlIIllIIll(string2, (float)(n3 + 62 + 104 - class_18542.lllIIIllIIIIlllIlIIllIIll(string2)), (float)(n4 + 16 + 19 * i + 7), n6);
        }
    }

    public void lIllllIIlIIIlIllllllIIIll() {
        float f;
        float f2;
        ItemStack class_08972 = this.lIlllIlllIlIIIIlllIlIlIIl.lllIIIllIIIIlllIlIIllIIll(0).lllIIIllIIIIlllIlIIllIIll();
        if (!ItemStack.lllIlIIlIIIlIlIIIllIlllIl(class_08972, this.IllIIlllllllIIlIIlIIIIlIl)) {
            this.IllIIlllllllIIlIIlIIIIlIl = class_08972;
            do {
                this.lIlllIlllIIIIlIIlllIllIII += (float)(this.IlIlIIlllIllllllllIIIlIlI.nextInt(4) - this.IlIlIIlllIllllllllIIIlIlI.nextInt(4));
            } while (this.lllIlIIlIIIlIlIIIllIlllIl <= this.lIlllIlllIIIIlIIlllIllIII + 1.0f && this.lllIlIIlIIIlIlIIIllIlllIl >= this.lIlllIlllIIIIlIIlllIllIII - 1.0f);
        }
        ++this.lllIIIllIIIIlllIlIIllIIll;
        this.IlIllllllIIlIIllllIIlIIIl = this.lllIlIIlIIIlIlIIIllIlllIl;
        this.IIIllIIlIIIIIIlIlIIllIIlI = this.lIllllIIlIIIlIllllllIIIll;
        boolean bl = false;
        for (int i = 0; i < 3; ++i) {
            if (this.llllIIIIlIIIlIIIIIIlIllll.IIIllIIlIIIIIIlIlIIllIIlI[i] == 0) continue;
            bl = true;
        }
        this.lIllllIIlIIIlIllllllIIIll = bl ? (this.lIllllIIlIIIlIllllllIIIll += 0.2f) : (this.lIllllIIlIIIlIllllllIIIll -= 0.2f);
        if (this.lIllllIIlIIIlIllllllIIIll < 0.0f) {
            this.lIllllIIlIIIlIllllllIIIll = 0.0f;
        }
        if (this.lIllllIIlIIIlIllllllIIIll > 1.0f) {
            this.lIllllIIlIIIlIllllllIIIll = 1.0f;
        }
        if ((f2 = (this.lIlllIlllIIIIlIIlllIllIII - this.lllIlIIlIIIlIlIIIllIlllIl) * 0.4f) < -(f = 0.2f)) {
            f2 = -f;
        }
        if (f2 > f) {
            f2 = f;
        }
        this.IlIIIIIllllllIIlllIllllll += (f2 - this.IlIIIIIllllllIIlllIllllll) * 0.9f;
        this.lllIlIIlIIIlIlIIIllIlllIl += this.IlIIIIIllllllIIlllIllllll;
    }
}

