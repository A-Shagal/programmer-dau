import java.util.Scanner;
public class Praktikum {
    public static void main(String[] args) {
        Scanner inputYear = new Scanner(System.in);
        System.out.println("Введите год");
        int year = inputYear.nextInt();
        boolean a = LeapYearCalculator.isLeapYear(year);
        if(year <= 0 || year >= 10000){
            System.out.println("Ошибка, некорректный ввод");
        } else if (a) {
            System.out.println("12.09."+ year + ". Високосный год");
        } else System.out.println("13.09." + year + ".200 Обычный год");
    }
}
class LeapYearCalculator {
    public static boolean isLeapYear(int year){
        if(year <= 0 || year >= 10000 ){
            return false;
        } else if((year % 400 == 0 )){
            return true;
        }else if(year % 100 == 0){
            return false;
        }else return year % 4 == 0;
    }
}
