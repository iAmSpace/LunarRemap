package obf;

/*
 * Decompiled with CFR 0.150.
 */
class class_2226 {
    private String lllIIIllIIIIlllIlIIllIIll;
    private boolean lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl;
    private double lIlllIlllIIIIlIIlllIllIII;

    public class_2226(String string) {
        this.lllIIIllIIIIlllIlIIllIIll(string);
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
        if (string != null) {
            if (string.equals("false")) {
                this.lllIlIIlIIIlIlIIIllIlllIl = false;
                return;
            }
            if (string.equals("true")) {
                this.lllIlIIlIIIlIlIIIllIlllIl = true;
                return;
            }
        }
        this.lllIlIIlIIIlIlIIIllIlllIl = Boolean.parseBoolean(string);
        try {
            this.IlIllllllIIlIIllllIIlIIIl = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
        try {
            this.lIlllIlllIIIIlIIlllIllIII = Double.parseDouble(string);
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }
}

