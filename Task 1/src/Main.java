import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int toadEyesCount = 0;          //Жабьи глаза
        int ghoulTearsCount = 0;        //Слезы вурдалака
        int ravenBonesCount = 0;        //Кости ворона
        int dumplingsCount = 0;         //Пельмени(а почему, собственно нет? xD )

        //todo реализовать ввод пользователем кол-ва ингредиентов.
        System.out.println("*** Вас приветствует программа приготовления эликсиров ***");
        System.out.println("Ведите количество ингридиентов:");
        System.out.println("Количество жабьих глаз:");
        toadEyesCount = new Scanner(System.in).nextInt();
        System.out.println("Количество слёз вурдалака:");
        ghoulTearsCount = new Scanner(System.in).nextInt();
        System.out.println("Количество костей ворона:");
        ravenBonesCount = new Scanner(System.in).nextInt();
        System.out.println("Количество пельменей:");
        dumplingsCount = new Scanner(System.in).nextInt();
        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
        // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир

        //todo дописать логику программы сюда
//        boolean fl = true;
//        while (fl) {
//            if (toadEyesCount >= 3 && ravenBonesCount >= 1) {
//                System.out.println("Вы можете приготовить эликсир зоркости");
//            }
//            if (ravenBonesCount >= 2 && dumplingsCount >= 4) {
//                System.out.println("Вы можете приготовить эликсир стойкости");
//            }
//            if (toadEyesCount >= 2 && ghoulTearsCount >= 7 && dumplingsCount >= 1) {
//                System.out.println("Вы можете приготовить эликсир скрытности");
//            }
//            if (toadEyesCount >= 4 && ghoulTearsCount >= 5 && dumplingsCount >= 10 && ravenBonesCount >= 3) {
//                System.out.println("Вы можете приготовить запретный эликсир");
//            }
//            if (toadEyesCount < 2 && ghoulTearsCount < 5 && dumplingsCount < 1 && ravenBonesCount < 2){
//                System.out.println("У Вас не хватает ингридиентов для приготовления эликсира");
//            }
//            fl = false;
        boolean fl = false;
        if (toadEyesCount >= 3 && ravenBonesCount >= 1) {
            System.out.println("Вы можете приготовить эликсир зоркости");
            fl = true;
        }
        if (ravenBonesCount >= 2 && dumplingsCount >= 4) {
            System.out.println("Вы можете приготовить эликсир стойкости");
            fl = true;
        }
        if (toadEyesCount >= 2 && ghoulTearsCount >= 7 && dumplingsCount >= 1) {
            System.out.println("Вы можете приготовить эликсир скрытности");
            fl = true;
        }
        if (toadEyesCount >= 4 && ghoulTearsCount >= 5 && dumplingsCount >= 10 && ravenBonesCount >= 3) {
            System.out.println("Вы можете приготовить запретный эликсир");
            fl = true;
        }
        if (fl == false) {
            System.out.println("У Вас не хватает ингридиентов для приготовления эликсира");
        }

    }
}




