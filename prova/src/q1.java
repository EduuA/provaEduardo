import java.util.*;

public class q1 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int number = 0;

        System.out.println("Informe um número: ");
        number = sc.nextInt();

        System.out.println("Somatório de "+ number +" é: " + somatorio(number));
    }

        public static int somatorio (int number){
            if( number==1){
                return 1;
            }

            return number + somatorio(number-1);
        }

    }

