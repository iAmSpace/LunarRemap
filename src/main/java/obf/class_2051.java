package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.authlib.Agent
 *  com.mojang.authlib.exceptions.AuthenticationException
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 *  com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication
 */
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.authlib.Agent;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication;
import net.minecraft.util.ResourceLocation;
import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;

import java.net.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class class_2051 {
    private final String lllIlIIlIIIlIlIIIllIlllIl;
    class_2015 lllIIIllIIIIlllIlIIllIIll;
    private ResourceLocation IlIllllllIIlIIllllIIlIIIl;

    public class_2051(String string) {
        this.lllIlIIlIIIlIlIIIllIlllIl = string;
    }

    public boolean equals(Object object) {
        if (!(object instanceof class_2051)) {
            return false;
        }
        return this.lllIIIllIIIIlllIlIIllIIll == null ? super.equals(object) : this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll().equals(((class_2051)object).IlIIIIIllllllIIlllIllllll().lllIIIllIIIIlllIlIIllIIll());
    }

    public int hashCode() {
        return this.lllIIIllIIIIlllIlIIllIIll == null ? super.hashCode() : this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll().hashCode();
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll == null ? null : this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII();
    }

    void lllIIIllIIIIlllIlIIllIIll(JsonObject jsonObject) {
        String string = jsonObject.get("username").getAsString();
        String string2 = !jsonObject.has("accessToken") ? null : jsonObject.get("accessToken").getAsString();
        String string3 = "";
        String string4 = "";
        JsonObject jsonObject2 = jsonObject.getAsJsonObject("profiles");
        if (jsonObject2 == null) {
            throw new IllegalStateException("no profile");
        }
        for (Map.Entry entry : jsonObject2.entrySet()) {
            string3 = (String)entry.getKey();
            string4 = ((JsonElement)entry.getValue()).getAsJsonObject().get("displayName").getAsString();
        }
        this.lllIIIllIIIIlllIlIIllIIll = new class_2015(string3, string, string2, string4);
        this.IlIllllllIIlIIllllIIlIIIl = LunarClient.getInstance().lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(), this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll());
    }

    public UUID lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIIIllIIIIlllIlIIllIIll == null ? null : UUID.fromString(class_2051.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll()));
    }

    void lllIlIIlIIIlIlIIIllIlllIl(JsonObject jsonObject) {
        JsonObject jsonObject2 = new JsonObject();
        jsonObject.add(this.lllIlIIlIIIlIlIIIllIlllIl, (JsonElement)jsonObject2);
        jsonObject2.addProperty("accessToken", this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl());
        jsonObject2.addProperty("username", this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl());
        JsonObject jsonObject3 = new JsonObject();
        jsonObject2.add("profiles", (JsonElement)jsonObject3);
        JsonObject jsonObject4 = new JsonObject();
        jsonObject3.add(this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll().replace("-", ""), (JsonElement)jsonObject4);
        jsonObject4.addProperty("displayName", this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII());
    }

    boolean IlIllllllIIlIIllllIIlIIIl() {
        class_1220 class_12202;
        if (this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll().equalsIgnoreCase(Minecraft.getMinecraft().getSession().getPlayerID())) {
            return false;
        }
        YggdrasilAuthenticationService yggdrasilAuthenticationService = new YggdrasilAuthenticationService(Proxy.NO_PROXY, LunarClient.getInstance().IlIIlllllIIlIlIlllllIllll().IllIIlllllllIIlIIlIIIIlIl());
        YggdrasilUserAuthentication yggdrasilUserAuthentication = (YggdrasilUserAuthentication)yggdrasilAuthenticationService.createUserAuthentication(Agent.MINECRAFT);
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("uuid", this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll());
        hashMap.put("displayName", this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII());
        hashMap.put("username", this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl());
        hashMap.put("accessToken", this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl());
        yggdrasilUserAuthentication.loadFromStorage(hashMap);
        try {
            System.out.println(new Gson().toJson(hashMap));
            yggdrasilUserAuthentication.logIn();
            class_12202 = new class_1220(yggdrasilUserAuthentication.getSelectedProfile().getName(), yggdrasilUserAuthentication.getSelectedProfile().getId().toString(), yggdrasilUserAuthentication.getAuthenticatedToken(), "mojang");
        }
        catch (AuthenticationException authenticationException) {
            System.out.println(String.format("Authentication with token failed (%s)", authenticationException.getMessage()));
            authenticationException.printStackTrace();
            return false;
        }
        this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(class_12202.getToken());
        System.out.println("Updated accessToken and logged user in");
        Minecraft.getMinecraft().lllIIIllIIIIlllIlIIllIIll(class_12202);
        return true;
    }

    boolean lllIIIllIIIIlllIlIIllIIll(String string, String string2) {
        if (this.lllIIIllIIIIlllIlIIllIIll != null && this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll() != null && this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll().equalsIgnoreCase(Minecraft.getMinecraft().getSession().getPlayerID()) && LunarClient.getInstance().IlIIlllllIIlIlIlllllIllll().IlIllllllIIlIIllllIIlIIIl()) {
            return false;
        }
        YggdrasilAuthenticationService yggdrasilAuthenticationService = new YggdrasilAuthenticationService(Proxy.NO_PROXY, LunarClient.getInstance().IlIIlllllIIlIlIlllllIllll().IllIIlllllllIIlIIlIIIIlIl());
        YggdrasilUserAuthentication yggdrasilUserAuthentication = (YggdrasilUserAuthentication)yggdrasilAuthenticationService.createUserAuthentication(Agent.MINECRAFT);
        yggdrasilUserAuthentication.setUsername(string);
        yggdrasilUserAuthentication.setPassword(string2);
        yggdrasilUserAuthentication.logIn();
        class_1220 class_12202 = new class_1220(yggdrasilUserAuthentication.getSelectedProfile().getName(), yggdrasilUserAuthentication.getSelectedProfile().getId().toString(), yggdrasilUserAuthentication.getAuthenticatedToken(), "mojang");
        if (this.lllIIIllIIIIlllIlIIllIIll == null) {
            this.lllIIIllIIIIlllIlIIllIIll = new class_2015(class_12202.getPlayerID(), string, class_12202.getToken(), class_12202.getUsername());
        }
        this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(string);
        this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(class_12202.getUsername());
        this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(class_12202.getToken());
        System.out.println("New session: " + this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl() + " for " + this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl());
        this.IlIllllllIIlIIllllIIlIIIl = LunarClient.getInstance().lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(), this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll());
        Minecraft.getMinecraft().lllIIIllIIIIlllIlIIllIIll(class_12202);
        return true;
    }

    public static String lllIIIllIIIIlllIlIIllIIll(String string) {
        if (string.contains("-")) {
            return string;
        }
        return string.replaceAll("-", "").replaceFirst("(\\p{XDigit}{8})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}+)", "$1-$2-$3-$4-$5");
    }

    public String lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public class_2015 IlIIIIIllllllIIlllIllllll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public ResourceLocation lIllllIIlIIIlIllllllIIIll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public String toString() {
        return "Account(profileId=" + this.lIlllIlllIIIIlIIlllIllIII() + ", info=" + this.IlIIIIIllllllIIlllIllllll() + ", head=" + this.lIllllIIlIIIlIllllllIIIll() + ")";
    }
}

