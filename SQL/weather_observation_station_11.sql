SELECT DISTINCT CITY FROM STATION WHERE CITY REGEXP '^[^AEIOU]' OR  CITY REGEXP '[^AEIOU]$' ORDER BY CITY

SELECT DISTINCT CITY FROM STATION WHERE CITY REGEXP '(^[^AEIOU])|([^AEIOU]$)' ORDER BY CITY