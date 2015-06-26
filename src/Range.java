public class Range {
	// 일반 오름차순 정렬
	void ascending_sort(int[] array) {
		int len = array.length;
		for (int i = 0; i < len - 1; ++i) {
			for (int j = i + 1; j < len; ++j) {
				if (array[i] > array[j]) {
					array[i] ^= array[j];
					array[j] ^= array[i];
					array[i] ^= array[j];
				}
			}
		}
	}
	
	// 중복제거 오름차순 정렬
	void DeDuplication_ascending_sort(int[] array){
		int[] result = new int[array.length];
		
		for(int i=0; i<array.length; ++i){
			for(int j=0; j<result.length; ++j){
				if(array[i]==result[j]){
					break;
				}
			}
		}
//		if(count!=0){
//			for(int i=0; i<len-count; ++i){
//				array[i] = array[i+count];
//			}			
//		}		
	}
	
	void print(int[] array){
		for(int i=0; i<array.length; ++i){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		Range r = new Range();
		int[] array = {5,7,8,1,1,5,8,10,3,2};
		r.ascending_sort(array);
		r.print(array);
		
		int[] array2 = {5,7,8,1,1,5,8,10,3,2};
		
		r.DeDuplication_ascending_sort(array);
		r.print(array2);
	}
}
