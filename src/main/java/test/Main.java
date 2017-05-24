package test;

public class Main {

    private static int x = printInt(44);

    private static int printInt(int num) {
        System.out.println("test.Main int " + num);
        return num + 42;
    }

    Main() {
        System.out.println("Initializing main...");
    }

    private int[] arr;
    int maina;
    private static int cnt;

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        cnt++;
        System.out.println("finalize : " + cnt);
    }


    private void f(Object... args) {
        for (Object o : args) {
            System.out.println(o.toString());
        }
    }

    public static void main(String... args) {
//        test.Main main = new test.Main();

        for (int i = 0; i < 5; i++) {
//            new test.Main();
//            new Thread(new Runnable() {
//                Random random = new Random(14);
//                @Override
//                public void run() {
//                    test.Main main = new test.Main();
//                    main.arr = new int[100000000];
//
//                    for (int i = 0; i < 100000000; i++) {
//                        main.arr[i] = random.nextInt();
//                    }
//
//                    Arrays.parallelSort(main.arr);
//                }
//            }).start();
        }
//        System.gc();
//        System.runFinalization();

        Object[] objects = new Object[]{
                new Integer(3),
                new Float(3.3),
                new Long(9L)
        };
//        main.f(3, 4, 5, 1, objects[1]);

    }
}
