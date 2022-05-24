package qsp;

public class Usingforeach {

	public static void main(String[] args) throws InterruptedException 
	{
	int[] arr={1,2,3,4,5};
	for (int i : arr) 
	{
		System.out.println(i);
		Thread.sleep(2000);
	}

	}

}
