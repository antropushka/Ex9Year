package com.company;

public class Main { // задать 3 числа - день, месяц, год. Вывести на экран в виде трех чисел дату соелущего дня.
                        // можно как-то менее громозко сделать?

    public static void main(String[] args) {
            int dd = 99;
            int mm = 05;
            int yyyy = 2019;

            if (dd>= 1 && dd < 30 && (mm == 4 || mm == 6 ||mm == 9 ||mm == 11)) {
                dd++;
                System.out.println(dd + " " + mm + " " + " " + yyyy);
            } else if ( dd == 30 && (mm == 4 || mm == 6 || mm == 9 || mm == 11) ) {
                dd = 1;
                mm++;
                System.out.println(dd + " " + mm + " " + " " + yyyy);
            } else if (dd>= 1 && dd <= 30 && (mm == 1 || mm == 3 ||mm == 5 ||mm == 7 || mm == 8 || mm == 10
                    || mm == 12)) {
                dd++;
                System.out.println(dd + " " + mm + " " + " " + yyyy);
            } else if (dd == 31 && (mm == 1 || mm == 3 ||mm == 5 ||mm == 7 || mm == 8 || mm == 10)) {
                dd = 1;
                mm++;
                System.out.println(dd + " " + mm + " " + " " + yyyy);
            } else if (dd == 31 && mm == 12) {
                dd = 1;
                mm = 1;
                yyyy++;
                System.out.println(dd + " " + mm + " " + " " + yyyy);
            } else if ((dd >=1 && dd < 28 && mm == 2) || (dd == 28 && mm == 2 && yyyy%4 == 0 )) {
                dd++;
                System.out.println(dd + " " + mm + " " + " " + yyyy);
            } else if ( dd == 28 && mm == 2 && yyyy%4 != 0 || dd == 29 && mm == 2 && yyyy%4 == 0 ) {
                dd = 1;
                mm++;
                System.out.println(dd + " " + mm + " " + " " + yyyy);
            } else {
                System.out.println("Такой даты не существует!!!");
            }
        }

}
