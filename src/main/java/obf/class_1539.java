package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class class_1539
extends class_1901 {
    private final Set lIlllIlllIIIIlIIlllIllIII = Sets.newHashSet();
    protected final Map IlIllllllIIlIIllllIIlIIIl = new class_1592();

    public class_1834 IlIllllllIIlIIllllIIlIIIl(class_2191 class_21912) {
        return (class_1834)super.lllIIIllIIIIlllIlIIllIIll(class_21912);
    }

    public class_1834 lllIlIIlIIIlIlIIIllIlllIl(String string) {
        class_1685 class_16852 = super.lllIIIllIIIIlllIlIIllIIll(string);
        if (class_16852 == null) {
            class_16852 = (class_1685)this.IlIllllllIIlIIllllIIlIIIl.get(string);
        }
        return (class_1834)class_16852;
    }

    @Override
    public class_1685 lllIlIIlIIIlIlIIIllIlllIl(class_2191 class_21912) {
        if (this.lllIlIIlIIIlIlIIIllIlllIl.containsKey(class_21912.lllIIIllIIIIlllIlIIllIIll())) {
            throw new IllegalArgumentException("Attribute is already registered!");
        }
        class_1834 class_18342 = new class_1834(this, class_21912);
        this.lllIlIIlIIIlIlIIIllIlllIl.put(class_21912.lllIIIllIIIIlllIlIIllIIll(), class_18342);
        if (class_21912 instanceof class_1904 && ((class_1904)class_21912).lIlllIlllIIIIlIIlllIllIII() != null) {
            this.IlIllllllIIlIIllllIIlIIIl.put(((class_1904)class_21912).lIlllIlllIIIIlIIlllIllIII(), class_18342);
        }
        this.lllIIIllIIIIlllIlIIllIIll.put(class_21912, class_18342);
        return class_18342;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1834 class_18342) {
        if (class_18342.lllIIIllIIIIlllIlIIllIIll().IlIllllllIIlIIllllIIlIIIl()) {
            this.lIlllIlllIIIIlIIlllIllIII.add(class_18342);
        }
    }

    public Set lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public Collection IlIllllllIIlIIllllIIlIIIl() {
        HashSet hashSet = Sets.newHashSet();
        for (class_1685 class_16852 : this.lllIIIllIIIIlllIlIIllIIll()) {
            if (!class_16852.lllIIIllIIIIlllIlIIllIIll().IlIllllllIIlIIllllIIlIIIl()) continue;
            hashSet.add(class_16852);
        }
        return hashSet;
    }

    @Override
    public /* synthetic */ class_1685 lllIIIllIIIIlllIlIIllIIll(String string) {
        return this.lllIlIIlIIIlIlIIIllIlllIl(string);
    }

    @Override
    public /* synthetic */ class_1685 lllIIIllIIIIlllIlIIllIIll(class_2191 class_21912) {
        return this.IlIllllllIIlIIllllIIlIIIl(class_21912);
    }
}

