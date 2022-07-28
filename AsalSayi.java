public class AsalSayi {
    public static void main(String[] args) {

        for(int i=1; i<100; i++){
            int bolen=0;
            for (int a=1; a<=i; a++){
                if (i % a == 0){
                    bolen++;
                }
            }
            if (bolen == 2) {
                System.out.print(i +"-");
            }
        }

    }
}
