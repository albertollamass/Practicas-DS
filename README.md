# Practica 1 DS - Grupo DS2_4

* Luis Guerra Batista
* Jose Jiménez Cazorla
* Alberto Llamas González
* Oscar López Maldonado 

Para facilitar la correción hemos proporcionado todos los diagramas de clase de cada módulo, así como quién ha realizado cada módulo y una imagen de una ejecución que muestra el resultado final.
## Sesión 1

### Módulo 1 : Patrón Observador para la monitorización de datos meteorológicos (Jose Jiménez y Alberto Llamas)

Hemos implementado la clase Clima (ObservableClima) como **sujeto Observable**. Tenemos además tres **Observers**; *gráficaTemperatura, pantallaTemperatura y botonCambio (en nuestro caso le hemos llamado CambiadorTemperatura)*. De estos Observers, gráficaTemperatura y botonCambio están suscritos (aunque botonCambio rompe parte de la filosofía de este diseño) mientras que pantallaTemperatura no está suscrito. Mediante una hebra cada 3 segundos se comprueba si ha habido una modificación del ​observable​. 

#### Diagrama de clases

<br><img src="imagenes/s1-m1.png" width="700" height="400">

#### Captura de ejecución

Para mostrar el funcionamiento, hemos introducido con en la ventana CambiadorTemperatura la temperatura 99 y como vemos en la gráfica, se actualiza correctamente.

<br><img src="imagenes/s1-m12.png" width="700" height="400">

### Módulo 2 : Patrón arquitectónico Filtros de Intercepción para simular el movimiento de un vehículo con cambio automático (Luis Guerra y Oscar López)

#### Diagrama de clases

<br><img src="imagenes/s1-m2.png" width="700" height="400">

#### Captura de ejecución
**Coche apagado**
<br><img src="imagenes/m25.png" width="500" height="400">

**Coche encendido**
<br><img src="imagenes/m20.png" width="500" height="400">

**Coche acelerando**
<br><img src="imagenes/m21.png" width="500" height="400">

**Coche frenando**
<br><img src="imagenes/m22.png" width="500" height="400">

**Contador reciente se pone a 0 cuando apagamos el coche**
<br><img src="imagenes/m23.png" width="500" height="400">

**Contado reciente aumenta distancia recorrida y contador total sigue aumentando**
<br><img src="imagenes/m24.png" width="500" height="400">


## Sesión 2 

### Módulo 1 : Ej 1 (Oscar López y Alberto Llamas) Patrón Factoría Abstracta y patrón Método Factoría

#### Diagrama de clases
<br><img src="imagenes/s2-m1.png" width="700" height="400">

#### Captura de ejecución
<br><img src="imagenes/s2m1.png" width="400" height="400">

### Módulo 2 : Patrón visitante básico Ejercicios 1 y 2 (Luis Guerra y Jose Jiménez)

#### Diagrama de clases
<br><img src="imagenes/S2M2.png" width="700" height="400">

#### Captura de ejecución

<br><img src="imagenes/s2m2.jpeg" width="700" height="400">


## Sesión 3

Como patrón, hemos usado el modelo Vista - Controlador ya que hemos considerado que es el que mejor se adapta a nuestro caso debido a la idea principal de éste, separar la funcionalidad del sistema de la interfaz de usuario. De esta forma, hemos podido repartirnos el trabajo más fácilmente:


* Modelo, Controlador: Luis Guerra, Jose Jiménez, Oscar López.
* Vista: Alberto Llamas.

#### Diagrama de clases

<br><img src="imagenes/s3.png" width="500" height="700">
#### Captura de ejecución
<br><img src="imagenes/apagado.png" width="700" height="400">
<br><img src="imagenes/acelerando.png" width="700" height="400">




