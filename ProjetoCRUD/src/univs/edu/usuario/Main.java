
package univs.edu.usuario;


public class Main {
    
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        UsuarioDAO dao = new UsuarioDAO();
        
        usuario = dao.pesquisar(1);
        
        dao.excluir(usuario);
        
        
        
        
    }
    
}
 