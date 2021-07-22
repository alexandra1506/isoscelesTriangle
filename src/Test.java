import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {

    public static void main(String[] args) throws Exception {
        // вывести равнобедренный треугольник
        for(int i = 1; i <= 10; i++){
            int row = 1;
            while(row <= i){
                System.out.print(8);
                row++;
            }
            System.out.println();
        }

    }
}

