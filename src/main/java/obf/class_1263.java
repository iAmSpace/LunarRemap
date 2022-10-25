package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Set;
import java.util.TreeMap;

public class class_1263 {
    private TreeMap lllIIIllIIIIlllIlIIllIIll = new TreeMap();

    public class_1263() {
        this.lllIIIllIIIIlllIlIIllIIll("doFireTick", "true");
        this.lllIIIllIIIIlllIlIIllIIll("mobGriefing", "true");
        this.lllIIIllIIIIlllIlIIllIIll("keepInventory", "false");
        this.lllIIIllIIIIlllIlIIllIIll("doMobSpawning", "true");
        this.lllIIIllIIIIlllIlIIllIIll("doMobLoot", "true");
        this.lllIIIllIIIIlllIlIIllIIll("doTileDrops", "true");
        this.lllIIIllIIIIlllIlIIllIIll("commandBlockOutput", "true");
        this.lllIIIllIIIIlllIlIIllIIll("naturalRegeneration", "true");
        this.lllIIIllIIIIlllIlIIllIIll("doDaylightCycle", "true");
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string, String string2) {
        this.lllIIIllIIIIlllIlIIllIIll.put(string, new class_2226(string2));
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(String string, String string2) {
        class_2226 class_22262 = (class_2226)this.lllIIIllIIIIlllIlIIllIIll.get(string);
        if (class_22262 != null) {
            class_22262.lllIIIllIIIIlllIlIIllIIll(string2);
        } else {
            this.lllIIIllIIIIlllIlIIllIIll(string, string2);
        }
    }

    public String lllIIIllIIIIlllIlIIllIIll(String string) {
        class_2226 class_22262 = (class_2226)this.lllIIIllIIIIlllIlIIllIIll.get(string);
        return class_22262 != null ? class_22262.lllIIIllIIIIlllIlIIllIIll() : "";
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(String string) {
        class_2226 class_22262 = (class_2226)this.lllIIIllIIIIlllIlIIllIIll.get(string);
        return class_22262 != null ? class_22262.lllIlIIlIIIlIlIIIllIlllIl() : false;
    }

    public class_0775 lllIIIllIIIIlllIlIIllIIll() {
        class_0775 class_07752 = new class_0775();
        for (String string : this.lllIIIllIIIIlllIlIIllIIll.keySet()) {
            class_2226 class_22262 = (class_2226)this.lllIIIllIIIIlllIlIIllIIll.get(string);
            class_07752.lllIIIllIIIIlllIlIIllIIll(string, class_22262.lllIIIllIIIIlllIlIIllIIll());
        }
        return class_07752;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        Set set = class_07752.lIlllIlllIIIIlIIlllIllIII();
        for (String string : set) {
            String string2 = class_07752.IllIIIllIIIIlIlIlIllIIlll(string);
            this.lllIlIIlIIIlIlIIIllIlllIl(string, string2);
        }
    }

    public String[] lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIIIllIIIIlllIlIIllIIll.keySet().toArray(new String[0]);
    }

    public boolean IlIllllllIIlIIllllIIlIIIl(String string) {
        return this.lllIIIllIIIIlllIlIIllIIll.containsKey(string);
    }
}

