  //counting even number from 1-10
  class oddcount{
    public static void main(String args[])
{
     int oddcount=0;
     int evencount=0;
    for(int i=1; i<=10; i=i+1)
    {
        if(i%2==0){
        evencount=evencount+1;
        }
        else{
            oddcount=oddcount+1;
        }
    }
    System.out.println(oddcount);
    System.out.println(evencount);
}
}