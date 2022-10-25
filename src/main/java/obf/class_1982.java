package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.authlib.exceptions.AuthenticationException
 *  com.mojang.authlib.exceptions.AuthenticationUnavailableException
 *  com.mojang.authlib.exceptions.InvalidCredentialsException
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 *  io.netty.buffer.Unpooled
 *  org.java_websocket.client.WebSocketClient
 *  org.java_websocket.drafts.Draft
 *  org.java_websocket.drafts.Draft_6455
 *  org.java_websocket.handshake.ServerHandshake
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.authlib.exceptions.InvalidCredentialsException;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.moonsworth.lunar.client.LunarClient;
import com.moonsworth.lunar.client.util.cosmetic.Cosmetic;
import io.netty.buffer.Unpooled;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.net.URI;
import java.nio.ByteBuffer;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

import net.minecraft.client.Minecraft;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.handshake.ServerHandshake;

public class class_1982
extends WebSocketClient {
    private final Minecraft lllIIIllIIIIlllIlIIllIIll = Minecraft.getMinecraft();
    private boolean lllIlIIlIIIlIlIIIllIlllIl = false;
    private final Map IlIllllllIIlIIllllIIlIIIl = new HashMap();

    public class_1982(URI uRI, Map map) {
        super(uRI, (Draft)new Draft_6455(), map, 0);
        LunarClient.getInstance().getEventBus().addEvent(class_0780.class, class_07802 -> this.lllIIIllIIIIlllIlIIllIIll());
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0688 class_06882) {
        if (!this.isOpen()) {
            return;
        }
        PacketBuffer class_01812 = new PacketBuffer(Unpooled.buffer());
        class_01812.writeVarIntToBuffer((Integer)class_0688.lllIlIIlIIIlIlIIIllIlllIl.get(class_06882.getClass()));
        try {
            class_06882.lllIIIllIIIIlllIlIIllIIll(class_01812);
            this.send(class_01812.array());
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(PacketBuffer class_01812) {
        int n = class_01812.readVarIntFromBuffer();
        Class class_ = (Class)class_0688.lllIlIIlIIIlIlIIIllIlllIl.inverse().get((Object)n);
        try {
            class_0688 class_06882;
            class_0688 class_06883 = class_06882 = class_ == null ? null : (class_0688)class_.newInstance();
            if (class_06882 == null) {
                return;
            }
            class_06882.lllIlIIlIIIlIlIIIllIlllIl(class_01812);
            class_06882.lllIIIllIIIIlllIlIIllIIll(this);
        }
        catch (Exception exception) {
            System.out.println("Error from: " + class_);
            exception.printStackTrace();
        }
    }

    public void onOpen(ServerHandshake serverHandshake) {
        System.out.println("[LC] Connection established");
        if (Objects.equals(Minecraft.getMinecraft().getSession().getUsername(), Minecraft.getMinecraft().getSession().getPlayerID())) {
            this.close();
        }
    }

    public void onMessage(ByteBuffer byteBuffer) {
        this.lllIIIllIIIIlllIlIIllIIll(new PacketBuffer(Unpooled.wrappedBuffer((byte[])byteBuffer.array())));
    }

    public void onMessage(String string) {
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0375 class_03752) {
        LunarClient.getInstance().lIlIllIIlIIlIIlIIlIIlIIll().add(class_03752.lllIIIllIIIIlllIlIIllIIll());
        System.out.println(class_03752.lllIIIllIIIIlllIlIIllIIll());
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1375 class_13752) {
        String string = class_13752.lllIIIllIIIIlllIlIIllIIll();
        class_0115 class_01152 = LunarClient.getInstance().llIllllIlIllIIIlIllIIlIlI().lllIlIIlIIIlIlIIIllIlllIl(string);
        if (class_01152 != null) {
            LunarClient.getInstance().llIllllIlIllIIIlIllIIlIlI().lllIIIllIIIIlllIlIIllIIll().remove(string);
            class_0713.IlIlllIIIIIIlIIllIIllIlll().lllIIIllIIIIlllIlIIllIIll(class_01152, false);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0222 class_02222) {
        String string = class_02222.lllIIIllIIIIlllIlIIllIIll();
        String string2 = class_02222.lllIlIIlIIIlIlIIIllIlllIl();
        class_0115 class_01152 = (class_0115) LunarClient.getInstance().llIllllIlIllIIIlIllIIlIlI().lllIIIllIIIIlllIlIIllIIll().get(string);
        if (class_01152 != null) {
            LunarClient.getInstance().llIllllIlIllIIIlIllIIlIlI().lllIIIllIIIIlllIlIIllIIll(class_01152.IlIllllllIIlIIllllIIlIIIl(), string2);
            if (LunarClient.getInstance().getStatus() != class_0135.IlIllllllIIlIIllllIIlIIIl) {
                LunarClient.getInstance().lllIIIllIIIIlllIlIIllIIll("message");
                class_0078.lllIIIllIIIIlllIlIIllIIll((Object)((Object) EnumChatFormatting.GREEN) + class_01152.lIlllIlllIIIIlIIlllIllIII() + (Object)((Object) EnumChatFormatting.RESET) + " says:", string2);
            }
            for (class_0759 class_07592 : class_0713.IlIlllIIIIIIlIIllIIllIlll().lIIIIlIlIIlllllIIllIIlIII()) {
                if (!(class_07592 instanceof class_1676) || ((class_1676)class_07592).IIIllIllIIlIlIlIlIllllIIl() != class_01152) continue;
                LunarClient.getInstance().llIllllIlIllIIIlIllIIlIlI().lllIIIllIIIIlllIlIIllIIll(class_01152.IlIllllllIIlIIllllIIlIIIl());
            }
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0688)new class_1577("", string));
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1577 class_15772) {
        String string = class_15772.lllIlIIlIIIlIlIIIllIlllIl();
        String string2 = class_15772.lllIIIllIIIIlllIlIIllIIll();
        class_0115 class_01152 = (class_0115) LunarClient.getInstance().llIllllIlIllIIIlIllIIlIlI().lllIIIllIIIIlllIlIIllIIll().get(string);
        if (class_01152 != null) {
            class_01152.IlIllllllIIlIIllllIIlIIIl(string2);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1077 class_10772) {
        LunarClient.getInstance().llIllllIlIllIIIlIllIIlIlI().lllIlIIlIIIlIlIIIllIlllIl().clear();
        JsonArray jsonArray = class_10772.lllIIIllIIIIlllIlIIllIIll();
        for (JsonElement jsonElement : jsonArray) {
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            String string = jsonObject.get("uuid").getAsString();
            String string2 = jsonObject.get("name").getAsString();
            class_0642 class_06422 = new class_0642(string2, string);
            LunarClient.getInstance().llIllllIlIllIIIlIllIIlIlI().lllIlIIlIIIlIlIIIllIlllIl().put(string, class_06422);
            class_0713.IlIlllIIIIIIlIIllIIllIlll().lllIIIllIIIIlllIlIIllIIll(class_06422, true);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0688 class_06882, boolean bl) {
        if (bl) {
            class_1021 class_10212 = (class_1021)class_06882;
            class_0642 class_06422 = new class_0642(class_10212.lllIlIIlIIIlIlIIIllIlllIl(), class_10212.lllIIIllIIIIlllIlIIllIIll());
            LunarClient.getInstance().llIllllIlIllIIIlIllIIlIlI().lllIlIIlIIIlIlIIIllIlllIl().put(class_10212.lllIIIllIIIIlllIlIIllIIll(), class_06422);
            class_0713.IlIlllIIIIIIlIIllIIllIlll().lllIIIllIIIIlllIlIIllIIll(class_06422, true);
            class_06422.lllIIIllIIIIlllIlIIllIIll(class_10212.IlIllllllIIlIIllllIIlIIIl());
            class_0078.lllIIIllIIIIlllIlIIllIIll("Friend Request", "Request has been sent.");
        } else {
            class_0022 class_00222 = (class_0022)class_06882;
            String string = class_00222.lllIIIllIIIIlllIlIIllIIll();
            String string2 = class_00222.lllIlIIlIIIlIlIIIllIlllIl();
            class_0642 class_06423 = new class_0642(string2, string);
            LunarClient.getInstance().llIllllIlIllIIIlIllIIlIlI().lllIlIIlIIIlIlIIIllIlllIl().put(string, class_06423);
            class_0713.IlIlllIIIIIIlIIllIIllIlll().lllIIIllIIIIlllIlIIllIIll(class_06423, true);
            if (LunarClient.getInstance().getStatus() != class_0135.IlIllllllIIlIIllllIIlIIIl) {
                LunarClient.getInstance().lllIIIllIIIIlllIlIIllIIll("message");
                class_0078.lllIIIllIIIIlllIlIIllIIll("Friend Request", class_06423.lllIIIllIIIIlllIlIIllIIll() + " wants to be your friend.");
            }
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(JsonObject jsonObject) {
        String string = jsonObject.get("result").getAsString();
        if (string.equals("SUCCESS")) {
            class_0078.lllIIIllIIIIlllIlIIllIIll((Object)((Object) EnumChatFormatting.GREEN) + "Connected", "Welcome, " + this.lllIIIllIIIIlllIlIIllIIll.getSession().getUsername() + ".");
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0251 class_02512) {
        String string = class_02512.lllIIIllIIIIlllIlIIllIIll();
        String string2 = class_02512.lllIlIIlIIIlIlIIIllIlllIl();
        boolean bl = class_02512.lIlllIlllIIIIlIIlllIllIII();
        class_0115 class_01152 = (class_0115) LunarClient.getInstance().llIllllIlIllIIIlIllIIlIlI().lllIIIllIIIIlllIlIIllIIll().get(string);
        if (class_01152 == null) {
            class_01152 = class_0115.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(bl).lllIlIIlIIIlIlIIIllIlllIl(string2).lllIIIllIIIIlllIlIIllIIll(string).lllIIIllIIIIlllIlIIllIIll(bl).lllIIIllIIIIlllIlIIllIIll(class_0135.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll();
            LunarClient.getInstance().llIllllIlIllIIIlIllIIlIlI().lllIIIllIIIIlllIlIIllIIll().put(string, class_01152);
            class_0713.IlIlllIIIIIIlIIllIIllIlll().lllIIIllIIIIlllIlIIllIIll(class_01152, true);
        }
        if (class_02512.IlIllllllIIlIIllllIIlIIIl() < 10L) {
            int n = (int)class_02512.IlIllllllIIlIIllllIIlIIIl();
            class_0135 class_01352 = class_0135.lllIIIllIIIIlllIlIIllIIll;
            for (class_0135 class_01353 : class_0135.values()) {
                if (class_01353.ordinal() != n) continue;
                class_01352 = class_01353;
            }
            class_01152.lllIlIIlIIIlIlIIIllIlllIl(class_01352);
        }
        class_01152.lllIIIllIIIIlllIlIIllIIll(bl);
        class_01152.lllIIIllIIIIlllIlIIllIIll(string2);
        class_0713.IlIlllIIIIIIlIIllIIllIlll().IlIlIIlIlIllIIlIlIIllIIIl().IIIllIllIIlIlIlIlIllllIIl();
        if (!bl) {
            class_01152.lllIIIllIIIIlllIlIIllIIll(class_02512.IlIllllllIIlIIllllIIlIIIl());
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0158 class_01582) {
        String string;
        String string2;
        LunarClient.getInstance().llIllllIlIllIIIlIllIIlIlI().lllIIIllIIIIlllIlIIllIIll().clear();
        Map map = class_01582.IlIllllllIIlIIllllIIlIIIl();
        Map map2 = class_01582.lIlllIlllIIIIlIIlllIllIII();
        LunarClient.getInstance().lllIIIllIIIIlllIlIIllIIll(class_01582.lllIIIllIIIIlllIlIIllIIll());
        LunarClient.getInstance().lllIlIIlIIIlIlIIIllIlllIl(class_01582.lllIlIIlIIIlIlIIIllIlllIl());
        for (Map.Entry entry : map.entrySet()) {
            string2 = (String)entry.getKey();
            string = (String)((List)entry.getValue()).get(0);
            int n = (Integer)((List)entry.getValue()).get(1);
            String string3 = (String)((List)entry.getValue()).get(2);
            class_0135 class_01352 = class_0135.lllIIIllIIIIlllIlIIllIIll;
            for (class_0135 class_01353 : class_0135.values()) {
                if (class_01353.ordinal() != n) continue;
                class_01352 = class_01353;
            }
            class_0115 object = class_0115.lllIlIIlIIIlIlIIIllIlllIl().lllIlIIlIIIlIlIIIllIlllIl(string).lllIIIllIIIIlllIlIIllIIll(string2).lIlllIlllIIIIlIIlllIllIII(string3).lllIIIllIIIIlllIlIIllIIll(class_01352).lllIIIllIIIIlllIlIIllIIll(true).IlIllllllIIlIIllllIIlIIIl("Online").lllIIIllIIIIlllIlIIllIIll();
            LunarClient.getInstance().llIllllIlIllIIIlIllIIlIlI().lllIIIllIIIIlllIlIIllIIll().put(string2, object);
            class_0713.IlIlllIIIIIIlIIllIIllIlll().lllIIIllIIIIlllIlIIllIIll(object, true);
        }
        for (Map.Entry entry : map2.entrySet()) {
            string2 = (String)entry.getKey();
            string = (String)((List)entry.getValue()).get(0);
            class_0115 class_01152 = class_0115.lllIlIIlIIIlIlIIIllIlllIl().lllIlIIlIIIlIlIIIllIlllIl(string).lllIIIllIIIIlllIlIIllIIll(string2).lIlllIlllIIIIlIIlllIllIII("").lllIIIllIIIIlllIlIIllIIll(class_0135.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll(false).IlIllllllIIlIIllllIIlIIIl("Online").lllIIIllIIIIlllIlIIllIIll((Long)((List)entry.getValue()).get(1)).lllIIIllIIIIlllIlIIllIIll();
            LunarClient.getInstance().llIllllIlIllIIIlIllIIlIlI().lllIIIllIIIIlllIlIIllIIll().put(string2, class_01152);
            class_0713.IlIlllIIIIIIlIIllIIllIlll().lllIIIllIIIIlllIlIIllIIll(class_01152, true);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0694 class_06942) {
        String string = class_06942.lllIlIIlIIIlIlIIIllIlllIl();
        LunarClient.getInstance().IlIlIIlllIIlIllIIIlllllIl().removeIf(class_04332 -> class_04332.lllIlIIlIIIlIlIIIllIlllIl().equals(string));
        LunarClient.getInstance().lllllIlllIIllIlIIlIIIllII().removeIf(class_04332 -> class_04332.lllIlIIlIIIlIlIIIllIlllIl().equals(string));
        LunarClient.getInstance().lllIlIIlIIIlIlIIIllIlllIl(string);
        for (Cosmetic class_04333 : class_06942.lllIIIllIIIIlllIlIIllIIll()) {
            try {
                class_0814 class_08142;
                if (class_04333.lIlllIlllIIIIlIIlllIllIII().equals("cape")) {
                    LunarClient.getInstance().IlIlIIlllIIlIllIIIlllllIl().add(class_04333);
                } else {
                    LunarClient.getInstance().lllllIlllIIllIlIIlIIIllII().add(class_04333);
                }
                class_0814 class_08143 = class_08142 = this.lllIIIllIIIIlllIlIIllIIll.theWorld == null ? null : this.lllIIIllIIIIlllIlIIllIIll.theWorld.lllIlIIlIIIlIlIIIllIlllIl(string);
                if (!class_04333.IllIIlllllllIIlIIlIIIIlIl() || class_08142 == null || !(class_08142 instanceof class_2174)) continue;
                if (class_04333.lIlllIlllIIIIlIIlllIllIII().equals("cape")) {
                    ((class_2174)class_08142).lllIIIllIIIIlllIlIIllIIll(class_04333.getLocation());
                    class_08142.lllIIIllIIIIlllIlIIllIIll(class_04333);
                    continue;
                }
                class_08142.lllIlIIlIIIlIlIIIllIlllIl(class_04333);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0651 class_06512) {
        class_0814 class_08142;
        class_0764 class_07642 = LunarClient.getInstance().llIIlIlIlllIIllIlIlllIllI().lllIIIllIIIIlllIlIIllIIll(class_06512.lllIlIIlIIIlIlIIIllIlllIl());
        if (class_07642 != null && (class_08142 = Minecraft.getMinecraft().theWorld.lllIIIllIIIIlllIlIIllIIll(class_06512.lllIIIllIIIIlllIlIIllIIll())) instanceof class_2174) {
            LunarClient.getInstance().llIIlIlIlllIIllIlIlllIllI().lllIIIllIIIIlllIlIIllIIll((class_2174)class_08142, class_07642);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_2143 class_21432) {
        LunarClient.getInstance().llIIlIlIlllIIllIlIlllIllI().lllIIIllIIIIlllIlIIllIIll(class_21432.lllIIIllIIIIlllIlIIllIIll());
    }

    public void onClose(int n, String string, boolean bl) {
        System.out.println("Close: " + string + " (" + n + ")");
        if (!this.lllIlIIlIIIlIlIIIllIlllIl) {
            new class_0612().start();
        }
        class_0713.IlIlllIIIIIIlIIllIIllIlll().lllllIlllIIllIlIIlIIIllII().IllIIlllllllIIlIIlIIIIlIl().clear();
        class_0713.IlIlllIIIIIIlIIllIIllIlll().IlIlIIlIlIllIIlIlIIllIIIl().IllIIlllllllIIlIIlIIIIlIl().clear();
        LunarClient.getInstance().llIllllIlIllIIIlIllIIlIlI().lllIIIllIIIIlllIlIIllIIll().clear();
        LunarClient.getInstance().llIllllIlIllIIIlIllIIlIlI().lllIlIIlIIIlIlIIIllIlllIl().clear();
    }

    public void onError(Exception exception) {
        System.out.println("Error: " + exception.getMessage());
        exception.printStackTrace();
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1048 class_10482) {
        String string = class_10482.lllIIIllIIIIlllIlIIllIIll();
        String string2 = class_10482.lllIlIIlIIIlIlIIIllIlllIl();
        LunarClient.getInstance().lIlIllIIlIIlIIlIIlIIlIIll().add((Object)((Object) EnumChatFormatting.DARK_GRAY) + "[" + (Object)((Object) EnumChatFormatting.RESET) + class_10482.lllIIIllIIIIlllIlIIllIIll() + (Object)((Object) EnumChatFormatting.DARK_GRAY) + "] " + (Object)((Object) EnumChatFormatting.RESET) + class_10482.lllIlIIlIIIlIlIIIllIlllIl());
        class_0078.lllIIIllIIIIlllIlIIllIIll(string, string2);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0653 class_06532) {
        SecretKey secretKey = CryptManager.lllIIIllIIIIlllIlIIllIIll();
        PublicKey publicKey = class_06532.lllIIIllIIIIlllIlIIllIIll();
        String string = new BigInteger(CryptManager.lllIIIllIIIIlllIlIIllIIll("", publicKey, secretKey)).toString(16);
        try {
            this.lIlllIlllIIIIlIIlllIllIII().joinServer(this.lllIIIllIIIIlllIlIIllIIll.getSession().func_148256_e(), this.lllIIIllIIIIlllIlIIllIIll.getSession().getToken(), string);
        }
        catch (AuthenticationUnavailableException authenticationUnavailableException) {
            class_0078.lllIIIllIIIIlllIlIIllIIll("Authentication Unavailable", authenticationUnavailableException.getMessage());
            return;
        }
        catch (InvalidCredentialsException invalidCredentialsException) {
            class_0078.lllIIIllIIIIlllIlIIllIIll("Invalid Credentials", invalidCredentialsException.getMessage());
            return;
        }
        catch (AuthenticationException authenticationException) {
            class_0078.lllIIIllIIIIlllIlIIllIIll("Authentication Error", authenticationException.getMessage());
            return;
        }
        catch (NullPointerException nullPointerException) {
            this.close();
        }
        try {
            PacketBuffer class_01812 = new PacketBuffer(Unpooled.buffer());
            class_0205 class_02052 = new class_0205(secretKey, publicKey, class_06532.lllIlIIlIIIlIlIIIllIlllIl());
            class_02052.lllIIIllIIIIlllIlIIllIIll(class_01812);
            this.lllIIIllIIIIlllIlIIllIIll(class_02052);
            File file = new File(class_0576.lllIIIllIIIIlllIlIIllIIll + File.separator + "profiles.txt");
            if (file.exists()) {
                this.lllIIIllIIIIlllIlIIllIIll((class_0688)new class_2074());
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private MinecraftSessionService lIlllIlllIIIIlIIlllIllIII() {
        return new YggdrasilAuthenticationService(this.lllIIIllIIIIlllIlIIllIIll.lllIIIIIIlIlllIIlIlIIIllI(), UUID.randomUUID().toString()).createMinecraftSessionService();
    }

    public void send(String string) {
        if (!this.isOpen()) {
            return;
        }
        super.send(string);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_2174 class_21742) {
        if (class_21742.lIIlIlllIIlIIIIlIlIIIIlll() == null || this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII == null) {
            return;
        }
        String string = class_21742.lIIlllIIlIlIlIIIlIlllIIll().toString();
        if (string.equals(this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII.lIIlllIIlIlIlIIIlIlllIIll().toString())) {
            return;
        }
        if (!this.IlIllllllIIlIIllllIIlIIIl.containsKey(string) || System.currentTimeMillis() - (Long)this.IlIllllllIIlIIllllIIlIIIl.get(string) >= 300000L) {
            this.IlIllllllIIlIIllllIIlIIIl.put(string, System.currentTimeMillis());
            this.lllIIIllIIIIlllIlIIllIIll(new class_1162(string));
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        this.IlIllllllIIlIIllllIIlIIIl.clear();
    }

    public void lllIlIIlIIIlIlIIIllIlllIl() {
        this.lllIIIllIIIIlllIlIIllIIll(new class_2232(LunarClient.getInstance().IlIlIIlIlIllIIlIlIIllIIIl()));
    }

    public void IlIllllllIIlIIllllIIlIIIl() {
        this.lllIIIllIIIIlllIlIIllIIll((class_0688)new class_0251("", "", LunarClient.getInstance().getStatus().ordinal(), true));
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0383 class_03832) {
        if (!class_03832.lllIIIllIIIIlllIlIIllIIll()) {
            LunarClient.getInstance().llIllllIlIllIIIlIllIIlIlI().lllIlIIlIIIlIlIIIllIlllIl().remove(class_03832.lllIlIIlIIIlIlIIIllIlllIl());
            class_0825 class_08252 = null;
            for (class_0825 class_08253 : class_0713.IlIlllIIIIIIlIIllIIllIlll().lllllIlllIIllIlIIlIIIllII().IllIIlllllllIIlIIlIIIIlIl()) {
                if (!class_08253.IllIIlllllllIIlIIlIIIIlIl().lllIlIIlIIIlIlIIIllIlllIl().equals(class_03832.lllIlIIlIIIlIlIIIllIlllIl())) continue;
                class_08252 = class_08253;
            }
            if (class_08252 != null) {
                class_0713.IlIlllIIIIIIlIIllIIllIlll().lllllIlllIIllIlIIlIIIllII().llIIlllIllIllllIIIlIIIIII().add(class_08252);
                class_0713.IlIlllIIIIIIlIIllIIllIlll().lllIIIllIIIIlllIlIIllIIll(class_08252.IllIIlllllllIIlIIlIIIIlIl(), false);
            }
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1082 class_10822) {
    }

    public static byte[] lllIIIllIIIIlllIlIIllIIll(byte[] arrby, byte[] arrby2) {
        PublicKey publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(arrby));
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(1, publicKey);
        return cipher.doFinal(arrby2);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1029 class_10292) {
        Minecraft.getMinecraft().lllIIIIIIlIlllIIlIlIIIllI = true;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_2074 class_20742) {
        try {
            File file = new File(class_0576.lllIIIllIIIIlllIlIIllIIll + File.separator + "profiles.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                bufferedWriter.write("################################");
                bufferedWriter.newLine();
                bufferedWriter.write("# MC_Client: PROFILES");
                bufferedWriter.newLine();
                bufferedWriter.write("################################");
                bufferedWriter.newLine();
                for (Profile class_11652 : LunarClient.getInstance().profiles) {
                    bufferedWriter.write(class_11652.getName() + ":" + class_11652.index);
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
            }
            catch (Exception exception) {}
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.lllIlIIlIIIlIlIIIllIlllIl = bl;
    }
}

