package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  org.lwjgl.opengl.GL11
 */
import com.google.common.collect.ImmutableList;
import java.util.List;

import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class class_1019
extends class_1546 {
    private ResourceLocation lllIlIIlIIIlIlIIIllIlllIl = new ResourceLocation("client/icons/left.png");
    private ResourceLocation lIllllIIlIIIlIllllllIIIll = new ResourceLocation("client/icons/right.png");
    private final class_0944 IIIllIIlIIIIIIlIlIIllIIlI;
    private int IllIIlllllllIIlIIlIIIIlIl = 0;
    private final class_1326 IIIllIllIIlIlIlIlIllllIIl;
    private final List IllIIIllIIIIlIlIlIllIIlll = ImmutableList.of((Object)new class_1104(), (Object)new class_1104(), (Object)new class_1104(), (Object)new class_1104(), (Object)new class_1104(), (Object)new class_1104(), (Object)new class_1104(), (Object)new class_1104(), (Object)new class_1104(), (Object)new class_1104(), (Object)new class_1104(), (Object)new class_1104(), (Object[])new class_1104[]{new class_1104(), new class_1104()});

    public class_1019() {
        this.IIIllIIlIIIIIIlIlIIllIIlI = new class_0944("BACK");
        this.IIIllIllIIlIlIlIlIllllIIl = new class_1326(null);
    }

    @Override
    public void n_() {
        super.n_();
        float f = Math.min(240.0f, this.lIllllIIlIIIlIllllllIIIll() - 10.0f);
        float f2 = this.lIllllIIlIIIlIllllllIIIll() / 2.0f - f / 2.0f;
        float f3 = this.lIllllIIlIIIlIllllllIIIll() / 2.0f + f / 2.0f;
        float f4 = 40.0f;
        float f5 = this.IIIllIIlIIIIIIlIlIIllIIlI() - 40.0f;
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(f3 - 8.0f, f4 + 18.0f, 4.0f, f5 - f4 - 28.0f);
        int n = 0;
        float f6 = 22.0f;
        for (class_1104 class_11042 : this.IllIIIllIIIIlIlIlIllIIlll) {
            class_11042.lllIIIllIIIIlllIlIIllIIll(f2 + 8.0f, f4 + 20.0f + (float)n * (f6 + 1.0f), f - 16.0f, f6);
            ++n;
        }
        this.IIIllIllIIlIlIlIlIllllIIl.IlIIIIIllllllIIlllIllllll((float)this.IllIIIllIIIIlIlIlIllIIlll.size() * (f6 + 1.0f) + 2.0f);
    }

    @Override
    public void a_() {
        super.a_();
        this.IIIllIllIIlIlIlIlIllllIIl.IlIllllllIIlIIllllIIlIIIl();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2) {
        super.lllIIIllIIIIlllIlIIllIIll(f, f2);
        float f3 = Math.min(240.0f, this.lIllllIIlIIIlIllllllIIIll() - 10.0f);
        float f4 = this.lIllllIIlIIIlIllllllIIIll() / 2.0f - f3 / 2.0f;
        float f5 = this.lIllllIIlIIIlIllllllIIIll() / 2.0f + f3 / 2.0f;
        float f6 = 40.0f;
        float f7 = this.IIIllIIlIIIIIIlIlIIllIIlI() - 40.0f;
        class_0210.lllIIIllIIIIlllIlIIllIIll(f4, f6, f5, f7, 0x2F000000);
        class_0210.lllIIIllIIIIlllIlIIllIIll(f4 + 8.0f, f6 + 16.0f, f5 - 8.0f, f6 + 16.5f, 0x1AFFFFFF);
        LunarClient.getInstance().robotoLight16px.lllIIIllIIIIlllIlIIllIIll("CHANGELOG", f4 + 8.0f, f6 + 5.0f, -1);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll() / 2.0f - 30.0f, this.IIIllIIlIIIIIIlIlIIllIIlI() - 35.0f, 60.0f, 12.0f);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIlIIlIIIlIlIIIllIlllIl(f, f2, true);
        this.IIIllIllIIlIlIlIlIllllIIl.IlIllllllIIlIIllllIIlIIIl(f, f2, true);
        GL11.glPushMatrix();
        GL11.glEnable((int)3089);
        class_0713 class_07132 = class_0713.IlIlllIIIIIIlIIllIIllIlll();
        class_0857.lllIIIllIIIIlllIlIIllIIll((int)f4, (int)f6 + 18, (int)f5, (int)f7 - 8, (float)((int)((float)class_07132.llIIlllIllIllllIIIlIIIIII().IlIIIIIllllllIIlllIllllll() * class_07132.IlIIIIIllllllIIlllIllllll())), (int)class_07132.IIIllIIlIIIIIIlIlIIllIIlI());
        for (class_1104 class_11042 : this.IllIIIllIIIIlIlIlIllIIlll) {
            class_11042.lllIlIIlIIIlIlIIIllIlllIl(f, f2 - this.IIIllIllIIlIlIlIlIllllIIl.IllIIlllllllIIlIIlIIIIlIl(), !this.IIIllIllIIlIlIlIlIllllIIl.llIIlllIllIllllIIIlIIIIII());
        }
        GL11.glDisable((int)3089);
        GL11.glPopMatrix();
        this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl(f, f2, true);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, int n) {
        super.lllIIIllIIIIlllIlIIllIIll(f, f2, n);
        if (this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(f, f2)) {
            Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_0909());
        } else if (this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(f, f2)) {
            this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(f, f2, n, true);
        } else {
            float f3 = Math.min(240.0f, this.lIllllIIlIIIlIllllllIIIll() - 10.0f);
            float f4 = this.lIllllIIlIIIlIllllllIIIll() / 2.0f - f3 / 2.0f;
            float f5 = this.lIllllIIlIIIlIllllllIIIll() / 2.0f + f3 / 2.0f;
            float f6 = 40.0f;
            float f7 = this.IIIllIIlIIIIIIlIlIIllIIlI() - 40.0f;
            if (f > f4 && f < f5 && f2 > f6 && f2 < f7) {
                for (class_1104 class_11042 : this.IllIIIllIIIIlIlIlIllIIlll) {
                    class_11042.lllIIIllIIIIlllIlIIllIIll(f, f2 - this.IIIllIllIIlIlIlIlIllllIIl.IllIIlllllllIIlIIlIIIIlIl(), n, class_11042.lllIIIllIIIIlllIlIIllIIll(f, f2 - this.IIIllIllIIlIlIlIlIllllIIl.IllIIlllllllIIlIIlIIIIlIl()) && !this.IIIllIllIIlIlIlIlIllllIIl.llIIlllIllIllllIIIlIIIIII());
                }
            }
        }
    }
}

