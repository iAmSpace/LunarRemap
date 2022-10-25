package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import com.moonsworth.lunar.client.config.Setting;
import org.lwjgl.opengl.GL11;

public class class_1046
extends AbstractModule {
    public static Setting lllIIIllIIIIlllIlIIllIIll;
    public static Setting lllIlIIlIIIlIlIIIllIlllIl;
    public static Setting IlIllllllIIlIIllllIIlIIIl;
    private Setting IllIIIIllIIllIllIlllIlIIl;
    public static Setting lIlllIlllIIIIlIIlllIllIII;
    public static Setting IlIIIIIllllllIIlllIllllll;
    public static Setting lIllllIIlIIIlIllllllIIIll;
    private Setting IIIIIIIIlIllIIllIIlllIllI;
    public static Setting IIIllIIlIIIIIIlIlIIllIIlI;
    public Setting IllIIlllllllIIlIIlIIIIlIl;
    public Setting IIIllIllIIlIlIlIlIllllIIl;
    public Setting IllIIIllIIIIlIlIlIllIIlll;
    public Setting lIIIIlIlIIlllllIIllIIlIII;
    public Setting llIIlllIllIllllIIIlIIIIII;
    public Setting llIIllIllIlIIlIIllIllllll;
    public Setting lllIIlIIIllllllIIIIlIlIlI;
    public Setting IlIlllIIIIIIlIIllIIllIlll;
    public Setting IlIlIIlIlIllIIlIlIIllIIIl;
    public Setting lllllIlllIIllIlIIlIIIllII;
    public static boolean IlIlIIlllIIlIllIIIlllllIl;

    public class_1046() {
        super("ToggleSprint");
        this.lllIlIIlIIIlIlIIIllIlllIl(class_0767.lllIIIllIIIIlllIlIIllIIll);
        this.lllIlIIlIIIlIlIIIllIlllIl(0.0f, 10.0f);
        this.lllIlIIlIIIlIlIIIllIlllIl(false);
        this.IlIIlllllIIlIlIlllllIllll = false;
        lllIIIllIIIIlllIlIIllIIll = new Setting(this, "Toggle Sprint").setValue(true);
        lllIlIIlIIIlIlIIIllIlllIl = new Setting(this, "Toggle Sneak").setValue(false);
        IlIllllllIIlIIllllIIlIIIl = new Setting(this, "Show HUD Text").setValue(true);
        this.IllIIIIllIIllIllIlllIlIIl = new Setting(this, "Text Color").setValue(-1).setMinMax((Object)Integer.MIN_VALUE, (Object)Integer.MAX_VALUE);
        lIlllIlllIIIIlIIlllIllIII = new Setting(this, "Double Tap").setValue(false);
        lIllllIIlIIIlIllllllIIIll = new Setting(this, "Show While Typing").setValue(true);
        this.IIIIIIIIlIllIIllIIlllIllI = new Setting(this, "label").setValue("Fly Boost");
        IlIIIIIllllllIIlllIllllll = new Setting(this, "Fly Boost").setValue(true);
        IIIllIIlIIIIIIlIlIIllIIlI = new Setting(this, "Fly Boost Amount").setValue(4).setMinMax((Object)2, (Object)10).lllIIIllIIIIlllIlIIllIIll(IlIIIIIllllllIIlllIllllll);
        this.IllIIlllllllIIlIIlIIIIlIl = new Setting(this, "Fly Boost String").setValue("[Flying (%BOOST%x boost)]");
        this.IIIllIllIIlIlIlIlIllllIIl = new Setting(this, "Fly String").setValue("[Flying]");
        this.IllIIIllIIIIlIlIlIllIIlll = new Setting(this, "Riding String").setValue("[Riding]");
        this.lIIIIlIlIIlllllIIllIIlIII = new Setting(this, "Descend String").setValue("[Descending]");
        this.llIIlllIllIllllIIIlIIIIII = new Setting(this, "Dismount String").setValue("[Dismounting]");
        this.llIIllIllIlIIlIIllIllllll = new Setting(this, "Sneaking String").setValue("[Sneaking (Key Held)]");
        this.lllIIlIIIllllllIIIIlIlIlI = new Setting(this, "Sprinting Held String").setValue("[Sprinting (Key Held)]");
        this.IlIlllIIIIIIlIIllIIllIlll = new Setting(this, "Sprinting Vanilla String").setValue("[Sprinting (Vanilla)]");
        this.IlIlIIlIlIllIIlIlIIllIIIl = new Setting(this, "Sprinting Toggle String").setValue("[Sprinting (Toggled)]");
        this.lllllIlllIIllIlIIlIIIllII = new Setting(this, "Sneaking Toggle String").setValue("[Sneaking (Toggled)]");
        this.lllIIIllIIIIlllIlIIllIIll("[Sprinting (Toggled)]", 1.0f);
        this.lllIIIllIIIIlllIlIIllIIll(class_2201.class, this::lllIIIllIIIIlllIlIIllIIll);
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_2201 class_22012) {
        if (!this.lllIIlIIIllllllIIIIlIlIlI()) {
            return;
        }
        if (((Boolean)IlIllllllIIlIIllllIIlIIIl.getValue()).booleanValue() && (((Boolean)lIllllIIlIIIlIllllllIIIll.getValue()).booleanValue() || !(this.lIIlIIIIIlIlllIlIIlIlIlll.lllllIlllIIllIlIIlIIIllII instanceof class_1056))) {
            GL11.glPushMatrix();
            int n = this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(class_0020.lIllllIIlIIIlIllllllIIIll);
            this.IlIllllllIIlIIllllIIlIIIl(n, 18.0f);
            this.lllIIIllIIIIlllIlIIllIIll(class_22012.lllIIIllIIIIlllIlIIllIIll());
            this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(class_0020.lIllllIIlIIIlIllllllIIIll, 0.0f, 0.0f, this.IllIIIIllIIllIllIlllIlIIl.lllIIIllIIIIlllIlIIllIIll());
            GL11.glPopMatrix();
        } else {
            this.IlIllllllIIlIIllllIIlIIIl(50.0f, 18.0f);
        }
    }

    static {
        IlIlIIlllIIlIllIIIlllllIl = false;
    }
}

