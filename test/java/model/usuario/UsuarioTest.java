package model.usuario;

import model.Usuario;
import org.junit.Assert;
import org.junit.Test;

public class UsuarioTest {

    private final Usuario usuario = new Usuario("matias");

    @Test
    public void seLlamaIgualQueElUsuario() {
        Assert.assertEquals(usuario.nombre, "matias");
    }

}
