package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.InputStream;

import net.minecraft.util.ResourceLocation;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class class_0626 {
    private float IllIIlllllllIIlIIlIIIIlIl = 1048.0f;
    protected class_0522[] lllIIIllIIIIlllIlIIllIIll = new class_0522[256];
    protected Font lllIlIIlIIIlIlIIIllIlllIl;
    protected boolean IlIllllllIIlIIllllIIlIIIl;
    protected boolean lIlllIlllIIIIlIIlllIllIII;
    protected int IlIIIIIllllllIIlllIllllll = -1;
    protected int lIllllIIlIIIlIllllllIIIll = 0;
    protected class_2202 IIIllIIlIIIIIIlIlIIllIIlI;

    public class_0626(ResourceLocation class_17732, float f) {
        Font font;
        try {
            InputStream inputStream = Minecraft.getMinecraft() == null || Minecraft.getMinecraft().getResourceManager() == null ? Minecraft.getMinecraft().IIlIllIIlllllIIlIIllllIIl().lIlllIlllIIIIlIIlllIllIII(class_17732) : Minecraft.getMinecraft().getResourceManager().getResource(class_17732).getInputStream();
            font = Font.createFont(0, inputStream).deriveFont(f);
        }
        catch (Exception exception) {
            font = new Font("Arial", 0, (int)f);
        }
        this.lllIlIIlIIIlIlIIIllIlllIl = font;
        this.IlIllllllIIlIIllllIIlIIIl = true;
        this.lIlllIlllIIIIlIIlllIllIII = true;
        this.IIIllIIlIIIIIIlIlIIllIIlI = this.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.lllIIIllIIIIlllIlIIllIIll);
    }

    protected class_2202 lllIIIllIIIIlllIlIIllIIll(Font font, boolean bl, boolean bl2, class_0522[] arrclass_0522) {
        BufferedImage bufferedImage = this.lllIlIIlIIIlIlIIIllIlllIl(font, bl, bl2, arrclass_0522);
        try {
            return new class_2202(bufferedImage);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    private BufferedImage lllIlIIlIIIlIlIIIllIlllIl(Font font, boolean bl, boolean bl2, class_0522[] arrclass_0522) {
        int n = (int)this.IllIIlllllllIIlIIlIIIIlIl;
        BufferedImage bufferedImage = new BufferedImage(n, n, 2);
        Graphics2D graphics2D = (Graphics2D)bufferedImage.getGraphics();
        graphics2D.setFont(font);
        graphics2D.setColor(new Color(255, 255, 255, 0));
        graphics2D.fillRect(0, 0, n, n);
        graphics2D.setColor(Color.WHITE);
        graphics2D.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, bl2 ? RenderingHints.VALUE_FRACTIONALMETRICS_ON : RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
        graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, bl ? RenderingHints.VALUE_TEXT_ANTIALIAS_ON : RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, bl ? RenderingHints.VALUE_ANTIALIAS_ON : RenderingHints.VALUE_ANTIALIAS_OFF);
        FontMetrics fontMetrics = graphics2D.getFontMetrics();
        int n2 = 0;
        int n3 = 0;
        int n4 = 1;
        for (int i = 0; i < arrclass_0522.length; ++i) {
            char c = (char)i;
            class_0522 class_05222 = new class_0522(this);
            Rectangle2D rectangle2D = fontMetrics.getStringBounds(String.valueOf(c), graphics2D);
            class_05222.lllIIIllIIIIlllIlIIllIIll = rectangle2D.getBounds().width + 8;
            class_05222.lllIlIIlIIIlIlIIIllIlllIl = rectangle2D.getBounds().height;
            if (n3 + class_05222.lllIIIllIIIIlllIlIIllIIll >= n) {
                n3 = 0;
                n4 += n2;
                n2 = 0;
            }
            if (class_05222.lllIlIIlIIIlIlIIIllIlllIl > n2) {
                n2 = class_05222.lllIlIIlIIIlIlIIIllIlllIl;
            }
            class_05222.IlIllllllIIlIIllllIIlIIIl = n3;
            class_05222.lIlllIlllIIIIlIIlllIllIII = n4;
            if (class_05222.lllIlIIlIIIlIlIIIllIlllIl > this.IlIIIIIllllllIIlllIllllll) {
                this.IlIIIIIllllllIIlllIllllll = class_05222.lllIlIIlIIIlIlIIIllIlllIl;
            }
            arrclass_0522[i] = class_05222;
            graphics2D.drawString(String.valueOf(c), n3 + 2, n4 + fontMetrics.getAscent());
            n3 += class_05222.lllIIIllIIIIlllIlIIllIIll;
        }
        return bufferedImage;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_0522[] arrclass_0522, char c, float f, float f2) {
        try {
            this.lllIIIllIIIIlllIlIIllIIll(f, f2, arrclass_0522[c].lllIIIllIIIIlllIlIIllIIll, arrclass_0522[c].lllIlIIlIIIlIlIIIllIlllIl, arrclass_0522[c].IlIllllllIIlIIllllIIlIIIl, arrclass_0522[c].lIlllIlllIIIIlIIlllIllIII, arrclass_0522[c].lllIIIllIIIIlllIlIIllIIll, arrclass_0522[c].lllIlIIlIIIlIlIIIllIlllIl);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = f5 / this.IllIIlllllllIIlIIlIIIIlIl;
        float f10 = f6 / this.IllIIlllllllIIlIIlIIIIlIl;
        float f11 = f7 / this.IllIIlllllllIIlIIlIIIIlIl;
        float f12 = f8 / this.IllIIlllllllIIlIIlIIIIlIl;
        GL11.glTexCoord2f((float)(f9 + f11), (float)f10);
        GL11.glVertex2d((double)(f + f3), (double)f2);
        GL11.glTexCoord2f((float)f9, (float)f10);
        GL11.glVertex2d((double)f, (double)f2);
        GL11.glTexCoord2f((float)f9, (float)(f10 + f12));
        GL11.glVertex2d((double)f, (double)(f2 + f4));
        GL11.glTexCoord2f((float)f9, (float)(f10 + f12));
        GL11.glVertex2d((double)f, (double)(f2 + f4));
        GL11.glTexCoord2f((float)(f9 + f11), (float)(f10 + f12));
        GL11.glVertex2d((double)(f + f3), (double)(f2 + f4));
        GL11.glTexCoord2f((float)(f9 + f11), (float)f10);
        GL11.glVertex2d((double)(f + f3), (double)f2);
    }

    public int lllIIIllIIIIlllIlIIllIIll(String string) {
        return this.lllIIIllIIIIlllIlIIllIIll();
    }

    public int lllIIIllIIIIlllIlIIllIIll() {
        return (this.IlIIIIIllllllIIlllIllllll - 8) / 2;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl(String string) {
        int n = 0;
        for (char c : string.toCharArray()) {
            if (c >= this.lllIIIllIIIIlllIlIIllIIll.length || c < '\u0000') continue;
            n += this.lllIIIllIIIIlllIlIIllIIll[c].lllIIIllIIIIlllIlIIllIIll - 8 + this.lIllllIIlIIIlIllllllIIIll;
        }
        return n / 2;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        if (this.IlIllllllIIlIIllllIIlIIIl != bl) {
            this.IlIllllllIIlIIllllIIlIIIl = bl;
            this.IIIllIIlIIIIIIlIlIIllIIlI = this.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, bl, this.lIlllIlllIIIIlIIlllIllIII, this.lllIIIllIIIIlllIlIIllIIll);
        }
    }

    public boolean IlIllllllIIlIIllllIIlIIIl() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(boolean bl) {
        if (this.lIlllIlllIIIIlIIlllIllIII != bl) {
            this.lIlllIlllIIIIlIIlllIllIII = bl;
            this.IIIllIIlIIIIIIlIlIIllIIlI = this.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, bl, this.lllIIIllIIIIlllIlIIllIIll);
        }
    }

    public Font lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(Font font) {
        this.lllIlIIlIIIlIlIIIllIlllIl = font;
        this.IIIllIIlIIIIIIlIlIIllIIlI = this.lllIIIllIIIIlllIlIIllIIll(font, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.lllIIIllIIIIlllIlIIllIIll);
    }
}

