package G03;
/*Emma Bonilla 1ºA
* DNI: 47445317C*/
public class Main {
    public static void main(String[] args) {
        Hub H=new Hub();
        Contenedores Cont=new Contenedores(12,23,"Alemania",true,1,"Asda".toCharArray(),"asd".toCharArray(),"asda".toCharArray());
        /*H.PlanoHub();
        H.ApilarContenedor(Cont);
        H.ApilarContenedor(Cont);
        H.ApilarContenedor(Cont);
        H.PlanoHub();
        H.desapila_contenedor(0);
        H.PlanoHub();
        H.mostrar_datos(12);
        H.contenedores_pais("Alemania");*/
        Puerto p=new Puerto();
        p.Apilar(Cont);
        String resul=p.BuscaPorPrioridad(1);
        System.out.println(resul);

    }
}