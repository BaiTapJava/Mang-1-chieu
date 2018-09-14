import java.util.Scanner;

public class Mang {
    public static void main(String[] args) {
        mang();
    }
    private static void mang() {
        String [] students = {"Thinh","Luffy","Anh Tung", "Hoang","Quan"};

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so sinh vien: ");
        String input = sc.nextLine();

        //Duyet mang

        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input)) {
                System.out.println("Position of the students in the list " + input + " is: " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist)
            System.out.println("Not found " + input + " in the list.");
    }
}
