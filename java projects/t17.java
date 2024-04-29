class ArrayDemo{
    public static void main(String[] args) {
        int arr[]={1,2,24,23,65,88,91,31};
        int s,l,i;
        s=l=arr[0];
        for(i=0;i<8;++i){
            if (arr[i]<s){
                s=arr[i];
            }
            if (arr[i]>l){
                l=arr[i];
            }
        }
        System.out.println("small: "+s+ " large:" +l);
    }
    
}
