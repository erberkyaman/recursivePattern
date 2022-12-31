import java.util.Scanner;
public class recursivePattern {
    static int Pattern(int a, int b, int c) {
        if (a>0){
            System.out.print(a+ " ");
            return Pattern(a-5,b-5,c);
        }else {
            System.out.print(b+" ");
            if (b!=c){
               return Pattern(a,b+5,c);
            }
        }

    return 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1;

        System.out.print("Pozitif Tam Sayı Giriniz: ");
        n1 = input.nextInt();
        if (n1==0 || n1<0){
            System.out.print("Lütfen Pozitif Tam Sayı Giriniz!");

        }
        else {
            Pattern(n1,n1,n1);
        }



    }
}
