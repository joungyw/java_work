package org.example;


import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        ENUM_STUDY_DB enumStudyDb = new ENUM_STUDY_DB();
        enumStudyDb.insert();
        enumStudyDb.select();

        Scanner scan = new Scanner(System.in);

        System.out.println("수정하고 싶은 id");
        int temp = scan.nextInt();

        enumStudyDb.update(temp);
        enumStudyDb.select();


        System.out.println("삭제");
        temp = scan.nextInt();
        enumStudyDb.delete(temp);
        enumStudyDb.select();
    }
}
