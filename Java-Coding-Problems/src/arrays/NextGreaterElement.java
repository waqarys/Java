package arrays;

//Problem: 107
public class NextGreaterElement {
    public static void main(String[] args) {
        int[] integers = {1, 2, 3, 4, 12, 2, 1, 4};

        int nge;
        int n = integers.length;

        for (int i = 0; i < n; i++) {
            nge = -1;
            for (int j = i + 1; j < n; j++) {
                if(integers[i] < integers[j]){
                    nge = integers[j];
                    break;
                }
            }
            System.out.println(integers[i] + " : " + nge);
        }
    }
}
