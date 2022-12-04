public class Main {
    public static void main(String[] args){

     System.out.println("estudiante " + args[0]);
     System.out.println("matriculado en " + args[1] + " modulos");
     System.out.println("estudia " + args[2] + " horas al dia");
    }
}
private static String veredicto(String valor1, String valor2) {


El método realiza la comprobación. Una posible solución sería la siguiente.

if (valor1.equals(valor2)) {
    return "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
}
if (Integer.valueOf(valor1) < Integer.valueOf(valor2)){
    return "Poco tiempo de estudio. Debes dedicar más tiempo.";
}
return "Ideal. Trabajas los contenidos en casa.";

}

=======
//jorge altet zaragoza
