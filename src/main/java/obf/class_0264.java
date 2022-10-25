package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import org.lwjgl.opengl.GL11;

public class class_0264
extends class_0759 {
    private final class_0295 IIIllIIlIIIIIIlIlIIllIIlI;
    private final float IllIIlllllllIIlIIlIIIIlIl;
    private final class_0663 IIIllIllIIlIlIlIlIllllIIl;
    private Color IllIIIllIIIIlIlIlIllIIlll = new Color(0.3f, 0.3f, 0.3f, 0.3f);
    private class_0730 lIIIIlIlIIlllllIIllIIlIII;
    private class_0730 llIIlllIllIllllIIIlIIIIII;

    public class_0264(class_0295 class_02952, int n, class_0663 class_06632) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_02952;
        float f = 45.0f;
        this.IllIIlllllllIIlIIlIIIIlIl = f / 2.0f + (float)n * f;
        this.IIIllIllIIlIlIlIlIllllIIl = class_06632;
        this.lIIIIlIlIIlllllIIllIIlIII = new class_0730(500L, new Color(0.2f, 0.2f, 0.2f, 0.1f).getRGB(), new Color(0.2f, 0.2f, 0.3f, 0.5f).getRGB());
        this.llIIlllIllIllllIIIlIIIIII = new class_0730(500L, new Color(0.0f, 0.0f, 0.0f, 0.9f).getRGB(), -1);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(float f, float f2, boolean bl) {
        boolean bl2 = this.IIIllIllIIlIlIlIlIllllIIl != null && this.lllIlIIlIIIlIlIIIllIlllIl(f, f2) && bl;
        Color color = this.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl(bl2);
        class_0321 class_03212 = new class_0321(this.IlIIIIIllllllIIlllIllllll, this.IlIIIIIllllllIIlllIllllll.displayWidth, this.IlIIIIIllllllIIlllIllllll.displayHeight);
        int n = class_03212.lllIIIllIIIIlllIlIIllIIll();
        int n2 = class_03212.lllIlIIlIIIlIlIIIllIlllIl();
        float f3 = 10.0f;
        float f4 = (float)this.IIIllIIlIIIIIIlIlIIllIIlI.IlIllllllIIlIIllllIIlIIIl >= f3 ? 1.0f : (float)this.IIIllIIlIIIIIIlIlIIllIIlI.IlIllllllIIlIIllllIIlIIIl / f3;
        GL11.glPushMatrix();
        if (this.IIIllIllIIlIlIlIlIllllIIl == null) {
            GL11.glColor4d((double)((float)this.IllIIIllIIIIlIlIlIllIIlll.getRed() / 255.0f), (double)((float)this.IllIIIllIIIIlIlIlIllIIlll.getGreen() / 255.0f), (double)((float)this.IllIIIllIIIIlIlIlIllIIlll.getBlue() / 255.0f), (double)((float)this.IllIIIllIIIIlIlIlIllIIlll.getAlpha() / 255.0f * f4));
        } else {
            GL11.glColor4d((double)((float)color.getRed() / 255.0f), (double)((float)color.getGreen() / 255.0f), (double)((float)color.getBlue() / 255.0f), (double)((float)color.getAlpha() / 255.0f * f4));
        }
        class_0857.lllIIIllIIIIlllIlIIllIIll((double)((float)n / 2.0f), (double)((float)n2 / 2.0f), 88.0, 20.0, (double)(360.0f - this.IllIIlllllllIIlIIlIIIIlIl + 90.0f), 360.0f - this.IllIIlllllllIIlIIlIIIIlIl + 90.0f + 45.0f);
        GL11.glPopMatrix();
        if (this.IIIllIllIIlIlIlIlIllllIIl != null) {
            color = this.llIIlllIllIllllIIIlIIIIII.lllIlIIlIIIlIlIIIllIlllIl(bl2);
            GL11.glPushMatrix();
            float f5 = this.IllIIlllllllIIlIIlIIIIlIl - 90.0f;
            double d = Math.toRadians(f5 -= 22.5f);
            int n3 = 60;
            double d2 = (double)((float)n / 2.0f) + (double)n3 * Math.cos(d);
            double d3 = (double)((float)n2 / 2.0f) + (double)n3 * Math.sin(d);
            GL11.glColor4d((double)((float)color.getRed() / 255.0f), (double)((float)color.getGreen() / 255.0f), (double)((float)color.getBlue() / 255.0f), (double)((float)color.getAlpha() / 255.0f * f4));
            class_0857.lllIIIllIIIIlllIlIIllIIll(this.IIIllIllIIlIlIlIlIllllIIl.IlIllllllIIlIIllllIIlIIIl(), 20.0f, (float)d2 - 20.0f, (float)d3 - 20.0f);
            GL11.glPopMatrix();
        }
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(float f, float f2) {
        boolean bl;
        class_0321 class_03212 = new class_0321(this.IlIIIIIllllllIIlllIllllll, this.IlIIIIIllllllIIlllIllllll.displayWidth, this.IlIIIIIllllllIIlllIllllll.displayHeight);
        int n = class_03212.lllIIIllIIIIlllIlIIllIIll();
        int n2 = class_03212.lllIlIIlIIIlIlIIIllIlllIl();
        int n3 = (int)(f - (float)(n / 2));
        int n4 = (int)(f2 - (float)(n2 / 2));
        double d = Math.sqrt(n3 * n3 + n4 * n4);
        double d2 = Math.toDegrees(Math.atan2(n4, n3)) + 90.0;
        double d3 = this.IllIIlllllllIIlIIlIIIIlIl - 45.0f;
        if (d3 < 0.0) {
            d3 += 360.0;
        }
        double d4 = this.IllIIlllllllIIlIIlIIIIlIl;
        boolean bl2 = bl = d2 < 0.0;
        if (d3 > d4) {
            d4 += 360.0;
            bl = true;
        }
        if (bl) {
            d2 += 360.0;
        }
        return d >= 20.0 && d <= 175.0 && d2 >= d3 && d2 <= d4;
    }
}

