pacote  subsistema2 . ce ;

 classe  pública CepApi {
    
     instancia privada CepApi estática  = new CepApi ();  

     CepApi privado (){
        super ();
    }

    public  static  CepApi  getInstancia (){
        retornar  instância ;
    }

    public  String  recuperarCidade ( String  cep ){
        return  "Araucaria" ;
    }

    public  String  recuperarEstado ( String  cep ){
        retorne  "PR" ;
    }
}
