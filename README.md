This program counts the unique words in a text file.  It assumes that you use one command line argument that gives the valid name of the text file you wish to run the program on.  In this version I make the following assumptions.
1. Numbers alone (e.g. 22) count as words
2. Numbers and letters together (e.g. 7th) count as words
3. Hyphenated words (e.g. Bicycle-mounted) count as a single word
4. Anything inside brackets (e.g. [42], [edit]) does not count as a word
5. Puncuation marks excpet for apostrophes surrounding words are removed and not counted as part of the word (e.g. . , : ? ! etc)

2/24 EDIT: Quotation marks now removed from words just like other types of punctuation.  Import statements were rewritten to more clearly display the external libraries I used for this task.
