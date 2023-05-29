import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int demsc=0;
        int demsl=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so luong mang");
        n= scanner.nextInt();
        int phantu[]= new int[n];
        for (int i=0;i<n;i++){
            System.out.println("nhap phan tu:"+i);
            phantu[i]= scanner.nextInt();
        }
        for (int i=0;i<n;i++){
            if (phantu[i]%2==0){
                demsc++;
            }
            else {
                demsl++;
            }
        }
        System.out.println("co "+demsc+"so chan");
        System.out.println("co"+demsl+"so le");
    }
}