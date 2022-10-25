package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.text.WordUtils
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;

import net.minecraft.util.ResourceLocation;
import com.moonsworth.lunar.client.font.FontRegistry;
import com.moonsworth.lunar.client.font.LCFontRenderer;
import net.minecraft.client.Minecraft;
import org.apache.commons.lang3.text.WordUtils;
import org.lwjgl.opengl.GL11;

public class class_1706
extends class_0935 {
    private final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("client/logo_128.png");
    private final Minecraft lllIlIIlIIIlIlIIIllIlllIl = Minecraft.getMinecraft();
    private class_0321 lIllllIIlIIIlIllllllIIIll;
    private class_0778 IIIllIIlIIIIIIlIlIIllIIlI;
    private int IllIIlllllllIIlIIlIIIIlIl;
    private int IIIllIllIIlIlIlIlIllllIIl;
    private String IllIIIllIIIIlIlIlIllIIlll;
    private LCFontRenderer lIIIIlIlIIlllllIIllIIlIII = FontRegistry.robotoLight14px;

    public class_1706(int n) {
        this.IllIIlllllllIIlIIlIIIIlIl = n;
        this.lIllllIIlIIIlIllllllIIIll = new class_0321(this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIlIIlIIIlIlIIIllIlllIl.displayWidth, this.lllIlIIlIIIlIlIIIllIlllIl.displayHeight);
        int n2 = this.lIllllIIlIIIlIllllllIIIll.IlIIIIIllllllIIlllIllllll();
        this.IIIllIIlIIIIIIlIlIIllIIlI = new class_0778(this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll() * n2, this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl() * n2, true);
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.IllIIIllIIIIlIlIlIllIIlll = string;
        ++this.IIIllIllIIlIlIlIlIllllIIl;
        this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f);
    }

    private void lllIIIllIIIIlllIlIIllIIll(double d, double d2) {
        float f = 64.0f;
        double d3 = d / 2.0 - (double)(f / 2.0f);
        double d4 = d2 / 2.0 - (double)f - 12.0;
        GL11.glPushMatrix();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)0.9f);
        GL11.glTranslatef((float)((float)d3), (float)((float)d4), (float)1.0f);
        class_0857.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, 0.0f, 0.0f, f, 58.5f);
        GL11.glPopMatrix();
    }

    private void llIIllIllIlIIlIIllIllllll() {
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(false);
        GL11.glMatrixMode((int)5889);
        GL11.glLoadIdentity();
        GL11.glOrtho((double)0.0, (double)this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(), (double)this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl(), (double)0.0, (double)1000.0, (double)3000.0);
        GL11.glMatrixMode((int)5888);
        GL11.glLoadIdentity();
        GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-2000.0f);
        GL11.glDisable((int)2896);
        GL11.glDisable((int)2912);
        GL11.glDisable((int)2929);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)3008);
    }

    private void lllIIlIIIllllllIIIIlIlIlI() {
        int n = this.lIllllIIlIIIlIllllllIIIll.IlIIIIIllllllIIlllIllllll();
        GL11.glDisable((int)2896);
        GL11.glDisable((int)2912);
        this.IIIllIIlIIIIIIlIlIIllIIlI.IlIIIIIllllllIIlllIllllll();
        this.IIIllIIlIIIIIIlIlIIllIIlI.IlIllllllIIlIIllllIIlIIIl(this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll() * n, this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl() * n);
        GL11.glAlphaFunc((int)516, (float)0.1f);
        GL11.glFlush();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2) {
        this.llIIllIllIlIIlIIllIllllll();
        double d = this.lIllllIIlIIIlIllllllIIIll.IlIllllllIIlIIllllIIlIIIl();
        double d2 = this.lIllllIIlIIIlIllllllIIIll.lIlllIlllIIIIlIIlllIllIII();
        class_0210.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, (float)d, (float)d2, new Color(0.2f, 0.2f, 0.2f, 1.0f).getRGB());
        this.lllIIIllIIIIlllIlIIllIIll(d, d2);
        float f3 = 160.0f;
        float f4 = (float)d / 2.0f - 80.0f;
        float f5 = (float)d2 / 2.0f + 10.0f;
        class_0857.lllIIIllIIIIlllIlIIllIIll((double)f4, (double)f5, (double)(f4 + 160.0f), (double)(f5 + 4.0f), 3.0, new Color(0.0f, 0.0f, 0.0f, 0.3f).getRGB());
        float f6 = f3 * ((float)this.IIIllIllIIlIlIlIlIllllIIl / (float)this.IllIIlllllllIIlIIlIIIIlIl);
        if (this.IllIIIllIIIIlIlIlIllIIlll != null) {
            this.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl(WordUtils.capitalizeFully((String)this.IllIIIllIIIIlIlIlIllIIlll.toLowerCase()), (float)d / 2.0f, f5 - 11.0f, -3092272);
        }
        class_0857.lllIIIllIIIIlllIlIIllIIll((double)f4, (double)f5, (double)(f4 + f6), (double)(f5 + 4.0f), 3.0, new Color(1.0f, 1.0f, 1.0f, 0.3f).getRGB());
        this.lllIIlIIIllllllIIIIlIlIlI();
        this.lllIlIIlIIIlIlIIIllIlllIl.IIIllIllIIlIlIlIlIllllIIl();
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(float f, float f2, int n) {
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(float f, float f2, int n) {
    }
}

