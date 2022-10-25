package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.minecraft.util.ResourceLocation;
import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class class_1319
extends class_1194 {
    private final int lllIIlIIIllllllIIIIlIlIlI;
    public final List lllIIIllIIIIlllIlIIllIIll;
    private final ResourceLocation IlIlllIIIIIIlIIllIIllIlll = new ResourceLocation("client/icons/plus-64.png");

    public class_1319(float f, int n, int n2, int n3, int n4) {
        super(f, n, n2, n3, n4);
        this.lllIIlIIIllllllIIIIlIlIlI = -12418828;
        this.lllIIIllIIIIlllIlIIllIIll = new ArrayList();
        this.lllIlIIlIIIlIlIIIllIlllIl();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        Object object;
        int n3;
        class_0857.lllIIIllIIIIlllIlIIllIIll((double)this.lIlllIlllIIIIlIIlllIllIII, (double)this.IlIIIIIllllllIIlllIllllll, (double)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll), (double)(this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI + 2), 8.0, 0x40000000);
        this.lllIlIIlIIIlIlIIIllIlllIl(n, n2);
        this.IllIIIllIIIIlIlIlIllIIlll = 15;
        for (n3 = 0; n3 < this.lllIIIllIIIIlllIlIIllIIll.size(); ++n3) {
            object = (class_0883)this.lllIIIllIIIIlllIlIIllIIll.get(n3);
            ((class_2117)object).lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII + 4, this.IlIIIIIllllllIIlllIllllll + 4 + n3 * 18, this.lIllllIIlIIIlIllllllIIIll - 12, 18);
            ((class_0883)object).IlIllllllIIlIIllllIIlIIIl = this.IIIllIllIIlIlIlIlIllllIIl;
            ((class_0883)object).lllIIIllIIIIlllIlIIllIIll(n, n2, f);
            this.IllIIIllIIIIlIlIlIllIIlll += ((class_2117)object).lllIIIllIIIIlllIlIIllIIll();
        }
        n3 = (float)n > (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 92) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n < (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 6) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 > (float)(this.IlIIIIIllllllIIlllIllllll + this.IllIIIllIIIIlIlIlIllIIlll - 10 + this.IIIllIllIIlIlIlIlIllllIIl) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 < (float)(this.IlIIIIIllllllIIlllIllllll + this.IllIIIllIIIIlIlIlIllIIlll + 3 + this.IIIllIllIIlIlIlIlIllllIIl) * this.lllIlIIlIIIlIlIIIllIlllIl ? 1 : 0;
        GL11.glColor4f((float)(n3 != 0 ? 0.8f : 0.5f), (float)(n3 != 0 ? 0.8f : 0.5f), (float)(n3 != 0 ? 0.8f : 0.5f), (float)0.5f);
        class_0857.lllIIIllIIIIlllIlIIllIIll(this.IlIlllIIIIIIlIIllIIllIlll, 3.5f, (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 15), (float)(this.IlIIIIIllllllIIlllIllllll + this.IllIIIllIIIIlIlIlIllIIlll) - 6.5f);
        object = (n3 != 0 ? "(COPIES CURRENT PROFILE) " : "") + "ADD NEW PROFILE";
        LunarClient.getInstance().ubuntuMedium16px.lllIIIllIIIIlllIlIIllIIll((String)object, this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 17 - LunarClient.getInstance().ubuntuMedium16px.lllIlIIlIIIlIlIIIllIlllIl((String)object), (float)(this.IlIIIIIllllllIIlllIllllll + this.IllIIIllIIIIlIlIlIllIIlll) - 7.5f, n3 != 0 ? -419430401 : -2130706433);
        this.IllIIIllIIIIlIlIlIllIIlll += 10;
        this.IlIllllllIIlIIllllIIlIIIl(n, n2);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        boolean bl;
        for (class_0883 class_08832 : this.lllIIIllIIIIlllIlIIllIIll) {
            if (!class_08832.lllIIIllIIIIlllIlIIllIIll(n, n2)) continue;
            class_08832.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
            return;
        }
        boolean bl2 = bl = (float)n > (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 92) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n < (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 6) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 > (float)(this.IlIIIIIllllllIIlllIllllll + this.IllIIIllIIIIlIlIlIllIIlll - 20 + this.IIIllIllIIlIlIlIlIllllIIl) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 < (float)(this.IlIIIIIllllllIIlllIllllll + this.IllIIIllIIIIlIlIlIllIIlll - 7 + this.IIIllIllIIlIlIlIlIllllIIl) * this.lllIlIIlIIIlIlIIIllIlllIl;
        if (bl) {
            Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            Minecraft.getMinecraft().lllIIIllIIIIlllIlIIllIIll(new class_1151(class_0822.lllIIIllIIIIlllIlIIllIIll, this, this.lllIIlIIIllllllIIIIlIlIlI, this.lllIlIIlIIIlIlIIIllIlllIl));
        }
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(AbstractModule class_16652) {
        return true;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(AbstractModule class_16652) {
    }

    public void lllIlIIlIIIlIlIIIllIlllIl() {
        new Thread(() -> {
            this.lllIIIllIIIIlllIlIIllIIll.clear();
            File file = new File(class_0576.lllIIIllIIIIlllIlIIllIIll + File.separator + "profiles");
            if (file.exists()) {
                for (File file2 : file.listFiles()) {
                    if (!file2.getName().endsWith(".cfg")) continue;
                    Profile class_11652 = null;
                    for (Profile class_11653 : LunarClient.getInstance().profiles) {
                        if (!file2.getName().equals(class_11653.getName() + ".cfg")) continue;
                        class_11652 = class_11653;
                    }
                    if (class_11652 != null) continue;
                    LunarClient.getInstance().profiles.add(new Profile(file2.getName().replace(".cfg", ""), false));
                }
            }
            for (Profile class_11654 : LunarClient.getInstance().profiles) {
                this.lllIIIllIIIIlllIlIIllIIll.add(new class_0883(this, this.lllIIlIIIllllllIIIIlIlIlI, class_11654, this.lllIlIIlIIIlIlIIIllIlllIl));
            }
            this.lllIIIllIIIIlllIlIIllIIll.sort((class_08832, class_08833) -> {
                if (class_08832.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll().toLowerCase().equalsIgnoreCase("default")) {
                    return 0;
                }
                if (class_08832.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll < class_08833.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll) {
                    return -1;
                }
                return 1;
            });
        }).start();
    }
}

