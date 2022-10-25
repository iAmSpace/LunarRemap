package com.moonsworth.lunar.client.config;/*
 * Decompiled with CFR 0.150.
 */
import com.moonsworth.lunar.client.LunarClient;
import obf.class_1059;
import obf.class_1318;
import obf.AbstractModule;

import java.awt.Color;
import java.util.List;
import java.util.function.Consumer;

public class Setting {
    private final String name;
    private Object lIlllIlllIIIIlIIlllIllIII;
    private Object IlIIIIIllllllIIlllIllllll;
    private Object lIllllIIlIIIlIllllllIIIll;
    private Object IIIllIIlIIIIIIlIlIIllIIlI;
    private Setting IllIIlllllllIIlIIlIIIIlIl;
    private Object[] IIIllIllIIlIlIlIlIllllIIl;
    private Consumer IllIIIllIIIIlIlIlIllIIlll;
    private AbstractModule lIIIIlIlIIlllllIIllIIlIII;
    public boolean lllIIIllIIIIlllIlIIllIIll;
    public int[] lllIlIIlIIIlIlIIIllIlllIl;

    public Setting(String string) {
        this.name = string;
    }

    public Setting(AbstractModule class_16652, String string) {
        this.lIIIIlIlIIlllllIIllIIlIII = class_16652;
        class_16652.llIIlllIllIllllIIIlIIIIII().add(this);
        this.name = string;
    }

    public Setting(List list, String string) {
        list.add(this);
        this.name = string;
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

    public Object getValue() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public Setting IlIIIIIllllllIIlllIllllll() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }

    public String getName() {
        return this.name;
    }

    public Object IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public Object[] IllIIlllllllIIlIIlIIIIlIl() {
        return this.IIIllIllIIlIlIlIlIllllIIl;
    }

    public Setting lllIIIllIIIIlllIlIIllIIll(Object object) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = object;
        return this;
    }

    public boolean IIIllIllIIlIlIlIlIllllIIl() {
        return this.IllIIlllllllIIlIIlIIIIlIl != null && (Boolean)this.IllIIlllllllIIlIIlIIIIlIl.getValue() != false;
    }

    public Setting setValue(Object object) {
        return this.lllIIIllIIIIlllIlIIllIIll(object, true);
    }

    public Setting lllIIIllIIIIlllIlIIllIIll(Object object, boolean bl) {
        if (LunarClient.getInstance().activeProfile != null && LunarClient.getInstance().activeProfile.getName().equals("default")) {
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

    public Setting setAcceptedValues(Object ... arrobject) {
        this.IIIllIllIIlIlIlIlIllllIIl = arrobject;
        return this;
    }

    public Setting onChange(Consumer consumer) {
        this.IllIIIllIIIIlIlIlIllIIlll = consumer;
        return this;
    }

    public Setting setMinMax(Object object, Object object2) {
        this.IlIIIIIllllllIIlllIllllll = object;
        this.lIllllIIlIIIlIllllllIIIll = object2;
        return this;
    }

    public Setting lllIIIllIIIIlllIlIIllIIll(Setting class_16092) {
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

