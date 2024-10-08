# Test 1 skipChildren():

Cette méthode permet de skip les tableaux, objets JSON et de sauter au prochain élément hors de ces structures.

[Fonction skipChildren()](src/main/java/com/fasterxml/jackson/core/util/JsonParserSequence.java) (ligne 163 ) <br>
[Fonction testSkipChilden()](src\test\java\com\fasterxml\jackson\core\read\ParserSequenceTest.java) (ligne 123)

# Test 2 report EOF Invalid number:

La méthode parseAsIntTest est un test unitaire qui vérifie le comportement de la méthode parseAsInt de la classe NumberInput.

[Fonction reportInvalidNumber(String msg)](src\main\java\com\fasterxml\jackson\core\base\ParserMinimalBase.java) <br>
[Fonction parseAsIntTest()](src\test\java\com\fasterxml\jackson\core\io\TestParseNumberInput.java)

# Test 3 testBufferSize():

Ce test s'assure que la méthode dans ByteArrayBuilder size donne le nombre global exact dans le buffer.

[Fonction size()](src\main\java\com\fasterxml\jackson\core\util\ByteArrayBuilder.java) (ligne 91) <br>
[Fonction testBufferSize()](src\test\java\com\fasterxml\jackson\core\util\ByteArrayBuilderTest.java) (ligne 78)

# Test 4 writeStartObject():

Ce test verifie si la méthode writeStartObject dans UTF8JsonGenerator.java roule sans probleme(ligne 393)

[Fonction writeStartObject()](src\main\java\com\fasterxml\jackson\core\json\UTF8JsonGenerator.java) (ligne 393) <br>
[Fonction testWriteStartObjectWithParameters()](src\test\java\com\fasterxml\jackson\core\write\UTF8GeneratorTest.java) (ligne 155)

## InputCoercionException

Class Location: jackson-core/src/main/java/com/fasterxml/jackson/core/exc/InputCoercionException.java

### Justification for Tested Methods:

1. **Constructor and Property Accessors**: It is essential to verify that the input and target types provided during instantiation are correctly stored and can be accessed using `getInputType()` and `getTargetType()`.
2. **withParser Method**: This method updates the internal parser reference in the exception, and it is important to ensure that it functions as expected.
3. **Exception Message**: Verifying the exception message ensures that the error information provided during instantiation is correctly preserved and returned.

These tests ensure that exception handling works correctly and covers key functionalities of the `InputCoercionException` class.
