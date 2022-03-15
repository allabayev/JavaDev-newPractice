package uz;

import java.util.ArrayList;

public class NewLesson {
    public static void main(String[] args) {
        ArrayList biofraphi = new ArrayList();
        System.out.println("---------ArrayList add----------");
        biofraphi.add("Allabayev"); //biographi listiga qo'shish
        biofraphi.add("Adham");
        biofraphi.add("Oblaqulovich");
        biofraphi.add("10.08.1987");
        System.out.println(biofraphi);
        System.out.println("-----------------------------");
        System.out.println(biofraphi.get(0)); // kerakli elementini olish
        System.out.println("----------------------------");
        biofraphi.set(3, "Data rojdeniya");
        biofraphi.add(0, "Family");
        biofraphi.add(2, "Name");
        biofraphi.add(4, "Patronimiks");
        biofraphi.add(7, "10.08.1987");
        System.out.println(biofraphi);
        System.out.println("-----------------------------------");
        biofraphi.remove(1);
        biofraphi.remove("10.08.1987");
        System.out.println(biofraphi);
        System.out.println("----------------------------");
        biofraphi.clear();
        System.out.println(biofraphi);
    }
}
