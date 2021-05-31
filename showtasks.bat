call runcrud.bat

if "%ERRORLEVEL%" == "0" goto browser
echo Cannot open file
goto fail

:browser
start http://localhost:8080/crud/v1/task/getTasks
goto end

:fail
echo.
echo ERRORS

:end
echo.
echo FINISHED
