import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("nhập số bạn muốn : ");
        int number = new Scanner(System.in).nextInt();
        if (number<2)
            System.out.println("Bạn nhập ko phải là số nguyên");
        else {
            int i = 2;
            boolean check = true;
            while (i<number){
                if (number % i == 0)
                    check = false;
                break;
            }
            i++;
            if (check)
                System.out.println("bạn nhập là số nguyên ");
            else
                System.out.println(" ko phải số nguyên ");
        }
    }
}
