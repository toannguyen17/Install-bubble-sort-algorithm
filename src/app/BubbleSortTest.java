package app;

public class BubbleSortTest {
	public static void BubbleSort(int[] list){
		int sortTo = list.length - 1;
		boolean recursive = false;
		for(int i = 0; i < sortTo; i++){
			int currentMap = list[i];
			int indexNext  = i+1;
			int currentMapNext = list[indexNext];

			if (currentMap > currentMapNext){
				list[i]         = currentMapNext;
				list[indexNext] = currentMap;
				recursive = true;
			}
		}
		if(recursive == true){
			BubbleSort(list);
		}
	}

	public static void main(String[] args) {
		int[] list = {99,98,33,17,2,3,36,9,6,8};

		BubbleSort(list);

		for(int item: list){
			System.out.print(item + " ");
		}
	}
}
