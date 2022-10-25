package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.commons.lang3.StringUtils
 */
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class class_0823 {
    private String lllIIIllIIIIlllIlIIllIIll = null;
    private final List lllIlIIlIIIlIlIIIllIlllIl = Lists.newArrayList();

    private class_0823() {
    }

    private void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.lllIlIIlIIIlIlIIIllIlllIl.add(0, string);
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        return StringUtils.join((Iterable)this.lllIlIIlIIIlIlIIIllIlllIl, (String)"->");
    }

    public String toString() {
        return this.lllIIIllIIIIlllIlIIllIIll != null ? (!this.lllIlIIlIIIlIlIIIllIlllIl.isEmpty() ? this.lllIIIllIIIIlllIlIIllIIll + " " + this.lllIIIllIIIIlllIlIIllIIll() : this.lllIIIllIIIIlllIlIIllIIll) : (!this.lllIlIIlIIIlIlIIIllIlllIl.isEmpty() ? "(Unknown file) " + this.lllIIIllIIIIlllIlIIllIIll() : "(Unknown file)");
    }

    class_0823(Object object) {
        this();
    }

    static /* synthetic */ void lllIIIllIIIIlllIlIIllIIll(class_0823 class_08232, String string) {
        class_08232.lllIIIllIIIIlllIlIIllIIll(string);
    }

    static /* synthetic */ String lllIlIIlIIIlIlIIIllIlllIl(class_0823 class_08232, String string) {
        class_08232.lllIIIllIIIIlllIlIIllIIll = string;
        return class_08232.lllIIIllIIIIlllIlIIllIIll;
    }
}

