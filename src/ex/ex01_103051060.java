﻿package ex;
/*
 * Topic: 寫一個程式讓使多個正整數(包含0)直到使用者輸入-1 時停止，同時要顯示這些數字 總合 及 平均。
 * Date: 2016/10/17
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class ex01_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入正整數，輸入-1停止，將顯示總合及平均: ");
		int sum=0;
		int mean=0;
		while(true)
		{
			int a = scn.nextInt();
			if(a==-1){
				break;
			}
			else if(a<0){
				continue;
			}
			else if(a!=-1){
			sum+=a;
			mean+=1;
			}
					}
		System.out.println("總數為: "+sum+"\t平均為: "+(float)sum/mean);
	}

}
