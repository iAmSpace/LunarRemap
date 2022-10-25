package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.Collection;

import com.moonsworth.lunar.client.LunarClient;
import org.lwjgl.opengl.GL11;

public abstract class class_1338
extends class_1522 {
    private boolean lllIIIllIIIIlllIlIIllIIll;

    public class_1338(class_1071 class_10712) {
        super(class_10712);
    }

    @Override
    public void n_() {
        boolean bl;
        super.n_();
        boolean bl2 = LunarClient.getInstance().getModuleManager().lIllllIIlIIIlIllllllIIIll.lIllllIIlIIIlIllllllIIIll() && (Boolean) LunarClient.getInstance().getModuleManager().lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII() != false;
        boolean bl3 = bl = !LunarClient.getInstance().getModuleManager().lIllllIIlIIIlIllllllIIIll.lIllllIIlIIIlIllllllIIIll() && (Boolean) LunarClient.getInstance().getSettingsManager().llIIIlllIlllIlIllIIIIllIl.lIlllIlllIIIIlIIlllIllIII() != false;
        if (!this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.IIllIIIlIIllllIIIIIIIIlll().isEmpty() && (bl2 || bl)) {
            this.IlIIlllllIIlIlIlllllIllll = 160 + (this.IlIlIIlllIIlIllIIIlllllIl - this.IllIIIllIIIIlIlIlIllIIlll - 200) / 2;
            this.lllIIIllIIIIlllIlIIllIIll = true;
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        boolean bl;
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        boolean bl2 = LunarClient.getInstance().getModuleManager().lIllllIIlIIIlIllllllIIIll.lIllllIIlIIIlIllllllIIIll() && (Boolean) LunarClient.getInstance().getModuleManager().lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII() != false;
        boolean bl3 = bl = !LunarClient.getInstance().getModuleManager().lIllllIIlIIIlIllllllIIIll.lIllllIIlIIIlIllllllIIIll() && (Boolean) LunarClient.getInstance().getSettingsManager().llIIIlllIlllIlIllIIIIllIl.lIlllIlllIIIIlIIlllIllIII() != false;
        if (this.lllIIIllIIIIlllIlIIllIIll && (bl2 || bl)) {
            this.lIllllIIlIIIlIllllllIIIll();
        }
    }

    private void lIllllIIlIIIlIllllllIIIll() {
        int n = this.IlIIlllllIIlIlIlllllIllll - 124;
        int n2 = this.llIIlIlIlllIIllIlIlllIllI;
        boolean bl = true;
        Collection collection = this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.IIllIIIlIIllllIIIIIIIIlll();
        if (!collection.isEmpty()) {
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glDisable((int)2896);
            int n3 = 33;
            if (collection.size() > 5) {
                n3 = 132 / (collection.size() - 1);
            }
            for (class_1852 class_18522 : this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.IIllIIIlIIllllIIIIIIIIlll()) {
                class_0700 class_07002 = class_0700.lllIIIllIIIIlllIlIIllIIll[class_18522.lllIIIllIIIIlllIlIIllIIll()];
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(IIIllIllIIlIlIlIlIllllIIl);
                class_1338.lllIIIllIIIIlllIlIIllIIll(n, n2, 0, 166, 140, 32);
                if (class_07002.lIlllIlllIIIIlIIlllIllIII()) {
                    int n4 = class_07002.IlIIIIIllllllIIlllIllllll();
                    class_1338.lllIIIllIIIIlllIlIIllIIll(n + 6, n2 + 7, 0 + n4 % 8 * 18, 198 + n4 / 8 * 18, 18, 18);
                }
                String string = class_0616.lllIIIllIIIIlllIlIIllIIll(class_07002.IlIllllllIIlIIllllIIlIIIl(), new Object[0]);
                if (class_18522.IlIllllllIIlIIllllIIlIIIl() == 1) {
                    string = string + " " + class_0616.lllIIIllIIIIlllIlIIllIIll("enchantment.level.2", new Object[0]);
                } else if (class_18522.IlIllllllIIlIIllllIIlIIIl() == 2) {
                    string = string + " " + class_0616.lllIIIllIIIIlllIlIIllIIll("enchantment.level.3", new Object[0]);
                } else if (class_18522.IlIllllllIIlIIllllIIlIIIl() == 3) {
                    string = string + " " + class_0616.lllIIIllIIIIlllIlIIllIIll("enchantment.level.4", new Object[0]);
                }
                this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(string, (float)(n + 10 + 18), (float)(n2 + 6), 0xFFFFFF);
                String string2 = class_0700.lllIIIllIIIIlllIlIIllIIll(class_18522);
                this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(string2, (float)(n + 10 + 18), (float)(n2 + 6 + 10), 0x7F7F7F);
                n2 += n3;
            }
        }
    }
}

