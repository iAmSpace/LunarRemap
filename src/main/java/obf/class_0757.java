package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.ArrayList;
import java.util.List;

import com.moonsworth.lunar.client.config.Setting;
import org.lwjgl.opengl.GL11;

public class class_0757
extends AbstractModule {
    private final List lllIIIllIIIIlllIlIIllIIll;
    private final Setting lllIlIIlIIIlIlIIIllIlllIl;
    private Setting IlIllllllIIlIIllllIIlIIIl;
    private Setting lIlllIlllIIIIlIIlllIllIII;

    public class_0757() {
        super("CPS");
        this.lllIlIIlIIIlIlIIIllIlllIl(class_0767.IllIIlllllllIIlIIlIIIIlIl);
        this.lllIlIIlIIIlIlIIIllIlllIl(0.0f, 0.0f);
        this.lllIIIllIIIIlllIlIIllIIll(false);
        this.lllIIIllIIIIlllIlIIllIIll = new ArrayList();
        this.lllIlIIlIIIlIlIIIllIlllIl = new Setting(this, "Show Background").setValue(true);
        this.IlIllllllIIlIIllllIIlIIIl = new Setting(this, "Text Color").setValue(-1).setMinMax((Object)Integer.MIN_VALUE, (Object)Integer.MAX_VALUE);
        this.lIlllIlllIIIIlIIlllIllIII = new Setting(this, "Background Color").setValue(0x6F000000).setMinMax((Object)Integer.MIN_VALUE, (Object)Integer.MAX_VALUE);
        this.lllIIIllIIIIlllIlIIllIIll("[9 CPS]", 1.4f);
        this.lllIIIllIIIIlllIlIIllIIll(class_2201.class, this::lllIIIllIIIIlllIlIIllIIll);
        this.lllIIIllIIIIlllIlIIllIIll(class_0312.class, this::lllIIIllIIIIlllIlIIllIIll);
        this.lllIIIllIIIIlllIlIIllIIll(class_0773.class, this::lllIIIllIIIIlllIlIIllIIll);
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_2201 class_22012) {
        if (!this.lllIIlIIIllllllIIIIlIlIlI()) {
            return;
        }
        GL11.glPushMatrix();
        this.lllIIIllIIIIlllIlIIllIIll(class_22012.lllIIIllIIIIlllIlIIllIIll());
        if (((Boolean)this.lllIlIIlIIIlIlIIIllIlllIl.getValue()).booleanValue()) {
            this.IlIllllllIIlIIllllIIlIIIl(56.0f, 18.0f);
            class_0210.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 56.0f, 13.0f, this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll());
            String string = this.lllIIIllIIIIlllIlIIllIIll.size() + " CPS";
            this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIlIIlIIIlIlIIIllIlllIl(string, (int)(this.llIllllIlIllIIIlIllIIlIlI / 2.0f - (float)(this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string) / 2)), 3, this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll());
        } else {
            String string = "[" + this.lllIIIllIIIIlllIlIIllIIll.size() + " CPS]";
            this.IlIllllllIIlIIllllIIlIIIl(this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string, this.llIllllIlIllIIIlIllIIlIlI / 2.0f - (float)(this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string) / 2) - 1.0f, 0.0f, this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(), true), 18.0f);
        }
        GL11.glPopMatrix();
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_0312 class_03122) {
        this.lllIIIllIIIIlllIlIIllIIll.removeIf(l -> l < System.currentTimeMillis() - 1000L);
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_0773 class_07732) {
        if (class_07732.lllIIIllIIIIlllIlIIllIIll() == 0) {
            this.lllIIIllIIIIlllIlIIllIIll.add(System.currentTimeMillis());
        }
    }
}

