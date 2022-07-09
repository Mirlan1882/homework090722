public class Main {
    public static void main(String[] args){;
        double[] nums = {5.5, 3.6, 5.8, 6.9, 7.5, 4.2, 8.9, 8.3, 7.3, 9.5, 2.5, -3.5, -5.8, 7.5, 9.5,};
        double lol = 0;
        int bob = 0;
        boolean hook=false;
        for (double nabers:nums) {
            if (nabers<0){
                hook = true;
            } else if (hook){
                bob++;
                lol +=nabers;
            }
        }
        System.out.println(lol / bob);
        {
        }
    }



    public static void game() {
    int [] arr = {-4, -2, 2, 3, 6, 8};
        for (int i = 0; i < arr.length ; i++) ;
        int i = 0;
        int min = arr[i];
        int min_i = i;
        for (int j = i + 1; j < arr.length ; j++) {
            if (arr[j] < min);
            min = arr[j];
            min_i = j;
            if (i != min_i){
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }

        }{
        }

        }

    }