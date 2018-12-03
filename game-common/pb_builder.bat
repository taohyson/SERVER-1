echo off & color 0A
set DIR="%cd%"
::echo DIR=%DIR%
for /R %DIR%/proto %%f in (*.proto) do (
	protoc.exe -I=%DIR%/proto --java_out=%DIR%/src/main/java %%f
	echo %%f
)
echo "Generate Finish!!!"