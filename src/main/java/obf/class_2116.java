package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.authlib.GameProfile
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.authlib.GameProfile;
import java.io.File;
import java.net.SocketAddress;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import net.minecraft.stats.StatList;
import net.minecraft.util.ChatComponentTranslation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class class_2116 {
    public static final File lllIIIllIIIIlllIlIIllIIll = new File("banned-players.json");
    public static final File lllIlIIlIIIlIlIIIllIlllIl = new File("banned-ips.json");
    public static final File IlIllllllIIlIIllllIIlIIIl = new File("ops.json");
    public static final File lIlllIlllIIIIlIIlllIllIII = new File("whitelist.json");
    private static final Logger IIIllIIlIIIIIIlIlIIllIIlI = LogManager.getLogger();
    private static final SimpleDateFormat IllIIlllllllIIlIIlIIIIlIl = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
    private final class_0220 IIIllIllIIlIlIlIlIllllIIl;
    public final List IlIIIIIllllllIIlllIllllll = new ArrayList();
    private final class_1771 IllIIIllIIIIlIlIlIllIIlll = new class_1771(lllIIIllIIIIlllIlIIllIIll);
    private final class_1644 lIIIIlIlIIlllllIIllIIlIII = new class_1644(lllIlIIlIIIlIlIIIllIlllIl);
    private final class_0716 llIIlllIllIllllIIIlIIIIII = new class_0716(IlIllllllIIlIIllllIIlIIIl);
    private final class_1137 llIIllIllIlIIlIIllIllllll = new class_1137(lIlllIlllIIIIlIIlllIllIII);
    private final Map lllIIlIIIllllllIIIIlIlIlI = Maps.newHashMap();
    private class_0735 IlIlllIIIIIIlIIllIIllIlll;
    private boolean IlIlIIlIlIllIIlIlIIllIIIl;
    protected int lIllllIIlIIIlIllllllIIIll;
    private int lllllIlllIIllIlIIlIIIllII;
    private class_2243 IlIlIIlllIIlIllIIIlllllIl;
    private boolean lIIlIIIIIlIlllIlIIlIlIlll;
    private int lIlIlIIlIIIIlIIIIIlllIIII;

    public class_2116(class_0220 class_02202) {
        this.IIIllIllIIlIlIlIlIllllIIl = class_02202;
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(false);
        this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(false);
        this.lIllllIIlIIIlIllllllIIIll = 8;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0800 class_08002, class_1822 class_18222) {
        Object object2;
        GameProfile gameProfile = class_18222.lIIlIlllIIlIIIIlIlIIIIlll();
        class_2119 class_21192 = this.IIIllIllIIlIlIlIlIllllIIl.IlIIllIlIlIllIIIlIIlIlIIl();
        GameProfile gameProfile2 = class_21192.lllIIIllIIIIlllIlIIllIIll(gameProfile.getId());
        String string = gameProfile2 == null ? gameProfile.getName() : gameProfile2.getName();
        class_21192.lllIIIllIIIIlllIlIIllIIll(gameProfile);
        class_0775 class_07752 = this.lllIlIIlIIIlIlIIIllIlllIl(class_18222);
        class_18222.lllIIIllIIIIlllIlIIllIIll(this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(class_18222.lIIllllllllIlIllllllllIlI));
        class_18222.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll((class_0976)class_18222.lIlIllIIlIIlIIlIIlIIlIIll);
        String string2 = "local";
        if (class_08002.lllIlIIlIIIlIlIIIllIlllIl() != null) {
            string2 = class_08002.lllIlIIlIIIlIlIIIllIlllIl().toString();
        }
        IIIllIIlIIIIIIlIlIIllIIlI.info(class_18222.llllIIIIlIIIlIIIIIIlIllll() + "[" + string2 + "] logged in with entity id " + class_18222.llllllIlIllllIlIlIlIIIIlI() + " at (" + class_18222.IlIIlllllIIlIlIlllllIllll + ", " + class_18222.llIIlIlIlllIIllIlIlllIllI + ", " + class_18222.IllIIIIllIIllIllIlllIlIIl + ")");
        class_0976 class_09762 = this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(class_18222.lIIllllllllIlIllllllllIlI);
        class_2208 class_22082 = class_09762.lIlIllIIlIIlIIlIIlIIlIIll();
        this.lllIIIllIIIIlllIlIIllIIll(class_18222, null, class_09762);
        class_0634 class_06342 = new class_0634(this.IIIllIllIIlIlIlIlIllllIIl, class_08002, class_18222);
        class_06342.lllIIIllIIIIlllIlIIllIIll(new class_0597(class_18222.llllllIlIllllIlIlIlIIIIlI(), class_18222.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(), class_09762.lIlllIlllIlIIIIlllIlIlIIl().lIlIlIIlIIIIlIIIIIlllIIII(), class_09762.IlIlIIlllIIlIllIIIlllllIl.IIIllIllIIlIlIlIlIllllIIl, class_09762.IlIlIIlIlIllIIlIlIIllIIIl, this.lllllIlllIIllIlIIlIIIllII(), class_09762.lIlllIlllIlIIIIlllIlIlIIl().IlIIIlIIIIllIIIllIIIIIIll()));
        class_06342.lllIIIllIIIIlllIlIIllIIll(new class_1147("MC|Brand", this.IlIllllllIIlIIllllIIlIIIl().lIlllIlllIlIIIIlllIlIlIIl().getBytes(Charsets.UTF_8)));
        class_06342.lllIIIllIIIIlllIlIIllIIll(new class_1444(class_22082.lllIIIllIIIIlllIlIIllIIll, class_22082.lllIlIIlIIIlIlIIIllIlllIl, class_22082.IlIllllllIIlIIllllIIlIIIl));
        class_06342.lllIIIllIIIIlllIlIIllIIll(new class_1170(class_18222.lIIlIlIlIlIllIIlIIllllIll));
        class_06342.lllIIIllIIIIlllIlIIllIIll(new class_0805(class_18222.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl));
        class_18222.IllIIIIllIIllIllIlllIlIIl().lIlllIlllIIIIlIIlllIllIII();
        class_18222.IllIIIIllIIllIllIlllIlIIl().lllIlIIlIIIlIlIIIllIlllIl(class_18222);
        this.lllIIIllIIIIlllIlIIllIIll((class_2183)class_09762.IlIlIIlllIllllllllIIIlIlI(), class_18222);
        this.IIIllIllIIlIlIlIlIllllIIl.lIlllIIllIIIIIIlIlIIlIllI();
        ChatComponentTranslation class_17902 = !class_18222.llllIIIIlIIIlIIIIIIlIllll().equalsIgnoreCase(string) ? new ChatComponentTranslation("multiplayer.player.joined.renamed", class_18222.llIIIIllIIIIIIIlIIIlIIIIl(), string) : new ChatComponentTranslation("multiplayer.player.joined", class_18222.llIIIIllIIIIIIIlIIIlIIIIl());
        class_17902.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(class_1227.IlIlllIIIIIIlIIllIIllIlll);
        this.lllIIIllIIIIlllIlIIllIIll(class_17902);
        this.IlIllllllIIlIIllllIIlIIIl(class_18222);
        class_06342.lllIIIllIIIIlllIlIIllIIll(class_18222.IlIIlllllIIlIlIlllllIllll, class_18222.llIIlIlIlllIIllIlIlllIllI, class_18222.IllIIIIllIIllIllIlllIlIIl, class_18222.IIIIlIllIlIIlIIlIllIlIlll, class_18222.IlIlIIlllIllllllllIIIlIlI);
        this.lllIlIIlIIIlIlIIIllIlllIl(class_18222, class_09762);
        if (this.IIIllIllIIlIlIlIlIllllIIl.lllIIIIIIlIlllIIlIlIIIllI().length() > 0) {
            class_18222.lllIIIllIIIIlllIlIIllIIll(this.IIIllIllIIlIlIlIlIllllIIl.lllIIIIIIlIlllIIlIlIIIllI());
        }
        for (Object object2 : class_18222.IIllIIIlIIllllIIIIIIIIlll()) {
            class_06342.lllIIIllIIIIlllIlIIllIIll(new class_0570(class_18222.llllllIlIllllIlIlIlIIIIlI(), (class_1852)object2));
        }
        class_18222.IlIIIIIllllllIIlllIllllll();
        if (class_07752 != null && class_07752.lllIlIIlIIIlIlIIIllIlllIl("Riding", 10) && (object2 = class_0054.lllIIIllIIIIlllIlIIllIIll(class_07752.llIIllIllIlIIlIIllIllllll("Riding"), (class_1334)class_09762)) != null) {
            ((class_1521)object2).IIlllIlIlllIllIIIlllIIlIl = true;
            class_09762.lllIIIllIIIIlllIlIIllIIll((class_1521)object2);
            class_18222.lllIIIllIIIIlllIlIIllIIll((class_1521)object2);
            ((class_1521)object2).IIlllIlIlllIllIIIlllIIlIl = false;
        }
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_2183 class_21832, class_1822 class_18222) {
        HashSet<class_0693> hashSet = new HashSet<class_0693>();
        for (class_0531 class_05312 : class_21832.IlIIIIIllllllIIlllIllllll()) {
            class_18222.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_0232(class_05312, 0));
        }
        for (int i = 0; i < 3; ++i) {
            class_0693 class_06932 = class_21832.lllIIIllIIIIlllIlIIllIIll(i);
            if (class_06932 == null || hashSet.contains(class_06932)) continue;
            List list = class_21832.lIllllIIlIIIlIllllllIIIll(class_06932);
            for (class_0703 class_07032 : list) {
                class_18222.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_07032);
            }
            hashSet.add(class_06932);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0976[] arrclass_0976) {
        this.IlIlllIIIIIIlIIllIIllIlll = arrclass_0976[0].llIllllIlIllIIIlIllIIlIlI().IlIIIIIllllllIIlllIllllll();
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1822 class_18222, class_0976 class_09762) {
        class_0976 class_09763 = class_18222.IIlllIlIlllIllIIIlllIIlIl();
        if (class_09762 != null) {
            class_09762.IllllIIIIlIIlIIIIlllIIIIl().IlIllllllIIlIIllllIIlIIIl(class_18222);
        }
        class_09763.IllllIIIIlIIlIIIIlllIIIIl().lllIIIllIIIIlllIlIIllIIll(class_18222);
        class_09763.IlIlIIlllIllllllllIIIlIlI.IlIllllllIIlIIllllIIlIIIl((int)class_18222.IlIIlllllIIlIlIlllllIllll >> 4, (int)class_18222.IllIIIIllIIllIllIlllIlIIl >> 4);
    }

    public int lIlllIlllIIIIlIIlllIllIII() {
        return class_0636.lllIlIIlIIIlIlIIIllIlllIl(this.lIIlIIIIIlIlllIlIIlIlIlll());
    }

    public class_0775 lllIlIIlIIIlIlIIIllIlllIl(class_1822 class_18222) {
        class_0775 class_07752;
        class_0775 class_07753 = this.IIIllIllIIlIlIlIlIllllIIl.IlIllllllIIlIIllllIIlIIIl[0].lIlllIlllIlIIIIlllIlIlIIl().IIIllIllIIlIlIlIlIllllIIl();
        if (class_18222.llllIIIIlIIIlIIIIIIlIllll().equals(this.IIIllIllIIlIlIlIlIllllIIl.IIIIIIIIlIllIIllIIlllIllI()) && class_07753 != null) {
            class_18222.lIllllIIlIIIlIllllllIIIll(class_07753);
            class_07752 = class_07753;
            IIIllIIlIIIIIIlIlIIllIIlI.debug("loading single player");
        } else {
            class_07752 = this.IlIlllIIIIIIlIIllIIllIlll.lllIlIIlIIIlIlIIIllIlllIl(class_18222);
        }
        return class_07752;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1822 class_18222) {
        this.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(class_18222);
        class_0084 class_00842 = (class_0084)this.lllIIlIIIllllllIIIIlIlIlI.get(class_18222.lIIlllIIlIlIlIIIlIlllIIll());
        if (class_00842 != null) {
            class_00842.lllIlIIlIIIlIlIIIllIlllIl();
        }
    }

    public void IlIllllllIIlIIllllIIlIIIl(class_1822 class_18222) {
        this.lllIIIllIIIIlllIlIIllIIll(new class_0999(class_18222.llllIIIIlIIIlIIIIIIlIllll(), true, 1000));
        this.IlIIIIIllllllIIlllIllllll.add(class_18222);
        class_0976 class_09762 = this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(class_18222.lIIllllllllIlIllllllllIlI);
        class_09762.lllIIIllIIIIlllIlIIllIIll(class_18222);
        this.lllIIIllIIIIlllIlIIllIIll(class_18222, (class_0976)null);
        for (int i = 0; i < this.IlIIIIIllllllIIlllIllllll.size(); ++i) {
            class_1822 class_18223 = (class_1822)this.IlIIIIIllllllIIlllIllllll.get(i);
            class_18222.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_0999(class_18223.llllIIIIlIIIlIIIIIIlIllll(), true, class_18223.IllIIlllllllIIlIIlIIIIlIl));
        }
    }

    public void lIlllIlllIIIIlIIlllIllIII(class_1822 class_18222) {
        class_18222.IIlllIlIlllIllIIIlllIIlIl().IllllIIIIlIIlIIIIlllIIIIl().lIlllIlllIIIIlIIlllIllIII(class_18222);
    }

    public void IlIIIIIllllllIIlllIllllll(class_1822 class_18222) {
        class_18222.lllIIIllIIIIlllIlIIllIIll(StatList.lIllllIIlIIIlIllllllIIIll);
        this.lllIIIllIIIIlllIlIIllIIll(class_18222);
        class_0976 class_09762 = class_18222.IIlllIlIlllIllIIIlllIIlIl();
        if (class_18222.IlIIIlIIIIllIIIllIIIIIIll != null) {
            class_09762.IIIllIIlIIIIIIlIlIIllIIlI(class_18222.IlIIIlIIIIllIIIllIIIIIIll);
            IIIllIIlIIIIIIlIlIIllIIlI.debug("removing player mount");
        }
        class_09762.lllIlIIlIIIlIlIIIllIlllIl(class_18222);
        class_09762.IllllIIIIlIIlIIIIlllIIIIl().IlIllllllIIlIIllllIIlIIIl(class_18222);
        this.IlIIIIIllllllIIlllIllllll.remove(class_18222);
        this.lllIIlIIIllllllIIIIlIlIlI.remove(class_18222.lIIlllIIlIlIlIIIlIlllIIll());
        this.lllIIIllIIIIlllIlIIllIIll(new class_0999(class_18222.llllIIIIlIIIlIIIIIIlIllll(), false, 9999));
    }

    public String lllIIIllIIIIlllIlIIllIIll(SocketAddress socketAddress, GameProfile gameProfile) {
        if (this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(gameProfile)) {
            class_0216 class_02162 = (class_0216)this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll((Object)gameProfile);
            String string = "You are banned from this server!\nReason: " + class_02162.lllIlIIlIIIlIlIIIllIlllIl();
            if (class_02162.lllIIIllIIIIlllIlIIllIIll() != null) {
                string = string + "\nYour ban will be removed on " + IllIIlllllllIIlIIlIIIIlIl.format(class_02162.lllIIIllIIIIlllIlIIllIIll());
            }
            return string;
        }
        if (!this.lIlllIlllIIIIlIIlllIllIII(gameProfile)) {
            return "You are not white-listed on this server!";
        }
        if (this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(socketAddress)) {
            class_2227 class_22272 = this.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl(socketAddress);
            String string = "Your IP address is banned from this server!\nReason: " + class_22272.lllIlIIlIIIlIlIIIllIlllIl();
            if (class_22272.lllIIIllIIIIlllIlIIllIIll() != null) {
                string = string + "\nYour ban will be removed on " + IllIIlllllllIIlIIlIIIIlIl.format(class_22272.lllIIIllIIIIlllIlIIllIIll());
            }
            return string;
        }
        return this.IlIIIIIllllllIIlllIllllll.size() >= this.lIllllIIlIIIlIllllllIIIll ? "The server is full!" : null;
    }

    public class_1822 lllIIIllIIIIlllIlIIllIIll(GameProfile gameProfile) {
        UUID uUID = class_0814.lllIIIllIIIIlllIlIIllIIll(gameProfile);
        ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < this.IlIIIIIllllllIIlllIllllll.size(); ++i) {
            class_1822 class_18222 = (class_1822)this.IlIIIIIllllllIIlllIllllll.get(i);
            if (!class_18222.lIIlllIIlIlIlIIIlIlllIIll().equals(uUID)) continue;
            arrayList.add(class_18222);
        }
        for (class_1822 class_18222 : arrayList) {
            class_18222.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll("You logged in from another location");
        }
        class_0388 class_03882 = this.IIIllIllIIlIlIlIlIllllIIl.lIlIIllllIlIIIIllIIIIlIIl() ? new class_0379(this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(0)) : new class_0388(this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(0));
        return new class_1822(this.IIIllIllIIlIlIlIlIllllIIl, this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(0), gameProfile, class_03882);
    }

    public class_1822 lllIIIllIIIIlllIlIIllIIll(class_1822 class_18222, int n, boolean bl) {
        class_2208 class_22082;
        class_18222.IIlllIlIlllIllIIIlllIIlIl().lIlIlIIIIIIlIIllllIlIIllI().lllIIIllIIIIlllIlIIllIIll(class_18222);
        class_18222.IIlllIlIlllIllIIIlllIIlIl().lIlIlIIIIIIlIIllllIlIIllI().lllIlIIlIIIlIlIIIllIlllIl(class_18222);
        class_18222.IIlllIlIlllIllIIIlllIIlIl().IllllIIIIlIIlIIIIlllIIIIl().IlIllllllIIlIIllllIIlIIIl(class_18222);
        this.IlIIIIIllllllIIlllIllllll.remove(class_18222);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(class_18222.lIIllllllllIlIllllllllIlI).IIIllIIlIIIIIIlIlIIllIIlI(class_18222);
        class_2208 class_22083 = class_18222.lIIIlllIlIIIlIllIIIlIllll();
        boolean bl2 = class_18222.lllIIIlIllIlllIlIIllIllIl();
        class_18222.lIIllllllllIlIllllllllIlI = n;
        class_0388 class_03882 = this.IIIllIllIIlIlIlIlIllllIIl.lIlIIllllIlIIIIllIIIIlIIl() ? new class_0379(this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(class_18222.lIIllllllllIlIllllllllIlI)) : new class_0388(this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(class_18222.lIIllllllllIlIllllllllIlI));
        class_1822 class_18223 = new class_1822(this.IIIllIllIIlIlIlIlIllllIIl, this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(class_18222.lIIllllllllIlIllllllllIlI), class_18222.lIIlIlllIIlIIIIlIlIIIIlll(), class_03882);
        class_18223.lllIIIllIIIIlllIlIIllIIll = class_18222.lllIIIllIIIIlllIlIIllIIll;
        class_18223.lllIIIllIIIIlllIlIIllIIll(class_18222, bl);
        class_18223.lIlllIlllIIIIlIIlllIllIII(class_18222.llllllIlIllllIlIlIlIIIIlI());
        class_0976 class_09762 = this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(class_18222.lIIllllllllIlIllllllllIlI);
        this.lllIIIllIIIIlllIlIIllIIll(class_18223, class_18222, class_09762);
        if (class_22083 != null) {
            class_22082 = class_0814.lllIIIllIIIIlllIlIIllIIll(this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(class_18222.lIIllllllllIlIllllllllIlI), class_22083, bl2);
            if (class_22082 != null) {
                class_18223.lllIlIIlIIIlIlIIIllIlllIl((float)class_22082.lllIIIllIIIIlllIlIIllIIll + 0.5f, (float)class_22082.lllIlIIlIIIlIlIIIllIlllIl + 0.1f, (float)class_22082.IlIllllllIIlIIllllIIlIIIl + 0.5f, 0.0f, 0.0f);
                class_18223.lllIIIllIIIIlllIlIIllIIll(class_22083, bl2);
            } else {
                class_18223.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_0742(0, 0.0f));
            }
        }
        class_09762.IlIlIIlllIllllllllIIIlIlI.IlIllllllIIlIIllllIIlIIIl((int)class_18223.IlIIlllllIIlIlIlllllIllll >> 4, (int)class_18223.IllIIIIllIIllIllIlllIlIIl >> 4);
        while (!class_09762.lllIIIllIIIIlllIlIIllIIll((class_1521)class_18223, class_18223.IIllIllIIllIIlllIIIlIlllI).isEmpty()) {
            class_18223.IlIllllllIIlIIllllIIlIIIl(class_18223.IlIIlllllIIlIlIlllllIllll, class_18223.llIIlIlIlllIIllIlIlllIllI + 1.0, class_18223.IllIIIIllIIllIllIlllIlIIl);
        }
        class_18223.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_0271(class_18223.lIIllllllllIlIllllllllIlI, class_18223.lIlIllIIlIIlIIlIIlIIlIIll.IlIlIIlIlIllIIlIlIIllIIIl, class_18223.lIlIllIIlIIlIIlIIlIIlIIll.lIlllIlllIlIIIIlllIlIlIIl().IlIIIlIIIIllIIIllIIIIIIll(), class_18223.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll()));
        class_22082 = class_09762.lIlIllIIlIIlIIlIIlIIlIIll();
        class_18223.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_18223.IlIIlllllIIlIlIlllllIllll, class_18223.llIIlIlIlllIIllIlIlllIllI, class_18223.IllIIIIllIIllIllIlllIlIIl, class_18223.IIIIlIllIlIIlIIlIllIlIlll, class_18223.IlIlIIlllIllllllllIIIlIlI);
        class_18223.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_1444(class_22082.lllIIIllIIIIlllIlIIllIIll, class_22082.lllIlIIlIIIlIlIIIllIlllIl, class_22082.IlIllllllIIlIIllllIIlIIIl));
        class_18223.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_1134(class_18223.llIlllllIIlIIlIIllllIllll, class_18223.llllIllIIIlIllIllllllIlIl, class_18223.lllIlllllIllIlIIlIlIIIlll));
        this.lllIlIIlIIIlIlIIIllIlllIl(class_18223, class_09762);
        class_09762.IllllIIIIlIIlIIIIlllIIIIl().lllIIIllIIIIlllIlIIllIIll(class_18223);
        class_09762.lllIIIllIIIIlllIlIIllIIll(class_18223);
        this.IlIIIIIllllllIIlllIllllll.add(class_18223);
        class_18223.IlIIIIIllllllIIlllIllllll();
        class_18223.IllIIIllIIIIlIlIlIllIIlll(class_18223.lllIIIlllIlllIIlIllllIIlI());
        return class_18223;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1822 class_18222, int n) {
        int n2 = class_18222.lIIllllllllIlIllllllllIlI;
        class_0976 class_09762 = this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(class_18222.lIIllllllllIlIllllllllIlI);
        class_18222.lIIllllllllIlIllllllllIlI = n;
        class_0976 class_09763 = this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(class_18222.lIIllllllllIlIllllllllIlI);
        class_18222.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_0271(class_18222.lIIllllllllIlIllllllllIlI, class_18222.lIlIllIIlIIlIIlIIlIIlIIll.IlIlIIlIlIllIIlIlIIllIIIl, class_18222.lIlIllIIlIIlIIlIIlIIlIIll.lIlllIlllIlIIIIlllIlIlIIl().IlIIIlIIIIllIIIllIIIIIIll(), class_18222.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll()));
        class_09762.IIIllIIlIIIIIIlIlIIllIIlI(class_18222);
        class_18222.IllllIIIIlIIlIIIIlllIIIIl = false;
        this.lllIIIllIIIIlllIlIIllIIll(class_18222, n2, class_09762, class_09763);
        this.lllIIIllIIIIlllIlIIllIIll(class_18222, class_09762);
        class_18222.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_18222.IlIIlllllIIlIlIlllllIllll, class_18222.llIIlIlIlllIIllIlIlllIllI, class_18222.IllIIIIllIIllIllIlllIlIIl, class_18222.IIIIlIllIlIIlIIlIllIlIlll, class_18222.IlIlIIlllIllllllllIIIlIlI);
        class_18222.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(class_09763);
        this.lllIlIIlIIIlIlIIIllIlllIl(class_18222, class_09763);
        this.lIllllIIlIIIlIllllllIIIll(class_18222);
        for (class_1852 class_18522 : class_18222.IIllIIIlIIllllIIIIIIIIlll()) {
            class_18222.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_0570(class_18222.llllllIlIllllIlIlIlIIIIlI(), class_18522));
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, int n, class_0976 class_09762, class_0976 class_09763) {
        double d = class_15212.IlIIlllllIIlIlIlllllIllll;
        double d2 = class_15212.IllIIIIllIIllIllIlllIlIIl;
        double d3 = 8.0;
        double d4 = class_15212.IlIIlllllIIlIlIlllllIllll;
        double d5 = class_15212.llIIlIlIlllIIllIlIlllIllI;
        double d6 = class_15212.IllIIIIllIIllIllIlllIlIIl;
        float f = class_15212.IIIIlIllIlIIlIIlIllIlIlll;
        class_09762.IlIIlllllIIlIlIlllllIllll.startSection("moving");
        if (class_15212.lIIllllllllIlIllllllllIlI == -1) {
            class_15212.lllIlIIlIIIlIlIIIllIlllIl(d /= d3, class_15212.llIIlIlIlllIIllIlIlllIllI, d2 /= d3, class_15212.IIIIlIllIlIIlIIlIllIlIlll, class_15212.IlIlIIlllIllllllllIIIlIlI);
            if (class_15212.IlllIIlllllllIIllIlIllllI()) {
                class_09762.lllIIIllIIIIlllIlIIllIIll(class_15212, false);
            }
        } else if (class_15212.lIIllllllllIlIllllllllIlI == 0) {
            class_15212.lllIlIIlIIIlIlIIIllIlllIl(d *= d3, class_15212.llIIlIlIlllIIllIlIlllIllI, d2 *= d3, class_15212.IIIIlIllIlIIlIIlIllIlIlll, class_15212.IlIlIIlllIllllllllIIIlIlI);
            if (class_15212.IlllIIlllllllIIllIlIllllI()) {
                class_09762.lllIIIllIIIIlllIlIIllIIll(class_15212, false);
            }
        } else {
            class_2208 class_22082 = n == 1 ? class_09763.lIlIllIIlIIlIIlIIlIIlIIll() : class_09763.llIlllIIllIlllIlIlIlIIIll();
            d = class_22082.lllIIIllIIIIlllIlIIllIIll;
            class_15212.llIIlIlIlllIIllIlIlllIllI = class_22082.lllIlIIlIIIlIlIIIllIlllIl;
            d2 = class_22082.IlIllllllIIlIIllllIIlIIIl;
            class_15212.lllIlIIlIIIlIlIIIllIlllIl(d, class_15212.llIIlIlIlllIIllIlIlllIllI, d2, 90.0f, 0.0f);
            if (class_15212.IlllIIlllllllIIllIlIllllI()) {
                class_09762.lllIIIllIIIIlllIlIIllIIll(class_15212, false);
            }
        }
        class_09762.IlIIlllllIIlIlIlllllIllll.endSection();
        if (n != 1) {
            class_09762.IlIIlllllIIlIlIlllllIllll.startSection("placing");
            d = MathHelper.lllIIIllIIIIlllIlIIllIIll((int)d, -29999872, 29999872);
            d2 = MathHelper.lllIIIllIIIIlllIlIIllIIll((int)d2, -29999872, 29999872);
            if (class_15212.IlllIIlllllllIIllIlIllllI()) {
                class_15212.lllIlIIlIIIlIlIIIllIlllIl(d, class_15212.llIIlIlIlllIIllIlIlllIllI, d2, class_15212.IIIIlIllIlIIlIIlIllIlIlll, class_15212.IlIlIIlllIllllllllIIIlIlI);
                class_09763.llllIlIIIIIIIIIlllIIlIIIl().lllIIIllIIIIlllIlIIllIIll(class_15212, d4, d5, d6, f);
                class_09763.lllIIIllIIIIlllIlIIllIIll(class_15212);
                class_09763.lllIIIllIIIIlllIlIIllIIll(class_15212, false);
            }
            class_09762.IlIIlllllIIlIlIlllllIllll.endSection();
        }
        class_15212.lllIIIllIIIIlllIlIIllIIll(class_09763);
    }

    public void IlIIIIIllllllIIlllIllllll() {
        if (++this.lIlIlIIlIIIIlIIIIIlllIIII > 600) {
            this.lIlIlIIlIIIIlIIIIIlllIIII = 0;
        }
        if (this.lIlIlIIlIIIIlIIIIIlllIIII < this.IlIIIIIllllllIIlllIllllll.size()) {
            class_1822 class_18222 = (class_1822)this.IlIIIIIllllllIIlllIllllll.get(this.lIlIlIIlIIIIlIIIIIlllIIII);
            this.lllIIIllIIIIlllIlIIllIIll(new class_0999(class_18222.llllIIIIlIIIlIIIIIIlIllll(), true, class_18222.IllIIlllllllIIlIIlIIIIlIl));
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0703 class_07032) {
        for (int i = 0; i < this.IlIIIIIllllllIIlllIllllll.size(); ++i) {
            ((class_1822)this.IlIIIIIllllllIIlllIllllll.get((int)i)).lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_07032);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0703 class_07032, int n) {
        for (int i = 0; i < this.IlIIIIIllllllIIlllIllllll.size(); ++i) {
            class_1822 class_18222 = (class_1822)this.IlIIIIIllllllIIlllIllllll.get(i);
            if (class_18222.lIIllllllllIlIllllllllIlI != n) continue;
            class_18222.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_07032);
        }
    }

    public String lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        String string = "";
        ArrayList arrayList = Lists.newArrayList((Iterable)this.IlIIIIIllllllIIlllIllllll);
        for (int i = 0; i < arrayList.size(); ++i) {
            if (i > 0) {
                string = string + ", ";
            }
            string = string + ((class_1822)arrayList.get(i)).llllIIIIlIIIlIIIIIIlIllll();
            if (!bl) continue;
            string = string + " (" + ((class_1822)arrayList.get(i)).lIIlllIIlIlIlIIIlIlllIIll().toString() + ")";
        }
        return string;
    }

    public String[] lIllllIIlIIIlIllllllIIIll() {
        String[] arrstring = new String[this.IlIIIIIllllllIIlllIllllll.size()];
        for (int i = 0; i < this.IlIIIIIllllllIIlllIllllll.size(); ++i) {
            arrstring[i] = ((class_1822)this.IlIIIIIllllllIIlllIllllll.get(i)).llllIIIIlIIIlIIIIIIlIllll();
        }
        return arrstring;
    }

    public GameProfile[] IIIllIIlIIIIIIlIlIIllIIlI() {
        GameProfile[] arrgameProfile = new GameProfile[this.IlIIIIIllllllIIlllIllllll.size()];
        for (int i = 0; i < this.IlIIIIIllllllIIlllIllllll.size(); ++i) {
            arrgameProfile[i] = ((class_1822)this.IlIIIIIllllllIIlllIllllll.get(i)).lIIlIlllIIlIIIIlIlIIIIlll();
        }
        return arrgameProfile;
    }

    public class_1771 IllIIlllllllIIlIIlIIIIlIl() {
        return this.IllIIIllIIIIlIlIlIllIIlll;
    }

    public class_1644 IIIllIllIIlIlIlIlIllllIIl() {
        return this.lIIIIlIlIIlllllIIllIIlIII;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(GameProfile gameProfile) {
        this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(new class_1750(gameProfile, this.IIIllIllIIlIlIlIlIllllIIl.IllIIlllllllIIlIIlIIIIlIl()));
    }

    public void IlIllllllIIlIIllllIIlIIIl(GameProfile gameProfile) {
        this.llIIlllIllIllllIIIlIIIIII.lllIlIIlIIIlIlIIIllIlllIl((Object)gameProfile);
    }

    public boolean lIlllIlllIIIIlIIlllIllIII(GameProfile gameProfile) {
        return !this.IlIlIIlIlIllIIlIlIIllIIIl || this.llIIlllIllIllllIIIlIIIIII.lIlllIlllIIIIlIIlllIllIII((Object)gameProfile) || this.llIIllIllIlIIlIIllIllllll.lIlllIlllIIIIlIIlllIllIII((Object)gameProfile);
    }

    public boolean IlIIIIIllllllIIlllIllllll(GameProfile gameProfile) {
        return this.llIIlllIllIllllIIIlIIIIII.lIlllIlllIIIIlIIlllIllIII((Object)gameProfile) || this.IIIllIllIIlIlIlIlIllllIIl.llIIIlllIlllIlIllIIIIllIl() && this.IIIllIllIIlIlIlIlIllllIIl.IlIllllllIIlIIllllIIlIIIl[0].lIlllIlllIlIIIIlllIlIlIIl().IIlllIlIlllIllIIIlllIIlIl() && this.IIIllIllIIlIlIlIlIllllIIl.IIIIIIIIlIllIIllIIlllIllI().equalsIgnoreCase(gameProfile.getName()) || this.lIIlIIIIIlIlllIlIIlIlIlll;
    }

    public class_1822 lllIIIllIIIIlllIlIIllIIll(String string) {
        class_1822 class_18222;
        Iterator iterator = this.IlIIIIIllllllIIlllIllllll.iterator();
        do {
            if (iterator.hasNext()) continue;
            return null;
        } while (!(class_18222 = (class_1822)iterator.next()).llllIIIIlIIIlIIIIIIlIllll().equalsIgnoreCase(string));
        return class_18222;
    }

    public List lllIIIllIIIIlllIlIIllIIll(class_2208 class_22082, int n, int n2, int n3, int n4, int n5, int n6, Map map, String string, String string2, class_1334 class_13342) {
        if (this.IlIIIIIllllllIIlllIllllll.isEmpty()) {
            return Collections.emptyList();
        }
        List list = new ArrayList();
        boolean bl = n3 < 0;
        boolean bl2 = string != null && string.startsWith("!");
        boolean bl3 = string2 != null && string2.startsWith("!");
        int n7 = n * n;
        int n8 = n2 * n2;
        n3 = MathHelper.lllIIIllIIIIlllIlIIllIIll(n3);
        if (bl2) {
            string = string.substring(1);
        }
        if (bl3) {
            string2 = string2.substring(1);
        }
        for (int i = 0; i < this.IlIIIIIllllllIIlllIllllll.size(); ++i) {
            class_1822 class_18222 = (class_1822)this.IlIIIIIllllllIIlllIllllll.get(i);
            if (class_13342 != null && class_18222.lIlIllIIlIIlIIlIIlIIlIIll != class_13342 || string != null && bl2 == string.equalsIgnoreCase(class_18222.llllIIIIlIIIlIIIIIIlIllll())) continue;
            if (string2 != null) {
                String string3;
                class_0827 class_08272 = class_18222.llllIllIIIlIllIllllllIlIl();
                String string4 = string3 = class_08272 == null ? "" : class_08272.lllIIIllIIIIlllIlIIllIIll();
                if (bl3 == string2.equalsIgnoreCase(string3)) continue;
            }
            if (class_22082 != null && (n > 0 || n2 > 0)) {
                float f = class_22082.lllIlIIlIIIlIlIIIllIlllIl(class_18222.lllIIlIIIllllllIIIIlIlIlI());
                if (n > 0 && f < (float)n7 || n2 > 0 && f > (float)n8) continue;
            }
            if (!this.lllIIIllIIIIlllIlIIllIIll((class_0814)class_18222, map) || n4 != class_2243.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll() && n4 != class_18222.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll() || n5 > 0 && class_18222.lllIlllllIllIlIIlIlIIIlll < n5 || class_18222.lllIlllllIllIlIIlIlIIIlll > n6) continue;
            ((List)list).add(class_18222);
        }
        if (class_22082 != null) {
            Collections.sort(list, new class_0114(class_22082));
        }
        if (bl) {
            Collections.reverse(list);
        }
        if (n3 > 0) {
            list = ((List)list).subList(0, Math.min(n3, ((List)list).size()));
        }
        return list;
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, Map map) {
        if (map != null && map.size() != 0) {
            boolean bl;
            Map.Entry entry;
            int n;
            Iterator iterator = map.entrySet().iterator();
            do {
                class_0141 class_01412;
                class_0693 class_06932;
                if (!iterator.hasNext()) {
                    return true;
                }
                entry = iterator.next();
                String string = (String)entry.getKey();
                bl = false;
                if (string.endsWith("_min") && string.length() > 4) {
                    bl = true;
                    string = string.substring(0, string.length() - 4);
                }
                if ((class_06932 = (class_01412 = class_08142.lIlIlIIllIlIIIIIlIIlllIlI()).lllIIIllIIIIlllIlIIllIIll(string)) == null) {
                    return false;
                }
                class_0678 class_06782 = class_08142.lIlIlIIllIlIIIIIlIIlllIlI().lllIIIllIIIIlllIlIIllIIll(class_08142.llllIIIIlIIIlIIIIIIlIllll(), class_06932);
                n = class_06782.lllIlIIlIIIlIlIIIllIlllIl();
                if (n >= (Integer)entry.getValue() || !bl) continue;
                return false;
            } while (n <= (Integer)entry.getValue() || bl);
            return false;
        }
        return true;
    }

    public void lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3, double d4, int n, class_0703 class_07032) {
        this.lllIIIllIIIIlllIlIIllIIll(null, d, d2, d3, d4, n, class_07032);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, double d, double d2, double d3, double d4, int n, class_0703 class_07032) {
        for (int i = 0; i < this.IlIIIIIllllllIIlllIllllll.size(); ++i) {
            double d5;
            double d6;
            double d7;
            class_1822 class_18222 = (class_1822)this.IlIIIIIllllllIIlllIllllll.get(i);
            if (class_18222 == class_08142 || class_18222.lIIllllllllIlIllllllllIlI != n || !((d7 = d - class_18222.IlIIlllllIIlIlIlllllIllll) * d7 + (d6 = d2 - class_18222.llIIlIlIlllIIllIlIlllIllI) * d6 + (d5 = d3 - class_18222.IllIIIIllIIllIllIlllIlIIl) * d5 < d4 * d4)) continue;
            class_18222.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_07032);
        }
    }

    public void IllIIIllIIIIlIlIlIllIIlll() {
        for (int i = 0; i < this.IlIIIIIllllllIIlllIllllll.size(); ++i) {
            this.lllIIIllIIIIlllIlIIllIIll((class_1822)this.IlIIIIIllllllIIlllIllllll.get(i));
        }
    }

    public void lIllllIIlIIIlIllllllIIIll(GameProfile gameProfile) {
        this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(new class_1555(gameProfile));
    }

    public void IIIllIIlIIIIIIlIlIIllIIlI(GameProfile gameProfile) {
        this.llIIllIllIlIIlIIllIllllll.lllIlIIlIIIlIlIIIllIlllIl((Object)gameProfile);
    }

    public class_1137 lIIIIlIlIIlllllIIllIIlIII() {
        return this.llIIllIllIlIIlIIllIllllll;
    }

    public String[] llIIlllIllIllllIIIlIIIIII() {
        return this.llIIllIllIlIIlIIllIllllll.lllIlIIlIIIlIlIIIllIlllIl();
    }

    public class_0716 llIIllIllIlIIlIIllIllllll() {
        return this.llIIlllIllIllllIIIlIIIIII;
    }

    public String[] lllIIlIIIllllllIIIIlIlIlI() {
        return this.llIIlllIllIllllIIIlIIIIII.lllIlIIlIIIlIlIIIllIlllIl();
    }

    public void IlIlllIIIIIIlIIllIIllIlll() {
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_1822 class_18222, class_0976 class_09762) {
        class_18222.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_1916(class_09762.IlIIIlIIIIllIIIllIIIIIIll(), class_09762.IIlllIlIlllIllIIIlllIIlIl(), class_09762.IlIIlllllIIlIlIlllllIllll().lllIlIIlIIIlIlIIIllIlllIl("doDaylightCycle")));
        if (class_09762.IIIIIIIIlIllIIllIIlllIllI()) {
            class_18222.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_0742(1, 0.0f));
            class_18222.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_0742(7, class_09762.IllIIIllIIIIlIlIlIllIIlll(1.0f)));
            class_18222.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_0742(8, class_09762.IllIIlllllllIIlIIlIIIIlIl(1.0f)));
        }
    }

    public void lIllllIIlIIIlIllllllIIIll(class_1822 class_18222) {
        class_18222.lllIIIllIIIIlllIlIIllIIll(class_18222.IlIlllIIIIIIlIIllIIllIlll);
        class_18222.IlIlIIlllIIlIllIIIlllllIl();
        class_18222.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_0805(class_18222.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl));
    }

    public int IlIlIIlIlIllIIlIlIIllIIIl() {
        return this.IlIIIIIllllllIIlllIllllll.size();
    }

    public int lllllIlllIIllIlIIlIIIllII() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public String[] IlIlIIlllIIlIllIIIlllllIl() {
        return this.IIIllIllIIlIlIlIlIllllIIl.IlIllllllIIlIIllllIIlIIIl[0].llIllllIlIllIIIlIllIIlIlI().IlIIIIIllllllIIlllIllllll().lllIlIIlIIIlIlIIIllIlllIl();
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(boolean bl) {
        this.IlIlIIlIlIllIIlIlIIllIIIl = bl;
    }

    public List lllIlIIlIIIlIlIIIllIlllIl(String string) {
        ArrayList<class_1822> arrayList = new ArrayList<class_1822>();
        for (class_1822 class_18222 : this.IlIIIIIllllllIIlllIllllll) {
            if (!class_18222.llIllllIlIllIIIlIllIIlIlI().equals(string)) continue;
            arrayList.add(class_18222);
        }
        return arrayList;
    }

    public int lIIlIIIIIlIlllIlIIlIlIlll() {
        return this.lllllIlllIIllIlIIlIIIllII;
    }

    public class_0220 IlIllllllIIlIIllllIIlIIIl() {
        return this.IIIllIllIIlIlIlIlIllllIIl;
    }

    public class_0775 lllIlIIlIIIlIlIIIllIlllIl() {
        return null;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_2243 class_22432) {
        this.IlIlIIlllIIlIllIIIlllllIl = class_22432;
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_1822 class_18222, class_1822 class_18223, class_1334 class_13342) {
        if (class_18223 != null) {
            class_18222.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(class_18223.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll());
        } else if (this.IlIlIIlllIIlIllIIIlllllIl != null) {
            class_18222.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlllIIlIllIIIlllllIl);
        }
        class_18222.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl(class_13342.lIlllIlllIlIIIIlllIlIlIIl().IlIlIIlllIIlIllIIIlllllIl());
    }

    public void IlIllllllIIlIIllllIIlIIIl(boolean bl) {
        this.lIIlIIIIIlIlllIlIIlIlIlll = bl;
    }

    public void lIlIlIIlIIIIlIIIIIlllIIII() {
        for (int i = 0; i < this.IlIIIIIllllllIIlllIllllll.size(); ++i) {
            ((class_1822)this.IlIIIIIllllllIIlllIllllll.get((int)i)).lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll("Server closed");
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(IChatComponent class_22552, boolean bl) {
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(class_22552);
        this.lllIIIllIIIIlllIlIIllIIll(new class_0710(class_22552, bl));
    }

    public void lllIIIllIIIIlllIlIIllIIll(IChatComponent class_22552) {
        this.lllIIIllIIIIlllIlIIllIIll(class_22552, true);
    }

    public class_0084 lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142) {
        class_0084 class_00842;
        UUID uUID = class_08142.lIIlllIIlIlIlIIIlIlllIIll();
        class_0084 class_00843 = class_00842 = uUID == null ? null : (class_0084)this.lllIIlIIIllllllIIIIlIlIlI.get(uUID);
        if (class_00842 == null) {
            File file;
            File file2 = new File(this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(0).llIllllIlIllIIIlIllIIlIlI().lIllllIIlIIIlIllllllIIIll(), "stats");
            File file3 = new File(file2, uUID.toString() + ".json");
            if (!file3.exists() && (file = new File(file2, class_08142.llllIIIIlIIIlIIIIIIlIllll() + ".json")).exists() && file.isFile()) {
                file.renameTo(file3);
            }
            class_00842 = new class_0084(this.IIIllIllIIlIlIlIlIllllIIl, file3);
            class_00842.lllIIIllIIIIlllIlIIllIIll();
            this.lllIIlIIIllllllIIIIlIlIlI.put(uUID, class_00842);
        }
        return class_00842;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        this.lllllIlllIIllIlIIlIIIllII = n;
        if (this.IIIllIllIIlIlIlIlIllllIIl.IlIllllllIIlIIllllIIlIIIl != null) {
            for (class_0976 class_09762 : this.IIIllIllIIlIlIlIlIllllIIl.IlIllllllIIlIIllllIIlIIIl) {
                if (class_09762 == null) continue;
                class_09762.IllllIIIIlIIlIIIIlllIIIIl().lllIIIllIIIIlllIlIIllIIll(n);
            }
        }
    }
}

