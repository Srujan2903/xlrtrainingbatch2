public class test01 {
    public static void main(String[] args){
        int n = 10;
        for(int i = 0;i <= n;i++){
            if (i==5 || i==7){
                continue;
            }
            System.out.println(i);
        }
    }
}
