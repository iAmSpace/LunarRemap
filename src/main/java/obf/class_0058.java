package obf;

import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentTranslation;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0058 {
    public static class_0058 lllIIIllIIIIlllIlIIllIIll = new class_0058("inFire").lllIIlIIIllllllIIIIlIlIlI();
    public static class_0058 lllIlIIlIIIlIlIIIllIlllIl = new class_0058("onFire").lIIIIlIlIIlllllIIllIIlIII().lllIIlIIIllllllIIIIlIlIlI();
    public static class_0058 IlIllllllIIlIIllllIIlIIIl = new class_0058("lava").lllIIlIIIllllllIIIIlIlIlI();
    public static class_0058 lIlllIlllIIIIlIIlllIllIII = new class_0058("inWall").lIIIIlIlIIlllllIIllIIlIII();
    public static class_0058 IlIIIIIllllllIIlllIllllll = new class_0058("drown").lIIIIlIlIIlllllIIllIIlIII();
    public static class_0058 lIllllIIlIIIlIllllllIIIll = new class_0058("starve").lIIIIlIlIIlllllIIllIIlIII().llIIllIllIlIIlIIllIllllll();
    public static class_0058 IIIllIIlIIIIIIlIlIIllIIlI = new class_0058("cactus");
    public static class_0058 IllIIlllllllIIlIIlIIIIlIl = new class_0058("fall").lIIIIlIlIIlllllIIllIIlIII();
    public static class_0058 IIIllIllIIlIlIlIlIllllIIl = new class_0058("outOfWorld").lIIIIlIlIIlllllIIllIIlIII().llIIlllIllIllllIIIlIIIIII();
    public static class_0058 IllIIIllIIIIlIlIlIllIIlll = new class_0058("generic").lIIIIlIlIIlllllIIllIIlIII();
    public static class_0058 lIIIIlIlIIlllllIIllIIlIII = new class_0058("magic").lIIIIlIlIIlllllIIllIIlIII().lIlIlIIlIIIIlIIIIIlllIIII();
    public static class_0058 llIIlllIllIllllIIIlIIIIII = new class_0058("wither").lIIIIlIlIIlllllIIllIIlIII();
    public static class_0058 llIIllIllIlIIlIIllIllllll = new class_0058("anvil");
    public static class_0058 lllIIlIIIllllllIIIIlIlIlI = new class_0058("fallingBlock");
    private boolean IlIlIIlIlIllIIlIlIIllIIIl;
    private boolean lllllIlllIIllIlIIlIIIllII;
    private boolean IlIlIIlllIIlIllIIIlllllIl;
    private float lIIlIIIIIlIlllIlIIlIlIlll = 0.3f;
    private boolean lIlIlIIlIIIIlIIIIIlllIIII;
    private boolean IlIIIlIIIIllIIIllIIIIIIll;
    private boolean IIlllIlIlllIllIIIlllIIlIl;
    private boolean lIlIllIIlIIlIIlIIlIIlIIll;
    private boolean llIIlIllIllllIlIIIIlIIlll;
    public String IlIlllIIIIIIlIIllIIllIlll;

    public static class_0058 lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652) {
        return new class_1494("mob", class_19652);
    }

    public static class_0058 lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142) {
        return new class_1494("player", class_08142);
    }

    public static class_0058 lllIIIllIIIIlllIlIIllIIll(class_0369 class_03692, class_1521 class_15212) {
        return new class_0666("arrow", class_03692, class_15212).lllIlIIlIIIlIlIIIllIlllIl();
    }

    public static class_0058 lllIIIllIIIIlllIlIIllIIll(class_1937 class_19372, class_1521 class_15212) {
        return class_15212 == null ? new class_0666("onFire", class_19372, class_19372).lllIIlIIIllllllIIIIlIlIlI().lllIlIIlIIIlIlIIIllIlllIl() : new class_0666("fireball", class_19372, class_15212).lllIIlIIIllllllIIIIlIlIlI().lllIlIIlIIIlIlIIIllIlllIl();
    }

    public static class_0058 lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, class_1521 class_15213) {
        return new class_0666("thrown", class_15212, class_15213).lllIlIIlIIIlIlIIIllIlllIl();
    }

    public static class_0058 lllIlIIlIIIlIlIIIllIlllIl(class_1521 class_15212, class_1521 class_15213) {
        return new class_0666("indirectMagic", class_15212, class_15213).lIIIIlIlIIlllllIIllIIlIII().lIlIlIIlIIIIlIIIIIlllIIII();
    }

    public static class_0058 lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return new class_1494("thorns", class_15212).lIlIlIIlIIIIlIIIIIlllIIII();
    }

    public static class_0058 lllIIIllIIIIlllIlIIllIIll(class_1013 class_10132) {
        return class_10132 != null && class_10132.IlIllllllIIlIIllllIIlIIIl() != null ? new class_1494("explosion.player", class_10132.IlIllllllIIlIIllllIIlIIIl()).lllllIlllIIllIlIIlIIIllII().lIlllIlllIIIIlIIlllIllIII() : new class_0058("explosion").lllllIlllIIllIlIIlIIIllII().lIlllIlllIIIIlIIlllIllIII();
    }

    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return this.IlIIIlIIIIllIIIllIIIIIIll;
    }

    public class_0058 lllIlIIlIIIlIlIIIllIlllIl() {
        this.IlIIIlIIIIllIIIllIIIIIIll = true;
        return this;
    }

    public boolean IlIllllllIIlIIllllIIlIIIl() {
        return this.llIIlIllIllllIlIIIIlIIlll;
    }

    public class_0058 lIlllIlllIIIIlIIlllIllIII() {
        this.llIIlIllIllllIlIIIIlIIlll = true;
        return this;
    }

    public boolean IlIIIIIllllllIIlllIllllll() {
        return this.IlIlIIlIlIllIIlIlIIllIIIl;
    }

    public float lIllllIIlIIIlIllllllIIIll() {
        return this.lIIlIIIIIlIlllIlIIlIlIlll;
    }

    public boolean IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.lllllIlllIIllIlIIlIIIllII;
    }

    public boolean IllIIlllllllIIlIIlIIIIlIl() {
        return this.IlIlIIlllIIlIllIIIlllllIl;
    }

    protected class_0058(String string) {
        this.IlIlllIIIIIIlIIllIIllIlll = string;
    }

    public class_1521 IIIllIllIIlIlIlIlIllllIIl() {
        return this.IllIIIllIIIIlIlIlIllIIlll();
    }

    public class_1521 IllIIIllIIIIlIlIlIllIIlll() {
        return null;
    }

    protected class_0058 lIIIIlIlIIlllllIIllIIlIII() {
        this.IlIlIIlIlIllIIlIlIIllIIIl = true;
        this.lIIlIIIIIlIlllIlIIlIlIlll = 0.0f;
        return this;
    }

    protected class_0058 llIIlllIllIllllIIIlIIIIII() {
        this.lllllIlllIIllIlIIlIIIllII = true;
        return this;
    }

    protected class_0058 llIIllIllIlIIlIIllIllllll() {
        this.IlIlIIlllIIlIllIIIlllllIl = true;
        this.lIIlIIIIIlIlllIlIIlIlIlll = 0.0f;
        return this;
    }

    protected class_0058 lllIIlIIIllllllIIIIlIlIlI() {
        this.lIlIlIIlIIIIlIIIIIlllIIII = true;
        return this;
    }

    public IChatComponent lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652) {
        class_1965 class_19653 = class_19652.lIIIlllllllIlllIIllllllll();
        String string = "death.attack." + this.IlIlllIIIIIIlIIllIIllIlll;
        String string2 = string + ".player";
        return class_19653 != null && class_1586.IlIllllllIIlIIllllIIlIIIl(string2) ? new ChatComponentTranslation(string2, class_19652.llIIIIllIIIIIIIlIIIlIIIIl(), class_19653.llIIIIllIIIIIIIlIIIlIIIIl()) : new ChatComponentTranslation(string, class_19652.llIIIIllIIIIIIIlIIIlIIIIl());
    }

    public boolean IlIlllIIIIIIlIIllIIllIlll() {
        return this.lIlIlIIlIIIIlIIIIIlllIIII;
    }

    public String IlIlIIlIlIllIIlIlIIllIIIl() {
        return this.IlIlllIIIIIIlIIllIIllIlll;
    }

    public class_0058 lllllIlllIIllIlIIlIIIllII() {
        this.IIlllIlIlllIllIIIlllIIlIl = true;
        return this;
    }

    public boolean IlIlIIlllIIlIllIIIlllllIl() {
        return this.IIlllIlIlllIllIIIlllIIlIl;
    }

    public boolean lIIlIIIIIlIlllIlIIlIlIlll() {
        return this.lIlIllIIlIIlIIlIIlIIlIIll;
    }

    public class_0058 lIlIlIIlIIIIlIIIIIlllIIII() {
        this.lIlIllIIlIIlIIlIIlIIlIIll = true;
        return this;
    }
}

