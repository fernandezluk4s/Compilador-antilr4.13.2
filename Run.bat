@echo off
cls
echo ==========================================
echo      COMPILADOR LINGUAGEM A - BUILD
echo ==========================================

REM -------------------------------------------------------
REM 1. LIMPEZA (Garante que nao ha versoes antigas)
REM -------------------------------------------------------
echo [1/4] Limpando arquivos antigos...
del *.class 2>NUL
del *.interp 2>NUL
del *.tokens 2>NUL
del LinguagemALexer.java 2>NUL
del LinguagemAParser.java 2>NUL
del LinguagemABaseVisitor.java 2>NUL
del LinguagemAVisitor.java 2>NUL
del LinguagemABaseListener.java 2>NUL
del LinguagemAListener.java 2>NUL

REM -------------------------------------------------------
REM 2. GERACAO (ANTLR)
REM -------------------------------------------------------
echo [2/4] Gerando novos arquivos do ANTLR...
java -jar antlr-4.13.2-complete.jar -Dlanguage=Java -visitor LinguagemA.g4
if %errorlevel% neq 0 (
    echo [ERRO] Falha ao gerar ANTLR. Verifique a gramatica.
    pause
    exit /b
)

REM -------------------------------------------------------
REM 3. COMPILACAO (JAVAC)
REM -------------------------------------------------------
echo [3/4] Compilando arquivos Java...
javac -cp ".;antlr-4.13.2-complete.jar" *.java
if %errorlevel% neq 0 (
    echo [ERRO] Falha na compilacao Java.
    pause
    exit /b
)

REM -------------------------------------------------------
REM 4. PREPARACAO PARA EXECUCAO
REM -------------------------------------------------------
echo [4/4] Preparando Execucao...
echo.

REM Define a variavel ARQUIVO com o primeiro argumento (se houver)
set ARQUIVO=%1

REM Se nao foi passado argumento (arrastar/soltar), pede para digitar
IF "%ARQUIVO%"=="" (
    echo ========================================================
    echo  NENHUM ARQUIVO FOI ARRASTADO PARA O SCRIPT.
    echo ========================================================
    echo  Por favor, digite o nome do arquivo de teste (ex: teste.txt)
    echo  ou apenas aperte ENTER para rodar o exemplo interno.
    echo.
    set /p ARQUIVO="> Digite o nome do arquivo: "
)

echo.
echo ------------------------------------------
echo EXECUTANDO: %ARQUIVO%
echo ------------------------------------------

REM Executa passando o arquivo escolhido (ou vazio)
java -cp ".;antlr-4.13.2-complete.jar" InterpretadorMain %ARQUIVO%

echo.
echo ------------------------------------------
echo Concluido.
pause