import javax.imageio.plugins.tiff.FaxTIFFTagSet;
import java.lang.Math;
public class test48 {
    public static void main(String[] args){
        int r = 0;
        int range1 = 10; 
        int flag = 0 ;
        int[] a = new int[range1];

        for (int i = 0 ; i < range1 ; i++){
            r = (int)(Math.random()*range1)+1;
            a[i] = r ; 
            flag = flag + 1 ;
            System.out.println(flag + ": " + a[i]);
        }
    }
}
