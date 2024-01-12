import java.util.Arrays;

public class Ex04 {
	/*
	 * {100,90,60,40,120} 
	 * 
	 * 1 요소 중 재일 큰수
	 * 2 요소 중 재일 작은 수
	 * 3 내림차순
	 * 4 오름차순
	 * 
	 */
	public static void main(String[] args) {
		int[] arr = {100,90,60,40,120};
		
		
		for( int i = 0; i < 5-i; i++){
			for (int j = 0 ; j<5-j; j++){
				if(arr[i] >arr[j]) {
					int temp = arr[i];
					arr[j]= arr[j +1];
					arr[j + 1]= temp;
				}

			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}
}
