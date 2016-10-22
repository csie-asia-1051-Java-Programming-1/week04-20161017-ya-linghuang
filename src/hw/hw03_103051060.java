package hw;
/*
程式個程式讓使用者連續輸入整數 (正數、負數及零)，直到使用者輸入 999 時停止，
然後顯示正數有多少個，0 有幾個，負數總共有幾個，
使用者可以重覆執行直到使用者輸入n
 * Date: 2016/10/17
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class hw03_103051060 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while(true){
		int x1= 0;
		int x2 = 0;
		int x3 = 0;
		System.out.println("請輸入連續整數 (正數、負數及零，輸入999時停止): ");
		while(true){
			int x = scn.nextInt();
			if(x==999){break;}
			else if(x>0){x1+=1;}
			else if(x==0){x2+=1;}
			else if(x<0){x3+=1;}
		}
		System.out.print("正數有: "+x1+"個\n"+"0有: "+x2+"個\n"+"負數有: "+x3+"個\n");
		System.out.println("需要繼續執行嗎?(Y/n)");
		char check = scn.next().charAt(0);
		if(check=='n'||check=='N'){break;}
	}
	}

}
