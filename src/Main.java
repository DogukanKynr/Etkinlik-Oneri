import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = 0;

        System.out.print("Hava sıcaklığını giriniz : ");
        int heat = input.nextInt();

        if (heat < 5){
            a = 1;
        }
        else if ((heat >= 5) && (heat < 15)) {
            a = 2;
        }
        else if ((heat >= 15) && (heat < 25)) {
            a = 3;
        }
        else if (heat >= 25){
            a = 4;
        }

        switch(a){
            case 1:
                System.out.println("Kayak yapabilirsiniz.");
                break;
            case 2:
                System.out.println("Sinemaya gidebilirsiniz.");
                break;
            case 3:
                System.out.println("Piknik yapabilirsiniz.");
                break;
            case 4:
                System.out.println("Yüzmeye gidebilirsiniz");
                break;
        }
    }
}