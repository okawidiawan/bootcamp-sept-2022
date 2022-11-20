package day8.exam;

import java.util.Scanner;

public class HitungVolume {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int counterBalok = 0;
        int counterBola = 0;
        int counterKubus = 0;

        double[] volumeList = new double[30];
        double[] volumeBalokList = new double[30];
        double[] volumeBolaList = new double[30];
        double[] volumeKubusList = new double[30];

        double values = 0;
        double valuesBalok = 0;
        double valuesBola = 0;
        double valuesKubus = 0;

        int selectedMenu;
        do {
            System.out.println("MENU");
            System.out.println("1. Balok");
            System.out.println("2. Bola");
            System.out.println("3. Kubus");
            System.out.println("4. Nilai Rata-Rata");
            System.out.println("5. EXIT");
            System.out.print("Pilih Menu : ");
            selectedMenu = input.nextInt();
            input.nextLine();
            System.out.println("");

            switch (selectedMenu) {
                case 1 -> {
                    Balok vBalok = new Balok();
                    double volumeBalok = vBalok.inputValue(input);
                    values += volumeBalok;
                    valuesBalok += volumeBalok;
                    volumeList[counter] = volumeBalok;
                    volumeBalokList[counterBalok] = volumeBalok;
                    counterBalok++;
                    counter++;
                }
                case 2 -> {
                    Bola vBola = new Bola();
                    double volumeBola = vBola.inputValue(input);
                    values += volumeBola;
                    valuesBola += volumeBola;
                    volumeList[counter] = volumeBola;
                    volumeBolaList[counterBola] = volumeBola;
                    counterBola++;
                    counter++;
                }
                case 3 -> {
                    Kubus vKubus = new Kubus();
                    double volumeKubus = vKubus.inputValue(input);
                    values += volumeKubus;
                    valuesKubus += volumeKubus;
                    volumeList[counter] = volumeKubus;
                    volumeKubusList[counterKubus] = volumeKubus;
                    counterKubus++;
                    counter++;
                }
                case 4 -> {
                    double result = values / counter;
                    System.out.print("Array of All Volume : ");
                    for (int i = 0; i < volumeList.length; i++) {
                        if (volumeList[i] != 0) {
                            System.out.print("[" + volumeList[i] + "] ");
                        }
                    }   System.out.println("");
                    System.out.println("Total : " + values);
                    System.out.println("Average : " + result);
                    System.out.println("");
                    
                    // PRINT BALOK VOLUME
                    double resultBalok = valuesBalok / counterBalok;
                    System.out.print("Array of Volume Balok : ");
                    for (int i = 0; i < volumeBalokList.length; i++) {
                        if (volumeBalokList[i] != 0) {
                            System.out.print("[" + volumeBalokList[i] + "] ");
                        }
                    }   System.out.println("");
                    System.out.println("Total : " + valuesBalok);
                    System.out.println("Average : " + resultBalok);
                    System.out.println("");
                    
                    // PRINT BOLA VOLUME
                    double resultBola = valuesBola / counterBola;
                    System.out.print("Array of Volume Bola : ");
                    for (int i = 0; i < volumeBolaList.length; i++) {
                        if (volumeBolaList[i] != 0) {
                            System.out.print("[" + volumeBolaList[i] + "] ");
                        }
                    }   System.out.println("");
                    System.out.println("Total : " + valuesBola);
                    System.out.println("Average : " + resultBola);
                    System.out.println("");
                    
                    // PRINT KUBUS VOLUME
                    double resultKubus = valuesKubus / counterKubus;
                    System.out.print("Array of Volume Kubus : ");
                    for (int i = 0; i < volumeKubusList.length; i++) {
                        if (volumeKubusList[i] != 0) {
                            System.out.print("[" + volumeKubusList[i] + "] ");
                        }
                    }   System.out.println("");
                    System.out.println("Total : " + valuesKubus);
                    System.out.println("Average : " + resultKubus);
                    System.out.println("");
                }
                default -> {
                }
            }
            System.out.println("");

        } while (selectedMenu != 5);

    }

}
