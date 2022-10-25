package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.util.UUIDTypeAdapter
 *  org.apache.commons.codec.binary.Hex
 */
import com.mojang.authlib.GameProfile;
import com.mojang.util.UUIDTypeAdapter;
import java.nio.ByteBuffer;
import java.util.UUID;
import org.apache.commons.codec.binary.Hex;

public class class_1220 {
    private final String username;
    private final String playerID;
    private final String token;
    private final class_1968 field_152429_d;

    public class_1220(String string, String string2, String string3, String string4) {
        this.username = string;
        if (!string2.contains("-")) {
            try {
                byte[] arrby = Hex.decodeHex((char[])string2.toCharArray());
                string2 = new UUID(ByteBuffer.wrap(arrby, 0, 8).getLong(), ByteBuffer.wrap(arrby, 8, 8).getLong()).toString();
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        this.playerID = string2;
        this.token = string3;
        this.field_152429_d = class_1968.func_152421_a(string4);
    }

    public String getSessionID() {
        return "token:" + this.token + ":" + this.playerID;
    }

    public String getPlayerID() {
        return this.playerID;
    }

    public String getUsername() {
        return this.username;
    }

    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return this.username.contains("-");
    }

    public String getToken() {
        return this.token;
    }

    public GameProfile func_148256_e() {
        try {
            UUID uUID = UUIDTypeAdapter.fromString((String)this.getPlayerID());
            return new GameProfile(uUID, this.getUsername());
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return new GameProfile((UUID)null, this.getUsername());
        }
    }

    public class_1968 func_152428_f() {
        return this.field_152429_d;
    }
}

