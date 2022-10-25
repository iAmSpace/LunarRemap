package net.minecraft.util;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import obf.*;

import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChatComponentTranslation
extends class_1014 {
    private final String lIlllIlllIIIIlIIlllIllIII;
    private final Object[] IlIIIIIllllllIIlllIllllll;
    private final Object lIllllIIlIIIlIllllllIIIll = new Object();
    private long IIIllIIlIIIIIIlIlIIllIIlI = -1L;
    List lllIlIIlIIIlIlIIIllIlllIl = Lists.newArrayList();
    public static final Pattern IlIllllllIIlIIllllIIlIIIl = Pattern.compile("%(?:(\\d+)\\$)?([A-Za-z%]|$)");

    public ChatComponentTranslation(String string, Object ... arrobject) {
        this.lIlllIlllIIIIlIIlllIllIII = string;
        this.IlIIIIIllllllIIlllIllllll = arrobject;
        Object[] arrobject2 = arrobject;
        int n = arrobject.length;
        for (int i = 0; i < n; ++i) {
            Object object = arrobject2[i];
            if (!(object instanceof IChatComponent)) continue;
            ((IChatComponent)object).lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    synchronized void IlIIIIIllllllIIlllIllllll() {
        Object object = this.lIllllIIlIIIlIllllllIIIll;
        Object object2 = this.lIllllIIlIIIlIllllllIIIll;
        synchronized (object2) {
            long l = class_1586.lllIIIllIIIIlllIlIIllIIll();
            if (l == this.IIIllIIlIIIIIIlIlIIllIIlI) {
                return;
            }
            this.IIIllIIlIIIIIIlIlIIllIIlI = l;
            this.lllIlIIlIIIlIlIIIllIlllIl.clear();
        }
        try {
            this.lllIlIIlIIIlIlIIIllIlllIl(class_1586.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII));
        }
        catch (class_1366 class_13662) {
            this.lllIlIIlIIIlIlIIIllIlllIl.clear();
            try {
                this.lllIlIIlIIIlIlIIIllIlllIl(class_1586.lllIlIIlIIIlIlIIIllIlllIl(this.lIlllIlllIIIIlIIlllIllIII));
            }
            catch (class_1366 class_13663) {
                throw class_13662;
            }
        }
    }

    protected void lllIlIIlIIIlIlIIIllIlllIl(String string) {
        boolean bl = false;
        Matcher matcher = IlIllllllIIlIIllllIIlIIIl.matcher(string);
        int n = 0;
        int n2 = 0;
        try {
            while (matcher.find(n2)) {
                Object object;
                Object object2;
                int n3 = matcher.start();
                int n4 = matcher.end();
                if (n3 > n2) {
                    object2 = new class_0722(String.format(string.substring(n2, n3), new Object[0]));
                    ((class_1014)object2).lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl());
                    this.lllIlIIlIIIlIlIIIllIlllIl.add(object2);
                }
                object2 = matcher.group(2);
                String string2 = string.substring(n3, n4);
                if ("%".equals(object2) && "%%".equals(string2)) {
                    object = new class_0722("%");
                    ((class_1014)object).lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl());
                    this.lllIlIIlIIIlIlIIIllIlllIl.add(object);
                } else {
                    if (!"s".equals(object2)) {
                        throw new class_1366(this, "Unsupported format: '" + string2 + "'");
                    }
                    object = matcher.group(1);
                    int n5 = object != null ? Integer.parseInt((String)object) - 1 : n++;
                    this.lllIlIIlIIIlIlIIIllIlllIl.add(this.lllIIIllIIIIlllIlIIllIIll(n5));
                }
                n2 = n4;
            }
            if (n2 < string.length()) {
                class_0722 class_07222 = new class_0722(String.format(string.substring(n2), new Object[0]));
                class_07222.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl());
                this.lllIlIIlIIIlIlIIIllIlllIl.add(class_07222);
            }
        }
        catch (IllegalFormatException illegalFormatException) {
            throw new class_1366(this, (Throwable)illegalFormatException);
        }
    }

    private IChatComponent lllIIIllIIIIlllIlIIllIIll(int n) {
        IChatComponent class_22552;
        if (n >= this.IlIIIIIllllllIIlllIllllll.length) {
            throw new class_1366(this, n);
        }
        Object object = this.IlIIIIIllllllIIlllIllllll[n];
        if (object instanceof IChatComponent) {
            class_22552 = (IChatComponent)object;
        } else {
            class_22552 = new class_0722(object == null ? "null" : object.toString());
            class_22552.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl());
        }
        return class_22552;
    }

    @Override
    public IChatComponent lllIIIllIIIIlllIlIIllIIll(class_1401 class_14012) {
        super.lllIIIllIIIIlllIlIIllIIll(class_14012);
        for (Object object : this.IlIIIIIllllllIIlllIllllll) {
            if (!(object instanceof IChatComponent)) continue;
            ((IChatComponent)object).lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl());
        }
        if (this.IIIllIIlIIIIIIlIlIIllIIlI > -1L) {
            for (Object object : this.lllIlIIlIIIlIlIIIllIlllIl) {
                object.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(class_14012);
            }
        }
        return this;
    }

    @Override
    public Iterator iterator() {
        this.IlIIIIIllllllIIlllIllllll();
        return Iterators.concat((Iterator) ChatComponentTranslation.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl), (Iterator) ChatComponentTranslation.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll));
    }

    @Override
    public String lIllllIIlIIIlIllllllIIIll() {
        this.IlIIIIIllllllIIlllIllllll();
        StringBuilder stringBuilder = new StringBuilder();
        for (IChatComponent class_22552 : this.lllIlIIlIIIlIlIIIllIlllIl) {
            stringBuilder.append(class_22552.lIllllIIlIIIlIllllllIIIll());
        }
        return stringBuilder.toString();
    }

    public ChatComponentTranslation IIIllIIlIIIIIIlIlIIllIIlI() {
        Object[] arrobject = new Object[this.IlIIIIIllllllIIlllIllllll.length];
        for (int i = 0; i < this.IlIIIIIllllllIIlllIllllll.length; ++i) {
            arrobject[i] = this.IlIIIIIllllllIIlllIllllll[i] instanceof IChatComponent ? ((IChatComponent)this.IlIIIIIllllllIIlllIllllll[i]).IIIllIllIIlIlIlIlIllllIIl() : this.IlIIIIIllllllIIlllIllllll[i];
        }
        ChatComponentTranslation class_17902 = new ChatComponentTranslation(this.lIlllIlllIIIIlIIlllIllIII, arrobject);
        class_17902.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl().lIIIIlIlIIlllllIIllIIlIII());
        for (IChatComponent class_22552 : this.lllIIIllIIIIlllIlIIllIIll()) {
            class_17902.lllIIIllIIIIlllIlIIllIIll(class_22552.IIIllIllIIlIlIlIlIllllIIl());
        }
        return class_17902;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ChatComponentTranslation)) {
            return false;
        }
        ChatComponentTranslation class_17902 = (ChatComponentTranslation)object;
        return Arrays.equals(this.IlIIIIIllllllIIlllIllllll, class_17902.IlIIIIIllllllIIlllIllllll) && this.lIlllIlllIIIIlIIlllIllIII.equals(class_17902.lIlllIlllIIIIlIIlllIllIII) && super.equals(object);
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        n = 31 * n + this.lIlllIlllIIIIlIIlllIllIII.hashCode();
        n = 31 * n + Arrays.hashCode(this.IlIIIIIllllllIIlllIllllll);
        return n;
    }

    @Override
    public String toString() {
        return "TranslatableComponent{key='" + this.lIlllIlllIIIIlIIlllIllIII + '\'' + ", args=" + Arrays.toString(this.IlIIIIIllllllIIlllIllllll) + ", siblings=" + this.lllIIIllIIIIlllIlIIllIIll + ", style=" + this.lllIlIIlIIIlIlIIIllIlllIl() + '}';
    }

    public String IllIIlllllllIIlIIlIIIIlIl() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public Object[] IllIIIllIIIIlIlIlIllIIlll() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    @Override
    public /* synthetic */ IChatComponent IIIllIllIIlIlIlIlIllllIIl() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI();
    }
}

