package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class class_1834
implements class_1685 {
    private final class_1901 lllIIIllIIIIlllIlIIllIIll;
    private final class_2191 lllIlIIlIIIlIlIIIllIlllIl;
    private final Map IlIllllllIIlIIllllIIlIIIl = Maps.newHashMap();
    private final Map lIlllIlllIIIIlIIlllIllIII = Maps.newHashMap();
    private final Map IlIIIIIllllllIIlllIllllll = Maps.newHashMap();
    private double lIllllIIlIIIlIllllllIIIll;
    private boolean IIIllIIlIIIIIIlIlIIllIIlI = true;
    private double IllIIlllllllIIlIIlIIIIlIl;

    public class_1834(class_1901 class_19012, class_2191 class_21912) {
        this.lllIIIllIIIIlllIlIIllIIll = class_19012;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_21912;
        this.lIllllIIlIIIlIllllllIIIll = class_21912.lllIlIIlIIIlIlIIIllIlllIl();
        for (int i = 0; i < 3; ++i) {
            this.IlIllllllIIlIIllllIIlIIIl.put(i, new HashSet());
        }
    }

    @Override
    public class_2191 lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public double lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(double d) {
        if (d != this.lllIlIIlIIIlIlIIIllIlllIl()) {
            this.lIllllIIlIIIlIllllllIIIll = d;
            this.lIllllIIlIIIlIllllllIIIll();
        }
    }

    public Collection lllIIIllIIIIlllIlIIllIIll(int n) {
        return (Collection)this.IlIllllllIIlIIllllIIlIIIl.get(n);
    }

    @Override
    public Collection IlIllllllIIlIIllllIIlIIIl() {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < 3; ++i) {
            hashSet.addAll(this.lllIIIllIIIIlllIlIIllIIll(i));
        }
        return hashSet;
    }

    @Override
    public class_1256 lllIIIllIIIIlllIlIIllIIll(UUID uUID) {
        return (class_1256)this.IlIIIIIllllllIIlllIllllll.get(uUID);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1256 class_12562) {
        if (this.lllIIIllIIIIlllIlIIllIIll(class_12562.lllIIIllIIIIlllIlIIllIIll()) != null) {
            throw new IllegalArgumentException("Modifier is already applied on this attribute!");
        }
        HashSet hashSet = (HashSet)this.lIlllIlllIIIIlIIlllIllIII.get(class_12562.lllIlIIlIIIlIlIIIllIlllIl());
        if (hashSet == null) {
            hashSet = new HashSet();
            this.lIlllIlllIIIIlIIlllIllIII.put(class_12562.lllIlIIlIIIlIlIIIllIlllIl(), hashSet);
        }
        ((Set)this.IlIllllllIIlIIllllIIlIIIl.get(class_12562.IlIllllllIIlIIllllIIlIIIl())).add(class_12562);
        ((Set)hashSet).add(class_12562);
        this.IlIIIIIllllllIIlllIllllll.put(class_12562.lllIIIllIIIIlllIlIIllIIll(), class_12562);
        this.lIllllIIlIIIlIllllllIIIll();
    }

    private void lIllllIIlIIIlIllllllIIIll() {
        this.IIIllIIlIIIIIIlIlIIllIIlI = true;
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1256 class_12562) {
        for (int i = 0; i < 3; ++i) {
            Set set = (Set)this.IlIllllllIIlIIllllIIlIIIl.get(i);
            set.remove(class_12562);
        }
        Set set = (Set)this.lIlllIlllIIIIlIIlllIllIII.get(class_12562.lllIlIIlIIIlIlIIIllIlllIl());
        if (set != null) {
            set.remove(class_12562);
            if (set.isEmpty()) {
                this.lIlllIlllIIIIlIIlllIllIII.remove(class_12562.lllIlIIlIIIlIlIIIllIlllIl());
            }
        }
        this.IlIIIIIllllllIIlllIllllll.remove(class_12562.lllIIIllIIIIlllIlIIllIIll());
        this.lIllllIIlIIIlIllllllIIIll();
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII() {
        Collection collection = this.IlIllllllIIlIIllllIIlIIIl();
        if (collection != null) {
            ArrayList arrayList = new ArrayList(collection);
            for (class_1256 class_12562 : arrayList) {
                this.lllIlIIlIIIlIlIIIllIlllIl(class_12562);
            }
        }
    }

    @Override
    public double IlIIIIIllllllIIlllIllllll() {
        if (this.IIIllIIlIIIIIIlIlIIllIIlI) {
            this.IllIIlllllllIIlIIlIIIIlIl = this.IIIllIIlIIIIIIlIlIIllIIlI();
            this.IIIllIIlIIIIIIlIlIIllIIlI = false;
        }
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }

    private double IIIllIIlIIIIIIlIlIIllIIlI() {
        double d = this.lllIlIIlIIIlIlIIIllIlllIl();
        for (class_1256 class_12562 : this.lllIIIllIIIIlllIlIIllIIll(0)) {
            d += class_12562.lIlllIlllIIIIlIIlllIllIII();
        }
        double d2 = d;
        for (class_1256 class_12563 : this.lllIIIllIIIIlllIlIIllIIll(1)) {
            d2 += d * class_12563.lIlllIlllIIIIlIIlllIllIII();
        }
        for (class_1256 class_12563 : this.lllIIIllIIIIlllIlIIllIIll(2)) {
            d2 *= 1.0 + class_12563.lIlllIlllIIIIlIIlllIllIII();
        }
        return this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(d2);
    }
}

