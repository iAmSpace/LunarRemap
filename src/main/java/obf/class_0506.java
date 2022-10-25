package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Arrays;

class class_0506
implements Runnable {
    final /* synthetic */ class_0602 lllIIIllIIIIlllIlIIllIIll;

    class_0506(class_0602 class_06022) {
        this.lllIIIllIIIIlllIlIIllIIll = class_06022;
    }

    @Override
    public void run() {
        Arrays.fill(class_0602.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll), class_0602.IIIllIllIIlIlIlIlIllllIIl());
        Arrays.fill(class_0602.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll), class_0602.IIIllIllIIlIlIlIlIllllIIl());
        class_0602.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll);
        class_0602.lIlllIlllIIIIlIIlllIllIII(this.lllIIIllIIIIlllIlIIllIIll).clear();
        class_0602.IlIIIIIllllllIIlllIllllll(this.lllIIIllIIIIlllIlIIllIIll).clear();
        class_0602.lIllllIIlIIIlIllllllIIIll(this.lllIIIllIIIIlllIlIIllIIll).clear();
        if (class_0602.IIIllIIlIIIIIIlIlIIllIIlI(this.lllIIIllIIIIlllIlIIllIIll) || class_0602.IllIIlllllllIIlIIlIIIIlIl(this.lllIIIllIIIIlllIlIIllIIll)) {
            try {
                class_0602.IIIllIllIIlIlIlIlIllllIIl(this.lllIIIllIIIIlllIlIIllIIll);
            }
            catch (Exception exception) {
                System.err.println("error loading CTM " + exception.getLocalizedMessage());
                exception.printStackTrace();
            }
        }
        try {
            class_0602.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, class_0602.IllIIIllIIIIlIlIlIllIIlll((class_0602)this.lllIIIllIIIIlllIlIIllIIll).llIIllIllIlIIlIIllIllllll);
        }
        catch (Exception exception) {
            System.err.println("error setting default biome shading " + exception.getLocalizedMessage());
        }
        if (class_0602.IIIllIIlIIIIIIlIlIIllIIlI(this.lllIIIllIIIIlllIlIIllIIll) || class_0602.IllIIlllllllIIlIIlIIIIlIl(this.lllIIIllIIIIlllIlIIllIIll)) {
            class_0602.lIIIIlIlIIlllllIIllIIlIII(this.lllIIIllIIIIlllIlIIllIIll).clear();
            try {
                class_0602.llIIlllIllIllllIIIlIIIIII(this.lllIIIllIIIIlllIlIIllIIll);
                if (class_0602.IllIIlllllllIIlIIlIIIIlIl(this.lllIIIllIIIIlllIlIIllIIll)) {
                    class_0602.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, new ResourceLocation("mcpatcher/colormap/water.png"), "" + class_1498.IlIllllllIIlIIllllIIlIIIl + " " + class_1498.lllIlIIlIIIlIlIIIllIlllIl);
                    class_0602.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, new ResourceLocation("mcpatcher/colormap/watercolor.png"), "" + class_1498.IlIllllllIIlIIllllIIlIIIl + " " + class_1498.lllIlIIlIIIlIlIIIllIlllIl);
                    class_0602.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, new ResourceLocation("mcpatcher/colormap/watercolorX.png"), "" + class_1498.IlIllllllIIlIIllllIIlIIIl + " " + class_1498.lllIlIIlIIIlIlIIIllIlllIl);
                    class_0602.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, new ResourceLocation("mcpatcher/colormap/swampgrass.png"), "" + class_1498.IIIllIIlIIIIIIlIlIIllIIlI + " " + class_1498.IIIllIllIIlIlIlIlIllllIIl + ":1,2 " + class_1498.lllIIlIIIllllllIIIIlIlIlI + ":2,3");
                    class_0602.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, new ResourceLocation("mcpatcher/colormap/swampgrasscolor.png"), "" + class_1498.IIIllIIlIIIIIIlIlIIllIIlI + " " + class_1498.IIIllIllIIlIlIlIlIllllIIl + ":1,2 " + class_1498.lllIIlIIIllllllIIIIlIlIlI + ":2,3");
                    class_0602.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, new ResourceLocation("mcpatcher/colormap/swampfoliage.png"), "" + class_1498.IllIIlllllllIIlIIlIIIIlIl + ":0,4,8,12 " + class_1498.lIIIIlIlIIlllllIIllIIlIII);
                    class_0602.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, new ResourceLocation("mcpatcher/colormap/swampfoliagecolor.png"), "" + class_1498.IllIIlllllllIIlIIlIIIIlIl + ":0,4,8,12 " + class_1498.lIIIIlIlIIlllllIIllIIlIII);
                    class_0602.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, new ResourceLocation("mcpatcher/colormap/pine.png"), "" + class_1498.IllIIlllllllIIlIIlIIIIlIl + ":1,5,9,13");
                    class_0602.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, new ResourceLocation("mcpatcher/colormap/pinecolor.png"), "" + class_1498.IllIIlllllllIIlIIlIIIIlIl + ":1,5,9,13");
                    class_0602.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, new ResourceLocation("mcpatcher/colormap/birch.png"), "" + class_1498.IllIIlllllllIIlIIlIIIIlIl + ":2,6,10,14");
                    class_0602.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, new ResourceLocation("mcpatcher/colormap/birchcolor.png"), "" + class_1498.IllIIlllllllIIlIIlIIIIlIl + ":2,6,10,14");
                }
            }
            catch (Exception exception) {
                System.err.println("error loading custom color properties " + exception.getLocalizedMessage());
                exception.printStackTrace();
            }
        }
        class_0602.llIIllIllIlIIlIIllIllllll(this.lllIIIllIIIIlllIlIIllIIll).lIlllIlllIIIIlIIlllIllIII().lllIIIllIIIIlllIlIIllIIll(true);
    }
}

