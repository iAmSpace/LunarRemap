package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Map;

public class class_0158
extends class_0688 {
    private boolean lllIIIllIIIIlllIlIIllIIll;
    private boolean IlIllllllIIlIIllllIIlIIIl;
    private Map lIlllIlllIIIIlIIlllIllIII;
    private Map IlIIIIIllllllIIlllIllllll;

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(PacketBuffer class_01812) {
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(PacketBuffer class_01812) {
        int n;
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readBoolean();
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.readBoolean();
        int n2 = class_01812.readInt();
        int n3 = class_01812.readInt();
        this.lIlllIlllIIIIlIIlllIllIII = new HashMap();
        for (n = 0; n < n2; ++n) {
            this.lIlllIlllIIIIlIIlllIllIII.put(class_01812.readStringFromBuffer(52), ImmutableList.of((Object)class_01812.readStringFromBuffer(32), (Object)class_01812.readInt(), (Object)class_01812.readStringFromBuffer(256)));
        }
        this.IlIIIIIllllllIIlllIllllll = new HashMap();
        for (n = 0; n < n3; ++n) {
            this.IlIIIIIllllllIIlllIllllll.put(class_01812.readStringFromBuffer(52), ImmutableList.of((Object)class_01812.readStringFromBuffer(32), (Object)class_01812.readLong()));
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1982 class_19822) {
        class_19822.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public Map IlIllllllIIlIIllllIIlIIIl() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public Map lIlllIlllIIIIlIIlllIllIII() {
        return this.IlIIIIIllllllIIlllIllllll;
    }
}

