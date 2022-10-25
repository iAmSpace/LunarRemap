package obf;/*
 * Decompiled with CFR 0.150.
 */
import com.moonsworth.lunar.client.LunarClient;

import java.awt.Color;
import java.util.List;
import java.util.function.Consumer;

public class class_1609 {
    private final String IlIllllllIIlIIllllIIlIIIl;
    private Object lIlllIlllIIIIlIIlllIllIII;
    private Object IlIIIIIllllllIIlllIllllll;
    private Object lIllllIIlIIIlIllllllIIIll;
    private Object IIIllIIlIIIIIIlIlIIllIIlI;
    private class_1609 IllIIlllllllIIlIIlIIIIlIl;
    private Object[] IIIllIllIIlIlIlIlIllllIIl;
    private Consumer IllIIIllIIIIlIlIlIllIIlll;
    private class_1665 lIIIIlIlIIlllllIIllIIlIII;
    public boolean lllIIIllIIIIlllIlIIllIIll;
    public int[] lllIlIIlIIIlIlIIIllIlllIl;

    public class_1609(String string) {
        this.IlIllllllIIlIIllllIIlIIIl = string;
    }

    public class_1609(class_1665 class_16652, String string) {
        this.lIIIIlIlIIlllllIIllIIlIII = class_16652;
        class_16652.llIIlllIllIllllIIIlIIIIII().add(this);
        this.IlIllllllIIlIIllllIIlIIIl = string;
    }

    public class_1609(List list, String string) {
        list.add(this);
        this.IlIllllllIIlIIllllIIlIIIl = string;
    }

    public int lllIIIllIIIIlllIlIIllIIll() {
        if (this.lllIIIllIIIIlllIlIIllIIll) {
            Integer n = (Integer)this.lIlllIlllIIIIlIIlllIllIII;
            int n2 = n >> 24 & 0xFF;
            float f = (float)System.nanoTime() / 1.0E10f % 1.0f;
            return n2 << 24 | Color.HSBtoRGB(f, 1.0f, 1.0f) & 0xFFFFFF;
        }
        return (Integer)this.lIlllIlllIIIIlIIlllIllIII;
    }

    public Object lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public Object IlIllllllIIlIIllllIIlIIIl() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public Object lIlllIlllIIIIlIIlllIllIII() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public class_1609 IlIIIIIllllllIIlllIllllll() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }

    public String lIllllIIlIIIlIllllllIIIll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public Object IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public Object[] IllIIlllllllIIlIIlIIIIlIl() {
        return this.IIIllIllIIlIlIlIlIllllIIl;
    }

    public class_1609 lllIIIllIIIIlllIlIIllIIll(Object object) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = object;
        return this;
    }

    public boolean IIIllIllIIlIlIlIlIllllIIl() {
        return this.IllIIlllllllIIlIIlIIIIlIl != null && (Boolean)this.IllIIlllllllIIlIIlIIIIlIl.lIlllIlllIIIIlIIlllIllIII() != false;
    }

    public class_1609 lllIlIIlIIIlIlIIIllIlllIl(Object object) {
        return this.lllIIIllIIIIlllIlIIllIIll(object, true);
    }

    public class_1609 lllIIIllIIIIlllIlIIllIIll(Object object, boolean bl) {
        if (LunarClient.getInstance().IlIllllllIIlIIllllIIlIIIl != null && LunarClient.getInstance().IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll().equals("default")) {
            if (bl) {
                LunarClient.getInstance().lllIIlIIIllllllIIIIlIlIlI();
            }
        } else if (this.lIIIIlIlIIlllllIIllIIlIII != null) {
            this.lIIIIlIlIIlllllIIllIIlIII.llIIllIllIlIIlIIllIllllll().add(object);
        }
        this.lIlllIlllIIIIlIIlllIllIII = object;
        if (this.IllIIIllIIIIlIlIlIllIIlll != null) {
            this.IllIIIllIIIIlIlIlIllIIlll.accept(object);
        }
        return this;
    }

    public class_1609 lllIIIllIIIIlllIlIIllIIll(Object ... arrobject) {
        this.IIIllIllIIlIlIlIlIllllIIl = arrobject;
        return this;
    }

    public class_1609 lllIIIllIIIIlllIlIIllIIll(Consumer consumer) {
        this.IllIIIllIIIIlIlIlIllIIlll = consumer;
        return this;
    }

    public class_1609 lllIIIllIIIIlllIlIIllIIll(Object object, Object object2) {
        this.IlIIIIIllllllIIlllIllllll = object;
        this.lIllllIIlIIIlIllllllIIIll = object2;
        return this;
    }

    public class_1609 lllIIIllIIIIlllIlIIllIIll(class_1609 class_16092) {
        if (class_16092.IllIIIllIIIIlIlIlIllIIlll() != class_1318.lIllllIIlIIIlIllllllIIIll) {
            throw new class_1059("Parent can only be boolean.");
        }
        this.IllIIlllllllIIlIIlIIIIlIl = class_16092;
        return this;
    }

    public class_1318 IllIIIllIIIIlIlIlIllIIlll() {
        if (this.lIlllIlllIIIIlIIlllIllIII.getClass().isAssignableFrom(Boolean.class)) {
            return class_1318.lIllllIIlIIIlIllllllIIIll;
        }
        if (this.lIlllIlllIIIIlIIlllIllIII.getClass().isAssignableFrom(String.class)) {
            if (this.IIIllIllIIlIlIlIlIllllIIl == null || this.IIIllIllIIlIlIlIlIllllIIl.length == 0) {
                return class_1318.lllIIIllIIIIlllIlIIllIIll;
            }
            return class_1318.lllIlIIlIIIlIlIIIllIlllIl;
        }
        if (this.lIlllIlllIIIIlIIlllIllIII.getClass().isAssignableFrom(Float.class)) {
            return class_1318.IlIllllllIIlIIllllIIlIIIl;
        }
        if (this.lIlllIlllIIIIlIIlllIllIII.getClass().isAssignableFrom(Double.class)) {
            return class_1318.IlIIIIIllllllIIlllIllllll;
        }
        if (this.lIlllIlllIIIIlIIlllIllIII.getClass().isAssignableFrom(String[].class)) {
            return class_1318.lllIlIIlIIIlIlIIIllIlllIl;
        }
        if (this.lIlllIlllIIIIlIIlllIllIII.getClass().isAssignableFrom(Integer.class)) {
            return class_1318.lIlllIlllIIIIlIIlllIllIII;
        }
        return null;
    }
}

