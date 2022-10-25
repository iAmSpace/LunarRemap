package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 */
import com.google.common.collect.Multimap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class class_1901 {
    protected final Map lllIIIllIIIIlllIlIIllIIll = new HashMap();
    protected final Map lllIlIIlIIIlIlIIIllIlllIl = new class_1592();

    public class_1685 lllIIIllIIIIlllIlIIllIIll(class_2191 class_21912) {
        return (class_1685)this.lllIIIllIIIIlllIlIIllIIll.get(class_21912);
    }

    public class_1685 lllIIIllIIIIlllIlIIllIIll(String string) {
        return (class_1685)this.lllIlIIlIIIlIlIIIllIlllIl.get(string);
    }

    public abstract class_1685 lllIlIIlIIIlIlIIIllIlllIl(class_2191 var1);

    public Collection lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl.values();
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1834 class_18342) {
    }

    public void lllIIIllIIIIlllIlIIllIIll(Multimap multimap) {
        for (Map.Entry entry : multimap.entries()) {
            class_1685 class_16852 = this.lllIIIllIIIIlllIlIIllIIll((String)entry.getKey());
            if (class_16852 == null) continue;
            class_16852.lllIlIIlIIIlIlIIIllIlllIl((class_1256)entry.getValue());
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(Multimap multimap) {
        for (Map.Entry entry : multimap.entries()) {
            class_1685 class_16852 = this.lllIIIllIIIIlllIlIIllIIll((String)entry.getKey());
            if (class_16852 == null) continue;
            class_16852.lllIlIIlIIIlIlIIIllIlllIl((class_1256)entry.getValue());
            class_16852.lllIIIllIIIIlllIlIIllIIll((class_1256)entry.getValue());
        }
    }
}

