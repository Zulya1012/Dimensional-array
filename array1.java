public class array1{
	public static void main(String[] arg){
		int[] b= {1,2,3};
		int[][] c= {{1,2,3},
			    {4,5,6},
			    {7,8,9}};
		System.out.println(c[2][2]);
		System.out.println(c[1][0]);
		System.out.println(c[0][1]);
		
		int[] aa=new int[5];
		
		String[][] str=new String[2][3];
		str[0][1]="Good morning!";
		System.out.println(str[0][1]);
	}
}