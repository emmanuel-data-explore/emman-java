class eforloop{
    public static void main(String args[]){
        int num[] = {10, 20, 30, 40, 50};
        String dum [] = {"one","two","three","four"};
        for(int i=0; i<4; i++){
            System.out.println(num[i]);
        }
        //advanced for loop
        for(int var:num){
            System.out.println(var);
        }
        for(String vari:dum){
            System.out.println(vari);
        }
}}