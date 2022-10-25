package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class class_1950 {
    private final UUID lllIIIllIIIIlllIlIIllIIll;
    private final String lllIlIIlIIIlIlIIIllIlllIl;
    private final List IlIllllllIIlIIllllIIlIIIl = new ArrayList();
    private final List lIlllIlllIIIIlIIlllIllIII = new ArrayList();

    public class_1950(UUID uUID, String string) {
        this.lllIIIllIIIIlllIlIIllIIll = uUID;
        this.lllIlIIlIIIlIlIIIllIlllIl = string;
    }

    public class_0754 lllIIIllIIIIlllIlIIllIIll(UUID uUID, String string) {
        class_0754 class_07542 = null;
        if (!this.lIlllIlllIIIIlIIlllIllIII(uUID)) {
            class_07542 = new class_0754(uUID, class_1227.lllIIIllIIIIlllIlIIllIIll(string));
            this.IlIllllllIIlIIllllIIlIIIl.add(class_07542);
        }
        return class_07542;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(UUID uUID) {
        return this.IlIllllllIIlIIllllIIlIIIl.removeIf(class_07542 -> class_07542.lllIIIllIIIIlllIlIIllIIll().equals(uUID));
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(UUID uUID, String string) {
        if (this.lIlllIlllIIIIlIIlllIllIII(uUID)) {
            this.lIlllIlllIIIIlIIlllIllIII.add(uUID);
        }
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(UUID uUID) {
        return this.lIlllIlllIIIIlIIlllIllIII.removeIf(uUID2 -> uUID2.equals(uUID));
    }

    public boolean IlIllllllIIlIIllllIIlIIIl(UUID uUID) {
        return this.lIlllIlllIIIIlIIlllIllIII.stream().anyMatch(uUID2 -> uUID2.equals(uUID));
    }

    public boolean lIlllIlllIIIIlIIlllIllIII(UUID uUID) {
        return this.IlIllllllIIlIIllllIIlIIIl.stream().anyMatch(class_07542 -> class_07542.lllIIIllIIIIlllIlIIllIIll().equals(uUID));
    }

    public UUID lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public String lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public List IlIllllllIIlIIllllIIlIIIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }
}

