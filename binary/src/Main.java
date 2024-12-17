public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        int startPoint = 0;
        int lastPoint = arr.length - 1;
        int midPoint = (arr.length - 1) / 2;
        int find = 8;
//        System.out.println(arr[midPoint]);
        boolean breakPoint = true;
        while (breakPoint) {
            if (find < arr[midPoint]) {
                startPoint = midPoint + 1;
                for (int t : arr) {
                    if (t == find) {
                        System.out.println(t + " eded tapildi");
                        breakPoint=false;
                    }

                }
            } else if (find > arr[midPoint]) {
                lastPoint = midPoint - 1;
                for (int t : arr) {
                    if (t == find) {
                        System.out.println(t + " eded tapildi!!!");
                        breakPoint=false;

                    }
                }




            }


        }
    }
}
