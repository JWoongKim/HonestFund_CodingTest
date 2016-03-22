package calculation;

import java.util.Scanner;

/**
 * 
 * @author JIN
 *
 */

public class LoanCalculation {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        /**
         * 
         * money = 대출원금, profit = 연리, month = 대출기간
         * interest = 이자, result = 상환금
         * 
         */
        double money, profit, month, calc1, calc2, interest, result;

        System.out.println("========== 원리금균등상환 계산기 ==========");
        
        System.out.print("대출원금 : ");
        money = scan.nextDouble();

        System.out.print("대출금리(연리) : ");
        profit = (scan.nextDouble() / 100);

        System.out.print("대출기간(개월수) : ");
        month = scan.nextDouble();

        //calc1 = 대출원금 * 연리
        calc1 = money * (profit / 12);
        //calc2 = (1 + 연리)^대출기간(개월수)
        calc2 = Math.pow(1 + profit / 12, month);
        // 원리금균등상환 방식을 계산
        result = Math.round((calc1 * calc2) / (calc2 - 1));
        
        for(int i = 1; i < month + 1; i++){
        	interest = Math.round((money * profit) / 12);
            System.out.print(i + "개월 이자 : " + interest + ", ");
            System.out.print(i + "개월 원금 : " + Math.round(result - interest) + ", ");
            System.out.print("상환금(원금 + 이자) : " + result + ", ");
            if(i == 1) {
            	money = money + interest;
            	System.out.println("잔금 : " + Math.round(money - result));
            	money = money - result;
            }
            else {
            	System.out.println("잔금 : " + Math.round((money - result) + interest));
            	money = (money - result) + interest;
            }
        }
    }
}
