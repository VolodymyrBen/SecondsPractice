import java.util.Arrays;

public class Fibonacci {

    public static void main(String[] args) {

        int firstNum=0;
        int secondNum=1;

        int []numb = {7,2,9,0,5,6,8};

        for(int i=0; i<numb.length; i++) {
            for(int k=i+1;k<numb.length; k++) {
                if(numb[i]>numb[k]) {
                    numb[k]=numb[i];
                }
                numb[i]=numb[i];
            }
        }
        System.out.println(Arrays.toString(numb));
        System.out.println("Vovan  vse  byde  ok");
        System.out.println("123");
    }

}


