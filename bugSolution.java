public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
        }
        //The following print statement will print the last element of the array. 
        System.out.println(arr[arr.length -1]);
    }
}