package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class class_1071 {
    public List lllIlIIlIIIlIlIIIllIlllIl = new ArrayList();
    public List IlIllllllIIlIIllllIIlIIIl = new ArrayList();
    public int lIlllIlllIIIIlIIlllIllIII;
    private short lllIIIllIIIIlllIlIIllIIll;
    private int lIllllIIlIIIlIllllllIIIll = -1;
    private int IIIllIIlIIIIIIlIlIIllIIlI;
    private final Set IllIIlllllllIIlIIlIIIIlIl = new HashSet();
    protected List IlIIIIIllllllIIlllIllllll = new ArrayList();
    private Set IIIllIllIIlIlIlIlIllllIIl = new HashSet();

    protected class_1291 lllIlIIlIIIlIlIIIllIlllIl(class_1291 class_12912) {
        class_12912.IIIllIIlIIIIIIlIlIIllIIlI = this.IlIllllllIIlIIllllIIlIIIl.size();
        this.IlIllllllIIlIIllllIIlIIIl.add(class_12912);
        this.lllIlIIlIIIlIlIIIllIlllIl.add(null);
        return class_12912;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1283 class_12832) {
        if (this.IlIIIIIllllllIIlllIllllll.contains(class_12832)) {
            throw new IllegalArgumentException("Listener already listening");
        }
        this.IlIIIIIllllllIIlllIllllll.add(class_12832);
        class_12832.lllIIIllIIIIlllIlIIllIIll(this, this.lllIlIIlIIIlIlIIIllIlllIl());
        this.IlIllllllIIlIIllllIIlIIIl();
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_1283 class_12832) {
        this.IlIIIIIllllllIIlllIllllll.remove(class_12832);
    }

    public List lllIlIIlIIIlIlIIIllIlllIl() {
        ArrayList<ItemStack> arrayList = new ArrayList<ItemStack>();
        for (int i = 0; i < this.IlIllllllIIlIIllllIIlIIIl.size(); ++i) {
            arrayList.add(((class_1291)this.IlIllllllIIlIIllllIIlIIIl.get(i)).lllIIIllIIIIlllIlIIllIIll());
        }
        return arrayList;
    }

    public void IlIllllllIIlIIllllIIlIIIl() {
        for (int i = 0; i < this.IlIllllllIIlIIllllIIlIIIl.size(); ++i) {
            ItemStack class_08972 = ((class_1291)this.IlIllllllIIlIIllllIIlIIIl.get(i)).lllIIIllIIIIlllIlIIllIIll();
            ItemStack class_08973 = (ItemStack)this.lllIlIIlIIIlIlIIIllIlllIl.get(i);
            if (ItemStack.lllIlIIlIIIlIlIIIllIlllIl(class_08973, class_08972)) continue;
            class_08973 = class_08972 == null ? null : class_08972.llIIlllIllIllllIIIlIIIIII();
            this.lllIlIIlIIIlIlIIIllIlllIl.set(i, class_08973);
            for (int j = 0; j < this.IlIIIIIllllllIIlllIllllll.size(); ++j) {
                ((class_1283)this.IlIIIIIllllllIIlllIllllll.get(j)).lllIIIllIIIIlllIlIIllIIll(this, i, class_08973);
            }
        }
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(class_0814 class_08142, int n) {
        return false;
    }

    public class_1291 lllIIIllIIIIlllIlIIllIIll(class_0850 class_08502, int n) {
        for (int i = 0; i < this.IlIllllllIIlIIllllIIlIIIl.size(); ++i) {
            class_1291 class_12912 = (class_1291)this.IlIllllllIIlIIllllIIlIIIl.get(i);
            if (!class_12912.lllIIIllIIIIlllIlIIllIIll(class_08502, n)) continue;
            return class_12912;
        }
        return null;
    }

    public class_1291 lllIIIllIIIIlllIlIIllIIll(int n) {
        return (class_1291)this.IlIllllllIIlIIllllIIlIIIl.get(n);
    }

    public ItemStack lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, int n) {
        class_1291 class_12912 = (class_1291)this.IlIllllllIIlIIllllIIlIIIl.get(n);
        return class_12912 != null ? class_12912.lllIIIllIIIIlllIlIIllIIll() : null;
    }

    public ItemStack lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, class_0814 class_08142) {
        ItemStack class_08972 = null;
        class_0503 class_05032 = class_08142.lllIIlIIIllllllIIIIlIlIlI;
        if (n3 == 5) {
            int n4 = this.IIIllIIlIIIIIIlIlIIllIIlI;
            this.IIIllIIlIIIIIIlIlIIllIIlI = class_1071.IlIllllllIIlIIllllIIlIIIl(n2);
            if ((n4 != 1 || this.IIIllIIlIIIIIIlIlIIllIIlI != 2) && n4 != this.IIIllIIlIIIIIIlIlIIllIIlI) {
                this.lIlllIlllIIIIlIIlllIllIII();
            } else if (class_05032.IllIIlllllllIIlIIlIIIIlIl() == null) {
                this.lIlllIlllIIIIlIIlllIllIII();
            } else if (this.IIIllIIlIIIIIIlIlIIllIIlI == 0) {
                this.lIllllIIlIIIlIllllllIIIll = class_1071.lllIlIIlIIIlIlIIIllIlllIl(n2);
                if (class_1071.lIlllIlllIIIIlIIlllIllIII(this.lIllllIIlIIIlIllllllIIIll)) {
                    this.IIIllIIlIIIIIIlIlIIllIIlI = 1;
                    this.IllIIlllllllIIlIIlIIIIlIl.clear();
                } else {
                    this.lIlllIlllIIIIlIIlllIllIII();
                }
            } else if (this.IIIllIIlIIIIIIlIlIIllIIlI == 1) {
                class_1291 class_12912 = (class_1291)this.IlIllllllIIlIIllllIIlIIIl.get(n);
                if (class_12912 != null && class_1071.lllIIIllIIIIlllIlIIllIIll(class_12912, class_05032.IllIIlllllllIIlIIlIIIIlIl(), true) && class_12912.lllIIIllIIIIlllIlIIllIIll(class_05032.IllIIlllllllIIlIIlIIIIlIl()) && class_05032.IllIIlllllllIIlIIlIIIIlIl().lllIlIIlIIIlIlIIIllIlllIl > this.IllIIlllllllIIlIIlIIIIlIl.size() && this.lllIIIllIIIIlllIlIIllIIll(class_12912)) {
                    this.IllIIlllllllIIlIIlIIIIlIl.add(class_12912);
                }
            } else if (this.IIIllIIlIIIIIIlIlIIllIIlI == 2) {
                if (!this.IllIIlllllllIIlIIlIIIIlIl.isEmpty()) {
                    ItemStack class_08973 = class_05032.IllIIlllllllIIlIIlIIIIlIl().llIIlllIllIllllIIIlIIIIII();
                    int n5 = class_05032.IllIIlllllllIIlIIlIIIIlIl().lllIlIIlIIIlIlIIIllIlllIl;
                    for (class_1291 class_12913 : this.IllIIlllllllIIlIIlIIIIlIl) {
                        if (class_12913 == null || !class_1071.lllIIIllIIIIlllIlIIllIIll(class_12913, class_05032.IllIIlllllllIIlIIlIIIIlIl(), true) || !class_12913.lllIIIllIIIIlllIlIIllIIll(class_05032.IllIIlllllllIIlIIlIIIIlIl()) || class_05032.IllIIlllllllIIlIIlIIIIlIl().lllIlIIlIIIlIlIIIllIlllIl < this.IllIIlllllllIIlIIlIIIIlIl.size() || !this.lllIIIllIIIIlllIlIIllIIll(class_12913)) continue;
                        ItemStack class_08974 = class_08973.llIIlllIllIllllIIIlIIIIII();
                        int n6 = class_12913.lllIlIIlIIIlIlIIIllIlllIl() ? class_12913.lllIIIllIIIIlllIlIIllIIll().lllIlIIlIIIlIlIIIllIlllIl : 0;
                        class_1071.lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl, this.lIllllIIlIIIlIllllllIIIll, class_08974, n6);
                        if (class_08974.lllIlIIlIIIlIlIIIllIlllIl > class_08974.lIlllIlllIIIIlIIlllIllIII()) {
                            class_08974.lllIlIIlIIIlIlIIIllIlllIl = class_08974.lIlllIlllIIIIlIIlllIllIII();
                        }
                        if (class_08974.lllIlIIlIIIlIlIIIllIlllIl > class_12913.lIlllIlllIIIIlIIlllIllIII()) {
                            class_08974.lllIlIIlIIIlIlIIIllIlllIl = class_12913.lIlllIlllIIIIlIIlllIllIII();
                        }
                        n5 -= class_08974.lllIlIIlIIIlIlIIIllIlllIl - n6;
                        class_12913.lllIlIIlIIIlIlIIIllIlllIl(class_08974);
                    }
                    class_08973.lllIlIIlIIIlIlIIIllIlllIl = n5;
                    if (class_08973.lllIlIIlIIIlIlIIIllIlllIl <= 0) {
                        class_08973 = null;
                    }
                    class_05032.lllIlIIlIIIlIlIIIllIlllIl(class_08973);
                }
                this.lIlllIlllIIIIlIIlllIllIII();
            } else {
                this.lIlllIlllIIIIlIIlllIllIII();
            }
        } else if (this.IIIllIIlIIIIIIlIlIIllIIlI != 0) {
            this.lIlllIlllIIIIlIIlllIllIII();
        } else if (!(n3 != 0 && n3 != 1 || n2 != 0 && n2 != 1)) {
            if (n == -999) {
                if (class_05032.IllIIlllllllIIlIIlIIIIlIl() != null && n == -999) {
                    if (n2 == 0) {
                        class_08142.lllIIIllIIIIlllIlIIllIIll(class_05032.IllIIlllllllIIlIIlIIIIlIl(), true);
                        class_05032.lllIlIIlIIIlIlIIIllIlllIl((ItemStack)null);
                    }
                    if (n2 == 1) {
                        class_08142.lllIIIllIIIIlllIlIIllIIll(class_05032.IllIIlllllllIIlIIlIIIIlIl().lllIIIllIIIIlllIlIIllIIll(1), true);
                        if (class_05032.IllIIlllllllIIlIIlIIIIlIl().lllIlIIlIIIlIlIIIllIlllIl == 0) {
                            class_05032.lllIlIIlIIIlIlIIIllIlllIl((ItemStack)null);
                        }
                    }
                }
            } else if (n3 == 1) {
                ItemStack class_08975;
                if (n < 0) {
                    return null;
                }
                class_1291 class_12914 = (class_1291)this.IlIllllllIIlIIllllIIlIIIl.get(n);
                if (class_12914 != null && class_12914.lllIIIllIIIIlllIlIIllIIll(class_08142) && (class_08975 = this.lllIIIllIIIIlllIlIIllIIll(class_08142, n)) != null) {
                    Item class_06112 = class_08975.lllIIIllIIIIlllIlIIllIIll();
                    class_08972 = class_08975.llIIlllIllIllllIIIlIIIIII();
                    if (class_12914.lllIIIllIIIIlllIlIIllIIll() != null && class_12914.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll() == class_06112) {
                        this.lllIIIllIIIIlllIlIIllIIll(n, n2, true, class_08142);
                    }
                }
            } else {
                if (n < 0) {
                    return null;
                }
                class_1291 class_12915 = (class_1291)this.IlIllllllIIlIIllllIIlIIIl.get(n);
                if (class_12915 != null) {
                    ItemStack class_08976 = class_12915.lllIIIllIIIIlllIlIIllIIll();
                    ItemStack class_08977 = class_05032.IllIIlllllllIIlIIlIIIIlIl();
                    if (class_08976 != null) {
                        class_08972 = class_08976.llIIlllIllIllllIIIlIIIIII();
                    }
                    if (class_08976 == null) {
                        if (class_08977 != null && class_12915.lllIIIllIIIIlllIlIIllIIll(class_08977)) {
                            int n7;
                            int n8 = n7 = n2 == 0 ? class_08977.lllIlIIlIIIlIlIIIllIlllIl : 1;
                            if (n7 > class_12915.lIlllIlllIIIIlIIlllIllIII()) {
                                n7 = class_12915.lIlllIlllIIIIlIIlllIllIII();
                            }
                            if (class_08977.lllIlIIlIIIlIlIIIllIlllIl >= n7) {
                                class_12915.lllIlIIlIIIlIlIIIllIlllIl(class_08977.lllIIIllIIIIlllIlIIllIIll(n7));
                            }
                            if (class_08977.lllIlIIlIIIlIlIIIllIlllIl == 0) {
                                class_05032.lllIlIIlIIIlIlIIIllIlllIl((ItemStack)null);
                            }
                        }
                    } else if (class_12915.lllIIIllIIIIlllIlIIllIIll(class_08142)) {
                        int n9;
                        if (class_08977 == null) {
                            int n10 = n2 == 0 ? class_08976.lllIlIIlIIIlIlIIIllIlllIl : (class_08976.lllIlIIlIIIlIlIIIllIlllIl + 1) / 2;
                            ItemStack class_08978 = class_12915.lllIIIllIIIIlllIlIIllIIll(n10);
                            class_05032.lllIlIIlIIIlIlIIIllIlllIl(class_08978);
                            if (class_08976.lllIlIIlIIIlIlIIIllIlllIl == 0) {
                                class_12915.lllIlIIlIIIlIlIIIllIlllIl(null);
                            }
                            class_12915.lllIIIllIIIIlllIlIIllIIll(class_08142, class_05032.IllIIlllllllIIlIIlIIIIlIl());
                        } else if (class_12915.lllIIIllIIIIlllIlIIllIIll(class_08977)) {
                            if (class_08976.lllIIIllIIIIlllIlIIllIIll() == class_08977.lllIIIllIIIIlllIlIIllIIll() && class_08976.IllIIIllIIIIlIlIlIllIIlll() == class_08977.IllIIIllIIIIlIlIlIllIIlll() && ItemStack.lllIIIllIIIIlllIlIIllIIll(class_08976, class_08977)) {
                                int n11;
                                int n12 = n11 = n2 == 0 ? class_08977.lllIlIIlIIIlIlIIIllIlllIl : 1;
                                if (n11 > class_12915.lIlllIlllIIIIlIIlllIllIII() - class_08976.lllIlIIlIIIlIlIIIllIlllIl) {
                                    n11 = class_12915.lIlllIlllIIIIlIIlllIllIII() - class_08976.lllIlIIlIIIlIlIIIllIlllIl;
                                }
                                if (n11 > class_08977.lIlllIlllIIIIlIIlllIllIII() - class_08976.lllIlIIlIIIlIlIIIllIlllIl) {
                                    n11 = class_08977.lIlllIlllIIIIlIIlllIllIII() - class_08976.lllIlIIlIIIlIlIIIllIlllIl;
                                }
                                class_08977.lllIIIllIIIIlllIlIIllIIll(n11);
                                if (class_08977.lllIlIIlIIIlIlIIIllIlllIl == 0) {
                                    class_05032.lllIlIIlIIIlIlIIIllIlllIl((ItemStack)null);
                                }
                                class_08976.lllIlIIlIIIlIlIIIllIlllIl += n11;
                            } else if (class_08977.lllIlIIlIIIlIlIIIllIlllIl <= class_12915.lIlllIlllIIIIlIIlllIllIII()) {
                                class_12915.lllIlIIlIIIlIlIIIllIlllIl(class_08977);
                                class_05032.lllIlIIlIIIlIlIIIllIlllIl(class_08976);
                            }
                        } else if (class_08976.lllIIIllIIIIlllIlIIllIIll() == class_08977.lllIIIllIIIIlllIlIIllIIll() && class_08977.lIlllIlllIIIIlIIlllIllIII() > 1 && (!class_08976.IIIllIIlIIIIIIlIlIIllIIlI() || class_08976.IllIIIllIIIIlIlIlIllIIlll() == class_08977.IllIIIllIIIIlIlIlIllIIlll()) && ItemStack.lllIIIllIIIIlllIlIIllIIll(class_08976, class_08977) && (n9 = class_08976.lllIlIIlIIIlIlIIIllIlllIl) > 0 && n9 + class_08977.lllIlIIlIIIlIlIIIllIlllIl <= class_08977.lIlllIlllIIIIlIIlllIllIII()) {
                            class_08977.lllIlIIlIIIlIlIIIllIlllIl += n9;
                            class_08976 = class_12915.lllIIIllIIIIlllIlIIllIIll(n9);
                            if (class_08976.lllIlIIlIIIlIlIIIllIlllIl == 0) {
                                class_12915.lllIlIIlIIIlIlIIIllIlllIl(null);
                            }
                            class_12915.lllIIIllIIIIlllIlIIllIIll(class_08142, class_05032.IllIIlllllllIIlIIlIIIIlIl());
                        }
                    }
                    class_12915.IlIllllllIIlIIllllIIlIIIl();
                }
            }
        } else if (n3 == 2 && n2 >= 0 && n2 < 9) {
            class_1291 class_12916 = (class_1291)this.IlIllllllIIlIIllllIIlIIIl.get(n);
            if (class_12916.lllIIIllIIIIlllIlIIllIIll(class_08142)) {
                ItemStack class_08979 = class_05032.llIIllIllIlIIlIIllIllllll(n2);
                boolean bl = class_08979 == null || class_12916.lIllllIIlIIIlIllllllIIIll == class_05032 && class_12916.lllIIIllIIIIlllIlIIllIIll(class_08979);
                int n13 = -1;
                if (!bl) {
                    n13 = class_05032.IlIllllllIIlIIllllIIlIIIl();
                    bl |= n13 > -1;
                }
                if (class_12916.lllIlIIlIIIlIlIIIllIlllIl() && bl) {
                    ItemStack class_089710 = class_12916.lllIIIllIIIIlllIlIIllIIll();
                    class_05032.lllIlIIlIIIlIlIIIllIlllIl(n2, class_089710.llIIlllIllIllllIIIlIIIIII());
                    if (!(class_12916.lIllllIIlIIIlIllllllIIIll == class_05032 && class_12916.lllIIIllIIIIlllIlIIllIIll(class_08979) || class_08979 == null)) {
                        if (n13 > -1) {
                            class_05032.lllIIIllIIIIlllIlIIllIIll(class_08979);
                            class_12916.lllIIIllIIIIlllIlIIllIIll(class_089710.lllIlIIlIIIlIlIIIllIlllIl);
                            class_12916.lllIlIIlIIIlIlIIIllIlllIl(null);
                            class_12916.lllIIIllIIIIlllIlIIllIIll(class_08142, class_089710);
                        }
                    } else {
                        class_12916.lllIIIllIIIIlllIlIIllIIll(class_089710.lllIlIIlIIIlIlIIIllIlllIl);
                        class_12916.lllIlIIlIIIlIlIIIllIlllIl(class_08979);
                        class_12916.lllIIIllIIIIlllIlIIllIIll(class_08142, class_089710);
                    }
                } else if (!class_12916.lllIlIIlIIIlIlIIIllIlllIl() && class_08979 != null && class_12916.lllIIIllIIIIlllIlIIllIIll(class_08979)) {
                    class_05032.lllIlIIlIIIlIlIIIllIlllIl(n2, null);
                    class_12916.lllIlIIlIIIlIlIIIllIlllIl(class_08979);
                }
            }
        } else if (n3 == 3 && class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII && class_05032.IllIIlllllllIIlIIlIIIIlIl() == null && n >= 0) {
            class_1291 class_12917 = (class_1291)this.IlIllllllIIlIIllllIIlIIIl.get(n);
            if (class_12917 != null && class_12917.lllIlIIlIIIlIlIIIllIlllIl()) {
                ItemStack class_089711 = class_12917.lllIIIllIIIIlllIlIIllIIll().llIIlllIllIllllIIIlIIIIII();
                class_089711.lllIlIIlIIIlIlIIIllIlllIl = class_089711.lIlllIlllIIIIlIIlllIllIII();
                class_05032.lllIlIIlIIIlIlIIIllIlllIl(class_089711);
            }
        } else if (n3 == 4 && class_05032.IllIIlllllllIIlIIlIIIIlIl() == null && n >= 0) {
            class_1291 class_12918 = (class_1291)this.IlIllllllIIlIIllllIIlIIIl.get(n);
            if (class_12918 != null && class_12918.lllIlIIlIIIlIlIIIllIlllIl() && class_12918.lllIIIllIIIIlllIlIIllIIll(class_08142)) {
                ItemStack class_089712 = class_12918.lllIIIllIIIIlllIlIIllIIll(n2 == 0 ? 1 : class_12918.lllIIIllIIIIlllIlIIllIIll().lllIlIIlIIIlIlIIIllIlllIl);
                class_12918.lllIIIllIIIIlllIlIIllIIll(class_08142, class_089712);
                class_08142.lllIIIllIIIIlllIlIIllIIll(class_089712, true);
            }
        } else if (n3 == 6 && n >= 0) {
            class_1291 class_12919 = (class_1291)this.IlIllllllIIlIIllllIIlIIIl.get(n);
            ItemStack class_089713 = class_05032.IllIIlllllllIIlIIlIIIIlIl();
            if (!(class_089713 == null || class_12919 != null && class_12919.lllIlIIlIIIlIlIIIllIlllIl() && class_12919.lllIIIllIIIIlllIlIIllIIll(class_08142))) {
                int n14 = n2 == 0 ? 0 : this.IlIllllllIIlIIllllIIlIIIl.size() - 1;
                int n15 = n2 == 0 ? 1 : -1;
                for (int i = 0; i < 2; ++i) {
                    for (int j = n14; j >= 0 && j < this.IlIllllllIIlIIllllIIlIIIl.size() && class_089713.lllIlIIlIIIlIlIIIllIlllIl < class_089713.lIlllIlllIIIIlIIlllIllIII(); j += n15) {
                        class_1291 class_129110 = (class_1291)this.IlIllllllIIlIIllllIIlIIIl.get(j);
                        if (!class_129110.lllIlIIlIIIlIlIIIllIlllIl() || !class_1071.lllIIIllIIIIlllIlIIllIIll(class_129110, class_089713, true) || !class_129110.lllIIIllIIIIlllIlIIllIIll(class_08142) || !this.lllIIIllIIIIlllIlIIllIIll(class_089713, class_129110) || i == 0 && class_129110.lllIIIllIIIIlllIlIIllIIll().lllIlIIlIIIlIlIIIllIlllIl == class_129110.lllIIIllIIIIlllIlIIllIIll().lIlllIlllIIIIlIIlllIllIII()) continue;
                        int n16 = Math.min(class_089713.lIlllIlllIIIIlIIlllIllIII() - class_089713.lllIlIIlIIIlIlIIIllIlllIl, class_129110.lllIIIllIIIIlllIlIIllIIll().lllIlIIlIIIlIlIIIllIlllIl);
                        ItemStack class_089714 = class_129110.lllIIIllIIIIlllIlIIllIIll(n16);
                        class_089713.lllIlIIlIIIlIlIIIllIlllIl += n16;
                        if (class_089714.lllIlIIlIIIlIlIIIllIlllIl <= 0) {
                            class_129110.lllIlIIlIIIlIlIIIllIlllIl(null);
                        }
                        class_129110.lllIIIllIIIIlllIlIIllIIll(class_08142, class_089714);
                    }
                }
            }
            this.IlIllllllIIlIIllllIIlIIIl();
        }
        return class_08972;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_1291 class_12912) {
        return true;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, boolean bl, class_0814 class_08142) {
        this.lllIIIllIIIIlllIlIIllIIll(n, n2, 1, class_08142);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_0814 class_08142) {
        class_0503 class_05032 = class_08142.lllIIlIIIllllllIIIIlIlIlI;
        if (class_05032.IllIIlllllllIIlIIlIIIIlIl() != null) {
            class_08142.lllIIIllIIIIlllIlIIllIIll(class_05032.IllIIlllllllIIlIIlIIIIlIl(), false);
            class_05032.lllIlIIlIIIlIlIIIllIlllIl((ItemStack)null);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0850 class_08502) {
        this.IlIllllllIIlIIllllIIlIIIl();
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, ItemStack class_08972) {
        this.lllIIIllIIIIlllIlIIllIIll(n).lllIlIIlIIIlIlIIIllIlllIl(class_08972);
    }

    public void lllIIIllIIIIlllIlIIllIIll(ItemStack[] arrclass_0897) {
        for (int i = 0; i < arrclass_0897.length; ++i) {
            this.lllIIIllIIIIlllIlIIllIIll(i).lllIlIIlIIIlIlIIIllIlllIl(arrclass_0897[i]);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
    }

    public short lllIIIllIIIIlllIlIIllIIll(class_0503 class_05032) {
        this.lllIIIllIIIIlllIlIIllIIll = (short)(this.lllIIIllIIIIlllIlIIllIIll + 1);
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public boolean IlIllllllIIlIIllllIIlIIIl(class_0814 class_08142) {
        return !this.IIIllIllIIlIlIlIlIllllIIl.contains(class_08142);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, boolean bl) {
        if (bl) {
            this.IIIllIllIIlIlIlIlIllllIIl.remove(class_08142);
        } else {
            this.IIIllIllIIlIlIlIlIllllIIl.add(class_08142);
        }
    }

    public abstract boolean lllIIIllIIIIlllIlIIllIIll(class_0814 var1);

    protected boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, int n, int n2, boolean bl) {
        ItemStack class_08973;
        class_1291 class_12912;
        boolean bl2 = false;
        int n3 = n;
        if (bl) {
            n3 = n2 - 1;
        }
        if (class_08972.IlIIIIIllllllIIlllIllllll()) {
            while (class_08972.lllIlIIlIIIlIlIIIllIlllIl > 0 && (!bl && n3 < n2 || bl && n3 >= n)) {
                class_12912 = (class_1291)this.IlIllllllIIlIIllllIIlIIIl.get(n3);
                class_08973 = class_12912.lllIIIllIIIIlllIlIIllIIll();
                if (class_08973 != null && class_08973.lllIIIllIIIIlllIlIIllIIll() == class_08972.lllIIIllIIIIlllIlIIllIIll() && (!class_08972.IIIllIIlIIIIIIlIlIIllIIlI() || class_08972.IllIIIllIIIIlIlIlIllIIlll() == class_08973.IllIIIllIIIIlIlIlIllIIlll()) && ItemStack.lllIIIllIIIIlllIlIIllIIll(class_08972, class_08973)) {
                    int n4 = class_08973.lllIlIIlIIIlIlIIIllIlllIl + class_08972.lllIlIIlIIIlIlIIIllIlllIl;
                    if (n4 <= class_08972.lIlllIlllIIIIlIIlllIllIII()) {
                        class_08972.lllIlIIlIIIlIlIIIllIlllIl = 0;
                        class_08973.lllIlIIlIIIlIlIIIllIlllIl = n4;
                        class_12912.IlIllllllIIlIIllllIIlIIIl();
                        bl2 = true;
                    } else if (class_08973.lllIlIIlIIIlIlIIIllIlllIl < class_08972.lIlllIlllIIIIlIIlllIllIII()) {
                        class_08972.lllIlIIlIIIlIlIIIllIlllIl -= class_08972.lIlllIlllIIIIlIIlllIllIII() - class_08973.lllIlIIlIIIlIlIIIllIlllIl;
                        class_08973.lllIlIIlIIIlIlIIIllIlllIl = class_08972.lIlllIlllIIIIlIIlllIllIII();
                        class_12912.IlIllllllIIlIIllllIIlIIIl();
                        bl2 = true;
                    }
                }
                if (bl) {
                    --n3;
                    continue;
                }
                ++n3;
            }
        }
        if (class_08972.lllIlIIlIIIlIlIIIllIlllIl > 0) {
            n3 = bl ? n2 - 1 : n;
            while (!bl && n3 < n2 || bl && n3 >= n) {
                class_12912 = (class_1291)this.IlIllllllIIlIIllllIIlIIIl.get(n3);
                class_08973 = class_12912.lllIIIllIIIIlllIlIIllIIll();
                if (class_08973 == null) {
                    class_12912.lllIlIIlIIIlIlIIIllIlllIl(class_08972.llIIlllIllIllllIIIlIIIIII());
                    class_12912.IlIllllllIIlIIllllIIlIIIl();
                    class_08972.lllIlIIlIIIlIlIIIllIlllIl = 0;
                    bl2 = true;
                    break;
                }
                if (bl) {
                    --n3;
                    continue;
                }
                ++n3;
            }
        }
        return bl2;
    }

    public static int lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return n >> 2 & 3;
    }

    public static int IlIllllllIIlIIllllIIlIIIl(int n) {
        return n & 3;
    }

    public static int lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        return n & 3 | (n2 & 3) << 2;
    }

    public static boolean lIlllIlllIIIIlIIlllIllIII(int n) {
        return n == 0 || n == 1;
    }

    protected void lIlllIlllIIIIlIIlllIllIII() {
        this.IIIllIIlIIIIIIlIlIIllIIlI = 0;
        this.IllIIlllllllIIlIIlIIIIlIl.clear();
    }

    public static boolean lllIIIllIIIIlllIlIIllIIll(class_1291 class_12912, ItemStack class_08972, boolean bl) {
        boolean bl2;
        boolean bl3 = bl2 = class_12912 == null || !class_12912.lllIlIIlIIIlIlIIIllIlllIl();
        if (class_12912 != null && class_12912.lllIlIIlIIIlIlIIIllIlllIl() && class_08972 != null && class_08972.lllIIIllIIIIlllIlIIllIIll(class_12912.lllIIIllIIIIlllIlIIllIIll()) && ItemStack.lllIIIllIIIIlllIlIIllIIll(class_12912.lllIIIllIIIIlllIlIIllIIll(), class_08972)) {
            int n = bl ? 0 : class_08972.lllIlIIlIIIlIlIIIllIlllIl;
            bl2 |= class_12912.lllIIIllIIIIlllIlIIllIIll().lllIlIIlIIIlIlIIIllIlllIl + n <= class_08972.lIlllIlllIIIIlIIlllIllIII();
        }
        return bl2;
    }

    public static void lllIIIllIIIIlllIlIIllIIll(Set set, int n, ItemStack class_08972, int n2) {
        switch (n) {
            case 0: {
                class_08972.lllIlIIlIIIlIlIIIllIlllIl = MathHelper.lIlllIlllIIIIlIIlllIllIII((float)class_08972.lllIlIIlIIIlIlIIIllIlllIl / (float)set.size());
                break;
            }
            case 1: {
                class_08972.lllIlIIlIIIlIlIIIllIlllIl = 1;
            }
        }
        class_08972.lllIlIIlIIIlIlIIIllIlllIl += n2;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1291 class_12912) {
        return true;
    }

    public static int lllIlIIlIIIlIlIIIllIlllIl(class_0850 class_08502) {
        if (class_08502 == null) {
            return 0;
        }
        int n = 0;
        float f = 0.0f;
        for (int i = 0; i < class_08502.IlIIIIIllllllIIlllIllllll(); ++i) {
            ItemStack class_08972 = class_08502.llIIllIllIlIIlIIllIllllll(i);
            if (class_08972 == null) continue;
            f += (float)class_08972.lllIlIIlIIIlIlIIIllIlllIl / (float)Math.min(class_08502.llIIlIlIlllIIllIlIlllIllI(), class_08972.lIlllIlllIIIIlIIlllIllIII());
            ++n;
        }
        return MathHelper.lIlllIlllIIIIlIIlllIllIII((f /= (float)class_08502.IlIIIIIllllllIIlllIllllll()) * 14.0f) + (n > 0 ? 1 : 0);
    }
}

