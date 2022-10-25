package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.GameSettings;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class class_1605 {
    protected static final FileFilter lllIIIllIIIIlllIlIIllIIll = new class_1225();
    private final File lIlllIlllIIIIlIIlllIllIII;
    public final class_0449 lllIlIIlIIIlIlIIIllIlllIl;
    private final File IlIIIIIllllllIIlllIllllll;
    public final class_0233 IlIllllllIIlIIllllIIlIIIl;
    private class_0449 lIllllIIlIIIlIllllllIIIll;
    private boolean IIIllIIlIIIIIIlIlIIllIIlI;
    private List<class_0025> IllIIlllllllIIlIIlIIIIlIl = Lists.newArrayList();
    private List<class_0025> IIIllIllIIlIlIlIlIllllIIl = Lists.newArrayList();

    public class_1605(File file, File file2, class_0449 class_04492, class_0233 class_02332, GameSettings class_17512) {
        this.lIlllIlllIIIIlIIlllIllIII = file;
        this.IlIIIIIllllllIIlllIllllll = file2;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_04492;
        this.IlIllllllIIlIIllllIIlIIIl = class_02332;
        this.IIIllIIlIIIIIIlIlIIllIIlI();
        this.lllIIIllIIIIlllIlIIllIIll();
        block0: for (String string : class_17512.resourcePacks) {
            for (class_0025 class_00252 : this.IllIIlllllllIIlIIlIIIIlIl) {
                if (!class_00252.lIlllIlllIIIIlIIlllIllIII().equals(string)) continue;
                this.IIIllIllIIlIlIlIlIllllIIl.add(class_00252);
                continue block0;
            }
        }
    }

    private void IIIllIIlIIIIIIlIlIIllIIlI() {
        if (!this.lIlllIlllIIIIlIIlllIllIII.isDirectory()) {
            this.lIlllIlllIIIIlIIlllIllIII.delete();
            this.lIlllIlllIIIIlIIlllIllIII.mkdirs();
        }
    }

    private List IllIIlllllllIIlIIlIIIIlIl() {
        return this.lIlllIlllIIIIlIIlllIllIII.isDirectory() ? Arrays.asList(this.lIlllIlllIIIIlIIlllIllIII.listFiles(lllIIIllIIIIlllIlIIllIIll)) : Collections.emptyList();
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        ArrayList arrayList = Lists.newArrayList();
        for (Object object : this.IllIIlllllllIIlIIlIIIIlIl()) {
            class_0025 class_00252 = new class_0025(this, (File)object, null);
            if (!this.IllIIlllllllIIlIIlIIIIlIl.contains(class_00252)) {
                try {
                    class_00252.lllIIIllIIIIlllIlIIllIIll();
                    arrayList.add(class_00252);
                }
                catch (Exception exception) {
                    arrayList.remove(class_00252);
                }
                continue;
            }
            int n = this.IllIIlllllllIIlIIlIIIIlIl.indexOf(class_00252);
            if (n <= -1 || n >= this.IllIIlllllllIIlIIlIIIIlIl.size()) continue;
            arrayList.add(this.IllIIlllllllIIlIIlIIIIlIl.get(n));
        }
        this.IllIIlllllllIIlIIlIIIIlIl.removeAll(arrayList);
        for (Object object : this.IllIIlllllllIIlIIlIIIIlIl) {
            ((class_0025)object).lllIlIIlIIIlIlIIIllIlllIl();
        }
        this.IllIIlllllllIIlIIlIIIIlIl = arrayList;
    }

    public List lllIlIIlIIIlIlIIIllIlllIl() {
        return ImmutableList.copyOf((Collection)this.IllIIlllllllIIlIIlIIIIlIl);
    }

    public List<class_0025> IlIllllllIIlIIllllIIlIIIl() {
        return ImmutableList.copyOf((Collection)this.IIIllIllIIlIlIlIlIllllIIl);
    }

    public void lllIIIllIIIIlllIlIIllIIll(List list) {
        this.IIIllIllIIlIlIlIlIllllIIl.clear();
        this.IIIllIllIIlIlIlIlIllllIIl.addAll(list);
    }

    public File lIlllIlllIIIIlIIlllIllIII() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        String string2 = string.substring(string.lastIndexOf("/") + 1);
        if (string2.contains("?")) {
            string2 = string2.substring(0, string2.indexOf("?"));
        }
        if (string2.endsWith(".zip")) {
            File file = new File(this.IlIIIIIllllllIIlllIllllll, string2.replaceAll("\\W", ""));
            this.lIllllIIlIIIlIllllllIIIll();
            this.lllIIIllIIIIlllIlIIllIIll(string, file);
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(String string, File file) {
        HashMap hashMap = Maps.newHashMap();
        class_0849 class_08492 = new class_0849();
        hashMap.put("X-Minecraft-Username", Minecraft.getMinecraft().getSession().getUsername());
        hashMap.put("X-Minecraft-UUID", Minecraft.getMinecraft().getSession().getPlayerID());
        hashMap.put("X-Minecraft-Version", "1.7.10");
        this.IIIllIIlIIIIIIlIlIIllIIlI = true;
        Minecraft.getMinecraft().lllIIIllIIIIlllIlIIllIIll(class_08492);
        HttpUtil.lllIIIllIIIIlllIlIIllIIll(file, string, new class_1593(this), hashMap, 0x3200000, class_08492, Minecraft.getMinecraft().lllIIIIIIlIlllIIlIlIIIllI());
    }

    public class_0449 IlIIIIIllllllIIlllIllllll() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public void lIllllIIlIIIlIllllllIIIll() {
        this.lIllllIIlIIIlIllllllIIIll = null;
        this.IIIllIIlIIIIIIlIlIIllIIlI = false;
    }

    static /* synthetic */ boolean lllIIIllIIIIlllIlIIllIIll(class_1605 class_16052) {
        return class_16052.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    static /* synthetic */ boolean lllIIIllIIIIlllIlIIllIIll(class_1605 class_16052, boolean bl) {
        class_16052.IIIllIIlIIIIIIlIlIIllIIlI = bl;
        return class_16052.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    static /* synthetic */ class_0449 lllIIIllIIIIlllIlIIllIIll(class_1605 class_16052, class_0449 class_04492) {
        class_16052.lIllllIIlIIIlIllllllIIIll = class_04492;
        return class_16052.lIllllIIlIIIlIllllllIIIll;
    }
}

