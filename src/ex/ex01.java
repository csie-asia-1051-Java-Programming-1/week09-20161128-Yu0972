﻿package ex;
import java.util.Scanner;
import java.util.Random;
/*
 * Topic: 請設計一樂透亂數選號程式，由 1~42 中選出 6個不重覆的數字組合並輸出。 請使用已下方式,(setSeed就是設定亂數種子，可以使每次跑出的亂數序列，都會是一樣的)
 例如:輸入 23323456會得到 39  17  32  13  41  15 
	Random randnum = new Random();
	randnum.setSeed(23323456)
 * Date: 2016/11/28
 * Author: 105021045 郭毓呈
 */

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner ( System.in ) ;
		int n = scn.nextInt ( ) ;
		Random rnd = new Random ( ) ;
		rnd.setSeed( n ) ;
		for ( int a = 0 ; a <= 6 ; a ++ ) {
			int data [ ] = new int [ a ] ;
			data [ a ] = rnd.nextInt ( 42 ) + 1 ; 
		}
	}
}
