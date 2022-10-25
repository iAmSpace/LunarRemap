package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.network.play.client.C17PacketCustomPayload;
import net.minecraft.util.ResourceLocation;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class class_1752
extends class_0229 {
    private static final Logger lllIIIllIIIIlllIlIIllIIll = LogManager.getLogger();
    private static final ResourceLocation lllIlIIlIIIlIlIIIllIlllIl = new ResourceLocation("textures/gui/book.png");
    private final class_0814 IlIllllllIIlIIllllIIlIIIl;
    private final ItemStack lIlllIlllIIIIlIIlllIllIII;
    private final boolean IlIIIIIllllllIIlllIllllll;
    private boolean lIllllIIlIIIlIllllllIIIll;
    private boolean IIIllIIlIIIIIIlIlIIllIIlI;
    private int IllIIlllllllIIlIIlIIIIlIl;
    private int IIIllIllIIlIlIlIlIllllIIl = 192;
    private int IllIIIllIIIIlIlIlIllIIlll = 192;
    private int lIIIIlIlIIlllllIIllIIlIII = 1;
    private int lIlllIlllIlIIIIlllIlIlIIl;
    private class_2145 IlIIlllllIIlIlIlllllIllll;
    private String llIIlIlIlllIIllIlIlllIllI = "";
    private class_1025 IllIIIIllIIllIllIlllIlIIl;
    private class_1025 IIIIIIIIlIllIIllIIlllIllI;
    private class_1197 IIlIIlIlIlIllIIlIlIIIIlll;
    private class_1197 llIIIlllIlllIlIllIIIIllIl;
    private class_1197 IIIIlIllIlIIlIIlIllIlIlll;
    private class_1197 IlIlIIlllIllllllllIIIlIlI;

    public class_1752(class_0814 class_08142, ItemStack class_08972, boolean bl) {
        this.IlIllllllIIlIIllllIIlIIIl = class_08142;
        this.lIlllIlllIIIIlIIlllIllIII = class_08972;
        this.IlIIIIIllllllIIlllIllllll = bl;
        if (class_08972.IlIlIIlIlIllIIlIlIIllIIIl()) {
            class_0775 class_07752 = class_08972.lllllIlllIIllIlIIlIIIllII();
            this.IlIIlllllIIlIlIlllllIllll = class_07752.IlIllllllIIlIIllllIIlIIIl("pages", 8);
            if (this.IlIIlllllIIlIlIlllllIllll != null) {
                this.IlIIlllllIIlIlIlllllIllll = (class_2145)this.IlIIlllllIIlIlIlllllIllll.lllIlIIlIIIlIlIIIllIlllIl();
                this.lIIIIlIlIIlllllIIllIIlIII = this.IlIIlllllIIlIlIlllllIllll.lIlllIlllIIIIlIIlllIllIII();
                if (this.lIIIIlIlIIlllllIIllIIlIII < 1) {
                    this.lIIIIlIlIIlllllIIllIIlIII = 1;
                }
            }
        }
        if (this.IlIIlllllIIlIlIlllllIllll == null && bl) {
            this.IlIIlllllIIlIlIlllllIllll = new class_2145();
            this.IlIIlllllIIlIlIlllllIllll.lllIIIllIIIIlllIlIIllIIll(new class_0928(""));
            this.lIIIIlIlIIlllllIIllIIlIII = 1;
        }
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        super.IlIllllllIIlIIllllIIlIIIl();
        ++this.IllIIlllllllIIlIIlIIIIlIl;
    }

    @Override
    public void n_() {
        this.lIlIlIIlIIIIlIIIIIlllIIII.clear();
        Keyboard.enableRepeatEvents((boolean)true);
        if (this.IlIIIIIllllllIIlllIllllll) {
            this.llIIIlllIlllIlIllIIIIllIl = new class_1197(3, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, 4 + this.IllIIIllIIIIlIlIlIllIIlll, 98, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("book.signButton", new Object[0]));
            this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.llIIIlllIlllIlIllIIIIllIl);
            this.IIlIIlIlIlIllIIlIlIIIIlll = new class_1197(0, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 2, 4 + this.IllIIIllIIIIlIlIlIllIIlll, 98, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("gui.done", new Object[0]));
            this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.IIlIIlIlIlIllIIlIlIIIIlll);
            this.IIIIlIllIlIIlIIlIllIlIlll = new class_1197(5, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, 4 + this.IllIIIllIIIIlIlIlIllIIlll, 98, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("book.finalizeButton", new Object[0]));
            this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.IIIIlIllIlIIlIIlIllIlIlll);
            this.IlIlIIlllIllllllllIIIlIlI = new class_1197(4, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 2, 4 + this.IllIIIllIIIIlIlIlIllIIlll, 98, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("gui.cancel", new Object[0]));
            this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.IlIlIIlllIllllllllIIIlIlI);
        } else {
            this.IIlIIlIlIlIllIIlIlIIIIlll = new class_1197(0, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, 4 + this.IllIIIllIIIIlIlIlIllIIlll, 200, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("gui.done", new Object[0]));
            this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.IIlIIlIlIlIllIIlIlIIIIlll);
        }
        int n = (this.IlIlIIlllIIlIllIIIlllllIl - this.IIIllIllIIlIlIlIlIllllIIl) / 2;
        int n2 = 2;
        this.IllIIIIllIIllIllIlllIlIIl = new class_1025(1, n + 120, n2 + 154, true);
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.IllIIIIllIIllIllIlllIlIIl);
        this.IIIIIIIIlIllIIllIIlllIllI = new class_1025(2, n + 38, n2 + 154, false);
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.IIIIIIIIlIllIIllIIlllIllI);
        this.IIIllIIlIIIIIIlIlIIllIIlI();
    }

    @Override
    public void o_() {
        Keyboard.enableRepeatEvents((boolean)false);
    }

    private void IIIllIIlIIIIIIlIlIIllIIlI() {
        this.IllIIIIllIIllIllIlllIlIIl.lIIIIlIlIIlllllIIllIIlIII = !this.IIIllIIlIIIIIIlIlIIllIIlI && (this.lIlllIlllIlIIIIlllIlIlIIl < this.lIIIIlIlIIlllllIIllIIlIII - 1 || this.IlIIIIIllllllIIlllIllllll);
        this.IIIIIIIIlIllIIllIIlllIllI.lIIIIlIlIIlllllIIllIIlIII = !this.IIIllIIlIIIIIIlIlIIllIIlI && this.lIlllIlllIlIIIIlllIlIlIIl > 0;
        boolean bl = this.IIlIIlIlIlIllIIlIlIIIIlll.lIIIIlIlIIlllllIIllIIlIII = !this.IlIIIIIllllllIIlllIllllll || !this.IIIllIIlIIIIIIlIlIIllIIlI;
        if (this.IlIIIIIllllllIIlllIllllll) {
            this.llIIIlllIlllIlIllIIIIllIl.lIIIIlIlIIlllllIIllIIlIII = !this.IIIllIIlIIIIIIlIlIIllIIlI;
            this.IlIlIIlllIllllllllIIIlIlI.lIIIIlIlIIlllllIIllIIlIII = this.IIIllIIlIIIIIIlIlIIllIIlI;
            this.IIIIlIllIlIIlIIlIllIlIlll.lIIIIlIlIIlllllIIllIIlIII = this.IIIllIIlIIIIIIlIlIIllIIlI;
            this.IIIIlIllIlIIlIIlIllIlIlll.IllIIIllIIIIlIlIlIllIIlll = this.llIIlIlIlllIIllIlIlllIllI.trim().length() > 0;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        if (this.IlIIIIIllllllIIlllIllllll && this.lIllllIIlIIIlIllllllIIIll && this.IlIIlllllIIlIlIlllllIllll != null) {
            class_0775 class_07752;
            String string;
            while (this.IlIIlllllIIlIlIlllllIllll.lIlllIlllIIIIlIIlllIllIII() > 1 && (string = this.IlIIlllllIIlIlIlllllIllll.lIllllIIlIIIlIllllllIIIll(this.IlIIlllllIIlIlIlllllIllll.lIlllIlllIIIIlIIlllIllIII() - 1)).length() == 0) {
                this.IlIIlllllIIlIlIlllllIllll.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll.lIlllIlllIIIIlIIlllIllIII() - 1);
            }
            if (this.lIlllIlllIIIIlIIlllIllIII.IlIlIIlIlIllIIlIlIIllIIIl()) {
                class_07752 = this.lIlllIlllIIIIlIIlllIllIII.lllllIlllIIllIlIIlIIIllII();
                class_07752.lllIIIllIIIIlllIlIIllIIll("pages", this.IlIIlllllIIlIlIlllllIllll);
            } else {
                this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll("pages", this.IlIIlllllIIlIlIlllllIllll);
            }
            string = "MC|BEdit";
            if (bl) {
                string = "MC|BSign";
                this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll("author", new class_0928(this.IlIllllllIIlIIllllIIlIIIl.llllIIIIlIIIlIIIIIIlIllll()));
                this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll("title", new class_0928(this.llIIlIlIlllIIllIlIlllIllI.trim()));
                this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(Items.lIIIlllllllIlllIIllllllll);
            }
            class_07752 = Unpooled.buffer();
            try {
                new PacketBuffer((ByteBuf)class_07752).lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII);
                this.lllllIlllIIllIlIIlIIIllII.llIIlIllIllllIlIIIIlIIlll().lllIIIllIIIIlllIlIIllIIll(new C17PacketCustomPayload(string, (ByteBuf)class_07752));
            }
            catch (Exception exception) {
                lllIIIllIIIIlllIlIIllIIll.error("Couldn't send book info", (Throwable)exception);
            }
            finally {
                class_07752.release();
            }
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        if (class_11972.IllIIIllIIIIlIlIlIllIIlll) {
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 0) {
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll((class_0229)null);
                this.lllIIIllIIIIlllIlIIllIIll(false);
            } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 3 && this.IlIIIIIllllllIIlllIllllll) {
                this.IIIllIIlIIIIIIlIlIIllIIlI = true;
            } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 1) {
                if (this.lIlllIlllIlIIIIlllIlIlIIl < this.lIIIIlIlIIlllllIIllIIlIII - 1) {
                    ++this.lIlllIlllIlIIIIlllIlIlIIl;
                } else if (this.IlIIIIIllllllIIlllIllllll) {
                    this.IllIIlllllllIIlIIlIIIIlIl();
                    if (this.lIlllIlllIlIIIIlllIlIlIIl < this.lIIIIlIlIIlllllIIllIIlIII - 1) {
                        ++this.lIlllIlllIlIIIIlllIlIlIIl;
                    }
                }
            } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 2) {
                if (this.lIlllIlllIlIIIIlllIlIlIIl > 0) {
                    --this.lIlllIlllIlIIIIlllIlIlIIl;
                }
            } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 5 && this.IIIllIIlIIIIIIlIlIIllIIlI) {
                this.lllIIIllIIIIlllIlIIllIIll(true);
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll((class_0229)null);
            } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 4 && this.IIIllIIlIIIIIIlIlIIllIIlI) {
                this.IIIllIIlIIIIIIlIlIIllIIlI = false;
            }
            this.IIIllIIlIIIIIIlIlIIllIIlI();
        }
    }

    private void IllIIlllllllIIlIIlIIIIlIl() {
        if (this.IlIIlllllIIlIlIlllllIllll != null && this.IlIIlllllIIlIlIlllllIllll.lIlllIlllIIIIlIIlllIllIII() < 50) {
            this.IlIIlllllIIlIlIlllllIllll.lllIIIllIIIIlllIlIIllIIll(new class_0928(""));
            ++this.lIIIIlIlIIlllllIIllIIlIII;
            this.lIllllIIlIIIlIllllllIIIll = true;
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(char c, int n) {
        super.lllIIIllIIIIlllIlIIllIIll(c, n);
        if (this.IlIIIIIllllllIIlllIllllll) {
            if (this.IIIllIIlIIIIIIlIlIIllIIlI) {
                this.IlIllllllIIlIIllllIIlIIIl(c, n);
            } else {
                this.lllIlIIlIIIlIlIIIllIlllIl(c, n);
            }
        }
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(char c, int n) {
        switch (c) {
            case '\u0016': {
                this.lllIlIIlIIIlIlIIIllIlllIl(class_0229.lIIlIIIIIlIlllIlIIlIlIlll());
                return;
            }
        }
        switch (n) {
            case 14: {
                String string = this.IIIllIllIIlIlIlIlIllllIIl();
                if (string.length() > 0) {
                    this.lllIIIllIIIIlllIlIIllIIll(string.substring(0, string.length() - 1));
                }
                return;
            }
            case 28: 
            case 156: {
                this.lllIlIIlIIIlIlIIIllIlllIl("\n");
                return;
            }
        }
        if (class_1395.lllIIIllIIIIlllIlIIllIIll(c)) {
            this.lllIlIIlIIIlIlIIIllIlllIl(Character.toString(c));
        }
    }

    private void IlIllllllIIlIIllllIIlIIIl(char c, int n) {
        switch (n) {
            case 14: {
                if (!this.llIIlIlIlllIIllIlIlllIllI.isEmpty()) {
                    this.llIIlIlIlllIIllIlIlllIllI = this.llIIlIlIlllIIllIlIlllIllI.substring(0, this.llIIlIlIlllIIllIlIlllIllI.length() - 1);
                    this.IIIllIIlIIIIIIlIlIIllIIlI();
                }
                return;
            }
            case 28: 
            case 156: {
                if (!this.llIIlIlIlllIIllIlIlllIllI.isEmpty()) {
                    this.lllIIIllIIIIlllIlIIllIIll(true);
                    this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll((class_0229)null);
                }
                return;
            }
        }
        if (this.llIIlIlIlllIIllIlIlllIllI.length() < 16 && class_1395.lllIIIllIIIIlllIlIIllIIll(c)) {
            this.llIIlIlIlllIIllIlIlllIllI = this.llIIlIlIlllIIllIlIlllIllI + Character.toString(c);
            this.IIIllIIlIIIIIIlIlIIllIIlI();
            this.lIllllIIlIIIlIllllllIIIll = true;
        }
    }

    private String IIIllIllIIlIlIlIlIllllIIl() {
        return this.IlIIlllllIIlIlIlllllIllll != null && this.lIlllIlllIlIIIIlllIlIlIIl >= 0 && this.lIlllIlllIlIIIIlllIlIlIIl < this.IlIIlllllIIlIlIlllllIllll.lIlllIlllIIIIlIIlllIllIII() ? this.IlIIlllllIIlIlIlllllIllll.lIllllIIlIIIlIllllllIIIll(this.lIlllIlllIlIIIIlllIlIlIIl) : "";
    }

    private void lllIIIllIIIIlllIlIIllIIll(String string) {
        if (this.IlIIlllllIIlIlIlllllIllll != null && this.lIlllIlllIlIIIIlllIlIlIIl >= 0 && this.lIlllIlllIlIIIIlllIlIlIIl < this.IlIIlllllIIlIlIlllllIllll.lIlllIlllIIIIlIIlllIllIII()) {
            this.IlIIlllllIIlIlIlllllIllll.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIlIIIIlllIlIlIIl, new class_0928(string));
            this.lIllllIIlIIIlIllllllIIIll = true;
        }
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(String string) {
        String string2 = this.IIIllIllIIlIlIlIlIllllIIl();
        String string3 = string2 + string;
        int n = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(string3 + "" + (Object)((Object) EnumChatFormatting.BLACK) + "_", 118);
        if (n <= 118 && string3.length() < 256) {
            this.lllIIIllIIIIlllIlIIllIIll(string3);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(lllIlIIlIIIlIlIIIllIlllIl);
        int n3 = (this.IlIlIIlllIIlIllIIIlllllIl - this.IIIllIllIIlIlIlIlIllllIIl) / 2;
        int n4 = 2;
        class_1752.lllIIIllIIIIlllIlIIllIIll(n3, n4, 0, 0, this.IIIllIllIIlIlIlIlIllllIIl, this.IllIIIllIIIIlIlIlIllIIlll);
        if (this.IIIllIIlIIIIIIlIlIIllIIlI) {
            String string = this.llIIlIlIlllIIllIlIlllIllI;
            if (this.IlIIIIIllllllIIlllIllllll) {
                string = this.IllIIlllllllIIlIIlIIIIlIl / 6 % 2 == 0 ? string + "" + (Object)((Object) EnumChatFormatting.BLACK) + "_" : string + "" + (Object)((Object) EnumChatFormatting.GRAY) + "_";
            }
            String string2 = class_0616.lllIIIllIIIIlllIlIIllIIll("book.editTitle", new Object[0]);
            int n5 = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(string2);
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(string2, n3 + 36 + (116 - n5) / 2, n4 + 16 + 16, 0);
            int n6 = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(string);
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(string, n3 + 36 + (116 - n6) / 2, n4 + 48, 0);
            String string3 = class_0616.lllIIIllIIIIlllIlIIllIIll("book.byAuthor", this.IlIllllllIIlIIllllIIlIIIl.llllIIIIlIIIlIIIIIIlIllll());
            int n7 = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(string3);
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl((Object)((Object) EnumChatFormatting.DARK_GRAY) + string3, n3 + 36 + (116 - n7) / 2, n4 + 48 + 10, 0);
            String string4 = class_0616.lllIIIllIIIIlllIlIIllIIll("book.finalizeWarning", new Object[0]);
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(string4, n3 + 36, n4 + 80, 116, 0);
        } else {
            String string = class_0616.lllIIIllIIIIlllIlIIllIIll("book.pageIndicator", this.lIlllIlllIlIIIIlllIlIlIIl + 1, this.lIIIIlIlIIlllllIIllIIlIII);
            String string5 = "";
            if (this.IlIIlllllIIlIlIlllllIllll != null && this.lIlllIlllIlIIIIlllIlIlIIl >= 0 && this.lIlllIlllIlIIIIlllIlIlIIl < this.IlIIlllllIIlIlIlllllIllll.lIlllIlllIIIIlIIlllIllIII()) {
                string5 = this.IlIIlllllIIlIlIlllllIllll.lIllllIIlIIIlIllllllIIIll(this.lIlllIlllIlIIIIlllIlIlIIl);
            }
            if (this.IlIIIIIllllllIIlllIllllll) {
                string5 = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl() ? string5 + "_" : (this.IllIIlllllllIIlIIlIIIIlIl / 6 % 2 == 0 ? string5 + "" + (Object)((Object) EnumChatFormatting.BLACK) + "_" : string5 + "" + (Object)((Object) EnumChatFormatting.GRAY) + "_");
            }
            int n8 = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(string);
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(string, n3 - n8 + this.IIIllIllIIlIlIlIlIllllIIl - 44, n4 + 16, 0);
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(string5, n3 + 36, n4 + 16 + 16, 116, 0);
        }
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
    }

    static /* synthetic */ ResourceLocation lIllllIIlIIIlIllllllIIIll() {
        return lllIlIIlIIIlIlIIIllIlllIl;
    }
}

