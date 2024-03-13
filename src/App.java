public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!"); 
        Aluno sabrina = new Aluno("Sabrina", "111.222.333-44", 292048, "24/03/2004", "Feminino");
        sabrina.setNome("Sabrina");

        System.out.println(sabrina.getNome());
        System.out.println(sabrina.getRa());


        Aluno a = new Aluno ();
        a.setNome("Francisco");
        a.setRa (292048);
        System.out.println(a.getNome());
        System.out.println(a.getRa());

    }
}
