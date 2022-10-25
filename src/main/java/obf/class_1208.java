package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.ResourceLocation;
import com.moonsworth.lunar.client.config.SettingsManager;
import com.moonsworth.lunar.client.LunarClient;
import org.lwjgl.opengl.GL11;

public class class_1208
extends class_2117 {
    public class_1208(float f) {
        super(f);
        this.IIIllIIlIIIIIIlIlIIllIIlI = 50;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        class_0210.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII + (this.lIllllIIlIIIlIllllllIIIll / 2 - 15) - 41, this.IlIIIIIllllllIIlllIllllll + 4, this.lIlllIlllIIIIlIIlllIllIII + (this.lIllllIIlIIIlIllllllIIIll / 2 - 15) + 41, this.IlIIIIIllllllIIlllIllllll + 51, -16777216);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        class_0857.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("client/defaults/crosshair.png"), (float)(this.lIlllIlllIIIIlIIlllIllIII + (this.lIllllIIlIIIlIllllllIIIll / 2 - 15) - 40), (float)(this.IlIIIIIllllllIIlllIllllll + 5), 80.0f, 45.0f);
        SettingsManager class_06252 = LunarClient.getInstance().getSettingsManager();
        GL11.glPushMatrix();
        float f2 = 1.0f / LunarClient.IllIIIllIIIIlIlIlIllIIlll();
        GL11.glScalef((float)f2, (float)f2, (float)f2);
        float f3 = ((Float)class_06252.csSize.getValue()).floatValue();
        float f4 = ((Float)class_06252.csGap.getValue()).floatValue();
        float f5 = ((Float)class_06252.csThickness.getValue()).floatValue();
        int n3 = class_06252.csColor.lllIIIllIIIIlllIlIIllIIll();
        boolean bl = (Boolean)class_06252.csOutline.getValue();
        int n4 = this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll / 2 - 15;
        int n5 = this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI / 2 + 3;
        if (bl) {
            class_0210.lllIlIIlIIIlIlIIIllIlllIl((float)n4 - f4 - f3, (float)n5 - f5 / 2.0f, (float)n4 - f4, (float)n5 + f5 / 2.0f, 0.5f, -1358954496, n3);
            class_0210.lllIlIIlIIIlIlIIIllIlllIl((float)n4 + f4, (float)n5 - f5 / 2.0f, (float)n4 + f4 + f3, (float)n5 + f5 / 2.0f, 0.5f, -1358954496, n3);
            class_0210.lllIlIIlIIIlIlIIIllIlllIl((float)n4 - f5 / 2.0f, (float)n5 - f4 - f3, (float)n4 + f5 / 2.0f, (float)n5 - f4, 0.5f, -1358954496, n3);
            class_0210.lllIlIIlIIIlIlIIIllIlllIl((float)n4 - f5 / 2.0f, (float)n5 + f4, (float)n4 + f5 / 2.0f, (float)n5 + f4 + f3, 0.5f, -1358954496, n3);
        } else {
            class_0210.lllIIIllIIIIlllIlIIllIIll((float)n4 - f4 - f3, (float)n5 - f5 / 2.0f, (float)n4 - f4, (float)n5 + f5 / 2.0f, n3);
            class_0210.lllIIIllIIIIlllIlIIllIIll((float)n4 + f4, (float)n5 - f5 / 2.0f, (float)n4 + f4 + f3, (float)n5 + f5 / 2.0f, n3);
            class_0210.lllIIIllIIIIlllIlIIllIIll((float)n4 - f5 / 2.0f, (float)n5 - f4 - f3, (float)n4 + f5 / 2.0f, (float)n5 - f4, n3);
            class_0210.lllIIIllIIIIlllIlIIllIIll((float)n4 - f5 / 2.0f, (float)n5 + f4, (float)n4 + f5 / 2.0f, (float)n5 + f4 + f3, n3);
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glPopMatrix();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
    }
}

