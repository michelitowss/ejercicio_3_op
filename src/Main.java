public class Main {
    public static void main(String[] args)
    {
    suma(10,20,30);

    coche micoche = new coche();
    micoche.agpuertas();
    micoche.agpuertas();
        System.out.println(micoche.npuertas);

    }

    public static void suma(int a, int b, int c){
        int resultado;
        resultado = a + b + c;
        System.out.println(resultado);
    }
    static class coche{
        public int npuertas = 0;
        public void agpuertas(){
            this.npuertas++;
        }
    }

}
