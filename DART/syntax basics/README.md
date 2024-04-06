#### Variables
```dart 
Here's an example of creating a variable and initializing it:

var name = 'Bob';
content_copy
Variables store references. The variable called name contains a reference to a String object with a value of "Bob".

The type of the name variable is inferred to be String, but you can change that type by specifying it. If an object isn't restricted to a single type, specify the Object type (or dynamic if necessary).

Object name = 'Bob';
content_copy
Another option is to explicitly declare the type that would be inferred:

String name = 'Bob';
content_copy
Note
This page follows the style guide recommendation of using var, rather than type annotations, for local variables.

Null safety
#
The Dart language enforces sound null safety.

Null safety prevents an error that results from unintentional access of variables set to null. The error is called a null dereference error. A null dereference error occurs when you access a property or call a method on an expression that evaluates to null. An exception to this rule is when null supports the property or method, like toString() or hashCode. With null safety, the Dart compiler detects these potential errors at compile time.

For example, say you want to find the absolute value of an int variable i. If i is null, calling i.abs() causes a null dereference error. In other languages, trying this could lead to a runtime error, but Dart's compiler prohibits these actions. Therefore, Dart apps can't cause runtime errors.

Null safety introduces three key changes:

When you specify a type for a variable, parameter, or another relevant component, you can control whether the type allows null. To enable nullability, you add a ? to the end of the type declaration.

String? name  // Nullable type. Can be `null` or string.

String name   // Non-nullable type. Cannot be `null` but can be string.
content_copy
You must initialize variables before using them. Nullable variables default to null, so they are initialized by default. Dart doesn't set initial values to non-nullable types. It forces you to set an initial value. Dart doesn't allow you to observe an uninitialized variable. This prevents you from accessing properties or calling methods where the receiver's type can be null but null doesn't support the method or property used.

You can't access properties or call methods on an expression with a nullable type. The same exception applies where it's a property or method that null supports like hashCode or toString().

Sound null safety changes potential runtime errors into edit-time analysis errors. Null safety flags a non-null variable when it has been either:

Not initialized with a non-null value.
Assigned a null value.
This check allows you to fix these errors before deploying your app.

Default value
#
Uninitialized variables that have a nullable type have an initial value of null. Even variables with numeric types are initially null, because numbers—like everything else in Dart—are objects.

int? lineCount;
assert(lineCount == null);
content_copy
Note
Production code ignores the assert() call. During development, on the other hand, assert(condition) throws an exception if condition is false. For details, check out Assert.

With null safety, you must initialize the values of non-nullable variables before you use them:

int lineCount = 0;
content_copy
You don't have to initialize a local variable where it's declared, but you do need to assign it a value before it's used. For example, the following code is valid because Dart can detect that lineCount is non-null by the time it's passed to print():

int lineCount;

if (weLikeToCount) {
  lineCount = countLines();
} else {
  lineCount = 0;
}

print(lineCount);
content_copy
Top-level and class variables are lazily initialized; the initialization code runs the first time the variable is used.

Late variables
#
The late modifier has two use cases:

Declaring a non-nullable variable that's initialized after its declaration.
Lazily initializing a variable.
Often Dart's control flow analysis can detect when a non-nullable variable is set to a non-null value before it's used, but sometimes analysis fails. Two common cases are top-level variables and instance variables: Dart often can't determine whether they're set, so it doesn't try.

If you're sure that a variable is set before it's used, but Dart disagrees, you can fix the error by marking the variable as late:

late String description;

void main() {
  description = 'Feijoada!';
  print(description);
}
content_copy
Notice
If you fail to initialize a late variable, a runtime error occurs when the variable is used.

When you mark a variable as late but initialize it at its declaration, then the initializer runs the first time the variable is used. This lazy initialization is handy in a couple of cases:

The variable might not be needed, and initializing it is costly.
You're initializing an instance variable, and its initializer needs access to this.
In the following example, if the temperature variable is never used, then the expensive readThermometer() function is never called:

// This is the program's only call to readThermometer().
late String temperature = readThermometer(); // Lazily initialized.
content_copy
Final and const
#
If you never intend to change a variable, use final or const, either instead of var or in addition to a type. A final variable can be set only once; a const variable is a compile-time constant. (Const variables are implicitly final.)

Note
Instance variables can be final but not const.

Here's an example of creating and setting a final variable:

final name = 'Bob'; // Without a type annotation
final String nickname = 'Bobby';
content_copy
You can't change the value of a final variable:

✗ static analysis: failure
name = 'Alice'; // Error: a final variable can only be set once.
content_copy
Use const for variables that you want to be compile-time constants. If the const variable is at the class level, mark it static const. Where you declare the variable, set the value to a compile-time constant such as a number or string literal, a const variable, or the result of an arithmetic operation on constant numbers:

const bar = 1000000; // Unit of pressure (dynes/cm2)
const double atm = 1.01325 * bar; // Standard atmosphere
content_copy
The const keyword isn't just for declaring constant variables. You can also use it to create constant values, as well as to declare constructors that create constant values. Any variable can have a constant value.

var foo = const [];
final bar = const [];
const baz = []; // Equivalent to `const []`
content_copy
You can omit const from the initializing expression of a const declaration, like for baz above. For details, see DON'T use const redundantly.

You can change the value of a non-final, non-const variable, even if it used to have a const value:

foo = [1, 2, 3]; // Was const []
content_copy
You can't change the value of a const variable:

✗ static analysis: failure
baz = [42]; // Error: Constant variables can't be assigned a value.
content_copy
You can define constants that use type checks and casts (is and as), collection if, and spread operators (... and ...?):

const Object i = 3; // Where i is a const Object with an int value...
const list = [i as int]; // Use a typecast.
const map = {if (i is int) i: 'int'}; // Use is and collection if.
const set = {if (list is List<int>) ...list}; // ...and a spread.
content_copy
Note
Although a final object cannot be modified, its fields can be changed. In comparison, a const object and its fields cannot be changed: they're immutable.
```

#### Operators
```dart

Dart supports the operators shown in the following table. The table shows Dart's operator associativity and operator precedence from highest to lowest, which are an approximation of Dart's operator relationships. You can implement many of these operators as class members.

Description	Operator	Associativity
unary postfix	expr++    expr--    ()    []    ?[]    .    ?.    !	None
unary prefix	-expr    !expr    ~expr    ++expr    --expr      await expr	None
multiplicative	*    /    %  ~/	Left
additive	+    -	Left
shift	<<    >>    >>>	Left
bitwise AND	&	Left
bitwise XOR	^	Left
bitwise OR	|	Left
relational and type test	>=    >    <=    <    as    is    is!	None
equality	==    !=	None
logical AND	&&	Left
logical OR	||	Left
if-null	??	Left
conditional	expr1    ?    expr2    :    expr3	Right
cascade	..    ?..	Left
assignment	=    *=    /=   +=   -=   &=   ^=   etc.	Right
spread (See note)	...    ...?	None
Warning
The previous table should only be used as a helpful guide. The notion of operator precedence and associativity is an approximation of the truth found in the language grammar. You can find the authoritative behavior of Dart's operator relationships in the grammar defined in the Dart language specification.

When you use operators, you create expressions. Here are some examples of operator expressions:

a++
a + b
a = b
a == b
c ? a : b
a is T
content_copy
Operator precedence example
#
In the operator table, each operator has higher precedence than the operators in the rows that follow it. For example, the multiplicative operator % has higher precedence than (and thus executes before) the equality operator ==, which has higher precedence than the logical AND operator &&. That precedence means that the following two lines of code execute the same way:

// Parentheses improve readability.
if ((n % i == 0) && (d % i == 0)) ...

// Harder to read, but equivalent.
if (n % i == 0 && d % i == 0) ...
content_copy
Warning
For operators that take two operands, the leftmost operand determines which method is used. For example, if you have a Vector object and a Point object, then aVector + aPoint uses Vector addition (+).

Arithmetic operators
#
Dart supports the usual arithmetic operators, as shown in the following table.

Operator	Meaning
+	Add
-	Subtract
-expr	Unary minus, also known as negation (reverse the sign of the expression)
*	Multiply
/	Divide
~/	Divide, returning an integer result
%	Get the remainder of an integer division (modulo)
Example:

assert(2 + 3 == 5);
assert(2 - 3 == -1);
assert(2 * 3 == 6);
assert(5 / 2 == 2.5); // Result is a double
assert(5 ~/ 2 == 2); // Result is an int
assert(5 % 2 == 1); // Remainder

assert('5/2 = ${5 ~/ 2} r ${5 % 2}' == '5/2 = 2 r 1');
content_copy
Dart also supports both prefix and postfix increment and decrement operators.

Operator	Meaning
++var	var  =  var + 1 (expression value is var + 1)
var++	var  =  var + 1 (expression value is var)
--var	var  =  var - 1 (expression value is var - 1)
var--	var  =  var - 1 (expression value is var)
Example:

int a;
int b;

a = 0;
b = ++a; // Increment a before b gets its value.
assert(a == b); // 1 == 1

a = 0;
b = a++; // Increment a after b gets its value.
assert(a != b); // 1 != 0

a = 0;
b = --a; // Decrement a before b gets its value.
assert(a == b); // -1 == -1

a = 0;
b = a--; // Decrement a after b gets its value.
assert(a != b); // -1 != 0
content_copy
Equality and relational operators
#
The following table lists the meanings of equality and relational operators.

Operator	Meaning
==	Equal; see discussion below
!=	Not equal
>	Greater than
<	Less than
>=	Greater than or equal to
<=	Less than or equal to
To test whether two objects x and y represent the same thing, use the == operator. (In the rare case where you need to know whether two objects are the exact same object, use the identical() function instead.) Here's how the == operator works:

If x or y is null, return true if both are null, and false if only one is null.

Return the result of invoking the == method on x with the argument y. (That's right, operators such as == are methods that are invoked on their first operand. For details, see Operators.)

Here's an example of using each of the equality and relational operators:

assert(2 == 2);
assert(2 != 3);
assert(3 > 2);
assert(2 < 3);
assert(3 >= 3);
assert(2 <= 3);
content_copy
Type test operators
#
The as, is, and is! operators are handy for checking types at runtime.

Operator	Meaning
as	Typecast (also used to specify library prefixes)
is	True if the object has the specified type
is!	True if the object doesn't have the specified type
The result of obj is T is true if obj implements the interface specified by T. For example, obj is Object? is always true.

Use the as operator to cast an object to a particular type if and only if you are sure that the object is of that type. Example:

(employee as Person).firstName = 'Bob';
content_copy
If you aren't sure that the object is of type T, then use is T to check the type before using the object.

if (employee is Person) {
  // Type check
  employee.firstName = 'Bob';
}
content_copy
Note
The code isn't equivalent. If employee is null or not a Person, the first example throws an exception; the second does nothing.

Assignment operators
#
As you've already seen, you can assign values using the = operator. To assign only if the assigned-to variable is null, use the ??= operator.

// Assign value to a
a = value;
// Assign value to b if b is null; otherwise, b stays the same
b ??= value;
content_copy
Compound assignment operators such as += combine an operation with an assignment.

=	*=	%=	>>>=	^=
+=	/=	<<=	&=	|=
-=	~/=	>>=		
Here's how compound assignment operators work:

For an operator op:	a op= b	a = a op b
Example:	a += b	a = a + b
The following example uses assignment and compound assignment operators:

var a = 2; // Assign using =
a *= 3; // Assign and multiply: a = a * 3
assert(a == 6);
content_copy
Logical operators
#
You can invert or combine boolean expressions using the logical operators.

Operator	Meaning
!expr	inverts the following expression (changes false to true, and vice versa)
||	logical OR
&&	logical AND
Here's an example of using the logical operators:

if (!done && (col == 0 || col == 3)) {
  // ...Do something...
}
content_copy
Bitwise and shift operators
#
You can manipulate the individual bits of numbers in Dart. Usually, you'd use these bitwise and shift operators with integers.

Operator	Meaning
&	AND
|	OR
^	XOR
~expr	Unary bitwise complement (0s become 1s; 1s become 0s)
<<	Shift left
>>	Shift right
>>>	Unsigned shift right
Note
The behavior of bitwise operations with large or negative operands might differ between platforms. To learn more, check out Bitwise operations platform differences.

Here's an example of using bitwise and shift operators:

final value = 0x22;
final bitmask = 0x0f;

assert((value & bitmask) == 0x02); // AND
assert((value & ~bitmask) == 0x20); // AND NOT
assert((value | bitmask) == 0x2f); // OR
assert((value ^ bitmask) == 0x2d); // XOR

assert((value << 4) == 0x220); // Shift left
assert((value >> 4) == 0x02); // Shift right

// Shift right example that results in different behavior on web
// because the operand value changes when masked to 32 bits:
assert((-value >> 4) == -0x03);

assert((value >>> 4) == 0x02); // Unsigned shift right
assert((-value >>> 4) > 0); // Unsigned shift right
content_copy
Version note
The >>> operator (known as triple-shift or unsigned shift) requires a language version of at least 2.14.

Conditional expressions
#
Dart has two operators that let you concisely evaluate expressions that might otherwise require if-else statements:

condition ? expr1 : expr2
If condition is true, evaluates expr1 (and returns its value); otherwise, evaluates and returns the value of expr2.
expr1 ?? expr2
If expr1 is non-null, returns its value; otherwise, evaluates and returns the value of expr2.
When you need to assign a value based on a boolean expression, consider using the conditional operator ? and :.

var visibility = isPublic ? 'public' : 'private';
content_copy
If the boolean expression tests for null, consider using the if-null operator ?? (also known as the null-coalescing operator).

String playerName(String? name) => name ?? 'Guest';
content_copy
The previous example could have been written at least two other ways, but not as succinctly:

// Slightly longer version uses ?: operator.
String playerName(String? name) => name != null ? name : 'Guest';

// Very long version uses if-else statement.
String playerName(String? name) {
  if (name != null) {
    return name;
  } else {
    return 'Guest';
  }
}
content_copy
Cascade notation
#
Cascades (.., ?..) allow you to make a sequence of operations on the same object. In addition to accessing instance members, you can also call instance methods on that same object. This often saves you the step of creating a temporary variable and allows you to write more fluid code.

Consider the following code:

var paint = Paint()
  ..color = Colors.black
  ..strokeCap = StrokeCap.round
  ..strokeWidth = 5.0;
content_copy
The constructor, Paint(), returns a Paint object. The code that follows the cascade notation operates on this object, ignoring any values that might be returned.

The previous example is equivalent to this code:

var paint = Paint();
paint.color = Colors.black;
paint.strokeCap = StrokeCap.round;
paint.strokeWidth = 5.0;
content_copy
If the object that the cascade operates on can be null, then use a null-shorting cascade (?..) for the first operation. Starting with ?.. guarantees that none of the cascade operations are attempted on that null object.

querySelector('#confirm') // Get an object.
  ?..text = 'Confirm' // Use its members.
  ..classes.add('important')
  ..onClick.listen((e) => window.alert('Confirmed!'))
  ..scrollIntoView();
content_copy
Version note
The ?.. syntax requires a language version of at least 2.12.

The previous code is equivalent to the following:

var button = querySelector('#confirm');
button?.text = 'Confirm';
button?.classes.add('important');
button?.onClick.listen((e) => window.alert('Confirmed!'));
button?.scrollIntoView();
content_copy
You can also nest cascades. For example:

final addressBook = (AddressBookBuilder()
      ..name = 'jenny'
      ..email = 'jenny@example.com'
      ..phone = (PhoneNumberBuilder()
            ..number = '415-555-0100'
            ..label = 'home')
          .build())
    .build();
content_copy
Be careful to construct your cascade on a function that returns an actual object. For example, the following code fails:

var sb = StringBuffer();
sb.write('foo')
  ..write('bar'); // Error: method 'write' isn't defined for 'void'.
content_copy
The sb.write() call returns void, and you can't construct a cascade on void.

Note
Strictly speaking, the "double dot" notation for cascades isn't an operator. It's just part of the Dart syntax.

Spread operators
#
Spread operators evaluate an expression that yields a collection, unpacks the resulting values, and inserts them into another collection.

The spread operator isn't actually an operator expression. The .../...? syntax is part of the collection literal itself. So, you can learn more about spread operators on the Collections page.

Because it isn't an operator, the syntax doesn't have any "operator precedence". Effectively, it has the lowest "precedence" — any kind of expression is valid as the spread target, such as:

[...a + b]
content_copy
Other operators
#
You've seen most of the remaining operators in other examples:

Operator	Name	Meaning
()	Function application	Represents a function call
[]	Subscript access	Represents a call to the overridable [] operator; example: fooList[1] passes the int 1 to fooList to access the element at index 1
?[]	Conditional subscript access	Like [], but the leftmost operand can be null; example: fooList?[1] passes the int 1 to fooList to access the element at index 1 unless fooList is null (in which case the expression evaluates to null)
.	Member access	Refers to a property of an expression; example: foo.bar selects property bar from expression foo
?.	Conditional member access	Like ., but the leftmost operand can be null; example: foo?.bar selects property bar from expression foo unless foo is null (in which case the value of foo?.bar is null)
!	Non-null assertion operator	Casts an expression to its underlying non-nullable type, throwing a runtime exception if the cast fails; example: foo!.bar asserts foo is non-null and selects the property bar, unless foo is null in which case a runtime exception is thrown
For more information about the ., ?., and .. operators, see Classes.
```

###  Comments
```dart
Dart supports single-line comments, multi-line comments, and documentation comments.

Single-line comments
#
A single-line comment begins with //. Everything between // and the end of line is ignored by the Dart compiler.

void main() {
  // TODO: refactor into an AbstractLlamaGreetingFactory?
  print('Welcome to my Llama farm!');
}
content_copy
Multi-line comments
#
A multi-line comment begins with /* and ends with */. Everything between /* and */ is ignored by the Dart compiler (unless the comment is a documentation comment; see the next section). Multi-line comments can nest.

void main() {
  /*
   * This is a lot of work. Consider raising chickens.

  Llama larry = Llama();
  larry.feed();
  larry.exercise();
  larry.clean();
   */
}
content_copy
Documentation comments
#
Documentation comments are multi-line or single-line comments that begin with /// or /**. Using /// on consecutive lines has the same effect as a multi-line doc comment.

Inside a documentation comment, the analyzer ignores all text unless it is enclosed in brackets. Using brackets, you can refer to classes, methods, fields, top-level variables, functions, and parameters. The names in brackets are resolved in the lexical scope of the documented program element.

Here is an example of documentation comments with references to other classes and arguments:

/// A domesticated South American camelid (Lama glama).
///
/// Andean cultures have used llamas as meat and pack
/// animals since pre-Hispanic times.
///
/// Just like any other animal, llamas need to eat,
/// so don't forget to [feed] them some [Food].
class Llama {
  String? name;

  /// Feeds your llama [food].
  ///
  /// The typical llama eats one bale of hay per week.
  void feed(Food food) {
    // ...
  }

  /// Exercises your llama with an [activity] for
  /// [timeLimit] minutes.
  void exercise(Activity activity, int timeLimit) {
    // ...
  }
}
content_copy
In the class's generated documentation, [feed] becomes a link to the docs for the feed method, and [Food] becomes a link to the docs for the Food class.
```