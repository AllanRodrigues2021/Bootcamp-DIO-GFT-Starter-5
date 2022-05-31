pacote  subsistema1 . crm ;

 classe  pública CrmService {

    private  CrmService (){
        super ();
    }

    public  static  void  gravarCliente ( String  nome , String  cep , String  cidade , String  estado ){
        Sistema . fora . println ( "Cliente salvo no sistema de CRM." );
        Sistema . fora . println ( nome );
        Sistema . fora . println ( cep );
        Sistema . fora . println ( cidade );
        Sistema . fora . println ( estado );
    }
}
