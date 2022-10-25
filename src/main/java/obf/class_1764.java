package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.mojang.authlib.GameProfile
 *  io.netty.buffer.Unpooled
 *  io.netty.util.concurrent.GenericFutureListener
 *  net.minecraft.realms.DisconnectedOnlineScreen
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.base.Charsets;
import com.mojang.authlib.GameProfile;
import com.moonsworth.lunar.client.events.type.PluginMessageEvent;
import com.moonsworth.lunar.client.LunarClient;
import io.netty.buffer.Unpooled;
import io.netty.util.concurrent.GenericFutureListener;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.client.ClientBrandRetriever;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C00PacketKeepAlive;
import net.minecraft.network.play.client.C03PacketPlayer_C06PacketPlayerPosLook;
import net.minecraft.network.play.client.C0FPacketConfirmTransaction;
import net.minecraft.network.play.client.C17PacketCustomPayload;
import net.minecraft.network.play.server.*;
import net.minecraft.realms.DisconnectedOnlineScreen;
import net.minecraft.scoreboard.IScoreObjectiveCriteria;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraft.stats.StatBase;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_1764
implements INetHandlerPlayClient {
    private static final Logger lIlllIlllIIIIlIIlllIllIII = LogManager.getLogger();
    private final class_0800 IlIIIIIllllllIIlllIllllll;
    private Minecraft lIllllIIlIIIlIllllllIIIll;
    private class_0564 IIIllIIlIIIIIIlIlIIllIIlI;
    private boolean IllIIlllllllIIlIIlIIIIlIl;
    public class_1641 lllIIIllIIIIlllIlIIllIIll = new class_1641(null);
    private Map IIIllIllIIlIlIlIlIllllIIl = new HashMap();
    public List lllIlIIlIIIlIlIIIllIlllIl = new ArrayList();
    public int IlIllllllIIlIIllllIIlIIIl = 20;
    private class_0229 IllIIIllIIIIlIlIlIllIIlll;
    private boolean lIIIIlIlIIlllllIIllIIlIII = false;
    private Random llIIlllIllIllllIIIlIIIIII = new Random();
    private static int llIIllIllIlIIlIIllIllllll = "PD0QEiMBp7MMnE/Xsy15Y".length() * "SxsSzIMRVwhI4lWHAxrwyAAs".length() * "FBCXhDkD".length() - 32;

    public class_1764(Minecraft class_06672, class_0229 class_02292, class_0800 class_08002) {
        this.lIllllIIlIIIlIllllllIIIll = class_06672;
        this.IllIIIllIIIIlIlIlIllIIlll = class_02292;
        this.IlIIIIIllllllIIlllIllllll = class_08002;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl() {
        this.IIIllIIlIIIIIIlIlIIllIIlI = null;
    }

    @Override
    public void onNetworkTick() {
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S01PacketJoinGame class_05972) {
        this.lIllllIIlIIIlIllllllIIIll.lIllllIIlIIIlIllllllIIIll = new class_0376(this.lIllllIIlIIIlIllllllIIIll, this);
        this.IIIllIIlIIIIIIlIlIIllIIlI = new class_0564(this, new class_1078(0L, class_05972.IlIIIIIllllllIIlllIllllll(), false, class_05972.lIlllIlllIIIIlIIlllIllIII(), class_05972.IIIllIllIIlIlIlIlIllllIIl()), class_05972.lIllllIIlIIIlIllllllIIIll(), class_05972.IIIllIIlIIIIIIlIlIIllIIlI(), this.lIllllIIlIIIlIllllllIIIll.mcProfiler);
        this.IIIllIIlIIIIIIlIlIIllIIlI.IllIIIIllIIllIllIlllIlIIl = true;
        this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI);
        this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.lIIllllllllIlIllllllllIlI = class_05972.lIllllIIlIIIlIllllllIIIll();
        this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(new class_2224(this));
        this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.lIlllIlllIIIIlIIlllIllIII(class_05972.IlIllllllIIlIIllllIIlIIIl());
        this.IlIllllllIIlIIllllIIlIIIl = class_05972.IllIIlllllllIIlIIlIIIIlIl();
        this.lIllllIIlIIIlIllllllIIIll.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(class_05972.IlIIIIIllllllIIlllIllllll());
        this.lIllllIIlIIIlIllllllIIIll.gameSettings.lIlllIlllIIIIlIIlllIllIII();
        this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(new C17PacketCustomPayload("MC|Brand", ClientBrandRetriever.getClientModName().getBytes(Charsets.UTF_8)), new GenericFutureListener[0]);
        class_1092 class_10922 = Minecraft.getMinecraft().IlIllllllIIlIIllllIIlIIIl;
        if (class_10922 != null) {
            LunarClient.getInstance().lllIIIllIIIIlllIlIIllIIll(class_10922.lllIlIIlIIIlIlIIIllIlllIl, class_10922.lIlllIlllIIIIlIIlllIllIII, class_10922.IlIIIIIllllllIIlllIllllll);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S0EPacketSpawnObject class_16312) {
        class_1521[] arrclass_1521;
        double d = (double)class_16312.lIlllIlllIIIIlIIlllIllIII() / 32.0;
        double d2 = (double)class_16312.IlIIIIIllllllIIlllIllllll() / 32.0;
        double d3 = (double)class_16312.lIllllIIlIIIlIllllllIIIll() / 32.0;
        class_1521 class_15212 = null;
        if (class_16312.llIIlllIllIllllIIIlIIIIII() == 10) {
            class_15212 = class_1860.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI, d, d2, d3, class_16312.llIIllIllIlIIlIIllIllllll());
        } else if (class_16312.llIIlllIllIllllIIIlIIIIII() == 90) {
            arrclass_1521 = this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(class_16312.llIIllIllIlIIlIIllIllllll());
            if (arrclass_1521 instanceof class_0814) {
                class_15212 = new class_2050(this.IIIllIIlIIIIIIlIlIIllIIlI, d, d2, d3, (class_0814)arrclass_1521);
            }
            class_16312.IIIllIIlIIIIIIlIlIIllIIlI(0);
        } else if (class_16312.llIIlllIllIllllIIIlIIIIII() == 60) {
            class_15212 = new class_0369(this.IIIllIIlIIIIIIlIlIIllIIlI, d, d2, d3);
        } else if (class_16312.llIIlllIllIllllIIIlIIIIII() == 61) {
            class_15212 = new class_0333(this.IIIllIIlIIIIIIlIlIIllIIlI, d, d2, d3);
        } else if (class_16312.llIIlllIllIllllIIIlIIIIII() == 71) {
            class_15212 = new class_1094(this.IIIllIIlIIIIIIlIlIIllIIlI, (int)d, (int)d2, (int)d3, class_16312.llIIllIllIlIIlIIllIllllll());
            class_16312.IIIllIIlIIIIIIlIlIIllIIlI(0);
        } else if (class_16312.llIIlllIllIllllIIIlIIIIII() == 77) {
            class_15212 = new class_1215(this.IIIllIIlIIIIIIlIlIIllIIlI, (int)d, (int)d2, (int)d3);
            class_16312.IIIllIIlIIIIIIlIlIIllIIlI(0);
        } else if (class_16312.llIIlllIllIllllIIIlIIIIII() == 65) {
            class_15212 = new class_1918(this.IIIllIIlIIIIIIlIlIIllIIlI, d, d2, d3);
        } else if (class_16312.llIIlllIllIllllIIIlIIIIII() == 72) {
            class_15212 = new class_0093(this.IIIllIIlIIIIIIlIlIIllIIlI, d, d2, d3);
        } else if (class_16312.llIIlllIllIllllIIIlIIIIII() == 76) {
            class_15212 = new class_1800(this.IIIllIIlIIIIIIlIlIIllIIlI, d, d2, d3, null);
        } else if (class_16312.llIIlllIllIllllIIIlIIIIII() == 63) {
            class_15212 = new class_1902(this.IIIllIIlIIIIIIlIlIIllIIlI, d, d2, d3, (double)class_16312.IIIllIIlIIIIIIlIlIIllIIlI() / 8000.0, (double)class_16312.IllIIlllllllIIlIIlIIIIlIl() / 8000.0, (double)class_16312.IIIllIllIIlIlIlIlIllllIIl() / 8000.0);
            class_16312.IIIllIIlIIIIIIlIlIIllIIlI(0);
        } else if (class_16312.llIIlllIllIllllIIIlIIIIII() == 64) {
            class_15212 = new class_1332(this.IIIllIIlIIIIIIlIlIIllIIlI, d, d2, d3, (double)class_16312.IIIllIIlIIIIIIlIlIIllIIlI() / 8000.0, (double)class_16312.IllIIlllllllIIlIIlIIIIlIl() / 8000.0, (double)class_16312.IIIllIllIIlIlIlIlIllllIIl() / 8000.0);
            class_16312.IIIllIIlIIIIIIlIlIIllIIlI(0);
        } else if (class_16312.llIIlllIllIllllIIIlIIIIII() == 66) {
            class_15212 = new class_2166(this.IIIllIIlIIIIIIlIlIIllIIlI, d, d2, d3, (double)class_16312.IIIllIIlIIIIIIlIlIIllIIlI() / 8000.0, (double)class_16312.IllIIlllllllIIlIIlIIIIlIl() / 8000.0, (double)class_16312.IIIllIllIIlIlIlIlIllllIIl() / 8000.0);
            class_16312.IIIllIIlIIIIIIlIlIIllIIlI(0);
        } else if (class_16312.llIIlllIllIllllIIIlIIIIII() == 62) {
            class_15212 = new class_0525(this.IIIllIIlIIIIIIlIlIIllIIlI, d, d2, d3);
        } else if (class_16312.llIIlllIllIllllIIIlIIIIII() == 73) {
            class_15212 = new class_0426((class_1334)this.IIIllIIlIIIIIIlIlIIllIIlI, d, d2, d3, class_16312.llIIllIllIlIIlIIllIllllll());
            class_16312.IIIllIIlIIIIIIlIlIIllIIlI(0);
        } else if (class_16312.llIIlllIllIllllIIIlIIIIII() == 75) {
            class_15212 = new class_1617(this.IIIllIIlIIIIIIlIlIIllIIlI, d, d2, d3);
            class_16312.IIIllIIlIIIIIIlIlIIllIIlI(0);
        } else if (class_16312.llIIlllIllIllllIIIlIIIIII() == 1) {
            class_15212 = new class_2263(this.IIIllIIlIIIIIIlIlIIllIIlI, d, d2, d3);
        } else if (class_16312.llIIlllIllIllllIIIlIIIIII() == 50) {
            class_15212 = new class_0034(this.IIIllIIlIIIIIIlIlIIllIIlI, d, d2, d3, null);
        } else if (class_16312.llIIlllIllIllllIIIlIIIIII() == 51) {
            class_15212 = new class_0355(this.IIIllIIlIIIIIIlIlIIllIIlI, d, d2, d3);
        } else if (class_16312.llIIlllIllIllllIIIlIIIIII() == 2) {
            class_15212 = new class_1781(this.IIIllIIlIIIIIIlIlIIllIIlI, d, d2, d3);
        } else if (class_16312.llIIlllIllIllllIIIlIIIIII() == 70) {
            class_15212 = new class_0543(this.IIIllIIlIIIIIIlIlIIllIIlI, d, d2, d3, Block.lllIIIllIIIIlllIlIIllIIll(class_16312.llIIllIllIlIIlIIllIllllll() & 0xFFFF), class_16312.llIIllIllIlIIlIIllIllllll() >> 16);
            class_16312.IIIllIIlIIIIIIlIlIIllIIlI(0);
        }
        if (class_15212 != null) {
            ((class_1521)class_15212).lIIlIIlIllIlIIlIlIIlIlIlI = class_16312.lIlllIlllIIIIlIIlllIllIII();
            ((class_1521)class_15212).llIIIIIlIIlIIIIllIIIlIIII = class_16312.IlIIIIIllllllIIlllIllllll();
            ((class_1521)class_15212).lIlIlIIllIIIlllIllIIlIllI = class_16312.lIllllIIlIIIlIllllllIIIll();
            ((class_1521)class_15212).IlIlIIlllIllllllllIIIlIlI = (float)(class_16312.IllIIIllIIIIlIlIlIllIIlll() * 360) / 256.0f;
            ((class_1521)class_15212).IIIIlIllIlIIlIIlIllIlIlll = (float)(class_16312.lIIIIlIlIIlllllIIllIIlIII() * 360) / 256.0f;
            arrclass_1521 = ((class_1521)class_15212).lIIllllllllIlIllllllllIlI();
            if (arrclass_1521 != null) {
                int n = class_16312.IlIllllllIIlIIllllIIlIIIl() - ((class_1521)class_15212).llllllIlIllllIlIlIlIIIIlI();
                for (int i = 0; i < arrclass_1521.length; ++i) {
                    arrclass_1521[i].lIlllIlllIIIIlIIlllIllIII(arrclass_1521[i].llllllIlIllllIlIlIlIIIIlI() + n);
                }
            }
            ((class_1521)class_15212).lIlllIlllIIIIlIIlllIllIII(class_16312.IlIllllllIIlIIllllIIlIIIl());
            this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(class_16312.IlIllllllIIlIIllllIIlIIIl(), class_15212);
            if (class_16312.llIIllIllIlIIlIIllIllllll() > 0) {
                class_1521 class_15213;
                if (class_16312.llIIlllIllIllllIIIlIIIIII() == 60 && (class_15213 = this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(class_16312.llIIllIllIlIIlIIllIllllll())) instanceof class_1965) {
                    class_0369 class_03692 = (class_0369)class_15212;
                    class_03692.IlIllllllIIlIIllllIIlIIIl = class_15213;
                }
                ((class_1521)class_15212).IIIllIllIIlIlIlIlIllllIIl((double)class_16312.IIIllIIlIIIIIIlIlIIllIIlI() / 8000.0, (double)class_16312.IllIIlllllllIIlIIlIIIIlIl() / 8000.0, (double)class_16312.IIIllIllIIlIlIlIlIllllIIl() / 8000.0);
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S11PacketSpawnExperienceOrb class_17202) {
        class_1138 class_11382 = new class_1138(this.IIIllIIlIIIIIIlIlIIllIIlI, class_17202.lIlllIlllIIIIlIIlllIllIII(), class_17202.IlIIIIIllllllIIlllIllllll(), class_17202.lIllllIIlIIIlIllllllIIIll(), class_17202.IIIllIIlIIIIIIlIlIIllIIlI());
        class_11382.lIIlIIlIllIlIIlIlIIlIlIlI = class_17202.lIlllIlllIIIIlIIlllIllIII();
        class_11382.llIIIIIlIIlIIIIllIIIlIIII = class_17202.IlIIIIIllllllIIlllIllllll();
        class_11382.lIlIlIIllIIIlllIllIIlIllI = class_17202.lIllllIIlIIIlIllllllIIIll();
        class_11382.IIIIlIllIlIIlIIlIllIlIlll = 0.0f;
        class_11382.IlIlIIlllIllllllllIIIlIlI = 0.0f;
        class_11382.lIlllIlllIIIIlIIlllIllIII(class_17202.IlIllllllIIlIIllllIIlIIIl());
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(class_17202.IlIllllllIIlIIllllIIlIIIl(), (class_1521)class_11382);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S2CPacketSpawnGlobalEntity class_05752) {
        double d = (double)class_05752.lIlllIlllIIIIlIIlllIllIII() / 32.0;
        double d2 = (double)class_05752.IlIIIIIllllllIIlllIllllll() / 32.0;
        double d3 = (double)class_05752.lIllllIIlIIIlIllllllIIIll() / 32.0;
        class_0411 class_04112 = null;
        if (class_05752.IIIllIIlIIIIIIlIlIIllIIlI() == 1) {
            class_04112 = new class_0411(this.IIIllIIlIIIIIIlIlIIllIIlI, d, d2, d3);
        }
        if (class_04112 != null) {
            class_04112.lIIlIIlIllIlIIlIlIIlIlIlI = class_05752.lIlllIlllIIIIlIIlllIllIII();
            class_04112.llIIIIIlIIlIIIIllIIIlIIII = class_05752.IlIIIIIllllllIIlllIllllll();
            class_04112.lIlIlIIllIIIlllIllIIlIllI = class_05752.lIllllIIlIIIlIllllllIIIll();
            class_04112.IIIIlIllIlIIlIIlIllIlIlll = 0.0f;
            class_04112.IlIlIIlllIllllllllIIIlIlI = 0.0f;
            class_04112.lIlllIlllIIIIlIIlllIllIII(class_05752.IlIllllllIIlIIllllIIlIIIl());
            this.IIIllIIlIIIIIIlIlIIllIIlI.lIllllIIlIIIlIllllllIIIll(class_04112);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S10PacketSpawnPainting class_13642) {
        class_0146 class_01462 = new class_0146(this.IIIllIIlIIIIIIlIlIIllIIlI, class_13642.lIlllIlllIIIIlIIlllIllIII(), class_13642.IlIIIIIllllllIIlllIllllll(), class_13642.lIllllIIlIIIlIllllllIIIll(), class_13642.IIIllIIlIIIIIIlIlIIllIIlI(), class_13642.IllIIlllllllIIlIIlIIIIlIl());
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(class_13642.IlIllllllIIlIIllllIIlIIIl(), (class_1521)class_01462);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S12PacketEntityVelocity class_08522) {
        class_1521 class_15212 = this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(class_08522.IlIllllllIIlIIllllIIlIIIl());
        if (class_15212 != null) {
            class_15212.IIIllIllIIlIlIlIlIllllIIl((double)class_08522.lIlllIlllIIIIlIIlllIllIII() / (double)(llIIllIllIlIIlIIllIllllll * 2), (double)class_08522.IlIIIIIllllllIIlllIllllll() / (double)(llIIllIllIlIIlIIllIllllll * 2), (double)class_08522.lIllllIIlIIIlIllllllIIIll() / (double)(llIIllIllIlIIlIIllIllllll * 2));
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S1CPacketEntityMetadata class_02922) {
        class_1521 class_15212 = this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(class_02922.lIlllIlllIIIIlIIlllIllIII());
        if (class_15212 != null && class_02922.IlIllllllIIlIIllllIIlIIIl() != null) {
            class_15212.lIlIIllllIlIIIIllIIIIlIIl().lllIIIllIIIIlllIlIIllIIll(class_02922.IlIllllllIIlIIllllIIlIIIl());
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S0CPacketSpawnPlayer class_11792) {
        double d = (double)class_11792.lIllllIIlIIIlIllllllIIIll() / 32.0;
        double d2 = (double)class_11792.IIIllIIlIIIIIIlIlIIllIIlI() / 32.0;
        double d3 = (double)class_11792.IllIIlllllllIIlIIlIIIIlIl() / 32.0;
        float f = (float)(class_11792.IIIllIllIIlIlIlIlIllllIIl() * 360) / 256.0f;
        float f2 = (float)(class_11792.IllIIIllIIIIlIlIlIllIIlll() * 360) / 256.0f;
        GameProfile gameProfile = class_11792.IlIIIIIllllllIIlllIllllll();
        class_0941 class_09412 = new class_0941(this.lIllllIIlIIIlIllllllIIIll.theWorld, class_11792.IlIIIIIllllllIIlllIllllll());
        class_09412.lIIlIIlIllIlIIlIlIIlIlIlI = class_11792.lIllllIIlIIIlIllllllIIIll();
        class_09412.llIIlIllIllllIlIIIIlIIlll = class_09412.lIIIlIIIlIlllIllIIIlIIIlI = (double)class_09412.lIIlIIlIllIlIIlIlIIlIlIlI;
        class_09412.llIIIIIlIIlIIIIllIIIlIIII = class_11792.IIIllIIlIIIIIIlIlIIllIIlI();
        class_09412.llIllllIlIllIIIlIllIIlIlI = class_09412.lIIlIlllIllIlIlllIIIIIIII = (double)class_09412.llIIIIIlIIlIIIIllIIIlIIII;
        class_09412.lIlIlIIllIIIlllIllIIlIllI = class_11792.IllIIlllllllIIlIIlIIIIlIl();
        class_09412.lIlllIlllIlIIIIlllIlIlIIl = class_09412.IIlIllIIlllllIIlIIllllIIl = (double)class_09412.lIlIlIIllIIIlllIllIIlIllI;
        int n = class_11792.lIIIIlIlIIlllllIIllIIlIII();
        class_09412.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll[class_09412.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl] = n == 0 ? null : new ItemStack(Item.lllIIIllIIIIlllIlIIllIIll(n), 1, 0);
        class_09412.lllIIIllIIIIlllIlIIllIIll(d, d2, d3, f, f2);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(class_11792.lIlllIlllIIIIlIIlllIllIII(), (class_1521)class_09412);
        List list = class_11792.IlIllllllIIlIIllllIIlIIIl();
        if (list != null) {
            class_09412.lIlIIllllIlIIIIllIIIIlIIl().lllIIIllIIIIlllIlIIllIIll(list);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S18PacketEntityTeleport class_13532) {
        class_1521 class_15212 = this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(class_13532.IlIllllllIIlIIllllIIlIIIl());
        if (class_15212 != null) {
            class_15212.lIIlIIlIllIlIIlIlIIlIlIlI = class_13532.lIlllIlllIIIIlIIlllIllIII();
            class_15212.llIIIIIlIIlIIIIllIIIlIIII = class_13532.IlIIIIIllllllIIlllIllllll();
            class_15212.lIlIlIIllIIIlllIllIIlIllI = class_13532.lIllllIIlIIIlIllllllIIIll();
            double d = (double)class_15212.lIIlIIlIllIlIIlIlIIlIlIlI / 32.0;
            double d2 = (double)class_15212.llIIIIIlIIlIIIIllIIIlIIII / 32.0 + 0.015625;
            double d3 = (double)class_15212.lIlIlIIllIIIlllIllIIlIllI / 32.0;
            float f = (float)(class_13532.IIIllIIlIIIIIIlIlIIllIIlI() * 360) / 256.0f;
            float f2 = (float)(class_13532.IllIIlllllllIIlIIlIIIIlIl() * 360) / 256.0f;
            class_15212.lllIIIllIIIIlllIlIIllIIll(d, d2, d3, f, f2, 3);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S09PacketHeldItemChange class_08052) {
        if (class_08052.IlIllllllIIlIIllllIIlIIIl() >= 0 && class_08052.IlIllllllIIlIIllllIIlIIIl() < class_0503.lllIlIIlIIIlIlIIIllIlllIl()) {
            this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl = class_08052.IlIllllllIIlIIllllIIlIIIl();
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S14PacketEntity class_20382) {
        class_1521 class_15212 = class_20382.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI);
        if (class_15212 != null) {
            class_15212.lIIlIIlIllIlIIlIlIIlIlIlI += class_20382.IlIllllllIIlIIllllIIlIIIl();
            class_15212.llIIIIIlIIlIIIIllIIIlIIII += class_20382.lIlllIlllIIIIlIIlllIllIII();
            class_15212.lIlIlIIllIIIlllIllIIlIllI += class_20382.IlIIIIIllllllIIlllIllllll();
            double d = (double)class_15212.lIIlIIlIllIlIIlIlIIlIlIlI / 32.0;
            double d2 = (double)class_15212.llIIIIIlIIlIIIIllIIIlIIII / 32.0;
            double d3 = (double)class_15212.lIlIlIIllIIIlllIllIIlIllI / 32.0;
            float f = class_20382.IllIIlllllllIIlIIlIIIIlIl() ? (float)(class_20382.lIllllIIlIIIlIllllllIIIll() * 360) / 256.0f : class_15212.IIIIlIllIlIIlIIlIllIlIlll;
            float f2 = class_20382.IllIIlllllllIIlIIlIIIIlIl() ? (float)(class_20382.IIIllIIlIIIIIIlIlIIllIIlI() * 360) / 256.0f : class_15212.IlIlIIlllIllllllllIIIlIlI;
            class_15212.lllIIIllIIIIlllIlIIllIIll(d, d2, d3, f, f2, 3);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S19PacketEntityHeadLook class_04232) {
        class_1521 class_15212 = class_04232.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI);
        if (class_15212 != null) {
            float f = (float)(class_04232.IlIllllllIIlIIllllIIlIIIl() * 360) / 256.0f;
            class_15212.IIIllIIlIIIIIIlIlIIllIIlI(f);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S13PacketDestroyEntities class_01752) {
        for (int i = 0; i < class_01752.IlIllllllIIlIIllllIIlIIIl().length; ++i) {
            this.IIIllIIlIIIIIIlIlIIllIIlI.lllIlIIlIIIlIlIIIllIlllIl(class_01752.IlIllllllIIlIIllllIIlIIIl()[i]);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S08PacketPlayerPosLook class_07172) {
        class_1389 class_13892 = this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII;
        double d = class_07172.IlIllllllIIlIIllllIIlIIIl();
        double d2 = class_07172.lIlllIlllIIIIlIIlllIllIII();
        double d3 = class_07172.IlIIIIIllllllIIlllIllllll();
        float f = class_07172.lIllllIIlIIIlIllllllIIIll();
        float f2 = class_07172.IIIllIIlIIIIIIlIlIIllIIlI();
        class_13892.IllllIIlIIIllIlllIlllIllI = 0.0f;
        class_13892.llIIIlllIlllIlIllIIIIllIl = 0.0;
        class_13892.IIlIIlIlIlIllIIlIlIIIIlll = 0.0;
        class_13892.IIIIIIIIlIllIIllIIlllIllI = 0.0;
        class_13892.lllIIIllIIIIlllIlIIllIIll(d, d2, d3, f, f2);
        this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(new C03PacketPlayer_C06PacketPlayerPosLook(class_13892.IlIIlllllIIlIlIlllllIllll, class_13892.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl, class_13892.llIIlIlIlllIIllIlIlllIllI, class_13892.IllIIIIllIIllIllIlllIlIIl, class_07172.lIllllIIlIIIlIllllllIIIll(), class_07172.IIIllIIlIIIIIIlIlIIllIIlI(), class_07172.IllIIlllllllIIlIIlIIIIlIl()), new GenericFutureListener[0]);
        if (!this.IllIIlllllllIIlIIlIIIIlIl) {
            this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.llIIlIllIllllIlIIIIlIIlll = this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.IlIIlllllIIlIlIlllllIllll;
            this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.llIllllIlIllIIIlIllIIlIlI = this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.llIIlIlIlllIIllIlIlllIllI;
            this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.lIlllIlllIlIIIIlllIlIlIIl = this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.IllIIIIllIIllIllIlllIlIIl;
            this.IllIIlllllllIIlIIlIIIIlIl = true;
            this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll((class_0229)null);
            LunarClient.getInstance().getModuleManager().lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll = System.currentTimeMillis();
            LunarClient.getInstance().getEventBus().callEvent(new class_0315());
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S22PacketMultiBlockChange class_16562) {
        int n = class_16562.IlIllllllIIlIIllllIIlIIIl().lllIIIllIIIIlllIlIIllIIll * 16;
        int n2 = class_16562.IlIllllllIIlIIllllIIlIIIl().lllIlIIlIIIlIlIIIllIlllIl * 16;
        if (class_16562.lIlllIlllIIIIlIIlllIllIII() != null) {
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(class_16562.lIlllIlllIIIIlIIlllIllIII()));
            try {
                for (int i = 0; i < class_16562.IlIIIIIllllllIIlllIllllll(); ++i) {
                    short s = dataInputStream.readShort();
                    short s2 = dataInputStream.readShort();
                    int n3 = s2 >> 4 & 0xFFF;
                    int n4 = s2 & 0xF;
                    int n5 = s >> 12 & 0xF;
                    int n6 = s >> 8 & 0xF;
                    int n7 = s & 0xFF;
                    this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(n5 + n, n7, n6 + n2, Block.lllIIIllIIIIlllIlIIllIIll(n3), n4);
                }
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S21PacketChunkData class_01502) {
        if (class_01502.IIIllIllIIlIlIlIlIllllIIl()) {
            if (class_01502.IIIllIIlIIIIIIlIlIIllIIlI() == 0) {
                this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(class_01502.IlIIIIIllllllIIlllIllllll(), class_01502.lIllllIIlIIIlIllllllIIIll(), false);
                return;
            }
            this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(class_01502.IlIIIIIllllllIIlllIllllll(), class_01502.lIllllIIlIIIlIllllllIIIll(), true);
        }
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(class_01502.IlIIIIIllllllIIlllIllllll() << 4, 0, class_01502.lIllllIIlIIIlIllllllIIIll() << 4, (class_01502.IlIIIIIllllllIIlllIllllll() << 4) + 15, 256, (class_01502.lIllllIIlIIIlIllllllIIIll() << 4) + 15);
        class_0723 class_07232 = this.IIIllIIlIIIIIIlIlIIllIIlI.IlIIIIIllllllIIlllIllllll(class_01502.IlIIIIIllllllIIlllIllllll(), class_01502.lIllllIIlIIIlIllllllIIIll());
        class_07232.lllIIIllIIIIlllIlIIllIIll(class_01502.lIlllIlllIIIIlIIlllIllIII(), class_01502.IIIllIIlIIIIIIlIlIIllIIlI(), class_01502.IllIIlllllllIIlIIlIIIIlIl(), class_01502.IIIllIllIIlIlIlIlIllllIIl());
        this.IIIllIIlIIIIIIlIlIIllIIlI.IlIllllllIIlIIllllIIlIIIl(class_01502.IlIIIIIllllllIIlllIllllll() << 4, 0, class_01502.lIllllIIlIIIlIllllllIIIll() << 4, (class_01502.IlIIIIIllllllIIlllIllllll() << 4) + 15, 256, (class_01502.lIllllIIlIIIlIllllllIIIll() << 4) + 15);
        if (!class_01502.IIIllIllIIlIlIlIlIllllIIl() || !(this.IIIllIIlIIIIIIlIlIIllIIlI.IlIlIIlllIIlIllIIIlllllIl instanceof class_0997)) {
            class_07232.llIIlllIllIllllIIIlIIIIII();
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S23PacketBlockChange class_20882) {
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(class_20882.lIlllIlllIIIIlIIlllIllIII(), class_20882.IlIIIIIllllllIIlllIllllll(), class_20882.lIllllIIlIIIlIllllllIIIll(), class_20882.IlIllllllIIlIIllllIIlIIIl(), class_20882.IIIllIIlIIIIIIlIlIIllIIlI());
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S40PacketDisconnect class_05422) {
        this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(class_05422.IlIllllllIIlIIllllIIlIIIl());
    }

    @Override
    public void onDisconnect(IChatComponent class_22552) {
        this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll((class_0564)null);
        LunarClient.getInstance().getEventBus().callEvent(new class_0780());
        if (this.IllIIIllIIIIlIlIlIllIIlll != null) {
            if (this.IllIIIllIIIIlIlIlIllIIlll instanceof class_1791) {
                this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(new DisconnectedOnlineScreen(((class_1791)this.IllIIIllIIIIlIlIlIllIIlll).lIllllIIlIIIlIllllllIIIll(), "disconnect.lost", class_22552).lllIIIllIIIIlllIlIIllIIll());
            } else {
                this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(new class_0768(this.IllIIIllIIIIlIlIlIllIIlll, "disconnect.lost", class_22552));
            }
        } else {
            this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(new class_0768(new class_1381(new class_2097()), "disconnect.lost", class_22552));
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(Packet class_07032) {
        this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(class_07032, new GenericFutureListener[0]);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S0DPacketCollectItem class_07812) {
        class_1521 class_15212 = this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(class_07812.IlIllllllIIlIIllllIIlIIIl());
        class_1965 class_19652 = (class_1965)this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(class_07812.lIlllIlllIIIIlIIlllIllIII());
        if (class_19652 == null) {
            class_19652 = this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII;
        }
        if (class_15212 != null) {
            if (class_15212 instanceof class_1138) {
                this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(class_15212, "random.orb", 0.2f, ((this.llIIlllIllIllllIIIlIIIIII.nextFloat() - this.llIIlllIllIllllIIIlIIIIII.nextFloat()) * 0.7f + 1.0f) * 2.0f);
            } else {
                this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(class_15212, "random.pop", 0.2f, ((this.llIIlllIllIllllIIIlIIIIII.nextFloat() - this.llIIlllIllIllllIIIlIIIIII.nextFloat()) * 0.7f + 1.0f) * 2.0f);
            }
            this.lIllllIIlIIIlIllllllIIIll.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(new class_0262((class_1334)this.lIllllIIlIIIlIllllllIIIll.theWorld, class_15212, class_19652, -0.5f));
            this.IIIllIIlIIIIIIlIlIIllIIlI.lllIlIIlIIIlIlIIIllIlllIl(class_07812.IlIllllllIIlIIllllIIlIIIl());
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S02PacketChat class_07102) {
        LunarClient.getInstance().getEventBus().callEvent(new class_0140(class_07102));
        this.lIllllIIlIIIlIllllllIIIll.IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(class_07102.IlIllllllIIlIIllllIIlIIIl());
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S0BPacketAnimation class_08422) {
        class_1521 class_15212 = this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(class_08422.IlIllllllIIlIIllllIIlIIIl());
        if (class_15212 != null) {
            if (class_08422.lIlllIlllIIIIlIIlllIllIII() == 0) {
                class_1965 class_19652 = (class_1965)class_15212;
                class_19652.lIIlIIIIIlIlllIlIIlIlIlll();
            } else if (class_08422.lIlllIlllIIIIlIIlllIllIII() == 1) {
                class_15212.llIIIlIlIlIIlIllIIIllIlIl();
            } else if (class_08422.lIlllIlllIIIIlIIlllIllIII() == 2) {
                class_0814 class_08142 = (class_0814)class_15212;
                class_08142.lllIIIllIIIIlllIlIIllIIll(false, false, false);
            } else if (class_08422.lIlllIlllIIIIlIIlllIllIII() == 4) {
                this.lIllllIIlIIIlIllllllIIIll.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(new class_0327(this.lIllllIIlIIIlIllllllIIIll.theWorld, class_15212));
            } else if (class_08422.lIlllIlllIIIIlIIlllIllIII() == 5) {
                class_0327 class_03272 = new class_0327(this.lIllllIIlIIIlIllllllIIIll.theWorld, class_15212, "magicCrit");
                this.lIllllIIlIIIlIllllllIIIll.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(class_03272);
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S0APacketUseBed class_10892) {
        class_10892.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI).IlIllllllIIlIIllllIIlIIIl(class_10892.IlIllllllIIlIIllllIIlIIIl(), class_10892.lIlllIlllIIIIlIIlllIllIII(), class_10892.IlIIIIIllllllIIlllIllllll());
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S0FPacketSpawnMob class_21922) {
        double d = (double)class_21922.lIllllIIlIIIlIllllllIIIll() / 32.0;
        double d2 = (double)class_21922.IIIllIIlIIIIIIlIlIIllIIlI() / 32.0;
        double d3 = (double)class_21922.IllIIlllllllIIlIIlIIIIlIl() / 32.0;
        float f = (float)(class_21922.llIIlllIllIllllIIIlIIIIII() * 360) / 256.0f;
        float f2 = (float)(class_21922.llIIllIllIlIIlIIllIllllll() * 360) / 256.0f;
        class_1965 class_19652 = (class_1965)class_0054.lllIIIllIIIIlllIlIIllIIll(class_21922.IlIIIIIllllllIIlllIllllll(), (class_1334)this.lIllllIIlIIIlIllllllIIIll.theWorld);
        class_19652.lIIlIIlIllIlIIlIlIIlIlIlI = class_21922.lIllllIIlIIIlIllllllIIIll();
        class_19652.llIIIIIlIIlIIIIllIIIlIIII = class_21922.IIIllIIlIIIIIIlIlIIllIIlI();
        class_19652.lIlIlIIllIIIlllIllIIlIllI = class_21922.IllIIlllllllIIlIIlIIIIlIl();
        class_19652.lIIllllIllIlllllIIllIllIl = (float)(class_21922.lllIIlIIIllllllIIIIlIlIlI() * 360) / 256.0f;
        class_1521[] arrclass_1521 = class_19652.lIIllllllllIlIllllllllIlI();
        if (arrclass_1521 != null) {
            int n = class_21922.lIlllIlllIIIIlIIlllIllIII() - class_19652.llllllIlIllllIlIlIlIIIIlI();
            for (int i = 0; i < arrclass_1521.length; ++i) {
                arrclass_1521[i].lIlllIlllIIIIlIIlllIllIII(arrclass_1521[i].llllllIlIllllIlIlIlIIIIlI() + n);
            }
        }
        class_19652.lIlllIlllIIIIlIIlllIllIII(class_21922.lIlllIlllIIIIlIIlllIllIII());
        class_19652.lllIIIllIIIIlllIlIIllIIll(d, d2, d3, f, f2);
        class_19652.IIIIIIIIlIllIIllIIlllIllI = (float)class_21922.IIIllIllIIlIlIlIlIllllIIl() / 8000.0f;
        class_19652.IIlIIlIlIlIllIIlIlIIIIlll = (float)class_21922.IllIIIllIIIIlIlIlIllIIlll() / 8000.0f;
        class_19652.llIIIlllIlllIlIllIIIIllIl = (float)class_21922.lIIIIlIlIIlllllIIllIIlIII() / 8000.0f;
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(class_21922.lIlllIlllIIIIlIIlllIllIII(), (class_1521)class_19652);
        List list = class_21922.IlIllllllIIlIIllllIIlIIIl();
        if (list != null) {
            class_19652.lIlIIllllIlIIIIllIIIIlIIl().lllIIIllIIIIlllIlIIllIIll(list);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S03PacketTimeUpdate class_19162) {
        this.lIllllIIlIIIlIllllllIIIll.theWorld.lllIlIIlIIIlIlIIIllIlllIl(class_19162.IlIllllllIIlIIllllIIlIIIl());
        if ((Integer) LunarClient.getInstance().getSettingsManager().gsWorldTime.getValue() == -14490) {
            this.lIllllIIlIIIlIllllllIIIll.theWorld.lllIIIllIIIIlllIlIIllIIll(class_19162.lIlllIlllIIIIlIIlllIllIII());
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S05PacketSpawnPosition class_14442) {
        this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(new class_2208(class_14442.IlIllllllIIlIIllllIIlIIIl(), class_14442.lIlllIlllIIIIlIIlllIllIII(), class_14442.IlIIIIIllllllIIlllIllllll()), true);
        this.lIllllIIlIIIlIllllllIIIll.theWorld.lIlllIlllIlIIIIlllIlIlIIl().lllIIIllIIIIlllIlIIllIIll(class_14442.IlIllllllIIlIIllllIIlIIIl(), class_14442.lIlllIlllIIIIlIIlllIllIII(), class_14442.IlIIIIIllllllIIlllIllllll());
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S1BPacketEntityAttach class_22182) {
        class_1521 class_15212 = this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(class_22182.lIlllIlllIIIIlIIlllIllIII());
        class_1521 class_15213 = this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(class_22182.IlIIIIIllllllIIlllIllllll());
        if (class_22182.IlIllllllIIlIIllllIIlIIIl() == 0) {
            boolean bl = false;
            if (class_22182.lIlllIlllIIIIlIIlllIllIII() == this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.llllllIlIllllIlIlIlIIIIlI()) {
                class_15212 = this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII;
                if (class_15213 instanceof class_2263) {
                    ((class_2263)class_15213).lllIIIllIIIIlllIlIIllIIll(false);
                }
                bl = class_15212.IlIIIlIIIIllIIIllIIIIIIll == null && class_15213 != null;
            } else if (class_15213 instanceof class_2263) {
                ((class_2263)class_15213).lllIIIllIIIIlllIlIIllIIll(true);
            }
            if (class_15212 == null) {
                return;
            }
            class_15212.lllIIIllIIIIlllIlIIllIIll(class_15213);
            if (bl) {
                GameSettings class_17512 = this.lIllllIIlIIIlIllllllIIIll.gameSettings;
                this.lIllllIIlIIIlIllllllIIIll.IlIIIlIIIIllIIIllIIIIIIll.lllIIIllIIIIlllIlIIllIIll(class_0616.lllIIIllIIIIlllIlIIllIIll("mount.onboard", GameSettings.lllIIIllIIIIlllIlIIllIIll(class_17512.lIIIlllllllIlllIIllllllll.IIIllIllIIlIlIlIlIllllIIl())), false);
            }
        } else if (class_22182.IlIllllllIIlIIllllIIlIIIl() == 1 && class_15212 != null && class_15212 instanceof class_0339) {
            if (class_15213 != null) {
                ((class_0339)class_15212).lllIlIIlIIIlIlIIIllIlllIl(class_15213, false);
            } else {
                ((class_0339)class_15212).lllIIIllIIIIlllIlIIllIIll(false, false);
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S19PacketEntityStatus class_05142) {
        class_1521 class_15212 = class_05142.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI);
        if (class_15212 != null) {
            class_15212.lllIIIllIIIIlllIlIIllIIll(class_05142.IlIllllllIIlIIllllIIlIIIl());
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S06PacketUpdateHealth class_11602) {
        this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.lIlllIlllIIIIlIIlllIllIII(class_11602.IlIllllllIIlIIllllIIlIIIl());
        this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.lIllIIlllIIIlIlIIIlllIlIl().lllIIIllIIIIlllIlIIllIIll(class_11602.lIlllIlllIIIIlIIlllIllIII());
        this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.lIllIIlllIIIlIlIIIlllIlIl().lllIlIIlIIIlIlIIIllIlllIl(class_11602.IlIIIIIllllllIIlllIllllll());
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S1FPacketSetExperience class_11342) {
        this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(class_11342.IlIllllllIIlIIllllIIlIIIl(), class_11342.lIlllIlllIIIIlIIlllIllIII(), class_11342.IlIIIIIllllllIIlllIllllll());
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S07PacketRespawn class_02712) {
        if (class_02712.IlIllllllIIlIIllllIIlIIIl() != this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.lIIllllllllIlIllllllllIlI) {
            this.IllIIlllllllIIlIIlIIIIlIl = false;
            class_0141 class_01412 = this.IIIllIIlIIIIIIlIlIIllIIlI.IlIlIIlllIllllllllIIIlIlI();
            this.IIIllIIlIIIIIIlIlIIllIIlI = new class_0564(this, new class_1078(0L, class_02712.IlIIIIIllllllIIlllIllllll(), false, this.lIllllIIlIIIlIllllllIIIll.theWorld.lIlllIlllIlIIIIlllIlIlIIl().lIlIlIIlIIIIlIIIIIlllIIII(), class_02712.lIllllIIlIIIlIllllllIIIll()), class_02712.IlIllllllIIlIIllllIIlIIIl(), class_02712.lIlllIlllIIIIlIIlllIllIII(), this.lIllllIIlIIIlIllllllIIIll.mcProfiler);
            this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(class_01412);
            this.IIIllIIlIIIIIIlIlIIllIIlI.IllIIIIllIIllIllIlllIlIIl = true;
            this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI);
            this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.lIIllllllllIlIllllllllIlI = class_02712.IlIllllllIIlIIllllIIlIIIl();
            this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(new class_2224(this));
        }
        this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(class_02712.IlIllllllIIlIIllllIIlIIIl());
        this.lIllllIIlIIIlIllllllIIIll.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(class_02712.IlIIIIIllllllIIlllIllllll());
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S27PacketExplosion class_04042) {
        class_1013 class_10132 = new class_1013(this.lIllllIIlIIIlIllllllIIIll.theWorld, null, class_04042.lIllllIIlIIIlIllllllIIIll(), class_04042.IIIllIIlIIIIIIlIlIIllIIlI(), class_04042.IllIIlllllllIIlIIlIIIIlIl(), class_04042.IIIllIllIIlIlIlIlIllllIIl());
        class_10132.IllIIlllllllIIlIIlIIIIlIl = class_04042.IllIIIllIIIIlIlIlIllIIlll();
        class_10132.lllIIIllIIIIlllIlIIllIIll(true);
        this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.IIIIIIIIlIllIIllIIlllIllI += (double)class_04042.IlIllllllIIlIIllllIIlIIIl();
        this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.IIlIIlIlIlIllIIlIlIIIIlll += (double)class_04042.lIlllIlllIIIIlIIlllIllIII();
        this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.llIIIlllIlllIlIllIIIIllIl += (double)class_04042.IlIIIIIllllllIIlllIllllll();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S2DPacketOpenWindow class_22472) {
        class_1389 class_13892 = this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII;
        switch (class_22472.lIlllIlllIIIIlIIlllIllIII()) {
            case 0: {
                class_13892.lllIIIllIIIIlllIlIIllIIll(new class_1749(class_22472.IlIIIIIllllllIIlllIllllll(), class_22472.IIIllIIlIIIIIIlIlIIllIIlI(), class_22472.lIllllIIlIIIlIllllllIIIll()));
                class_13892.lIIIlIllllIlllIIIIIllIIIl.lIlllIlllIIIIlIIlllIllIII = class_22472.IlIllllllIIlIIllllIIlIIIl();
                break;
            }
            case 1: {
                class_13892.lllIIIllIIIIlllIlIIllIIll(MathHelper.IlIllllllIIlIIllllIIlIIIl(class_13892.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(class_13892.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(class_13892.IllIIIIllIIllIllIlllIlIIl));
                class_13892.lIIIlIllllIlllIIIIIllIIIl.lIlllIlllIIIIlIIlllIllIII = class_22472.IlIllllllIIlIIllllIIlIIIl();
                break;
            }
            case 2: {
                class_1587 class_15872 = new class_1587();
                if (class_22472.IIIllIIlIIIIIIlIlIIllIIlI()) {
                    class_15872.lllIIIllIIIIlllIlIIllIIll(class_22472.IlIIIIIllllllIIlllIllllll());
                }
                class_13892.lllIIIllIIIIlllIlIIllIIll(class_15872);
                class_13892.lIIIlIllllIlllIIIIIllIIIl.lIlllIlllIIIIlIIlllIllIII = class_22472.IlIllllllIIlIIllllIIlIIIl();
                break;
            }
            case 3: {
                class_1646 class_16462 = new class_1646();
                if (class_22472.IIIllIIlIIIIIIlIlIIllIIlI()) {
                    class_16462.lllIIIllIIIIlllIlIIllIIll(class_22472.IlIIIIIllllllIIlllIllllll());
                }
                class_13892.lllIIIllIIIIlllIlIIllIIll(class_16462);
                class_13892.lIIIlIllllIlllIIIIIllIIIl.lIlllIlllIIIIlIIlllIllIII = class_22472.IlIllllllIIlIIllllIIlIIIl();
                break;
            }
            case 4: {
                class_13892.lllIIIllIIIIlllIlIIllIIll(MathHelper.IlIllllllIIlIIllllIIlIIIl(class_13892.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(class_13892.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(class_13892.IllIIIIllIIllIllIlllIlIIl), class_22472.IIIllIIlIIIIIIlIlIIllIIlI() ? class_22472.IlIIIIIllllllIIlllIllllll() : null);
                class_13892.lIIIlIllllIlllIIIIIllIIIl.lIlllIlllIIIIlIIlllIllIII = class_22472.IlIllllllIIlIIllllIIlIIIl();
                break;
            }
            case 5: {
                class_0647 class_06472 = new class_0647();
                if (class_22472.IIIllIIlIIIIIIlIlIIllIIlI()) {
                    class_06472.lllIIIllIIIIlllIlIIllIIll(class_22472.IlIIIIIllllllIIlllIllllll());
                }
                class_13892.lllIIIllIIIIlllIlIIllIIll(class_06472);
                class_13892.lIIIlIllllIlllIIIIIllIIIl.lIlllIlllIIIIlIIlllIllIII = class_22472.IlIllllllIIlIIllllIIlIIIl();
                break;
            }
            case 6: {
                class_13892.lllIIIllIIIIlllIlIIllIIll(new class_1948(class_13892), class_22472.IIIllIIlIIIIIIlIlIIllIIlI() ? class_22472.IlIIIIIllllllIIlllIllllll() : null);
                class_13892.lIIIlIllllIlllIIIIIllIIIl.lIlllIlllIIIIlIIlllIllIII = class_22472.IlIllllllIIlIIllllIIlIIIl();
                break;
            }
            case 7: {
                class_0396 class_03962 = new class_0396();
                class_13892.lllIIIllIIIIlllIlIIllIIll(class_03962);
                if (class_22472.IIIllIIlIIIIIIlIlIIllIIlI()) {
                    class_03962.lllIIIllIIIIlllIlIIllIIll(class_22472.IlIIIIIllllllIIlllIllllll());
                }
                class_13892.lIIIlIllllIlllIIIIIllIIIl.lIlllIlllIIIIlIIlllIllIII = class_22472.IlIllllllIIlIIllllIIlIIIl();
                break;
            }
            case 8: {
                class_13892.lllIlIIlIIIlIlIIIllIlllIl(MathHelper.IlIllllllIIlIIllllIIlIIIl(class_13892.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(class_13892.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(class_13892.IllIIIIllIIllIllIlllIlIIl));
                class_13892.lIIIlIllllIlllIIIIIllIIIl.lIlllIlllIIIIlIIlllIllIII = class_22472.IlIllllllIIlIIllllIIlIIIl();
                break;
            }
            case 9: {
                class_0879 class_08792 = new class_0879();
                if (class_22472.IIIllIIlIIIIIIlIlIIllIIlI()) {
                    class_08792.lllIIIllIIIIlllIlIIllIIll(class_22472.IlIIIIIllllllIIlllIllllll());
                }
                class_13892.lllIIIllIIIIlllIlIIllIIll(class_08792);
                class_13892.lIIIlIllllIlllIIIIIllIIIl.lIlllIlllIIIIlIIlllIllIII = class_22472.IlIllllllIIlIIllllIIlIIIl();
                break;
            }
            case 10: {
                class_1798 class_17982 = new class_1798();
                if (class_22472.IIIllIIlIIIIIIlIlIIllIIlI()) {
                    class_17982.lllIIIllIIIIlllIlIIllIIll(class_22472.IlIIIIIllllllIIlllIllllll());
                }
                class_13892.lllIIIllIIIIlllIlIIllIIll(class_17982);
                class_13892.lIIIlIllllIlllIIIIIllIIIl.lIlllIlllIIIIlIIlllIllIII = class_22472.IlIllllllIIlIIllllIIlIIIl();
                break;
            }
            case 11: {
                class_1521 class_15212 = this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(class_22472.IllIIlllllllIIlIIlIIIIlIl());
                if (class_15212 == null || !(class_15212 instanceof class_1627)) break;
                class_13892.lllIIIllIIIIlllIlIIllIIll((class_1627)class_15212, new class_0583(class_22472.IlIIIIIllllllIIlllIllllll(), class_22472.IIIllIIlIIIIIIlIlIIllIIlI(), class_22472.lIllllIIlIIIlIllllllIIIll()));
                class_13892.lIIIlIllllIlllIIIIIllIIIl.lIlllIlllIIIIlIIlllIllIII = class_22472.IlIllllllIIlIIllllIIlIIIl();
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S2FPacketSetSlot class_14802) {
        class_1389 class_13892 = this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII;
        if (class_14802.IlIllllllIIlIIllllIIlIIIl() == -1) {
            class_13892.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl(class_14802.IlIIIIIllllllIIlllIllllll());
        } else {
            Object object;
            boolean bl = false;
            if (this.lIllllIIlIIIlIllllllIIIll.lllllIlllIIllIlIIlIIIllII instanceof class_0528) {
                object = (class_0528)this.lIllllIIlIIIlIllllllIIIll.lllllIlllIIllIlIIlIIIllII;
                boolean bl2 = bl = ((class_0528)object).lIllllIIlIIIlIllllllIIIll() != class_0931.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll();
            }
            if (class_14802.IlIllllllIIlIIllllIIlIIIl() == 0 && class_14802.lIlllIlllIIIIlIIlllIllIII() >= 36 && class_14802.lIlllIlllIIIIlIIlllIllIII() < 45) {
                object = class_13892.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(class_14802.lIlllIlllIIIIlIIlllIllIII()).lllIIIllIIIIlllIlIIllIIll();
                if (class_14802.IlIIIIIllllllIIlllIllllll() != null && (object == null || ((ItemStack)object).lllIlIIlIIIlIlIIIllIlllIl < class_14802.IlIIIIIllllllIIlllIllllll().lllIlIIlIIIlIlIIIllIlllIl)) {
                    class_14802.IlIIIIIllllllIIlllIllllll().IlIllllllIIlIIllllIIlIIIl = 5;
                }
                class_13892.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(class_14802.lIlllIlllIIIIlIIlllIllIII(), class_14802.IlIIIIIllllllIIlllIllllll());
            } else if (!(class_14802.IlIllllllIIlIIllllIIlIIIl() != class_13892.lIIIlIllllIlllIIIIIllIIIl.lIlllIlllIIIIlIIlllIllIII || class_14802.IlIllllllIIlIIllllIIlIIIl() == 0 && bl)) {
                class_13892.lIIIlIllllIlllIIIIIllIIIl.lllIIIllIIIIlllIlIIllIIll(class_14802.lIlllIlllIIIIlIIlllIllIII(), class_14802.IlIIIIIllllllIIlllIllllll());
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S32PacketConfirmTransaction class_14342) {
        class_1071 class_10712 = null;
        class_1389 class_13892 = this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII;
        if (class_14342.IlIllllllIIlIIllllIIlIIIl() == 0) {
            class_10712 = class_13892.IlIlllIIIIIIlIIllIIllIlll;
        } else if (class_14342.IlIllllllIIlIIllllIIlIIIl() == class_13892.lIIIlIllllIlllIIIIIllIIIl.lIlllIlllIIIIlIIlllIllIII) {
            class_10712 = class_13892.lIIIlIllllIlllIIIIIllIIIl;
        }
        if (class_10712 != null && !class_14342.IlIIIIIllllllIIlllIllllll()) {
            this.lllIIIllIIIIlllIlIIllIIll(new C0FPacketConfirmTransaction(class_14342.IlIllllllIIlIIllllIIlIIIl(), class_14342.lIlllIlllIIIIlIIlllIllIII(), true));
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S30PacketWindowItems class_18042) {
        class_1389 class_13892 = this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII;
        if (class_18042.IlIllllllIIlIIllllIIlIIIl() == 0) {
            class_13892.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(class_18042.lIlllIlllIIIIlIIlllIllIII());
        } else if (class_18042.IlIllllllIIlIIllllIIlIIIl() == class_13892.lIIIlIllllIlllIIIIIllIIIl.lIlllIlllIIIIlIIlllIllIII) {
            class_13892.lIIIlIllllIlllIIIIIllIIIl.lllIIIllIIIIlllIlIIllIIll(class_18042.lIlllIlllIIIIlIIlllIllIII());
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S36PacketSignEditorOpen class_15042) {
        class_1774 class_17742 = this.IIIllIIlIIIIIIlIlIIllIIlI.lllIlIIlIIIlIlIIIllIlllIl(class_15042.IlIllllllIIlIIllllIIlIIIl(), class_15042.lIlllIlllIIIIlIIlllIllIII(), class_15042.IlIIIIIllllllIIlllIllllll());
        if (class_17742 == null) {
            class_17742 = new class_2219();
            class_17742.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI);
            class_17742.lllIlIIlIIIlIlIIIllIlllIl = class_15042.IlIllllllIIlIIllllIIlIIIl();
            class_17742.IlIllllllIIlIIllllIIlIIIl = class_15042.lIlllIlllIIIIlIIlllIllIII();
            class_17742.lIlllIlllIIIIlIIlllIllIII = class_15042.IlIIIIIllllllIIlllIllllll();
        }
        this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(class_17742);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S33PacketUpdateSign class_01362) {
        class_1774 class_17742;
        boolean bl = false;
        if (this.lIllllIIlIIIlIllllllIIIll.theWorld.IlIIIIIllllllIIlllIllllll(class_01362.IlIllllllIIlIIllllIIlIIIl(), class_01362.lIlllIlllIIIIlIIlllIllIII(), class_01362.IlIIIIIllllllIIlllIllllll()) && (class_17742 = this.lIllllIIlIIIlIllllllIIIll.theWorld.lllIlIIlIIIlIlIIIllIlllIl(class_01362.IlIllllllIIlIIllllIIlIIIl(), class_01362.lIlllIlllIIIIlIIlllIllIII(), class_01362.IlIIIIIllllllIIlllIllllll())) instanceof class_2219) {
            class_2219 class_22192 = (class_2219)class_17742;
            if (class_22192.lllIIIllIIIIlllIlIIllIIll()) {
                for (int i = 0; i < 4; ++i) {
                    class_22192.IllIIlllllllIIlIIlIIIIlIl[i] = class_01362.lIllllIIlIIIlIllllllIIIll()[i];
                }
                class_22192.llIIlIllIllllIlIIIIlIIlll();
            }
            bl = true;
        }
        if (bl || this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII != null) {
            // empty if block
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S35PacketUpdateTileEntity class_11802) {
        class_1774 class_17742;
        if (this.lIllllIIlIIIlIllllllIIIll.theWorld.IlIIIIIllllllIIlllIllllll(class_11802.IlIllllllIIlIIllllIIlIIIl(), class_11802.lIlllIlllIIIIlIIlllIllIII(), class_11802.IlIIIIIllllllIIlllIllllll()) && (class_17742 = this.lIllllIIlIIIlIllllllIIIll.theWorld.lllIlIIlIIIlIlIIIllIlllIl(class_11802.IlIllllllIIlIIllllIIlIIIl(), class_11802.lIlllIlllIIIIlIIlllIllIII(), class_11802.IlIIIIIllllllIIlllIllllll())) != null) {
            if (class_11802.lIllllIIlIIIlIllllllIIIll() == 1 && class_17742 instanceof class_0933) {
                class_17742.lllIIIllIIIIlllIlIIllIIll(class_11802.IIIllIIlIIIIIIlIlIIllIIlI());
            } else if (class_11802.lIllllIIlIIIlIllllllIIIll() == 2 && class_17742 instanceof class_1345) {
                class_17742.lllIIIllIIIIlllIlIIllIIll(class_11802.IIIllIIlIIIIIIlIlIIllIIlI());
            } else if (class_11802.lIllllIIlIIIlIllllllIIIll() == 3 && class_17742 instanceof class_0396) {
                class_17742.lllIIIllIIIIlllIlIIllIIll(class_11802.IIIllIIlIIIIIIlIlIIllIIlI());
            } else if (class_11802.lIllllIIlIIIlIllllllIIIll() == 4 && class_17742 instanceof class_0090) {
                class_17742.lllIIIllIIIIlllIlIIllIIll(class_11802.IIIllIIlIIIIIIlIlIIllIIlI());
            } else if (class_11802.lIllllIIlIIIlIllllllIIIll() == 5 && class_17742 instanceof class_0461) {
                class_17742.lllIIIllIIIIlllIlIIllIIll(class_11802.IIIllIIlIIIIIIlIlIIllIIlI());
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S31PacketWindowProperty class_12362) {
        class_1389 class_13892 = this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII;
        if (class_13892.lIIIlIllllIlllIIIIIllIIIl != null && class_13892.lIIIlIllllIlllIIIIIllIIIl.lIlllIlllIIIIlIIlllIllIII == class_12362.IlIllllllIIlIIllllIIlIIIl()) {
            class_13892.lIIIlIllllIlllIIIIIllIIIl.lllIIIllIIIIlllIlIIllIIll(class_12362.lIlllIlllIIIIlIIlllIllIII(), class_12362.IlIIIIIllllllIIlllIllllll());
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S04PacketEntityEquipment class_22252) {
        class_1521 class_15212 = this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(class_22252.lIlllIlllIIIIlIIlllIllIII());
        if (class_15212 != null) {
            class_15212.lllIIIllIIIIlllIlIIllIIll(class_22252.IlIIIIIllllllIIlllIllllll(), class_22252.IlIllllllIIlIIllllIIlIIIl());
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S2EPacketCloseWindow class_10092) {
        this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.IIlllIlIlllIllIIIlllIIlIl();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S24PacketBlockAction class_12672) {
        this.lIllllIIlIIIlIllllllIIIll.theWorld.lIlllIlllIIIIlIIlllIllIII(class_12672.lIlllIlllIIIIlIIlllIllIII(), class_12672.IlIIIIIllllllIIlllIllllll(), class_12672.lIllllIIlIIIlIllllllIIIll(), class_12672.IlIllllllIIlIIllllIIlIIIl(), class_12672.IIIllIIlIIIIIIlIlIIllIIlI(), class_12672.IllIIlllllllIIlIIlIIIIlIl());
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S25PacketBlockBreakAnim class_21032) {
        this.lIllllIIlIIIlIllllllIIIll.theWorld.lIlllIlllIIIIlIIlllIllIII(class_21032.IlIllllllIIlIIllllIIlIIIl(), class_21032.lIlllIlllIIIIlIIlllIllIII(), class_21032.IlIIIIIllllllIIlllIllllll(), class_21032.lIllllIIlIIIlIllllllIIIll(), class_21032.IIIllIIlIIIIIIlIlIIllIIlI());
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S26PacketMapChunkBulk class_20532) {
        for (int i = 0; i < class_20532.lIlllIlllIIIIlIIlllIllIII(); ++i) {
            int n = class_20532.lllIIIllIIIIlllIlIIllIIll(i);
            int n2 = class_20532.lllIlIIlIIIlIlIIIllIlllIl(i);
            this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(n, n2, true);
            this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(n << 4, 0, n2 << 4, (n << 4) + 15, 256, (n2 << 4) + 15);
            class_0723 class_07232 = this.IIIllIIlIIIIIIlIlIIllIIlI.IlIIIIIllllllIIlllIllllll(n, n2);
            class_07232.lllIIIllIIIIlllIlIIllIIll(class_20532.IlIllllllIIlIIllllIIlIIIl(i), class_20532.IlIIIIIllllllIIlllIllllll()[i], class_20532.lIllllIIlIIIlIllllllIIIll()[i], true);
            this.IIIllIIlIIIIIIlIlIIllIIlI.IlIllllllIIlIIllllIIlIIIl(n << 4, 0, n2 << 4, (n << 4) + 15, 256, (n2 << 4) + 15);
            if (this.IIIllIIlIIIIIIlIlIIllIIlI.IlIlIIlllIIlIllIIIlllllIl instanceof class_0997) continue;
            class_07232.llIIlllIllIllllIIIlIIIIII();
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S2BPacketChangeGameState class_07422) {
        class_1389 class_13892 = this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII;
        int n = class_07422.IlIllllllIIlIIllllIIlIIIl();
        float f = class_07422.lIlllIlllIIIIlIIlllIllIII();
        int n2 = MathHelper.lIlllIlllIIIIlIIlllIllIII(f + 0.5f);
        if (n >= 0 && n < S2BPacketChangeGameState.lllIIIllIIIIlllIlIIllIIll.length && S2BPacketChangeGameState.lllIIIllIIIIlllIlIIllIIll[n] != null && n != 3) {
            class_13892.lllIlIIlIIIlIlIIIllIlllIl(new ChatComponentTranslation(S2BPacketChangeGameState.lllIIIllIIIIlllIlIIllIIll[n], new Object[0]));
        }
        if (n == 1) {
            this.IIIllIIlIIIIIIlIlIIllIIlI.lIlllIlllIlIIIIlllIlIlIIl().lllIlIIlIIIlIlIIIllIlllIl(true);
            this.IIIllIIlIIIIIIlIlIIllIIlI.lIIIIlIlIIlllllIIllIIlIII(0.0f);
        } else if (n == 2) {
            this.IIIllIIlIIIIIIlIlIIllIIlI.lIlllIlllIlIIIIlllIlIlIIl().lllIlIIlIIIlIlIIIllIlllIl(false);
            this.IIIllIIlIIIIIIlIlIIllIIlI.lIIIIlIlIIlllllIIllIIlIII(1.0f);
        } else if (n == 3) {
            this.lIllllIIlIIIlIllllllIIIll.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(class_2243.lllIIIllIIIIlllIlIIllIIll(n2));
        } else if (n == 4) {
            this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(new class_0867());
        } else if (n == 5) {
            GameSettings class_17512 = this.lIllllIIlIIIlIllllllIIIll.gameSettings;
            if (f == 0.0f) {
                this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(new class_1284());
            } else if (f == 101.0f) {
                this.lIllllIIlIIIlIllllllIIIll.IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(new ChatComponentTranslation("demo.help.movement", GameSettings.lllIIIllIIIIlllIlIIllIIll(class_17512.lllIIIlllIlllIIlIllllIIlI.IIIllIllIIlIlIlIlIllllIIl()), GameSettings.lllIIIllIIIIlllIlIIllIIll(class_17512.lIIlIlllIIlllIIlllIIlIlII.IIIllIllIIlIlIlIlIllllIIl()), GameSettings.lllIIIllIIIIlllIlIIllIIll(class_17512.lIIlIIIlIlIIlllIlIllIllIl.IIIllIllIIlIlIlIlIllllIIl()), GameSettings.lllIIIllIIIIlllIlIIllIIll(class_17512.lIIlIlIIIIIllIIIIllIlIlII.IIIllIllIIlIlIlIlIllllIIl())));
            } else if (f == 102.0f) {
                this.lIllllIIlIIIlIllllllIIIll.IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(new ChatComponentTranslation("demo.help.jump", GameSettings.lllIIIllIIIIlllIlIIllIIll(class_17512.lIIIIlIIIIllIlIIllllIlIII.IIIllIllIIlIlIlIlIllllIIl())));
            } else if (f == 103.0f) {
                this.lIllllIIlIIIlIllllllIIIll.IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(new ChatComponentTranslation("demo.help.inventory", GameSettings.lllIIIllIIIIlllIlIIllIIll(class_17512.IIllllIIlIlIlIlllIIIllIIl.IIIllIllIIlIlIlIlIllllIIl())));
            }
        } else if (n == 6) {
            this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(class_13892.IlIIlllllIIlIlIlllllIllll, class_13892.llIIlIlIlllIIllIlIlllIllI + (double)class_13892.llIIllIllIlIIlIIllIllllll(), class_13892.IllIIIIllIIllIllIlllIlIIl, "random.successful_hit", 0.18f, 0.45f, false);
        } else if (n == 7) {
            this.IIIllIIlIIIIIIlIlIIllIIlI.lIIIIlIlIIlllllIIllIIlIII(f);
        } else if (n == 8) {
            this.IIIllIIlIIIIIIlIlIIllIIlI.IIIllIllIIlIlIlIlIllllIIl(f);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S34PacketMaps class_17322) {
        class_0963 class_09632 = class_0746.lllIIIllIIIIlllIlIIllIIll(class_17322.IlIllllllIIlIIllllIIlIIIl(), this.lIllllIIlIIIlIllllllIIIll.theWorld);
        class_09632.lllIIIllIIIIlllIlIIllIIll(class_17322.lIlllIlllIIIIlIIlllIllIII());
        this.lIllllIIlIIIlIllllllIIIll.lIIlIIIIIlIlllIlIIlIlIlll.IllIIIllIIIIlIlIlIllIIlll().lllIIIllIIIIlllIlIIllIIll(class_09632);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S28PacketEffect class_21862) {
        if (class_21862.IlIllllllIIlIIllllIIlIIIl()) {
            this.lIllllIIlIIIlIllllllIIIll.theWorld.lllIlIIlIIIlIlIIIllIlllIl(class_21862.lIlllIlllIIIIlIIlllIllIII(), class_21862.lIllllIIlIIIlIllllllIIIll(), class_21862.IIIllIIlIIIIIIlIlIIllIIlI(), class_21862.IllIIlllllllIIlIIlIIIIlIl(), class_21862.IlIIIIIllllllIIlllIllllll());
        } else {
            this.lIllllIIlIIIlIllllllIIIll.theWorld.IlIllllllIIlIIllllIIlIIIl(class_21862.lIlllIlllIIIIlIIlllIllIII(), class_21862.lIllllIIlIIIlIllllllIIIll(), class_21862.IIIllIIlIIIIIIlIlIIllIIlI(), class_21862.IllIIlllllllIIlIIlIIIIlIl(), class_21862.IlIIIIIllllllIIlllIllllll());
        }
    }

    @Override
    public void handleStatistics(S37PacketStatistics class_10952) {
        boolean bl = false;
        for (Map.Entry entry : class_10952.func_148974_c().entrySet()) {
            StatBase class_03192 = (StatBase)entry.getKey();
            int n = (Integer)entry.getValue();
            if (class_03192.lIlllIlllIIIIlIIlllIllIII() && n > 0) {
                if (this.lIIIIlIlIIlllllIIllIIlIII && this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.IlIIlllllIIlIlIlllllIllll().lllIIIllIIIIlllIlIIllIIll(class_03192) == 0) {
                    Achievement class_07472 = (Achievement)class_03192;
                    this.lIllllIIlIIIlIllllllIIIll.lIlIlIIlIIIIlIIIIIlllIIII.lllIIIllIIIIlllIlIIllIIll(class_07472);
                    if (class_03192 == AchievementList.openInventory) {
                        this.lIllllIIlIIIlIllllllIIIll.gameSettings.IlIIIIIIIIIIlIIlllIIIlIlI = false;
                        this.lIllllIIlIIIlIllllllIIIll.gameSettings.IlIllllllIIlIIllllIIlIIIl();
                    }
                }
                bl = true;
            }
            this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.IlIIlllllIIlIlIlllllIllll().lllIlIIlIIIlIlIIIllIlllIl(this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII, class_03192, n);
        }
        if (!this.lIIIIlIlIIlllllIIllIIlIII && !bl && this.lIllllIIlIIIlIllllllIIIll.gameSettings.IlIIIIIIIIIIlIIlllIIIlIlI) {
            this.lIllllIIlIIIlIllllllIIIll.lIlIlIIlIIIIlIIIIIlllIIII.lllIlIIlIIIlIlIIIllIlllIl(AchievementList.openInventory);
        }
        this.lIIIIlIlIIlllllIIllIIlIII = true;
        if (this.lIllllIIlIIIlIllllllIIIll.lllllIlllIIllIlIIlIIIllII instanceof class_1216) {
            ((class_1216)((Object)this.lIllllIIlIIIlIllllllIIIll.lllllIlllIIllIlIIlIIIllII)).lllIlIIlIIIlIlIIIllIlllIl();
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S1DPacketEntityEffect class_05702) {
        class_1521 class_15212 = this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(class_05702.lIlllIlllIIIIlIIlllIllIII());
        if (class_15212 instanceof class_1965) {
            class_1852 class_18522 = new class_1852(class_05702.IlIIIIIllllllIIlllIllllll(), class_05702.IIIllIIlIIIIIIlIlIIllIIlI(), class_05702.lIllllIIlIIIlIllllllIIIll());
            class_18522.lllIlIIlIIIlIlIIIllIlllIl(class_05702.IlIllllllIIlIIllllIIlIIIl());
            ((class_1965)class_15212).lllIIIllIIIIlllIlIIllIIll(class_18522);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S1EPacketRemoveEntityEffect class_10272) {
        class_1521 class_15212 = this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(class_10272.IlIllllllIIlIIllllIIlIIIl());
        if (class_15212 instanceof class_1965) {
            ((class_1965)class_15212).lllIIlIIIllllllIIIIlIlIlI(class_10272.lIlllIlllIIIIlIIlllIllIII());
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S38PacketPlayerListItem class_09992) {
        class_0958 class_09582 = (class_0958)this.IIIllIllIIlIlIlIlIllllIIl.get(class_09992.IlIllllllIIlIIllllIIlIIIl());
        if (class_09582 == null && class_09992.lIlllIlllIIIIlIIlllIllIII()) {
            class_09582 = new class_0958(class_09992.IlIllllllIIlIIllllIIlIIIl());
            this.IIIllIllIIlIlIlIlIllllIIl.put(class_09992.IlIllllllIIlIIllllIIlIIIl(), class_09582);
            this.lllIlIIlIIIlIlIIIllIlllIl.add(class_09582);
        }
        if (class_09582 != null && !class_09992.lIlllIlllIIIIlIIlllIllIII()) {
            this.IIIllIllIIlIlIlIlIllllIIl.remove(class_09992.IlIllllllIIlIIllllIIlIIIl());
            this.lllIlIIlIIIlIlIIIllIlllIl.remove(class_09582);
        }
        if (class_09582 != null && class_09992.lIlllIlllIIIIlIIlllIllIII()) {
            class_09582.lllIlIIlIIIlIlIIIllIlllIl = class_09992.IlIIIIIllllllIIlllIllllll();
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S00PacketKeepAlive class_10802) {
        LunarClient.getInstance().getEventBus().callEvent(new class_1211());
        this.lllIIIllIIIIlllIlIIllIIll(new C00PacketKeepAlive(class_10802.IlIllllllIIlIIllllIIlIIIl()));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(EnumConnectionState class_05462, EnumConnectionState class_05463) {
        throw new IllegalStateException("Unexpected protocol change!");
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S39PacketPlayerAbilities class_11702) {
        class_1389 class_13892 = this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII;
        class_13892.lIIlIlIlIlIllIIlIIllllIll.lllIlIIlIIIlIlIIIllIlllIl = class_11702.lIlllIlllIIIIlIIlllIllIII();
        class_13892.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII = class_11702.lIllllIIlIIIlIllllllIIIll();
        class_13892.lIIlIlIlIlIllIIlIIllllIll.lllIIIllIIIIlllIlIIllIIll = class_11702.IlIllllllIIlIIllllIIlIIIl();
        class_13892.lIIlIlIlIlIllIIlIIllllIll.IlIllllllIIlIIllllIIlIIIl = class_11702.IlIIIIIllllllIIlllIllllll();
        class_13892.lIIlIlIlIlIllIIlIIllllIll.lllIIIllIIIIlllIlIIllIIll(class_11702.IIIllIIlIIIIIIlIlIIllIIlI());
        class_13892.lIIlIlIlIlIllIIlIIllllIll.lllIlIIlIIIlIlIIIllIlllIl(class_11702.IllIIlllllllIIlIIlIIIIlIl());
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S3APacketTabComplete class_17192) {
        String[] arrstring = class_17192.IlIllllllIIlIIllllIIlIIIl();
        if (this.lIllllIIlIIIlIllllllIIIll.lllllIlllIIllIlIIlIIIllII instanceof class_1056) {
            class_1056 class_10562 = (class_1056)this.lIllllIIlIIIlIllllllIIIll.lllllIlllIIllIlIIlIIIllII;
            class_10562.lllIIIllIIIIlllIlIIllIIll(arrstring);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S29PacketSoundEffect class_06332) {
        this.lIllllIIlIIIlIllllllIIIll.theWorld.lllIIIllIIIIlllIlIIllIIll(class_06332.lIlllIlllIIIIlIIlllIllIII(), class_06332.IlIIIIIllllllIIlllIllllll(), class_06332.lIllllIIlIIIlIllllllIIIll(), class_06332.IlIllllllIIlIIllllIIlIIIl(), class_06332.IIIllIIlIIIIIIlIlIIllIIlI(), class_06332.IllIIlllllllIIlIIlIIIIlIl(), false);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S3FPacketCustomPayload var1_1) {
        if ("MC|TrList".equals(var1_1.IlIllllllIIlIIllllIIlIIIl())) {
            var2_2 = Unpooled.wrappedBuffer((byte[])var1_1.lIlllIlllIIIIlIIlllIllIII());
            try {
                var3_5 = var2_2.readInt();
                var4_7 = this.lIllllIIlIIIlIllllllIIIll.lllllIlllIIllIlIIlIIIllII;
                if (var4_7 == null || !(var4_7 instanceof class_1669) || var3_5 != this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.lIIIlIllllIlllIIIIIllIIIl.lIlllIlllIIIIlIIlllIllIII) ** GOTO lbl28
                var5_8 = ((class_1669)var4_7).lIllllIIlIIIlIllllllIIIll();
                var6_9 = class_1596.lllIlIIlIIIlIlIIIllIlllIl(new PacketBuffer(var2_2));
                var5_8.lllIIIllIIIIlllIlIIllIIll(var6_9);
            }
            catch (IOException var3_6) {
                class_1764.lIlllIlllIIIIlIIlllIllIII.error("Couldn't load trade info", (Throwable)var3_6);
            }
            finally {
                var2_2.release();
            }
        } else if ("MC|Brand".equals(var1_1.IlIllllllIIlIIllllIIlIIIl())) {
            this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.IlIllllllIIlIIllllIIlIIIl(new String(var1_1.lIlllIlllIIIIlIIlllIllIII(), Charsets.UTF_8));
        } else if ("MC|RPack".equals(var1_1.IlIllllllIIlIIllllIIlIIIl())) {
            var2_3 = new String(var1_1.lIlllIlllIIIIlIIlllIllIII(), Charsets.UTF_8);
            if (this.lIllllIIlIIIlIllllllIIIll.llIIIlllIlllIlIllIIIIllIl() != null && this.lIllllIIlIIIlIllllllIIIll.llIIIlllIlllIlIllIIIIllIl().lllIlIIlIIIlIlIIIllIlllIl() == class_1612.lllIIIllIIIIlllIlIIllIIll) {
                this.lIllllIIlIIIlIllllllIIIll.IllllIIIIlIIlIIIIlllIIIIl().lllIIIllIIIIlllIlIIllIIll(var2_3);
            } else if (this.lIllllIIlIIIlIllllllIIIll.llIIIlllIlllIlIllIIIIllIl() == null || this.lIllllIIlIIIlIllllllIIIll.llIIIlllIlllIlIllIIIIllIl().lllIlIIlIIIlIlIIIllIlllIl() == class_1612.IlIllllllIIlIIllllIIlIIIl) {
                this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(new class_0923(new class_2061(this, var2_3), class_0616.lllIIIllIIIIlllIlIIllIIll("multiplayer.texturePrompt.line1", new Object[0]), class_0616.lllIIIllIIIIlllIlIIllIIll("multiplayer.texturePrompt.line2", new Object[0]), 0));
            }
        }
lbl28:
        // 10 sources

        try {
            LunarClient.getInstance().getEventBus().callEvent(new PluginMessageEvent(var1_1.IlIllllllIIlIIllllIIlIIIl(), var1_1.lIlllIlllIIIIlIIlllIllIII()));
            return;
        }
        catch (Exception var2_4) {
            // empty catch block
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S3BPacketScoreboardObjective class_10152) {
        class_0141 class_01412 = this.IIIllIIlIIIIIIlIlIIllIIlI.IlIlIIlllIllllllllIIIlIlI();
        if (class_10152.IlIIIIIllllllIIlllIllllll() == 0) {
            class_0693 class_06932 = class_01412.lllIIIllIIIIlllIlIIllIIll(class_10152.IlIllllllIIlIIllllIIlIIIl(), IScoreObjectiveCriteria.lllIlIIlIIIlIlIIIllIlllIl);
            class_06932.lllIIIllIIIIlllIlIIllIIll(class_10152.lIlllIlllIIIIlIIlllIllIII());
        } else {
            class_0693 class_06933 = class_01412.lllIIIllIIIIlllIlIIllIIll(class_10152.IlIllllllIIlIIllllIIlIIIl());
            if (class_10152.IlIIIIIllllllIIlllIllllll() == 1) {
                class_01412.lllIlIIlIIIlIlIIIllIlllIl(class_06933);
            } else if (class_10152.IlIIIIIllllllIIlllIllllll() == 2) {
                class_06933.lllIIIllIIIIlllIlIIllIIll(class_10152.lIlllIlllIIIIlIIlllIllIII());
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S3CPacketUpdateScore class_15882) {
        class_0141 class_01412 = this.IIIllIIlIIIIIIlIlIIllIIlI.IlIlIIlllIllllllllIIIlIlI();
        class_0693 class_06932 = class_01412.lllIIIllIIIIlllIlIIllIIll(class_15882.lIlllIlllIIIIlIIlllIllIII());
        if (class_15882.lIllllIIlIIIlIllllllIIIll() == 0) {
            class_0678 class_06782 = class_01412.lllIIIllIIIIlllIlIIllIIll(class_15882.IlIllllllIIlIIllllIIlIIIl(), class_06932);
            class_06782.IlIllllllIIlIIllllIIlIIIl(class_15882.IlIIIIIllllllIIlllIllllll());
        } else if (class_15882.lIllllIIlIIIlIllllllIIIll() == 1) {
            class_01412.lllIlIIlIIIlIlIIIllIlllIl(class_15882.IlIllllllIIlIIllllIIlIIIl());
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S3DPacketDisplayScoreboard class_21392) {
        class_0141 class_01412 = this.IIIllIIlIIIIIIlIlIIllIIlI.IlIlIIlllIllllllllIIIlIlI();
        if (class_21392.lIlllIlllIIIIlIIlllIllIII().length() == 0) {
            class_01412.lllIIIllIIIIlllIlIIllIIll(class_21392.IlIllllllIIlIIllllIIlIIIl(), (class_0693)null);
        } else {
            class_0693 class_06932 = class_01412.lllIIIllIIIIlllIlIIllIIll(class_21392.lIlllIlllIIIIlIIlllIllIII());
            class_01412.lllIIIllIIIIlllIlIIllIIll(class_21392.IlIllllllIIlIIllllIIlIIIl(), class_06932);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S3EPacketTeams class_02322) {
        class_0141 class_01412 = this.IIIllIIlIIIIIIlIlIIllIIlI.IlIlIIlllIllllllllIIIlIlI();
        class_0531 class_05312 = class_02322.IllIIlllllllIIlIIlIIIIlIl() == 0 ? class_01412.IlIIIIIllllllIIlllIllllll(class_02322.IlIllllllIIlIIllllIIlIIIl()) : class_01412.lIlllIlllIIIIlIIlllIllIII(class_02322.IlIllllllIIlIIllllIIlIIIl());
        if (class_02322.IllIIlllllllIIlIIlIIIIlIl() == 0 || class_02322.IllIIlllllllIIlIIlIIIIlIl() == 2) {
            class_05312.lllIIIllIIIIlllIlIIllIIll(class_02322.lIlllIlllIIIIlIIlllIllIII());
            class_05312.lllIlIIlIIIlIlIIIllIlllIl(class_02322.IlIIIIIllllllIIlllIllllll());
            class_05312.IlIllllllIIlIIllllIIlIIIl(class_02322.lIllllIIlIIIlIllllllIIIll());
            class_05312.lllIIIllIIIIlllIlIIllIIll(class_02322.IIIllIllIIlIlIlIlIllllIIl());
        }
        if (class_02322.IllIIlllllllIIlIIlIIIIlIl() == 0 || class_02322.IllIIlllllllIIlIIlIIIIlIl() == 3) {
            for (String string : class_02322.IIIllIIlIIIIIIlIlIIllIIlI()) {
                class_01412.lllIIIllIIIIlllIlIIllIIll(string, class_02322.IlIllllllIIlIIllllIIlIIIl());
            }
        }
        if (class_02322.IllIIlllllllIIlIIlIIIIlIl() == 4) {
            for (String string : class_02322.IIIllIIlIIIIIIlIlIIllIIlI()) {
                class_01412.lllIIIllIIIIlllIlIIllIIll(string, class_05312);
            }
        }
        if (class_02322.IllIIlllllllIIlIIlIIIIlIl() == 1) {
            class_01412.lllIIIllIIIIlllIlIIllIIll(class_05312);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S2APacketParticles class_11782) {
        if (class_11782.lIIIIlIlIIlllllIIllIIlIII() == 0) {
            double d = class_11782.IllIIIllIIIIlIlIlIllIIlll() * class_11782.IIIllIIlIIIIIIlIlIIllIIlI();
            double d2 = class_11782.IllIIIllIIIIlIlIlIllIIlll() * class_11782.IllIIlllllllIIlIIlIIIIlIl();
            double d3 = class_11782.IllIIIllIIIIlIlIlIllIIlll() * class_11782.IIIllIllIIlIlIlIlIllllIIl();
            this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(class_11782.IlIllllllIIlIIllllIIlIIIl(), class_11782.lIlllIlllIIIIlIIlllIllIII(), class_11782.IlIIIIIllllllIIlllIllllll(), class_11782.lIllllIIlIIIlIllllllIIIll(), d, d2, d3);
        } else {
            for (int i = 0; i < class_11782.lIIIIlIlIIlllllIIllIIlIII(); ++i) {
                double d = this.llIIlllIllIllllIIIlIIIIII.nextGaussian() * (double)class_11782.IIIllIIlIIIIIIlIlIIllIIlI();
                double d4 = this.llIIlllIllIllllIIIlIIIIII.nextGaussian() * (double)class_11782.IllIIlllllllIIlIIlIIIIlIl();
                double d5 = this.llIIlllIllIllllIIIlIIIIII.nextGaussian() * (double)class_11782.IIIllIllIIlIlIlIlIllllIIl();
                double d6 = this.llIIlllIllIllllIIIlIIIIII.nextGaussian() * (double)class_11782.IllIIIllIIIIlIlIlIllIIlll();
                double d7 = this.llIIlllIllIllllIIIlIIIIII.nextGaussian() * (double)class_11782.IllIIIllIIIIlIlIlIllIIlll();
                double d8 = this.llIIlllIllIllllIIIlIIIIII.nextGaussian() * (double)class_11782.IllIIIllIIIIlIlIlIllIIlll();
                this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(class_11782.IlIllllllIIlIIllllIIlIIIl(), class_11782.lIlllIlllIIIIlIIlllIllIII() + d, class_11782.IlIIIIIllllllIIlllIllllll() + d4, class_11782.lIllllIIlIIIlIllllllIIIll() + d5, d6, d7, d8);
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(S20PacketEntityProperties class_19222) {
        class_1521 class_15212 = this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(class_19222.IlIllllllIIlIIllllIIlIIIl());
        if (class_15212 != null) {
            if (!(class_15212 instanceof class_1965)) {
                throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + class_15212 + ")");
            }
            class_1901 class_19012 = ((class_1965)class_15212).lIlIllllIlIIIIIllIIIIlIlI();
            for (class_1341 class_13412 : class_19222.lIlllIlllIIIIlIIlllIllIII()) {
                class_1685 class_16852 = class_19012.lllIIIllIIIIlllIlIIllIIll(class_13412.lllIIIllIIIIlllIlIIllIIll());
                if (class_16852 == null) {
                    class_16852 = class_19012.lllIlIIlIIIlIlIIIllIlllIl(new class_1904(class_13412.lllIIIllIIIIlllIlIIllIIll(), 0.0, Double.MIN_NORMAL, Double.MAX_VALUE));
                }
                class_16852.lllIIIllIIIIlllIlIIllIIll(class_13412.lllIlIIlIIIlIlIIIllIlllIl());
                class_16852.lIlllIlllIIIIlIIlllIllIII();
                for (class_1256 class_12562 : class_13412.IlIllllllIIlIIllllIIlIIIl()) {
                    class_16852.lllIIIllIIIIlllIlIIllIIll(class_12562);
                }
            }
        }
    }

    public class_0800 IlIllllllIIlIIllllIIlIIIl() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    static /* synthetic */ Minecraft lllIIIllIIIIlllIlIIllIIll(class_1764 class_17642, Minecraft class_06672) {
        class_17642.lIllllIIlIIIlIllllllIIIll = class_06672;
        return class_17642.lIllllIIlIIIlIllllllIIIll;
    }

    static /* synthetic */ Minecraft lllIIIllIIIIlllIlIIllIIll(class_1764 class_17642) {
        return class_17642.lIllllIIlIIIlIllllllIIIll;
    }
}

