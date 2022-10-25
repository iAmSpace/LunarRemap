package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.jagrosh.discordipc.IPCClient
 *  com.jagrosh.discordipc.IPCListener
 */
import com.jagrosh.discordipc.IPCClient;
import com.jagrosh.discordipc.IPCListener;
import com.moonsworth.lunar.client.LunarClient;

class class_0593
implements IPCListener {
    final /* synthetic */ LunarClient lllIIIllIIIIlllIlIIllIIll;

    class_0593(LunarClient class_17212) {
        this.lllIIIllIIIIlllIlIIllIIll = class_17212;
    }

    public void onReady(IPCClient iPCClient) {
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(null, null, false);
    }
}

