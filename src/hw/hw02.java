package hw;
import java.util.Scanner;
/*
 * Topic: 頛詨銝��迤�� N嚗���������摮��� N �甇Ｕ��
����:1 2 4 7 11 16 22 29��
�����:1 2 2 3 3 3 4 4 4 4 5 5 5 5 5...
 * Date: 2016/11/28
 * Author: 1050210XX �瘞豢�葦
 */
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner ( System.in ) ;
		int n = scn.nextInt ( ) ;
		int sum = 1 ;
		for ( int i = 0 ; i <= n ; i ++ ) {
			sum += i ;
			if ( sum < n ) {
				System.out.print ( sum + " " ) ;
	}	
}
		System.out.println ( ) ;
		for ( int i = 1 ; i <= n ; i ++ ) {
			for ( int j = 1 ; j <= i ; j ++ ) {	
				System.out.print ( i + " " ) ;
			}
		}
	}
}
