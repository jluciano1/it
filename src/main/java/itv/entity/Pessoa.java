package itv.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela PESSOA
 * @generated
 */
@Entity
@Table(name = "\"PESSOA\"")
@XmlRootElement
public class Pessoa implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1L;
  
  /**
   * @generated
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.Integer id;
  
  /**
  * @generated
  */
  @Column(name = "nomeCliente", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String nomeCliente;
  
  /**
  * @generated
  */
  @Column(name = "cpf", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String cpf;
  
  /**
  * @generated
  */
  @Column(name = "rg", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String rg;
  
  /**
  * @generated
  */
  @Column(name = "ogExpe", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String ogExpe;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "dtVen", nullable = true, unique = false, insertable=true, updatable=true)
  private java.util.Date dtVen;
  
  /**
  * @generated
  */
  @Column(name = "vlVenda", nullable = true, unique = false, insertable=true, updatable=true)
  private double vlVenda;
  
  /**
  * @generated
  */
  @Column(name = "parcelasAberto", nullable = true, unique = false, insertable=true, updatable=true)
  private int parcelasAberto;
  
  /**
  * @generated
  */
  @Column(name = "clienteVen", nullable = true, unique = false, insertable=true, updatable=true)
  private int clienteVen;
  
  /**
  * @generated
  */
  @Column(name = "foneRes", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String foneRes;
  
  /**
  * @generated
  */
  @Column(name = "foneCom", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String foneCom;
  
  /**
  * @generated
  */
  @Column(name = "foneCel", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String foneCel;
  
  /**
  * @generated
  */
  @Column(name = "nomePai", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String nomePai;
  
  /**
  * @generated
  */
  @Column(name = "nomeMae", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String nomeMae;
  
  /**
  * @generated
  */
  @Column(name = "estadoCivil", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String estadoCivil;
  
  /**
  * @generated
  */
  @Column(name = "nomeConjuge", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String nomeConjuge;
  
  /**
  * @generated
  */
  @Column(name = "tipoPessoa", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String tipoPessoa;
  
  /**
  * @generated
  */
  @Column(name = "nomeFantasia", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String nomeFantasia;
  
  /**
  * @generated
  */
  @Column(name = "cnpj", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String cnpj;
  
  /**
  * @generated
  */
  @OneToOne
  @JoinColumn(name="fk_dadoPessoalSerasa", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private DadoPessoalSerasa dadoPessoalSerasa;
  
  /**
  * @generated
  */
  @OneToOne
  @JoinColumn(name="fk_dadoPessoalLinkedIn", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private DadoPessoalLinkedIn dadoPessoalLinkedIn;
  
  /**
  * @generated
  */
  @OneToOne
  @JoinColumn(name="fk_dadoPessoalFacebook", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private DadoPessoalFacebook dadoPessoalFacebook;
  
  /**
  * @generated
  */
  @Column(name = "emailPes", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String emailPes;
  
  /**
  * @generated
  */
  @Column(name = "chaveCliente", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String chaveCliente;
  
  /**
   * Construtor
   * @generated
   */
  public Pessoa(){
  }

  
  /**
   * Obtém id
   * return id
   * @generated
   */
  public java.lang.Integer getId(){
    return this.id;
  }
  
  /**
   * Define id
   * @param id id
   * @generated
   */
  public Pessoa setId(java.lang.Integer id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém nomeCliente
   * return nomeCliente
   * @generated
   */
  public java.lang.String getNomeCliente(){
    return this.nomeCliente;
  }
  
  /**
   * Define nomeCliente
   * @param nomeCliente nomeCliente
   * @generated
   */
  public Pessoa setNomeCliente(java.lang.String nomeCliente){
    this.nomeCliente = nomeCliente;
    return this;
  }
  
  /**
   * Obtém cpf
   * return cpf
   * @generated
   */
  public java.lang.String getCpf(){
    return this.cpf;
  }
  
  /**
   * Define cpf
   * @param cpf cpf
   * @generated
   */
  public Pessoa setCpf(java.lang.String cpf){
    this.cpf = cpf;
    return this;
  }
  
  /**
   * Obtém rg
   * return rg
   * @generated
   */
  public java.lang.String getRg(){
    return this.rg;
  }
  
  /**
   * Define rg
   * @param rg rg
   * @generated
   */
  public Pessoa setRg(java.lang.String rg){
    this.rg = rg;
    return this;
  }
  
  /**
   * Obtém ogExpe
   * return ogExpe
   * @generated
   */
  public java.lang.String getOgExpe(){
    return this.ogExpe;
  }
  
  /**
   * Define ogExpe
   * @param ogExpe ogExpe
   * @generated
   */
  public Pessoa setOgExpe(java.lang.String ogExpe){
    this.ogExpe = ogExpe;
    return this;
  }
  
  /**
   * Obtém dtVen
   * return dtVen
   * @generated
   */
  public java.util.Date getDtVen(){
    return this.dtVen;
  }
  
  /**
   * Define dtVen
   * @param dtVen dtVen
   * @generated
   */
  public Pessoa setDtVen(java.util.Date dtVen){
    this.dtVen = dtVen;
    return this;
  }
  
  /**
   * Obtém vlVenda
   * return vlVenda
   * @generated
   */
  public double getVlVenda(){
    return this.vlVenda;
  }
  
  /**
   * Define vlVenda
   * @param vlVenda vlVenda
   * @generated
   */
  public Pessoa setVlVenda(double vlVenda){
    this.vlVenda = vlVenda;
    return this;
  }
  
  /**
   * Obtém parcelasAberto
   * return parcelasAberto
   * @generated
   */
  public int getParcelasAberto(){
    return this.parcelasAberto;
  }
  
  /**
   * Define parcelasAberto
   * @param parcelasAberto parcelasAberto
   * @generated
   */
  public Pessoa setParcelasAberto(int parcelasAberto){
    this.parcelasAberto = parcelasAberto;
    return this;
  }
  
  /**
   * Obtém clienteVen
   * return clienteVen
   * @generated
   */
  public int getClienteVen(){
    return this.clienteVen;
  }
  
  /**
   * Define clienteVen
   * @param clienteVen clienteVen
   * @generated
   */
  public Pessoa setClienteVen(int clienteVen){
    this.clienteVen = clienteVen;
    return this;
  }
  
  /**
   * Obtém foneRes
   * return foneRes
   * @generated
   */
  public java.lang.String getFoneRes(){
    return this.foneRes;
  }
  
  /**
   * Define foneRes
   * @param foneRes foneRes
   * @generated
   */
  public Pessoa setFoneRes(java.lang.String foneRes){
    this.foneRes = foneRes;
    return this;
  }
  
  /**
   * Obtém foneCom
   * return foneCom
   * @generated
   */
  public java.lang.String getFoneCom(){
    return this.foneCom;
  }
  
  /**
   * Define foneCom
   * @param foneCom foneCom
   * @generated
   */
  public Pessoa setFoneCom(java.lang.String foneCom){
    this.foneCom = foneCom;
    return this;
  }
  
  /**
   * Obtém foneCel
   * return foneCel
   * @generated
   */
  public java.lang.String getFoneCel(){
    return this.foneCel;
  }
  
  /**
   * Define foneCel
   * @param foneCel foneCel
   * @generated
   */
  public Pessoa setFoneCel(java.lang.String foneCel){
    this.foneCel = foneCel;
    return this;
  }
  
  /**
   * Obtém nomePai
   * return nomePai
   * @generated
   */
  public java.lang.String getNomePai(){
    return this.nomePai;
  }
  
  /**
   * Define nomePai
   * @param nomePai nomePai
   * @generated
   */
  public Pessoa setNomePai(java.lang.String nomePai){
    this.nomePai = nomePai;
    return this;
  }
  
  /**
   * Obtém nomeMae
   * return nomeMae
   * @generated
   */
  public java.lang.String getNomeMae(){
    return this.nomeMae;
  }
  
  /**
   * Define nomeMae
   * @param nomeMae nomeMae
   * @generated
   */
  public Pessoa setNomeMae(java.lang.String nomeMae){
    this.nomeMae = nomeMae;
    return this;
  }
  
  /**
   * Obtém estadoCivil
   * return estadoCivil
   * @generated
   */
  public java.lang.String getEstadoCivil(){
    return this.estadoCivil;
  }
  
  /**
   * Define estadoCivil
   * @param estadoCivil estadoCivil
   * @generated
   */
  public Pessoa setEstadoCivil(java.lang.String estadoCivil){
    this.estadoCivil = estadoCivil;
    return this;
  }
  
  /**
   * Obtém nomeConjuge
   * return nomeConjuge
   * @generated
   */
  public java.lang.String getNomeConjuge(){
    return this.nomeConjuge;
  }
  
  /**
   * Define nomeConjuge
   * @param nomeConjuge nomeConjuge
   * @generated
   */
  public Pessoa setNomeConjuge(java.lang.String nomeConjuge){
    this.nomeConjuge = nomeConjuge;
    return this;
  }
  
  /**
   * Obtém tipoPessoa
   * return tipoPessoa
   * @generated
   */
  public java.lang.String getTipoPessoa(){
    return this.tipoPessoa;
  }
  
  /**
   * Define tipoPessoa
   * @param tipoPessoa tipoPessoa
   * @generated
   */
  public Pessoa setTipoPessoa(java.lang.String tipoPessoa){
    this.tipoPessoa = tipoPessoa;
    return this;
  }
  
  /**
   * Obtém nomeFantasia
   * return nomeFantasia
   * @generated
   */
  public java.lang.String getNomeFantasia(){
    return this.nomeFantasia;
  }
  
  /**
   * Define nomeFantasia
   * @param nomeFantasia nomeFantasia
   * @generated
   */
  public Pessoa setNomeFantasia(java.lang.String nomeFantasia){
    this.nomeFantasia = nomeFantasia;
    return this;
  }
  
  /**
   * Obtém cnpj
   * return cnpj
   * @generated
   */
  public java.lang.String getCnpj(){
    return this.cnpj;
  }
  
  /**
   * Define cnpj
   * @param cnpj cnpj
   * @generated
   */
  public Pessoa setCnpj(java.lang.String cnpj){
    this.cnpj = cnpj;
    return this;
  }
  
  /**
   * Obtém dadoPessoalSerasa
   * return dadoPessoalSerasa
   * @generated
   */
  public DadoPessoalSerasa getDadoPessoalSerasa(){
    return this.dadoPessoalSerasa;
  }
  
  /**
   * Define dadoPessoalSerasa
   * @param dadoPessoalSerasa dadoPessoalSerasa
   * @generated
   */
  public Pessoa setDadoPessoalSerasa(DadoPessoalSerasa dadoPessoalSerasa){
    this.dadoPessoalSerasa = dadoPessoalSerasa;
    return this;
  }
  
  /**
   * Obtém dadoPessoalLinkedIn
   * return dadoPessoalLinkedIn
   * @generated
   */
  public DadoPessoalLinkedIn getDadoPessoalLinkedIn(){
    return this.dadoPessoalLinkedIn;
  }
  
  /**
   * Define dadoPessoalLinkedIn
   * @param dadoPessoalLinkedIn dadoPessoalLinkedIn
   * @generated
   */
  public Pessoa setDadoPessoalLinkedIn(DadoPessoalLinkedIn dadoPessoalLinkedIn){
    this.dadoPessoalLinkedIn = dadoPessoalLinkedIn;
    return this;
  }
  
  /**
   * Obtém dadoPessoalFacebook
   * return dadoPessoalFacebook
   * @generated
   */
  public DadoPessoalFacebook getDadoPessoalFacebook(){
    return this.dadoPessoalFacebook;
  }
  
  /**
   * Define dadoPessoalFacebook
   * @param dadoPessoalFacebook dadoPessoalFacebook
   * @generated
   */
  public Pessoa setDadoPessoalFacebook(DadoPessoalFacebook dadoPessoalFacebook){
    this.dadoPessoalFacebook = dadoPessoalFacebook;
    return this;
  }
  
  /**
   * Obtém emailPes
   * return emailPes
   * @generated
   */
  public java.lang.String getEmailPes(){
    return this.emailPes;
  }
  
  /**
   * Define emailPes
   * @param emailPes emailPes
   * @generated
   */
  public Pessoa setEmailPes(java.lang.String emailPes){
    this.emailPes = emailPes;
    return this;
  }
  
  /**
   * Obtém chaveCliente
   * return chaveCliente
   * @generated
   */
  public java.lang.String getChaveCliente(){
    return this.chaveCliente;
  }
  
  /**
   * Define chaveCliente
   * @param chaveCliente chaveCliente
   * @generated
   */
  public Pessoa setChaveCliente(java.lang.String chaveCliente){
    this.chaveCliente = chaveCliente;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Pessoa object = (Pessoa)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }
  
}
