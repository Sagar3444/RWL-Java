class Arraydemo {  
    public static void main(String[] args) {  
  
        int [] arr = new int [] {5, 4, 3, 10, 6};   
        int min = arr[0];   
        for (int i = 0; i < arr.length; i++) {   
           if(arr[i] < min)  
               min = arr[i];  
        }  
        System.out.println("Small Number: " + min);  
    }  
}  	
	

	
	
	