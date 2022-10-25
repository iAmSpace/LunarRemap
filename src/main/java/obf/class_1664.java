package obf;

import com.moonsworth.lunar.client.config.Setting;
import com.moonsworth.lunar.client.LunarClient;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1664
extends class_2256 {
    public static Setting lllIIIllIIIIlllIlIIllIIll;
    public static Setting lllIlIIlIIIlIlIIIllIlllIl;
    public static Setting IlIllllllIIlIIllllIIlIIIl;
    public static Setting lIlllIlllIIIIlIIlllIllIII;
    public static Setting IlIIIIIllllllIIlllIllllll;
    public static Setting lIllllIIlIIIlIllllllIIIll;
    public static Setting IIIllIIlIIIIIIlIlIIllIIlI;
    public static Setting IllIIlllllllIIlIIlIIIIlIl;
    public static Setting IIIllIllIIlIlIlIlIllllIIl;
    public static Setting IllIIIllIIIIlIlIlIllIIlll;
    public static Setting lIIIIlIlIIlllllIIllIIlIII;
    public static Setting llIIlllIllIllllIIIlIIIIII;
    public static Setting llIIllIllIlIIlIIllIllllll;

    public class_1664(String string) {
        super(string);
        this.IlIllllllIIlIIllllIIlIIIl(true);
        lllIIIllIIIIlllIlIIllIIll = new Setting(this, "Trimp").setValue(true);
        lllIlIIlIIIlIlIIIllIlllIl = new Setting(this, "Trimp Multiplier").setValue(Float.valueOf(1.4f)).setMinMax((Object)Float.valueOf(1.0f), (Object)Float.valueOf(4.0f));
        IlIllllllIIlIIllllIIlIIIl = new Setting(this, "Hard cap").setValue(Float.valueOf(2.0f)).setMinMax((Object)Float.valueOf(1.0f), (Object)Float.valueOf(4.0f));
        lIlllIlllIIIIlIIlllIllIII = new Setting(this, "Soft cap").setValue(Float.valueOf(1.4f)).setMinMax((Object)Float.valueOf(1.0f), (Object)Float.valueOf(4.0f));
        IlIIIIIllllllIIlllIllllll = new Setting(this, "Soft cap degen").setValue(Float.valueOf(0.65f)).setMinMax((Object)Float.valueOf(0.1f), (Object)Float.valueOf(4.0f));
        lIllllIIlIIIlIllllllIIIll = new Setting(this, "Sharking").setValue(true);
        IIIllIIlIIIIIIlIlIIllIIlI = new Setting(this, "Sharking surface tension").setValue(0.2).setMinMax((Object)0.0, (Object)1.0);
        IllIIlllllllIIlIIlIIIIlIl = new Setting(this, "Sharking water friction").setValue(0.1).setMinMax((Object)0.0, (Object)1.0);
        IIIllIllIIlIlIlIlIllllIIl = new Setting(this, "Accelerate").setValue(20.0).setMinMax((Object)5.0, (Object)100.0);
        IllIIIllIIIIlIlIlIllIIlll = new Setting(this, "Air accelerate").setValue(28.0).setMinMax((Object)5.0, (Object)150.0);
        llIIllIllIlIIlIIllIllllll = new Setting(this, "Max air accel per tick").setValue(0.095).setMinMax((Object)0.0, (Object)1.0);
        lIIIIlIlIIlllllIIllIIlIII = new Setting(this, "Uncapped BunnyHop").setValue(true);
        llIIlllIllIllllIIIlIIIIII = new Setting(this, "Increased FallDistance").setValue(0.0).setMinMax((Object)0.0, (Object)10.0);
    }

    public static boolean llIIlIllIllllIlIIIIlIIlll() {
        return LunarClient.getInstance().getModuleManager().lIlIlIIlIIIIlIIIIIlllIIII.IlIIIIIllllllIIlllIllllll() && LunarClient.getInstance().getModuleManager().lIlIlIIlIIIIlIIIIIlllIIII.lIllllIIlIIIlIllllllIIIll();
    }
}

