# The CCAL Language

CCAL is a small, statically-typed imperative language. This document describes its rules in plain English.

---

## Program Structure

Every CCAL program has three sections, in order:

1. **Global declarations** — zero or more variable/constant declarations
2. **Function definitions** — zero or more functions
3. **Main block** — exactly one `main` block (the entry point)

```
<global declarations>
<functions>
main { <local declarations> <statements> }
```

---

## Types

| Type | Description |
|------|-------------|
| `int` | Integer |
| `bool` | Boolean (`true` or `false`) |
| `void` | No return value (functions only) |

---

## Declarations

Variables and constants must be declared before any statements in the same block.

```
variable x : int;
variable flag : bool;
constant MAX : int = 10;
```

Constants must be assigned a value at declaration and cannot be reassigned.

---

## Functions

```
int add(a : int, b : int) is
variable temp : int;
{
    temp = a + b;
    return(temp);
}
```

- The return type comes first, followed by the function name and parameter list
- `is` separates the parameter list from the local declaration block
- Local declarations (if any) appear between `is` and `{`
- Every function ends with `return(expr);` — use `return();` for `void` functions
- Arguments at call sites must be identifiers, not expressions: `add(x, y)` not `add(x+1, y)`

---

## Statements

| Statement | Syntax |
|-----------|--------|
| Assignment | `x = expression;` |
| Function call | `f(arg1, arg2);` |
| If | `if condition { ... }` |
| If-else | `if condition { ... } else { ... }` |
| While loop | `while condition { ... }` |
| Block | `{ statements }` |
| No-op | `skip;` |

---

## Expressions

Expressions support arithmetic and function calls:

```
x + y
x - y
-x
42
true
f(x, y)
(x + y)
```

Only `+` and `-` are supported. Multiplication, division, and modulo are not part of the language.

---

## Conditions

Conditions are used in `if` and `while`. They support comparisons and logical operators:

```
x == y        x != y
x < y         x <= y
x > y         x >= y
~condition    (negation)
c1 && c2      (and)
c1 || c2      (or)
(condition)   (grouping)
```

---

## Comments

```
// single-line comment

/* multi-line
   comment */

/* nested /* comments */ are supported */
```

---

## Keywords

Keywords are **case-insensitive**: `MAIN`, `main`, and `Main` are all valid.

```
variable  constant  is  return
int       bool      void
main      if        else    while    skip
true      false
```

---

## Lexical Rules

- **Identifiers** start with a letter or underscore, followed by letters, digits, or underscores: `x`, `my_var`, `_temp`
- **Integers** are `0` or a non-zero digit followed by more digits: `0`, `42`, `100`
- Whitespace and comments are ignored
