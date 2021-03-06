
import 'package:flutter/material.dart';

class HomeScreen extends StatefulWidget {
  @override
  State<HomeScreen> createState() => _HomeScreenState();
}

class _HomeScreenState extends State<HomeScreen> {
  TextEditingController? _textEditingController = TextEditingController();
    List<String> usuariosOnSearch =[];
    //Se llamaría al método getNombresUsuario()
    List<String> usuarios = [
      'Joselito',
      'Oscar',
      'Luis',
      'Alberto',
      'Manu',
      'Paco',
      'Cristina',
      'Marina',
      'Marta',
      'Maria',
      'Luisa',
      'Filomena',
      'Pepita',
      'Lupita',
      'Lucia',
      'Laura',
      'Rodolfo',
      'Jesus',
      'Juan',
      'Pepe'
    ];
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        backgroundColor: Color(0xff15ac63),
        title: Container(
                decoration: BoxDecoration(color: Colors.white,
                borderRadius: BorderRadius.circular(30)),
                child: TextField(
                  onChanged: (value) {
                    setState(() {
                      usuariosOnSearch = usuarios
                              .where((element) => element.toLowerCase().contains(value.toLowerCase()))
                              .toList();
                    });
                  },
                  controller: _textEditingController,
                  decoration: InputDecoration(
                    border: InputBorder.none,
                    errorBorder: InputBorder.none,
                    enabledBorder: InputBorder.none,
                    focusedBorder: InputBorder.none,
                    contentPadding: EdgeInsets.all(15),
                    hintText: 'Buscar'),
                ),
              ),
        actions: [
          TextButton(
            onPressed: (){
              usuariosOnSearch.clear();
              _textEditingController!.clear();
              setState(() {
                _textEditingController!.text = '';
              });
            },
            child: Icon(
              Icons.close,
              color: Colors.red,
            )
          )
        ],
      ),
      body: _textEditingController!.text.isNotEmpty && usuariosOnSearch.isEmpty
          ? Center(
              child: Column(
                mainAxisAlignment: MainAxisAlignment.center,
                  children: [
                    Icon(
                      Icons.search_off,
                      size: 80,
                      color: Color(0xff15ac63),
                    ),
                    Text('No se han encontrado resultados',
                        style: TextStyle(fontSize: 25, fontWeight: FontWeight.bold)),
                  ],
              ),
          )
          : ListView.builder(
            itemCount: _textEditingController!.text.isNotEmpty
                ? usuariosOnSearch.length
                : usuarios.length,
            itemBuilder: (context, index) {
              return Padding(
                //onTap () => llamar a mostrar el perfil del usuario
                padding: const EdgeInsets.all(4.0),
                child: Row(
                  children: [
                    CircleAvatar(
                        child: Icon(Icons.account_circle_rounded),
                    ),
                    SizedBox(
                      width: 10,
                    ),
                    Text(
                        _textEditingController!.text.isNotEmpty
                            ? usuariosOnSearch[index]
                            : usuarios[index],
                        style: TextStyle(
                            fontSize: 25, fontWeight: FontWeight.bold)
                    ),
                  ],
                ),
              );
            }),
    );
  }
}
