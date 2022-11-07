public class Main {
    public static void main(String[] args) {
        System.out.println("Sueldo de Pepe");

        Cadete pepe = new Cadete();
        System.out.println(String.format("El sueldo total de el empleado es %f",
                pepe.calcularSueldoTotal(0)
                ));
    }
}
