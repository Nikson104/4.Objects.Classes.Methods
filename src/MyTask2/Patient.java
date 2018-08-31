package MyTask2;

import java.util.Objects;
import java.util.Scanner;

public class Patient {
    private String[] allNames;
    private int[] allAges;
    private Boolean[] illOrNo;
    private Scanner scanner;

    void enterNames(String[] allNames, int[] allAges, Boolean[] illOrNo) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter [" + (i + 1) + "] name: ");
            allNames[i] = scanner.next();
            System.out.print("Enter [" + (i + 1) + "] age: ");
            allAges[i] = scanner.nextInt();
            System.out.print("Enter [" + (i + 1) + "] ill or no (yes/no): ");
            String value = scanner.next();
            illOrNo[i] = "yes".equals(value);
        }
    }

    void outputPatients(String[] allNames, int[] allAges, Boolean[] illOrNo) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Пациент " + allNames[i] + "-Возраст = " + allAges[i] + ",Болеет: " + illOrNo[i]);
        }
    }

    void searchByName(String[] allNames, int[] allAges, Boolean[] illOrNo) {
        System.out.println("Введите имя искомого пациента: ");
        Scanner scanner = new Scanner(System.in);
        String searchName;
        searchName = scanner.next();
        for (int i = 0; i < 3; i++) {
            if (Objects.equals(searchName, allNames[i])) {
                System.out.println("Пациент " + allNames[i] + "-Возраст = " + allAges[i] + ",Болеет: " + illOrNo[i]);
            } else if (!allNames[i].equals(searchName) && i == 2) {
                System.out.println("Нет пациента с именем: " + searchName);
            }
        }
    }

    void searchByAge(String[] allNames, int[] allAges, Boolean[] illOrNo) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Возраст искомого пациента: ");
        int searchAge = scanner.nextInt();
        for (int i = 0; i < 3; i++) {
            if (allAges[i] == searchAge) {
                System.out.println("Пациент " + allNames[i] + "-Возраст = " + allAges[i] + ",Болеет: " + illOrNo[i]);
            }else {
                System.out.println("Нет пациента с возрастом " + searchAge);
            }
            scanner.close();
        }
    }
}
