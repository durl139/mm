
public class q0506 {

	public static void main(String[] args) {

		 int[] a = {60, 70, 40, 80, 90};

	        for(int i = 0; i < a.length-1; i++){
	            for(int j = i+1; j < a.length; j++){
	                if(a[j] > a[i]){
	                    int num = a[i];
	                    a[i] = a[j];
	                    a[j] = num;
	                }
	            }
	        }

	        for(int i = 0; i < a.length; i++){
	            System.out.println((i + 1) + "位の人の得点は" + a[i] + "点です。");
	        }
	    }
	}
//http://www.creative-forest.com/java/java_intro/array/application/application.html
