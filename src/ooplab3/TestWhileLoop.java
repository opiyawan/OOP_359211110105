package ooplab3;

public class TestWhileLoop {
    public static void main(String[] args) {
        //while
        int i = 1;
        while (i<=10){
            System.out.println(i+" ");
            i++;
        }//while
//        dowhile
        System.out.println();
        int j = 1;
        do {
            if (j%3==0&&j%5==0)
                System.out.println(j+" ");
        }while (++j<=100);

    }




}//class










