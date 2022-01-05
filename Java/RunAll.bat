@echo off
pushd ..
echo Compiling...
javac -cp . Java/*.java

echo # NaiveSolution
java Java.NaiveSolution
echo # BirdsSolution
java Java.BirdsSolution
echo # MySolution
java Java.MySolution
echo # BinarySearch
java Java.BinarySearch
echo # Kth
java Java.Kth
echo # QuickSelect
java Java.QuickSelect
echo # Div5
java Java.Div5
echo # Div
java Java.Div
echo # Sqrti
java Java.Sqrti
echo # Sqrtf
java Java.Sqrtf
echo # IndexOf
java Java.IndexOf
echo # Logf
java Java.Logf
echo # IndexOf
java Java.IndexOf
popd
@echo on
