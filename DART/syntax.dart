void main(){
  // var name = "Bob";
  // Object name = "Bob";
  // dynamic name = "Bob";
  final String name =  "Bob";
  print(name);

  /*
  Null safety prevents an error that results from unintentional access of variables set to null.
  The error is called a null dereference error.
  A null dereference error occurs when you access a property or call a method on an expression that evaluates to null.
  An exception to this rule is when null supports the property or method, like toString() or hashCode.
  With null safety, the Dart compiler detects these potential errors at compile time.
   */

  final list = const [];
}
