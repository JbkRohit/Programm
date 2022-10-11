package Pattern;

public class Reverse {
public static void main(String[] args) {
	int y=7386;
	int r=0;
	int n=1;
	while(y>0){
	 n=y%10;
		r=(r*10)+n;
		y=y/10;
	}	System.out.print(r);
		
	
}
}
