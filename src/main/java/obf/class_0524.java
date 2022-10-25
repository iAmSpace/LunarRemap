package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Dimension;
import java.awt.image.BufferedImage;

import net.minecraft.util.ResourceLocation;
import net.minecraft.client.Minecraft;
import optifine.Config;
import org.lwjgl.opengl.GL11;

public class class_0524 {
    private Dimension IllIIlllllllIIlIIlIIIIlIl = null;
    private boolean IIIllIllIIlIlIlIlIllllIIl = false;
    private class_2108[] IllIIIllIIIIlIlIlIllIIlll = new class_2108[0];
    private ResourceLocation lIIIIlIlIIlllllIIllIIlIII = null;
    private BufferedImage llIIlllIllIllllIIIlIIIIII = null;
    private class_2202 llIIllIllIlIIlIIllIllllll = null;
    private ResourceLocation lllIIlIIIllllllIIIIlIlIlI = new ResourceLocation("textures/blocks/wool_colored_red.png");
    public static final int lllIIIllIIIIlllIlIIllIIll = 0;
    public static final int lllIlIIlIIIlIlIIIllIlllIl = 1;
    public static final int IlIllllllIIlIIllllIIlIIIl = 2;
    public static final int lIlllIlllIIIIlIIlllIllIII = 3;
    public static final int IlIIIIIllllllIIlllIllllll = 4;
    public static final int lIllllIIlIIIlIllllllIIIll = 5;
    public static final int IIIllIIlIIIIIIlIlIIllIIlI = 6;

    public class_0524(Dimension dimension, boolean bl, class_2108[] arrclass_2108) {
        this.IllIIlllllllIIlIIlIIIIlIl = dimension;
        this.IIIllIllIIlIlIlIlIllllIIl = bl;
        this.IllIIIllIIIIlIlIlIllIIlll = arrclass_2108;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1931 class_19312, class_2174 class_21742, float f, float f2) {
        class_1682 class_16822 = Config.lIIIllIIIIIllllIlIlIllIll();
        if (this.IIIllIllIIlIlIlIlIllllIIl) {
            class_16822.lllIIIllIIIIlllIlIIllIIll(class_21742.IlIIIIIllllllIIlllIllllll());
        } else if (this.lIIIIlIlIIlllllIIllIIlIII != null) {
            if (this.llIIllIllIlIIlIIllIllllll == null && this.llIIlllIllIllllIIIlIIIIII != null) {
                this.llIIllIllIlIIlIIllIllllll = new class_2202(this.llIIlllIllIllllIIIlIIIIII);
                Minecraft.getMinecraft().llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII, (class_0211)this.llIIllIllIlIIlIIllIllllll);
            }
            class_16822.lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII);
        } else {
            class_16822.lllIIIllIIIIlllIlIIllIIll(this.lllIIlIIIllllllIIIIlIlIlI);
        }
        for (int i = 0; i < this.IllIIIllIIIIlIlIlIllIIlll.length; ++i) {
            class_2108 class_21082 = this.IllIIIllIIIIlIlIlIllIIlll[i];
            GL11.glPushMatrix();
            if (class_21742.IIlIIlIlIlIllIIlIlIIIIlll()) {
                GL11.glTranslatef((float)0.0f, (float)0.2f, (float)0.0f);
            }
            class_21082.lllIIIllIIIIlllIlIIllIIll(class_19312, f);
            GL11.glPopMatrix();
        }
    }

    public static class_0744 lllIIIllIIIIlllIlIIllIIll(class_1931 class_19312, int n) {
        switch (n) {
            case 0: {
                return class_19312.IIIllIllIIlIlIlIlIllllIIl;
            }
            case 1: {
                return class_19312.IIIllIIlIIIIIIlIlIIllIIlI;
            }
            case 2: {
                return class_19312.lIIIIlIlIIlllllIIllIIlIII;
            }
            case 3: {
                return class_19312.IllIIIllIIIIlIlIlIllIIlll;
            }
            case 4: {
                return class_19312.llIIllIllIlIIlIIllIllllll;
            }
            case 5: {
                return class_19312.llIIlllIllIllllIIIlIIIIII;
            }
        }
        return null;
    }

    public BufferedImage lllIIIllIIIIlllIlIIllIIll() {
        return this.llIIlllIllIllllIIIlIIIIII;
    }

    public void lllIIIllIIIIlllIlIIllIIll(BufferedImage bufferedImage) {
        this.llIIlllIllIllllIIIlIIIIII = bufferedImage;
    }

    public class_2202 lllIlIIlIIIlIlIIIllIlllIl() {
        return this.llIIllIllIlIIlIIllIllllll;
    }

    public ResourceLocation IlIllllllIIlIIllllIIlIIIl() {
        return this.lIIIIlIlIIlllllIIllIIlIII;
    }

    public void lllIIIllIIIIlllIlIIllIIll(ResourceLocation class_17732) {
        this.lIIIIlIlIIlllllIIllIIlIII = class_17732;
    }

    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return this.IIIllIllIIlIlIlIlIllllIIl;
    }
}

