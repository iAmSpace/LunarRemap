package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.opengl.GL11;

public class class_1708
extends class_0164 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/entity/spider_eyes.png");
    private static final ResourceLocation lIllllIIlIIIlIllllllIIIll = new ResourceLocation("textures/entity/spider/spider.png");

    public class_1708() {
        super(new class_2238(), 1.0f);
        this.lllIIIllIIIIlllIlIIllIIll(new class_2238());
    }

    protected float lllIlIIlIIIlIlIIIllIlllIl(class_1051 class_10512) {
        return 180.0f;
    }

    protected int lllIIIllIIIIlllIlIIllIIll(class_1051 class_10512, int n, float f) {
        if (n != 0) {
            return -1;
        }
        this.lllIIIllIIIIlllIlIIllIIll(lllIIIllIIIIlllIlIIllIIll);
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3008);
        GL11.glBlendFunc((int)1, (int)1);
        if (class_10512.lIIlIlIIllIIIlIIlIlIIIlII()) {
            GL11.glDepthMask((boolean)false);
        } else {
            GL11.glDepthMask((boolean)true);
        }
        int n2 = 61680;
        int n3 = n2 % 65536;
        int n4 = n2 / 65536;
        OpenGlHelper.lllIIIllIIIIlllIlIIllIIll(OpenGlHelper.IlIllllllIIlIIllllIIlIIIl, (float)n3 / 1.0f, (float)n4 / 1.0f);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        return 1;
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1051 class_10512) {
        return lIllllIIlIIIlIllllllIIIll;
    }

    @Override
    protected float lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652) {
        return this.lllIlIIlIIIlIlIIIllIlllIl((class_1051)class_19652);
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652, int n, float f) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_1051)class_19652, n, f);
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_1051)class_15212);
    }
}

