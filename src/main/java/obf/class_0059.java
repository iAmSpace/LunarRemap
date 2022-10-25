package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.base.Joiner
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_0059
implements class_1900 {
    private static final Logger lllIIIllIIIIlllIlIIllIIll = LogManager.getLogger();
    private static final Joiner lllIlIIlIIIlIlIIIllIlllIl = Joiner.on((String)", ");
    private final Map IlIllllllIIlIIllllIIlIIIl = Maps.newHashMap();
    private final List lIlllIlllIIIIlIIlllIllIII = Lists.newArrayList();
    private final Set IlIIIIIllllllIIlllIllllll = Sets.newLinkedHashSet();
    private final class_0233 lIllllIIlIIIlIllllllIIIll;

    public class_0059(class_0233 class_02332) {
        this.lIllllIIlIIIlIllllllIIIll = class_02332;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0449 class_04492) {
        for (String string : class_04492.lllIIIllIIIIlllIlIIllIIll()) {
            this.IlIIIIIllllllIIlllIllllll.add(string);
            class_1290 class_12902 = (class_1290)this.IlIllllllIIlIIllllIIlIIIl.get(string);
            if (class_12902 == null) {
                class_12902 = new class_1290(this.lIllllIIlIIIlIllllllIIIll);
                this.IlIllllllIIlIIllllIIlIIIl.put(string, class_12902);
            }
            class_12902.lllIIIllIIIIlllIlIIllIIll(class_04492);
        }
    }

    @Override
    public Set lllIIIllIIIIlllIlIIllIIll() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    @Override
    public class_2234 getResource(ResourceLocation class_17732) {
        class_0947 class_09472 = (class_0947)this.IlIllllllIIlIIllllIIlIIIl.get(class_17732.lllIlIIlIIIlIlIIIllIlllIl());
        if (class_09472 != null) {
            return class_09472.getResource(class_17732);
        }
        throw new FileNotFoundException(class_17732.toString());
    }

    @Override
    public List lllIlIIlIIIlIlIIIllIlllIl(ResourceLocation class_17732) {
        class_0947 class_09472 = (class_0947)this.IlIllllllIIlIIllllIIlIIIl.get(class_17732.lllIlIIlIIIlIlIIIllIlllIl());
        if (class_09472 != null) {
            return class_09472.lllIlIIlIIIlIlIIIllIlllIl(class_17732);
        }
        throw new FileNotFoundException(class_17732.toString());
    }

    private void lllIlIIlIIIlIlIIIllIlllIl() {
        this.IlIllllllIIlIIllllIIlIIIl.clear();
        this.IlIIIIIllllllIIlllIllllll.clear();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(List list) {
        this.lllIlIIlIIIlIlIIIllIlllIl();
        lllIIIllIIIIlllIlIIllIIll.info("Reloading ResourceManager: " + lllIlIIlIIIlIlIIIllIlllIl.join(Iterables.transform((Iterable)list, (Function)new class_1109(this))));
        for (class_0449 class_04492 : list) {
            this.lllIIIllIIIIlllIlIIllIIll(class_04492);
        }
        this.IlIllllllIIlIIllllIIlIIIl();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0334 class_03342) {
        this.lIlllIlllIIIIlIIlllIllIII.add(class_03342);
        class_03342.lllIIIllIIIIlllIlIIllIIll(this);
    }

    private void IlIllllllIIlIIllllIIlIIIl() {
        for (class_0334 class_03342 : this.lIlllIlllIIIIlIIlllIllIII) {
            class_03342.lllIIIllIIIIlllIlIIllIIll(this);
        }
    }
}

