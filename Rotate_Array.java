public class Rotate_Array{
    public static void main(String[]args){
        int [] arr = {10,20,30,40,50,60,70};
        int k =3;
        Rotate(arr,k);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Rotate(int[] arr,int k) {
        int n =arr.length;
        k=k%n;
        for(int j=1;j<=k;j++){
        int val=arr[n-1];
        for(int i=n-2;i>=0;i--){
            arr[i+1]=arr[i];

        }
        arr[0]=val;
    }
        
    }
}