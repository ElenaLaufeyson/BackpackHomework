package mybackpack;

import java.util.Arrays;

public class MyBackpack {

    public static void main(String[] args) {
        int w[] = {2, 3, 4};
        int c[] = {5, 7, 6};
        int L = 6;
        System.out.println("Задача о рюкзаке 0-1."
                + "каждый предмет имеется в единственном экземпляре");
        System.out.println("веса w[]: " + Arrays.toString(w));
        System.out.println("цены c[]: " + Arrays.toString(c));
        System.out.println("max вес L = " + L);
        BackpackFunction backPack = new BackpackFunction();
        int result = backPack.function01(w, c, L);
        System.out.println("max стоимость = " + result);
    }
    
}
