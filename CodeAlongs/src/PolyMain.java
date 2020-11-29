public class PolyMain {
    public static void main(String[] args) {
        Foo[] pity = new Foo[4];
        pity[2] = new Baz();
        pity[1] = new Bar();
        pity[3] = new Mumble();
        pity[0] = new Foo();

        for(int i = 0; i < pity.length; i++){
            pity[i].method1();
            pity[i].method2();
            System.out.println(pity[i]);
            System.out.println();
        }
    }
}
