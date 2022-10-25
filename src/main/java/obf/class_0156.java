package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class class_0156 {
    public static final class_0156 lllIIIllIIIIlllIlIIllIIll = new class_0156();
    private Random lllIlIIlIIIlIlIIIllIlllIl = new Random();
    private String[] IlIllllllIIlIIllllIIlIIIl = "the elder scrolls klaatu berata niktu xyzzy bless curse light darkness fire air earth water hot dry cold wet ignite snuff embiggen twist shorten stretch fiddle destroy imbue galvanize enchant free limited range of towards inside sphere cube self other ball mental physical grow shrink demon elemental spirit animal creature beast humanoid undead fresh stale ".split(" ");

    public String lllIIIllIIIIlllIlIIllIIll() {
        int n = this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(2) + 3;
        String string = "";
        for (int i = 0; i < n; ++i) {
            if (i > 0) {
                string = string + " ";
            }
            string = string + this.IlIllllllIIlIIllllIIlIIIl[this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(this.IlIllllllIIlIIllllIIlIIIl.length)];
        }
        return string;
    }

    public void lllIIIllIIIIlllIlIIllIIll(long l) {
        this.lllIlIIlIIIlIlIIIllIlllIl.setSeed(l);
    }
}

