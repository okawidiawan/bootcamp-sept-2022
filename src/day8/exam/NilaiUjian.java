package day8.exam;

public class NilaiUjian {

    public static void main(String[] args) {

        String[] names = {"Ardi", "Pian", "Robi"};
        double[][] marks = new double[3][4];

        marks[0][0] = 60.0;
        marks[0][1] = 70.0;
        marks[0][2] = 90.0;
        marks[0][3]
                = (0.35 * marks[0][0])
                + (0.45 * marks[0][1])
                + (0.2 * marks[0][2]);

        marks[1][0] = 80.0;
        marks[1][1] = 70.0;
        marks[1][2] = 90.0;
        marks[1][3]
                = (0.35 * marks[1][0])
                + (0.45 * marks[1][1])
                + (0.2 * marks[1][2]);

        marks[2][0] = 70.0;
        marks[2][1] = 60.0;
        marks[2][2] = 90.0;
        marks[2][3]
                = (0.35 * marks[2][0])
                + (0.45 * marks[2][1])
                + (0.2 * marks[2][2]);

        System.out.println("+--------+---------+---------+---------+-------------+");
        System.out.println("|  NAMA  |   UTS   |   UAS   |  TUGAS  | NILAI AKHIR |");
        System.out.println("+--------+---------+---------+---------+-------------+");

        for (int i = 0; i < names.length; i++) {
            System.out.print("|  " + names[i]);
            for (int j = 0; j <= marks.length; j++) {
                System.out.print("  |   " + marks[i][j]);
            }
            System.out.print("      |");
            System.out.println("");
        }
        System.out.println("+--------+---------+---------+---------+-------------+");
    }
}
