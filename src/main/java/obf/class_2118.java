package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  paulscode.sound.SoundSystem
 *  paulscode.sound.SoundSystemConfig
 *  paulscode.sound.Source
 */
import paulscode.sound.SoundSystem;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.Source;

class class_2118
extends SoundSystem {
    final /* synthetic */ class_0885 lllIIIllIIIIlllIlIIllIIll;

    private class_2118(class_0885 class_08852) {
        this.lllIIIllIIIIlllIlIIllIIll = class_08852;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean playing(String string) {
        Object object = SoundSystemConfig.THREAD_SYNC;
        Object object2 = SoundSystemConfig.THREAD_SYNC;
        synchronized (object2) {
            if (this.soundLibrary == null) {
                return false;
            }
            try {
                Source source = (Source)this.soundLibrary.getSources().get(string);
                return source == null ? false : source.playing() || source.paused() || source.preLoad;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return false;
            }
        }
    }

    class_2118(class_0885 class_08852, Object object) {
        this(class_08852);
    }
}

