package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.minecraft.client.Minecraft;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class class_1354 {
    private static final Gson lllIIIllIIIIlllIlIIllIIll = new GsonBuilder().setPrettyPrinting().create();
    private final File lllIlIIlIIIlIlIIIllIlllIl;
    private JsonObject IlIllllllIIlIIllllIIlIIIl;
    private String lIlllIlllIIIIlIIlllIllIII;
    private JsonObject IlIIIIIllllllIIlllIllllll;
    private final Set lIllllIIlIIIlIllllllIIIll = new HashSet();
    private class_2051 IIIllIIlIIIIIIlIlIIllIIlI;

    public class_1354() {
        this.lllIlIIlIIIlIlIIIllIlllIl = new File(Minecraft.getMinecraft().mcDataDir, "launcher_profiles.json");
    }

    public synchronized Set lllIIIllIIIIlllIlIIllIIll() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public synchronized class_2051 lllIIIllIIIIlllIlIIllIIll(UUID uUID) {
        return this.lIllllIIlIIIlIllllllIIIll.stream().filter(class_20512 -> class_20512.lllIlIIlIIIlIlIIIllIlllIl().equals(uUID)).findFirst().orElse(null);
    }

    public synchronized boolean lllIIIllIIIIlllIlIIllIIll(String string, String string2) {
        boolean bl;
        class_2051 class_20513 = this.lIllllIIlIIIlIllllllIIIll.stream().filter(class_20512 -> class_20512.IlIIIIIllllllIIlllIllllll().lllIlIIlIIIlIlIIIllIlllIl().equalsIgnoreCase(string)).findFirst().orElse(null);
        boolean bl2 = false;
        if (class_20513 != null) {
            bl = class_20513.lllIIIllIIIIlllIlIIllIIll(string, string2);
        } else {
            class_20513 = new class_2051(UUID.randomUUID().toString().replace("-", ""));
            bl = class_20513.lllIIIllIIIIlllIlIIllIIll(string, string2);
            bl2 = true;
        }
        if (bl) {
            this.IIIllIIlIIIIIIlIlIIllIIlI = class_20513;
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("account", class_20513.lIlllIlllIIIIlIIlllIllIII());
            jsonObject.addProperty("profile", class_20513.lllIlIIlIIIlIlIIIllIlllIl().toString().replace("-", ""));
            this.IlIIIIIllllllIIlllIllllll = jsonObject;
            if (bl2) {
                this.lIllllIIlIIIlIllllllIIIll.add(class_20513);
            }
            this.lIllllIIlIIIlIllllllIIIll();
        }
        return bl;
    }

    public synchronized boolean lllIIIllIIIIlllIlIIllIIll(class_2051 class_20512) {
        if (class_20512 == null || class_20512.IlIIIIIllllllIIlllIllllll() == null) {
            System.out.println("Cannot login to account. Account=" + class_20512);
            return false;
        }
        if (class_20512.IlIIIIIllllllIIlllIllllll().IlIllllllIIlIIllllIIlIIIl() == null) {
            System.out.println("Cannot login to account " + class_20512 + ", accessToken is null.");
            return false;
        }
        boolean bl = class_20512.IlIllllllIIlIIllllIIlIIIl();
        if (bl) {
            this.IIIllIIlIIIIIIlIlIIllIIlI = class_20512;
            JsonObject jsonObject = this.IlIIIIIllllllIIlllIllllll == null ? new JsonObject() : this.IlIIIIIllllllIIlllIllllll;
            jsonObject.addProperty("account", class_20512.lIlllIlllIIIIlIIlllIllIII());
            jsonObject.addProperty("profile", class_20512.IlIIIIIllllllIIlllIllllll().lllIIIllIIIIlllIlIIllIIll().replace("-", ""));
            this.IlIIIIIllllllIIlllIllllll = jsonObject;
        }
        this.lIllllIIlIIIlIllllllIIIll();
        return bl;
    }

    public synchronized boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lIllllIIlIIIlIllllllIIIll.stream().anyMatch(class_20512 -> class_20512.IlIIIIIllllllIIlllIllllll() != null && class_20512.IlIIIIIllllllIIlllIllllll().IlIllllllIIlIIllllIIlIIIl() != null);
    }

    public synchronized boolean IlIllllllIIlIIllllIIlIIIl() {
        if (Minecraft.getMinecraft().getSession().getUsername().contains("-")) {
            return false;
        }
        class_2051 class_20512 = this.IIIllIIlIIIIIIlIlIIllIIlI;
        return class_20512 != null && class_20512.IlIIIIIllllllIIlllIllllll().IlIllllllIIlIIllllIIlIIIl() != null;
    }

    public synchronized boolean lIlllIlllIIIIlIIlllIllIII() {
        if (this.IlIIIIIllllllIIlllIllllll == null) {
            return false;
        }
        UUID uUID = UUID.fromString(class_2051.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll.get("profile").getAsString()));
        class_2051 class_20513 = this.lIllllIIlIIIlIllllllIIIll.stream().filter(class_20512 -> class_20512.lllIlIIlIIIlIlIIIllIlllIl().equals(uUID)).findFirst().orElse(null);
        if (class_20513 != null && class_20513.IlIIIIIllllllIIlllIllllll() != null && class_20513.IlIIIIIllllllIIlllIllllll().IlIllllllIIlIIllllIIlIIIl() != null) {
            class_1220 class_12202 = new class_1220(class_20513.IlIIIIIllllllIIlllIllllll().lIlllIlllIIIIlIIlllIllIII(), class_20513.IlIIIIIllllllIIlllIllllll().lllIIIllIIIIlllIlIIllIIll(), class_20513.IlIIIIIllllllIIlllIllllll().IlIllllllIIlIIllllIIlIIIl(), "mojang");
            Minecraft.getMinecraft().lllIIIllIIIIlllIlIIllIIll(class_12202);
            this.IIIllIIlIIIIIIlIlIIllIIlI = class_20513;
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("account", class_20513.lIlllIlllIIIIlIIlllIllIII());
            jsonObject.addProperty("profile", class_20513.lllIlIIlIIIlIlIIIllIlllIl().toString().replace("-", ""));
            this.IlIIIIIllllllIIlllIllllll = jsonObject;
            return true;
        }
        return this.lllIIIllIIIIlllIlIIllIIll(class_20513);
    }

    public synchronized void IlIIIIIllllllIIlllIllllll() throws IOException {
        JsonObject jsonObject;
        if (!this.lllIlIIlIIIlIlIIIllIlllIl.exists() && !this.lllIlIIlIIIlIlIIIllIlllIl.createNewFile()) {
            return;
        }
        JsonParser jsonParser = new JsonParser();
        JsonElement jsonElement = jsonParser.parse((Reader)new FileReader(this.lllIlIIlIIIlIlIIIllIlllIl));
        if (!jsonElement.isJsonObject()) {
            this.IlIllllllIIlIIllllIIlIIIl = new JsonObject();
            return;
        }
        this.IlIllllllIIlIIllllIIlIIIl = jsonElement.getAsJsonObject();
        if (this.IlIllllllIIlIIllllIIlIIIl.has("clientToken")) {
            this.lIlllIlllIIIIlIIlllIllIII = this.IlIllllllIIlIIllllIIlIIIl.get("clientToken").getAsString();
        } else {
            System.out.println("Could not find clientToken. Creating our own.");
            this.lIlllIlllIIIIlIIlllIllIII = UUID.randomUUID().toString().replaceAll("-", "");
        }
        if (this.IlIllllllIIlIIllllIIlIIIl.has("authenticationDatabase")) {
            try {
                jsonObject = this.IlIllllllIIlIIllllIIlIIIl.get("authenticationDatabase").getAsJsonObject();
            }
            catch (Exception exception) {
                throw new RuntimeException("Could not load authenticationDatabase as JsonObject " + this.IlIllllllIIlIIllllIIlIIIl.get("authenticationDatabase").getClass());
            }
            for (Map.Entry entry : jsonObject.entrySet()) {
                JsonObject jsonObject2 = ((JsonElement)entry.getValue()).getAsJsonObject();
                String string = (String)entry.getKey();
                class_2051 class_20512 = new class_2051(string);
                try {
                    class_20512.lllIIIllIIIIlllIlIIllIIll(jsonObject2);
                    this.lIllllIIlIIIlIllllllIIIll.add(class_20512);
                    System.out.println(String.format("Loaded account [%s]", class_20512.IlIIIIIllllllIIlllIllllll().lIlllIlllIIIIlIIlllIllIII()));
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    System.out.println("Could not load account with id " + string + ": " + exception.getMessage());
                }
            }
        }
        if (this.IlIllllllIIlIIllllIIlIIIl.has("selectedUser")) {
            jsonObject = (JsonObject) this.IlIllllllIIlIIllllIIlIIIl.get("selectedUser");
            if (jsonObject != null) {
                this.IlIIIIIllllllIIlllIllllll = jsonObject;
            } else {
                System.out.println("Skipping loading selectedUser (null) as it isn't a JsonObject."); // Didn't really know what to do here? IntelliJ wanted me to do some dumb shit idk
            }
        }
    }

    public synchronized void lIllllIIlIIIlIllllllIIIll() {
        JsonObject object;
        Set object22;
        JsonObject jsonObject = new JsonObject();
        if (this.IlIllllllIIlIIllllIIlIIIl != null) {
            for (Object object22 : this.IlIllllllIIlIIllllIIlIIIl.entrySet()) {
                jsonObject.add((String)object22.getKey(), (JsonElement)object22.getValue());
            }
        }
        if (!jsonObject.has("authenticationDatabase")) {
            jsonObject.add("authenticationDatabase", (JsonElement)new JsonObject());
        }
        if (jsonObject.has("authenticationDatabase")) {
            object = jsonObject.get("authenticationDatabase").getAsJsonObject();
            object22 = object.entrySet().stream().map(Map.Entry::getKey).collect(Collectors.toSet());
            Iterator iterator = object22.iterator();
            while (iterator.hasNext()) {
                Object object3 = (String)iterator.next();
                if (!this.lIllllIIlIIIlIllllllIIIll.stream().noneMatch(arg_0 -> class_1354.lllIIIllIIIIlllIlIIllIIll((String)object3, arg_0))) continue;
                object.remove((String)object3);
            }
            for (Object object3 : this.lIllllIIlIIIlIllllllIIIll) {
                for (Map.Entry entry : object.entrySet()) {
                    if (!((String)entry.getKey()).equals(((class_2051)object3).lIlllIlllIIIIlIIlllIllIII())) continue;
                    object.remove((String)entry.getKey());
                    break;
                }
                ((class_2051)object3).lllIlIIlIIIlIlIIIllIlllIl((JsonObject)object);
                System.out.println(String.format("Saved account [%s]", ((class_2051)object3).IlIIIIIllllllIIlllIllllll().lIlllIlllIIIIlIIlllIllIII()));
            }
        }
        if (!jsonObject.has("clientToken")) {
            jsonObject.addProperty("clientToken", this.lIlllIlllIIIIlIIlllIllIII);
            System.out.println(String.format("Saved created client token %s", this.lIlllIlllIIIIlIIlllIllIII));
        }
        jsonObject.add("selectedUser", this.IlIIIIIllllllIIlllIllllll);
        try {
            if (!this.lllIlIIlIIIlIlIIIllIlllIl.exists() && !this.lllIlIIlIIIlIlIIIllIlllIl.createNewFile()) {
                return;
            }
            object = new FileWriter(this.lllIlIIlIIIlIlIIIllIlllIl);
            object22 = null;
            try {
                lllIIIllIIIIlllIlIIllIIll.toJson((JsonElement)jsonObject, (Appendable)object);
                System.out.println(String.format("Saved file: [%s]", this.lllIlIIlIIIlIlIIIllIlllIl));
                this.IlIllllllIIlIIllllIIlIIIl = jsonObject;
            }
            catch (Throwable throwable) {
                object22 = throwable;
                throw throwable;
            }
            finally {
                if (object != null) {
                    if (object22 != null) {
                        try {
                            ((Writer)object).close();
                        }
                        catch (Throwable throwable) {
                            ((Throwable)object22).addSuppressed(throwable);
                        }
                    } else {
                        ((Writer)object).close();
                    }
                }
            }
        }
        catch (IOException iOException) {
            System.out.println(String.format("Couldn't save to file [%s]", iOException.getMessage()));
        }
    }

    public synchronized String IIIllIIlIIIIIIlIlIIllIIlI() {
        String string;
        if (this.IlIllllllIIlIIllllIIlIIIl == null || this.IlIIIIIllllllIIlllIllllll == null) {
            return null;
        }
        JsonObject jsonObject = this.IlIllllllIIlIIllllIIlIIIl.getAsJsonObject("authenticationDatabase");
        if (jsonObject.has(string = this.IlIIIIIllllllIIlllIllllll.get("account").getAsString())) {
            return jsonObject.get(string).getAsJsonObject().get("username").getAsString();
        }
        return null;
    }

    public String IllIIlllllllIIlIIlIIIIlIl() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public JsonObject IIIllIllIIlIlIlIlIllllIIl() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public class_2051 IllIIIllIIIIlIlIlIllIIlll() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    private static /* synthetic */ boolean lllIIIllIIIIlllIlIIllIIll(String string, class_2051 class_20512) {
        return class_20512.lIlllIlllIIIIlIIlllIllIII().equalsIgnoreCase(string);
    }
}

