package itv.rest;

import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.*;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;
import org.springframework.http.*;
import org.springframework.beans.factory.annotation.*;
import java.util.*;
import itv.entity.*;
import itv.business.*;

/**
 * Controller para expor serviços REST de Pessoa
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/itv/Pessoa")
public class PessoaREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("PessoaBusiness")
  private PessoaBusiness pessoaBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("EnderecoBusiness")
  private EnderecoBusiness enderecoBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public Pessoa post(@Validated @RequestBody final Pessoa entity) throws Exception {
    return pessoaBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Pessoa put(@Validated @RequestBody final Pessoa entity) throws Exception {
    return pessoaBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{pessoaChaveCliente}")
  public Pessoa put(@Validated @RequestBody final Pessoa entity, @PathVariable("pessoaChaveCliente") java.lang.Integer pessoaChaveCliente) throws Exception {
    return pessoaBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{pessoaChaveCliente}")
  public void delete(@PathVariable("pessoaChaveCliente") java.lang.Integer pessoaChaveCliente) throws Exception {
    pessoaBusiness.delete(pessoaChaveCliente);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<Pessoa>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(pessoaBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * NamedQuery listByNome
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/listByNome/{nome}")
  public HttpEntity<PagedResources<Pessoa>> listByNomeParams(@PathVariable("nome") java.lang.String nome, Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(pessoaBusiness.listByNome(nome, pageable)), HttpStatus.OK);    
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{pessoaChaveCliente}/Endereco")    
  public HttpEntity<PagedResources<Endereco>> findEndereco(@PathVariable("pessoaChaveCliente") java.lang.Integer pessoaChaveCliente, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(pessoaBusiness.findEndereco(pessoaChaveCliente, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{pessoaChaveCliente}/Endereco/{enderecoId}")    
  public void deleteEndereco(@PathVariable("enderecoId") java.lang.Integer enderecoId) throws Exception {
    this.enderecoBusiness.delete(enderecoId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{pessoaChaveCliente}/Endereco")
  public Endereco putEndereco(@Validated @RequestBody final Endereco entity, @PathVariable("pessoaChaveCliente") java.lang.Integer pessoaChaveCliente) throws Exception {
    return this.enderecoBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{pessoaChaveCliente}/Endereco")
  public Endereco postEndereco(@Validated @RequestBody final Endereco entity, @PathVariable("pessoaChaveCliente") java.lang.Integer pessoaChaveCliente) throws Exception {
    Pessoa pessoa = this.pessoaBusiness.get(pessoaChaveCliente);
    entity.setPessoa(pessoa);
    return this.enderecoBusiness.post(entity);
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{pessoaChaveCliente}")
  public Pessoa get(@PathVariable("pessoaChaveCliente") java.lang.Integer pessoaChaveCliente) throws Exception {
    return pessoaBusiness.get(pessoaChaveCliente);
  }
}
