SELECT NAME FROM (SELECT ID, NAME, SUBSTR(NAME,LENGTH(NAME)-2,3)
AS LASTCHARS FROM STUDENTS WHERE MARKS > 75 ORDER BY LASTCHARS, ID) AS RESULT
