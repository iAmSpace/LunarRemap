package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.opengl.GL11;

class class_1481 {
    private final class_0963 lllIlIIlIIIlIlIIIllIlllIl;
    private final class_2202 IlIllllllIIlIIllllIIlIIIl;
    private final ResourceLocation lIlllIlllIIIIlIIlllIllIII;
    private final int[] IlIIIIIllllllIIlllIllllll;
    final /* synthetic */ class_0975 lllIIIllIIIIlllIlIIllIIll;

    private class_1481(class_0975 class_09752, class_0963 class_09632) {
        this.lllIIIllIIIIlllIlIIllIIll = class_09752;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_09632;
        this.IlIllllllIIlIIllllIIlIIIl = new class_2202(128, 128);
        this.IlIIIIIllllllIIlllIllllll = this.IlIllllllIIlIIllllIIlIIIl.lIlllIlllIIIIlIIlllIllIII();
        this.lIlllIlllIIIIlIIlllIllIII = class_0975.lllIIIllIIIIlllIlIIllIIll(class_09752).lllIIIllIIIIlllIlIIllIIll("map/" + class_09632.lllIIIllIIIIlllIlIIllIIll, this.IlIllllllIIlIIllllIIlIIIl);
        for (int i = 0; i < this.IlIIIIIllllllIIlllIllllll.length; ++i) {
            this.IlIIIIIllllllIIlllIllllll[i] = 0;
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll() {
        for (int i = 0; i < 16384; ++i) {
            int n = this.lllIlIIlIIIlIlIIIllIlllIl.lIllllIIlIIIlIllllllIIIll[i] & 0xFF;
            this.IlIIIIIllllllIIlllIllllll[i] = n / 4 == 0 ? (i + i / 128 & 1) * 8 + 16 << 24 : class_1662.lllIIIllIIIIlllIlIIllIIll[n / 4].lllIlIIlIIIlIlIIIllIlllIl(n & 3);
        }
        this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl();
    }

    private void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        int n = 0;
        int n2 = 0;
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        float f = 0.0f;
        class_0975.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII);
        GL11.glEnable((int)3042);
        OpenGlHelper.glBlendFunc(1, 771, 0, 1);
        GL11.glDisable((int)3008);
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.lllIIIllIIIIlllIlIIllIIll((float)(n + 0) + f, (float)(n2 + 128) - f, -0.01f, 0.0, 1.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll((float)(n + 128) - f, (float)(n2 + 128) - f, -0.01f, 1.0, 1.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll((float)(n + 128) - f, (float)(n2 + 0) + f, -0.01f, 1.0, 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll((float)(n + 0) + f, (float)(n2 + 0) + f, -0.01f, 0.0, 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        GL11.glEnable((int)3008);
        GL11.glDisable((int)3042);
        class_0975.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll(class_0975.lllIlIIlIIIlIlIIIllIlllIl());
        int n3 = 0;
        for (class_1739 class_17392 : this.lllIlIIlIIIlIlIIIllIlllIl.IllIIlllllllIIlIIlIIIIlIl.values()) {
            if (bl && class_17392.lllIIIllIIIIlllIlIIllIIll != 1) continue;
            GL11.glPushMatrix();
            GL11.glTranslatef((float)((float)n + (float)class_17392.lllIlIIlIIIlIlIIIllIlllIl / 2.0f + 64.0f), (float)((float)n2 + (float)class_17392.IlIllllllIIlIIllllIIlIIIl / 2.0f + 64.0f), (float)-0.02f);
            GL11.glRotatef((float)((float)(class_17392.lIlllIlllIIIIlIIlllIllIII * 360) / 16.0f), (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)4.0f, (float)4.0f, (float)3.0f);
            GL11.glTranslatef((float)-0.125f, (float)0.125f, (float)0.0f);
            float f2 = (float)(class_17392.lllIIIllIIIIlllIlIIllIIll % 4 + 0) / 4.0f;
            float f3 = (float)(class_17392.lllIIIllIIIIlllIlIIllIIll / 4 + 0) / 4.0f;
            float f4 = (float)(class_17392.lllIIIllIIIIlllIlIIllIIll % 4 + 1) / 4.0f;
            float f5 = (float)(class_17392.lllIIIllIIIIlllIlIIllIIll / 4 + 1) / 4.0f;
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.lllIIIllIIIIlllIlIIllIIll(-1.0, 1.0, (float)n3 * 0.001f, f2, f3);
            class_08682.lllIIIllIIIIlllIlIIllIIll(1.0, 1.0, (float)n3 * 0.001f, f4, f3);
            class_08682.lllIIIllIIIIlllIlIIllIIll(1.0, -1.0, (float)n3 * 0.001f, f4, f5);
            class_08682.lllIIIllIIIIlllIlIIllIIll(-1.0, -1.0, (float)n3 * 0.001f, f2, f5);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            GL11.glPopMatrix();
            ++n3;
        }
        GL11.glPushMatrix();
        GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-0.04f);
        GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glPopMatrix();
    }

    class_1481(class_0975 class_09752, class_0963 class_09632, Object object) {
        this(class_09752, class_09632);
    }

    static /* synthetic */ void lllIIIllIIIIlllIlIIllIIll(class_1481 class_14812) {
        class_14812.lllIIIllIIIIlllIlIIllIIll();
    }

    static /* synthetic */ void lllIIIllIIIIlllIlIIllIIll(class_1481 class_14812, boolean bl) {
        class_14812.lllIIIllIIIIlllIlIIllIIll(bl);
    }

    static /* synthetic */ ResourceLocation lllIlIIlIIIlIlIIIllIlllIl(class_1481 class_14812) {
        return class_14812.lIlllIlllIIIIlIIlllIllIII;
    }
}

