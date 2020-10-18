package pentlaForDemo;

public class PentlaForDemo {
    public static void main(String[] args) {

        int n=10;
        int suma =0;
        for (int i = 1; i <=n ; i++) {
            suma = suma+i;
            System.out.println(suma);

        }
        System.out.println("Suma liczb to " + suma);
        if (n% 2 ==0) {
            suma = (n/2)*(n+1);
        }   else {
            suma = (n+1)/2*n;
        }
        suma = (n+1)*n/2;
        System.out.println(" Drugi sposób na podanie sumy = " + suma);
    }
}
