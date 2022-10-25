package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.glu.GLU
 */
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.minecraft.client.Minecraft;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public class class_0904
extends class_2256 {
    public FloatBuffer lllIIIllIIIIlllIlIIllIIll = BufferUtils.createFloatBuffer((int)16);
    public FloatBuffer lllIlIIlIIIlIlIIIllIlllIl = BufferUtils.createFloatBuffer((int)16);
    private static Map IlIllllllIIlIIllllIIlIIIl = null;

    public class_0904(String string) {
        super(string);
        this.IlIllllllIIlIIllllIIlIIIl(true);
        this.lllIIIllIIIIlllIlIIllIIll(class_2201.class, this::lllIIIllIIIIlllIlIIllIIll);
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_2201 class_22012) {
        Minecraft class_06672 = Minecraft.getMinecraft();
        IntBuffer intBuffer = BufferUtils.createIntBuffer((int)16);
        GL11.glGetInteger((int)2978, (IntBuffer)intBuffer);
        float f = class_06672.lllIIIllIIIIlllIlIIllIIll().lllIlIIlIIIlIlIIIllIlllIl;
        float f2 = (float)(class_06672.lIIIIlIlIIlllllIIllIIlIII.lIIIlIIIlIlllIllIIIlIIIlI + (class_06672.lIIIIlIlIIlllllIIllIIlIII.IlIIlllllIIlIlIlllllIllll - class_06672.lIIIIlIlIIlllllIIllIIlIII.lIIIlIIIlIlllIllIIIlIIIlI) * (double)f);
        float f3 = (float)(class_06672.lIIIIlIlIIlllllIIllIIlIII.lIIlIlllIllIlIlllIIIIIIII + (class_06672.lIIIIlIlIIlllllIIllIIlIII.llIIlIlIlllIIllIlIlllIllI - class_06672.lIIIIlIlIIlllllIIllIIlIII.lIIlIlllIllIlIlllIIIIIIII) * (double)f);
        float f4 = (float)(class_06672.lIIIIlIlIIlllllIIllIIlIII.IIlIllIIlllllIIlIIllllIIl + (class_06672.lIIIIlIlIIlllllIIllIIlIII.IllIIIIllIIllIllIlllIlIIl - class_06672.lIIIIlIlIIlllllIIllIIlIII.IIlIllIIlllllIIlIIllllIIl) * (double)f);
        double d = (double)(class_06672.lIIIIlIlIIlllllIIllIIlIII.IlIlIIlllIllllllllIIIlIlI + 90.0f) * Math.PI / 180.0;
        double d2 = (double)(class_06672.lIIIIlIlIIlllllIIllIIlIII.IIIIlIllIlIIlIIlIllIlIlll + 90.0f) * Math.PI / 180.0;
        boolean bl = IlIllllllIIlIIllllIIlIIIl != null;
        class_0864 class_08642 = new class_0864(Math.sin(d) * Math.cos(d2), Math.cos(d), Math.sin(d) * Math.sin(d2));
        if (class_06672.gameSettings.IIlIlIlIIlllIIIlIIIIlIIIl == 2) {
            class_08642 = new class_0864(class_08642.lllIIIllIIIIlllIlIIllIIll * -1.0, class_08642.lllIlIIlIIIlIlIIIllIlllIl * -1.0, class_08642.IlIllllllIIlIIllllIIlIIIl * -1.0);
        }
        for (int i = 0; i < class_06672.theWorld.IlIlIIlllIIlIllIIIlllllIl().size(); ++i) {
            Object object;
            class_1521 class_15212 = (class_1521)class_06672.theWorld.IlIlIIlllIIlIllIIIlllllIl().get(i);
            if (class_15212 == null || class_15212 == class_06672.lIIIIlIlIIlllllIIllIIlIII || !(class_15212 instanceof class_2174)) continue;
            class_2174 class_21742 = (class_2174)class_15212;
            class_0141 class_01412 = class_21742.lIlIlIIllIlIIIIIlIIlllIlI();
            class_0693 class_06932 = class_01412.lllIIIllIIIIlllIlIIllIIll(2);
            float f5 = 0.0f;
            if (class_21742.IlIIIIIllllllIIlllIllllll((class_1521)class_06672.lIIIIlIlIIlllllIIllIIlIII) < 100.0 && class_06932 != null) {
                f5 = (float)((double)f5 + (double)((float)class_06672.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll * 0.0375f));
            }
            float f6 = (float)(class_21742.lIIIlIIIlIlllIllIIIlIIIlI + (class_21742.IlIIlllllIIlIlIlllllIllll - class_21742.lIIIlIIIlIlllIllIIIlIIIlI) * (double)f - (double)f2);
            float f7 = (float)(class_21742.lIIlIlllIllIlIlllIIIIIIII + (class_21742.llIIlIlIlllIIllIlIlllIllI - class_21742.lIIlIlllIllIlIlllIIIIIIII) * (double)f - (double)f3) + class_21742.lllIIIIlIlIIlIIlllIIIIIIl + (class_21742.IIlIIlIlIlIllIIlIlIIIIlll() ? 0.3f : 0.55f) + f5;
            float f8 = (float)(class_21742.IIlIllIIlllllIIlIIllllIIl + (class_21742.IllIIIIllIIllIllIlllIlIIl - class_21742.IIlIllIIlllllIIlIIllllIIl) * (double)f - (double)f4);
            class_0864 class_08643 = new class_0864(f6, f7, f8);
            double d3 = class_08643.lllIlIIlIIIlIlIIIllIlllIl();
            if (class_08642.lllIlIIlIIIlIlIIIllIlllIl(class_08643 = class_08643.lllIIIllIIIIlllIlIIllIIll()) <= 0.02) {
                double d4 = 1.5533430342749535;
                double d5 = Math.sin(1.5533430342749535);
                double d6 = Math.cos(1.5533430342749535);
                object = class_08642.IlIllllllIIlIIllllIIlIIIl(class_08643);
                double d7 = ((class_0864)object).lllIIIllIIIIlllIlIIllIIll;
                double d8 = ((class_0864)object).lllIlIIlIIIlIlIIIllIlllIl;
                double d9 = ((class_0864)object).IlIllllllIIlIIllllIIlIIIl;
                double d10 = d6 + d7 * d7 * (1.0 - d6);
                double d11 = d7 * d8 * (1.0 - d6) - d9 * d5;
                double d12 = d7 * d9 * (1.0 - d6) + d8 * d5;
                double d13 = d8 * d7 * (1.0 - d6) + d9 * d5;
                double d14 = d6 + d8 * d8 * (1.0 - d6);
                double d15 = d8 * d9 * (1.0 - d6) - d7 * d5;
                double d16 = d9 * d7 * (1.0 - d6) - d8 * d5;
                double d17 = d9 * d8 * (1.0 - d6) + d7 * d5;
                double d18 = d6 + d9 * d9 * (1.0 - d6);
                f6 = (float)(d3 * (d10 * class_08642.lllIIIllIIIIlllIlIIllIIll + d11 * class_08642.lllIlIIlIIIlIlIIIllIlllIl + d12 * class_08642.IlIllllllIIlIIllllIIlIIIl));
                f7 = (float)(d3 * (d13 * class_08642.lllIIIllIIIIlllIlIIllIIll + d14 * class_08642.lllIlIIlIIIlIlIIIllIlllIl + d15 * class_08642.IlIllllllIIlIIllllIIlIIIl));
                f8 = (float)(d3 * (d16 * class_08642.lllIIIllIIIIlllIlIIllIIll + d17 * class_08642.lllIlIIlIIIlIlIIIllIlllIl + d18 * class_08642.IlIllllllIIlIIllllIIlIIIl));
            }
            FloatBuffer floatBuffer = BufferUtils.createFloatBuffer((int)3);
            GLU.gluProject((float)f6, (float)f7, (float)f8, (FloatBuffer)this.lllIIIllIIIIlllIlIIllIIll, (FloatBuffer)this.lllIlIIlIIIlIlIIIllIlllIl, (IntBuffer)intBuffer, (FloatBuffer)floatBuffer);
            float f9 = floatBuffer.get(0) / (float)class_22012.lllIIIllIIIIlllIlIIllIIll().IlIIIIIllllllIIlllIllllll();
            float f10 = floatBuffer.get(1) / (float)class_22012.lllIIIllIIIIlllIlIIllIIll().IlIIIIIllllllIIlllIllllll();
            GL11.glPushMatrix();
            GL11.glTranslatef((float)f9, (float)((float)class_22012.lllIIIllIIIIlllIlIIllIIll().lllIlIIlIIIlIlIIIllIlllIl() - f10), (float)0.0f);
            float f11 = class_21742.lllIIIlllIlllIIlIllllIIlI();
            String string = class_21742.llllIIIIlIIIlIIIIIIlIllll() + ((double)f11 != 1.0 ? " | " + (Object)((Object)this.IlIllllllIIlIIllllIIlIIIl(f11)) + f11 : "");
            if (class_06932 != null) {
                class_0678 class_06782 = class_01412.lllIIIllIIIIlllIlIIllIIll(class_21742.llllIIIIlIIIlIIIIIIlIllll(), class_06932);
                string = string + (Object)((Object) EnumChatFormatting.WHITE) + " | " + (Object)((Object)this.IlIllllllIIlIIllllIIlIIIl(class_06782.lllIlIIlIIIlIlIIIllIlllIl())) + class_06782.lllIlIIlIIIlIlIIIllIlllIl();
            }
            float f12 = class_06672.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(EnumChatFormatting.getTextWithoutFormattingCodes(string));
            class_06672.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string, (float)((int)(-f12) / 2), (float)(-class_06672.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll), -1);
            if (bl && IlIllllllIIlIIllllIIlIIIl.containsKey(class_21742.lIIlIlllIIlIIIIlIlIIIIlll().getId().toString())) {
                object = (List)IlIllllllIIlIIllllIIlIIIl.get(class_21742.lIIlIlllIIlIIIIlIlIIIIlll().getId().toString());
                int n = 1;
                Iterator iterator = object.iterator();
                while (iterator.hasNext()) {
                    String string2 = (String)iterator.next();
                    class_06672.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string2, (int)(-f12) / 2, -class_06672.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll * ++n, -1);
                }
            }
            GL11.glPopMatrix();
        }
    }

    private EnumChatFormatting IlIllllllIIlIIllllIIlIIIl(float f) {
        EnumChatFormatting class_12272 = f > 15.0f ? EnumChatFormatting.DARK_GREEN : (f > 10.0f ? EnumChatFormatting.YELLOW : (f > 5.0f ? EnumChatFormatting.RED : EnumChatFormatting.DARK_RED));
        return class_12272;
    }

    public static Map llIIlIllIllllIlIIIIlIIlll() {
        return IlIllllllIIlIIllllIIlIIIl;
    }

    public static void lllIIIllIIIIlllIlIIllIIll(Map map) {
        IlIllllllIIlIIllllIIlIIIl = map;
    }
}

