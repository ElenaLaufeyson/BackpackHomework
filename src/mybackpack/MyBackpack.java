package mybackpack;

import java.util.Arrays;

public class MyBackpack {

    public static void main(String[] args) {
        int w[] = {2, 3, 4};
        int c[] = {5, 7, 6};
        int L = 6;
        System.out.println("������ � ������� 0-1."
                + "������ ������� ������� � ������������ ����������");
        System.out.println("���� w[]: " + Arrays.toString(w));
        System.out.println("���� c[]: " + Arrays.toString(c));
        System.out.println("max ��� L = " + L);
        BackpackFunction backPack = new BackpackFunction();
        int result = backPack.function01(w, c, L);
        System.out.println("max ��������� = " + result);
    }
    
}
