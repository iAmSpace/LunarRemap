package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class class_1753
extends class_0229 {
    private final class_1092 lllIIIllIIIIlllIlIIllIIll;
    private class_0229 lllIlIIlIIIlIlIIIllIlllIl;
    private long IlIllllllIIlIIllllIIlIIIl;

    public class_1753(class_0229 class_02292, class_1092 class_10922) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_02292;
        this.lllIIIllIIIIlllIlIIllIIll = class_10922;
        this.IlIllllllIIlIIllllIIlIIIl = System.currentTimeMillis();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        this.llIIlIllIllllIlIIIIlIIlll();
        float f2 = 0.52f;
        int n3 = this.IlIllllllIIlIIllllIIlIIIl == 0L ? 10 : (int)((10999L - (System.currentTimeMillis() - this.IlIllllllIIlIIllllIIlIIIl)) / 1000L);
        String string = "Get me out of here!";
        String string2 = "I understand the risk, continue anyways " + (n3 > 0 ? "(" + n3 + ")" : "");
        float f3 = this.lllllIlllIIllIlIIlIIIllII.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string);
        boolean bl = n > this.IlIlIIlllIIlIllIIIlllllIl / 2 + 20 && n < this.IlIlIIlllIIlIllIIIlllllIl / 2 + 140 && n2 > this.lIIlIIIIIlIlllIlIIlIlIlll / 2 + 40 && n2 < this.lIIlIIIIIlIlllIlIIlIlIlll / 2 + 50;
        boolean bl2 = n > this.IlIlIIlllIIlIllIIIlllllIl / 2 - 130 && (float)n < (float)(this.IlIlIIlllIIlIllIIIlllllIl / 2 - 130) + f3 / f2 && n2 > this.lIIlIIIIIlIlllIlIIlIlIlll / 2 + 30 && n2 < this.lIIlIIIIIlIlllIlIIlIlIlll / 2 + 42;
        class_0857.lllIIIllIIIIlllIlIIllIIll((double)(this.IlIlIIlllIIlIllIIIlllllIl / 2 - 140), (double)(this.lIIlIIIIIlIlllIlIIlIlIlll / 2 - 100), (double)(this.IlIlIIlllIIlIllIIIlllllIl / 2 + 140), (double)(this.lIIlIIIIIlIlllIlIIlIlIlll / 2 + 50), 8.0, 0x4FFF0000);
        GL11.glPushMatrix();
        GL11.glScalef((float)f2, (float)f2, (float)f2);
        this.lllllIlllIIllIlIIlIIIllII.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string2, (float)((int)((float)(this.IlIlIIlllIIlIllIIIlllllIl / 2 + 20) / f2)), (float)((int)((float)(this.lIIlIIIIIlIlllIlIIlIlIlll / 2 + 40) / f2)), bl ? -1 : (n3 <= 0 ? -1907998 : -5066062));
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        f2 = 1.0f;
        GL11.glScalef((float)f2, (float)f2, (float)f2);
        this.lllllIlllIIllIlIIlIIIllII.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(" ", (float)((int)((float)(this.IlIlIIlllIIlIllIIIlllllIl / 2 - 130) / f2)), (float)((int)((float)(this.lIIlIIIIIlIlllIlIIlIlIlll / 2 - 70) / f2)), -1);
        this.lllllIlllIIllIlIIlIIIllII.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(" ", (float)((int)((float)(this.IlIlIIlllIIlIllIIIlllllIl / 2 - 130) / f2)), (float)((int)((float)(this.lIIlIIIIIlIlllIlIIlIlIlll / 2 - 50) / f2)), -1);
        this.lllllIlllIIllIlIIlIIIllII.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(" ", (float)((int)((float)(this.IlIlIIlllIIlIllIIIlllllIl / 2 - 130) / f2)), (float)((int)((float)(this.lIIlIIIIIlIlllIlIIlIlIlll / 2 - 40) / f2)), -1);
        this.lllllIlllIIllIlIIlIIIllII.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(" ", (float)((int)((float)(this.IlIlIIlllIIlIllIIIlllllIl / 2 - 130) / f2)), (float)((int)((float)(this.lIIlIIIIIlIlllIlIIlIlIlll / 2 - 30) / f2)), -1);
        this.lllllIlllIIllIlIIlIIIllII.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(" ", (float)((int)((float)(this.IlIlIIlllIIlIllIIIlllllIl / 2 - 130) / f2)), (float)((int)((float)(this.lIIlIIIIIlIlllIlIIlIlIlll / 2 - 20) / f2)), -1);
        this.lllllIlllIIllIlIIlIIIllII.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(" ", (float)((int)((float)(this.IlIlIIlllIIlIllIIIlllllIl / 2 - 130) / f2)), (float)((int)((float)(this.lIIlIIIIIlIlllIlIIlIlIlll / 2 - 10) / f2)), -1);
        this.lllllIlllIIllIlIIlIIIllII.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(" ", (float)((int)((float)(this.IlIlIIlllIIlIllIIIlllllIl / 2 - 130) / f2)), (float)((int)((float)(this.lIIlIIIIIlIlllIlIIlIlIlll / 2) / f2)), -1);
        GL11.glPopMatrix();
        this.lllllIlllIIllIlIIlIIIllII.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll("WARNING!", this.IlIlIIlllIIlIllIIIlllllIl / 2, this.lIIlIIIIIlIlllIlIIlIlIlll / 2 - 90, -1);
        this.lllllIlllIIllIlIIlIIIllII.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string, (float)(this.IlIlIIlllIIlIllIIIlllllIl / 2 - 130), (float)(this.lIIlIIIIIlIlllIlIIlIlIlll / 2 + 30), bl2 ? -1 : -1907998);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        boolean bl;
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
        float f = 0.5f;
        String string = "Get me out of here!";
        float f2 = this.lllllIlllIIllIlIIlIIIllII.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string);
        boolean bl2 = n > this.IlIlIIlllIIlIllIIIlllllIl / 2 + 20 && n < this.IlIlIIlllIIlIllIIIlllllIl / 2 + 140 && n2 > this.lIIlIIIIIlIlllIlIIlIlIlll / 2 + 40 && n2 < this.lIIlIIIIIlIlllIlIIlIlIlll / 2 + 50;
        boolean bl3 = bl = n > this.IlIlIIlllIIlIllIIIlllllIl / 2 - 130 && (float)n < (float)(this.IlIlIIlllIIlIllIIIlllllIl / 2 - 130) + f2 / f && n2 > this.lIIlIIIIIlIlllIlIIlIlIlll / 2 + 30 && n2 < this.lIIlIIIIIlIlllIlIIlIlIlll / 2 + 42;
        if (bl) {
            Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl);
        }
        if (bl2) {
            int n4;
            Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            int n5 = n4 = this.IlIllllllIIlIIllllIIlIIIl == 0L ? 10 : (int)((10999L - (System.currentTimeMillis() - this.IlIllllllIIlIIllllIIlIIIl)) / 1000L);
            if (n4 <= 0) {
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_0019(this.lllIlIIlIIIlIlIIIllIlllIl, this.lllllIlllIIllIlIIlIIIllII, this.lllIIIllIIIIlllIlIIllIIll));
            }
        }
    }
}

