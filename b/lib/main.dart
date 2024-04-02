import "package:b/api/persons.dart";
import "package:flutter/material.dart";

void main() {
  const MyApp();
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: "B",
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(seedColor: Colors.green),
        useMaterial3: true,
      ),
      debugShowCheckedModeBanner: true,
      home: const MyHomePage(title: "B"),
    );
  }
}

class MyHomePage extends StatelessWidget {
  final String title;

  const MyHomePage({Key? key, required this.title}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text("title")),
      body: Center(child: Text(title)),
    );
  }
}

@immutable
abstract class LoadAction {
  const LoadAction() : super();
}

enum PersonUrl {
  person1,
  person2;

  const PersonUrl();

  List<Map<String, Object>> urlString() {
    switch (this) {
      case person1:
        return persons1;
      case person2:
        return persons2;
    }
  }
}
// enum PersonUrl{
//   person1(e:"A"),
//   person2(e: "B");
//   final String e;
//   const PersonUrl({required this.e});
// }

extension StringUrl on PersonUrl {
  List<Map<String, Object>> urlString() {
    switch (this) {
      case PersonUrl.person1:
        return persons1;
      case PersonUrl.person2:
        return persons2;
    }
  }
}

@immutable
class LoadPersonsAction extends LoadAction {
  final PersonUrl personUrl;

  const LoadPersonsAction({required this.personUrl}) : super();
}

@immutable
class Person {
  final String name;
  final int age;

  const Person({required this.name, required this.age});
  // as a factory constructor
  factory Person.fromJson(Map<String, dynamic> json){
    return Person(
      name: json["name"] as String,
      age: json["age"] as int,
    );
  }
  // // as a static method
  // static Person fromJson(Map<String ,dynamic> json){
  //   return Person(
  //     name: json["name"] as String,
  //     age: json["age"] as int,
  //   );
  // }
}

Iterable<Person> getPersons(List<Map<String,dynamic>> personUrl){
  var list = personUrl as List<dynamic>;
  return list.map((e)=>Person.fromJson(e));
}

@immutable
class FetchResult{
  final Iterable<Person> persons;
  final bool isRetrievedFromCache;
  const FetchResult({required this.persons,required this.isRetrievedFromCache});
}