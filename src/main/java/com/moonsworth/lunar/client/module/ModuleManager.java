package com.moonsworth.lunar.client.module;/*
 * Decompiled with CFR 0.150.
 */
import com.moonsworth.lunar.client.events.EventBus;
import com.moonsworth.lunar.client.LunarClient;
import obf.*;

import java.util.ArrayList;
import java.util.List;

public class ModuleManager {
    public final List<AbstractModule> modules = new ArrayList<>();
    public final List<AbstractModule> staffModules;
    public final class_1879 IlIllllllIIlIIllllIIlIIIl = new class_1879();
    public final class_1304 lIlllIlllIIIIlIIlllIllIII;
    public final class_1046 IlIIIIIllllllIIlllIllllll;
    public final class_0192 lIllllIIlIIIlIllllllIIIll;
    public final class_0283 IIIllIIlIIIIIIlIlIIllIIlI;
    public final class_1692 IllIIlllllllIIlIIlIIIIlIl;
    public final class_1169 IIIllIllIIlIlIlIlIllllIIl;
    public final class_0063 IllIIIllIIIIlIlIlIllIIlll;
    public final class_0738 lIIIIlIlIIlllllIIllIIlIII;
    public final class_1473 llIIlllIllIllllIIIlIIIIII;
    public final class_1917 llIIllIllIlIIlIIllIllllll;
    public final class_0757 lllIIlIIIllllllIIIIlIlIlI;
    public final class_1261 IlIlllIIIIIIlIIllIIllIlll;
    public final class_0125 IlIlIIlIlIllIIlIlIIllIIIl;
    public final class_1054 lllllIlllIIllIlIIlIIIllII;
    public final class_0904 IlIlIIlllIIlIllIIIlllllIl;
    public final class_0957 lIIlIIIIIlIlllIlIIlIlIlll;
    public final class_1664 lIlIlIIlIIIIlIIIIIlllIIII;
    public final class_1488 IlIIIlIIIIllIIIllIIIIIIll;
    public final class_0641 IIlllIlIlllIllIIIlllIIlIl;
    public final class_1150 lIlIllIIlIIlIIlIIlIIlIIll;

    public ModuleManager(EventBus class_05022) {
        this.modules.add(this.IlIllllllIIlIIllllIIlIIIl);
        this.lIlllIlllIIIIlIIlllIllIII = new class_1304();
        this.modules.add(this.lIlllIlllIIIIlIIlllIllIII);
        this.IlIIIIIllllllIIlllIllllll = new class_1046();
        this.modules.add(this.IlIIIIIllllllIIlllIllllll);
        this.lIllllIIlIIIlIllllllIIIll = new class_0192();
        this.modules.add(this.lIllllIIlIIIlIllllllIIIll);
        this.IIIllIIlIIIIIIlIlIIllIIlI = new class_0283();
        this.modules.add(this.IIIllIIlIIIIIIlIlIIllIIlI);
        this.IllIIlllllllIIlIIlIIIIlIl = new class_1692();
        this.modules.add(this.IllIIlllllllIIlIIlIIIIlIl);
        this.IIIllIllIIlIlIlIlIllllIIl = new class_1169();
        this.modules.add(this.IIIllIllIIlIlIlIlIllllIIl);
        this.IllIIIllIIIIlIlIlIllIIlll = new class_0063();
        this.modules.add(this.IllIIIllIIIIlIlIlIllIIlll);
        this.lIIIIlIlIIlllllIIllIIlIII = new class_0738();
        this.modules.add(this.lIIIIlIlIIlllllIIllIIlIII);
        this.llIIlllIllIllllIIIlIIIIII = new class_1473();
        this.modules.add(this.llIIlllIllIllllIIIlIIIIII);
        this.llIIllIllIlIIlIIllIllllll = new class_1917();
        this.modules.add(this.llIIllIllIlIIlIIllIllllll);
        this.lllIIlIIIllllllIIIIlIlIlI = new class_0757();
        this.modules.add(this.lllIIlIIIllllllIIIIlIlIlI);
        this.IlIlllIIIIIIlIIllIIllIlll = new class_1261();
        this.modules.add(this.IlIlllIIIIIIlIIllIIllIlll);
        this.IlIlIIlIlIllIIlIlIIllIIIl = new class_0125();
        this.modules.add(this.IlIlIIlIlIllIIlIlIIllIIIl);
        this.staffModules = new ArrayList();
        this.lllllIlllIIllIlIIlIIIllII = new class_1054("xray");
        this.staffModules.add(this.lllllIlllIIllIlIIlIIIllII);
        this.IlIlIIlllIIlIllIIIlllllIl = new class_0904("nametags");
        this.staffModules.add(this.IlIlIIlllIIlIllIIIlllllIl);
        this.lIIlIIIIIlIlllIlIIlIlIlll = new class_0957("noclip");
        this.staffModules.add(this.lIIlIIIIIlIlllIlIIlIlIlll);
        this.lIlIlIIlIIIIlIIIIIlllIIII = new class_1664("bunnyhop");
        this.staffModules.add(this.lIlIlIIlIIIIlIIIIIlllIIII);
        this.lIlIllIIlIIlIIlIIlIIlIIll = new class_1150();
        this.IlIIIlIIIIllIIIllIIIIIIll = new class_1488();
        this.IIlllIlIlllIllIIIlllIIlIl = new class_0641();
        this.IIlllIlIlllIllIIIlllIIlIl.lllIIIllIIIIlllIlIIllIIll(true);
        class_05022.addEvent(class_1016.class, this::lllIIIllIIIIlllIlIIllIIll);
        class_05022.addEvent(class_0288.class, this::lllIIIllIIIIlllIlIIllIIll);
        class_05022.addEvent(class_0780.class, class_07802 -> {
            LunarClient.getInstance().lllIIIllIIIIlllIlIIllIIll("", "", 0);
            for (AbstractModule class_16652 : this.staffModules) {
                class_16652.lllIIIllIIIIlllIlIIllIIll(false);
                class_16652.lIlllIlllIIIIlIIlllIllIII(false);
            }
        });
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_1016 class_10162) {
        if ((Integer) LunarClient.getInstance().getSettingsManager().gsWorldTime.getValue() != -14490) {
            class_10162.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll((long)((Integer) LunarClient.getInstance().getSettingsManager().gsWorldTime.getValue()).intValue());
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_0288 class_02882) {
        if (class_02882.lllIIIllIIIIlllIlIIllIIll() == 0) {
            return;
        }
        for (AbstractModule class_16652 : this.staffModules) {
            class_2256 class_22562 = (class_2256)class_16652;
            if (!class_22562.IlIIIIIllllllIIlllIllllll() || ((Integer)class_22562.lllIIIllIIIIlllIlIIllIIll().getValue()).intValue() != class_02882.lllIIIllIIIIlllIlIIllIIll()) continue;
            class_22562.lllIIIllIIIIlllIlIIllIIll(!class_16652.lIllllIIlIIIlIllllllIIIll());
        }
    }
}

