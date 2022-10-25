package obf;

/*
 * Decompiled with CFR 0.150.
 */
class class_0749 {
    private final String lllIIIllIIIIlllIlIIllIIll;
    private final String lllIlIIlIIIlIlIIIllIlllIl;

    public class_0749(String string, Object object) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
        if (object == null) {
            this.lllIlIIlIIIlIlIIIllIlllIl = "~~NULL~~";
        } else if (object instanceof Throwable) {
            Throwable throwable = (Throwable)object;
            this.lllIlIIlIIIlIlIIIllIlllIl = "~~ERROR~~ " + throwable.getClass().getSimpleName() + ": " + throwable.getMessage();
        } else {
            this.lllIlIIlIIIlIlIIIllIlllIl = object.toString();
        }
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public String lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }
}

