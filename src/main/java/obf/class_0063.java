package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.eventbus.Subscribe
 *  org.lwjgl.opengl.GL11
 */
import com.google.common.eventbus.Subscribe;
import java.util.ArrayList;
import java.util.List;

import com.moonsworth.lunar.client.config.Setting;
import com.moonsworth.lunar.client.LunarClient;
import org.lwjgl.opengl.GL11;

public class class_0063
extends AbstractModule {
    private static List lllIlIIlIIIlIlIIIllIlllIl = new ArrayList();
    public Setting lllIIIllIIIIlllIlIIllIIll;
    private Setting IlIllllllIIlIIllllIIlIIIl;
    private Setting lIlllIlllIIIIlIIlllIllIII;
    private List IlIIIIIllllllIIlllIllllll = new ArrayList();

    public class_0063() {
        super("Cooldowns");
        this.lllIlIIlIIIlIlIIIllIlllIl(class_0767.lIlllIlllIIIIlIIlllIllIII);
        this.lllIlIIlIIIlIlIIIllIlllIl(0.0f, 5.0f);
        this.lllIIIllIIIIlllIlIIllIIll = new Setting(this, "Color Theme").setValue("Bright").setAcceptedValues("Bright", "Dark", "Colored");
        this.IlIllllllIIlIIllllIIlIIIl = new Setting(this, "List Mode").setValue("horizontal").setAcceptedValues(new String[]{"vertical", "horizontal"});
        this.lIlllIlllIIIIlIIlllIllIII = new Setting(this, "Colored color").setValue(-1).setMinMax((Object)Integer.MIN_VALUE, (Object)Integer.MAX_VALUE);
        this.lllIIIllIIIIlllIlIIllIIll(class_0312.class, this::lllIIIllIIIIlllIlIIllIIll);
        this.lllIIIllIIIIlllIlIIllIIll(class_1217.class, this::lllIIIllIIIIlllIlIIllIIll);
        this.lllIIIllIIIIlllIlIIllIIll(class_2201.class, this::lllIIIllIIIIlllIlIIllIIll);
        this.lllIlIIlIIIlIlIIIllIlllIl(true);
    }

    void lllIIIllIIIIlllIlIIllIIll(class_0312 class_03122) {
        if (!lllIlIIlIIIlIlIIIllIlllIl.isEmpty()) {
            lllIlIIlIIIlIlIIIllIlllIl.removeIf(class_0332::lllIIIllIIIIlllIlIIllIIll);
        }
        if (!this.IlIIIIIllllllIIlllIllllll.isEmpty()) {
            this.IlIIIIIllllllIIlllIllllll.removeIf(class_0332::lllIIIllIIIIlllIlIIllIIll);
        }
    }

    @Subscribe
    public void lllIIIllIIIIlllIlIIllIIll(class_1217 class_12172) {
        if (!this.lllIIlIIIllllllIIIIlIlIlI()) {
            return;
        }
        if (lllIlIIlIIIlIlIIIllIlllIl.isEmpty()) {
            GL11.glPushMatrix();
            if (this.IlIIIIIllllllIIlllIllllll.isEmpty()) {
                this.IlIIIIIllllllIIlllIllllll.add(new class_0332("CombatTag", 283, 30000L));
                this.IlIIIIIllllllIIlllIllllll.add(new class_0332("EnderPearl", 368, 12000L));
            }
            this.lllIIIllIIIIlllIlIIllIIll(class_12172.lllIIIllIIIIlllIlIIllIIll());
            float f = 1.0f / LunarClient.IllIIIllIIIIlIlIlIllIIlll();
            GL11.glScalef((float)f, (float)f, (float)f);
            boolean bl = ((String)this.IlIllllllIIlIIllllIIlIIIl.getValue()).equalsIgnoreCase("vertical");
            int n = 36;
            int n2 = 36;
            int n3 = bl ? n : this.IlIIIIIllllllIIlllIllllll.size() * n;
            int n4 = bl ? this.IlIIIIIllllllIIlllIllllll.size() * n2 : n2;
            this.IlIllllllIIlIIllllIIlIIIl((int)((float)n3 * f), (int)((float)n4 * f));
            for (int i = 0; i < this.IlIIIIIllllllIIlllIllllll.size(); ++i) {
                class_0332 class_03322 = (class_0332)this.IlIIIIIllllllIIlllIllllll.get(i);
                if (((String)this.IlIllllllIIlIIllllIIlIIIl.getValue()).equalsIgnoreCase("vertical")) {
                    class_03322.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.llIllllIlIllIIIlIllIIlIlI / 2.0f - (float)(n / 2), i * n2, this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll());
                    continue;
                }
                class_03322.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, i * n, 0.0f, this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll());
            }
            GL11.glPopMatrix();
        }
    }

    @Subscribe
    public void lllIIIllIIIIlllIlIIllIIll(class_2201 class_22012) {
        if (!this.lllIIlIIIllllllIIIIlIlIlI()) {
            return;
        }
        GL11.glPushMatrix();
        if (lllIlIIlIIIlIlIIIllIlllIl.size() > 0) {
            this.lllIIIllIIIIlllIlIIllIIll(class_22012.lllIIIllIIIIlllIlIIllIIll());
            float f = 1.0f / LunarClient.IllIIIllIIIIlIlIlIllIIlll();
            GL11.glScalef((float)f, (float)f, (float)f);
            boolean bl = ((String)this.IlIllllllIIlIIllllIIlIIIl.getValue()).equalsIgnoreCase("vertical");
            int n = 36;
            int n2 = 36;
            int n3 = bl ? n : lllIlIIlIIIlIlIIIllIlllIl.size() * n;
            int n4 = bl ? lllIlIIlIIIlIlIIIllIlllIl.size() * n2 : n2;
            this.IlIllllllIIlIIllllIIlIIIl((int)((float)n3 * f), (int)((float)n4 * f));
            for (int i = 0; i < lllIlIIlIIIlIlIIIllIlllIl.size(); ++i) {
                class_0332 class_03322 = (class_0332)lllIlIIlIIIlIlIIIllIlllIl.get(i);
                if (((String)this.IlIllllllIIlIIllllIIlIIIl.getValue()).equalsIgnoreCase("vertical")) {
                    class_03322.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.llIllllIlIllIIIlIllIIlIlI / 2.0f - (float)(n / 2), i * n2, this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll());
                    continue;
                }
                class_03322.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, i * n, 0.0f, this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll());
            }
        } else if (!(this.lIIlIIIIIlIlllIlIIlIlIlll.lllllIlllIIllIlIIlIIIllII instanceof class_0822) && !(this.lIIlIIIIIlIlllIlIIlIlIlll.lllllIlllIIllIlIIlIIIllII instanceof class_1998)) {
            this.IlIllllllIIlIIllllIIlIIIl(50.0f, 24.0f);
            this.lllIIIllIIIIlllIlIIllIIll(class_22012.lllIIIllIIIIlllIlIIllIIll());
        }
        GL11.glPopMatrix();
    }

    public static void lllIIIllIIIIlllIlIIllIIll(String string, long l, int n) {
        for (class_0332 class_03322 : lllIlIIlIIIlIlIIIllIlllIl) {
            if (!class_03322.IlIllllllIIlIIllllIIlIIIl().equalsIgnoreCase(string) || class_03322.IlIIIIIllllllIIlllIllllll() != n) continue;
            class_03322.lllIlIIlIIIlIlIIIllIlllIl();
            class_03322.lllIIIllIIIIlllIlIIllIIll(l);
            return;
        }
        lllIlIIlIIIlIlIIIllIlllIl.add(new class_0332(string, n, l));
    }
}

