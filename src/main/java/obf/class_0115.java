package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.beans.ConstructorProperties;
import java.util.Objects;

public class class_0115 {
    private final String lllIIIllIIIIlllIlIIllIIll;
    private String lllIlIIlIIIlIlIIIllIlllIl;
    private String IlIllllllIIlIIllllIIlIIIl;
    private String lIlllIlllIIIIlIIlllIllIII;
    private boolean IlIIIIIllllllIIlllIllllll;
    private long lIllllIIlIIIlIllllllIIIll;
    private class_0135 IIIllIIlIIIIIIlIlIIllIIlI = class_0135.lllIIIllIIIIlllIlIIllIIll;

    public static int lllIIIllIIIIlllIlIIllIIll(class_0135 class_01352) {
        int n;
        if (class_01352 == null) {
            return -13158601;
        }
        switch (class_01352) {
            case lllIlIIlIIIlIlIIIllIlllIl: {
                n = -1722581;
                break;
            }
            case IlIllllllIIlIIllllIIlIIIl: {
                n = -1758421;
                break;
            }
            case lIlllIlllIIIIlIIlllIllIII: {
                n = -13158601;
                break;
            }
            default: {
                n = -13369549;
            }
        }
        return n;
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        String string;
        if (this.IlIIIIIllllllIIlllIllllll) {
            if (this.lIlllIlllIIIIlIIlllIllIII != null && !Objects.equals(this.lIlllIlllIIIIlIIlllIllIII, "")) {
                string = "Playing" + (Object)((Object) EnumChatFormatting.BOLD) + " " + this.lIlllIlllIIIIlIIlllIllIII;
            } else {
                switch (this.IIIllIIlIIIIIIlIlIIllIIlI) {
                    case lllIlIIlIIIlIlIIIllIlllIl: {
                        string = "Away";
                        break;
                    }
                    case IlIllllllIIlIIllllIIlIIIl: {
                        string = "Busy";
                        break;
                    }
                    default: {
                        string = "Online";
                        break;
                    }
                }
            }
        } else {
            long l = System.currentTimeMillis() - this.lIllllIIlIIIlIllllllIIIll;
            long l2 = 1000L;
            long l3 = l2 * 60L;
            long l4 = l3 * 60L;
            long l5 = l4 * 24L;
            long l6 = l / l5;
            long l7 = (l %= l5) / l4;
            long l8 = (l %= l4) / l3;
            string = l6 > 0L ? "Offline for " + l6 + (l6 == 1L ? " day" : " days") : (l7 > 0L ? "Offline for " + l7 + (l7 == 1L ? " hour" : " hours") : "Offline for " + l8 + (l8 == 1L ? " minute" : " minutes"));
        }
        return string;
    }

    @ConstructorProperties(value={"playerId", "name", "status", "server", "online", "offlineSince", "onlineStatus"})
    class_0115(String string, String string2, String string3, String string4, boolean bl, long l, class_0135 class_01352) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
        this.lllIlIIlIIIlIlIIIllIlllIl = string2;
        this.IlIllllllIIlIIllllIIlIIIl = string3;
        this.lIlllIlllIIIIlIIlllIllIII = string4;
        this.IlIIIIIllllllIIlllIllllll = bl;
        this.lIllllIIlIIIlIllllllIIIll = l;
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_01352;
    }

    public static class_2142 lllIlIIlIIIlIlIIIllIlllIl() {
        return new class_2142();
    }

    public String IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public String lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public String IlIIIIIllllllIIlllIllllll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public String lIllllIIlIIIlIllllllIIIll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public boolean IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public long IllIIlllllllIIlIIlIIIIlIl() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public class_0135 IIIllIllIIlIlIlIlIllllIIl() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.lllIlIIlIIIlIlIIIllIlllIl = string;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(String string) {
        this.IlIllllllIIlIIllllIIlIIIl = string;
    }

    public void IlIllllllIIlIIllllIIlIIIl(String string) {
        this.lIlllIlllIIIIlIIlllIllIII = string;
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.IlIIIIIllllllIIlllIllllll = bl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(long l) {
        this.lIllllIIlIIIlIllllllIIIll = l;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_0135 class_01352) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_01352;
    }
}

