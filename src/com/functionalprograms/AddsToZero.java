package com.functionalprograms;

import java.util.Scanner;

public class AddsToZero {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n = scan.nextInt();
		int a[]=new int[n];
		int count=0;
		for(int i=0;i<n;i++) {
			System.out.print("Enter array value at index "+i+" : ");
			a[i]=scan.nextInt();
		}
		for(int i=0;i<a.length-2;i++) {
			for(int j=i+1;j<a.length-1;j++) {
				for(int k=j+1;k<a.length;k++) {
					if(a[i]+a[j]+a[k]==0) {
						System.out.println("distinct triplet : "+a[i]+","+a[j]+","+a[k]);
						count++;
						
					}
				}
			}
			
		}
		System.out.println("no of distinct triplets : "+count);
	}

}
