#   Interpreter Design Pattern


##  What is the Interpreter Pattern
>   Given a language, define a representation for its grammar along with an interpreter that uses the representation to interpret
    sentences in the language.

>   In general, languages are made up of a set of grammar rules. Different sentences can be constructed by following these grammar
    rules. Sometimes an application may need to process repeated occurrences of similar requests that are a combination of a set of
    grammar rules. These requests are distinct but are similar in the sense that they are all composed using the same set of rules.        

<p align="center">
    <img src="https://github.com/11andrew1991/design_patterns/blob/master/Interpreter/img/interpreter.png" />
</p>

<p align="center">
    <img src="https://github.com/11andrew1991/design_patterns/blob/master/Interpreter/img/interpreter01.PNG" />
</p>


### AbstractExpression
-   Declares an abstract Interpret operation that is common to all nodes in the abstract syntax tree.

### TerminalExpression
-   Implements an Interpret operation associated with terminal symbols in the grammar.
-   An instance is required for every terminal symbol in a sentence.

### NonterminalExpression
-   One such class is required for every rule R ::=R1 R2 ...Rn in the grammar.
-   Maintains instance variables of type AbstractExpression for each of the symbols R1 through Rn.
-   Implements an Interpret operation for non terminal symbols in the grammar. Interpret typically calls itself recursively
    on the variables representing R1 through Rn.
    
### Context
-   Contains information that’s global to the interpreter.

### Client
-   Builds (or is given) an abstract syntax tree representing a particular sentence in the language that the grammar defines. The
    abstract syntax tree is assembled from instances of the NonterminalExpression and TerminalExpression classes.
-   Invokes the Interpret operation.
    


##  When to use the Interpreter Pattern
-   The grammar is simple. For complex grammars, the class hierarchy for the grammar becomes large and unmanageable. Tools
    such as parser generators are a better alternative in such cases. They can interpret expressions without building abstract syntax
    trees, which can save space and possibly time.
-   Efficiency is not a critical concern. The most efficient interpreters are usually not implemented by interpreting parse trees
    directly but by first translating them into another form. For example, regular expressions are often transformed into state
    machines. But even then, the translator can be implemented by the Interpreter pattern, so the pattern is still applicable.
    
    
    
##  Interpreter in the JDK
-   java.util.Pattern
-   java.text.Normalizer
-   java.text.Format


[Implementation](https://github.com/11andrew1991/design_patterns/tree/master/Interpreter/app/)


<p align="center">
  <<<a href="https://github.com/11andrew1991/design_patterns/tree/master/Iterator#iterator-design-pattern">Next Behavior Pattern (Iterator)</a>>>
  <<<a href="https://github.com/11andrew1991/design_patterns#design-patterns">CONTENTS</a>>>  
</p>