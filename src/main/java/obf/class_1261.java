package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import com.moonsworth.lunar.client.config.Setting;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class class_1261
extends AbstractModule {
    private Setting lllIIIllIIIIlllIlIIllIIll;
    private Setting lllIlIIlIIIlIlIIIllIlllIl;
    private Setting IlIllllllIIlIIllllIIlIIIl;

    public class_1261() {
        super("FPS");
        this.lllIlIIlIIIlIlIIIllIlllIl(class_0767.IllIIlllllllIIlIIlIIIIlIl);
        this.lllIlIIlIIIlIlIIIllIlllIl(0.0f, 0.0f);
        this.lllIIIllIIIIlllIlIIllIIll(false);
        this.lllIIIllIIIIlllIlIIllIIll = new Setting(this, "Show Background").setValue(true);
        this.lllIlIIlIIIlIlIIIllIlllIl = new Setting(this, "Text Color").setValue(-1).setMinMax((Object)Integer.MIN_VALUE, (Object)Integer.MAX_VALUE);
        this.IlIllllllIIlIIllllIIlIIIl = new Setting(this, "Background Color").setValue(0x6F000000).setMinMax((Object)Integer.MIN_VALUE, (Object)Integer.MAX_VALUE);
        this.lllIIIllIIIIlllIlIIllIIll("[144 FPS]", 1.4f);
        this.lllIIIllIIIIlllIlIIllIIll(class_2201.class, this::lllIIIllIIIIlllIlIIllIIll);
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_2201 class_22012) {
        if (!this.lllIIlIIIllllllIIIIlIlIlI()) {
            return;
        }
        GL11.glPushMatrix();
        this.lllIIIllIIIIlllIlIIllIIll(class_22012.lllIIIllIIIIlllIlIIllIIll());
        if (((Boolean)this.lllIIIllIIIIlllIlIIllIIll.getValue()).booleanValue()) {
            this.IlIllllllIIlIIllllIIlIIIl(56.0f, 18.0f);
            class_0210.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 56.0f, 13.0f, this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll());
            String string = Minecraft.IlIIlllllIIlIlIlllllIllll + " FPS";
            this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIlIIlIIIlIlIIIllIlllIl(string, (int)(this.llIllllIlIllIIIlIllIIlIlI / 2.0f - (float)(this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string) / 2)), 3, this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll());
        } else {
            String string = "[" + Minecraft.IlIIlllllIIlIlIlllllIllll + " FPS]";
            this.IlIllllllIIlIIllllIIlIIIl(this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string, this.llIllllIlIllIIIlIllIIlIlI / 2.0f - (float)(this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string) / 2), 0.0f, this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(), true), 18.0f);
        }
        GL11.glPopMatrix();
    }
}

