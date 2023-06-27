package p01;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		Random r = new Random();
		int i= r.nextInt(10)+1;
		System.out.println(i);
		int i1= r.nextInt(10)+1;
		System.out.println(i1);
		int i2= r.nextInt(10)+1;
		System.out.println(i2);
		
		
		int[] nums = new int[3];
		nums[0]= r.nextInt(10)+1;
		nums[1]= r.nextInt(10)+1;
		nums[2]= r.nextInt(10)+1;
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		
		
	}
}
