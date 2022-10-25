package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.opengl.GL11;

public class class_0381
extends class_2052 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/entity/beacon_beam.png");

    public void lllIIIllIIIIlllIlIIllIIll(class_0396 class_03962, double d, double d2, double d3, float f) {
        float f2 = class_03962.lllIIIllIIIIlllIlIIllIIll();
        GL11.glAlphaFunc((int)516, (float)0.1f);
        if (f2 > 0.0f) {
            class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
            this.lllIIIllIIIIlllIlIIllIIll(lllIIIllIIIIlllIlIIllIIll);
            GL11.glTexParameterf((int)3553, (int)10242, (float)10497.0f);
            GL11.glTexParameterf((int)3553, (int)10243, (float)10497.0f);
            GL11.glDisable((int)2896);
            GL11.glDisable((int)2884);
            GL11.glDisable((int)3042);
            GL11.glDepthMask((boolean)true);
            OpenGlHelper.glBlendFunc(770, 1, 1, 0);
            float f3 = (float)class_03962.IIIIIIIIlIllIIllIIlllIllI().IlIIIlIIIIllIIIllIIIIIIll() + f;
            float f4 = -f3 * 0.2f - (float) MathHelper.lIlllIlllIIIIlIIlllIllIII(-f3 * 0.1f);
            boolean bl = true;
            double d4 = (double)f3 * 0.025 * (1.0 - (double)(bl & true) * 2.5);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.lllIIIllIIIIlllIlIIllIIll(255, 255, 255, 32);
            double d5 = (double)bl * 0.2;
            double d6 = 0.5 + Math.cos(d4 + 2.356194490192345) * d5;
            double d7 = 0.5 + Math.sin(d4 + 2.356194490192345) * d5;
            double d8 = 0.5 + Math.cos(d4 + 0.7853981633974483) * d5;
            double d9 = 0.5 + Math.sin(d4 + 0.7853981633974483) * d5;
            double d10 = 0.5 + Math.cos(d4 + 3.9269908169872414) * d5;
            double d11 = 0.5 + Math.sin(d4 + 3.9269908169872414) * d5;
            double d12 = 0.5 + Math.cos(d4 + 5.497787143782138) * d5;
            double d13 = 0.5 + Math.sin(d4 + 5.497787143782138) * d5;
            double d14 = 256.0f * f2;
            double d15 = 0.0;
            double d16 = 1.0;
            double d17 = -1.0f + f4;
            double d18 = (double)(256.0f * f2) * (0.5 / d5) + d17;
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + d6, d2 + d14, d3 + d7, d16, d18);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + d6, d2, d3 + d7, d16, d17);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + d8, d2, d3 + d9, d15, d17);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + d8, d2 + d14, d3 + d9, d15, d18);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + d12, d2 + d14, d3 + d13, d16, d18);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + d12, d2, d3 + d13, d16, d17);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + d10, d2, d3 + d11, d15, d17);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + d10, d2 + d14, d3 + d11, d15, d18);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + d8, d2 + d14, d3 + d9, d16, d18);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + d8, d2, d3 + d9, d16, d17);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + d12, d2, d3 + d13, d15, d17);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + d12, d2 + d14, d3 + d13, d15, d18);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + d10, d2 + d14, d3 + d11, d16, d18);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + d10, d2, d3 + d11, d16, d17);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + d6, d2, d3 + d7, d15, d17);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + d6, d2 + d14, d3 + d7, d15, d18);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            GL11.glEnable((int)3042);
            OpenGlHelper.glBlendFunc(770, 771, 1, 0);
            GL11.glDepthMask((boolean)false);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.lllIIIllIIIIlllIlIIllIIll(255, 255, 255, 32);
            double d19 = 0.2;
            double d20 = 0.2;
            double d21 = 0.8;
            double d22 = 0.2;
            double d23 = 0.2;
            double d24 = 0.8;
            double d25 = 0.8;
            double d26 = 0.8;
            double d27 = 256.0f * f2;
            double d28 = 0.0;
            double d29 = 1.0;
            double d30 = -1.0f + f4;
            double d31 = (double)(256.0f * f2) + d30;
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + d19, d2 + d27, d3 + d20, d29, d31);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + d19, d2, d3 + d20, d29, d30);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + d21, d2, d3 + d22, d28, d30);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + d21, d2 + d27, d3 + d22, d28, d31);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + d25, d2 + d27, d3 + d26, d29, d31);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + d25, d2, d3 + d26, d29, d30);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + d23, d2, d3 + d24, d28, d30);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + d23, d2 + d27, d3 + d24, d28, d31);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + d21, d2 + d27, d3 + d22, d29, d31);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + d21, d2, d3 + d22, d29, d30);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + d25, d2, d3 + d26, d28, d30);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + d25, d2 + d27, d3 + d26, d28, d31);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + d23, d2 + d27, d3 + d24, d29, d31);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + d23, d2, d3 + d24, d29, d30);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + d19, d2, d3 + d20, d28, d30);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + d19, d2 + d27, d3 + d20, d28, d31);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            GL11.glEnable((int)2896);
            GL11.glEnable((int)3553);
            GL11.glDepthMask((boolean)true);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1774 class_17742, double d, double d2, double d3, float f) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0396)class_17742, d, d2, d3, f);
    }
}

