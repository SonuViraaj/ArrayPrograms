package Arrays;

public class SelectionSort_Prac {
    public static void main(String[] args) {
        int[] a={38,45,52,6,4,78,23,13};


        int temp=0, min;
        for(int i=0; i<a.length; i++){
            min=i;
            for(int j=i+1;j<a.length;j++){

                if(a[j ]< a[min]){
                    min=j;
                }
            }
            temp=a[i];
            a[i]=a[min];
            a[min]= temp;
        }
        for(int i=0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
