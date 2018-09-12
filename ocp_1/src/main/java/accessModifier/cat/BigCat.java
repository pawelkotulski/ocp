package accessModifier.cat;

public class BigCat {
    public String name = "cat";
    private int id = 1;
    protected boolean hasFur = true;
    boolean hasPaws = true;

    public static void main(String[] s) {
        BigCat cat = new BigCat();
        System.out.println(cat.name);
        System.out.println(cat.id);
        System.out.println(cat.hasFur);
        System.out.println(cat.hasPaws);
    }

}

