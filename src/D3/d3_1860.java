package D3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class d3_1860 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ys0star\\eclipse-workspace\\SWexpert\\src\\D3/input.txt"));
        //BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=null;
		int T;
		T=Integer.parseInt(br.readLine());
		
		int[][] grape = {{1,1,1},{2,1,2},{3,2,1},{4,1,3},
				{5,2,2},{6,3,1},{7,1,4},{8,2,3},{9,3,2},
				{10,4,1},{12,2,4},{13,3,3},{14,4,2},
				{18,3,4},{19,4,3},{25,4,4}};
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int result=0;
			
            //input
			st = new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken());
			int q = Integer.parseInt(st.nextToken());
            
			//calculate
			
            //output
            if(flag == true)
                System.out.println("#"+test_case+" Possible");
            else
                System.out.println("#"+test_case+" Impossible");
		}
	}
	/*
	public static int[] partition(int[] arr, int left, int right) {
		if(left>=right)
			return arr;
		int middle = (right+left)/2;
		arr = partition(arr, left, middle);
		arr = partition(arr, middle+1, right);
		arr = MergeSort(arr, left, middle, right);
		return arr;
	}
	public static int[] MergeSort(int[] arr, int left, int middle, int right) {
		int[] temp = arr.clone();
		
		int lIndex=left, rIndex=middle+1;
		for(int i=left; i<=right; i++) {
			if(rIndex >= 0 && lIndex >= 0) {
				if(arr[lIndex]<arr[rIndex]) {//left
					temp[i] = arr[lIndex];
					if(lIndex == middle)	lIndex=-1;
					else					lIndex++;
				} else {//right
					temp[i] = arr[rIndex];
					if(rIndex == right)		rIndex=-1;
					else					rIndex++;
				}
			} else if(rIndex == -1) {
				temp[i] = arr[lIndex];
				lIndex ++;
			} else if(lIndex == -1) {
				temp[i] = arr[rIndex];
				rIndex ++;
			}
		}
		return temp;
	}*/
}
