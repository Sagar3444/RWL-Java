class Multiple{

	public int multiplyNumbers(int a, int b){
	int multi = a * b;
	return multi;
}

	public static void main(String[] args){
	
	int a=15 , b=35;

	Multiple obj = new Multiple();
	
	int Answer= obj. multiplyNumbers(a,b);

	System.out.println("Product is:"+ Answer);

}

}
