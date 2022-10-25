package obf;/*
 * Decompiled with CFR 0.150.
 */
import com.moonsworth.lunar.client.LunarClient;

import java.net.URISyntaxException;

public class class_0612
extends Thread {
    private long lllIIIllIIIIlllIlIIllIIll = 25000L;

    @Override
    public void run() {
        try {
            Thread.sleep(this.lllIIIllIIIIlllIlIIllIIll);
            LunarClient.getInstance().connectToWebsocket();
        }
        catch (InterruptedException | URISyntaxException exception) {
            exception.printStackTrace();
        }
    }
}

