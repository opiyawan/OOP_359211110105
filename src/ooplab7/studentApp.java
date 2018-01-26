package ooplab7;

import java.util.Scanner;

public class studentApp {
    public static void main (String[] args){
        //create object as Student
        studont s1 = new studont();
        s1.setId("0001");
        s1.setName("Boy Saiyai");
        s1.setPid("1111111111111");
        s1.setAddress("11/11 T.Thamyai A.Thungsong");

        System.out.print(s1.toString());

        studont s2 = new studont("0002",
                "Girl Saiyai",
                "2222222222222",
                "22/22 T.Thawang A.muang");
        System.out.println(s2.toString());
        studont s3 = new studont();
        s3 = inputData (s3);
        System.out.println(s3.toString());

    }//main

    private static studont inputData(studont s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your student info: ");
        System.out.println("Student ID: ");
        s.setId(scanner.nextLine());
        System.out.print("Name: ");
        s.setName(scanner.nextLine());
        System.out.print("Person ID: ");
        s.setPid(scanner.nextLine());
        System.out.print("Address: ");
        s.setAddress(scanner.nextLine());
        return s;


    }//inputData
}//class
