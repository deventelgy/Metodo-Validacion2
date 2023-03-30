public class Main {
    public static void main(String[] args)
    {
        int a=5;

        //int num[]=new int[]{2,3,4};
        int num[]=new int[3];

        //Invocamos el metodo
        metodoA(a); //Parametro real

        //El metodo no modifica la variable local
        System.out.println("La variable a sigue valiendo "+a);

        //Un objeto tiene una direccion de memoria que es esta
        System.out.println("Fuera del metodo, la direccion del array es "+num);

        /*
         * Invocamos el metodo, y le pasamos como parametro
         * la direccion del array
         * por paso de parametro por valor
         */
        rellenaArray(num);

        //Accedemos al contenido del array
        System.out.println("El primer valor de array es "+num[0]);

        System.out.println("El segundo valor de array es "+num[1]);

        System.out.println("El tercer valor de array es "+num[2]);
    }

    public static void metodoA(int a){ //Parametro formal
        //Modificamos el parametro pasado por valor
        a=15;
    }
    public static void rellenaArray(int num[]){
        System.out.println("Dentro del metodo, la direccion del array es "+num);
        //aqui modifica el a lo que apunta el array, pero la direccion es la misma
        for (int i=0;i<num.length;i++){
            num[i]=i;
        }
    }
}