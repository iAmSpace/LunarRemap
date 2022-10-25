package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonObject
 *  org.apache.commons.codec.binary.Base64
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import java.awt.Desktop;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.imageio.ImageIO;

import net.minecraft.client.Minecraft;
import net.minecraft.stats.Achievement;
import net.minecraft.util.IChatComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatBase;
import net.minecraft.stats.StatList;
import net.minecraft.util.ChatComponentTranslation;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class class_1056
extends class_0229
implements class_0945 {
    private static final Set lllIlIIlIIIlIlIIIllIlllIl = Sets.newHashSet((Object[])new String[]{"http", "https"});
    private static final Logger IlIllllllIIlIIllllIIlIIIl = LogManager.getLogger();
    private String lIlllIlllIIIIlIIlllIllIII = "";
    private int IlIIIIIllllllIIlllIllllll = -1;
    private boolean lIllllIIlIIIlIllllllIIIll;
    private boolean IIIllIIlIIIIIIlIlIIllIIlI;
    private int IllIIlllllllIIlIIlIIIIlIl;
    private List IIIllIllIIlIlIlIlIllllIIl = new ArrayList();
    private URI IllIIIllIIIIlIlIlIllIIlll;
    protected class_0598 lllIIIllIIIIlllIlIIllIIll;
    private String lIIIIlIlIIlllllIIllIIlIII = "";

    public class_1056() {
    }

    public class_1056(String string) {
        this.lIIIIlIlIIlllllIIllIIlIII = string;
    }

    @Override
    public void n_() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.IlIIIIIllllllIIlllIllllll = this.lllllIlllIIllIlIIlIIIllII.IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().IlIllllllIIlIIllllIIlIIIl().size();
        this.lllIIIllIIIIlllIlIIllIIll = new class_0598(this.lIlIllIIlIIlIIlIIlIIlIIll, 4, this.lIIlIIIIIlIlllIlIIlIlIlll - 12, this.IlIlIIlllIIlIllIIIlllllIl - 4, 12);
        this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll(100);
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(false);
        this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(true);
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII);
        this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(false);
    }

    @Override
    public void o_() {
        Keyboard.enableRepeatEvents((boolean)false);
        this.lllllIlllIIllIlIIlIIIllII.IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().lIlllIlllIIIIlIIlllIllIII();
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll();
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(char c, int n) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = false;
        if (n == 15) {
            this.lIllllIIlIIIlIllllllIIIll();
        } else {
            this.lIllllIIlIIIlIllllllIIIll = false;
        }
        if (n == 1) {
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll((class_0229)null);
        } else if (n != 28 && n != 156) {
            if (n == 200) {
                this.lllIIIllIIIIlllIlIIllIIll(-1);
            } else if (n == 208) {
                this.lllIIIllIIIIlllIlIIllIIll(1);
            } else if (n == 201) {
                this.lllllIlllIIllIlIIlIIIllII.IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().lllIlIIlIIIlIlIIIllIlllIl(this.lllllIlllIIllIlIIlIIIllII.IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().IIIllIllIIlIlIlIlIllllIIl() - 1);
            } else if (n == 209) {
                this.lllllIlllIIllIlIIlIIIllII.IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().lllIlIIlIIIlIlIIIllIlllIl(-this.lllllIlllIIllIlIIlIIIllII.IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().IIIllIllIIlIlIlIlIllllIIl() + 1);
            } else {
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(c, n);
            }
        } else {
            String string = this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl().trim();
            if (string.length() > 0) {
                this.lllIIIllIIIIlllIlIIllIIll(string);
            }
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll((class_0229)null);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.lllllIlllIIllIlIIlIIIllII.IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(string);
        this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl(string);
    }

    @Override
    public void a_() {
        super.a_();
        int n = Mouse.getEventDWheel();
        if (n != 0) {
            if (n > 1) {
                n = 1;
            }
            if (n < -1) {
                n = -1;
            }
            if (!class_1056.lIlllIlllIlIIIIlllIlIlIIl()) {
                n *= 7;
            }
            this.lllllIlllIIllIlIIlIIIllII.IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().lllIlIIlIIIlIlIIIllIlllIl(n);
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        class_0203 class_02032;
        IChatComponent class_22552;
        if (n3 == 0 && this.lllllIlllIIllIlIIlIIIllII.gameSettings.IllIIIIlIIlllllllllIlIlII && (class_22552 = this.lllllIlllIIllIlIIlIIIllII.IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(Mouse.getX(), Mouse.getY())) != null && (class_02032 = class_22552.lllIlIIlIIIlIlIIIllIlllIl().IllIIlllllllIIlIIlIIIIlIl()) != null) {
            block17: {
                if (class_1056.lIlllIlllIlIIIIlllIlIlIIl()) {
                    this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(class_22552.lIllllIIlIIIlIllllllIIIll());
                } else if (class_02032.lllIIIllIIIIlllIlIIllIIll() == class_1936.lllIIIllIIIIlllIlIIllIIll) {
                    try {
                        URI uRI = new URI(class_02032.lllIlIIlIIIlIlIIIllIlllIl());
                        if (!lllIlIIlIIIlIlIIIllIlllIl.contains(uRI.getScheme().toLowerCase())) {
                            throw new URISyntaxException(class_02032.lllIlIIlIIIlIlIIIllIlllIl(), "Unsupported protocol: " + uRI.getScheme().toLowerCase());
                        }
                        if (this.lllllIlllIIllIlIIlIIIllII.gameSettings.IIIlllIlIIllIIlIlIllIlIIl) {
                            this.IllIIIllIIIIlIlIlIllIIlll = uRI;
                            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_1616((class_0945)this, class_02032.lllIlIIlIIIlIlIIIllIlllIl(), 0, false));
                            break block17;
                        }
                        this.lllIIIllIIIIlllIlIIllIIll(uRI);
                    }
                    catch (URISyntaxException uRISyntaxException) {
                        IlIllllllIIlIIllllIIlIIIl.error("Can't open url for " + class_02032, (Throwable)uRISyntaxException);
                    }
                } else if (class_02032.lllIIIllIIIIlllIlIIllIIll() == class_1936.lllIlIIlIIIlIlIIIllIlllIl) {
                    URI uRI = new File(class_02032.lllIlIIlIIIlIlIIIllIlllIl()).toURI();
                    this.lllIIIllIIIIlllIlIIllIIll(uRI);
                } else if (class_02032.lllIIIllIIIIlllIlIIllIIll() == class_1936.IlIIIIIllllllIIlllIllllll) {
                    this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_02032.lllIlIIlIIIlIlIIIllIlllIl());
                } else if (class_02032.lllIIIllIIIIlllIlIIllIIll() == class_1936.IlIllllllIIlIIllllIIlIIIl) {
                    this.lllIIIllIIIIlllIlIIllIIll(class_02032.lllIlIIlIIIlIlIIIllIlllIl());
                } else if (class_02032.lllIIIllIIIIlllIlIIllIIll() == class_1936.lIllllIIlIIIlIllllllIIIll) {
                    this.lllIlIIlIIIlIlIIIllIlllIl(class_02032.lllIlIIlIIIlIlIIIllIlllIl());
                } else {
                    IlIllllllIIlIIllllIIlIIIl.error("Don't know how to handle " + class_02032);
                }
            }
            return;
        }
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(String string) {
        File file = new File(this.lllllIlllIIllIlIIlIIIllII.mcDataDir + File.separator + "screenshots" + File.separator + string);
        if (file.exists()) {
            class_1176.lllIlIIlIIIlIlIIIllIlllIl = true;
            new Thread(() -> {
                try {
                    String string;
                    BufferedImage bufferedImage = ImageIO.read(file);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ImageIO.write((RenderedImage)bufferedImage, "png", byteArrayOutputStream);
                    URL uRL = new URL("https://api.imgur.com/3/upload");
                    String string2 = URLEncoder.encode("image", "UTF-8") + "=" + URLEncoder.encode(Base64.encodeBase64String((byte[])byteArrayOutputStream.toByteArray()), "UTF-8");
                    string2 = string2 + "&" + URLEncoder.encode("key", "UTF-8") + "=" + URLEncoder.encode("82876e209fa1a37", "UTF-8");
                    URLConnection uRLConnection = uRL.openConnection();
                    uRLConnection.setDoOutput(true);
                    uRLConnection.setDoInput(true);
                    uRLConnection.setRequestProperty("Authorization", "Client-ID 82876e209fa1a37");
                    uRLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(uRLConnection.getOutputStream());
                    outputStreamWriter.write(string2);
                    outputStreamWriter.flush();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream()));
                    StringBuilder stringBuilder = new StringBuilder();
                    while ((string = bufferedReader.readLine()) != null) {
                        stringBuilder.append(string).append(System.lineSeparator());
                    }
                    bufferedReader.close();
                    class_1176.lllIlIIlIIIlIlIIIllIlllIl = false;
                    Gson gson = new GsonBuilder().create();
                    JsonObject jsonObject = (JsonObject)gson.fromJson(stringBuilder.toString(), JsonObject.class);
                    String string3 = "https://i.imgur.com/" + jsonObject.get("data").getAsJsonObject().get("id").getAsString() + ".png";
                    URI uRI = new URI(string3);
                    Minecraft.getMinecraft().lllIIIllIIIIlllIlIIllIIll(() -> {
                        this.IllIIIllIIIIlIlIlIllIIlll = uRI;
                        class_1616 class_16162 = new class_1616((class_0945)this, string3, 0, false);
                        class_16162.IIIllIIlIIIIIIlIlIIllIIlI();
                        this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(class_16162);
                    });
                }
                catch (Exception exception) {
                    class_1176.lllIlIIlIIIlIlIIIllIlllIl = false;
                    exception.printStackTrace();
                }
            }).start();
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(boolean bl, int n) {
        if (n == 0) {
            if (bl) {
                this.lllIIIllIIIIlllIlIIllIIll(this.IllIIIllIIIIlIlIlIllIIlll);
            }
            this.IllIIIllIIIIlIlIlIllIIlll = null;
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this);
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(URI uRI) {
        try {
            Desktop.getDesktop().browse(uRI);
        }
        catch (Throwable throwable) {
            IlIllllllIIlIIllllIIlIIIl.error("Couldn't open link", throwable);
        }
    }

    public void lIllllIIlIIIlIllllllIIIll() {
        if (this.lIllllIIlIIIlIllllllIIIll) {
            this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(-1, this.lllIIIllIIIIlllIlIIllIIll.IllIIlllllllIIlIIlIIIIlIl(), false) - this.lllIIIllIIIIlllIlIIllIIll.IllIIlllllllIIlIIlIIIIlIl());
            if (this.IllIIlllllllIIlIIlIIIIlIl >= this.IIIllIllIIlIlIlIlIllllIIl.size()) {
                this.IllIIlllllllIIlIIlIIIIlIl = 0;
            }
        } else {
            int n = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(-1, this.lllIIIllIIIIlllIlIIllIIll.IllIIlllllllIIlIIlIIIIlIl(), false);
            this.IIIllIllIIlIlIlIlIllllIIl.clear();
            this.IllIIlllllllIIlIIlIIIIlIl = 0;
            String string = this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl().substring(n).toLowerCase();
            String string2 = this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl().substring(0, this.lllIIIllIIIIlllIlIIllIIll.IllIIlllllllIIlIIlIIIIlIl());
            this.lllIIIllIIIIlllIlIIllIIll(string2, string);
            if (this.IIIllIllIIlIlIlIlIllllIIl.isEmpty()) {
                return;
            }
            this.lIllllIIlIIIlIllllllIIIll = true;
            this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(n - this.lllIIIllIIIIlllIlIIllIIll.IllIIlllllllIIlIIlIIIIlIl());
        }
        if (this.IIIllIllIIlIlIlIlIllllIIl.size() > 1) {
            StringBuilder stringBuilder = new StringBuilder();
            for (String string2 : this.IIIllIllIIlIlIlIlIllllIIl) {
                if (stringBuilder.length() > 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(string2);
            }
            this.lllllIlllIIllIlIIlIIIllII.IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(new class_0722(stringBuilder.toString()), 1);
        }
        this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(class_1227.lllIIIllIIIIlllIlIIllIIll((String)this.IIIllIllIIlIlIlIlIllllIIl.get(this.IllIIlllllllIIlIIlIIIIlIl++)));
    }

    private void lllIIIllIIIIlllIlIIllIIll(String string, String string2) {
        if (string.length() >= 1) {
            this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new class_0287(string));
            this.IIIllIIlIIIIIIlIlIIllIIlI = true;
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        int n2 = this.IlIIIIIllllllIIlllIllllll + n;
        int n3 = this.lllllIlllIIllIlIIlIIIllII.IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().IlIllllllIIlIIllllIIlIIIl().size();
        if (n2 < 0) {
            n2 = 0;
        }
        if (n2 > n3) {
            n2 = n3;
        }
        if (n2 != this.IlIIIIIllllllIIlllIllllll) {
            if (n2 == n3) {
                this.IlIIIIIllllllIIlllIllllll = n3;
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII);
            } else {
                if (this.IlIIIIIllllllIIlllIllllll == n3) {
                    this.lIlllIlllIIIIlIIlllIllIII = this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl();
                }
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll((String)this.lllllIlllIIllIlIIlIIIllII.IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().IlIllllllIIlIIllllIIlIIIl().get(n2));
                this.IlIIIIIllllllIIlllIllllll = n2;
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        class_1056.lllIIIllIIIIlllIlIIllIIll(2.0f, this.lIIlIIIIIlIlllIlIIlIlIlll - 14, this.IlIlIIlllIIlIllIIIlllllIl - 2, this.lIIlIIIIIlIlllIlIIlIlIlll - 2, Integer.MIN_VALUE);
        this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll();
        IChatComponent class_22552 = this.lllllIlllIIllIlIIlIIIllII.IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(Mouse.getX(), Mouse.getY());
        if (class_22552 != null && class_22552.lllIlIIlIIIlIlIIIllIlllIl().IIIllIllIIlIlIlIlIllllIIl() != null) {
            class_0015 class_00152 = class_22552.lllIlIIlIIIlIlIIIllIlllIl().IIIllIllIIlIlIlIlIllllIIl();
            if (class_00152.lllIIIllIIIIlllIlIIllIIll() == class_0248.IlIllllllIIlIIllllIIlIIIl) {
                ItemStack class_08972 = null;
                try {
                    class_2037 class_20372 = class_0605.lllIIIllIIIIlllIlIIllIIll(class_00152.lllIlIIlIIIlIlIIIllIlllIl().IlIllllllIIlIIllllIIlIIIl());
                    if (class_20372 != null && class_20372 instanceof class_0775) {
                        class_08972 = ItemStack.lllIIIllIIIIlllIlIIllIIll((class_0775)class_20372);
                    }
                }
                catch (class_1323 class_13232) {
                    // empty catch block
                }
                if (class_08972 != null) {
                    this.lllIIIllIIIIlllIlIIllIIll(class_08972, n, n2);
                } else {
                    this.lllIlIIlIIIlIlIIIllIlllIl((Object)((Object)class_1227.llIIllIllIlIIlIIllIllllll) + "Invalid Item!", n, n2);
                }
            } else if (class_00152.lllIIIllIIIIlllIlIIllIIll() == class_0248.lllIIIllIIIIlllIlIIllIIll) {
                this.lllIIIllIIIIlllIlIIllIIll(Splitter.on((String)"\n").splitToList((CharSequence)class_00152.lllIlIIlIIIlIlIIIllIlllIl().lIlllIlllIIIIlIIlllIllIII()), n, n2);
            } else if (class_00152.lllIIIllIIIIlllIlIIllIIll() == class_0248.lllIlIIlIIIlIlIIIllIlllIl) {
                StatBase class_03192 = StatList.lllIIIllIIIIlllIlIIllIIll(class_00152.lllIlIIlIIIlIlIIIllIlllIl().IlIllllllIIlIIllllIIlIIIl());
                if (class_03192 != null) {
                    IChatComponent class_22553 = class_03192.IlIIIIIllllllIIlllIllllll();
                    ChatComponentTranslation class_17902 = new ChatComponentTranslation("stats.tooltip.type." + (class_03192.lIlllIlllIIIIlIIlllIllIII() ? "achievement" : "statistic"), new Object[0]);
                    class_17902.lllIlIIlIIIlIlIIIllIlllIl().lllIlIIlIIIlIlIIIllIlllIl(true);
                    String string = class_03192 instanceof Achievement ? ((Achievement)class_03192).lIllllIIlIIIlIllllllIIIll() : null;
                    ArrayList arrayList = Lists.newArrayList((Object[])new String[]{class_22553.lIlllIlllIIIIlIIlllIllIII(), class_17902.lIlllIlllIIIIlIIlllIllIII()});
                    if (string != null) {
                        arrayList.addAll(this.lIlIllIIlIIlIIlIIlIIlIIll.IlIllllllIIlIIllllIIlIIIl(string, 150));
                    }
                    this.lllIIIllIIIIlllIlIIllIIll(arrayList, n, n2);
                } else {
                    this.lllIlIIlIIIlIlIIIllIlllIl((Object)((Object)class_1227.llIIllIllIlIIlIIllIllllll) + "Invalid statistic/achievement!", n, n2);
                }
            }
            GL11.glDisable((int)2896);
        }
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
    }

    public void lllIIIllIIIIlllIlIIllIIll(String[] arrstring) {
        if (this.IIIllIIlIIIIIIlIlIIllIIlI) {
            String[] arrstring2;
            this.lIllllIIlIIIlIllllllIIIll = false;
            this.IIIllIllIIlIlIlIlIllllIIl.clear();
            String[] arrstring3 = arrstring;
            int n = arrstring.length;
            for (int i = 0; i < n; ++i) {
                arrstring2 = arrstring3[i];
                if (arrstring2.length() <= 0) continue;
                this.IIIllIllIIlIlIlIlIllllIIl.add(arrstring2);
            }
            String string = this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl().substring(this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(-1, this.lllIIIllIIIIlllIlIIllIIll.IllIIlllllllIIlIIlIIIIlIl(), false));
            arrstring2 = new String[this.IIIllIllIIlIlIlIlIllllIIl.size()];
            for (int i = 0; i < this.IIIllIllIIlIlIlIlIllllIIl.size(); ++i) {
                arrstring2[i] = class_1227.lllIIIllIIIIlllIlIIllIIll((String)this.IIIllIllIIlIlIlIlIllllIIl.get(i));
            }
            String string2 = StringUtils.getCommonPrefix((String[])arrstring2);
            if (string2.length() > 0 && !string.equalsIgnoreCase(string2)) {
                this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(-1, this.lllIIIllIIIIlllIlIIllIIll.IllIIlllllllIIlIIlIIIIlIl(), false) - this.lllIIIllIIIIlllIlIIllIIll.IllIIlllllllIIlIIlIIIIlIl());
                this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(string2);
            } else if (this.IIIllIllIIlIlIlIlIllllIIl.size() > 0) {
                this.lIllllIIlIIIlIllllllIIIll = true;
                this.lIllllIIlIIIlIllllllIIIll();
            }
        }
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return false;
    }
}

