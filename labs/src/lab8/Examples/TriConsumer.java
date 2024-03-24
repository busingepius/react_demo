package lab8.Examples;
@FunctionalInterface
interface TriConsumer<T, U, V>{
	void accept(T t, U u, V v);
}

class A{
	public static void main(){
		TriConsumer<Integer,Integer,Integer> print = (Integer value1, Integer value2, Integer value3) -> {
				System.out.printf("Int1 is %d\nInt2 is %d\nInt3 is %d",value1,value2,value3 );
			};
			
		print.accept(45,76,92);
		
	}
}