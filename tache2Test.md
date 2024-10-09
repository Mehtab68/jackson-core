Mehtab-Ali Rajput (2025138) & Haoran Sun (20260543)

# Test 1 skipChildren():

Cette méthode permet de skip les tableaux, objets JSON et de sauter au prochain élément hors de ces structures.

[Fonction skipChildren()](src/main/java/com/fasterxml/jackson/core/util/JsonParserSequence.java) (ligne 163 ) <br>
[Fonction testSkipChilden()](src\test\java\com\fasterxml\jackson\core\read\ParserSequenceTest.java) (ligne 123)

# Test 2 testBufferSize():

Ce test s'assure que la méthode dans ByteArrayBuilder size donne le nombre global exact dans le buffer.

[Fonction size()](src\main\java\com\fasterxml\jackson\core\util\ByteArrayBuilder.java) (ligne 91) <br>
[Fonction testBufferSize()](src\test\java\com\fasterxml\jackson\core\util\ByteArrayBuilderTest.java) (ligne 78)

# Test 3 parseAsIntTest():

La méthode parseAsIntTest est un test unitaire qui vérifie le comportement de la méthode parseAsInt de la classe NumberInput.

[Fonction reportInvalidNumber(String msg)](src\main\java\com\fasterxml\jackson\core\base\ParserMinimalBase.java) <br>
[Fonction parseAsIntTest()](src\test\java\com\fasterxml\jackson\core\io\TestParseNumberInput.java)

# Test 4 testWriteStartObjectWithParameters():

Ce test verifie si la méthode writeStartObject dans UTF8JsonGenerator.java roule sans probleme(ligne 393)

[Fonction writeStartObject()](src\main\java\com\fasterxml\jackson\core\json\UTF8JsonGenerator.java) (ligne 393) <br>
[Fonction testWriteStartObjectWithParameters()](src\test\java\com\fasterxml\jackson\core\write\UTF8GeneratorTest.java) (ligne 155)

# Test 5 testResetWithCopy():

Ce test s'assure que la fonction resetWithCopy() fonctionne bien. Le comportement attendu devrait configurer et
modifie adéquatement le TextBuffer. Ici on test la longueur supérieure à la longueur restante de la chaîne.

[Fonction resetWtihCopy()](src\main\java\com\fasterxml\jackson\core\util\TextBuffer.java) (ligne 287) <br>
[Fonction testResetWithCopy()](src\test\java\com\fasterxml\jackson\core\util\TextBufferTest.java) (ligne 255)
