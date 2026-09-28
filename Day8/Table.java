class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {     //table number like 1 2 3 ......    ------->outer loop

            System.out.println("Table of " + i);

            for (int j = 1; j <= 10; j++) {     //multiplication number *3 or *4  ---->inner loop
                System.out.println(i + " x " + j + " = " + (i * j));
            }

            System.out.println();
        }
    }
}
