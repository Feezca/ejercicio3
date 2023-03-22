public class Main {
    public static void main(String[] args) {
        var resultado = suma(22,45,36);
        
        automovil coche= new automovil();
        coche.agregarPuertas();
        System.out.println(coche.puertas);

        System.out.println(resultado);
    }

    public static int suma(int a, int b, int c){
        return a+b+c;
    }
}
class automovil{
    public int puertas = 4;

    public void agregarPuertas(){
        this.puertas++;
    }
}