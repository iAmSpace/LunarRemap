package obf;

/*
 * Decompiled with CFR 0.150.
 */
class class_0833
implements Runnable {
    final /* synthetic */ class_0885 lllIIIllIIIIlllIlIIllIIll;

    class_0833(class_0885 class_08852) {
        this.lllIIIllIIIIlllIlIIllIIll = class_08852;
    }

    @Override
    public void run() {
        class_0885 class_08852 = this.lllIIIllIIIIlllIlIIllIIll;
        class_08852.getClass();
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll = new class_2118(class_08852, null);
        class_0885.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, true);
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll.setMasterVolume(class_0885.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll(class_0617.lllIIIllIIIIlllIlIIllIIll));
        class_0885.IllIIlllllllIIlIIlIIIIlIl().info(class_0885.IIIllIIlIIIIIIlIlIIllIIlI(), "Sound engine started");
    }
}

