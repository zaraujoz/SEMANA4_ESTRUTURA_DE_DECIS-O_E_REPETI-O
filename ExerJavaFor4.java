public class ExerJavaFor4{
    public void exer4(){
        for(int i = 1; i <=10; i++){
        int num = i;

        for(int j = (num-1); j>=1; j--){
        num *= j;
    }
        System.out.println("Fatorial de "+ i+" = "+num);
}
}
}