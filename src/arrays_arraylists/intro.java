package arrays_arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class intro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] =new int[]{1,2,3,4,5,6};
        System.out.println(Arrays.toString(a));

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i <3 ; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }

        System.out.println(list);
    }
}
