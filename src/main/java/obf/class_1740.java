package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.ImmutableBiMap
 *  com.moonsworth.client.nethandler.LCPacket
 *  com.moonsworth.client.nethandler.client.LCPacketEmoteBroadcast
 */
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.moonsworth.client.nethandler.LCPacket;
import com.moonsworth.client.nethandler.client.LCPacketEmoteBroadcast;
import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class class_1740 {
    public static final BiMap lllIIIllIIIIlllIlIIllIIll = ImmutableBiMap.builder().put((Object)0, class_1143.class).put((Object)1, class_1842.class).put((Object)2, class_0465.class).put((Object)3, class_1643.class).put((Object)4, class_2001.class).put((Object)5, class_0468.class).put((Object)6, class_0732.class).build();
    private final Map lIlllIlllIIIIlIIlllIllIII = new HashMap();
    private List IlIIIIIllllllIIlllIllllll = new ArrayList();
    boolean lllIlIIlIIIlIlIIIllIlllIl;
    boolean IlIllllllIIlIIllllIIlIIIl;

    public class_1740() {
        LunarClient.getInstance().getEventBus().addEvent(class_0312.class, this::lllIIIllIIIIlllIlIIllIIll);
        LunarClient.getInstance().getEventBus().addEvent(class_0387.class, this::lllIIIllIIIIlllIlIIllIIll);
        LunarClient.getInstance().getEventBus().addEvent(class_0479.class, class_04792 -> {
            if (class_04792.lllIIIllIIIIlllIlIIllIIll() == 0 && class_04792.lllIlIIlIIIlIlIIIllIlllIl()) {
                this.lllIIIllIIIIlllIlIIllIIll(Minecraft.getMinecraft().lIIIIlIlIIlllllIIllIIlIII);
            }
        });
        LunarClient.getInstance().getEventBus().addEvent(class_0288.class, class_02882 -> {
            if (Minecraft.getMinecraft().lllllIlllIIllIlIIlIIIllII == null && !this.IlIIIIIllllllIIlllIllllll.isEmpty() && class_02882.lllIIIllIIIIlllIlIIllIIll() == LunarClient.getInstance().getSettingsManager().IlIllllllIIlIIllllIIlIIIl.IIIllIllIIlIlIlIlIllllIIl()) {
                Minecraft.getMinecraft().lllIIIllIIIIlllIlIIllIIll(new class_0784(class_02882.lllIIIllIIIIlllIlIIllIIll()));
            }
        });
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0764 class_07642) {
        if (!this.lllIlIIlIIIlIlIIIllIlllIl(class_07642)) {
            return;
        }
        if (this.lllIlIIlIIIlIlIIIllIlllIl) {
            this.lllIlIIlIIIlIlIIIllIlllIl = false;
            this.IlIllllllIIlIIllllIIlIIIl = true;
        }
        this.lllIIIllIIIIlllIlIIllIIll(Minecraft.getMinecraft().lIIIIlIlIIlllllIIllIIlIII);
        int n = (Integer)lllIIIllIIIIlllIlIIllIIll.inverse().get(class_07642.getClass());
        LunarClient.getInstance().getNetworkManager().lllIIIllIIIIlllIlIIllIIll((LCPacket)new LCPacketEmoteBroadcast(Minecraft.getMinecraft().lIIIIlIlIIlllllIIllIIlIII.lIIlllIIlIlIlIIIlIlllIIll(), n));
    }

    private boolean lllIlIIlIIIlIlIIIllIlllIl(class_0764 class_07642) {
        return true;
    }

    public class_0764 lllIIIllIIIIlllIlIIllIIll(int n) {
        if (!lllIIIllIIIIlllIlIIllIIll.containsKey((Object)n)) {
            return null;
        }
        try {
            return (class_0764)((Class)lllIIIllIIIIlllIlIIllIIll.get((Object)n)).newInstance();
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_2174 class_21742, class_0764 class_07642) {
        if (class_21742.lIIlllIIlIlIlIIIlIlllIIll().equals(Minecraft.getMinecraft().lIIIIlIlIIlllllIIllIIlIII.lIIlllIIlIlIlIIIlIlllIIll())) {
            if (Minecraft.getMinecraft().gameSettings.IIlIlIlIIlllIIIlIIIIlIIIl == 0 || this.IlIllllllIIlIIllllIIlIIIl) {
                Minecraft.getMinecraft().gameSettings.IIlIlIlIIlllIIIlIIIIlIIIl = 1;
                this.lllIlIIlIIIlIlIIIllIlllIl = true;
            }
            this.IlIllllllIIlIIllllIIlIIIl = false;
        }
        this.lIlllIlllIIIIlIIlllIllIII.putIfAbsent(class_21742.lIIlllIIlIlIlIIIlIlllIIll(), class_07642);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_2174 class_21742) {
        if (this.lIlllIlllIIIIlIIlllIllIII.containsKey(class_21742.lIIlllIIlIlIlIIIlIlllIIll())) {
            class_0764 class_07642 = (class_0764)this.lIlllIlllIIIIlIIlllIllIII.get(class_21742.lIIlllIIlIlIlIIIlIlllIIll());
            class_07642.lllIIIllIIIIlllIlIIllIIll(class_21742);
            this.lIlllIlllIIIIlIIlllIllIII.remove(class_21742.lIIlllIIlIlIlIIIlIlllIIll());
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_0312 class_03122) {
        if (!this.lIlllIlllIIIIlIIlllIllIII.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            this.lIlllIlllIIIIlIIlllIllIII.forEach((uUID, class_07642) -> {
                class_0814 class_08142 = Minecraft.getMinecraft().theWorld.lllIIIllIIIIlllIlIIllIIll((UUID)uUID);
                if (class_07642.lllIIIllIIIIlllIlIIllIIll()) {
                    class_07642.lllIIIllIIIIlllIlIIllIIll((class_2174)class_08142);
                    arrayList.add(uUID);
                }
            });
            arrayList.forEach(this.lIlllIlllIIIIlIIlllIllIII::remove);
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_0387 class_03872) {
        class_0764 class_07642 = (class_0764)this.lIlllIlllIIIIlIIlllIllIII.get(class_03872.lllIlIIlIIIlIlIIIllIlllIl().lIIlllIIlIlIlIIIlIlllIIll());
        if (class_07642 != null) {
            if (class_03872.lllIIIllIIIIlllIlIIllIIll() == class_1880.lllIIIllIIIIlllIlIIllIIll) {
                class_07642.lllIIIllIIIIlllIlIIllIIll(class_03872.lllIlIIlIIIlIlIIIllIlllIl(), class_03872.IlIllllllIIlIIllllIIlIIIl(), class_03872.lIlllIlllIIIIlIIlllIllIII());
            } else {
                class_07642.lllIIIllIIIIlllIlIIllIIll(class_03872.lllIlIIlIIIlIlIIIllIlllIl(), class_03872.lIlllIlllIIIIlIIlllIllIII());
            }
        }
    }

    public List lllIIIllIIIIlllIlIIllIIll() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public void lllIIIllIIIIlllIlIIllIIll(List list) {
        this.IlIIIIIllllllIIlllIllllll = list;
    }
}

