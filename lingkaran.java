
package belajar_inheritance;


public class lingkaran extends BangunDatar {
    float r;
    
    
    @Override
   double luas(){ 
       double luas = (double) (Math.PI * r * r);
        System.out.println("Luas lingkaran: " + luas);
        return luas;
       
   }
    @Override
   double keliling(){
       double keliling = (double) (2 * Math.PI * r);
        System.out.println("Keliling Lingkaran: " + keliling);
        return keliling;
       
   }
    
}
