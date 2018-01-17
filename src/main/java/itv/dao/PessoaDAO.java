package itv.dao;

import itv.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("PessoaDAO")
@Transactional(transactionManager="itv-TransactionManager")
public interface PessoaDAO extends JpaRepository<Pessoa, java.lang.Integer> {

  /**
   * Obtém a instância de Pessoa utilizando os identificadores
   * 
   * @param chaveCliente
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Pessoa entity WHERE entity.chaveCliente = :chaveCliente")
  public Pessoa findOne(@Param(value="chaveCliente") java.lang.Integer chaveCliente);

  /**
   * Remove a instância de Pessoa utilizando os identificadores
   * 
   * @param chaveCliente
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Pessoa entity WHERE entity.chaveCliente = :chaveCliente")
  public void delete(@Param(value="chaveCliente") java.lang.Integer chaveCliente);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from Pessoa c")
  public Page<Pessoa> list(Pageable pageable);
  
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select p from Pessoa p where p.nomeCliente LIKE CONCAT('%', COALESCE(:nome, p.nomeCliente),'%')")
  public Page<Pessoa> listByNome(@Param(value="nome") java.lang.String nome, Pageable pageable);
  


  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Endereco entity WHERE entity.pessoa.chaveCliente = :chaveCliente")
  public Page<Endereco> findEndereco(@Param(value="chaveCliente") java.lang.Integer chaveCliente, Pageable pageable);

}
