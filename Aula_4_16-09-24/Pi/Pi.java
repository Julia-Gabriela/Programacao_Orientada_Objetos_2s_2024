package Pi;

public class Pi {
    
        public static void main(String[] args) {
            double pi = 0.0;
            int sinal = 1;  
            double denominador = 1.0;  
            int termosParaPi = 0;  
    
           
            for (int i = 0; i < 200000; i++) {
                pi += sinal * (4.0 / denominador);  
                sinal *= -1;  
                denominador += 2.0;  
    
               
                if (termosParaPi == 0 && String.format("%.6f", pi).equals("3.141590")) {
                    termosParaPi = i + 1;
                }
    
                
                if (i % 50000 == 0) {
                    System.out.printf("Apos %d termos, pi e aproximadamente %.10f%n", i, pi);
                }
            }
    
            System.out.printf("%nAproximacao final de pi apos 200.000 termos: %.10f%n", pi);
            System.out.printf("Numero de termos para chegar a 3.14159: %d%n", termosParaPi);
        }
    }

