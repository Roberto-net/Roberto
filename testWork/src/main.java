
public class Main {

	
	public static void main(String[] args) {
		int [] o = {124,22,66,46,21,-56};
		int av;
		av = average (o);
		System.out.println(av);
		float [] t = {25.2f, 11.2f, 250.2f, 5.7f, 56.5f, 2.4f};
		float m = minX(t);
		System.out.println(m);
		int [] u = {2,3,4,5,6,7};
		boolean r = isSorted(u);
		System.out.println(r);
		
		
	}
	
		
	public static int average (int []sum) {
			int j = 0;
			for(int i = 0; i<sum.length;i++){
				j=j+ sum[i];
			}
			j=j/sum.length;
			return j;
			}
	public static float minX (float []el){
        float min = el[0];
        for(int i = 0; i < el.length; i ++){
            if(el[i] < min){
                min = el[i];
            }
        }
        return min;
    } 
	public static boolean isSorted (int []k) {
		boolean y = false; 
 		for(int i = 1; i<k.length;i++){
			if ( k[i] > k[i--]){
				//if (i == k.length)
				//y = true;
				}
			} return y;
		} 
}

	



	


