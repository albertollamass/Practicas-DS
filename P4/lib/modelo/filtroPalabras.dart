import 'package:twitter_app/modelo/publication.dart';

import 'filtro.dart';

class FiltroPalabras extends Filtro{

  static const int NUM_PALABRAS_PROHIBIDAS = 5;
  List<String> PALABRAS_PROHIBIDAS = ["tonto" , "feo", "inutil", "retrasado", "mongolo"];

  String reemplazar(String texto, int indice, String palabra){
      String newPalabra = "";
      for(int i = 0; i < palabra.length; i++){
        newPalabra += '*';
      }
      String newTexto = texto.substring(0, indice)+newPalabra+texto.substring(indice+palabra.length, texto.length);

      return newTexto;
  }
  
  @override
  String ejecutar(Publication publicacion){
    int indice = -1;
    String resultado = publicacion.getTexto();

    for(int i = 0; i < NUM_PALABRAS_PROHIBIDAS; i++){ // cambio de palabra
      do{ // mientras exista esa palabra prohibida, sigue buscando
      indice = resultado.indexOf(PALABRAS_PROHIBIDAS[i]);

      if(indice != -1){
        resultado = reemplazar(resultado, indice, PALABRAS_PROHIBIDAS[i]);
      }

      }while(indice != -1);
    }

    publicacion.setTexto(resultado);

    return resultado;
  }

}