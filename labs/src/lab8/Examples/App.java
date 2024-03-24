package lab8.Examples;

import java.util.List;
import java.util.Optional;

class App{
	public static void main(String[] args){
		System.out.println("Hello, Welcome to Optional");
		 List<Integer> nums = List.of(1,2,3,4);
		// List<Integer> nums = List.of();
		// var result = findMax(nums);
		// System.out.printf("The max of %s is %s",nums,result.toString());
		
		var optResult = findMax2(nums);
		if(optResult.isPresent()){
			System.out.printf("The max of %s is %s",nums, optResult.get().toString());
		}else{
			System.out.printf("The max of %s isNOT FOUND",nums);
		}
		
		// same as before
		optResult.ifPresentOrElse(
		(max)->System.out.printf("The max of %s is %s",nums, max.toString()),
		()->System.out.printf("The max of %s isNOT FOUND",nums)
		);
	}
	
	private static Integer findMax(List<Integer> nums){
		if(nums.isEmpty())return null;
		var max = nums.get(0);
		for(int i = 1; i < nums.size(); i++){
			if(nums.get(i) > max){
				max = nums.get(i);
			}
		}
		return max;
	}
	
	private static Optional<Integer> findMax2(List<Integer> nums){
	if(nums.isEmpty()){return Optional.empty();}
		var max = nums.get(0);
		for(int i = 1; i < nums.size(); i++){
			if(nums.get(i) > max){
				max = nums.get(i);
			}
		}
		return Optional.of(max);
	}
}