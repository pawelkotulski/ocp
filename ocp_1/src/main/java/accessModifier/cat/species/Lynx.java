package accessModifier.cat.species;

import accessModifier.cat.BigCat;

public class Lynx extends BigCat {
    public static void main(String[] s) {
        BigCat cat = new BigCat();
        System.out.println(cat.name);
        System.out.println(cat.id);
        System.out.println(cat.hasFur);
        System.out.println(cat.hasPaws);
    }
}
