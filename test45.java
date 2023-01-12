import javax.imageio.plugins.tiff.FaxTIFFTagSet;

public class test45 {
    public static void main(String[] args){
        int[] a = {7,5,4,9,8,1,2};
        int midle = 0;
        int max = 0;
        int low = 0;
        int b =0;
        float   midl = 0;
        max = a[0];
        low = a[0];
        for (int c = a.length-1; c >=0 ; c = c-1){ // 從數字2往前遞減
            for(int i = 0; i<a.length; i++){ // 從數字7往後遞減

                if(a[i]>a[c]){ //當前面數來 大於 後面數來執行下列
                    b = a[i]; // 用 B 儲存 前面數來 的陣列值
                    a[i] = a[c];//前後互換 陣列值
                    a[c] = b;  //將B取代 後面數來 的陣列值
                }
            }
        }

        int[] g = a;
        for(int i = 0; i<g.length; i++){
            if(g[i] > max){
                max = g[i];
                System.out.println(max);
            }
            if(g[i] < low){
                low = g[i];
            }
            midl = midl + g[i];
        }
            System.out.println("max = " + max );
            System.out.println("low = " + low );
            System.out.println("aaaa = " + (midl/7));

        
    }
}