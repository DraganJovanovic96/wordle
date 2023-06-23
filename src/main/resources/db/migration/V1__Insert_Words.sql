-- This SQL file inserts words into the words table
--Currently it runs on absolute path but that will be changed later on

COPY words (word) FROM 'C:\Users\hallo\Desktop\wordle\target\classes\words.txt' WITH (FORMAT csv);
