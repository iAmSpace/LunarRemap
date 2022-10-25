package com.moonsworth.lunar.ipc;

import com.jagrosh.discordipc.IPCClient;
import com.jagrosh.discordipc.IPCListener;
import com.moonsworth.lunar.client.LunarClient;

public class LunarIPCListener implements IPCListener {
    private final LunarClient lc;

    public LunarIPCListener(LunarClient lc) {
        this.lc = lc;
    }

    public void onReady(IPCClient iPCClient) {
        this.lc.updateRichPresence(null, null, false);
    }
}

