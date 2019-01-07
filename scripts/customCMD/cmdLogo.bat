@echo off

set ESC=
set Red=%ESC%[91m
set White=%ESC%[37m

echo.
echo %Red%     An
echo      nAnnnn
echo      nnnAnnnnnn
echo      nnnnAnnnnnnnnn
echo      nnnnnnAnnnnnnnnnnn
echo      nnnnnnnAnnnnnnnnnnnnnn
echo      n             nnnnnnnnnnnn
echo                     nnnnnnnnnnnnnnn
echo          nnnnnnn    nnnnnnnnnnnnnnnnnnn
echo          nnnnnnn    nnnnnnnnnnnnnnnnnnnnnnn
echo          nnnnnnn    NNNNNNNNNNNNNNNNNNNNNNNNNNN
echo          nnnnnnn    nnnnnnnnnnnnnnnnnnnnnnn
echo          nnnnnnn    nnnnnnnnnnnnnnnnnnn
echo          nnnnnnV    nnnnnnnnnnnnnnn
echo          nnnnnVn    nnnnnnnnnnn
echo      nnnnnnnVnnnnnnnnnnnnnn
echo      nnnnnnVnnnnnnnnnnn
echo      nnnnVnnnnnnnnn
echo      nnnVnnnnnn
echo      nVnnnn
echo      Vn
echo %White%

cd D:\DATA
dir /B /OG

SET /P _inputname= Please enter an input:
IF "%_inputname%"!="doku" GOTO :github
echo cd IT\Github
:github
IF "%_inputname%"!="python" GOTO :python
echo cs IT\Github\nemo-doku\python
:python