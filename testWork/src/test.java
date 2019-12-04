public class test {
    public static void main(String[] args){
        float [] loc = {25.2f, 11.2f, 250.2f, 5.7f, 56.5f, -2.4f};
        float min = loc[0];
        for(int i = 0; i != loc.length; i ++){
            if(loc[i] < min){
                min = loc[i];
            }
        }
        System.out.println(min);
    } 
}
