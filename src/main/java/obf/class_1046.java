package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class class_1046
extends class_1665 {
    public static class_1609 lllIIIllIIIIlllIlIIllIIll;
    public static class_1609 lllIlIIlIIIlIlIIIllIlllIl;
    public static class_1609 IlIllllllIIlIIllllIIlIIIl;
    private class_1609 IllIIIIllIIllIllIlllIlIIl;
    public static class_1609 lIlllIlllIIIIlIIlllIllIII;
    public static class_1609 IlIIIIIllllllIIlllIllllll;
    public static class_1609 lIllllIIlIIIlIllllllIIIll;
    private class_1609 IIIIIIIIlIllIIllIIlllIllI;
    public static class_1609 IIIllIIlIIIIIIlIlIIllIIlI;
    public class_1609 IllIIlllllllIIlIIlIIIIlIl;
    public class_1609 IIIllIllIIlIlIlIlIllllIIl;
    public class_1609 IllIIIllIIIIlIlIlIllIIlll;
    public class_1609 lIIIIlIlIIlllllIIllIIlIII;
    public class_1609 llIIlllIllIllllIIIlIIIIII;
    public class_1609 llIIllIllIlIIlIIllIllllll;
    public class_1609 lllIIlIIIllllllIIIIlIlIlI;
    public class_1609 IlIlllIIIIIIlIIllIIllIlll;
    public class_1609 IlIlIIlIlIllIIlIlIIllIIIl;
    public class_1609 lllllIlllIIllIlIIlIIIllII;
    public static boolean IlIlIIlllIIlIllIIIlllllIl;

    public class_1046() {
        super("ToggleSprint");
        this.lllIlIIlIIIlIlIIIllIlllIl(class_0767.lllIIIllIIIIlllIlIIllIIll);
        this.lllIlIIlIIIlIlIIIllIlllIl(0.0f, 10.0f);
        this.lllIlIIlIIIlIlIIIllIlllIl(false);
        this.IlIIlllllIIlIlIlllllIllll = false;
        lllIIIllIIIIlllIlIIllIIll = new class_1609(this, "Toggle Sprint").lllIlIIlIIIlIlIIIllIlllIl(true);
        lllIlIIlIIIlIlIIIllIlllIl = new class_1609(this, "Toggle Sneak").lllIlIIlIIIlIlIIIllIlllIl(false);
        IlIllllllIIlIIllllIIlIIIl = new class_1609(this, "Show HUD Text").lllIlIIlIIIlIlIIIllIlllIl(true);
        this.IllIIIIllIIllIllIlllIlIIl = new class_1609(this, "Text Color").lllIlIIlIIIlIlIIIllIlllIl(-1).lllIIIllIIIIlllIlIIllIIll((Object)Integer.MIN_VALUE, (Object)Integer.MAX_VALUE);
        lIlllIlllIIIIlIIlllIllIII = new class_1609(this, "Double Tap").lllIlIIlIIIlIlIIIllIlllIl(false);
        lIllllIIlIIIlIllllllIIIll = new class_1609(this, "Show While Typing").lllIlIIlIIIlIlIIIllIlllIl(true);
        this.IIIIIIIIlIllIIllIIlllIllI = new class_1609(this, "label").lllIlIIlIIIlIlIIIllIlllIl("Fly Boost");
        IlIIIIIllllllIIlllIllllll = new class_1609(this, "Fly Boost").lllIlIIlIIIlIlIIIllIlllIl(true);
        IIIllIIlIIIIIIlIlIIllIIlI = new class_1609(this, "Fly Boost Amount").lllIlIIlIIIlIlIIIllIlllIl(4).lllIIIllIIIIlllIlIIllIIll((Object)2, (Object)10).lllIIIllIIIIlllIlIIllIIll(IlIIIIIllllllIIlllIllllll);
        this.IllIIlllllllIIlIIlIIIIlIl = new class_1609(this, "Fly Boost String").lllIlIIlIIIlIlIIIllIlllIl("[Flying (%BOOST%x boost)]");
        this.IIIllIllIIlIlIlIlIllllIIl = new class_1609(this, "Fly String").lllIlIIlIIIlIlIIIllIlllIl("[Flying]");
        this.IllIIIllIIIIlIlIlIllIIlll = new class_1609(this, "Riding String").lllIlIIlIIIlIlIIIllIlllIl("[Riding]");
        this.lIIIIlIlIIlllllIIllIIlIII = new class_1609(this, "Descend String").lllIlIIlIIIlIlIIIllIlllIl("[Descending]");
        this.llIIlllIllIllllIIIlIIIIII = new class_1609(this, "Dismount String").lllIlIIlIIIlIlIIIllIlllIl("[Dismounting]");
        this.llIIllIllIlIIlIIllIllllll = new class_1609(this, "Sneaking String").lllIlIIlIIIlIlIIIllIlllIl("[Sneaking (Key Held)]");
        this.lllIIlIIIllllllIIIIlIlIlI = new class_1609(this, "Sprinting Held String").lllIlIIlIIIlIlIIIllIlllIl("[Sprinting (Key Held)]");
        this.IlIlllIIIIIIlIIllIIllIlll = new class_1609(this, "Sprinting Vanilla String").lllIlIIlIIIlIlIIIllIlllIl("[Sprinting (Vanilla)]");
        this.IlIlIIlIlIllIIlIlIIllIIIl = new class_1609(this, "Sprinting Toggle String").lllIlIIlIIIlIlIIIllIlllIl("[Sprinting (Toggled)]");
        this.lllllIlllIIllIlIIlIIIllII = new class_1609(this, "Sneaking Toggle String").lllIlIIlIIIlIlIIIllIlllIl("[Sneaking (Toggled)]");
        this.lllIIIllIIIIlllIlIIllIIll("[Sprinting (Toggled)]", 1.0f);
        this.lllIIIllIIIIlllIlIIllIIll(class_2201.class, this::lllIIIllIIIIlllIlIIllIIll);
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_2201 class_22012) {
        if (!this.lllIIlIIIllllllIIIIlIlIlI()) {
            return;
        }
        if (((Boolean)IlIllllllIIlIIllllIIlIIIl.lIlllIlllIIIIlIIlllIllIII()).booleanValue() && (((Boolean)lIllllIIlIIIlIllllllIIIll.lIlllIlllIIIIlIIlllIllIII()).booleanValue() || !(this.lIIlIIIIIlIlllIlIIlIlIlll.lllllIlllIIllIlIIlIIIllII instanceof class_1056))) {
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

