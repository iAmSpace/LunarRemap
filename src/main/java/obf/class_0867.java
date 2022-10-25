package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.Charsets
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL11
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.apache.commons.io.Charsets;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class class_0867
extends class_0229 {
    private static final Logger lllIIIllIIIIlllIlIIllIIll = LogManager.getLogger();
    private static final ResourceLocation lllIlIIlIIIlIlIIIllIlllIl = new ResourceLocation("textures/gui/title/minecraft.png");
    private static final ResourceLocation IlIllllllIIlIIllllIIlIIIl = new ResourceLocation("textures/misc/vignette.png");
    private int lIlllIlllIIIIlIIlllIllIII;
    private List IlIIIIIllllllIIlllIllllll;
    private int lIllllIIlIIIlIllllllIIIll;
    private float IIIllIIlIIIIIIlIlIIllIIlI = 0.5f;

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        ++this.lIlllIlllIIIIlIIlllIllIII;
        float f = (float)(this.lIllllIIlIIIlIllllllIIIll + this.lIIlIIIIIlIlllIlIIlIlIlll + this.lIIlIIIIIlIlllIlIIlIlIlll + 24) / this.IIIllIIlIIIIIIlIlIIllIIlI;
        if ((float)this.lIlllIlllIIIIlIIlllIllIII > f) {
            this.lIllllIIlIIIlIllllllIIIll();
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(char c, int n) {
        if (n == 1) {
            this.lIllllIIlIIIlIllllllIIIll();
        }
    }

    private void lIllllIIlIIIlIllllllIIIll() {
        this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new class_0499(class_1297.lllIIIllIIIIlllIlIIllIIll));
        this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll((class_0229)null);
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return true;
    }

    @Override
    public void n_() {
        if (this.IlIIIIIllllllIIlllIllllll == null) {
            this.IlIIIIIllllllIIlllIllllll = new ArrayList();
            try {
                int n;
                String string = "";
                String string2 = "" + (Object)((Object)class_1227.IlIlIIlIlIllIIlIlIIllIIIl) + (Object)((Object)class_1227.lllllIlllIIllIlIIlIIIllII) + (Object)((Object)class_1227.lIIIIlIlIIlllllIIllIIlIII) + (Object)((Object)class_1227.llIIlllIllIllllIIIlIIIIII);
                int n2 = 274;
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.lllllIlllIIllIlIIlIIIllII.getResourceManager().getResource(new ResourceLocation("texts/end.txt")).getInputStream(), Charsets.UTF_8));
                Random random = new Random(8124371L);
                while ((string = bufferedReader.readLine()) != null) {
                    string = string.replaceAll("PLAYERNAME", this.lllllIlllIIllIlIIlIIIllII.getSession().getUsername());
                    while (string.contains(string2)) {
                        n = string.indexOf(string2);
                        String string3 = string.substring(0, n);
                        String string4 = string.substring(n + string2.length());
                        string = string3 + (Object)((Object)class_1227.IlIlIIlIlIllIIlIlIIllIIIl) + (Object)((Object)class_1227.lllllIlllIIllIlIIlIIIllII) + "XXXXXXXX".substring(0, random.nextInt(4) + 3) + string4;
                    }
                    this.IlIIIIIllllllIIlllIllllll.addAll(this.lllllIlllIIllIlIIlIIIllII.IlIlllIIIIIIlIIllIIllIlll.IlIllllllIIlIIllllIIlIIIl(string, n2));
                    this.IlIIIIIllllllIIlllIllllll.add("");
                }
                for (n = 0; n < 8; ++n) {
                    this.IlIIIIIllllllIIlllIllllll.add("");
                }
                bufferedReader = new BufferedReader(new InputStreamReader(this.lllllIlllIIllIlIIlIIIllII.getResourceManager().getResource(new ResourceLocation("texts/credits.txt")).getInputStream(), Charsets.UTF_8));
                while ((string = bufferedReader.readLine()) != null) {
                    string = string.replaceAll("PLAYERNAME", this.lllllIlllIIllIlIIlIIIllII.getSession().getUsername());
                    string = string.replaceAll("\t", "    ");
                    this.IlIIIIIllllllIIlllIllllll.addAll(this.lllllIlllIIllIlIIlIIIllII.IlIlllIIIIIIlIIllIIllIlll.IlIllllllIIlIIllllIIlIIIl(string, n2));
                    this.IlIIIIIllllllIIlllIllllll.add("");
                }
                this.lIllllIIlIIIlIllllllIIIll = this.IlIIIIIllllllIIlllIllllll.size() * 12;
            }
            catch (Exception exception) {
                lllIIIllIIIIlllIlIIllIIll.error("Couldn't load credits", (Throwable)exception);
            }
        }
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, float f) {
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(class_0210.llIIlllIllIllllIIIlIIIIII);
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.lllIIIllIIIIlllIlIIllIIll(1.0f, 1.0f, 1.0f, 1.0f);
        int n3 = this.IlIlIIlllIIlIllIIIlllllIl;
        float f2 = 0.0f - ((float)this.lIlllIlllIIIIlIIlllIllIII + f) * 0.5f * this.IIIllIIlIIIIIIlIlIIllIIlI;
        float f3 = (float)this.lIIlIIIIIlIlllIlIIlIlIlll - ((float)this.lIlllIlllIIIIlIIlllIllIII + f) * 0.5f * this.IIIllIIlIIIIIIlIlIIllIIlI;
        float f4 = 0.015625f;
        float f5 = ((float)this.lIlllIlllIIIIlIIlllIllIII + f - 0.0f) * 0.02f;
        float f6 = (float)(this.lIllllIIlIIIlIllllllIIIll + this.lIIlIIIIIlIlllIlIIlIlIlll + this.lIIlIIIIIlIlllIlIIlIlIlll + 24) / this.IIIllIIlIIIIIIlIlIIllIIlI;
        float f7 = (f6 - 20.0f - ((float)this.lIlllIlllIIIIlIIlllIllIII + f)) * 0.005f;
        if (f7 < f5) {
            f5 = f7;
        }
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        f5 *= f5;
        f5 = f5 * 96.0f / 255.0f;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(f5, f5, f5);
        class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, this.lIIlIIIIIlIlllIlIIlIlIlll, IlIlllIIIIIIlIIllIIllIlll, 0.0, f2 * f4);
        class_08682.lllIIIllIIIIlllIlIIllIIll(n3, this.lIIlIIIIIlIlllIlIIlIlIlll, IlIlllIIIIIIlIIllIIllIlll, (float)n3 * f4, f2 * f4);
        class_08682.lllIIIllIIIIlllIlIIllIIll(n3, 0.0, IlIlllIIIIIIlIIllIIllIlll, (float)n3 * f4, f3 * f4);
        class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, IlIlllIIIIIIlIIllIIllIlll, 0.0, f3 * f4);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        int n3;
        this.lllIlIIlIIIlIlIIIllIlllIl(n, n2, f);
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        int n4 = 274;
        int n5 = this.IlIlIIlllIIlIllIIIlllllIl / 2 - n4 / 2;
        int n6 = this.lIIlIIIIIlIlllIlIIlIlIlll + 50;
        float f2 = -((float)this.lIlllIlllIIIIlIIlllIllIII + f) * this.IIIllIIlIIIIIIlIlIIllIIlI;
        GL11.glPushMatrix();
        GL11.glTranslatef((float)0.0f, (float)f2, (float)0.0f);
        this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(lllIlIIlIIIlIlIIIllIlllIl);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        class_0867.lllIIIllIIIIlllIlIIllIIll(n5, n6, 0, 0, 155, 44);
        class_0867.lllIIIllIIIIlllIlIIllIIll(n5 + 155, n6, 0, 45, 155, 44);
        class_08682.IlIllllllIIlIIllllIIlIIIl(0xFFFFFF);
        int n7 = n6 + 200;
        for (n3 = 0; n3 < this.IlIIIIIllllllIIlllIllllll.size(); ++n3) {
            float f3;
            if (n3 == this.IlIIIIIllllllIIlllIllllll.size() - 1 && (f3 = (float)n7 + f2 - (float)(this.lIIlIIIIIlIlllIlIIlIlIlll / 2 - 6)) < 0.0f) {
                GL11.glTranslatef((float)0.0f, (float)(-f3), (float)0.0f);
            }
            if ((float)n7 + f2 + 12.0f + 8.0f > 0.0f && (float)n7 + f2 < (float)this.lIIlIIIIIlIlllIlIIlIlIlll) {
                String string = (String)this.IlIIIIIllllllIIlllIllllll.get(n3);
                if (string.startsWith("[C]")) {
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(string.substring(3), (float)(n5 + (n4 - this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(string.substring(3))) / 2), (float)n7, 0xFFFFFF);
                } else {
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl.setSeed((long)n3 * 4238972211L + (long)(this.lIlllIlllIIIIlIIlllIllIII / 4));
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(string, (float)n5, (float)n7, 0xFFFFFF);
                }
            }
            n7 += 12;
        }
        GL11.glPopMatrix();
        this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(IlIllllllIIlIIllllIIlIIIl);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)0, (int)769);
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.lllIIIllIIIIlllIlIIllIIll(1.0f, 1.0f, 1.0f, 1.0f);
        n3 = this.IlIlIIlllIIlIllIIIlllllIl;
        int n8 = this.lIIlIIIIIlIlllIlIIlIlIlll;
        class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, n8, IlIlllIIIIIIlIIllIIllIlll, 0.0, 1.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll(n3, n8, IlIlllIIIIIIlIIllIIllIlll, 1.0, 1.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll(n3, 0.0, IlIlllIIIIIIlIIllIIllIlll, 1.0, 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, IlIlllIIIIIIlIIllIIllIlll, 0.0, 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        GL11.glDisable((int)3042);
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
    }
}

