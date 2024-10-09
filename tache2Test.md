Mehtab-Ali Rajput (2025138) & Haoran Sun (20260543)

# Test 1 skipChildren():

Cette méthode permet de skip les tableaux, objets JSON et de sauter au prochain élément hors de ces structures.

[Fonction skipChildren()](src/main/java/com/fasterxml/jackson/core/util/JsonParserSequence.java) (ligne 163 ) <br>
[Fonction testSkipChilden()](https://github.com/Mehtab68/jackson-core/blob/2.18/src/test/java/com/fasterxml/jackson/core/read/ParserSequenceTest.java) (ligne 123)

# Test 2 parseAsIntTest():

La méthode parseAsIntTest est un test unitaire qui vérifie le comportement de la méthode parseAsInt de la classe NumberInput.

[Fonction reportInvalidNumber(String msg)](https://github.com/Mehtab68/jackson-core/blob/2.18/src/main/java/com/fasterxml/jackson/core/base/ParserMinimalBase.java) <br>
[Fonction parseAsIntTest()](https://github.com/Mehtab68/jackson-core/blob/2.18/src/test/java/com/fasterxml/jackson/core/io/TestParseNumberInput.java)

# Test 3 testWriteStartObjectWithParameters():

Ce test verifie si la méthode writeStartObject dans UTF8JsonGenerator.java roule sans probleme(ligne 393)

[Fonction writeStartObject()](https://github.com/Mehtab68/jackson-core/blob/2.18/src/main/java/com/fasterxml/jackson/core/json/UTF8JsonGenerator.java) (ligne 393) <br>
[Fonction testWriteStartObjectWithParameters()](https://github.com/Mehtab68/jackson-core/blob/2.18/src/test/java/com/fasterxml/jackson/core/write/UTF8GeneratorTest.java) (ligne 155)

# Test 4 testResetWithCopy():

Ce test s'assure que la fonction resetWithCopy() fonctionne bien. Le comportement attendu devrait configurer et
modifie adéquatement leTextBuffer. Ici on test la longueur supérieure à la longueur restante de la chaîne.

[Fonction resetWithCopy()](https://github.com/Mehtab68/jackson-core/blob/2.18/src/main/java/com/fasterxml/jackson/core/util/TextBuffer.java) (ligne 287) <br>
[Fonction testResetWithCopy()](https://github.com/Mehtab68/jackson-core/blob/2.18/src/test/java/com/fasterxml/jackson/core/util/TextBufferTest.java) (ligne 235)

# Test 5 testBufferSize():

Ce test s'assure que la méthode dans ByteArrayBuilder size donne le nombre global exact dans le buffer.

[Fonction size()](https://github.com/Mehtab68/jackson-core/blob/2.18/src/main/java/com/fasterxml/jackson/core/util/ByteArrayBuilder.java) (ligne 91) <br>
[Fonction testBufferSize()](https://github.com/Mehtab68/jackson-core/blob/2.18/src/test/java/com/fasterxml/jackson/core/util/ByteArrayBuilderTest.java) (ligne 78)

# Les 5 tests suivants sont conçus pour tester les fonctionnalités de `NameN.java`.

src code: https://github.com/Mehtab68/jackson-core/blob/2.18/src/main/java/com/fasterxml/jackson/core/sym/NameN.java
test code: https://github.com/Mehtab68/jackson-core/blob/2.18/src/test/java/com/fasterxml/jackson/core/sym/NameNTest.java

6. **`testEqualsSingleQuad`**

   - **Fonction** : Vérifie si la classe `NameN` est égale à un seul quad.
   - **Objectif** : S'assurer que `NameN` ne correspond pas à un tableau contenant un seul quad, garantissant que les longueurs différentes sont bien gérées.

7. **`testEqualsTwoQuads`**

   - **Fonction** : Vérifie si la classe `NameN` est égale à deux quads.
   - **Objectif** : Valider que `NameN` ne correspond pas à un tableau de deux quads, évitant les correspondances incorrectes pour des entrées plus courtes.

8. **`testEqualsThreeQuads`**

   - **Fonction** : Vérifie si la classe `NameN` est égale à trois quads.
   - **Objectif** : Assurer que `NameN` ne correspond pas à un tableau de trois quads, testant davantage le traitement des longueurs d'entrée différentes.

9. **`testEqualsQuadArrayMatching`**

   - **Fonction** : Vérifie si `NameN` est égal à un tableau de quads correspondant.
   - **Objectif** : S'assurer que `NameN` reconnaît correctement un tableau de quads complet et correspondant, garantissant la fonctionnalité attendue.

10. **`testEqualsQuadArrayNonMatching`**

- **Fonction** : Vérifie si `NameN` est égal à un tableau de quads non correspondant.
- **Objectif** : Valider que `NameN` ne correspond pas à un tableau de quads différent, garantissant que le mécanisme de comparaison est fiable.

Ces tests vérifient que la méthode de comparaison de la classe `NameN` gère correctement des tableaux de différentes longueurs et contenus, assurant ainsi une logique de correspondance cohérente.
