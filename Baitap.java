package buoi2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Baitap {
    public static void main(String[] args) {
//        System.out.println(printDateTime());
//        System.out.println(printName());
//        System.out.println(printCountrySide());
        printOnetoTen();
//        logical AND OR NOT
        int age = 10;
//        khi dung AND: nếu vế trái trả ra false thì không chạy vế phải
        if( age <=18 || age >=15) {
            System.out.println("Toi hoc cap 3");
        }

        String noiSinh = "Ha Noi";
        if("Ha Noi".equals(noiSinh) && 15 >= age && 18 <= age){
            System.out.println("Toi hoc cap 3 o Ha Noi");
        }

//        NOT
        boolean isTrue = true;
        System.out.println(!isTrue);

//        OR
        char gender = 'f';
        int marrieAge = 18;
        if('f' == gender && 18 >= marrieAge){
            System.out.println("du tuoi");
        }
        if('m' == gender && 20 >= marrieAge){
            System.out.println("du tuoi");
        }

        if(('m' == gender && 20 >= marrieAge)
                || ('f' == gender && 18 >= marrieAge)) {
            System.out.println("du tuoi");
        }


    }

    private static void printOnetoTen() {
        for (int i = 1; i < 10 + 1; i++) {
            System.out.println(i);
        }
    }

    static String printDateTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    static String printName() {
        String myName;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ho va ten: ");
        myName = scanner.nextLine();
        return "";
    }

    static String printCountrySide() {
        String countrySide;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap que quan: ");
        countrySide = scanner.nextLine();
        return countrySide;
    }


}
