package obf;/*
 * Decompiled with CFR 0.150.
 */
import com.moonsworth.lunar.client.LunarClient;

import java.time.Duration;
import java.time.LocalDateTime;

public class class_0973
extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                while (true) {
                    long l;
                    class_1878 class_18782;
                    if ((class_18782 = LunarClient.getInstance().lIlllIlllIlIIIIlllIlIlIIl().IlIIIIIllllllIIlllIllllll()) != null && class_18782.IIIllIllIIlIlIlIlIllllIIl() != null && (l = Duration.between(class_18782.IIIllIllIIlIlIlIlIllllIIl(), LocalDateTime.now()).toMillis() / 1000L) >= (long)(class_18782.lllIIlIIIllllllIIIIlIlIlI() + 2)) {
                        class_18782.lllIlIIlIIIlIlIIIllIlllIl();
                        Thread.sleep(4000L);
                    }
                    Thread.sleep(1000L);
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
                continue;
            }
            break;
        }
    }
}

