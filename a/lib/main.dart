import 'package:flutter/material.dart';
import 'package:bloc/bloc.dart';
import "package:flutter_bloc/flutter_bloc.dart";
import "dart:math" as math show Random;

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'A',
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(seedColor: Colors.green),
        useMaterial3: true,
      ),
      home: const MyHomePage(title: 'A'),
    );
  }
}

const List<String> names = ["Foo", "Bar", "Baz"];

extension RandomElement<T> on Iterable<T> {
  T getRandomElement() {
    return elementAt(math.Random().nextInt(names.length));
  }

// using lambda
// T getRandomElement() =>
//   elementAt(math.Random().nextInt(names.length));
}

class NamesCubit extends Cubit<String?> {
  // cubits just like bloc need state to initialise it must  be set
  // class constructors
  // NamesCubit() : super(null);
  NamesCubit({State? state}):super(null); // {...} optionally be passed argument
  // NamesCubit(State? state):super(null); // mandatory be passed positional argument

  void pickRandomName() {
    // by default you can only get the state but calling emit enables you to set the state
    // call emit to produce a new state
    // return emit(names.getRandomElement());
    return emit(names.elementAt(math.Random().nextInt(names.length)));
  }
}

class MyHomePage extends StatefulWidget {
  const MyHomePage({super.key, required this.title});

  final String title;

  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  late final NamesCubit cubit;

  @override
  void initState() {
    // TODO: implement initState
    // initialise my cubit object
    cubit = new NamesCubit(); // {...} optionally be passed argument
    // cubit = new NamesCubit(this); // // mandatory be passed positional argument
    super.initState();
  }

  @override
  void dispose() {
    // TODO: implement dispose
    cubit.close(); // cleans up
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        backgroundColor: Theme.of(context).colorScheme.inversePrimary,
        title: Text(widget.title),
      ),
      body: StreamBuilder<String?>(
          stream: cubit.stream,
          builder: (BuildContext context, AsyncSnapshot<String?> snapshot) {
            final TextButton button = TextButton(
              onPressed: () => cubit.pickRandomName(),
              // onPressed:(){cubit.pickRandomName();},
              child: const Text("Pick a random name"),
            );

            switch (snapshot.connectionState) {
              case ConnectionState.none:
                return button;
              case ConnectionState.waiting:
                return button;
              case ConnectionState.active:
                return Center(
                  child: Column(
                    children: [
                      Text(snapshot.data ?? ""),
                      button,
                    ],
                  ),
                );
              case ConnectionState.done:
                return const SizedBox();
            }
          }),
      // This trailing comma makes auto-formatting nicer for build methods.
    );
  }
}
