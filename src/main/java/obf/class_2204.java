package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.collect.ImmutableList
 *  com.google.gson.Gson
 *  com.moonsworth.client.nethandler.ILCNetHandler
 *  com.moonsworth.client.nethandler.LCPacket
 *  com.moonsworth.client.nethandler.client.ILCNetHandlerClient
 *  com.moonsworth.client.nethandler.client.LCPacketEmoteBroadcast
 *  com.moonsworth.client.nethandler.client.LCPacketVoiceMute
 *  com.moonsworth.client.nethandler.server.LCPacketCooldown
 *  com.moonsworth.client.nethandler.server.LCPacketGhost
 *  com.moonsworth.client.nethandler.server.LCPacketHologram
 *  com.moonsworth.client.nethandler.server.LCPacketHologramRemove
 *  com.moonsworth.client.nethandler.server.LCPacketHologramUpdate
 *  com.moonsworth.client.nethandler.server.LCPacketNametagsOverride
 *  com.moonsworth.client.nethandler.server.LCPacketNametagsUpdate
 *  com.moonsworth.client.nethandler.server.LCPacketNotification
 *  com.moonsworth.client.nethandler.server.LCPacketServerRule
 *  com.moonsworth.client.nethandler.server.LCPacketServerUpdate
 *  com.moonsworth.client.nethandler.server.LCPacketStaffModState
 *  com.moonsworth.client.nethandler.server.LCPacketTeammates
 *  com.moonsworth.client.nethandler.server.LCPacketTitle
 *  com.moonsworth.client.nethandler.server.LCPacketUpdateWorld
 *  com.moonsworth.client.nethandler.server.LCPacketVoice
 *  com.moonsworth.client.nethandler.server.LCPacketVoiceChannel
 *  com.moonsworth.client.nethandler.server.LCPacketVoiceChannelRemove
 *  com.moonsworth.client.nethandler.server.LCPacketVoiceChannelUpdate
 *  com.moonsworth.client.nethandler.server.LCPacketWorldBorder
 *  com.moonsworth.client.nethandler.server.LCPacketWorldBorderRemove
 *  com.moonsworth.client.nethandler.server.LCPacketWorldBorderUpdate
 *  com.moonsworth.client.nethandler.shared.LCPacketWaypointAdd
 *  com.moonsworth.client.nethandler.shared.LCPacketWaypointRemove
 *  io.netty.buffer.Unpooled
 *  org.lwjgl.input.Keyboard
 */
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.google.gson.Gson;
import com.moonsworth.client.nethandler.ILCNetHandler;
import com.moonsworth.client.nethandler.LCPacket;
import com.moonsworth.client.nethandler.client.ILCNetHandlerClient;
import com.moonsworth.client.nethandler.client.LCPacketEmoteBroadcast;
import com.moonsworth.client.nethandler.client.LCPacketVoiceMute;
import com.moonsworth.client.nethandler.server.LCPacketCooldown;
import com.moonsworth.client.nethandler.server.LCPacketGhost;
import com.moonsworth.client.nethandler.server.LCPacketHologram;
import com.moonsworth.client.nethandler.server.LCPacketHologramRemove;
import com.moonsworth.client.nethandler.server.LCPacketHologramUpdate;
import com.moonsworth.client.nethandler.server.LCPacketNametagsOverride;
import com.moonsworth.client.nethandler.server.LCPacketNametagsUpdate;
import com.moonsworth.client.nethandler.server.LCPacketNotification;
import com.moonsworth.client.nethandler.server.LCPacketServerRule;
import com.moonsworth.client.nethandler.server.LCPacketServerUpdate;
import com.moonsworth.client.nethandler.server.LCPacketStaffModState;
import com.moonsworth.client.nethandler.server.LCPacketTeammates;
import com.moonsworth.client.nethandler.server.LCPacketTitle;
import com.moonsworth.client.nethandler.server.LCPacketUpdateWorld;
import com.moonsworth.client.nethandler.server.LCPacketVoice;
import com.moonsworth.client.nethandler.server.LCPacketVoiceChannel;
import com.moonsworth.client.nethandler.server.LCPacketVoiceChannelRemove;
import com.moonsworth.client.nethandler.server.LCPacketVoiceChannelUpdate;
import com.moonsworth.client.nethandler.server.LCPacketWorldBorder;
import com.moonsworth.client.nethandler.server.LCPacketWorldBorderRemove;
import com.moonsworth.client.nethandler.server.LCPacketWorldBorderUpdate;
import com.moonsworth.client.nethandler.shared.LCPacketWaypointAdd;
import com.moonsworth.client.nethandler.shared.LCPacketWaypointRemove;
import com.moonsworth.lunar.client.LunarClient;
import io.netty.buffer.Unpooled;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;
import java.util.UUID;

import net.minecraft.client.Minecraft;
import net.minecraft.util.IChatComponent;
import org.lwjgl.input.Keyboard;

public class class_2204
implements ILCNetHandlerClient {
    final LunarClient lllIIIllIIIIlllIlIIllIIll = LunarClient.getInstance();
    private boolean lllIlIIlIIIlIlIIIllIlllIl = false;
    private boolean IlIllllllIIlIIllllIIlIIIl = false;
    private boolean lIlllIlllIIIIlIIlllIllIII;
    private boolean IlIIIIIllllllIIlllIllllll = false;
    private List lIllllIIlIIIlIllllllIIIll;
    private class_1950 IIIllIIlIIIIIIlIlIIllIIlI;
    private boolean IllIIlllllllIIlIIlIIIIlIl;
    private List IIIllIllIIlIlIlIlIllllIIl = new ArrayList();
    private List IllIIIllIIIIlIlIlIllIIlll = new ArrayList();
    private String lIIIIlIlIIlllllIIllIIlIII = "";
    private Map llIIlllIllIllllIIIlIIIIII = new HashMap();

    public void lllIIIllIIIIlllIlIIllIIll(class_0479 class_04792) {
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1594 class_15942) {
        this.IlIllllllIIlIIllllIIlIIIl = false;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0026 class_00262) {
        try {
            if (class_00262.lllIlIIlIIIlIlIIIllIlllIl().equals("REGISTER")) {
                String string = new String(class_00262.lllIIIllIIIIlllIlIIllIIll(), Charsets.UTF_8);
                this.lllIlIIlIIIlIlIIIllIlllIl = string.contains(LunarClient.getInstance().lllIIIllIIIIlllIlIIllIIll());
                this.IlIllllllIIlIIllllIIlIIIl = this.IlIllllllIIlIIllllIIlIIIl || string.contains(LunarClient.getInstance().lllIlIIlIIIlIlIIIllIlllIl());
                class_0181 class_01812 = new class_0181(Unpooled.buffer());
                class_01812.writeBytes(LunarClient.getInstance().lllIIIllIIIIlllIlIIllIIll().getBytes(Charsets.UTF_8));
                if (Minecraft.getMinecraft().llIIlIllIllllIlIIIIlIIlll() != null && this.lllIlIIlIIIlIlIIIllIlllIl) {
                    Minecraft.getMinecraft().llIIlIllIllllIlIIIIlIIlll().lllIIIllIIIIlllIlIIllIIll(new class_0917("REGISTER", class_01812));
                }
                this.lIIIIlIlIIlllllIIllIIlIII();
            } else if (class_00262.lllIlIIlIIIlIlIIIllIlllIl().equals(LunarClient.getInstance().lllIIIllIIIIlllIlIIllIIll())) {
                LCPacket lCPacket = LCPacket.handle((byte[])class_00262.lllIIIllIIIIlllIlIIllIIll());
                lCPacket.process((ILCNetHandler)this);
                if (LunarClient.getInstance().getSettingsManager().IllIIlllllllIIlIIlIIIIlIl) {
                    class_0722 class_07222 = new class_0722((Object)((Object)class_1227.llIIllIllIlIIlIIllIllllll) + "[LC] " + (Object)((Object)class_1227.IIlllIlIlllIllIIIlllIIlIl));
                    class_0722 class_07223 = new class_0722((Object)((Object)class_1227.IllIIlllllllIIlIIlIIIIlIl) + "Received: " + (Object)((Object)class_1227.IlIlIIlIlIllIIlIlIIllIIIl) + lCPacket.getClass().getSimpleName());
                    class_07223.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(new class_0015(class_0248.lllIIIllIIIIlllIlIIllIIll, new class_0722(new Gson().toJson((Object)lCPacket))));
                    class_07222.lllIIIllIIIIlllIlIIllIIll(class_07223);
                    Minecraft.getMinecraft().IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(class_07222);
                }
            }
        }
        catch (AssertionError | Exception object) {
            ((Throwable)object).printStackTrace();
        }
    }

    private void lIIIIlIlIIlllllIIllIIlIII() {
        this.lllIIIllIIIIlllIlIIllIIll.getModuleManager().lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll().IIIllIIlIIIIIIlIlIIllIIlI().lllIIIllIIIIlllIlIIllIIll().removeIf(class_03682 -> class_03682.lIlllIlllIIIIlIIlllIllIII);
        this.IlIIIIIllllllIIlllIllllll = false;
        this.lIlllIlllIIIIlIIlllIllIII = false;
        this.lIllllIIlIIIlIllllllIIIll = null;
        this.IIIllIIlIIIIIIlIlIIllIIlI = null;
        this.IllIIlllllllIIlIIlIIIIlIl = false;
        this.lIIIIlIlIIlllllIIllIIlIII = "";
        this.IllIIIllIIIIlIlIlIllIIlll.clear();
        this.llIIlllIllIllllIIIlIIIIII = new HashMap();
        for (class_1665 class_16652 : LunarClient.getInstance().getModuleManager().lllIlIIlIIIlIlIIIllIlllIl) {
            ((class_2256)class_16652).lIlIllIIlIIlIIlIIlIIlIIll();
        }
        LunarClient.getInstance().IIIIIIIIlIllIIllIIlllIllI().lllIIIllIIIIlllIlIIllIIll();
        this.lllIIIllIIIIlllIlIIllIIll();
        class_1304.lllIIIllIIIIlllIlIIllIIll = class_0561.IlIllllllIIlIIllllIIlIIIl;
        class_1169.lllIlIIlIIIlIlIIIllIlllIl = class_0561.lllIIIllIIIIlllIlIIllIIll;
        this.lllIIIllIIIIlllIlIIllIIll.getModuleManager().IIlllIlIlllIllIIIlllIIlIl.lllIIIllIIIIlllIlIIllIIll().clear();
        class_0676.IIIllIIlIIIIIIlIlIIllIIlI().clear();
        class_1398 class_13982 = this.lllIIIllIIIIlllIlIIllIIll.getModuleManager().lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll();
        if (Minecraft.getMinecraft().lIIIIlIlIIlllllIIllIIlIII == null || (class_1187)class_13982.IIIllIIlIIIIIIlIlIIllIIlI() == null) {
            return;
        }
        class_13982.IIIllIIlIIIIIIlIlIIllIIlI().lllIIIllIIIIlllIlIIllIIll().removeIf(class_03682 -> class_03682.lIllllIIlIIIlIllllllIIIll);
        ((class_1187)class_13982.IIIllIIlIIIIIIlIlIIllIIlI()).lIIIIlIlIIlllllIIllIIlIII().removeIf(class_03682 -> class_03682.lIllllIIlIIIlIllllllIIIll);
        if (((class_1187)class_13982.IIIllIIlIIIIIIlIlIIllIIlI()).llIIlllIllIllllIIIlIIIIII() == null) {
            return;
        }
        ((class_1187)class_13982.IIIllIIlIIIIIIlIlIIllIIlI()).llIIlllIllIllllIIIlIIIIII().lllIIIllIIIIlllIlIIllIIll.removeIf(class_03682 -> class_03682.lIllllIIlIIIlIllllllIIIll);
        class_1835.lIlIlIIIIIIlIIllllIlIIllI.lllIlIIlIIIlIlIIIllIlllIl();
        class_13982.IIIllIIlIIIIIIlIlIIllIIlI().IIIllIIlIIIIIIlIlIIllIIlI();
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        LunarClient.getInstance().IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll().clear();
        class_0904.lllIIIllIIIIlllIlIIllIIll(null);
    }

    public void lllIIIllIIIIlllIlIIllIIll(LCPacket lCPacket) {
        Object object;
        if (lCPacket != null && LunarClient.getInstance().getSettingsManager().IllIIlllllllIIlIIlIIIIlIl) {
            object = new class_0722((Object)((Object)class_1227.llIIllIllIlIIlIIllIllllll) + "[LC] " + (Object)((Object)class_1227.IIlllIlIlllIllIIIlllIIlIl));
            class_0722 class_07222 = new class_0722((Object)((Object)class_1227.IllIIlllllllIIlIIlIIIIlIl) + "Sent: " + (Object)((Object)class_1227.IlIlIIlIlIllIIlIlIIllIIIl) + lCPacket.getClass().getSimpleName());
            class_07222.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(new class_0015(class_0248.lllIIIllIIIIlllIlIIllIIll, new class_0722(new Gson().toJson((Object)lCPacket))));
            ((class_1014)object).lllIIIllIIIIlllIlIIllIIll(class_07222);
            Minecraft.getMinecraft().IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll((IChatComponent)object);
        }
        object = new class_0917(this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(), LCPacket.getPacketData((LCPacket)lCPacket));
        Minecraft.getMinecraft().lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll((class_0703)object);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0780 class_07802) {
        this.lllIlIIlIIIlIlIIIllIlllIl = false;
        this.IlIllllllIIlIIllllIIlIIIl = false;
    }

    public void handleAddWaypoint(LCPacketWaypointAdd lCPacketWaypointAdd) {
        int n = lCPacketWaypointAdd.getX();
        int n2 = lCPacketWaypointAdd.getY();
        int n3 = lCPacketWaypointAdd.getZ();
        class_1398 class_13982 = this.lllIIIllIIIIlllIlIIllIIll.getModuleManager().lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll();
        if (class_13982.IIIllIIlIIIIIIlIlIIllIIlI().lllIIIllIIIIlllIlIIllIIll().stream().anyMatch(class_03682 -> class_03682.lllIIIllIIIIlllIlIIllIIll.equals(lCPacketWaypointAdd.getName()) && class_03682.IlIIIIIllllllIIlllIllllll.equals(lCPacketWaypointAdd.getWorld()))) {
            return;
        }
        Color color = new Color(lCPacketWaypointAdd.getColor());
        float f = (float)color.getRed() / 255.0f;
        float f2 = (float)color.getGreen() / 255.0f;
        float f3 = (float)color.getBlue() / 255.0f;
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(-1);
        treeSet.add(0);
        treeSet.add(1);
        System.out.println("Received waypoint (" + lCPacketWaypointAdd.getName() + ")[x" + n + ",y" + n2 + ",z" + n3 + "][r" + f + ",g" + f2 + ",b" + f3 + "]");
        class_0368 class_03683 = new class_0368(lCPacketWaypointAdd.getName(), n, n3, n2, true, f, f2, f3, "", class_13982.IIIllIIlIIIIIIlIlIIllIIlI().IlIllllllIIlIIllllIIlIIIl(), treeSet, true, true);
        class_03683.llIIllIllIlIIlIIllIllllll = lCPacketWaypointAdd.isForced();
        class_03683.IlIIIIIllllllIIlllIllllll = lCPacketWaypointAdd.getWorld();
        class_03683.lIllllIIlIIIlIllllllIIIll = true;
        class_13982.IIIllIIlIIIIIIlIlIIllIIlI().lllIlIIlIIIlIlIIIllIlllIl(class_03683);
    }

    public void handleRemoveWaypoint(LCPacketWaypointRemove lCPacketWaypointRemove) {
        try {
            String string = lCPacketWaypointRemove.getName();
            class_1398 class_13982 = this.lllIIIllIIIIlllIlIIllIIll.getModuleManager().lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll();
            class_13982.IIIllIIlIIIIIIlIlIIllIIlI().lllIIIllIIIIlllIlIIllIIll().removeIf(class_03682 -> class_03682.IlIIIIIllllllIIlllIllllll.equals(lCPacketWaypointRemove.getWorld()) && class_03682.lIlllIlllIIIIlIIlllIllIII && class_03682.lllIIIllIIIIlllIlIIllIIll.equalsIgnoreCase(string));
            ((class_1187)class_13982.IIIllIIlIIIIIIlIlIIllIIlI()).lIIIIlIlIIlllllIIllIIlIII().removeIf(class_03682 -> class_03682.IlIIIIIllllllIIlllIllllll.equals(lCPacketWaypointRemove.getWorld()) && class_03682.lIlllIlllIIIIlIIlllIllIII && class_03682.lllIIIllIIIIlllIlIIllIIll.equalsIgnoreCase(string));
            ((class_1187)class_13982.IIIllIIlIIIIIIlIlIIllIIlI()).llIIlllIllIllllIIIlIIIIII().lllIIIllIIIIlllIlIIllIIll.removeIf(class_03682 -> class_03682.IlIIIIIllllllIIlllIllllll.equals(lCPacketWaypointRemove.getWorld()) && class_03682.lIlllIlllIIIIlIIlllIllIII && class_03682.lllIIIllIIIIlllIlIIllIIll.equalsIgnoreCase(string));
            class_1835.lIlIlIIIIIIlIIllllIlIIllI.lllIlIIlIIIlIlIIIllIlllIl();
            class_13982.IIIllIIlIIIIIIlIlIIllIIlI().IIIllIIlIIIIIIlIlIIllIIlI();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void handleGhost(LCPacketGhost lCPacketGhost) {
    }

    public void handleEmote(LCPacketEmoteBroadcast lCPacketEmoteBroadcast) {
        class_0814 class_08142 = Minecraft.getMinecraft().theWorld.lllIIIllIIIIlllIlIIllIIll(lCPacketEmoteBroadcast.getUuid());
        class_0764 class_07642 = LunarClient.getInstance().llIIlIlIlllIIllIlIlllIllI().lllIIIllIIIIlllIlIIllIIll(lCPacketEmoteBroadcast.getEmoteId());
        if (class_07642 != null) {
            if (class_08142 instanceof class_2174) {
                LunarClient.getInstance().llIIlIlIlllIIllIlIlllIllI().lllIIIllIIIIlllIlIIllIIll((class_2174)class_08142, class_07642);
            }
        } else if (class_08142 instanceof class_2174) {
            LunarClient.getInstance().llIIlIlIlllIIllIlIlllIllI().lllIIIllIIIIlllIlIIllIIll((class_2174)class_08142);
        }
    }

    public void handleCooldown(LCPacketCooldown lCPacketCooldown) {
        class_0063.lllIIIllIIIIlllIlIIllIIll(lCPacketCooldown.getMessage(), lCPacketCooldown.getDurationMs(), lCPacketCooldown.getIconId());
    }

    public void handleNotification(LCPacketNotification lCPacketNotification) {
        this.lllIIIllIIIIlllIlIIllIIll.getModuleManager().lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(lCPacketNotification.getLevel(), lCPacketNotification.getMessage(), lCPacketNotification.getDurationMs());
    }

    public void handleStaffModState(LCPacketStaffModState lCPacketStaffModState) {
        for (class_1665 class_16652 : this.lllIIIllIIIIlllIlIIllIIll.getModuleManager().lllIlIIlIIIlIlIIIllIlllIl) {
            if (!class_16652.IIIllIIlIIIIIIlIlIIllIIlI().equals(lCPacketStaffModState.getMod().replaceAll("_", "").toLowerCase())) continue;
            class_16652.lIlllIlllIIIIlIIlllIllIII(lCPacketStaffModState.isState());
        }
    }

    public void handleNametagsUpdate(LCPacketNametagsUpdate lCPacketNametagsUpdate) {
        if (lCPacketNametagsUpdate.getPlayersMap() != null) {
            class_0904.lllIIIllIIIIlllIlIIllIIll(new HashMap());
            for (Map.Entry entry : lCPacketNametagsUpdate.getPlayersMap().entrySet()) {
                class_0904.llIIlIllIllllIlIIIIlIIlll().put(((UUID)entry.getKey()).toString(), entry.getValue());
            }
        } else {
            class_0904.lllIIIllIIIIlllIlIIllIIll(null);
        }
    }

    public void handleTeammates(LCPacketTeammates lCPacketTeammates) {
        Map map = lCPacketTeammates.getPlayers();
        UUID uUID = lCPacketTeammates.getLeader();
        long l = lCPacketTeammates.getLastMs();
        if (!((Boolean)this.lllIIIllIIIIlllIlIIllIIll.getSettingsManager().IIlllIlIlllIllIIIlllIIlIl.lIlllIlllIIIIlIIlllIllIII()).booleanValue() || map == null || map.isEmpty() || map.size() == 1 && map.containsKey(Minecraft.getMinecraft().lIIIIlIlIIlllllIIllIIlIII.lIIlllIIlIlIlIIIlIlllIIll())) {
            this.lllIIIllIIIIlllIlIIllIIll.getModuleManager().IIlllIlIlllIllIIIlllIIlIl.lllIIIllIIIIlllIlIIllIIll().clear();
            return;
        }
        int n = 0;
        for (Map.Entry entry : map.entrySet()) {
            class_0726 class_07263 = this.lllIIIllIIIIlllIlIIllIIll.getModuleManager().IIlllIlIlllIllIIIlllIIlIl.lllIIIllIIIIlllIlIIllIIll(((UUID)entry.getKey()).toString());
            if (class_07263 == null) {
                class_07263 = new class_0726(((UUID)entry.getKey()).toString(), uUID != null && uUID.equals(entry.getKey()));
                this.lllIIIllIIIIlllIlIIllIIll.getModuleManager().IIlllIlIlllIllIIIlllIIlIl.lllIIIllIIIIlllIlIIllIIll().add(class_07263);
                Random random = new Random();
                if (n < this.lllIIIllIIIIlllIlIIllIIll.getModuleManager().IIlllIlIlllIllIIIlllIIlIl.lllIlIIlIIIlIlIIIllIlllIl().length) {
                    class_07263.lllIIIllIIIIlllIlIIllIIll(new Color(this.lllIIIllIIIIlllIlIIllIIll.getModuleManager().IIlllIlIlllIllIIIlllIIlIl.lllIlIIlIIIlIlIIIllIlllIl()[n]));
                } else {
                    float f = random.nextFloat();
                    float f2 = random.nextFloat();
                    float f3 = random.nextFloat() / 2.0f;
                    class_07263.lllIIIllIIIIlllIlIIllIIll(new Color(f, f2, f3));
                }
            }
            try {
                double d = (Double)((Map)entry.getValue()).get("x");
                double d2 = (Double)((Map)entry.getValue()).get("y") + 2.0;
                double d3 = (Double)((Map)entry.getValue()).get("z");
                class_07263.lllIIIllIIIIlllIlIIllIIll(d, d2, d3, l);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            ++n;
        }
        this.lllIIIllIIIIlllIlIIllIIll.getModuleManager().IIlllIlIlllIllIIIlllIIlIl.lllIIIllIIIIlllIlIIllIIll().removeIf(class_07262 -> !map.containsKey(UUID.fromString(class_07262.IlIllllllIIlIIllllIIlIIIl())));
    }

    public void handleOverrideNametags(LCPacketNametagsOverride lCPacketNametagsOverride) {
        if (lCPacketNametagsOverride.getTags() == null) {
            this.llIIlllIllIllllIIIlIIIIII.remove(lCPacketNametagsOverride.getPlayer());
        } else {
            Collections.reverse(lCPacketNametagsOverride.getTags());
            this.llIIlllIllIllllIIIlIIIIII.put(lCPacketNametagsOverride.getPlayer(), lCPacketNametagsOverride.getTags());
        }
    }

    public void handleAddHologram(LCPacketHologram lCPacketHologram) {
        class_0676 class_06762 = new class_0676(lCPacketHologram.getUuid(), lCPacketHologram.getX(), lCPacketHologram.getY(), lCPacketHologram.getZ());
        class_0676.IIIllIIlIIIIIIlIlIIllIIlI().add(class_06762);
        class_06762.lllIIIllIIIIlllIlIIllIIll(lCPacketHologram.getLines().toArray(new String[0]));
    }

    public void handleUpdateHologram(LCPacketHologramUpdate lCPacketHologramUpdate) {
        class_0676.IIIllIIlIIIIIIlIlIIllIIlI().stream().filter(class_06762 -> class_06762.lllIlIIlIIIlIlIIIllIlllIl().equals(lCPacketHologramUpdate.getUuid())).forEach(class_06762 -> class_06762.lllIIIllIIIIlllIlIIllIIll(lCPacketHologramUpdate.getLines().toArray(new String[0])));
    }

    public void handleRemoveHologram(LCPacketHologramRemove lCPacketHologramRemove) {
        class_0676.IIIllIIlIIIIIIlIlIIllIIlI().removeIf(class_06762 -> class_06762.lllIlIIlIIIlIlIIIllIlllIl().equals(lCPacketHologramRemove.getUuid()));
    }

    public void handleTitle(LCPacketTitle lCPacketTitle) {
        class_0801 class_08012 = class_0801.lllIlIIlIIIlIlIIIllIlllIl;
        if (lCPacketTitle.getType().toLowerCase().equals("subtitle")) {
            class_08012 = class_0801.lllIIIllIIIIlllIlIIllIIll;
        }
        this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll().add(new class_1696(lCPacketTitle.getMessage(), class_08012, lCPacketTitle.getScale(), lCPacketTitle.getDisplayTimeMs(), lCPacketTitle.getFadeInTimeMs(), lCPacketTitle.getFadeOutTimeMs()));
    }

    public void handleServerRule(LCPacketServerRule lCPacketServerRule) {
        block0 : switch (lCPacketServerRule.getRule()) {
            case MINIMAP_STATUS: {
                switch (lCPacketServerRule.getStringValue()) {
                    case "NEUTRAL": {
                        class_1304.lllIIIllIIIIlllIlIIllIIll = class_0561.lllIIIllIIIIlllIlIIllIIll;
                        break block0;
                    }
                    case "FORCED_OFF": {
                        class_1304.lllIIIllIIIIlllIlIIllIIll = class_0561.IlIllllllIIlIIllllIIlIIIl;
                    }
                }
                break;
            }
            case SERVER_HANDLES_WAYPOINTS: {
                this.lIlllIlllIIIIlIIlllIllIII = lCPacketServerRule.isBooleanValue();
                break;
            }
            case VOICE_ENABLED: {
                break;
            }
            case COMPETITIVE_GAMEMODE: {
                this.IllIIlllllllIIlIIlIIIIlIl = lCPacketServerRule.isBooleanValue();
            }
        }
    }

    public void handleVoice(LCPacketVoice lCPacketVoice) {
        this.lllIIIllIIIIlllIlIIllIIll.getModuleManager().lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(lCPacketVoice.getUuid());
    }

    public void handleVoiceChannels(LCPacketVoiceChannel lCPacketVoiceChannel) {
        this.lllIIIllIIIIlllIlIIllIIll("Voice Channel Received: " + lCPacketVoiceChannel.getName());
        this.lllIIIllIIIIlllIlIIllIIll("Channel has " + lCPacketVoiceChannel.getPlayers().size() + " members");
        if (this.lllIlIIlIIIlIlIIIllIlllIl(lCPacketVoiceChannel.getUuid())) {
            return;
        }
        if (this.lIllllIIlIIIlIllllllIIIll == null) {
            this.lIllllIIlIIIlIllllllIIIll = new ArrayList();
        }
        class_1950 class_19502 = new class_1950(lCPacketVoiceChannel.getUuid(), lCPacketVoiceChannel.getName());
        this.lIllllIIlIIIlIllllllIIIll.add(class_19502);
        ArrayList<class_0754> arrayList = new ArrayList<class_0754>();
        for (Map.Entry entry : lCPacketVoiceChannel.getPlayers().entrySet()) {
            this.lllIIIllIIIIlllIlIIllIIll("Added member [" + (String)entry.getValue() + "]");
            class_0754 class_07542 = class_19502.lllIIIllIIIIlllIlIIllIIll((UUID)entry.getKey(), (String)entry.getValue());
            if (class_07542 == null) continue;
            arrayList.add(class_07542);
        }
        this.lllIIIllIIIIlllIlIIllIIll(arrayList);
        for (Map.Entry entry : lCPacketVoiceChannel.getListening().entrySet()) {
            this.lllIIIllIIIIlllIlIIllIIll("Added listener [" + (String)entry.getValue() + "]");
            class_19502.lllIlIIlIIIlIlIIIllIlllIl((UUID)entry.getKey(), (String)entry.getValue());
        }
    }

    public void handleVoiceChannelUpdate(LCPacketVoiceChannelUpdate lCPacketVoiceChannelUpdate) {
        this.lllIIIllIIIIlllIlIIllIIll("Channel Update: " + lCPacketVoiceChannelUpdate.getName() + " (" + lCPacketVoiceChannelUpdate.getStatus() + ")");
        if (this.lIllllIIlIIIlIllllllIIIll == null) {
            return;
        }
        class_1950 class_19502 = this.IlIllllllIIlIIllllIIlIIIl(lCPacketVoiceChannelUpdate.getChannelUuid());
        if (class_19502 == null) {
            this.lllIIIllIIIIlllIlIIllIIll(lCPacketVoiceChannelUpdate.getChannelUuid().toString());
            return;
        }
        switch (lCPacketVoiceChannelUpdate.getStatus()) {
            case 0: {
                class_0754 class_07542 = class_19502.lllIIIllIIIIlllIlIIllIIll(lCPacketVoiceChannelUpdate.getUuid(), lCPacketVoiceChannelUpdate.getName());
                if (class_07542 == null) break;
                this.lllIIIllIIIIlllIlIIllIIll((List)ImmutableList.of((Object)class_07542));
                break;
            }
            case 1: {
                class_19502.lllIIIllIIIIlllIlIIllIIll(lCPacketVoiceChannelUpdate.getUuid());
                break;
            }
            case 2: {
                if (lCPacketVoiceChannelUpdate.getUuid().toString().equals(Minecraft.getMinecraft().getSession().getPlayerID())) {
                    this.IIIllIIlIIIIIIlIlIIllIIlI = class_19502;
                    for (class_1950 class_19503 : this.lIllllIIlIIIlIllllllIIIll) {
                        class_19503.lllIlIIlIIIlIlIIIllIlllIl(lCPacketVoiceChannelUpdate.getUuid());
                    }
                    class_0722 class_07222 = new class_0722((Object)((Object)class_1227.llIIlllIllIllllIIIlIIIIII) + "Joined " + class_19502.lllIlIIlIIIlIlIIIllIlllIl() + " channel. Press '" + Keyboard.getKeyName((int)this.lllIIIllIIIIlllIlIIllIIll.getSettingsManager().lIlllIlllIIIIlIIlllIllIII.IIIllIllIIlIlIlIlIllllIIl()) + "' to talk!" + (Object)((Object)class_1227.IIlllIlIlllIllIIIlllIIlIl));
                    Minecraft.getMinecraft().IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(class_07222);
                } else if (this.IIIllIIlIIIIIIlIlIIllIIlI == class_19502) {
                    class_0722 class_07223 = new class_0722((Object)((Object)class_1227.llIIlllIllIllllIIIlIIIIII) + lCPacketVoiceChannelUpdate.getName() + (Object)((Object)class_1227.llIIlllIllIllllIIIlIIIIII) + " joined " + class_19502.lllIlIIlIIIlIlIIIllIlllIl() + " channel. Press '" + Keyboard.getKeyName((int)this.lllIIIllIIIIlllIlIIllIIll.getSettingsManager().lllIlIIlIIIlIlIIIllIlllIl.IIIllIllIIlIlIlIlIllllIIl()) + "'!" + (Object)((Object)class_1227.IIlllIlIlllIllIIIlllIIlIl));
                    Minecraft.getMinecraft().IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(class_07223);
                }
                class_19502.lllIlIIlIIIlIlIIIllIlllIl(lCPacketVoiceChannelUpdate.getUuid(), lCPacketVoiceChannelUpdate.getName());
                break;
            }
            case 3: {
                if (this.IIIllIIlIIIIIIlIlIIllIIlI == class_19502 && !lCPacketVoiceChannelUpdate.getUuid().toString().equals(Minecraft.getMinecraft().getSession().getPlayerID())) {
                    class_0722 class_07224 = new class_0722((Object)((Object)class_1227.llIIlllIllIllllIIIlIIIIII) + lCPacketVoiceChannelUpdate.getName() + (Object)((Object)class_1227.llIIlllIllIllllIIIlIIIIII) + " left " + class_19502.lllIlIIlIIIlIlIIIllIlllIl() + " channel. Press '" + Keyboard.getKeyName((int)this.lllIIIllIIIIlllIlIIllIIll.getSettingsManager().lllIlIIlIIIlIlIIIllIlllIl.IIIllIllIIlIlIlIlIllllIIl()) + "'!" + (Object)((Object)class_1227.IIlllIlIlllIllIIIlllIIlIl));
                    Minecraft.getMinecraft().IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(class_07224);
                }
                class_19502.lllIlIIlIIIlIlIIIllIlllIl(lCPacketVoiceChannelUpdate.getUuid());
            }
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(List list) {
        for (class_0754 class_07542 : list) {
            if (class_07542 == null || !this.IIIllIllIIlIlIlIlIllllIIl.contains(class_07542.lllIIIllIIIIlllIlIIllIIll()) || this.IllIIIllIIIIlIlIlIllIIlll.contains(class_07542.lllIIIllIIIIlllIlIIllIIll())) continue;
            this.IllIIIllIIIIlIlIlIllIIlll.add(class_07542.lllIIIllIIIIlllIlIIllIIll());
            this.lllIIIllIIIIlllIlIIllIIll((LCPacket)new LCPacketVoiceMute(class_07542.lllIIIllIIIIlllIlIIllIIll()));
        }
    }

    public void handleVoiceChannelDelete(LCPacketVoiceChannelRemove lCPacketVoiceChannelRemove) {
        this.lllIIIllIIIIlllIlIIllIIll("Deleted channel: " + lCPacketVoiceChannelRemove.getUuid().toString());
        if (this.lIllllIIlIIIlIllllllIIIll != null) {
            this.lIllllIIlIIIlIllllllIIIll.removeIf(class_19502 -> class_19502.lllIIIllIIIIlllIlIIllIIll().equals(lCPacketVoiceChannelRemove.getUuid()));
        }
        if (this.IIIllIIlIIIIIIlIlIIllIIlI != null && this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll().equals(lCPacketVoiceChannelRemove.getUuid())) {
            this.IIIllIIlIIIIIIlIlIIllIIlI = null;
        }
    }

    public void handleUpdateWorld(LCPacketUpdateWorld lCPacketUpdateWorld) {
        this.lllIIIllIIIIlllIlIIllIIll("World Update: " + lCPacketUpdateWorld.getWorld());
        this.lIIIIlIlIIlllllIIllIIlIII = lCPacketUpdateWorld.getWorld();
    }

    public void handleServerUpdate(LCPacketServerUpdate lCPacketServerUpdate) {
        this.lllIIIllIIIIlllIlIIllIIll("Retrieved " + lCPacketServerUpdate.getServer());
        LunarClient.getInstance().lllIIIllIIIIlllIlIIllIIll(Minecraft.getMinecraft().IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl, lCPacketServerUpdate.getServer(), false);
    }

    public void handleWorldBorder(LCPacketWorldBorder lCPacketWorldBorder) {
        LunarClient.getInstance().IIIIIIIIlIllIIllIIlllIllI().lllIIIllIIIIlllIlIIllIIll(lCPacketWorldBorder.getId(), lCPacketWorldBorder.getWorld(), lCPacketWorldBorder.getColor(), lCPacketWorldBorder.getMinX(), lCPacketWorldBorder.getMinZ(), lCPacketWorldBorder.getMaxX(), lCPacketWorldBorder.getMaxZ(), lCPacketWorldBorder.isCanShrinkExpand(), lCPacketWorldBorder.isCancelsExit());
    }

    public void handleWorldBorderUpdate(LCPacketWorldBorderUpdate lCPacketWorldBorderUpdate) {
        LunarClient.getInstance().IIIIIIIIlIllIIllIIlllIllI().lllIIIllIIIIlllIlIIllIIll(lCPacketWorldBorderUpdate.getId(), lCPacketWorldBorderUpdate.getMinX(), lCPacketWorldBorderUpdate.getMinZ(), lCPacketWorldBorderUpdate.getMaxX(), lCPacketWorldBorderUpdate.getMaxZ(), lCPacketWorldBorderUpdate.getDurationTicks());
    }

    public void handleWorldBorderRemove(LCPacketWorldBorderRemove lCPacketWorldBorderRemove) {
        LunarClient.getInstance().IIIIIIIIlIllIIllIIlllIllI().lllIIIllIIIIlllIlIIllIIll(lCPacketWorldBorderRemove.getId());
    }

    private boolean lllIlIIlIIIlIlIIIllIlllIl(UUID uUID) {
        return this.IlIllllllIIlIIllllIIlIIIl(uUID) != null;
    }

    private class_1950 IlIllllllIIlIIllllIIlIIIl(UUID uUID) {
        if (this.lIllllIIlIIIlIllllllIIIll == null) {
            return null;
        }
        for (class_1950 class_19502 : this.lIllllIIlIIIlIllllllIIIll) {
            if (!class_19502.lllIIIllIIIIlllIlIIllIIll().equals(uUID)) continue;
            return class_19502;
        }
        return null;
    }

    public class_0754 lllIIIllIIIIlllIlIIllIIll(UUID uUID) {
        if (this.lIllllIIlIIIlIllllllIIIll == null || this.IIIllIIlIIIIIIlIlIIllIIlI == null) {
            return null;
        }
        for (class_0754 class_07542 : this.IIIllIIlIIIIIIlIlIIllIIlI.IlIllllllIIlIIllllIIlIIIl()) {
            if (!class_07542.lllIIIllIIIIlllIlIIllIIll().equals(uUID)) continue;
            return class_07542;
        }
        return null;
    }

    private void lllIIIllIIIIlllIlIIllIIll(String string) {
        System.out.println("\u001b[31m[Lunar]\u001b[0m " + string);
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public boolean IlIllllllIIlIIllllIIlIIIl() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public List IlIIIIIllllllIIlllIllllll() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public class_1950 lIllllIIlIIIlIllllllIIIll() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public boolean IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }

    public List IllIIlllllllIIlIIlIIIIlIl() {
        return this.IIIllIllIIlIlIlIlIllllIIl;
    }

    public String IIIllIllIIlIlIlIlIllllIIl() {
        return this.lIIIIlIlIIlllllIIllIIlIII;
    }

    public Map IllIIIllIIIIlIlIlIllIIlll() {
        return this.llIIlllIllIllllIIIlIIIIII;
    }
}

