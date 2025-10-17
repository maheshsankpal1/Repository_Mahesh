package Test;

import java.util.Arrays;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

public class ReverseArray {
	public static void reverse(int[] arr) {
		int left =0;
		int right = arr.length-1;
		while (left < right){
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		
		}
	}
	public static void main(String[] args) {
		int[] arr = {11, 22, 33, 44, 55};
		reverse(arr);
		System.out.println("Reversed array" + Arrays.toString(arr));
	}

}
