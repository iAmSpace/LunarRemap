package obf;

import net.minecraft.client.Minecraft;

/*
 * Decompiled with CFR 0.150.
 */
public final class class_1514
extends Thread {
    public class_1514(String string) {
        super(string);
    }

    @Override
    public void run() {
        Minecraft.stopIntegratedServer();
    }
}

