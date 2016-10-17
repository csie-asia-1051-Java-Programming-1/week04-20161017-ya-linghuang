package ex;
/*
 * Topic: 寫一個程式讓使用者輸入兩個正整數 n 與 m，然後顯示n x m 的乘法表，顯示完後問使用者是否繼續(Y/n) ，Y 可以重新輸入 n 則結束程式。
 * Date: 2016/10/17
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class ex02_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		while(true){
		System.out.println("請輸入兩正整數n與m，將顯示n*m的乘法表:: ");
		int n = scn.nextInt();
		int m = scn .nextInt();
		for(int i=1; i<=n; i++ ){
			for(int a = 1;a<=m;a++){
				System.out.println(i+"*"+a+"="+(i*a));
			}
		}
		System.out.println("請問是否要繼續(Y/n):");
		char check =scn.next().charAt(0);
		if(check=='Y'||check=='y'){
			continue;
		}
		else if(check=='N'||check=='n'){
			break;
		}
		}
	}

}
