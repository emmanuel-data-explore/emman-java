import java.util.Random;
    class whilerand{
        public static void main(String args[]){
            Random rand = new Random();
            int num =0;
            while(num!=5){
                num = rand.nextInt(11);
                System.out.println(num);
            }
        }
    }
//mostly for  loop use panuvoo not while for these case