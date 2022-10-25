package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.Minecraft;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class class_0064 {
    private final Map lllIIIllIIIIlllIlIIllIIll = new HashMap();
    private final Map lllIlIIlIIIlIlIIIllIlllIl = new HashMap();
    private final Map IlIllllllIIlIIllllIIlIIIl = new HashMap();
    private final Map lIlllIlllIIIIlIIlllIllIII = new HashMap();
    private final Map IlIIIIIllllllIIlllIllllll = new HashMap();
    private final DateTimeFormatter lIllllIIlIIIlIllllllIIIll = DateTimeFormatter.ofPattern("HH:mm:ss");

    public void lllIIIllIIIIlllIlIIllIIll(String string, String string2) {
        class_0115 class_01152 = this.lllIlIIlIIIlIlIIIllIlllIl(string);
        if (class_01152 == null) {
            return;
        }
        if (!this.lIlllIlllIIIIlIIlllIllIII.containsKey(string)) {
            this.lIlllIlllIIIIlIIlllIllIII.put(string, new ArrayList());
        }
        String string3 = (Object)((Object) EnumChatFormatting.GRAY) + LocalDateTime.now().format(this.lIllllIIlIIIlIllllllIIIll);
        String string4 = (Object)((Object) EnumChatFormatting.GREEN) + class_01152.lIlllIlllIIIIlIIlllIllIII() + (Object)((Object) EnumChatFormatting.RESET);
        String string5 = string3 + " " + string4 + ": " + string2;
        ((List)this.lIlllIlllIIIIlIIlllIllIII.get(string)).add(string5);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(String string, String string2) {
        class_0115 class_01152 = this.lllIlIIlIIIlIlIIIllIlllIl(string);
        if (class_01152 == null) {
            return;
        }
        if (!this.IlIllllllIIlIIllllIIlIIIl.containsKey(string)) {
            this.IlIllllllIIlIIllllIIlIIIl.put(string, new ArrayList());
        }
        ((List)this.IlIllllllIIlIIllllIIlIIIl.get(string)).add(string2);
    }

    public void IlIllllllIIlIIllllIIlIIIl(String string, String string2) {
        class_0115 class_01152 = this.lllIlIIlIIIlIlIIIllIlllIl(string);
        if (class_01152 == null) {
            return;
        }
        if (!this.IlIIIIIllllllIIlllIllllll.containsKey(string)) {
            this.IlIIIIIllllllIIlllIllllll.put(string, new ArrayList());
        }
        ((List)this.IlIIIIIllllllIIlllIllllll.get(string)).add(class_01152.lIlllIlllIIIIlIIlllIllIII() + ": " + string2);
        String string3 = (Object)((Object) EnumChatFormatting.GRAY) + LocalDateTime.now().format(this.lIllllIIlIIIlIllllllIIIll);
        String string4 = (Object)((Object) EnumChatFormatting.AQUA) + Minecraft.getMinecraft().getSession().getUsername() + (Object)((Object) EnumChatFormatting.RESET);
        String string5 = string3 + " " + string4 + ": " + string2;
        this.lllIlIIlIIIlIlIIIllIlllIl(string, string5);
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        if (this.lIlllIlllIIIIlIIlllIllIII.containsKey(string)) {
            List list = (List)this.lIlllIlllIIIIlIIlllIllIII.get(string);
            if (!this.IlIllllllIIlIIllllIIlIIIl.containsKey(string)) {
                this.IlIllllllIIlIIllllIIlIIIl.put(string, new ArrayList());
            }
            ((List)this.IlIllllllIIlIIllllIIlIIIl.get(string)).addAll(list);
            this.lIlllIlllIIIIlIIlllIllIII.remove(string);
        }
    }

    public class_0115 lllIlIIlIIIlIlIIIllIlllIl(String string) {
        for (class_0115 class_01152 : this.lllIIIllIIIIlllIlIIllIIll.values()) {
            if (!class_01152.IlIllllllIIlIIllllIIlIIIl().equals(string)) continue;
            return class_01152;
        }
        return null;
    }

    public Map lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public Map lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public Map IlIllllllIIlIIllllIIlIIIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public Map lIlllIlllIIIIlIIlllIllIII() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public Map IlIIIIIllllllIIlllIllllll() {
        return this.IlIIIIIllllllIIlllIllllll;
    }
}

