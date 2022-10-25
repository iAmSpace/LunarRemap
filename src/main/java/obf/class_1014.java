package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 */
import com.google.common.base.Function;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import net.minecraft.util.IChatComponent;

import java.util.Iterator;
import java.util.List;

public abstract class class_1014
implements IChatComponent {
    protected List lllIIIllIIIIlllIlIIllIIll = Lists.newArrayList();
    private class_1401 lllIlIIlIIIlIlIIIllIlllIl;

    @Override
    public IChatComponent lllIIIllIIIIlllIlIIllIIll(IChatComponent class_22552) {
        class_22552.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl());
        this.lllIIIllIIIIlllIlIIllIIll.add(class_22552);
        return this;
    }

    @Override
    public List lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public IChatComponent lllIIIllIIIIlllIlIIllIIll(String string) {
        return this.lllIIIllIIIIlllIlIIllIIll(new class_0722(string));
    }

    @Override
    public IChatComponent lllIIIllIIIIlllIlIIllIIll(class_1401 class_14012) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_14012;
        for (IChatComponent class_22552 : this.lllIIIllIIIIlllIlIIllIIll) {
            class_22552.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl());
        }
        return this;
    }

    @Override
    public class_1401 lllIlIIlIIIlIlIIIllIlllIl() {
        if (this.lllIlIIlIIIlIlIIIllIlllIl == null) {
            this.lllIlIIlIIIlIlIIIllIlllIl = new class_1401();
            for (IChatComponent class_22552 : this.lllIIIllIIIIlllIlIIllIIll) {
                class_22552.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl);
            }
        }
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public Iterator iterator() {
        return Iterators.concat((Iterator)Iterators.forArray((Object[])new class_1014[]{this}), (Iterator)class_1014.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll));
    }

    @Override
    public final String IlIllllllIIlIIllllIIlIIIl() {
        StringBuilder stringBuilder = new StringBuilder();
        for (IChatComponent class_22552 : this) {
            stringBuilder.append(class_22552.lIllllIIlIIIlIllllllIIIll());
        }
        return stringBuilder.toString();
    }

    @Override
    public final String lIlllIlllIIIIlIIlllIllIII() {
        StringBuilder stringBuilder = new StringBuilder();
        for (IChatComponent class_22552 : this) {
            stringBuilder.append(class_22552.lllIlIIlIIIlIlIIIllIlllIl().IllIIIllIIIIlIlIlIllIIlll());
            stringBuilder.append(class_22552.lIllllIIlIIIlIllllllIIIll());
            stringBuilder.append((Object)class_1227.IIlllIlIlllIllIIIlllIIlIl);
        }
        return stringBuilder.toString();
    }

    public static Iterator lllIIIllIIIIlllIlIIllIIll(Iterable iterable) {
        Iterator iterator = Iterators.concat((Iterator)Iterators.transform(iterable.iterator(), (Function)new class_0518()));
        iterator = Iterators.transform((Iterator)iterator, (Function)new class_1321());
        return iterator;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof class_1014)) {
            return false;
        }
        class_1014 class_10142 = (class_1014)object;
        return this.lllIIIllIIIIlllIlIIllIIll.equals(class_10142.lllIIIllIIIIlllIlIIllIIll) && this.lllIlIIlIIIlIlIIIllIlllIl().equals(class_10142.lllIlIIlIIIlIlIIIllIlllIl());
    }

    public int hashCode() {
        return 31 * this.lllIlIIlIIIlIlIIIllIlllIl.hashCode() + this.lllIIIllIIIIlllIlIIllIIll.hashCode();
    }

    public String toString() {
        return "BaseComponent{style=" + this.lllIlIIlIIIlIlIIIllIlllIl + ", siblings=" + this.lllIIIllIIIIlllIlIIllIIll + '}';
    }
}

