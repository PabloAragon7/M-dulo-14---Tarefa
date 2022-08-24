/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package JavaApplication1.dao;

import JavaApplication1.domain.Cliente;
import java.util.Collection;

/**
 *
 * @author pablo
 */
interface IClienteDao {
    
    public Boolean cadastrar (Cliente cliente);
    public void excluir (String cpf);
    public void alterar (Cliente cliente);
    public Cliente consultar (String cpf);
    public Collection<Cliente> buscarTodos();

    
}
