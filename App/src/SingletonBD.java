
import java.util.ArrayList;

public class SingletonBD {

    private static ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();

    private SingletonBD() { }

    public static void adicionarUsuario(){

        Usuario usuario = new Usuario("gleyciane", "123", "Gleyciane", 1993);
        listaUsuario.add(usuario);

        System.out.println("\n");
        System.out.println("*** Usuário cadastrado " + usuario.toString());
        System.out.println("\n");
    }

    public static void deletarUsuario(){ }

    public static void atualizarUsuario(){ }

    public static void listarUsuarios(){ }

}
