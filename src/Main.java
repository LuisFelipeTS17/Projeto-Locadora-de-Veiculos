public class Main {
    public static void main(String[] args) {
        Locadora locadora = new Locadora("Kaique Henrique", "Rua das Flores", 100);
        Menu menu = new Menu(locadora);
        menu.iniciar();
    }
}
