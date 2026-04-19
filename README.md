# CCAL Lexical & Syntax Analyser

A compiler frontend for **CCAL** — a small statically-typed language — built with [ANTLR4](https://www.antlr.org/). It performs lexical analysis (tokenisation) and syntax analysis (parsing), reporting whether a source file is syntactically valid.

## The CCAL Language

CCAL supports global variable/constant declarations, typed functions with parameters, and a `main` block. Supported constructs:

- Types: `int`, `bool`, `void`
- Declarations: `variable` and `constant`
- Control flow: `if`/`else`, `while`, `skip`
- Arithmetic: `+`, `-`
- Comparisons: `==`, `!=`, `<`, `<=`, `>`, `>=`
- Logic: `&&`, `||`, `~` (negation)
- Case-insensitive keywords

Example program:

```
variable x : int;
constant MAX : int = 10;

int add(a : int, b : int) is
{
    return(a + b);
}

main
{
variable result : int;
    x = 5;
    result = add(x, MAX);
    if (result == 15) {
        skip;
    }
}
```

## Build

**Prerequisites:** Java 11+, bash, `curl`

```bash
chmod +x build.sh
./build.sh
```

This downloads the ANTLR4 runtime, generates the lexer/parser from `ccal.g4`, and compiles everything.

On Windows without bash, run the steps manually:

```
java -jar antlr-4.13.1-complete.jar -visitor -package ccal -o ccal ccal.g4
javac -cp .;antlr-4.13.1-complete.jar ccal/*.java CCALCheck.java
```

## Usage

```bash
java -cp .:antlr-4.13.1-complete.jar CCALCheck <file.ccl>
```

**Valid file:**
```
$ java -cp .:antlr-4.13.1-complete.jar CCALCheck test/valid_complex.ccl
File "test/valid_complex.ccl" parsed successfully.
```

**File with syntax error:**
```
$ java -cp .:antlr-4.13.1-complete.jar CCALCheck test/syntax_error.ccl
The file "test/syntax_error.ccl" could not be parsed.
java.lang.IllegalStateException: Syntax error at line 4: ...
```

## Test Files

| File | Description |
|------|-------------|
| `test/valid_complex.ccl` | Functions, variables, `while`, `if`/`else` |
| `test/syntax_error.ccl` | Missing semicolon — expected parse failure |
| `test/main1.ccl` | Minimal empty `main` block |
| `test/comments.ccl` | Single-line and nested multi-line comments |

## Project Structure

```
ccal.g4            # ANTLR4 grammar (source of truth)
CCALCheck.java     # Entry point — lexes and parses a .ccl file
test/              # Sample CCAL programs
build.sh           # Build script
```

See [LANGUAGE.md](LANGUAGE.md) for a full plain-English description of the grammar.

## Tech Stack

- Java 11
- ANTLR4 4.13.1
