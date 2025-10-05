public class Lab1Part1 {
    public static void main(String[] args) {
        //Initiate arrays x and y
        int[] x = {1, 3, 5, 7, 9};
        int[] y = {10, 8, 6, 4, 2};
        //Create array z with length 5
        int[] z = new int[5];
        for (int i = 0; i < 5; i++) {
            z[i] = Math.max(x[i], y[i]);
        }
        //Print arrays
        System.out.print("Array x = {");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]);
            if (i < x.length - 1) {
                System.out.print(", ");
                
            }

        }
        System.out.println("}");

        System.out.print("Array y = {");
        for (int i = 0; i < y.length; i++) {
            System.out.print(y[i]);
            if (i < y.length - 1) {
                System.out.print(", ");
                
            }

        }
        System.out.println("}");

        System.out.print("Array z = x + y = {");
        for (int i = 0; i < z.length; i++) {
            System.out.print(z[i]);
            if (i < z.length - 1) {
                System.out.print(", ");
                
            }


        }
        System.out.println("}");
    }

}
