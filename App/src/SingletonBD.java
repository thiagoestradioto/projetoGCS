
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

    public static void deletarUsuario(){
        Usuario usuario = new Usuario("marina", "123", "marina", 1994);
        listaUsuario.add(usuario);
        System.out.println("*** Lista " + listaUsuario.size());
        listaUsuario.remove(0);
        System.out.println("Removido usuario " + listaUsuario.isEmpty() );
    }

    public static void atualizarUsuario(){
        System.out.println("*** Criando a branch Atualizar-Usuario");
    }

    public static void listarUsuarios(){

        System.out.println("*** Criando a branch Listar-Usuario");
    }

    public static void cadastrarCargo(){

        System.out.println("*** Criando a branch Cadastrar Cargo");
    }

}
