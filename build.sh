#!/usr/bin/env bash
set -e

ANTLR_JAR="antlr-4.13.1-complete.jar"
ANTLR_URL="https://www.antlr.org/download/$ANTLR_JAR"

if [ ! -f "$ANTLR_JAR" ]; then
    echo "Downloading ANTLR4..."
    curl -L -o "$ANTLR_JAR" "$ANTLR_URL"
fi

echo "Generating parser from grammar..."
java -jar "$ANTLR_JAR" -visitor -package ccal -o ccal ccal.g4

echo "Compiling..."
javac -cp ".:$ANTLR_JAR" ccal/*.java CCALCheck.java

echo ""
echo "Build complete. Usage:"
echo "  java -cp .:$ANTLR_JAR CCALCheck <file.ccl>"
echo ""
echo "Examples:"
echo "  java -cp .:$ANTLR_JAR CCALCheck test/valid_complex.ccl"
echo "  java -cp .:$ANTLR_JAR CCALCheck test/syntax_error.ccl"
