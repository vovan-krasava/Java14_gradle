package syntax;

public class Records{
    public static void demo(){
        var old = new TrinagleOld(3, 6,6);
        var record = new Triangle(3, 5,5);

        System.out.println(record);
        System.out.println(old);

        System.out.println(new Triangle(3, 5,5) == new Triangle(3, 5,5));
        System.out.println(new Triangle(3, 5,5).equals(new Triangle(3, 5,5))) ;

        System.out.println(new TrinagleOld(3,7,7) == new TrinagleOld(3,7,7));
        System.out.println(new TrinagleOld(3,7,7).equals(new TrinagleOld(3,7,7)));
    }

}

final class TrinagleOld {
    public final int x;
    public final int y;
    public final int z;

    public TrinagleOld(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    // equals, hashCode, toString
}

record Triangle(int x, int y, int z){

}


