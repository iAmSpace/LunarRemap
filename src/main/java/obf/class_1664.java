package obf;

import com.moonsworth.lunar.client.LunarClient;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1664
extends class_2256 {
    public static class_1609 lllIIIllIIIIlllIlIIllIIll;
    public static class_1609 lllIlIIlIIIlIlIIIllIlllIl;
    public static class_1609 IlIllllllIIlIIllllIIlIIIl;
    public static class_1609 lIlllIlllIIIIlIIlllIllIII;
    public static class_1609 IlIIIIIllllllIIlllIllllll;
    public static class_1609 lIllllIIlIIIlIllllllIIIll;
    public static class_1609 IIIllIIlIIIIIIlIlIIllIIlI;
    public static class_1609 IllIIlllllllIIlIIlIIIIlIl;
    public static class_1609 IIIllIllIIlIlIlIlIllllIIl;
    public static class_1609 IllIIIllIIIIlIlIlIllIIlll;
    public static class_1609 lIIIIlIlIIlllllIIllIIlIII;
    public static class_1609 llIIlllIllIllllIIIlIIIIII;
    public static class_1609 llIIllIllIlIIlIIllIllllll;

    public class_1664(String string) {
        super(string);
        this.IlIllllllIIlIIllllIIlIIIl(true);
        lllIIIllIIIIlllIlIIllIIll = new class_1609(this, "Trimp").lllIlIIlIIIlIlIIIllIlllIl(true);
        lllIlIIlIIIlIlIIIllIlllIl = new class_1609(this, "Trimp Multiplier").lllIlIIlIIIlIlIIIllIlllIl(Float.valueOf(1.4f)).lllIIIllIIIIlllIlIIllIIll((Object)Float.valueOf(1.0f), (Object)Float.valueOf(4.0f));
        IlIllllllIIlIIllllIIlIIIl = new class_1609(this, "Hard cap").lllIlIIlIIIlIlIIIllIlllIl(Float.valueOf(2.0f)).lllIIIllIIIIlllIlIIllIIll((Object)Float.valueOf(1.0f), (Object)Float.valueOf(4.0f));
        lIlllIlllIIIIlIIlllIllIII = new class_1609(this, "Soft cap").lllIlIIlIIIlIlIIIllIlllIl(Float.valueOf(1.4f)).lllIIIllIIIIlllIlIIllIIll((Object)Float.valueOf(1.0f), (Object)Float.valueOf(4.0f));
        IlIIIIIllllllIIlllIllllll = new class_1609(this, "Soft cap degen").lllIlIIlIIIlIlIIIllIlllIl(Float.valueOf(0.65f)).lllIIIllIIIIlllIlIIllIIll((Object)Float.valueOf(0.1f), (Object)Float.valueOf(4.0f));
        lIllllIIlIIIlIllllllIIIll = new class_1609(this, "Sharking").lllIlIIlIIIlIlIIIllIlllIl(true);
        IIIllIIlIIIIIIlIlIIllIIlI = new class_1609(this, "Sharking surface tension").lllIlIIlIIIlIlIIIllIlllIl(0.2).lllIIIllIIIIlllIlIIllIIll((Object)0.0, (Object)1.0);
        IllIIlllllllIIlIIlIIIIlIl = new class_1609(this, "Sharking water friction").lllIlIIlIIIlIlIIIllIlllIl(0.1).lllIIIllIIIIlllIlIIllIIll((Object)0.0, (Object)1.0);
        IIIllIllIIlIlIlIlIllllIIl = new class_1609(this, "Accelerate").lllIlIIlIIIlIlIIIllIlllIl(20.0).lllIIIllIIIIlllIlIIllIIll((Object)5.0, (Object)100.0);
        IllIIIllIIIIlIlIlIllIIlll = new class_1609(this, "Air accelerate").lllIlIIlIIIlIlIIIllIlllIl(28.0).lllIIIllIIIIlllIlIIllIIll((Object)5.0, (Object)150.0);
        llIIllIllIlIIlIIllIllllll = new class_1609(this, "Max air accel per tick").lllIlIIlIIIlIlIIIllIlllIl(0.095).lllIIIllIIIIlllIlIIllIIll((Object)0.0, (Object)1.0);
        lIIIIlIlIIlllllIIllIIlIII = new class_1609(this, "Uncapped BunnyHop").lllIlIIlIIIlIlIIIllIlllIl(true);
        llIIlllIllIllllIIIlIIIIII = new class_1609(this, "Increased FallDistance").lllIlIIlIIIlIlIIIllIlllIl(0.0).lllIIIllIIIIlllIlIIllIIll((Object)0.0, (Object)10.0);
    }

    public static boolean llIIlIllIllllIlIIIIlIIlll() {
        return LunarClient.getInstance().getModuleManager().lIlIlIIlIIIIlIIIIIlllIIII.IlIIIIIllllllIIlllIllllll() && LunarClient.getInstance().getModuleManager().lIlIlIIlIIIIlIIIIIlllIIII.lIllllIIlIIIlIllllllIIIll();
    }
}

