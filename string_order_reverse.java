class String_order_reverse{
    public static void main(String args[]){
    String str[] = "Hai every one".split(" ");
    String lastStr="";
        for(int i = str.length-1; i>= 0 ;i--){
            lastStr += str[i]+" ";
        }
        System.out.println(lastStrr);
    }
}